package edu.gatech.i3l.fhir.dstu2.entities;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.resource.ProcedureRequest;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import org.hibernate.envers.Audited;

import javax.persistence.*;

/**
 * Created by mark on 02/03/16.
 */

@Entity
@Table(name="procrequest")
@Audited
public class ProcRequest extends BaseResourceEntity{

    public static final String RESOURCE_TYPE = "ProcedureRequest";

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="procrequest_id")
    @Access(AccessType.PROPERTY)
    private Long id;

    public ProcRequest() {
        super();
    }

    public ProcRequest(Long id) {
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
        ProcedureRequest procedureRequest = new ProcedureRequest();
        procedureRequest.setId(this.getIdDt());

        // TODO Auto-generated method stub
        return procedureRequest;
    }

    @Override
    public IResourceEntity constructEntityFromResource(IResource resource) {
        return null;
    }
}
