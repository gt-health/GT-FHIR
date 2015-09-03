package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.RiskAssessment;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

public class RiskAssessmentFhirResourceDao extends BaseFhirResourceDao<RiskAssessment>{
	
	public RiskAssessmentFhirResourceDao() {
		super();
		setResourceEntity(edu.gatech.i3l.fhir.dstu2.entities.RiskAssessment.class);
		setValidateBean(true);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}