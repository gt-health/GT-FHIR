package edu.gatech.i3l.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import edu.gatech.i3l.fhir.dstu3.entities.MedicationOrderView;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

@Transactional(propagation = Propagation.REQUIRED)
public class MedicationOrderFhirResourceDao extends BaseFhirResourceDao<MedicationOrder>{
	

	public MedicationOrderFhirResourceDao() {
		super();
		setResourceEntity(MedicationOrderView.class);
		setValidateBean(true);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}
