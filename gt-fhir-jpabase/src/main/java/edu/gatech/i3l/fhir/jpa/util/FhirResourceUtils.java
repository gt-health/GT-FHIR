package edu.gatech.i3l.fhir.jpa.util;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.IResource;

public class FhirResourceUtils {

	public static String toResourceName(Class<? extends IResource> theResourceType, FhirContext theContext) {
		return theContext.getResourceDefinition(theResourceType).getName();
	}

	public static String toResourceName(IResource theResource, FhirContext theContext) {
		return theContext.getResourceDefinition(theResource).getName();
	}
}
