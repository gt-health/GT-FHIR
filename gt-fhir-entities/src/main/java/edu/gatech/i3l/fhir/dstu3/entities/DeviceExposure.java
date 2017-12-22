package edu.gatech.i3l.fhir.dstu3.entities;

import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;
import org.hl7.fhir.instance.model.api.IBaseResource;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
//import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Device;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

@Entity
@Table(name="device_exposure")
@Audited
public class DeviceExposure extends BaseResourceEntity {

	public static final String RES_TYPE = "Device";

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="device_exposure_id")
	@Access(AccessType.PROPERTY)
	private Long id;

	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="person_id", nullable=false)
	@NotNull
	private Person person;

	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="device_concept_id", nullable=false)
	@NotNull
	private Concept deviceConcept;

	@Column(name="device_exposure_start_date", nullable=false)
	@NotNull
	private Date deviceExposureStartDate;
	
	@Column(name="device_exposure_end_date")
	private Date deviceExposureEndDate;

	@Column(name="unique_device_id", nullable=false)
	@NotNull
	private String uniqueDeviceId;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="device_type_concept_id", nullable=false)
	@NotNull
	private Concept deviceTypeConcept;

	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="provider_id")
	private Provider provider;
	
	@ManyToOne(cascade=CascadeType.MERGE)
	@JoinColumn(name="visit_occurrence_id")
	private VisitOccurrence visitOccurrence;
	
	@Override
	public Long getId() {
		return id;
	}
	
	public void setId (Long id) {
		this.id = id;
	}

	public Person getPerson () {
		return person;
	}
	
	public void setPerson (Person person) {
		this.person = person;
	}
	
	public Concept getDeviceConcept () {
		return deviceConcept;
	}
	
	public void setDeviceConcept (Concept deviceConcept) {
		this.deviceConcept = deviceConcept;
	}
	
	public Date getDeviceExposureStartDate () {
		return deviceExposureStartDate;
	}
	
	public void setDeviceExposureStartDate (Date deviceExposureStartDate) {
		this.deviceExposureStartDate = deviceExposureStartDate;
	}
	
	public Date getDeviceExposureEndDate () {
		return deviceExposureEndDate;
	}
	
	public void setDeviceExposureEndDate (Date deviceExposureEndDate) {
		this.deviceExposureEndDate = deviceExposureEndDate;
	}
	
	public String getUniqueDeviceId () {
		return uniqueDeviceId;
	}
	
	public void setUniqueDeviceId (String uniqueDeviceId) {
		this.uniqueDeviceId = uniqueDeviceId;
	}
	
	public Concept getDeviceTypeConcept () {
		return deviceTypeConcept;
	}
	
	public void setDeviceTypeConcept (Concept deviceTypeConcept) {
		this.deviceTypeConcept = deviceTypeConcept;
	}
	
	public Provider getProvider () {
		return provider;
	}
	
	public void setProvider (Provider provider) {
		this.provider = provider;
	}
	
	public VisitOccurrence getVisitOccurrence () {
		return visitOccurrence;
	}
	
	public void setVisitOccurrence (VisitOccurrence visitOccurrence) {
		this.visitOccurrence = visitOccurrence;
	}
	
	public DeviceExposure () {
		super();
	}
	
	public DeviceExposure (
			Long id, Person person, Concept deviceConcept, Date deviceExposureStartDate,
			Date deviceExposureEndDate, String uniqueDeviceId, Concept deviceTypeConcept, 
			Provider provider, VisitOccurrence visitOccurrence
	) {
		this.id = id;
		this.person = person;
		this.deviceConcept = deviceConcept;
		this.deviceExposureStartDate = deviceExposureStartDate;
		this.deviceExposureEndDate = deviceExposureEndDate;
		this.uniqueDeviceId = uniqueDeviceId;
		this.deviceTypeConcept = deviceTypeConcept;
		this.provider = provider;
		this.visitOccurrence = visitOccurrence;
	}
	
	@Override
	public FhirVersionEnum getFhirVersion() {
		return FhirVersionEnum.DSTU2;
	}

	@Override
	public String getResourceType() {
		return RES_TYPE;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String translateSearchParam(String theSearchParam) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResource getRelatedResource() {
		Device deviceRes = new Device();
		
		deviceRes.setId(this.getIdDt());
		if (this.person != null) {
			deviceRes.setPatient(new ResourceReferenceDt(this.person.getIdDt()));
		}
		
		if (this.deviceConcept != null) {
			String systemUriStr = this.deviceConcept.getVocabulary().getVocabularyReference();
			String codeStr = this.deviceConcept.getConceptCode();
			String displayStr = this.deviceConcept.getName();
			
			CodeableConceptDt devTypeCode = new CodeableConceptDt(systemUriStr, codeStr);
			devTypeCode.getCodingFirstRep().setDisplay(displayStr);
			deviceRes.setType(devTypeCode);
		}
		
		if (this.uniqueDeviceId != null && !this.uniqueDeviceId.isEmpty()) {
			deviceRes.setUdi(this.uniqueDeviceId);
		}
		
		if (this.provider != null) {
			deviceRes.setOwner(new ResourceReferenceDt(this.provider.getCareSite().getIdDt()));
		} else if (this.visitOccurrence != null) {
			deviceRes.setOwner(new ResourceReferenceDt(this.visitOccurrence.getCareSite().getIdDt()));
		}
				
		return deviceRes;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IBaseResource resource) {
		// TODO Auto-generated method stub
		return null;
	}

}
