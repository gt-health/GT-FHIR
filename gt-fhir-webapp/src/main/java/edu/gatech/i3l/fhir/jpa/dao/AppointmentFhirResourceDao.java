package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.Appointment;
import edu.gatech.i3l.fhir.dstu2.entities.Engagement;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

/**
 * Created by mark on 01/03/16.
 */
public class AppointmentFhirResourceDao extends BaseFhirResourceDao<Appointment>{

    public AppointmentFhirResourceDao() {
        setResourceEntity(Engagement.class);
        setValidateBean(true);
    }

    @Override
    public PredicateBuilder getPredicateBuilder() {
        return new AbstractPredicateBuilder() {
        };
    }
}
