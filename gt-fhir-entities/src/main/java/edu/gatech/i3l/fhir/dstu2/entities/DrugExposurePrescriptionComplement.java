package edu.gatech.i3l.fhir.dstu2.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import ca.uhn.fhir.context.FhirVersionEnum;

/**
 * @fhirVersion {@link FhirVersionEnum#DSTU2}
 * @author Ismael Sarmento
 */
@Entity
@Table(name = "f_drug_exposure")
@Audited
public final class DrugExposurePrescriptionComplement {
	
	@Id
	@Column(name = "drug_exposure_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="drug_exposure_id")
	private DrugExposurePrescription prescription;

	/**
	 * @fhir MedicationPrescription.dosageInstruction.dose.doseQuantity
	 */
	@Column(name = "dose")
	private String dose;
	// @Column(name="effective_drug_dose")
	// private BigDecimal dose;

	/**
	 * The corresponding unit for the dose quantity.
	 */
	@Column(name = "unit")
	private String unit;
	// @Column(name="dose_unit_concept_id")
	// private Concept unit;

	public String getDose() {
		return dose;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public DrugExposurePrescription getPrescription() {
		return prescription;
	}

	public void setPrescription(DrugExposurePrescription prescription) {
		this.prescription = prescription;
	}

}
