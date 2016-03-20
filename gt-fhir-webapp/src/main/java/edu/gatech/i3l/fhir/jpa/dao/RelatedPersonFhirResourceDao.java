package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.RelatedPerson;
import edu.gatech.i3l.fhir.dstu2.entities.FHIRRelatedPerson;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 02/03/16.
 */
public class RelatedPersonFhirResourceDao extends BaseFhirResourceDao<RelatedPerson>{

    public RelatedPersonFhirResourceDao() {
        setResourceEntity(FHIRRelatedPerson.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder() {};
    }
}
