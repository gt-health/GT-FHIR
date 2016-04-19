/**
 * 
 */
package edu.gatech.i3l.fhir.dstu2.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.envers.Audited;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.primitive.IdDt;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

/**
 * @author Myung Choi
 *
 */
@Entity
@Table(name="f_visit_occurrence")
@PrimaryKeyJoinColumn(name="visit_occurrence_id")
@Audited
public class VisitOccurrenceComplement extends VisitOccurrence {
	
	@ManyToOne(fetch=FetchType.LAZY, cascade={CascadeType.MERGE})
	@JoinColumn(name="episode_of_care_id")
	private EpisodeOfCare episodeOfCare;
	
	@Column(name="status", nullable=false)
	@NotNull
	private String status;
	
	@Column(name="note")
	@Lob
	private String note;
	
	public VisitOccurrenceComplement() {
		super();
	}
	
	public VisitOccurrenceComplement(Long id, Person person, Date startDate, Date endDate,
			Concept placeOfServiceConcept, CareSite careSite, String placeOfServiceSourceValue,
			EpisodeOfCare episodeOfCare, String status, String note) {
		super(id, person, startDate, endDate, placeOfServiceConcept, careSite, placeOfServiceSourceValue);
		
		this.episodeOfCare = episodeOfCare;
		this.status = status;
		this.note = note;
		
	}
	
	public EpisodeOfCare getEpisodeOfCare() {
		return episodeOfCare;
	}
	
	public void setEpisodeOfCare(EpisodeOfCare episodeOfCare) {
		this.episodeOfCare = episodeOfCare;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getNote() {
		return note;
	}
	
	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public Encounter getRelatedResource() {
		Encounter encounter = super.getRelatedResource();

		// set status
		EncounterStateEnum[] states = EncounterStateEnum.values();
		for (int i = 0; i < states.length; i++) {
			if (status.equalsIgnoreCase(states[i].getCode())){
				encounter.setStatus(states[i]);
				break;
			}
		}
		// set episode of care.
		EpisodeOfCare episodeOfCare = getEpisodeOfCare();
		if (episodeOfCare != null) {
			ResourceReferenceDt episodeReference = new ResourceReferenceDt(new IdDt(EpisodeOfCare.RES_TYPE, episodeOfCare.getId()));
			List<ResourceReferenceDt> episodeReferences = new ArrayList<ResourceReferenceDt>();
			episodeReferences.add(episodeReference);
			encounter.setEpisodeOfCare(episodeReferences);
		}
		

		// set Reason
		// TODO: note or linked condition may have this information.
		
		return encounter;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		super.constructEntityFromResource(resource);
		Encounter encounter = (Encounter) resource;
		String status = encounter.getStatus().toString();
		if(status != null){
			EncounterStateEnum[] values = EncounterStateEnum.values();
			for (int i = 0; i < values.length; i++) {
				if((status.toLowerCase()).equals((values[i].getCode().toLowerCase()))){
					this.setStatus((values[i].getCode().toLowerCase()));
					break;
				}
			}
		}
		return this;
	}
	
}