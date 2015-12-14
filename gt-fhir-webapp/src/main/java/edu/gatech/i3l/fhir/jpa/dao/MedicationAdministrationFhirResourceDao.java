package edu.gatech.i3l.fhir.jpa.dao;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.model.dstu2.resource.MedicationAdministration;
import edu.gatech.i3l.fhir.dstu2.entities.DrugExposureAdministration;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

@Transactional(propagation = Propagation.REQUIRED)
public class MedicationAdministrationFhirResourceDao extends BaseFhirResourceDao<MedicationAdministration> {

	public MedicationAdministrationFhirResourceDao() {
		super();
		setResourceEntity(DrugExposureAdministration.class);
		setValidateBean(true);
	}
	
	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {};
	}

}
