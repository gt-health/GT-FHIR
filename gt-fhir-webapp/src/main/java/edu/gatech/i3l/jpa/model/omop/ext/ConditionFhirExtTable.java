/**
 * 
 */
package edu.gatech.i3l.jpa.model.omop.ext;

import java.sql.Date;

import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import ca.uhn.fhir.model.dstu2.valueset.ConditionClinicalStatusEnum;
import edu.gatech.i3l.jpa.model.omop.Concept;
import edu.gatech.i3l.jpa.model.omop.ConditionOccurrence;
import edu.gatech.i3l.jpa.model.omop.Person;
import edu.gatech.i3l.jpa.model.omop.Provider;
import edu.gatech.i3l.jpa.model.omop.VisitOccurrence;

/**
 * @author MC142
 *
 */
public class ConditionFhirExtTable extends ConditionOccurrence {

	private String statusCode;
	private String display;
	private Concept severityConcept;

	public ConditionFhirExtTable() {
		super();
	}

	public ConditionFhirExtTable(Long id, Person person,
			Concept conditionConcept, Date startDate, Date endDate,
			Concept conditionTypeConcept, String stopReason, Provider provider,
			VisitOccurrence encounter, String sourceValue, String statusCode,
			String display, Concept severityConcept) {
		super(id, person, conditionConcept, startDate, endDate,
				conditionTypeConcept, stopReason, provider, encounter,
				sourceValue);

		this.statusCode = statusCode;
		this.display = display;
		this.severityConcept = severityConcept;
	}

	public String getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getDisplay() {
		return display;
	}

	public void setDisplay(String display) {
		this.display = display;
	}

	public Concept getSeverityConcept() {
		return severityConcept;
	}

	public void setSeverityConcept(Concept severityConcept) {
		this.severityConcept = severityConcept;
	}

	@Override
	public Condition getRelatedResource() {
		Condition condition = super.getRelatedResource();

		// Set clinicalStatus
		ConditionClinicalStatusEnum clinicalStatus = ConditionClinicalStatusEnum.UNKNOWN;
		if (statusCode != null) {
			if (statusCode.equalsIgnoreCase("confirmed"))
				clinicalStatus = ConditionClinicalStatusEnum.CONFIRMED;
			else if (statusCode.equalsIgnoreCase("entered_in_error"))
				clinicalStatus = ConditionClinicalStatusEnum.ENTERED_IN_ERROR;
			else if (statusCode.equalsIgnoreCase("provisional"))
				clinicalStatus = ConditionClinicalStatusEnum.PROVISIONAL;
			else if (statusCode.equalsIgnoreCase("refuted"))
				clinicalStatus = ConditionClinicalStatusEnum.REFUTED;
			else if (statusCode.equalsIgnoreCase("working"))
				clinicalStatus = ConditionClinicalStatusEnum.WORKING;
		}
		condition.setClinicalStatus(clinicalStatus);

		// Set severity if available
		if (severityConcept != null) {
			String theSystem = severityConcept.getVocabulary().getSystemUri();
			String theCode = severityConcept.getConceptCode();

			CodeableConceptDt severityCodeConcept = new CodeableConceptDt();
			if (theSystem != "" && theCode != "") {
				CodingDt codingDt = new CodingDt(theSystem, theCode);
				codingDt.setDisplay(severityConcept.getName());
				severityCodeConcept.addCoding(codingDt);
			}
			
			// Add text to the severity codeable concept.
			String theText = severityConcept.getName() + ", "
					+ severityConcept.getVocabulary().getName() + ", "
					+ severityConcept.getConceptCode();
			severityCodeConcept.setText(theText);
			condition.setSeverity(severityCodeConcept);
		}

		// Add note
		condition.setNotes(getDisplay());

		return condition;
	}
}