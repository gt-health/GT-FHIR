package edu.gatech.i3l.jpa.model.omop;

import java.util.Calendar;
import java.util.Collection;

import ca.uhn.fhir.jpa.entity.BaseHasResource;
import ca.uhn.fhir.jpa.entity.BaseTag;
import ca.uhn.fhir.jpa.entity.TagDefinition;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.IdDt;

public class Person extends BaseHasResource implements IResourceTable{

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
			patient.addAddress()
				.addLine(location.getAddress1())
				.addLine(location.getAddress2())//WARNING check if mapping for lines are correct
				.setCity(location.getCity())
				.setPostalCode(location.getZipCode())
				.setCountry(location.getCountry());
		}
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(this.getYearOfBirth(), this.getMonthOfBirth(), this.getDayOfBirth());
		patient.setBirthDate(new DateDt(calendar.getTime()));
		
//		Concept gender = this.getGenderConcept(); //FIXME
//		if(gender != null){
//			AdministrativeGenderEnum admGender = null;
//			String gName = gender.getName(); 
//			if("MALE".equals(gName)){
//				admGender = AdministrativeGenderEnum.MALE;
//			}else if("FEMALE".equals(gName)){
//				admGender = AdministrativeGenderEnum.FEMALE;
//			}else if("OTHER".equals(gName)){
//				admGender = AdministrativeGenderEnum.OTHER;
//			}else if("UNKNOWN".equals(gName)){
//				admGender = AdministrativeGenderEnum.UNKNOWN;
//			}
//			patient.setGender(admGender);
//		}
		
		return (T)patient;
	}
	
	@Override
	public BaseTag addTag(TagDefinition theDef) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IdDt getIdDt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getResourceType() {
		return "Patient";
	}

	@Override
	public Collection<? extends BaseTag> getTags() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public long getVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Class<? extends IResource> getRelatedResourceType() {
		return Patient.class;
	}


}
