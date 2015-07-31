package edu.gatech.i3l.fhir.dstu2.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.model.primitive.InstantDt;

@Entity
//@Table(name="concept")
@Audited(targetAuditMode=RelationTargetAuditMode.NOT_AUDITED)
@DiscriminatorValue("8") //In Omop database, the dictionary is static; that means we can reference id's directly: the id for the vocabulary RxNorm is 8 
public class MedicationConcept extends Concept{
	
	private static final String RES_TYPE = "Medication";
	
//	@Id
//	@GeneratedValue(strategy=GenerationType.IDENTITY)
//	@Column(name="concept_id")
//	private Long id;
//	
//	@ManyToOne
//	@JoinColumn(name="drug_concept_id")
//	private String name;
//
//	@Column(name="concept_class", insertable=false, updatable=false, nullable=false)
//	private DrugConceptClass conceptClass;
//	
//	@Override
//	public Long getId() {
//		return this.id;
//	}
//	
//	public void setId(Long id){
//		this.id = id;
//	}

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
			return "name";
		default:
			break;
		}
		return theSearchParam;
	}

	@Override
	public IResource getRelatedResource() {
		Medication resource = new Medication();
		resource.setId(this.getIdDt());
		resource.setName(this.getName());
		CodeableConceptDt code = new CodeableConceptDt(this.getVocabulary().getSystemUri(), this.getConceptCode());
		code.getCodingFirstRep().setDisplay(super.toString());
		resource.setCode(code); 
		NarrativeDt narrative = new NarrativeDt();
		narrative.setDiv(this.toString());
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
