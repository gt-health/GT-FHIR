package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.Communication;
import edu.gatech.i3l.fhir.dstu2.entities.Message;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 02/03/16
 */
public class CommunicationFhirResourceDao extends BaseFhirResourceDao<Communication>{
    public CommunicationFhirResourceDao() {
        setResourceEntity(Message.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder(){};
    }
}
