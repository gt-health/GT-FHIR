
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.LocationTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum LocationTypeEnum {

	/**
	 * Display: <b>Building</b><br>
	 * Code Value: <b>bu</b>
	 *
	 * Any Building or structure. This may contain rooms, corridors, wings, etc. It may not have walls, or a roof, but is considered a defined/allocated space.
	 */
	BUILDING("bu", "http://hl7.org/fhir/location-physical-type"),
	
	/**
	 * Display: <b>Wing</b><br>
	 * Code Value: <b>wi</b>
	 *
	 * A Wing within a Building, this often contains levels, rooms and corridors.
	 */
	WING("wi", "http://hl7.org/fhir/location-physical-type"),
	
	/**
	 * Display: <b>Level</b><br>
	 * Code Value: <b>lvl</b>
	 *
	 * A Level in a multi-level Building/Structure.
	 */
	LEVEL("lvl", "http://hl7.org/fhir/location-physical-type"),
	
	/**
	 * Display: <b>Corridor</b><br>
	 * Code Value: <b>co</b>
	 *
	 * Any corridor within a Building, that is not within.
	 */
	CORRIDOR("co", "http://hl7.org/fhir/location-physical-type"),
	
	/**
	 * Display: <b>Room</b><br>
	 * Code Value: <b>ro</b>
	 *
	 * A space that is allocated as a room, it may have walls/roof etc., but does not require these.
	 */
	ROOM("ro", "http://hl7.org/fhir/location-physical-type"),
	
	/**
	 * Display: <b>Bed</b><br>
	 * Code Value: <b>bd</b>
	 *
	 * A space that is allocated for sleeping/laying on.
	 */
	BED("bd", "http://hl7.org/fhir/location-physical-type"),
	
	/**
	 * Display: <b>Vehicle</b><br>
	 * Code Value: <b>ve</b>
	 *
	 * A means of transportation.
	 */
	VEHICLE("ve", "http://hl7.org/fhir/location-physical-type"),
	
	/**
	 * Display: <b>House</b><br>
	 * Code Value: <b>ho</b>
	 *
	 * A residential dwelling. Usually used to reference a location that a person/patient may reside.
	 */
	HOUSE("ho", "http://hl7.org/fhir/location-physical-type"),
	
	/**
	 * Display: <b>Cabinet</b><br>
	 * Code Value: <b>ca</b>
	 *
	 * A container that can store goods, equipment, medications or other items.
	 */
	CABINET("ca", "http://hl7.org/fhir/location-physical-type"),
	
	/**
	 * Display: <b>Road</b><br>
	 * Code Value: <b>rd</b>
	 *
	 * A defined path to travel between 2 points that has a known name.
	 */
	ROAD("rd", "http://hl7.org/fhir/location-physical-type"),
	
	/**
	 * Display: <b>Jurisdiction</b><br>
	 * Code Value: <b>jdn</b>
	 *
	 * A wide scope that covers a conceptual domain, such as a Nation (Country wide community or Federal Government - e.g. Ministry of Health),  Province or State (community or Government), Business (throughout the enterprise), Nation with a business scope of an agency (e.g. CDC, FDA etc.) or a Business segment (UK Pharmacy).
	 */
	JURISDICTION("jdn", "http://hl7.org/fhir/location-physical-type"),
	
	/**
	 * Display: <b>Area</b><br>
	 * Code Value: <b>area</b>
	 *
	 * A defined boundary, such as a state, region, country, county
	 */
	AREA("area", "http://hl7.org/fhir/location-physical-type"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * LocationType
	 */
	public static final String VALUESET_NAME = "LocationType";

	private static Map<String, LocationTypeEnum> CODE_TO_ENUM = new HashMap<String, LocationTypeEnum>();
	private static Map<String, Map<String, LocationTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, LocationTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (LocationTypeEnum next : LocationTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, LocationTypeEnum>());
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
	public static LocationTypeEnum forCode(String theCode) {
		LocationTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<LocationTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<LocationTypeEnum>() {
		@Override
		public String toCodeString(LocationTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(LocationTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public LocationTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public LocationTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, LocationTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	LocationTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
