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
import javax.persistence.SequenceGenerator;
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

	public static final String RES_TYPE = "Patient";
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="person_id_seq")
	@SequenceGenerator(name="person_id_seq", sequenceName="person_id_seq", allocationSize=1)
	@Column(name="person_id")
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.MERGE})
	@JoinColumn(name="gender_concept_id", nullable= false)
	private Concept genderConcept;
	
	@Column(name="year_of_birth", nullable=false)
	private Integer yearOfBirth;
	
	@Column(name="month_of_birth")
	private Integer monthOfBirth;
	
	@Column(name="day_of_birth")
	private Integer dayOfBirth;
	
	@Column(name="time_of_birth")
	private String timeOfBirth;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="race_concept_id")
	private Concept raceConcept;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="ethnicity_concept_id")
	private Concept ethnicityConcept;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="location_id")
	private Location location;
	
	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.MERGE})
	@JoinColumn(name="provider_id")
	private Provider provider;

	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.MERGE})
	@JoinColumn(name="care_site_id")
	private CareSite careSite;
	
	@Column(name="person_source_value")
	private String personSourceValue;
	
	@Column(name="gender_source_value")
	private String genderSourceValue;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="gender_source_concept_id")
	private Concept genderSourceConcept;
	
	@Column(name="race_source_value")
	private String raceSourceValue;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="race_source_concept_id")
	private Concept raceSourceConcept;

	@Column(name="ethnicity_source_value")
	private String ethnicitySourceValue;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="ethnicity_source_concept_id")
	private Concept ethnicitySourceConcept;

