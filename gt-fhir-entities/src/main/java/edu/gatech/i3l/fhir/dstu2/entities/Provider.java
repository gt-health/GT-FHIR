package edu.gatech.i3l.fhir.dstu2.entities;

import java.util.ArrayList;
import java.util.List;

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
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.dstu2.resource.Practitioner.PractitionerRole;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.StringDt;
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
		practitioner.setId(this.getIdDt());
		HumanNameDt humanName = new HumanNameDt();
		String[] names = this.getProviderName().trim().split(",");
		List<StringDt> familyNames = new ArrayList<StringDt>();
		List<StringDt> givenNames = new ArrayList<StringDt>();
		List<StringDt> suffixes = new ArrayList<StringDt>();
		if (names.length > 1) {
			if (names.length > 2) {
				familyNames.add(new StringDt(names[0].trim()));
				suffixes.add(new StringDt(names[names.length-1].trim()));
				
				for (int i=1; i < names.length-1; i++) {
					String[] subnames = names[i].trim().split(" ");
					for (int j=0; j < subnames.length; j++) {
						givenNames.add(new StringDt(subnames[j].trim()));
					}
				}
			} else {
				suffixes.add(new StringDt(names[1].trim()));
				String[] subnames = names[0].trim().split(" ");
				familyNames.add(new StringDt(subnames[subnames.length-1]));
				for (int i=0; i < subnames.length-1; i++) {
					givenNames.add(new StringDt(subnames[i].trim()));
				}
			}
		} else {
			names = this.getProviderName().trim().split(" ");
			if (names.length > 0) {
				familyNames.add(new StringDt(names[names.length-1].trim()));
				for (int i=0; i < names.length-1; i++) {
					givenNames.add(new StringDt(names[i].trim()));
				}
			} else {
				familyNames.add(new StringDt(this.getProviderName().trim()));
			}
		}
		humanName.setFamily(familyNames);
		humanName.setGiven(givenNames);
		humanName.setSuffix(suffixes);
		
		practitioner.setName(humanName);
		
		PractitionerRole practitionerRole = new PractitionerRole();
		
		if (careSite != null) {
			ResourceReferenceDt organizationResource = new ResourceReferenceDt(careSite.getIdDt());
//			List<ResourceReferenceDt> listResourceRef = new ArrayList<ResourceReferenceDt>();
//			listResourceRef.add(organizationResource);
			organizationResource.setDisplay(careSite.getCareSiteName());
			practitionerRole.setManagingOrganization(organizationResource);
		}
		
		if (specialtyConcept != null &&
				specialtyConcept.getId() > 0) {
			String systemUriString = specialtyConcept.getVocabulary().getVocabularyReference();
			String displayString = specialtyConcept.getName();
			String codeString = specialtyConcept.getConceptCode();
			
			CodeableConceptDt specialtyCode = new CodeableConceptDt(systemUriString, codeString);
			specialtyCode.getCodingFirstRep().setDisplay(displayString);
			
			List<CodeableConceptDt> listSpecialtyCode = new ArrayList<CodeableConceptDt>();
			practitionerRole.setSpecialty(listSpecialtyCode);
		}
		
		List<PractitionerRole> listPracRole = new ArrayList<PractitionerRole>();
		listPracRole.add(practitionerRole);
		
		practitioner.setPractitionerRole(listPracRole);
		
		if(this.genderConcept != null){
			AdministrativeGenderEnum admGender = null;//TODO check if DSTU2 uses values coherent with this enum
			String gName = this.genderConcept.getName(); 
			AdministrativeGenderEnum[] values = AdministrativeGenderEnum.values();
			for (int i = 0; i < values.length; i++) {
				if(gName.equalsIgnoreCase(values[i].getCode())){
					admGender = values[i];
					break;
				}
			}
			practitioner.setGender(admGender);
		}

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
