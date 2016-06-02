package edu.gatech.i3l.fhir.dstu2.entities;

public class ConceptSynonym {

	private Long id;
	private Concept concept;
	private String name;
	
	public ConceptSynonym() {
		super();
	}
	
	public ConceptSynonym(Long id, Concept concept, String name) {
		super();
		this.id = id;
		this.concept = concept;
		this.name = name;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Concept getConcept() {
		return concept;
	}
	
	public void setConcept(Concept concept) {
		this.concept = concept;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
