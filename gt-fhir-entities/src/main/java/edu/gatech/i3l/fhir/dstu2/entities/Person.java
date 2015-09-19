package edu.gatech.i3l.fhir.dstu2.entities;

import java.util.Calendar;
import java.util.Set;

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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.AddressUseEnum;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

@Entity
@Audited
@Table(name="person")
@Inheritance(strategy=InheritanceType.JOINED)
public class Person extends BaseResourceEntity{

	public static final String RESOURCE_TYPE = "Patient";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="person_id")
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@Column(name="year_of_birth", nullable=false)
	@NotNull
	private Integer yearOfBirth;
	
	@Column(name="month_of_birth")
	private Integer monthOfBirth;
	
	@Column(name="day_of_birth")
	private Integer dayOfBirth;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="location_id")
	private LocationComplement location;
	
	/**
	 * Makes the indirect relationship between the person and the Care Site.
	 */
	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.MERGE})
	@JoinColumn(name="provider_id")
	private Provider provider;
	
	@Column(name="person_source_value")
	private String personSourceValue;
	
	@Column(name="gender_source_value")
	private String genderSourceValue;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="gender_concept_id", nullable= false)
	@NotNull
	private Concept genderConcept;
	
	@Column(name="ethnicity_source_value")
	private String ethnicitySourceValue;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="ethnicity_concept_id")
	private Concept ethnicityConcept;
	
	@Column(name="race_source_value")
	private String raceSourceValue;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="race_concept_id")
	private Concept raceConcept;
	
	@OneToMany(orphanRemoval=true, mappedBy="person")
	private Set<ConditionOccurrence> conditions;
	
	//private Death death;

	public Person() {
		super();
	}

	public Person(Long id, Integer yearOfBirth, Integer monthOfBirth,
			Integer dayOfBirth, LocationComplement location, Provider provider, String personSourceValue,
			String genderSourceValue, Concept genderConcept,
			String ethnicitySourceValue, Concept ethnicityConcept,
			String raceSourceValue, Concept raceConcept) {
		super();
		this.id = id;
		this.yearOfBirth = yearOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.dayOfBirth = dayOfBirth;
		this.location = location;
		this.provider = provider;
		this.personSourceValue = personSourceValue;
		this.genderSourceValue = genderSourceValue;
		this.genderConcept = genderConcept;
		this.ethnicitySourceValue = ethnicitySourceValue;
		this.ethnicityConcept = ethnicityConcept;
		this.raceSourceValue = raceSourceValue;
		this.raceConcept = raceConcept;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<ConditionOccurrence> getConditions() {
		return conditions;
	}
	
	public void setConditions(Set<ConditionOccurrence> conditions) {
		this.conditions = conditions;
	}

	public Integer getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(Integer yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public Integer getMonthOfBirth() {
		return monthOfBirth;
	}

	public void setMonthOfBirth(Integer monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	public Integer getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(Integer dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public LocationComplement getLocation() {
		return location;
	}

	public void setLocation(LocationComplement location) {
		this.location = location;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String getPersonSourceValue() {
		return personSourceValue;
	}

	public void setPersonSourceValue(String personSourceValue) {
		this.personSourceValue = personSourceValue;
	}

	public String getGenderSourceValue() {
		return genderSourceValue;
	}

	public void setGenderSourceValue(String genderSourceValue) {
		this.genderSourceValue = genderSourceValue;
	}

	public Concept getGenderConcept() {
		return genderConcept;
	}

	public void setGenderConcept(Concept genderConcept) {
		this.genderConcept = genderConcept;
	}

	public String getEthnicitySourceValue() {
		return ethnicitySourceValue;
	}

	public void setEthnicitySourceValue(String ethnicitySourceValue) {
		this.ethnicitySourceValue = ethnicitySourceValue;
	}

	public Concept getEthnicityConcept() {
		return ethnicityConcept;
	}

	public void setEthnicityConcept(Concept ethnicityConcept) {
		this.ethnicityConcept = ethnicityConcept;
	}

	public String getRaceSourceValue() {
		return raceSourceValue;
	}

	public void setRaceSourceValue(String raceSourceValue) {
		this.raceSourceValue = raceSourceValue;
	}

	public Concept getRaceConcept() {
		return raceConcept;
	}

	public void setRaceConcept(Concept raceConcept) {
		this.raceConcept = raceConcept;
	}
	
//	public Death getDeath() {
//		return death;
//	}
//	
//	public void setDeath(Death death) {
//		this.death = death;
//	}

	@Override
	public Patient getRelatedResource() {
		Patient patient = new Patient();
		patient.setId(this.getIdDt());
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(this.yearOfBirth, this.monthOfBirth, this.dayOfBirth);
		patient.setBirthDate(new DateDt(calendar.getTime()));
		
		if(this.location != null){
			PeriodDt period = new PeriodDt();
			period.setStart(new DateTimeDt(this.location.getStartDate()));
			period.setEnd(new DateTimeDt(this.location.getEndDate()));
			patient.addAddress()
				.setUse(AddressUseEnum.HOME)
				.addLine(this.location.getAddress1())
				.addLine(this.location.getAddress2())//WARNING check if mapping for lines are correct
				.setCity(this.location.getCity())
				.setPostalCode(this.location.getZipCode())
				.setState(this.location.getState())
				.setCountry(this.location.getCountry())
				.setPeriod(period);
		}
		
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
			patient.setGender(admGender);
		}
		
		return patient;
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
		if(resource instanceof Patient){
			Patient patient = (Patient) resource;
			Calendar c = Calendar.getInstance();
			c.setTime(patient.getBirthDate());
			this.yearOfBirth = c.get(Calendar.YEAR);
			this.monthOfBirth = c.get(Calendar.MONTH);
			this.dayOfBirth = c.get(Calendar.DAY_OF_MONTH);
			//TODO set deceased value in Person; Set gender concept (source value is set); list of addresses (?)
//			this.death = patient.getDeceased(); 
			this.genderConcept = new Concept();
			this.genderConcept.setId(OmopConceptMapping.getInstance().get(patient.getGender().substring(0, 1), OmopConceptMapping.GENDER));
			
			LocationComplement location;
			if(this.location != null){
				location = this.location;
			}else {
				location = new LocationComplement();
			}
			AddressDt address = patient.getAddress().get(0);
			location.setAddressUse(address.getUseElement().getValueAsEnum());
			location.setAddress1(address.getLine().get(0).getValue());
			if (address.getLine().size() > 1)// iterator.hasNext or listIterator.hasNext were returning true in all cases
				location.setAddress2(address.getLine().get(1).getValue());
			location.setZipCode(address.getPostalCode());
			location.setCity(address.getCity());
			location.setState(address.getState());
			location.setCountry(address.getCountry());
			location.setEndDate(address.getPeriod().getEnd());
			location.setStartDate(address.getPeriod().getStart());
			this.location = location;
		}
		
		return this;
	}

	@Override
	public String translateSearchParam(String link) {
		switch (link) {
		case Patient.SP_CAREPROVIDER:
			return "provider";
		default:
			break;
		}
		
		return link;
	}
}
