package edu.gatech.i3l.fhir.dstu3.entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.envers.Audited;
import org.hl7.fhir.dstu3.model.Reference;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.instance.model.api.IBaseResource;
import org.springframework.web.context.ContextLoaderListener;
import org.springframework.web.context.WebApplicationContext;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;

import org.hl7.fhir.dstu3.model.Enumerations.AdministrativeGender;
import org.hl7.fhir.dstu3.model.HumanName;
//import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
//import ca.uhn.fhir.model.dstu2.composite.CodingDt;
//import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
//import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import org.hl7.fhir.dstu3.model.Patient;
import org.hl7.fhir.dstu3.model.Practitioner;
//import org.hl7.fhir.dstu3.model.Practitioner.PractitionerRole;
//import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.StringDt;
import edu.gatech.i3l.fhir.jpa.dao.BaseFhirDao;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

@Entity
@Table(name="provider")
@Inheritance(strategy=InheritanceType.JOINED)
@Audited
public class Provider extends BaseResourceEntity {

	public static final String RESOURCE_TYPE = "Practitioner";

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="provider_seq_gen")
	@SequenceGenerator(name="provider_seq_gen", sequenceName="provider_id_seq", allocationSize=1)

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
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="care_site_id")
	private CareSite careSite;
	
	@Column(name="year_of_birth")
	private Integer yearOfBirth;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.MERGE})
	@JoinColumn(name="gender_concept_id")
	private Concept genderConcept;

	@Column(name="provider_source_value")
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
		if (this.getProviderName() != null) {
			HumanName humanName = new HumanName();
			String[] names = this.getProviderName().trim().split(",");
			String familyName;
			List<StringType> givenNames = new ArrayList<StringType>();
			List<StringType> suffixes = new ArrayList<StringType>();
			if (names.length > 1) {
				if (names.length > 2) {
//					familyNames.add(names[0].trim());
					familyName = names[0].trim();
					suffixes.add(new StringType(names[names.length-1].trim()));
					
					for (int i=1; i < names.length-1; i++) {
						String[] subnames = names[i].trim().split(" ");
						for (int j=0; j < subnames.length; j++) {
							givenNames.add(new StringType(subnames[j].trim()));
						}
					}
				} else {
					suffixes.add(new StringType(names[1].trim()));
					String[] subnames = names[0].trim().split(" ");
					familyName = subnames[subnames.length-1];
					for (int i=0; i < subnames.length-1; i++) {
						givenNames.add(new StringType(subnames[i].trim()));
					}
				}
			} else {
				names = this.getProviderName().trim().split(" ");
				if (names.length > 0) {
					familyName = names[names.length-1].trim();
					for (int i=0; i < names.length-1; i++) {
						givenNames.add(new StringType(names[i].trim()));
					}
				} else {
					familyName = this.getProviderName().trim();
				}
			}
			humanName.setFamily(familyName);
			humanName.setGiven(givenNames);
			humanName.setSuffix(suffixes);
			List<HumanName> humanNames = new ArrayList<HumanName>();
			humanNames.add(humanName);
			practitioner.setName(humanNames);
		}
//		PractitionerRole practitionerRole = new PractitionerRole();
		
//		if (careSite != null) {
//			ResourceReferenceDt organizationResource = new ResourceReferenceDt(careSite.getIdDt());
////			List<ResourceReferenceDt> listResourceRef = new ArrayList<ResourceReferenceDt>();
////			listResourceRef.add(organizationResource);
//			organizationResource.setDisplay(careSite.getCareSiteName());
//			practitionerRole.setManagingOrganization(organizationResource);
//		}
		
//		if (specialtyConcept != null &&
//				specialtyConcept.getId() > 0L) {
//			String systemUriString = specialtyConcept.getVocabulary().getVocabularyReference();
//			String displayString = specialtyConcept.getName();
//			String codeString = specialtyConcept.getConceptCode();
//			
//			CodeableConceptDt specialtyCode = new CodeableConceptDt(systemUriString, codeString);
//			specialtyCode.getCodingFirstRep().setDisplay(displayString);
//			
//			List<CodeableConceptDt> listSpecialtyCode = new ArrayList<CodeableConceptDt>();
//			listSpecialtyCode.add(specialtyCode);
//			practitionerRole.setSpecialty(listSpecialtyCode);
//		}
		
