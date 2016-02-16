
package edu.gatech.i3l.fhir.jpa.providers;

import java.util.Set;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.dstu2.resource.Device;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.Group;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.dstu2.resource.Observation;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.rest.annotation.Count;
import ca.uhn.fhir.rest.annotation.IncludeParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.annotation.Sort;
import ca.uhn.fhir.rest.api.SortSpec;
import ca.uhn.fhir.rest.param.QuantityAndListParam;
import ca.uhn.fhir.rest.param.ReferenceAndListParam;
import ca.uhn.fhir.rest.param.StringAndListParam;
import ca.uhn.fhir.rest.param.StringParam;
import ca.uhn.fhir.rest.param.TokenAndListParam;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;
// import ca.uhn.fhir.model.dstu2.resource.Bundle;
// import ca.uhn.fhir.model.api.Bundle;

public class ObservationResourceProvider extends 
	JpaResourceProviderDstu2<Observation>
	{

	@Override
	public Class<? extends IResource> getResourceType() {
		return Observation.class;
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

  
			@Description(shortDefinition="The code of the observation type")
			@OptionalParam(name="code")
			TokenAndListParam theCode, 
  
			@Description(shortDefinition="The value of the observation, if the value is a Quantity, or a SampledData (just search on the bounds of the values in sampled data)")
			@OptionalParam(name="value-quantity")
			QuantityAndListParam theValue_quantity, 
  
			@Description(shortDefinition="The value of the observation, if the value is a CodeableConcept")
			@OptionalParam(name="value-concept")
			TokenAndListParam theValue_concept, 
  
//			@Description(shortDefinition="The value of the observation, if the value is a Period")
//			@OptionalParam(name="value-date")
//			DateRangeParam theValue_date, 
  
			@Description(shortDefinition="The value of the observation, if the value is a string, and also searches in CodeableConcept.text")
			@OptionalParam(name="value-string")
			StringAndListParam theValue_string, 
  
//			@Description(shortDefinition="Obtained date/time. If the obtained element is a period, a date that falls in the period")
//			@OptionalParam(name="date")
//			DateRangeParam theDate, 
//  
//			@Description(shortDefinition="The status of the observation")
//			@OptionalParam(name="status")
//			TokenAndListParam theStatus, 
//  
//			@Description(shortDefinition="The reliability of the observation")
//			@OptionalParam(name="reliability")
//			TokenAndListParam theReliability, 
//  
			@Description(shortDefinition="The subject that the observation is about")
			@OptionalParam(name="subject", targetTypes={  Patient.class ,   Group.class ,   Device.class ,   Location.class   } )
			ReferenceAndListParam theSubject, 
//  
//			@Description(shortDefinition="Who performed the observation")
//			@OptionalParam(name="performer", targetTypes={  Practitioner.class ,   Organization.class ,   Patient.class ,   RelatedPerson.class   } )
//			ReferenceAndListParam thePerformer, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="specimen", targetTypes={  Specimen.class   } )
//			ReferenceAndListParam theSpecimen, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="related-type")
//			TokenAndListParam theRelated_type, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="related-target", targetTypes={  Observation.class   } )
//			ReferenceAndListParam theRelated_target, 
  
			@Description(shortDefinition="Healthcare event related to the observation")
			@OptionalParam(name="encounter", targetTypes={  Encounter.class   } )
			ReferenceAndListParam theEncounter, 
  
//			@Description(shortDefinition="The reason why the expected value in the element Observation.value[x] is missing.")
//			@OptionalParam(name="data-absent-reason")
//			TokenAndListParam theData_absent_reason, 
  
			@Description(shortDefinition="The subject that the observation is about (if patient)")
			@OptionalParam(name="patient", targetTypes={  Patient.class ,   Group.class ,   Device.class ,   Location.class   } )
			ReferenceAndListParam thePatient, 
  
//			@Description(shortDefinition="The unique Id for a particular observation")
//			@OptionalParam(name="identifier")
//			TokenAndListParam theIdentifier, 
//  
//			@Description(shortDefinition="The Device that generated the observation data.")
//			@OptionalParam(name="device", targetTypes={  Device.class ,   DeviceMetric.class   } )
//			ReferenceAndListParam theDevice, 
//  
//			@Description(shortDefinition="Both code and one of the value parameters")
//			@OptionalParam(name="code-value-quantity", compositeTypes= { TokenParam.class, QuantityParam.class })
//			CompositeAndListParam<TokenParam, QuantityParam> theCode_value_quantity,
//  
//			@Description(shortDefinition="Both code and one of the value parameters")
//			@OptionalParam(name="code-value-concept", compositeTypes= { TokenParam.class, TokenParam.class })
//			CompositeAndListParam<TokenParam, TokenParam> theCode_value_concept,
//  
//			@Description(shortDefinition="Both code and one of the value parameters")
//			@OptionalParam(name="code-value-date", compositeTypes= { TokenParam.class, DateParam.class })
//			CompositeAndListParam<TokenParam, DateParam> theCode_value_date,
//  
//			@Description(shortDefinition="Both code and one of the value parameters")
//			@OptionalParam(name="code-value-string", compositeTypes= { TokenParam.class, StringParam.class })
//			CompositeAndListParam<TokenParam, StringParam> theCode_value_string,
//  
//			@Description(shortDefinition="Related Observations - search on related-type and related-target together")
//			@OptionalParam(name="related-target-related-type", compositeTypes= { ReferenceParam.class, TokenParam.class })
//			CompositeAndListParam<ReferenceParam, TokenParam> theRelated_target_related_type,
//
//			@IncludeParam(reverse=true)
//			Set<Include> theRevIncludes,
//			@Description(shortDefinition="Only return resources which were last updated as specified by the given range")
//			@OptionalParam(name="_lastUpdated")
//			DateRangeParam theLastUpdated, 
//
			@IncludeParam(allow = { "Observation:patient", "Observation:subject", "Observation:encounter" , "*" }) 
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
			paramMap.add("value-quantity", theValue_quantity);
			paramMap.add("value-concept", theValue_concept);
//			paramMap.add("value-date", theValue_date);
			paramMap.add("value-string", theValue_string);
//			paramMap.add("date", theDate);
//			paramMap.add("status", theStatus);
//			paramMap.add("reliability", theReliability);
			paramMap.add("subject", theSubject);
//			paramMap.add("performer", thePerformer);
//			paramMap.add("specimen", theSpecimen);
//			paramMap.add("related-type", theRelated_type);
//			paramMap.add("related-target", theRelated_target);
			paramMap.add("encounter", theEncounter);
//			paramMap.add("data-absent-reason", theData_absent_reason);
			paramMap.add("patient", thePatient);
//			paramMap.add("identifier", theIdentifier);
//			paramMap.add("device", theDevice);
//			paramMap.add("code-value-quantity", theCode_value_quantity);
//			paramMap.add("code-value-concept", theCode_value_concept);
//			paramMap.add("code-value-date", theCode_value_date);
//			paramMap.add("code-value-string", theCode_value_string);
//			paramMap.add("related-target-related-type", theRelated_target_related_type);
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
