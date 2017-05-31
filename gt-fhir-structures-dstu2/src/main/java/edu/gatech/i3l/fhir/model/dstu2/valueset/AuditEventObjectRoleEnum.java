
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.AuditEventObjectRoleEnum;

import java.util.HashMap;
import java.util.Map;

public enum AuditEventObjectRoleEnum {

	/**
	 * Display: <b>Patient</b><br>
	 * Code Value: <b>1</b>
	 *
	 * This object is the patient that is the subject of care related to this event.  It is identifiable by patient ID or equivalent.  The patient may be either human or animal.
	 */
	PATIENT("1", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Location</b><br>
	 * Code Value: <b>2</b>
	 *
	 * This is a location identified as related to the event.  This is usually the location where the event took place.  Note that for shipping, the usual events are arrival at a location or departure from a location.
	 */
	LOCATION("2", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Report</b><br>
	 * Code Value: <b>3</b>
	 *
	 * This object is any kind of persistent document created as a result of the event.  This could be a paper report, film, electronic report, DICOM Study, etc.  Issues related to medical records life cycle management are conveyed elsewhere.
	 */
	REPORT("3", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Domain Resource</b><br>
	 * Code Value: <b>4</b>
	 *
	 * A logical object related to a health record event.  This is any healthcare  specific resource (object) not restricted to FHIR defined Resources.
	 */
	DOMAIN_RESOURCE("4", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Master file</b><br>
	 * Code Value: <b>5</b>
	 *
	 * This is any configurable file used to control creation of documents.  Examples include the objects maintained by the HL7 Master File transactions, Value Sets, etc.
	 */
	MASTER_FILE("5", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>User</b><br>
	 * Code Value: <b>6</b>
	 *
	 * A human participant not otherwise identified by some other category.
	 */
	USER("6", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>List</b><br>
	 * Code Value: <b>7</b>
	 *
	 * (deprecated)
	 */
	LIST("7", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Doctor</b><br>
	 * Code Value: <b>8</b>
	 *
	 * Typically a licensed person who is providing or performing care related to the event, generally a physician.   The key distinction between doctor and practitioner is with regards to their role, not the licensing.  The doctor is the human who actually performed the work.  The practitioner is the human or organization that is responsible for the work.
	 */
	DOCTOR("8", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Subscriber</b><br>
	 * Code Value: <b>9</b>
	 *
	 * A person or system that is being notified as part of the event.  This is relevant in situations where automated systems provide notifications to other parties when an event took place.
	 */
	SUBSCRIBER("9", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Guarantor</b><br>
	 * Code Value: <b>10</b>
	 *
	 * Insurance company, or any other organization who accepts responsibility for paying for the healthcare event.
	 */
	GUARANTOR("10", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Security User Entity</b><br>
	 * Code Value: <b>11</b>
	 *
	 * A person or active system object involved in the event with a security role.
	 */
	SECURITY_USER_ENTITY("11", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Security User Group</b><br>
	 * Code Value: <b>12</b>
	 *
	 * A person or system object involved in the event with the authority to modify security roles of other objects.
	 */
	SECURITY_USER_GROUP("12", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Security Resource</b><br>
	 * Code Value: <b>13</b>
	 *
	 * A passive object, such as a role table, that is relevant to the event.
	 */
	SECURITY_RESOURCE("13", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Security Granularity Definition</b><br>
	 * Code Value: <b>14</b>
	 *
	 * (deprecated)  Relevant to certain RBAC security methodologies.
	 */
	SECURITY_GRANULARITY_DEFINITION("14", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Practitioner</b><br>
	 * Code Value: <b>15</b>
	 *
	 * Any person or organization responsible for providing care.  This encompasses all forms of care, licensed or otherwise, and all sorts of teams and care groups. Note, the distinction between practitioners and the doctor that actually provided the care to the patient.
	 */
	PRACTITIONER("15", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Data Destination</b><br>
	 * Code Value: <b>16</b>
	 *
	 * The source or destination for data transfer, when it does not match some other role.
	 */
	DATA_DESTINATION("16", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Data Repository</b><br>
	 * Code Value: <b>17</b>
	 *
	 * A source or destination for data transfer that acts as an archive, database, or similar role.
	 */
	DATA_REPOSITORY("17", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Schedule</b><br>
	 * Code Value: <b>18</b>
	 *
	 * An object that holds schedule information.  This could be an appointment book, availability information, etc.
	 */
	SCHEDULE("18", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Customer</b><br>
	 * Code Value: <b>19</b>
	 *
	 * An organization or person that is the recipient of services.  This could be an organization that is buying services for a patient, or a person that is buying services for an animal.
	 */
	CUSTOMER("19", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Job</b><br>
	 * Code Value: <b>20</b>
	 *
	 * An order, task, work item, procedure step, or other description of work to be performed; e.g. a particular instance of an MPPS.
	 */
	JOB("20", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Job Stream</b><br>
	 * Code Value: <b>21</b>
	 *
	 * A list of jobs or a system that provides lists of jobs; e.g. an MWL SCP.
	 */
	JOB_STREAM("21", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Table</b><br>
	 * Code Value: <b>22</b>
	 *
	 * (Deprecated)
	 */
	TABLE("22", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Routing Criteria</b><br>
	 * Code Value: <b>23</b>
	 *
	 * An object that specifies or controls the routing or delivery of items.  For example, a distribution list is the routing criteria for mail.  The items delivered may be documents, jobs, or other objects.
	 */
	ROUTING_CRITERIA("23", "http://hl7.org/fhir/object-role"),
	
	/**
	 * Display: <b>Query</b><br>
	 * Code Value: <b>24</b>
	 *
	 * The contents of a query.  This is used to capture the contents of any kind of query.  For security surveillance purposes knowing the queries being made is very important.
	 */
	QUERY("24", "http://hl7.org/fhir/object-role"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * AuditEventObjectRole
	 */
	public static final String VALUESET_NAME = "AuditEventObjectRole";

	private static Map<String, AuditEventObjectRoleEnum> CODE_TO_ENUM = new HashMap<String, AuditEventObjectRoleEnum>();
	private static Map<String, Map<String, AuditEventObjectRoleEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, AuditEventObjectRoleEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (AuditEventObjectRoleEnum next : AuditEventObjectRoleEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, AuditEventObjectRoleEnum>());
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
	public static AuditEventObjectRoleEnum forCode(String theCode) {
		AuditEventObjectRoleEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<AuditEventObjectRoleEnum> VALUESET_BINDER = new IValueSetEnumBinder<AuditEventObjectRoleEnum>() {
		@Override
		public String toCodeString(AuditEventObjectRoleEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(AuditEventObjectRoleEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public AuditEventObjectRoleEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public AuditEventObjectRoleEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, AuditEventObjectRoleEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	AuditEventObjectRoleEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
