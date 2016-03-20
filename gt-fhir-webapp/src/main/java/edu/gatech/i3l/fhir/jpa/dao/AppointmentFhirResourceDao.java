package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.Appointment;
import edu.gatech.i3l.fhir.dstu2.entities.FHIRAppointment;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Mark Benjamin 01/03/16.
 */
public class AppointmentFhirResourceDao extends BaseFhirResourceDao<Appointment>{

    public AppointmentFhirResourceDao() {
        setResourceEntity(FHIRAppointment.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder() {
        };
    }
}
