
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum GuideResourcePurposeEnum {

	/**
	 * Display: <b>Example</b><br>
	 * Code Value: <b>example</b>
	 *
	 * The resource is intended as an example.
	 */
	EXAMPLE("example", "http://hl7.org/fhir/guide-resource-purpose"),
	
	/**
	 * Display: <b>Terminology</b><br>
	 * Code Value: <b>terminology</b>
	 *
	 * The resource defines a value set or concept map used in the implementation guide.
	 */
	TERMINOLOGY("terminology", "http://hl7.org/fhir/guide-resource-purpose"),
	
	/**
	 * Display: <b>Profile</b><br>
	 * Code Value: <b>profile</b>
	 *
	 * The resource defines a profile (StructureDefinition) that is used in the implementation guide.
	 */
	PROFILE("profile", "http://hl7.org/fhir/guide-resource-purpose"),
	
	/**
	 * Display: <b>Extension</b><br>
	 * Code Value: <b>extension</b>
	 *
	 * The resource defines an extension (StructureDefinition) that is used in the implementation guide.
	 */
	EXTENSION("extension", "http://hl7.org/fhir/guide-resource-purpose"),
	
	/**
	 * Display: <b>Dictionary</b><br>
	 * Code Value: <b>dictionary</b>
	 *
	 * The resource contains a dictionary that is part of the implementation guide.
	 */
	DICTIONARY("dictionary", "http://hl7.org/fhir/guide-resource-purpose"),
	
	/**
	 * Display: <b>Logical Model</b><br>
	 * Code Value: <b>logical</b>
	 *
	 * The resource defines a logical model (in a StructureDefinition) that is used in the implementation guide.
	 */
	LOGICAL_MODEL("logical", "http://hl7.org/fhir/guide-resource-purpose"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * GuideResourcePurpose
	 */
	public static final String VALUESET_NAME = "GuideResourcePurpose";

	private static Map<String, GuideResourcePurposeEnum> CODE_TO_ENUM = new HashMap<String, GuideResourcePurposeEnum>();
	private static Map<String, Map<String, GuideResourcePurposeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, GuideResourcePurposeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (GuideResourcePurposeEnum next : GuideResourcePurposeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, GuideResourcePurposeEnum>());
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
	public static GuideResourcePurposeEnum forCode(String theCode) {
		GuideResourcePurposeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<GuideResourcePurposeEnum> VALUESET_BINDER = new IValueSetEnumBinder<GuideResourcePurposeEnum>() {
		@Override
		public String toCodeString(GuideResourcePurposeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(GuideResourcePurposeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public GuideResourcePurposeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public GuideResourcePurposeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, GuideResourcePurposeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	GuideResourcePurposeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
