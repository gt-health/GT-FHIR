package edu.gatech.i3l.fhir.jpa.dao;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import edu.gatech.i3l.fhir.dstu2.entities.ConditionOccurrenceComplement;
import edu.gatech.i3l.fhir.dstu2.entities.DrugExposurePrescriptionDispensed;
import edu.gatech.i3l.fhir.dstu2.entities.DrugExposurePrescriptionWritten;
import edu.gatech.i3l.fhir.dstu2.entities.MedicationConcept;
import edu.gatech.i3l.fhir.dstu2.entities.Observation;
import edu.gatech.i3l.fhir.dstu2.entities.PersonComplement;
import edu.gatech.i3l.fhir.dstu2.entities.VisitOccurrence;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;

public class DefaultFhirSystemDao<T> extends BaseFhirSystemDao<T>{
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(DefaultFhirSystemDao.class);

	@Override
	//FIXME performance bottleneck: this should me mapped to another url path that would be called by the client using ajax
	public Map<String, Long> getResourceCounts() {
		Map<String, Long> retVal = new HashMap<String, Long>();
//		CriteriaBuilder builder = getBaseFhirDao().getEntityManager().getCriteriaBuilder();
//		List<Class<? extends BaseResourceEntity>> entities = Arrays.asList(ConditionOccurrenceComplement.class, DrugExposurePrescriptionDispensed.class, 
//				DrugExposurePrescriptionWritten.class, MedicationConcept.class, Observation.class, PersonComplement.class, VisitOccurrence.class);
//		for (Class<? extends BaseResourceEntity> entityClass : entities) {
//			CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
//			criteria.select(builder.count(criteria.from(entityClass)));
//			Long r = myEntityManager.createQuery(criteria).getSingleResult(); 
//			try {
//				retVal.put(entityClass.newInstance().getResourceType(), r);
//			} catch (InstantiationException e) {
//				ourLog.error(e.getMessage());
//			} catch (IllegalAccessException e) {
//				ourLog.error(e.getMessage());
//			}
//		}
		return retVal;
	}

}
