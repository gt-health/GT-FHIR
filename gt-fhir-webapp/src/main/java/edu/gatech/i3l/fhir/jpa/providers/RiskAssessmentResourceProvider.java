package edu.gatech.i3l.fhir.jpa.providers;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.annotation.Description;
import ca.uhn.fhir.model.dstu2.resource.Group;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.RiskAssessment;
import ca.uhn.fhir.rest.annotation.Count;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.annotation.Sort;
import ca.uhn.fhir.rest.api.SortSpec;
import ca.uhn.fhir.rest.param.ReferenceAndListParam;
import ca.uhn.fhir.rest.param.StringParam;
import ca.uhn.fhir.rest.param.TokenAndListParam;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;

public class RiskAssessmentResourceProvider extends 
JpaResourceProviderDstu2<RiskAssessment>
{
	@Override
	public Class<? extends IResource> getResourceType() {
		return RiskAssessment.class;
	}
	
	@Search()
	public ca.uhn.fhir.rest.server.IBundleProvider search(
			javax.servlet.http.HttpServletRequest theServletRequest,
	
			@Description(shortDefinition="The resource identity")
			@OptionalParam(name="_id")
			StringParam theId, 

			@Description(shortDefinition="The subject that the risk assessment is about")
			@OptionalParam(name="subject", targetTypes={  Patient.class ,   Group.class } )
			ReferenceAndListParam theSubject, 
			
			@Description(shortDefinition="The evaluation mechanism or algorithm used")
			@OptionalParam(name="method")
			TokenAndListParam theMethod, 
  
			@Description(shortDefinition="The subject that the risk assessment is about (if patient)")
			@OptionalParam(name="patient", targetTypes={  Patient.class ,   Group.class } )
			ReferenceAndListParam thePatient, 

			
			@Sort 
			SortSpec theSort,
			
			@Count
			Integer theCount
	) {
		startRequest(theServletRequest);
		try {
			SearchParameterMap paramMap = new SearchParameterMap();
			paramMap.add("_id", theId);
			paramMap.add("method", theMethod);
			paramMap.add("subject", theSubject);
			paramMap.add("patient", thePatient);
			paramMap.setSort(theSort);
			paramMap.setCount(theCount);

			ca.uhn.fhir.rest.server.IBundleProvider retVal = getDao().search(paramMap);
			return retVal;
		} finally {
			endRequest(theServletRequest);
		}
	}
}