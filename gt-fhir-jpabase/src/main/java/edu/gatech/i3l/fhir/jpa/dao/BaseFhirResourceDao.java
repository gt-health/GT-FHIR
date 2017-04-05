package edu.gatech.i3l.fhir.jpa.dao;

import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.JoinColumn;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.persistence.criteria.Selection;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import net.vidageek.mirror.dsl.Mirror;

import org.apache.commons.lang3.reflect.FieldUtils;
import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.hibernate.envers.query.AuditEntity;
import org.hibernate.envers.query.AuditQuery;
import org.hibernate.proxy.HibernateProxy;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.instance.model.api.IIdType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.context.RuntimeResourceDefinition;
import ca.uhn.fhir.context.RuntimeSearchParam;
import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.ResourceMetadataKeyEnum;
import ca.uhn.fhir.model.base.composite.BaseResourceReferenceDt;
import ca.uhn.fhir.model.base.resource.BaseOperationOutcome.BaseIssue;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.Bundle;
import ca.uhn.fhir.model.dstu2.resource.OperationOutcome;
import ca.uhn.fhir.model.dstu2.resource.OperationOutcome.Issue;
import ca.uhn.fhir.model.dstu2.valueset.BundleTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.IssueSeverityEnum;
import ca.uhn.fhir.model.dstu2.valueset.IssueTypeEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.valueset.BundleEntrySearchModeEnum;
import ca.uhn.fhir.parser.IParser;
import ca.uhn.fhir.parser.IParserErrorHandler;
import ca.uhn.fhir.rest.api.MethodOutcome;
import ca.uhn.fhir.rest.api.SortOrderEnum;
import ca.uhn.fhir.rest.api.SortSpec;
import ca.uhn.fhir.rest.api.ValidationModeEnum;
import ca.uhn.fhir.rest.server.EncodingEnum;
import ca.uhn.fhir.rest.server.IBundleProvider;
import ca.uhn.fhir.rest.server.SimpleBundleProvider;
import ca.uhn.fhir.rest.server.exceptions.InvalidRequestException;
import ca.uhn.fhir.rest.server.exceptions.PreconditionFailedException;
import ca.uhn.fhir.rest.server.exceptions.ResourceGoneException;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;
import ca.uhn.fhir.rest.server.exceptions.UnprocessableEntityException;
import ca.uhn.fhir.util.FhirTerser;
import ca.uhn.fhir.validation.FhirValidator;
import ca.uhn.fhir.validation.ValidationResult;
import edu.gatech.i3l.fhir.jpa.annotations.FhirAttributesProvided;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.QueryHelper;
import edu.gatech.i3l.fhir.jpa.util.DaoUtils;
import edu.gatech.i3l.fhir.jpa.util.StopWatch;

/**
 * This class serves as Template with commmon dao functions that are meant to be extended by subclasses.
 * @author Ismael Sarmento
 */
@Transactional(propagation = Propagation.REQUIRED)
public abstract class BaseFhirResourceDao<T extends IResource> implements IFhirResourceDao<T>{
	
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(BaseFhirResourceDao.class);
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;
	
	private BaseFhirDao baseFhirDao;
	private boolean createBundle;
	
	@Autowired
	private PlatformTransactionManager myPlatformTransactionManager;
	
	private Class<T> myResourceType;
	private Class<? extends IResourceEntity> myResourceEntity;
	
	private FhirContext myContext;
	private QueryHelper myQueryHelper ;
	private Validator myBeanValidator;

	private boolean myValidateBean;



	public abstract PredicateBuilder getPredicateBuilder();
	
	public BaseFhirResourceDao() {
		super();
	}
	
	@PostConstruct
	public void setQueryHelper(){
		if(myQueryHelper == null){
			myQueryHelper = new QueryHelper( this.myEntityManager, this.myResourceEntity, this.myResourceType, this.myContext, this.baseFhirDao);
			myQueryHelper.setPredicateBuilder(getPredicateBuilder());
		}
	}

	public Validator getBeanValidator() {
		return myBeanValidator;
	}

	public void setBeanValidator(Validator theBeanValidator) { 
		this.myBeanValidator = theBeanValidator;
	}

	public boolean isValidateBean() {
		return myValidateBean;
	}

	public void setValidateBean(boolean theValidateBean) {
		this.myValidateBean = theValidateBean;
	}

	@Override
	public Class<T> getResourceType() {
		return myResourceType;
	}
	
	@SuppressWarnings("unchecked")
	@Required
	public void setResourceType(Class<? extends IResource> theTableType) {
		myResourceType = (Class<T>) theTableType;
	}

	public Class<? extends IResourceEntity> getResourceEntity() {
		return myResourceEntity;
	}
	
	public void setResourceEntity(Class<? extends IResourceEntity> theResourceEntity) {
		this.myResourceEntity = theResourceEntity;
	}
	
	public void setContext(FhirContext context){
		this.myContext = context;
	}
	
	public FhirContext getContext(){
		return this.myContext;
	}
	
	public EntityManager getEntityManager() {
		return myEntityManager;
	}

	public void setEntityManager(EntityManager myEntityManager) {
		this.myEntityManager = myEntityManager;
	}

	public QueryHelper getQueryHelper() {
		return myQueryHelper;
	}

	public void setQueryHelper(QueryHelper myQueryHelper) {
		this.myQueryHelper = myQueryHelper;
	}

	@Override
	public DaoMethodOutcome create(final T theResource) {
		return create(theResource, null, true);
	}

	@Override
	public DaoMethodOutcome create(final T theResource, String theIfNoneExist) {
		return create(theResource, theIfNoneExist, true);
	}

	@Override
	public DaoMethodOutcome create(T theResource, String theIfNoneExist, boolean thePerformIndexing) {
//		if (isNotBlank(theResource.getId().getIdPart())) {
//			throw new InvalidRequestException(baseFhirDao.getContext().getLocalizer().getMessage(BaseFhirResourceDao.class, "failedToCreateWithClientAssignedId", theResource.getId().getIdPart()));
//		}
		return doCreate(theResource, theIfNoneExist, thePerformIndexing);
	}
	
