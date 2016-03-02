package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.Immunization;
import edu.gatech.i3l.fhir.dstu2.entities.Inoculation;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Created by mark on 01/03/16.
 */
public class ImmunizationFhirResourceDao extends BaseFhirResourceDao<Immunization>{

    public ImmunizationFhirResourceDao() {
        setResourceEntity(Inoculation.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder() {};
    }
}
