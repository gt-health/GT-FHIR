
package edu.gatech.i3l.fhir.jpa.providers;

import java.util.Set;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.rest.annotation.Count;
import ca.uhn.fhir.rest.annotation.IncludeParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.annotation.Sort;
import ca.uhn.fhir.rest.api.SortSpec;
import ca.uhn.fhir.rest.param.ReferenceAndListParam;
import ca.uhn.fhir.rest.param.StringParam;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;
// import ca.uhn.fhir.model.dstu2.resource.Bundle;
// import ca.uhn.fhir.model.api.Bundle;

public class MedicationOrderResourceProvider extends 
	JpaResourceProviderDstu2<MedicationOrder>
	{

	@Override
	public Class<? extends IResource> getResourceType() {
		return MedicationOrder.class;
	}

	@Search()
	public ca.uhn.fhir.rest.server.IBundleProvider search(
			javax.servlet.http.HttpServletRequest theServletRequest,
	
			@Description(shortDefinition="The resource identity")
			@OptionalParam(name="_id")
			StringParam theId, 

//			@Description(shortDefinition="The resource language")
//			@OptionalParam(name="_language")
//			StringParam theResourceLanguage, 
//
//			@Description(shortDefinition="Search for resources which have the given tag")
//			@OptionalParam(name="_tag")
//			TokenAndListParam theSearchForTag, 
//
//  
//			@Description(shortDefinition="Return prescriptions written on this date")
//			@OptionalParam(name="datewritten")
//			DateRangeParam theDatewritten, 
  
			@Description(shortDefinition="Return prescriptions with this encounter identity")
			@OptionalParam(name="encounter", targetTypes={  Encounter.class   } )
			ReferenceAndListParam theEncounter, 
  
//			@Description(shortDefinition="Return prescriptions with this external identity")
//			@OptionalParam(name="identifier")
//			TokenAndListParam theIdentifier, 
  
			@Description(shortDefinition="Code for medicine or text in medicine name")
			@OptionalParam(name="medication", targetTypes={  Medication.class   } )
			ReferenceAndListParam theMedication, 
  
			@Description(shortDefinition="The identity of a patient to list dispenses  for")
			@OptionalParam(name="patient", targetTypes={  Patient.class   } )
			ReferenceAndListParam thePatient, 
  
//			@Description(shortDefinition="Status of the prescription")
//			@OptionalParam(name="status")
//			TokenAndListParam theStatus, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="prescriber", targetTypes={  Practitioner.class   } )
//			ReferenceAndListParam thePrescriber, 
//
//			@IncludeParam(reverse=true)
//			Set<Include> theRevIncludes,
//			@Description(shortDefinition="Only return resources which were last updated as specified by the given range")
//			@OptionalParam(name="_lastUpdated")
//			DateRangeParam theLastUpdated, 
//
			@IncludeParam(allow = { "MedicationOrder:encounter", "MedicationOrder:medication",
					"MedicationOrder:patient"}) 
			Set<Include> theIncludes,
			
			@Sort 
			SortSpec theSort,
			
			@Count
			Integer theCount
	) {
		startRequest(theServletRequest);
		try {
			SearchParameterMap paramMap = new SearchParameterMap();
			paramMap.add("_id", theId);
//			paramMap.add("_language", theResourceLanguage);
//			paramMap.add("_tag", theSearchForTag);
//			paramMap.add("datewritten", theDatewritten);
			paramMap.add("encounter", theEncounter);
//			paramMap.add("identifier", theIdentifier);
			paramMap.add("medication", theMedication);
			paramMap.add("patient", thePatient);
//			paramMap.add("status", theStatus);
//			paramMap.add("prescriber", thePrescriber);
//			paramMap.setRevIncludes(theRevIncludes);
//			paramMap.setLastUpdated(theLastUpdated);
			paramMap.setIncludes(theIncludes);
			paramMap.setSort(theSort);
			paramMap.setCount(theCount);

			ca.uhn.fhir.rest.server.IBundleProvider retVal = getDao().search(paramMap);
			return retVal;
		} finally {
			endRequest(theServletRequest);
		}
	}

}
