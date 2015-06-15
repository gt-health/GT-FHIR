package edu.gatech.i3l.fhir.jpa.dao;

import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.jpa.dao.DaoMethodOutcome;
import ca.uhn.fhir.jpa.dao.IDaoListener;
import ca.uhn.fhir.jpa.entity.TagTypeEnum;
import ca.uhn.fhir.model.api.IQueryParameterType;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.dstu2.composite.MetaDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.server.IBundleProvider;
import edu.gatech.i3l.jpa.model.omop.IResourceTable;
import edu.gatech.i3l.jpa.model.omop.ext.PatientFhirExtTable;

@Transactional(propagation = Propagation.REQUIRED)
public class PatientFhirResourceDao extends BaseFhirResourceDao<Patient>{

	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(PatientFhirResourceDao.class);

	@PersistenceContext(type = PersistenceContextType.TRANSACTION)
	private EntityManager myEntityManager;

//	private String myResourceName;
//	private Class<Patient> myResourceType;

	public PatientFhirResourceDao() {
		setResourceTable(PatientFhirExtTable.class);
	}
	
	@Override
	public void registerDaoListener(IDaoListener theListener) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addTag(IdDt theId, TagTypeEnum theTagType, String theScheme,
			String theTerm, String theLabel) {
		// TODO Auto-generated method stub
		
	}

//	@Override
//	public DaoMethodOutcome create(T theResource) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public DaoMethodOutcome create(T theResource, String theIfNoneExist) {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public DaoMethodOutcome create(T theResource, String theIfNoneExist,
//			boolean thePerformIndexing) {
//		// TODO Auto-generated method stub
//		return null;
//	}

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
	public void removeTag(IdDt theId, TagTypeEnum theTagType, String theScheme,
			String theTerm) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IBundleProvider search(Map<String, IQueryParameterType> theParams) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
//	protected void loadReverseIncludes(List<Long> theMatches, Set<Include> theRevIncludes) {
//		if (theMatches.size() == 0) {
//			return;
//		}
//
//		HashSet<Long> pidsToInclude = new HashSet<Long>();
//
//		for (Include nextInclude : theRevIncludes) {
//			boolean matchAll = "*".equals(nextInclude.getValue());
//			if (matchAll) {
//				String sql = "SELECT r FROM ResourceLink r WHERE r.myTargetResourcePid IN (:target_pids)";
//				TypedQuery<ResourceLink> q = myEntityManager.createQuery(sql, ResourceLink.class);
//				q.setParameter("target_pids", theMatches);
//				List<ResourceLink> results = q.getResultList();
//				for (ResourceLink resourceLink : results) {
//					pidsToInclude.add(resourceLink.getSourceResourcePid());
//				}
//			} else {
//				int colonIdx = nextInclude.getValue().indexOf(':');
//				if (colonIdx < 2) {
//					continue;
//				}
//				String resType = nextInclude.getValue().substring(0, colonIdx);
//				RuntimeResourceDefinition def = getContext().getResourceDefinition(resType);
//				if (def == null) {
//					ourLog.warn("Unknown resource type in _revinclude=" + nextInclude.getValue());
//					continue;
//				}
//
//				String paramName = nextInclude.getValue().substring(colonIdx + 1);
//				RuntimeSearchParam param = def.getSearchParam(paramName);
//				if (param == null) {
//					ourLog.warn("Unknown param name in _revinclude=" + nextInclude.getValue());
//					continue;
//				}
//
//				for (String nextPath : param.getPathsSplit()) {
//					String sql = "SELECT r FROM ResourceLink r WHERE r.mySourcePath = :src_path AND r.myTargetResourcePid IN (:target_pids)";
//					TypedQuery<ResourceLink> q = myEntityManager.createQuery(sql, ResourceLink.class);
//					q.setParameter("src_path", nextPath);
//					q.setParameter("target_pids", theMatches);
//					List<ResourceLink> results = q.getResultList();
//					for (ResourceLink resourceLink : results) {
//						pidsToInclude.add(resourceLink.getSourceResourcePid());
//					}
//				}
//			}
//		}
//
//		theMatches.addAll(pidsToInclude);
//	}
	
	
	
//	protected <T extends IResource> T toResource(IResourceTable theResourceTable) {
//		return theResourceTable.getRelatedResource();
//	}

	

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

	@Override
	public DaoMethodOutcome create(Patient theResource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome create(Patient theResource, String theIfNoneExist) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome create(Patient theResource, String theIfNoneExist,
			boolean thePerformIndexing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome update(Patient theResource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome update(Patient theResource, String theMatchUrl) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DaoMethodOutcome update(Patient theResource, String theMatchUrl,
			boolean thePerformIndexing) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Predicate translatePredicateDateLessThan(String theParamName, Date upperBound, Root<? extends IResourceTable> from, CriteriaBuilder theBuilder) {
		Calendar c = Calendar.getInstance();
		c.setTime(upperBound);
		Predicate lt1 = theBuilder.lessThan(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR));
		Predicate lt2 = theBuilder.and( theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
										theBuilder.lessThan(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)));
		Predicate lt3 = theBuilder.and( theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
										theBuilder.equal(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)),
										theBuilder.lessThanOrEqualTo(from.get("dayOfBirth").as(Integer.class), c.get(Calendar.DAY_OF_MONTH)));
		Predicate ub = theBuilder.or(lt1, lt2, lt3);
		return ub;
	}

	@Override
	public Predicate translatePredicateDateGreaterThan(String theParamName,
			Date lowerBound, Root<? extends IResourceTable> from, CriteriaBuilder theBuilder) {
		Calendar c = Calendar.getInstance();
		c.setTime(lowerBound);
		Predicate gt1 = theBuilder.greaterThan(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR));
		Predicate gt2 = theBuilder.and( theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
										theBuilder.greaterThan(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)));
		Predicate gt3 = theBuilder.and( theBuilder.equal(from.get("yearOfBirth").as(Integer.class), c.get(Calendar.YEAR)),
										theBuilder.equal(from.get("monthOfBirth").as(Integer.class), c.get(Calendar.MONTH)),
										theBuilder.greaterThanOrEqualTo(from.get("dayOfBirth").as(Integer.class), c.get(Calendar.DAY_OF_MONTH)));
		Predicate lb = theBuilder.or(gt1, gt2, gt3);
		return lb;
	}
}
