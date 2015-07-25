package edu.gatech.i3l.fhir.jpa.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.dstu2.resource.MedicationPrescription;
import edu.gatech.i3l.fhir.dstu2.entities.DrugExposurePrescriptionWrittenComplement;

@Transactional(propagation = Propagation.REQUIRED)
public class MedicationPrescriptionFhirResourceDao extends BaseFhirResourceDao<MedicationPrescription>{
	

	private static final String CONCEPT_NAME = "Prescription written";

	public MedicationPrescriptionFhirResourceDao() {
		super();
		setResourceEntity(DrugExposurePrescriptionWrittenComplement.class);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {

			@Override
			public Predicate addCommonPredicate(CriteriaBuilder builder, From<? extends IResourceEntity, ? extends IResourceEntity> from) {
				return builder.equal(from.get("drugExposureType").get("name").as(String.class), CONCEPT_NAME);
			}
		};
	}

}
