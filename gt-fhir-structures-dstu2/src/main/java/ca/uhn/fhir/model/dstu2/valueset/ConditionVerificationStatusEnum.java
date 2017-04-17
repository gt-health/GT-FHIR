
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ConditionVerificationStatusEnum {

	/**
	 * Display: <b>Provisional</b><br>
	 * Code Value: <b>provisional</b>
	 *
	 * This is a tentative diagnosis - still a candidate that is under consideration.
	 */
	PROVISIONAL("provisional", "http://hl7.org/fhir/condition-ver-status"),
	
	/**
	 * Display: <b>Differential</b><br>
	 * Code Value: <b>differential</b>
	 *
	 * One of a set of potential (and typically mutually exclusive) diagnosis asserted to further guide the diagnostic process and preliminary treatment.
	 */
	DIFFERENTIAL("differential", "http://hl7.org/fhir/condition-ver-status"),
	
	/**
	 * Display: <b>Confirmed</b><br>
	 * Code Value: <b>confirmed</b>
	 *
	 * There is sufficient diagnostic and/or clinical evidence to treat this as a confirmed condition.
	 */
	CONFIRMED("confirmed", "http://hl7.org/fhir/condition-ver-status"),
	
	/**
	 * Display: <b>Refuted</b><br>
	 * Code Value: <b>refuted</b>
	 *
	 * This condition has been ruled out by diagnostic and clinical evidence.
	 */
	REFUTED("refuted", "http://hl7.org/fhir/condition-ver-status"),
	
	/**
	 * Display: <b>Entered In Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The statement was entered in error and is not valid.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/condition-ver-status"),
	
	/**
	 * Display: <b>Unknown</b><br>
	 * Code Value: <b>unknown</b>
	 *
	 * The condition status is unknown.  Note that "unknown" is a value of last resort and every attempt should be made to provide a meaningful value other than "unknown".
	 */
	UNKNOWN("unknown", "http://hl7.org/fhir/condition-ver-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ConditionVerificationStatus
	 */
	public static final String VALUESET_NAME = "ConditionVerificationStatus";

	private static Map<String, ConditionVerificationStatusEnum> CODE_TO_ENUM = new HashMap<String, ConditionVerificationStatusEnum>();
	private static Map<String, Map<String, ConditionVerificationStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ConditionVerificationStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ConditionVerificationStatusEnum next : ConditionVerificationStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ConditionVerificationStatusEnum>());
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
	public static ConditionVerificationStatusEnum forCode(String theCode) {
		ConditionVerificationStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ConditionVerificationStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<ConditionVerificationStatusEnum>() {
		@Override
		public String toCodeString(ConditionVerificationStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ConditionVerificationStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ConditionVerificationStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ConditionVerificationStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ConditionVerificationStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ConditionVerificationStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
