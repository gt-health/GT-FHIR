package edu.gatech.i3l.jpa.model.omop.ext;

import java.util.Iterator;

import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.AddressUseEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.StringDt;
import edu.gatech.i3l.jpa.model.omop.Concept;
import edu.gatech.i3l.jpa.model.omop.Location;
import edu.gatech.i3l.jpa.model.omop.Person;
import edu.gatech.i3l.jpa.model.omop.Provider;

/**
 * This class adds some properties to the Omop data model Person, in order to provide
 * all the data specified for FHIR.
 * @author Ismael Sarmento
 */
public class PatientFhirExtTable extends Person{

	private static final org.slf4j.Logger ourLog = org.slf4j.LoggerFactory.getLogger(PatientFhirExtTable.class);
	private String familyName;
	private String givenName1;
	private String givenName2;
	private String prefixName;
	private String suffixName;
	private String preferredLanguage;
	private String ssn;
	private String maritalStatusConceptValue;
	private Boolean active;
	
	public PatientFhirExtTable() {
		super();
	}

//	public PatientFhirExtTable(Long id, Integer yearOfBirth,
//			Integer monthOfBirth, Integer dayOfBirth, Location location,
//			Provider provider, String personSourceValue,
//			String genderSourceValue, Concept genderConcept,
//			String ethnicitySourceValue, Concept ethnicityConcept,
//			String raceSourceValue, Concept raceConcept,
//			String familyName, String givenName1,
//			String givenName2, String prefixName, String suffixName,
//			String preferredLanguage, String ssn,
//			String maritalStatusConceptValue) {
//		super(id, yearOfBirth, monthOfBirth, dayOfBirth, location, provider,
//				personSourceValue, genderSourceValue, genderConcept,
//				ethnicitySourceValue, ethnicityConcept, raceSourceValue,
//				raceConcept);
//		this.familyName = familyName;
//		this.givenName1 = givenName1;
//		this.givenName2 = givenName2;
//		this.prefixName = prefixName;
//		this.suffixName = suffixName;
//		this.preferredLanguage = preferredLanguage;
//		this.ssn = ssn;
//		this.maritalStatusConceptValue = maritalStatusConceptValue;
//	}

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
	
	public Boolean getActive() {
		return active;
	}
	
	public void setActive(Boolean active) {
		this.active = active;
	}
	
	@Override
	public Patient getRelatedResource() {
		Patient patient = (Patient) super.getRelatedResource();
		patient.addName().addFamily(this.familyName).addGiven(this.givenName1);
		if(this.givenName2 != null)
			patient.getName().get(0).addGiven(this.givenName2);
		boolean active = this.active != null ? this.active : false;
		patient.setActive(active);
		return patient;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		super.constructEntityFromResource(resource);
		if(resource instanceof Patient){
			Patient patient = (Patient)resource;
			
			Iterator<HumanNameDt> iterator = patient.getName().iterator();
			//while(iterator.hasNext()){
				HumanNameDt next = iterator.next();
				this.givenName1 = next.getGiven().iterator().next().getValue();
				if(next.getGiven().iterator().hasNext())  
					this.givenName2 = next.getGiven().iterator().next().getValue();
				Iterator<StringDt> family = next.getFamily().iterator();
				this.familyName = "";
				while(family.hasNext()){
					this.familyName = this.familyName.concat(family.next().getValue()+" ");
				}
				if(next.getSuffix().iterator().hasNext())
					this.suffixName = next.getSuffix().iterator().next().getValue();
				if(next.getPrefix().iterator().hasNext())
					this.prefixName = next.getPrefix().iterator().next().getValue();
			//}
			
			this.active = patient.getActive();
			this.maritalStatusConceptValue = patient.getMaritalStatus().getText();
		} else {
			ourLog.error("There was not possible to construct the entity ? using the resource ?. It should be used the resource ?.",
					this.getClass().getSimpleName(), resource.getResourceName(), getResourceType());
		}
		return this;
	}

	
}
