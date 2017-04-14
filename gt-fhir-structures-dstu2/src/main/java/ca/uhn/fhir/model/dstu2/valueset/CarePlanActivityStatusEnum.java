
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum CarePlanActivityStatusEnum {

	/**
	 * Display: <b>Not Started</b><br>
	 * Code Value: <b>not-started</b>
	 *
	 * Activity is planned but no action has yet been taken.
	 */
	NOT_STARTED("not-started", "http://hl7.org/fhir/care-plan-activity-status"),
	
	/**
	 * Display: <b>Scheduled</b><br>
	 * Code Value: <b>scheduled</b>
	 *
	 * Appointment or other booking has occurred but activity has not yet begun.
	 */
	SCHEDULED("scheduled", "http://hl7.org/fhir/care-plan-activity-status"),
	
	/**
	 * Display: <b>In Progress</b><br>
	 * Code Value: <b>in-progress</b>
	 *
	 * Activity has been started but is not yet complete.
	 */
	IN_PROGRESS("in-progress", "http://hl7.org/fhir/care-plan-activity-status"),
	
	/**
	 * Display: <b>On Hold</b><br>
	 * Code Value: <b>on-hold</b>
	 *
	 * Activity was started but has temporarily ceased with an expectation of resumption at a future time.
	 */
	ON_HOLD("on-hold", "http://hl7.org/fhir/care-plan-activity-status"),
	
	/**
	 * Display: <b>Completed</b><br>
	 * Code Value: <b>completed</b>
	 *
	 * The activities have been completed (more or less) as planned.
	 */
	COMPLETED("completed", "http://hl7.org/fhir/care-plan-activity-status"),
	
	/**
	 * Display: <b>Cancelled</b><br>
	 * Code Value: <b>cancelled</b>
	 *
	 * The activities have been ended prior to completion (perhaps even before they were started).
	 */
	CANCELLED("cancelled", "http://hl7.org/fhir/care-plan-activity-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * CarePlanActivityStatus
	 */
	public static final String VALUESET_NAME = "CarePlanActivityStatus";

	private static Map<String, CarePlanActivityStatusEnum> CODE_TO_ENUM = new HashMap<String, CarePlanActivityStatusEnum>();
	private static Map<String, Map<String, CarePlanActivityStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, CarePlanActivityStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (CarePlanActivityStatusEnum next : CarePlanActivityStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, CarePlanActivityStatusEnum>());
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
	public static CarePlanActivityStatusEnum forCode(String theCode) {
		CarePlanActivityStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<CarePlanActivityStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<CarePlanActivityStatusEnum>() {
		@Override
		public String toCodeString(CarePlanActivityStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(CarePlanActivityStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public CarePlanActivityStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public CarePlanActivityStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, CarePlanActivityStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	CarePlanActivityStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
