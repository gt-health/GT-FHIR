package edu.gatech.i3l.fhir.dstu2.concepts;

public enum HL7AdministrativeGender {

	MALE("M", "Male"),
	FEMALE("F", "Female"),
	AMBIGUOUS("A", "Ambiguous"),
	OTHER("O", "Other"),
	UNKNOWN("U", "Unknown");

	String code;
	String source;

	HL7AdministrativeGender(String code, String source) {
		this.code = code;
		this.source = source;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}
	
}
