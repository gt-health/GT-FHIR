package edu.gatech.i3l.fhir.jpa.dao;

import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Path;
import javax.persistence.criteria.Predicate;
import javax.validation.ConstraintViolation;
import javax.validation.Validator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.Observation;
import ca.uhn.fhir.model.dstu2.resource.OperationOutcome;
import ca.uhn.fhir.model.dstu2.valueset.IssueSeverityEnum;
import ca.uhn.fhir.model.dstu2.valueset.IssueTypeEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.rest.server.exceptions.UnprocessableEntityException;
import edu.gatech.i3l.fhir.dstu2.entities.OmopMeasurement;
import edu.gatech.i3l.fhir.dstu2.entities.OmopObservation;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.fhir.jpa.query.AbstractPredicateBuilder;
import edu.gatech.i3l.fhir.jpa.query.PredicateBuilder;
import edu.gatech.i3l.fhir.jpa.util.StopWatch;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;
import net.vidageek.mirror.dsl.Mirror;
import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.model.api.IResource;

@Transactional(propagation = Propagation.REQUIRED)
public class ObservationFhirResourceDao extends BaseFhirResourceDao<Observation>{
	// Observation FHIR mapping to OMOP v5 requires accessing two different tables in OMOP v5.
	// To support C U and D from CRUD operation, we have to overwrite the base FHIR resource DAO methods
	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(BaseFhirResourceDao.class);

	/* (non-Javadoc)
	 * @see edu.gatech.i3l.fhir.jpa.dao.BaseFhirResourceDao#create(ca.uhn.fhir.model.api.IResource, java.lang.String, boolean)
	 */
	@Override
	public DaoMethodOutcome create(Observation theResource, String theIfNoneExist, boolean thePerformIndexing) {
		// TODO Auto-generated method stub
		System.out.println("ObservationFhirResourceDao create");
		return observationCreate(theResource, theIfNoneExist, thePerformIndexing);
	}

