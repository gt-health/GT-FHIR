package edu.gatech.i3l.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.model.dstu2.resource.RiskAssessment;
import edu.gatech.i3l.fhir.dstu2.entities.RiskAssessmentPrediction;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

@Transactional(propagation = Propagation.REQUIRED)
public class RiskAssessmentFhirResourceDao extends BaseFhirResourceDao<RiskAssessment>{
	
	public RiskAssessmentFhirResourceDao() {
		super();
		//setResourceEntity(edu.gatech.i3l.fhir.dstu2.entities.RiskAssessment.class);
		setResourceEntity(RiskAssessmentPrediction.class);
		setValidateBean(true);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}