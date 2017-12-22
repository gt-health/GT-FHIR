/**
 * 
 */
package edu.gatech.i3l.fhir.dstu3.entities;

import static ca.uhn.fhir.model.dstu2.resource.Encounter.SP_DATE;
import static ca.uhn.fhir.model.dstu2.resource.Encounter.SP_PATIENT;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.resource.Encounter.Participant;
import ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

/**
 * @author Myung Choi
 *
 */
@Entity
@Table(name="visit_occurrence")
@Inheritance(strategy=InheritanceType.JOINED)
@Audited
@NamedQueries(value = { @NamedQuery( name = "findVisitBySourceValue", query = "select id from VisitOccurrence v where v.visitSourceValue like :source")})
public class VisitOccurrence extends BaseResourceEntity {
	
	public static final String RES_TYPE = "Encounter";

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="visit_seq_gen")
	@SequenceGenerator(name="visit_seq_gen", sequenceName="visit_occurrence_id_seq", allocationSize=1)
	@Column(name="visit_occurrence_id")
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="person_id", nullable=false)
	private PersonComplement person;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="visit_concept_id")
	private Concept visitConcept;
	
	@Column(name="visit_start_date", nullable=false)
	@NotNull
	private Date startDate;
	
	@Column(name="visit_start_time")
	private String startTime;
	
	@Column(name="visit_end_date", nullable=false)
	@NotNull
	private Date endDate;
	
	@Column(name="visit_end_time")
	private String endTime;
	
	@ManyToOne
	@JoinColumn(name="visit_type_concept_id")
	private Concept visitTypeConcept;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="provider_id")
	private Provider provider;
	
	@ManyToOne(cascade={CascadeType.ALL})
	@JoinColumn(name="care_site_id")
	private CareSite careSite; //FIXME field names should reflect fhir names, for validation purposes.
	
	@Column(name="visit_source_value")
	private String visitSourceValue;
	
	@ManyToOne
	@JoinColumn(name="visit_source_concept_id")
	private Concept visitSourceConcept;

	public VisitOccurrence() {
		super();
		this.visitConcept = new Concept();
		this.visitConcept.setId(0L);
	}
	
	public VisitOccurrence(Long id, PersonComplement person, Concept visitConcept, Date startDate, 
			String startTime, Date endDate, String endTime, Concept visitTypeConcept, 
			Provider provider, CareSite careSite, String visitSourceValue, Concept visitSourceConcept) {
		super();
		
		this.id = id;
		this.person = person;
		this.visitConcept = visitConcept;
		this.startDate = startDate;
		this.startTime = startTime;
		this.endDate = endDate;
		this.endTime = endTime;
		this.visitTypeConcept = visitTypeConcept;
		this.provider = provider;
		this.careSite = careSite;
		this.visitSourceValue = visitSourceValue;
		this.visitSourceConcept = visitSourceConcept;
	}
	
	public PersonComplement getPerson() {
		return person;
	}
	
	public void setPerson(PersonComplement person) {
		this.person = person;
	}
	
	public Concept getVisitConcept() {
		return visitConcept;
	}
	
	public void setVisitConcept(Concept visitConcept) {
		this.visitConcept = visitConcept;
	}
	
	public Date getStartDate() {
		return startDate;
	}
	
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public Date getEndDate() {
		return endDate;
	}
	
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public Concept getVisitTypeConcept() {
		return visitTypeConcept;
	}
	
	public void setVisitTypeConcept(Concept visitTypeConcept) {
		this.visitTypeConcept = visitTypeConcept;
	}
	
	public Provider getProvider() {
		return provider;
	}
	
	public void setProvider(Provider provider) {
		this.provider = provider;
	}
	
	public CareSite getCareSite() {
		return careSite;
	}
	
	public void setCareSite(CareSite careSite) {
		this.careSite = careSite;
	}
	
	public String getVisitSourceValue() {
		return visitSourceValue;
	}
	
	public void setVisitSourceValue(String visitSourceValue) {
		this.visitSourceValue = visitSourceValue;
	}
	
	public Concept getVisitSourceConcept() {
		return visitSourceConcept;
	}
	
	public void setVisitSourceConcept(Concept visitSourceConcept) {
		this.visitSourceConcept = visitSourceConcept;
	}
	
	@Override
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String getResourceType() {
		return RES_TYPE;
	}

	@Override
	public FhirVersionEnum getFhirVersion() {
		return FhirVersionEnum.DSTU2;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		Encounter encounter = (Encounter) resource;
		
		ResourceReferenceDt patientReference = (ResourceReferenceDt) encounter.getPatient();
		if (patientReference == null) return null; // We have to have a patient

		PersonComplement person = PersonComplement.searchAndUpdate(patientReference);
		if (person == null) return null; // We must have a patient

		this.setPerson(person);
		
		// We are writing to the database. Keep the source so we know where it is coming from
		if (encounter.getId() != null) {
			// See if we already have this in the source field. If so,
			// then we want update not create
			VisitOccurrence origVisit = (VisitOccurrence) OmopConceptMapping.getInstance().loadEntityBySource(VisitOccurrence.class, "VisitOccurrence", "visitSourceValue", encounter.getId().getIdPart());
			if (origVisit == null)
				this.setVisitSourceValue(encounter.getId().getIdPart());
			else
				this.setId(origVisit.getId());
		}

//		this.id = encounter.getId().getIdPartAsLong();
		
//		Long patientRef = patientReference.getReference().getIdPartAsLong();
//		if(patientRef != null){
//			// We have person reference. We have to make sure if this patient exists.
//			PersonComplement patientClass = (PersonComplement) OmopConceptMapping.getInstance().loadEntityById(PersonComplement.class, patientRef);
//			if (patientClass != null) {
//				this.setPerson(patientClass);
//			} else {
//				// Before we need to create one, let's see if we have received this before.
//				patientClass = (PersonComplement) OmopConceptMapping.getInstance().loadEntityBySource(PersonComplement.class, "PersonComplement", "personSourceValue", patientRef.toString());
//				if (patientClass == null) {
//					this.person = new PersonComplement();
//					this.person.setPersonSourceValue(patientRef.toString());
//					if (patientReference.getDisplay() != null)
//						this.person.setNameFromString(patientReference.getDisplay().getValueAsString());
//				} else {
//					this.setPerson(patientClass);
//				}
//			}
//		}
		
		/* Set Period */
		SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
		PeriodDt tempPeriod = encounter.getPeriod();
		if (tempPeriod != null) {
			Date tempDate = tempPeriod.getStart();
			if (tempDate != null) { 
				this.startDate = tempDate;
				this.startTime = fmt.format(this.startDate);
			} else {
				this.startDate = new Date(0);
			}
			
			tempDate = tempPeriod.getEnd();
			if (tempDate != null) {
				this.endDate = tempDate; 
				this.endTime = fmt.format(this.endDate);
			} else {
				this.endDate = new Date(0);
			}
		}
		
		/* Set Class 
		 * - IP: Inpatient Visit
		 * - OP: Outpient Visit
		 * - ER: Emergency Room Visit
		 * - LTCP: Long Term Care Visit
		 * - */
		String classElement = encounter.getClassElement();
		String classType2Use = null;
		if (classElement != null && !classElement.isEmpty()) {
			String classLowerString = classElement.toLowerCase();
			if (classLowerString.contains("inpatient")) {
				classType2Use = "ip";
			} else if (classLowerString.contains("outpatient")) {
				classType2Use = "op";
			} else if (classLowerString.contains("emergency")) {
				classType2Use = "er";
			}
		}
		
		if (classType2Use != null && !classType2Use.isEmpty()) {
			Long id = OmopConceptMapping.getInstance().get(classType2Use.toLowerCase(), OmopConceptMapping.VISIT);
			Concept visitConcept = new Concept ();
			visitConcept.setId(id);
			this.setVisitConcept(visitConcept);
		}
		
		/* Set Visit Type - we hardcode this */
		Concept visitTypeConcept = new Concept();
		visitTypeConcept.setId(44818518L); // This is Visit derived from EHR
		this.setVisitTypeConcept(visitTypeConcept);
		
		/* Set care site */
		Participant participant = encounter.getParticipantFirstRep();
		if (participant != null){
			ResourceReferenceDt individualRef = participant.getIndividual();
			if (individualRef != null) {
				this.setProvider(Provider.searchAndUpdate(individualRef));
				
//				Long provider_id = individualRef.getReference().getIdPartAsLong();
//				if (provider_id != null) {
//					Provider provider = (Provider) OmopConceptMapping.getInstance().loadEntityById(Provider.class, provider_id);
//					if (provider != null) {
//						this.setProvider(provider);
//					} else {
//						// See if we have received this earlier.
//						provider = (Provider) OmopConceptMapping.getInstance().loadEntityBySource(Provider.class, "Provider", "providerSourceValue", provider_id.toString());
//						if (provider == null) {
//							this.provider = new Provider();
//							this.provider.setProviderName(individualRef.getDisplay().getValueAsString());
//							this.provider.setProviderSourceValue(provider_id.toString());
//						} else {
//							this.setProvider(provider);
//						}
//					}
//				} 
			}			
		}
		ResourceReferenceDt careSiteResourceRef = encounter.getServiceProvider();
		if (careSiteResourceRef != null) {
			Long careSiteRef = careSiteResourceRef.getReference().getIdPartAsLong();
			if (careSiteRef != null && careSiteRef > 0L) {
				this.setCareSite(CareSite.searchAndUpdate(careSiteResourceRef));
			}
		}
		
// TODO: How do we handle Location Resource. This is different from Location table in OMOP v5.
//		List<ca.uhn.fhir.model.dstu2.resource.Encounter.Location> locations = encounter.getLocation();
//		if (locations.size() > 0) {
//			ca.uhn.fhir.model.dstu2.resource.Encounter.Location location = locations.get(0);
//			ResourceReferenceDt locationResourceRef = location.getLocation();
//			if (locationResourceRef != null) {
//				Location locationResource = (Location) locationResourceRef.getResource();
//				AddressDt address = locationResource.getAddress();
//				if (address != null) {
//					edu.gatech.i3l.fhir.dstu2.entities.Location myLocation = edu.gatech.i3l.fhir.dstu2.entities.Location.searchAndUpdate(address, null);
//					this.set
//				}
//			}
//		}
		
		return this;
	}
	
	@Override
	public Encounter getRelatedResource() {
		Encounter encounter = new Encounter();
		
		encounter.setId(this.getIdDt());
		
		if (this.visitConcept != null) {
			String visitString = this.visitConcept.getName().toLowerCase();
			if (visitString.contains("inpatient")) {
				encounter.setClassElement(EncounterClassEnum.INPATIENT);			
			} else if (visitString.toLowerCase().contains("outpatient")) {
				encounter.setClassElement(EncounterClassEnum.OUTPATIENT);			
			} else if (visitString.toLowerCase().contains("ambulatory")
					|| visitString.toLowerCase().contains("office")) {
				encounter.setClassElement(EncounterClassEnum.AMBULATORY);			
			} else if (visitString.toLowerCase().contains("home")) {
				encounter.setClassElement(EncounterClassEnum.HOME);			
			} else if (visitString.toLowerCase().contains("emergency")) {
				encounter.setClassElement(EncounterClassEnum.EMERGENCY);			
			} else if (visitString.toLowerCase().contains("field")) {
				encounter.setClassElement(EncounterClassEnum.FIELD);			
			} else if (visitString.toLowerCase().contains("daytime")) {
				encounter.setClassElement(EncounterClassEnum.DAYTIME);			
			} else if (visitString.toLowerCase().contains("virtual")) {
				encounter.setClassElement(EncounterClassEnum.VIRTUAL);			
			} else {
				encounter.setClassElement(EncounterClassEnum.OTHER);
			}
		} else {
			encounter.setClassElement(EncounterClassEnum.OTHER);			
		}
		
		encounter.setStatus(EncounterStateEnum.FINISHED);
		
		// set Patient Reference
		ResourceReferenceDt patientReference = new ResourceReferenceDt(new IdDt(Person.RES_TYPE, person.getId()));
		patientReference.setDisplay(person.getNameAsSingleString());
		encounter.setPatient(patientReference);
		
		// set Period
		PeriodDt visitPeriod = new PeriodDt();
//		visitPeriod.setStartWithSecondsPrecision(startDate);
//		visitPeriod.setEndWithSecondsPrecision(endDate);
		DateFormat dateOnlyFormat = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
		try {
			// For start Date
			String timeString = "00:00:00";
			if (startTime != null && !startTime.isEmpty()) {
				timeString = startTime;
			}
			String dateTimeString = dateOnlyFormat.format(startDate)+" "+timeString;
			Date DateTime = dateFormat.parse(dateTimeString);
			visitPeriod.setStartWithSecondsPrecision(DateTime);

			// For end Date
			timeString = "00:00:00";
			if (endTime != null && !endTime.isEmpty()) {
				timeString = endTime;
			}
			dateTimeString = dateOnlyFormat.format(endDate)+" "+timeString;
			DateTime = dateFormat.parse(dateTimeString);
			visitPeriod.setEndWithSecondsPrecision(DateTime);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		encounter.setPeriod(visitPeriod);
		
		// we get some information from care site.
//		CareSite careSite = getCareSite();
//		System.out.println("CareSite ID="+careSite.getId());
		if (careSite != null) {
			// set Location
//			encounter.getLocationFirstRep().getLocation().setReference(new IdDt(CareSite.RES_TYPE, careSite.getId()));
			
			// set serviceProvider
//			Provider prov = this.getProvider();
//			if (provider != null) {
			ResourceReferenceDt serviceProviderReference = new ResourceReferenceDt(new IdDt(CareSite.RES_TYPE, careSite.getId()));
			serviceProviderReference.setDisplay(careSite.getCareSiteName());
			encounter.setServiceProvider(serviceProviderReference);
//			}
		}
		
		if (provider != null) {
			Encounter.Participant participant = new Encounter.Participant();
			ResourceReferenceDt individualReference = new ResourceReferenceDt(provider.getIdDt());
			individualReference.setDisplay(provider.getProviderName());
			participant.setIndividual(individualReference);
			
			List<Encounter.Participant> listParticipant = new ArrayList<Encounter.Participant>();
			listParticipant.add(participant);
			encounter.setParticipant(listParticipant);
		}
		
		return encounter;
	}
	
	public static VisitOccurrence searchAndUpdate(Long encounterRef, Date startDate, Date endDate, PersonComplement person) {
		if (encounterRef == null) return null;
		
		// See if this exists.
		VisitOccurrence visitOccurrence = 
				(VisitOccurrence) OmopConceptMapping.getInstance().loadEntityById(VisitOccurrence.class, encounterRef);
		if (visitOccurrence != null) {
			return visitOccurrence;
		} else {
			// Check source column to see if we have received this before.
			visitOccurrence = (VisitOccurrence) OmopConceptMapping.getInstance()
					.loadEntityBySource(VisitOccurrence.class, "VisitOccurrence", "visitSourceValue", encounterRef.toString());
			if (visitOccurrence != null) {
				return visitOccurrence;
			} else {
				visitOccurrence = new VisitOccurrence();
				visitOccurrence.setVisitSourceValue(encounterRef.toString());
				visitOccurrence.setStartDate(startDate);
				if (endDate == null) endDate = startDate;
				visitOccurrence.setEndDate(endDate);
				visitOccurrence.setPerson(person);
				
				return visitOccurrence;
			}
		}
	}


	@Override
	public String translateSearchParam(String param) {
		switch (param) {
		case SP_PATIENT:
			return "person";
		case SP_DATE:
			return "startDate";
		default:
			break;
		}
		return param;
	}

}