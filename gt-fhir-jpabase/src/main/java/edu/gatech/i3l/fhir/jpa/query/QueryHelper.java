package edu.gatech.i3l.fhir.jpa.query;

import static org.apache.commons.lang3.StringUtils.isBlank;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.instance.model.api.IIdType;

import ca.uhn.fhir.context.BaseRuntimeChildDefinition;
import ca.uhn.fhir.context.ConfigurationException;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.RuntimeChildResourceDefinition;
import ca.uhn.fhir.context.RuntimeResourceDefinition;
import ca.uhn.fhir.context.RuntimeSearchParam;
import ca.uhn.fhir.model.api.IPrimitiveDatatype;
import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.base.composite.BaseCodingDt;
import ca.uhn.fhir.model.base.composite.BaseIdentifierDt;
import ca.uhn.fhir.model.base.composite.BaseQuantityDt;
import ca.uhn.fhir.model.dstu.valueset.QuantityCompararatorEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.method.RestSearchParameterTypeEnum;
import ca.uhn.fhir.rest.param.CompositeParam;
import ca.uhn.fhir.rest.param.DateParam;
import ca.uhn.fhir.rest.param.DateRangeParam;
import ca.uhn.fhir.rest.param.NumberParam;
import ca.uhn.fhir.rest.param.QuantityParam;
import ca.uhn.fhir.rest.param.ReferenceParam;
import ca.uhn.fhir.rest.param.StringParam;
import ca.uhn.fhir.rest.param.TokenParam;
import ca.uhn.fhir.rest.server.exceptions.InternalErrorException;
import ca.uhn.fhir.rest.server.exceptions.InvalidRequestException;
import edu.gatech.i3l.fhir.jpa.dao.BaseFhirDao;
import edu.gatech.i3l.fhir.jpa.dao.IFhirDao;
import edu.gatech.i3l.fhir.jpa.dao.IFhirResourceDao;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

public class QueryHelper {

	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(QueryHelper.class);
	
	private EntityManager myEntityManager;
	
	private Class<? extends IResourceEntity> myResourceEntity;
	private Class<? extends IResource> myResourceType;
	private FhirContext myContext;
	private PredicateBuilder predicateBuilder;

	private IFhirDao baseFhirDao;
	
	public QueryHelper() {
		super();
	}
	
	public QueryHelper(PredicateBuilder predicateBuilder){
		this.predicateBuilder = predicateBuilder;
	}
	
	public QueryHelper( EntityManager theEntityManager, Class<? extends IResourceEntity> theResourceEntity,
			Class<? extends IResource> theResourceType, FhirContext theContext, BaseFhirDao theBaseFhirDao) { 
		super();
		this.myEntityManager = theEntityManager;
		this.myResourceEntity = theResourceEntity;
		this.myResourceType = theResourceType;
		this.myContext = theContext;
		this.baseFhirDao = theBaseFhirDao;
	}

	public PredicateBuilder getPredicateBuilder() {
		return predicateBuilder;
	}

	public void setPredicateBuilder(PredicateBuilder predicateBuilder) {
		this.predicateBuilder = predicateBuilder;
	}

