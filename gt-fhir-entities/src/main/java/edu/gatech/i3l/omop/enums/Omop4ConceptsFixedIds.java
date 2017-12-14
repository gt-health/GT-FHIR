package edu.gatech.i3l.omop.enums;

/**
 * This class presents an enumeration of some Concept entries, in an Omop v4 database, useful/used on construction of
 * entities from their related resources.
 * @author Ismael Sarmento
 *
 */
public enum Omop4ConceptsFixedIds {

	OBSERVATION_FROM_EHR("Observation recorded from EHR", 43542353L),
	OBSERVATION_FROM_LAB_NUMERIC_RESULT("Lab observation numeric result", 38000277L),
	EHR_PROBLEM_ENTRY("EHR problem list entry", 38000245L),
	PRIMARY_CONDITION("Primary Condition", 44786627L),
	REFERRAL_RECORD("Referral record", 42898140L),
	PATIENT_SELF_REPORT("Patient Self-Reported Condition", 45905770L),
	PRESCRIPTION_DISP_PHARMACY("Prescription dispensed in pharmacy", 38000175L),
	PRESCRIPTION_DISP_MAIL_ORDER("Prescription dispensed through mail order", 38000176L),
	PRESCRIPTION_WRITTEN("Prescription written", 38000177L),
	MEDICATION_ADMINISTRATION("Physician administered drug (identified from EHR observation)", 43542358L);
	
	String conceptName;
	Long conceptId;
	
	Omop4ConceptsFixedIds(String conceptName, Long conceptId) {
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
