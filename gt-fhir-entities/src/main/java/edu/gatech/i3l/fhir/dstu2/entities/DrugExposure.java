package edu.gatech.i3l.fhir.dstu2.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.DiscriminatorFormula;
import org.hibernate.envers.Audited;

import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;


@Audited
@Entity
@Table(name="drug_exposure")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorFormula("CASE WHEN drug_type_concept_id = 38000177 THEN 'PrescriptionWritten' "+
		"WHEN drug_type_concept_id in (38000176, 38000175) THEN 'PrescriptionDispensed' "+
		"WHEN drug_type_concept_id in (38000179, 43542356, 43542357, 43542358) THEN 'DrugAdministration' END")

//@DiscriminatorFormula("CASE WHEN drug_type_concept_id = (SELECT concept.concept_id FROM concept WHERE concept.concept_name LIKE 'Prescription written') THEN 'PrescriptionWritten' "+
//							"WHEN drug_type_concept_id = ANY (SELECT concept.concept_id FROM concept WHERE concept.concept_name LIKE '%Prescription dispensed in pharmacy%') THEN 'PrescriptionDispensed' "+
//							"WHEN drug_type_concept_id = ANY (SELECT concept.concept_id FROM concept WHERE (concept.concept_id=38000179 OR concept.concept_id=43542356 OR concept.concept_id=43542357 OR concept.concept_id=43542358) AND concept.vocabulary_id='Drug Type') THEN 'DrugAdministration' END")
public abstract class DrugExposure extends BaseResourceEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="drug_exposure_seq_gen")
	@SequenceGenerator(name="drug_exposure_seq_gen", sequenceName="drug_exposure_id_seq", allocationSize=1)
	@Column(name="drug_exposure_id", updatable= false)
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="drug_concept_id")
	@NotNull
	private Concept medication;
	
	@Column(name = "effective_drug_dose")
	private Double effectiveDrugDose;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name = "dose_unit_concept_id")
	private Concept doseUnitConcept;
	
	@Column(name = "drug_source_value")
	private String drugSourceValue;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name = "drug_source_concept_id")
	private Concept drugSourceConcept;
	
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

	public Concept getMedication() {
		return medication;
	}

	public void setMedication(Concept medication) {
		this.medication = medication;
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
	
	public String getDrugSourceValue() {
		return drugSourceValue;
	}
	
	public void setDrugSourceValue(String drugSourceValue) {
		this.drugSourceValue = drugSourceValue;
	}
	
	public Concept getDrugSourceConcept() {
		return drugSourceConcept;
	}
	
	public void setDrugSourceConcept(Concept drugSourceConcept) {
		this.drugSourceConcept = drugSourceConcept;
	}
	
	public String getDoseUnitSourceValue() {
		return doseUnitSourceValue;
	}
	
	public void setDoseUnitSourceValue(String doseUnitSourceValue) {
		this.doseUnitSourceValue = doseUnitSourceValue;
	}

	// Supporting functions for FHIR/OMOP translations
	protected CodeableConceptDt medicationCodeableConcept() {
		// We need to do the system URI mapping here. 
		CodeableConceptDt codeDt = new CodeableConceptDt();
		if (getMedication().getId() == 0L) {
			// We have zero concept ID. This is not error. 
			// We may have entry that we couldn't map with OMOP concept ID.
			// Look at the source_concept_id column to see if we have something
			// here.
			if (this.getDrugSourceConcept() != null && this.getDrugSourceConcept().getId() != 0) {
				CodingDt medCoding = new CodingDt(this.getDrugSourceConcept().getVocabulary().getSystemUri(), this.getDrugSourceConcept().getConceptCode());
				medCoding.setDisplay(this.getDrugSourceConcept().getName());
				List<CodingDt> codingList = new ArrayList<CodingDt>();
				codingList.add(medCoding);
				codeDt.setCoding(codingList);
			} else if (this.getDrugSourceValue() != null) {
				CodingDt medCoding = new CodingDt();
				medCoding.setDisplay(this.getDrugSourceValue());
			}
			
		} else {
			CodingDt medCoding = new CodingDt(this.getMedication().getVocabulary().getSystemUri(), this.getMedication().getConceptCode());
			medCoding.setDisplay(this.getMedication().getName());
		
			List<CodingDt> codingList = new ArrayList<CodingDt>();
			codingList.add(medCoding);
			codeDt.setCoding(codingList);
		}
		
		return codeDt;
	}
}
