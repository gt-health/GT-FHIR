package edu.gatech.i3l.fhir.jpa.dao;

import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import net.vidageek.mirror.dsl.Mirror;

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

import ca.uhn.fhir.context.RuntimeResourceDefinition;
import ca.uhn.fhir.context.RuntimeSearchParam;
import ca.uhn.fhir.jpa.dao.BaseFhirDao;
import ca.uhn.fhir.jpa.dao.DaoMethodOutcome;
import ca.uhn.fhir.jpa.dao.IFhirResourceDao;
import ca.uhn.fhir.jpa.dao.SearchParameterMap;
import ca.uhn.fhir.jpa.entity.BaseHasResource;
import ca.uhn.fhir.jpa.entity.ResourceIndexedSearchParamString;
import ca.uhn.fhir.jpa.util.StopWatch;
import ca.uhn.fhir.model.api.IPrimitiveDatatype;
import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.ResourceMetadataKeyEnum;
import ca.uhn.fhir.model.base.composite.BaseResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.OperationOutcome;
import ca.uhn.fhir.model.dstu2.valueset.IssueSeverityEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.valueset.BundleEntrySearchModeEnum;
import ca.uhn.fhir.rest.param.DateParam;
import ca.uhn.fhir.rest.param.DateRangeParam;
import ca.uhn.fhir.rest.param.StringParam;
import ca.uhn.fhir.rest.param.TokenParam;
import ca.uhn.fhir.rest.server.IBundleProvider;
import ca.uhn.fhir.rest.server.SimpleBundleProvider;
import ca.uhn.fhir.rest.server.exceptions.InvalidRequestException;
import ca.uhn.fhir.rest.server.exceptions.PreconditionFailedException;
import ca.uhn.fhir.rest.server.exceptions.ResourceGoneException;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;
import ca.uhn.fhir.rest.server.exceptions.UnprocessableEntityException;
import ca.uhn.fhir.util.FhirTerser;
import edu.gatech.i3l.jpa.model.omop.BaseResourceTable;
import edu.gatech.i3l.jpa.model.omop.IResourceTable;

/**
 * This class serves as Template with commmon dao functions that are meant to be extended by subclasses.
 * @author Ismael Sarmento
 */
@Transactional(propagation = Propagation.REQUIRED)
public abstract class BaseFhirResourceDao<T extends IResource> extends BaseFhirDao implements IFhirResourceDao<T>{
	
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(BaseFhirResourceDao.class);
	
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;
	
	@Autowired
	private PlatformTransactionManager myPlatformTransactionManager;
	
	private Class<T> myResourceType;
	private Class<? extends BaseResourceTable> myResourceTable;

	@Override
	public Class<T> getResourceType() {
		return myResourceType;
	}
	
	@SuppressWarnings("unchecked")
	@Required
	public void setResourceType(Class<? extends IResource> theTableType) {
		myResourceType = (Class<T>) theTableType;
	}

	public Class<? extends BaseResourceTable> getResourceTable() {
		return myResourceTable;
	}

	public void setResourceTable(Class<? extends BaseResourceTable> resourceTable) {
		this.myResourceTable = resourceTable;
	}
	
	/*
	 ****************************** 
	 * METHODS WITH STRUCTURE OF ca.uhn.BaseFhirResourceDao
	 *****************************/
	
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
		if (isNotBlank(theResource.getId().getIdPart())) {
			throw new InvalidRequestException(getContext().getLocalizer().getMessage(BaseFhirResourceDao.class, "failedToCreateWithClientAssignedId", theResource.getId().getIdPart()));
		}

