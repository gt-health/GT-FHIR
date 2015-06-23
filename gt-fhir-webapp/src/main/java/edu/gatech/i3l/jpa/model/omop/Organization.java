/**
 * 
 */
package edu.gatech.i3l.jpa.model.omop;

import java.util.Collection;

import ca.uhn.fhir.jpa.entity.BaseTag;
import ca.uhn.fhir.jpa.entity.TagDefinition;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.primitive.IdDt;

/**
 * @author MC142
 *
 */
public class Organization extends BaseResourceTable {

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
	@SuppressWarnings("unchecked")
	@Override
	public ca.uhn.fhir.model.dstu2.resource.Organization getRelatedResource() {
		ca.uhn.fhir.model.dstu2.resource.Organization organization = new ca.uhn.fhir.model.dstu2.resource.Organization();
		// TODO set parameters
		return organization;
	}

	/* (non-Javadoc)
	 * @see edu.gatech.i3l.jpa.model.omop.IResourceTable#getRelatedResourceType()
	 */
	@Override
	public Class<? extends IResource> getRelatedResourceType() {
		return ca.uhn.fhir.model.dstu2.resource.Organization.class;
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#addTag(ca.uhn.fhir.jpa.entity.TagDefinition)
	 */
	@Override
	public BaseTag addTag(TagDefinition arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getIdDt()
	 */
	@Override
	public IdDt getIdDt() {
		return new IdDt(getResourceType(), id);
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getResourceType()
	 */
	@Override
	public String getResourceType() {
		// TODO Auto-generated method stub
		return "Organization";
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getTags()
	 */
	@Override
	public Collection<? extends BaseTag> getTags() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHasResource#getVersion()
	 */
	@Override
	public long getVersion() {
		// TODO Auto-generated method stub
		return 0;
	}

}
