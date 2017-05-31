
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ConditionalDeleteStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum ConditionalDeleteStatusEnum {

	/**
	 * Display: <b>Not Supported</b><br>
	 * Code Value: <b>not-supported</b>
	 *
	 * No support for conditional deletes.
	 */
	NOT_SUPPORTED("not-supported", "http://hl7.org/fhir/conditional-delete-status"),
	
	/**
	 * Display: <b>Single Deletes Supported</b><br>
	 * Code Value: <b>single</b>
	 *
	 * Conditional deletes are supported, but only single resources at a time.
	 */
	SINGLE_DELETES_SUPPORTED("single", "http://hl7.org/fhir/conditional-delete-status"),
	
	/**
	 * Display: <b>Multiple Deletes Supported</b><br>
	 * Code Value: <b>multiple</b>
	 *
	 * Conditional deletes are supported, and multiple resources can be deleted in a single interaction.
	 */
	MULTIPLE_DELETES_SUPPORTED("multiple", "http://hl7.org/fhir/conditional-delete-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ConditionalDeleteStatus
	 */
	public static final String VALUESET_NAME = "ConditionalDeleteStatus";

	private static Map<String, ConditionalDeleteStatusEnum> CODE_TO_ENUM = new HashMap<String, ConditionalDeleteStatusEnum>();
	private static Map<String, Map<String, ConditionalDeleteStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ConditionalDeleteStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ConditionalDeleteStatusEnum next : ConditionalDeleteStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ConditionalDeleteStatusEnum>());
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
	public static ConditionalDeleteStatusEnum forCode(String theCode) {
		ConditionalDeleteStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ConditionalDeleteStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<ConditionalDeleteStatusEnum>() {
		@Override
		public String toCodeString(ConditionalDeleteStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ConditionalDeleteStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ConditionalDeleteStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ConditionalDeleteStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ConditionalDeleteStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ConditionalDeleteStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