	private DaoMethodOutcome doCreate(T theResource, String theIfNoneExist, boolean thePerformIndexing) {
		StopWatch w = new StopWatch();
		BaseResourceEntity entity = (BaseResourceEntity) new Mirror().on(myResourceEntity).invoke().constructor().withoutArgs();
		entity.constructEntityFromResource(theResource);
		if(myValidateBean){
			Set<ConstraintViolation<BaseResourceEntity>> violations = myBeanValidator.validate(entity);
			if(!violations.isEmpty()){
				OperationOutcome oo = new OperationOutcome();
				for (ConstraintViolation<BaseResourceEntity> violation : violations) {
//					oo.addIssue().setSeverity(IssueSeverityEnum.ERROR).setCode(IssueTypeEnum.PROCESSING_FAILURE).setDetails(violation.getPropertyPath()+" "+ violation.getMessage());
					oo.addIssue().setSeverity(IssueSeverityEnum.ERROR).setCode(IssueTypeEnum.PROCESSING_FAILURE).setDetails((new CodeableConceptDt()).setText(violation.getPropertyPath()+" "+ violation.getMessage()));
				}
				throw new UnprocessableEntityException(myContext, oo);
			}
		}

//		if (isNotBlank(theIfNoneExist)) {
//			Set<Long> match = DaoUtils.processMatchUrl(theIfNoneExist, myResourceType, myContext, getBaseFhirDao().getDao(myResourceType));
//			if (match.size() > 1) {
//				String msg = baseFhirDao.getContext().getLocalizer().getMessage(BaseFhirDao.class, "transactionOperationWithMultipleMatchFailure", "CREATE", theIfNoneExist, match.size());
//				throw new PreconditionFailedException(msg);
//			} else if (match.size() == 1) {
//				Long pid = match.iterator().next();
//				entity = myEntityManager.find(myResourceEntity, pid);
//				return toMethodOutcome(entity, theResource).setCreated(false);
//			}
//		}

		baseFhirDao.updateEntity(theResource, entity, false, null, thePerformIndexing, true);

		DaoMethodOutcome outcome = toMethodOutcome(entity, theResource).setCreated(true);

		baseFhirDao.notifyWriteCompleted();
		ourLog.info("Processed create on {} in {}ms", myResourceType, w.getMillisAndRestart());
		return outcome;
	}
	
