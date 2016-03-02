package edu.gatech.i3l.fhir.dstu2.entities;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.resource.ReferralRequest;
import ca.uhn.fhir.model.dstu2.valueset.ReferralStatusEnum;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import org.hibernate.envers.Audited;

import javax.persistence.*;

/**
 * Mark Benjamin 02/03/16
 */
@Entity
@Table(name="referencerequest")
@Audited
public class ReferenceRequest  extends BaseResourceEntity {

    public static final String RESOURCE_TYPE = "ReferralRequest";

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="referencerequest_id")
    @Access(AccessType.PROPERTY)
    private Long id;

    @Column(name="referencerequest_status_code")
    private String statusCode;

    public ReferenceRequest() {
        super();
    }

    public ReferenceRequest(Long id, String statusCode) {
        this.id = id;
        this.setStatusCode(statusCode);
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
        ReferralRequest referralRequest = new ReferralRequest();
        referralRequest.setId(this.getIdDt());
        if (statusCode != null) { // TODO default value?
            if (statusCode.equalsIgnoreCase("draft")) {
                referralRequest.setStatus(ReferralStatusEnum.DRAFT);
            }
            if (statusCode.equalsIgnoreCase("requested")) {
                referralRequest.setStatus(ReferralStatusEnum.REQUESTED);
            }
            if (statusCode.equalsIgnoreCase("active")) {
                referralRequest.setStatus(ReferralStatusEnum.ACTIVE);
            }
            if (statusCode.equalsIgnoreCase("cancelled")) {
                referralRequest.setStatus(ReferralStatusEnum.CANCELLED);
            }
            if (statusCode.equalsIgnoreCase("accepted")) {
                referralRequest.setStatus(ReferralStatusEnum.ACCEPTED);
            }
            if (statusCode.equalsIgnoreCase("rejected")) {
                referralRequest.setStatus(ReferralStatusEnum.REJECTED);
            }
            if (statusCode.equalsIgnoreCase("completed")) {
                referralRequest.setStatus(ReferralStatusEnum.COMPLETED);
            }
        }
        // TODO Auto-generated method stub

        return referralRequest;
    }

    @Override
    public IResourceEntity constructEntityFromResource(IResource resource) {
        // TODO Auto-generated method stub
        return null;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }
}
