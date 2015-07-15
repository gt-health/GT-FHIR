package edu.gatech.i3l.hl7.fhir.jpa.dao;

import ca.uhn.fhir.jpa.dao.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.model.dstu2.resource.Location;

public class LocationFhirResourceDao extends BaseFhirResourceDao<Location>{

	
	public LocationFhirResourceDao() {
		setResourceEntity(edu.gatech.i3l.jpa.model.omop.Location.class);
	}

	private PredicateBuilder predicateBuilder = new AbstractPredicateBuilder() {
	};
}
