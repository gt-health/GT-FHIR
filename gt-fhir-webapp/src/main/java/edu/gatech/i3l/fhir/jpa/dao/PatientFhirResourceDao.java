package edu.gatech.i3l.fhir.jpa.dao;

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
import ca.uhn.fhir.model.dstu2.resource.Patient;
import edu.gatech.i3l.jpa.model.omop.ext.PatientFhirExtTable;

@Transactional(propagation = Propagation.REQUIRED)
public class PatientFhirResourceDao extends BaseFhirResourceDao<Patient>{

	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(PatientFhirResourceDao.class);

	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;

//	private String myResourceName;
//	private Class<Patient> myResourceType;

	public PatientFhirResourceDao() {
		setResourceEntity(PatientFhirExtTable.class);
	}
	
	
	@Override
	public Predicate translatePredicateDateLessThan(String theParamName,
			Date upperBound, Root<? extends IResourceEntity> from,
			CriteriaBuilder theBuilder) {
		Calendar c = Calendar.getInstance();
		c.setTime(upperBound);
		Predicate ub = null;
		switch (theParamName) {
		case Patient.SP_DEATHDATE:
			ub = theBuilder.lessThanOrEqualTo(from.get("death_date").as(Date.class), upperBound);
			break;
		case Patient.SP_BIRTHDATE:
			Predicate lt1 = theBuilder.lessThan(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR));
			Predicate lt2 = theBuilder.and( theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
					theBuilder.lessThan(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)));
			Predicate lt3 = theBuilder.and( theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
					theBuilder.equal(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)),
					theBuilder.lessThanOrEqualTo(from.get("dayOfBirth").as(Integer.class), c.get(Calendar.DAY_OF_MONTH)));
			ub = theBuilder.or(lt1, lt2, lt3);
			
			break;	
		default:
			break;
		}
		return ub;
	}

	@Override
	public Predicate translatePredicateDateGreaterThan(String theParamName,
			Date lowerBound, Root<? extends IResourceEntity> from,
			CriteriaBuilder theBuilder) {
		Calendar c = Calendar.getInstance();
		c.setTime(lowerBound);
		Predicate lb = null;
		switch (theParamName) {
		case Patient.SP_DEATHDATE:
			lb = theBuilder.greaterThanOrEqualTo(from.get("death_date").as(Date.class), lowerBound);
			break;
		case Patient.SP_BIRTHDATE:
			Predicate gt1 = theBuilder.greaterThan(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR));
			Predicate gt2 = theBuilder.and( theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
											theBuilder.greaterThan(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)));
			Predicate gt3 = theBuilder.and( theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
											theBuilder.equal(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)),
											theBuilder.greaterThanOrEqualTo(from.get("dayOfBirth").as(Integer.class), c.get(Calendar.DAY_OF_MONTH)));
			lb = theBuilder.or(gt1, gt2, gt3);
			break;	
		default:
			break;
		}
		return lb;
	}

	@Override
	public Predicate translatePredicateString(String theParamName,
			String likeExpression, Root<? extends IResourceEntity> from,
			CriteriaBuilder theBuilder) {
		Predicate singleCode = null;
		switch (theParamName) {
		case Patient.SP_ADDRESS:
			Predicate lc1 = theBuilder.like(from.get("location").get("address1").as(String.class), likeExpression);
			Predicate lc2 = theBuilder.like(from.get("location").get("address2").as(String.class), likeExpression);
			Predicate lc3 = theBuilder.like(from.get("location").get("city").as(String.class), likeExpression);
			Predicate lc4 = theBuilder.like(from.get("location").get("state").as(String.class), likeExpression);
			Predicate lc5 = theBuilder.like(from.get("location").get("zipCode").as(String.class), likeExpression);
			Predicate lc6 = theBuilder.like(from.get("location").get("country").as(String.class), likeExpression);
			singleCode = theBuilder.or(lc1, lc2, lc3, lc4, lc5, lc6);
			break;
		case Patient.SP_GIVEN :
			Predicate gn1 = theBuilder.like(from.get("givenName1").as(String.class), likeExpression);
			Predicate gn2 = theBuilder.like(from.get("givenName2").as(String.class), likeExpression);
			singleCode = theBuilder.or(gn1, gn2);
			break;
		case Patient.SP_FAMILY:
			singleCode = theBuilder.like(from.get("familyName").as(String.class), likeExpression);
			break;
		case Patient.SP_NAME:
			gn1 = theBuilder.like(from.get("givenName1").as(String.class), likeExpression);
			gn2 = theBuilder.like(from.get("givenName2").as(String.class), likeExpression);
			Predicate fn1 = theBuilder.like(from.get("familyName").as(String.class), likeExpression);
			Predicate n1 = theBuilder.like(from.get("prefixName").as(String.class), likeExpression);
			Predicate n2 = theBuilder.like(from.get("suffixName").as(String.class), likeExpression);
			singleCode = theBuilder.or(gn1, gn2, fn1, n1, n2);
			break;
		default:
			break;
		}
		return singleCode;
	}

}
