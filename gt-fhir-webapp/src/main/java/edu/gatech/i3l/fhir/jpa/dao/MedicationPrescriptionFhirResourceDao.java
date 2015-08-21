package edu.gatech.i3l.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.model.dstu2.resource.MedicationPrescription;
import edu.gatech.i3l.fhir.dstu2.entities.DrugExposurePrescriptionWritten;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

@Transactional(propagation = Propagation.REQUIRED)
public class MedicationPrescriptionFhirResourceDao extends BaseFhirResourceDao<MedicationPrescription>{
	

	public MedicationPrescriptionFhirResourceDao() {
		super();
		setResourceEntity(DrugExposurePrescriptionWritten.class);
		setValidateBean(true);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}
