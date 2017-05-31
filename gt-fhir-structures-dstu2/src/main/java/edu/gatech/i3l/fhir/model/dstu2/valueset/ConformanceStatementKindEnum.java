
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ConformanceStatementKindEnum;

import java.util.HashMap;
import java.util.Map;

public enum ConformanceStatementKindEnum {

	/**
	 * Display: <b>Instance</b><br>
	 * Code Value: <b>instance</b>
	 *
	 * The Conformance instance represents the present capabilities of a specific system instance.  This is the kind returned by OPTIONS for a FHIR server end-point.
	 */
	INSTANCE("instance", "http://hl7.org/fhir/conformance-statement-kind"),
	
	/**
	 * Display: <b>Capability</b><br>
	 * Code Value: <b>capability</b>
	 *
	 * The Conformance instance represents the capabilities of a system or piece of software, independent of a particular installation.
	 */
	CAPABILITY("capability", "http://hl7.org/fhir/conformance-statement-kind"),
	
	/**
	 * Display: <b>Requirements</b><br>
	 * Code Value: <b>requirements</b>
	 *
	 * The Conformance instance represents a set of requirements for other systems to meet; e.g. as part of an implementation guide or 'request for proposal'.
	 */
	REQUIREMENTS("requirements", "http://hl7.org/fhir/conformance-statement-kind"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ConformanceStatementKind
	 */
	public static final String VALUESET_NAME = "ConformanceStatementKind";

	private static Map<String, ConformanceStatementKindEnum> CODE_TO_ENUM = new HashMap<String, ConformanceStatementKindEnum>();
	private static Map<String, Map<String, ConformanceStatementKindEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ConformanceStatementKindEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ConformanceStatementKindEnum next : ConformanceStatementKindEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ConformanceStatementKindEnum>());
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
	public static ConformanceStatementKindEnum forCode(String theCode) {
		ConformanceStatementKindEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ConformanceStatementKindEnum> VALUESET_BINDER = new IValueSetEnumBinder<ConformanceStatementKindEnum>() {
		@Override
		public String toCodeString(ConformanceStatementKindEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ConformanceStatementKindEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ConformanceStatementKindEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ConformanceStatementKindEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ConformanceStatementKindEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ConformanceStatementKindEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
