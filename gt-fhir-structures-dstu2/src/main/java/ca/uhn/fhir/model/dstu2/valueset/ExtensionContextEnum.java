
package ca.uhn.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import java.util.HashMap;
import java.util.Map;

public enum ExtensionContextEnum {

	/**
	 * Display: <b>Resource</b><br>
	 * Code Value: <b>resource</b>
	 *
	 * The context is all elements matching a particular resource element path.
	 */
	RESOURCE("resource", "http://hl7.org/fhir/extension-context"),
	
	/**
	 * Display: <b>Datatype</b><br>
	 * Code Value: <b>datatype</b>
	 *
	 * The context is all nodes matching a particular data type element path (root or repeating element) or all elements referencing a particular primitive data type (expressed as the datatype name).
	 */
	DATATYPE("datatype", "http://hl7.org/fhir/extension-context"),
	
	/**
	 * Display: <b>Mapping</b><br>
	 * Code Value: <b>mapping</b>
	 *
	 * The context is all nodes whose mapping to a specified reference model corresponds to a particular mapping structure.  The context identifies the mapping target. The mapping should clearly identify where such an extension could be used.
	 */
	MAPPING("mapping", "http://hl7.org/fhir/extension-context"),
	
	/**
	 * Display: <b>Extension</b><br>
	 * Code Value: <b>extension</b>
	 *
	 * The context is a particular extension from a particular profile, a uri that identifies the extension definition.
	 */
	EXTENSION("extension", "http://hl7.org/fhir/extension-context"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ExtensionContext
	 */
	public static final String VALUESET_NAME = "ExtensionContext";

	private static Map<String, ExtensionContextEnum> CODE_TO_ENUM = new HashMap<String, ExtensionContextEnum>();
	private static Map<String, Map<String, ExtensionContextEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ExtensionContextEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ExtensionContextEnum next : ExtensionContextEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ExtensionContextEnum>());
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
	public static ExtensionContextEnum forCode(String theCode) {
		ExtensionContextEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ExtensionContextEnum> VALUESET_BINDER = new IValueSetEnumBinder<ExtensionContextEnum>() {
		@Override
		public String toCodeString(ExtensionContextEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ExtensionContextEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ExtensionContextEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ExtensionContextEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ExtensionContextEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ExtensionContextEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
