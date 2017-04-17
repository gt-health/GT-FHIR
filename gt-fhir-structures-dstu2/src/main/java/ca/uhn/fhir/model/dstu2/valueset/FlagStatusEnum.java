
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum FlagStatusEnum {

	/**
	 * Display: <b>Active</b><br>
	 * Code Value: <b>active</b>
	 *
	 * A current flag that should be displayed to a user. A system may use the category to determine which roles should view the flag.
	 */
	ACTIVE("active", "http://hl7.org/fhir/flag-status"),
	
	/**
	 * Display: <b>Inactive</b><br>
	 * Code Value: <b>inactive</b>
	 *
	 * The flag does not need to be displayed any more.
	 */
	INACTIVE("inactive", "http://hl7.org/fhir/flag-status"),
	
	/**
	 * Display: <b>Entered in Error</b><br>
	 * Code Value: <b>entered-in-error</b>
	 *
	 * The flag was added in error, and should no longer be displayed.
	 */
	ENTERED_IN_ERROR("entered-in-error", "http://hl7.org/fhir/flag-status"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * FlagStatus
	 */
	public static final String VALUESET_NAME = "FlagStatus";

	private static Map<String, FlagStatusEnum> CODE_TO_ENUM = new HashMap<String, FlagStatusEnum>();
	private static Map<String, Map<String, FlagStatusEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, FlagStatusEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (FlagStatusEnum next : FlagStatusEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, FlagStatusEnum>());
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
	public static FlagStatusEnum forCode(String theCode) {
		FlagStatusEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<FlagStatusEnum> VALUESET_BINDER = new IValueSetEnumBinder<FlagStatusEnum>() {
		@Override
		public String toCodeString(FlagStatusEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(FlagStatusEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public FlagStatusEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public FlagStatusEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, FlagStatusEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	FlagStatusEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
