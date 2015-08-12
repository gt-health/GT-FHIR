/**
 * 
 */
package edu.gatech.i3l.hl7.fhir.security;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.ParameterStyle;
import org.apache.oltu.oauth2.rs.request.OAuthAccessResourceRequest;
import org.springframework.web.client.RestTemplate;

import ca.uhn.fhir.rest.method.OtherOperationTypeEnum;
import ca.uhn.fhir.rest.method.RequestDetails;
import ca.uhn.fhir.rest.server.exceptions.AuthenticationException;
import ca.uhn.fhir.rest.server.interceptor.InterceptorAdapter;

/**
 * @author MC142
 *
 */
public class OIDCInterceptor extends InterceptorAdapter {

	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory
			.getLogger(OIDCInterceptor.class);

	private int myTimeSkewAllowance = 300;
	private String introspectURL;
	private String clientId;
	private String clientSecret;
	
//	private DataSource dataSource;

	public OIDCInterceptor() {
//		try {
//			dataSource = (DataSource) new InitialContext()
//					.lookup("java:/comp/env/jdbc/oidc");
//		} catch (NamingException e) {
//			e.printStackTrace();
//		}
	}

	@Override
	public boolean incomingRequestPostProcessed(
			RequestDetails theRequestDetails, HttpServletRequest theRequest,
			HttpServletResponse theResponse) throws AuthenticationException {
		Connection connection = null;
		Statement statement = null;

		System.out.println("[OAuth] Request from "+theRequest.getRemoteAddr());

		if (theRequestDetails.getOtherOperationType() == OtherOperationTypeEnum.METADATA) {
			System.out.println("This is METADATA request.");
			return true;
		}
		
		// Quick Hack for request from localhost overlay site.
		if (theRequest.getRemoteAddr().equalsIgnoreCase("127.0.0.1") ||
				theRequest.getRemoteAddr().equalsIgnoreCase("0:0:0:0:0:0:0:1")) {
			return true;
		}

		String err_msg = "";
		try {
			OAuthAccessResourceRequest oauthRequest = new OAuthAccessResourceRequest(
					theRequest, ParameterStyle.HEADER);

			// Get the access token
			String accessToken = oauthRequest.getAccessToken();
			System.out.println(accessToken);
			
			// Introspect the token
			RestTemplate restTemplate = new RestTemplate();
			
			// Validate the accessToken.
//			String SQL_STATEMENT = "SELECT c.client_id AS client_id, t.token_value AS token_value, t.expiration AS token_expiration, c.client_name AS client_name FROM client_details c, access_token t WHERE t.token_value='"
//					+ accessToken + "' and t.client_id = c.id;";
//
//			System.out.println(SQL_STATEMENT);
//			connection = dataSource.getConnection();
//
//			statement = connection.createStatement();
//			ResultSet rs = statement.executeQuery(SQL_STATEMENT);
//
//			if (rs.next()) {
//				System.out.println("checking expiration time");
//				Timestamp ts = rs.getTimestamp("token_expiration");
//				if (ts != null) {
//					Date minAllowableExpirationTime = new Date(
//							System.currentTimeMillis()
//									- (myTimeSkewAllowance * 1000L));
//					if (ts.before(minAllowableExpirationTime)) {
//						// expired.
//						err_msg = "Current Time:"+minAllowableExpirationTime.toString()+" Access Token is expired: " + ts.toString();
//						System.out.println(err_msg);
//					} else {
//						System.out.println("Auth successful");
//					}
//				}
//			} else {
//				System.out.println("Access Token does not exist");
//				err_msg = "Access Token Does Not Exist";
//			}

		} catch (OAuthSystemException | OAuthProblemException e) {
			e.printStackTrace();
			if (err_msg.isEmpty()) err_msg = e.toString();
			else err_msg.concat(e.toString());
		} finally {
			try {
				connection.close();
				System.out.println("finally connection closed");
			} catch (SQLException e) {
				System.out.println("finally connection close failed");

				e.printStackTrace();
			} 
		}

		if (err_msg.isEmpty()) {
			System.out.println("Valid Request - OK!");
			return true;
		} else {
			System.out.println("Error:"+err_msg);
			throw new AuthenticationException(err_msg);
		}
	}
	
	public String getIntrospectURL() {
		return introspectURL;
	}
	
	public void setIntrospectURL(String introspectURL) {
		this.introspectURL = introspectURL;
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

}
