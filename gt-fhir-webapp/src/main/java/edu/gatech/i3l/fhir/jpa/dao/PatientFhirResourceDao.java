package edu.gatech.i3l.fhir.jpa.dao;

import java.util.Calendar;
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
import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.rest.param.DateRangeParam;
import edu.gatech.i3l.fhir.dstu2.entities.PersonComplement;

@Transactional(propagation = Propagation.REQUIRED)
public class PatientFhirResourceDao extends BaseFhirResourceDao<Patient> {


	public PatientFhirResourceDao() {
		super();
		setResourceEntity(PersonComplement.class);
		setValidateBean(true);
	}

	@Override
	public PredicateBuilder getPredicateBuilder() {
		return new AbstractPredicateBuilder() {

			@Override
			public Predicate translatePredicateString(Class<? extends IResourceEntity> entity, String theParamName, String likeExpression,
					From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder) {
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
				case Patient.SP_GIVEN:
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


			@Override
			public Predicate translatePredicateDate(Class<? extends IResourceEntity> entity, CriteriaBuilder theBuilder, From<? extends IResourceEntity, ? extends IResourceEntity> from, DateRangeParam theRange, String theParamName,
					IQueryParameterType theParam) {
				Date lowerBound = theRange.getLowerBoundAsInstant();
				Date upperBound = theRange.getUpperBoundAsInstant();
				Calendar c = Calendar.getInstance();
				Predicate ub = null;
				Predicate lb = null;
				switch (theParamName) {
				case Patient.SP_DEATHDATE:
					return super.translatePredicateDate(entity, theBuilder, from, theRange, theParamName, theParam);
					
				case Patient.SP_BIRTHDATE:
					if (lowerBound != null) {
						c.setTime(lowerBound);
						Predicate gt1 = theBuilder.greaterThan(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR));
						
						Predicate gt2 = theBuilder.and(theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
								theBuilder.greaterThan(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)));
						
						Predicate predicateDay = null;
						predicateDay = theBuilder.greaterThanOrEqualTo(from.get("dayOfBirth").as(Integer.class), c.get(Calendar.DAY_OF_MONTH));
						Predicate gt3 = theBuilder.and(theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
								theBuilder.equal(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)),
								predicateDay);
						
						lb = theBuilder.or(gt1, gt2, gt3);
					}

					if (upperBound != null) {
						c.setTime(upperBound);
						Predicate lt1 = theBuilder.lessThan(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR));
						
						Predicate lt2 = theBuilder.and(theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
								theBuilder.lessThan(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)));
						
						Predicate predicateDay = null;
						predicateDay = theBuilder.lessThanOrEqualTo(from.get("dayOfBirth").as(Integer.class), c.get(Calendar.DAY_OF_MONTH));
						Predicate lt3 = theBuilder.and(theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
								theBuilder.equal(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)), predicateDay);
						
						ub = theBuilder.or(lt1, lt2, lt3);
					}
					
					break;
				default:
					break;
				}

				if (lb != null && ub != null) {
					return (theBuilder.and(lb, ub));
				} else if (lb != null) {
					return (lb);
				} else {
					return (ub);
				}
			}

		};
	}
	
	
}
