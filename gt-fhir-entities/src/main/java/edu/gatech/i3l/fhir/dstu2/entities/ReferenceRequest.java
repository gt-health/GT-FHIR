package edu.gatech.i3l.fhir.dstu2.entities;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.resource.ReferralRequest;
import ca.uhn.fhir.model.dstu2.valueset.ReferralStatusEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @OneToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="organization_id")
    private Organization organization;

    @Column(name = "referencerequest_date")
    @Temporal(TemporalType.DATE)
    private Date date;



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
        ReferralStatusEnum[] states = ReferralStatusEnum.values();
        for (int ind = 0; ind < states.length; ind++) {
            if (states[ind].getCode().equalsIgnoreCase(statusCode)) {
                referralRequest.setStatus(states[ind]);
            }
        }

        // referralRequest.setIdentifier(new ArrayList<IdentifierDt>().add(new IdentifierDt(organization.getIdDt())));

        if (this.date != null) {
            referralRequest.setDate(new DateTimeDt(this.date));
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
