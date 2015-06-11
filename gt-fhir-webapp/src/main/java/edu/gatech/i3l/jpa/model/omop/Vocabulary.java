package edu.gatech.i3l.jpa.model.omop;

public class Vocabulary {

	private Long id;
	private String name;

	public Vocabulary() {
		super();
	}

	public Vocabulary(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
