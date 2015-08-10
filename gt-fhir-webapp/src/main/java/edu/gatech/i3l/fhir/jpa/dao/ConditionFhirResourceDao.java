package edu.gatech.i3l.fhir.jpa.dao;

import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.jpa.query.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.query.PredicateBuilder;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import edu.gatech.i3l.fhir.dstu2.entities.ConditionOccurrenceComplement;

@Transactional(propagation = Propagation.REQUIRED)
public class ConditionFhirResourceDao extends BaseFhirResourceDao<Condition> {


	public ConditionFhirResourceDao() {
		super();
		setResourceEntity(ConditionOccurrenceComplement.class);
	}
	
	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {
			
			@Override
			public Predicate translatePredicateDateGreaterThan(Class<? extends IResourceEntity> entity, String theParamName, Date lowerBound,
					From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder, boolean inclusive) {
				Predicate lb = null;
				switch (theParamName) {
				case Condition.SP_ONSET:
					if (inclusive) {
						lb = theBuilder.greaterThanOrEqualTo(from.get("startDate").as(Date.class), lowerBound);
					} else {
						lb = theBuilder.greaterThan(from.get("startDate").as(Date.class), lowerBound);
					}
					break;
				default:
					break;
				}
				return lb;
			}

			@Override
			public Predicate translatePredicateDateLessThan(Class<? extends IResourceEntity> entity, String theParamName, Date upperBound,
					From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder, boolean inclusive) {
//				System.out.println("search by LessThan: "+upperBound.toString());
				
				Predicate ub = null;
				switch (theParamName) {
				case Condition.SP_ONSET:
					if (inclusive) {
						ub = theBuilder.lessThanOrEqualTo(from.get("startDate").as(Date.class), upperBound);
					} else {
						ub = theBuilder.lessThan(from.get("startDate").as(Date.class), upperBound);
					}
					break;
				default:
					break;
				}
				return ub;
			}

		};
	}

}
