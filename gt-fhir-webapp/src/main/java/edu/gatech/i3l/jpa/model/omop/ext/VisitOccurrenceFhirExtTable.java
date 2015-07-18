/**
 * 
 */
package edu.gatech.i3l.jpa.model.omop.ext;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;
import edu.gatech.i3l.jpa.model.omop.CareSite;
import edu.gatech.i3l.jpa.model.omop.Concept;
import edu.gatech.i3l.jpa.model.omop.EpisodeOfCare;
import edu.gatech.i3l.jpa.model.omop.Person;
import edu.gatech.i3l.jpa.model.omop.VisitOccurrence;

/**
 * @author Myung Choi
 *
 */
@Entity
@Table(name="f_visit_occurrence")
@PrimaryKeyJoinColumn(name="visit_occurrence_id")
public class VisitOccurrenceFhirExtTable extends VisitOccurrence {
	
	@ManyToOne
	@JoinColumn(name="episode_of_care_id")
	private EpisodeOfCare episodeOfCare;
	
	@Column(name="status")
	private String status;
	
	@Column(name="note")
	private String note;
	
	public VisitOccurrenceFhirExtTable() {
		super();
	}
	
	public VisitOccurrenceFhirExtTable(Long id, Person person, Date startDate, Date endDate,
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
		if (status.equalsIgnoreCase("planned"))
			encounter.setStatus(EncounterStateEnum.PLANNED);
		else if (status.equalsIgnoreCase("arrived"))
			encounter.setStatus(EncounterStateEnum.ARRIVED);
		else if (status.equalsIgnoreCase("in-progress"))
			encounter.setStatus(EncounterStateEnum.IN_PROGRESS);
		else if (status.equalsIgnoreCase("onleave"))
			encounter.setStatus(EncounterStateEnum.ON_LEAVE);
		else if (status.equalsIgnoreCase("finished"))
			encounter.setStatus(EncounterStateEnum.FINISHED);
		else if (status.equalsIgnoreCase("cancelled"))
			encounter.setStatus(EncounterStateEnum.CANCELLED);
		
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
}