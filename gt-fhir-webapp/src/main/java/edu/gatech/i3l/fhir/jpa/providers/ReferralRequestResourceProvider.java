package edu.gatech.i3l.fhir.jpa.providers;

import java.util.*;

// import org.apache.commons.lang3.StringUtils;

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

public class ReferralRequestResourceProvider extends
        JpaResourceProviderDstu2<ReferralRequest>
{

    @Override
    public Class<ReferralRequest> getResourceType() {
        return ReferralRequest.class;
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


            @Description(shortDefinition="The status of the referral")
            @OptionalParam(name="status")
            TokenAndListParam theStatus,

            @Description(shortDefinition="Creation or activation date")
            @OptionalParam(name="date")
            DateRangeParam theDate,

            @Description(shortDefinition="The type of the referral")
            @OptionalParam(name="type")
            TokenAndListParam theType,

            @Description(shortDefinition="The specialty that the referral is for")
            @OptionalParam(name="specialty")
            TokenAndListParam theSpecialty,

            @Description(shortDefinition="The priority assigned to the referral")
            @OptionalParam(name="priority")
            TokenAndListParam thePriority,

            @Description(shortDefinition="The person that the referral was sent to")
            @OptionalParam(name="recipient", targetTypes={  Practitioner.class ,   Organization.class   } )
            ReferenceAndListParam theRecipient,

            @Description(shortDefinition="Who the referral is about")
            @OptionalParam(name="patient", targetTypes={  Patient.class   } )
            ReferenceAndListParam thePatient,

            @Description(shortDefinition="")
            @OptionalParam(name="requester", targetTypes={  Practitioner.class ,   Organization.class ,   Patient.class   } )
            ReferenceAndListParam theRequester,

            @IncludeParam(reverse=true)
            Set<Include> theRevIncludes,
            @Description(shortDefinition="Only return resources which were last updated as specified by the given range")
            @OptionalParam(name="_lastUpdated")
            DateRangeParam theLastUpdated,

            @IncludeParam(allow= {
                    "ReferralRequest:patient" , 					"ReferralRequest:recipient" , 					"ReferralRequest:requester" , 						"ReferralRequest:patient" , 					"ReferralRequest:recipient" , 					"ReferralRequest:requester" , 						"ReferralRequest:patient" , 					"ReferralRequest:recipient" , 					"ReferralRequest:requester" 					, "*"
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
            paramMap.add("status", theStatus);
            paramMap.add("date", theDate);
            paramMap.add("type", theType);
            paramMap.add("specialty", theSpecialty);
            paramMap.add("priority", thePriority);
            paramMap.add("recipient", theRecipient);
            paramMap.add("patient", thePatient);
            paramMap.add("requester", theRequester);
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
