package edu.gatech.i3l.fhir.to.model;

import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpRequestBase;
import org.springframework.web.bind.annotation.ModelAttribute;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.rest.client.impl.GenericClient;
import ca.uhn.fhir.rest.client.api.IClientInterceptor;
import ca.uhn.fhir.rest.client.api.ServerValidationModeEnum;
import ca.uhn.fhir.rest.client.apache.ApacheHttpRequest;
import ca.uhn.fhir.rest.client.api.IHttpRequest;
import ca.uhn.fhir.rest.client.api.IHttpResponse;
import ca.uhn.fhir.rest.api.EncodingEnum;
import ca.uhn.fhir.rest.server.IncomingRequestAddressStrategy;
import edu.gatech.i3l.fhir.to.Controller;
import edu.gatech.i3l.fhir.to.TesterConfig;

public class HomeRequest {

	private String myEncoding;
	private String myPretty;
	private String myResource;
	private String myServerId;

	@ModelAttribute("encoding")
	public String getEncoding() {
		return myEncoding;
	}

	@ModelAttribute("encoding")
	public String getPretty() {
		return myPretty;
	}

	@ModelAttribute("resource")
	public String getResource() {
		return myResource;
	}

	public String getServerBase(HttpServletRequest theRequest, TesterConfig theConfig) {
		String retVal;
		if (isBlank(myServerId) && !theConfig.getIdToServerBase().containsKey(myServerId)) {
			retVal = theConfig.getIdToServerBase().entrySet().iterator().next().getValue();
		} else {
			retVal = theConfig.getIdToServerBase().get(myServerId);
		}

		if (retVal.contains("${serverBase}")) {
			IncomingRequestAddressStrategy strategy = new IncomingRequestAddressStrategy();
			strategy.setServletPath("");
			String base = strategy.determineServerBase(theRequest.getSession().getServletContext(), theRequest);
			if (base.endsWith("/")) {
				base = base.substring(0, base.length() - 1);
			}
			if (base.endsWith("/resource")) {
				base = base.substring(0, base.length() - "/resource".length());
			}
			retVal = retVal.replace("${serverBase}", base);
		}

		return retVal;
	}
	

	@ModelAttribute("serverId")
	public String getServerId() {
		return myServerId;
	}

	public String getServerIdWithDefault(TesterConfig theConfig) {
		String retVal = myServerId;
		if (isBlank(retVal)) {
			retVal = theConfig.getIdToServerBase().keySet().iterator().next();
		}
		return retVal;
	}

	public FhirVersionEnum getFhirVersion(TesterConfig theConfig) {
		if (isBlank(myServerId) && !theConfig.getIdToFhirVersion().containsKey(myServerId)) {
			return theConfig.getIdToFhirVersion().entrySet().iterator().next().getValue();
		} else {
			return theConfig.getIdToFhirVersion().get(myServerId);
		}
	}

	public String getServerName(TesterConfig theConfig) {
		if (isBlank(myServerId) && !theConfig.getIdToServerName().containsKey(myServerId)) {
			return theConfig.getIdToServerName().entrySet().iterator().next().getValue();
		} else {
			return theConfig.getIdToServerName().get(myServerId);
		}
	}

	public void setEncoding(String theEncoding) {
		myEncoding = theEncoding;
	}

	public void setPretty(String thePretty) {
		myPretty = thePretty;
	}

	public void setResource(String theResource) {
		myResource = theResource;
	}

	public void setServerId(String theServerId) {
		myServerId = theServerId;
	}

	public GenericClient newClient(HttpServletRequest theRequest, FhirContext theContext, TesterConfig theConfig, Controller.CaptureInterceptor theInterceptor) {
		theContext.getRestfulClientFactory().setServerValidationModeEnum(ServerValidationModeEnum.NEVER);
		
		GenericClient retVal = (GenericClient) theContext.newRestfulGenericClient(getServerBase(theRequest, theConfig));
		retVal.setKeepResponses(true);

		if ("true".equals(getPretty())) {
			retVal.setPrettyPrint(true);
		} else if ("false".equals(getPretty())) {
			retVal.setPrettyPrint(false);
		}

		if ("xml".equals(getEncoding())) {
			retVal.setEncoding(EncodingEnum.XML);
		} else if ("json".equals(getEncoding())) {
			retVal.setEncoding(EncodingEnum.JSON);
		}

		retVal.registerInterceptor(theInterceptor);

		final String remoteAddr = org.slf4j.MDC.get("req.remoteAddr");
		retVal.registerInterceptor(new IClientInterceptor() {

//			@Override
//			public void interceptResponse(HttpResponse theRequest) {
//				// nothing
//			}
//
//			@Override
//			public void interceptRequest(HttpRequestBase theRequest) {
//				if (isNotBlank(remoteAddr)) {
//					theRequest.addHeader("x-forwarded-for", remoteAddr);
//				}
//			}

			@Override
			public void interceptRequest(IHttpRequest myRequest) {
				HttpRequestBase theRequest = ((ApacheHttpRequest) myRequest).getApacheRequest();
				if (isNotBlank(remoteAddr)) {
					theRequest.addHeader("x-forwarded-for", remoteAddr);
				}
			}

			@Override
			public void interceptResponse(IHttpResponse theResponse) throws IOException {
				// TODO Auto-generated method stub
				
			}
		});

		return retVal;
	}

	public IParser newParser(FhirContext theCtx) {
		if ("json".equals(getEncoding())) {
			return theCtx.newJsonParser();
		}
		return theCtx.newXmlParser();
	}

}
