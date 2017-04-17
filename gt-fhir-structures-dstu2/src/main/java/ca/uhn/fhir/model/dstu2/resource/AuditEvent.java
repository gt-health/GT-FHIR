















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
 * HAPI/FHIR <b>AuditEvent</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * A record of an event made for purposes of maintaining a security log. Typical uses include detection of intrusion attempts and monitoring for inappropriate usage
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/AuditEvent">http://hl7.org/fhir/profiles/AuditEvent</a> 
 * </p>
 *
 */
@ResourceDef(name="AuditEvent", profile="http://hl7.org/fhir/profiles/AuditEvent", id="auditevent")
public class AuditEvent extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.event.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="AuditEvent.event.type", description="", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.event.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>action</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.event.action</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="action", path="AuditEvent.event.action", description="", type="token"  )
	public static final String SP_ACTION = "action";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>action</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.event.action</b><br>
	 * </p>
	 */
	public static final TokenClientParam ACTION = new TokenClientParam(SP_ACTION);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>AuditEvent.event.dateTime</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="AuditEvent.event.dateTime", description="", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>AuditEvent.event.dateTime</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>subtype</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.event.subtype</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subtype", path="AuditEvent.event.subtype", description="", type="token"  )
	public static final String SP_SUBTYPE = "subtype";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subtype</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.event.subtype</b><br>
	 * </p>
	 */
	public static final TokenClientParam SUBTYPE = new TokenClientParam(SP_SUBTYPE);

	/**
	 * Search parameter constant for <b>user</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.participant.userId</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="user", path="AuditEvent.participant.userId", description="", type="token"  )
	public static final String SP_USER = "user";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>user</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.participant.userId</b><br>
	 * </p>
	 */
	public static final TokenClientParam USER = new TokenClientParam(SP_USER);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>AuditEvent.participant.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="AuditEvent.participant.name", description="", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>AuditEvent.participant.name</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>address</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.participant.network.address</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address", path="AuditEvent.participant.network.address", description="", type="token"  )
	public static final String SP_ADDRESS = "address";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.participant.network.address</b><br>
	 * </p>
	 */
	public static final TokenClientParam ADDRESS = new TokenClientParam(SP_ADDRESS);

	/**
	 * Search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.source.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="source", path="AuditEvent.source.identifier", description="", type="token"  )
	public static final String SP_SOURCE = "source";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.source.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam SOURCE = new TokenClientParam(SP_SOURCE);

	/**
	 * Search parameter constant for <b>site</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.source.site</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="site", path="AuditEvent.source.site", description="", type="token"  )
	public static final String SP_SITE = "site";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>site</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.source.site</b><br>
	 * </p>
	 */
	public static final TokenClientParam SITE = new TokenClientParam(SP_SITE);

	/**
	 * Search parameter constant for <b>object-type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.object.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="object-type", path="AuditEvent.object.type", description="", type="token"  )
	public static final String SP_OBJECT_TYPE = "object-type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>object-type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.object.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam OBJECT_TYPE = new TokenClientParam(SP_OBJECT_TYPE);

	/**
	 * Search parameter constant for <b>identity</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.object.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identity", path="AuditEvent.object.identifier", description="", type="token"  )
	public static final String SP_IDENTITY = "identity";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identity</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.object.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTITY = new TokenClientParam(SP_IDENTITY);

	/**
	 * Search parameter constant for <b>reference</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AuditEvent.object.reference</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="reference", path="AuditEvent.object.reference", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_REFERENCE = "reference";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>reference</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AuditEvent.object.reference</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam REFERENCE = new ReferenceClientParam(SP_REFERENCE);

	/**
	 * Search parameter constant for <b>desc</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>AuditEvent.object.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="desc", path="AuditEvent.object.name", description="", type="string"  )
	public static final String SP_DESC = "desc";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>desc</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>AuditEvent.object.name</b><br>
	 * </p>
	 */
	public static final StringClientParam DESC = new StringClientParam(SP_DESC);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AuditEvent.participant.reference | AuditEvent.object.reference</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="AuditEvent.participant.reference | AuditEvent.object.reference", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
