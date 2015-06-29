///**
// * 
// */
//package edu.gatech.i3l.jpa.model.omop.ext;
//
//import java.util.Date;
//
//import ca.uhn.fhir.model.dstu2.resource.Encounter;
//import edu.gatech.i3l.jpa.model.omop.CareSite;
//import edu.gatech.i3l.jpa.model.omop.Concept;
//import edu.gatech.i3l.jpa.model.omop.EpisodeOfCare;
//import edu.gatech.i3l.jpa.model.omop.Person;
//import edu.gatech.i3l.jpa.model.omop.VisitOccurrence;
//
///**
// * @author MC142
// *
// */
//public class VisitOccurrenceFhirExtTable extends VisitOccurrence {
//	private EpisodeOfCare episodeOfCare;
//	private String note;
//	
//	public VisitOccurrenceFhirExtTable() {
//		super();
//	}
//	
//	public VisitOccurrenceFhirExtTable(Long id, Person person, Date startDate, Date endDate,
//			Concept placeOfServiceConcept, CareSite careSite, String placeOfServiceSourceValue,
//			EpisodeOfCare episodeOfCare, String note) {
//		super(id, person, startDate, endDate, placeOfServiceConcept, careSite, placeOfServiceSourceValue);
//		
//		this.episodeOfCare = episodeOfCare;
//		this.note = note;
//		
//	}
//	
//	public EpisodeOfCare getEpisodeOfCare() {
//		return episodeOfCare;
//	}
//	
//	public void setEpisodeOfCare(EpisodeOfCare episodeOfCare) {
//		this.episodeOfCare = episodeOfCare;
//	}
//	
//	public String getNote() {
//		return note;
//	}
//	
//	public void setNote(String note) {
//		this.note = note;
//	}
//	
//	@SuppressWarnings("unchecked")
//	@Override
//	public Encounter getRelatedResource() {
//		Encounter encounter = super.getRelatedResource();
//		
//		// set parameters
//		
//		return encounter;
//	}
//}
