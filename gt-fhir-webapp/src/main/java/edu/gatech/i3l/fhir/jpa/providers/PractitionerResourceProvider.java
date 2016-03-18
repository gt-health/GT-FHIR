package edu.gatech.i3l.fhir.jpa.providers;

import java.util.*;

import org.apache.commons.lang3.StringUtils;

//import ca.uhn.fhir.jpa.provider.JpaResourceProviderDstu2;
import edu.gatech.i3l.fhir.jpa.dao.SearchParameterMap;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.annotation.*;
//import ca.uhn.fhir.model.dstu2.composite.*;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.rest.annotation.*;
import ca.uhn.fhir.rest.param.*;
import ca.uhn.fhir.rest.api.SortSpec;
//import ca.uhn.fhir.model.dstu.resource.Binary;
// import ca.uhn.fhir.model.dstu2.resource.Bundle;
// import ca.uhn.fhir.model.api.Bundle;

public class PractitionerResourceProvider extends
        JpaResourceProviderDstu2<Practitioner>
{

    @Override
    public Class<? extends IResource> getResourceType() {
        return Practitioner.class;
    }

    @Search()
    public ca.uhn.fhir.rest.server.IBundleProvider search(
            javax.servlet.http.HttpServletRequest theServletRequest,

            @Description(shortDefinition="The resource identity")
            @OptionalParam(name="_id")
            StringParam theId,

            @Description(shortDefinition="The resource language")
            @OptionalParam(name="_language")
            StringParam theResourceLanguage,

            @Description(shortDefinition="A practitioner's Identifier")
            @OptionalParam(name="identifier")
            TokenAndListParam theIdentifier,

            @Description(shortDefinition="A portion of either family or given name")
            @OptionalParam(name="name")
            StringAndListParam theName,

            @Description(shortDefinition="A portion of the family name")
            @OptionalParam(name="family")
            StringAndListParam theFamily,

            @Description(shortDefinition="A portion of the given name")
            @OptionalParam(name="given")
            StringAndListParam theGiven,

            @Description(shortDefinition="A portion of either family or given name using some kind of phonetic matching algorithm")
            @OptionalParam(name="phonetic")
            StringAndListParam thePhonetic,

            @Description(shortDefinition="The value in any kind of contact")
            @OptionalParam(name="telecom")
            TokenAndListParam theTelecom,

            @Description(shortDefinition="An address in any kind of address/part")
            @OptionalParam(name="address")
            StringAndListParam theAddress,

            @Description(shortDefinition="Gender of the practitioner")
            @OptionalParam(name="gender")
            TokenAndListParam theGender,

            @Description(shortDefinition="The identity of the organization the practitioner represents / acts on behalf of")
            @OptionalParam(name="organization", targetTypes={  Organization.class   } )
            ReferenceAndListParam theOrganization,

            @Description(shortDefinition="One of the languages that the practitioner can communicate with")
            @OptionalParam(name="communication")
            TokenAndListParam theCommunication,

            @Description(shortDefinition="One of the locations at which this practitioner provides care")
            @OptionalParam(name="location", targetTypes={  Location.class   } )
            ReferenceAndListParam theLocation,

            @Description(shortDefinition="The practitioner has this specailty at an organization")
            @OptionalParam(name="specialty")
            TokenAndListParam theSpecialty,

            @Description(shortDefinition="The practitioner can perform this role at for the organization")
            @OptionalParam(name="role")
            TokenAndListParam theRole,

            @IncludeParam(reverse=true)
            Set<Include> theRevIncludes,
            @Description(shortDefinition="Only return resources which were last updated as specified by the given range")
            @OptionalParam(name="_lastUpdated")
            DateRangeParam theLastUpdated,

            @IncludeParam(allow= {
                    "Practitioner:location" , 					"Practitioner:organization" , 						"Practitioner:location" , 					"Practitioner:organization" 					, "*"
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
            paramMap.add("_language", theResourceLanguage);
            paramMap.add("identifier", theIdentifier);
            paramMap.add("name", theName);
            paramMap.add("family", theFamily);
            paramMap.add("given", theGiven);
            paramMap.add("phonetic", thePhonetic);
            paramMap.add("telecom", theTelecom);
            paramMap.add("address", theAddress);
            paramMap.add("gender", theGender);
            paramMap.add("organization", theOrganization);
            paramMap.add("communication", theCommunication);
            paramMap.add("location", theLocation);
            paramMap.add("specialty", theSpecialty);
            paramMap.add("role", theRole);
            paramMap.setRevIncludes(theRevIncludes);
            paramMap.setLastUpdated(theLastUpdated);
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
