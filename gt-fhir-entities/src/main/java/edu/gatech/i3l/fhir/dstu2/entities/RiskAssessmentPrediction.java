package edu.gatech.i3l.fhir.dstu2.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;



@Entity
@Table(name="risk_assessment_prediction")
//@PrimaryKeyJoinColumn(name="risk_assessment_id")
public final class RiskAssessmentPrediction {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="risk_assessment_prediction_id")
	@Access(AccessType.PROPERTY)
	private Long predictionId;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade={CascadeType.ALL})
	@JoinColumn(name="risk_assessment_id")
	@NotNull
	private RiskAssessment risk_assessment_id;
	
	@Column(name="score")
	@NotNull
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
	
	public RiskAssessmentPrediction(Long predictionId, RiskAssessment risk_assessment_id, BigDecimal score, Concept outcome, 
			String rationale, Date prediction_date){
		super();
	
		this.predictionId = predictionId;
		this.risk_assessment_id = risk_assessment_id;
		this.score = score;
		this.outcome = outcome;
		this.rationale = rationale;
		this.prediction_date = prediction_date;
		
	}
	
	
	public Long getPredictionId() {
		return predictionId;
	}
	
	public void setPredictionId(Long predictionId){
		this.predictionId = predictionId;
	}
	
	public RiskAssessment getRiskAssessmentId(){
		return risk_assessment_id;
	}
	
	public void setRiskAssessmentId(RiskAssessment risk_assessment_id){
		this.risk_assessment_id = risk_assessment_id;
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




}