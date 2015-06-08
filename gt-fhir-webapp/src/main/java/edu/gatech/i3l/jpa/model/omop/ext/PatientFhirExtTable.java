package edu.gatech.i3l.jpa.model.omop.ext;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.StringDt;
import edu.gatech.i3l.jpa.model.omop.Concept;
import edu.gatech.i3l.jpa.model.omop.IResourceTable;
import edu.gatech.i3l.jpa.model.omop.Location;
import edu.gatech.i3l.jpa.model.omop.Person;
import edu.gatech.i3l.jpa.model.omop.Provider;

/**
 * This class adds some properties to the Omop data model Person, in order to provide
 * all the data specified for FHIR.
 * @author Ismael Sarmento
 */
public class PatientFhirExtTable extends Person implements IResourceTable{

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
		
//		Concept gender = this.getGenderConcept(); 
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
		
		//		patient.setDeceased(new ICompositeDatatype() {
		List<HumanNameDt> name = new ArrayList<HumanNameDt>();
		HumanNameDt humanNameDt = new HumanNameDt();
		List<StringDt> given = new ArrayList<StringDt>();
		given.add(new StringDt(this.getGivenName1()));
		given.add(new StringDt(this.getGivenName2()));
		humanNameDt.setGiven(given );
		List<StringDt> family = new ArrayList<StringDt>();
		family.add(new StringDt(this.getFamilyName()));
		humanNameDt.setFamily(family);
		name.add(humanNameDt);
		patient.setName(name);
		
		return (T)patient;
	}
}
