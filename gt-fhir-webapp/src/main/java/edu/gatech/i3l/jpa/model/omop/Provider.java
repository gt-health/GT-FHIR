package edu.gatech.i3l.jpa.model.omop;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;

@Entity
@Table(name="provider")
@Inheritance(strategy=InheritanceType.JOINED)
public class Provider extends BaseResourceEntity {

	public static final String RESOURCE_TYPE = "Practitioner|Organization";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="provider_id")
	private Long id;
	
	@Column(name="npi")
	private String npi;
	
	@Column(name="dea")
	private String dea;
	
	@ManyToOne
	@JoinColumn(name="specialty_concept_id")
	private Concept specialtyConcept;
	
	@ManyToOne
	@JoinColumn(name="care_site_id")
	private CareSite careSite;
	
	@Column(name="provider_source_value", nullable=false)
	private String providerSourceValue;
	
	@Column(name="specialty_source_value")
	private String specialtySourceValue;
	
	public Provider() {
		super();
	}
	
	public Provider(Long id, String npi, String dea, Concept specialtyConcept, CareSite careSite,
			String providerSourceValue, String specialtySourceValue) {
		this.id = id;
		this.npi = npi;
		this.dea = dea;
		this.specialtyConcept = specialtyConcept;
		this.careSite = careSite;
		this.providerSourceValue = providerSourceValue;
		this.specialtySourceValue = specialtySourceValue;
	}
	
	public String getNpi() {
		return npi;
	}
	
	public void setNpi(String npi) {
		this.npi = npi;
	}
	
	public String getDea() {
		return dea;
	}
	
	public void setDea(String dea) {
		this.dea = dea;
	}
	
	public Concept getSpecialtyConcept() {
		return specialtyConcept;
	}
	
	public void setSpecialtyConcept(Concept specialtyConcept) {
		this.specialtyConcept = specialtyConcept;
	}
	
	public CareSite getCareSite() {
		return careSite;
	}
	
	public void setCareSite(CareSite careSite) {
		this.careSite = careSite;
	}
	
	public String getProviderSourceValue() {
		return providerSourceValue;
	}
	
	public void setProviderSourceValue(String providerSourceValue) {
		this.providerSourceValue = providerSourceValue;
	}
	
	public String getSpecialtySourceValue() {
		return specialtySourceValue;
	}
	
	public void setSpecialtySourceValue(String specialtySourceValue) {
		this.specialtySourceValue = specialtySourceValue;
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public Practitioner getRelatedResource() {
		Practitioner practitioner = new Practitioner();
		
		// TODO set parameters
		
		return practitioner;
	}

	@Override
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public IdDt getIdDt() {
		return new IdDt(getResourceType(), id);
	}

	@Override
	public String getResourceType() {
		return RESOURCE_TYPE;
	}

	@Override
	public FhirVersionEnum getFhirVersion() {
		return FhirVersionEnum.DSTU2;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String translateSearchParam(String chain) {
		String translatedChain = "";
		if(chain.isEmpty())
			return translatedChain;
		String head = "";
		if(chain.contains(".")){
			head = chain.substring(0, chain.indexOf("."));
			chain = chain.substring(chain.indexOf(".") + 1, chain.length());
		} else {
			head = chain;
		}
		switch (head) {
		case Patient.SP_ORGANIZATION:
			translatedChain = translatedChain.concat("careSite");
			break;
		default:
			break;
		}
		return translatedChain;
	}

}
