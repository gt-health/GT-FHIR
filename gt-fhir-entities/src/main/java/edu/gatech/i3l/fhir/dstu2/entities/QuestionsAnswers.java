package edu.gatech.i3l.fhir.dstu2.entities;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

public class QuestionsAnswers extends BaseResourceEntity {
    @Override
    public Long getId() {
        return null;
    }

    @Override
    public FhirVersionEnum getFhirVersion() {
        return null;
    }

    @Override
    public String getResourceType() {
        return null;
    }

    @Override
    public InstantDt getUpdated() {
        return null;
    }

    @Override
    public String translateSearchParam(String theSearchParam) {
        return null;
    }

    @Override
    public IResource getRelatedResource() {
        return null;
    }

    @Override
    public IResourceEntity constructEntityFromResource(IResource resource) {
        return null;
    }
}
