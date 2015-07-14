package edu.gatech.i3l.jpa.model.omop;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;

public class Location extends BaseResourceEntity{
	
	public static final String RESOURCE_TYPE = "Location";

	private Long id;
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	private String locationSourceValue;

	public Location() {
		super();
	}

	public Location(String address1, String address2, String city,
			String state, String zipCode, String country,
			String locationSourceValue) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.country = country;
		this.locationSourceValue = locationSourceValue;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLocationSourceValue() {
		return locationSourceValue;
	}

	public void setLocationSourceValue(String locationSourceValue) {
		this.locationSourceValue = locationSourceValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IdDt getIdDt() {
		return new IdDt(getResourceType(), id);
	}

	@Override
	public ca.uhn.fhir.model.dstu2.resource.Location getRelatedResource() {
		ca.uhn.fhir.model.dstu2.resource.Location location =  new ca.uhn.fhir.model.dstu2.resource.Location();
		location.setId(new IdDt(this.getId()));
		location.getAddress().addLine(this.getAddress1()).setCity(this.getCity()).setPostalCode(this.getZipCode()).setState(this.getState()).setCountry(this.getCountry());
		if(this.getAddress2() != null)
			location.getAddress().addLine(this.getAddress2()).setCity(this.getCity()).setPostalCode(this.getZipCode()).setState(this.getState()).setCountry(this.getCountry());
		return location;
	}

	@Override
	public String getResourceType() {
		return RESOURCE_TYPE;
	}

	@Override
	public FhirVersionEnum getFhirVersion() {
		// TODO Auto-generated method stub
		return null;
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
		// TODO Auto-generated method stub
		return null;
	}

}
