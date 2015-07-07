/**
 * 
 */
package edu.gatech.i3l.jpa.model.omop;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;

/**
 * @author MC142
 *
 */
public class Organization extends BaseResourceEntity {

	public static final String RESOURCE_TYPE = "Organization";

	private Long id;
	private Concept placeOfServiceConcept;
	private Location location;
	private String organizationSourceValue;
	private String placeOfServiceSourceValue;
	
	public Organization() {
		super();
	}
	
	public Organization(Long id, Concept placeOfServiceConcept, Location location,
			String organizationSourceValue, String placeOfServiceSourceValue) {
		super();
		
		this.id = id;
		this.placeOfServiceConcept = placeOfServiceConcept;
		this.location = location;
		this.organizationSourceValue = organizationSourceValue;
		this.placeOfServiceSourceValue = placeOfServiceSourceValue;
	}
	
	public Concept getPlaceOfServiceConcept() {
		return placeOfServiceConcept;
	}
	
	public void setPlaceOfServiceConcept(Concept placeOfServiceConcept) {
		this.placeOfServiceConcept = placeOfServiceConcept;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public String getOrganizationSourceValue() {
		return organizationSourceValue;
	}
	
	public void setOrganizationSourceValue(String organizationSourceValue) {
		this.organizationSourceValue = organizationSourceValue;
	}
	
	public String getPlaceOfServiceSourceValue() {
		return placeOfServiceSourceValue;
	}
	
	public void setPlaceOfServiceSourceValue(String placeOfServiceSourceValue) {
		this.placeOfServiceSourceValue = placeOfServiceSourceValue;
	}
	
	/* (non-Javadoc)
	 * @see edu.gatech.i3l.jpa.model.omop.IResourceTable#getRelatedResource()
	 */
	@Override
	public ca.uhn.fhir.model.dstu2.resource.Organization getRelatedResource() {
		ca.uhn.fhir.model.dstu2.resource.Organization organization = new ca.uhn.fhir.model.dstu2.resource.Organization();
		// TODO set parameters
		return organization;
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public IdDt getIdDt() {
		return new IdDt(getResourceType(), id);
	}
	
	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getResourceType()
	 */
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
	public IdDt getIdDt() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String translateLink(String chain) {
		// TODO Auto-generated method stub
		return null;
	}

}