//	@OneToMany(orphanRemoval=true, mappedBy="person")
//	private Set<ConditionOccurrence> conditions;
	
	//private Death death;

	public Person() {
		super();
		this.genderConcept = new Concept();
		this.genderConcept.setId(0L);
		this.raceConcept = new Concept();
		this.raceConcept.setId(0L);
		this.setYearOfBirth(0);
		this.ethnicityConcept = new Concept();
		this.ethnicityConcept.setId(0L);
	}

	public Person(Long id, Concept genderConcept, Integer yearOfBirth, Integer monthOfBirth,
			Integer dayOfBirth, String timeOfBirth, Concept raceConcept, Concept ethnicityConcept, 
			Location location, Provider provider, CareSite careSite, String personSourceValue,
			String genderSourceValue, Concept genderSourceConcept, String raceSourceValue,
			Concept raceSourceConcept, String ethnicitySourceValue, Concept ethnicitySourceConcept) {
		super();
		this.id = id;
		this.genderConcept = genderConcept;
		this.yearOfBirth = yearOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.dayOfBirth = dayOfBirth;
		this.timeOfBirth = timeOfBirth;
		this.raceConcept = raceConcept;
		this.ethnicityConcept = ethnicityConcept;
		this.location = location;
		this.provider = provider;
		this.careSite = careSite;
		this.personSourceValue = personSourceValue;
		this.genderSourceValue = genderSourceValue;
		this.genderSourceConcept = genderSourceConcept;
		this.raceSourceValue = raceSourceValue;
		this.raceSourceConcept = raceSourceConcept;
		this.ethnicitySourceValue = ethnicitySourceValue;
		this.ethnicitySourceConcept = ethnicitySourceConcept;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Concept getGenderConcept() {
		return genderConcept;
	}

	public void setGenderConcept(Concept genderConcept) {
		this.genderConcept = genderConcept;
	}

//	public Set<ConditionOccurrence> getConditions() {
//		return conditions;
//	}
//	
//	public void setConditions(Set<ConditionOccurrence> conditions) {
//		this.conditions = conditions;
//	}
//
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
	
	public String getTimeOfBirth() {
		return timeOfBirth;
	}
	
	public void setTimeOfBirth(String timeOfBirth) {
		this.timeOfBirth = timeOfBirth;
	}

	public Concept getRaceConcept() {
		return raceConcept;
	}

	public void setRaceConcept(Concept raceConcept) {
		this.raceConcept = raceConcept;
	}
	
	public Concept getEthnicityConcept() {
		return ethnicityConcept;
	}

	public void setEthnicityConcept(Concept ethnicityConcept) {
		this.ethnicityConcept = ethnicityConcept;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public CareSite getCareSite() {
		return careSite;
	}
	
	public void setCareSite(CareSite careSite) {
		this.careSite = careSite;
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
	
	public Concept getGenderSourceConcept() {
		return genderSourceConcept;
	}
	
	public void setGenderSourceConcept(Concept genderSourceConcept) {
		this.genderSourceConcept = genderSourceConcept;
	}

	public String getRaceSourceValue() {
		return raceSourceValue;
	}

	public void setRaceSourceValue(String raceSourceValue) {
		this.raceSourceValue = raceSourceValue;
	}

	public Concept getRaceSourceConcept() {
		return raceSourceConcept;
	}
	
	public void setRaceSourceConcept(Concept raceSourceConcept) {
		this.raceSourceConcept = raceSourceConcept;
	}
	
	public String getEthnicitySourceValue() {
		return ethnicitySourceValue;
	}

	public void setEthnicitySourceValue(String ethnicitySourceValue) {
		this.ethnicitySourceValue = ethnicitySourceValue;
	}

	public Concept getEthnicitySourceConcept() {
		return ethnicitySourceConcept;
	}
	
	public void setEthnicitySourceConcept(Concept ethnicitySourceConcept) {
		this.ethnicitySourceConcept = ethnicitySourceConcept;
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
		int yob, mob, dob;
		if (this.yearOfBirth != null) yob = this.yearOfBirth; else yob = 1;
		if (this.monthOfBirth != null) mob = this.monthOfBirth; else mob = 1;
		if (this.dayOfBirth != null) dob = this.dayOfBirth; else dob = 1;
		calendar.set(yob, mob-1, dob);
		patient.setBirthDate(new DateDt(calendar.getTime()));
		
		if(this.location != null){
//			PeriodDt period = new PeriodDt();
//			period.setStart(new DateTimeDt(this.location.getStartDate()));
//			period.setEnd(new DateTimeDt(this.location.getEndDate()));
			patient.addAddress()
				.setUse(AddressUseEnum.HOME)
				.addLine(this.location.getAddress1())
				.addLine(this.location.getAddress2())//WARNING check if mapping for lines are correct
				.setCity(this.location.getCity())
				.setPostalCode(this.location.getZipCode())
				.setState(this.location.getState());
//				.setPeriod(period);
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
		return RES_TYPE;
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
			this.monthOfBirth = c.get(Calendar.MONTH)+1;
			this.dayOfBirth = c.get(Calendar.DAY_OF_MONTH);
			//TODO set deceased value in Person; Set gender concept (source value is set); list of addresses (?)
//			this.death = patient.getDeceased(); 
			this.genderConcept = new Concept();
			this.genderConcept.setId(OmopConceptMapping.getInstance().get(patient.getGender().substring(0, 1), OmopConceptMapping.GENDER));
			
			Location location;
			if(this.location != null){
				location = this.location;
			}else {
				location = new Location();
			}
			AddressDt address = patient.getAddress().get(0);
//			location.setAddressUse(address.getUseElement().getValueAsEnum());
			location.setAddress1(address.getLine().get(0).getValue());
			if (address.getLine().size() > 1)// iterator.hasNext or listIterator.hasNext were returning true in all cases
				location.setAddress2(address.getLine().get(1).getValue());
			location.setZipCode(address.getPostalCode());
			location.setCity(address.getCity());
			location.setState(address.getState());
//			location.setEndDate(address.getPeriod().getEnd());
//			location.setStartDate(address.getPeriod().getStart());
			this.location = location;
		}
		
		//TODO: Add this to OmopConceptMapping class. Race Concept is required in OMOP v5
		//      But, FHIR Patient does not have race data element
		Concept race = new Concept();
		race.setId(8552L);
		this.setRaceConcept(race);
		
		// Ethnicity is not available in FHIR resource. Set to 0L as there is no unknown ethnicity.
		Concept ethnicity = new Concept();
		ethnicity.setId(0L);
		this.setEthnicityConcept(ethnicity);
		
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
