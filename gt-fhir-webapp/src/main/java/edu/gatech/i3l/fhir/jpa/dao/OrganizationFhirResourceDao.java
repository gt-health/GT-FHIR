package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.Organization;
import edu.gatech.i3l.fhir.dstu2.entities.CareSite;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

public class OrganizationFhirResourceDao extends BaseFhirResourceDao<Organization> {

	public OrganizationFhirResourceDao() {
		super();
		setResourceEntity(CareSite.class);
		setValidateBean(true);
	}
	
	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {			
		};
	}

}
