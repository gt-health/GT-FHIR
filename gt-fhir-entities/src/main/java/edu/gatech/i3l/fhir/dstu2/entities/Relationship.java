package edu.gatech.i3l.fhir.dstu2.entities;

public class Relationship {

	private String id;
	private String name;

	/* 
	 * The following attributes could be Boolean types, but they are Characters
	 * to remain in conformance to Omop definition.
	 */
	/**
	 * Defines whether a relationship defines concepts into classes or
	 * hierarchies. Values are Y for hierarchical relationship or NULL if not.
	 */
	private Character isHierarchical;
	/**
	 * Defines whether a hierarchical relationship contributes to the
	 * concept_ancestor table. These are subsets of the hierarchical
	 * relationships. Valid values are Y or NULL.
	 */
	private Character definesAncestry;
	
	private String reverseRelationshipId;
	private Concept relationshipConcept;

	public Relationship() {
		super();
	}

	public Relationship(String id, String name, Character isHierarchical,
			Character definesAncestry, String reverseRelationshipId, Concept relationshipConcept) {
		super();
		this.id = id;
		this.name = name;
		this.isHierarchical = isHierarchical;
		this.definesAncestry = definesAncestry;
		this.reverseRelationshipId = reverseRelationshipId;
		this.relationshipConcept = relationshipConcept;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Character getIsHierarchical() {
		return isHierarchical;
	}

	public void setIsHierarchical(Character isHierarchical) {
		this.isHierarchical = isHierarchical;
	}

	public Character getDefinesAncestry() {
		return definesAncestry;
	}

	public void setDefinesAncestry(Character definesAncestry) {
		this.definesAncestry = definesAncestry;
	}

	public String getReverseRelationshipId() {
		return reverseRelationshipId;
	}
	
	public void setReverseRelationshipId(String reverseRelationshipId) {
		this.reverseRelationshipId = reverseRelationshipId;
	}
	
	public Concept getRelationshipConcept() {
		return relationshipConcept;
	}
	
	public void setRelationshipConcept(Concept relationshipConcept) {
		this.relationshipConcept = relationshipConcept;
	}
}
