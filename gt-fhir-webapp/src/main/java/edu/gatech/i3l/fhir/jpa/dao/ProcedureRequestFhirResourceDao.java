package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.ProcedureRequest;
import edu.gatech.i3l.fhir.dstu2.entities.FHIRProcedureRequest;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 02/03/16.
 */
public class ProcedureRequestFhirResourceDao extends BaseFhirResourceDao<ProcedureRequest>{

    public ProcedureRequestFhirResourceDao() {
        setResourceEntity(FHIRProcedureRequest.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder() {};
    }
}
