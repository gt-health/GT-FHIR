package edu.gatech.i3l.fhir.dstu3.entities;

import static ca.uhn.fhir.model.dstu2.resource.Procedure.SP_ENCOUNTER;
import static ca.uhn.fhir.model.dstu2.resource.Procedure.SP_PATIENT;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
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
//import ca.uhn.fhir.model.api.IResource;
//import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
//import ca.uhn.fhir.model.dstu2.composite.CodingDt;
//import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.DateTimeType;
import org.hl7.fhir.dstu3.model.Procedure;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.instance.model.api.IBaseResource;

//import ca.uhn.fhir.model.dstu2.valueset.ProcedureStatusEnum;
//import ca.uhn.fhir.model.primitive.DateTimeDt;
//import ca.uhn.fhir.model.primitive.IdDt;
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

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "person_id", nullable = false)
	@NotNull
	private PersonComplement person;

	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "procedure_concept_id")
	private Concept procedureConcept;

	@Column(name = "procedure_date", nullable = false)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date date;

	@ManyToOne(cascade = { CascadeType.MERGE })
	@JoinColumn(name = "procedure_type_concept_id")
	private Concept procedureTypeConcept;

	@ManyToOne
	@JoinColumn(name = "modifier_concept_id")
	private Concept modifierConcept;
	
	@Column(name="quantity")
	private Long quantity;
	
	@ManyToOne   // (cascade = { CascadeType.MERGE }, fetch = FetchType.LAZY)
	@JoinColumn(name = "provider_id")
	private Provider provider;

	@ManyToOne
	@JoinColumn(name = "visit_occurrence_id")
	private VisitOccurrence visitOccurrence;

	@Column(name = "procedure_source_value")
	private String procedureSourceValue;

	@ManyToOne
	@JoinColumn(name = "procedure_source_concept_id")
	private Concept procedureSourceConcept;

	@Column(name = "qualifier_source_value")
	private String qualifierSourceValue;

	public ProcedureOccurrence() {
		super();
	}

	public ProcedureOccurrence(Long id, PersonComplement person, Concept procedureConcept, Date date, Concept procedureTypeConcept,
			Concept modifierConcept, Long quantity, Provider provider, VisitOccurrence visitOccurrence, 
			String procedureSourceValue, Concept procedureSourceConcept, String qualifierSourceValue) {
		super();
		this.id = id;
		this.person = person;
		this.procedureConcept = procedureConcept;
		this.date = date;
		this.procedureTypeConcept = procedureTypeConcept;
		this.modifierConcept = modifierConcept;
		this.quantity = quantity;
		this.provider = provider;
		this.visitOccurrence = visitOccurrence;
		this.procedureSourceValue = procedureSourceValue;
		this.procedureSourceConcept = procedureSourceConcept;
		this.qualifierSourceValue = qualifierSourceValue;
	}

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public PersonComplement getPerson() {
		return person;
	}

	public void setPerson(PersonComplement person) {
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

	public Concept getModifierConcept() {
		return modifierConcept;
	}
	
	public void setModifierConcept(Concept modifierConcept) {
		this.modifierConcept = modifierConcept;
	}
	
	public Long getQuantity() {
		return quantity;
	}
	
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
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

	public String getProcedureSourceValue() {
		return procedureSourceValue;
	}

	public void setProcedureSourceValue(String procedureSourceValue) {
		this.procedureSourceValue = procedureSourceValue;
	}

	public Concept getProcedureSourceConcept() {
		return procedureSourceConcept;
	}

	public void setProcedureSourceConcept(Concept procedureSourceConcept) {
		this.procedureSourceConcept = procedureSourceConcept;
	}

	public String getQualifierSourceValue() {
		return qualifierSourceValue;
	}
	
	public void setQualifierSourceValue(String qualifierSourceValue) {
		this.qualifierSourceValue = qualifierSourceValue;
	}
	
	
	@Override
	public FhirVersionEnum getFhirVersion() {
		// TODO Auto-generated method stub
		return FhirVersionEnum.DSTU2;
	}

	@Override
	public String getResourceType() {
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
	public Procedure getRelatedResource() {
		Procedure procedure = new Procedure();
		
		procedure.setId(this.getIdDt());
		
		// Set patient 
		Reference subjectRef = new Reference(Person.RES_TYPE+"/"+this.getPerson().getId());
		String patientName = "";
		if (this.getPerson().getGivenName1() != null && !this.getPerson().getGivenName1().isEmpty()) {
			patientName = this.getPerson().getGivenName1();
		}
		if (this.getPerson().getGivenName2() != null && !this.getPerson().getGivenName2().isEmpty()) {
			patientName += " "+this.getPerson().getGivenName2();
		}
		if (this.getPerson().getFamilyName() != null && !this.getPerson().getFamilyName().isEmpty()) {
			patientName += " "+this.getPerson().getFamilyName();
		}
		subjectRef.setDisplay(patientName);
		procedure.setSubject(subjectRef);
		
		//TODO: revisit this. For now just set to in-progress
		procedure.setStatus(Procedure.ProcedureStatus.INPROGRESS);
		
		String theSystem = this.procedureConcept.getVocabulary().getSystemUri();
		String theCode = this.procedureConcept.getConceptCode();

		CodeableConcept procedureCodeConcept = new CodeableConcept();
		if (theSystem != "" && !theSystem.isEmpty()) {
			// Create coding here. We have one coding in this condition as OMOP
			// allows one coding concept per condition.
			// In the future, if we want to allow multiple coding concepts here,
			// we need to do it here.
			Coding codeCoding = new Coding(theSystem, theCode, this.procedureConcept.getName());
			procedureCodeConcept.addCoding(codeCoding);
			procedure.setCode(procedureCodeConcept);
		}

		// FHIR does not require the coding. If our System URI is not mappable
		// from OMOP database, then coding would be empty. Set Text here. Even text
		// is not required in FHIR. But, then no reason to have this condition, I think...
		String theText = procedureConcept.getName() + ", " + procedureConcept.getVocabulary().getName() + ", "
				+ procedureConcept.getConceptCode();
//
//		System.out.println("Procedure:"+theText);
//
		procedureCodeConcept.setText(theText);

//		procedure.setCode(procedureCodeConcept);

		//procedure.setType(procedureCodeConcept);
		
		DateTimeType DateDt = new DateTimeType(this.date);
		procedure.setPerformed(DateDt);
		
		//TODO: where is code??? For now, I put it in the Note. This is CPT code.
		// Now code is available. SO, we don't need this. 
		//procedure.setNotes(this.getProcedureConcept().getConceptCode());
		
		return procedure;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IBaseResource resource) {
		// TODO CREATE UPDATE not implemented
		return null;
	}

}
