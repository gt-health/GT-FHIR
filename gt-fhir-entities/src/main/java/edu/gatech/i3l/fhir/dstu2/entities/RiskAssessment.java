package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_PATIENT;
import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_SUBJECT;
import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_METHOD;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;


@Entity
@Table(name="observation")
public class RiskAssessment extends BaseResourceEntity{

	private static final String RES_TYPE = "RiskAssessment";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="risk_assessment_id")
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="person_id", nullable=false)
	@NotNull
	private Person person;
	
	@Column(name="risk_assessment_date", nullable=false)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date date;
	
	@Column(name="risk_assessment_time")
	private Date time;
	
	@Column(name="score")
	private BigDecimal score;
	
	@Column(name="runtime")
	private BigDecimal runtime;
	
	@Column(name="fc_runtime")
	private BigDecimal fc_runtime;
	
	@Column(name="method")
	private String method;
	
	@Column(name="datasource")
	private String datasource;
	
	@Column(name="group_id")
	private String group_id;
	
	
	public RiskAssessment() {
		super();
	}
	
	public RiskAssessment(Long id, Person person, Date date, Date time,
			BigDecimal score, BigDecimal runtime, BigDecimal fc_runtime,
			String method, String datasource, String group_id){
		super();
		this.id = id;
		this.person = person;
		this.date = date;
		this.time = time;
		this.score = score;
		this.runtime = runtime;
		this.fc_runtime = fc_runtime;
		this.method = method;
		this.datasource = datasource;
		this.group_id = group_id;
		
	}
	
	@Override
	public Long getId() {
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}
	
	public Date getTime(){
		return time;
	}
	
	public void setTime(Date time){
		this.time = time;
	}
	
	public Person getPerson(){
		return person;
	}
	
	public void setPerson(Person person){
		this.person = person;
	}
	
	public BigDecimal getScore(){
		return score;
	}
	
	public void setScore(BigDecimal score){
		this.score = score;
	}
	
	public BigDecimal getRuntime(){
		return runtime;
	}
	
	public void setRuntime(BigDecimal runtime){
		this.runtime = runtime;
	}
	
	public BigDecimal getFCRuntime(){
		return fc_runtime;
	}
	
	public void setFCRuntime(BigDecimal fc_runtime){
		this.fc_runtime = fc_runtime;
	}
	
	public String getMethod(){
		return method;
	}
	
	public void setMethod(String method){
		this.method = method;
	}
	
	public String getDatasource(){
		return datasource;
	}
	
	public void setDatasource(String datasource){
		this.datasource = datasource;
	}
	
	public String getGroupId(){
		return group_id;
	}
	
	public void setGroupId(String group_id){
		this.group_id = group_id;
	}

	@Override
	public FhirVersionEnum getFhirVersion() {
		return FhirVersionEnum.DSTU2;
	}

	@Override
	public String getResourceType() {
		return RES_TYPE;
	}

	@Override
	public InstantDt getUpdated() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String translateSearchParam(String theSearchParam) {
		switch (theSearchParam){
		case SP_PATIENT:
			return "person";
		case SP_SUBJECT:
			return "person";
		case SP_METHOD:
			return "method";
		default:
			break;
		}
		return theSearchParam;
	}

	@Override
	public IResource getRelatedResource() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		
		/*ca.uhn.fhir.model.dstu2.resource.RiskAssessment riskAssessment = (ca.uhn.fhir.model.dstu2.resource.RiskAssessment) resource;
		
		this.date = riskAssessment.getDateElement().getValue(); //getDate()?
		this.time = riskAssessment.getDateElement().getValue();//?
		
		// Set subject: currently supporting only type Person 
		// (Risk Assessment only supports Patient and Group for now)
		// TODO create entity-complement to specify other types of subjects 
		IdDt reference = riskAssessment.getSubject().getReference();
		if(reference.getIdPartAsLong() != null){
			if("Patient".equals(reference.getResourceType())){
				if(this.person ==null)
					this.person = new Person();
				this.person.setId(reference.getIdPartAsLong());
			} else if("Group".equals(reference.getResourceType())){
				//
			} 
		}
		*/
		
		
		// TODO Auto-generated method stub
		return null;
	}
	
}