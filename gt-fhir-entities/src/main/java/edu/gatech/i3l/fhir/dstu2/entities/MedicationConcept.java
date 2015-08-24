package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.Medication.SP_CODE;
import static ca.uhn.fhir.model.dstu2.resource.Medication.SP_NAME;

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

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

@Entity
@Table(name="concept")
@Audited(targetAuditMode=RelationTargetAuditMode.NOT_AUDITED)
public final class MedicationConcept extends BaseResourceEntity{
	
	private static final String RES_TYPE = "Medication";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="concept_id", updatable=false)
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@Column(name="concept_name", updatable=false)
	private String name;
	
	@Column(name="concept_level", updatable=false)
	private Integer level;
	
	@Column(name="concept_class", updatable=false)
	private String conceptClass;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="vocabulary_id", insertable=false, updatable=false)
	private Vocabulary vocabulary;
	
	@Column(name="concept_code", updatable=false)
	private String conceptCode;
	
	@Column(name="valid_start_date", updatable=false)
	private Date validStartDate;
	
	@Column(name="valid_end_date", updatable=false)
	private Date validEndDate;
	
	@Column(name="invalid_reason", updatable=false)
	private String invalidReason;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getConceptClass() {
		return conceptClass;
	}

	public void setConceptClass(String conceptClass) {
		this.conceptClass = conceptClass;
	}

	public Vocabulary getVocabulary() {
		return vocabulary;
	}

	public void setVocabulary(Vocabulary vocabulary) {
		this.vocabulary = vocabulary;
	}

	public String getConceptCode() {
		return conceptCode;
	}

	public void setConceptCode(String conceptCode) {
		this.conceptCode = conceptCode;
	}

	public Date getValidStartDate() {
		return validStartDate;
	}

	public void setValidStartDate(Date validStartDate) {
		this.validStartDate = validStartDate;
	}

	public Date getValidEndDate() {
		return validEndDate;
	}

	public void setValidEndDate(Date validEndDate) {
		this.validEndDate = validEndDate;
	}

	public String getInvalidReason() {
		return invalidReason;
	}

	public void setInvalidReason(String invalidReason) {
		this.invalidReason = invalidReason;
	}

	@Override
	public String toString() {
		//Since this is an omop v.4 based model, all the information below is expected to be not null.
		return this.getId() + ", "
						+ this.getName() + ", "
						+ this.getLevel() + ", "
						+ this.getConceptClass() + ", "
						+ this.getVocabulary().getId() + ", "
						+ this.getConceptCode() + ", "
						+ this.getValidStartDate() + ", "
						+ this.getValidEndDate();
	}
	@Override
	public FhirVersionEnum getFhirVersion() {
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
		case SP_NAME:
			return "name";
		case SP_CODE:
			return "conceptCode";
		default:
			break;
		}
		return theSearchParam;
	}

	@Override
	public IResource getRelatedResource() {
		Medication resource = new Medication();
		resource.setId(this.getIdDt());
		resource.setName(this.getName());
		CodeableConceptDt code = new CodeableConceptDt(this.getVocabulary().getSystemUri(), this.getConceptCode());
		code.getCodingFirstRep().setDisplay(super.toString());
		resource.setCode(code); 
		NarrativeDt narrative = new NarrativeDt();
		narrative.setDiv(this.toString());
		resource.setText(narrative);
		return resource;
	}

	/**
	 * This entity relates to a omop concept registry and is not supposed to be created/updated.
	 */
	//TODO somehow we should be able to send message back in an OperationOutcome
	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		return null;
	}

}
