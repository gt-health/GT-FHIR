package edu.gatech.i3l.fhir.dstu2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.model.primitive.InstantDt;

@Entity
@Table(name="drug_exposure")
@Audited
public class DrugExposureMedication extends BaseResourceEntity{
	
	private static final String RES_TYPE = "Medication";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="drug_exposure_id")
	private Long id;
	
	@ManyToOne// Notice that this as any other entity mapping, relates to omop structure (drug exposure in this case) and not with fhir resource.
	@JoinColumn(name="drug_concept_id")
	private Concept drugConcept;

	@Override
	public Long getId() {
		return this.id;
	}
	
	public void setId(Long id){
		this.id = id;
	}

	@Override
	public FhirVersionEnum getFhirVersion() {
		return FhirVersionEnum.DSTU2;
	}

	@Override
	public String getResourceType() {
		return RES_TYPE;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String translateSearchParam(String theSearchParam) {
		switch (theSearchParam) {
		case Medication.SP_NAME:
			return "drugConcept.name";
		default:
			break;
		}
		return theSearchParam;
	}

	@Override
	public IResource getRelatedResource() {
		Medication resource = new Medication();
		resource.setId(this.getIdDt());
		resource.setName(this.drugConcept.getName());
		CodeableConceptDt code = new CodeableConceptDt(this.drugConcept.getVocabulary().getSystemUri(), this.drugConcept.getConceptCode());
		code.getCodingFirstRep().setDisplay(this.drugConcept.toString());
		resource.setCode(code); 
		NarrativeDt narrative = new NarrativeDt();
		narrative.setDiv(this.drugConcept.toString());
		resource.setText(narrative);
		return resource;
	}

	/**
	 * This entity relates to a omop concept registry and is not supposed to be created/updated.
	 */
	//TODO somehow we should be able to send message back in an OperationOutcome
	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		return null;
	}

}
