package edu.gatech.i3l.hl7.fhir.jpa.dao;

import java.util.Date;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.AbstractPredicateBuilder;
import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.dao.PredicateBuilder;
import ca.uhn.fhir.jpa.dao.QueryHelper;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import edu.gatech.i3l.jpa.model.omop.ext.ConditionFhirExtTable;

//@Transactional(propagation = Propagation.REQUIRED)
public class ConditionFhirResourceDao extends BaseFhirResourceDao<Condition> {

//	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
//	private EntityManager myEntityManager;

	public ConditionFhirResourceDao() {
		super();
		setResourceEntity(ConditionFhirExtTable.class);
	}
	
	@PostConstruct
	public void  setQueryHelper(){
		setQueryHelper(new QueryHelper(getEntityManager(), getResourceEntity(), getResourceType(), getContext(), getBaseFhirDao()));
		setPredicateBuilder(this.predicateBuilder);	
	}
	
	PredicateBuilder predicateBuilder = new AbstractPredicateBuilder() {
		
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
//			System.out.println("search by LessThan: "+upperBound.toString());
			
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

		@Override
		public Predicate translatePredicateString(Class<? extends IResourceEntity> entity, String theParamName, String likeExpression,
				From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder) {
			// TODO Auto-generated method stub
			return null;
		}
	};

}
