package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_PATIENT;
import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_SUBJECT;
import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_METHOD;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.Iterator;
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
import javax.persistence.SecondaryTable;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


import ca.uhn.fhir.context.FhirVersionEnum;

import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;

import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

import edu.gatech.i3l.omop.mapping.OmopConceptMapping;


@Entity
@Table(name="risk_assessment")
@SecondaryTable(name="risk_assessment_prediction",
pkJoinColumns=@PrimaryKeyJoinColumn(name="risk_assessment_id"))
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
	
	/*@Column(name="score")
	private BigDecimal score;
	*/
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="condition_concept_id", nullable=false)
	private Concept condition;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="method")
	private Concept method;
	
	/*
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="outcome")
	@NotNull
	private Concept outcome;
	*/
	
	@Column(name="prediction_info")
	private String prediction_info;
	
	/*
	@Column(name="rationale")
	private String rationale;
	*/
	
	
	@Column(name="risk_assessment_date")
	private Date date;
	
	//Secondary table - risk_assessment_prediction
	
	@Column(table="risk_assessment_prediction",name="score")
	private BigDecimal score;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(table="risk_assessment_prediction",name="outcome")
	@NotNull
	private Concept outcome;
	
	@Column(table="risk_assessment_prediction",name="rationale")
	private String rationale;
	
	@Column(table="risk_assessment_prediction", name="risk_assessment_prediction_date")
	private Date prediction_date;
	
	
	/*@Column(table="risk_assessment_prediction",name="score")
	private BigDecimal prediction_score;
	*/
	
	
	public RiskAssessment() {
		super();
	}
	
	public RiskAssessment(Long id, Person person, Concept condition, Concept method,
			String prediction_info, Date date, BigDecimal score,Concept outcome, 
			String rationale, Date prediction_date){
		super();
		this.id = id;
		this.person = person;
		this.condition = condition;
		this.date = date;
		//this.time = time;
		this.score = score;
		this.method = method;
		this.outcome = outcome;
		this.prediction_info = prediction_info;
		this.rationale = rationale;
		//this.prediction_risk_id = prediction_risk_id;
		//this.prediction_person = prediction_person;
		this.prediction_date = prediction_date;
		
	}
	
	@Override
	public Long getId() {
		return id;
	}
	
	public void setId(Long id){
		this.id = id;
	}
	
	
	public Date getDateTime(){
		return date;
	}
	
	public void setDateTime(Date date){
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
	
	public void setCondition(Concept condition){
		this.condition = condition;
	}
	
	
	public BigDecimal getScore(){
		return score;
	}
	
	public void setScore(BigDecimal score){
		this.score = score;
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
	
	public Date getPredictionDateTime(){
		return prediction_date;
	}
	
	public void setPredictionDateTime(Date prediction_date){
		this.prediction_date = prediction_date;
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
					if(this.person ==null){
						this.person = new Person();
					}
					this.person.setId(reference.getIdPartAsLong());
				} else if("Group".equals(reference.getResourceType())){
					//
				} 
				//System.out.println(riskAssessment.getSubject().getReference().getIdPart());
			}
			
			//this.prediction_risk_id= (long) 1; //default value that gets replaced by risk assessment ID
			
			if(!riskAssessment.getPrediction().isEmpty() ){						
				
				Long outcomeAsConceptId = ocm.get(riskAssessment.getPrediction().get(0).getOutcome().getCodingFirstRep().getCode());
				System.out.println(outcomeAsConceptId);
				
				this.outcome = new Concept();
				this.outcome.setId(outcomeAsConceptId);
				
				riskAssessment.addPrediction();
				
				DecimalDt dec = new DecimalDt();
				dec = (DecimalDt) riskAssessment.getPrediction().get(0).getProbability();
				this.score = dec.getValue();
				
				if (!riskAssessment.getMethod().isEmpty()){
					
					Long methodAsConceptId = ocm.get(riskAssessment.getMethod().getCodingFirstRep().getCode());
					System.out.println(methodAsConceptId);
	
					this.method = new Concept();
					this.method.setId(methodAsConceptId);
				}
					
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
					this.prediction_date = periodDt.getStart();
				}
				

			}
			//if false- we need to run analytics model to get results
			else{
				System.out.println("Run model");
				String jsontext = generatePatientProfile(this.person.getId().toString());
				System.out.println(jsontext);
			}
		}
		else{
			//Need to send out an error
			System.out.println("Must have subject");
		}
		

		//System.out.println(this.person.getIdDt().getValue());
		return this;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	String generatePatientProfile(String patientId){
		
		Map obj=new LinkedHashMap(); //main
		
		//Long patientId = this.person.getId(); 
		obj.put("id",patientId);
		
		//Setup the attributes
		JSONArray attributeList = new JSONArray();
		Map attributeObj=new LinkedHashMap(); 
		Map attributeObj2 = new LinkedHashMap();
		
		//Get Patient DOB and Gender
		URL url;
		StringBuilder sb = new StringBuilder();
		try {
			url = new URL("http://localhost:8080/gt-fhir-webapp/base/Patient?_id="+patientId);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			
			String output;
			while ((output = br.readLine()) != null) {
				sb.append(output);
				//System.out.println(output);
			}

			conn.disconnect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String patientResponse = sb.toString();
		//System.out.println(patientResponse);
		
		JSONParser patient_parser = new JSONParser();
		try {
			Object patient_Obj = patient_parser.parse(patientResponse.toString());
			JSONObject patientArray = (JSONObject)patient_Obj;

			JSONObject resouces = (JSONObject) ((JSONObject) ((JSONArray) patientArray.get("entry")).get(0)).get("resource");
			System.out.println(resouces);
			
			attributeObj.put("name", "DOB");
			String dob = (String) resouces.get("birthDate");
			attributeObj.put("value", dob+"T00:00:00"); //insert value here
			attributeObj.put("schema", "date_attr");
			attributeList.add(attributeObj);
			
			
			attributeObj2.put("name", "gender");	
			if (((String) resouces.get("gender")).equals("male")){
				attributeObj2.put("value", "M"); //insert value here
			}
			if (((String) resouces.get("gender")).equals("female")){
				attributeObj2.put("value", "F"); //insert value here
			}

			attributeObj2.put("schema", "cat_attr");
			attributeList.add(attributeObj2);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		
		obj.put("attributes", attributeList);
		
		//Setup the events
		Map eventsObj=new LinkedHashMap();
		
		//Diagnostic Information
		Map diagnosticObj = new LinkedHashMap();;
		JSONArray diagnosticList = new JSONArray();
		
		
		StringBuilder sb_condition = new StringBuilder();
		try {
			url = new URL("http://localhost:8080/gt-fhir-webapp/base/Condition?patient="+patientId);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			
			String output;
			while ((output = br.readLine()) != null) {
				sb_condition.append(output);
				//System.out.println(output);
			}

			conn.disconnect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String conditionResponse = sb_condition.toString();
		//System.out.println(conditionResponse);
		
		
		JSONParser parser = new JSONParser();
		try {
			Object con_Obj = parser.parse(conditionResponse.toString());
			JSONObject conditionArray = (JSONObject)con_Obj;
			

			JSONArray entry = (JSONArray) conditionArray.get("entry");
			
			for (Object elem : entry) {
				JSONObject resources = (JSONObject) ((JSONObject) elem).get("resource");
				Map tempDiagnosticObj=new LinkedHashMap();
				JSONArray coding = (JSONArray) ((JSONObject) resources.get("code")).get("coding");
				JSONObject codingItem = (JSONObject) coding.get(0);
				String system = (String) codingItem.get("system");
				String code = (String) codingItem.get("code");
				
				if (!system.equals("http://hl7.org/fhir/sid/icd-9-cm")){
					System.out.println("need to convert");
				}
				
				tempDiagnosticObj.put("eventName", "icd-9-cm:"+ code.replace(".","")); 
				tempDiagnosticObj.put("timestamp",  ((JSONObject) resources).get("onsetDateTime").toString().substring(0,19));
				diagnosticList.add(tempDiagnosticObj);

			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		diagnosticObj.put("items", diagnosticList);
		diagnosticObj.put("schema", "bin_event");
		eventsObj.put("diagnostic", diagnosticObj);
		
		//Procedure Information
		Map procedureObj = new LinkedHashMap();
		JSONArray procedureList = new JSONArray();
		
		StringBuilder sb_procedure = new StringBuilder();
		try {
			url = new URL("http://localhost:8080/gt-fhir-webapp/base/Procedure?patient="+patientId);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			
			String output;
			while ((output = br.readLine()) != null) {
				sb_procedure.append(output);
				//System.out.println(output);
			}

			conn.disconnect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String procedureResponse = sb_procedure.toString();
		//System.out.println(procedureResponse);
		
		
		JSONParser procedure_parser = new JSONParser();
		try {
			Object proc_Obj = procedure_parser.parse(procedureResponse.toString());
			JSONObject procedureArray = (JSONObject)proc_Obj;
			

			JSONArray entry = (JSONArray) procedureArray.get("entry");
			
			for (Object elem : entry) {
				JSONObject resources = (JSONObject) ((JSONObject) elem).get("resource");
				Map tempProcedureObj=new LinkedHashMap(); 
				JSONArray coding = (JSONArray) ((JSONObject) resources.get("type")).get("coding");
				JSONObject codingItem = (JSONObject) coding.get(0);
				String system = (String) codingItem.get("system");
				String code = (String) codingItem.get("code");
				
				if (!system.equals("http://www.ama-assn.org/go/cpt")){
					System.out.println("need to convert");
				}
				
				tempProcedureObj.put("eventName", "cpt:"+ code.replace(".","")); 
				tempProcedureObj.put("timestamp",  ((JSONObject) resources).get("performedDateTime").toString().substring(0,19));
				procedureList.add(tempProcedureObj);

			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		procedureObj.put("items", procedureList);
		procedureObj.put("schema","bin_event");
		eventsObj.put("procedure", procedureObj);
		
		
		//Medication Information
		Map medicationObj = new LinkedHashMap();
		JSONArray medicationList = new JSONArray();
		
		StringBuilder sb_medication = new StringBuilder();
		try {
			url = new URL("http://localhost:8080/gt-fhir-webapp/base/MedicationAdministration?patient="+patientId);
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.setRequestProperty("Accept", "application/json");

			if (conn.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ conn.getResponseCode());
			}

			BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
			
			String output;
			while ((output = br.readLine()) != null) {
				sb_medication.append(output);
				//System.out.println(output);
			}

			conn.disconnect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String medicationResponse = sb_medication.toString();
		System.out.println(medicationResponse);
		
		
		JSONParser medication_parser = new JSONParser();
		try {
			Object med_Obj = medication_parser.parse(medicationResponse.toString());
			JSONObject medicationArray = (JSONObject)med_Obj;
			

			JSONArray entry = (JSONArray) medicationArray.get("entry");
			
			for (Object elem : entry) {
				JSONObject resources = (JSONObject) ((JSONObject) elem).get("resource");
				Map tempMedicationObj=new LinkedHashMap(); 
				
				
				JSONObject coding = (JSONObject) ((JSONArray) ((JSONObject) ((JSONObject) ((JSONArray) resources.get("contained")).get(0)).get("code")).get("coding")).get(0);
				
				String medication = (String) coding.get("code");
				tempMedicationObj.put("eventName", getMedicationName(medication)); 
				String timestamp = (String) ((JSONObject) resources.get("effectiveTimePeriod")).get("start");
				tempMedicationObj.put("timestamp", timestamp.substring(0,19));
				String stopTime = (String) ((JSONObject) resources.get("effectiveTimePeriod")).get("end");
				tempMedicationObj.put("stopTime", stopTime.substring(0,19));
				medicationList.add(tempMedicationObj);
				Long value = (Long) ((JSONObject) ((JSONObject) resources.get("dosage")).get("quantity")).get("value");
				tempMedicationObj.put("value", value);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		medicationObj.put("items", medicationList);
		medicationObj.put("schema","num_event");
		eventsObj.put("medication", medicationObj);
	
		obj.put("events", eventsObj);
		String jsonText=JSONValue.toJSONString(obj);
		//System.out.println(jsonText);

		
		return jsonText;
	}
	
	String getMedicationName(String medicationCode){
		if (medicationCode.equals("114477"))
            return "LEVETIRACETAM";
        if (medicationCode.equals("373435"))
            return "PHENYTOIN_SODIUM_EXTENDED";
        if (medicationCode.equals("608948"))
            return "PRENATAL_VIT_W/_FERROUS_FUMARATE-FOLIC_ACID";
        if (medicationCode.equals("26225"))
            return "ONDANSETRON_HCL"; 
        if (medicationCode.equals("4493"))
            return "FLUOXETINE_HCL";
        if (medicationCode.equals("1087974"))
            return "FLUOXETINE_HCL";
        if (medicationCode.equals("596"))
            return "ALPRAZOLAM";
        if (medicationCode.equals("155137"))
            return "SERTRALINE_HCL";
        if (medicationCode.equals("221078"))
            return "CITALOPRAM_HYDROBROMIDE";
        if (medicationCode.equals("15996"))
            return "MIRTAZAPINE";
        if (medicationCode.equals("498910"))
            return "AMPHETAMINE-DEXTROAMPHETAMINE";
        if (medicationCode.equals("89013"))
            return "ARIPIPRAZOLE";
        if (medicationCode.equals("28439"))
            return "LAMOTRIGINE";
        if (medicationCode.equals("203204"))
            return "BUPROPION_HCL";
        if (medicationCode.equals("284925"))
            return "ZIPRASIDONE_HCL";
        if (medicationCode.equals("8183"))
            return "PHENYTOIN";
        if (medicationCode.equals("4493"))
            return "FLUOXETINE_HCL";
        if (medicationCode.equals("235988"))
            return "VENLAFAXINE_HCL";
        if (medicationCode.equals("38404"))
            return "TOPIRAMATE";
        if (medicationCode.equals("6218"))
            return "LACTULOSE";
        if (medicationCode.equals("61381"))
            return "OLANZAPINE";
        if (medicationCode.equals("221183"))
            return "ZOLPIDEM_TARTRATE";
        if (medicationCode.equals("6135"))
            return "KETOCONAZOLE_(TOPICAL)";
        if (medicationCode.equals("29451"))
            return "MEGESTROL_ACETATE";
        if (medicationCode.equals("221147"))
            return "POLYETHYLENE_GLYCOL_3350";
        if (medicationCode.equals("885218"))
            return "BENZTROPINE_MESYLATE";
        if (medicationCode.equals("1099595"))
            return "DIVALPROEX_SODIUM";
        if (medicationCode.equals("35636"))
            return "RISPERIDONE";
        if (medicationCode.equals("1202"))
            return "ATENOLOL";
        if (medicationCode.equals("353108"))
            return "ESCITALOPRAM_OXALATE";
        if (medicationCode.equals("1115"))
            return "TRIHEXYPHENIDYL_HCL";
        if (medicationCode.equals("5093"))
            return "HALOPERIDOL";
        if (medicationCode.equals("71722"))
            return "DOCUSATE_SODIUM";
        if (medicationCode.equals("28889"))
            return "LORATADINE";
        if (medicationCode.equals("7646"))
            return "OMEPRAZOLE";
        if (medicationCode.equals("82112"))
            return "TRAZODONE_HCL";
        if (medicationCode.equals("197773"))
            return "HYDROCODONE-ACETAMINOPHEN";
        if (medicationCode.equals("203214"))
            return "DICLOFENAC_SODIUM";
        if (medicationCode.equals("203144"))
            return "PRAVASTATIN_SODIUM";
        if (medicationCode.equals("636674"))
            return "VARENICLINE_TARTRATE";
		
		return "None";
	}
	

	
	
	
	
}