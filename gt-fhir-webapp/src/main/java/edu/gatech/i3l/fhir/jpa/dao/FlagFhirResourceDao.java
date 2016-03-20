package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.Flag;
import edu.gatech.i3l.fhir.dstu2.entities.FHIRFlag;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 02/03/16.
 */
public class FlagFhirResourceDao extends BaseFhirResourceDao<Flag>{
    public FlagFhirResourceDao() {
        setResourceEntity(FHIRFlag.class);
        setValidateBean(true);
    }
    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder() {};
    }
}
