package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.Person;
import edu.gatech.i3l.fhir.dstu2.entities.FHIRPerson;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 02/03/16
 */
public class PersonFhirResourceDao extends BaseFhirResourceDao<Person>{

    public PersonFhirResourceDao() {
        setResourceEntity(FHIRPerson.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder() {
        };
    }
}
