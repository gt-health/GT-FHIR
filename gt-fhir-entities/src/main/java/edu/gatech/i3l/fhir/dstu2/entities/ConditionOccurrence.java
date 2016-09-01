/**
 * 
 */
package edu.gatech.i3l.fhir.dstu2.entities;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IDatatype;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import ca.uhn.fhir.model.dstu2.valueset.ConditionCategoryCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConditionVerificationStatusEnum;
import ca.uhn.fhir.model.primitive.BoundCodeableConceptDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.enums.Omop4ConceptsFixedIds;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

/**
 * @author Myung Choi
 *
 */
@Entity
@Table(name="condition_occurrence")
@Inheritance(strategy=InheritanceType.JOINED)
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
@NamedQueries(value = { @NamedQuery( name = "findConditionBySourceValue", query = "select id from ConditionOccurrence c where c.conditionSourceValue like :source")})
public class ConditionOccurrence extends BaseResourceEntity {

	public static final String RESOURCE_TYPE = "Condition";

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="condition_occurrence_seq_gen")
	@SequenceGenerator(name="condition_occurrence_seq_gen", sequenceName="condition_occurrence_id_seq", allocationSize=1)
	@Column(name="condition_occurrence_id")
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="person_id", nullable=false)
	@NotNull
	private PersonComplement person;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="condition_concept_id", nullable=false)
	@NotNull
	private Concept conditionConcept;
	
	@Column(name="condition_start_date", nullable=false)
	@NotNull
	private Date startDate;
	
	@Column(name="condition_end_date", nullable=false)
	private Date endDate;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="condition_type_concept_id", nullable=false)
	@NotNull
	private Concept conditionTypeConcept;
	
	@Column(name="stop_reason")
	private String stopReason;
	
	/**
	 * @omop 
	 * @fhir Asserter:
	 * 			person who asserts this condition (Practitioner or Patient)
	 * @fhirVersion 0.4.0
	 * @omopVersion 4.0
	 */
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="provider_id")
	private Provider provider;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="visit_occurrence_id")
	private VisitOccurrence encounter;
	
	@Column(name="condition_source_value")
	private String conditionSourceValue; 

	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="condition_source_concept_id")
	private Concept conditionSourceConcept;
	
	public ConditionOccurrence() {
		super();
	}

	public ConditionOccurrence(Long id, PersonComplement person, Concept conditionConcept, Date startDate, Date endDate,
			Concept conditionTypeConcept, String stopReason, Provider provider, VisitOccurrence encounter,
			String sourceValue, Concept sourceConcept) {
		super();

		this.id = id;
		this.person = person;
		this.conditionConcept = conditionConcept;
		this.startDate = startDate;
		this.endDate = endDate;
		this.conditionTypeConcept = conditionTypeConcept;
		this.stopReason = stopReason;
		this.provider = provider;
		this.encounter = encounter;
		this.conditionSourceValue = sourceValue;
		this.conditionSourceConcept = sourceConcept;
	}

	
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getResourceType() {
		return RESOURCE_TYPE;
	}

	public PersonComplement getPerson() {
		return person;
	}

	public void setPerson(PersonComplement person) {
		this.person = person;
	}

	public Concept getConditionConcept() {
		return conditionConcept;
	}

	public void setConditionConcept(Concept conditionConcept) {
		this.conditionConcept = conditionConcept;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Concept getConditionTypeConcept() {
		return conditionTypeConcept;
	}

	public void setConditionTypeConcept(Concept conditionTypeConcept) {
		this.conditionTypeConcept = conditionTypeConcept;
	}

	public String getStopReason() {
		return stopReason;
	}

	public void setStopReason(String stopReason) {
		this.stopReason = stopReason;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public VisitOccurrence getEncounter() {
		return encounter;
	}

	public void setEncounter(VisitOccurrence encounter) {
		this.encounter = encounter;
	}

	public String getSourceValue() {
		return conditionSourceValue;
	}

	public void setSourceValue(String sourceValue) {
		this.conditionSourceValue = sourceValue;
	}
	
	public Concept getSourceConcept() {
		return conditionSourceConcept;
	}
	
	public void setSourceConcept(Concept sourceConcept) {
		this.conditionSourceConcept = sourceConcept;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		if (resource instanceof Condition){
			Condition condition = (Condition) resource;
			//Get or Empty Create a new patient
			ResourceReferenceDt patientReference = (ResourceReferenceDt)condition.getPatient();
			if(patientReference != null){
				Long patientRef = condition.getPatient().getReference().getIdPartAsLong();
				if(patientRef != null){
					// We have person reference. We have to make sure if this patient exists.
					PersonComplement patientClass = (PersonComplement) OmopConceptMapping.getInstance().loadEntityById(PersonComplement.class, patientRef);
					if (patientClass != null) {
						this.setPerson(patientClass);
					} 
					else {
						// Before we need to create one, let's see if we have received this before using the source value.
						patientClass = (PersonComplement) OmopConceptMapping.getInstance().loadEntityBySource(PersonComplement.class, "PersonComplement", "personSourceValue", patientRef.toString());
						if (patientClass == null) {
							this.person = new PersonComplement();
							this.person.setPersonSourceValue(patientRef.toString());
							if (patientReference.getDisplay() != null)
								this.person.setNameFromString(patientReference.getDisplay().getValueAsString());
						}
						else {
							this.setPerson(patientClass);
						}
					}
				}
			}
			//GET or Empty Create a new Provider.
			//NOTE: in FHIR, this can be a practitioner or Patient. We're assuming a practitioner in the OMOP world
			ResourceReferenceDt practitionerReference = (ResourceReferenceDt)condition.getAsserter();
			if(practitionerReference != null){
				Long practitionerRef = practitionerReference.getReference().getIdPartAsLong();
				if(practitionerRef != null) {
					Provider providerClass = (Provider) OmopConceptMapping.getInstance().loadEntityById(Provider.class, practitionerRef);
					if(providerClass != null) {
						this.setProvider(providerClass);
					}
					else {
						providerClass = (Provider) OmopConceptMapping.getInstance().loadEntityBySource(Provider.class, "Provider", "providerSourceValue", practitionerRef.toString());
						if(providerClass == null){
							this.provider = new Provider();
							this.provider.setProviderSourceValue(practitionerRef.toString());
						}
						else{
							this.setProvider(providerClass);
						}
					}
				}
			}
			//Get or Empty Create a new Encounter
			ResourceReferenceDt encounterReference = (ResourceReferenceDt)condition.getEncounter();
			if(encounterReference != null){
				Long encounterRef = encounterReference.getReference().getIdPartAsLong();
				if(encounterRef != null) {
					VisitOccurrence encounterClass = (VisitOccurrence) OmopConceptMapping.getInstance().loadEntityById(VisitOccurrence.class, encounterRef);
					if(encounterClass != null) {
						this.setEncounter(encounterClass);
					}
					else {
						encounterClass = (VisitOccurrence) OmopConceptMapping.getInstance().loadEntityBySource(VisitOccurrence.class, "VisitOccurrence", "visitSourceValue", encounterRef.toString());
						if(encounterClass == null){
							this.encounter = new VisitOccurrence();
							this.encounter.setVisitSourceValue(encounterRef.toString());
							this.encounter.setPerson(this.person);
							this.encounter.setProvider(this.provider);
						}
						else{
							this.setEncounter(encounterClass);
						}
					}
				}
			}
			
			OmopConceptMapping ocm = OmopConceptMapping.getInstance();
			Long conditionConceptRef = ocm.get(condition.getCode().getCodingFirstRep().getCode());
			if(conditionConceptRef != null){
				this.conditionConcept = new Concept();
				this.conditionConcept.setId(conditionConceptRef);
			}
			IDatatype onSetDate = condition.getOnset();
			if (onSetDate instanceof DateTimeDt) {
				DateTimeDt dateTimeDt = (DateTimeDt) onSetDate;
				this.startDate = dateTimeDt.getValue();
			} else if (onSetDate instanceof PeriodDt) {
				PeriodDt periodDt = (PeriodDt) onSetDate;
				this.startDate = periodDt.getStart();
				this.endDate = periodDt.getEnd();
			}

			Long encounterReferenceLong = condition.getEncounter().getReference().getIdPartAsLong();
			this.conditionTypeConcept = new Concept();
			if (encounterReferenceLong!= null) {
				this.conditionTypeConcept.setId(Omop4ConceptsFixedIds.PRIMARY_CONDITION.getConceptId());
				this.encounter = new VisitOccurrence();
				this.encounter.setId(encounterReferenceLong);
			}
			
			ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt<ConditionCategoryCodesEnum> condCategory = condition.getCategory();
			CodingDt condCatCoding = condCategory.getCodingFirstRep();
			if (condCatCoding != null) {
				if (condCatCoding.getCode().equalsIgnoreCase(ConditionCategoryCodesEnum.COMPLAINT.getCode())) {
					this.conditionTypeConcept.setId(Omop4ConceptsFixedIds.PATIENT_SELF_REPORT.getConceptId());
				} else {
					this.conditionTypeConcept.setId(Omop4ConceptsFixedIds.EHR_PROBLEM_ENTRY.getConceptId());
				}
			}

			// this.stopReason = stopReason; NOTE: no FHIR parameter for
			// stopReason.

			IdDt asserterReference = condition.getAsserter().getReference();
				if (asserterReference.getIdPartAsLong() != null && asserterReference.getResourceType() != null 
						&& asserterReference.getResourceType().equalsIgnoreCase(Provider.RESOURCE_TYPE)) {
					long providerId = asserterReference.getIdPartAsLong();
					this.provider = new Provider();
					this.provider.setId(providerId);
				}

			this.conditionSourceValue = "FHIRCREATE";
		}

		return this;
	}
	
	@Override
	public Condition getRelatedResource() {
		Condition condition = new Condition();

		// Populate condition parameters.
		// Refer to 4.3.3 at http://hl7-fhir.github.io/condition.html

		condition.setId(this.getIdDt());

		// Set patient reference to Patient (note: in dstu1, this was subject.)
		ResourceReferenceDt patientReference = new ResourceReferenceDt(new IdDt(Person.RES_TYPE, this.person.getId()));
		patientReference.setDisplay(this.person.getNameAsSingleString());
		condition.setPatient(patientReference);

		// Set encounter if exists.
		if (encounter != null && encounter.getId() > 0) {
			// FIXME: encounter resource not yet implemented.
			// we just create this reference resource manually. When encounter
			// is implemented, we
			// will get it from visit_occurrence class.
			ResourceReferenceDt encounterReference = new ResourceReferenceDt(new IdDt(VisitOccurrence.RES_TYPE, this.encounter.getId()));
			condition.setEncounter(encounterReference);
		}

		// Set asserter if exists
		// This can be either Patient or Practitioner.
		if (provider != null && provider.getId() > 0) {
			ResourceReferenceDt practitionerReference = new ResourceReferenceDt(new IdDt(Provider.RESOURCE_TYPE, provider.getId()));
			practitionerReference.setDisplay(this.provider.getProviderName());
			condition.setAsserter(practitionerReference);
		}

		// Set Code
		// System.out.println("ConceptID:"+this.getConditionConcept().getId().toString());
		// System.out.println("ConceptName:"+this.getConditionConcept().getName());
		//
		// Vocabulary myVoc = this.getConditionConcept().getVocabulary();
		//
		// System.out.println("VocabularyID:"+myVoc.getId());
		// System.out.println("VocabularyName:"+myVoc.getName());

		// First check if ICD codes are available.
		String theSystem;
		String theCode;
		String theDisplay = "";
//		if (this.sourceValue.startsWith("icd-9-cm:") == true) {
//			theSystem = "http://hl7.org/fhir/sid/icd-9-cm";
//			theCode = this.sourceValue.substring(9);
//		} else {
		theSystem = conditionConcept.getVocabulary().getSystemUri();
		theCode = conditionConcept.getConceptCode();
		theDisplay = conditionConcept.getName();
//		}

		CodeableConceptDt conditionCodeConcept = new CodeableConceptDt();
		if (theSystem != "") {
			// Create coding here. We have one coding in this condition as OMOP
			// allows one coding concept per condition.
			// In the future, if we want to allow multiple coding concepts here,
			// we need to do it here.
			CodingDt coding = new CodingDt(theSystem, theCode);
			coding.setDisplay(theDisplay);
			conditionCodeConcept.addCoding(coding);
		}

		// FHIR does not require the coding. If our System URI is not mappable
		// from
		// OMOP database, then coding would be empty. Set Text here. Even text
		// is not
		// required in FHIR. But, then no reason to have this condition, I
		// think...
		String theText = conditionConcept.getName() + ", " + conditionConcept.getVocabulary().getName() + ", "
				+ conditionConcept.getConceptCode();

		conditionCodeConcept.setText(theText);
		condition.setCode(conditionCodeConcept);

		// Set clinicalStatus
		// We have clinicalStatus information in the FHIR extended table. This
		// will
		// be set in the extended class.

		// Set severity
		// We have this as well in the FHIR exteded table.

		// Set onset[x]
		// We may have only one date if this condition did not end. If ended, we
		// have
		// a period. First, check if endDate is available.
		DateTimeDt startDateDt = new DateTimeDt(startDate);
		if (endDate == null) {
			// Date
			condition.setOnset(startDateDt);
		} else {
			// Period
			DateTimeDt endDateDt = new DateTimeDt(endDate);
			PeriodDt periodDt = new PeriodDt();
			periodDt.setStart(startDateDt);
			periodDt.setEnd(endDateDt);
			condition.setOnset(periodDt);
		}
		
		// Category
		Concept myCat = this.getConditionConcept();
		if (myCat.getId() == Omop4ConceptsFixedIds.PATIENT_SELF_REPORT.getConceptId()) {
			condition.setCategory(ConditionCategoryCodesEnum.COMPLAINT);
		} else {
			condition.setCategory(ConditionCategoryCodesEnum.FINDING);
		}

		// VerficationStutus 
		condition.setVerificationStatus(ConditionVerificationStatusEnum.CONFIRMED);

		return condition;
	}
		
		
	@Override
	public FhirVersionEnum getFhirVersion() {
		return FhirVersionEnum.DSTU2;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String translateSearchParam(String link) {
		switch (link) {
		case Condition.SP_CODE:
			return "conditionConcept.conceptCode";
		case Condition.SP_ONSET:
			return "startDate";
		case Condition.SP_ENCOUNTER:
			return "encounter";
		case Condition.SP_PATIENT:
			return "person";
//		case Condition.SP_SUBJECT:
//			return "person";
		default:
			break;
		}
		return link;
	}
}