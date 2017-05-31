
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.DataElementStringencyEnum;

import java.util.HashMap;
import java.util.Map;

public enum DataElementStringencyEnum {

	/**
	 * Display: <b>Comparable</b><br>
	 * Code Value: <b>comparable</b>
	 *
	 * The data element is sufficiently well-constrained that multiple pieces of data captured according to the constraints of the data element will be comparable (though in some cases, a degree of automated conversion/normalization may be required).
	 */
	COMPARABLE("comparable", "http://hl7.org/fhir/dataelement-stringency"),
	
	/**
	 * Display: <b>Fully Specified</b><br>
	 * Code Value: <b>fully-specified</b>
	 *
	 * The data element is fully specified down to a single value set, single unit of measure, single data type, etc.  Multiple pieces of data associated with this data element are fully comparable.
	 */
	FULLY_SPECIFIED("fully-specified", "http://hl7.org/fhir/dataelement-stringency"),
	
	/**
	 * Display: <b>Equivalent</b><br>
	 * Code Value: <b>equivalent</b>
	 *
	 * The data element allows multiple units of measure having equivalent meaning; e.g. "cc" (cubic centimeter) and "mL" (milliliter).
	 */
	EQUIVALENT("equivalent", "http://hl7.org/fhir/dataelement-stringency"),
	
	/**
	 * Display: <b>Convertable</b><br>
	 * Code Value: <b>convertable</b>
	 *
	 * The data element allows multiple units of measure that are convertable between each other (e.g. inches and centimeters) and/or allows data to be captured in multiple value sets for which a known mapping exists allowing conversion of meaning.
	 */
	CONVERTABLE("convertable", "http://hl7.org/fhir/dataelement-stringency"),
	
	/**
	 * Display: <b>Scaleable</b><br>
	 * Code Value: <b>scaleable</b>
	 *
	 * A convertable data element where unit conversions are different only by a power of 10; e.g. g, mg, kg.
	 */
	SCALEABLE("scaleable", "http://hl7.org/fhir/dataelement-stringency"),
	
	/**
	 * Display: <b>Flexible</b><br>
	 * Code Value: <b>flexible</b>
	 *
	 * The data element is unconstrained in units, choice of data types and/or choice of vocabulary such that automated comparison of data captured using the data element is not possible.
	 */
	FLEXIBLE("flexible", "http://hl7.org/fhir/dataelement-stringency"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * DataElementStringency
	 */
	public static final String VALUESET_NAME = "DataElementStringency";

	private static Map<String, DataElementStringencyEnum> CODE_TO_ENUM = new HashMap<String, DataElementStringencyEnum>();
	private static Map<String, Map<String, DataElementStringencyEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, DataElementStringencyEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (DataElementStringencyEnum next : DataElementStringencyEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, DataElementStringencyEnum>());
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
	public static DataElementStringencyEnum forCode(String theCode) {
		DataElementStringencyEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<DataElementStringencyEnum> VALUESET_BINDER = new IValueSetEnumBinder<DataElementStringencyEnum>() {
		@Override
		public String toCodeString(DataElementStringencyEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(DataElementStringencyEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public DataElementStringencyEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public DataElementStringencyEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, DataElementStringencyEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	DataElementStringencyEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
