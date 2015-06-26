///**
// * 
// */
//package edu.gatech.i3l.jpa.model.omop;
//
//import java.util.Collection;
//
//import ca.uhn.fhir.jpa.entity.BaseTag;
//import ca.uhn.fhir.jpa.entity.TagDefinition;
//import ca.uhn.fhir.model.api.IResource;
//import ca.uhn.fhir.model.primitive.IdDt;
//
///**
// * @author MC142
// *
// */
//public class EpisodeOfCare extends BaseResourceTable {
//	private Long id;
//	private Person person;
//	private String episodeSourceValue;
//	
//	public EpisodeOfCare() {
//		super();
//	}
//	
//	public EpisodeOfCare(Long id, Person person, String episodeSourceValue) {
//		super();
//		
//		this.id = id;
//		this.person = person;
//		this.episodeSourceValue = episodeSourceValue;
//	}
//	
//	public Person getPerson() {
//		return person;
//	}
//	
//	public void setPerson(Person person) {
//		this.person = person;
//	}
//	
//	public String getEpisodeSourceValue() {
//		return episodeSourceValue;
//	}
//	
//	public void setEpisodeSourceValue(String episodeSourceValue) {
//		this.episodeSourceValue = episodeSourceValue;
//	}
//	
//	/* (non-Javadoc)
//	 * @see edu.gatech.i3l.jpa.model.omop.IResourceTable#getRelatedResource()
//	 */
//	@SuppressWarnings("unchecked")
//	@Override
//	public ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare getRelatedResource() {
//		ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare episodeOfCare = new ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare();
//		
//		// TODO: set parameters.
//		
//		return episodeOfCare;
//	}
//
//	/* (non-Javadoc)
//	 * @see edu.gatech.i3l.jpa.model.omop.IResourceTable#getRelatedResourceType()
//	 */
//	@Override
//	public Class<? extends IResource> getRelatedResourceType() {
//		return ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare.class;
//	}
//
//	/* (non-Javadoc)
//	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getId()
//	 */
//	@Override
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//	
//	/* (non-Javadoc)
//	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getIdDt()
//	 */
//	@Override
//	public IdDt getIdDt() {
//		return new IdDt(getResourceType(), id);
//	}
//
//	/* (non-Javadoc)
//	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getResourceType()
//	 */
//	@Override
//	public String getResourceType() {
//		return "EpisodeOfCare";
//	}
//
//	/* (non-Javadoc)
//	 * @see ca.uhn.fhir.jpa.entity.BaseHapiResourceTable#getVersion()
//	 */
//	@Override
//	public long getVersion() {
//		// TODO Auto-generated method stub
//		return 0;
//	}
//
//}
