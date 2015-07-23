package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.model.dstu2.resource.Location;

public class LocationFhirResourceDao extends BaseFhirResourceDao<Location>{

	
	public LocationFhirResourceDao() {
		setResourceEntity(edu.gatech.i3l.fhir.dstu2.entities.Location.class);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return null;
	}
}
