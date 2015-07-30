package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.jpa.dao.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.model.dstu2.resource.MedicationDispense;
import edu.gatech.i3l.fhir.dstu2.entities.DrugExposurePrescriptionDispensed;

public class MedicationDispenseFhirResourceDao  extends BaseFhirResourceDao<MedicationDispense>{
	
	public MedicationDispenseFhirResourceDao() {
		super();
		setResourceEntity(DrugExposurePrescriptionDispensed.class);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}
