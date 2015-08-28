package edu.gatech.i3l.fhir.smart.servlet;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Enumeration;

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

import com.google.gson.Gson;

import edu.gatech.i3l.fhir.security.Authorization;

/**
 * Servlet implementation class SmartServices
@WebServlet(description = "SMART on FHIR internal services", urlPatterns = { "/_services/smart/Launch" })
 */
public class SmartServices extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private LaunchContextDao launchContextService;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SmartServices() {
        super();
        
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("GT_FHIR_UT");
//        EntityManager em = emf.createEntityManager();
//        launchContextService = new LaunchContextService(em);
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("HelloGet");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// We have received a request to create Launch context
		StringBuilder buffer = new StringBuilder();
		BufferedReader reader = request.getReader();
		
		String line;
		while ((line=reader.readLine())!=null) {
			buffer.append(line);
		}
		
		System.out.println("LaunchContext: "+buffer.toString());

		// Convert the body content to JSON and create launch context in database.
		//
		JSONObject servReq = new JSONObject(buffer.toString());
		
		// According to SMART on FHIR folks in Harvard. They want to support both
		// basic AUTH and bearer AUTH for the internal communication for this.
		
		Authorization smartAuth = new Authorization(getServletConfig().getInitParameter("introspectUrl"));
		if (smartAuth.asBasicAuth(request) == true || smartAuth.asBearerAuth(request) == true) {
			// TODO: createLaunchContext(); 
			// response..
			
			return;
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
