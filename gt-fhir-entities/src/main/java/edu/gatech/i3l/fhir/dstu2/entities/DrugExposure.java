package edu.gatech.i3l.fhir.dstu2.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.DiscriminatorFormula;
import org.hibernate.envers.Audited;

import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;


@Audited
@Entity
@Table(name="drug_exposure")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorFormula("CASE WHEN drug_type_concept_id = (SELECT concept.concept_id FROM concept WHERE concept.concept_name LIKE 'Prescription written') THEN 'PrescriptionWritten' "+
							"WHEN drug_type_concept_id = ANY (SELECT concept.concept_id FROM concept WHERE concept.concept_name LIKE '%Prescription dispensed in pharmacy%') THEN 'PrescriptionDispensed' "+
							"WHEN drug_type_concept_id = ANY (SELECT concept.concept_id FROM concept WHERE (concept.concept_id=38000179 OR concept.concept_id=43542356 OR concept.concept_id=43542357 OR concept.concept_id=43542358) AND concept.vocabulary_id='Drug Type') THEN 'DrugAdministration' END")
public abstract class DrugExposure extends BaseResourceEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="drug_exposure_id", updatable= false)
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@Column(name = "effective_drug_dose")
	private Double effectiveDrugDose;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name = "dose_unit_concept_id")
	private Concept doseUnitConcept;
	
	@Column(name = "dose_unit_source_value")
	private String doseUnitSourceValue;
	
//	@OneToOne(mappedBy="prescription", 
//			cascade={CascadeType.ALL}, fetch=FetchType.LAZY)
//	private DrugExposureComplement complement;

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getEffectiveDrugDose() {
		return effectiveDrugDose;
	}
	
	public void setEffectiveDrugDose(Double effectiveDrugDose) {
		this.effectiveDrugDose = effectiveDrugDose;
	}
	
	public Concept getDoseUnitConcept() {
		return doseUnitConcept;
	}
	
	public void setDoseUnitConcept(Concept doseUnitConcept) {
		this.doseUnitConcept = doseUnitConcept;
	}
	
	public String getDoseUnitSourceValue() {
		return doseUnitSourceValue;
	}
	
	public void setDoseUnitSourceValue(String doseUnitSourceValue) {
		this.doseUnitSourceValue = doseUnitSourceValue;
	}

//	public DrugExposureComplement getComplement() {
//		return complement;
//	}
//
//	public void setComplement(DrugExposureComplement complement) {
//		this.complement = complement;
//	}
}
