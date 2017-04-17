
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum NamingSystemTypeEnum {

	/**
	 * Display: <b>Code System</b><br>
	 * Code Value: <b>codesystem</b>
	 *
	 * The naming system is used to define concepts and symbols to represent those concepts; e.g. UCUM, LOINC, NDC code, local lab codes, etc.
	 */
	CODE_SYSTEM("codesystem", "http://hl7.org/fhir/namingsystem-type"),
	
	/**
	 * Display: <b>Identifier</b><br>
	 * Code Value: <b>identifier</b>
	 *
	 * The naming system is used to manage identifiers (e.g. license numbers, order numbers, etc.).
	 */
	IDENTIFIER("identifier", "http://hl7.org/fhir/namingsystem-type"),
	
	/**
	 * Display: <b>Root</b><br>
	 * Code Value: <b>root</b>
	 *
	 * The naming system is used as the root for other identifiers and naming systems.
	 */
	ROOT("root", "http://hl7.org/fhir/namingsystem-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * NamingSystemType
	 */
	public static final String VALUESET_NAME = "NamingSystemType";

	private static Map<String, NamingSystemTypeEnum> CODE_TO_ENUM = new HashMap<String, NamingSystemTypeEnum>();
	private static Map<String, Map<String, NamingSystemTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, NamingSystemTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (NamingSystemTypeEnum next : NamingSystemTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, NamingSystemTypeEnum>());
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
	public static NamingSystemTypeEnum forCode(String theCode) {
		NamingSystemTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<NamingSystemTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<NamingSystemTypeEnum>() {
		@Override
		public String toCodeString(NamingSystemTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(NamingSystemTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public NamingSystemTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public NamingSystemTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, NamingSystemTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	NamingSystemTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
