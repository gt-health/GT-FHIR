package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.ReferralRequest;
import edu.gatech.i3l.fhir.dstu2.entities.ReferenceRequest;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 02/03/16
 */
public class ReferralRequestFhirResourceDao  extends BaseFhirResourceDao<ReferralRequest>{
    public ReferralRequestFhirResourceDao() {
        setResourceEntity(ReferenceRequest.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder(){};
    }
}
