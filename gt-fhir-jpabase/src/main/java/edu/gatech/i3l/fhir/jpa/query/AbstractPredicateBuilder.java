package edu.gatech.i3l.fhir.jpa.query;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;

import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.model.dstu.valueset.QuantityCompararatorEnum;
import ca.uhn.fhir.rest.param.DateRangeParam;
import ca.uhn.fhir.rest.param.ParamPrefixEnum;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

public abstract class AbstractPredicateBuilder implements PredicateBuilder{

	
	@Override
	public Predicate translatePredicateString(Class<? extends IResourceEntity> entity, String theParamName, String likeExpression,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder) {
		return theBuilder.like(getPath(entity, theParamName, from).as(String.class), likeExpression);
	}


	@Override
	public Predicate translatePredicateDate(Class<? extends IResourceEntity> entity, CriteriaBuilder theBuilder, From<? extends IResourceEntity, ? extends IResourceEntity> from, DateRangeParam theRange, String theParamName, IQueryParameterType theParam) {
		Date lowerBound = theRange.getLowerBoundAsInstant();
		Date upperBound = theRange.getUpperBoundAsInstant();
		
		Predicate lb = null;
		Path<? extends Object> path = getPath(entity, theParamName, from);
		if (lowerBound != null) {
			lb = theBuilder.greaterThanOrEqualTo(path.as(Date.class), lowerBound);
		}

		Predicate ub = null;
		if (upperBound != null) {
			ub = theBuilder.lessThanOrEqualTo(path.as(Date.class), upperBound);
		}

		if (lb != null && ub != null) {
			return (theBuilder.and(lb, ub));
		} else if (lb != null) {
			return (lb);
		} else {
			return (ub);
		}
	}
	
	@Override
	public Predicate translatePredicateTokenSystem(Class<? extends IResourceEntity> entity, String theParamName, String system,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder) {
		if (system == null) {
			return null;
		}
		Path<? extends Object> path = getPath( entity, theParamName, from);
		if (StringUtils.isNotBlank(system)) {
			 return theBuilder.equal(path, system);
		} else {
			return theBuilder.isNull(path);
		}
	}

	@Override
	public Predicate translatePredicateTokenCode(Class<? extends IResourceEntity> entity, String theParamName, String code,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, CriteriaBuilder theBuilder) {
		Path<? extends Object> path = getPath(entity, theParamName, from);
		if (StringUtils.isNotBlank(code)) {
			return theBuilder.equal(path, code);
		} else {
			return theBuilder.isNull(path);
		}
	}
	

	@Override
	public Predicate translatePredicateValueNumber(Class<? extends IResourceEntity> myResourceEntity, CriteriaBuilder builder, Root<? extends IResourceEntity> from, String theParamName, ParamPrefixEnum comparator, BigDecimal value) {
		Predicate predicate = null;
		Path<? extends Object> fromObj = getPath(myResourceEntity, theParamName, from);
		if (comparator == null) {
			double mul = value.doubleValue() * 1.01;
			double low = value.doubleValue() - mul;
			double high = value.doubleValue() + mul;
			Predicate lowPred = builder.ge(fromObj.as(Long.class), low);
			Predicate highPred = builder.le(fromObj.as(Long.class), high);
			predicate= builder.and(lowPred, highPred);
		} else {
			switch (comparator) {
			case GREATERTHAN:
				predicate = builder.greaterThan(fromObj.as(BigDecimal.class), value);
			case GREATERTHAN_OR_EQUALS:
				predicate = builder.ge(fromObj.as(BigDecimal.class), value);
				break;
			case LESSTHAN:
				predicate = builder.lessThan(fromObj.as(BigDecimal.class), value);
				break;
			case LESSTHAN_OR_EQUALS:
				predicate= builder.le(fromObj.as(BigDecimal.class), value);
				break;
			}
		}
		
		return predicate;
	}


	@Override
	public Predicate translatePredicateQuantityCode(Class<? extends IResourceEntity> entity, String theParamName, CriteriaBuilder builder,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, String unitsValue) {
		return builder.like(getPath(entity, theParamName, from).as(String.class), unitsValue);
	}

	@Override
	public Predicate translatePredicateQuantitySystem(Class<? extends IResourceEntity> entity, String theParamName, CriteriaBuilder builder,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, String systemValue) {
		return builder.like(getPath(entity, theParamName, from).as(String.class), systemValue);
	}
	
	/*
	 * (non-Javadoc)
	 * @see edu.gatech.i3l.fhir.jpa.query.PredicateBuilder#addCommonPredicate(javax.persistence.criteria.CriteriaBuilder, javax.persistence.criteria.From)
	 */
	@Override
	public Predicate addCommonPredicate(CriteriaBuilder builder, From<? extends IResourceEntity, ? extends IResourceEntity> from) {
//		NO COMMON PARAM TO BE ADDED HERE: This implementation of the method has the only purpose to avoid the obligation of subclasses of this
//		 * class(AbstractPredicateBuilder) to implement it.
		return null;
	}

	@Override
	public Predicate translatePredicateQuantityValue(Class<? extends IResourceEntity> entity, String theParamName, CriteriaBuilder builder,
			From<? extends IResourceEntity, ? extends IResourceEntity> from, ParamPrefixEnum cmpValue, BigDecimal valueValue,
			boolean approx) {
		Predicate num;
		Path<? extends Object> path = getPath(entity, theParamName, from);
		
		if (cmpValue == null) {
			BigDecimal mul = approx ? new BigDecimal(0.1) : new BigDecimal(0.01);
			BigDecimal low = valueValue.subtract(valueValue.multiply(mul));
			BigDecimal high = valueValue.add(valueValue.multiply(mul));
			Predicate lowPred = builder.gt(path.as(BigDecimal.class) , low);
			Predicate highPred = builder.lt(path.as(BigDecimal.class), high);
			num = builder.and(lowPred, highPred);
		} else {
			switch (cmpValue) {
			case GREATERTHAN:
				num = builder.gt(path.as(Number.class), valueValue);
				break;
			case GREATERTHAN_OR_EQUALS:
				num = builder.ge(path.as(Number.class), valueValue);
				break;
			case LESSTHAN:
				num = builder.lt(path.as(Number.class), valueValue);
				break;
			case LESSTHAN_OR_EQUALS:
				num = builder.le(path.as(Number.class), valueValue);
				break;
			default:
				throw new IllegalStateException(cmpValue.getValue());
			}
		}
		return num;
	}

	@Override
	public Path<? extends Object> getPath(Class<? extends IResourceEntity> entity, String theParamName, Path<? extends IResourceEntity> from) {
		Path<? extends Object> path = null;
		try {
			String translatedParams = entity.newInstance().translateSearchParam(theParamName);
			String[] chain = translatedParams.contains(".") ? translatedParams.split("\\.") : new String[]{translatedParams}; 
			path = from.get(chain[0]);
			if(chain != null){
				for (int i = 1; i < chain.length; i++) {
					path = path.get(chain[i]);
				}
			}
		} catch (InstantiationException e){
		} catch(IllegalAccessException e) {
		}
		return path;
	}

	
}
