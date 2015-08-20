/**
 * 
 */
package edu.gatech.i3l.fhir.dstu2.entities;

import java.util.Date;

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

import ca.uhn.fhir.jpa.entity.IResourceEntity;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;

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
			if (status.equalsIgnoreCase(states[i].getCode()))
				encounter.setStatus(states[i]);
		}
		// set episode of care.
		EpisodeOfCare episodeOfCare = getEpisodeOfCare();
		if (episodeOfCare != null) {
			ResourceReferenceDt episodeReference = new ResourceReferenceDt(episodeOfCare.getIdDt());
			encounter.setEpisodeOfCare(episodeReference);
		}

		// set Reason
		// TODO: note or linked condition may have this information.
		
		return encounter;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		super.constructEntityFromResource(resource);
		this.setStatus(EncounterStateEnum.FINISHED.getCode());
		return this;
	}
	
}