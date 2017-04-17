















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
 * HAPI/FHIR <b>Appointment</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Appointment">http://hl7.org/fhir/profiles/Appointment</a> 
 * </p>
 *
 */
@ResourceDef(name="Appointment", profile="http://hl7.org/fhir/profiles/Appointment", id="appointment")
public class Appointment extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>Appointment date/time.</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Appointment.start</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="Appointment.start", description="Appointment date/time.", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>Appointment date/time.</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Appointment.start</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The overall status of the appointment</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Appointment.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="Appointment.status", description="The overall status of the appointment", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The overall status of the appointment</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Appointment.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>actor</b>
	 * <p>
	 * Description: <b>Any one of the individuals participating in the appointment</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Appointment.participant.actor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="actor", path="Appointment.participant.actor", description="Any one of the individuals participating in the appointment", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_ACTOR = "actor";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>actor</b>
	 * <p>
	 * Description: <b>Any one of the individuals participating in the appointment</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Appointment.participant.actor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ACTOR = new ReferenceClientParam(SP_ACTOR);

	/**
	 * Search parameter constant for <b>part-status</b>
	 * <p>
	 * Description: <b>The Participation status of the subject, or other participant on the appointment. Can be used to locate participants that have not responded to meeting requests.</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Appointment.participant.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="part-status", path="Appointment.participant.status", description="The Participation status of the subject, or other participant on the appointment. Can be used to locate participants that have not responded to meeting requests.", type="token"  )
	public static final String SP_PART_STATUS = "part-status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>part-status</b>
	 * <p>
	 * Description: <b>The Participation status of the subject, or other participant on the appointment. Can be used to locate participants that have not responded to meeting requests.</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Appointment.participant.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam PART_STATUS = new TokenClientParam(SP_PART_STATUS);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>One of the individuals of the appointment is this patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Appointment.participant.actor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Appointment.participant.actor", description="One of the individuals of the appointment is this patient", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>One of the individuals of the appointment is this patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Appointment.participant.actor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>practitioner</b>
	 * <p>
	 * Description: <b>One of the individuals of the appointment is this practitioner</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Appointment.participant.actor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="practitioner", path="Appointment.participant.actor", description="One of the individuals of the appointment is this practitioner", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Practitioner.class 	}
 )
	public static final String SP_PRACTITIONER = "practitioner";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>practitioner</b>
	 * <p>
	 * Description: <b>One of the individuals of the appointment is this practitioner</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Appointment.participant.actor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PRACTITIONER = new ReferenceClientParam(SP_PRACTITIONER);

	/**
	 * Search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b>This location is listed in the participants of the appointment</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Appointment.participant.actor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="location", path="Appointment.participant.actor", description="This location is listed in the participants of the appointment", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Location.class 	}
 )
	public static final String SP_LOCATION = "location";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b>This location is listed in the participants of the appointment</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Appointment.participant.actor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam LOCATION = new ReferenceClientParam(SP_LOCATION);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>An Identifier of the Appointment</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Appointment.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Appointment.identifier", description="An Identifier of the Appointment", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>An Identifier of the Appointment</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Appointment.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Appointment:actor</b>".
	 */
	public static final Include INCLUDE_ACTOR = new Include("Appointment:actor");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Appointment:location</b>".
	 */
	public static final Include INCLUDE_LOCATION = new Include("Appointment:location");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Appointment:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Appointment:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Appointment:practitioner</b>".
	 */
	public static final Include INCLUDE_PRACTITIONER = new Include("Appointment:practitioner");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="status", type=CodeDt.class, order=1, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/appointmentstatus")
	private BoundCodeDt<AppointmentStatusEnum> myStatus;
	
	@Child(name="type", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of appointment that is being booked (This may also be associated with participants for location, and/or a HealthcareService)"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/c80-practice-codes")
	private CodeableConceptDt myType;
	
	@Child(name="reason", type=CodeableConceptDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The reason that this appointment is being scheduled. This is more clinical than administrative"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-reason")
	private CodeableConceptDt myReason;
	
	@Child(name="priority", type=UnsignedIntDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority)"
	)
	private UnsignedIntDt myPriority;
	
	@Child(name="description", type=StringDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field"
	)
	private StringDt myDescription;
	
	@Child(name="start", type=InstantDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Date/Time that the appointment is to take place"
	)
	private InstantDt myStart;
	
	@Child(name="end", type=InstantDt.class, order=7, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Date/Time that the appointment is to conclude"
	)
	private InstantDt myEnd;
	
	@Child(name="minutesDuration", type=PositiveIntDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request)"
	)
	private PositiveIntDt myMinutesDuration;
	
	@Child(name="slot", order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Slot.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot"
	)
	private java.util.List<ResourceReferenceDt> mySlot;
	
	@Child(name="comment", type=StringDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional comments about the appointment"
	)
	private StringDt myComment;
	
	@Child(name="participant", order=11, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of participants involved in the appointment"
	)
	private java.util.List<Participant> myParticipant;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myStatus,  myType,  myReason,  myPriority,  myDescription,  myStart,  myEnd,  myMinutesDuration,  mySlot,  myComment,  myParticipant);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myStatus, myType, myReason, myPriority, myDescription, myStart, myEnd, myMinutesDuration, mySlot, myComment, myParticipant);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
     * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public Appointment setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
	 * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Appointment addIdentifier(IdentifierDt theValue) {
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
     * This records identifiers associated with this appointment concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status
     * </p> 
	 */
	public BoundCodeDt<AppointmentStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<AppointmentStatusEnum>(AppointmentStatusEnum.VALUESET_BINDER);
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
     * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status
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
     * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status
     * </p> 
	 */
	public Appointment setStatus(BoundCodeDt<AppointmentStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The overall status of the Appointment. Each of the participants has their own participation status which indicates their involvement in the process, however this status indicates the shared status
     * </p> 
	 */
	public Appointment setStatus(AppointmentStatusEnum theValue) {
		setStatus(new BoundCodeDt<AppointmentStatusEnum>(AppointmentStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of appointment that is being booked (This may also be associated with participants for location, and/or a HealthcareService)
     * </p> 
	 */
	public CodeableConceptDt getType() {  
		if (myType == null) {
			myType = new CodeableConceptDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of appointment that is being booked (This may also be associated with participants for location, and/or a HealthcareService)
     * </p> 
	 */
	public Appointment setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The reason that this appointment is being scheduled. This is more clinical than administrative
     * </p> 
	 */
	public CodeableConceptDt getReason() {  
		if (myReason == null) {
			myReason = new CodeableConceptDt();
		}
		return myReason;
	}

	/**
	 * Sets the value(s) for <b>reason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The reason that this appointment is being scheduled. This is more clinical than administrative
     * </p> 
	 */
	public Appointment setReason(CodeableConceptDt theValue) {
		myReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>priority</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority)
     * </p> 
	 */
	public UnsignedIntDt getPriorityElement() {  
		if (myPriority == null) {
			myPriority = new UnsignedIntDt();
		}
		return myPriority;
	}

	
	/**
	 * Gets the value(s) for <b>priority</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority)
     * </p> 
	 */
	public Integer getPriority() {  
		return getPriorityElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>priority</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority)
     * </p> 
	 */
	public Appointment setPriority(UnsignedIntDt theValue) {
		myPriority = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>priority</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The priority of the appointment. Can be used to make informed decisions if needing to re-prioritize appointments. (The iCal Standard specifies 0 as undefined, 1 as highest, 9 as lowest priority)
     * </p> 
	 */
	public Appointment setPriority( int theInteger) {
		myPriority = new UnsignedIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field
     * </p> 
	 */
	public StringDt getDescriptionElement() {  
		if (myDescription == null) {
			myDescription = new StringDt();
		}
		return myDescription;
	}

	
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field
     * </p> 
	 */
	public String getDescription() {  
		return getDescriptionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field
     * </p> 
	 */
	public Appointment setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The brief description of the appointment as would be shown on a subject line in a meeting request, or appointment list. Detailed or expanded information should be put in the comment field
     * </p> 
	 */
	public Appointment setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>start</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date/Time that the appointment is to take place
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
     * Date/Time that the appointment is to take place
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
     * Date/Time that the appointment is to take place
     * </p> 
	 */
	public Appointment setStart(InstantDt theValue) {
		myStart = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>start</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date/Time that the appointment is to take place
     * </p> 
	 */
	public Appointment setStartWithMillisPrecision( Date theDate) {
		myStart = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>start</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date/Time that the appointment is to take place
     * </p> 
	 */
	public Appointment setStart( Date theDate,  TemporalPrecisionEnum thePrecision) {
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
     * Date/Time that the appointment is to conclude
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
     * Date/Time that the appointment is to conclude
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
     * Date/Time that the appointment is to conclude
     * </p> 
	 */
	public Appointment setEnd(InstantDt theValue) {
		myEnd = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>end</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date/Time that the appointment is to conclude
     * </p> 
	 */
	public Appointment setEndWithMillisPrecision( Date theDate) {
		myEnd = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>end</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date/Time that the appointment is to conclude
     * </p> 
	 */
	public Appointment setEnd( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myEnd = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>minutesDuration</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request)
     * </p> 
	 */
	public PositiveIntDt getMinutesDurationElement() {  
		if (myMinutesDuration == null) {
			myMinutesDuration = new PositiveIntDt();
		}
		return myMinutesDuration;
	}

	
	/**
	 * Gets the value(s) for <b>minutesDuration</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request)
     * </p> 
	 */
	public Integer getMinutesDuration() {  
		return getMinutesDurationElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>minutesDuration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request)
     * </p> 
	 */
	public Appointment setMinutesDuration(PositiveIntDt theValue) {
		myMinutesDuration = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>minutesDuration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Number of minutes that the appointment is to take. This can be less than the duration between the start and end times (where actual time of appointment is only an estimate or is a planned appointment request)
     * </p> 
	 */
	public Appointment setMinutesDuration( int theInteger) {
		myMinutesDuration = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>slot</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getSlot() {  
		if (mySlot == null) {
			mySlot = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return mySlot;
	}

	/**
	 * Sets the value(s) for <b>slot</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot
     * </p> 
	 */
	public Appointment setSlot(java.util.List<ResourceReferenceDt> theValue) {
		mySlot = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>slot</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The slot that this appointment is filling. If provided then the schedule will not be provided as slots are not recursive, and the start/end values MUST be the same as from the slot
     * </p> 
	 */
	public ResourceReferenceDt addSlot() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getSlot().add(newType);
		return newType; 
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
	public Appointment setComment(StringDt theValue) {
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
	public Appointment setComment( String theString) {
		myComment = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>participant</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of participants involved in the appointment
     * </p> 
	 */
	public java.util.List<Participant> getParticipant() {  
		if (myParticipant == null) {
			myParticipant = new java.util.ArrayList<Participant>();
		}
		return myParticipant;
	}

	/**
	 * Sets the value(s) for <b>participant</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of participants involved in the appointment
     * </p> 
	 */
	public Appointment setParticipant(java.util.List<Participant> theValue) {
		myParticipant = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>participant</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of participants involved in the appointment
     * </p> 
	 */
	public Participant addParticipant() {
		Participant newType = new Participant();
		getParticipant().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>participant</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * List of participants involved in the appointment
	 * </p>
	 * @param theValue The participant to add (must not be <code>null</code>)
	 */
	public Appointment addParticipant(Participant theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getParticipant().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>participant</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * List of participants involved in the appointment
     * </p> 
	 */
	public Participant getParticipantFirstRep() {
		if (getParticipant().isEmpty()) {
			return addParticipant();
		}
		return getParticipant().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Appointment.participant</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of participants involved in the appointment
     * </p> 
	 */
	@Block()	
	public static class Participant 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeableConceptDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Role of participant in the appointment"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-participant-type")
	private java.util.List<BoundCodeableConceptDt<ParticipantTypeEnum>> myType;
	
	@Child(name="actor", order=1, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.HealthcareService.class, 		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A Person, Location/HealthcareService or Device that is participating in the appointment"
	)
	private ResourceReferenceDt myActor;
	
	@Child(name="required", type=CodeDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/participantrequired")
	private BoundCodeDt<ParticipantRequiredEnum> myRequired;
	
	@Child(name="status", type=CodeDt.class, order=3, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Participation status of the Patient"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/participationstatus")
	private BoundCodeDt<ParticipationStatusEnum> myStatus;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myActor,  myRequired,  myStatus);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myActor, myRequired, myStatus);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public java.util.List<BoundCodeableConceptDt<ParticipantTypeEnum>> getType() {  
		if (myType == null) {
			myType = new java.util.ArrayList<BoundCodeableConceptDt<ParticipantTypeEnum>>();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public Participant setType(java.util.List<BoundCodeableConceptDt<ParticipantTypeEnum>> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>type</b> () using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addType()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public BoundCodeableConceptDt<ParticipantTypeEnum> addType(ParticipantTypeEnum theValue) {
		BoundCodeableConceptDt<ParticipantTypeEnum> retVal = new BoundCodeableConceptDt<ParticipantTypeEnum>(ParticipantTypeEnum.VALUESET_BINDER, theValue);
		getType().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>type</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public BoundCodeableConceptDt<ParticipantTypeEnum> getTypeFirstRep() {
		if (getType().size() == 0) {
			addType();
		}
		return getType().get(0);
	}

	/**
	 * Add a value for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public BoundCodeableConceptDt<ParticipantTypeEnum> addType() {
		BoundCodeableConceptDt<ParticipantTypeEnum> retVal = new BoundCodeableConceptDt<ParticipantTypeEnum>(ParticipantTypeEnum.VALUESET_BINDER);
		getType().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in the appointment
     * </p> 
	 */
	public Participant setType(ParticipantTypeEnum theValue) {
		getType().clear();
		addType(theValue);
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
	public Participant setActor(ResourceReferenceDt theValue) {
		myActor = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>required</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.
     * </p> 
	 */
	public BoundCodeDt<ParticipantRequiredEnum> getRequiredElement() {  
		if (myRequired == null) {
			myRequired = new BoundCodeDt<ParticipantRequiredEnum>(ParticipantRequiredEnum.VALUESET_BINDER);
		}
		return myRequired;
	}

	
	/**
	 * Gets the value(s) for <b>required</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.
     * </p> 
	 */
	public String getRequired() {  
		return getRequiredElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>required</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.
     * </p> 
	 */
	public Participant setRequired(BoundCodeDt<ParticipantRequiredEnum> theValue) {
		myRequired = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>required</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Is this participant required to be present at the meeting. This covers a use-case where 2 doctors need to meet to discuss the results for a specific patient, and the patient is not required to be present.
     * </p> 
	 */
	public Participant setRequired(ParticipantRequiredEnum theValue) {
		setRequired(new BoundCodeDt<ParticipantRequiredEnum>(ParticipantRequiredEnum.VALUESET_BINDER, theValue));
		
/*
		getRequiredElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Participation status of the Patient
     * </p> 
	 */
	public BoundCodeDt<ParticipationStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<ParticipationStatusEnum>(ParticipationStatusEnum.VALUESET_BINDER);
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
     * Participation status of the Patient
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
     * Participation status of the Patient
     * </p> 
	 */
	public Participant setStatus(BoundCodeDt<ParticipationStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Participation status of the Patient
     * </p> 
	 */
	public Participant setStatus(ParticipationStatusEnum theValue) {
		setStatus(new BoundCodeDt<ParticipationStatusEnum>(ParticipationStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  


	}




    @Override
    public String getResourceName() {
        return "Appointment";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
