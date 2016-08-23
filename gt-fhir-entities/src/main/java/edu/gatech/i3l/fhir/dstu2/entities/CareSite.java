package edu.gatech.i3l.fhir.dstu2.entities;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;


@Entity
@Table(name="care_site")
@Audited
//@NamedQueries(value={
//		@NamedQuery(name="loadCareSiteReference", query="select c.id from CareSite c WHERE c.organization.id = :serviceProvider AND c.location.id = :location")
//})
public class CareSite extends BaseResourceEntity{
	
	public static final String RES_TYPE = "Organization";
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="caresite_seq_gen")
	@SequenceGenerator(name="caresite_seq_gen", sequenceName="caresite_id_seq", allocationSize=1)
	@Column(name="care_site_id")
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="location_id")
	private Location location;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="place_of_service_concept_id")
	@Audited(targetAuditMode=RelationTargetAuditMode.NOT_AUDITED)
	private Concept placeOfServiceConcept;
	
	@Column(name="care_site_name")
	private String careSiteName;
	
	@Column(name="care_site_source_value")
	private String careSiteSourceValue;
	
	@Column(name="place_of_service_source_value")
	private String placeOfServiceSourceValue;
	
	public CareSite() {
		super();
	}
	
	public CareSite(Long id, Location location, Concept placeOfServiceConcept, String careSiteName, String careSiteSourceValue, String placeOfServiceSourceValue) {
		super();
		
		this.id = id;
		this.location = location;
		this.placeOfServiceConcept = placeOfServiceConcept;
		this.careSiteName = careSiteName;
		this.careSiteSourceValue = careSiteSourceValue;
		this.placeOfServiceSourceValue = placeOfServiceSourceValue;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Concept getPlaceOfServiceConcept() {
		return placeOfServiceConcept;
	}
	
	public void setPlaceOfServiceConcept(Concept placeOfServiceConcept) {
		this.placeOfServiceConcept = placeOfServiceConcept;
	}
	
	public String getCareSiteName() {
		return careSiteName;
	}
	
	public void setCareSiteName(String careSiteName) {
		this.careSiteName = careSiteName;
	}
	
	public String getCareSiteSourceValue() {
		return careSiteSourceValue;
	}
	
	public void setCareSiteSourceValue(String careSiteSourceValue) {
		this.careSiteSourceValue = careSiteSourceValue;
	}
	
	public String getPlaceOfServiceSourceValue() {
		return placeOfServiceSourceValue;
	}
	
	public void setPlaceOfServiceSourceValue(String placeOfServiceSourceValue) {
		this.placeOfServiceSourceValue = placeOfServiceSourceValue;
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
		Organization locationResource = new Organization();
		locationResource.setId(this.getIdDt());
		
		if (this.careSiteName != null && this.careSiteName != "") {
			locationResource.setName(this.careSiteName);			
		}
		
		if (this.placeOfServiceConcept != null) {
			String codeString = this.placeOfServiceConcept.getConceptCode();
			String systemUriString = this.placeOfServiceConcept.getVocabulary().getVocabularyReference();
			String displayString = this.placeOfServiceConcept.getName();
			
			CodeableConceptDt typeCodeableConcept = new CodeableConceptDt(systemUriString, codeString);
			typeCodeableConcept.getCodingFirstRep().setDisplay(displayString);
			locationResource.setType(typeCodeableConcept);
		}
		return locationResource;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		// TODO Auto-generated method stub
		return null;
	}
}
