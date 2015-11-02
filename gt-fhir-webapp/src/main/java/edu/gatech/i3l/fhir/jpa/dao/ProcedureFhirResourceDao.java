package edu.gatech.i3l.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.model.dstu2.resource.Procedure;
import edu.gatech.i3l.fhir.dstu2.entities.ProcedureOccurrence;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

@Transactional(propagation = Propagation.REQUIRED)
public class ProcedureFhirResourceDao extends BaseFhirResourceDao<Procedure> {


	public ProcedureFhirResourceDao() {
		super();
		setResourceEntity(ProcedureOccurrence.class);
		setValidateBean(true);
	}
	
	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}
