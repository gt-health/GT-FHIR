package edu.gatech.i3l.jpa.model.omop;

import ca.uhn.fhir.model.api.IResource;

public interface IResourceTable {

	public <T extends IResource> T getRelatedResource();
}
