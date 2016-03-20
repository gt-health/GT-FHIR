package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.ImmunizationRecommendation;
import edu.gatech.i3l.fhir.dstu2.entities.FHIRImmunizationRecommendation;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 02/03/16.
 */
public class ImmunizationRecommendationFhirResourceDao extends BaseFhirResourceDao<ImmunizationRecommendation>{

    public ImmunizationRecommendationFhirResourceDao() {
        setResourceEntity(FHIRImmunizationRecommendation.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder() {};
    }
}
