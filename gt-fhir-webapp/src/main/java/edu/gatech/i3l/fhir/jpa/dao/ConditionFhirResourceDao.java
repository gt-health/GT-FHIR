package edu.gatech.i3l.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.query.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.query.PredicateBuilder;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import edu.gatech.i3l.fhir.dstu2.entities.ConditionOccurrenceComplement;

@Transactional(propagation = Propagation.REQUIRED)
public class ConditionFhirResourceDao extends BaseFhirResourceDao<Condition> {


	public ConditionFhirResourceDao() {
		super();
		setResourceEntity(ConditionOccurrenceComplement.class);
		setValidateBean(true);
	}
	
	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}
