package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.Procedure.SP_ENCOUNTER;
import static ca.uhn.fhir.model.dstu2.resource.Procedure.SP_PATIENT;
import static ca.uhn.fhir.model.dstu.resource.Procedure.SP_SUBJECT;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Procedure;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureStatusEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

@Entity
@Table(name = "procedure_occurrence")
public class ProcedureOccurrence extends BaseResourceEntity {

	private static final String RES_TYPE = "Procedure";

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "procedure_occurrence_id")
	@Access(AccessType.PROPERTY)
	private Long id;

	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "person_id", nullable = false)
	@NotNull
	private Person person;

	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "procedure_concept_id", nullable = false)
	@NotNull
	private Concept procedureConcept;

	@Column(name = "procedure_date", nullable = false)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date date;

	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "procedure_type_concept_id", nullable = false)
	@NotNull
	private Concept procedureTypeConcept;

	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "associated_provider_id")
	private Provider provider;

	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "visit_occurrence_id")
	private VisitOccurrence visitOccurrence;

	@ManyToOne(cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "relevant_condition_concept_id")
	private Concept relevantConditionConcept;

	@Column(name = "procedure_source_value")
	private String procedureSourceValue;

	public ProcedureOccurrence() {
		super();
	}

	public ProcedureOccurrence(Long id, Person person, Concept procedureConcept, Date date, Concept procedureTypeConcept,
			Provider provider, VisitOccurrence visitOccurrence, Concept relevantConditionConcept,
			String procedureSourceValue) {
		super();
		this.id = id;
		this.person = person;
		this.procedureConcept = procedureConcept;
		this.date = date;
		this.procedureTypeConcept = procedureTypeConcept;
		this.provider = provider;
		this.visitOccurrence = visitOccurrence;
		this.relevantConditionConcept = relevantConditionConcept;
		this.procedureSourceValue = procedureSourceValue;
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Concept getProcedureConcept() {
		return procedureConcept;
	}

	public void setProcedureConcept(Concept procedureConcept) {
		this.procedureConcept = procedureConcept;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Concept getProcedureTypeConcept() {
		return procedureTypeConcept;
	}

	public void setProcedureTypeConcept(Concept procedureTypeConcept) {
		this.procedureTypeConcept = procedureTypeConcept;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public VisitOccurrence getVisitOccurrence() {
		return visitOccurrence;
	}

	public void setVisitOccurrence(VisitOccurrence visitOccurrence) {
		this.visitOccurrence = visitOccurrence;
	}

	public Concept getRelevantConditionConcept() {
		return relevantConditionConcept;
	}

	public void setRelevantConditionConcept(Concept relevantConditionConcept) {
		this.relevantConditionConcept = relevantConditionConcept;
	}

	public String getProcedureSourceValue() {
		return procedureSourceValue;
	}

	public void setProcedureSourceValue(String procedureSourceValue) {
		this.procedureSourceValue = procedureSourceValue;
	}

	@Override
	public FhirVersionEnum getFhirVersion() {
		// TODO Auto-generated method stub
		return FhirVersionEnum.DSTU2;
	}

	@Override
	public String getResourceType() {
		// TODO Auto-generated method stub
		return RES_TYPE;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String translateSearchParam(String theSearchParam) {
		switch (theSearchParam) {
		case SP_PATIENT:
			return "person";
		case SP_ENCOUNTER:
			return "visitOccurrence";
		default:
			break;
		}
		return theSearchParam;
	}

	@Override
	public IResource getRelatedResource() {
		Procedure procedure = new Procedure();
		
		procedure.setId(this.getIdDt());
		
		// Set patient 
		ResourceReferenceDt patientReference = new ResourceReferenceDt(new IdDt(this.person.getResourceType(), this.person.getId()));
		procedure.setPatient(patientReference);
		
		//TODO: revisit this. For now just set to in-progress
		procedure.setStatus(ProcedureStatusEnum.IN_PROGRESS);
		
		String theSystem = procedureConcept.getVocabulary().getSystemUri();
		String theCode = procedureConcept.getConceptCode();

		CodeableConceptDt procedureCodeConcept = new CodeableConceptDt();
		if (theSystem != "") {
			// Create coding here. We have one coding in this condition as OMOP
			// allows one coding concept per condition.
			// In the future, if we want to allow multiple coding concepts here,
			// we need to do it here.
			CodingDt coding = new CodingDt(theSystem, theCode);
			coding.setDisplay(procedureConcept.getName());
			procedureCodeConcept.addCoding(coding);
		}

		// FHIR does not require the coding. If our System URI is not mappable
		// from
		// OMOP database, then coding would be empty. Set Text here. Even text
		// is not
		// required in FHIR. But, then no reason to have this condition, I
		// think...
		String theText = procedureConcept.getName() + ", " + procedureConcept.getVocabulary().getName() + ", "
				+ procedureConcept.getConceptCode();

		procedureCodeConcept.setText(theText);

		// TODO: 		procedure.setCode(procedureCodeConcept);

		procedure.setType(procedureCodeConcept);
		
		DateTimeDt DateDt = new DateTimeDt(date);
		procedure.setPerformed(DateDt);
		
		//TODO: where is code??? For now, I put it in the Note. This is CPT code. 
		procedure.setNotes(this.getProcedureConcept().getConceptCode());
		
		return procedure;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		// TODO CREATE UPDATE not implemented
		return null;
	}

}
