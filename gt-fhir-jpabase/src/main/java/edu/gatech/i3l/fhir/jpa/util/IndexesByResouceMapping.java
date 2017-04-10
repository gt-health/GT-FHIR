package edu.gatech.i3l.fhir.jpa.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;

import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.fhir.jpa.query.QueryHelper;

/**
 * This is a temporary solution for the performance issue on searches on bigdata: caching the indexes, 
 * that are going to be used by the paging provider later.
 * TODO: A better solution for this - that is going to be implemented soon - is to include a late search
 * for all the indexes, and provide the pagination in advance, with a <code>LIMIT</code> for the search query
 * and a search for counting the totality tuples. 
 * 
 * @author Ismael Sarmento
 */
public class IndexesByResouceMapping {//implements Runnable {

	private static IndexesByResouceMapping indexesByResouceMapping = new IndexesByResouceMapping();
	private Set<Class<? extends IResourceEntity>> providedResourceEntities;
	private EntityManager myEntityManager;
	
	protected Map<Class<? extends IResourceEntity>, Set<Long>> indexes = new HashMap<Class<? extends IResourceEntity>, Set<Long>>();

	private QueryHelper myQueryHelper;
	
	private IndexesByResouceMapping() {
	}
	
	public Set<Class<? extends IResourceEntity>> getProvidedResourceEntities() {
		return providedResourceEntities;
	}

	public void setProvidedResourceEntities(
			Set<Class<? extends IResourceEntity>> providedResourceEntities) {
		this.providedResourceEntities = providedResourceEntities;
	}

	public Map<Class<? extends IResourceEntity>, Set<Long>> getIndexes() {
		return indexes;
	}
	
	public void setIndexes(Map<Class<? extends IResourceEntity>, Set<Long>> indexes) {
		this.indexes = indexes;
	}

	public static IndexesByResouceMapping getInstance(){
		return indexesByResouceMapping;
	}
	
	public Set<Long> get(Class<? extends IResourceEntity> key){
		return this.indexes.get(key);
	}
	
//	@Override
//	public void run() {
//		String baseFhirDao = "myBaseDao";
//		WebApplicationContext myAppCtx = ContextLoaderListener.getCurrentWebApplicationContext();
//		myEntityManager = myAppCtx.getBean(baseFhirDao, BaseFhirDao.class).getEntityManager();
//		preLoadIds();
//	}
	
//	private void preLoadIds() {
//		for (Class<? extends IResourceEntity> klass : providedResourceEntities) {
//			
//			CriteriaBuilder criteriaBuilder = myEntityManager.getCriteriaBuilder();
//			CriteriaQuery<Long> criteria = criteriaBuilder.createQuery(Long.class);
//			Root<? extends IResourceEntity> from = criteria.from(klass);
//			criteria.select(from.get("id").as(Long.class));
//			PredicateBuilder predicateBuilder = myQueryHelper.getPredicateBuilder();
//			Predicate addPredicate = predicateBuilder.addCommonPredicate(criteriaBuilder, from);
//			if(addPredicate != null)
//				criteria.where(addPredicate);
//			criteria.orderBy(criteriaBuilder.asc(from.get("id").as(Long.class)));
//			TypedQuery<Long> query = myEntityManager.createQuery(criteria);		
//			List<Long> resultList = query.getResultList();
//			indexes.put(klass, new HashSet<Long>( resultList));
//		}
//	}

}
