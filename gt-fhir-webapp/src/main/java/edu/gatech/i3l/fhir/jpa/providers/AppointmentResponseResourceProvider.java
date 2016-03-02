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

public class AppointmentResponseResourceProvider extends
        JpaResourceProviderDstu2<AppointmentResponse>
{

    @Override
    public Class<AppointmentResponse> getResourceType() {
        return AppointmentResponse.class;
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


            @Description(shortDefinition="The appointment that the response is attached to")
            @OptionalParam(name="appointment", targetTypes={  Appointment.class   } )
            ReferenceAndListParam theAppointment,

            @Description(shortDefinition="The participants acceptance status for this appointment")
            @OptionalParam(name="part-status")
            TokenAndListParam thePart_status,

            @Description(shortDefinition="The Person, Location/HealthcareService or Device that this appointment response replies for")
            @OptionalParam(name="actor", targetTypes={  Patient.class ,   Practitioner.class ,   RelatedPerson.class ,   Device.class ,   HealthcareService.class ,   Location.class   } )
            ReferenceAndListParam theActor,

            @Description(shortDefinition="This Response is for this Patient")
            @OptionalParam(name="patient", targetTypes={  Patient.class ,   Practitioner.class ,   RelatedPerson.class ,   Device.class ,   HealthcareService.class ,   Location.class   } )
            ReferenceAndListParam thePatient,

            @Description(shortDefinition="This Response is for this Practitioner")
            @OptionalParam(name="practitioner", targetTypes={  Patient.class ,   Practitioner.class ,   RelatedPerson.class ,   Device.class ,   HealthcareService.class ,   Location.class   } )
            ReferenceAndListParam thePractitioner,

            @Description(shortDefinition="This Response is for this Location")
            @OptionalParam(name="location", targetTypes={  Patient.class ,   Practitioner.class ,   RelatedPerson.class ,   Device.class ,   HealthcareService.class ,   Location.class   } )
            ReferenceAndListParam theLocation,

            @Description(shortDefinition="An Identifier in this appointment response")
            @OptionalParam(name="identifier")
            TokenAndListParam theIdentifier,

            @IncludeParam(reverse=true)
            Set<Include> theRevIncludes,
            @Description(shortDefinition="Only return resources which were last updated as specified by the given range")
            @OptionalParam(name="_lastUpdated")
            DateRangeParam theLastUpdated,

            @IncludeParam(allow= {
                    "AppointmentResponse:actor" , 					"AppointmentResponse:appointment" , 					"AppointmentResponse:location" , 					"AppointmentResponse:patient" , 					"AppointmentResponse:practitioner" , 						"AppointmentResponse:actor" , 					"AppointmentResponse:appointment" , 					"AppointmentResponse:location" , 					"AppointmentResponse:patient" , 					"AppointmentResponse:practitioner" , 						"AppointmentResponse:actor" , 					"AppointmentResponse:appointment" , 					"AppointmentResponse:location" , 					"AppointmentResponse:patient" , 					"AppointmentResponse:practitioner" , 						"AppointmentResponse:actor" , 					"AppointmentResponse:appointment" , 					"AppointmentResponse:location" , 					"AppointmentResponse:patient" , 					"AppointmentResponse:practitioner" , 						"AppointmentResponse:actor" , 					"AppointmentResponse:appointment" , 					"AppointmentResponse:location" , 					"AppointmentResponse:patient" , 					"AppointmentResponse:practitioner" 					, "*"
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
            paramMap.add("appointment", theAppointment);
            paramMap.add("part-status", thePart_status);
            paramMap.add("actor", theActor);
            paramMap.add("patient", thePatient);
            paramMap.add("practitioner", thePractitioner);
            paramMap.add("location", theLocation);
            paramMap.add("identifier", theIdentifier);
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
