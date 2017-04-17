
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum BindingStrengthEnum {

	/**
	 * Display: <b>Required</b><br>
	 * Code Value: <b>required</b>
	 *
	 * To be conformant, instances of this element SHALL include a code from the specified value set.
	 */
	REQUIRED("required", "http://hl7.org/fhir/binding-strength"),
	
	/**
	 * Display: <b>Extensible</b><br>
	 * Code Value: <b>extensible</b>
	 *
	 * To be conformant, instances of this element SHALL include a code from the specified value set if any of the codes within the value set can apply to the concept being communicated.  If the valueset does not cover the concept (based on human review), alternate codings (or, data type allowing, text) may be included instead.
	 */
	EXTENSIBLE("extensible", "http://hl7.org/fhir/binding-strength"),
	
	/**
	 * Display: <b>Preferred</b><br>
	 * Code Value: <b>preferred</b>
	 *
	 * Instances are encouraged to draw from the specified codes for interoperability purposes but are not required to do so to be considered conformant.
	 */
	PREFERRED("preferred", "http://hl7.org/fhir/binding-strength"),
	
	/**
	 * Display: <b>Example</b><br>
	 * Code Value: <b>example</b>
	 *
	 * Instances are not expected or even encouraged to draw from the specified value set.  The value set merely provides examples of the types of concepts intended to be included.
	 */
	EXAMPLE("example", "http://hl7.org/fhir/binding-strength"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * BindingStrength
	 */
	public static final String VALUESET_NAME = "BindingStrength";

	private static Map<String, BindingStrengthEnum> CODE_TO_ENUM = new HashMap<String, BindingStrengthEnum>();
	private static Map<String, Map<String, BindingStrengthEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, BindingStrengthEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (BindingStrengthEnum next : BindingStrengthEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, BindingStrengthEnum>());
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
	public static BindingStrengthEnum forCode(String theCode) {
		BindingStrengthEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<BindingStrengthEnum> VALUESET_BINDER = new IValueSetEnumBinder<BindingStrengthEnum>() {
		@Override
		public String toCodeString(BindingStrengthEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(BindingStrengthEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public BindingStrengthEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public BindingStrengthEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, BindingStrengthEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	BindingStrengthEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
