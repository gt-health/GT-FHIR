package edu.gatech.i3l.fhir.jpa.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

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
import ca.uhn.fhir.context.RuntimeResourceDefinition;
import ca.uhn.fhir.context.RuntimeSearchParam;
import ca.uhn.fhir.jpa.dao.BaseFhirDao;
import ca.uhn.fhir.jpa.dao.DaoMethodOutcome;
import ca.uhn.fhir.jpa.dao.IDaoListener;
import ca.uhn.fhir.jpa.dao.IFhirResourceDao;
import ca.uhn.fhir.jpa.dao.SearchParameterMap;
import ca.uhn.fhir.jpa.entity.BaseHasResource;
import ca.uhn.fhir.jpa.entity.ResourceLink;
import ca.uhn.fhir.jpa.entity.TagTypeEnum;
import ca.uhn.fhir.jpa.util.StopWatch;
import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.Include;
import ca.uhn.fhir.model.api.ResourceMetadataKeyEnum;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.base.composite.BaseResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.MetaDt;
import ca.uhn.fhir.model.dstu2.resource.OperationOutcome;
import ca.uhn.fhir.model.dstu2.valueset.IssueSeverityEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.valueset.BundleEntrySearchModeEnum;
import ca.uhn.fhir.rest.server.IBundleProvider;
import ca.uhn.fhir.rest.server.SimpleBundleProvider;
import ca.uhn.fhir.rest.server.exceptions.InvalidRequestException;
import ca.uhn.fhir.util.FhirTerser;
import edu.gatech.i3l.jpa.model.omop.IResourceTable;
import edu.gatech.i3l.jpa.model.omop.Person;
import edu.gatech.i3l.jpa.model.omop.ext.PatientFhirExtTable;

@Transactional(propagation = Propagation.REQUIRED)
public class FhirResourceDao<T extends IResource> extends BaseFhirDao implements IFhirResourceDao<T>{

	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(FhirResourceDao.class);

	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;

	private FhirContext myContext;
	
	@Autowired
	private PlatformTransactionManager myPlatformTransactionManager;

	private String myResourceName;
	private Class<T> myResourceType;

