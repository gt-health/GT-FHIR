/**
 * 
 */
package edu.gatech.i3l.fhir.dstu2.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import ca.uhn.fhir.model.dstu2.valueset.ConditionClinicalStatusEnum;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

/**
 * @author Myung Choi
 *
 */
@Entity
@Table(name="f_condition_occurrence")
@PrimaryKeyJoinColumn(name="condition_occurrence_id")
public class ConditionOccurrenceComplement extends ConditionOccurrence {

	@Column(name="fhir_condition_status_code")
	private String statusCode;
	
	@Column(name="fhir_condition_display")
	private String display;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="condition_severity_concept_id")
	private Concept severityConcept;

	public ConditionOccurrenceComplement() {
		super();
	}

	public ConditionOccurrenceComplement(Long id, Person person,
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

		// Add note - this is a courtesy entry in case that we don't get things written in the 
		// structured data for any reason.
		condition.setNotes(getDisplay());

		return condition;
	}
	
	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		super.constructEntityFromResource(resource);
		if(resource instanceof Condition){
			Condition condition = (Condition)resource;
			
			// Set Clinical Status. This, we just use string in our database as FHIR concept is
			// not available in the OMOP concept table.
			String clinicalStatus = condition.getClinicalStatus();
			setStatusCode(clinicalStatus);
		
			// Set Severity 
			CodeableConceptDt severityCodeable = condition.getSeverity();
			if (severityCodeable != null) {
				List<CodingDt> severityCodes = severityCodeable.getCoding();
				if (severityCodes != null && severityCodes.size() > 0) {
					//FHIR spec says we have 0 or 1 severity coding
					CodingDt severityCode = severityCodes.get(0);
					
					String codeString = severityCode.getCode();
					String uri = severityCode.getSystem();
					if (codeString != null && uri != null && !codeString.isEmpty() && !uri.isEmpty()) {
						Long severityConceptId = OmopConceptMapping.getInstance().get(severityCode.getCode(), OmopConceptMapping.QUALIFIER_VALUE);
						if(severityConceptId != null){
							if(severityConcept == null)
								severityConcept = new Concept();
							severityConcept.setId(severityConceptId);
						}
					} 
					
					String display = severityCode.getDisplay();
					setDisplay(display);
				}
			}
		}
		
		return this;
	}
}