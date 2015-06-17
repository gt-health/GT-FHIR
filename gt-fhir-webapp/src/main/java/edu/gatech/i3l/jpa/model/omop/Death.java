package edu.gatech.i3l.jpa.model.omop;


public class Death {

	private Long id;
	private Person person;
	private Concept deathType;
	private Concept causeOfDeath;
	private String causeOfDeathSourceValue;

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
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
