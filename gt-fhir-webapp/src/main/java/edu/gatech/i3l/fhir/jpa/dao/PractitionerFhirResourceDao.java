package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import edu.gatech.i3l.fhir.dstu2.entities.Provider;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

public class PractitionerFhirResourceDao extends BaseFhirResourceDao<Practitioner>{
    public PractitionerFhirResourceDao() {
        setResourceEntity(Provider.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder(){};
    }
}
