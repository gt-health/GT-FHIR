package ca.uhn.fhir.jpa.dao;

/*
 * #%L
 * HAPI FHIR JPA Server
 * %%
 * Copyright (C) 2014 - 2015 University Health Network
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import static org.apache.commons.lang3.StringUtils.isBlank;
import static org.apache.commons.lang3.StringUtils.isNotBlank;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.Tuple;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.StringUtils;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.hl7.fhir.instance.model.api.IIdType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import ca.uhn.fhir.context.ConfigurationException;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.context.RuntimeResourceDefinition;
import ca.uhn.fhir.context.RuntimeSearchParam;
import ca.uhn.fhir.jpa.entity.BaseHasResource;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.BaseResourceIndexedSearchParam;
import ca.uhn.fhir.jpa.entity.BaseTag;
import ca.uhn.fhir.jpa.entity.ResourceEncodingEnum;
import ca.uhn.fhir.jpa.entity.ResourceHistoryTable;
import ca.uhn.fhir.jpa.entity.ResourceHistoryTag;
import ca.uhn.fhir.jpa.entity.ResourceIndexedSearchParamDate;
import ca.uhn.fhir.jpa.entity.ResourceIndexedSearchParamNumber;
import ca.uhn.fhir.jpa.entity.ResourceIndexedSearchParamQuantity;
import ca.uhn.fhir.jpa.entity.ResourceIndexedSearchParamString;
import ca.uhn.fhir.jpa.entity.ResourceIndexedSearchParamToken;
import ca.uhn.fhir.jpa.entity.ResourceLink;
import ca.uhn.fhir.jpa.entity.ResourceTable;
import ca.uhn.fhir.jpa.entity.ResourceTag;
import ca.uhn.fhir.jpa.entity.TagDefinition;
import ca.uhn.fhir.jpa.entity.TagTypeEnum;
import ca.uhn.fhir.jpa.util.DaoUtils;
import ca.uhn.fhir.jpa.util.ResourceTransformer;
import ca.uhn.fhir.jpa.util.FhirResourceUtils;
import ca.uhn.fhir.jpa.util.StopWatch;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.api.ResourceMetadataKeyEnum;
import ca.uhn.fhir.model.api.Tag;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.base.composite.BaseCodingDt;
import ca.uhn.fhir.model.base.composite.BaseResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.MetaDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.parser.DataFormatException;
import ca.uhn.fhir.rest.method.RestSearchParameterTypeEnum;
import ca.uhn.fhir.rest.server.IBundleProvider;
import ca.uhn.fhir.rest.server.exceptions.InternalErrorException;
import ca.uhn.fhir.rest.server.exceptions.InvalidRequestException;
import ca.uhn.fhir.rest.server.exceptions.ResourceNotFoundException;
import ca.uhn.fhir.rest.server.exceptions.UnprocessableEntityException;
import ca.uhn.fhir.util.FhirTerser;

import com.google.common.base.Function;
import com.google.common.collect.Collections2;
import com.google.common.collect.Lists;

public class BaseHapiFhirDao extends AbstractBaseFhirDao {

	public static final String NS_JPA_PROFILE = "https://github.com/jamesagnew/hapi-fhir/ns/jpa/profile";
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(BaseHapiFhirDao.class);

	public static final String UCUM_NS = "http://unitsofmeasure.org";

	// @PersistenceContext(name = "FHIR_UT", type = PersistenceContextType.TRANSACTION, unitName = "FHIR_UT")
	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;

	@Autowired
	private PlatformTransactionManager myPlatformTransactionManager;

	private ISearchParamExtractor mySearchParamExtractor;

	protected List<ResourceLink> extractResourceLinks(ResourceTable theEntity, IResource theResource) {
		ArrayList<ResourceLink> retVal = new ArrayList<ResourceLink>();

		RuntimeResourceDefinition def = getContext().getResourceDefinition(theResource);
		for (RuntimeSearchParam nextSpDef : def.getSearchParams()) {
			if (nextSpDef.getParamType() != RestSearchParameterTypeEnum.REFERENCE) {
				continue;
			}

			String nextPathsUnsplit = nextSpDef.getPath();
			if (isBlank(nextPathsUnsplit)) {
				continue;
			}

			boolean multiType = false;
			if (nextPathsUnsplit.endsWith("[x]")) {
				multiType = true;
			}

			for (Object nextObject : extractValues(nextPathsUnsplit, theResource)) {
				if (nextObject == null) {
					continue;
				}

				ResourceLink nextEntity;
				if (nextObject instanceof BaseResourceReferenceDt) {
					BaseResourceReferenceDt nextValue = (BaseResourceReferenceDt) nextObject;
					if (nextValue.isEmpty()) {
						continue;
					}
					if (nextValue.getReference().isEmpty() || nextValue.getReference().getValue().startsWith("#")) {
						// This is a blank or contained resource reference
						continue;
					}

					String typeString = nextValue.getReference().getResourceType();
					if (isBlank(typeString)) {
						throw new InvalidRequestException("Invalid resource reference found at path[" + nextPathsUnsplit + "] - Does not contain resource type - " + nextValue.getReference().getValue());
					}
					Class<? extends IBaseResource> type = getContext().getResourceDefinition(typeString).getImplementingClass();
					String id = nextValue.getReference().getIdPart();
					if (StringUtils.isBlank(id)) {
						continue;
					}

					IFhirResourceDao<?> dao = getDao(type);
					if (dao == null) {
						StringBuilder b = new StringBuilder();
						b.append("This server (version ");
						b.append(getContext().getVersion().getVersion());
						b.append(") is not able to handle resources of type[");
						b.append(nextValue.getReference().getResourceType());
						b.append("] - Valid resource types for this server: ");
						b.append(getMyResourceTypeToDao().keySet().toString());

						throw new InvalidRequestException(b.toString());
					}
					Long valueOf;
					try {
						valueOf = DaoUtils.translateForcedIdToPid(nextValue.getReference(), myEntityManager);
					} catch (ResourceNotFoundException e) {
						String resName = getContext().getResourceDefinition(type).getName();
						throw new InvalidRequestException("Resource " + resName + "/" + id + " not found, specified in path: " + nextPathsUnsplit);
					}
					ResourceTable target = myEntityManager.find(ResourceTable.class, valueOf);
					if (target == null) {
						String resName = getContext().getResourceDefinition(type).getName();
						throw new InvalidRequestException("Resource " + resName + "/" + id + " not found, specified in path: " + nextPathsUnsplit);
					}
					nextEntity = new ResourceLink(nextPathsUnsplit, theEntity, target);
				} else {
					if (!multiType) {
						throw new ConfigurationException("Search param " + nextSpDef.getName() + " is of unexpected datatype: " + nextObject.getClass());
					} else {
						continue;
					}
				}
				if (nextEntity != null) {
					retVal.add(nextEntity);
				}
			}
		}

		theEntity.setHasLinks(retVal.size() > 0);

		return retVal;
	}

	protected List<ResourceIndexedSearchParamDate> extractSearchParamDates(ResourceTable theEntity, IResource theResource) {
		return mySearchParamExtractor.extractSearchParamDates(theEntity, theResource);
	}

	protected ArrayList<ResourceIndexedSearchParamNumber> extractSearchParamNumber(ResourceTable theEntity, IResource theResource) {
		return mySearchParamExtractor.extractSearchParamNumber(theEntity, theResource);
	}

	protected List<ResourceIndexedSearchParamQuantity> extractSearchParamQuantity(ResourceTable theEntity, IResource theResource) {
		return mySearchParamExtractor.extractSearchParamQuantity(theEntity, theResource);
	}

	protected List<ResourceIndexedSearchParamString> extractSearchParamStrings(ResourceTable theEntity, IResource theResource) {
		return mySearchParamExtractor.extractSearchParamStrings(theEntity, theResource);
	}

	protected List<BaseResourceIndexedSearchParam> extractSearchParamTokens(ResourceTable theEntity, IResource theResource) {
		return mySearchParamExtractor.extractSearchParamTokens(theEntity, theResource);
	}

	private List<Object> extractValues(String thePaths, IResource theResource) {
		List<Object> values = new ArrayList<Object>();
		String[] nextPathsSplit = thePaths.split("\\|");
		FhirTerser t = getContext().newTerser();
		for (String nextPath : nextPathsSplit) {
			String nextPathTrimmed = nextPath.trim();
			try {
				values.addAll(t.getValues(theResource, nextPathTrimmed));
			} catch (Exception e) {
				RuntimeResourceDefinition def = getContext().getResourceDefinition(theResource);
				ourLog.warn("Failed to index values from path[{}] in resource type[{}]: ", new Object[] { nextPathTrimmed, def.getName(), e.toString() });
			}
		}
		return values;
	}

	private void findMatchingTagIds(String theResourceName, IIdType theResourceId, Set<Long> tagIds, Class<? extends BaseTag> entityClass) {
		{
			CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
			CriteriaQuery<Tuple> cq = builder.createTupleQuery();
			Root<? extends BaseTag> from = cq.from(entityClass);
			cq.multiselect(from.get("myTagId").as(Long.class)).distinct(true);

			if (theResourceName != null) {
				Predicate typePredicate = builder.equal(from.get("myResourceType"), theResourceName);
				if (theResourceId != null) {
					cq.where(typePredicate, builder.equal(from.get("myResourceId"), DaoUtils.translateForcedIdToPid(theResourceId, myEntityManager)));
				} else {
					cq.where(typePredicate);
				}
			}

			TypedQuery<Tuple> query = myEntityManager.createQuery(cq);
			for (Tuple next : query.getResultList()) {
				tagIds.add(next.get(0, Long.class));
			}
		}
	}

	public TagDefinition getTag(TagTypeEnum theTagType, String theScheme, String theTerm, String theLabel) {
		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<TagDefinition> cq = builder.createQuery(TagDefinition.class);
		Root<TagDefinition> from = cq.from(TagDefinition.class);

		//@formatter:off
		if (isNotBlank(theScheme)) {
			cq.where(
				builder.and(
					builder.equal(from.get("myTagType"), theTagType), 
					builder.equal(from.get("mySystem"), theScheme), 
					builder.equal(from.get("myCode"), theTerm))
				);
		} else {
			cq.where(
				builder.and(
					builder.equal(from.get("myTagType"), theTagType), 
					builder.isNull(from.get("mySystem")), 
					builder.equal(from.get("myCode"), theTerm))
				);
		}
		//@formatter:on

		TypedQuery<TagDefinition> q = myEntityManager.createQuery(cq);
		try {
			return q.getSingleResult();
		} catch (NoResultException e) {
			TagDefinition retVal = new TagDefinition(theTagType, theScheme, theTerm, theLabel);
			myEntityManager.persist(retVal);
			return retVal;
		}
	}

	public TagList getTags(Class<? extends IResource> theResourceType, IIdType theResourceId) {
		String resourceName = null;
		if (theResourceType != null) {
			resourceName = FhirResourceUtils.toResourceName(theResourceType, getContext());
			if (theResourceId != null && theResourceId.hasVersionIdPart()) {
				IFhirResourceDao<? extends IResource> dao = getDao(theResourceType);
				BaseHasResource entity = (BaseHasResource) dao.readEntity(theResourceId);
				TagList retVal = new TagList();
				for (BaseTag next : entity.getTags()) {
					retVal.add(next.getTag().toTag());
				}
				return retVal;
			}
		}

		Set<Long> tagIds = new HashSet<Long>();
		findMatchingTagIds(resourceName, theResourceId, tagIds, ResourceTag.class);
		findMatchingTagIds(resourceName, theResourceId, tagIds, ResourceHistoryTag.class);
		if (tagIds.isEmpty()) {
			return new TagList();
		}
		{
			CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
			CriteriaQuery<TagDefinition> cq = builder.createQuery(TagDefinition.class);
			Root<TagDefinition> from = cq.from(TagDefinition.class);
			cq.where(from.get("myId").in(tagIds));
			cq.orderBy(builder.asc(from.get("mySystem")), builder.asc(from.get("myCode")));
			TypedQuery<TagDefinition> q = myEntityManager.createQuery(cq);
			q.setMaxResults(getConfig().getHardTagListLimit());

			TagList retVal = new TagList();
			for (TagDefinition next : q.getResultList()) {
				retVal.add(next.toTag());
			}

			return retVal;
		}
	}

	public IBundleProvider history(String theResourceName, Long theId, Date theSince) {
		final List<HistoryTuple> tuples = new ArrayList<HistoryTuple>();

		final InstantDt end = DaoUtils.createHistoryToTimestamp();

		StopWatch timer = new StopWatch();

		int limit = 10000;

		// Get list of IDs
		searchHistoryCurrentVersion(theResourceName, theId, theSince, end.getValue(), limit, tuples);
		ourLog.info("Retrieved {} history IDs from current versions in {} ms", tuples.size(), timer.getMillisAndRestart());

		searchHistoryHistory(theResourceName, theId, theSince, end.getValue(), limit, tuples);
		ourLog.info("Retrieved {} history IDs from previous versions in {} ms", tuples.size(), timer.getMillisAndRestart());

		// Sort merged list
		Collections.sort(tuples, Collections.reverseOrder());
		assert tuples.size() < 2 || !tuples.get(tuples.size() - 2).getUpdated().before(tuples.get(tuples.size() - 1).getUpdated()) : tuples.toString();

		return new IBundleProvider() {

			@Override
			public InstantDt getPublished() {
				return end;
			}

			@Override
			public List<IBaseResource> getResources(final int theFromIndex, final int theToIndex) {
				final StopWatch timer = new StopWatch();
				TransactionTemplate template = new TransactionTemplate(myPlatformTransactionManager);
				return template.execute(new TransactionCallback<List<IBaseResource>>() {
					@Override
					public List<IBaseResource> doInTransaction(TransactionStatus theStatus) {
						List<BaseHasResource> resEntities = Lists.newArrayList();

						List<HistoryTuple> tupleSubList = tuples.subList(theFromIndex, theToIndex);
						searchHistoryCurrentVersion(tupleSubList, resEntities);
						ourLog.info("Loaded history from current versions in {} ms", timer.getMillisAndRestart());

						searchHistoryHistory(tupleSubList, resEntities);
						ourLog.info("Loaded history from previous versions in {} ms", timer.getMillisAndRestart());

						Collections.sort(resEntities, new Comparator<BaseHasResource>() {
							@Override
							public int compare(BaseHasResource theO1, BaseHasResource theO2) {
								return theO2.getUpdated().getValue().compareTo(theO1.getUpdated().getValue());
							}
						});

						int limit = theToIndex - theFromIndex;
						if (resEntities.size() > limit) {
							resEntities = resEntities.subList(0, limit);
						}

						ArrayList<IBaseResource> retVal = new ArrayList<IBaseResource>();
						for (BaseHasResource next : resEntities) {
							RuntimeResourceDefinition type;
							try {
								type = getContext().getResourceDefinition(next.getResourceType());
							} catch (DataFormatException e) {
								if (next.getFhirVersion() != getContext().getVersion().getVersion()) {
									ourLog.info("Ignoring history resource of type[{}] because it is not compatible with version[{}]", next.getResourceType(), getContext().getVersion().getVersion());
									continue;
								}
								throw e;
							}
							IResource resource = (IResource) ResourceTransformer.toResource(type.getImplementingClass(), next);
							retVal.add(resource);
						}
						return retVal;
					}
				});
			}

			@Override
			public int size() {
				return tuples.size();
			}

			@Override
			public Integer preferredPageSize() {
				return null;
			}
		};
	}

	@Override
	public List<IBaseResource> loadResourcesById(Set<? extends IIdType> theIncludePids) {
		Set<Long> pids = new HashSet<Long>();
		for (IIdType next : theIncludePids) {
			if (next.isIdPartValidLong()) {
				pids.add(next.getIdPartAsLong());
			} else {
				try {
					pids.add(DaoUtils.translateForcedIdToPid(next, myEntityManager));
				} catch (ResourceNotFoundException e) {
					ourLog.warn("Failed to translate forced ID [{}] to PID", next.getValue());
				}
			}
		}

		if (pids.isEmpty()) {
			return new ArrayList<IBaseResource>();
		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<ResourceTable> cq = builder.createQuery(ResourceTable.class);
		Root<ResourceTable> from = cq.from(ResourceTable.class);
		// cq.where(builder.equal(from.get("myResourceType"),
		// getContext().getResourceDefinition(myResourceType).getName()));
		// if (theIncludePids != null) {
		cq.where(from.get("myId").in(pids));
		// }
		TypedQuery<ResourceTable> q = myEntityManager.createQuery(cq);

		ArrayList<IBaseResource> retVal = new ArrayList<IBaseResource>();
		for (ResourceTable next : q.getResultList()) {
			IResource resource = (IResource) ResourceTransformer.toResource(next);
			retVal.add(resource);
		}

		return retVal;
	}

	protected void populateResourceIntoEntity(IResource theResource, ResourceTable theEntity) {

		if (theEntity.getPublished().isEmpty()) {
			theEntity.setPublished(new Date());
		}
		theEntity.setUpdated(new Date());

		theEntity.setResourceType(FhirResourceUtils.toResourceName(theResource, getContext()));

		List<BaseResourceReferenceDt> refs = getContext().newTerser().getAllPopulatedChildElementsOfType(theResource, BaseResourceReferenceDt.class);
		for (BaseResourceReferenceDt nextRef : refs) {
			if (nextRef.getReference().isEmpty() == false) {
				if (nextRef.getReference().hasVersionIdPart()) {
					nextRef.setReference(nextRef.getReference().toUnqualifiedVersionless());
				}
			}
		}

		String encoded = getConfig().getResourceEncoding().newParser(getContext()).encodeResourceToString(theResource);
		ResourceEncodingEnum encoding = getConfig().getResourceEncoding();
		theEntity.setEncoding(encoding);
		theEntity.setFhirVersion(getContext().getVersion().getVersion());
		try {
			switch (encoding) {
			case JSON:
				theEntity.setResource(encoded.getBytes("UTF-8"));
				break;
			case JSONC:
				theEntity.setResource(GZipUtil.compress(encoded));
				break;
			}
		} catch (UnsupportedEncodingException e) {
			throw new InternalErrorException(e);
		}

		TagList tagList = ResourceMetadataKeyEnum.TAG_LIST.get(theResource);
		if (tagList != null) {
			for (Tag next : tagList) {
				TagDefinition tag = getTag(TagTypeEnum.TAG, next.getScheme(), next.getTerm(), next.getLabel());
				theEntity.addTag(tag);
				theEntity.setHasTags(true);
			}
		}

		List<BaseCodingDt> securityLabels = ResourceMetadataKeyEnum.SECURITY_LABELS.get(theResource);
		if (securityLabels != null) {
			for (BaseCodingDt next : securityLabels) {
				TagDefinition tag = getTag(TagTypeEnum.SECURITY_LABEL, next.getSystemElement().getValue(), next.getCodeElement().getValue(), next.getDisplayElement().getValue());
				theEntity.addTag(tag);
				theEntity.setHasTags(true);
			}
		}

		List<IdDt> profiles = ResourceMetadataKeyEnum.PROFILES.get(theResource);
		if (profiles != null) {
			for (IIdType next : profiles) {
				TagDefinition tag = getTag(TagTypeEnum.PROFILE, NS_JPA_PROFILE, next.getValue(), null);
				theEntity.addTag(tag);
				theEntity.setHasTags(true);
			}
		}

		String title = ResourceMetadataKeyEnum.TITLE.get(theResource);
		if (title != null && title.length() > BaseHasResource.MAX_TITLE_LENGTH) {
			title = title.substring(0, BaseHasResource.MAX_TITLE_LENGTH);
		}
		theEntity.setTitle(title);

	}

	private void searchHistoryCurrentVersion(List<HistoryTuple> theTuples, List<BaseHasResource> theRetVal) {
		Collection<HistoryTuple> tuples = Collections2.filter(theTuples, new com.google.common.base.Predicate<HistoryTuple>() {
			@Override
			public boolean apply(HistoryTuple theInput) {
				return theInput.isHistory() == false;
			}
		});
		Collection<Long> ids = Collections2.transform(tuples, new Function<HistoryTuple, Long>() {
			@Override
			public Long apply(HistoryTuple theInput) {
				return theInput.getId();
			}
		});
		if (ids.isEmpty()) {
			return;
		}

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<ResourceTable> cq = builder.createQuery(ResourceTable.class);
		Root<ResourceTable> from = cq.from(ResourceTable.class);
		cq.where(from.get("myId").in(ids));

		cq.orderBy(builder.desc(from.get("myUpdated")));
		TypedQuery<ResourceTable> q = myEntityManager.createQuery(cq);
		for (ResourceTable next : q.getResultList()) {
			theRetVal.add(next);
		}
	}

	private void searchHistoryCurrentVersion(String theResourceName, Long theId, Date theSince, Date theEnd, Integer theLimit, List<HistoryTuple> tuples) {
		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Tuple> cq = builder.createTupleQuery();
		Root<?> from = cq.from(ResourceTable.class);
		cq.multiselect(from.get("myId").as(Long.class), from.get("myUpdated").as(Date.class));

		List<Predicate> predicates = new ArrayList<Predicate>();
		if (theSince != null) {
			Predicate low = builder.greaterThanOrEqualTo(from.<Date> get("myUpdated"), theSince);
			predicates.add(low);
		}

		Predicate high = builder.lessThan(from.<Date> get("myUpdated"), theEnd);
		predicates.add(high);

		if (theResourceName != null) {
			predicates.add(builder.equal(from.get("myResourceType"), theResourceName));
		}
		if (theId != null) {
			predicates.add(builder.equal(from.get("myId"), theId));
		}

		cq.where(builder.and(predicates.toArray(new Predicate[0])));

		cq.orderBy(builder.desc(from.get("myUpdated")));
		TypedQuery<Tuple> q = myEntityManager.createQuery(cq);
		if (theLimit != null && theLimit < getConfig().getHardSearchLimit()) {
			q.setMaxResults(theLimit);
		} else {
			q.setMaxResults(getConfig().getHardSearchLimit());
		}
		for (Tuple next : q.getResultList()) {
			long id = next.get(0, Long.class);
			Date updated = next.get(1, Date.class);
			tuples.add(new HistoryTuple(false, updated, id));
		}
	}

	private void searchHistoryHistory(List<HistoryTuple> theTuples, List<BaseHasResource> theRetVal) {
		Collection<HistoryTuple> tuples = Collections2.filter(theTuples, new com.google.common.base.Predicate<HistoryTuple>() {
			@Override
			public boolean apply(HistoryTuple theInput) {
				return theInput.isHistory() == true;
			}
		});
		Collection<Long> ids = Collections2.transform(tuples, new Function<HistoryTuple, Long>() {
			@Override
			public Long apply(HistoryTuple theInput) {
				return (Long) theInput.getId();
			}
		});
		if (ids.isEmpty()) {
			return;
		}

		ourLog.info("Retrieving {} history elements from ResourceHistoryTable", ids.size());

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<ResourceHistoryTable> cq = builder.createQuery(ResourceHistoryTable.class);
		Root<ResourceHistoryTable> from = cq.from(ResourceHistoryTable.class);
		cq.where(from.get("myId").in(ids));

		cq.orderBy(builder.desc(from.get("myUpdated")));
		TypedQuery<ResourceHistoryTable> q = myEntityManager.createQuery(cq);
		for (ResourceHistoryTable next : q.getResultList()) {
			theRetVal.add(next);
		}
	}

	private void searchHistoryHistory(String theResourceName, Long theResourceId, Date theSince, Date theEnd, Integer theLimit, List<HistoryTuple> tuples) {
		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		CriteriaQuery<Tuple> cq = builder.createTupleQuery();
		Root<?> from = cq.from(ResourceHistoryTable.class);
		cq.multiselect(from.get("myId").as(Long.class), from.get("myUpdated").as(Date.class));

		List<Predicate> predicates = new ArrayList<Predicate>();
		if (theSince != null) {
			Predicate low = builder.greaterThanOrEqualTo(from.<Date> get("myUpdated"), theSince);
			predicates.add(low);
		}

		Predicate high = builder.lessThan(from.<Date> get("myUpdated"), theEnd);
		predicates.add(high);

		if (theResourceName != null) {
			predicates.add(builder.equal(from.get("myResourceType"), theResourceName));
		}
		if (theResourceId != null) {
			predicates.add(builder.equal(from.get("myResourceId"), theResourceId));
		}

		cq.where(builder.and(predicates.toArray(new Predicate[0])));

		cq.orderBy(builder.desc(from.get("myUpdated")));
		TypedQuery<Tuple> q = myEntityManager.createQuery(cq);
		if (theLimit != null && theLimit < getConfig().getHardSearchLimit()) {
			q.setMaxResults(theLimit);
		} else {
			q.setMaxResults(getConfig().getHardSearchLimit());
		}
		for (Tuple next : q.getResultList()) {
			Long id = next.get(0, Long.class);
			Date updated = (Date) next.get(1);
			tuples.add(new HistoryTuple(true, updated, id));
		}
	}

	public MetaDt toMetaDt(List<TagDefinition> tagDefinitions) {
		MetaDt retVal = new MetaDt();
		for (TagDefinition next : tagDefinitions) {
			switch (next.getTagType()) {
			case PROFILE:
				retVal.addProfile(next.getCode());
				break;
			case SECURITY_LABEL:
				retVal.addSecurity().setSystem(next.getSystem()).setCode(next.getCode()).setDisplay(next.getDisplay());
				break;
			case TAG:
				retVal.addTag().setSystem(next.getSystem()).setCode(next.getCode()).setDisplay(next.getDisplay());
				break;
			}
		}
		return retVal;
	}

	@Override
	public void setContext(FhirContext theContext) {
		super.setContext(theContext);
		switch (getContext().getVersion().getVersion()) {
		case DSTU2:
			mySearchParamExtractor = new SearchParamExtractorDstu2(theContext);
			break;
		case DSTU1:
			mySearchParamExtractor = new SearchParamExtractorDstu1(theContext);
			break;
		case DEV:
			throw new IllegalStateException("Don't know how to handle version: " + getContext().getVersion().getVersion());
		}
	}

	protected ResourceTable toEntity(IResource theResource) {
		ResourceTable retVal = new ResourceTable();

		populateResourceIntoEntity(theResource, retVal);

		return retVal;
	}	

	@Override
	public BaseResourceEntity updateEntity(final IResource theResource, BaseResourceEntity entity, boolean theUpdateHistory, Date theDeletedTimestampOrNull) {
		return updateEntity(theResource, entity, theUpdateHistory, theDeletedTimestampOrNull, true, true);
	}

	@Override
	public BaseResourceEntity updateEntity(final IResource theResource, BaseResourceEntity baseResourceEntity, boolean theUpdateHistory, Date theDeletedTimestampOrNull, boolean thePerformIndexing, boolean theUpdateVersion) {
		ResourceTable entity = (ResourceTable)baseResourceEntity; 
		validateResourceForStorage(theResource);

		if (entity.getPublished() == null) {
			entity.setPublished(new Date());
		}

		if (theResource != null) {
			String resourceType = getContext().getResourceDefinition(theResource).getName();
			if (isNotBlank(entity.getResourceType()) && !entity.getResourceType().equals(resourceType)) {
				throw new UnprocessableEntityException("Existing resource ID[" + entity.getIdDt().toUnqualifiedVersionless() + "] is of type[" + entity.getResourceType() + "] - Cannot update with [" + resourceType + "]");
			}
		}

		if (theUpdateHistory) {
			final ResourceHistoryTable historyEntry = entity.toHistory();
			myEntityManager.persist(historyEntry);
		}

		if (theUpdateVersion) {
			entity.setVersion(entity.getVersion() + 1);
		}

		Collection<ResourceIndexedSearchParamString> paramsString = new ArrayList<ResourceIndexedSearchParamString>(entity.getParamsString());
		Collection<ResourceIndexedSearchParamToken> paramsToken = new ArrayList<ResourceIndexedSearchParamToken>(entity.getParamsToken());
		Collection<ResourceIndexedSearchParamNumber> paramsNumber = new ArrayList<ResourceIndexedSearchParamNumber>(entity.getParamsNumber());
		Collection<ResourceIndexedSearchParamQuantity> paramsQuantity = new ArrayList<ResourceIndexedSearchParamQuantity>(entity.getParamsQuantity());
		Collection<ResourceIndexedSearchParamDate> paramsDate = new ArrayList<ResourceIndexedSearchParamDate>(entity.getParamsDate());
		Collection<ResourceLink> resourceLinks = new ArrayList<ResourceLink>(entity.getResourceLinks());

		List<ResourceIndexedSearchParamString> stringParams = null;
		List<ResourceIndexedSearchParamToken> tokenParams = null;
		List<ResourceIndexedSearchParamNumber> numberParams = null;
		List<ResourceIndexedSearchParamQuantity> quantityParams = null;
		List<ResourceIndexedSearchParamDate> dateParams = null;
		List<ResourceLink> links = null;

		if (theDeletedTimestampOrNull != null) {

			stringParams = Collections.emptyList();
			tokenParams = Collections.emptyList();
			numberParams = Collections.emptyList();
			quantityParams = Collections.emptyList();
			dateParams = Collections.emptyList();
			links = Collections.emptyList();
			entity.setDeleted(theDeletedTimestampOrNull);
			entity.setUpdated(theDeletedTimestampOrNull);

		} else {

			entity.setDeleted(null);

			if (thePerformIndexing) {

				stringParams = extractSearchParamStrings(entity, theResource);
				numberParams = extractSearchParamNumber(entity, theResource);
				quantityParams = extractSearchParamQuantity(entity, theResource);
				dateParams = extractSearchParamDates(entity, theResource);

				// ourLog.info("Indexing resource: {}", entity.getId());
				ourLog.trace("Storing string indexes: {}", stringParams);

				tokenParams = new ArrayList<ResourceIndexedSearchParamToken>();
				for (BaseResourceIndexedSearchParam next : extractSearchParamTokens(entity, theResource)) {
					if (next instanceof ResourceIndexedSearchParamToken) {
						tokenParams.add((ResourceIndexedSearchParamToken) next);
					} else {
						stringParams.add((ResourceIndexedSearchParamString) next);
					}
				}

				links = extractResourceLinks(entity, theResource);
				populateResourceIntoEntity(theResource, entity);
				entity.setUpdated(new Date());
				entity.setLanguage(theResource.getLanguage().getValue());
				entity.setParamsString(stringParams);
				entity.setParamsStringPopulated(stringParams.isEmpty() == false);
				entity.setParamsToken(tokenParams);
				entity.setParamsTokenPopulated(tokenParams.isEmpty() == false);
				entity.setParamsNumber(numberParams);
				entity.setParamsNumberPopulated(numberParams.isEmpty() == false);
				entity.setParamsQuantity(quantityParams);
				entity.setParamsQuantityPopulated(quantityParams.isEmpty() == false);
				entity.setParamsDate(dateParams);
				entity.setParamsDatePopulated(dateParams.isEmpty() == false);
				entity.setResourceLinks(links);
				entity.setHasLinks(links.isEmpty() == false);

			} else {

				populateResourceIntoEntity(theResource, entity);
				entity.setUpdated(new Date());
				entity.setLanguage(theResource.getLanguage().getValue());

			}

		}

		if (entity.getId() == null) {
			myEntityManager.persist(entity);

			if (entity.getForcedId() != null) {
				myEntityManager.persist(entity.getForcedId());
			}

		} else {
			entity = myEntityManager.merge(entity);
		}

		if (thePerformIndexing) {

			if (entity.isParamsStringPopulated()) {
				for (ResourceIndexedSearchParamString next : paramsString) {
					myEntityManager.remove(next);
				}
			}
			for (ResourceIndexedSearchParamString next : stringParams) {
				myEntityManager.persist(next);
			}

			if (entity.isParamsTokenPopulated()) {
				for (ResourceIndexedSearchParamToken next : paramsToken) {
					myEntityManager.remove(next);
				}
			}
			for (ResourceIndexedSearchParamToken next : tokenParams) {
				myEntityManager.persist(next);
			}

			if (entity.isParamsNumberPopulated()) {
				for (ResourceIndexedSearchParamNumber next : paramsNumber) {
					myEntityManager.remove(next);
				}
			}
			for (ResourceIndexedSearchParamNumber next : numberParams) {
				myEntityManager.persist(next);
			}

			if (entity.isParamsQuantityPopulated()) {
				for (ResourceIndexedSearchParamQuantity next : paramsQuantity) {
					myEntityManager.remove(next);
				}
			}
			for (ResourceIndexedSearchParamQuantity next : quantityParams) {
				myEntityManager.persist(next);
			}

			if (entity.isParamsDatePopulated()) {
				for (ResourceIndexedSearchParamDate next : paramsDate) {
					myEntityManager.remove(next);
				}
			}
			for (ResourceIndexedSearchParamDate next : dateParams) {
				myEntityManager.persist(next);
			}

			if (entity.isHasLinks()) {
				for (ResourceLink next : resourceLinks) {
					myEntityManager.remove(next);
				}
			}
			for (ResourceLink next : links) {
				myEntityManager.persist(next);
			}

		} // if thePerformIndexing

		myEntityManager.flush();

		if (theResource != null) {
			theResource.setId(entity.getIdDt());
		}

		return entity;
	}

	/**
	 * Subclasses may override to provide specific behaviour
	 * 
	 * @param theResource
	 *           The resource that is about to be persisted
	 */
	public void validateResourceForStorage(IResource theResource) {
		// nothing
	}

}
