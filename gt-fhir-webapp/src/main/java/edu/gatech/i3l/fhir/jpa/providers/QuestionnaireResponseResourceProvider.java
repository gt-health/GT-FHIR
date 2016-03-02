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

public class QuestionnaireResponseResourceProvider extends
        JpaResourceProviderDstu2<QuestionnaireResponse>
{

    @Override
    public Class<QuestionnaireResponse> getResourceType() {
        return QuestionnaireResponse.class;
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


            @Description(shortDefinition="The status of the questionnaire response")
            @OptionalParam(name="status")
            TokenAndListParam theStatus,

            @Description(shortDefinition="When the questionnaire was authored")
            @OptionalParam(name="authored")
            DateRangeParam theAuthored,

            @Description(shortDefinition="The subject of the questionnaire")
            @OptionalParam(name="subject", targetTypes={  } )
            ReferenceAndListParam theSubject,

            @Description(shortDefinition="The author of the questionnaire")
            @OptionalParam(name="author", targetTypes={  Device.class ,   Practitioner.class ,   Patient.class ,   RelatedPerson.class   } )
            ReferenceAndListParam theAuthor,

            @Description(shortDefinition="The questionnaire the answers are provided for")
            @OptionalParam(name="questionnaire", targetTypes={  Questionnaire.class   } )
            ReferenceAndListParam theQuestionnaire,

            @Description(shortDefinition="Encounter during which questionnaire was authored")
            @OptionalParam(name="encounter", targetTypes={  Encounter.class   } )
            ReferenceAndListParam theEncounter,

            @Description(shortDefinition="The patient that is the subject of the questionnaire")
            @OptionalParam(name="patient", targetTypes={  } )
            ReferenceAndListParam thePatient,

            @Description(shortDefinition="")
            @OptionalParam(name="source", targetTypes={  Patient.class ,   Practitioner.class ,   RelatedPerson.class   } )
            ReferenceAndListParam theSource,

            @IncludeParam(reverse=true)
            Set<Include> theRevIncludes,
            @Description(shortDefinition="Only return resources which were last updated as specified by the given range")
            @OptionalParam(name="_lastUpdated")
            DateRangeParam theLastUpdated,

            @IncludeParam(allow= {
                    "QuestionnaireResponse:author" , 					"QuestionnaireResponse:encounter" , 					"QuestionnaireResponse:patient" , 					"QuestionnaireResponse:questionnaire" , 					"QuestionnaireResponse:source" , 					"QuestionnaireResponse:subject" , 						"QuestionnaireResponse:author" , 					"QuestionnaireResponse:encounter" , 					"QuestionnaireResponse:patient" , 					"QuestionnaireResponse:questionnaire" , 					"QuestionnaireResponse:source" , 					"QuestionnaireResponse:subject" , 						"QuestionnaireResponse:author" , 					"QuestionnaireResponse:encounter" , 					"QuestionnaireResponse:patient" , 					"QuestionnaireResponse:questionnaire" , 					"QuestionnaireResponse:source" , 					"QuestionnaireResponse:subject" , 						"QuestionnaireResponse:author" , 					"QuestionnaireResponse:encounter" , 					"QuestionnaireResponse:patient" , 					"QuestionnaireResponse:questionnaire" , 					"QuestionnaireResponse:source" , 					"QuestionnaireResponse:subject" , 						"QuestionnaireResponse:author" , 					"QuestionnaireResponse:encounter" , 					"QuestionnaireResponse:patient" , 					"QuestionnaireResponse:questionnaire" , 					"QuestionnaireResponse:source" , 					"QuestionnaireResponse:subject" , 						"QuestionnaireResponse:author" , 					"QuestionnaireResponse:encounter" , 					"QuestionnaireResponse:patient" , 					"QuestionnaireResponse:questionnaire" , 					"QuestionnaireResponse:source" , 					"QuestionnaireResponse:subject" 					, "*"
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
            paramMap.add("authored", theAuthored);
            paramMap.add("subject", theSubject);
            paramMap.add("author", theAuthor);
            paramMap.add("questionnaire", theQuestionnaire);
            paramMap.add("encounter", theEncounter);
            paramMap.add("patient", thePatient);
            paramMap.add("source", theSource);
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
