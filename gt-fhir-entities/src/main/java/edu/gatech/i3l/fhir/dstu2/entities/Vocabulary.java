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
	private String id;
	
	@Column(name="vocabulary_name", updatable=false)
	private String name;
	
	@Column(name="vocabulary_reference")
	private String vocabularyReference;
	
	
	public Vocabulary() {
		super();
	}

	public Vocabulary(String id) {
		super();
		this.id = id;
	}
	
	public Vocabulary(String id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVocabularyReference() {
		return vocabularyReference;
	}
	
	public void setVocabularyReference(String vocabularyReference) {
		this.vocabularyReference = vocabularyReference;
	}

	// FIXME This is FHIR related. We may need to do this in the database. But, for quick
	// initial implementation, we do this. Later, we may extend vocabulary table.
	public String getSystemUri() {
		String uri = this.getVocabularyReference();
		
		if (id.equalsIgnoreCase("SNOMED")) uri = "http://snomed.info/sct";
		else if (id.equalsIgnoreCase("ICD9CM")) uri = "http://hl7.org/fhir/sid/icd-9-cm";
		else if (id.equalsIgnoreCase("ICD9Proc")) uri = "http://hl7.org/fhir/sid/icd-9-cm/procedure";
		else if (id.equalsIgnoreCase("CPT4")) uri = "http://www.ama-assn.org/go/cpt";
		else if (id.equalsIgnoreCase("HCPCS")) uri = "http://purl.bioontology.org/ontology/HCPCS";
		else if (id.equalsIgnoreCase("LOINC")) uri = "http://loinc.org";
		else if (id.equalsIgnoreCase("RxNorm")) uri = "http://www.nlm.nih.gov/research/umls/rxnorm";
		else if (id.equalsIgnoreCase("UCUM")) uri = "http://unitsofmeasure.org";
		else if (id.equalsIgnoreCase("NDC")) uri = "http://hl7.org/fhir/sid/ndc";
		
		return uri;
	}
	
	public void setIdNameBySystemUri(String uri) {
		if (uri.equalsIgnoreCase("http://snomed.info/sct")) {
			this.id = "SNOMED";
		} else if (uri.equalsIgnoreCase("http://hl7.org/fhir/sid/icd-9-cm")) {
			this.id = "ICD9CM";
		} else if (uri.equalsIgnoreCase("http://hl7.org/fhir/sid/icd-9-cm/procedure")) {
			this.id = "ICD9Proc";
		} else if (uri.equalsIgnoreCase("http://www.ama-assn.org/go/cpt")) {
			this.id = "CPT4";
		} else if (uri.equalsIgnoreCase("http://purl.bioontology.org/ontology/HCPCS")) {
			this.id = "HCPCS";
		} else if (uri.equalsIgnoreCase("http://loinc.org")) {
			this.id = "LOINC";
		} else if (uri.equalsIgnoreCase("http://www.nlm.nih.gov/research/umls/rxnorm")) {
			this.id = "RxNorm";			
		} else if (uri.equalsIgnoreCase("http://unitsofmeasure.org")) {
			this.id = "UCUM";
		} else if (uri.equalsIgnoreCase("http://hl7.org/fhir/sid/ndc")) {
			this.id = "NDC";
		} else {
			this.id = "Vocabulary";
		}
	}
	
}
