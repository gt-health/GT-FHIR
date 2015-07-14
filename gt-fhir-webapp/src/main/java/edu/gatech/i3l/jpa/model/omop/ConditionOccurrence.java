/**
 * 
 */
package edu.gatech.i3l.jpa.model.omop;

import java.util.Date;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IDatatype;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;

/**
 * @author MC142
 *
 */
public class ConditionOccurrence extends BaseResourceEntity {

	public static final String RESOURCE_TYPE = "Condition";

	private Long id;
	private Person person;
	private Concept conditionConcept;
	private Date startDate;
	private Date endDate;
	private Concept conditionTypeConcept;
	private String stopReason;
	private Provider provider;
	private VisitOccurrence encounter;
	private String sourceValue;

	public ConditionOccurrence() {
		super();
	}

	public ConditionOccurrence(Long id, Person person, Concept conditionConcept, Date startDate, Date endDate,
			Concept conditionTypeConcept, String stopReason, Provider provider, VisitOccurrence encounter,
			String sourceValue) {
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
		this.sourceValue = sourceValue;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see edu.gatech.i3l.jpa.model.omop.IResourceTable#getRelatedResource()
	 */
	@Override
	public Condition getRelatedResource() {
		Condition condition = new Condition();

		// Populate condition parameters.
		// Refer to 4.3.3 at http://hl7-fhir.github.io/condition.html

		// set Identifier
		condition.setId(getIdDt());

		// Set patient reference to Patient (note: in dstu1, this was subject.)
		ResourceReferenceDt patientReference = new ResourceReferenceDt(person.getIdDt());
		condition.setPatient(patientReference);

		// Set encounter if exists.
		if (encounter != null && encounter.getId() > 0) {
			// FIXME: encounter resource not yet implemented.
			// we just create this reference resource manually. When encounter
			// is implemented, we
			// will get it from visit_occurrence class.
			ResourceReferenceDt encounterReference = new ResourceReferenceDt(encounter.getIdDt());
			condition.setEncounter(encounterReference);
		}

		// Set asserter if exists
		// This can be either Patient or Practitioner.
		if (provider != null && provider.getId() > 0) {
			ResourceReferenceDt practitionerReference = new ResourceReferenceDt(provider.getIdDt());
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

		String theSystem = conditionConcept.getVocabulary().getSystemUri();
		String theCode = conditionConcept.getConceptCode();

		CodeableConceptDt conditionCodeConcept = new CodeableConceptDt();
		if (theSystem != "") {
			// Create coding here. We have one coding in this condition as OMOP
			// allows one coding concept per condition.
			// In the future, if we want to allow multiple coding concepts here,
			// we need to do it here.
			CodingDt coding = new CodingDt(theSystem, theCode);
			coding.setDisplay(conditionConcept.getName());
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

		return condition;
	}

	public Class<? extends IResource> getRelatedResourceType() {
		return Condition.class;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IdDt getIdDt() {
		return new IdDt(getResourceType(), id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getResourceType()
	 */
	@Override
	public String getResourceType() {
		return RESOURCE_TYPE;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
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
		return sourceValue;
	}

	public void setSourceValue(String sourceValue) {
		this.sourceValue = sourceValue;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		if (resource instanceof Condition) {
			Condition condition = (Condition) resource;

			this.person = new Person();
			this.person.setId(condition.getPatient().getReference().getIdPartAsLong());

			CodeableConceptDt codeableConcept = condition.getCode();
			CodingDt code = codeableConcept.getCoding().get(0);
			this.conditionConcept = new Concept();
			this.conditionConcept.setConceptCode(code.getCode());
			String uri = code.getSystem();

			Vocabulary vocabularyCode = new Vocabulary();
			vocabularyCode.setIdNameBySystemUri(uri);
			this.conditionConcept.setVocabulary(vocabularyCode);

			IDatatype onSetDate = condition.getOnset();
			if (onSetDate instanceof DateTimeDt) {
				DateTimeDt dateTimeDt = (DateTimeDt) onSetDate;
				this.startDate = dateTimeDt.getValue();
			} else if (onSetDate instanceof PeriodDt) {
				PeriodDt periodDt = (PeriodDt) onSetDate;
				this.startDate = periodDt.getStart();
				this.endDate = periodDt.getEnd();
			}

			this.conditionTypeConcept = new Concept();
			ResourceReferenceDt encounterReference = condition.getEncounter();
			Vocabulary vocabularyConditionType = new Vocabulary();
			vocabularyConditionType.setId((long) 37);
			this.conditionTypeConcept.setVocabulary(vocabularyConditionType);
			if (encounterReference == null) {
				// No Resource Reference for Encounter.
				// We just assumed that this is EHR Problem List Entry =
				// 38000245
				this.conditionTypeConcept.setConceptCode("38000245");
			} else {
				this.conditionTypeConcept.setConceptCode("44786627");
				long encounterId = encounterReference.getReference().getIdPartAsLong();
				this.encounter = new VisitOccurrence();
				this.encounter.setId(encounterId);
			}

			// this.stopReason = stopReason; NOTE: no FHIR parameter for
			// stopReason.

			ResourceReferenceDt asserterReference = condition.getAsserter();
			if (asserterReference != null) {
				if (asserterReference.getReference().getResourceType().equalsIgnoreCase(Provider.RESOURCE_TYPE)) {
					long providerId = asserterReference.getReference().getIdPartAsLong();
					this.provider = new Provider();
					this.provider.setId(providerId);
				}
			}

			this.sourceValue = "FHIRCREATE";
		}

		return this;
	}

	@Override
	public FhirVersionEnum getFhirVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String translateSearchParam(String link) {
		switch (link) {
		case Condition.SP_ASSERTER:
			System.out.println("translateLink():Asserter=" + link);
			return "provider";
		case Condition.SP_ENCOUNTER:
			System.out.println("translateLink():Encounter=" + link);
			return "encounter";
		case Condition.SP_PATIENT:
			System.out.println("translateLink():Patient=" + link);
			return "person";
		default:
			break;
		}
		return link;
	}
}