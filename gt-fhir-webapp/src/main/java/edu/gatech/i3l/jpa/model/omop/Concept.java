package edu.gatech.i3l.jpa.model.omop;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="concept")
public class Concept {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private Integer level;
	private String klass;
	private Vocabulary vocabulary;
	private String conceptCode;
	private Date validStartDate;
	private Date validEndDate;
	private String invalidReason;

	public Concept() {
		super();
	}
	
	public Concept(Long id, String name){
		this.id = id;
		this.name = name;
	}

	public Concept(Long id, String name, Integer level, String klass,
			Vocabulary vocabulary, String conceptCode, Date validStartDate,
			Date validEndDate, String invalidReason) {
		super();
		this.id = id;
		this.name = name;
		this.level = level;
		this.klass = klass;
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

	public String getKlass() {
		return klass;
	}

	public void setKlass(String klass) {
		this.klass = klass;
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

}
