
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.GoalPriorityEnum;

import java.util.HashMap;
import java.util.Map;

public enum GoalPriorityEnum {

	/**
	 * Display: <b>high</b><br>
	 * Code Value: <b>high</b>
	 *
	 * Indicates that the goal is of considerable importance and should be a primary focus of care delivery.
	 */
	HIGH("high", "http://hl7.org/fhir/goal-priority"),
	
	/**
	 * Display: <b>medium</b><br>
	 * Code Value: <b>medium</b>
	 *
	 * Indicates that the goal has a reasonable degree of importance and that concrete action should be taken towards the goal.  Attainment is not as critical as high-priority goals.
	 */
	MEDIUM("medium", "http://hl7.org/fhir/goal-priority"),
	
	/**
	 * Display: <b>low</b><br>
	 * Code Value: <b>low</b>
	 *
	 * The goal is desirable but is not sufficiently important to devote significant resources to.  Achievement of the goal may be sought when incidental to achieving other goals.
	 */
	LOW("low", "http://hl7.org/fhir/goal-priority"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * GoalPriority
	 */
	public static final String VALUESET_NAME = "GoalPriority";

	private static Map<String, GoalPriorityEnum> CODE_TO_ENUM = new HashMap<String, GoalPriorityEnum>();
	private static Map<String, Map<String, GoalPriorityEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, GoalPriorityEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (GoalPriorityEnum next : GoalPriorityEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, GoalPriorityEnum>());
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
	public static GoalPriorityEnum forCode(String theCode) {
		GoalPriorityEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<GoalPriorityEnum> VALUESET_BINDER = new IValueSetEnumBinder<GoalPriorityEnum>() {
		@Override
		public String toCodeString(GoalPriorityEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(GoalPriorityEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public GoalPriorityEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public GoalPriorityEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, GoalPriorityEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	GoalPriorityEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
