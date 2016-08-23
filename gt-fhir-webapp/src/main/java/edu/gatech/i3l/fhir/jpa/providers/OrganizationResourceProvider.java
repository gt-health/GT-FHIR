package edu.gatech.i3l.fhir.jpa.providers;

import java.util.Set;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.rest.annotation.Count;
import ca.uhn.fhir.rest.annotation.IncludeParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.annotation.Sort;
import ca.uhn.fhir.rest.api.SortSpec;
import ca.uhn.fhir.rest.param.StringAndListParam;
import ca.uhn.fhir.rest.param.StringParam;
import ca.uhn.fhir.rest.param.TokenAndListParam;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;

public class OrganizationResourceProvider extends JpaResourceProviderDstu2<Organization> {
	@Override
	public Class<? extends IResource> getResourceType() {
		return Organization.class;
	}

	@Search()
	public ca.uhn.fhir.rest.server.IBundleProvider search(
			javax.servlet.http.HttpServletRequest theServletRequest,
	
			@Description(shortDefinition="The resource identity")
			@OptionalParam(name="_id")
			StringParam theId, 
			
			@Description(shortDefinition="A code for the type of organization")
			@OptionalParam(name="type")
			TokenAndListParam theType, 

			@Description(shortDefinition="A portion of the organization's name")
			@OptionalParam(name="name")
			StringAndListParam theUdi, 

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
			paramMap.add("type", theType);
			paramMap.add("udi", theUdi);
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
