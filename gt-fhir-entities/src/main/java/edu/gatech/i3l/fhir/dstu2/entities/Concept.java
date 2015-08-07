package edu.gatech.i3l.fhir.dstu2.entities;

import java.util.Date;

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

@Entity
@Table(name="concept")
@Audited
public class Concept{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="concept_id", updatable=false)
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

	public Concept() {
		super();
	}
	
	public Concept(Long id, String name){
		this.id = id;
		this.name = name;
	}

	public Concept(Long id, String name, Integer level, String conceptClass,
			Vocabulary vocabulary, String conceptCode, Date validStartDate,
			Date validEndDate, String invalidReason) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.conceptClass = conceptClass;
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

}
