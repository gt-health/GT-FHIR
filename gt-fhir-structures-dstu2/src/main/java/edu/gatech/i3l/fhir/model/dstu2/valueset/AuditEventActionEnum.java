
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.AuditEventActionEnum;

import java.util.HashMap;
import java.util.Map;

public enum AuditEventActionEnum {

	/**
	 * Display: <b>Create</b><br>
	 * Code Value: <b>C</b>
	 *
	 * Create a new database object, such as placing an order.
	 */
	CREATE("C", "http://hl7.org/fhir/audit-event-action"),
	
	/**
	 * Display: <b>Read/View/Print</b><br>
	 * Code Value: <b>R</b>
	 *
	 * Display or print data, such as a doctor census.
	 */
	READ_VIEW_PRINT("R", "http://hl7.org/fhir/audit-event-action"),
	
	/**
	 * Display: <b>Update</b><br>
	 * Code Value: <b>U</b>
	 *
	 * Update data, such as revise patient information.
	 */
	UPDATE("U", "http://hl7.org/fhir/audit-event-action"),
	
	/**
	 * Display: <b>Delete</b><br>
	 * Code Value: <b>D</b>
	 *
	 * Delete items, such as a doctor master file record.
	 */
	DELETE("D", "http://hl7.org/fhir/audit-event-action"),
	
	/**
	 * Display: <b>Execute</b><br>
	 * Code Value: <b>E</b>
	 *
	 * Perform a system or application function such as log-on, program execution or use of an object's method, or perform a query/search operation.
	 */
	EXECUTE("E", "http://hl7.org/fhir/audit-event-action"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AuditEventAction
	 */
	public static final String VALUESET_NAME = "AuditEventAction";

	private static Map<String, AuditEventActionEnum> CODE_TO_ENUM = new HashMap<String, AuditEventActionEnum>();
	private static Map<String, Map<String, AuditEventActionEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AuditEventActionEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AuditEventActionEnum next : AuditEventActionEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AuditEventActionEnum>());
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
	public static AuditEventActionEnum forCode(String theCode) {
		AuditEventActionEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AuditEventActionEnum> VALUESET_BINDER = new IValueSetEnumBinder<AuditEventActionEnum>() {
		@Override
		public String toCodeString(AuditEventActionEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AuditEventActionEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AuditEventActionEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AuditEventActionEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AuditEventActionEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AuditEventActionEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
