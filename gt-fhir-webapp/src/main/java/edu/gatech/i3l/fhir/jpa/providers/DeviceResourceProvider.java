package edu.gatech.i3l.fhir.jpa.providers;

import java.util.Set;

//import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.annotation.Description;
import org.hl7.fhir.dstu3.model.Device;
import org.hl7.fhir.dstu3.model.Organization;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.instance.model.api.IBaseResource;

import ca.uhn.fhir.rest.annotation.Count;
import ca.uhn.fhir.rest.annotation.IncludeParam;
import ca.uhn.fhir.rest.annotation.OptionalParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.annotation.Sort;
import ca.uhn.fhir.rest.api.SortSpec;
import ca.uhn.fhir.rest.param.ReferenceAndListParam;
import ca.uhn.fhir.rest.param.StringAndListParam;
import ca.uhn.fhir.rest.param.StringParam;
import ca.uhn.fhir.rest.param.TokenAndListParam;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;

public class DeviceResourceProvider extends JpaResourceProviderDstu3<Device> {
	@Override
	public Class<? extends IBaseResource> getResourceType() {
		return Device.class;
	}

	@Search()
	public ca.uhn.fhir.rest.api.server.IBundleProvider search(
			javax.servlet.http.HttpServletRequest theServletRequest,
	
			@Description(shortDefinition="The resource identity")
			@OptionalParam(name="_id")
			StringParam theId, 
			
			@Description(shortDefinition="The organization responsible for the device")
			@OptionalParam(name="organization", targetTypes={  Organization.class   } )
			ReferenceAndListParam theOrganization, 
  
			@Description(shortDefinition="Patient information, if the resource is affixed to a person")
			@OptionalParam(name="patient", targetTypes={  Patient.class   } )
			ReferenceAndListParam thePatient, 

			@Description(shortDefinition="The type of the device")
			@OptionalParam(name="type")
			TokenAndListParam theType, 

			@Description(shortDefinition="FDA mandated Unique Device Identifier")
			@OptionalParam(name="udi")
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
			paramMap.add("organization", theOrganization);
			paramMap.add("patient", thePatient);
			paramMap.add("type", theType);
			paramMap.add("udi", theUdi);
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