	private DaoMethodOutcome observationCreate(Observation theResource, String theIfNoneExist, boolean thePerformIndexing) {
		Validator myBeanValidator = getBeanValidator();
		boolean myValidateBean = isValidateBean();
		FhirContext myContext = getContext();
		BaseFhirDao baseFhirDao = getBaseFhirDao();
		Class<Observation> myResourceType = getResourceType();
		OmopConceptMapping ocm = OmopConceptMapping.getInstance();
		Class<? extends IResourceEntity> myEntityClass;
		
		StopWatch w = new StopWatch();
		String code = theResource.getCode().getCodingFirstRep().getCode();
		String domain = ocm.getDomain(code);
		if (domain.equalsIgnoreCase("measurement"))
			myEntityClass = edu.gatech.i3l.fhir.dstu2.entities.OmopMeasurement.class;
		else if (domain.equalsIgnoreCase("observation"))
			myEntityClass = edu.gatech.i3l.fhir.dstu2.entities.OmopObservation.class;
		else {
			OperationOutcome oo = new OperationOutcome();
			oo.addIssue().setSeverity(IssueSeverityEnum.ERROR).setCode(IssueTypeEnum.INVALID_CODE).setDetails((new CodeableConceptDt()).setText("Coding System Not Supported. We support Measurement or Observation domain code in OMOP v5"));
			throw new UnprocessableEntityException(myContext, oo);
		}
		
		BaseResourceEntity entity = (BaseResourceEntity) new Mirror().on(myEntityClass).invoke().constructor().withoutArgs();
		entity.constructEntityFromResource(theResource);
		if(myValidateBean){
			Set<ConstraintViolation<BaseResourceEntity>> violations = myBeanValidator.validate(entity);
			if(!violations.isEmpty()){
				OperationOutcome oo = new OperationOutcome();
				for (ConstraintViolation<BaseResourceEntity> violation : violations) {
					oo.addIssue().setSeverity(IssueSeverityEnum.ERROR).setCode(IssueTypeEnum.PROCESSING_FAILURE).setDetails((new CodeableConceptDt()).setText(violation.getPropertyPath()+" "+ violation.getMessage()));
				}
				throw new UnprocessableEntityException(myContext, oo);
			}
		}

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
	
	public ObservationFhirResourceDao() {
		super();
		setResourceEntity(edu.gatech.i3l.fhir.dstu2.entities.Observation.class); //TODO set this automatically; this is error prone since we need to remember to set this on each dao class
		setValidateBean(true);
	}
	
	@Override
	public PredicateBuilder getPredicateBuilder() {
		return  new AbstractPredicateBuilder() {
			
			private static final String LOINC = "loinc";
			private static final String SNOMED = "snomed";
			private static final String ICD_9 = "icd-9";
			private static final String ICD_9_CM = "icd-9-cm";
			private static final String ICD_9_PROC = "icd-9-proc";
			private static final String RXNORM = "rxnorm";
			private static final String UCUM = "ucum";
			private static final String ICD_10 = "icd-10";
			
			@Override
			public Predicate addCommonPredicate(CriteriaBuilder builder, From<? extends IResourceEntity, ? extends IResourceEntity> from) {
//				builder.asc(from.get("id"));
				return builder.notEqual(from.get("observationConcept").get("id"), edu.gatech.i3l.fhir.dstu2.entities.Observation.DIASTOLIC_CONCEPT_ID);
				//In Omop database, the dictionary is static; that means we can reference id's directly: the id for the vocabulary RxNorm is 8
			}

			@Override
			public Predicate translatePredicateTokenSystem(Class<? extends IResourceEntity> entity, String theParamName, String system, From<? extends IResourceEntity, ? extends IResourceEntity> from,
					CriteriaBuilder theBuilder) {
				Predicate predicate = null;
				if (system == null) {
					return null;
				}
				
				system = getVocabularyName(system);
				
				Path<Object> path = null;
				switch (theParamName) {
				case Observation.SP_CODE:
					path = from.get("observationConcept").get("vocabulary").get("id");
					break;
				case Observation.SP_CODE_VALUE_CONCEPT:
					path = from.get("observationConcept").get("vocabulary").get("id");
					break;
				default:
					break;
				}
				if (StringUtils.isNotBlank(system) && path != null) {
					 predicate = theBuilder.like(path.as(String.class), system+"%");
				}//	else {
//					return theBuilder.isNull(path); //WARNING originally, if the system is empty, then it would be checked for null systems
//				}
				return predicate;
			}
			
			private String getVocabularyName(String system) {
				if(system.contains(SNOMED)){
					return "SNOMED";
				} else if (system.contains(LOINC)){
					return "LOINC";
				} else if (system.contains(ICD_10)){
					return "ICD10";
				} else if (system.contains(ICD_9)){
					return "ICD9CM";
				} else if (system.contains(ICD_9_CM)){
					return "ICD9CM";
				} else if (system.contains(ICD_9_PROC)){
					return "ICD9Proc";
				} else if (system.contains(RXNORM)){
					return "RxNorm";
				} else if (system.contains(UCUM)){
					return "UCUM";
				}
				return "";
			}

			@Override
			public Predicate translatePredicateTokenCode(Class<? extends IResourceEntity> entity, String theParamName, String code, From<? extends IResourceEntity, ? extends IResourceEntity> from,
					CriteriaBuilder theBuilder) {
				Predicate predicate = null;
				Path<Object> path = null;
				switch (theParamName) {
				case Observation.SP_CODE:
					path = from.get("observationConcept").get("conceptCode");
					break;
				default:
					break;
				}
				if (StringUtils.isNotBlank(code)) {
					predicate = theBuilder.equal(path, code);
				} //else {
//					return theBuilder.isNull(path);
//				}
				return predicate;
			}

		};
	}

}
