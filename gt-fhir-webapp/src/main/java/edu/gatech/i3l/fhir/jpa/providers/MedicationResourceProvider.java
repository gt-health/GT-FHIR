
package edu.gatech.i3l.fhir.jpa.providers;

import java.util.Set;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.rest.annotation.Count;
import ca.uhn.fhir.rest.annotation.IncludeParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.annotation.Sort;
import ca.uhn.fhir.rest.api.SortSpec;
import ca.uhn.fhir.rest.param.StringAndListParam;
import ca.uhn.fhir.rest.param.StringParam;
import ca.uhn.fhir.rest.param.TokenAndListParam;
// import ca.uhn.fhir.model.dstu2.resource.Bundle;
// import ca.uhn.fhir.model.api.Bundle;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;

public class MedicationResourceProvider extends 
	JpaResourceProviderDstu2<Medication>
	{

	@Override
	public Class<? extends IResource> getResourceType() {
		return Medication.class;
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

  
			@Description(shortDefinition="")
			@OptionalParam(name="code")
			TokenAndListParam theCode, 
  
			@Description(shortDefinition="")
			@OptionalParam(name="name")
			StringAndListParam theName, 
  
//			@Description(shortDefinition="")
//			@OptionalParam(name="manufacturer", targetTypes={  Organization.class   } )
//			ReferenceAndListParam theManufacturer, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="form")
//			TokenAndListParam theForm, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="ingredient", targetTypes={  Substance.class ,   Medication.class   } )
//			ReferenceAndListParam theIngredient, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="container")
//			TokenAndListParam theContainer, 
//  
//			@Description(shortDefinition="")
//			@OptionalParam(name="content", targetTypes={  Medication.class   } )
//			ReferenceAndListParam theContent, 
//
//			@IncludeParam(reverse=true)
//			Set<Include> theRevIncludes,
//			@Description(shortDefinition="Only return resources which were last updated as specified by the given range")
//			@OptionalParam(name="_lastUpdated")
//			DateRangeParam theLastUpdated, 
//
			@IncludeParam(allow= {
//					"Medication:content" , 					"Medication:ingredient" , 					"Medication:manufacturer" , 						"Medication:content" , 					"Medication:ingredient" , 					"Medication:manufacturer" , 						"Medication:content" , 					"Medication:ingredient" , 					"Medication:manufacturer" 					, "*"
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
			paramMap.add("code", theCode);
			paramMap.add("name", theName);
//			paramMap.add("manufacturer", theManufacturer);
//			paramMap.add("form", theForm);
//			paramMap.add("ingredient", theIngredient);
//			paramMap.add("container", theContainer);
//			paramMap.add("content", theContent);
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
