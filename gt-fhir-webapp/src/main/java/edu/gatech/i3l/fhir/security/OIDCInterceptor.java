/**
 * 
 */
package edu.gatech.i3l.fhir.security;

import java.nio.charset.Charset;
import java.io.BufferedReader;
import java.io.IOException;
import java.net.InetAddress;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Enumeration;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.commons.codec.binary.Base64;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.ParameterStyle;
import org.apache.oltu.oauth2.rs.request.OAuthAccessResourceRequest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import ca.uhn.fhir.rest.api.RestOperationTypeEnum;
import ca.uhn.fhir.rest.method.RequestDetails;
import ca.uhn.fhir.rest.server.exceptions.AuthenticationException;
import ca.uhn.fhir.rest.server.interceptor.InterceptorAdapter;

/**
 * @author MC142
 *
 */
public class OIDCInterceptor extends InterceptorAdapter {

	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(OIDCInterceptor.class);

	private String enableOAuth;
	private String introspectUrl;
	private String clientId;
	private String clientSecret;
	private String localByPass;
	private String readOnly;

	public OIDCInterceptor() {
	}

	@Override
	public boolean incomingRequestPostProcessed(RequestDetails theRequestDetails, HttpServletRequest theRequest,
			HttpServletResponse theResponse) throws AuthenticationException {

		System.out.println("[OAuth] Request from " + theRequest.getRemoteAddr());

		if (readOnly.equalsIgnoreCase("True")) {
			if (theRequest.getMethod().equalsIgnoreCase("GET"))
				return true;
			else
				return false;
		}
		
		if (enableOAuth.equalsIgnoreCase("False")) {
			System.out.println("[OAuth] OAuth is disabled. Request from " + theRequest.getRemoteAddr() + "is approved");
			return true;
		}
		
		if (theRequestDetails.getRestOperationType() == RestOperationTypeEnum.METADATA) {
			System.out.println("This is METADATA request.");

			// Enumeration<String> headerNames = theRequest.getHeaderNames();
			// while (headerNames.hasMoreElements()) {
			// String headerName = headerNames.nextElement();
			// System.out.println(headerName);
			// Enumeration<String> headers = theRequest.getHeaders(headerName);
			// while (headers.hasMoreElements()) {
			// String headerValue = headers.nextElement();
			// System.out.println(" "+headerValue);
			// }
			// }

			// StringBuilder buffer = new StringBuilder();
			// BufferedReader reader;
			// try {
			// reader = theRequest.getReader();
			// String line;
			// while ((line=reader.readLine())!=null) {
			// buffer.append(line);
			// }
			//
			// System.out.println("METADATA request getbody:
			// "+buffer.toString());
			//
			// } catch (IOException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }
			//

			return true;
		}

		// Quick Hack for request from localhost overlay site.
		if (localByPass.equalsIgnoreCase("True")) {
			if (theRequest.getRemoteAddr().equalsIgnoreCase("127.0.0.1")
					|| theRequest.getRemoteAddr().equalsIgnoreCase("0:0:0:0:0:0:0:1")) {
				return true;
			}

			if (theRequest.getLocalAddr().equalsIgnoreCase(theRequest.getRemoteAddr())) {
				return true;
			}
		}

		// for test.
		// String resourceName = theRequestDetails.getResourceName();
		// String resourceOperationType =
		// theRequestDetails.getResourceOperationType().name();
		// System.out.println ("resource:"+resourceName+",
		// resourceOperationType:"+resourceOperationType);

		// checking Auth
		System.out.println("IntrospectURL:" + getIntrospectUrl() + " clientID:" + getClientId() + " clientSecret:"
				+ getClientSecret());
		Authorization myAuth = new Authorization(getIntrospectUrl(), getClientId(), getClientSecret());

		String err_msg = myAuth.introspectToken(theRequest);
		if (err_msg.isEmpty() == false) {
			throw new AuthenticationException(err_msg);
		}

		// Now we have a valid access token. Now, check Token type
		if (myAuth.checkBearer() == false) {
			throw new AuthenticationException("Not Token Bearer");
		}

		// Check scope.
		return myAuth.allowRequest(theRequestDetails);
	}

	public String getEnableOAuth() {
		return enableOAuth;
	}
	
	public void setEnableOAuth(String enableOAuth) {
		this.enableOAuth = enableOAuth;
	}
	
	public String getIntrospectUrl() {
		return introspectUrl;
	}

	public void setIntrospectUrl(String introspectURL) {
		this.introspectUrl = introspectURL;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getLocalByPass() {
		return localByPass;
	}

	public void setLocalByPass(String localByPass) {
		this.localByPass = localByPass;
	}

	public String getReadOnly() {
		return readOnly;
	}
	
	public void setReadOnly(String readOnly) {
		this.readOnly = readOnly;
	}
}
