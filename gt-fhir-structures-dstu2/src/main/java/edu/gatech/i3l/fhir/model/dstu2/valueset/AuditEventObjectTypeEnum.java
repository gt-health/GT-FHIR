
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.AuditEventObjectTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum AuditEventObjectTypeEnum {

	/**
	 * Display: <b>Person</b><br>
	 * Code Value: <b>1</b>
	 *
	 * Person
	 */
	PERSON("1", "http://hl7.org/fhir/object-type"),
	
	/**
	 * Display: <b>System Object</b><br>
	 * Code Value: <b>2</b>
	 *
	 * System Object
	 */
	SYSTEM_OBJECT("2", "http://hl7.org/fhir/object-type"),
	
	/**
	 * Display: <b>Organization</b><br>
	 * Code Value: <b>3</b>
	 *
	 * Organization
	 */
	ORGANIZATION("3", "http://hl7.org/fhir/object-type"),
	
	/**
	 * Display: <b>Other</b><br>
	 * Code Value: <b>4</b>
	 *
	 * Other
	 */
	OTHER("4", "http://hl7.org/fhir/object-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AuditEventObjectType
	 */
	public static final String VALUESET_NAME = "AuditEventObjectType";

	private static Map<String, AuditEventObjectTypeEnum> CODE_TO_ENUM = new HashMap<String, AuditEventObjectTypeEnum>();
	private static Map<String, Map<String, AuditEventObjectTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AuditEventObjectTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AuditEventObjectTypeEnum next : AuditEventObjectTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AuditEventObjectTypeEnum>());
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
	public static AuditEventObjectTypeEnum forCode(String theCode) {
		AuditEventObjectTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AuditEventObjectTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<AuditEventObjectTypeEnum>() {
		@Override
		public String toCodeString(AuditEventObjectTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AuditEventObjectTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AuditEventObjectTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AuditEventObjectTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AuditEventObjectTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AuditEventObjectTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