	private DaoMethodOutcome toMethodOutcome(final BaseResourceEntity entity, IResource theResource) {
		DaoMethodOutcome outcome = new DaoMethodOutcome();
		outcome.setId(new IdDt(entity.getId()));
		outcome.setEntity(entity);
		outcome.setResource(theResource);
		if (theResource != null) {
			theResource.setId(new IdDt(entity.getId()));
		}
		return outcome;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public T read(IIdType theId) {

		StopWatch w = new StopWatch();
		BaseResourceEntity entity = (BaseResourceEntity) readEntity(theId);
		T retVal = null;
		if( entity != null){
			retVal = (T) entity.getRelatedResource();
			
			InstantDt deleted = ResourceMetadataKeyEnum.DELETED_AT.get(retVal);
			if (deleted != null && !deleted.isEmpty()) {
				throw new ResourceGoneException("Resource was deleted at " + deleted.getValueAsString());
			}
		}

		ourLog.info("Processed read on {} in {}ms", theId.getValue(), w.getMillisAndRestart());
		return retVal;
	}


	@Override
	public BaseResourceEntity readEntity(IIdType theId) {
		BaseResourceEntity entity = readEntity(theId, false);
		return entity;
	}
	
	@Override
	public BaseResourceEntity readEntity(IIdType theId, boolean theCheckForForcedId) {
	
		Long pid = theId.getIdPartAsLong();
		BaseResourceEntity entity = (BaseResourceEntity) myEntityManager.find(getResourceEntity(), pid);
	//	if (theId.hasVersionIdPart()) { //TODO new capability: Read resource from history, id-format = 'id/_history/version'
	//		if (entity.getVersion() != theId.getVersionIdPartAsLong()) {
	//			entity = null;
	//		}
	//	}
	//
	//	if (entity == null) {
	//		if (theId.hasVersionIdPart()) {
	//			TypedQuery<ResourceHistoryTable> q = myEntityManager.createQuery(
	//					"SELECT t from );
	//			entity = q.getSingleResult();
	//		}
	//		if (entity == null) {
	//			throw new ResourceNotFoundException(theId);
	//		}
	//	}
	
		return entity;
	}
	
	
	@Override
	public IBundleProvider search(Map<String, IQueryParameterType> theParams) {
		SearchParameterMap map = new SearchParameterMap();
		for (Entry<String, IQueryParameterType> nextEntry : theParams.entrySet()) {
			map.add(nextEntry.getKey(), (nextEntry.getValue()));
		}
		return search(map);
	}
	
	public IBundleProvider search(String theParameterName, IQueryParameterType theValue) {
		return search(Collections.singletonMap(theParameterName, theValue));
	}

	@Override
	public Set<Long> searchForIds(Map<String, IQueryParameterType> theParams) {
		SearchParameterMap map = new SearchParameterMap();
		for (Entry<String, IQueryParameterType> nextEntry : theParams.entrySet()) {
			map.add(nextEntry.getKey(), (nextEntry.getValue()));
		}
		return searchForIdsWithAndOr(map);
	}

	@Override
	public Set<Long> searchForIds(String theParameterName, IQueryParameterType theValue) {
		return searchForIds(Collections.singletonMap(theParameterName, theValue));
	}
	
	/**
	 * Search for the <b>current revisions</b> of entity, according to the map with filters.
	 * In order to add historic data to the search, it is suggested to override the method 
	 * {@link BaseFhirResourceDao#loadResourcesByPid(Collection, List, BundleEntrySearchModeEnum)}.
	 */
	@Override
	public IBundleProvider search(final SearchParameterMap theParams) {
		StopWatch w = new StopWatch();
		final InstantDt now = InstantDt.withCurrentTime();

		System.out.println("theParams:"+theParams.toString());
		Set<Long> loadPids;
		if (theParams.isEmpty()) {
			CriteriaBuilder criteriaBuilder = myEntityManager.getCriteriaBuilder();
			CriteriaQuery<Long> criteria = criteriaBuilder.createQuery(Long.class);
			Root<? extends IResourceEntity> from = criteria.from(getResourceEntity());
			criteria.select(from.get("id").as(Long.class));
			PredicateBuilder predicateBuilder = myQueryHelper.getPredicateBuilder();
			Predicate addPredicate = predicateBuilder.addCommonPredicate(criteriaBuilder, from);
			if(addPredicate != null)
				criteria.where(addPredicate);
			criteria.orderBy(criteriaBuilder.asc(from.get("id").as(Long.class)));
			List<Long> resultList = myEntityManager.createQuery(criteria).getResultList();
			loadPids = new HashSet<Long>(resultList);
		} else {
			loadPids = searchForIdsWithAndOr(theParams);
			if (loadPids.isEmpty()) {
				return new SimpleBundleProvider();
			}
		}

		final List<Long> pids;
		if (theParams.getSort() != null && isNotBlank(theParams.getSort().getParamName())) {
			List<Order> orders = new ArrayList<Order>();
			List<Predicate> predicates = new ArrayList<Predicate>();
			CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
			CriteriaQuery<Tuple> cq = builder.createTupleQuery();
			Root<? extends IResourceEntity> from = cq.from(getResourceEntity());
			predicates.add(from.get("id").in(loadPids));
			createSort(builder, from, theParams.getSort(), orders);
			if (orders.size() > 0) {
				Set<Long> originalPids = loadPids;
				loadPids = new LinkedHashSet<Long>();
				cq.multiselect(from.get("id").as(Long.class));
				cq.where(predicates.toArray(new Predicate[0]));
				cq.orderBy(orders);

				TypedQuery<Tuple> query = myEntityManager.createQuery(cq);

				for (Tuple next : query.getResultList()) {
					loadPids.add(next.get(0, Long.class));
				}

				ourLog.info("Sort PID order is now: {}", loadPids);

				pids = new ArrayList<Long>(loadPids);

				// Any ressources which weren't matched by the sort get added to the bottom
				for (Long next : originalPids) {
					if (loadPids.contains(next) == false) {
						pids.add(next);
					}
				}

			} else {
				pids = new ArrayList<Long>(loadPids);
			}
		} else {
			pids = new ArrayList<Long>(loadPids);
		}
		
		IBundleProvider retVal = new IBundleProvider() {
			@Override
			public InstantDt getPublished() {
				return now;
			}

			@Override
			public List<IBaseResource> getResources(final int theFromIndex, final int theToIndex) {
				TransactionTemplate template = new TransactionTemplate(myPlatformTransactionManager);
				return template.execute(new TransactionCallback<List<IBaseResource>>() {
					@Override
					public List<IBaseResource> doInTransaction(TransactionStatus theStatus) {
						List<Long> pidsSubList = pids.subList(theFromIndex, theToIndex);

						// Execute the query and make sure we return distinct results
						List<IBaseResource> retVal = new ArrayList<IBaseResource>();
						loadResourcesByPid(pidsSubList, retVal, BundleEntrySearchModeEnum.MATCH);

						/*
						 * Load _include resources - Note that _revincludes are handled differently than _include ones, as they are counted towards the total count and paged, so they are loaded
						 * outside the bundle provider
						 */
						if (theParams.getIncludes() != null && theParams.getIncludes().isEmpty() == false) {
							Set<IIdType> previouslyLoadedPids = new HashSet<IIdType>();
							for (IBaseResource next : retVal) {
								previouslyLoadedPids.add(next.getIdElement().toUnqualifiedVersionless());
							}

							Set<IdDt> includePids = new HashSet<IdDt>();
							do {
								includePids.clear();

								FhirTerser t = baseFhirDao.getContext().newTerser();
								for (Include next : theParams.getIncludes()) {
									for (IBaseResource nextResource : retVal) {
										RuntimeResourceDefinition def = baseFhirDao.getContext().getResourceDefinition(nextResource);
										List<Object> values = null;
										switch (baseFhirDao.getContext().getVersion().getVersion()) {
										case DSTU2:
											if ("*".equals(next.getValue())) {
												values = new ArrayList<Object>();
												values.addAll(t.getAllPopulatedChildElementsOfType(nextResource, BaseResourceReferenceDt.class));
											} else if (next.getValue().startsWith(def.getName() + ":")) {
												values = new ArrayList<Object>();
												RuntimeSearchParam sp = def.getSearchParam(next.getValue().substring(next.getValue().indexOf(':')+1));
												for (String nextPath : sp.getPathsSplit()) {
													values.addAll(t.getValues(nextResource, nextPath));
												}
											} else {
												values = Collections.emptyList();
											}
											break;
										default:
											break;
										}
										if(values == null)
											throw new IllegalStateException("Support for Search not provided for Version: " + baseFhirDao.getContext().getVersion().getVersion());

										for (Object object : values) {
											if (object == null) {
												continue;
											}
											if (!(object instanceof BaseResourceReferenceDt)) {
												throw new InvalidRequestException("Path '" + next.getValue() + "' produced non ResourceReferenceDt value: " + object.getClass());
											}
											BaseResourceReferenceDt rr = (BaseResourceReferenceDt) object;
											if (rr.getReference().isEmpty()) {
												continue;
											}
											if (rr.getReference().isLocal()) {
												continue;
											}

											IdDt nextId = rr.getReference().toUnqualified();
											if (!previouslyLoadedPids.contains(nextId)) {
												includePids.add(nextId);
												previouslyLoadedPids.add(nextId);
											}
										}
									}
								}

								addResourcesAsIncludesById(retVal, includePids); 
							} while (includePids.size() > 0 && previouslyLoadedPids.size() < baseFhirDao.getConfig().getIncludeLimit());

							if (previouslyLoadedPids.size() >= baseFhirDao.getConfig().getIncludeLimit()) {
								OperationOutcome oo = new OperationOutcome();
								oo.addIssue().setSeverity(IssueSeverityEnum.WARNING)
										.setDetails("Not all _include resources were actually included as the request surpassed the limit of " + baseFhirDao.getConfig().getIncludeLimit() + " resources");
								retVal.add(0, oo);
							}
						}

						return retVal;
					}

				});
			}

			@Override
			public Integer preferredPageSize() {
				return theParams.getCount();
			}

			@Override
			public int size() {
				return pids.size();
			}
		};

		ourLog.info("Processed search for {} on {} in {}ms", new Object[] { getResourceType(), theParams, w.getMillisAndRestart() });

		return retVal;
	}
	
	private void addResourcesAsIncludesById(List<IBaseResource> theListToPopulate, Set<? extends IIdType> includePids) {
		if (!includePids.isEmpty()) {
			ourLog.info("Loading {} included resources", includePids.size());
			Set<Long> pids = new HashSet<Long>();
			for (IIdType next : includePids) {
				if (next.isIdPartValidLong()) {
					pids.add(next.getIdPartAsLong());
				}
			}

			if (pids.isEmpty()) {
				return;
			}
			Class<?> theResourceEntity = null;
			try {
				String fieldName = getResourceEntity().newInstance().translateSearchParam(includePids.iterator().next().getResourceType().toLowerCase());
				Field includeField = FieldUtils.getField(getResourceEntity(), fieldName, true);
				theResourceEntity = includeField.getType();
			} catch (SecurityException e) {
				e.printStackTrace();
			} catch (InstantiationException e) {
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			}
			CriteriaBuilder builder = baseFhirDao.getEntityManager().getCriteriaBuilder();
			CriteriaQuery<?> cq = builder.createQuery(theResourceEntity);
			Root<?> from = cq.from(theResourceEntity);
			cq.where(from.get("id").in(pids));
			TypedQuery<?> q = baseFhirDao.getEntityManager().createQuery(cq);

			 for (Object next : q.getResultList()) {
				 IResource resource = (IResource) ((IResourceEntity)next).getRelatedResource();
				 theListToPopulate.add(resource);
			 }

			for (IBaseResource next : theListToPopulate) {
				ResourceMetadataKeyEnum.ENTRY_SEARCH_MODE.put((IResource) next, BundleEntrySearchModeEnum.INCLUDE);
			}
		}
	}
//
//
//
//@Override
//public void registerDaoListener(IDaoListener theListener) {
//// TODO Auto-generated method stub
//
//}
//
//@Override
//public DaoMethodOutcome delete(IIdType theId) {
//StopWatch w = new StopWatch();
////final BaseResourceEntity entity = readEntityLatestVersion(theId);
////if (theId.hasVersionIdPart() && theId.getVersionIdPartAsLong().longValue() != entity.getVersion()) {
////	throw new InvalidRequestException("Trying to update " + theId + " but this is not the current version");
////}
////
////BaseResourceEntity savedEntity = baseFhirDao.updateEntity(null, entity, true, new Date());
//BaseResourceEntity reference = (BaseResourceEntity) myEntityManager.getReference(myResourceEntity, theId.getIdPartAsLong());
//myEntityManager.remove(reference);
//
//myBaseFhirDao.notifyWriteCompleted();
//
//ourLog.info("Processed delete on {} in {}ms", theId.getValue(), w.getMillisAndRestart());
//return toMethodOutcome(reference, null);
//}
//
//@Override
//public DaoMethodOutcome deleteByUrl(String theString) {
//// TODO Auto-generated method stub
//return null;
//}
//
//@Override
//public TagList getAllResourceTags() {
//// TODO Auto-generated method stub
//return null;
//}
//
//@Override
//public IBundleProvider history(Date theSince) {
//return null;
//}
//
//@Override
//public IBundleProvider history(Long theId, Date theSince) {
//final InstantDt end = DaoUtils.createHistoryToTimestamp();
//int limit = 10000;
//AuditReader auditReader = AuditReaderFactory.get(myEntityManager);
//AuditQuery query = auditReader.createQuery().forRevisionsOfEntity(myResourceEntity, true, false).setMaxResults(limit);
//if(theId != null){
//	query.add(AuditEntity.id().eq(theId));
//}
//if(theSince != null){
//	query.add(AuditEntity.revisionNumber().ge(auditReader.getRevisionNumberForDate(theSince)));
//}
//query.addProjection(AuditEntity.revisionNumber());
//query.addOrder(AuditEntity.revisionNumber().asc());
//final List<Number> revs = query.getResultList();
//
//return new IBundleProvider() { 
//	
//	@Override
//	public int size() {
//		return revs.size();
//	}
//	
//	@Override
//	public Integer preferredPageSize() {
//		return null;
//	}
//	
//	@Override
//	public List<IBaseResource> getResources(final int theFromIndex,final int theToIndex) {
//		//final StopWatch timer = new StopWatch();
//		TransactionTemplate template = new TransactionTemplate(myPlatformTransactionManager);
//		return template.execute(new TransactionCallback<List<IBaseResource>>(){
//
//			@Override
//			public List<IBaseResource> doInTransaction(TransactionStatus status) {
//				ArrayList<IBaseResource> retVal = new ArrayList<IBaseResource>();
//				if(!revs.isEmpty()){
//					int limit = theToIndex - theFromIndex;
//					AuditReader auditReader = AuditReaderFactory.get(myEntityManager);
//					AuditQuery query = auditReader.createQuery().forRevisionsOfEntity(myResourceEntity, true, false).setMaxResults(limit);
//					query.add(AuditEntity.revisionNumber().in(revs.toArray(new Number[0])));
//					query.addOrder(AuditEntity.revisionNumber().asc());
//					List<? extends IResourceEntity> resEntities = query.getResultList();
//					if (resEntities.size() > limit) {
//						resEntities = resEntities.subList(0, limit);
//					}
//					for (int i = 0; i < resEntities.size(); i++) {
//						BaseResourceEntity entity = (BaseResourceEntity) resEntities.get(i);//WARNING works only for instances of BaseResourceEntity
//						entity.setVersion(revs.get(i).longValue());
//						IResource resource = entity.getRelatedResource();
//						retVal.add(resource);
//						
//					}
//				}
//				return retVal;
//			}
//		});
//	}
//	
//	@Override
//	public InstantDt getPublished() {
//		return end;
//	}
//};
//}
//
//@Override
//public IBundleProvider history(IIdType theId, Date theSince) {
//return history(theId.getIdPartAsLong(), theSince);//TODO add unit test
//}
//
//private AuditQuery getAuditQuery(Long theId, Date theSince){
//int limit = 10000;
//AuditReader auditReader = AuditReaderFactory.get(myEntityManager);
//AuditQuery query = auditReader.createQuery().forRevisionsOfEntity(myResourceEntity, true, false).setMaxResults(limit);
////query.add(AuditEntity.revisionNumber().in(values))
//return query;
//}
//
//@Override
//public DaoMethodOutcome update(T theResource) {
//return update(theResource, null);
//}
//
//@Override
//public DaoMethodOutcome update(T theResource, String theMatchUrl) {
//return update(theResource, theMatchUrl, true);
//}

	
	/**
	 * @hapi {@link BaseHapiFhirResourceDao#createSort(CriteriaBuilder, Root, SortSpec, List)}
	 * @param theBuilder
	 * @param from
	 * @param theSort
	 * @param theOrders
	 */
	protected void createSort(CriteriaBuilder theBuilder, Root<? extends IResourceEntity> from, SortSpec theSort, List<Order> theOrders) {
		if (theSort == null || isBlank(theSort.getParamName())) {
			return;
		}

		if ("_id".equals(theSort.getParamName())) {
			if (theSort.getOrder() == null || theSort.getOrder() == SortOrderEnum.ASC) {
				theOrders.add(theBuilder.asc(from.get("id")));
			} else {
				theOrders.add(theBuilder.desc(from.get("id")));
			}

			createSort(theBuilder, from, theSort.getChain(), theOrders);
			return;
		}

		RuntimeResourceDefinition resourceDef = getContext().getResourceDefinition(myResourceType);
		RuntimeSearchParam param = resourceDef.getSearchParam(theSort.getParamName());
		if (param == null) {
			throw new InvalidRequestException("Unknown sort parameter '" + theSort.getParamName() + "'");
		}

		//TODO new capability: Sort by any type of parameters; currently it's supported only sorting by Id
//		String joinAttrName;
//		String sortAttrName;
//
//		switch (param.getParamType()) {
//		case STRING:
//			joinAttrName = "myParamsString";
//			sortAttrName = "myValueExact";
//			break;
//		case DATE:
//			joinAttrName = "myParamsDate";
//			sortAttrName = "myValueLow";
//			break;
//		case REFERENCE:
//			joinAttrName = "myResourceLinks";
//			sortAttrName = "myTargetResourcePid";
//			break;
//		default:
//			throw new NotImplementedException("This server does not support _sort specifications of type " + param.getParamType() + " - Can't serve _sort=" + theSort.getParamName());
//		}
//
//		From<?, ?> stringJoin = theFrom.join(joinAttrName, JoinType.INNER);
//
//		if (theSort.getOrder() == null || theSort.getOrder() == SortOrderEnum.ASC) {
//			theOrders.add(theBuilder.asc(stringJoin.get(sortAttrName)));
//		} else {
//			theOrders.add(theBuilder.desc(stringJoin.get(sortAttrName)));
//		}

		createSort(theBuilder, from, theSort.getChain(), theOrders);
	}
	
	@Override
	public Set<Long> searchForIdsWithAndOr(SearchParameterMap theParams) {
		SearchParameterMap params = theParams;
		if (params == null) {
			params = new SearchParameterMap();
		}

		RuntimeResourceDefinition resourceDef = baseFhirDao.getContext().getResourceDefinition(myResourceType);

		Set<Long> pids = new HashSet<Long>();

		for (Entry<String, List<List<? extends IQueryParameterType>>> nextParamEntry : params.entrySet()) {
			String nextParamName = nextParamEntry.getKey();
			if (nextParamName.equals("_id")) {

				if (nextParamEntry.getValue().isEmpty()) {
					continue;
				} else if (nextParamEntry.getValue().size() > 1) {
					throw new InvalidRequestException("AND queries not supported for _id (Multiple instances of this param found)");
				} else {
					Set<Long> joinPids = new HashSet<Long>();
					List<? extends IQueryParameterType> nextValue = nextParamEntry.getValue().get(0);
					if (nextValue == null || nextValue.size() == 0) {
						continue;
					} else {
						for (IQueryParameterType next : nextValue) {
							String value = next.getValueAsQueryToken(myContext);
							IdDt valueId = new IdDt(value);
							try {
								if (DaoUtils.isValidPid(valueId)) {
									long valueLong =  valueId.getIdPartAsLong();
									joinPids.add(valueLong);
								}
							} catch (ResourceNotFoundException e) {
								// This isn't an error, just means no result found
							}
						}
						if (joinPids.isEmpty()) {
							continue;
						}
					}

					pids = myQueryHelper.searchById(pids, joinPids);
					if (pids.isEmpty()) {
						return new HashSet<Long>();
					}

//					if (pids.isEmpty()) {
//						pids.addAll(joinPids);
//					} else {
//						pids.retainAll(joinPids);
//					}
				}

//			} 
//			else if (nextParamName.equals("_language")) {
//
//				pids = addPredicateLanguage(pids, nextParamEntry.getValue());

			} else {
				RuntimeSearchParam nextParamDef = resourceDef.getSearchParam(nextParamName);
				if (nextParamDef != null) {
					switch (nextParamDef.getParamType()) {
					case DATE:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							pids = myQueryHelper.searchByDate(nextParamName, pids, nextAnd);
						}
						break;
					case QUANTITY:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							pids = myQueryHelper.searchByQuantity(nextParamName, pids, nextAnd);
						}
						break;
					case REFERENCE:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							pids = myQueryHelper.searchByReference(nextParamName, pids, nextAnd);
						}
						break;
					case STRING:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							pids = myQueryHelper.searchByString(nextParamName, pids, nextAnd);
						}
						break;
					case TOKEN:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							pids = myQueryHelper.searchByToken(nextParamName, pids, nextAnd);
						}
						break;
					case NUMBER:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							pids = myQueryHelper.searchByNumber(nextParamName, pids, nextAnd);
						}
						break;
					case COMPOSITE:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							pids = myQueryHelper.searchByComposite(nextParamDef, pids, nextAnd);
						}
						break;
					default:
						break;
					}
					if (pids.isEmpty()) {
						return new HashSet<Long>();
					}
				}
			}
		}

		return pids;
	}

	public void loadResourcesByPid(Collection<Long> theIncludePids, List<IBaseResource> theResourceListToPopulate, BundleEntrySearchModeEnum theBundleEntryStatus) {
		if (theIncludePids.isEmpty()) {
			return;
		}

		Map<Long, Integer> position = new HashMap<Long, Integer>();
		for (Long next : theIncludePids) {
			position.put(next, theResourceListToPopulate.size());
			theResourceListToPopulate.add(null);
		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Object[]> cq = builder.createQuery(Object[].class);
		Root<? extends IResourceEntity> from = cq.from(getResourceEntity());
		List<Selection<?>> selectionList = new ArrayList<Selection<?>>();
		selectionList.add(from);
		addJoins(from, selectionList);
		cq.multiselect(selectionList);
		cq.where(from.get("id").in(theIncludePids));
		TypedQuery<Object[]> q = myEntityManager.createQuery(cq);
		for (Object[] result : q.getResultList()) { 
			//Class<? extends IBaseResource> resourceType = baseFhirDao.getContext().getResourceDefinition(next.getResourceType()).getImplementingClass();
			IResourceEntity entity = transformResultToEntity(result, selectionList);
			IResource resource = entity.getRelatedResource ();
			Integer index = position.get(entity.getId());
			if (index == null) {
				ourLog.warn("Got back unexpected resource PID {}", entity.getId());
				continue;
			}

			ResourceMetadataKeyEnum.ENTRY_SEARCH_MODE.put(resource, theBundleEntryStatus);

			theResourceListToPopulate.set(index, resource);
		}
	}
		
	private IResourceEntity transformResultToEntity(Object[] result, List<Selection<?>> selectionList) {
		IResourceEntity entity =  (IResourceEntity) result[0];
		for (int i = 1; i < selectionList.size(); i++) {
			String alias = selectionList.get(i).getAlias();
			String ref = "";
			String attrName = alias.substring(0);
			Object refObj = entity;
			Object attrObj = null;
			try {
				do {
					ref = attrName.substring(0, attrName.indexOf('_'));
					attrName = attrName.substring(attrName.indexOf('_')+1);
					
					Field field = getDeclaredField(refObj.getClass(), ref);
					if (field != null) {
						field.setAccessible(true);
						attrObj = field.get(refObj);
						if (attrObj == null || HibernateProxy.class.isInstance(attrObj))
							attrObj = field.getType().newInstance();
						field.set(refObj, attrObj);
					}
					
					refObj = attrObj;
					
				} while(attrName.contains("_"));
				Field attrField = getDeclaredField(refObj.getClass(),attrName);
				if (attrField != null) {
					attrField.setAccessible(true);
					attrField.set(attrObj, result[i]);
				}
			} catch (SecurityException | IllegalArgumentException | IllegalAccessException | InstantiationException e) {
				e.printStackTrace();
			}
		}
		return entity;
	}
	
	public Field getDeclaredField(Class<?> type, String fieldName) {
		if(fieldName == null)
			return null;
		Field field = null;
	    for (Field f : type.getDeclaredFields()) { 
			if(fieldName.equals(f.getName())){
				field = f;
				break;
			}
		}
	    if (field == null && type.getSuperclass() != null) {
	        field = getDeclaredField(type.getSuperclass(), fieldName);
	    }

	    return field;
	}

	private void addJoins(Root<? extends IResourceEntity> from, List<Selection<?>> selectionList) {
		Field[] fields = from.getJavaType().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
//			Fetch fetch = fields[i].getDeclaredAnnotation(Fetch.class);
			JoinColumn joinColumnAnn = fields[i].getDeclaredAnnotation(JoinColumn.class);
			if(
					joinColumnAnn != null) {
//				fetch != null && fetch.value() == FetchMode.JOIN) {
				String joinAlias = fields[i].getName();
				Join<Object, Object> join = from.join(joinAlias, JoinType.LEFT);
				join.alias(joinAlias);
				addJoins(join, selectionList);
				
				selectionList.add( join.get("id").alias(joinAlias+"_id"));
				Class<?> declaringClass = fields[i].getType();
				FhirAttributesProvided attsAnnotation = declaringClass.getAnnotation(FhirAttributesProvided.class);
				if(attsAnnotation != null){
					String[] atts = attsAnnotation.attributes();
					for (int j = 0; j < atts.length; j++) {
						selectionList.add( join.get(atts[j]).alias(joinAlias+"_"+atts[j]));
					}
				}
			}
		}
	}

	private void addJoins(From<Object, Object> from, List<Selection<?>> selectionList) {
		Field[] fields = from.getJavaType().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			JoinColumn joinColumnAnn = fields[i].getDeclaredAnnotation(JoinColumn.class);
			if(joinColumnAnn != null) {
				Join<Object, Object> join = from.join(fields[i].getName(), JoinType.LEFT);
				String joinAlias = from.getAlias()+"_"+fields[i].getName();
				join.alias(joinAlias);
				addJoins(join, selectionList);
				
				Class<?> declaringClass = fields[i].getType();
				FhirAttributesProvided attsAnnotation = declaringClass.getAnnotation(FhirAttributesProvided.class);
				if(attsAnnotation != null){
					String[] atts = attsAnnotation.attributes();
					for (int j = 0; j < atts.length; j++) {
						selectionList.add( join.get(atts[j]).alias(joinAlias+"_"+atts[j]));
					}
				}
			}
		}		
	}

	public BaseFhirDao getBaseFhirDao() {
		return baseFhirDao;
	}

	public void setBaseFhirDao(BaseFhirDao baseFhirDao) {
		this.baseFhirDao = baseFhirDao;
	}

	@Override
	public DaoMethodOutcome delete(IIdType theId) {
		StopWatch w = new StopWatch();
		BaseResourceEntity reference = (BaseResourceEntity) baseFhirDao.getEntityManager().getReference(myResourceEntity, theId.getIdPartAsLong());
		baseFhirDao.getEntityManager().remove(reference);

		baseFhirDao.notifyWriteCompleted();

		ourLog.info("Processed delete on {} in {}ms", theId.getValue(), w.getMillisAndRestart());
		return toMethodOutcome(reference, null);
	}

	@Override
	public DaoMethodOutcome deleteByUrl(String theString) {
		// TODO new capability: delete by url should be supported in a later version
		return null;
	}


	@Override
	public IBundleProvider history(Date theSince) {
		return null;//history(null, theSince);
	}

	@Override
	public IBundleProvider history(Long theId, Date theSince) {
		final InstantDt end = DaoUtils.createHistoryToTimestamp();
		int limit = 10000;
		AuditReader auditReader = AuditReaderFactory.get(myEntityManager);
		AuditQuery query = auditReader.createQuery().forRevisionsOfEntity(myResourceEntity, true, false).setMaxResults(limit);
		if(theId != null){
			query.add(AuditEntity.id().eq(theId));
		}
		if(theSince != null){
			query.add(AuditEntity.revisionNumber().ge(auditReader.getRevisionNumberForDate(theSince)));
		}
		query.addProjection(AuditEntity.revisionNumber());
		query.addOrder(AuditEntity.revisionNumber().asc());
		final List<Number> revs = query.getResultList();
		
		return new IBundleProvider() { 
			
			@Override
			public int size() {
				return revs.size();
			}
			
			@Override
			public Integer preferredPageSize() {
				return null;
			}
			
			@Override
			public List<IBaseResource> getResources(final int theFromIndex,final int theToIndex) {
				//final StopWatch timer = new StopWatch();
				TransactionTemplate template = new TransactionTemplate(myPlatformTransactionManager);
				return template.execute(new TransactionCallback<List<IBaseResource>>(){

					@Override
					public List<IBaseResource> doInTransaction(TransactionStatus status) {
						ArrayList<IBaseResource> retVal = new ArrayList<IBaseResource>();
						if(!revs.isEmpty()){
							int limit = theToIndex - theFromIndex;
							AuditReader auditReader = AuditReaderFactory.get(myEntityManager);
							AuditQuery query = auditReader.createQuery().forRevisionsOfEntity(myResourceEntity, true, false).setMaxResults(limit);
							query.add(AuditEntity.revisionNumber().in(revs.toArray(new Number[0])));
							query.addOrder(AuditEntity.revisionNumber().asc());
							List<? extends IResourceEntity> resEntities = query.getResultList();
							if (resEntities.size() > limit) {
								resEntities = resEntities.subList(0, limit);
							}
							for (int i = 0; i < resEntities.size(); i++) {
								BaseResourceEntity entity = (BaseResourceEntity) resEntities.get(i);//WARNING works only for instances of BaseResourceEntity
								entity.setVersion(revs.get(i).longValue());
								IResource resource = entity.getRelatedResource();
								retVal.add(resource);
								
							}
						}
						return retVal;
					}
				});
			}
			
			@Override
			public InstantDt getPublished() {
				return end;
			}
		};
	}
	
	@Override
	public IBundleProvider history(IIdType theId, Date theSince) {
		return history(theId.getIdPartAsLong(), theSince);
	}
	
	private AuditQuery getAuditQuery(Long theId, Date theSince){
		int limit = 10000;
		AuditReader auditReader = AuditReaderFactory.get(myEntityManager);
		AuditQuery query = auditReader.createQuery().forRevisionsOfEntity(myResourceEntity, true, false).setMaxResults(limit);
//		query.add(AuditEntity.revisionNumber().in(values))
		return query;
	}

	@Override
	public DaoMethodOutcome update(T theResource) {
		return update(theResource, null);
	}

	@Override
	public DaoMethodOutcome update(T theResource, String theMatchUrl) {
		return update(theResource, theMatchUrl, true);
	}

	@Override
	public DaoMethodOutcome update(T theResource, String theMatchUrl,boolean thePerformIndexing) {
		StopWatch w = new StopWatch();

		preProcessResourceForStorage(theResource);

		final BaseResourceEntity entity;

		IIdType resourceId;
		if (isNotBlank(theMatchUrl)) {
			Set<Long> match = DaoUtils.processMatchUrl(theMatchUrl, myResourceType, myContext, getBaseFhirDao().getDao(myResourceType));
			if (match.size() > 1) {
				String msg = getContext().getLocalizer().getMessage(BaseFhirDao.class, "transactionOperationWithMultipleMatchFailure", "UPDATE", theMatchUrl, match.size());
				throw new PreconditionFailedException(msg);
			} else if (match.size() == 1) {
				Long pid = match.iterator().next();
				entity = (BaseResourceEntity) myEntityManager.find(myResourceEntity, pid);
				resourceId = entity.getIdDt();
			} else {
				return create(theResource, null, thePerformIndexing);
			}
		} else {
			resourceId = theResource.getId();
			if (resourceId == null || isBlank(resourceId.getIdPart())) {
				throw new InvalidRequestException("Can not update a resource with no ID");
			}
			try {
				entity = (BaseResourceEntity) myEntityManager.find(myResourceEntity, resourceId.getIdPartAsLong());
				if (entity == null) {
					// Spec says that with ID, we either update or create if not exits.
					return create(theResource, null, thePerformIndexing);
					//throw new ResourceNotFoundException(resourceId);
				}
//				validateGivenIdIsAppropriateToRetrieveResource(resourceId, entity);
			} catch (ResourceNotFoundException e) {
				if (Character.isDigit(theResource.getId().getIdPart().charAt(0))) {
					throw new InvalidRequestException(getContext().getLocalizer().getMessage(BaseFhirResourceDao.class, "failedToCreateWithClientAssignedNumericId", theResource.getId().getIdPart()));
				}
				return doCreate(theResource, null, thePerformIndexing);
			}
		}

		if (resourceId.hasVersionIdPart() && Long.parseLong(resourceId.getVersionIdPart()) != entity.getVersion()) {
			throw new InvalidRequestException("Trying to update " + resourceId + " but this is not the current version");
		}

		BaseResourceEntity savedEntity = baseFhirDao.updateEntity(theResource, entity, true, null, thePerformIndexing, true);

		baseFhirDao.notifyWriteCompleted();
		ourLog.info("Processed update on {} in {}ms", resourceId, w.getMillisAndRestart());
		return toMethodOutcome(savedEntity, theResource).setCreated(false);
	}
	
	protected void preProcessResourceForStorage(T theResource) {
		if(getContext().getVersion().getVersion() == FhirVersionEnum.DSTU2 && createBundle){
			Bundle bundle = (Bundle)theResource;
			if (bundle.getTypeElement().getValueAsEnum() != BundleTypeEnum.DOCUMENT) {
				String message = "Unable to store a Bundle resource on this server with a Bundle.type value other than '" + BundleTypeEnum.DOCUMENT.getCode() + "' - Value was: " + (bundle.getTypeElement().getValueAsEnum() != null ? bundle.getTypeElement().getValueAsEnum().getCode() : "(missing)");
				throw new UnprocessableEntityException(message);
			}
			
//			bundle.setBase((UriDt)null);
		}
	}

	@Override
	public void notifyWriteCompleted() {
		getBaseFhirDao().notifyWriteCompleted();
	}

	@Override
	public MethodOutcome validate(T theResource, IdDt theId, String theRawResource, EncodingEnum theEncoding, ValidationModeEnum theMode, String theProfile) {
		final OperationOutcome oo = new OperationOutcome();

		IParser parser = theEncoding.newParser(getBaseFhirDao().getContext());
		parser.setParserErrorHandler(new IParserErrorHandler() {

			@Override
			public void unknownAttribute(IParseLocation theLocation, String theAttributeName) {
				CodeableConceptDt detailTxt = new CodeableConceptDt(); 
				detailTxt.setText("Unknown attribute found: " + theAttributeName);
				oo.addIssue().setSeverity(IssueSeverityEnum.ERROR).setCode(IssueTypeEnum.INVALID_CONTENT).setDetails(detailTxt);
			}

			@Override
			public void unknownElement(IParseLocation theLocation, String theElementName) {
				CodeableConceptDt detailTxt = new CodeableConceptDt(); 
				detailTxt.setText("Unknown element found: " + theElementName);
				oo.addIssue().setSeverity(IssueSeverityEnum.ERROR).setCode(IssueTypeEnum.INVALID_CONTENT).setDetails(detailTxt);
			}

			@Override
			public void unexpectedRepeatingElement(IParseLocation theLocation, String theElementName) {
				CodeableConceptDt detailTxt = new CodeableConceptDt(); 
				detailTxt.setText("Multiple repetitions of non-repeatable element found: " + theElementName);
				oo.addIssue().setSeverity(IssueSeverityEnum.ERROR).setCode(IssueTypeEnum.INVALID_CONTENT).setDetails(detailTxt);
				
			}

			//@Override
			//public void unexpectedRepeatingElement(IParseLocation theLocation, String theElementName) {
			//	oo.addIssue().setSeverity(IssueSeverityEnum.ERROR).setCode(IssueTypeEnum.INVALID_CONTENT).setDetails("Multiple repetitions of non-repeatable element found: " + theElementName);
			//}
		});

		FhirValidator validator = getBaseFhirDao().getContext().newValidator();
		validator.setValidateAgainstStandardSchema(true);
		validator.setValidateAgainstStandardSchematron(true);
		ValidationResult result = validator.validateWithResult(theResource);
		OperationOutcome operationOutcome = (OperationOutcome) result.toOperationOutcome();
		for (BaseIssue next : operationOutcome.getIssue()) {
			oo.getIssue().add((Issue) next);
		}

		// This method returns a MethodOutcome object
		MethodOutcome retVal = new MethodOutcome();
		oo.addIssue().setSeverity(IssueSeverityEnum.INFORMATION).setDetails("Validation succeeded");
		retVal.setOperationOutcome(oo);
		
		return retVal;
	}


	@Override
	public void registerDaoListener(IDaoListener theListener) {
		getBaseFhirDao().registerDaoListener(theListener);
	}
}