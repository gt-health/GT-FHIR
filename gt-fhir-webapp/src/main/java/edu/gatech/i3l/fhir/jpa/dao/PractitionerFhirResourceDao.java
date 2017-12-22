package edu.gatech.i3l.fhir.jpa.dao;

import java.util.Calendar;
import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.rest.param.DateRangeParam;
import edu.gatech.i3l.fhir.dstu3.entities.Provider;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;

public class PractitionerFhirResourceDao extends BaseFhirResourceDao<Practitioner> {

	public PractitionerFhirResourceDao() {
		super();
		setResourceEntity(Provider.class);
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
//				case Patient.SP_ADDRESS:
//					Predicate lc1 = theBuilder.like(from.get("location").get("address1").as(String.class), likeExpression);
//					Predicate lc2 = theBuilder.like(from.get("location").get("address2").as(String.class), likeExpression);
//					Predicate lc3 = theBuilder.like(from.get("location").get("city").as(String.class), likeExpression);
//					Predicate lc4 = theBuilder.like(from.get("location").get("state").as(String.class), likeExpression);
//					Predicate lc5 = theBuilder.like(from.get("location").get("zipCode").as(String.class), likeExpression);
//					Predicate lc6 = theBuilder.like(from.get("location").get("country").as(String.class), likeExpression);
//					singleCode = theBuilder.or(lc1, lc2, lc3, lc4, lc5, lc6);
//					break;
				case Patient.SP_NAME:
					singleCode = theBuilder.like(from.get("providerName").as(String.class), likeExpression);
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
				case Patient.SP_BIRTHDATE:
					if (lowerBound != null) {
						c.setTime(lowerBound);
						lb = theBuilder.greaterThan(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR));
					}

					if (upperBound != null) {
						c.setTime(upperBound);
						ub = theBuilder.lessThan(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR));
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
