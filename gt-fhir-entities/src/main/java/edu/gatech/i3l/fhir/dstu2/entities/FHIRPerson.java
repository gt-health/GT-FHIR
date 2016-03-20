package edu.gatech.i3l.fhir.dstu2.entities;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.resource.*;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import org.hibernate.envers.Audited;

import javax.persistence.*;

/**
 * Mark Benjamin 02/03/16
 */
@Entity
@Table(name="f_person")
@Audited
public class FHIRPerson extends BaseResourceEntity{
    // consider making FHIRPerson an Interface
    // Basically Person(Patient), Provider(Practitioner) &
    // hopefully Organization(Organization)
    // all inherit from FHIRPerson(Person)
    // ID should be unified really

    public static final String RESOURCE_TYPE="Person";

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="f_person_id")
    @Access(AccessType.PROPERTY)
    private Long id;

    public FHIRPerson() {
        super();
    }

    public FHIRPerson(Long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public FhirVersionEnum getFhirVersion() {
        return FhirVersionEnum.DSTU2;
    }

    @Override
    public String getResourceType() {
        return RESOURCE_TYPE;
    }

    @Override
    public InstantDt getUpdated() {
        return null;
    }

    @Override
    public String translateSearchParam(String theSearchParam) {
        return "";
    }

    @Override
    public ca.uhn.fhir.model.dstu2.resource.Person getRelatedResource() {
        ca.uhn.fhir.model.dstu2.resource.Person person = new ca.uhn.fhir.model.dstu2.resource.Person();
        person.setId(this.getIdDt());
        // TODO set parameters
        return person;
    }

    @Override
    public IResourceEntity constructEntityFromResource(IResource resource) {
        return null;
    }
}
