package edu.gatech.i3l.fhir.jpa.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import org.apache.commons.lang3.StringUtils;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.jpa.query.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.query.PredicateBuilder;
import ca.uhn.fhir.model.dstu2.resource.Observation;

public class ObservationFhirResourceDao extends BaseFhirResourceDao<Observation>{
	
	public ObservationFhirResourceDao() {
		super();
		setResourceEntity(edu.gatech.i3l.fhir.dstu2.entities.Observation.class); //TODO set this automatically; this is error prone since we need to remember to set this on each dao class
	}
	
	@Override
	public PredicateBuilder getPredicateBuilder() {
		return  new AbstractPredicateBuilder() {
			
			private static final String LOINC = "loinc";
			private static final String SNOMED = "snomed";
			private static final String ICD_9 = "icd-9";
			private static final String RXNORM = "rxnorm";
			private static final String UCUM = "ucum";
			private static final String ICD_10 = "icd-10";
			
			@Override
			public Predicate translatePredicateTokenSystem(Class<? extends IResourceEntity> entity, String theParamName, String system, From<? extends IResourceEntity, ? extends IResourceEntity> from,
					CriteriaBuilder theBuilder) {
				Predicate predicate = null;
				if (system == null) {
					return null;
				}
				
				system = getVocabularyName(system);
				
				Path<Object> path = null;
				switch (theParamName) {
				case Observation.SP_CODE:
					path = from.get("observationConcept").get("vocabulary").get("name");
					break;
				default:
					break;
				}
				if (StringUtils.isNotBlank(system)) {
					 predicate = theBuilder.like(path.as(String.class), system+"%");
				}//	else {
//					return theBuilder.isNull(path); //WARNING originally, if the system is empty, then it would be checked for null systems
//				}
				return predicate;
			}
			
			private String getVocabularyName(String system) {
				if(system.contains(SNOMED)){
					return SNOMED;
				} else if (system.contains(LOINC)){
					return LOINC;
				} else if (system.contains(ICD_10)){
					return ICD_10;
				} else if (system.contains(ICD_9)){
					return ICD_9;
				} else if (system.contains(RXNORM)){
					return RXNORM;
				} else if (system.contains(UCUM)){
					return UCUM;
				}
				return "";
			}

			@Override
			public Predicate translatePredicateTokenCode(Class<? extends IResourceEntity> entity, String theParamName, String code, From<? extends IResourceEntity, ? extends IResourceEntity> from,
					CriteriaBuilder theBuilder) {
				Predicate predicate = null;
				Path<Object> path = null;
				switch (theParamName) {
				case Observation.SP_CODE:
					path = from.get("observationConcept").get("conceptCode");
					break;
				default:
					break;
				}
				if (StringUtils.isNotBlank(code)) {
					predicate = theBuilder.equal(path, code);
				} //else {
//					return theBuilder.isNull(path);
//				}
				return predicate;
			}

		};
	}


}
