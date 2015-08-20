package edu.gatech.i3l.omop.mapping;

import java.util.Map;

import org.hl7.fhir.instance.model.valuesets.V3RoleCode;

/**
 * This class maps the concepts listed by HL7 v3 for <a href="http://hl7.org/fhir/2015May/v3/vs/ServiceDeliveryLocationRoleType/index.html">
 * Location of Service Role Type</a> and OMOP v4 Place of Service, which are based on <a href=
 * "https://www.cms.gov/Medicare/Coding/place-of-service-codes/Place_of_Service_Code_Set.html"> FIXME this is the newest version, get the version for Omop v4
 * CMS Place of Service Code Set</a>.
 * 
 * @author Ismael Sarmento
 *
 */
public enum OmopPlaceOfServiceConcept {

	HOME("Home", "12"),
	SCHOOL("School", "3"),
	PHARMACY("Pharmacy", "1"),
	/**
	 *  A facility, other than psychiatric, which primarily provides diagnostic, therapeutic (both surgical and 
	 *  nonsurgical), and rehabilitation services by, or under, the supervision of physicians to patients admitted 
	 *  for a variety of medical conditions.
	 */
	INPATIENT_HOSPITAL("Inpatient Hospital", "21"),
	/**
	 * Hospital that provides diagnostic, therapeutic (both surgical and nonsurgical), and rehabilitation services to 
	 * sick or injured persons who do not require hospitalization or institutionalization. 
	 */
	OUTPATIENT_HOSPITAL("Outpatient Hospital", "22"),
	/**
	 * A portion of a hospital where emergency diagnosis and treatment of illness or injury is provided.
	 */
	EMERGENCY_ROOM_HOSPITAL("Emergency Room - Hospital", "23"),
	/**
	 * Location, distinct from a hospital emergency room, an office, or a clinic, whose purpose is to diagnose and treat 
	 * illness or injury for unscheduled, ambulatory patients seeking immediate medical attention. (Effective January 1, 2003)
	 */
	URGENT_CARE_FACILITY("Urgent Care Facility", "20"),
	
	/**
	 * A facility for the diagnosis and treatment of mental illness that provides a planned therapeutic program for patients 
	 * who do not require full time hospitalization, but who need broader programs than are possible from outpatient visits 
	 * to a hospital-based or hospital-affiliated facility.
	 */
	PSYCHIATRIC_FACILITY_PARTIAL_HOSPITALIZATION("Psychiatric Facility-Partial Hospitalization", "52"),
	
	INPATIENT_PSYCHIATRIC_FACILITY("Inpatient Psychiatric Facility", "51"),
	PSYCHIATRIC_RESIDENTIAL_TREATMENT_CENTER("Psychiatric Residential Treatment Center", "56"),
	COMMUNITY_MENTAL_HEALTH_CENTER("Community Mental Health Center", "53"),
	
	/**
	 * A laboratory certified to perform diagnostic and/or clinical tests independent of an institution or a physician's office.
	 */
	INDEPENDENT_LAB("Independent Laboratory", "81");

	String conceptName;
	String conceptCode;

	OmopPlaceOfServiceConcept(String conceptName, String conceptCode) {
		this.conceptName = conceptName;
		this.conceptCode = conceptCode;
	}

	public String getConceptCode() {
		return conceptCode;
	}

	public void setConceptCode(String conceptCode) {
		this.conceptCode = conceptCode;
	}

	public String getConceptName() {
		return conceptName;
	}

	public void setConceptName(String conceptName) {
		this.conceptName = conceptName;
	}

