package edu.gatech.i3l.fhir.dstu2.entities;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.resource.Appointment;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import org.hibernate.envers.Audited;

import javax.persistence.*;

@Entity
@Table(name="f_appointment")
@Audited
public class FHIRAppointment extends BaseResourceEntity{

    public static final String RESOURCE_TYPE = "Appointment";

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="f_appointment_id")
    @Access(AccessType.PROPERTY)
    private Long id;

    public FHIRAppointment() {
        super();
    }

    public FHIRAppointment(long id) {
        this.id = id;
    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(long id) {
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
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String translateSearchParam(String theSearchParam) {
        // TODO Auto-generated method stub
        return "";
    }

    @Override
    public IResource getRelatedResource() {
        Appointment appointment = new Appointment();
        appointment.setId(this.getIdDt());
        // TODO Auto-generated method stub
        return appointment;
    }

    @Override
    public IResourceEntity constructEntityFromResource(IResource resource) {
        // TODO Auto-generated method stub
        return null;
    }
}
