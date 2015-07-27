/**
 * 
 */
package edu.gatech.i3l.hl7.fhir.security;

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

/**
 * @author mc142local
 *
 */
public class SMARTonFHIRConformanceStatement extends JpaConformanceProviderDstu2 {

	static String authorizeURI = "http://fhir-registry.smarthealthit.org/Profile/oauth-uris#authorize";
	static String tokenURI = "http://fhir-registry.smarthealthit.org/Profile/oauth-uris#token";
	
	public SMARTonFHIRConformanceStatement(RestfulServer theRestfulServer, IFhirSystemDao<Bundle> theSystemDao) {
		super(theRestfulServer, theSystemDao);
	}

	@Override
	public Conformance getServerConformance(HttpServletRequest theRequest) {
		Conformance conformanceStatement = super.getServerConformance(theRequest);
		
		// We need to add SMART on FHIR required conformance statement.
		ExtensionDt authorizeExtension = new ExtensionDt(false, authorizeURI, 
				new UriDt("http://localhost:9085/authorize"));
		ExtensionDt tokenExtension = new ExtensionDt(false, tokenURI, 
				new UriDt("http://localhost:9085/token"));

		RestSecurity RestSec = new RestSecurity();
		RestSec.addUndeclaredExtension(authorizeExtension);
		RestSec.addUndeclaredExtension(tokenExtension);
		Rest Rest = new Rest();
		Rest.setSecurity(RestSec);
		conformanceStatement.addRest(Rest);
		
		return conformanceStatement;
	}
}
