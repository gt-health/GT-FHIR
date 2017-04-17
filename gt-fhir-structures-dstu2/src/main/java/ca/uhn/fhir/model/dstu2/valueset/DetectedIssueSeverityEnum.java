
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum DetectedIssueSeverityEnum {

	/**
	 * Display: <b>High</b><br>
	 * Code Value: <b>high</b>
	 *
	 * Indicates the issue may be life-threatening or has the potential to cause permanent injury.
	 */
	HIGH("high", "http://hl7.org/fhir/detectedissue-severity"),
	
	/**
	 * Display: <b>Moderate</b><br>
	 * Code Value: <b>moderate</b>
	 *
	 * Indicates the issue may result in noticeable adverse consequences but is unlikely to be life-threatening or cause permanent injury.
	 */
	MODERATE("moderate", "http://hl7.org/fhir/detectedissue-severity"),
	
	/**
	 * Display: <b>Low</b><br>
	 * Code Value: <b>low</b>
	 *
	 * Indicates the issue may result in some adverse consequences but is unlikely to substantially affect the situation of the subject.
	 */
	LOW("low", "http://hl7.org/fhir/detectedissue-severity"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * DetectedIssueSeverity
	 */
	public static final String VALUESET_NAME = "DetectedIssueSeverity";

	private static Map<String, DetectedIssueSeverityEnum> CODE_TO_ENUM = new HashMap<String, DetectedIssueSeverityEnum>();
	private static Map<String, Map<String, DetectedIssueSeverityEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, DetectedIssueSeverityEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (DetectedIssueSeverityEnum next : DetectedIssueSeverityEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, DetectedIssueSeverityEnum>());
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
	public static DetectedIssueSeverityEnum forCode(String theCode) {
		DetectedIssueSeverityEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<DetectedIssueSeverityEnum> VALUESET_BINDER = new IValueSetEnumBinder<DetectedIssueSeverityEnum>() {
		@Override
		public String toCodeString(DetectedIssueSeverityEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(DetectedIssueSeverityEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public DetectedIssueSeverityEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public DetectedIssueSeverityEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, DetectedIssueSeverityEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	DetectedIssueSeverityEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
