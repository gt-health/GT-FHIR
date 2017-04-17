
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ContentTypeEnum {

	/**
	 * Display: <b>xml</b><br>
	 * Code Value: <b>xml</b>
	 *
	 * XML content-type corresponding to the application/xml+fhir mime-type.
	 */
	XML("xml", "http://hl7.org/fhir/content-type"),
	
	/**
	 * Display: <b>json</b><br>
	 * Code Value: <b>json</b>
	 *
	 * JSON content-type corresponding to the application/json+fhir mime-type.
	 */
	JSON("json", "http://hl7.org/fhir/content-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ContentType
	 */
	public static final String VALUESET_NAME = "ContentType";

	private static Map<String, ContentTypeEnum> CODE_TO_ENUM = new HashMap<String, ContentTypeEnum>();
	private static Map<String, Map<String, ContentTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ContentTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ContentTypeEnum next : ContentTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ContentTypeEnum>());
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
	public static ContentTypeEnum forCode(String theCode) {
		ContentTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ContentTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<ContentTypeEnum>() {
		@Override
		public String toCodeString(ContentTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ContentTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ContentTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ContentTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ContentTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ContentTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