	public Set<Long> searchById(Set<Long> theExistingPids, Set<Long> thePids) {
		if (thePids == null || thePids.isEmpty()) {
			return Collections.emptySet();
		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		Root<? extends IResourceEntity> from = cq.from(myResourceEntity);
		cq.select(from.get("id").as(Long.class)); 
		Predicate idPrecidate = from.get("id").in(thePids);
		Predicate addPredicate = predicateBuilder.addCommonPredicate(builder, from);
		if(addPredicate != null){
			Predicate and = builder.and(idPrecidate, addPredicate);
			cq.where(and);
		} else {
			cq.where(idPrecidate);
		}
		TypedQuery<Long> q = myEntityManager.createQuery(cq);
		HashSet<Long> found = new HashSet<Long>(q.getResultList());
		if (!theExistingPids.isEmpty()) {
			theExistingPids.retainAll(found);
		}

		return found;
	}
	
	public Set<Long> searchByDate(String theParamName, Set<Long> thePids, List<? extends IQueryParameterType> theList) {
		if (theList == null || theList.isEmpty()) {
			return thePids;
		}

//		if (Boolean.TRUE.equals(theList.get(0).getMissing())) {
//			return addPredicateParamMissing(thePids, "myParamsDate", theParamName, ResourceIndexedSearchParamDate.class);
//		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		Root<? extends IResourceEntity> from = cq.from(myResourceEntity);
		cq.select(from.get("id").as(Long.class));
		
//		Root<ResourceIndexedSearchParamDate> from = cq.from(ResourceIndexedSearchParamDate.class);
//		cq.select(from.get("myResourcePid").as(Long.class));
//
		List<Predicate> codePredicates = new ArrayList<Predicate>();
		for (IQueryParameterType nextOr : theList) {
			
//			if (addPredicateMissingFalseIfPresent(builder, theParamName, from, codePredicates, nextOr)) {//WARNING check his line for correctness
//				continue;
//			}
			IQueryParameterType params = toParameterType(myContext.getResourceDefinition(myResourceType).getSearchParam(theParamName), nextOr.getValueAsQueryToken());
			Predicate p = createPredicateDate(builder, from, theParamName, params);
			codePredicates.add(p);
		}

		Predicate masterCodePredicate = builder.or(codePredicates.toArray(new Predicate[0]));
		Predicate addPredicate = predicateBuilder.addCommonPredicate(builder, from);
		if (thePids.size() > 0) {
			Predicate inPids = (from.get("id").in(thePids));
			if(addPredicate != null){
				cq.where(builder.and(inPids, masterCodePredicate, addPredicate));
			} else {
				cq.where(builder.and(inPids, masterCodePredicate));
			}
		} else {
			if(addPredicate != null){
				cq.where(builder.and(masterCodePredicate, addPredicate));
			} else {
				cq.where(builder.and(masterCodePredicate));
			}
		}

		TypedQuery<Long> q = myEntityManager.createQuery(cq);
		return new HashSet<Long>(q.getResultList());
	}
	
	protected Predicate createPredicateDate(CriteriaBuilder theBuilder, From<? extends IResourceEntity, ? extends IResourceEntity> from, String theParamName, IQueryParameterType theParam) {
		Predicate p;
		if (theParam instanceof DateParam) {
			DateParam date = (DateParam) theParam;
			if (!date.isEmpty()) {
				DateRangeParam range = new DateRangeParam(date);
				p = predicateBuilder.translatePredicateDate(myResourceEntity, theBuilder, from, range, theParamName, theParam);
			} else {
				// From original method: TODO: handle missing date param?
				p = null;
			}
		} else if (theParam instanceof DateRangeParam) {
			DateRangeParam range = (DateRangeParam) theParam;
			p = predicateBuilder.translatePredicateDate(myResourceEntity, theBuilder, from, range, theParamName, theParam);
		} else {
			throw new IllegalArgumentException("Invalid token type: " + theParam.getClass());
		}
		return p;
	}
	
	
	private Predicate createPredicateString(IQueryParameterType theParameter, String theParamName, CriteriaBuilder theBuilder,
			From<? extends IResourceEntity, ? extends IResourceEntity> stringJoin) {
		String rawSearchTerm;
		if (theParameter instanceof TokenParam) {
			TokenParam id = (TokenParam) theParameter;
			if (!id.isText()) {
				throw new IllegalStateException("Trying to process a text search on a non-text token parameter");
			}
			rawSearchTerm = id.getValue();
		} else if (theParameter instanceof StringParam) {
			StringParam id = (StringParam) theParameter;
			rawSearchTerm = id.getValue();
		} else if (theParameter instanceof IPrimitiveDatatype<?>) {
			IPrimitiveDatatype<?> id = (IPrimitiveDatatype<?>) theParameter;
			rawSearchTerm = id.getValueAsString();
		} else {
			throw new IllegalArgumentException("Invalid token type: " + theParameter.getClass());
		}

		String likeExpression = QueryUtilities.normalizeString(rawSearchTerm);
		likeExpression = "%" + likeExpression.replace("%", "[%]") + "%";
		Predicate singleCode = predicateBuilder.translatePredicateString(myResourceEntity, theParamName, likeExpression, stringJoin, theBuilder);
//		Predicate singleCode = theBuilder.like(from.get("myValueNormalized").as(String.class), likeExpression);
//		Predicate singleCode = theBuilder.like(from.get("myValueNormalized").as(String.class), likeExpression);
//		if (theParameter instanceof StringParam && ((StringParam) theParameter).isExact()) {
//			Predicate exactCode = theBuilder.equal(from.get("myValueExact"), rawSearchTerm);
//			singleCode = theBuilder.and(singleCode, exactCode);
//		}
		return singleCode;
	}
	
	
	public Set<Long> searchByString(String theParamName, Set<Long> thePids, List<? extends IQueryParameterType> theList) {
		if (theList == null || theList.isEmpty()) {
			return thePids;
		}

		if (Boolean.TRUE.equals(theList.get(0).getMissing())) {
//			return addPredicateParamMissing(thePids, "myParamsString", theParamName, getResourceTable());
			System.err.println(); //WARNING
		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		Root<? extends IResourceEntity> from = cq.from(myResourceEntity);
		cq.select(from.get("id").as(Long.class));

		List<Predicate> codePredicates = new ArrayList<Predicate>();
		for (IQueryParameterType nextOr : theList) {
			IQueryParameterType theParameter = nextOr;
//			if (addPredicateMissingFalseIfPresent(builder, theParamName, from, codePredicates, nextOr)) {//WARNING check his line for correctness
//				continue;
//			}
			
			Predicate singleCode = createPredicateString(theParameter, theParamName, builder, from);
			codePredicates.add(singleCode);
		}

		Predicate masterCodePredicate = builder.or(codePredicates.toArray(new Predicate[0]));
		Predicate addPredicate = predicateBuilder.addCommonPredicate(builder, from);
		if (thePids.size() > 0) {
			Predicate inPids = (from.get("id").in(thePids));
			if(addPredicate != null){
				cq.where(builder.and(masterCodePredicate, inPids, addPredicate));
			} else {
				cq.where(builder.and(masterCodePredicate, inPids));
			}
		} else {
			if(addPredicate != null){
				cq.where(builder.and(masterCodePredicate, addPredicate));
			} else {
				cq.where(builder.and(masterCodePredicate));
			}
		}

		TypedQuery<Long> q = myEntityManager.createQuery(cq);
		return new HashSet<Long>(q.getResultList());
	}
	
	
	public Set<Long> searchByReference(String theParamName, Set<Long> thePids, List<? extends IQueryParameterType> theList) {
		assert theParamName.contains(".") == false;

		Set<Long> pidsToRetain = thePids;
		if (theList == null || theList.isEmpty()) {
			return pidsToRetain;
		}

//		if (Boolean.TRUE.equals(theList.get(0).getMissing())) {
//			return addPredicateParamMissingResourceLink(thePids, "myResourceLinks", theParamName);
//		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		Root<? extends IResourceEntity> from = cq.from(myResourceEntity);
		cq.select(from.get("id").as(Long.class));

		List<Predicate> codePredicates = new ArrayList<Predicate>();

		for (IQueryParameterType nextOr : theList) {
			IQueryParameterType params = nextOr;

//			if (addPredicateMissingFalseIfPresentForResourceLink(builder, theParamName, from, codePredicates, nextOr)) {
//				continue;
//			}

			if (params instanceof ReferenceParam) {
				ReferenceParam ref = (ReferenceParam) params;

				String resourceId = ref.getValueAsQueryToken();

				if (isBlank(ref.getChain())) {
					if (resourceId.contains("/")) {
						IIdType dt = new IdDt(resourceId);
						resourceId = dt.getIdPart();
					}
					Predicate eq = builder.equal(predicateBuilder.getPath(myResourceEntity, theParamName, from).get("id"), resourceId);

					codePredicates.add(eq);

				} else {

					String paramPath = myContext.getResourceDefinition(myResourceType).getSearchParam(theParamName).getPath();
					BaseRuntimeChildDefinition def = myContext.newTerser().getDefinition(myResourceType, paramPath);
					if (!(def instanceof RuntimeChildResourceDefinition)) {
						throw new ConfigurationException("Property " + paramPath + " of type " + myResourceType + " is not a resource: " + def.getClass());
					}
					List<Class<? extends IBaseResource>> resourceTypes;
					if (isBlank(ref.getResourceType())) {
						RuntimeChildResourceDefinition resDef = (RuntimeChildResourceDefinition) def;
						resourceTypes = resDef.getResourceTypes();
					} else {
						resourceTypes = new ArrayList<Class<? extends IBaseResource>>();
						RuntimeResourceDefinition resDef = myContext.getResourceDefinition(ref.getResourceType());
						resourceTypes.add(resDef.getImplementingClass());
					}

					boolean foundChainMatch = false;
					for (Class<? extends IBaseResource> nextType : resourceTypes) {
						RuntimeResourceDefinition typeDef = myContext.getResourceDefinition(nextType);

						String chain = ref.getChain();
						String remainingChain = null;
						int chainDotIndex = chain.indexOf('.');
						if (chainDotIndex != -1) {
							remainingChain = chain.substring(chainDotIndex + 1);
							chain = chain.substring(0, chainDotIndex);
						}

						RuntimeSearchParam param = typeDef.getSearchParam(chain);
						if (param == null) {
							ourLog.debug("Type {} doesn't have search param {}", nextType.getSimpleName(), param);
							continue;
						}
						IFhirResourceDao<?> dao = this.baseFhirDao.getDao(nextType);
						if (dao == null) {
							ourLog.debug("Don't have a DAO for type {}", nextType.getSimpleName(), param);
							continue;
						}

						IQueryParameterType chainValue;
						if (remainingChain != null) {
							if (param.getParamType() != RestSearchParameterTypeEnum.REFERENCE) {
								ourLog.debug("Type {} parameter {} is not a reference, can not chain {}", new Object[] { nextType.getSimpleName(), chain, remainingChain });
								continue;
							}

							chainValue = new ReferenceParam();
							chainValue.setValueAsQueryToken(null, resourceId);
							((ReferenceParam) chainValue).setChain(remainingChain);
						} else {
							chainValue = toParameterType(param, resourceId);
						}

						foundChainMatch = true;

						Set<Long> pids = dao.searchForIds(chain, chainValue);
						if (pids.isEmpty()) {
							continue;
						}

						Predicate eq = from.get("id").in(pids);
						codePredicates.add(eq);

					}

					if (!foundChainMatch) {
						throw new InvalidRequestException(myContext.getLocalizer().getMessage(BaseFhirDao.class, "invalidParameterChain", theParamName + '.' + ref.getChain()));
					}
				}

			} else {
				throw new IllegalArgumentException("Invalid token type (expecting ReferenceParam): " + params.getClass());
			}

		}

		Predicate masterCodePredicate = builder.or(codePredicates.toArray(new Predicate[0]));

		//Predicate type = createResourceLinkPathPredicate(theParamName, builder, from);
		if (pidsToRetain.size() > 0) {
			Predicate inPids = (from.get("id").in(pidsToRetain));
			cq.where(builder.and(//type, 
					masterCodePredicate, inPids));
		} else {
			cq.where(builder.and(//type, 
					masterCodePredicate));
		}

		TypedQuery<Long> q = myEntityManager.createQuery(cq);
		return new HashSet<Long>(q.getResultList());
	}
	
	
	
	public Set<Long> searchByToken(String theParamName, Set<Long> thePids, List<? extends IQueryParameterType> theList) {
		if (theList == null || theList.isEmpty()) {
			return thePids;
		}
//
//		if (Boolean.TRUE.equals(theList.get(0).getMissing())) {
//			return addPredicateParamMissing(thePids, "myParamsToken", theParamName, ResourceIndexedSearchParamToken.class);
//		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		Root<? extends IResourceEntity> from = cq.from(myResourceEntity);
		cq.select(from.get("id").as(Long.class));

		List<Predicate> codePredicates = new ArrayList<Predicate>();
		for (IQueryParameterType nextOr : theList) {
//			if (addPredicateMissingFalseIfPresent(builder, theParamName, from, codePredicates, nextOr)) {
//				continue;
//			}

			if (nextOr instanceof TokenParam) {
				TokenParam id = (TokenParam) nextOr;
				if (id.isText()) {
					return searchByString(theParamName, thePids, theList);
				}
			}

			Predicate singleCode = createPredicateToken(nextOr, theParamName, builder, from);
			codePredicates.add(singleCode);
		}

		Predicate masterCodePredicate = builder.or(codePredicates.toArray(new Predicate[0]));

		if (thePids.size() > 0) {
			Predicate inPids = (from.get("id").in(thePids));
			cq.where(builder.and(masterCodePredicate, inPids));
		} else {
			cq.where(builder.and(masterCodePredicate));
		}

		TypedQuery<Long> q = myEntityManager.createQuery(cq);
		return new HashSet<Long>(q.getResultList());
	}

	private Predicate createPredicateToken(IQueryParameterType theParameter, String theParamName, CriteriaBuilder theBuilder,
			From<? extends IResourceEntity, ? extends IResourceEntity> tokenJoin) {
		String code;
		String system;
		if (theParameter instanceof TokenParam) {
			TokenParam id = (TokenParam) theParameter;
			system = id.getSystem();
			code = id.getValue();
		} else if (theParameter instanceof BaseIdentifierDt) {
			BaseIdentifierDt id = (BaseIdentifierDt) theParameter;
			system = id.getSystemElement().getValueAsString();
			code = id.getValueElement().getValue();
		} else if (theParameter instanceof BaseCodingDt) {
			BaseCodingDt id = (BaseCodingDt) theParameter;
			system = id.getSystemElement().getValueAsString();
			code = id.getCodeElement().getValue();
		} else {
			throw new IllegalArgumentException("Invalid token type: " + theParameter.getClass());
		}

//		if (system != null && system.length() > ResourceIndexedSearchParamToken.MAX_LENGTH) {
//			throw new InvalidRequestException("Parameter[" + theParamName + "] has system (" + system.length() + ") that is longer than maximum allowed (" + ResourceIndexedSearchParamToken.MAX_LENGTH
//					+ "): " + system);
//		}
//		if (code != null && code.length() > ResourceIndexedSearchParamToken.MAX_LENGTH) {
//			throw new InvalidRequestException("Parameter[" + theParamName + "] has code (" + code.length() + ") that is longer than maximum allowed (" + ResourceIndexedSearchParamToken.MAX_LENGTH
//					+ "): " + code);
//		}

		ArrayList<Predicate> singleCodePredicates = (new ArrayList<Predicate>());
		Predicate predicateSystem = predicateBuilder.translatePredicateTokenSystem(myResourceEntity, theParamName, system, tokenJoin, theBuilder); 
		if(predicateSystem != null)
			singleCodePredicates.add(predicateSystem);
		singleCodePredicates.add(predicateBuilder.translatePredicateTokenCode(myResourceEntity, theParamName, code, tokenJoin, theBuilder));
		
		Predicate singleCode = theBuilder.and(singleCodePredicates.toArray(new Predicate[0]));
		return singleCode;
	}
	
	public Set<Long> searchByComposite(RuntimeSearchParam theParamDef, Set<Long> thePids, List<? extends IQueryParameterType> theNextAnd) {
		// TODO: fail if missing is set for a composite query

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		Root<? extends IResourceEntity> from = cq.from(myResourceEntity);
		cq.select(from.get("id").as(Long.class));

		IQueryParameterType or = theNextAnd.get(0);
		if (!(or instanceof CompositeParam<?, ?>)) {
			throw new InvalidRequestException("Invalid type for composite param (must be " + CompositeParam.class.getSimpleName() + ": " + or.getClass());
		}
		CompositeParam<?, ?> cp = (CompositeParam<?, ?>) or;

		RuntimeSearchParam left = theParamDef.getCompositeOf().get(0);
		IQueryParameterType leftValue = cp.getLeftValue();
		Predicate leftPredicate = createCompositeParamPart(builder, from, left, leftValue);

		RuntimeSearchParam right = theParamDef.getCompositeOf().get(1);
		IQueryParameterType rightValue = cp.getRightValue();
		Predicate rightPredicate = createCompositeParamPart(builder, from, right, rightValue);

		//Predicate type = builder.equal(from.get("myResourceType"), myResourceType);
		if (thePids.size() > 0) {
			Predicate inPids = (from.get("id").in(thePids));
			cq.where(builder.and(//type, 
					leftPredicate, rightPredicate, inPids));
		} else {
			cq.where(builder.and(//type, 
					leftPredicate, rightPredicate));
		}

		TypedQuery<Long> q = myEntityManager.createQuery(cq);
		return new HashSet<Long>(q.getResultList());

	}
	
	private Predicate createCompositeParamPart(CriteriaBuilder builder, Root<? extends IResourceEntity> from, RuntimeSearchParam left, IQueryParameterType leftValue) {
		Predicate retVal = null;
		From<? extends IResourceEntity, ? extends IResourceEntity> valueJoin = from.join("myParamsString", JoinType.INNER);
		switch (left.getParamType()) {
			case STRING: {
				retVal = createPredicateString(leftValue, left.getName(), builder, valueJoin);
				break;
			}
			case TOKEN: {
				retVal = createPredicateToken(leftValue, left.getName(), builder, valueJoin);
				break;
			}
			case DATE: {
				retVal = createPredicateDate(builder, valueJoin, left.getName(), leftValue);
				break;
			}
		}

		if (retVal == null) {
			throw new InvalidRequestException("Don't know how to handle composite parameter with type of " + left.getParamType());
		}

		return retVal;
	}
	

	public Set<Long> searchByNumber(String theParamName, Set<Long> thePids, List<? extends IQueryParameterType> theList) {
		if (theList == null || theList.isEmpty()) {
			return thePids;
		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		Root<? extends IResourceEntity> from = cq.from(myResourceEntity);
		cq.select(from.get("id").as(Long.class));

		List<Predicate> codePredicates = new ArrayList<Predicate>();
		for (IQueryParameterType nextOr : theList) {
			IQueryParameterType params = nextOr;

			if (params instanceof NumberParam) {
				NumberParam param = (NumberParam) params;

				BigDecimal value = param.getValue();
				if (value == null) {
					return thePids;
				}
				Predicate p = predicateBuilder.translatePredicateValueNumber(myResourceEntity, builder, from, theParamName, param.getComparator() , value);
				codePredicates.add(p);
				
			} else {
				throw new IllegalArgumentException("Invalid token type: " + params.getClass());
			}

		}

		Predicate masterCodePredicate = builder.or(codePredicates.toArray(new Predicate[0]));

		if (thePids.size() > 0) {
			Predicate inPids = (from.get("id").in(thePids));
			cq.where(builder.and( masterCodePredicate, inPids));
		} else {
			cq.where(builder.and( masterCodePredicate));
		}

		TypedQuery<Long> q = myEntityManager.createQuery(cq);
		return new HashSet<Long>(q.getResultList());
	}
	
	public Set<Long> searchByQuantity(String theParamName, Set<Long> thePids, List<? extends IQueryParameterType> theList) {
		if (theList == null || theList.isEmpty()) {
			return thePids;
		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		Root<? extends IResourceEntity> from = cq.from(myResourceEntity);
		cq.select(from.get("id").as(Long.class));

		List<Predicate> codePredicates = new ArrayList<Predicate>();
		for (IQueryParameterType nextOr : theList) {
			IQueryParameterType params = nextOr;

			String systemValue;
			String unitsValue;
			QuantityCompararatorEnum cmpValue;
			BigDecimal valueValue;
			boolean approx = false;

			if (params instanceof BaseQuantityDt) {
				BaseQuantityDt param = (BaseQuantityDt) params;
				systemValue = param.getSystemElement().getValueAsString();
				unitsValue = param.getUnitsElement().getValueAsString();
				cmpValue = QuantityCompararatorEnum.VALUESET_BINDER.fromCodeString(param.getComparatorElement().getValueAsString());
				valueValue = param.getValueElement().getValue();
			} else if (params instanceof QuantityParam) {
				QuantityParam param = (QuantityParam) params;
				systemValue = param.getSystem().getValueAsString();
				unitsValue = param.getUnits();
				cmpValue = param.getComparator();
				valueValue = param.getValue().getValue();
				approx = param.isApproximate();
			} else {
				throw new IllegalArgumentException("Invalid quantity type: " + params.getClass());
			}

			Predicate system = null;
			if (!isBlank(systemValue)) {
				system = predicateBuilder.translatePredicateQuantitySystem(myResourceEntity, theParamName, builder, from, systemValue);
			}

			Predicate code = null;
			if (!isBlank(unitsValue)) {
				code = predicateBuilder.translatePredicateQuantityCode(myResourceEntity, theParamName, builder, from, unitsValue);
			}

			Predicate num = predicateBuilder.translatePredicateQuantityValue(myResourceEntity, theParamName, builder, from, cmpValue, valueValue, approx);

			if (system == null && code == null) {
				codePredicates.add(num);
			} else if (system == null) {
				Predicate singleCode = builder.and(code, num);
				codePredicates.add(singleCode);
			} else if (code == null) {
				Predicate singleCode = builder.and(system, num);
				codePredicates.add(singleCode);
			} else {
				Predicate singleCode = builder.and(system, code, num);
				codePredicates.add(singleCode);
			}
		}

		Predicate masterCodePredicate = builder.or(codePredicates.toArray(new Predicate[0]));

		if (thePids.size() > 0) {
			Predicate inPids = (from.get("id").in(thePids));
			cq.where(builder.and(masterCodePredicate, inPids));
		} else {
			cq.where(builder.and(masterCodePredicate));
		}

		TypedQuery<Long> q = myEntityManager.createQuery(cq);
		return new HashSet<Long>(q.getResultList());
	}
	

	protected IQueryParameterType toParameterType(RuntimeSearchParam theParam) { 
		IQueryParameterType qp;
		switch (theParam.getParamType()) {
		case DATE:
			qp = new DateParam();
			break;
		case NUMBER:
			qp = new NumberParam();
			break;
		case QUANTITY:
			qp = new QuantityParam();
			break;
		case STRING:
			qp = new StringParam();
			break;
		case TOKEN:
			qp = new TokenParam();
			break;
		case COMPOSITE:
			List<RuntimeSearchParam> compositeOf = theParam.getCompositeOf();
			if (compositeOf.size() != 2) {
				throw new InternalErrorException("Parameter " + theParam.getName() + " has " + compositeOf.size() + " composite parts. Don't know how handlt this.");
			}
			IQueryParameterType leftParam = toParameterType(compositeOf.get(0));
			IQueryParameterType rightParam = toParameterType(compositeOf.get(1));
			qp = new CompositeParam<IQueryParameterType, IQueryParameterType>(leftParam, rightParam);
			break;
		case REFERENCE:
			qp = new ReferenceParam();
			break;
		default:
			throw new InternalErrorException("Don't know how to convert param type: " + theParam.getParamType());
		}
		return qp;
	}
	
	protected IQueryParameterType toParameterType(RuntimeSearchParam theParam, String theValueAsQueryToken) {
		IQueryParameterType qp = toParameterType(theParam);
	
		qp.setValueAsQueryToken(null, theValueAsQueryToken);
		return qp;
	}


	public EntityManager getMyEntityManager() {
		return myEntityManager;
	}

	public void setMyEntityManager(EntityManager myEntityManager) {
		this.myEntityManager = myEntityManager;
	}

	public Class<? extends IResourceEntity> getMyResourceEntity() {
		return myResourceEntity;
	}

	public void setMyResourceEntity(
			Class<? extends IResourceEntity> myResourceEntity) {
		this.myResourceEntity = myResourceEntity;
	}

	public Class<? extends IResource> getMyResourceType() {
		return myResourceType;
	}

	public void setMyResourceType(Class<? extends IResource> myResourceType) {
		this.myResourceType = myResourceType;
	}

	public FhirContext getMyContext() {
		return myContext;
	}

	public void setMyContext(FhirContext myContext) {
		this.myContext = myContext;
	}

	public IFhirDao getBaseFhirDao() {
		return baseFhirDao;
	}

	public void setBaseFhirDao(IFhirDao baseFhirDao) {
		this.baseFhirDao = baseFhirDao;
	}



}
