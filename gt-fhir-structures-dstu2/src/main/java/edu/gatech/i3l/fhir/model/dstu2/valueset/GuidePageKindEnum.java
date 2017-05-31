
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.GuidePageKindEnum;

import java.util.HashMap;
import java.util.Map;

public enum GuidePageKindEnum {

	/**
	 * Display: <b>Page</b><br>
	 * Code Value: <b>page</b>
	 *
	 * This is a page of content that is included in the implementation guide. It has no particular function.
	 */
	PAGE("page", "http://hl7.org/fhir/guide-page-kind"),
	
	/**
	 * Display: <b>Example</b><br>
	 * Code Value: <b>example</b>
	 *
	 * This is a page that represents a human readable rendering of an example.
	 */
	EXAMPLE("example", "http://hl7.org/fhir/guide-page-kind"),
	
	/**
	 * Display: <b>List</b><br>
	 * Code Value: <b>list</b>
	 *
	 * This is a page that represents a list of resources of one or more types.
	 */
	LIST("list", "http://hl7.org/fhir/guide-page-kind"),
	
	/**
	 * Display: <b>Include</b><br>
	 * Code Value: <b>include</b>
	 *
	 * This is a page showing where an included guide is injected.
	 */
	INCLUDE("include", "http://hl7.org/fhir/guide-page-kind"),
	
	/**
	 * Display: <b>Directory</b><br>
	 * Code Value: <b>directory</b>
	 *
	 * This is a page that lists the resources of a given type, and also creates pages for all the listed types as other pages in the section.
	 */
	DIRECTORY("directory", "http://hl7.org/fhir/guide-page-kind"),
	
	/**
	 * Display: <b>Dictionary</b><br>
	 * Code Value: <b>dictionary</b>
	 *
	 * This is a page that creates the listed resources as a dictionary.
	 */
	DICTIONARY("dictionary", "http://hl7.org/fhir/guide-page-kind"),
	
	/**
	 * Display: <b>Table Of Contents</b><br>
	 * Code Value: <b>toc</b>
	 *
	 * This is a generated page that contains the table of contents.
	 */
	TABLE_OF_CONTENTS("toc", "http://hl7.org/fhir/guide-page-kind"),
	
	/**
	 * Display: <b>Resource</b><br>
	 * Code Value: <b>resource</b>
	 *
	 * This is a page that represents a presented resource. This is typically used for generated conformance resource presentations.
	 */
	RESOURCE("resource", "http://hl7.org/fhir/guide-page-kind"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * GuidePageKind
	 */
	public static final String VALUESET_NAME = "GuidePageKind";

	private static Map<String, GuidePageKindEnum> CODE_TO_ENUM = new HashMap<String, GuidePageKindEnum>();
	private static Map<String, Map<String, GuidePageKindEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, GuidePageKindEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (GuidePageKindEnum next : GuidePageKindEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, GuidePageKindEnum>());
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
	public static GuidePageKindEnum forCode(String theCode) {
		GuidePageKindEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<GuidePageKindEnum> VALUESET_BINDER = new IValueSetEnumBinder<GuidePageKindEnum>() {
		@Override
		public String toCodeString(GuidePageKindEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(GuidePageKindEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public GuidePageKindEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public GuidePageKindEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, GuidePageKindEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	GuidePageKindEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
