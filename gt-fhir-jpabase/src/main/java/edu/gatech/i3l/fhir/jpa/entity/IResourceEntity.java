package edu.gatech.i3l.fhir.jpa.entity;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;

/**
 * This interface is used to mapping properties of an Entity to a given Resource.
 * @author Ismael Sarmento
 */
public interface IResourceEntity {
	
	public Long getId();
	
	public FhirVersionEnum getFhirVersion();
	/**
	 * @return The Resource Class related to the Entity. 
	 */
	public String getResourceType();
	
	public InstantDt getUpdated();
	
	/**
	 * Translates the search params that are related to links for the resource.
	 * It is expected that all search params specified for the Resource(s) related to this entity are supported. It should be 
	 * used a chain of responsibility where each entity in the chain provides the proper translation for the param.
	 * @param chain 
	 * 			The search params concatenated in a string with dots (.) between them.
	 * @return the translation for the chain.
	 */
	public String translateSearchParam(String theSearchParam);

	/**
	 * Creates an object of the Resource type related to this entity and sets each property accordingly.
	 * @return the related Resource Instance.
	 */
	public IResource getRelatedResource();
	
	/**
	 * @param The Resource with the properties used to construct the Entity.
	 * @return The Entity constructed using the related Resource(method param) properties
	 */
	public IResourceEntity constructEntityFromResource(IResource resource);
	
	/**
	 * Version to support History features.
	 * @return The entity's version in the history of updates.
	 */
	public Long getVersion();

	public IdDt getIdDt();
}
