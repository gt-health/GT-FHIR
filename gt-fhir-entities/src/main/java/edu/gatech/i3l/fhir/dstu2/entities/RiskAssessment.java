package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_PATIENT;
import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_SUBJECT;
import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_METHOD;

import java.math.BigDecimal;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

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

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import ca.uhn.fhir.context.FhirVersionEnum;
import ca.uhn.fhir.model.api.IDatatype;
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
import edu.gatech.i3l.omop.enums.Omop4ConceptsFixedIds;
import edu.gatech.i3l.omop.mapping.OmopConceptMapping;


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
	private Concept condition;
	
	@Column(name="runtime")
	private BigDecimal runtime;
	
	@Column(name="fc_runtime")
	private BigDecimal fc_runtime;
	
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="method")
	private Concept method;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="outcome")
	@NotNull
	private Concept outcome;
	
	@Column(name="prediction_info")
	private String prediction_info;
	
	@Column(name="rationale")
	private String rationale;
	
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
			Concept method, Concept outcome, String prediction_info, String rationale){
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
		this.prediction_info = prediction_info;
		this.rationale = rationale;
		
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
	
	public String getPredictionInfo(){
		return prediction_info;
	}
	
	public void setPredictionInfo(String prediction_info){
		this.prediction_info = prediction_info;
	}
	
	public String getRationale(){
		return rationale;
	}
	
	public void setRationale(String rationale){
		this.rationale = rationale;
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
		if (this.condition != null){
			riskAssessment.setCondition(new ResourceReferenceDt(new IdDt(ConditionOccurrence.RESOURCE_TYPE, this.condition.getId())));
		}
		
		if (this.method != null){
		
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
		
		}
		
		//Score - required
		DecimalDt score_dec = new DecimalDt();
		score_dec.setValue(score);
		riskAssessment.addPrediction();
		riskAssessment.getPrediction().get(0).setProbability(score_dec);
		//this will be replaced with actual rationale
		if (this.runtime != null && this.fc_runtime != null){
			riskAssessment.getPrediction().get(0).setRationale("runtime = "+runtime.toString() + " ," + "feature construction runtime = "+fc_runtime);
		}
		
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
		


		if (this.date != null){
			PeriodDt assessmentPeriod = new PeriodDt();
		
			assessmentPeriod.setStartWithSecondsPrecision(date);
			assessmentPeriod.setEndWithSecondsPrecision(date);
		
			riskAssessment.getPrediction().get(0).setWhen(assessmentPeriod);
		}
		
		return riskAssessment;
	}

	@Override
	public IResourceEntity constructEntityFromResource(IResource resource) {
		
		System.out.println("In construct");
		
		ca.uhn.fhir.model.dstu2.resource.RiskAssessment riskAssessment = (ca.uhn.fhir.model.dstu2.resource.RiskAssessment) resource;
		OmopConceptMapping ocm = OmopConceptMapping.getInstance();
		
		//Must have a subject
		if(!riskAssessment.getSubject().isEmpty()){
			//if true - we just need to put into database
			System.out.println("subject present");
			
			IdDt reference = riskAssessment.getSubject().getReference();
			if(reference.getIdPartAsLong() != null){
				if("Patient".equals(reference.getResourceType())){
					if(this.person ==null)
						this.person = new Person();
					this.person.setId(reference.getIdPartAsLong());
				} else if("Group".equals(reference.getResourceType())){
					//
				} 
				//System.out.println(riskAssessment.getSubject().getReference().getIdPart());
			}
			
			if(!riskAssessment.getPrediction().isEmpty() ){
				System.out.println("prediction present");
				//this.date = riskAssessment.getDateElement().getValue(); //getDate()?		
				// Set subject: currently supporting only type Person 
				// (Risk Assessment only supports Patient and Group for now)
				// TODO create entity-complement to specify other types of subjects 
		
										
				
				Long outcomeAsConceptId = ocm.get(riskAssessment.getPrediction().get(0).getOutcome().getCodingFirstRep().getCode());
				System.out.println(outcomeAsConceptId);
				
				this.outcome = new Concept();
				this.outcome.setId(outcomeAsConceptId);
				
				riskAssessment.addPrediction();
				
				DecimalDt dec = new DecimalDt();
				dec = (DecimalDt) riskAssessment.getPrediction().get(0).getProbability();
				System.out.println(dec.getValue());
				this.score = dec.getValue();
				
				//this.outcome = riskAssessment.getPrediction().get(0).getOutcome().getText();
				
		
				if (!riskAssessment.getMethod().isEmpty()){
					
					Long methodAsConceptId = ocm.get(riskAssessment.getMethod().getCodingFirstRep().getCode());
					System.out.println(methodAsConceptId);
	
					this.method = new Concept();
					this.method.setId(methodAsConceptId);
				}
				
				
					
					//ResourceReferenceDt conditionCodeConcept = riskAssessment.getCondition();
					//Long conditionAsConceptId = ocm.get(conditionCodeConcept.getId());
					
				Long conditionReference = riskAssessment.getCondition().getReference().getIdPartAsLong();
		
				System.out.println("condition reference:");
				System.out.println(conditionReference);
					
				if (conditionReference != null){
					this.condition = new Concept();
					this.condition.setId(conditionReference);
					
				}

				if (riskAssessment.getPrediction().get(0).getWhen()!= null){
					PeriodDt periodDt = (PeriodDt) riskAssessment.getPrediction().get(0).getWhen();
					this.date = periodDt.getStart();		
				}
				

			}
			//if false- we need to run analytics model to get results
			else{
				System.out.println("Print model");
				
				/*SessionFactory sessionFactory;
			    ServiceRegistry serviceRegistry;
			    
			    Configuration configuration = new Configuration().configure();

	            serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry();
	            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
			    sessionFactory = new Configuration().configure().buildSessionFactory(serviceRegistry);
				
				Session session = sessionFactory.openSession();
				
				String condition_query = "select * from condition_occurrence c where c.person_id = " + riskAssessment.getSubject().getReference().getIdPart();
				System.out.println(condition_query);
				Query query = session.createSQLQuery(condition_query);
				List results = query.list();
				System.out.println(results);
				*/
				//Session session = factory.openSession();
				ConditionOccurrence cond_occur = new ConditionOccurrence();
				
				Map obj=new LinkedHashMap(); //main
				
				int patientId = 0000; //replace with id
				obj.put("id",patientId);
				
				//Setup the attributes
				JSONArray attributeList = new JSONArray();
				Map attributeObj=new LinkedHashMap(); 
				Map attributeObj2 = new LinkedHashMap();
				
				attributeObj.put("name", "DOB");
				attributeObj.put("value", "<enter DOB>"); //insert value here
				attributeObj.put("schema", "date_attr");
				attributeList.add(attributeObj);
				//attributeObj.clear();
				attributeObj2.put("name", "gender");
				attributeObj2.put("value", "<insert gender>"); //insert value here
				attributeObj2.put("schema", "cat_attr");
				attributeList.add(attributeObj2);
				
				obj.put("attributes", attributeList);
				
				//Setup the events
				Map eventsObj=new LinkedHashMap();
				
				
				//Diagnostic Information
				Map diagnosticObj = new LinkedHashMap();;
				JSONArray diagnosticList = new JSONArray();
				for (int i = 0; i < 5; i++){
					Map tempDiagnosticObj=new LinkedHashMap(); 
					tempDiagnosticObj.put("eventName", "icd-9-cm:"+i); // replace with icd codes
					tempDiagnosticObj.put("timestamp", "<insert date>");
					diagnosticList.add(tempDiagnosticObj);
				}
				diagnosticObj.put("items", diagnosticList);
				diagnosticObj.put("schema", "bin_event");
				eventsObj.put("diagnostic", diagnosticObj);
				
				//Procedure Information
				Map procedureObj = new LinkedHashMap();;
				JSONArray procedureList = new JSONArray();
				for (int j = 0; j < 5; j++){
					Map tempProcedureObj=new LinkedHashMap(); 
					tempProcedureObj.put("eventName", "cpt:"+j); // replace with icd codes
					tempProcedureObj.put("timestamp", "<insert date>");
					procedureList.add(tempProcedureObj);
				}
				procedureObj.put("items", procedureList);
				procedureObj.put("schema","bin_event");
				eventsObj.put("procedure", procedureObj);
				
				
				//Procedure Information
				Map medicationObj = new LinkedHashMap();
				JSONArray medicationList = new JSONArray();
				for (int k = 0; k < 5; k++){
					Map tempMedicationObj=new LinkedHashMap(); 
					tempMedicationObj.put("eventName", k); // replace with icd codes
					tempMedicationObj.put("timestamp", "<insert date>");
					tempMedicationObj.put("stopTime", "<insert date>");
					tempMedicationObj.put("value", "<insert value>");
					medicationList.add(tempMedicationObj);
				}
				medicationObj.put("items", medicationList);
				medicationObj.put("schema","num_event");
				eventsObj.put("medication", medicationObj);
				
				
				
				
				obj.put("events", eventsObj);
				String jsonText=JSONValue.toJSONString(obj);
				System.out.println(jsonText);
			}
	
		}
		else{
			//Need to send out an error
			System.out.println("Must have subject");
		}

		//System.out.println(this.person.getIdDt().getValue());
		return this;
	}
	
}