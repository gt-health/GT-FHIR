package edu.gatech.i3l.hl7.fhir.jpa.dao;

import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.dstu2.resource.Observation;

public class ObservationFhirResourceDao extends BaseFhirResourceDao<Observation>{
	
	public ObservationFhirResourceDao() {
		super();
		setResourceEntity(edu.gatech.i3l.jpa.model.omop.Observation.class); //TODO set this automatically; this is error prone since we need to remember to set this on each dao class
		setPredicateBuilder(this.predicateBuilder);
	}
	
	private PredicateBuilder predicateBuilder = new PredicateBuilder() {
		
		/**
		 * 	If the system is "", we only match on null systems
		 */
		@Override
		public Predicate translatePredicateTokenSystem(String theParamName, String system, Root<? extends IResourceEntity> from,
				CriteriaBuilder theBuilder) {
			if (system == null) {
				return null;
			}
			Path<Object> path = null;
			switch (theParamName) {
			case Observation.SP_CODE:
				path = from.get("vocabulary").get("systemUri");
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
		public Predicate translatePredicateTokenCode(String theParamName, String code, Root<? extends IResourceEntity> from,
				CriteriaBuilder theBuilder) {
			Path<Object> path = null;
			switch (theParamName) {
			case Observation.SP_CODE:
				path = from.get("vocabulary").get("observationConcept").get("conceptCode");
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

		@Override
		public Predicate translatePredicateString(String theParamName, String likeExpression, Root<? extends IResourceEntity> from,
				CriteriaBuilder theBuilder) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Predicate translatePredicateDateLessThan(String theParamName, Date upperBound, Root<? extends IResourceEntity> from,
				CriteriaBuilder theBuilder, boolean inclusive) {
			// TODO Auto-generated method stub
			return null;
		}

		@Override
		public Predicate translatePredicateDateGreaterThan(String theParamName, Date lowerBound, Root<? extends IResourceEntity> from,
				CriteriaBuilder theBuilder, boolean inclusive) {
			// TODO Auto-generated method stub
			return null;
		}
	};


}
