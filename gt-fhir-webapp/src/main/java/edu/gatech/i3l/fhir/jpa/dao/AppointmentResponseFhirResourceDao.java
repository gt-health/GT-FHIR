package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.AppointmentResponse;
import edu.gatech.i3l.fhir.dstu2.entities.FHIRAppointmentResponse;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 02/03/16
 */
public class AppointmentResponseFhirResourceDao  extends BaseFhirResourceDao<AppointmentResponse>{

    public AppointmentResponseFhirResourceDao() {
        setResourceEntity(FHIRAppointmentResponse.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder() {
        };
    }
}
