















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
 * HAPI/FHIR <b>MessageHeader</b> Resource
 * (infrastructure.exchange)
 *
 * <p>
 * <b>Definition:</b>
 * The header for a message exchange that is either requesting or responding to an action.  The reference(s) that are the subject of the action as well as other information related to the action are typically transmitted in a bundle in which the MessageHeader resource instance is the first resource in the bundle.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Many implementations are not prepared to use REST and need a messaging based infrastructure
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/MessageHeader">http://hl7.org/fhir/profiles/MessageHeader</a> 
 * </p>
 *
 */
@ResourceDef(name="MessageHeader", profile="http://hl7.org/fhir/profiles/MessageHeader", id="messageheader")
public class MessageHeader extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>timestamp</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>MessageHeader.timestamp</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="timestamp", path="MessageHeader.timestamp", description="", type="date"  )
	public static final String SP_TIMESTAMP = "timestamp";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>timestamp</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>MessageHeader.timestamp</b><br>
	 * </p>
	 */
	public static final DateClientParam TIMESTAMP = new DateClientParam(SP_TIMESTAMP);

	/**
	 * Search parameter constant for <b>event</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MessageHeader.event</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="event", path="MessageHeader.event", description="", type="token"  )
	public static final String SP_EVENT = "event";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>event</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MessageHeader.event</b><br>
	 * </p>
	 */
	public static final TokenClientParam EVENT = new TokenClientParam(SP_EVENT);

	/**
	 * Search parameter constant for <b>response-id</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MessageHeader.response.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="response-id", path="MessageHeader.response.identifier", description="", type="token"  )
	public static final String SP_RESPONSE_ID = "response-id";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>response-id</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MessageHeader.response.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam RESPONSE_ID = new TokenClientParam(SP_RESPONSE_ID);

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MessageHeader.response.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="MessageHeader.response.code", description="", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>MessageHeader.response.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>MessageHeader.source.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="source", path="MessageHeader.source.name", description="", type="string"  )
	public static final String SP_SOURCE = "source";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>MessageHeader.source.name</b><br>
	 * </p>
	 */
	public static final StringClientParam SOURCE = new StringClientParam(SP_SOURCE);

	/**
	 * Search parameter constant for <b>source-uri</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>MessageHeader.source.endpoint</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="source-uri", path="MessageHeader.source.endpoint", description="", type="uri"  )
	public static final String SP_SOURCE_URI = "source-uri";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>source-uri</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>MessageHeader.source.endpoint</b><br>
	 * </p>
	 */
	public static final UriClientParam SOURCE_URI = new UriClientParam(SP_SOURCE_URI);

	/**
	 * Search parameter constant for <b>destination</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>MessageHeader.destination.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="destination", path="MessageHeader.destination.name", description="", type="string"  )
	public static final String SP_DESTINATION = "destination";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>destination</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>MessageHeader.destination.name</b><br>
	 * </p>
	 */
	public static final StringClientParam DESTINATION = new StringClientParam(SP_DESTINATION);

	/**
	 * Search parameter constant for <b>destination-uri</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>MessageHeader.destination.endpoint</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="destination-uri", path="MessageHeader.destination.endpoint", description="", type="uri"  )
	public static final String SP_DESTINATION_URI = "destination-uri";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>destination-uri</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>MessageHeader.destination.endpoint</b><br>
	 * </p>
	 */
	public static final UriClientParam DESTINATION_URI = new UriClientParam(SP_DESTINATION_URI);

	/**
	 * Search parameter constant for <b>data</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.data</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="data", path="MessageHeader.data", description="", type="reference"  )
	public static final String SP_DATA = "data";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>data</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.data</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam DATA = new ReferenceClientParam(SP_DATA);

	/**
	 * Search parameter constant for <b>receiver</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.receiver</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="receiver", path="MessageHeader.receiver", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_RECEIVER = "receiver";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>receiver</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.receiver</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RECEIVER = new ReferenceClientParam(SP_RECEIVER);

	/**
	 * Search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.author</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="author", path="MessageHeader.author", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_AUTHOR = "author";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.author</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam AUTHOR = new ReferenceClientParam(SP_AUTHOR);

	/**
	 * Search parameter constant for <b>responsible</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.responsible</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="responsible", path="MessageHeader.responsible", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_RESPONSIBLE = "responsible";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>responsible</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.responsible</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RESPONSIBLE = new ReferenceClientParam(SP_RESPONSIBLE);

	/**
	 * Search parameter constant for <b>enterer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.enterer</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="enterer", path="MessageHeader.enterer", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_ENTERER = "enterer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>enterer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.enterer</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENTERER = new ReferenceClientParam(SP_ENTERER);

	/**
	 * Search parameter constant for <b>target</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.destination.target</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="target", path="MessageHeader.destination.target", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_TARGET = "target";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>target</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>MessageHeader.destination.target</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam TARGET = new ReferenceClientParam(SP_TARGET);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MessageHeader:author</b>".
	 */
	public static final Include INCLUDE_AUTHOR = new Include("MessageHeader:author");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MessageHeader:data</b>".
	 */
	public static final Include INCLUDE_DATA = new Include("MessageHeader:data");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MessageHeader:enterer</b>".
	 */
	public static final Include INCLUDE_ENTERER = new Include("MessageHeader:enterer");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MessageHeader:receiver</b>".
	 */
	public static final Include INCLUDE_RECEIVER = new Include("MessageHeader:receiver");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MessageHeader:responsible</b>".
	 */
	public static final Include INCLUDE_RESPONSIBLE = new Include("MessageHeader:responsible");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>MessageHeader:target</b>".
	 */
	public static final Include INCLUDE_TARGET = new Include("MessageHeader:target");


	@Child(name="timestamp", type=InstantDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.init",
		formalDefinition="The time that the message was sent"
	)
	private InstantDt myTimestamp;
	
	@Child(name="event", type=CodingDt.class, order=1, min=1, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="what",
		formalDefinition="Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value \"http://hl7.org/fhir/message-events\""
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/message-events")
	private CodingDt myEvent;
	
	@Child(name="response", order=2, min=0, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="Information about the message that this message is a response to.  Only present if this message is a response."
	)
	private Response myResponse;
	
	@Child(name="source", order=3, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="who.actor",
		formalDefinition="The source application from which this message originated"
	)
	private Source mySource;
	
	@Child(name="destination", order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The destination application which the message is intended for"
	)
	private java.util.List<Destination> myDestination;
	
	@Child(name="enterer", order=5, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="who.author",
		formalDefinition="The person or device that performed the data entry leading to this message. Where there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions"
	)
	private ResourceReferenceDt myEnterer;
	
	@Child(name="author", order=6, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="who.author",
		formalDefinition="The logical author of the message - the person or device that decided the described event should happen. Where there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions"
	)
	private ResourceReferenceDt myAuthor;
	
	@Child(name="receiver", order=7, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient."
	)
	private ResourceReferenceDt myReceiver;
	
	@Child(name="responsible", order=8, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="who.witness",
		formalDefinition="The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party"
	)
	private ResourceReferenceDt myResponsible;
	
	@Child(name="reason", type=CodeableConceptDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="why",
		formalDefinition="Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message"
	)
	private CodeableConceptDt myReason;
	
	@Child(name="data", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The actual data of the message - a reference to the root/focus class of the event."
	)
	private java.util.List<ResourceReferenceDt> myData;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myTimestamp,  myEvent,  myResponse,  mySource,  myDestination,  myEnterer,  myAuthor,  myReceiver,  myResponsible,  myReason,  myData);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myTimestamp, myEvent, myResponse, mySource, myDestination, myEnterer, myAuthor, myReceiver, myResponsible, myReason, myData);
	}

	/**
	 * Gets the value(s) for <b>timestamp</b> (when.init).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time that the message was sent
     * </p> 
	 */
	public InstantDt getTimestampElement() {  
		if (myTimestamp == null) {
			myTimestamp = new InstantDt();
		}
		return myTimestamp;
	}

	
	/**
	 * Gets the value(s) for <b>timestamp</b> (when.init).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time that the message was sent
     * </p> 
	 */
	public Date getTimestamp() {  
		return getTimestampElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>timestamp</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * The time that the message was sent
     * </p> 
	 */
	public MessageHeader setTimestamp(InstantDt theValue) {
		myTimestamp = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>timestamp</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * The time that the message was sent
     * </p> 
	 */
	public MessageHeader setTimestampWithMillisPrecision( Date theDate) {
		myTimestamp = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>timestamp</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * The time that the message was sent
     * </p> 
	 */
	public MessageHeader setTimestamp( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myTimestamp = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>event</b> (what).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value \&quot;http://hl7.org/fhir/message-events\&quot;
     * </p> 
	 */
	public CodingDt getEvent() {  
		if (myEvent == null) {
			myEvent = new CodingDt();
		}
		return myEvent;
	}

	/**
	 * Sets the value(s) for <b>event</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * Code that identifies the event this message represents and connects it with its definition. Events defined as part of the FHIR specification have the system value \&quot;http://hl7.org/fhir/message-events\&quot;
     * </p> 
	 */
	public MessageHeader setEvent(CodingDt theValue) {
		myEvent = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>response</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the message that this message is a response to.  Only present if this message is a response.
     * </p> 
	 */
	public Response getResponse() {  
		if (myResponse == null) {
			myResponse = new Response();
		}
		return myResponse;
	}

	/**
	 * Sets the value(s) for <b>response</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the message that this message is a response to.  Only present if this message is a response.
     * </p> 
	 */
	public MessageHeader setResponse(Response theValue) {
		myResponse = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>source</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The source application from which this message originated
     * </p> 
	 */
	public Source getSource() {  
		if (mySource == null) {
			mySource = new Source();
		}
		return mySource;
	}

	/**
	 * Sets the value(s) for <b>source</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The source application from which this message originated
     * </p> 
	 */
	public MessageHeader setSource(Source theValue) {
		mySource = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>destination</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The destination application which the message is intended for
     * </p> 
	 */
	public java.util.List<Destination> getDestination() {  
		if (myDestination == null) {
			myDestination = new java.util.ArrayList<Destination>();
		}
		return myDestination;
	}

	/**
	 * Sets the value(s) for <b>destination</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * The destination application which the message is intended for
     * </p> 
	 */
	public MessageHeader setDestination(java.util.List<Destination> theValue) {
		myDestination = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>destination</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * The destination application which the message is intended for
     * </p> 
	 */
	public Destination addDestination() {
		Destination newType = new Destination();
		getDestination().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>destination</b> (who.focus)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The destination application which the message is intended for
	 * </p>
	 * @param theValue The destination to add (must not be <code>null</code>)
	 */
	public MessageHeader addDestination(Destination theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDestination().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>destination</b> (who.focus),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The destination application which the message is intended for
     * </p> 
	 */
	public Destination getDestinationFirstRep() {
		if (getDestination().isEmpty()) {
			return addDestination();
		}
		return getDestination().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>enterer</b> (who.author).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The person or device that performed the data entry leading to this message. Where there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions
     * </p> 
	 */
	public ResourceReferenceDt getEnterer() {  
		if (myEnterer == null) {
			myEnterer = new ResourceReferenceDt();
		}
		return myEnterer;
	}

	/**
	 * Sets the value(s) for <b>enterer</b> (who.author)
	 *
     * <p>
     * <b>Definition:</b>
     * The person or device that performed the data entry leading to this message. Where there is more than one candidate, pick the most proximal to the message. Can provide other enterers in extensions
     * </p> 
	 */
	public MessageHeader setEnterer(ResourceReferenceDt theValue) {
		myEnterer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>author</b> (who.author).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The logical author of the message - the person or device that decided the described event should happen. Where there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions
     * </p> 
	 */
	public ResourceReferenceDt getAuthor() {  
		if (myAuthor == null) {
			myAuthor = new ResourceReferenceDt();
		}
		return myAuthor;
	}

	/**
	 * Sets the value(s) for <b>author</b> (who.author)
	 *
     * <p>
     * <b>Definition:</b>
     * The logical author of the message - the person or device that decided the described event should happen. Where there is more than one candidate, pick the most proximal to the MessageHeader. Can provide other authors in extensions
     * </p> 
	 */
	public MessageHeader setAuthor(ResourceReferenceDt theValue) {
		myAuthor = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>receiver</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.
     * </p> 
	 */
	public ResourceReferenceDt getReceiver() {  
		if (myReceiver == null) {
			myReceiver = new ResourceReferenceDt();
		}
		return myReceiver;
	}

	/**
	 * Sets the value(s) for <b>receiver</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * Allows data conveyed by a message to be addressed to a particular person or department when routing to a specific application isn't sufficient.
     * </p> 
	 */
	public MessageHeader setReceiver(ResourceReferenceDt theValue) {
		myReceiver = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>responsible</b> (who.witness).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party
     * </p> 
	 */
	public ResourceReferenceDt getResponsible() {  
		if (myResponsible == null) {
			myResponsible = new ResourceReferenceDt();
		}
		return myResponsible;
	}

	/**
	 * Sets the value(s) for <b>responsible</b> (who.witness)
	 *
     * <p>
     * <b>Definition:</b>
     * The person or organization that accepts overall responsibility for the contents of the message. The implication is that the message event happened under the policies of the responsible party
     * </p> 
	 */
	public MessageHeader setResponsible(ResourceReferenceDt theValue) {
		myResponsible = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reason</b> (why).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message
     * </p> 
	 */
	public CodeableConceptDt getReason() {  
		if (myReason == null) {
			myReason = new CodeableConceptDt();
		}
		return myReason;
	}

	/**
	 * Sets the value(s) for <b>reason</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * Coded indication of the cause for the event - indicates  a reason for the occurrence of the event that is a focus of this message
     * </p> 
	 */
	public MessageHeader setReason(CodeableConceptDt theValue) {
		myReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>data</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual data of the message - a reference to the root/focus class of the event.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getData() {  
		if (myData == null) {
			myData = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myData;
	}

	/**
	 * Sets the value(s) for <b>data</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual data of the message - a reference to the root/focus class of the event.
     * </p> 
	 */
	public MessageHeader setData(java.util.List<ResourceReferenceDt> theValue) {
		myData = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>data</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual data of the message - a reference to the root/focus class of the event.
     * </p> 
	 */
	public ResourceReferenceDt addData() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getData().add(newType);
		return newType; 
	}
  
	/**
	 * Block class for child element: <b>MessageHeader.response</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the message that this message is a response to.  Only present if this message is a response.
     * </p> 
	 */
	@Block()	
	public static class Response 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="identifier", type=IdDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The id of the message that this message is a response to"
	)
	private IdDt myIdentifier;
	
	@Child(name="code", type=CodeDt.class, order=1, min=1, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/response-code")
	private BoundCodeDt<ResponseTypeEnum> myCode;
	
	@Child(name="details", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.OperationOutcome.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Full details of any issues found in the message"
	)
	private ResourceReferenceDt myDetails;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myCode,  myDetails);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myCode, myDetails);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The id of the message that this message is a response to
     * </p> 
	 */
	public IdDt getIdentifierElement() {  
		if (myIdentifier == null) {
			myIdentifier = new IdDt();
		}
		return myIdentifier;
	}

	
	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The id of the message that this message is a response to
     * </p> 
	 */
	public String getIdentifier() {  
		return getIdentifierElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The id of the message that this message is a response to
     * </p> 
	 */
	public Response setIdentifier(IdDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The id of the message that this message is a response to
     * </p> 
	 */
	public Response setIdentifier( String theId) {
		myIdentifier = new IdDt(theId); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not
     * </p> 
	 */
	public BoundCodeDt<ResponseTypeEnum> getCodeElement() {  
		if (myCode == null) {
			myCode = new BoundCodeDt<ResponseTypeEnum>(ResponseTypeEnum.VALUESET_BINDER);
		}
		return myCode;
	}

	
	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not
     * </p> 
	 */
	public String getCode() {  
		return getCodeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not
     * </p> 
	 */
	public Response setCode(BoundCodeDt<ResponseTypeEnum> theValue) {
		myCode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code that identifies the type of response to the message - whether it was successful or not, and whether it should be resent or not
     * </p> 
	 */
	public Response setCode(ResponseTypeEnum theValue) {
		setCode(new BoundCodeDt<ResponseTypeEnum>(ResponseTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getCodeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>details</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Full details of any issues found in the message
     * </p> 
	 */
	public ResourceReferenceDt getDetails() {  
		if (myDetails == null) {
			myDetails = new ResourceReferenceDt();
		}
		return myDetails;
	}

	/**
	 * Sets the value(s) for <b>details</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Full details of any issues found in the message
     * </p> 
	 */
	public Response setDetails(ResourceReferenceDt theValue) {
		myDetails = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>MessageHeader.source</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The source application from which this message originated
     * </p> 
	 */
	@Block()	
	public static class Source 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Human-readable name for the source system"
	)
	private StringDt myName;
	
	@Child(name="software", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="May include configuration or other information useful in debugging."
	)
	private StringDt mySoftware;
	
	@Child(name="version", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Can convey versions of multiple systems in situations where a message passes through multiple hands."
	)
	private StringDt myVersion;
	
	@Child(name="contact", type=ContactPointDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An e-mail, phone, website or other contact point to use to resolve issues with message communications."
	)
	private ContactPointDt myContact;
	
	@Child(name="endpoint", type=UriDt.class, order=4, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the routing target to send acknowledgements to."
	)
	private UriDt myEndpoint;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  mySoftware,  myVersion,  myContact,  myEndpoint);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, mySoftware, myVersion, myContact, myEndpoint);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable name for the source system
     * </p> 
	 */
	public StringDt getNameElement() {  
		if (myName == null) {
			myName = new StringDt();
		}
		return myName;
	}

	
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable name for the source system
     * </p> 
	 */
	public String getName() {  
		return getNameElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable name for the source system
     * </p> 
	 */
	public Source setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable name for the source system
     * </p> 
	 */
	public Source setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>software</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * May include configuration or other information useful in debugging.
     * </p> 
	 */
	public StringDt getSoftwareElement() {  
		if (mySoftware == null) {
			mySoftware = new StringDt();
		}
		return mySoftware;
	}

	
	/**
	 * Gets the value(s) for <b>software</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * May include configuration or other information useful in debugging.
     * </p> 
	 */
	public String getSoftware() {  
		return getSoftwareElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>software</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * May include configuration or other information useful in debugging.
     * </p> 
	 */
	public Source setSoftware(StringDt theValue) {
		mySoftware = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>software</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * May include configuration or other information useful in debugging.
     * </p> 
	 */
	public Source setSoftware( String theString) {
		mySoftware = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>version</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Can convey versions of multiple systems in situations where a message passes through multiple hands.
     * </p> 
	 */
	public StringDt getVersionElement() {  
		if (myVersion == null) {
			myVersion = new StringDt();
		}
		return myVersion;
	}

	
	/**
	 * Gets the value(s) for <b>version</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Can convey versions of multiple systems in situations where a message passes through multiple hands.
     * </p> 
	 */
	public String getVersion() {  
		return getVersionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>version</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Can convey versions of multiple systems in situations where a message passes through multiple hands.
     * </p> 
	 */
	public Source setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>version</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Can convey versions of multiple systems in situations where a message passes through multiple hands.
     * </p> 
	 */
	public Source setVersion( String theString) {
		myVersion = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>contact</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An e-mail, phone, website or other contact point to use to resolve issues with message communications.
     * </p> 
	 */
	public ContactPointDt getContact() {  
		if (myContact == null) {
			myContact = new ContactPointDt();
		}
		return myContact;
	}

	/**
	 * Sets the value(s) for <b>contact</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An e-mail, phone, website or other contact point to use to resolve issues with message communications.
     * </p> 
	 */
	public Source setContact(ContactPointDt theValue) {
		myContact = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>endpoint</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the routing target to send acknowledgements to.
     * </p> 
	 */
	public UriDt getEndpointElement() {  
		if (myEndpoint == null) {
			myEndpoint = new UriDt();
		}
		return myEndpoint;
	}

	
	/**
	 * Gets the value(s) for <b>endpoint</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the routing target to send acknowledgements to.
     * </p> 
	 */
	public String getEndpoint() {  
		return getEndpointElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>endpoint</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the routing target to send acknowledgements to.
     * </p> 
	 */
	public Source setEndpoint(UriDt theValue) {
		myEndpoint = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>endpoint</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the routing target to send acknowledgements to.
     * </p> 
	 */
	public Source setEndpoint( String theUri) {
		myEndpoint = new UriDt(theUri); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>MessageHeader.destination</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * The destination application which the message is intended for
     * </p> 
	 */
	@Block()	
	public static class Destination 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Human-readable name for the target system"
	)
	private StringDt myName;
	
	@Child(name="target", order=1, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Device.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the target end system in situations where the initial message transmission is to an intermediary system."
	)
	private ResourceReferenceDt myTarget;
	
	@Child(name="endpoint", type=UriDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates where the message should be routed to."
	)
	private UriDt myEndpoint;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  myTarget,  myEndpoint);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, myTarget, myEndpoint);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable name for the target system
     * </p> 
	 */
	public StringDt getNameElement() {  
		if (myName == null) {
			myName = new StringDt();
		}
		return myName;
	}

	
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable name for the target system
     * </p> 
	 */
	public String getName() {  
		return getNameElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable name for the target system
     * </p> 
	 */
	public Destination setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable name for the target system
     * </p> 
	 */
	public Destination setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>target</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the target end system in situations where the initial message transmission is to an intermediary system.
     * </p> 
	 */
	public ResourceReferenceDt getTarget() {  
		if (myTarget == null) {
			myTarget = new ResourceReferenceDt();
		}
		return myTarget;
	}

	/**
	 * Sets the value(s) for <b>target</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the target end system in situations where the initial message transmission is to an intermediary system.
     * </p> 
	 */
	public Destination setTarget(ResourceReferenceDt theValue) {
		myTarget = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>endpoint</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates where the message should be routed to.
     * </p> 
	 */
	public UriDt getEndpointElement() {  
		if (myEndpoint == null) {
			myEndpoint = new UriDt();
		}
		return myEndpoint;
	}

	
	/**
	 * Gets the value(s) for <b>endpoint</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates where the message should be routed to.
     * </p> 
	 */
	public String getEndpoint() {  
		return getEndpointElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>endpoint</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates where the message should be routed to.
     * </p> 
	 */
	public Destination setEndpoint(UriDt theValue) {
		myEndpoint = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>endpoint</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates where the message should be routed to.
     * </p> 
	 */
	public Destination setEndpoint( String theUri) {
		myEndpoint = new UriDt(theUri); 
		return this; 
	}

 


	}




    @Override
    public String getResourceName() {
        return "MessageHeader";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
