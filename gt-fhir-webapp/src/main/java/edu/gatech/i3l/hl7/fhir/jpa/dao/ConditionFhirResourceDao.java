package edu.gatech.i3l.hl7.fhir.jpa.dao;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.BaseFhirResourceDao;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import edu.gatech.i3l.jpa.model.omop.ext.ConditionFhirExtTable;

@Transactional(propagation = Propagation.REQUIRED)
public class ConditionFhirResourceDao extends BaseFhirResourceDao<Condition> {

	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(ConditionFhirResourceDao.class);

	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;

	public ConditionFhirResourceDao() {
		setResourceEntity(ConditionFhirExtTable.class);
	}

	@Override
	public Predicate translatePredicateDateGreaterThan(String theParamName, Date lowerBound,
			Root<? extends IResourceEntity> from, CriteriaBuilder theBuilder, boolean inclusive) {
		Predicate lb = null;
		switch (theParamName) {
		case Condition.SP_ONSET:
			lb = theBuilder.lessThanOrEqualTo(from.get("startDate").as(Date.class), lowerBound);
			break;
		default:
			break;
		}
		return lb;
	}

	@Override
	public Predicate translatePredicateDateLessThan(String theParamName, Date upperBound,
			Root<? extends IResourceEntity> from, CriteriaBuilder theBuilder, boolean inclusive) {
//		System.out.println("search by LessThan: "+upperBound.toString());
		
		Predicate ub = null;
		switch (theParamName) {
		case Condition.SP_ONSET:
			ub = theBuilder.lessThanOrEqualTo(from.get("startDate").as(Date.class), upperBound);
			break;
		default:
			break;
		}
		return ub;
	}

	@Override
	public Predicate translatePredicateString(String arg0, String arg1,
			Root<? extends IResourceEntity> arg2, CriteriaBuilder arg3) {
		// TODO Auto-generated method stub
		return null;
	}

}
