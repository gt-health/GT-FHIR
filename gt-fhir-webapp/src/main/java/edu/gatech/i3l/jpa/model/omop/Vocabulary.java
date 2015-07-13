package edu.gatech.i3l.jpa.model.omop;

public class Vocabulary {
	private Long id;
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
		else if (id == 2 || id == 3) uri = "http://hl7.org/fhir/sid/icd-9";
		else if (id == 6) uri = "http://loinc.org";
		else if (id == 8) uri = "http://www.nlm.nih.gov/research/umls/rxnorm";
		else if (id == 11) uri = "http://unitsofmeasure.org";
		else if (id == 70) uri = "http://hl7.org/fhir/sid/icd-10";
		
		return uri;
	}
	
	public void setIdNameBySystemUri(String uri) {
		if (uri.equalsIgnoreCase("http://snomed.info/sct")) {
			this.id = (long)1;
			this.name = "SNOMED-CT";
		} else if (uri.equalsIgnoreCase("http://hl7.org/fhir/sid/icd-9")) {
			this.id = (long)2; // FIXME: there are ICD9 CM and IC9 Procedure.
			this.name = "ICD-9-CM";
		} else if (uri.equalsIgnoreCase("http://loinc.org")) {
			this.id = (long)6;
			this.name = "LOINC";
		} else if (uri.equalsIgnoreCase("http://www.nlm.nih.gov/research/umls/rxnorm")) {
			this.id = (long)8;
			this.name = "RxNorm";			
		} else if (uri.equalsIgnoreCase("http://unitsofmeasure.org")) {
			this.id = (long)11;
			this.name = "UCUM";
		} else if (uri.equalsIgnoreCase("http://hl7.org/fhir/sid/icd-10")) {
			this.id = (long)70;
			this.name = "ICD-10-CM";
		} else {
			this.id = (long)0;
			this.name = "OMOP Vocabulary v4.5 20-Oct-2014";
		}
	}
}
