package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.RelatedPerson;
import edu.gatech.i3l.fhir.dstu2.entities.RelatedIndividual;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Created by mark on 02/03/16.
 */
public class RelatedPersonFhirResourceDao extends BaseFhirResourceDao<RelatedPerson>{

    public RelatedPersonFhirResourceDao() {
        setResourceEntity(RelatedIndividual.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder() {};
    }
}
