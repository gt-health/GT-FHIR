
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.GroupTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum GroupTypeEnum {

	/**
	 * Display: <b>Person</b><br>
	 * Code Value: <b>person</b>
	 *
	 * Group contains "person" Patient resources
	 */
	PERSON("person", "http://hl7.org/fhir/group-type"),
	
	/**
	 * Display: <b>Animal</b><br>
	 * Code Value: <b>animal</b>
	 *
	 * Group contains "animal" Patient resources
	 */
	ANIMAL("animal", "http://hl7.org/fhir/group-type"),
	
	/**
	 * Display: <b>Practitioner</b><br>
	 * Code Value: <b>practitioner</b>
	 *
	 * Group contains healthcare practitioner resources
	 */
	PRACTITIONER("practitioner", "http://hl7.org/fhir/group-type"),
	
	/**
	 * Display: <b>Device</b><br>
	 * Code Value: <b>device</b>
	 *
	 * Group contains Device resources
	 */
	DEVICE("device", "http://hl7.org/fhir/group-type"),
	
	/**
	 * Display: <b>Medication</b><br>
	 * Code Value: <b>medication</b>
	 *
	 * Group contains Medication resources
	 */
	MEDICATION("medication", "http://hl7.org/fhir/group-type"),
	
	/**
	 * Display: <b>Substance</b><br>
	 * Code Value: <b>substance</b>
	 *
	 * Group contains Substance resources
	 */
	SUBSTANCE("substance", "http://hl7.org/fhir/group-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * GroupType
	 */
	public static final String VALUESET_NAME = "GroupType";

	private static Map<String, GroupTypeEnum> CODE_TO_ENUM = new HashMap<String, GroupTypeEnum>();
	private static Map<String, Map<String, GroupTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, GroupTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (GroupTypeEnum next : GroupTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, GroupTypeEnum>());
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
	public static GroupTypeEnum forCode(String theCode) {
		GroupTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<GroupTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<GroupTypeEnum>() {
		@Override
		public String toCodeString(GroupTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(GroupTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public GroupTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public GroupTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, GroupTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	GroupTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
