
package edu.gatech.i3l.fhir.jpa.providers;

import java.util.Set;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.rest.annotation.Count;
import ca.uhn.fhir.rest.annotation.IncludeParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.annotation.Sort;
import ca.uhn.fhir.rest.api.SortSpec;
import ca.uhn.fhir.rest.param.DateRangeParam;
import ca.uhn.fhir.rest.param.ReferenceAndListParam;
import ca.uhn.fhir.rest.param.StringParam;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;
// import ca.uhn.fhir.model.dstu2.resource.Bundle;
// import ca.uhn.fhir.model.api.Bundle;

public class EncounterResourceProvider extends 
	JpaResourceProviderDstu2<Encounter>
	{

	@Override
	public Class<? extends IResource> getResourceType() {
		return Encounter.class;
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
//			@Description(shortDefinition="")
//			@OptionalParam(name="identifier")
//			TokenAndListParam theIdentifier, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="status")
//			TokenAndListParam theStatus, 
  
			@Description(shortDefinition="A date within the period the Encounter lasted")
			@OptionalParam(name="date")
			DateRangeParam theDate, 
  
			@Description(shortDefinition="")
			@OptionalParam(name="patient", targetTypes={  Patient.class   } )
			ReferenceAndListParam thePatient, 
  
//			@Description(shortDefinition="")
//			@OptionalParam(name="fulfills", targetTypes={  Appointment.class   } )
//			ReferenceAndListParam theFulfills, 
//  
//			@Description(shortDefinition="Length of encounter in days")
//			@OptionalParam(name="length")
//			NumberAndListParam theLength, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="reason")
//			TokenAndListParam theReason, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="indication", targetTypes={  } )
//			ReferenceAndListParam theIndication, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="location", targetTypes={  Location.class   } )
//			ReferenceAndListParam theLocation, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="location-period")
//			DateRangeParam theLocation_period, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="type")
//			TokenAndListParam theType, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="special-arrangement")
//			TokenAndListParam theSpecial_arrangement, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="part-of", targetTypes={  Encounter.class   } )
//			ReferenceAndListParam thePart_of, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="participant", targetTypes={  Practitioner.class ,   RelatedPerson.class   } )
//			ReferenceAndListParam theParticipant, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="participant-type")
//			TokenAndListParam theParticipant_type, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="episodeofcare", targetTypes={  EpisodeOfCare.class   } )
//			ReferenceAndListParam theEpisodeofcare, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="incomingreferral", targetTypes={  ReferralRequest.class   } )
//			ReferenceAndListParam theIncomingreferral, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="practitioner", targetTypes={  Practitioner.class ,   RelatedPerson.class   } )
//			ReferenceAndListParam thePractitioner, 
//
//			@IncludeParam(reverse=true)
//			Set<Include> theRevIncludes,
//			@Description(shortDefinition="Only return resources which were last updated as specified by the given range")
//			@OptionalParam(name="_lastUpdated")
//			DateRangeParam theLastUpdated, 

			@IncludeParam(allow = { "Encounter:patient", "*" }) 
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
//			paramMap.add("identifier", theIdentifier);
//			paramMap.add("status", theStatus);
			paramMap.add("date", theDate);
			paramMap.add("patient", thePatient);
//			paramMap.add("fulfills", theFulfills);
//			paramMap.add("length", theLength);
//			paramMap.add("reason", theReason);
//			paramMap.add("indication", theIndication);
//			paramMap.add("location", theLocation);
//			paramMap.add("location-period", theLocation_period);
//			paramMap.add("type", theType);
//			paramMap.add("special-arrangement", theSpecial_arrangement);
//			paramMap.add("part-of", thePart_of);
//			paramMap.add("participant", theParticipant);
//			paramMap.add("participant-type", theParticipant_type);
//			paramMap.add("episodeofcare", theEpisodeofcare);
//			paramMap.add("incomingreferral", theIncomingreferral);
//			paramMap.add("practitioner", thePractitioner);
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
