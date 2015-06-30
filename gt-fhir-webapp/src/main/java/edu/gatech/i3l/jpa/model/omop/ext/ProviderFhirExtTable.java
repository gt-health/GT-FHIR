/**
 * 
 */
package edu.gatech.i3l.jpa.model.omop.ext;

import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import edu.gatech.i3l.jpa.model.omop.CareSite;
import edu.gatech.i3l.jpa.model.omop.Concept;
import edu.gatech.i3l.jpa.model.omop.Provider;

/**
 * @author MC142
 *
 */
public class ProviderFhirExtTable extends Provider {
	private String name;
	private Integer yearOfBirth;
	private Integer monthOfBirth;
	private Integer dayOfBirth;
	private Concept genderConcept;
	
	public ProviderFhirExtTable() {
		super();
	}
	
	public ProviderFhirExtTable(Long id, String npi, String dea, Concept specialtyConcept, 
			CareSite careSite, String providerSourceValue, String specialtySourceValue,
			String name, Integer yearOfBirth, Integer monthOfBirth, Integer dayOfBirth, Concept genderConcept) {
		super(id, npi, dea, specialtyConcept, careSite, providerSourceValue, specialtySourceValue);
		
		this.name = name;
		this.yearOfBirth = yearOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.dayOfBirth = dayOfBirth;
		this.genderConcept = genderConcept;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
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
	
	public Concept getGenderConcept() {
		return genderConcept;
	}
	
	public void setGenderConcept(Concept genderConcept) {
		this.genderConcept = genderConcept;
	}
	
	@Override
	public Practitioner getRelatedResource() {
		Practitioner practitioner = super.getRelatedResource();
		
		// Set extended parameters here
		
		return practitioner;
	}

}
