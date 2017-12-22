
package edu.gatech.i3l.fhir.jpa.providers;

import java.util.Set;

import org.hl7.fhir.instance.model.api.IBaseResource;

//import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.annotation.Description;
import org.hl7.fhir.dstu3.model.Condition;
import org.hl7.fhir.dstu3.model.Encounter;
import org.hl7.fhir.dstu3.model.Patient;
import ca.uhn.fhir.rest.annotation.Count;
import ca.uhn.fhir.rest.annotation.IncludeParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.annotation.Sort;
import ca.uhn.fhir.rest.api.SortSpec;
import ca.uhn.fhir.rest.param.DateRangeParam;
import ca.uhn.fhir.rest.param.ReferenceAndListParam;
import ca.uhn.fhir.rest.param.StringParam;
import ca.uhn.fhir.rest.param.TokenAndListParam;
// import ca.uhn.fhir.model.dstu2.resource.Bundle;
// import ca.uhn.fhir.model.api.Bundle;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;

public class ConditionResourceProvider extends 
	JpaResourceProviderDstu3<Condition>
	{

	@Override
	public Class<? extends IBaseResource> getResourceType() {
		return Condition.class;
	}

	@Search()
	public ca.uhn.fhir.rest.api.server.IBundleProvider search(
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

  
			@Description(shortDefinition="Code for the condition")
			@OptionalParam(name="code")
			TokenAndListParam theCode, 
  
//			@Description(shortDefinition="The clinical status of the condition")
//			@OptionalParam(name="clinicalstatus")
//			TokenAndListParam theClinicalstatus, 
//  
//			@Description(shortDefinition="The severity of the condition")
//			@OptionalParam(name="severity")
//			TokenAndListParam theSeverity, 
//  
//			@Description(shortDefinition="The category of the condition")
//			@OptionalParam(name="category")
//			TokenAndListParam theCategory, 
//  
			@Description(shortDefinition="Date related onsets (dateTime and Period)")
			@OptionalParam(name="onset-date")
			DateRangeParam theOnset, 
  
//			@Description(shortDefinition="Other onsets (boolean, age, range, string)")
//			@OptionalParam(name="onset-info")
//			StringAndListParam theOnset_info, 
  
			@Description(shortDefinition="")
			@OptionalParam(name="encounter", targetTypes={  Encounter.class   } )
			ReferenceAndListParam theEncounter, 
  
//			@Description(shortDefinition="")
//			@OptionalParam(name="asserter", targetTypes={  Practitioner.class ,   Patient.class   } )
//			ReferenceAndListParam theAsserter, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="date-asserted")
//			DateRangeParam theDate_asserted, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="evidence")
//			TokenAndListParam theEvidence, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="location")
//			TokenAndListParam theLocation, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="stage")
//			TokenAndListParam theStage, 
  
			@Description(shortDefinition="The patient that the condition is about")
			@OptionalParam(name="patient", targetTypes={  Patient.class   } )
			ReferenceAndListParam thePatient, 
  
//			@Description(shortDefinition="")
//			@OptionalParam(name="subject", targetTypes={  Patient.class   } )
//			ReferenceAndListParam theSubject, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="dueto-code")
//			TokenAndListParam theDueto_code, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="dueto-item", targetTypes={  Condition.class ,   Procedure.class ,   MedicationAdministration.class ,   Immunization.class ,   MedicationStatement.class   } )
//			ReferenceAndListParam theDueto_item, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="following-code")
//			TokenAndListParam theFollowing_code, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="following-item", targetTypes={  Condition.class ,   Procedure.class ,   MedicationAdministration.class ,   Immunization.class ,   MedicationStatement.class   } )
//			ReferenceAndListParam theFollowing_item, 
//
//			@IncludeParam(reverse=true)
//			Set<Include> theRevIncludes,
//			@Description(shortDefinition="Only return resources which were last updated as specified by the given range")
//			@OptionalParam(name="_lastUpdated")
//			DateRangeParam theLastUpdated, 

			@IncludeParam(allow = { "Condition:encounter", "Condition:patient" }) 
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
			paramMap.add("code", theCode);
//			paramMap.add("clinicalstatus", theClinicalstatus);
//			paramMap.add("severity", theSeverity);
//			paramMap.add("category", theCategory);
			paramMap.add("onset", theOnset);
//			paramMap.add("onset-info", theOnset_info);
			paramMap.add("encounter", theEncounter);
//			paramMap.add("asserter", theAsserter);
//			paramMap.add("date-asserted", theDate_asserted);
//			paramMap.add("evidence", theEvidence);
//			paramMap.add("location", theLocation);
//			paramMap.add("stage", theStage);
			paramMap.add("patient", thePatient);
//			paramMap.add("subject", theSubject);
//			paramMap.add("dueto-code", theDueto_code);
//			paramMap.add("dueto-item", theDueto_item);
//			paramMap.add("following-code", theFollowing_code);
//			paramMap.add("following-item", theFollowing_item);
//			paramMap.setRevIncludes(theRevIncludes);
//			paramMap.setLastUpdated(theLastUpdated);
			paramMap.setIncludes(theIncludes);
			paramMap.setSort(theSort);
			paramMap.setCount(theCount);

			ca.uhn.fhir.rest.api.server.IBundleProvider retVal = getDao().search(paramMap);
			return retVal;
		} finally {
			endRequest(theServletRequest);
		}
	}

}
