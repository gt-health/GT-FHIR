package ca.uhn.fhir.jpa.query;

import java.math.BigDecimal;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.model.dstu.valueset.QuantityCompararatorEnum;
import ca.uhn.fhir.rest.param.DateRangeParam;

public interface PredicateBuilder {

	Predicate translatePredicateString(Class<? extends IResourceEntity> theResourceEntity, String theParamName, String likeExpression,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder);

	Predicate translatePredicateDate(Class<? extends IResourceEntity> theResourceEntity, CriteriaBuilder theBuilder, From<? extends IResourceEntity, ? extends IResourceEntity> from, DateRangeParam theRange, String theParamName, IQueryParameterType theParam);

	Predicate translatePredicateTokenSystem(Class<? extends IResourceEntity> theResourceEntity, String theParamName, String system,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder);

	Predicate translatePredicateTokenCode(Class<? extends IResourceEntity> theResourceEntity, String theParamName, String code,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder);

	Predicate translatePredicateQuantityValue(Class<? extends IResourceEntity> theResourceEntity, String theParamName, CriteriaBuilder builder,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, QuantityCompararatorEnum cmpValue, BigDecimal valueValue,
			boolean approx);

	Predicate translatePredicateQuantityCode(Class<? extends IResourceEntity> theResourceEntity, String theParamName, CriteriaBuilder builder,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, String unitsValue);

	Predicate translatePredicateQuantitySystem(Class<? extends IResourceEntity> theResourceEntity, String theParamName, CriteriaBuilder builder,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, String systemValue);

	Path<? extends Object> getPath(Class<? extends IResourceEntity> entity, String theParamName, Path<? extends IResourceEntity> from);
	
	Predicate addCommonPredicate( CriteriaBuilder builder, From<? extends IResourceEntity, ? extends IResourceEntity> from);

}
