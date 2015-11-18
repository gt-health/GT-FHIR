package edu.gatech.i3l.fhir.dstu2.entities;

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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.primitive.IdDt;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;

@Entity
@Table(name="risk_assessment_prediction")
@PrimaryKeyJoinColumn(name="risk_assessment_id")
public class RiskAssessmentPrediction extends RiskAssessment{
	
	/*@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="risk_assessment_prediction_id")
	@Access(AccessType.PROPERTY)
	private Long prediction_id;
	*/
	@Column(name="score")
	private BigDecimal score;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="outcome")
	private Concept outcome;
	
	@Column(name="rationale")
	private String rationale;
	
	@Column(name="risk_assessment_prediction_date")
	private Date prediction_date;
	
	public RiskAssessmentPrediction() {
		super();
	}
	
	public RiskAssessmentPrediction(BigDecimal score, Concept outcome, 
			String rationale, Date prediction_date){
		super();
	
		
		this.score = score;
		this.outcome = outcome;
		this.rationale = rationale;
		this.prediction_date = prediction_date;
		
	}
	
	public BigDecimal getScore(){
		return score;
	}
	
	public void setScore(BigDecimal score){
		this.score = score;
	}
	
	public Concept getOutcome(){
		return outcome;
	}
	
	public void setOutcome(Concept outcome){
		this.outcome = outcome;
	}
	
	public String getRationale(){
		return rationale;
	}
	
	public void setRationale(String rationale){
		this.rationale = rationale;
	}
	
	public Date getPredictionDateTime(){
		return prediction_date;
	}
	
	public void setPredictionDateTime(Date prediction_date){
		this.prediction_date = prediction_date;
	}
	
	@Override
	public IResource getRelatedResource() {
		ca.uhn.fhir.model.dstu2.resource.RiskAssessment riskAssessment = (ca.uhn.fhir.model.dstu2.resource.RiskAssessment) super.getRelatedResource();
		
		//Score - required
		DecimalDt score_dec = new DecimalDt();
		score_dec.setValue(score);
		riskAssessment.addPrediction();
		riskAssessment.getPrediction().get(0).setProbability(score_dec);
		
		//Outcome
	
		String theSystem = outcome.getVocabulary().getSystemUri();
		String theCode = outcome.getConceptCode();

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
		String theText = outcome.getName() + ", " + outcome.getVocabulary().getName() + ", "
				+ outcome.getConceptCode();

		outcomeCodeConcept.setText(theText);
		riskAssessment.getPrediction().get(0).setOutcome(outcomeCodeConcept);
		


		if (this.prediction_date != null){
			PeriodDt assessmentPeriod = new PeriodDt();
		
			assessmentPeriod.setStartWithSecondsPrecision(prediction_date);
			assessmentPeriod.setEndWithSecondsPrecision(prediction_date);
		
			riskAssessment.getPrediction().get(0).setWhen(assessmentPeriod);
		}
		
		return riskAssessment;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		super.constructEntityFromResource(resource);
		//System.out.println("In construct");
		
		ca.uhn.fhir.model.dstu2.resource.RiskAssessment riskAssessment = (ca.uhn.fhir.model.dstu2.resource.RiskAssessment) resource;
		OmopConceptMapping ocm = OmopConceptMapping.getInstance();
		
		if((!riskAssessment.getSubject().isEmpty()) && (!riskAssessment.getPrediction().isEmpty())){
				
			Long outcomeAsConceptId = ocm.get(riskAssessment.getPrediction().get(0).getOutcome().getCodingFirstRep().getCode());
			System.out.println(outcomeAsConceptId);
				
			this.outcome = new Concept();
			this.outcome.setId(outcomeAsConceptId);
				
			riskAssessment.addPrediction();
				
			DecimalDt dec = new DecimalDt();
			dec = (DecimalDt) riskAssessment.getPrediction().get(0).getProbability();
			this.score = dec.getValue();
		
			if (riskAssessment.getPrediction().get(0).getWhen()!= null){
				PeriodDt periodDt = (PeriodDt) riskAssessment.getPrediction().get(0).getWhen();
				this.prediction_date  = periodDt.getStart();
				//this.prediction_date = periodDt.getStart();
			}
			
		}

		//System.out.println(this.person.getIdDt().getValue());
		return this;
	}

}