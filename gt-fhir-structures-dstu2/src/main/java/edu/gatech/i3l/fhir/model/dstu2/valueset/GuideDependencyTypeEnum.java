
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.GuideDependencyTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum GuideDependencyTypeEnum {

	/**
	 * Display: <b>Reference</b><br>
	 * Code Value: <b>reference</b>
	 *
	 * The guide is referred to by URL.
	 */
	REFERENCE("reference", "http://hl7.org/fhir/guide-dependency-type"),
	
	/**
	 * Display: <b>Inclusion</b><br>
	 * Code Value: <b>inclusion</b>
	 *
	 * The guide is embedded in this guide when published.
	 */
	INCLUSION("inclusion", "http://hl7.org/fhir/guide-dependency-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * GuideDependencyType
	 */
	public static final String VALUESET_NAME = "GuideDependencyType";

	private static Map<String, GuideDependencyTypeEnum> CODE_TO_ENUM = new HashMap<String, GuideDependencyTypeEnum>();
	private static Map<String, Map<String, GuideDependencyTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, GuideDependencyTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (GuideDependencyTypeEnum next : GuideDependencyTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, GuideDependencyTypeEnum>());
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
	public static GuideDependencyTypeEnum forCode(String theCode) {
		GuideDependencyTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<GuideDependencyTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<GuideDependencyTypeEnum>() {
		@Override
		public String toCodeString(GuideDependencyTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(GuideDependencyTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public GuideDependencyTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public GuideDependencyTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, GuideDependencyTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	GuideDependencyTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
