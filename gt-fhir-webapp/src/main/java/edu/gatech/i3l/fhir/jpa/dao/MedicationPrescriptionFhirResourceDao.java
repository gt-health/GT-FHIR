package edu.gatech.i3l.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.query.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.query.PredicateBuilder;
import ca.uhn.fhir.model.dstu2.resource.MedicationPrescription;
import edu.gatech.i3l.fhir.dstu2.entities.DrugExposurePrescriptionWritten;

@Transactional(propagation = Propagation.REQUIRED)
public class MedicationPrescriptionFhirResourceDao extends BaseFhirResourceDao<MedicationPrescription>{
	

	public MedicationPrescriptionFhirResourceDao() {
		super();
		setResourceEntity(DrugExposurePrescriptionWritten.class);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}
