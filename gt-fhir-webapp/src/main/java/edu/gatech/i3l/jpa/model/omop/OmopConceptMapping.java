package edu.gatech.i3l.jpa.model.omop;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import ca.uhn.fhir.jpa.dao.BaseFhirDao;

/**
 * This class serves as cache for Concept values in Omop schema based database.
 * It is suggested to statr a new thread and pass this singleton to run.
 * 
 * @author Ismael Sarmento
 */
public class OmopConceptMapping implements Runnable {
	
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(OmopConceptMapping.class);
	private static OmopConceptMapping omopConceptMapping = new OmopConceptMapping();
	private EntityManager entityManager;
	
	public static final String GENDER = "Gender";
	protected Map<String, List<Concept>> concepts = new HashMap<String, List<Concept>>();
	
	private OmopConceptMapping(){}
	
	public void loadConcepts(){
		concepts.put(GENDER, getGenderClassConcept());
	}
	
	public static OmopConceptMapping getInstance(){
		return omopConceptMapping;
	}
	
	public List<Concept> getGenderClassConcept(){
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();//FIXME
		CriteriaQuery<Concept> criteria = builder.createQuery(Concept.class);
		Root<Concept> from = criteria.from(Concept.class);
		Expression<Long> idPath = from.get("id").as(Long.class);
		Expression<String> namePath = from.get("name").as(String.class);
		criteria.multiselect(idPath, namePath);
		Predicate p1 = builder.like(from.get("klass").as(String.class), GENDER);
		Predicate p2 = builder.like(from.get("vocabulary").get("name").as(String.class), "HL7 Administrative Sex"); //WARNING test this; error prone 
		criteria.where(builder.and(p1, p2));
		TypedQuery<Concept> query = entityManager.createQuery(criteria);
		List<Concept> resultList = query.getResultList();
		return resultList; 
	}

	@Override
	public void run() {
		String baseFhirDao = "myBaseDao";
		WebApplicationContext myAppCtx = ContextLoaderListener.getCurrentWebApplicationContext();
		entityManager = myAppCtx.getBean(baseFhirDao, BaseFhirDao.class).getEntityManager();
		loadConcepts();
	}

	public Concept get(String gender, String value) {
		Concept retVal = null;
		List<Concept> genderConcepts = concepts.get(GENDER);
		for (Concept genderConcept : genderConcepts) {
			if(value.equalsIgnoreCase(genderConcept.getName())){
				retVal = genderConcept;
				break;
			} 
		}
		if(retVal == null){
			ourLog.error("A respective value for Gender '?' could not be found in the database.",value);
		}
		return retVal;
	}
}
