package edu.gatech.i3l.fhir.dstu2.entities;

import java.util.List;

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

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.StringDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

@Entity
@Table(name="location")
@Inheritance(strategy=InheritanceType.JOINED)
@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class Location extends BaseResourceEntity { 
	
	public static final String DATA_TYPE = "AddressDt";

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="location_seq_gen")
	@SequenceGenerator(name="location_seq_gen", sequenceName="location_id_seq", allocationSize=1)
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
	
	@Column(name="location_source_value")
	private String locationSourceValue;

	public Location() {
		super();
	}

	public Location(String address1, String address2, String city,
			String state, String zipCode) {
		super();
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;		
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
		location.getAddress().addLine(this.getAddress1()).setCity(this.getCity()).setPostalCode(this.getZipCode()).setState(this.getState());
		if(this.getAddress2() != null)
			location.getAddress().addLine(this.getAddress2()).setCity(this.getCity()).setPostalCode(this.getZipCode()).setState(this.getState());
		return location;
	}

	public IResourceEntity constructEntityFromResource(IResource resource) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FhirVersionEnum getFhirVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getResourceType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public static Location searchByAddressDt (AddressDt address) {
		if (address != null) {
			List<StringDt> addressLines = address.getLine();
			if (addressLines.size() > 0) {
				String line1 = addressLines.get(0).getValue();
				String line2 = null;
				if (address.getLine().size() > 1)
					line2 = address.getLine().get(1).getValue();
				String zipCode = address.getPostalCode();
				String city = address.getCity();
				String state = address.getState();
				
				Location existingLocation = (Location) OmopConceptMapping.getInstance()
						.loadEntityByLocation(Location.class, line1, line2, city, state, zipCode);
				
				return existingLocation;
			}
		}		
		return null;
	}
	
	public static Location searchAndUpdate (AddressDt address, Location location) {
		if (address == null) return null;
		
//		location.setAddressUse(address.getUseElement().getValueAsEnum());
		List<StringDt> addressLines = address.getLine();
		if (addressLines.size() > 0) {
			String line1 = addressLines.get(0).getValue();
			String line2 = null;
			if (address.getLine().size() > 1)
				line2 = address.getLine().get(1).getValue();
			String zipCode = address.getPostalCode();
			String city = address.getCity();
			String state = address.getState();
			
			Location existingLocation = (Location) OmopConceptMapping.getInstance()
					.loadEntityByLocation(Location.class, line1, line2, city, state, zipCode);
			if (existingLocation != null) {
				return existingLocation;
			} else {
				// We will return new Location. But, if Location is provided,
				// then we set the parameters here.
				if (location != null) {
					location.setAddress1(line1);
					if (line2 != null)
						location.setAddress2(line2);
					location.setZipCode(zipCode);
					location.setCity(city);
					location.setState(state);
				} else {
					return new Location (line1, line2, city, state, zipCode);
				}
			}
			
//			location.setEndDate(address.getPeriod().getEnd());
//			location.setStartDate(address.getPeriod().getStart());
		}
		
		return null;
	}

	@Override
	public String translateSearchParam(String theSearchParam) {
		// TODO Auto-generated method stub
		return null;
	}


}
