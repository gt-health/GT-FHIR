package edu.gatech.i3l.fhir.dstu2.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

/**
 * 
 * @author Myung Choi
 */
@Entity
@Table(name="vocabulary")
@Audited(targetAuditMode=RelationTargetAuditMode.NOT_AUDITED)
public class Vocabulary {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="vocabulary_id", updatable=false)
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@Column(name="vocabulary_name", updatable=false)
	private String name;
	
	public Vocabulary() {
		super();
	}

	public Vocabulary(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

	// FIXME This is FHIR related. We may need to do this in the database. But, for quick
	// initial implementation, we do this. Later, we may extend vocabulary table.
	public String getSystemUri() {
		String uri = "";
		
		if (id == 1) uri = "http://snomed.info/sct";
		else if (id == 2 || id == 3) uri = "http://hl7.org/fhir/sid/icd-9-cm";
		else if (id == 6) uri = "http://loinc.org";
		else if (id == 8) uri = "http://www.nlm.nih.gov/research/umls/rxnorm";
		else if (id == 11) uri = "http://unitsofmeasure.org";
		else if (id == 70) uri = "http://hl7.org/fhir/sid/icd-10";
		
		return uri;
	}
	
	public void setIdNameBySystemUri(String uri) {
		if (uri.equalsIgnoreCase("http://snomed.info/sct")) {
			this.id = 1l;
			this.name = "SNOMED-CT";
		} else if (uri.equalsIgnoreCase("http://hl7.org/fhir/sid/icd-9-cm")) {
			this.id = 2l; // FIXME: there are ICD9 CM and IC9 Procedure.
			this.name = "ICD-9-CM";
		} else if (uri.equalsIgnoreCase("http://loinc.org")) {
			this.id = 6l;
			this.name = "LOINC";
		} else if (uri.equalsIgnoreCase("http://www.nlm.nih.gov/research/umls/rxnorm")) {
			this.id = 8l;
			this.name = "RxNorm";			
		} else if (uri.equalsIgnoreCase("http://unitsofmeasure.org")) {
			this.id = 11l;
			this.name = "UCUM";
		} else if (uri.equalsIgnoreCase("http://hl7.org/fhir/sid/icd-10")) {
			this.id = 70l;
			this.name = "ICD-10-CM";
		} else {
			this.id = 0l;
			this.name = "OMOP Vocabulary v4.5 20-Oct-2014";
		}
	}
	
}
