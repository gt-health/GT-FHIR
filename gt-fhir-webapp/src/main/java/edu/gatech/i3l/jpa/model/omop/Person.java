package edu.gatech.i3l.jpa.model.omop;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.StringDt;

public class Person implements IResourceTable{

	private Long id;
	private Integer yearOfBirth;
	private Integer monthOfBirth;
	private Integer dayOfBirth;
	private Location location;
	/**
	 * Makes the indirect relationship between the person and the Care Site.
	 */
	private Provider provider;
	private String personSourceValue;
	private String genderSourceValue;
	private Concept genderConcept;
	private String ethnicitySourceValue;
	private Concept ethnicityConcept;
	private String raceSourceValue;
	private Concept raceConcept;

	public Person() {
		super();
	}

	public Person(Long id, Integer yearOfBirth, Integer monthOfBirth,
			Integer dayOfBirth, Location location, Provider provider, String personSourceValue,
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

	@SuppressWarnings("unchecked")
	@Override
	public <T extends IResource> T getRelatedResource() {
		Patient patient = new Patient();
		patient.setId(new IdDt(this.getId()));
		
		Location location = this.getLocation();
		if(location != null){
			List<AddressDt> addresses = new ArrayList<AddressDt>();
			AddressDt address = new AddressDt(); 
			List<StringDt> lines = new ArrayList<StringDt>();
			lines.add(new StringDt(location.getAddress1()));
			lines.add(new StringDt(location.getAddress2()));
			address.setLine(lines ); 
			address.setCity(location.getCity());
			address.setPostalCode(location.getZipCode());
			address.setCountry(location.getCountry());
			addresses.add(address);
			patient.setAddress(addresses);
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(this.getYearOfBirth(), this.getMonthOfBirth(), this.getDayOfBirth());
		patient.setBirthDate(new DateDt(calendar.getTime()));
		
		Concept gender = this.getGenderConcept(); 
		if(gender != null){
			AdministrativeGenderEnum admGender = null;
			String gName = gender.getName(); 
			if("MALE".equals(gName)){
				admGender = AdministrativeGenderEnum.MALE;
			}else if("FEMALE".equals(gName)){
				admGender = AdministrativeGenderEnum.FEMALE;
			}else if("OTHER".equals(gName)){
				admGender = AdministrativeGenderEnum.OTHER;
			}else if("UNKNOWN".equals(gName)){
				admGender = AdministrativeGenderEnum.UNKNOWN;
			}
			patient.setGender(admGender);
		}
		
		return (T)patient;
	}

	
	class PatientFhirExtTable extends Person{

		private String familyName;
		private String givenName1;
		private String givenName2;
		private String prefixName;
		private String suffixName;
		private String preferredLanguage;
		private String ssn;
		private String maritalStatusConceptValue;
		
		public PatientFhirExtTable() {
			super();
		}

		public PatientFhirExtTable(Long id, Integer yearOfBirth,
				Integer monthOfBirth, Integer dayOfBirth, Location location,
				Provider provider, String personSourceValue,
				String genderSourceValue, Concept genderConcept,
				String ethnicitySourceValue, Concept ethnicityConcept,
				String raceSourceValue, Concept raceConcept,
				String familyName, String givenName1,
				String givenName2, String prefixName, String suffixName,
				String preferredLanguage, String ssn,
				String maritalStatusConceptValue) {
			super(id, yearOfBirth, monthOfBirth, dayOfBirth, location, provider,
					personSourceValue, genderSourceValue, genderConcept,
					ethnicitySourceValue, ethnicityConcept, raceSourceValue,
					raceConcept);
			this.familyName = familyName;
			this.givenName1 = givenName1;
			this.givenName2 = givenName2;
			this.prefixName = prefixName;
			this.suffixName = suffixName;
			this.preferredLanguage = preferredLanguage;
			this.ssn = ssn;
			this.maritalStatusConceptValue = maritalStatusConceptValue;
		}

		public String getFamilyName() {
			return familyName;
		}

		public void setFamilyName(String familyName) {
			this.familyName = familyName;
		}

		public String getGivenName1() {
			return givenName1;
		}

		public void setGivenName1(String givenName1) {
			this.givenName1 = givenName1;
		}

		public String getGivenName2() {
			return givenName2;
		}

		public void setGivenName2(String givenName2) {
			this.givenName2 = givenName2;
		}

		public String getPrefixName() {
			return prefixName;
		}

		public void setPrefixName(String prefixName) {
			this.prefixName = prefixName;
		}

		public String getSuffixName() {
			return suffixName;
		}

		public void setSuffixName(String suffixName) {
			this.suffixName = suffixName;
		}

		public String getPreferredLanguage() {
			return preferredLanguage;
		}

		public void setPreferredLanguage(String preferredLanguage) {
			this.preferredLanguage = preferredLanguage;
		}

		public String getSsn() {
			return ssn;
		}

		public void setSsn(String ssn) {
			this.ssn = ssn;
		}

		public String getMaritalStatusConceptValue() {
			return maritalStatusConceptValue;
		}

		public void setMaritalStatusConceptValue(String maritalStatusConceptValue) {
			this.maritalStatusConceptValue = maritalStatusConceptValue;
		}
		
		
	}

}
