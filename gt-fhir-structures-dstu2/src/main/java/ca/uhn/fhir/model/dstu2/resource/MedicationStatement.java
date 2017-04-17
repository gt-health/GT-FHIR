















package ca.uhn.fhir.model.dstu2.resource;

import java.math.BigDecimal;
import java.net.URI;
import java.util.*;
import ca.uhn.fhir.model.api.*;
import ca.uhn.fhir.model.api.annotation.*;
import ca.uhn.fhir.rest.gclient.*;

import ca.uhn.fhir.model.dstu2.valueset.AccountStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ActionListEnum;
import ca.uhn.fhir.model.dstu2.composite.AddressDt;
import ca.uhn.fhir.model.dstu2.valueset.AdjudicationCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.AdjudicationErrorCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.AdjustmentReasonCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.AdministrativeGenderEnum;
import ca.uhn.fhir.model.dstu2.valueset.AdmitSourceEnum;
import ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCategoryEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCertaintyEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceCriticalityEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceSeverityEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.AllergyIntoleranceTypeEnum;
import ca.uhn.fhir.model.dstu2.composite.AnnotationDt;
import ca.uhn.fhir.model.dstu2.valueset.AnswerFormatEnum;
import ca.uhn.fhir.model.dstu2.resource.Appointment;
import ca.uhn.fhir.model.dstu2.valueset.AppointmentStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.AssertionDirectionTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AssertionOperatorTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AssertionResponseTypesEnum;
import ca.uhn.fhir.model.dstu2.composite.AttachmentDt;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventActionEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventObjectLifecycleEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventObjectRoleEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventObjectTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventOutcomeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventParticipantNetworkTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.AuditEventSourceTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.BindingStrengthEnum;
import ca.uhn.fhir.model.dstu2.resource.BodySite;
import ca.uhn.fhir.model.dstu2.valueset.BundleTypeEnum;
import ca.uhn.fhir.model.dstu2.resource.CarePlan;
import ca.uhn.fhir.model.dstu2.valueset.CarePlanActivityStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.CarePlanRelationshipEnum;
import ca.uhn.fhir.model.dstu2.valueset.CarePlanStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Claim;
import ca.uhn.fhir.model.dstu2.resource.ClaimResponse;
import ca.uhn.fhir.model.dstu2.valueset.ClaimTypeEnum;
import ca.uhn.fhir.model.dstu2.resource.ClinicalImpression;
import ca.uhn.fhir.model.dstu2.valueset.ClinicalImpressionStatusEnum;
import ca.uhn.fhir.model.dstu2.composite.CodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.CodingDt;
import ca.uhn.fhir.model.dstu2.resource.CommunicationRequest;
import ca.uhn.fhir.model.dstu2.valueset.CommunicationRequestStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.CommunicationStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Composition;
import ca.uhn.fhir.model.dstu2.valueset.CompositionAttestationModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.CompositionStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConceptMapEquivalenceEnum;
import ca.uhn.fhir.model.dstu2.resource.Condition;
import ca.uhn.fhir.model.dstu2.valueset.ConditionCategoryCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConditionClinicalStatusCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConditionVerificationStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConditionalDeleteStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Conformance;
import ca.uhn.fhir.model.dstu2.valueset.ConformanceEventModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConformanceResourceStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ConformanceStatementKindEnum;
import ca.uhn.fhir.model.dstu2.composite.ContactPointDt;
import ca.uhn.fhir.model.dstu2.valueset.ContentTypeEnum;
import ca.uhn.fhir.model.dstu2.resource.Contract;
import ca.uhn.fhir.model.dstu2.resource.Coverage;
import ca.uhn.fhir.model.dstu2.valueset.DataElementStringencyEnum;
import ca.uhn.fhir.model.dstu2.valueset.DaysOfWeekEnum;
import ca.uhn.fhir.model.dstu2.valueset.DetectedIssueSeverityEnum;
import ca.uhn.fhir.model.dstu2.resource.Device;
import ca.uhn.fhir.model.dstu2.resource.DeviceComponent;
import ca.uhn.fhir.model.dstu2.resource.DeviceMetric;
import ca.uhn.fhir.model.dstu2.valueset.DeviceMetricCalibrationStateEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceMetricCalibrationTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceMetricCategoryEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceMetricColorEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceMetricOperationalStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.DeviceUseRequest;
import ca.uhn.fhir.model.dstu2.valueset.DeviceUseRequestPriorityEnum;
import ca.uhn.fhir.model.dstu2.valueset.DeviceUseRequestStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderPriorityEnum;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticOrderStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.DiagnosticReport;
import ca.uhn.fhir.model.dstu2.valueset.DiagnosticReportStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.DigitalMediaTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.DocumentModeEnum;
import ca.uhn.fhir.model.dstu2.resource.DocumentReference;
import ca.uhn.fhir.model.dstu2.valueset.DocumentReferenceStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.DocumentRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu2.composite.ElementDefinitionDt;
import ca.uhn.fhir.model.dstu2.resource.EligibilityRequest;
import ca.uhn.fhir.model.dstu2.resource.Encounter;
import ca.uhn.fhir.model.dstu2.valueset.EncounterClassEnum;
import ca.uhn.fhir.model.dstu2.valueset.EncounterLocationStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.EncounterStateEnum;
import ca.uhn.fhir.model.dstu2.resource.EnrollmentRequest;
import ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare;
import ca.uhn.fhir.model.dstu2.valueset.EpisodeOfCareStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ExtensionContextEnum;
import ca.uhn.fhir.model.dstu2.valueset.FamilyHistoryStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.FamilyMemberHistory;
import ca.uhn.fhir.model.dstu2.valueset.FilterOperatorEnum;
import ca.uhn.fhir.model.dstu2.valueset.FlagStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Goal;
import ca.uhn.fhir.model.dstu2.valueset.GoalPriorityEnum;
import ca.uhn.fhir.model.dstu2.valueset.GoalStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Group;
import ca.uhn.fhir.model.dstu2.valueset.GroupTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.GuideDependencyTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.GuidePageKindEnum;
import ca.uhn.fhir.model.dstu2.valueset.GuideResourcePurposeEnum;
import ca.uhn.fhir.model.dstu2.valueset.HTTPVerbEnum;
import ca.uhn.fhir.model.dstu2.resource.HealthcareService;
import ca.uhn.fhir.model.dstu2.composite.HumanNameDt;
import ca.uhn.fhir.model.dstu2.composite.IdentifierDt;
import ca.uhn.fhir.model.dstu2.valueset.IdentifierTypeCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.IdentityAssuranceLevelEnum;
import ca.uhn.fhir.model.dstu2.resource.ImagingObjectSelection;
import ca.uhn.fhir.model.dstu2.resource.ImagingStudy;
import ca.uhn.fhir.model.dstu2.resource.Immunization;
import ca.uhn.fhir.model.dstu2.valueset.InstanceAvailabilityEnum;
import ca.uhn.fhir.model.dstu2.valueset.IssueSeverityEnum;
import ca.uhn.fhir.model.dstu2.valueset.IssueTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.KOStitleEnum;
import ca.uhn.fhir.model.dstu2.valueset.LinkTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ListModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ListOrderCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.ListStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Location;
import ca.uhn.fhir.model.dstu2.valueset.LocationModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.LocationStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.LocationTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.MaritalStatusCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.MeasmntPrincipleEnum;
import ca.uhn.fhir.model.dstu2.resource.Media;
import ca.uhn.fhir.model.dstu2.resource.Medication;
import ca.uhn.fhir.model.dstu2.valueset.MedicationAdministrationStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.MedicationDispenseStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.MedicationOrder;
import ca.uhn.fhir.model.dstu2.valueset.MedicationOrderStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.MedicationStatement;
import ca.uhn.fhir.model.dstu2.valueset.MedicationStatementStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.MessageEventEnum;
import ca.uhn.fhir.model.dstu2.valueset.MessageSignificanceCategoryEnum;
import ca.uhn.fhir.model.dstu2.valueset.MessageTransportEnum;
import ca.uhn.fhir.model.dstu2.resource.NamingSystem;
import ca.uhn.fhir.model.dstu2.valueset.NamingSystemIdentifierTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.NamingSystemTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.NoteTypeEnum;
import ca.uhn.fhir.model.dstu2.resource.NutritionOrder;
import ca.uhn.fhir.model.dstu2.valueset.NutritionOrderStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Observation;
import ca.uhn.fhir.model.dstu2.valueset.ObservationRelationshipTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ObservationStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.OperationDefinition;
import ca.uhn.fhir.model.dstu2.valueset.OperationKindEnum;
import ca.uhn.fhir.model.dstu2.resource.OperationOutcome;
import ca.uhn.fhir.model.dstu2.valueset.OperationParameterUseEnum;
import ca.uhn.fhir.model.dstu2.resource.Order;
import ca.uhn.fhir.model.dstu2.valueset.OrderStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Organization;
import ca.uhn.fhir.model.dstu2.valueset.ParticipantRequiredEnum;
import ca.uhn.fhir.model.dstu2.valueset.ParticipantStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ParticipantTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ParticipationStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Patient;
import ca.uhn.fhir.model.dstu2.valueset.PayeeTypeCodesEnum;
import ca.uhn.fhir.model.dstu2.composite.PeriodDt;
import ca.uhn.fhir.model.dstu2.resource.Person;
import ca.uhn.fhir.model.dstu2.resource.Practitioner;
import ca.uhn.fhir.model.dstu2.resource.Procedure;
import ca.uhn.fhir.model.dstu2.resource.ProcedureRequest;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestPriorityEnum;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureRequestStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.ProcedureStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.ProcessRequest;
import ca.uhn.fhir.model.dstu2.valueset.ProvenanceEntityRoleEnum;
import ca.uhn.fhir.model.dstu2.composite.QuantityDt;
import ca.uhn.fhir.model.dstu2.resource.Questionnaire;
import ca.uhn.fhir.model.dstu2.resource.QuestionnaireResponse;
import ca.uhn.fhir.model.dstu2.valueset.QuestionnaireResponseStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.QuestionnaireStatusEnum;
import ca.uhn.fhir.model.dstu2.composite.RangeDt;
import ca.uhn.fhir.model.dstu2.composite.RatioDt;
import ca.uhn.fhir.model.dstu2.valueset.ReferralMethodEnum;
import ca.uhn.fhir.model.dstu2.resource.ReferralRequest;
import ca.uhn.fhir.model.dstu2.valueset.ReferralStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.RelatedPerson;
import ca.uhn.fhir.model.dstu2.valueset.RemittanceOutcomeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ResourceTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ResourceVersionPolicyEnum;
import ca.uhn.fhir.model.dstu2.valueset.ResponseTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.RestfulConformanceModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.RestfulSecurityServiceEnum;
import ca.uhn.fhir.model.dstu2.resource.RiskAssessment;
import ca.uhn.fhir.model.dstu2.valueset.RulesetCodesEnum;
import ca.uhn.fhir.model.dstu2.composite.SampledDataDt;
import ca.uhn.fhir.model.dstu2.resource.Schedule;
import ca.uhn.fhir.model.dstu2.valueset.SearchEntryModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.SearchModifierCodeEnum;
import ca.uhn.fhir.model.dstu2.valueset.SearchParamTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.ServiceProvisionConditionsEnum;
import ca.uhn.fhir.model.dstu2.composite.SignatureDt;
import ca.uhn.fhir.model.dstu2.resource.Slot;
import ca.uhn.fhir.model.dstu2.valueset.SlotStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Specimen;
import ca.uhn.fhir.model.dstu2.valueset.SpecimenStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.StructureDefinition;
import ca.uhn.fhir.model.dstu2.valueset.StructureDefinitionKindEnum;
import ca.uhn.fhir.model.dstu2.valueset.SubscriptionChannelTypeEnum;
import ca.uhn.fhir.model.dstu2.valueset.SubscriptionStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.Substance;
import ca.uhn.fhir.model.dstu2.valueset.SubstanceCategoryCodesEnum;
import ca.uhn.fhir.model.dstu2.valueset.SupplyDeliveryStatusEnum;
import ca.uhn.fhir.model.dstu2.resource.SupplyRequest;
import ca.uhn.fhir.model.dstu2.valueset.SupplyRequestStatusEnum;
import ca.uhn.fhir.model.dstu2.valueset.SystemRestfulInteractionEnum;
import ca.uhn.fhir.model.api.TemporalPrecisionEnum;
import ca.uhn.fhir.model.dstu2.composite.TimingDt;
import ca.uhn.fhir.model.dstu2.valueset.TransactionModeEnum;
import ca.uhn.fhir.model.dstu2.valueset.TypeRestfulInteractionEnum;
import ca.uhn.fhir.model.dstu2.valueset.UnknownContentCodeEnum;
import ca.uhn.fhir.model.dstu2.valueset.UseEnum;
import ca.uhn.fhir.model.dstu2.resource.ValueSet;
import ca.uhn.fhir.model.dstu2.valueset.VisionBaseEnum;
import ca.uhn.fhir.model.dstu2.valueset.VisionEyesEnum;
import ca.uhn.fhir.model.dstu2.resource.VisionPrescription;
import ca.uhn.fhir.model.dstu2.valueset.XPathUsageTypeEnum;
import ca.uhn.fhir.model.api.IResource;
import ca.uhn.fhir.model.dstu2.composite.AgeDt;
import ca.uhn.fhir.model.dstu2.composite.BoundCodeableConceptDt;
import ca.uhn.fhir.model.dstu2.composite.DurationDt;
import ca.uhn.fhir.model.dstu2.composite.MoneyDt;
import ca.uhn.fhir.model.dstu2.composite.NarrativeDt;
import ca.uhn.fhir.model.dstu2.composite.ResourceReferenceDt;
import ca.uhn.fhir.model.dstu2.composite.SimpleQuantityDt;
import ca.uhn.fhir.model.primitive.Base64BinaryDt;
import ca.uhn.fhir.model.primitive.BooleanDt;
import ca.uhn.fhir.model.primitive.BoundCodeDt;
import ca.uhn.fhir.model.primitive.CodeDt;
import ca.uhn.fhir.model.primitive.DateDt;
import ca.uhn.fhir.model.primitive.DateTimeDt;
import ca.uhn.fhir.model.primitive.DecimalDt;
import ca.uhn.fhir.model.primitive.IdDt;
import ca.uhn.fhir.model.primitive.InstantDt;
import ca.uhn.fhir.model.primitive.IntegerDt;
import ca.uhn.fhir.model.primitive.OidDt;
import ca.uhn.fhir.model.primitive.PositiveIntDt;
import ca.uhn.fhir.model.primitive.StringDt;
import ca.uhn.fhir.model.primitive.TimeDt;
import ca.uhn.fhir.model.primitive.UnsignedIntDt;
import ca.uhn.fhir.model.primitive.UriDt;


