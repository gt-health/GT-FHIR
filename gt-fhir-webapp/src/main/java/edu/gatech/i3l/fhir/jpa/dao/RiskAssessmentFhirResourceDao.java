package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.RiskAssessment;
import edu.gatech.i3l.fhir.dstu2.entities.FHIRRiskAssessment;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 02/03/16
 */
public class RiskAssessmentFhirResourceDao  extends BaseFhirResourceDao<RiskAssessment>{
    public RiskAssessmentFhirResourceDao() {
        setResourceEntity(FHIRRiskAssessment.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder(){};
    }
}
