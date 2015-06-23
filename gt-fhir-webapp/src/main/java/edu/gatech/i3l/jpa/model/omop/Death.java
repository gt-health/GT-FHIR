package edu.gatech.i3l.jpa.model.omop;

import java.sql.Date;


public class Death {

	private Long person;
//	private Person person;
	private Date deathDate;
	private Concept deathType;
	private Concept causeOfDeath;
	private String causeOfDeathSourceValue;

	public Long getPerson() {
		return person;
	}

	public void setPerson(Long person) {
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

	public String getCauseOfDeathSourceValue() {
		return causeOfDeathSourceValue;
	}

	public void setCauseOfDeathSourceValue(String causeOfDeathSourceValue) {
		this.causeOfDeathSourceValue = causeOfDeathSourceValue;
	}

}
