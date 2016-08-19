package edu.gatech.i3l.fhir.dstu2.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import ca.uhn.fhir.model.api.IResource;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

@Entity
@Table(name="location")
@Inheritance(strategy=InheritanceType.JOINED)
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class Location { 
	
	public static final String DATA_TYPE = "AddressDt";

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="location_seq_gen")
	@SequenceGenerator(name="location_seq_gen", sequenceName="location_id_seq")
	@Column(name="location_id")
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@Column(name="address_1")
	private String address1;
	
	@Column(name="address_2")
	private String address2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private String zipCode;
	
	@Column(name="country")
	private String country;
	
	@Column(name="location_source_value")
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

	public ca.uhn.fhir.model.dstu2.resource.Location getRelatedResource() {
		ca.uhn.fhir.model.dstu2.resource.Location location =  new ca.uhn.fhir.model.dstu2.resource.Location();
//		location.setId(this.getIdDt());
		location.getAddress().addLine(this.getAddress1()).setCity(this.getCity()).setPostalCode(this.getZipCode()).setState(this.getState()).setCountry(this.getCountry());
		if(this.getAddress2() != null)
			location.getAddress().addLine(this.getAddress2()).setCity(this.getCity()).setPostalCode(this.getZipCode()).setState(this.getState()).setCountry(this.getCountry());
		return location;
	}

	public IResourceEntity constructEntityFromResource(IResource resource) {
		// TODO Auto-generated method stub
		return null;
	}


}