	@Override
	public void registerDaoListener(IDaoListener theListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTag(IdDt theId, TagTypeEnum theTagType, String theScheme,
			String theTerm, String theLabel) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public DaoMethodOutcome create(T theResource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome create(T theResource, String theIfNoneExist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome create(T theResource, String theIfNoneExist,
			boolean thePerformIndexing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome delete(IdDt theResource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome deleteByUrl(String theString) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TagList getAllResourceTags() {
		// TODO Auto-generated method stub
		return null;
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

	@Override
	public TagList getTags(IdDt theResourceId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBundleProvider history(Date theSince) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBundleProvider history(IdDt theId, Date theSince) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBundleProvider history(Long theId, Date theSince) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T read(IdDt theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseHasResource readEntity(IdDt theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BaseHasResource readEntity(IdDt theId, boolean theCheckForForcedId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeTag(IdDt theId, TagTypeEnum theTagType, String theScheme,
			String theTerm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IBundleProvider search(Map<String, IQueryParameterType> theParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IBundleProvider search(final SearchParameterMap theParams) {
		StopWatch w = new StopWatch();
		final InstantDt now = InstantDt.withCurrentTime();

		Set<Long> loadPids;
		if (theParams.isEmpty()) {
			CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
			CriteriaQuery<Long> criteria = builder.createQuery(Long.class); //TODO this should be a base dao and not a specific one
			Root<Person> from = criteria.from(Person.class);
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
			loadReverseIncludes(pids, theParams.getRevIncludes());
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

		ourLog.info("Processed search for {} on {} in {}ms", new Object[] { myResourceName, theParams, w.getMillisAndRestart() });

		return retVal;
	}
	
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
	
	protected void loadReverseIncludes(List<Long> theMatches, Set<Include> theRevIncludes) {
		if (theMatches.size() == 0) {
			return;
		}

		HashSet<Long> pidsToInclude = new HashSet<Long>();

		for (Include nextInclude : theRevIncludes) {
			boolean matchAll = "*".equals(nextInclude.getValue());
			if (matchAll) {
				String sql = "SELECT r FROM ResourceLink r WHERE r.myTargetResourcePid IN (:target_pids)";
				TypedQuery<ResourceLink> q = myEntityManager.createQuery(sql, ResourceLink.class);
				q.setParameter("target_pids", theMatches);
				List<ResourceLink> results = q.getResultList();
				for (ResourceLink resourceLink : results) {
					pidsToInclude.add(resourceLink.getSourceResourcePid());
				}
			} else {
				int colonIdx = nextInclude.getValue().indexOf(':');
				if (colonIdx < 2) {
					continue;
				}
				String resType = nextInclude.getValue().substring(0, colonIdx);
				RuntimeResourceDefinition def = getContext().getResourceDefinition(resType);
				if (def == null) {
					ourLog.warn("Unknown resource type in _revinclude=" + nextInclude.getValue());
					continue;
				}

				String paramName = nextInclude.getValue().substring(colonIdx + 1);
				RuntimeSearchParam param = def.getSearchParam(paramName);
				if (param == null) {
					ourLog.warn("Unknown param name in _revinclude=" + nextInclude.getValue());
					continue;
				}

				for (String nextPath : param.getPathsSplit()) {
					String sql = "SELECT r FROM ResourceLink r WHERE r.mySourcePath = :src_path AND r.myTargetResourcePid IN (:target_pids)";
					TypedQuery<ResourceLink> q = myEntityManager.createQuery(sql, ResourceLink.class);
					q.setParameter("src_path", nextPath);
					q.setParameter("target_pids", theMatches);
					List<ResourceLink> results = q.getResultList();
					for (ResourceLink resourceLink : results) {
						pidsToInclude.add(resourceLink.getSourceResourcePid());
					}
				}
			}
		}

		theMatches.addAll(pidsToInclude);
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
		CriteriaQuery<PatientFhirExtTable> cq = builder.createQuery(PatientFhirExtTable.class);
		Root<PatientFhirExtTable> from = cq.from(PatientFhirExtTable.class);
		cq.select(from);
		cq.where(from.get("id").in(theIncludePids));
		TypedQuery<PatientFhirExtTable> q = myEntityManager.createQuery(cq);

		for (Person person : q.getResultList()) {
			//Class<? extends IBaseResource> resourceType = getContext().getResourceDefinition(next.getResourceType()).getImplementingClass();
			IResource resource = toResource(person);
			Integer index = position.get(person.getId());
			if (index == null) {
				ourLog.warn("Got back unexpected resource PID {}", person.getId());
				continue;
			}

			ResourceMetadataKeyEnum.ENTRY_SEARCH_MODE.put(resource, theBundleEntryStatus);

			theResourceListToPopulate.set(index, resource);
		}
	}
	
	protected <T extends IResource> T toResource(IResourceTable theResourceTable) {
		return theResourceTable.getRelatedResource();
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

	@Override
	public IBundleProvider search(String theParameterName,
			IQueryParameterType theValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Long> searchForIds(Map<String, IQueryParameterType> theParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Long> searchForIds(String theParameterName,
			IQueryParameterType theValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Long> searchForIdsWithAndOr(SearchParameterMap theParams) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome update(T theResource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome update(T theResource, String theMatchUrl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome update(T theResource, String theMatchUrl,
			boolean thePerformIndexing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDt metaGetOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDt metaGetOperation(IdDt theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDt metaDeleteOperation(IdDt theId1, MetaDt theMetaDel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDt metaAddOperation(IdDt theId1, MetaDt theMetaAdd) {
		// TODO Auto-generated method stub
		return null;
	}

	public FhirContext getContext() {
		return myContext;
	}
}
