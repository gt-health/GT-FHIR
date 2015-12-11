package edu.gatech.i3l.fhir.dstu2.entities;

import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_PATIENT;
import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_SUBJECT;
import static ca.uhn.fhir.model.dstu2.resource.RiskAssessment.SP_METHOD;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;
import java.net.HttpURLConnection;
import java.net.URL;

import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
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
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import edu.gatech.i3l.fhir.jpa.entity.BaseResourceEntity;
import edu.gatech.i3l.fhir.jpa.entity.IResourceEntity;

import edu.gatech.i3l.omop.mapping.OmopConceptMapping;


import org.python.util.PythonInterpreter;
import org.python.core.*; 
import edu.gatech.i3l.models.SpaceshipAdapter;
import edu.gatech.i3l.models.SpaceshipAdapterFactory;


@Entity
@Table(name="risk_assessment")
@Inheritance(strategy=InheritanceType.JOINED)
//@Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
public class RiskAssessment extends BaseResourceEntity{

	private static final String RES_TYPE = "RiskAssessment";
	public static final String predictionModelScript = "/Users/ameliahenderson/Documents/GradCourses/MastersProject/export/fhir_pm.py";
	public static final String predictionModelPath = "/Users/ameliahenderson/Documents/GradCourses/MastersProject/export/model";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="risk_assessment_id")
	@Access(AccessType.PROPERTY)
	private Long id;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="person_id", nullable=false)
	@NotNull
	private Person person;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="condition_concept_id", nullable=false)
	private Concept condition;
	
	@ManyToOne(cascade={CascadeType.MERGE})
	@JoinColumn(name="method")
	private Concept method;
	
	
	@Column(name="prediction_info")
	private String prediction_info;

	
	
	@Column(name="risk_assessment_date")
	private Date date;

	
	//@Transient
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "risk_assessment_id", cascade={CascadeType.ALL})
	private Set<RiskAssessmentPrediction> predictions = new HashSet<RiskAssessmentPrediction>(
			0); 
	
	
	public RiskAssessment() {
		super();
	}
	
	public RiskAssessment(Long id, Person person, Concept condition, Concept method,
			String prediction_info, Date date, Set<RiskAssessmentPrediction> predictions){
		super();
		this.id = id;
		this.person = person;
		this.condition = condition;
		this.date = date;
		this.method = method;
		this.prediction_info = prediction_info;
		this.predictions = predictions;
		
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
	
	public Concept getMethod(){
		return method;
	}
	
	public void setMethod(Concept method){
		this.method = method;
	}

	public String getPredictionInfo(){
		return prediction_info;
	}
	
	public void setPredictionInfo(String prediction_info){
		this.prediction_info = prediction_info;
	}

	
	public Set<RiskAssessmentPrediction> getPrediction(){
		return this.predictions;
	}
	
	public void setPrediction(Set<RiskAssessmentPrediction> predictions){
		this.predictions = predictions;
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
		System.out.println("main getresouce");
		
		
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


			String theText = method.getName() + ", " + method.getVocabulary().getName() + ", "
				+ method.getConceptCode();

			methodCodeConcept.setText(theText);
			riskAssessment.setMethod(methodCodeConcept);
		
		}
		
		

		if (this.date != null){
			DateTimeDt assessmentPeriod = new DateTimeDt();
			assessmentPeriod.setValue(date);
			riskAssessment.setDate(assessmentPeriod);
			
		}
		
		
		System.out.println(this.predictions);
		Iterator<RiskAssessmentPrediction> itr = this.predictions.iterator();
		RiskAssessmentPrediction tempPrediction;
		//for (RiskAssessmentPrediction tempPrediction : this.predictions) {
		for(int i = 0; itr.hasNext(); i++) {
			tempPrediction =itr.next();
			
			//Score - required
			DecimalDt score_dec = new DecimalDt();
			score_dec.setValue(tempPrediction.getScore());
			riskAssessment.addPrediction();
			riskAssessment.getPrediction().get(i).setProbability(score_dec);
			
			//Outcome
			if (tempPrediction.getOutcome() != null){
				String theSystem = tempPrediction.getOutcome().getVocabulary().getSystemUri();
				String theCode = tempPrediction.getOutcome().getConceptCode();
			
				CodeableConceptDt outcomeCodeConcept = new CodeableConceptDt();
				if (theSystem != "") {
					CodingDt coding = new CodingDt(theSystem, theCode);
					coding.setDisplay(tempPrediction.getOutcome().getName());
					outcomeCodeConcept.addCoding(coding);
				}
			
				String theText = tempPrediction.getOutcome().getName() + ", " + tempPrediction.getOutcome().getVocabulary().getName() + ", "
					+ tempPrediction.getOutcome().getConceptCode();

				outcomeCodeConcept.setText(theText);
				riskAssessment.getPrediction().get(i).setOutcome(outcomeCodeConcept);
			}
			if (tempPrediction.getPredictionDateTime() != null){
				PeriodDt assessmentPeriod = new PeriodDt();
			
				assessmentPeriod.setStartWithSecondsPrecision(tempPrediction.getPredictionDateTime());
				assessmentPeriod.setEndWithSecondsPrecision(tempPrediction.getPredictionDateTime());
			
				riskAssessment.getPrediction().get(i).setWhen(assessmentPeriod);
			}
			
			if(tempPrediction.getRationale() != null){
				riskAssessment.getPrediction().get(i).setRationale(tempPrediction.getRationale());
			}
	        
	       
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
			}
			
			//Get current date and time
			Date current_date = new Date();
			
			/* Temporary setting of method and condition. To be replaced by actual values.
			 * Either the method and condition should be passed in with the request or the model
			 * should return this information  */
			Concept tempMethod = new Concept();
			tempMethod.setId((long) 44786678);
			Concept tempCondition = new Concept();
			tempCondition.setId((long) 380378);
			//Concept tempOutcome = new Concept();
			//this.outcome = tempOutcome;
			this.date = current_date;
			this.method = tempMethod;
			this.condition = tempCondition;
			
			if(!riskAssessment.getPrediction().isEmpty() ){						
				//if true - we just need to put into database
				Long outcomeAsConceptId = ocm.get(riskAssessment.getPrediction().get(0).getOutcome().getCodingFirstRep().getCode());
				System.out.println(outcomeAsConceptId);
		
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
				
				if (riskAssessment.getDate()!= null){
					this.date = riskAssessment.getDate();
				}
				
				
				
				RiskAssessmentPrediction newPrediction = new RiskAssessmentPrediction();
				
				DecimalDt dec = new DecimalDt();
				dec = (DecimalDt) riskAssessment.getPrediction().get(0).getProbability();
				newPrediction.setScore(dec.getValue());
				
				Concept tempOutcome = new Concept();
				tempOutcome.setId(outcomeAsConceptId);
				newPrediction.setOutcome(tempOutcome);
				
				if (riskAssessment.getPrediction().get(0).getWhen()!= null){
					PeriodDt periodDt = (PeriodDt) riskAssessment.getPrediction().get(0).getWhen();
					newPrediction.setPredictionDateTime(periodDt.getStart());
				}
				

				newPrediction.setRiskAssessmentId(this);
				
				this.predictions = new HashSet<RiskAssessmentPrediction>(0);
				//this.predictions.add(newPrediction);
				this.predictions.add(newPrediction);
		

			}
			//if false- we need to run analytics model to get results
			else{
				System.out.println("Run model");
				String jsontext = generatePatientProfile(this.person.getId().toString());
				System.out.println(jsontext);
	
						
				
				this.predictions = new HashSet<RiskAssessmentPrediction>(0);
				
				File directory = new File(predictionModelPath);
		        //get all the models from a directory
		        File[] fList = directory.listFiles();
		        for (File file : fList){
		            if (file.isDirectory()){
		            	/*
						PythonInterpreter python = new PythonInterpreter();
						
						python.exec("import sys");
						python.exec("sys.path.append('/Users/ameliahenderson/Documents/GradCourses/MastersProject/export/')");
						python.execfile("/Users/ameliahenderson/Documents/GradCourses/MastersProject/export/fhir_pm");
						*/
		            	RiskAssessmentPrediction riskPrediction = new RiskAssessmentPrediction();
		            	
		                try {
		                	//Currently running a script that returns dummy data. To be replaced with actual model
		                	ProcessBuilder pb = new ProcessBuilder("python",predictionModelScript,""+"model/" + file.getName() + "/",""+"'"+ jsontext +"'");
							Process p = pb.start();
							BufferedReader in = new BufferedReader(new InputStreamReader(p.getInputStream()));
							String s;
							String ret = in.readLine();
							System.out.println("value is : "+ret);
							BigDecimal scoreVal = new BigDecimal(ret).setScale(2, BigDecimal.ROUND_UP);
							riskPrediction.setScore(scoreVal);
							riskPrediction.setRationale(file.getName());
							riskPrediction.setPredictionDateTime(this.date);
							Concept tempContact = new Concept();
							tempContact.setId((long) 19045378);
							riskPrediction.setOutcome(tempContact);
							riskPrediction.setRiskAssessmentId(this);
							
							this.predictions.add(riskPrediction);


						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
		                
						System.out.println("Script ran for: "+ file.getName());  
		            }
		        }
			}
		}
		else{
			//Need to send out an error
			System.out.println("Must have subject");
		}
		

		
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
			}

			conn.disconnect();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String procedureResponse = sb_procedure.toString();
		
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