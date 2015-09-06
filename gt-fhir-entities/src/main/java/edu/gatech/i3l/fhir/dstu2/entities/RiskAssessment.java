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
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;


@Entity
@Table(name="risk_assessment")
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
	
	@Column(name="score")
	private BigDecimal score;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="condition_concept_id", nullable=false)
	@NotNull
	private Concept condition;
	
	@Column(name="runtime")
	private BigDecimal runtime;
	
	@Column(name="fc_runtime")
	private BigDecimal fc_runtime;
	
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="method")
	@NotNull
	private Concept method;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="outcome")
	@NotNull
	private Concept outcome;
	
	@Column(name="datasource")
	private String datasource;
	
	@Column(name="group_id")
	private String group_id;
	
	/*@Column(name="risk_assessment_date", nullable=false)
	@Temporal(TemporalType.DATE)
	@NotNull
	private Date date;*/
	
	@Column(name="risk_assessment_date")
	private Date date;
	
	
	
	public RiskAssessment() {
		super();
	}
	
	public RiskAssessment(Long id, Person person, Date date, Concept condition,
			BigDecimal score, BigDecimal runtime, BigDecimal fc_runtime,
			Concept method, Concept outcome, String datasource, String group_id){
		super();
		this.id = id;
		this.person = person;
		this.condition = condition;
		this.date = date;
		//this.time = time;
		this.score = score;
		this.runtime = runtime;
		this.fc_runtime = fc_runtime;
		this.method = method;
		this.outcome = outcome;
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
	
	/*public Date getDate(){
		return date;
	}
	
	public void setDate(Date date){
		this.date = date;
	}*/
	
	public Date getDateTime(){
		return date;
	}
	
	public void setDateTime(Date time){
		this.date = date;
	}
	
	public Person getPerson(){
		return person;
	}
	
	public void setPerson(Person person){
		this.person = person;
	}
	
	public Concept getCondition(){
		return condition;
	}
	
	public void setCondition(){
		this.condition = condition;
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
	
	public Concept getMethod(){
		return method;
	}
	
	public void setMethod(Concept method){
		this.method = method;
	}
	
	public Concept getOutcome(){
		return outcome;
	}
	
	public void setOutcome(Concept outcome){
		this.outcome = outcome;
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
		ca.uhn.fhir.model.dstu2.resource.RiskAssessment riskAssessment = new ca.uhn.fhir.model.dstu2.resource.RiskAssessment();
		//ID
		riskAssessment.setId(this.getIdDt());
		
		//Subject/Patient
		riskAssessment.setSubject(new ResourceReferenceDt(new IdDt(Person.RESOURCE_TYPE, this.person.getId())));
		
		//Condition -- ???I think this needs to be fixed. Showing up as Condition/<concept_id> and not Condition/<condition_occur_id>
		/*String theSystem = condition.getVocabulary().getSystemUri();
		String theCode = condition.getConceptCode();

		CodeableConceptDt conditionCodeConcept = new CodeableConceptDt();
		if (theSystem != "") {
			// Create coding here. We have one coding in this condition as OMOP
			// allows one coding concept per condition.
			// In the future, if we want to allow multiple coding concepts here,
			// we need to do it here.
			CodingDt coding = new CodingDt(theSystem, theCode);
			coding.setDisplay(condition.getName());
			conditionCodeConcept.addCoding(coding);
		}

		// FHIR does not require the coding. If our System URI is not mappable
		// from
		// OMOP database, then coding would be empty. Set Text here. Even text
		// is not
		// required in FHIR. But, then no reason to have this condition, I
		// think...
		String theText = condition.getName() + ", " + condition.getVocabulary().getName() + ", "
				+ condition.getConceptCode();

		conditionCodeConcept.setText(theText);
	 */
	
		/* Need to fix this */
		riskAssessment.setCondition(new ResourceReferenceDt(new IdDt(ConditionOccurrence.RESOURCE_TYPE, this.condition.getId())));
		
		
		//Method (algorithm)
		String theSystem = method.getVocabulary().getSystemUri();
		String theCode = method.getConceptCode();

		CodeableConceptDt methodCodeConcept = new CodeableConceptDt();
		if (theSystem != "") {
			// Create coding here. We have one coding in this condition as OMOP
			// allows one coding concept per condition.
			// In the future, if we want to allow multiple coding concepts here,
			// we need to do it here.
			CodingDt coding = new CodingDt(theSystem, theCode);
			coding.setDisplay(method.getName());
			methodCodeConcept.addCoding(coding);
		}

		// FHIR does not require the coding. If our System URI is not mappable
		// from
		// OMOP database, then coding would be empty. Set Text here. Even text
		// is not
		// required in FHIR. But, then no reason to have this condition, I
		// think...
		String theText = method.getName() + ", " + method.getVocabulary().getName() + ", "
				+ method.getConceptCode();

		methodCodeConcept.setText(theText);
		riskAssessment.setMethod(methodCodeConcept);
		
		//Score
		DecimalDt score_dec = new DecimalDt();
		score_dec.setValue(score);
		riskAssessment.addPrediction();
		riskAssessment.getPrediction().get(0).setProbability(score_dec);
		riskAssessment.getPrediction().get(0).setRationale("runtime = "+runtime.toString() + " ," + "feature construction runtime = "+fc_runtime);

		
		//Outcome
		theSystem = outcome.getVocabulary().getSystemUri();
		theCode = outcome.getConceptCode();

		CodeableConceptDt outcomeCodeConcept = new CodeableConceptDt();
		if (theSystem != "") {
			// Create coding here. We have one coding in this condition as OMOP
			// allows one coding concept per condition.
			// In the future, if we want to allow multiple coding concepts here,
			// we need to do it here.
			CodingDt coding = new CodingDt(theSystem, theCode);
			coding.setDisplay(outcome.getName());
			outcomeCodeConcept.addCoding(coding);
		}

		// FHIR does not require the coding. If our System URI is not mappable
		// from
		// OMOP database, then coding would be empty. Set Text here. Even text
		// is not
		// required in FHIR. But, then no reason to have this condition, I
		// think...
		theText = outcome.getName() + ", " + outcome.getVocabulary().getName() + ", "
				+ outcome.getConceptCode();

		outcomeCodeConcept.setText(theText);
		riskAssessment.getPrediction().get(0).setOutcome(outcomeCodeConcept);
		
		//Date
		//DateTimeDt periodStart = new DateTimeDt(this.date);
		//riskAssessment.setDate(periodStart);

		PeriodDt assessmentPeriod = new PeriodDt();
		assessmentPeriod.setStartWithSecondsPrecision(date);
		assessmentPeriod.setEndWithSecondsPrecision(date);
		
		riskAssessment.getPrediction().get(0).setWhen(assessmentPeriod);

		
		return riskAssessment;
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