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
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

@Entity
@Table(name="provider")
@Inheritance(strategy=InheritanceType.JOINED)
@Audited
public class Provider extends BaseResourceEntity {

	public static final String RESOURCE_TYPE = "Practitioner";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="provider_id")
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@Column(name="provider_name")
	private String providerName;

	@Column(name="npi")
	private String npi;
	
	@Column(name="dea")
	private String dea;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="specialty_concept_id")
	private Concept specialtyConcept;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.MERGE})
	@JoinColumn(name="care_site_id")
	private CareSite careSite;
	
	@Column(name="year_of_birth")
	private Integer yearOfBirth;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.MERGE})
	@JoinColumn(name="gender_concept_id")
	private Concept genderConcept;

	@Column(name="provider_source_value", nullable=false)
	private String providerSourceValue;
	
	@Column(name="specialty_source_value")
	private String specialtySourceValue;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.MERGE})
	@JoinColumn(name="specialty_source_concept_id")
	private Concept specialtySourceConcept;

	@Column(name="gender_source_value")
	private String genderSourceValue;
	
	@ManyToOne(fetch=FetchType.LAZY,cascade={CascadeType.MERGE})
	@JoinColumn(name="gender_source_concept_id")
	private Concept genderSourceConcept;

	public Provider() {
		super();
	}
	
	public Provider(Long id, String providerName, String npi, String dea, Concept specialtyConcept, 
			CareSite careSite, Integer yearOfBirth, Concept genderConcept, String providerSourceValue, 
			String specialtySourceValue, Concept specialtySourceConcept, String genderSourceValue,
			Concept genderSourceConcept) {
		this.id = id;
		this.providerName = providerName;
		this.npi = npi;
		this.dea = dea;
		this.specialtyConcept = specialtyConcept;
		this.careSite = careSite;
		this.yearOfBirth = yearOfBirth;
		this.genderConcept = genderConcept;
		this.providerSourceValue = providerSourceValue;
		this.specialtySourceValue = specialtySourceValue;
		this.specialtySourceConcept = specialtySourceConcept;
		this.genderSourceValue = genderSourceValue;
		this.genderSourceConcept = genderSourceConcept;
	}
	@Override
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getProviderName() {
		return providerName;
	}
	
	public void setProviderName(String providerName) {
		this.providerName = providerName;
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
	
	public Integer getYearOfBirth() {
		return yearOfBirth;
	}
	
	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
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
	
	@Override
	public Practitioner getRelatedResource() {
		Practitioner practitioner = new Practitioner();
		
		// TODO set parameters
		
		return practitioner;
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
