package edu.gatech.i3l.fhir.jpa.dao;

import org.hl7.fhir.dstu3.model.Location;
import edu.gatech.i3l.fhir.dstu3.entities.CareSite;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

public class LocationFhirResourceDao extends BaseFhirResourceDao<Location>{

	public LocationFhirResourceDao() {
		super();
		setResourceEntity(CareSite.class);
		setValidateBean(true);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder(){};
	}
}
