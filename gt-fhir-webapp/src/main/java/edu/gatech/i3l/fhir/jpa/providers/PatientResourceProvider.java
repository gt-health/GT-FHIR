
package edu.gatech.i3l.fhir.jpa.providers;

import java.util.Set;

//import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.annotation.Description;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.instance.model.api.IBaseResource;

import ca.uhn.fhir.rest.annotation.Count;
import ca.uhn.fhir.rest.annotation.IncludeParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.annotation.Sort;
import ca.uhn.fhir.rest.api.SortSpec;
import ca.uhn.fhir.rest.param.DateRangeParam;
import ca.uhn.fhir.rest.param.StringAndListParam;
import ca.uhn.fhir.rest.param.StringParam;
import ca.uhn.fhir.rest.param.TokenAndListParam;
// import ca.uhn.fhir.model.dstu2.resource.Bundle;
// import ca.uhn.fhir.model.api.Bundle;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;

public class PatientResourceProvider extends 
	JpaResourceProviderDstu3<Patient>
	{

	@Override
	public Class<? extends IBaseResource> getResourceType() {
		return Patient.class;
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
//
//  
//			@Description(shortDefinition="A patient identifier")
//			@OptionalParam(name="identifier")
//			TokenAndListParam theIdentifier, 
  
			@Description(shortDefinition="A portion of either family or given name of the patient")
			@OptionalParam(name="name")
			StringAndListParam theName, 
  
			@Description(shortDefinition="A portion of the family name of the patient")
			@OptionalParam(name="family")
			StringAndListParam theFamily, 
  
			@Description(shortDefinition="A portion of the given name of the patient")
			@OptionalParam(name="given")
			StringAndListParam theGiven, 
  
//			@Description(shortDefinition="A portion of either family or given name using some kind of phonetic matching algorithm")
//			@OptionalParam(name="phonetic")
//			StringAndListParam thePhonetic, 
//  
//			@Description(shortDefinition="The value in any kind of telecom details of the patient")
//			@OptionalParam(name="telecom")
//			TokenAndListParam theTelecom, 
//  
//			@Description(shortDefinition="An address in any kind of address/part of the patient")
//			@OptionalParam(name="address")
//			StringAndListParam theAddress, 
  
			@Description(shortDefinition="Gender of the patient")
			@OptionalParam(name="gender")
			TokenAndListParam theGender, 
  
//			@Description(shortDefinition="Language code (irrespective of use value)")
//			@OptionalParam(name="language")
//			TokenAndListParam theLanguage, 
//  
			@Description(shortDefinition="The patient's date of birth")
			@OptionalParam(name="birthdate")
			DateRangeParam theBirthdate, 
//  
//			@Description(shortDefinition="The organization at which this person is a patient")
//			@OptionalParam(name="organization", targetTypes={  Organization.class   } )
//			ReferenceAndListParam theOrganization, 
//  
//			@Description(shortDefinition="Patient's nominated care provider, could be a care manager, not the organization that manages the record")
//			@OptionalParam(name="careprovider", targetTypes={  Organization.class ,   Practitioner.class   } )
//			ReferenceAndListParam theCareprovider, 
//  
//			@Description(shortDefinition="Whether the patient record is active")
//			@OptionalParam(name="active")
//			TokenAndListParam theActive, 
//  
//			@Description(shortDefinition="The species for animal patients")
//			@OptionalParam(name="animal-species")
//			TokenAndListParam theAnimal_species, 
//  
//			@Description(shortDefinition="The breed for animal patients")
//			@OptionalParam(name="animal-breed")
//			TokenAndListParam theAnimal_breed, 
//  
//			@Description(shortDefinition="All patients linked to the given patient")
//			@OptionalParam(name="link", targetTypes={  Patient.class   } )
//			ReferenceAndListParam theLink, 
//  
//			@Description(shortDefinition="This patient has been marked as deceased, or as a death date entered")
//			@OptionalParam(name="deceased")
//			TokenAndListParam theDeceased, 
//  
//			@Description(shortDefinition="The date of death has been provided and satisfies this search value")
//			@OptionalParam(name="deathdate")
//			DateRangeParam theDeathdate, 
//
//			@IncludeParam(reverse=true)
//			Set<Include> theRevIncludes,
//			@Description(shortDefinition="Only return resources which were last updated as specified by the given range")
//			@OptionalParam(name="_lastUpdated")
//			DateRangeParam theLastUpdated, 
//
			@IncludeParam(allow= {
//					"Patient:careprovider" , 					"Patient:link" , 					"Patient:organization" , 						"Patient:careprovider" , 					"Patient:link" , 					"Patient:organization" , 						"Patient:careprovider" , 					"Patient:link" , 					"Patient:organization" 					, "*"
			}) 
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
			paramMap.add("name", theName);
			paramMap.add("family", theFamily);
			paramMap.add("given", theGiven);
//			paramMap.add("phonetic", thePhonetic);
//			paramMap.add("telecom", theTelecom);
//			paramMap.add("address", theAddress);
			paramMap.add("gender", theGender);
//			paramMap.add("language", theLanguage);
			paramMap.add("birthdate", theBirthdate);
//			paramMap.add("organization", theOrganization);
//			paramMap.add("careprovider", theCareprovider);
//			paramMap.add("active", theActive);
//			paramMap.add("animal-species", theAnimal_species);
//			paramMap.add("animal-breed", theAnimal_breed);
//			paramMap.add("link", theLink);
//			paramMap.add("deceased", theDeceased);
//			paramMap.add("deathdate", theDeathdate);
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