//		List<PractitionerRole> listPracRole = new ArrayList<PractitionerRole>();
//		listPracRole.add(practitionerRole);
//		
//		practitioner.setPractitionerRole(listPracRole);
		
		if (this.genderConcept != null){
			String gName = this.genderConcept.getName().toLowerCase(); 
			AdministrativeGender admGender;
			try {
				admGender = AdministrativeGender.fromCode(gName);
				practitioner.setGender(admGender);
			} catch (FHIRException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		if (this.yearOfBirth != null) {
			Calendar cal = Calendar.getInstance();
			cal.set(Calendar.YEAR, this.yearOfBirth);
			practitioner.setBirthDate(cal.getTime());
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
	public IResourceEntity constructEntityFromResource(IBaseResource resource) {
		Practitioner practitioner = (Practitioner) resource;
		
		List<HumanName> humanNames = practitioner.getName();
		if (humanNames.size() > 0) {
			HumanName humanName = humanNames.get(0);
			String familyName = humanName.getFamily().replace(" ", "_");
			String givenName = humanName.getGivenAsSingleString();
			String suffixName = humanName.getSuffixAsSingleString();
			
			String omopName = givenName+" "+familyName+", "+suffixName;
			this.setProviderName(omopName);
		}
		this.genderConcept = new Concept();
		if (practitioner.getGender() != AdministrativeGender.NULL) {
			this.genderConcept.setId(OmopConceptMapping.getInstance().get(practitioner.getGender().toCode().substring(0, 1).toUpperCase(), OmopConceptMapping.GENDER));
		} else {
			this.genderConcept.setId(0L);
		}

		Date birthDate = practitioner.getBirthDate();
		if (birthDate != null) {
			Calendar cal = Calendar.getInstance();
			cal.setTime(birthDate);
			int year = cal.get(Calendar.YEAR);
			this.setYearOfBirth(year);
		}
		
//		PractitionerRole role = practitioner.getPractitionerRoleFirstRep();
//		if (role != null) {
//			// Search this organization from care_site table.
//			WebApplicationContext myAppCtx = ContextLoaderListener.getCurrentWebApplicationContext();
//			EntityManager entityManager = myAppCtx.getBean("myBaseDao", BaseFhirDao.class).getEntityManager();
//
//			ResourceReferenceDt org = role.getManagingOrganization();
//			if (org != null) {
//				StringDt orgDisplay = org.getDisplay();
//				if (orgDisplay != null) {
//					CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//					CriteriaQuery<CareSite> criteria = builder.createQuery(CareSite.class);
//					Root<CareSite> from = criteria.from(CareSite.class);
//					criteria.select(from).where(
//						builder.equal(from.get("careSiteName"),  orgDisplay.getValueAsString())
//					);
//					TypedQuery<CareSite> query = entityManager.createQuery(criteria);
//					List<CareSite> results = query.getResultList();
//					CareSite careSite = null;
//					if (results.size() > 0) {
//						careSite = results.get(0);
//					} else {
//						careSite = new CareSite();
//						careSite.setCareSiteName(orgDisplay.getValueAsString());
//					}					
//					this.setCareSite(careSite);
//				}
//			}
//			
//			CodeableConceptDt specialty = role.getSpecialtyFirstRep();
//			if (specialty != null) {
//				CodingDt specialtyCode = specialty.getCodingFirstRep();
//				String specialtyDisplay = specialtyCode.getDisplay();
//				if (specialtyDisplay != null && !specialtyDisplay.isEmpty()) {
//					CriteriaBuilder builder = entityManager.getCriteriaBuilder();
//					CriteriaQuery<Concept> criteria = builder.createQuery(Concept.class);
//					Root<Concept> from = criteria.from(Concept.class);
//					criteria.select(from).where(
//						builder.equal(from.get("conceptClassId"), OmopConceptMapping.SPECIALTY),
//						builder.equal(from.get("name"), specialtyDisplay)
//					);
//					TypedQuery<Concept> query = entityManager.createQuery(criteria);
//					List<Concept> results = query.getResultList();
//					Concept specialtyConcept = null;
//					if (results.size() > 0) {
//						specialtyConcept = results.get(0);						this.setSpecialtyConcept(specialtyConcept);
//					} else {
//						specialtyConcept = new Concept();
//						specialtyConcept.setId(0L);
//					}
//					this.setSpecialtyConcept(specialtyConcept);
//				}
//			}
//		}
		
		return this;
	}

	public static Provider searchAndUpdate(Reference resourceRef) {
		if (resourceRef == null) return null;
		
		// See if this exists.
		Provider provider = 
				(Provider) OmopConceptMapping.getInstance().loadEntityById(Provider.class, resourceRef.getReferenceElement().getIdPartAsLong());
		if (provider != null) {
			return provider;
		} else {
			// Check source column to see if we have received this before.
			provider = (Provider) OmopConceptMapping.getInstance()
					.loadEntityBySource(Provider.class, "Provider", "providerSourceValue", resourceRef.getReferenceElement().getIdPart());
			if (provider != null) {
				return provider;
			} else {
				provider = new Provider();
				provider.setProviderSourceValue(resourceRef.getReferenceElement().getIdPart());
				if (resourceRef.getDisplay() != null)
					provider.setProviderName(resourceRef.getDisplay().toString());
				return provider;
			}
		}
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
