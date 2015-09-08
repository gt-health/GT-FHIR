/**
 * 
 */
package edu.gatech.i3l.fhir.security;

import java.nio.charset.Charset;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.StringUtils;
import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.ParameterStyle;
import org.apache.oltu.oauth2.common.utils.OAuthUtils;
import org.apache.oltu.oauth2.rs.request.OAuthAccessResourceRequest;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import ca.uhn.fhir.model.dstu.valueset.RestfulOperationTypeEnum;
import ca.uhn.fhir.rest.method.RequestDetails;

/**
 * @author MC142
 *
 */
public class Authorization {
	private String url;
	private String clientId;
	private String clientSecret;
	private String token;
	private String userId;
	private String password;
	private String token_type;
	private int myTimeSkewAllowance = 300;
	private boolean active = false;
	private boolean expired = true;
	private boolean is_admin = false;
	private Set<String> scopeSet;

	public Authorization(String url) {
		this.url = url;
		this.clientId = "client";
		this.clientSecret = "secret";
	}

	public Authorization(String url, String clientId, String clientSecret) {
		this.url = url;
		this.clientId = clientId;
		this.clientSecret = clientSecret;
	}
	
	public String getClientId() {
		return clientId;
	}
	
	public String getUserId() {
		return userId;
	}
		
	private HttpHeaders createHeaders () {
		HttpHeaders httpHeaders = new HttpHeaders();
		String auth = clientId+":"+clientSecret;
		byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
		String authHeader = "Basic " + new String(encodedAuth);
		httpHeaders.set("Authorization", authHeader);
		httpHeaders.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		
		return httpHeaders;
//		return new HttpHeaders() {
//			{
//				String auth = clientId+":"+clientSecret;
//				byte[] encodedAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
//				String authHeader = "Basic " + new String(encodedAuth);
//				set("Authorization", authHeader);
//				setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//			}
//		};
	}

	public String introspectToken(HttpServletRequest request) {
		OAuthAccessResourceRequest oauthRequest;
		try {
			oauthRequest = new OAuthAccessResourceRequest(request, ParameterStyle.HEADER);

			// Get the access token
			String accessToken = oauthRequest.getAccessToken();
			if (introspectToken(accessToken) == false) {
				return "Invalid Access Token";
			}
									
		} catch (OAuthSystemException | OAuthProblemException e) {
			e.printStackTrace();
			return "Invalid Auth Request";
		}

		return "";
	}
	
	public boolean introspectToken(String token) {
		// Sanity Check.
		if (token == null || token.isEmpty()) {
			return false;
		}
		
		// Save the token for a future use.
		this.token = token;
		
		// Introspect the token
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<String> reqAuth = new HttpEntity<String>(createHeaders());
		ResponseEntity<String> response;
		
		String introspectTokenUrl = url+"?token="+this.token;
		response = restTemplate.exchange(introspectTokenUrl, HttpMethod.POST, reqAuth, String.class);
		HttpStatus statusCode = response.getStatusCode();
		if (statusCode.is2xxSuccessful() == false) {
			return false;
		}
		
		System.out.println("IntrospectToken: "+response.getBody());
		
		// First check the token status. Turn the body into JSON.
		JSONObject jsonObject = new JSONObject(response.getBody());
		if (jsonObject.getBoolean("active") != true) {
			// This is not active token.
			active = false;
			return false;
		}
		active = true;
		
		// Get the expiration time.
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
		Date expDate;
		try {
			expDate = df.parse(jsonObject.getString("exp"));
		} catch (JSONException | ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			expired = true;
			return false;
		}
	
		Date minAllowableExpirationTime = new Date(System.currentTimeMillis()-(myTimeSkewAllowance * 1000L));
		if (expDate != null && expDate.before(minAllowableExpirationTime)) {
			// expired.
			expired = true;
			return false;
		}
		
		// Store the received information such as scope, user_id, client_id, etc...
		userId = jsonObject.getString("sub");
		clientId = jsonObject.getString("client_id");
		token_type = jsonObject.getString("token_type");

		String[] scopeValues = jsonObject.getString("scope")
				.trim().replaceAll("\\+", " ")
				.split(" ");
		scopeSet = new HashSet<String>(Arrays.asList(scopeValues));
		if (scopeSet.isEmpty()) return false;
		
		if (scopeSet.contains("user/*.*")) {
			is_admin = true;
		}
		
		return true;
	}
	