		return doCreate(theResource, theIfNoneExist, thePerformIndexing);
	}
	
	private DaoMethodOutcome doCreate(T theResource, String theIfNoneExist, boolean thePerformIndexing) {
		StopWatch w = new StopWatch();
		BaseResourceTable entity = new Mirror().on(myResourceTable).invoke().constructor().withoutArgs();
		//entity.setResourceType(toResourceName(theResource));

		if (isNotBlank(theIfNoneExist)) {
			Set<Long> match = processMatchUrl(theIfNoneExist, myResourceType);
			if (match.size() > 1) {
				String msg = getContext().getLocalizer().getMessage(BaseFhirDao.class, "transactionOperationWithMultipleMatchFailure", "CREATE", theIfNoneExist, match.size());
				throw new PreconditionFailedException(msg);
			} else if (match.size() == 1) {
				Long pid = match.iterator().next();
				entity = myEntityManager.find(BaseResourceTable.class, pid);
				return toMethodOutcome(entity, theResource).setCreated(false);
			}
		}

		if (theResource.getId().isEmpty() == false) {
			if (isValidPid(theResource.getId())) {
				throw new UnprocessableEntityException(
						"This server cannot create an entity with a user-specified numeric ID - Client should not specify an ID when creating a new resource, or should include at least one letter in the ID to force a client-defined ID");
			}
			//createForcedIdIfNeeded(entity, theResource.getId()); //WARNING should force id

			if (entity.getForcedId() != null) {
				try {
					translateForcedIdToPid(theResource.getId());
					throw new UnprocessableEntityException(getContext().getLocalizer().getMessage(BaseFhirResourceDao.class, "duplicateCreateForcedId", theResource.getId().getIdPart()));
				} catch (ResourceNotFoundException e) {
					// good, this ID doesn't exist so we can create it
				}
			}

		}

		//updateEntity(theResource, entity, false, null, thePerformIndexing, true);

		DaoMethodOutcome outcome = toMethodOutcome(entity, theResource).setCreated(true);

		notifyWriteCompleted();
		ourLog.info("Processed create on {} in {}ms", myResourceType, w.getMillisAndRestart());//WARNING once it was resource name
		return outcome;
	}
	
	private DaoMethodOutcome toMethodOutcome(final BaseResourceTable theEntity, IResource theResource) {
		DaoMethodOutcome outcome = new DaoMethodOutcome();
		outcome.setId(theEntity.getIdDt());
		//outcome.setEntity(theEntity); //WARNING ignored statement
		outcome.setResource(theResource);
		if (theResource != null) {
			theResource.setId(theEntity.getIdDt());
		}
		return outcome;
	}
	
	@Override
	public T read(IdDt theId) {
//		validateResourceTypeAndThrowIllegalArgumentException(theId);

		StopWatch w = new StopWatch();
		BaseResourceTable entity = (BaseResourceTable) readEntity(theId);
//		validateResourceType(entity);

		T retVal = entity.getRelatedResource();//toResource(myResourceType, entity);

		InstantDt deleted = ResourceMetadataKeyEnum.DELETED_AT.get(retVal);
		if (deleted != null && !deleted.isEmpty()) {
			throw new ResourceGoneException("Resource was deleted at " + deleted.getValueAsString());
		}

		ourLog.info("Processed read on {} in {}ms", theId.getValue(), w.getMillisAndRestart());
		return retVal;
	}
	
	//	private void validateResourceType(BaseHasResource entity) {
	//		if (!myResourceName.equals(entity.getResourceType())) {
	//			throw new ResourceNotFoundException("Resource with ID " + entity.getIdDt().getIdPart() + " exists but it is not of type " + myResourceName + ", found resource of type "
	//					+ entity.getResourceType());
	//		}
	//	}
	//	
	//	private void validateResourceTypeAndThrowIllegalArgumentException(IdDt theId) {
	//		if (theId.hasResourceType() && !theId.getResourceType().equals(myResourceName)) {
	//			throw new IllegalArgumentException("Incorrect resource type (" + theId.getResourceType() + ") for this DAO, wanted: " + myResourceName);
	//		}
	//	}


	@Override
	public BaseHasResource readEntity(IdDt theId) {
		boolean checkForForcedId = true;
	
		BaseHasResource entity = readEntity(theId, checkForForcedId);
	
		return entity;
	}
	
	@Override
	public BaseHasResource readEntity(IdDt theId, boolean theCheckForForcedId) {
		//validateResourceTypeAndThrowIllegalArgumentException(theId);
	
		Long pid = theId.getIdPartAsLong();//translateForcedIdToPid(theId); //WARNING ForcedId strategy 
		BaseHasResource entity = myEntityManager.find(getResourceTable(), pid);
	//	if (theId.hasVersionIdPart()) { //FIXME implement the versioning check
	//		if (entity.getVersion() != theId.getVersionIdPartAsLong()) {
	//			entity = null;
	//		}
	//	}
	//
	//	if (entity == null) {
	//		if (theId.hasVersionIdPart()) {
	//			TypedQuery<ResourceHistoryTable> q = myEntityManager.createQuery(
	//					"SELECT t from ResourceHistoryTable t WHERE t.myResourceId = :RID AND t.myResourceType = :RTYP AND t.myResourceVersion = :RVER", ResourceHistoryTable.class);
	//			q.setParameter("RID", pid);
	//			q.setParameter("RTYP", myResourceType);//WARNING originally myResourceName
	//			q.setParameter("RVER", theId.getVersionIdPartAsLong());
	//			entity = q.getSingleResult();
	//		}
	//		if (entity == null) {
	//			throw new ResourceNotFoundException(theId);
	//		}
	//	}
	
		//validateResourceType(entity);
	
		if (theCheckForForcedId) {
			//validateGivenIdIsAppropriateToRetrieveResource(theId, entity);//WARNING checks for forcedId
		}
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
	
	@Override
	public IBundleProvider search(final SearchParameterMap theParams) {
		StopWatch w = new StopWatch();
		final InstantDt now = InstantDt.withCurrentTime();

		Set<Long> loadPids;
		if (theParams.isEmpty()) {
			CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
			CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
			Root<? extends BaseResourceTable> from = criteria.from(getResourceTable());
			criteria.select(from.get("id").as(Long.class));
			List<Long> resultList = myEntityManager.createQuery(criteria).getResultList();
			loadPids = new HashSet<Long>(resultList);
		} else {
			loadPids = searchForIdsWithAndOr(theParams);
			if (loadPids.isEmpty()) {
				return new SimpleBundleProvider();
			}
		}

		final List<Long> pids= new ArrayList<Long>(loadPids);
		//TODO removed sort excerpt
		
		// Load _revinclude resources
		if (theParams.getRevIncludes() != null && theParams.getRevIncludes().isEmpty() == false) {
			//loadReverseIncludes(pids, theParams.getRevIncludes()); //FIXME Fix loadReverseIncludes method
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
							List<IBaseResource> resources = retVal;
							do {
								includePids.clear();

								FhirTerser t = getContext().newTerser();
								for (Include next : theParams.getIncludes()) {
									for (IBaseResource nextResource : resources) {
										RuntimeResourceDefinition def = getContext().getResourceDefinition(nextResource);
										List<Object> values = getIncludeValues(t, next, nextResource, def);

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

								resources = addResourcesAsIncludesById(retVal, includePids, resources);
							} while (includePids.size() > 0 && previouslyLoadedPids.size() < getConfig().getIncludeLimit());

							if (previouslyLoadedPids.size() >= getConfig().getIncludeLimit()) {
								OperationOutcome oo = new OperationOutcome();
								oo.addIssue().setSeverity(IssueSeverityEnum.WARNING)
										.setDetails("Not all _include resources were actually included as the request surpassed the limit of " + getConfig().getIncludeLimit() + " resources");
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

//		ourLog.info("Processed search for {} on {} in {}ms", new Object[] { myResourceName, theParams, w.getMillisAndRestart() });
		ourLog.info("Processed search for {} on {} in {}ms", new Object[] { getResourceType(), theParams, w.getMillisAndRestart() });

		return retVal;
	}
	
	@Override
	public Set<Long> searchForIdsWithAndOr(SearchParameterMap theParams) {
		SearchParameterMap params = theParams;
		if (params == null) {
			params = new SearchParameterMap();
		}

		RuntimeResourceDefinition resourceDef = getContext().getResourceDefinition(myResourceType);

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
							String value = next.getValueAsQueryToken();
							IdDt valueId = new IdDt(value);
							try {
								if (isValidPid(valueId)) {
									long valueLong =  valueId.getIdPartAsLong();
									//translateForcedIdToPid(valueId); //WARNING altered line
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

					pids = addPredicateId(pids, joinPids);
					if (pids.isEmpty()) {
						return new HashSet<Long>();
					}

					if (pids.isEmpty()) {
						pids.addAll(joinPids);
					} else {
						pids.retainAll(joinPids);
					}
				}

			} 
			else if (nextParamName.equals("_language")) {

				//pids = addPredicateLanguage(pids, nextParamEntry.getValue());

			} else {

				RuntimeSearchParam nextParamDef = resourceDef.getSearchParam(nextParamName);
				if (nextParamDef != null) {
					switch (nextParamDef.getParamType()) {
					case DATE:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							pids = addPredicateDate(nextParamName, pids, nextAnd);
							if (pids.isEmpty()) {
								return new HashSet<Long>();
							}
						}
						break;
					case QUANTITY:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							//pids = addPredicateQuantity(nextParamName, pids, nextAnd);
							if (pids.isEmpty()) {
								return new HashSet<Long>();
							}
						}
						break;
					case REFERENCE:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							//pids = addPredicateReference(nextParamName, pids, nextAnd);
							if (pids.isEmpty()) {
								return new HashSet<Long>();
							}
						}
						break;
					case STRING:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							pids = addPredicateString(nextParamName, pids, nextAnd);
							if (pids.isEmpty()) {
								return new HashSet<Long>();
							}
						}
						break;
					case TOKEN:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							//pids = addPredicateToken(nextParamName, pids, nextAnd);
							if (pids.isEmpty()) {
								return new HashSet<Long>();
							}
						}
						break;
					case NUMBER:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							//pids = addPredicateNumber(nextParamName, pids, nextAnd);
							if (pids.isEmpty()) {
								return new HashSet<Long>();
							}
						}
						break;
					case COMPOSITE:
						for (List<? extends IQueryParameterType> nextAnd : nextParamEntry.getValue()) {
							//pids = addPredicateComposite(nextParamDef, pids, nextAnd);
							if (pids.isEmpty()) {
								return new HashSet<Long>();
							}
						}
						break;
					default:
						break;
					}
				}
			}
		}

		return pids;
	}
	
