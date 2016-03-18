package edu.gatech.i3l.fhir.jpa.providers;

import java.util.*;

import org.apache.commons.lang3.StringUtils;

// import ca.uhn.fhir.jpa.provider.JpaResourceProviderDstu2;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;
// import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.annotation.*;
// import ca.uhn.fhir.model.dstu2.composite.*;
import ca.uhn.fhir.model.dstu2.resource.*; //
import ca.uhn.fhir.rest.annotation.*;
import ca.uhn.fhir.rest.param.*;
import ca.uhn.fhir.rest.api.SortSpec;
// import ca.uhn.fhir.model.dstu.resource.Binary;
// import ca.uhn.fhir.model.dstu2.resource.Bundle;
// import ca.uhn.fhir.model.api.Bundle;

public class ImmunizationResourceProvider extends
        JpaResourceProviderDstu2<Immunization>
{

    @Override
    public Class<Immunization> getResourceType() {
        return Immunization.class;
    }

    @Search()
    public ca.uhn.fhir.rest.server.IBundleProvider search(
            javax.servlet.http.HttpServletRequest theServletRequest,

            ca.uhn.fhir.rest.method.RequestDetails theRequestDetails,

            @Description(shortDefinition="The resource identity")
            @OptionalParam(name="_id")
            StringAndListParam theId,

            @Description(shortDefinition="The resource language")
            @OptionalParam(name="_language")
            StringAndListParam theResourceLanguage,

            @Description(shortDefinition="Search the contents of the resource's data using a fulltext search")
            @OptionalParam(name=ca.uhn.fhir.rest.server.Constants.PARAM_CONTENT)
            StringAndListParam theFtContent,

            @Description(shortDefinition="Search the contents of the resource's narrative using a fulltext search")
            @OptionalParam(name=ca.uhn.fhir.rest.server.Constants.PARAM_TEXT)
            StringAndListParam theFtText,

            @Description(shortDefinition="Search for resources which have the given tag")
            @OptionalParam(name=ca.uhn.fhir.rest.server.Constants.PARAM_TAG)
            TokenAndListParam theSearchForTag,

            @Description(shortDefinition="Search for resources which have the given security labels")
            @OptionalParam(name=ca.uhn.fhir.rest.server.Constants.PARAM_SECURITY)
            TokenAndListParam theSearchForSecurity,

            @Description(shortDefinition="Search for resources which have the given profile")
            @OptionalParam(name=ca.uhn.fhir.rest.server.Constants.PARAM_PROFILE)
            UriAndListParam theSearchForProfile,


            @Description(shortDefinition="Vaccination  (non)-Administration Date")
            @OptionalParam(name="date")
            DateRangeParam theDate,

            @Description(shortDefinition="")
            @OptionalParam(name="dose-sequence")
            NumberAndListParam theDose_sequence,

            @Description(shortDefinition="")
            @OptionalParam(name="identifier")
            TokenAndListParam theIdentifier,

            @Description(shortDefinition="The service delivery location or facility in which the vaccine was / was to be administered")
            @OptionalParam(name="location", targetTypes={  Location.class   } )
            ReferenceAndListParam theLocation,

            @Description(shortDefinition="Vaccine Lot Number")
            @OptionalParam(name="lot-number")
            StringAndListParam theLot_number,

            @Description(shortDefinition="Vaccine Manufacturer")
            @OptionalParam(name="manufacturer", targetTypes={  Organization.class   } )
            ReferenceAndListParam theManufacturer,

            @Description(shortDefinition="The practitioner who administered the vaccination")
            @OptionalParam(name="performer", targetTypes={  Practitioner.class   } )
            ReferenceAndListParam thePerformer,

            @Description(shortDefinition="")
            @OptionalParam(name="reaction", targetTypes={  Observation.class   } )
            ReferenceAndListParam theReaction,

            @Description(shortDefinition="")
            @OptionalParam(name="reaction-date")
            DateRangeParam theReaction_date,

            @Description(shortDefinition="")
            @OptionalParam(name="reason")
            TokenAndListParam theReason,

            @Description(shortDefinition="Explanation of reason vaccination was not administered")
            @OptionalParam(name="reason-not-given")
            TokenAndListParam theReason_not_given,

            @Description(shortDefinition="Administrations which were not given")
            @OptionalParam(name="notgiven")
            TokenAndListParam theNotgiven,

            @Description(shortDefinition="The practitioner who ordered the vaccination")
            @OptionalParam(name="requester", targetTypes={  Practitioner.class   } )
            ReferenceAndListParam theRequester,

            @Description(shortDefinition="The patient for the vaccination record")
            @OptionalParam(name="patient", targetTypes={  Patient.class   } )
            ReferenceAndListParam thePatient,

            @Description(shortDefinition="Vaccine Product Administered")
            @OptionalParam(name="vaccine-code")
            TokenAndListParam theVaccine_code,

            @Description(shortDefinition="Immunization event status")
            @OptionalParam(name="status")
            TokenAndListParam theStatus,

            @IncludeParam(reverse=true)
            Set<Include> theRevIncludes,
            @Description(shortDefinition="Only return resources which were last updated as specified by the given range")
            @OptionalParam(name="_lastUpdated")
            DateRangeParam theLastUpdated,

            @IncludeParam(allow= {
                    "Immunization:location" , 					"Immunization:manufacturer" , 					"Immunization:patient" , 					"Immunization:performer" , 					"Immunization:reaction" , 					"Immunization:requester" , 						"Immunization:location" , 					"Immunization:manufacturer" , 					"Immunization:patient" , 					"Immunization:performer" , 					"Immunization:reaction" , 					"Immunization:requester" , 						"Immunization:location" , 					"Immunization:manufacturer" , 					"Immunization:patient" , 					"Immunization:performer" , 					"Immunization:reaction" , 					"Immunization:requester" , 						"Immunization:location" , 					"Immunization:manufacturer" , 					"Immunization:patient" , 					"Immunization:performer" , 					"Immunization:reaction" , 					"Immunization:requester" , 						"Immunization:location" , 					"Immunization:manufacturer" , 					"Immunization:patient" , 					"Immunization:performer" , 					"Immunization:reaction" , 					"Immunization:requester" , 						"Immunization:location" , 					"Immunization:manufacturer" , 					"Immunization:patient" , 					"Immunization:performer" , 					"Immunization:reaction" , 					"Immunization:requester" 					, "*"
            })
            Set<Include> theIncludes,

            @Sort
            SortSpec theSort,

            @ca.uhn.fhir.rest.annotation.Count
            Integer theCount
    ) {
        startRequest(theServletRequest);
        try {
            SearchParameterMap paramMap = new SearchParameterMap();
            paramMap.add("_id", theId);
            paramMap.add("_language", theResourceLanguage);
            paramMap.add(ca.uhn.fhir.rest.server.Constants.PARAM_CONTENT, theFtContent);
            paramMap.add(ca.uhn.fhir.rest.server.Constants.PARAM_TEXT, theFtText);
            paramMap.add(ca.uhn.fhir.rest.server.Constants.PARAM_TAG, theSearchForTag);
            paramMap.add(ca.uhn.fhir.rest.server.Constants.PARAM_SECURITY, theSearchForSecurity);
            paramMap.add(ca.uhn.fhir.rest.server.Constants.PARAM_PROFILE, theSearchForProfile);
            paramMap.add("date", theDate);
            paramMap.add("dose-sequence", theDose_sequence);
            paramMap.add("identifier", theIdentifier);
            paramMap.add("location", theLocation);
            paramMap.add("lot-number", theLot_number);
            paramMap.add("manufacturer", theManufacturer);
            paramMap.add("performer", thePerformer);
            paramMap.add("reaction", theReaction);
            paramMap.add("reaction-date", theReaction_date);
            paramMap.add("reason", theReason);
            paramMap.add("reason-not-given", theReason_not_given);
            paramMap.add("notgiven", theNotgiven);
            paramMap.add("requester", theRequester);
            paramMap.add("patient", thePatient);
            paramMap.add("vaccine-code", theVaccine_code);
            paramMap.add("status", theStatus);
            paramMap.setRevIncludes(theRevIncludes);
            paramMap.setLastUpdated(theLastUpdated);
            paramMap.setIncludes(theIncludes);
            paramMap.setSort(theSort);
            paramMap.setCount(theCount);
            // paramMap.setRequestDetails(theRequestDetails);

            ca.uhn.fhir.rest.server.IBundleProvider retVal = getDao().search(paramMap);
            return retVal;
        } finally {
            endRequest(theServletRequest);
        }
    }

}
