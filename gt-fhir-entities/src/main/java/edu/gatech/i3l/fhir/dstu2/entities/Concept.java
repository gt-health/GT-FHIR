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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

@Entity
@Table(name="concept")
@Audited
@NamedQueries(value = { @NamedQuery( name = "findConceptByCode", query = "select id from Concept c where c.conceptCode like :code")})
public class Concept{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="concept_id", updatable=false)
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@Column(name="concept_name", updatable=false)
	private String name;
	
	@ManyToOne
	@JoinColumn(name="domain_id", referencedColumnName="domain_id")
	private Domain domain;
	
	@Column(name="concept_class_id", updatable=false)
	private String conceptClassId;
	
	@Column(name="standard_concept", updatable=false)
	private Character standardConcept;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="vocabulary_id", referencedColumnName="vocabulary_id", insertable=false, updatable=false)
	private Vocabulary vocabulary;
	
	@Column(name="concept_code", updatable=false)
	private String conceptCode;
	
	@Column(name="valid_start_date", updatable=false)
	private Date validStartDate;
	
	@Column(name="valid_end_date", updatable=false)
	private Date validEndDate;
	
	@Column(name="invalid_reason", updatable=false)
	private String invalidReason;

	public Concept() {
		super();
	}
	
	public Concept(Long id) {
		super();
		this.id = id;
	}
	
	public Concept(Long id, String name){
		super();
		this.id = id;
		this.name = name;
	}

	public Concept(Long id, String name, Domain domain, String conceptClassId, Character standardConcept,
			Vocabulary vocabulary, String conceptCode, Date validStartDate,
			Date validEndDate, String invalidReason) {
		super();
		this.id = id;
		this.name = name;
		this.domain = domain;
		this.conceptClassId = conceptClassId;
		this.standardConcept = standardConcept;
		this.vocabulary = vocabulary;
		this.conceptCode = conceptCode;
		this.validStartDate = validStartDate;
		this.validEndDate = validEndDate;
		this.invalidReason = invalidReason;
	}

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

	public Domain getDomainId() {
		return domain;
	}

	public void setDomainId(Domain domain) {
		this.domain = domain;
	}

	public String getConceptClassId() {
		return conceptClassId;
	}

	public void setConceptClassId(String conceptClassId) {
		this.conceptClassId = conceptClassId;
	}

	public Character getStandardConcept() {
		return standardConcept;
	}
	
	public void setStandardConcept(Character standardConcept) {
		this.standardConcept = standardConcept;
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
				+ this.getDomainId() + ", "
				+ this.getConceptClassId() + ", "
				+ this.getStandardConcept() + ", "
				+ this.getVocabulary().getId() + ", "
				+ this.getConceptCode() + ", "
				+ this.getValidStartDate() + ", "
				+ this.getValidEndDate();
	}

}
