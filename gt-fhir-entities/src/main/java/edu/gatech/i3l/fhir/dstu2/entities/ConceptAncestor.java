package edu.gatech.i3l.fhir.dstu2.entities;

public class ConceptAncestor {

	private Concept ancestor;
	private Concept descendant;
	private Integer minLevelsOfSeparation;
	private Integer maxLevelsOfSeparation;

	public ConceptAncestor() {
		super();
	}

	public ConceptAncestor(Concept ancestor, Concept descendant,
			Integer minLevelsOfSeparation, Integer maxLevelsOfSeparation) {
		super();
		this.ancestor = ancestor;
		this.descendant = descendant;
		this.minLevelsOfSeparation = minLevelsOfSeparation;
		this.maxLevelsOfSeparation = maxLevelsOfSeparation;
	}

	public Concept getAncestor() {
		return ancestor;
	}

	public void setAncestor(Concept ancestor) {
		this.ancestor = ancestor;
	}

	public Concept getDescendant() {
		return descendant;
	}

	public void setDescendant(Concept descendant) {
		this.descendant = descendant;
	}

	public Integer getMinLevelsOfSeparation() {
		return minLevelsOfSeparation;
	}

	public void setMinLevelsOfSeparation(Integer minLevelsOfSeparation) {
		this.minLevelsOfSeparation = minLevelsOfSeparation;
	}

	public Integer getMaxLevelsOfSeparation() {
		return maxLevelsOfSeparation;
	}

	public void setMaxLevelsOfSeparation(Integer maxLevelsOfSeparation) {
		this.maxLevelsOfSeparation = maxLevelsOfSeparation;
	}

}
