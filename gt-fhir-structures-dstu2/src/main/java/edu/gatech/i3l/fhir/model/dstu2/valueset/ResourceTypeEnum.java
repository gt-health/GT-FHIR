
package edu.gatech.i3l.fhir.model.dstu2.valueset;

import ca.uhn.fhir.model.api.*;
import edu.gatech.i3l.fhir.model.dstu2.valueset.ResourceTypeEnum;

import java.util.HashMap;
import java.util.Map;

public enum ResourceTypeEnum {

	/**
	 * Display: <b>Account</b><br>
	 * Code Value: <b>Account</b>
	 *
	 * A financial tool for tracking value accrued for a particular purpose.  In the healthcare field, used to track charges for a patient, cost centres, etc.
	 */
	ACCOUNT("Account", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>AllergyIntolerance</b><br>
	 * Code Value: <b>AllergyIntolerance</b>
	 *
	 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
	 */
	ALLERGYINTOLERANCE("AllergyIntolerance", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Appointment</b><br>
	 * Code Value: <b>Appointment</b>
	 *
	 * A booking of a healthcare event among patient(s), practitioner(s), related person(s) and/or device(s) for a specific date/time. This may result in one or more Encounter(s).
	 */
	APPOINTMENT("Appointment", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>AppointmentResponse</b><br>
	 * Code Value: <b>AppointmentResponse</b>
	 *
	 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
	 */
	APPOINTMENTRESPONSE("AppointmentResponse", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>AuditEvent</b><br>
	 * Code Value: <b>AuditEvent</b>
	 *
	 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage.
	 */
	AUDITEVENT("AuditEvent", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Basic</b><br>
	 * Code Value: <b>Basic</b>
	 *
	 * Basic is used for handling concepts not yet defined in FHIR, narrative-only resources that don't map to an existing resource, and custom resources not appropriate for inclusion in the FHIR specification.
	 */
	BASIC("Basic", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Binary</b><br>
	 * Code Value: <b>Binary</b>
	 *
	 * A binary resource can contain any content, whether text, image, pdf, zip archive, etc.
	 */
	BINARY("Binary", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>BodySite</b><br>
	 * Code Value: <b>BodySite</b>
	 *
	 * Record details about the anatomical location of a specimen or body part.  This resource may be used when a coded concept does not provide the necessary detail needed for the use case.
	 */
	BODYSITE("BodySite", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Bundle</b><br>
	 * Code Value: <b>Bundle</b>
	 *
	 * A container for a collection of resources.
	 */
	BUNDLE("Bundle", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>CarePlan</b><br>
	 * Code Value: <b>CarePlan</b>
	 *
	 * Describes the intention of how one or more practitioners intend to deliver care for a particular patient, group or community for a period of time, possibly limited to care for a specific condition or set of conditions.
	 */
	CAREPLAN("CarePlan", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Claim</b><br>
	 * Code Value: <b>Claim</b>
	 *
	 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
	 */
	CLAIM("Claim", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ClaimResponse</b><br>
	 * Code Value: <b>ClaimResponse</b>
	 *
	 * This resource provides the adjudication details from the processing of a Claim resource.
	 */
	CLAIMRESPONSE("ClaimResponse", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ClinicalImpression</b><br>
	 * Code Value: <b>ClinicalImpression</b>
	 *
	 * A record of a clinical assessment performed to determine what problem(s) may affect the patient and before planning the treatments or management strategies that are best to manage a patient's condition. Assessments are often 1:1 with a clinical consultation / encounter,  but this varies greatly depending on the clinical workflow. This resource is called "ClinicalImpression" rather than "ClinicalAssessment" to avoid confusion with the recording of assessment tools such as Apgar score.
	 */
	CLINICALIMPRESSION("ClinicalImpression", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Communication</b><br>
	 * Code Value: <b>Communication</b>
	 *
	 * An occurrence of information being transmitted; e.g. an alert that was sent to a responsible provider, a public health agency was notified about a reportable condition.
	 */
	COMMUNICATION("Communication", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>CommunicationRequest</b><br>
	 * Code Value: <b>CommunicationRequest</b>
	 *
	 * A request to convey information; e.g. the CDS system proposes that an alert be sent to a responsible provider, the CDS system proposes that the public health agency be notified about a reportable condition.
	 */
	COMMUNICATIONREQUEST("CommunicationRequest", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Composition</b><br>
	 * Code Value: <b>Composition</b>
	 *
	 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained.
	 */
	COMPOSITION("Composition", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ConceptMap</b><br>
	 * Code Value: <b>ConceptMap</b>
	 *
	 * A statement of relationships from one set of concepts to one or more other concepts - either code systems or data elements, or classes in class models.
	 */
	CONCEPTMAP("ConceptMap", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Condition</b><br>
	 * Code Value: <b>Condition</b>
	 *
	 * Use to record detailed information about conditions, problems or diagnoses recognized by a clinician. There are many uses including: recording a diagnosis during an encounter; populating a problem list or a summary statement, such as a discharge summary.
	 */
	CONDITION("Condition", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Conformance</b><br>
	 * Code Value: <b>Conformance</b>
	 *
	 * A conformance statement is a set of capabilities of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
	 */
	CONFORMANCE("Conformance", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Contract</b><br>
	 * Code Value: <b>Contract</b>
	 *
	 * A formal agreement between parties regarding the conduct of business, exchange of information or other matters.
	 */
	CONTRACT("Contract", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Coverage</b><br>
	 * Code Value: <b>Coverage</b>
	 *
	 * Financial instrument which may be used to pay for or reimburse health care products and services.
	 */
	COVERAGE("Coverage", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>DataElement</b><br>
	 * Code Value: <b>DataElement</b>
	 *
	 * The formal description of a single piece of information that can be gathered and reported.
	 */
	DATAELEMENT("DataElement", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>DetectedIssue</b><br>
	 * Code Value: <b>DetectedIssue</b>
	 *
	 * Indicates an actual or potential clinical issue with or between one or more active or proposed clinical actions for a patient; e.g. Drug-drug interaction, Ineffective treatment frequency, Procedure-condition conflict, etc.
	 */
	DETECTEDISSUE("DetectedIssue", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Device</b><br>
	 * Code Value: <b>Device</b>
	 *
	 * This resource identifies an instance of a manufactured item that is used in the provision of healthcare without being substantially changed through that activity. The device may be a medical or non-medical device.  Medical devices includes durable (reusable) medical equipment, implantable devices, as well as disposable equipment used for diagnostic, treatment, and research for healthcare and public health.  Non-medical devices may include items such as a machine, cellphone, computer, application, etc.
	 */
	DEVICE("Device", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>DeviceComponent</b><br>
	 * Code Value: <b>DeviceComponent</b>
	 *
	 * Describes the characteristics, operational status and capabilities of a medical-related component of a medical device.
	 */
	DEVICECOMPONENT("DeviceComponent", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>DeviceMetric</b><br>
	 * Code Value: <b>DeviceMetric</b>
	 *
	 * Describes a measurement, calculation or setting capability of a medical device.
	 */
	DEVICEMETRIC("DeviceMetric", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>DeviceUseRequest</b><br>
	 * Code Value: <b>DeviceUseRequest</b>
	 *
	 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
	 */
	DEVICEUSEREQUEST("DeviceUseRequest", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>DeviceUseStatement</b><br>
	 * Code Value: <b>DeviceUseStatement</b>
	 *
	 * A record of a device being used by a patient where the record is the result of a report from the patient or another clinician.
	 */
	DEVICEUSESTATEMENT("DeviceUseStatement", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>DiagnosticOrder</b><br>
	 * Code Value: <b>DiagnosticOrder</b>
	 *
	 * A record of a request for a diagnostic investigation service to be performed.
	 */
	DIAGNOSTICORDER("DiagnosticOrder", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>DiagnosticReport</b><br>
	 * Code Value: <b>DiagnosticReport</b>
	 *
	 * The findings and interpretation of diagnostic  tests performed on patients, groups of patients, devices, and locations, and/or specimens derived from these. The report includes clinical context such as requesting and provider information, and some mix of atomic results, images, textual and coded interpretations, and formatted representation of diagnostic reports.
	 */
	DIAGNOSTICREPORT("DiagnosticReport", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>DocumentManifest</b><br>
	 * Code Value: <b>DocumentManifest</b>
	 *
	 * A manifest that defines a set of documents.
	 */
	DOCUMENTMANIFEST("DocumentManifest", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>DocumentReference</b><br>
	 * Code Value: <b>DocumentReference</b>
	 *
	 * A reference to a document .
	 */
	DOCUMENTREFERENCE("DocumentReference", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>DomainResource</b><br>
	 * Code Value: <b>DomainResource</b>
	 *
	 * --- Abstract Type! ---A resource that includes narrative, extensions, and contained resources.
	 */
	DOMAINRESOURCE("DomainResource", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>EligibilityRequest</b><br>
	 * Code Value: <b>EligibilityRequest</b>
	 *
	 * This resource provides the insurance eligibility details from the insurer regarding a specified coverage and optionally some class of service.
	 */
	ELIGIBILITYREQUEST("EligibilityRequest", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>EligibilityResponse</b><br>
	 * Code Value: <b>EligibilityResponse</b>
	 *
	 * This resource provides eligibility and plan details from the processing of an Eligibility resource.
	 */
	ELIGIBILITYRESPONSE("EligibilityResponse", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Encounter</b><br>
	 * Code Value: <b>Encounter</b>
	 *
	 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
	 */
	ENCOUNTER("Encounter", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>EnrollmentRequest</b><br>
	 * Code Value: <b>EnrollmentRequest</b>
	 *
	 * This resource provides the insurance enrollment details to the insurer regarding a specified coverage.
	 */
	ENROLLMENTREQUEST("EnrollmentRequest", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>EnrollmentResponse</b><br>
	 * Code Value: <b>EnrollmentResponse</b>
	 *
	 * This resource provides enrollment and plan details from the processing of an Enrollment resource.
	 */
	ENROLLMENTRESPONSE("EnrollmentResponse", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>EpisodeOfCare</b><br>
	 * Code Value: <b>EpisodeOfCare</b>
	 *
	 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
	 */
	EPISODEOFCARE("EpisodeOfCare", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ExplanationOfBenefit</b><br>
	 * Code Value: <b>ExplanationOfBenefit</b>
	 *
	 * This resource provides: the claim details; adjudication details from the processing of a Claim; and optionally account balance information, for informing the subscriber of the benefits provided.
	 */
	EXPLANATIONOFBENEFIT("ExplanationOfBenefit", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>FamilyMemberHistory</b><br>
	 * Code Value: <b>FamilyMemberHistory</b>
	 *
	 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
	 */
	FAMILYMEMBERHISTORY("FamilyMemberHistory", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Flag</b><br>
	 * Code Value: <b>Flag</b>
	 *
	 * Prospective warnings of potential issues when providing care to the patient.
	 */
	FLAG("Flag", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Goal</b><br>
	 * Code Value: <b>Goal</b>
	 *
	 * Describes the intended objective(s) for a patient, group or organization care, for example, weight loss, restoring an activity of daily living, obtaining herd immunity via immunization, meeting a process improvement objective, etc.
	 */
	GOAL("Goal", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Group</b><br>
	 * Code Value: <b>Group</b>
	 *
	 * Represents a defined collection of entities that may be discussed or acted upon collectively but which are not expected to act collectively and are not formally or legally recognized; i.e. a collection of entities that isn't an Organization.
	 */
	GROUP("Group", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>HealthcareService</b><br>
	 * Code Value: <b>HealthcareService</b>
	 *
	 * The details of a healthcare service available at a location.
	 */
	HEALTHCARESERVICE("HealthcareService", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ImagingObjectSelection</b><br>
	 * Code Value: <b>ImagingObjectSelection</b>
	 *
	 * A manifest of a set of DICOM Service-Object Pair Instances (SOP Instances).  The referenced SOP Instances (images or other content) are for a single patient, and may be from one or more studies. The referenced SOP Instances have been selected for a purpose, such as quality assurance, conference, or consult. Reflecting that range of purposes, typical ImagingObjectSelection resources may include all SOP Instances in a study (perhaps for sharing through a Health Information Exchange); key images from multiple studies (for reference by a referring or treating physician); a multi-frame ultrasound instance ("cine" video clip) and a set of measurements taken from that instance (for inclusion in a teaching file); and so on.
	 */
	IMAGINGOBJECTSELECTION("ImagingObjectSelection", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ImagingStudy</b><br>
	 * Code Value: <b>ImagingStudy</b>
	 *
	 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
	 */
	IMAGINGSTUDY("ImagingStudy", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Immunization</b><br>
	 * Code Value: <b>Immunization</b>
	 *
	 * Describes the event of a patient being administered a vaccination or a record of a vaccination as reported by a patient, a clinician or another party and may include vaccine reaction information and what vaccination protocol was followed.
	 */
	IMMUNIZATION("Immunization", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ImmunizationRecommendation</b><br>
	 * Code Value: <b>ImmunizationRecommendation</b>
	 *
	 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification.
	 */
	IMMUNIZATIONRECOMMENDATION("ImmunizationRecommendation", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ImplementationGuide</b><br>
	 * Code Value: <b>ImplementationGuide</b>
	 *
	 * A set of rules or how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole, and to publish a computable definition of all the parts.
	 */
	IMPLEMENTATIONGUIDE("ImplementationGuide", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>List</b><br>
	 * Code Value: <b>List</b>
	 *
	 * A set of information summarized from a list of other resources.
	 */
	LIST("List", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Location</b><br>
	 * Code Value: <b>Location</b>
	 *
	 * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
	 */
	LOCATION("Location", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Media</b><br>
	 * Code Value: <b>Media</b>
	 *
	 * A photo, video, or audio recording acquired or used in healthcare. The actual content may be inline or provided by direct reference.
	 */
	MEDIA("Media", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Medication</b><br>
	 * Code Value: <b>Medication</b>
	 *
	 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
	 */
	MEDICATION("Medication", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>MedicationAdministration</b><br>
	 * Code Value: <b>MedicationAdministration</b>
	 *
	 * Describes the event of a patient consuming or otherwise being administered a medication.  This may be as simple as swallowing a tablet or it may be a long running infusion.  Related resources tie this event to the authorizing prescription, and the specific encounter between patient and health care practitioner.
	 */
	MEDICATIONADMINISTRATION("MedicationAdministration", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>MedicationDispense</b><br>
	 * Code Value: <b>MedicationDispense</b>
	 *
	 * Indicates that a medication product is to be or has been dispensed for a named person/patient.  This includes a description of the medication product (supply) provided and the instructions for administering the medication.  The medication dispense is the result of a pharmacy system responding to a medication order.
	 */
	MEDICATIONDISPENSE("MedicationDispense", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>MedicationOrder</b><br>
	 * Code Value: <b>MedicationOrder</b>
	 *
	 * An order for both supply of the medication and the instructions for administration of the medication to a patient. The resource is called "MedicationOrder" rather than "MedicationPrescription" to generalize the use across inpatient and outpatient settings as well as for care plans, etc.
	 */
	MEDICATIONORDER("MedicationOrder", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>MedicationStatement</b><br>
	 * Code Value: <b>MedicationStatement</b>
	 *
	 * A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now, or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from e.g. the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains   The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
	 */
	MEDICATIONSTATEMENT("MedicationStatement", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>MessageHeader</b><br>
	 * Code Value: <b>MessageHeader</b>
	 *
	 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
	 */
	MESSAGEHEADER("MessageHeader", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>NamingSystem</b><br>
	 * Code Value: <b>NamingSystem</b>
	 *
	 * A curated namespace that issues unique symbols within that namespace for the identification of concepts, people, devices, etc.  Represents a "System" used within the Identifier and Coding data types.
	 */
	NAMINGSYSTEM("NamingSystem", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>NutritionOrder</b><br>
	 * Code Value: <b>NutritionOrder</b>
	 *
	 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
	 */
	NUTRITIONORDER("NutritionOrder", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Observation</b><br>
	 * Code Value: <b>Observation</b>
	 *
	 * Measurements and simple assertions made about a patient, device or other subject.
	 */
	OBSERVATION("Observation", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>OperationDefinition</b><br>
	 * Code Value: <b>OperationDefinition</b>
	 *
	 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
	 */
	OPERATIONDEFINITION("OperationDefinition", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>OperationOutcome</b><br>
	 * Code Value: <b>OperationOutcome</b>
	 *
	 * A collection of error, warning or information messages that result from a system action.
	 */
	OPERATIONOUTCOME("OperationOutcome", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Order</b><br>
	 * Code Value: <b>Order</b>
	 *
	 * A request to perform an action.
	 */
	ORDER("Order", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>OrderResponse</b><br>
	 * Code Value: <b>OrderResponse</b>
	 *
	 * A response to an order.
	 */
	ORDERRESPONSE("OrderResponse", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Organization</b><br>
	 * Code Value: <b>Organization</b>
	 *
	 * A formally or informally recognized grouping of people or organizations formed for the purpose of achieving some form of collective action.  Includes companies, institutions, corporations, departments, community groups, healthcare practice groups, etc.
	 */
	ORGANIZATION("Organization", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Parameters</b><br>
	 * Code Value: <b>Parameters</b>
	 *
	 * This special resource type is used to represent an operation request and response (operations.html). It has no other use, and there is no RESTful endpoint associated with it.
	 */
	PARAMETERS("Parameters", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Patient</b><br>
	 * Code Value: <b>Patient</b>
	 *
	 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
	 */
	PATIENT("Patient", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>PaymentNotice</b><br>
	 * Code Value: <b>PaymentNotice</b>
	 *
	 * This resource provides the status of the payment for goods and services rendered, and the request and response resource references.
	 */
	PAYMENTNOTICE("PaymentNotice", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>PaymentReconciliation</b><br>
	 * Code Value: <b>PaymentReconciliation</b>
	 *
	 * This resource provides payment details and claim references supporting a bulk payment.
	 */
	PAYMENTRECONCILIATION("PaymentReconciliation", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Person</b><br>
	 * Code Value: <b>Person</b>
	 *
	 * Demographics and administrative information about a person independent of a specific health-related context.
	 */
	PERSON("Person", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Practitioner</b><br>
	 * Code Value: <b>Practitioner</b>
	 *
	 * A person who is directly or indirectly involved in the provisioning of healthcare.
	 */
	PRACTITIONER("Practitioner", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Procedure</b><br>
	 * Code Value: <b>Procedure</b>
	 *
	 * An action that is or was performed on a patient. This can be a physical intervention like an operation, or less invasive like counseling or hypnotherapy.
	 */
	PROCEDURE("Procedure", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ProcedureRequest</b><br>
	 * Code Value: <b>ProcedureRequest</b>
	 *
	 * A request for a procedure to be performed. May be a proposal or an order.
	 */
	PROCEDUREREQUEST("ProcedureRequest", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ProcessRequest</b><br>
	 * Code Value: <b>ProcessRequest</b>
	 *
	 * This resource provides the target, request and response, and action details for an action to be performed by the target on or about existing resources.
	 */
	PROCESSREQUEST("ProcessRequest", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ProcessResponse</b><br>
	 * Code Value: <b>ProcessResponse</b>
	 *
	 * This resource provides processing status, errors and notes from the processing of a resource.
	 */
	PROCESSRESPONSE("ProcessResponse", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Provenance</b><br>
	 * Code Value: <b>Provenance</b>
	 *
	 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
	 */
	PROVENANCE("Provenance", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Questionnaire</b><br>
	 * Code Value: <b>Questionnaire</b>
	 *
	 * A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
	 */
	QUESTIONNAIRE("Questionnaire", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>QuestionnaireResponse</b><br>
	 * Code Value: <b>QuestionnaireResponse</b>
	 *
	 * A structured set of questions and their answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions.
	 */
	QUESTIONNAIRERESPONSE("QuestionnaireResponse", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ReferralRequest</b><br>
	 * Code Value: <b>ReferralRequest</b>
	 *
	 * Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization.
	 */
	REFERRALREQUEST("ReferralRequest", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>RelatedPerson</b><br>
	 * Code Value: <b>RelatedPerson</b>
	 *
	 * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
	 */
	RELATEDPERSON("RelatedPerson", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Resource</b><br>
	 * Code Value: <b>Resource</b>
	 *
	 * --- Abstract Type! ---This is the base resource type for everything.
	 */
	RESOURCE("Resource", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>RiskAssessment</b><br>
	 * Code Value: <b>RiskAssessment</b>
	 *
	 * An assessment of the likely outcome(s) for a patient or other subject as well as the likelihood of each outcome.
	 */
	RISKASSESSMENT("RiskAssessment", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Schedule</b><br>
	 * Code Value: <b>Schedule</b>
	 *
	 * A container for slot(s) of time that may be available for booking appointments.
	 */
	SCHEDULE("Schedule", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>SearchParameter</b><br>
	 * Code Value: <b>SearchParameter</b>
	 *
	 * A search parameter that defines a named search item that can be used to search/filter on a resource.
	 */
	SEARCHPARAMETER("SearchParameter", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Slot</b><br>
	 * Code Value: <b>Slot</b>
	 *
	 * A slot of time on a schedule that may be available for booking appointments.
	 */
	SLOT("Slot", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Specimen</b><br>
	 * Code Value: <b>Specimen</b>
	 *
	 * A sample to be used for analysis.
	 */
	SPECIMEN("Specimen", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>StructureDefinition</b><br>
	 * Code Value: <b>StructureDefinition</b>
	 *
	 * A definition of a FHIR structure. This resource is used to describe the underlying resources, data types defined in FHIR, and also for describing extensions, and constraints on resources and data types.
	 */
	STRUCTUREDEFINITION("StructureDefinition", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Subscription</b><br>
	 * Code Value: <b>Subscription</b>
	 *
	 * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined "channel" so that another system is able to take an appropriate action.
	 */
	SUBSCRIPTION("Subscription", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>Substance</b><br>
	 * Code Value: <b>Substance</b>
	 *
	 * A homogeneous material with a definite composition.
	 */
	SUBSTANCE("Substance", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>SupplyDelivery</b><br>
	 * Code Value: <b>SupplyDelivery</b>
	 *
	 * Record of delivery of what is supplied.
	 */
	SUPPLYDELIVERY("SupplyDelivery", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>SupplyRequest</b><br>
	 * Code Value: <b>SupplyRequest</b>
	 *
	 * A record of a request for a medication, substance or device used in the healthcare setting.
	 */
	SUPPLYREQUEST("SupplyRequest", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>TestScript</b><br>
	 * Code Value: <b>TestScript</b>
	 *
	 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
	 */
	TESTSCRIPT("TestScript", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>ValueSet</b><br>
	 * Code Value: <b>ValueSet</b>
	 *
	 * A value set specifies a set of codes drawn from one or more code systems.
	 */
	VALUESET("ValueSet", "http://hl7.org/fhir/resource-types"),
	
	/**
	 * Display: <b>VisionPrescription</b><br>
	 * Code Value: <b>VisionPrescription</b>
	 *
	 * An authorization for the supply of glasses and/or contact lenses to a patient.
	 */
	VISIONPRESCRIPTION("VisionPrescription", "http://hl7.org/fhir/resource-types"),
	
	;
	
	/**
	 * Identifier for this Value Set:
	 * 
	 */
	public static final String VALUESET_IDENTIFIER = "";

	/**
	 * Name for this Value Set:
	 * ResourceType
	 */
	public static final String VALUESET_NAME = "ResourceType";

	private static Map<String, ResourceTypeEnum> CODE_TO_ENUM = new HashMap<String, ResourceTypeEnum>();
	private static Map<String, Map<String, ResourceTypeEnum>> SYSTEM_TO_CODE_TO_ENUM = new HashMap<String, Map<String, ResourceTypeEnum>>();
	
	private final String myCode;
	private final String mySystem;
	
	static {
		for (ResourceTypeEnum next : ResourceTypeEnum.values()) {
			CODE_TO_ENUM.put(next.getCode(), next);
			
			if (!SYSTEM_TO_CODE_TO_ENUM.containsKey(next.getSystem())) {
				SYSTEM_TO_CODE_TO_ENUM.put(next.getSystem(), new HashMap<String, ResourceTypeEnum>());
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
	public static ResourceTypeEnum forCode(String theCode) {
		ResourceTypeEnum retVal = CODE_TO_ENUM.get(theCode);
		return retVal;
	}

	/**
	 * Converts codes to their respective enumerated values
	 */
	public static final IValueSetEnumBinder<ResourceTypeEnum> VALUESET_BINDER = new IValueSetEnumBinder<ResourceTypeEnum>() {
		@Override
		public String toCodeString(ResourceTypeEnum theEnum) {
			return theEnum.getCode();
		}

		@Override
		public String toSystemString(ResourceTypeEnum theEnum) {
			return theEnum.getSystem();
		}
		
		@Override
		public ResourceTypeEnum fromCodeString(String theCodeString) {
			return CODE_TO_ENUM.get(theCodeString);
		}
		
		@Override
		public ResourceTypeEnum fromCodeString(String theCodeString, String theSystemString) {
			Map<String, ResourceTypeEnum> map = SYSTEM_TO_CODE_TO_ENUM.get(theSystemString);
			if (map == null) {
				return null;
			}
			return map.get(theCodeString);
		}
		
	};
	
	/** 
	 * Constructor
	 */
	ResourceTypeEnum(String theCode, String theSystem) {
		myCode = theCode;
		mySystem = theSystem;
	}

	
}
