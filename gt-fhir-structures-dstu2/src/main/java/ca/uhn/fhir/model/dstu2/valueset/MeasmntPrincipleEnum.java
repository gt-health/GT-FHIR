
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum MeasmntPrincipleEnum {

	/**
	 * Display: <b>MSP Other</b><br>
	 * Code Value: <b>other</b>
	 *
	 * Measurement principle isn't in the list.
	 */
	MSP_OTHER("other", "http://hl7.org/fhir/measurement-principle"),
	
	/**
	 * Display: <b>MSP Chemical</b><br>
	 * Code Value: <b>chemical</b>
	 *
	 * Measurement is done using the chemical principle.
	 */
	MSP_CHEMICAL("chemical", "http://hl7.org/fhir/measurement-principle"),
	
	/**
	 * Display: <b>MSP Electrical</b><br>
	 * Code Value: <b>electrical</b>
	 *
	 * Measurement is done using the electrical principle.
	 */
	MSP_ELECTRICAL("electrical", "http://hl7.org/fhir/measurement-principle"),
	
	/**
	 * Display: <b>MSP Impedance</b><br>
	 * Code Value: <b>impedance</b>
	 *
	 * Measurement is done using the impedance principle.
	 */
	MSP_IMPEDANCE("impedance", "http://hl7.org/fhir/measurement-principle"),
	
	/**
	 * Display: <b>MSP Nuclear</b><br>
	 * Code Value: <b>nuclear</b>
	 *
	 * Measurement is done using the nuclear principle.
	 */
	MSP_NUCLEAR("nuclear", "http://hl7.org/fhir/measurement-principle"),
	
	/**
	 * Display: <b>MSP Optical</b><br>
	 * Code Value: <b>optical</b>
	 *
	 * Measurement is done using the optical principle.
	 */
	MSP_OPTICAL("optical", "http://hl7.org/fhir/measurement-principle"),
	
	/**
	 * Display: <b>MSP Thermal</b><br>
	 * Code Value: <b>thermal</b>
	 *
	 * Measurement is done using the thermal principle.
	 */
	MSP_THERMAL("thermal", "http://hl7.org/fhir/measurement-principle"),
	
	/**
	 * Display: <b>MSP Biological</b><br>
	 * Code Value: <b>biological</b>
	 *
	 * Measurement is done using the biological principle.
	 */
	MSP_BIOLOGICAL("biological", "http://hl7.org/fhir/measurement-principle"),
	
	/**
	 * Display: <b>MSP Mechanical</b><br>
	 * Code Value: <b>mechanical</b>
	 *
	 * Measurement is done using the mechanical principle.
	 */
	MSP_MECHANICAL("mechanical", "http://hl7.org/fhir/measurement-principle"),
	
	/**
	 * Display: <b>MSP Acoustical</b><br>
	 * Code Value: <b>acoustical</b>
	 *
	 * Measurement is done using the acoustical principle.
	 */
	MSP_ACOUSTICAL("acoustical", "http://hl7.org/fhir/measurement-principle"),
	
	/**
	 * Display: <b>MSP Manual</b><br>
	 * Code Value: <b>manual</b>
	 *
	 * Measurement is done using the manual principle.
	 */
	MSP_MANUAL("manual", "http://hl7.org/fhir/measurement-principle"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * Measmnt-Principle
	 */
	public static final String VALUESET_NAME = "Measmnt-Principle";

	private static Map<String, MeasmntPrincipleEnum> CODE_TO_ENUM = new HashMap<String, MeasmntPrincipleEnum>();
	private static Map<String, Map<String, MeasmntPrincipleEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, MeasmntPrincipleEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (MeasmntPrincipleEnum next : MeasmntPrincipleEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, MeasmntPrincipleEnum>());
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
	public static MeasmntPrincipleEnum forCode(String theCode) {
		MeasmntPrincipleEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<MeasmntPrincipleEnum> VALUESET_BINDER = new IValueSetEnumBinder<MeasmntPrincipleEnum>() {
		@Override
		public String toCodeString(MeasmntPrincipleEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(MeasmntPrincipleEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public MeasmntPrincipleEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public MeasmntPrincipleEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, MeasmntPrincipleEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	MeasmntPrincipleEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
