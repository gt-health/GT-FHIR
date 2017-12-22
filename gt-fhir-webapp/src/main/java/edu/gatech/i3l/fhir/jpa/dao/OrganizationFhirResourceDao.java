package edu.gatech.i3l.fhir.jpa.dao;

import org.hl7.fhir.dstu3.model.Organization;
import edu.gatech.i3l.fhir.dstu3.entities.CareSite;
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
