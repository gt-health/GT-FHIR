package ca.uhn.fhir.jpa.conf;

import java.util.HashMap;
import java.util.Map;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.FhirVersionEnum;

public class FhirContextHelper {

	private static final Map<FhirVersionEnum, FhirContext> ourRetrievalContexts = new HashMap<FhirVersionEnum, FhirContext>();
	
	public static FhirContext getContext(FhirVersionEnum theVersion) {
		FhirVersionEnum ver = theVersion != null ? theVersion : FhirVersionEnum.DSTU1;
		synchronized (ourRetrievalContexts) {
			FhirContext retVal = ourRetrievalContexts.get(ver);
			if (retVal == null) {
				retVal = new FhirContext(ver);
				ourRetrievalContexts.put(ver, retVal);
			}
			return retVal;
		}
	}
}
