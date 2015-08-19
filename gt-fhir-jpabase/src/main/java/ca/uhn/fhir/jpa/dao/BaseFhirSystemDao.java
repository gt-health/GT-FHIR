package ca.uhn.fhir.jpa.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hl7.fhir.instance.model.api.IBaseResource;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.type.filter.AssignableTypeFilter;
import org.springframework.core.type.filter.TypeFilter;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.jpa.conf.PropertiesResolver;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.jpa.util.StopWatch;
import ca.uhn.fhir.model.api.TagList;
import ca.uhn.fhir.model.dstu2.composite.MetaDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.rest.server.IBundleProvider;

public class BaseFhirSystemDao<T> implements IFhirSystemDao<T> {
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(BaseFhirSystemDao.class);
	private static final String ENTITIES_PACKAGE_PROP = "ca.uhn.fhir.entities_package";
	private BaseFhirDao myBaseFhirDao;
	
	private FhirContext myContext;

	@PersistenceContext()
	protected EntityManager myEntityManager;
	
	public BaseFhirDao getBaseFhirDao() {
		return myBaseFhirDao;
	}

	public void setBaseFhirDao(BaseFhirDao baseFhirDao) {
		this.myBaseFhirDao = baseFhirDao;
	}

	public FhirContext getContext() {
		return myContext;
	}

	public void setContext(FhirContext myContext) {
		this.myContext = myContext;
	}

	@Override
	public IBundleProvider history(Date theSince) {
		StopWatch w = new StopWatch();
		IBundleProvider retVal = myBaseFhirDao.history(null, null, theSince);
		ourLog.info("Processed global history in {}ms", w.getMillisAndRestart());
		return retVal;
	}

	@Override
	public TagList getAllTags() {
		StopWatch w = new StopWatch();
		TagList retVal = myBaseFhirDao.getTags(null, null);
		ourLog.info("Processed getAllTags in {}ms", w.getMillisAndRestart());
		return retVal;
	}
	
	@Transactional(propagation=Propagation.REQUIRED)
	@Override
	public void deleteAllTagsOnServer() {
		//TODO
//		myEntityManager.createQuery("DELETE from ResourceTag t").executeUpdate();
	}
	
	@Override
	public void registerDaoListener(IDaoListener theListener) {
		myBaseFhirDao.registerDaoListener(theListener);
	}
	
	protected boolean hasValue(InstantDt theInstantDt) {
		return theInstantDt != null && theInstantDt.isEmpty() == false;
	}
	

	protected BaseResourceEntity loadFirstEntityFromCandidateMatches(Set<Long> candidateMatches) {
		return myEntityManager.find(BaseResourceEntity.class, candidateMatches.iterator().next());//FIXME this should be specific resource type class
	}

	/**
	 * @return A map with the provided resource types and how many registries are stored in the database for each resource.
	 */
	@Override
	public Map<String, Long> getResourceCounts() {
		Map<String, Long> retVal = new HashMap<String, Long>();
		
		ClassPathScanningCandidateComponentProvider cpsccp = new ClassPathScanningCandidateComponentProvider(false); 
		TypeFilter filter = new AssignableTypeFilter(IResourceEntity.class);
		cpsccp.addIncludeFilter(filter );
		cpsccp.setResourceLoader(new PathMatchingResourcePatternResolver(Thread.currentThread().getContextClassLoader()));
		String entitiesPackage = PropertiesResolver.getInstance().getPropertyValue(ENTITIES_PACKAGE_PROP);
		Set<BeanDefinition> beans = cpsccp.findCandidateComponents(entitiesPackage);

		CriteriaBuilder builder = myEntityManager.getCriteriaBuilder();
		for (BeanDefinition beanDefinition : beans) {
			String className = beanDefinition.getBeanClassName();
			try {
				Class<?> defClass = Class.forName(className);
				IResourceEntity resEntity = (IResourceEntity) defClass.newInstance();
				Class<? extends IBaseResource> resType = myBaseFhirDao.getContext().getResourceDefinition(resEntity.getResourceType()).getImplementingClass();
				if(resType != null){
					CriteriaQuery<Long> criteria = builder.createQuery(Long.class); 
					criteria.select(builder.count(criteria.from(defClass)));
					Long r = myEntityManager.createQuery(criteria).getSingleResult(); 
					retVal.put(resType.getSimpleName(), r);					
				}
			} catch (ClassNotFoundException e) {
				ourLog.error("Resource count: the class {} wasn't found in the classpath.", className);
			} catch (InstantiationException e) {
				// TODO use mirrors lib
			} catch (IllegalAccessException e) {
			}
		}

		return retVal;
	}

	@Override
	public T transaction(T theResources) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public MetaDt metaGetOperation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void notifyWriteCompleted() {
		// TODO Auto-generated method stub
		
	}

}
