package edu.gatech.i3l.fhir.jpa.dao;

import ca.uhn.fhir.jpa.dao.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import edu.gatech.i3l.fhir.dstu2.entities.MedicationConcept;

public class MedicationFhirResourceDao extends BaseFhirResourceDao<Medication> {
	

	public MedicationFhirResourceDao() {
		super();
		setResourceEntity(MedicationConcept.class);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}
