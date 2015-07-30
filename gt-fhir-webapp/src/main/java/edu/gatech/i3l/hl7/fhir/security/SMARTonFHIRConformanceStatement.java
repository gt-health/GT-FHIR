/**
 * 
 */
package edu.gatech.i3l.hl7.fhir.security;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import ca.uhn.fhir.jpa.dao.IFhirSystemDao;
import ca.uhn.fhir.jpa.provider.JpaConformanceProviderDstu2;
import ca.uhn.fhir.model.api.ExtensionDt;
import ca.uhn.fhir.model.dstu2.resource.Bundle;
import ca.uhn.fhir.model.dstu2.resource.Conformance;
import ca.uhn.fhir.model.dstu2.resource.Conformance.Rest;
import ca.uhn.fhir.model.dstu2.resource.Conformance.RestSecurity;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.UriDt;
import ca.uhn.fhir.rest.server.RestfulServer;
import ca.uhn.fhir.rest.server.provider.dstu2.ServerConformanceProvider;

/**
 * @author mc142local
 *
 */
public class SMARTonFHIRConformanceStatement extends JpaConformanceProviderDstu2 {

	static String authorizeURI = "http://fhir-registry.smarthealthit.org/Profile/oauth-uris#authorize";
	static String authorizeURIvalue = "http://localhost:9085/authorize";
	static String tokenURI = "http://fhir-registry.smarthealthit.org/Profile/oauth-uris#token";
	static String tokenURIvalue = "http://localhost:9085/token";
	static String registerURI = "http://fhir-registry.smarthealthit.org/Profile/oauth-uris#register";
	static String registerURIvalue = "http://localhost:9085/register";
	
	public SMARTonFHIRConformanceStatement(RestfulServer theRestfulServer, IFhirSystemDao<Bundle> theSystemDao) {
		super(theRestfulServer, theSystemDao);
		setCache(false);
	}

	@Override
	public Conformance getServerConformance(HttpServletRequest theRequest) {
		Conformance conformanceStatement = super.getServerConformance(theRequest);
		
		// We need to add SMART on FHIR required conformance statement.
		ExtensionDt authorizeExtension = new ExtensionDt(false, authorizeURI, new UriDt(authorizeURIvalue));
		ExtensionDt tokenExtension = new ExtensionDt(false, tokenURI, new UriDt(tokenURIvalue));
		ExtensionDt registerExtension = new ExtensionDt(false, registerURI, new UriDt(registerURIvalue));

		RestSecurity restSec = new RestSecurity();
		restSec.addUndeclaredExtension(authorizeExtension);
		restSec.addUndeclaredExtension(tokenExtension);
		restSec.addUndeclaredExtension(registerExtension);
		
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
}
