package edu.gatech.i3l.fhir.jpa.query;

import java.math.BigDecimal;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import ca.uhn.fhir.model.api.IQueryParameterType;
//import ca.uhn.fhir.model.dstu2.valueset.QuantityComparatorEnum;
import ca.uhn.fhir.rest.param.DateRangeParam;
import ca.uhn.fhir.rest.param.ParamPrefixEnum;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

public interface PredicateBuilder {

	Predicate translatePredicateString(Class<? extends IResourceEntity> theResourceEntity, String theParamName, String likeExpression,
			From<? extends IResourceEntity, ? extends IResourceEntity> theFrom, CriteriaBuilder theBuilder);

	Predicate translatePredicateDate(Class<? extends IResourceEntity> theResourceEntity, CriteriaBuilder theBuilder, From<? extends IResourceEntity, ? extends IResourceEntity> theFrom, DateRangeParam theRange, String theParamName, IQueryParameterType theParam);

	Predicate translatePredicateTokenSystem(Class<? extends IResourceEntity> theResourceEntity, String theParamName, String system,
			From<? extends IResourceEntity, ? extends IResourceEntity> theFrom, CriteriaBuilder theBuilder);

	Predicate translatePredicateTokenCode(Class<? extends IResourceEntity> theResourceEntity, String theParamName, String code,
			From<? extends IResourceEntity, ? extends IResourceEntity> theFrom, CriteriaBuilder theBuilder);

	Predicate translatePredicateQuantityValue(Class<? extends IResourceEntity> theResourceEntity, String theParamName, CriteriaBuilder theBuilder,
			From<? extends IResourceEntity, ? extends IResourceEntity> theFrom, ParamPrefixEnum cmpValue, BigDecimal valueValue,
			boolean approx);

	Predicate translatePredicateQuantityCode(Class<? extends IResourceEntity> theResourceEntity, String theParamName, CriteriaBuilder theBuilder,
			From<? extends IResourceEntity, ? extends IResourceEntity> theFrom, String unitsValue);

	Predicate translatePredicateQuantitySystem(Class<? extends IResourceEntity> theResourceEntity, String theParamName, CriteriaBuilder theBuilder,
			From<? extends IResourceEntity, ? extends IResourceEntity> theFrom, String systemValue);

	Path<? extends Object> getPath(Class<? extends IResourceEntity> entity, String theParamName, Path<? extends IResourceEntity> theFrom);
	
	Predicate addCommonPredicate( CriteriaBuilder theBuilder, From<? extends IResourceEntity, ? extends IResourceEntity> theFrom);

	Predicate translatePredicateValueNumber(Class<? extends IResourceEntity> myResourceEntity, CriteriaBuilder theBuilder, Root<? extends IResourceEntity> theFrom, String theParamName, ParamPrefixEnum paramPrefixEnum, BigDecimal value);

}
