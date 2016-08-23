package edu.gatech.i3l.fhir.dstu2.entities;

import java.sql.Date;


public class Death {

//	private Long person;
	private Person person;
	private Date deathDate;
	private Concept deathType;
	private Concept causeOfDeath;
	private String causeSourceValue;
	private Concept causeSourceConcept;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	public Date getDeathDate() {
		return deathDate;
	}
	
	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

	public Concept getDeathType() {
		return deathType;
	}

	public void setDeathType(Concept deathType) {
		this.deathType = deathType;
	}

	public Concept getCauseOfDeath() {
		return causeOfDeath;
	}

	public void setCauseOfDeath(Concept causeOfDeath) {
		this.causeOfDeath = causeOfDeath;
	}

	public String getCauseSourceValue() {
		return causeSourceValue;
	}

	public void setCauseSourceValue(String causeSourceValue) {
		this.causeSourceValue = causeSourceValue;
	}
	
	public Concept getCauseSourceConcept() {
		return causeSourceConcept;
	}
	
	public void setCauseSourceConcept(Concept causeSourceConcept) {
		this.causeSourceConcept = causeSourceConcept;
	}

}
