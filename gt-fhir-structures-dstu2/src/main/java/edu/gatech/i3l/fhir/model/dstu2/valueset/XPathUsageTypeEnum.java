
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.XPathUsageTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum XPathUsageTypeEnum {

	/**
	 * Display: <b>Normal</b><br>
	 * Code Value: <b>normal</b>
	 *
	 * The search parameter is derived directly from the selected nodes based on the type definitions.
	 */
	NORMAL("normal", "http://hl7.org/fhir/search-xpath-usage"),
	
	/**
	 * Display: <b>Phonetic</b><br>
	 * Code Value: <b>phonetic</b>
	 *
	 * The search parameter is derived by a phonetic transform from the selected nodes.
	 */
	PHONETIC("phonetic", "http://hl7.org/fhir/search-xpath-usage"),
	
	/**
	 * Display: <b>Nearby</b><br>
	 * Code Value: <b>nearby</b>
	 *
	 * The search parameter is based on a spatial transform of the selected nodes.
	 */
	NEARBY("nearby", "http://hl7.org/fhir/search-xpath-usage"),
	
	/**
	 * Display: <b>Distance</b><br>
	 * Code Value: <b>distance</b>
	 *
	 * The search parameter is based on a spatial transform of the selected nodes, using physical distance from the middle.
	 */
	DISTANCE("distance", "http://hl7.org/fhir/search-xpath-usage"),
	
	/**
	 * Display: <b>Other</b><br>
	 * Code Value: <b>other</b>
	 *
	 * The interpretation of the xpath statement is unknown (and can't be automated).
	 */
	OTHER("other", "http://hl7.org/fhir/search-xpath-usage"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * XPathUsageType
	 */
	public static final String VALUESET_NAME = "XPathUsageType";

	private static Map<String, XPathUsageTypeEnum> CODE_TO_ENUM = new HashMap<String, XPathUsageTypeEnum>();
	private static Map<String, Map<String, XPathUsageTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, XPathUsageTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (XPathUsageTypeEnum next : XPathUsageTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, XPathUsageTypeEnum>());
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
	public static XPathUsageTypeEnum forCode(String theCode) {
		XPathUsageTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<XPathUsageTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<XPathUsageTypeEnum>() {
		@Override
		public String toCodeString(XPathUsageTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(XPathUsageTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public XPathUsageTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public XPathUsageTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, XPathUsageTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	XPathUsageTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
