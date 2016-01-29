
package edu.gatech.i3l.fhir.jpa.providers;

import java.util.Set;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.model.dstu2.resource.MedicationDispense;
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

public class MedicationDispenseResourceProvider extends 
	JpaResourceProviderDstu2<MedicationDispense>
	{

	@Override
	public Class<? extends IResource> getResourceType() {
		return MedicationDispense.class;
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
//			@Description(shortDefinition="Return dispenses that should be sent to a secific destination")
//			@OptionalParam(name="destination", targetTypes={  Location.class   } )
//			ReferenceAndListParam theDestination, 
//  
//			@Description(shortDefinition="Return all dispenses performed by a specific indiividual")
//			@OptionalParam(name="dispenser", targetTypes={  Practitioner.class   } )
//			ReferenceAndListParam theDispenser, 
//  
//			@Description(shortDefinition="Return dispenses with this external identity")
//			@OptionalParam(name="identifier")
//			TokenAndListParam theIdentifier, 
//  
			@Description(shortDefinition="Returns dispenses of this medicine")
			@OptionalParam(name="medication", targetTypes={  Medication.class   } )
			ReferenceAndListParam theMedication, 
  
			@Description(shortDefinition="The identity of a patient to list dispenses  for")
			@OptionalParam(name="patient", targetTypes={  Patient.class   } )
			ReferenceAndListParam thePatient, 
  
//			@Description(shortDefinition="The identity of a prescription to list dispenses from")
//			@OptionalParam(name="prescription", targetTypes={  MedicationPrescription.class   } )
//			ReferenceAndListParam thePrescription, 
//  
//			@Description(shortDefinition="Return all dispenses with the specified responsible party")
//			@OptionalParam(name="responsibleparty", targetTypes={  Practitioner.class   } )
//			ReferenceAndListParam theResponsibleparty, 
//  
//			@Description(shortDefinition="Status of the dispense")
//			@OptionalParam(name="status")
//			TokenAndListParam theStatus, 
//  
//			@Description(shortDefinition="Return all dispenses of a specific type")
//			@OptionalParam(name="type")
//			TokenAndListParam theType, 
//  
//			@Description(shortDefinition="Date when medication handed over to patient (outpatient setting), or supplied to ward or clinic (inpatient setting)")
//			@OptionalParam(name="whenhandedover")
//			DateRangeParam theWhenhandedover, 
//  
//			@Description(shortDefinition="Date when medication prepared")
//			@OptionalParam(name="whenprepared")
//			DateRangeParam theWhenprepared, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="receiver", targetTypes={  Patient.class ,   Practitioner.class   } )
//			ReferenceAndListParam theReceiver, 
//
//			@IncludeParam(reverse=true)
//			Set<Include> theRevIncludes,
//			@Description(shortDefinition="Only return resources which were last updated as specified by the given range")
//			@OptionalParam(name="_lastUpdated")
//			DateRangeParam theLastUpdated, 

			@IncludeParam(allow = {  "MedicationDispense:medication", "MedicationDispense:patient", "*" }) 
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
//			paramMap.add("destination", theDestination);
//			paramMap.add("dispenser", theDispenser);
//			paramMap.add("identifier", theIdentifier);
			paramMap.add("medication", theMedication);
			paramMap.add("patient", thePatient);
//			paramMap.add("prescription", thePrescription);
//			paramMap.add("responsibleparty", theResponsibleparty);
//			paramMap.add("status", theStatus);
//			paramMap.add("type", theType);
//			paramMap.add("whenhandedover", theWhenhandedover);
//			paramMap.add("whenprepared", theWhenprepared);
//			paramMap.add("receiver", theReceiver);
//			paramMap.setRevIncludes(theRevIncludes);
//			paramMap.setLastUpdated(theLastUpdated);
//			paramMap.setIncludes(theIncludes);
			paramMap.setSort(theSort);
			paramMap.setCount(theCount);

			ca.uhn.fhir.rest.server.IBundleProvider retVal = getDao().search(paramMap);
			return retVal;
		} finally {
			endRequest(theServletRequest);
		}
	}

}
