package edu.gatech.i3l.hl7.fhir.jpa.dao;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import org.apache.commons.lang3.StringUtils;

import ca.uhn.fhir.jpa.dao.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.dstu2.resource.Observation;

public class ObservationFhirResourceDao extends BaseFhirResourceDao<Observation>{
	
	public ObservationFhirResourceDao() {
		super();
		setResourceEntity(edu.gatech.i3l.jpa.model.omop.Observation.class); //TODO set this automatically; this is error prone since we need to remember to set this on each dao class
	}
	
	@Override
	public PredicateBuilder getPredicateBuilder() {
		return  new AbstractPredicateBuilder() {
			
			/**
			 * 	If the system is "", we only match on null systems
			 */
			@Override
			public Predicate translatePredicateTokenSystem(Class<? extends IResourceEntity> entity, String theParamName, String system, From<? extends IResourceEntity, ? extends IResourceEntity> from,
					CriteriaBuilder theBuilder) {
				if (system == null) {
					return null;
				}
				Path<Object> path = null;
				switch (theParamName) {
				case Observation.SP_CODE:
					path = from.get("observationConcept").get("vocabulary").get("systemUri");
					break;
				default:
					break;
				}
				if (StringUtils.isNotBlank(system)) {
					 return theBuilder.equal(path, system);
				} else {
					return theBuilder.isNull(path);
				}
			}
			
			@Override
			public Predicate translatePredicateTokenCode(Class<? extends IResourceEntity> entity, String theParamName, String code, From<? extends IResourceEntity, ? extends IResourceEntity> from,
					CriteriaBuilder theBuilder) {
				Path<Object> path = null;
				switch (theParamName) {
				case Observation.SP_CODE:
					path = from.get("observationConcept").get("conceptCode");
					break;
				default:
					break;
				}
				if (StringUtils.isNotBlank(code)) {
					return theBuilder.equal(path, code);
				} else {
					return theBuilder.isNull(path);
				}
			}

		};
	}


}