, target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AuditEvent.participant.reference | AuditEvent.object.reference</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>altid</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.participant.altId</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="altid", path="AuditEvent.participant.altId", description="", type="token"  )
	public static final String SP_ALTID = "altid";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>altid</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AuditEvent.participant.altId</b><br>
	 * </p>
	 */
	public static final TokenClientParam ALTID = new TokenClientParam(SP_ALTID);

	/**
	 * Search parameter constant for <b>participant</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AuditEvent.participant.reference</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="participant", path="AuditEvent.participant.reference", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_PARTICIPANT = "participant";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>participant</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AuditEvent.participant.reference</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PARTICIPANT = new ReferenceClientParam(SP_PARTICIPANT);

	/**
	 * Search parameter constant for <b>policy</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>AuditEvent.participant.policy</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="policy", path="AuditEvent.participant.policy", description="", type="uri"  )
	public static final String SP_POLICY = "policy";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>policy</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>AuditEvent.participant.policy</b><br>
	 * </p>
	 */
	public static final UriClientParam POLICY = new UriClientParam(SP_POLICY);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>AuditEvent:participant</b>".
	 */
	public static final Include INCLUDE_PARTICIPANT = new Include("AuditEvent:participant");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>AuditEvent:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("AuditEvent:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>AuditEvent:reference</b>".
	 */
	public static final Include INCLUDE_REFERENCE = new Include("AuditEvent:reference");


	@Child(name="event", order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the name, action type, time, and disposition of the audited event"
	)
	private Event myEvent;
	
	@Child(name="participant", order=1, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<Participant> myParticipant;
	
	@Child(name="source", order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private Source mySource;
	
	@Child(name="object", order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specific instances of data or objects that have been accessed"
	)
	private java.util.List<ObjectElement> myObject;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myEvent,  myParticipant,  mySource,  myObject);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myEvent, myParticipant, mySource, myObject);
	}

	/**
	 * Gets the value(s) for <b>event</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the name, action type, time, and disposition of the audited event
     * </p> 
	 */
	public Event getEvent() {  
		if (myEvent == null) {
			myEvent = new Event();
		}
		return myEvent;
	}

	/**
	 * Sets the value(s) for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the name, action type, time, and disposition of the audited event
     * </p> 
	 */
	public AuditEvent setEvent(Event theValue) {
		myEvent = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>participant</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
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
     * 
     * </p> 
	 */
	public AuditEvent setParticipant(java.util.List<Participant> theValue) {
		myParticipant = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>participant</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
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
	 * 
	 * </p>
	 * @param theValue The participant to add (must not be <code>null</code>)
	 */
	public AuditEvent addParticipant(Participant theValue) {
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
     * 
     * </p> 
	 */
	public Participant getParticipantFirstRep() {
		if (getParticipant().isEmpty()) {
			return addParticipant();
		}
		return getParticipant().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>source</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Source getSource() {  
		if (mySource == null) {
			mySource = new Source();
		}
		return mySource;
	}

	/**
	 * Sets the value(s) for <b>source</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public AuditEvent setSource(Source theValue) {
		mySource = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>object</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific instances of data or objects that have been accessed
     * </p> 
	 */
	public java.util.List<ObjectElement> getObject() {  
		if (myObject == null) {
			myObject = new java.util.ArrayList<ObjectElement>();
		}
		return myObject;
	}

	/**
	 * Sets the value(s) for <b>object</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific instances of data or objects that have been accessed
     * </p> 
	 */
	public AuditEvent setObject(java.util.List<ObjectElement> theValue) {
		myObject = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>object</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific instances of data or objects that have been accessed
     * </p> 
	 */
	public ObjectElement addObject() {
		ObjectElement newType = new ObjectElement();
		getObject().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>object</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Specific instances of data or objects that have been accessed
	 * </p>
	 * @param theValue The object to add (must not be <code>null</code>)
	 */
	public AuditEvent addObject(ObjectElement theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getObject().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>object</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific instances of data or objects that have been accessed
     * </p> 
	 */
	public ObjectElement getObjectFirstRep() {
		if (getObject().isEmpty()) {
			return addObject();
		}
		return getObject().get(0); 
	}
  
	/**
	 * Block class for child element: <b>AuditEvent.event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the name, action type, time, and disposition of the audited event
     * </p> 
	 */
	@Block()	
	public static class Event 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodingDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-audit-event-type")
	private CodingDt myType;
	
	@Child(name="subtype", type=CodingDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifier for the category of event"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-audit-event-sub-type")
	private java.util.List<CodingDt> mySubtype;
	
	@Child(name="action", type=CodeDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicator for type of action performed during the event that generated the audit"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/audit-event-action")
	private BoundCodeDt<AuditEventActionEnum> myAction;
	
	@Child(name="dateTime", type=InstantDt.class, order=3, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The time when the event occurred on the source"
	)
	private InstantDt myDateTime;
	
	@Child(name="outcome", type=CodeDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether the event succeeded or failed"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/audit-event-outcome")
	private BoundCodeDt<AuditEventOutcomeEnum> myOutcome;
	
	@Child(name="outcomeDesc", type=StringDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A free text description of the outcome of the event"
	)
	private StringDt myOutcomeDesc;
	
	@Child(name="purposeOfEvent", type=CodingDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The purposeOfUse (reason) that was used during the event being recorded."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/v3-PurposeOfUse")
	private java.util.List<CodingDt> myPurposeOfEvent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  mySubtype,  myAction,  myDateTime,  myOutcome,  myOutcomeDesc,  myPurposeOfEvent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, mySubtype, myAction, myDateTime, myOutcome, myOutcomeDesc, myPurposeOfEvent);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function
     * </p> 
	 */
	public CodingDt getType() {  
		if (myType == null) {
			myType = new CodingDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier for a family of the event.  For example, a menu item, program, rule, policy, function code, application name or URL. It identifies the performed function
     * </p> 
	 */
	public Event setType(CodingDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>subtype</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier for the category of event
     * </p> 
	 */
	public java.util.List<CodingDt> getSubtype() {  
		if (mySubtype == null) {
			mySubtype = new java.util.ArrayList<CodingDt>();
		}
		return mySubtype;
	}

	/**
	 * Sets the value(s) for <b>subtype</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier for the category of event
     * </p> 
	 */
	public Event setSubtype(java.util.List<CodingDt> theValue) {
		mySubtype = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>subtype</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier for the category of event
     * </p> 
	 */
	public CodingDt addSubtype() {
		CodingDt newType = new CodingDt();
		getSubtype().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>subtype</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identifier for the category of event
	 * </p>
	 * @param theValue The subtype to add (must not be <code>null</code>)
	 */
	public Event addSubtype(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSubtype().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>subtype</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier for the category of event
     * </p> 
	 */
	public CodingDt getSubtypeFirstRep() {
		if (getSubtype().isEmpty()) {
			return addSubtype();
		}
		return getSubtype().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>action</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicator for type of action performed during the event that generated the audit
     * </p> 
	 */
	public BoundCodeDt<AuditEventActionEnum> getActionElement() {  
		if (myAction == null) {
			myAction = new BoundCodeDt<AuditEventActionEnum>(AuditEventActionEnum.VALUESET_BINDER);
		}
		return myAction;
	}

	
	/**
	 * Gets the value(s) for <b>action</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicator for type of action performed during the event that generated the audit
     * </p> 
	 */
	public String getAction() {  
		return getActionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicator for type of action performed during the event that generated the audit
     * </p> 
	 */
	public Event setAction(BoundCodeDt<AuditEventActionEnum> theValue) {
		myAction = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicator for type of action performed during the event that generated the audit
     * </p> 
	 */
	public Event setAction(AuditEventActionEnum theValue) {
		setAction(new BoundCodeDt<AuditEventActionEnum>(AuditEventActionEnum.VALUESET_BINDER, theValue));
		
/*
		getActionElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>dateTime</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the event occurred on the source
     * </p> 
	 */
	public InstantDt getDateTimeElement() {  
		if (myDateTime == null) {
			myDateTime = new InstantDt();
		}
		return myDateTime;
	}

	
	/**
	 * Gets the value(s) for <b>dateTime</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the event occurred on the source
     * </p> 
	 */
	public Date getDateTime() {  
		return getDateTimeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>dateTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the event occurred on the source
     * </p> 
	 */
	public Event setDateTime(InstantDt theValue) {
		myDateTime = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>dateTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the event occurred on the source
     * </p> 
	 */
	public Event setDateTimeWithMillisPrecision( Date theDate) {
		myDateTime = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>dateTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the event occurred on the source
     * </p> 
	 */
	public Event setDateTime( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDateTime = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>outcome</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the event succeeded or failed
     * </p> 
	 */
	public BoundCodeDt<AuditEventOutcomeEnum> getOutcomeElement() {  
		if (myOutcome == null) {
			myOutcome = new BoundCodeDt<AuditEventOutcomeEnum>(AuditEventOutcomeEnum.VALUESET_BINDER);
		}
		return myOutcome;
	}

	
	/**
	 * Gets the value(s) for <b>outcome</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the event succeeded or failed
     * </p> 
	 */
	public String getOutcome() {  
		return getOutcomeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>outcome</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the event succeeded or failed
     * </p> 
	 */
	public Event setOutcome(BoundCodeDt<AuditEventOutcomeEnum> theValue) {
		myOutcome = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>outcome</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the event succeeded or failed
     * </p> 
	 */
	public Event setOutcome(AuditEventOutcomeEnum theValue) {
		setOutcome(new BoundCodeDt<AuditEventOutcomeEnum>(AuditEventOutcomeEnum.VALUESET_BINDER, theValue));
		
/*
		getOutcomeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>outcomeDesc</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A free text description of the outcome of the event
     * </p> 
	 */
	public StringDt getOutcomeDescElement() {  
		if (myOutcomeDesc == null) {
			myOutcomeDesc = new StringDt();
		}
		return myOutcomeDesc;
	}

	
	/**
	 * Gets the value(s) for <b>outcomeDesc</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A free text description of the outcome of the event
     * </p> 
	 */
	public String getOutcomeDesc() {  
		return getOutcomeDescElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>outcomeDesc</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text description of the outcome of the event
     * </p> 
	 */
	public Event setOutcomeDesc(StringDt theValue) {
		myOutcomeDesc = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>outcomeDesc</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text description of the outcome of the event
     * </p> 
	 */
	public Event setOutcomeDesc( String theString) {
		myOutcomeDesc = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>purposeOfEvent</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The purposeOfUse (reason) that was used during the event being recorded.
     * </p> 
	 */
	public java.util.List<CodingDt> getPurposeOfEvent() {  
		if (myPurposeOfEvent == null) {
			myPurposeOfEvent = new java.util.ArrayList<CodingDt>();
		}
		return myPurposeOfEvent;
	}

	/**
	 * Sets the value(s) for <b>purposeOfEvent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The purposeOfUse (reason) that was used during the event being recorded.
     * </p> 
	 */
	public Event setPurposeOfEvent(java.util.List<CodingDt> theValue) {
		myPurposeOfEvent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>purposeOfEvent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The purposeOfUse (reason) that was used during the event being recorded.
     * </p> 
	 */
	public CodingDt addPurposeOfEvent() {
		CodingDt newType = new CodingDt();
		getPurposeOfEvent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>purposeOfEvent</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The purposeOfUse (reason) that was used during the event being recorded.
	 * </p>
	 * @param theValue The purposeOfEvent to add (must not be <code>null</code>)
	 */
	public Event addPurposeOfEvent(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPurposeOfEvent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>purposeOfEvent</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The purposeOfUse (reason) that was used during the event being recorded.
     * </p> 
	 */
	public CodingDt getPurposeOfEventFirstRep() {
		if (getPurposeOfEvent().isEmpty()) {
			return addPurposeOfEvent();
		}
		return getPurposeOfEvent().get(0); 
	}
  


	}


	/**
	 * Block class for child element: <b>AuditEvent.participant</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	@Block()	
	public static class Participant 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="role", type=CodeableConceptDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specification of the role(s) the user plays when performing the event. Usually the codes used in this element are local codes defined by the role-based access control security system used in the local context"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-dicm-402-roleid")
	private java.util.List<CodeableConceptDt> myRole;
	
	@Child(name="reference", order=1, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Direct reference to a resource that identifies the participant"
	)
	private ResourceReferenceDt myReference;
	
	@Child(name="userId", type=IdentifierDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Unique identifier for the user actively participating in the event"
	)
	private IdentifierDt myUserId;
	
	@Child(name="altId", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Alternative Participant Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available"
	)
	private StringDt myAltId;
	
	@Child(name="name", type=StringDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Human-meaningful name for the user"
	)
	private StringDt myName;
	
	@Child(name="requestor", type=BooleanDt.class, order=5, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicator that the user is or is not the requestor, or initiator, for the event being audited."
	)
	private BooleanDt myRequestor;
	
	@Child(name="location", order=6, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Where the event occurred"
	)
	private ResourceReferenceDt myLocation;
	
	@Child(name="policy", type=UriDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used."
	)
	private java.util.List<UriDt> myPolicy;
	
	@Child(name="media", type=CodingDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Type of media involved. Used when the event is about exporting/importing onto media"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-dicm-405-mediatype")
	private CodingDt myMedia;
	
	@Child(name="network", order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Logical network location for application activity, if the activity has a network location"
	)
	private ParticipantNetwork myNetwork;
	
	@Child(name="purposeOfUse", type=CodingDt.class, order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The reason (purpose of use), specific to this participant, that was used during the event being recorded."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/v3-PurposeOfUse")
	private java.util.List<CodingDt> myPurposeOfUse;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myRole,  myReference,  myUserId,  myAltId,  myName,  myRequestor,  myLocation,  myPolicy,  myMedia,  myNetwork,  myPurposeOfUse);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myRole, myReference, myUserId, myAltId, myName, myRequestor, myLocation, myPolicy, myMedia, myNetwork, myPurposeOfUse);
	}

	/**
	 * Gets the value(s) for <b>role</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specification of the role(s) the user plays when performing the event. Usually the codes used in this element are local codes defined by the role-based access control security system used in the local context
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getRole() {  
		if (myRole == null) {
			myRole = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myRole;
	}

	/**
	 * Sets the value(s) for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specification of the role(s) the user plays when performing the event. Usually the codes used in this element are local codes defined by the role-based access control security system used in the local context
     * </p> 
	 */
	public Participant setRole(java.util.List<CodeableConceptDt> theValue) {
		myRole = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specification of the role(s) the user plays when performing the event. Usually the codes used in this element are local codes defined by the role-based access control security system used in the local context
     * </p> 
	 */
	public CodeableConceptDt addRole() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getRole().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>role</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Specification of the role(s) the user plays when performing the event. Usually the codes used in this element are local codes defined by the role-based access control security system used in the local context
	 * </p>
	 * @param theValue The role to add (must not be <code>null</code>)
	 */
	public Participant addRole(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRole().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>role</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Specification of the role(s) the user plays when performing the event. Usually the codes used in this element are local codes defined by the role-based access control security system used in the local context
     * </p> 
	 */
	public CodeableConceptDt getRoleFirstRep() {
		if (getRole().isEmpty()) {
			return addRole();
		}
		return getRole().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>reference</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Direct reference to a resource that identifies the participant
     * </p> 
	 */
	public ResourceReferenceDt getReference() {  
		if (myReference == null) {
			myReference = new ResourceReferenceDt();
		}
		return myReference;
	}

	/**
	 * Sets the value(s) for <b>reference</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Direct reference to a resource that identifies the participant
     * </p> 
	 */
	public Participant setReference(ResourceReferenceDt theValue) {
		myReference = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>userId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Unique identifier for the user actively participating in the event
     * </p> 
	 */
	public IdentifierDt getUserId() {  
		if (myUserId == null) {
			myUserId = new IdentifierDt();
		}
		return myUserId;
	}

	/**
	 * Sets the value(s) for <b>userId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Unique identifier for the user actively participating in the event
     * </p> 
	 */
	public Participant setUserId(IdentifierDt theValue) {
		myUserId = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>altId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Alternative Participant Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available
     * </p> 
	 */
	public StringDt getAltIdElement() {  
		if (myAltId == null) {
			myAltId = new StringDt();
		}
		return myAltId;
	}

	
	/**
	 * Gets the value(s) for <b>altId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Alternative Participant Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available
     * </p> 
	 */
	public String getAltId() {  
		return getAltIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>altId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Alternative Participant Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available
     * </p> 
	 */
	public Participant setAltId(StringDt theValue) {
		myAltId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>altId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Alternative Participant Identifier. For a human, this should be a user identifier text string from authentication system. This identifier would be one known to a common authentication system (e.g. single sign-on), if available
     * </p> 
	 */
	public Participant setAltId( String theString) {
		myAltId = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human-meaningful name for the user
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
     * Human-meaningful name for the user
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
     * Human-meaningful name for the user
     * </p> 
	 */
	public Participant setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human-meaningful name for the user
     * </p> 
	 */
	public Participant setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>requestor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicator that the user is or is not the requestor, or initiator, for the event being audited.
     * </p> 
	 */
	public BooleanDt getRequestorElement() {  
		if (myRequestor == null) {
			myRequestor = new BooleanDt();
		}
		return myRequestor;
	}

	
	/**
	 * Gets the value(s) for <b>requestor</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicator that the user is or is not the requestor, or initiator, for the event being audited.
     * </p> 
	 */
	public Boolean getRequestor() {  
		return getRequestorElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>requestor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicator that the user is or is not the requestor, or initiator, for the event being audited.
     * </p> 
	 */
	public Participant setRequestor(BooleanDt theValue) {
		myRequestor = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>requestor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicator that the user is or is not the requestor, or initiator, for the event being audited.
     * </p> 
	 */
	public Participant setRequestor( boolean theBoolean) {
		myRequestor = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>location</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Where the event occurred
     * </p> 
	 */
	public ResourceReferenceDt getLocation() {  
		if (myLocation == null) {
			myLocation = new ResourceReferenceDt();
		}
		return myLocation;
	}

	/**
	 * Sets the value(s) for <b>location</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Where the event occurred
     * </p> 
	 */
	public Participant setLocation(ResourceReferenceDt theValue) {
		myLocation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>policy</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
     * </p> 
	 */
	public java.util.List<UriDt> getPolicy() {  
		if (myPolicy == null) {
			myPolicy = new java.util.ArrayList<UriDt>();
		}
		return myPolicy;
	}

	/**
	 * Sets the value(s) for <b>policy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
     * </p> 
	 */
	public Participant setPolicy(java.util.List<UriDt> theValue) {
		myPolicy = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>policy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
     * </p> 
	 */
	public UriDt addPolicy() {
		UriDt newType = new UriDt();
		getPolicy().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>policy</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
	 * </p>
	 * @param theValue The policy to add (must not be <code>null</code>)
	 */
	public Participant addPolicy(UriDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPolicy().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>policy</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
     * </p> 
	 */
	public UriDt getPolicyFirstRep() {
		if (getPolicy().isEmpty()) {
			return addPolicy();
		}
		return getPolicy().get(0); 
	}
 	/**
	 * Adds a new value for <b>policy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The policy or plan that authorized the activity being recorded. Typically, a single activity may have multiple applicable policies, such as patient consent, guarantor funding, etc. The policy would also indicate the security token used.
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Participant addPolicy( String theUri) {
		if (myPolicy == null) {
			myPolicy = new java.util.ArrayList<UriDt>();
		}
		myPolicy.add(new UriDt(theUri));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>media</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Type of media involved. Used when the event is about exporting/importing onto media
     * </p> 
	 */
	public CodingDt getMedia() {  
		if (myMedia == null) {
			myMedia = new CodingDt();
		}
		return myMedia;
	}

	/**
	 * Sets the value(s) for <b>media</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Type of media involved. Used when the event is about exporting/importing onto media
     * </p> 
	 */
	public Participant setMedia(CodingDt theValue) {
		myMedia = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>network</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Logical network location for application activity, if the activity has a network location
     * </p> 
	 */
	public ParticipantNetwork getNetwork() {  
		if (myNetwork == null) {
			myNetwork = new ParticipantNetwork();
		}
		return myNetwork;
	}

	/**
	 * Sets the value(s) for <b>network</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Logical network location for application activity, if the activity has a network location
     * </p> 
	 */
	public Participant setNetwork(ParticipantNetwork theValue) {
		myNetwork = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>purposeOfUse</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The reason (purpose of use), specific to this participant, that was used during the event being recorded.
     * </p> 
	 */
	public java.util.List<CodingDt> getPurposeOfUse() {  
		if (myPurposeOfUse == null) {
			myPurposeOfUse = new java.util.ArrayList<CodingDt>();
		}
		return myPurposeOfUse;
	}

	/**
	 * Sets the value(s) for <b>purposeOfUse</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The reason (purpose of use), specific to this participant, that was used during the event being recorded.
     * </p> 
	 */
	public Participant setPurposeOfUse(java.util.List<CodingDt> theValue) {
		myPurposeOfUse = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>purposeOfUse</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The reason (purpose of use), specific to this participant, that was used during the event being recorded.
     * </p> 
	 */
	public CodingDt addPurposeOfUse() {
		CodingDt newType = new CodingDt();
		getPurposeOfUse().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>purposeOfUse</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The reason (purpose of use), specific to this participant, that was used during the event being recorded.
	 * </p>
	 * @param theValue The purposeOfUse to add (must not be <code>null</code>)
	 */
	public Participant addPurposeOfUse(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPurposeOfUse().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>purposeOfUse</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The reason (purpose of use), specific to this participant, that was used during the event being recorded.
     * </p> 
	 */
	public CodingDt getPurposeOfUseFirstRep() {
		if (getPurposeOfUse().isEmpty()) {
			return addPurposeOfUse();
		}
		return getPurposeOfUse().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>AuditEvent.participant.network</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Logical network location for application activity, if the activity has a network location
     * </p> 
	 */
	@Block()	
	public static class ParticipantNetwork 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="address", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An identifier for the network access point of the user device for the audit event"
	)
	private StringDt myAddress;
	
	@Child(name="type", type=CodeDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An identifier for the type of network access point that originated the audit event"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/network-type")
	private BoundCodeDt<AuditEventParticipantNetworkTypeEnum> myType;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myAddress,  myType);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myAddress, myType);
	}

	/**
	 * Gets the value(s) for <b>address</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier for the network access point of the user device for the audit event
     * </p> 
	 */
	public StringDt getAddressElement() {  
		if (myAddress == null) {
			myAddress = new StringDt();
		}
		return myAddress;
	}

	
	/**
	 * Gets the value(s) for <b>address</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier for the network access point of the user device for the audit event
     * </p> 
	 */
	public String getAddress() {  
		return getAddressElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>address</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier for the network access point of the user device for the audit event
     * </p> 
	 */
	public ParticipantNetwork setAddress(StringDt theValue) {
		myAddress = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>address</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier for the network access point of the user device for the audit event
     * </p> 
	 */
	public ParticipantNetwork setAddress( String theString) {
		myAddress = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier for the type of network access point that originated the audit event
     * </p> 
	 */
	public BoundCodeDt<AuditEventParticipantNetworkTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<AuditEventParticipantNetworkTypeEnum>(AuditEventParticipantNetworkTypeEnum.VALUESET_BINDER);
		}
		return myType;
	}

	
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier for the type of network access point that originated the audit event
     * </p> 
	 */
	public String getType() {  
		return getTypeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier for the type of network access point that originated the audit event
     * </p> 
	 */
	public ParticipantNetwork setType(BoundCodeDt<AuditEventParticipantNetworkTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier for the type of network access point that originated the audit event
     * </p> 
	 */
	public ParticipantNetwork setType(AuditEventParticipantNetworkTypeEnum theValue) {
		setType(new BoundCodeDt<AuditEventParticipantNetworkTypeEnum>(AuditEventParticipantNetworkTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  


	}



	/**
	 * Block class for child element: <b>AuditEvent.source</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	@Block()	
	public static class Source 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="site", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group"
	)
	private StringDt mySite;
	
	@Child(name="identifier", type=IdentifierDt.class, order=1, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifier of the source where the event was detected"
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="type", type=CodingDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Code specifying the type of source where event originated"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-audit-source-type")
	private java.util.List<CodingDt> myType;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySite,  myIdentifier,  myType);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySite, myIdentifier, myType);
	}

	/**
	 * Gets the value(s) for <b>site</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group
     * </p> 
	 */
	public StringDt getSiteElement() {  
		if (mySite == null) {
			mySite = new StringDt();
		}
		return mySite;
	}

	
	/**
	 * Gets the value(s) for <b>site</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group
     * </p> 
	 */
	public String getSite() {  
		return getSiteElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>site</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group
     * </p> 
	 */
	public Source setSite(StringDt theValue) {
		mySite = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>site</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Logical source location within the healthcare enterprise network.  For example, a hospital or other provider location within a multi-entity provider group
     * </p> 
	 */
	public Source setSite( String theString) {
		mySite = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier of the source where the event was detected
     * </p> 
	 */
	public IdentifierDt getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new IdentifierDt();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier of the source where the event was detected
     * </p> 
	 */
	public Source setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code specifying the type of source where event originated
     * </p> 
	 */
	public java.util.List<CodingDt> getType() {  
		if (myType == null) {
			myType = new java.util.ArrayList<CodingDt>();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code specifying the type of source where event originated
     * </p> 
	 */
	public Source setType(java.util.List<CodingDt> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code specifying the type of source where event originated
     * </p> 
	 */
	public CodingDt addType() {
		CodingDt newType = new CodingDt();
		getType().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>type</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Code specifying the type of source where event originated
	 * </p>
	 * @param theValue The type to add (must not be <code>null</code>)
	 */
	public Source addType(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getType().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>type</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Code specifying the type of source where event originated
     * </p> 
	 */
	public CodingDt getTypeFirstRep() {
		if (getType().isEmpty()) {
			return addType();
		}
		return getType().get(0); 
	}
  


	}


	/**
	 * Block class for child element: <b>AuditEvent.object</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific instances of data or objects that have been accessed
     * </p> 
	 */
	@Block()	
	public static class ObjectElement 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a specific instance of the participant object. The reference should always be version specific"
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="reference", order=1, min=0, max=1, summary=true, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a specific instance of the participant object. The reference should always be version specific"
	)
	private ResourceReferenceDt myReference;
	
	@Child(name="type", type=CodingDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of the object that was involved in this audit event."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/object-type")
	private CodingDt myType;
	
	@Child(name="role", type=CodingDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Code representing the functional application role of Participant Object being audited"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/object-role")
	private CodingDt myRole;
	
	@Child(name="lifecycle", type=CodingDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifier for the data life-cycle stage for the participant object"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/object-lifecycle")
	private CodingDt myLifecycle;
	
	@Child(name="securityLabel", type=CodingDt.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Denotes security labels for the identified object."
	)
	private java.util.List<CodingDt> mySecurityLabel;
	
	@Child(name="name", type=StringDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An instance-specific descriptor of the Participant Object ID audited, such as a person's name"
	)
	private StringDt myName;
	
	@Child(name="description", type=StringDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Text that describes the object in more detail"
	)
	private StringDt myDescription;
	
	@Child(name="query", type=Base64BinaryDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The actual query for a query-type participant object"
	)
	private Base64BinaryDt myQuery;
	
	@Child(name="detail", order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<ObjectDetail> myDetail;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myReference,  myType,  myRole,  myLifecycle,  mySecurityLabel,  myName,  myDescription,  myQuery,  myDetail);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myReference, myType, myRole, myLifecycle, mySecurityLabel, myName, myDescription, myQuery, myDetail);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a specific instance of the participant object. The reference should always be version specific
     * </p> 
	 */
	public IdentifierDt getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new IdentifierDt();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a specific instance of the participant object. The reference should always be version specific
     * </p> 
	 */
	public ObjectElement setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reference</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a specific instance of the participant object. The reference should always be version specific
     * </p> 
	 */
	public ResourceReferenceDt getReference() {  
		if (myReference == null) {
			myReference = new ResourceReferenceDt();
		}
		return myReference;
	}

	/**
	 * Sets the value(s) for <b>reference</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a specific instance of the participant object. The reference should always be version specific
     * </p> 
	 */
	public ObjectElement setReference(ResourceReferenceDt theValue) {
		myReference = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of the object that was involved in this audit event.
     * </p> 
	 */
	public CodingDt getType() {  
		if (myType == null) {
			myType = new CodingDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of the object that was involved in this audit event.
     * </p> 
	 */
	public ObjectElement setType(CodingDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>role</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code representing the functional application role of Participant Object being audited
     * </p> 
	 */
	public CodingDt getRole() {  
		if (myRole == null) {
			myRole = new CodingDt();
		}
		return myRole;
	}

	/**
	 * Sets the value(s) for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code representing the functional application role of Participant Object being audited
     * </p> 
	 */
	public ObjectElement setRole(CodingDt theValue) {
		myRole = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>lifecycle</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier for the data life-cycle stage for the participant object
     * </p> 
	 */
	public CodingDt getLifecycle() {  
		if (myLifecycle == null) {
			myLifecycle = new CodingDt();
		}
		return myLifecycle;
	}

	/**
	 * Sets the value(s) for <b>lifecycle</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier for the data life-cycle stage for the participant object
     * </p> 
	 */
	public ObjectElement setLifecycle(CodingDt theValue) {
		myLifecycle = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>securityLabel</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Denotes security labels for the identified object.
     * </p> 
	 */
	public java.util.List<CodingDt> getSecurityLabel() {  
		if (mySecurityLabel == null) {
			mySecurityLabel = new java.util.ArrayList<CodingDt>();
		}
		return mySecurityLabel;
	}

	/**
	 * Sets the value(s) for <b>securityLabel</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Denotes security labels for the identified object.
     * </p> 
	 */
	public ObjectElement setSecurityLabel(java.util.List<CodingDt> theValue) {
		mySecurityLabel = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>securityLabel</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Denotes security labels for the identified object.
     * </p> 
	 */
	public CodingDt addSecurityLabel() {
		CodingDt newType = new CodingDt();
		getSecurityLabel().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>securityLabel</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Denotes security labels for the identified object.
	 * </p>
	 * @param theValue The securityLabel to add (must not be <code>null</code>)
	 */
	public ObjectElement addSecurityLabel(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSecurityLabel().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>securityLabel</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Denotes security labels for the identified object.
     * </p> 
	 */
	public CodingDt getSecurityLabelFirstRep() {
		if (getSecurityLabel().isEmpty()) {
			return addSecurityLabel();
		}
		return getSecurityLabel().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An instance-specific descriptor of the Participant Object ID audited, such as a person's name
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
     * An instance-specific descriptor of the Participant Object ID audited, such as a person's name
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
     * An instance-specific descriptor of the Participant Object ID audited, such as a person's name
     * </p> 
	 */
	public ObjectElement setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An instance-specific descriptor of the Participant Object ID audited, such as a person's name
     * </p> 
	 */
	public ObjectElement setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Text that describes the object in more detail
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
     * Text that describes the object in more detail
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
     * Text that describes the object in more detail
     * </p> 
	 */
	public ObjectElement setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Text that describes the object in more detail
     * </p> 
	 */
	public ObjectElement setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>query</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual query for a query-type participant object
     * </p> 
	 */
	public Base64BinaryDt getQueryElement() {  
		if (myQuery == null) {
			myQuery = new Base64BinaryDt();
		}
		return myQuery;
	}

	
	/**
	 * Gets the value(s) for <b>query</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual query for a query-type participant object
     * </p> 
	 */
	public byte[] getQuery() {  
		return getQueryElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>query</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual query for a query-type participant object
     * </p> 
	 */
	public ObjectElement setQuery(Base64BinaryDt theValue) {
		myQuery = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>query</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual query for a query-type participant object
     * </p> 
	 */
	public ObjectElement setQuery( byte[] theBytes) {
		myQuery = new Base64BinaryDt(theBytes); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>detail</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<ObjectDetail> getDetail() {  
		if (myDetail == null) {
			myDetail = new java.util.ArrayList<ObjectDetail>();
		}
		return myDetail;
	}

	/**
	 * Sets the value(s) for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ObjectElement setDetail(java.util.List<ObjectDetail> theValue) {
		myDetail = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ObjectDetail addDetail() {
		ObjectDetail newType = new ObjectDetail();
		getDetail().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>detail</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The detail to add (must not be <code>null</code>)
	 */
	public ObjectElement addDetail(ObjectDetail theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDetail().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>detail</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ObjectDetail getDetailFirstRep() {
		if (getDetail().isEmpty()) {
			return addDetail();
		}
		return getDetail().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>AuditEvent.object.detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	@Block()	
	public static class ObjectDetail 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=StringDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private StringDt myType;
	
	@Child(name="value", type=Base64BinaryDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private Base64BinaryDt myValue;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myValue);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myValue);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public StringDt getTypeElement() {  
		if (myType == null) {
			myType = new StringDt();
		}
		return myType;
	}

	
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public String getType() {  
		return getTypeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ObjectDetail setType(StringDt theValue) {
		myType = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ObjectDetail setType( String theString) {
		myType = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Base64BinaryDt getValueElement() {  
		if (myValue == null) {
			myValue = new Base64BinaryDt();
		}
		return myValue;
	}

	
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public byte[] getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ObjectDetail setValue(Base64BinaryDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ObjectDetail setValue( byte[] theBytes) {
		myValue = new Base64BinaryDt(theBytes); 
		return this; 
	}

 


	}





    @Override
    public String getResourceName() {
        return "AuditEvent";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
