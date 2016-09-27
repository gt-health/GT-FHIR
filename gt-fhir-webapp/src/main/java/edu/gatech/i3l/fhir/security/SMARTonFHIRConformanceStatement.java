/**
 * 
 */
package edu.gatech.i3l.fhir.security;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.Bundle;
import ca.uhn.fhir.model.dstu2.resource.Conformance;
import ca.uhn.fhir.model.dstu2.resource.Conformance.Rest;
import ca.uhn.fhir.model.dstu2.resource.Conformance.RestSecurity;
import ca.uhn.fhir.model.dstu2.valueset.RestfulSecurityServiceEnum;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.UriDt;
import ca.uhn.fhir.rest.server.RestfulServer;
import edu.gatech.i3l.fhir.jpa.dao.IFhirSystemDao;
import edu.gatech.i3l.fhir.jpa.provider.JpaConformanceProviderDstu2;

/**
 * @author mc142local
 *
 */
public class SMARTonFHIRConformanceStatement extends JpaConformanceProviderDstu2 {

	// static String authorizeURI =
	// "http://fhir-registry.smarthealthit.org/Profile/oauth-uris#authorize";
	// static String tokenURI =
	// "http://fhir-registry.smarthealthit.org/Profile/oauth-uris#token";
	// static String registerURI =
	// "http://fhir-registry.smarthealthit.org/Profile/oauth-uris#register";

	static String oauthURI = "http://fhir-registry.smarthealthit.org/StructureDefinition/oauth-uris";

	static String authorizeURI = "authorize";
	static String tokenURI = "token";
	static String registerURI = "register";

	String authorizeURIvalue = "http://localhost:9085/authorize";
	String tokenURIvalue = "http://localhost:9085/token";
	String registerURIvalue = "http://localhost:9085/register";

	public SMARTonFHIRConformanceStatement(RestfulServer theRestfulServer, IFhirSystemDao<Bundle> theSystemDao) {
		super(theRestfulServer, theSystemDao);
		setCache(false);

//		try {
//			InetAddress addr = java.net.InetAddress.getLocalHost();
//			System.out.println(addr);
//			String hostname = addr.getCanonicalHostName();
//			System.out.println("Hostname of system = " + hostname);
//
//			// authorizeURIvalue = "http://"+hostname+":9085/authorize";
//			// tokenURIvalue = "http://"+hostname+":9085/token";
//			// registerURIvalue = "http://"+hostname+":9085/register";
//		} catch (UnknownHostException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	@Override
	public Conformance getServerConformance(HttpServletRequest theRequest) {
		Conformance conformanceStatement = super.getServerConformance(theRequest);
		RestSecurity restSec = new RestSecurity();

		// Set security.service
		restSec.setService(RestfulSecurityServiceEnum.SMART_ON_FHIR);

		// We need to add SMART on FHIR required conformance statement.
		ExtensionDt authorizeExtension = new ExtensionDt(false, authorizeURI, new UriDt(authorizeURIvalue));
		ExtensionDt tokenExtension = new ExtensionDt(false, tokenURI, new UriDt(tokenURIvalue));
		ExtensionDt registerExtension = new ExtensionDt(false, registerURI, new UriDt(registerURIvalue));

		ExtensionDt secExtension = new ExtensionDt();
		secExtension.setUrl(oauthURI);
		secExtension.addUndeclaredExtension(authorizeExtension);
		secExtension.addUndeclaredExtension(tokenExtension);
		secExtension.addUndeclaredExtension(registerExtension);

		restSec.addUndeclaredExtension(secExtension);

		// restSec.addUndeclaredExtension(authorizeExtension);
		// restSec.addUndeclaredExtension(tokenExtension);
		// restSec.addUndeclaredExtension(registerExtension);

		List<Rest> rests = conformanceStatement.getRest();
		if (rests == null || rests.size() <= 0) {
			Rest rest = new Rest();
			rest.setSecurity(restSec);
			conformanceStatement.addRest(rest);
		} else {
			Rest rest = rests.get(0);
			rest.setSecurity(restSec);
		}

		return conformanceStatement;
	}

	public void setAuthServerUrl(String url) {
		if (url.endsWith("/")) {
			authorizeURIvalue = url+"authorize";
			tokenURIvalue = url+"token";
			registerURIvalue = url+"register";
		} else {
			authorizeURIvalue = url+"/authorize";
			tokenURIvalue = url+"/token";
			registerURIvalue = url+"/register";
		}
	}
}