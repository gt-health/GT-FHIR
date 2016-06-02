package edu.gatech.i3l.omop.mapping;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import edu.gatech.i3l.fhir.dstu2.entities.Concept;
import edu.gatech.i3l.fhir.jpa.dao.BaseFhirDao;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;

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
	
	/*
	 * Concepts' Classes
	 */
	public static final String UNDEFINED = "Undefined";
	public static final String GENDER = "Gender";
	public static final String MARITAL_STATUS = "Marital Status";
	public static final String DRUG_EXPOSURE_TYPE = "Drug Exposure Type";
	public static final String CLINICAL_FINDING = "Clinical finding";
	public static final String QUALIFIER_VALUE = "Qualifier Value";
	public static final String PROCEDURE = "Procedure";
	public static final String OBSERVABLE_ENTITY = "Observable entity";
	public static final String CONDITION_TYPE = "Condition Occurrence Type";
	public static final String LOINC_CODE = "LOINC Code";
	public static final String UCUM_CODE = "UCUM";
	public static final String UCUM_CODE_STANDARD = "UCUM Standard";
	public static final String UCUM_CODE_CUSTOM = "UCUM Custom";
	public static final String PLACE_OF_SERVICE = "Place of Service";
	
	
	/*
	 * Vocabularies
	 */
	private static final String OMOP_4_5 = "OMOP Vocabulary v4.5 20-Oct-2014";
	private static final String GENDER_VOCABULARY = "HL7 Administrative Sex";
	private static final String SNOMED_CT = "SNOMED-CT";
	private static final String LOINC = "LOINC";
	private static final String OMOP_CONDITION_TYPE = "OMOP Condition Occurrence Type";
	private static final String UCUM = "UCUM";
	private static final String CMS_PLACE_OF_SERVICE = "CMS Place of Service";
	
	/**
	 * A mapping for some of the existing concepts in the database. The key for the outter mapping is the Concept Class.
	 * The inner map has the value(name) of the Concept as key and the respective id in the database as values in the map.
	 */
	protected Map<String, Map<String, Long>> concepts = new HashMap<String, Map<String, Long>>();
	
	private OmopConceptMapping(){}
	
	public void loadConcepts(){
		CriteriaBuilder builder = entityManager.getCriteriaBuilder();
		concepts.put(GENDER, findConceptMap(builder, GENDER, GENDER_VOCABULARY));
		concepts.put(DRUG_EXPOSURE_TYPE, findConceptMap(builder, DRUG_EXPOSURE_TYPE, null));
		concepts.put(CLINICAL_FINDING, findConceptMap(builder, CLINICAL_FINDING, SNOMED_CT)); //TODO test size of the object/map
		concepts.put(CONDITION_TYPE, findConceptMap(builder, CONDITION_TYPE, OMOP_CONDITION_TYPE));
		concepts.put(QUALIFIER_VALUE, findConceptMap(builder, QUALIFIER_VALUE, OMOP_4_5));
		concepts.put(LOINC_CODE, findConceptMap(builder, LOINC_CODE, LOINC));
		concepts.put(UCUM_CODE, findConceptMap(builder, UCUM_CODE, UCUM));
		concepts.put(UCUM_CODE_STANDARD, findConceptMap(builder, UCUM_CODE, UCUM));
		concepts.put(UCUM_CODE_CUSTOM, findConceptMap(builder, UCUM_CODE, UCUM));
	}
	
	public static OmopConceptMapping getInstance(){
		return omopConceptMapping;
	}
	
	/**
	 * Searches on the database for the concepts, using, as filters, the concept class and the respective vocabulary name.
	 * @param builder
	 * @param conceptClass
	 * @param vocabularyName
	 * @return A map containing the names(values) of the concepts and their respective id's in the database.
	 */
	private Map<String, Long> findConceptMap(CriteriaBuilder builder, String conceptClass, String vocabularyName){
		CriteriaQuery<Object[]> criteria = builder.createQuery(Object[].class);
		Root<Concept> from = criteria.from(Concept.class);
		Path<Long> idPath = from.get("id");
		Path<String> codePath = from.get("conceptCode");
		criteria.multiselect(codePath, idPath); //TODO unit test, order matters here
		Predicate p1 = builder.like(from.get("conceptClass").as(String.class), conceptClass);
		if(vocabularyName != null){
			Predicate p2 = builder.like(from.get("vocabulary").get("name").as(String.class), vocabularyName);  
			criteria.where(builder.and(p1, p2)); 
		} else{
			criteria.where(builder.and(p1));
		}
		TypedQuery<Object[]> query = entityManager.createQuery(criteria);
		Map<String, Long> retVal = new HashMap<String, Long>();
		List<Object[]> resultList = query.getResultList();
		for (Object[] result : resultList) {
			retVal.put(((String)result[0]).toLowerCase(), (Long)result[1]);
		}
		return retVal; 
	}

	@Override
	public void run() {
		String baseFhirDao = "myBaseDao";
		WebApplicationContext myAppCtx = ContextLoaderListener.getCurrentWebApplicationContext();
		entityManager = myAppCtx.getBean(baseFhirDao, BaseFhirDao.class).getEntityManager();
		loadConcepts();
	}

	public Long get(String conceptValue, String... conceptClass) {
		Long retVal = null;
		for (int i = 0; i < conceptClass.length; i++) {
			Map<String, Long> concepts = this.concepts.get(conceptClass[i]);
			if(concepts != null){
				retVal = concepts.get(conceptValue.toLowerCase()); 
				if(retVal != null){
					return retVal;
				}
			}
		}
		ourLog.warn("A respective value for {} '{}' could not be found in the database.", conceptClass, conceptValue);
		return retVal;
	}
	
	public Long get(String conceptCode){
		Query query = entityManager.createNamedQuery("findConceptByCode", Long.class).setParameter("code", conceptCode);
		return (Long) query.getSingleResult();
	}

	public Map<String, Long> getConceptsForClass(String conceptClass) {
		return concepts.get(conceptClass);
	}
	
	public Object loadEntityById(Class<? extends BaseResourceEntity> class1, Long primaryKey){
		return entityManager.find(class1, primaryKey);
	}
}