	public static Long getPlaceOfServiceConceptIdOMOPv4(V3RoleCode serviceLocationRoleTypeCode) {
		Long retVal = null;
		if(serviceLocationRoleTypeCode == null)
			return retVal;
		Map<String, Long> concepts = OmopConceptMapping.getInstance().getConceptsForClass(OmopConceptMapping.PLACE_OF_SERVICE);
		if (serviceLocationRoleTypeCode.equals(V3RoleCode.PHARM) ||
				serviceLocationRoleTypeCode.equals(V3RoleCode.INPHARM) ||
				serviceLocationRoleTypeCode.equals(V3RoleCode.OUTPHARM)) {
			retVal =  concepts.get(PHARMACY.getConceptCode());
		} else if(serviceLocationRoleTypeCode.equals(V3RoleCode.RTF) ||
					serviceLocationRoleTypeCode.equals(V3RoleCode.PTRES)){
			retVal = concepts.get(HOME.getConceptCode());
		} else if (serviceLocationRoleTypeCode.equals(V3RoleCode.SCHOOL)){
			retVal = concepts.get(SCHOOL.getConceptCode());
			/*
			 * Mapping types for Hospitals.
			 * HL7 Hospital is being considered Inpatient facility, while Hospital Unit is being considered an Outpatient facility
			 */
		} else if( serviceLocationRoleTypeCode.equals(V3RoleCode.HOSP)){
			retVal = concepts.get(INPATIENT_HOSPITAL.getConceptCode());
		} else if(serviceLocationRoleTypeCode.equals(V3RoleCode.HU)){
			retVal = concepts.get(OUTPATIENT_HOSPITAL.getConceptCode());
			
		} else if(serviceLocationRoleTypeCode.equals(V3RoleCode.PSY) ||
					serviceLocationRoleTypeCode.equals(V3RoleCode.PSYCHF) ||
					serviceLocationRoleTypeCode.equals(V3RoleCode.CAPC)){
			retVal = concepts.get(INPATIENT_PSYCHIATRIC_FACILITY.getConceptCode()); 
		} else if(serviceLocationRoleTypeCode.equals(V3RoleCode.PHU)){
			retVal = concepts.get(PSYCHIATRIC_FACILITY_PARTIAL_HOSPITALIZATION.getConceptCode());
			/*
			 * Mapping types for Laboratories
			 * HL7 specialized labs are all mapped to a general independent lab.
			 */
		} else if(serviceLocationRoleTypeCode.equals(V3RoleCode.HLAB) || //Hospital lab
					serviceLocationRoleTypeCode.equals(V3RoleCode.INLAB) || //Inpatient lab
					serviceLocationRoleTypeCode.equals(V3RoleCode.OUTLAB) || //Outpatient lab
					serviceLocationRoleTypeCode.equals(V3RoleCode.MBL) ||	//Medical lab
					//specialized labs
					serviceLocationRoleTypeCode.equals(V3RoleCode.CATH) || //Cardiac catheterization lab
					serviceLocationRoleTypeCode.equals(V3RoleCode.ECHO) || //Echocardiography lab
					serviceLocationRoleTypeCode.equals(V3RoleCode.GIDX) || //Gastroenterology diagnostics or therapeutics lab
					serviceLocationRoleTypeCode.equals(V3RoleCode.ENDOS)	//Endoscopy lab
					){
			retVal = concepts.get(INDEPENDENT_LAB.getConceptCode());
		} else if(serviceLocationRoleTypeCode.equals(V3RoleCode.ER) || //Emergency room
					serviceLocationRoleTypeCode.equals(V3RoleCode.ETU)){ //Emergency trauma unit
			retVal = concepts.get(EMERGENCY_ROOM_HOSPITAL.getConceptCode());
		} else if(serviceLocationRoleTypeCode.equals(V3RoleCode.GACH)){ //General Acute Care Hospital
			retVal = concepts.get(URGENT_CARE_FACILITY.getConceptCode());
		}
		return retVal;
	}
	
	/**
	 * Notice that, eventually, some different, but related, types of location in HL7 value set are gonna be represented on a single value in CMS value in the list.
	 * For example: HL7.Pharmacy, HL7.InpatientPharmacy, or HL7.OutpatientPharmacy are gonna be stored as OMOP.Pharmacy and, consequently, always
	 * returned as HL7.Pharmacy.
	 * @param placeOfServiceConcept the CMS concept for place of service to be converted
	 */
	public static V3RoleCode getServiceLocationRoleTypeCodeHL7(OmopPlaceOfServiceConcept placeOfServiceConcept ){
		V3RoleCode retVal = null;
		if(placeOfServiceConcept == null)
			return retVal;
		if(placeOfServiceConcept.equals(PHARMACY))
			return V3RoleCode.PHARM;
		if(placeOfServiceConcept.equals(HOME))
			return V3RoleCode.PTRES;
		if(placeOfServiceConcept.equals(SCHOOL))
			return V3RoleCode.SCHOOL;
		if(placeOfServiceConcept.equals(INPATIENT_HOSPITAL))
			return V3RoleCode.HOSP;
		if(placeOfServiceConcept.equals(OUTPATIENT_HOSPITAL))
			return V3RoleCode.HU;
		if(placeOfServiceConcept.equals(INPATIENT_PSYCHIATRIC_FACILITY))
			return V3RoleCode.PSY;
		if(placeOfServiceConcept.equals(PSYCHIATRIC_FACILITY_PARTIAL_HOSPITALIZATION))
			return V3RoleCode.PHU;
		if(placeOfServiceConcept.equals(INDEPENDENT_LAB))
			return V3RoleCode.OUTLAB;
		if(placeOfServiceConcept.equals(EMERGENCY_ROOM_HOSPITAL))
			return V3RoleCode.ER;
		if(placeOfServiceConcept.equals(URGENT_CARE_FACILITY))
			return V3RoleCode.GACH;
		return retVal;
	}
}
