
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum AnswerFormatEnum {

	/**
	 * Display: <b>Boolean</b><br>
	 * Code Value: <b>boolean</b>
	 *
	 * Answer is a yes/no answer.
	 */
	BOOLEAN("boolean", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Decimal</b><br>
	 * Code Value: <b>decimal</b>
	 *
	 * Answer is a floating point number.
	 */
	DECIMAL("decimal", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Integer</b><br>
	 * Code Value: <b>integer</b>
	 *
	 * Answer is an integer.
	 */
	INTEGER("integer", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Date</b><br>
	 * Code Value: <b>date</b>
	 *
	 * Answer is a date.
	 */
	DATE("date", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Date Time</b><br>
	 * Code Value: <b>dateTime</b>
	 *
	 * Answer is a date and time.
	 */
	DATE_TIME("dateTime", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Instant</b><br>
	 * Code Value: <b>instant</b>
	 *
	 * Answer is a system timestamp.
	 */
	INSTANT("instant", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Time</b><br>
	 * Code Value: <b>time</b>
	 *
	 * Answer is a time (hour/minute/second) independent of date.
	 */
	TIME("time", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>String</b><br>
	 * Code Value: <b>string</b>
	 *
	 * Answer is a short (few words to short sentence) free-text entry.
	 */
	STRING("string", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Text</b><br>
	 * Code Value: <b>text</b>
	 *
	 * Answer is a long (potentially multi-paragraph) free-text entry (still captured as a string).
	 */
	TEXT("text", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Url</b><br>
	 * Code Value: <b>url</b>
	 *
	 * Answer is a url (website, FTP site, etc.).
	 */
	URL("url", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Choice</b><br>
	 * Code Value: <b>choice</b>
	 *
	 * Answer is a Coding drawn from a list of options.
	 */
	CHOICE("choice", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Open Choice</b><br>
	 * Code Value: <b>open-choice</b>
	 *
	 * Answer is a Coding drawn from a list of options or a free-text entry.
	 */
	OPEN_CHOICE("open-choice", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Attachment</b><br>
	 * Code Value: <b>attachment</b>
	 *
	 * Answer is binary content such as a image, PDF, etc.
	 */
	ATTACHMENT("attachment", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Reference</b><br>
	 * Code Value: <b>reference</b>
	 *
	 * Answer is a reference to another resource (practitioner, organization, etc.).
	 */
	REFERENCE("reference", "http://hl7.org/fhir/answer-format"),
	
	/**
	 * Display: <b>Quantity</b><br>
	 * Code Value: <b>quantity</b>
	 *
	 * Answer is a combination of a numeric value and unit, potentially with a comparator (<, >, etc.).
	 */
	QUANTITY("quantity", "http://hl7.org/fhir/answer-format"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AnswerFormat
	 */
	public static final String VALUESET_NAME = "AnswerFormat";

	private static Map<String, AnswerFormatEnum> CODE_TO_ENUM = new HashMap<String, AnswerFormatEnum>();
	private static Map<String, Map<String, AnswerFormatEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AnswerFormatEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AnswerFormatEnum next : AnswerFormatEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AnswerFormatEnum>());
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
	public static AnswerFormatEnum forCode(String theCode) {
		AnswerFormatEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AnswerFormatEnum> VALUESET_BINDER = new IValueSetEnumBinder<AnswerFormatEnum>() {
		@Override
		public String toCodeString(AnswerFormatEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AnswerFormatEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AnswerFormatEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AnswerFormatEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AnswerFormatEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AnswerFormatEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