/**
 * HAPI/FHIR <b>MedicationStatement</b> Resource
 * (clinical.medication)
 *
 * <p>
 * <b>Definition:</b>
 * A record of a medication that is being consumed by a patient.   A MedicationStatement may indicate that the patient may be taking the medication now, or has taken the medication in the past or will be taking the medication in the future.  The source of this information can be the patient, significant other (such as a family member or spouse), or a clinician.  A common scenario where this information is captured is during the history taking process during a patient visit or stay.   The medication information may come from e.g. the patient's memory, from a prescription bottle,  or from a list of medications the patient, clinician or other party maintains The primary difference between a medication statement and a medication administration is that the medication administration has complete administration information and is based on actual administration information from the person who administered the medication.  A medication statement is often, if not always, less specific.  There is no required date/time when the medication was administered, in fact we only know that a source has reported the patient is taking this medication, where details such as time, quantity, or rate or even medication product may be incomplete or missing or less precise.  As stated earlier, the medication statement information may come from the patient's memory, from a prescription bottle or from a list of medications the patient, clinician or other party maintains.  Medication administration is more formal and is not missing detailed information.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/MedicationStatement">http://hl7.org/fhir/profiles/MedicationStatement</a> 
 * </p>
 *
 */
@ResourceDef(name="MedicationStatement", profile="http://hl7.org/fhir/profiles/MedicationStatement", id="medicationstatement")
public class MedicationStatement extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Return statements with this external identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationStatement.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="MedicationStatement.identifier", description="Return statements with this external identifier", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Return statements with this external identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationStatement.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>medication</b>
	 * <p>
	 * Description: <b>Return administrations of this medication reference</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationStatement.medicationReference</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="medication", path="MedicationStatement.medicationReference", description="Return administrations of this medication reference", type="reference"  )
	public static final String SP_MEDICATION = "medication";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>medication</b>
	 * <p>
	 * Description: <b>Return administrations of this medication reference</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationStatement.medicationReference</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam MEDICATION = new ReferenceClientParam(SP_MEDICATION);

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>Return administrations of this medication code</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationStatement.medicationCodeableConcept</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="MedicationStatement.medicationCodeableConcept", description="Return administrations of this medication code", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>Return administrations of this medication code</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationStatement.medicationCodeableConcept</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of a patient to list statements  for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationStatement.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="MedicationStatement.patient", description="The identity of a patient to list statements  for", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of a patient to list statements  for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationStatement.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>effectivedate</b>
	 * <p>
	 * Description: <b>Date when patient was taking (or not taking) the medication</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>MedicationStatement.effective[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="effectivedate", path="MedicationStatement.effective[x]", description="Date when patient was taking (or not taking) the medication", type="date"  )
	public static final String SP_EFFECTIVEDATE = "effectivedate";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>effectivedate</b>
	 * <p>
	 * Description: <b>Date when patient was taking (or not taking) the medication</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>MedicationStatement.effective[x]</b><br>
	 * </p>
	 */
	public static final DateClientParam EFFECTIVEDATE = new DateClientParam(SP_EFFECTIVEDATE);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Return statements that match the given status</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationStatement.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="MedicationStatement.status", description="Return statements that match the given status", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Return statements that match the given status</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MedicationStatement.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b>Who the information in the statement came from</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationStatement.informationSource</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="source", path="MedicationStatement.informationSource", description="Who the information in the statement came from", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_SOURCE = "source";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b>Who the information in the statement came from</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MedicationStatement.informationSource</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SOURCE = new ReferenceClientParam(SP_SOURCE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationStatement:medication</b>".
	 */
	public static final Include INCLUDE_MEDICATION = new Include("MedicationStatement:medication");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationStatement:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("MedicationStatement:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MedicationStatement:source</b>".
	 */
	public static final Include INCLUDE_SOURCE = new Include("MedicationStatement:source");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="patient", order=1, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The person or animal who is/was taking the medication."
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="informationSource", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="who.source",
		formalDefinition="The person who provided the information about the taking of this medication."
	)
	private ResourceReferenceDt myInformationSource;
	
	@Child(name="dateAsserted", type=DateTimeDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date when the medication statement was asserted by the information source."
	)
	private DateTimeDt myDateAsserted;
	
	@Child(name="status", type=CodeDt.class, order=4, min=1, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/medication-statement-status")
	private BoundCodeDt<MedicationStatementStatusEnum> myStatus;
	
	@Child(name="wasNotTaken", type=BooleanDt.class, order=5, min=0, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="Set this to true if the record is saying that the medication was NOT taken."
	)
	private BooleanDt myWasNotTaken;
	
	@Child(name="reasonNotTaken", type=CodeableConceptDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code indicating why the medication was not taken."
	)
	private java.util.List<CodeableConceptDt> myReasonNotTaken;
	
	@Child(name="reasonForUse", order=7, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		Condition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A reason for why the medication is being/was taken."
	)
	private IDatatype myReasonForUse;
	
	@Child(name="effective", order=8, min=0, max=1, summary=false, modifier=false, type={
		DateTimeDt.class, 		PeriodDt.class	})
	@Description(
		shortDefinition="when.done",
		formalDefinition="The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true)."
	)
	private IDatatype myEffective;
	
	@Child(name="note", type=StringDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Provides extra information about the medication statement that is not conveyed by the other attributes."
	)
	private StringDt myNote;
	
	@Child(name="supportingInformation", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Allows linking the MedicationStatement to the underlying MedicationOrder, or to other information that supports the MedicationStatement."
	)
	private java.util.List<ResourceReferenceDt> mySupportingInformation;
	
	@Child(name="medication", order=11, min=1, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		Medication.class	})
	@Description(
		shortDefinition="what",
		formalDefinition="Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications."
	)
	private IDatatype myMedication;
	
	@Child(name="dosage", order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates how the medication is/was used by the patient"
	)
	private java.util.List<Dosage> myDosage;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myPatient,  myInformationSource,  myDateAsserted,  myStatus,  myWasNotTaken,  myReasonNotTaken,  myReasonForUse,  myEffective,  myNote,  mySupportingInformation,  myMedication,  myDosage);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myPatient, myInformationSource, myDateAsserted, myStatus, myWasNotTaken, myReasonNotTaken, myReasonForUse, myEffective, myNote, mySupportingInformation, myMedication, myDosage);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
     * </p> 
	 */
	public java.util.List<IdentifierDt> getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new java.util.ArrayList<IdentifierDt>();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
     * </p> 
	 */
	public MedicationStatement setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
     * </p> 
	 */
	public IdentifierDt addIdentifier() {
		IdentifierDt newType = new IdentifierDt();
		getIdentifier().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>identifier</b> (id)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public MedicationStatement addIdentifier(IdentifierDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getIdentifier().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>identifier</b> (id),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * External identifier - FHIR will generate its own internal identifiers (probably URLs) which do not need to be explicitly managed by the resource.  The identifier here is one that would be used by another non-FHIR system - for example an automated medication pump would provide a record each time it operated; an administration while the patient was off the ward might be made with a different system and entered after the event.  Particularly important if these records have to be updated.
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>patient</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The person or animal who is/was taking the medication.
     * </p> 
	 */
	public ResourceReferenceDt getPatient() {  
		if (myPatient == null) {
			myPatient = new ResourceReferenceDt();
		}
		return myPatient;
	}

	/**
	 * Sets the value(s) for <b>patient</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * The person or animal who is/was taking the medication.
     * </p> 
	 */
	public MedicationStatement setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>informationSource</b> (who.source).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The person who provided the information about the taking of this medication.
     * </p> 
	 */
	public ResourceReferenceDt getInformationSource() {  
		if (myInformationSource == null) {
			myInformationSource = new ResourceReferenceDt();
		}
		return myInformationSource;
	}

	/**
	 * Sets the value(s) for <b>informationSource</b> (who.source)
	 *
     * <p>
     * <b>Definition:</b>
     * The person who provided the information about the taking of this medication.
     * </p> 
	 */
	public MedicationStatement setInformationSource(ResourceReferenceDt theValue) {
		myInformationSource = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dateAsserted</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the medication statement was asserted by the information source.
     * </p> 
	 */
	public DateTimeDt getDateAssertedElement() {  
		if (myDateAsserted == null) {
			myDateAsserted = new DateTimeDt();
		}
		return myDateAsserted;
	}

	
	/**
	 * Gets the value(s) for <b>dateAsserted</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the medication statement was asserted by the information source.
     * </p> 
	 */
	public Date getDateAsserted() {  
		return getDateAssertedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>dateAsserted</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the medication statement was asserted by the information source.
     * </p> 
	 */
	public MedicationStatement setDateAsserted(DateTimeDt theValue) {
		myDateAsserted = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>dateAsserted</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the medication statement was asserted by the information source.
     * </p> 
	 */
	public MedicationStatement setDateAsserted( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDateAsserted = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>dateAsserted</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the medication statement was asserted by the information source.
     * </p> 
	 */
	public MedicationStatement setDateAssertedWithSecondsPrecision( Date theDate) {
		myDateAsserted = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.
     * </p> 
	 */
	public BoundCodeDt<MedicationStatementStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<MedicationStatementStatusEnum>(MedicationStatementStatusEnum.VALUESET_BINDER);
		}
		return myStatus;
	}

	
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.
     * </p> 
	 */
	public String getStatus() {  
		return getStatusElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.
     * </p> 
	 */
	public MedicationStatement setStatus(BoundCodeDt<MedicationStatementStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code representing the patient or other source's judgment about the state of the medication used that this statement is about.  Generally this will be active or completed.
     * </p> 
	 */
	public MedicationStatement setStatus(MedicationStatementStatusEnum theValue) {
		setStatus(new BoundCodeDt<MedicationStatementStatusEnum>(MedicationStatementStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>wasNotTaken</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Set this to true if the record is saying that the medication was NOT taken.
     * </p> 
	 */
	public BooleanDt getWasNotTakenElement() {  
		if (myWasNotTaken == null) {
			myWasNotTaken = new BooleanDt();
		}
		return myWasNotTaken;
	}

	
	/**
	 * Gets the value(s) for <b>wasNotTaken</b> (status).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Set this to true if the record is saying that the medication was NOT taken.
     * </p> 
	 */
	public Boolean getWasNotTaken() {  
		return getWasNotTakenElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>wasNotTaken</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Set this to true if the record is saying that the medication was NOT taken.
     * </p> 
	 */
	public MedicationStatement setWasNotTaken(BooleanDt theValue) {
		myWasNotTaken = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>wasNotTaken</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Set this to true if the record is saying that the medication was NOT taken.
     * </p> 
	 */
	public MedicationStatement setWasNotTaken( boolean theBoolean) {
		myWasNotTaken = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>reasonNotTaken</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code indicating why the medication was not taken.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getReasonNotTaken() {  
		if (myReasonNotTaken == null) {
			myReasonNotTaken = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myReasonNotTaken;
	}

	/**
	 * Sets the value(s) for <b>reasonNotTaken</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code indicating why the medication was not taken.
     * </p> 
	 */
	public MedicationStatement setReasonNotTaken(java.util.List<CodeableConceptDt> theValue) {
		myReasonNotTaken = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reasonNotTaken</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code indicating why the medication was not taken.
     * </p> 
	 */
	public CodeableConceptDt addReasonNotTaken() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getReasonNotTaken().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>reasonNotTaken</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A code indicating why the medication was not taken.
	 * </p>
	 * @param theValue The reasonNotTaken to add (must not be <code>null</code>)
	 */
	public MedicationStatement addReasonNotTaken(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getReasonNotTaken().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>reasonNotTaken</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A code indicating why the medication was not taken.
     * </p> 
	 */
	public CodeableConceptDt getReasonNotTakenFirstRep() {
		if (getReasonNotTaken().isEmpty()) {
			return addReasonNotTaken();
		}
		return getReasonNotTaken().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>reasonForUse[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reason for why the medication is being/was taken.
     * </p> 
	 */
	public IDatatype getReasonForUse() {  
		return myReasonForUse;
	}

	/**
	 * Sets the value(s) for <b>reasonForUse[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A reason for why the medication is being/was taken.
     * </p> 
	 */
	public MedicationStatement setReasonForUse(IDatatype theValue) {
		myReasonForUse = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>effective[x]</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).
     * </p> 
	 */
	public IDatatype getEffective() {  
		return myEffective;
	}

	/**
	 * Sets the value(s) for <b>effective[x]</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * The interval of time during which it is being asserted that the patient was taking the medication (or was not taking, when the wasNotGiven element is true).
     * </p> 
	 */
	public MedicationStatement setEffective(IDatatype theValue) {
		myEffective = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Provides extra information about the medication statement that is not conveyed by the other attributes.
     * </p> 
	 */
	public StringDt getNoteElement() {  
		if (myNote == null) {
			myNote = new StringDt();
		}
		return myNote;
	}

	
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Provides extra information about the medication statement that is not conveyed by the other attributes.
     * </p> 
	 */
	public String getNote() {  
		return getNoteElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Provides extra information about the medication statement that is not conveyed by the other attributes.
     * </p> 
	 */
	public MedicationStatement setNote(StringDt theValue) {
		myNote = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Provides extra information about the medication statement that is not conveyed by the other attributes.
     * </p> 
	 */
	public MedicationStatement setNote( String theString) {
		myNote = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>supportingInformation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Allows linking the MedicationStatement to the underlying MedicationOrder, or to other information that supports the MedicationStatement.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getSupportingInformation() {  
		if (mySupportingInformation == null) {
			mySupportingInformation = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return mySupportingInformation;
	}

	/**
	 * Sets the value(s) for <b>supportingInformation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Allows linking the MedicationStatement to the underlying MedicationOrder, or to other information that supports the MedicationStatement.
     * </p> 
	 */
	public MedicationStatement setSupportingInformation(java.util.List<ResourceReferenceDt> theValue) {
		mySupportingInformation = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>supportingInformation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Allows linking the MedicationStatement to the underlying MedicationOrder, or to other information that supports the MedicationStatement.
     * </p> 
	 */
	public ResourceReferenceDt addSupportingInformation() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getSupportingInformation().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>medication[x]</b> (what).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
     * </p> 
	 */
	public IDatatype getMedication() {  
		return myMedication;
	}

	/**
	 * Sets the value(s) for <b>medication[x]</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the medication being administered. This is either a link to a resource representing the details of the medication or a simple attribute carrying a code that identifies the medication from a known list of medications.
     * </p> 
	 */
	public MedicationStatement setMedication(IDatatype theValue) {
		myMedication = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dosage</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates how the medication is/was used by the patient
     * </p> 
	 */
	public java.util.List<Dosage> getDosage() {  
		if (myDosage == null) {
			myDosage = new java.util.ArrayList<Dosage>();
		}
		return myDosage;
	}

	/**
	 * Sets the value(s) for <b>dosage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates how the medication is/was used by the patient
     * </p> 
	 */
	public MedicationStatement setDosage(java.util.List<Dosage> theValue) {
		myDosage = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>dosage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates how the medication is/was used by the patient
     * </p> 
	 */
	public Dosage addDosage() {
		Dosage newType = new Dosage();
		getDosage().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>dosage</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Indicates how the medication is/was used by the patient
	 * </p>
	 * @param theValue The dosage to add (must not be <code>null</code>)
	 */
	public MedicationStatement addDosage(Dosage theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDosage().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>dosage</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates how the medication is/was used by the patient
     * </p> 
	 */
	public Dosage getDosageFirstRep() {
		if (getDosage().isEmpty()) {
			return addDosage();
		}
		return getDosage().get(0); 
	}
  
	/**
	 * Block class for child element: <b>MedicationStatement.dosage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates how the medication is/was used by the patient
     * </p> 
	 */
	@Block()	
	public static class Dosage 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="text", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Free text dosage information as reported about a patient's medication use. When coded dosage information is present, the free text may still be present for display to humans."
	)
	private StringDt myText;
	
	@Child(name="timing", type=TimingDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions, for example.  \"Every  8 hours\"; \"Three times a day\"; \"1/2 an hour before breakfast for 10 days from 23-Dec 2011:\";  \"15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\""
	)
	private TimingDt myTiming;
	
	@Child(name="asNeeded", order=2, min=0, max=1, summary=false, modifier=false, type={
		BooleanDt.class, 		CodeableConceptDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).  Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule."
	)
	private IDatatype myAsNeeded;
	
	@Child(name="site", order=3, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		BodySite.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A coded specification of or a reference to the anatomic site where the medication first enters the body"
	)
	private IDatatype mySite;
	
	@Child(name="route", type=CodeableConceptDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject."
	)
	private CodeableConceptDt myRoute;
	
	@Child(name="method", type=CodeableConceptDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV."
	)
	private CodeableConceptDt myMethod;
	
	@Child(name="quantity", order=6, min=0, max=1, summary=false, modifier=false, type={
		SimpleQuantityDt.class, 		RangeDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The amount of therapeutic or other substance given at one administration event."
	)
	private IDatatype myQuantity;
	
	@Child(name="rate", order=7, min=0, max=1, summary=false, modifier=false, type={
		RatioDt.class, 		RangeDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours"
	)
	private IDatatype myRate;
	
	@Child(name="maxDosePerPeriod", type=RatioDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time.  For example, 1000mg in 24 hours."
	)
	private RatioDt myMaxDosePerPeriod;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myText,  myTiming,  myAsNeeded,  mySite,  myRoute,  myMethod,  myQuantity,  myRate,  myMaxDosePerPeriod);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myText, myTiming, myAsNeeded, mySite, myRoute, myMethod, myQuantity, myRate, myMaxDosePerPeriod);
	}

	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Free text dosage information as reported about a patient's medication use. When coded dosage information is present, the free text may still be present for display to humans.
     * </p> 
	 */
	public StringDt getTextElement() {  
		if (myText == null) {
			myText = new StringDt();
		}
		return myText;
	}

	
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Free text dosage information as reported about a patient's medication use. When coded dosage information is present, the free text may still be present for display to humans.
     * </p> 
	 */
	public String getText() {  
		return getTextElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Free text dosage information as reported about a patient's medication use. When coded dosage information is present, the free text may still be present for display to humans.
     * </p> 
	 */
	public Dosage setText(StringDt theValue) {
		myText = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Free text dosage information as reported about a patient's medication use. When coded dosage information is present, the free text may still be present for display to humans.
     * </p> 
	 */
	public Dosage setText( String theString) {
		myText = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>timing</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions, for example.  \&quot;Every  8 hours\&quot;; \&quot;Three times a day\&quot;; \&quot;1/2 an hour before breakfast for 10 days from 23-Dec 2011:\&quot;;  \&quot;15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\&quot;
     * </p> 
	 */
	public TimingDt getTiming() {  
		if (myTiming == null) {
			myTiming = new TimingDt();
		}
		return myTiming;
	}

	/**
	 * Sets the value(s) for <b>timing</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The timing schedule for giving the medication to the patient.  The Schedule data type allows many different expressions, for example.  \&quot;Every  8 hours\&quot;; \&quot;Three times a day\&quot;; \&quot;1/2 an hour before breakfast for 10 days from 23-Dec 2011:\&quot;;  \&quot;15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\&quot;
     * </p> 
	 */
	public Dosage setTiming(TimingDt theValue) {
		myTiming = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>asNeeded[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).  Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.
     * </p> 
	 */
	public IDatatype getAsNeeded() {  
		return myAsNeeded;
	}

	/**
	 * Sets the value(s) for <b>asNeeded[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the Medication is only taken when needed within a specific dosing schedule (Boolean option), or it indicates the precondition for taking the Medication (CodeableConcept).  Specifically if 'boolean' datatype is selected, then the following logic applies:  If set to True, this indicates that the medication is only taken when needed, within the specified schedule.
     * </p> 
	 */
	public Dosage setAsNeeded(IDatatype theValue) {
		myAsNeeded = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>site[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A coded specification of or a reference to the anatomic site where the medication first enters the body
     * </p> 
	 */
	public IDatatype getSite() {  
		return mySite;
	}

	/**
	 * Sets the value(s) for <b>site[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A coded specification of or a reference to the anatomic site where the medication first enters the body
     * </p> 
	 */
	public Dosage setSite(IDatatype theValue) {
		mySite = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>route</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject.
     * </p> 
	 */
	public CodeableConceptDt getRoute() {  
		if (myRoute == null) {
			myRoute = new CodeableConceptDt();
		}
		return myRoute;
	}

	/**
	 * Sets the value(s) for <b>route</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying the route or physiological path of administration of a therapeutic agent into or onto a subject.
     * </p> 
	 */
	public Dosage setRoute(CodeableConceptDt theValue) {
		myRoute = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>method</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.
     * </p> 
	 */
	public CodeableConceptDt getMethod() {  
		if (myMethod == null) {
			myMethod = new CodeableConceptDt();
		}
		return myMethod;
	}

	/**
	 * Sets the value(s) for <b>method</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A coded value indicating the method by which the medication is intended to be or was introduced into or on the body.  This attribute will most often NOT be populated.  It is most commonly used for injections.  For example, Slow Push, Deep IV.
     * </p> 
	 */
	public Dosage setMethod(CodeableConceptDt theValue) {
		myMethod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>quantity[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of therapeutic or other substance given at one administration event.
     * </p> 
	 */
	public IDatatype getQuantity() {  
		return myQuantity;
	}

	/**
	 * Sets the value(s) for <b>quantity[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of therapeutic or other substance given at one administration event.
     * </p> 
	 */
	public Dosage setQuantity(IDatatype theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>rate[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours
     * </p> 
	 */
	public IDatatype getRate() {  
		return myRate;
	}

	/**
	 * Sets the value(s) for <b>rate[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the speed with which the medication was or will be introduced into the patient. Typically the rate for an infusion e.g. 100 ml per 1 hour or 100 ml/hr.  May also be expressed as a rate per unit of time e.g. 500 ml per 2 hours.   Currently we do not specify a default of '1' in the denominator, but this is being discussed. Other examples: 200 mcg/min or 200 mcg/1 minute; 1 liter/8 hours
     * </p> 
	 */
	public Dosage setRate(IDatatype theValue) {
		myRate = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>maxDosePerPeriod</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time.  For example, 1000mg in 24 hours.
     * </p> 
	 */
	public RatioDt getMaxDosePerPeriod() {  
		if (myMaxDosePerPeriod == null) {
			myMaxDosePerPeriod = new RatioDt();
		}
		return myMaxDosePerPeriod;
	}

	/**
	 * Sets the value(s) for <b>maxDosePerPeriod</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The maximum total quantity of a therapeutic substance that may be administered to a subject over the period of time.  For example, 1000mg in 24 hours.
     * </p> 
	 */
	public Dosage setMaxDosePerPeriod(RatioDt theValue) {
		myMaxDosePerPeriod = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "MedicationStatement";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
