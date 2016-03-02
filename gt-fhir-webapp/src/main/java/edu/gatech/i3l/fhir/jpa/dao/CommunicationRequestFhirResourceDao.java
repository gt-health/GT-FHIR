package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.CommunicationRequest;
import edu.gatech.i3l.fhir.dstu2.entities.MessageRequest;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 02/03/16
 */
public class CommunicationRequestFhirResourceDao  extends BaseFhirResourceDao<CommunicationRequest>{
    public CommunicationRequestFhirResourceDao() {
        setResourceEntity(MessageRequest.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder(){};
    }
}
