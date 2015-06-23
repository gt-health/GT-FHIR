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

	// This is FHIR related. We may need to do this in the database. But, for quick
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
}
