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
							"WHEN drug_type_concept_id = ANY (SELECT concept.concept_id FROM concept WHERE concept.concept_name LIKE 'Prescription dispensed in pharmacy' OR concept.concept_name LIKE 'Prescription dispensed through mail order') THEN 'PrescriptionDispensed' END")
public abstract class DrugExposurePrescription extends BaseResourceEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="drug_exposure_id", updatable= false)
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@OneToOne(mappedBy="prescription", 
			cascade=CascadeType.ALL, fetch=FetchType.LAZY)
	private DrugExposurePrescriptionComplement complement;

	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DrugExposurePrescriptionComplement getComplement() {
		return complement;
	}

	public void setComplement(DrugExposurePrescriptionComplement complement) {
		this.complement = complement;
	}
}
