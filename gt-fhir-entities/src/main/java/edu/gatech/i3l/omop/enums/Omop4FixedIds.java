package edu.gatech.i3l.omop.enums;

public enum Omop4FixedIds {

	OBSERVATION_FROM_EHR("Observation recorded from EHR", 38000280l),
	OBSERVATION_FROM_LAB_NUMERIC_RESULT("Lab observation numeric result", 38000277l),
	EHR_PROBLEM_ENTRY("EHR problem list entry", 38000245l),
	PRIMARY_CONDITION("Primary Condition", 44786627l);
	
	String conceptName;
	Long conceptId;
	
	Omop4FixedIds(String conceptName, Long conceptId) {
		this.conceptName = conceptName;
		this.conceptId = conceptId;
	}

	public String getConceptName() {
		return conceptName;
	}

	public void setConceptName(String conceptName) {
		this.conceptName = conceptName;
	}

	public Long getConceptId() {
		return conceptId;
	}

	public void setConceptId(Long conceptId) {
		this.conceptId = conceptId;
	}
	
}
