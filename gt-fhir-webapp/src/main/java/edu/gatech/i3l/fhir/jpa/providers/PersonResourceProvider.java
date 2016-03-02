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

public class PersonResourceProvider extends
        JpaResourceProviderDstu2<Person>
{

    @Override
    public Class<Person> getResourceType() {
        return Person.class;
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


            @Description(shortDefinition="A person Identifier")
            @OptionalParam(name="identifier")
            TokenAndListParam theIdentifier,

            @Description(shortDefinition="A portion of name in any name part")
            @OptionalParam(name="name")
            StringAndListParam theName,

            @Description(shortDefinition="A portion of name using some kind of phonetic matching algorithm")
            @OptionalParam(name="phonetic")
            StringAndListParam thePhonetic,

            @Description(shortDefinition="The value in any kind of contact")
            @OptionalParam(name="telecom")
            TokenAndListParam theTelecom,

            @Description(shortDefinition="A value in a phone contact")
            @OptionalParam(name="phone")
            TokenAndListParam thePhone,

            @Description(shortDefinition="A value in an email contact")
            @OptionalParam(name="email")
            TokenAndListParam theEmail,

            @Description(shortDefinition="An address in any kind of address/part")
            @OptionalParam(name="address")
            StringAndListParam theAddress,

            @Description(shortDefinition="A city specified in an address")
            @OptionalParam(name="address-city")
            StringAndListParam theAddress_city,

            @Description(shortDefinition="A state specified in an address")
            @OptionalParam(name="address-state")
            StringAndListParam theAddress_state,

            @Description(shortDefinition="A postal code specified in an address")
            @OptionalParam(name="address-postalcode")
            StringAndListParam theAddress_postalcode,

            @Description(shortDefinition="A country specified in an address")
            @OptionalParam(name="address-country")
            StringAndListParam theAddress_country,

            @Description(shortDefinition="A use code specified in an address")
            @OptionalParam(name="address-use")
            TokenAndListParam theAddress_use,

            @Description(shortDefinition="The gender of the person")
            @OptionalParam(name="gender")
            TokenAndListParam theGender,

            @Description(shortDefinition="The person's date of birth")
            @OptionalParam(name="birthdate")
            DateRangeParam theBirthdate,

            @Description(shortDefinition="The organization at which this person record is being managed")
            @OptionalParam(name="organization", targetTypes={  Organization.class   } )
            ReferenceAndListParam theOrganization,

            @Description(shortDefinition="Any link has this Patient, Person, RelatedPerson or Practitioner reference")
            @OptionalParam(name="link", targetTypes={  Patient.class ,   Practitioner.class ,   RelatedPerson.class ,   Person.class   } )
            ReferenceAndListParam theLink,

            @Description(shortDefinition="The Person links to this Patient")
            @OptionalParam(name="patient", targetTypes={  Patient.class ,   Practitioner.class ,   RelatedPerson.class ,   Person.class   } )
            ReferenceAndListParam thePatient,

            @Description(shortDefinition="The Person links to this Practitioner")
            @OptionalParam(name="practitioner", targetTypes={  Patient.class ,   Practitioner.class ,   RelatedPerson.class ,   Person.class   } )
            ReferenceAndListParam thePractitioner,

            @Description(shortDefinition="The Person links to this RelatedPerson")
            @OptionalParam(name="relatedperson", targetTypes={  Patient.class ,   Practitioner.class ,   RelatedPerson.class ,   Person.class   } )
            ReferenceAndListParam theRelatedperson,

            @IncludeParam(reverse=true)
            Set<Include> theRevIncludes,
            @Description(shortDefinition="Only return resources which were last updated as specified by the given range")
            @OptionalParam(name="_lastUpdated")
            DateRangeParam theLastUpdated,

            @IncludeParam(allow= {
                    "Person:link" , 					"Person:organization" , 					"Person:patient" , 					"Person:practitioner" , 					"Person:relatedperson" , 						"Person:link" , 					"Person:organization" , 					"Person:patient" , 					"Person:practitioner" , 					"Person:relatedperson" , 						"Person:link" , 					"Person:organization" , 					"Person:patient" , 					"Person:practitioner" , 					"Person:relatedperson" , 						"Person:link" , 					"Person:organization" , 					"Person:patient" , 					"Person:practitioner" , 					"Person:relatedperson" , 						"Person:link" , 					"Person:organization" , 					"Person:patient" , 					"Person:practitioner" , 					"Person:relatedperson" 					, "*"
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
            paramMap.add("identifier", theIdentifier);
            paramMap.add("name", theName);
            paramMap.add("phonetic", thePhonetic);
            paramMap.add("telecom", theTelecom);
            paramMap.add("phone", thePhone);
            paramMap.add("email", theEmail);
            paramMap.add("address", theAddress);
            paramMap.add("address-city", theAddress_city);
            paramMap.add("address-state", theAddress_state);
            paramMap.add("address-postalcode", theAddress_postalcode);
            paramMap.add("address-country", theAddress_country);
            paramMap.add("address-use", theAddress_use);
            paramMap.add("gender", theGender);
            paramMap.add("birthdate", theBirthdate);
            paramMap.add("organization", theOrganization);
            paramMap.add("link", theLink);
            paramMap.add("patient", thePatient);
            paramMap.add("practitioner", thePractitioner);
            paramMap.add("relatedperson", theRelatedperson);
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
