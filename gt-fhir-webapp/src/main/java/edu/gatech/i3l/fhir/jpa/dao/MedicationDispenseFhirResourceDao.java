package edu.gatech.i3l.fhir.jpa.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

import ca.uhn.fhir.jpa.dao.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.dstu2.resource.MedicationDispense;
import edu.gatech.i3l.fhir.dstu2.entities.DrugExposurePrescriptionDispensed;

public class MedicationDispenseFhirResourceDao  extends BaseFhirResourceDao<MedicationDispense>{
	
	private static final String CONCEPT_NAME_1 = "Prescription dispensed in pharmacy";
	private static final String CONCEPT_NAME_2 = "Prescription dispensed through mail order";
	
	public MedicationDispenseFhirResourceDao() {
		super();
		setResourceEntity(DrugExposurePrescriptionDispensed.class);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {

			@Override
			public Predicate addCommonPredicate(CriteriaBuilder builder, From<? extends IResourceEntity, ? extends IResourceEntity> from) {
				Predicate p1 = builder.equal(from.get("drugExposureType").get("name").as(String.class), CONCEPT_NAME_1);
				Predicate p2 = builder.equal(from.get("drugExposureType").get("name").as(String.class), CONCEPT_NAME_2);
				return builder.or(p1, p2);
			}
		};
	}

}
