package ca.uhn.fhir.jpa.query;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;

import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.dstu.valueset.QuantityCompararatorEnum;

public interface PredicateBuilder {

	public Predicate translatePredicateString(Class<? extends IResourceEntity> myResourceEntity, String theParamName, String likeExpression,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder);

	public Predicate translatePredicateDateLessThan(Class<? extends IResourceEntity> myResourceEntity, String theParamName, Date upperBound,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder, boolean inclusive);

	public Predicate translatePredicateDateGreaterThan(Class<? extends IResourceEntity> myResourceEntity, String theParamName, Date lowerBound,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder, boolean inclusive);

	public Predicate translatePredicateTokenSystem(Class<? extends IResourceEntity> myResourceEntity, String theParamName, String system,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder);

	public Predicate translatePredicateTokenCode(Class<? extends IResourceEntity> myResourceEntity, String theParamName, String code,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder);

	public Predicate translatePredicateQuantityValue(Class<? extends IResourceEntity> myResourceEntity, String theParamName, CriteriaBuilder builder,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, QuantityCompararatorEnum cmpValue, BigDecimal valueValue,
			boolean approx);

	public Predicate translatePredicateQuantityCode(Class<? extends IResourceEntity> myResourceEntity, String theParamName, CriteriaBuilder builder,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, String unitsValue);

	public Predicate translatePredicateQuantitySystem(Class<? extends IResourceEntity> myResourceEntity, String theParamName, CriteriaBuilder builder,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, String systemValue);

	public Path<? extends Object> getPath(Class<? extends IResourceEntity> entity, String theParamName, Path<? extends IResourceEntity> from);
	
	public Predicate addCommonPredicate( CriteriaBuilder builder, From<? extends IResourceEntity, ? extends IResourceEntity> from);

}
