/**
 * 
 */
package edu.gatech.i3l.jpa.model.omop;

import java.util.Collection;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.jpa.entity.BaseResourceEntity;
import ca.uhn.fhir.jpa.entity.BaseTag;
import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.jpa.entity.TagDefinition;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;

/**
 * @author MC142
 *
 */
public class EpisodeOfCare extends BaseResourceEntity {
	private Long id;
	private Person person;
	private String episodeSourceValue;
	
	public EpisodeOfCare() {
		super();
	}
	
	public EpisodeOfCare(Long id, Person person, String episodeSourceValue) {
		super();
		
		this.id = id;
		this.person = person;
		this.episodeSourceValue = episodeSourceValue;
	}
	
	public Person getPerson() {
		return person;
	}
	
	public void setPerson(Person person) {
		this.person = person;
	}
	
	public String getEpisodeSourceValue() {
		return episodeSourceValue;
	}
	
	public void setEpisodeSourceValue(String episodeSourceValue) {
		this.episodeSourceValue = episodeSourceValue;
	}
	
	/* (non-Javadoc)
	 * @see edu.gatech.i3l.jpa.model.omop.IResourceTable#getRelatedResource()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare getRelatedResource() {
		ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare episodeOfCare = new ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare();
		
		// TODO: set parameters.
		
		return episodeOfCare;
	}

	/* (non-Javadoc)
	 * @see edu.gatech.i3l.jpa.model.omop.IResourceTable#getRelatedResourceType()
	 */
	public Class<? extends IResource> getRelatedResourceType() {
		return ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare.class;
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
	
	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getIdDt()
	 */
	@Override
	public IdDt getIdDt() {
		return new IdDt(getResourceType(), id);
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getResourceType()
	 */
	@Override
	public String getResourceType() {
		return "EpisodeOfCare";
	}

	/* (non-Javadoc)
	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getVersion()
	 */
	public long getVersion() {
		// TODO Auto-generated method stub
		return 0;
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
	public String translateLink(String chain) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		// TODO Auto-generated method stub
		return null;
	}

}
