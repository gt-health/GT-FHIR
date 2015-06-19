package edu.gatech.i3l.jpa.model.omop;

public class CareSite {
	private Long id;
	private Location location;
	private Organization organization;
	private Concept placeOfServiceConcept;
	private String careSiteSourceValue;
	private String placeOfServiceSourceValue;
	
	public CareSite() {
		super();
	}
	
	public CareSite(Long id, Location location, Organization organization, 
			Concept placeOfServiceConcept, String careSiteSourceValue) {
		super();
		
		this.id = id;
		this.location = location;
		this.organization = organization;
		this.placeOfServiceConcept = placeOfServiceConcept;
		this.careSiteSourceValue = careSiteSourceValue;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Organization getOrganization() {
		return organization;
	}
	
	public void setOrganization(Organization organization) {
		this.organization = organization;
	}
	
	public Concept getPlaceOfServiceConcept() {
		return placeOfServiceConcept;
	}
	
	public void setPlaceOfServiceConcept(Concept placeOfServiceConcept) {
		this.placeOfServiceConcept = placeOfServiceConcept;
	}
	
	public String getCareSiteSourceValue() {
		return careSiteSourceValue;
	}
	
	public void setCareSiteSourceValue(String careSiteSourceValue) {
		this.careSiteSourceValue = careSiteSourceValue;
	}
	
	public String getPlaceOfServiceSourceValue() {
		return placeOfServiceSourceValue;
	}
	
	public void setPlaceOfServiceSourceValue(String placeOfServiceSourceValue) {
		this.placeOfServiceSourceValue = placeOfServiceSourceValue;
	}
}
