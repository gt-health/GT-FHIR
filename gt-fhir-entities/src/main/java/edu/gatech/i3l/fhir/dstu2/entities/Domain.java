package edu.gatech.i3l.fhir.dstu2.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import edu.gatech.i3l.fhir.jpa.annotations.FhirAttributesProvided;

@Entity
@Table(name="domain")
@FhirAttributesProvided(attributes={"domainName"})
public class Domain {
	@Id
	@Column(name="domain_id")
	private String id;
	
	@Column(name="domain_name")
	private String domainName;
	
	@ManyToOne(cascade={CascadeType.MERGE}, fetch=FetchType.LAZY)
	@JoinColumn(name="domain_concept_id")
	private Concept domainConcept;
	
	public Domain() {
		super();
	}
	
	public Domain(String domainName, Concept domainConcept) {
		super();
		this.domainName = domainName;
		this.domainConcept = domainConcept;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDomainName() {
		return domainName;
	}
	
	public void setDomainName(String domainName) {
		this.domainName = domainName;
	}
	
	public Concept getDomainConcept() {
		return domainConcept;
	}
	
	public void setDomainConcept(Concept domainConcept) {
		this.domainConcept = domainConcept;
	}
}
