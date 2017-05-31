
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.DigitalMediaTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum DigitalMediaTypeEnum {

	/**
	 * Display: <b>Photo</b><br>
	 * Code Value: <b>photo</b>
	 *
	 * The media consists of one or more unmoving images, including photographs, computer-generated graphs and charts, and scanned documents
	 */
	PHOTO("photo", "http://hl7.org/fhir/digital-media-type"),
	
	/**
	 * Display: <b>Video</b><br>
	 * Code Value: <b>video</b>
	 *
	 * The media consists of a series of frames that capture a moving image
	 */
	VIDEO("video", "http://hl7.org/fhir/digital-media-type"),
	
	/**
	 * Display: <b>Audio</b><br>
	 * Code Value: <b>audio</b>
	 *
	 * The media consists of a sound recording
	 */
	AUDIO("audio", "http://hl7.org/fhir/digital-media-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * DigitalMediaType
	 */
	public static final String VALUESET_NAME = "DigitalMediaType";

	private static Map<String, DigitalMediaTypeEnum> CODE_TO_ENUM = new HashMap<String, DigitalMediaTypeEnum>();
	private static Map<String, Map<String, DigitalMediaTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, DigitalMediaTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (DigitalMediaTypeEnum next : DigitalMediaTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, DigitalMediaTypeEnum>());
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
	public static DigitalMediaTypeEnum forCode(String theCode) {
		DigitalMediaTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<DigitalMediaTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<DigitalMediaTypeEnum>() {
		@Override
		public String toCodeString(DigitalMediaTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(DigitalMediaTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public DigitalMediaTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public DigitalMediaTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, DigitalMediaTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	DigitalMediaTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