	public boolean checkBearer() {
		if (token_type != null && token_type.equalsIgnoreCase("Bearer")) {
			return true;
		} else {
			return false;
		}
	}
	
	public boolean assertScope(String myScope) {
		for (String scope : scopeSet) {
			if (scope.equalsIgnoreCase(myScope))
				return true;
		}
		
		return false;
	}
	
	public boolean allowRequest(RequestDetails theRequestDetails) {
		if (checkBearer() == false) {
			return false;
		}
		
		if (is_admin) {
			return true;
		}
		
		// TODO: Check the request detail and compare with scope. If out of scope, then
		//       return false.
		// We need to have user or patient level permission checking. For now, user/ scope has
		// all patients permission. And, <resource>/ scope has <resource> permission for all patients. 
		String resourceName = theRequestDetails.getResourceName();
		RestfulOperationTypeEnum resourceOperationType = theRequestDetails.getResourceOperationType();
		for (String scope : scopeSet) {
			String[] scopeDetail = scope.split("/");
			if (resourceOperationType ==  RestfulOperationTypeEnum.READ) {
				if ((scopeDetail[0].equalsIgnoreCase(resourceName) || scopeDetail[0].equalsIgnoreCase("user"))  && 
						(scopeDetail[1].equalsIgnoreCase("*.read") || scopeDetail[1].equalsIgnoreCase("*.*"))) {
					return true;
				}
			} else {
				// This is CREATE, UPDATE, DELETE... write permission is required.
				if ((scopeDetail[0].equalsIgnoreCase(resourceName) || scopeDetail[0].equalsIgnoreCase("user"))  && 
						(scopeDetail[1].equalsIgnoreCase("*.write") || scopeDetail[1].equalsIgnoreCase("*.*"))) {
					return true;
				}
			}
		}
		
		System.out.println(resourceName+" "+resourceOperationType.name()+" request failed to get Authorization.");
		return false;
	}
	
	// Belows are for out-of-band authorization to support Smart on FHIR internal communications.
	// This is not Smart on FHIR standard. This is to support Smart on FHIR's authorization server.
	public boolean asBasicAuth(HttpServletRequest request) {
		String authString = request.getHeader("Authorization");
		if (authString == null) return false;
		
		System.out.println("asBasicAuth auth header:"+authString);
//		String[] credential = OAuthUtils.decodeClientAuthenticationHeader(authString);
		
		if (authString.regionMatches(0, "Bearer", 0, 6)) return false; // This is Bearer Auth.
		
		String credentialString = StringUtils.newStringUtf8(Base64.decodeBase64(authString));
		if (credentialString == null) return false;
		
		String[] credential = credentialString.trim().split(":");
		
		if (credential.length != 2) return false;
		
		userId = credential[0];
		password = credential[1];
		
		System.out.println("asBasicAuth:"+userId+":"+password);
		
		if (userId.equalsIgnoreCase(clientId) && password.equalsIgnoreCase(clientSecret))
			return true;
		else 
			return false;
	}
	
	public boolean asBearerAuth(HttpServletRequest request) {
		OAuthAccessResourceRequest oauthRequest;
		try {
			oauthRequest = new OAuthAccessResourceRequest(request, ParameterStyle.HEADER);
	        // Get the access token
	        String accessToken = oauthRequest.getAccessToken();
	        return introspectToken(accessToken);
		} catch (OAuthSystemException | OAuthProblemException e) {
			e.printStackTrace();
			return false;
		}
	}
}
