
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.EncounterClassEnum;

import java.util.HashMap;
import java.util.Map;

public enum EncounterClassEnum {

	/**
	 * Display: <b>Inpatient</b><br>
	 * Code Value: <b>inpatient</b>
	 *
	 * An encounter during which the patient is hospitalized and stays overnight.
	 */
	INPATIENT("inpatient", "http://hl7.org/fhir/encounter-class"),
	
	/**
	 * Display: <b>Outpatient</b><br>
	 * Code Value: <b>outpatient</b>
	 *
	 * An encounter during which the patient is not hospitalized overnight.
	 */
	OUTPATIENT("outpatient", "http://hl7.org/fhir/encounter-class"),
	
	/**
	 * Display: <b>Ambulatory</b><br>
	 * Code Value: <b>ambulatory</b>
	 *
	 * An encounter where the patient visits the practitioner in his/her office, e.g. a G.P. visit.
	 */
	AMBULATORY("ambulatory", "http://hl7.org/fhir/encounter-class"),
	
	/**
	 * Display: <b>Emergency</b><br>
	 * Code Value: <b>emergency</b>
	 *
	 * An encounter in the Emergency Care Department.
	 */
	EMERGENCY("emergency", "http://hl7.org/fhir/encounter-class"),
	
	/**
	 * Display: <b>Home</b><br>
	 * Code Value: <b>home</b>
	 *
	 * An encounter where the practitioner visits the patient at his/her home.
	 */
	HOME("home", "http://hl7.org/fhir/encounter-class"),
	
	/**
	 * Display: <b>Field</b><br>
	 * Code Value: <b>field</b>
	 *
	 * An encounter taking place outside the regular environment for giving care.
	 */
	FIELD("field", "http://hl7.org/fhir/encounter-class"),
	
	/**
	 * Display: <b>Daytime</b><br>
	 * Code Value: <b>daytime</b>
	 *
	 * An encounter where the patient needs more prolonged treatment or investigations than outpatients, but who do not need to stay in the hospital overnight.
	 */
	DAYTIME("daytime", "http://hl7.org/fhir/encounter-class"),
	
	/**
	 * Display: <b>Virtual</b><br>
	 * Code Value: <b>virtual</b>
	 *
	 * An encounter that takes place where the patient and practitioner do not physically meet but use electronic means for contact.
	 */
	VIRTUAL("virtual", "http://hl7.org/fhir/encounter-class"),
	
	/**
	 * Display: <b>Other</b><br>
	 * Code Value: <b>other</b>
	 *
	 * Any other encounter type that is not described by one of the other values. Where this is used it is expected that an implementer will include an extension value to define what the actual other type is.
	 */
	OTHER("other", "http://hl7.org/fhir/encounter-class"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * EncounterClass
	 */
	public static final String VALUESET_NAME = "EncounterClass";

	private static Map<String, EncounterClassEnum> CODE_TO_ENUM = new HashMap<String, EncounterClassEnum>();
	private static Map<String, Map<String, EncounterClassEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, EncounterClassEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (EncounterClassEnum next : EncounterClassEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, EncounterClassEnum>());
			}
			SYSTEM_TO_CODE_TO_ENUM.get(next.getSystem()).put(next.getCode(), next);			
		}
	}
	
	/**
	 * Returns the code associated with this enumerated value
	 */
	public String getCode() {
		return myCode;
	}
	
	/**
	 * Returns the code system associated with this enumerated value
	 */
	public String getSystem() {
		return mySystem;
	}
	
	/**
	 * Returns the enumerated value associated with this code
	 */
	public static EncounterClassEnum forCode(String theCode) {
		EncounterClassEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<EncounterClassEnum> VALUESET_BINDER = new IValueSetEnumBinder<EncounterClassEnum>() {
		@Override
		public String toCodeString(EncounterClassEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(EncounterClassEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public EncounterClassEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public EncounterClassEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, EncounterClassEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	EncounterClassEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
