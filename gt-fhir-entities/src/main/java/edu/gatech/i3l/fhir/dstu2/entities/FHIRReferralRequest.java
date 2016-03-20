package edu.gatech.i3l.fhir.dstu2.entities;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.ReferralRequest;
import ca.uhn.fhir.model.dstu2.valueset.ReferralStatusEnum;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.Date;

/**
 * Mark Benjamin 02/03/16
 */
@Entity
@Table(name="f_referralrequest")
@Audited
public class FHIRReferralRequest extends BaseResourceEntity {

    public static final String RESOURCE_TYPE = "ReferralRequest";

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="f_referralrequest_id")
    @Access(AccessType.PROPERTY)
    private Long id;

    @Column(name="f_referralrequest_status_code")
    private String statusCode;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="f_referralrequest_organization_id")
    private Organization organization;

    @Column(name = "f_referralrequest_date")
    @Temporal(TemporalType.DATE)
    private Date date;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="f_referralrequest_type_concept_id")
    private Concept typeConcept;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="f_referralrequest_specialty_concept_id")
    private Concept specialtyConcept;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="f_referralrequest_priority_concept_id")
    private Concept priorityConcept;

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="f_referralrequest_person_id")
    private Person person; // FHIR Patient

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="f_referralrequest_individual_id")
    private FHIRPerson requester; // TODO see FHIR doc; requester should in fact be
                                  // {FHIR Practitioner | FHIR Organization | FHIR Patient}

    // recipient

    // encounter

    // dateSent

    // reason

    // description

    // serviceRequested

    // supportingInformation

    // fulfilmentTime



    public FHIRReferralRequest() {
        super();
    }

    public FHIRReferralRequest(Long id, String statusCode) {
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
        if (this.typeConcept != null) {
            referralRequest.setType(new CodeableConceptDt(this.typeConcept.getVocabulary().getSystemUri(),
                    this.typeConcept.getConceptCode()));
        }
        if (this.specialtyConcept != null) {
            referralRequest.setType(new CodeableConceptDt(this.specialtyConcept.getVocabulary().getSystemUri(),
                    this.specialtyConcept.getConceptCode()));
        }
        if (this.priorityConcept != null) {
            referralRequest.setType(new CodeableConceptDt(this.priorityConcept.getVocabulary().getSystemUri(),
                    this.priorityConcept.getConceptCode()));
        }
        if (this.person != null) {
            referralRequest.setPatient(new ResourceReferenceDt(new IdDt(Person.RESOURCE_TYPE, this.person.getId())));
        }

        referralRequest.setRequester(new ResourceReferenceDt(new IdDt(FHIRPerson.RESOURCE_TYPE, this.requester.getId())));


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
