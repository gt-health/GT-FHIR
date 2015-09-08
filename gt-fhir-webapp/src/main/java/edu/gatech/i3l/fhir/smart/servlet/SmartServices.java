package edu.gatech.i3l.fhir.smart.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.oltu.oauth2.common.exception.OAuthProblemException;
import org.apache.oltu.oauth2.common.exception.OAuthSystemException;
import org.apache.oltu.oauth2.common.message.types.ParameterStyle;
import org.apache.oltu.oauth2.rs.request.OAuthAccessResourceRequest;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import com.google.gson.Gson;

import edu.gatech.i3l.fhir.jpa.provider.JpaSystemProviderDstu2;
import edu.gatech.i3l.fhir.security.Authorization;

/**
 * Servlet implementation class SmartServices
@WebServlet(description = "SMART on FHIR internal services", urlPatterns = { "/_services/smart/Launch" })
 */
public class SmartServices extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private WebApplicationContext myAppCtx;
	private SmartOnFhirLaunchContextProvider launchContextProvider;
	
	private String url;
	private String client_id;
	private String client_secret;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SmartServices() {
        super();
    }

    public void init() throws ServletException {
		// According to SMART on FHIR folks in Harvard. They want to support both
		// basic AUTH and bearer AUTH for the internal communication for this.
    	url = getServletConfig().getInitParameter("introspectUrl");
    	client_id = getServletConfig().getInitParameter("client_id");
    	client_secret = getServletConfig().getInitParameter("client_secret");
    	
    	myAppCtx = ContextLoaderListener.getCurrentWebApplicationContext();
    	launchContextProvider = myAppCtx.getBean("mySmartService", SmartOnFhirLaunchContextProvider.class);
    	
//        bookDB = (BookDBAO)getServletContext().
//            getAttribute("bookDB");
//        if (bookDB == null) throw new
//            UnavailableException("Couldn’t get database.");
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String launchId = request.getPathInfo().substring(1);

		System.out.println("Get LaunchID = "+launchId);

		Authorization smartAuth = new Authorization(url, client_id, client_secret);
		if (smartAuth.asBasicAuth(request) == true || smartAuth.asBearerAuth(request) == true) {
			SmartLaunchContext smartLaunchContext = launchContextProvider.getContext(Long.valueOf(launchId));
			if (smartLaunchContext != null) {
				JSONObject jsonResp = smartLaunchContext.getJSONObject();
				
				String respString = jsonResp.toString();
				response.setContentType("application/json; charset=UTF-8;");
				response.getWriter().append(respString);
				System.out.println(respString);
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// We have received a request to create Launch context
		StringBuilder buffer = new StringBuilder();
		BufferedReader reader = request.getReader();
				
//		String url = getServletConfig().getInitParameter("introspectUrl");
//		String client_id = getServletConfig().getInitParameter("client_id");
//		String client_secret = getServletConfig().getInitParameter("client_secret");
		Authorization smartAuth = new Authorization(url, client_id, client_secret);
		if (smartAuth.asBasicAuth(request) == true || smartAuth.asBearerAuth(request) == true) {
			if (smartAuth.assertScope("smart/orchestrate_launch") == false) {
				// This is internal communication for SMART orchestration. Other request is not
				// allowed.
				return;
			}
			
			String line;
			while ((line=reader.readLine())!=null) {
				buffer.append(line);
			}
			
			System.out.println("LaunchContext: "+buffer.toString());

			// Convert the body content to JSON and create launch context in database.
			//
			JSONObject servReq = new JSONObject(buffer.toString());

			String launchContextClientId = servReq.getString("client_id");
			String launchContextCreatedBy = smartAuth.getClientId();
			String launchContextUsername = smartAuth.getUserId();
			java.util.Date date= new java.util.Date();
			Timestamp ts = new Timestamp(date.getTime());

			SmartLaunchContext smartLaunchContext = new SmartLaunchContext();
			smartLaunchContext.setClientId(launchContextClientId);
			smartLaunchContext.setCreatedBy(launchContextCreatedBy);
			smartLaunchContext.setCreatedAt(ts);
			smartLaunchContext.setUsername(launchContextUsername);

			List<SmartLaunchContextParam> smartLaunchContextParams = new ArrayList<SmartLaunchContextParam>();
			smartLaunchContext.setSmartLaunchContextParams(smartLaunchContextParams);
			JSONObject paramsJSON = servReq.getJSONObject("parameters");
			Iterator<?> paramsIter = paramsJSON.keys();
			String jsonParams="";
			while (paramsIter.hasNext()) {
				String key = (String) paramsIter.next();
				String val = paramsJSON.getString(key);
				System.out.println ("Parameters: key: "+key+" val:"+val);
				
				SmartLaunchContextParam smartLaunchContextParam = new SmartLaunchContextParam();
				smartLaunchContextParam.setParamName(key);
				smartLaunchContextParam.setParamValue(val);
				smartLaunchContext.addSmartLaunchContextParam(smartLaunchContextParam);
//				if (key.equalsIgnoreCase("patient")) {
//					// We supposed to have only patient.
//					jsonParams="\"patient\":\""+val+"\","
//							+"\"smart_style_url\":"+"\"https://fhir.smarthealthit.org/stylesheets/smart_v1.json\""+","
//							+"\"need_patient_banner\":true";
//				}
			}
			launchContextProvider.setContext(smartLaunchContext);
			
			/* Response with JSON object with the following information.
			 *	{
			 *	  "created_by": “[CLIENTID]",
			 *	  "username": “[USERNAME]",
			 *	  "launch_id": “[LAUNCHID]",
			 *	  "created_at": “[ISO8601TIMESTAMP]",
			 *	  "parameters": {
			 *	    "patient": “[PATIENTID]",
			 *	    "smart_style_url": "https://fhir.smarthealthit.org/stylesheets/smart_v1.json",
			 *	    "need_patient_banner": true
			 *	  }
			 *	}
		 	 */
			
			response.setContentType("application/json; charset=UTF-8;");
//			TimeZone tz = TimeZone.getTimeZone("UTC");
//		    DateFormat df = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm");
//		    df.setTimeZone(tz);
//		    date = new Date(ts.getTime());
//		    String createdAt = df.format(date);
//
			PrintWriter out = response.getWriter();
//			String jsonData = "{\"created_by\":\""+launchContextClientId+"\","
//					+"\"username\":\""+launchContextUsername+"\","
//					+"\"launch_id\":\""+smartLaunchContext.getLaunchId()+"\","
//					+"\"created_at\":\""+createdAt+"\"";
//			
//			// Parameters
//			if (jsonParams.isEmpty() == false) {
//				jsonData = jsonData.concat(",\"parameters\": {"+jsonParams+"}");
//			}
//			
//			jsonData = jsonData.concat("}");
			
			String jsonData = smartLaunchContext.getJSONObject().toString();
		    out.println(jsonData) ; 
		    out.close();
		    
		    System.out.println("SMARTonFHIR service response: "+jsonData);
		}

//		Enumeration<String> headerNames = request.getHeaderNames();
//		while (headerNames.hasMoreElements()) {
//			String headerName = headerNames.nextElement();
//			System.out.println(headerName);
//			Enumeration<String> headers = request.getHeaders(headerName);
//			while (headers.hasMoreElements()) {
//				String headerValue = headers.nextElement();
//				System.out.println("  "+headerValue);
//			}
//		}
		
	}
}
