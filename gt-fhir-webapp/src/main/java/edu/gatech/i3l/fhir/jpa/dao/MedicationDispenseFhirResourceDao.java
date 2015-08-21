package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.model.dstu2.resource.MedicationDispense;
import edu.gatech.i3l.fhir.dstu2.entities.DrugExposurePrescriptionDispensed;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

public class MedicationDispenseFhirResourceDao  extends BaseFhirResourceDao<MedicationDispense>{
	
	public MedicationDispenseFhirResourceDao() {
		super();
		setResourceEntity(DrugExposurePrescriptionDispensed.class);
		setValidateBean(true);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}
