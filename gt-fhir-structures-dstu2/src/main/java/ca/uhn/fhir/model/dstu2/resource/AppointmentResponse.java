















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
 * HAPI/FHIR <b>AppointmentResponse</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * A reply to an appointment request for a patient and/or practitioner(s), such as a confirmation or rejection.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/AppointmentResponse">http://hl7.org/fhir/profiles/AppointmentResponse</a> 
 * </p>
 *
 */
@ResourceDef(name="AppointmentResponse", profile="http://hl7.org/fhir/profiles/AppointmentResponse", id="appointmentresponse")
public class AppointmentResponse extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>appointment</b>
	 * <p>
	 * Description: <b>The appointment that the response is attached to</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AppointmentResponse.appointment</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="appointment", path="AppointmentResponse.appointment", description="The appointment that the response is attached to", type="reference"  )
	public static final String SP_APPOINTMENT = "appointment";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>appointment</b>
	 * <p>
	 * Description: <b>The appointment that the response is attached to</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AppointmentResponse.appointment</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam APPOINTMENT = new ReferenceClientParam(SP_APPOINTMENT);

	/**
	 * Search parameter constant for <b>part-status</b>
	 * <p>
	 * Description: <b>The participants acceptance status for this appointment</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AppointmentResponse.participantStatus</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="part-status", path="AppointmentResponse.participantStatus", description="The participants acceptance status for this appointment", type="token"  )
	public static final String SP_PART_STATUS = "part-status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>part-status</b>
	 * <p>
	 * Description: <b>The participants acceptance status for this appointment</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AppointmentResponse.participantStatus</b><br>
	 * </p>
	 */
	public static final TokenClientParam PART_STATUS = new TokenClientParam(SP_PART_STATUS);

	/**
	 * Search parameter constant for <b>actor</b>
	 * <p>
	 * Description: <b>The Person, Location/HealthcareService or Device that this appointment response replies for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AppointmentResponse.actor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="actor", path="AppointmentResponse.actor", description="The Person, Location/HealthcareService or Device that this appointment response replies for", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_ACTOR = "actor";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>actor</b>
	 * <p>
	 * Description: <b>The Person, Location/HealthcareService or Device that this appointment response replies for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AppointmentResponse.actor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ACTOR = new ReferenceClientParam(SP_ACTOR);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>This Response is for this Patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AppointmentResponse.actor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="AppointmentResponse.actor", description="This Response is for this Patient", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>This Response is for this Patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AppointmentResponse.actor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>practitioner</b>
	 * <p>
	 * Description: <b>This Response is for this Practitioner</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AppointmentResponse.actor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="practitioner", path="AppointmentResponse.actor", description="This Response is for this Practitioner", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Practitioner.class 	}
 )
	public static final String SP_PRACTITIONER = "practitioner";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>practitioner</b>
	 * <p>
	 * Description: <b>This Response is for this Practitioner</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AppointmentResponse.actor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PRACTITIONER = new ReferenceClientParam(SP_PRACTITIONER);

	/**
	 * Search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b>This Response is for this Location</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AppointmentResponse.actor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="location", path="AppointmentResponse.actor", description="This Response is for this Location", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Location.class 	}
 )
	public static final String SP_LOCATION = "location";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b>This Response is for this Location</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AppointmentResponse.actor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam LOCATION = new ReferenceClientParam(SP_LOCATION);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>An Identifier in this appointment response</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AppointmentResponse.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="AppointmentResponse.identifier", description="An Identifier in this appointment response", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>An Identifier in this appointment response</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AppointmentResponse.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>AppointmentResponse:actor</b>".
	 */
	public static final Include INCLUDE_ACTOR = new Include("AppointmentResponse:actor");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>AppointmentResponse:appointment</b>".
	 */
	public static final Include INCLUDE_APPOINTMENT = new Include("AppointmentResponse:appointment");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>AppointmentResponse:location</b>".
	 */
	public static final Include INCLUDE_LOCATION = new Include("AppointmentResponse:location");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>AppointmentResponse:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("AppointmentResponse:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>AppointmentResponse:practitioner</b>".
	 */
	public static final Include INCLUDE_PRACTITIONER = new Include("AppointmentResponse:practitioner");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="appointment", order=1, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Appointment.class	})
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private ResourceReferenceDt myAppointment;
	
	@Child(name="start", type=InstantDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Date/Time that the appointment is to take place, or requested new start time"
	)
	private InstantDt myStart;
	
	@Child(name="end", type=InstantDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time."
	)
	private InstantDt myEnd;
	
	@Child(name="participantType", type=CodeableConceptDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Role of participant in the appointment"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-participant-type")
	private java.util.List<BoundCodeableConceptDt<ParticipantTypeEnum>> myParticipantType;
	
	@Child(name="actor", order=5, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.HealthcareService.class, 		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A Person, Location/HealthcareService or Device that is participating in the appointment"
	)
	private ResourceReferenceDt myActor;
	
	@Child(name="participantStatus", type=CodeDt.class, order=6, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/participantstatus")
	private BoundCodeDt<ParticipantStatusEnum> myParticipantStatus;
	
	@Child(name="comment", type=StringDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional comments about the appointment"
	)
	private StringDt myComment;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myAppointment,  myStart,  myEnd,  myParticipantType,  myActor,  myParticipantStatus,  myComment);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myAppointment, myStart, myEnd, myParticipantType, myActor, myParticipantStatus, myComment);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate
     * </p> 
	 */
	public java.util.List<IdentifierDt> getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new java.util.ArrayList<IdentifierDt>();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate
     * </p> 
	 */
	public AppointmentResponse setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate
     * </p> 
	 */
	public IdentifierDt addIdentifier() {
		IdentifierDt newType = new IdentifierDt();
		getIdentifier().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>identifier</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public AppointmentResponse addIdentifier(IdentifierDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getIdentifier().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>identifier</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this appointment response concern that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>appointment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ResourceReferenceDt getAppointment() {  
		if (myAppointment == null) {
			myAppointment = new ResourceReferenceDt();
		}
		return myAppointment;
	}

	/**
	 * Sets the value(s) for <b>appointment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public AppointmentResponse setAppointment(ResourceReferenceDt theValue) {
		myAppointment = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>start</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date/Time that the appointment is to take place, or requested new start time
     * </p> 
	 */
	public InstantDt getStartElement() {  
		if (myStart == null) {
			myStart = new InstantDt();
		}
		return myStart;
	}

	
	/**
	 * Gets the value(s) for <b>start</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date/Time that the appointment is to take place, or requested new start time
     * </p> 
	 */
	public Date getStart() {  
		return getStartElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>start</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date/Time that the appointment is to take place, or requested new start time
     * </p> 
	 */
	public AppointmentResponse setStart(InstantDt theValue) {
		myStart = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>start</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date/Time that the appointment is to take place, or requested new start time
     * </p> 
	 */
	public AppointmentResponse setStartWithMillisPrecision( Date theDate) {
		myStart = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>start</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date/Time that the appointment is to take place, or requested new start time
     * </p> 
	 */
	public AppointmentResponse setStart( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myStart = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>end</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
     * </p> 
	 */
	public InstantDt getEndElement() {  
		if (myEnd == null) {
			myEnd = new InstantDt();
		}
		return myEnd;
	}

	
	/**
	 * Gets the value(s) for <b>end</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
     * </p> 
	 */
	public Date getEnd() {  
		return getEndElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>end</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
     * </p> 
	 */
	public AppointmentResponse setEnd(InstantDt theValue) {
		myEnd = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>end</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
     * </p> 
	 */
	public AppointmentResponse setEndWithMillisPrecision( Date theDate) {
		myEnd = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>end</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This may be either the same as the appointment request to confirm the details of the appointment, or alternately a new time to request a re-negotiation of the end time.
     * </p> 
	 */
	public AppointmentResponse setEnd( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myEnd = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>participantType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public java.util.List<BoundCodeableConceptDt<ParticipantTypeEnum>> getParticipantType() {  
		if (myParticipantType == null) {
			myParticipantType = new java.util.ArrayList<BoundCodeableConceptDt<ParticipantTypeEnum>>();
		}
		return myParticipantType;
	}

	/**
	 * Sets the value(s) for <b>participantType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public AppointmentResponse setParticipantType(java.util.List<BoundCodeableConceptDt<ParticipantTypeEnum>> theValue) {
		myParticipantType = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>participantType</b> () using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addParticipantType()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public BoundCodeableConceptDt<ParticipantTypeEnum> addParticipantType(ParticipantTypeEnum theValue) {
		BoundCodeableConceptDt<ParticipantTypeEnum> retVal = new BoundCodeableConceptDt<ParticipantTypeEnum>(ParticipantTypeEnum.VALUESET_BINDER, theValue);
		getParticipantType().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>participantType</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public BoundCodeableConceptDt<ParticipantTypeEnum> getParticipantTypeFirstRep() {
		if (getParticipantType().size() == 0) {
			addParticipantType();
		}
		return getParticipantType().get(0);
	}

	/**
	 * Add a value for <b>participantType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public BoundCodeableConceptDt<ParticipantTypeEnum> addParticipantType() {
		BoundCodeableConceptDt<ParticipantTypeEnum> retVal = new BoundCodeableConceptDt<ParticipantTypeEnum>(ParticipantTypeEnum.VALUESET_BINDER);
		getParticipantType().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>participantType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public AppointmentResponse setParticipantType(ParticipantTypeEnum theValue) {
		getParticipantType().clear();
		addParticipantType(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>actor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A Person, Location/HealthcareService or Device that is participating in the appointment
     * </p> 
	 */
	public ResourceReferenceDt getActor() {  
		if (myActor == null) {
			myActor = new ResourceReferenceDt();
		}
		return myActor;
	}

	/**
	 * Sets the value(s) for <b>actor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A Person, Location/HealthcareService or Device that is participating in the appointment
     * </p> 
	 */
	public AppointmentResponse setActor(ResourceReferenceDt theValue) {
		myActor = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>participantStatus</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
     * </p> 
	 */
	public BoundCodeDt<ParticipantStatusEnum> getParticipantStatusElement() {  
		if (myParticipantStatus == null) {
			myParticipantStatus = new BoundCodeDt<ParticipantStatusEnum>(ParticipantStatusEnum.VALUESET_BINDER);
		}
		return myParticipantStatus;
	}

	
	/**
	 * Gets the value(s) for <b>participantStatus</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
     * </p> 
	 */
	public String getParticipantStatus() {  
		return getParticipantStatusElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>participantStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
     * </p> 
	 */
	public AppointmentResponse setParticipantStatus(BoundCodeDt<ParticipantStatusEnum> theValue) {
		myParticipantStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>participantStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Participation status of the participant. When the status is declined or tentative if the start/end times are different to the appointment, then these times should be interpreted as a requested time change. When the status is accepted, the times can either be the time of the appointment (as a confirmation of the time) or can be empty.
     * </p> 
	 */
	public AppointmentResponse setParticipantStatus(ParticipantStatusEnum theValue) {
		setParticipantStatus(new BoundCodeDt<ParticipantStatusEnum>(ParticipantStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getParticipantStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>comment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional comments about the appointment
     * </p> 
	 */
	public StringDt getCommentElement() {  
		if (myComment == null) {
			myComment = new StringDt();
		}
		return myComment;
	}

	
	/**
	 * Gets the value(s) for <b>comment</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional comments about the appointment
     * </p> 
	 */
	public String getComment() {  
		return getCommentElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>comment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional comments about the appointment
     * </p> 
	 */
	public AppointmentResponse setComment(StringDt theValue) {
		myComment = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>comment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional comments about the appointment
     * </p> 
	 */
	public AppointmentResponse setComment( String theString) {
		myComment = new StringDt(theString); 
		return this; 
	}

 


    @Override
    public String getResourceName() {
        return "AppointmentResponse";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
