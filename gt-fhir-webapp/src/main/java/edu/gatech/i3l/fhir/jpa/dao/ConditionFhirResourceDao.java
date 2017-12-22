package edu.gatech.i3l.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import org.hl7.fhir.dstu3.model.Condition;
import edu.gatech.i3l.fhir.dstu3.entities.ConditionOccurrence;
//import edu.gatech.i3l.fhir.dstu2.entities.ConditionOccurrenceComplement;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

@Transactional(propagation = Propagation.REQUIRED)
public class ConditionFhirResourceDao extends BaseFhirResourceDao<Condition> {


	public ConditionFhirResourceDao() {
		super();
		setResourceEntity(ConditionOccurrence.class);
		setValidateBean(true);
	}
	
	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}