//	protected void loadReverseIncludes(List<Long> theMatches, Set<Include> theRevIncludes) {
//	if (theMatches.size() == 0) {
//		return;
//	}
//
//	HashSet<Long> pidsToInclude = new HashSet<Long>();
//
//	for (Include nextInclude : theRevIncludes) {
//		boolean matchAll = "*".equals(nextInclude.getValue());
//		if (matchAll) {
//			String sql = "SELECT r FROM ResourceLink r WHERE r.myTargetResourcePid IN (:target_pids)";
//			TypedQuery<ResourceLink> q = myEntityManager.createQuery(sql, ResourceLink.class);
//			q.setParameter("target_pids", theMatches);
//			List<ResourceLink> results = q.getResultList();
//			for (ResourceLink resourceLink : results) {
//				pidsToInclude.add(resourceLink.getSourceResourcePid());
//			}
//		} else {
//			int colonIdx = nextInclude.getValue().indexOf(':');
//			if (colonIdx < 2) {
//				continue;
//			}
//			String resType = nextInclude.getValue().substring(0, colonIdx);
//			RuntimeResourceDefinition def = getContext().getResourceDefinition(resType);
//			if (def == null) {
//				ourLog.warn("Unknown resource type in _revinclude=" + nextInclude.getValue());
//				continue;
//			}
//
//			String paramName = nextInclude.getValue().substring(colonIdx + 1);
//			RuntimeSearchParam param = def.getSearchParam(paramName);
//			if (param == null) {
//				ourLog.warn("Unknown param name in _revinclude=" + nextInclude.getValue());
//				continue;
//			}
//
//			for (String nextPath : param.getPathsSplit()) {
//				String sql = "SELECT r FROM ResourceLink r WHERE r.mySourcePath = :src_path AND r.myTargetResourcePid IN (:target_pids)";
//				TypedQuery<ResourceLink> q = myEntityManager.createQuery(sql, ResourceLink.class);
//				q.setParameter("src_path", nextPath);
//				q.setParameter("target_pids", theMatches);
//				List<ResourceLink> results = q.getResultList();
//				for (ResourceLink resourceLink : results) {
//					pidsToInclude.add(resourceLink.getSourceResourcePid());
//				}
//			}
//		}
//	}
//
//	theMatches.addAll(pidsToInclude);
//}

	
	protected List<Object> getIncludeValues(FhirTerser theTerser, Include theInclude, IBaseResource theResource, RuntimeResourceDefinition theResourceDef) {
		List<Object> values;
		if ("*".equals(theInclude.getValue())) {
			values = new ArrayList<Object>();
			values.addAll(theTerser.getAllPopulatedChildElementsOfType(theResource, BaseResourceReferenceDt.class));
		} else if (theInclude.getValue().startsWith(theResourceDef.getName() + ":")) {
			values = new ArrayList<Object>();
			RuntimeSearchParam sp = theResourceDef.getSearchParam(theInclude.getValue().substring(theInclude.getValue().indexOf(':')+1));
			for (String nextPath : sp.getPathsSplit()) {
				values.addAll(theTerser.getValues(theResource, nextPath));
			}
		} else {
			values = Collections.emptyList();
		}
		return values;
	}
	
	private void loadResourcesByPid(Collection<Long> theIncludePids, List<IBaseResource> theResourceListToPopulate, BundleEntrySearchModeEnum theBundleEntryStatus) {
		if (theIncludePids.isEmpty()) {
			return;
		}

		Map<Long, Integer> position = new HashMap<Long, Integer>();
		for (Long next : theIncludePids) {
			position.put(next, theResourceListToPopulate.size());
			theResourceListToPopulate.add(null);
		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		@SuppressWarnings("unchecked")
		CriteriaQuery<BaseResourceTable> cq = (CriteriaQuery<BaseResourceTable>) builder.createQuery(getResourceTable());
		@SuppressWarnings("unchecked")
		Root<BaseResourceTable> from = (Root<BaseResourceTable>) cq.from(getResourceTable());
		cq.select(from);
		cq.where(from.get("id").in(theIncludePids));
		TypedQuery<BaseResourceTable> q = myEntityManager.createQuery(cq);

		for (BaseResourceTable entity : q.getResultList()) { 
			//Class<? extends IBaseResource> resourceType = getContext().getResourceDefinition(next.getResourceType()).getImplementingClass();
			IResource resource = entity.getRelatedResource();
			Integer index = position.get(entity.getId());
			if (index == null) {
				ourLog.warn("Got back unexpected resource PID {}", entity.getId());
				continue;
			}

			ResourceMetadataKeyEnum.ENTRY_SEARCH_MODE.put(resource, theBundleEntryStatus);

			theResourceListToPopulate.set(index, resource);
		}
	}
	
	private List<IBaseResource> addResourcesAsIncludesById(List<IBaseResource> theListToPopulate, Set<? extends IIdType> includePids, List<IBaseResource> resources) {
		if (!includePids.isEmpty()) {
			ourLog.info("Loading {} included resources", includePids.size());
			resources = loadResourcesById(includePids);
			for (IBaseResource next : resources) {
				ResourceMetadataKeyEnum.ENTRY_SEARCH_MODE.put((IResource) next, BundleEntrySearchModeEnum.INCLUDE);
			}
			theListToPopulate.addAll(resources);
		}
		return resources;
	}
	
	
	
	/*
	 * **********************
	 * PREDICATES
	 * **********************
	 */
	protected Set<Long> addPredicateId(Set<Long> theExistingPids, Set<Long> thePids) {
		if (thePids == null || thePids.isEmpty()) {
			return Collections.emptySet();
		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		Root<? extends BaseResourceTable> from = cq.from(getResourceTable());
		cq.select(from.get("id").as(Long.class)); 
		Predicate idPrecidate = from.get("id").in(thePids);
		cq.where(idPrecidate);
		TypedQuery<Long> q = myEntityManager.createQuery(cq);
		HashSet<Long> found = new HashSet<Long>(q.getResultList());
		if (!theExistingPids.isEmpty()) {
			theExistingPids.retainAll(found);
		}

		return found;
	}
	
	protected Set<Long> addPredicateDate(String theParamName, Set<Long> thePids, List<? extends IQueryParameterType> theList) {
		if (theList == null || theList.isEmpty()) {
			return thePids;
		}

//		if (Boolean.TRUE.equals(theList.get(0).getMissing())) {
//			return addPredicateParamMissing(thePids, "myParamsDate", theParamName, ResourceIndexedSearchParamDate.class);
//		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		Root<? extends BaseResourceTable> from = cq.from(getResourceTable());
		cq.select(from.get("id").as(Long.class));
		
//		Root<ResourceIndexedSearchParamDate> from = cq.from(ResourceIndexedSearchParamDate.class);
//		cq.select(from.get("myResourcePid").as(Long.class));
//
		List<Predicate> codePredicates = new ArrayList<Predicate>();
		for (IQueryParameterType nextOr : theList) {
			
			if (addPredicateMissingFalseIfPresent(builder, theParamName, from, codePredicates, nextOr)) {
				continue;
			}

			IQueryParameterType params = nextOr;
			Predicate p = createPredicateDate(builder, from, theParamName, params);
			codePredicates.add(p);
		}

		Predicate masterCodePredicate = builder.or(codePredicates.toArray(new Predicate[0]));

//		Predicate type = builder.equal(from.get("myResourceType"), myResourceType);
//		Predicate name = builder.equal(from.get("myParamName"), theParamName);
		if (thePids.size() > 0) {
			Predicate inPids = (from.get("id").in(thePids));//WARNING included previously 'name' 'type' and 'masterCodePredicate'
			cq.where(builder.and(inPids, masterCodePredicate));
		} else {
			cq.where(builder.and(masterCodePredicate));
		}

		TypedQuery<Long> q = myEntityManager.createQuery(cq);
		return new HashSet<Long>(q.getResultList());
	}
	
	protected Predicate createPredicateDate(CriteriaBuilder theBuilder, Root<? extends IResourceTable> from, String theParamName, IQueryParameterType theParam) {
		Predicate p;
		if (theParam instanceof DateParam) {
			DateParam date = (DateParam) theParam;
			if (!date.isEmpty()) {
				DateRangeParam range = new DateRangeParam(date);
				p = createPredicateDateFromRange(theBuilder, from, range, theParamName, theParam);
			} else {
				// From original method: TODO: handle missing date param?
				p = null;
			}
		} else if (theParam instanceof DateRangeParam) {
			DateRangeParam range = (DateRangeParam) theParam;
			p = createPredicateDateFromRange(theBuilder, from, range, theParamName, theParam);
		} else {
			throw new IllegalArgumentException("Invalid token type: " + theParam.getClass());
		}
		return p;
	}
	
	protected Predicate createPredicateDateFromRange(CriteriaBuilder theBuilder, Root<? extends IResourceTable> from, DateRangeParam theRange, String theParamName, IQueryParameterType theParam) {
		Date lowerBound = theRange.getLowerBoundAsInstant();
		Date upperBound = theRange.getUpperBoundAsInstant();

		Predicate lb = null;
		if (lowerBound != null) {
			lb = translatePredicateDateGreaterThan(theParamName, lowerBound, from, theBuilder); 
		}

		Predicate ub = null;
		if (upperBound != null) {
			ub = translatePredicateDateLessThan(theParamName, upperBound, from, theBuilder); 
		}

		if (lb != null && ub != null) {
			return (theBuilder.and(lb, ub));
		} else if (lb != null) {
			return (lb);
		} else {
			return (ub);
		}
	}
	
	private Predicate createPredicateString(IQueryParameterType theParameter, String theParamName, CriteriaBuilder theBuilder,
			Root<? extends BaseResourceTable> from) {
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

		if (rawSearchTerm.length() > ResourceIndexedSearchParamString.MAX_LENGTH) {
			throw new InvalidRequestException("Parameter[" + theParamName + "] has length (" + rawSearchTerm.length() + ") that is longer than maximum allowed ("
					+ ResourceIndexedSearchParamString.MAX_LENGTH + "): " + rawSearchTerm);
		}

		String likeExpression = normalizeString(rawSearchTerm);
		likeExpression = likeExpression.replace("%", "[%]") + "%";
		Predicate singleCode = translatePredicateString(theParamName, likeExpression, from, theBuilder);
//		Predicate singleCode = theBuilder.like(from.get("myValueNormalized").as(String.class), likeExpression);
//		Predicate singleCode = theBuilder.like(from.get("myValueNormalized").as(String.class), likeExpression);
//		if (theParameter instanceof StringParam && ((StringParam) theParameter).isExact()) {
//			Predicate exactCode = theBuilder.equal(from.get("myValueExact"), rawSearchTerm);
//			singleCode = theBuilder.and(singleCode, exactCode);
//		}
		return singleCode;
	}
	
	public abstract Predicate translatePredicateString(String theParamName, String likeExpression, Root<? extends IResourceTable> from, CriteriaBuilder theBuilder);
	public abstract Predicate translatePredicateDateLessThan(String theParamName, Date upperBound, Root<? extends IResourceTable> from, CriteriaBuilder theBuilder);
	public abstract Predicate translatePredicateDateGreaterThan(String theParamName, Date lowerBound, Root<? extends IResourceTable> from, CriteriaBuilder theBuilder);
	
	private Set<Long> addPredicateString(String theParamName, Set<Long> thePids, List<? extends IQueryParameterType> theList) {
		if (theList == null || theList.isEmpty()) {
			return thePids;
		}

		if (Boolean.TRUE.equals(theList.get(0).getMissing())) {
//			return addPredicateParamMissing(thePids, "myParamsString", theParamName, getResourceTable());
			System.err.println(); //WARNING
		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
		Root<? extends BaseResourceTable> from = cq.from(getResourceTable());
		cq.select(from.get("id").as(Long.class));

		List<Predicate> codePredicates = new ArrayList<Predicate>();
		for (IQueryParameterType nextOr : theList) {
			IQueryParameterType theParameter = nextOr;
			if (addPredicateMissingFalseIfPresent(builder, theParamName, from, codePredicates, nextOr)) {
				continue;
			}
			
			Predicate singleCode = createPredicateString(theParameter, theParamName, builder, from);
			codePredicates.add(singleCode);
		}

		Predicate masterCodePredicate = builder.or(codePredicates.toArray(new Predicate[0]));

//		Predicate type = builder.equal(from.get("myResourceType"), myResourceName);
//		Predicate name = builder.equal(from.get("myParamName"), theParamName);
		if (thePids.size() > 0) {
			Predicate inPids = (from.get("myResourcePid").in(thePids));
			cq.where(builder.and(//type, name, 
					masterCodePredicate, inPids));
		} else {
			cq.where(builder.and(//type, name, 
					masterCodePredicate));
		}

		TypedQuery<Long> q = myEntityManager.createQuery(cq);
		return new HashSet<Long>(q.getResultList());
	}
	
//	protected Set<Long> addPredicateParamMissing(Set<Long> thePids, String joinName, String theParamName, Class<? extends BaseResourceIndexedSearchParam> theParamTable) {
//		String resourceType = getContext().getResourceDefinition(getResourceType()).getName();
//
//		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
//		CriteriaQuery<Long> cq = builder.createQuery(Long.class);
//		Root<ResourceTable> from = cq.from(ResourceTable.class);
//		cq.select(from.get("myId").as(Long.class));
//
//		Subquery<Long> subQ = cq.subquery(Long.class);
//		Root<? extends BaseResourceIndexedSearchParam> subQfrom = subQ.from(theParamTable); 
//		subQ.select(subQfrom.get("myResourcePid").as(Long.class));
//		Predicate subQname = builder.equal(subQfrom.get("myParamName"), theParamName);
//		Predicate subQtype = builder.equal(subQfrom.get("myResourceType"), resourceType);
//		subQ.where(builder.and(subQtype, subQname));
//
//		Predicate joinPredicate = builder.not(builder.in(from.get("myId")).value(subQ));
//		Predicate typePredicate = builder.equal(from.get("myResourceType"), resourceType);
//		
//		if (thePids.size() > 0) {
//			Predicate inPids = (from.get("myId").in(thePids));
//			cq.where(builder.and(inPids, typePredicate, joinPredicate));
//		} else {
//			cq.where(builder.and(typePredicate, joinPredicate));
//		}
//		
//		ourLog.info("Adding :missing qualifier for parameter '{}'", theParamName);
//		
//		TypedQuery<Long> q = myEntityManager.createQuery(cq);
//		List<Long> resultList = q.getResultList();
//		HashSet<Long> retVal = new HashSet<Long>(resultList);
//		return retVal;
//	}
	
	protected boolean addPredicateMissingFalseIfPresent(CriteriaBuilder theBuilder, String theParamName, Root<? extends IResourceTable> from, List<Predicate> codePredicates, IQueryParameterType nextOr) {
		boolean missingFalse = false;
		if (nextOr.getMissing() != null) {
			if (nextOr.getMissing().booleanValue() == true) {
				throw new InvalidRequestException(getContext().getLocalizer().getMessage(BaseFhirResourceDao.class, "multipleParamsWithSameNameOneIsMissingTrue", theParamName));
			}
			Predicate singleCode = from.get("myId").isNotNull();
			Predicate name = theBuilder.equal(from.get("myParamName"), theParamName);
			codePredicates.add(theBuilder.and(name, singleCode));
			missingFalse = true;
		}
		return missingFalse;
	}


}