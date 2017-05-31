
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ClinicalImpressionStatusEnum;

import java.util.HashMap;
import java.util.Map;

public enum ClinicalImpressionStatusEnum {

	/**
	 * Display: <b>In progress</b><br>
	 * Code Value: <b>in-progress</b>
	 *
	 * The assessment is still on-going and results are not yet final.
	 */
	IN_PROGRESS("in-progress", "http://hl7.org/fhir/clinical-impression-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * The assessment is done and the results are final.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/clinical-impression-status"),
	
	/**
	 * Display: <b>Entered in Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * This assessment was never actually done and the record is erroneous (e.g. Wrong patient).
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/clinical-impression-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ClinicalImpressionStatus
	 */
	public static final String VALUESET_NAME = "ClinicalImpressionStatus";

	private static Map<String, ClinicalImpressionStatusEnum> CODE_TO_ENUM = new HashMap<String, ClinicalImpressionStatusEnum>();
	private static Map<String, Map<String, ClinicalImpressionStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ClinicalImpressionStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ClinicalImpressionStatusEnum next : ClinicalImpressionStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ClinicalImpressionStatusEnum>());
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
	public static ClinicalImpressionStatusEnum forCode(String theCode) {
		ClinicalImpressionStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ClinicalImpressionStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<ClinicalImpressionStatusEnum>() {
		@Override
		public String toCodeString(ClinicalImpressionStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ClinicalImpressionStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ClinicalImpressionStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ClinicalImpressionStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ClinicalImpressionStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ClinicalImpressionStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
