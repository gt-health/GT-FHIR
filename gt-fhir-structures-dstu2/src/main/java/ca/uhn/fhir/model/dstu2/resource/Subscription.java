















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
 * HAPI/FHIR <b>Subscription</b> Resource
 * (infrastructure.exchange)
 *
 * <p>
 * <b>Definition:</b>
 * The subscription resource is used to define a push based subscription from a server to another system. Once a subscription is registered with the server, the server checks every resource that is created or updated, and if the resource matches the given criteria, it sends a message on the defined \"channel\" so that another system is able to take an appropriate action.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Subscription">http://hl7.org/fhir/profiles/Subscription</a> 
 * </p>
 *
 */
@ResourceDef(name="Subscription", profile="http://hl7.org/fhir/profiles/Subscription", id="subscription")
public class Subscription extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Subscription.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="Subscription.status", description="", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Subscription.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Subscription.channel.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="Subscription.channel.type", description="", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Subscription.channel.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>Subscription.channel.endpoint</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="url", path="Subscription.channel.endpoint", description="", type="uri"  )
	public static final String SP_URL = "url";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>Subscription.channel.endpoint</b><br>
	 * </p>
	 */
	public static final UriClientParam URL = new UriClientParam(SP_URL);

	/**
	 * Search parameter constant for <b>criteria</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Subscription.criteria</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="criteria", path="Subscription.criteria", description="", type="string"  )
	public static final String SP_CRITERIA = "criteria";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>criteria</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Subscription.criteria</b><br>
	 * </p>
	 */
	public static final StringClientParam CRITERIA = new StringClientParam(SP_CRITERIA);

	/**
	 * Search parameter constant for <b>payload</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Subscription.channel.payload</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="payload", path="Subscription.channel.payload", description="", type="string"  )
	public static final String SP_PAYLOAD = "payload";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>payload</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Subscription.channel.payload</b><br>
	 * </p>
	 */
	public static final StringClientParam PAYLOAD = new StringClientParam(SP_PAYLOAD);

	/**
	 * Search parameter constant for <b>contact</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Subscription.contact</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="contact", path="Subscription.contact", description="", type="token"  )
	public static final String SP_CONTACT = "contact";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>contact</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Subscription.contact</b><br>
	 * </p>
	 */
	public static final TokenClientParam CONTACT = new TokenClientParam(SP_CONTACT);

	/**
	 * Search parameter constant for <b>tag</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Subscription.tag</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="tag", path="Subscription.tag", description="", type="token"  )
	public static final String SP_TAG = "tag";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>tag</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Subscription.tag</b><br>
	 * </p>
	 */
	public static final TokenClientParam TAG = new TokenClientParam(SP_TAG);



	@Child(name="criteria", type=StringDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The rules that the server should use to determine when to generate notifications for this subscription"
	)
	private StringDt myCriteria;
	
	@Child(name="contact", type=ContactPointDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="who.focus",
		formalDefinition="Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting"
	)
	private java.util.List<ContactPointDt> myContact;
	
	@Child(name="reason", type=StringDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="why",
		formalDefinition="A description of why this subscription is defined"
	)
	private StringDt myReason;
	
	@Child(name="status", type=CodeDt.class, order=3, min=1, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The status of the subscription, which marks the server state for managing the subscription"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/subscription-status")
	private BoundCodeDt<SubscriptionStatusEnum> myStatus;
	
	@Child(name="error", type=StringDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A record of the last error that occurred when the server processed a notification"
	)
	private StringDt myError;
	
	@Child(name="channel", order=5, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Details where to send notifications when resources are received that meet the criteria"
	)
	private Channel myChannel;
	
	@Child(name="end", type=InstantDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.done",
		formalDefinition="The time for the server to turn the subscription off"
	)
	private InstantDt myEnd;
	
	@Child(name="tag", type=CodingDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A tag to add to any resource that matches the criteria, after the subscription is processed"
	)
	private java.util.List<CodingDt> myTag;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCriteria,  myContact,  myReason,  myStatus,  myError,  myChannel,  myEnd,  myTag);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCriteria, myContact, myReason, myStatus, myError, myChannel, myEnd, myTag);
	}

	/**
	 * Gets the value(s) for <b>criteria</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The rules that the server should use to determine when to generate notifications for this subscription
     * </p> 
	 */
	public StringDt getCriteriaElement() {  
		if (myCriteria == null) {
			myCriteria = new StringDt();
		}
		return myCriteria;
	}

	
	/**
	 * Gets the value(s) for <b>criteria</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The rules that the server should use to determine when to generate notifications for this subscription
     * </p> 
	 */
	public String getCriteria() {  
		return getCriteriaElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>criteria</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The rules that the server should use to determine when to generate notifications for this subscription
     * </p> 
	 */
	public Subscription setCriteria(StringDt theValue) {
		myCriteria = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>criteria</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The rules that the server should use to determine when to generate notifications for this subscription
     * </p> 
	 */
	public Subscription setCriteria( String theString) {
		myCriteria = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>contact</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting
     * </p> 
	 */
	public java.util.List<ContactPointDt> getContact() {  
		if (myContact == null) {
			myContact = new java.util.ArrayList<ContactPointDt>();
		}
		return myContact;
	}

	/**
	 * Sets the value(s) for <b>contact</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting
     * </p> 
	 */
	public Subscription setContact(java.util.List<ContactPointDt> theValue) {
		myContact = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>contact</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting
     * </p> 
	 */
	public ContactPointDt addContact() {
		ContactPointDt newType = new ContactPointDt();
		getContact().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>contact</b> (who.focus)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting
	 * </p>
	 * @param theValue The contact to add (must not be <code>null</code>)
	 */
	public Subscription addContact(ContactPointDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getContact().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>contact</b> (who.focus),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Contact details for a human to contact about the subscription. The primary use of this for system administrator troubleshooting
     * </p> 
	 */
	public ContactPointDt getContactFirstRep() {
		if (getContact().isEmpty()) {
			return addContact();
		}
		return getContact().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>reason</b> (why).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of why this subscription is defined
     * </p> 
	 */
	public StringDt getReasonElement() {  
		if (myReason == null) {
			myReason = new StringDt();
		}
		return myReason;
	}

	
	/**
	 * Gets the value(s) for <b>reason</b> (why).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of why this subscription is defined
     * </p> 
	 */
	public String getReason() {  
		return getReasonElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>reason</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * A description of why this subscription is defined
     * </p> 
	 */
	public Subscription setReason(StringDt theValue) {
		myReason = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>reason</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * A description of why this subscription is defined
     * </p> 
	 */
	public Subscription setReason( String theString) {
		myReason = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the subscription, which marks the server state for managing the subscription
     * </p> 
	 */
	public BoundCodeDt<SubscriptionStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<SubscriptionStatusEnum>(SubscriptionStatusEnum.VALUESET_BINDER);
		}
		return myStatus;
	}

	
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the subscription, which marks the server state for managing the subscription
     * </p> 
	 */
	public String getStatus() {  
		return getStatusElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the subscription, which marks the server state for managing the subscription
     * </p> 
	 */
	public Subscription setStatus(BoundCodeDt<SubscriptionStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the subscription, which marks the server state for managing the subscription
     * </p> 
	 */
	public Subscription setStatus(SubscriptionStatusEnum theValue) {
		setStatus(new BoundCodeDt<SubscriptionStatusEnum>(SubscriptionStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>error</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A record of the last error that occurred when the server processed a notification
     * </p> 
	 */
	public StringDt getErrorElement() {  
		if (myError == null) {
			myError = new StringDt();
		}
		return myError;
	}

	
	/**
	 * Gets the value(s) for <b>error</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A record of the last error that occurred when the server processed a notification
     * </p> 
	 */
	public String getError() {  
		return getErrorElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>error</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A record of the last error that occurred when the server processed a notification
     * </p> 
	 */
	public Subscription setError(StringDt theValue) {
		myError = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>error</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A record of the last error that occurred when the server processed a notification
     * </p> 
	 */
	public Subscription setError( String theString) {
		myError = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>channel</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details where to send notifications when resources are received that meet the criteria
     * </p> 
	 */
	public Channel getChannel() {  
		if (myChannel == null) {
			myChannel = new Channel();
		}
		return myChannel;
	}

	/**
	 * Sets the value(s) for <b>channel</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details where to send notifications when resources are received that meet the criteria
     * </p> 
	 */
	public Subscription setChannel(Channel theValue) {
		myChannel = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>end</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time for the server to turn the subscription off
     * </p> 
	 */
	public InstantDt getEndElement() {  
		if (myEnd == null) {
			myEnd = new InstantDt();
		}
		return myEnd;
	}

	
	/**
	 * Gets the value(s) for <b>end</b> (when.done).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time for the server to turn the subscription off
     * </p> 
	 */
	public Date getEnd() {  
		return getEndElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>end</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * The time for the server to turn the subscription off
     * </p> 
	 */
	public Subscription setEnd(InstantDt theValue) {
		myEnd = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>end</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * The time for the server to turn the subscription off
     * </p> 
	 */
	public Subscription setEndWithMillisPrecision( Date theDate) {
		myEnd = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>end</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * The time for the server to turn the subscription off
     * </p> 
	 */
	public Subscription setEnd( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myEnd = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>tag</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A tag to add to any resource that matches the criteria, after the subscription is processed
     * </p> 
	 */
	public java.util.List<CodingDt> getTag() {  
		if (myTag == null) {
			myTag = new java.util.ArrayList<CodingDt>();
		}
		return myTag;
	}

	/**
	 * Sets the value(s) for <b>tag</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A tag to add to any resource that matches the criteria, after the subscription is processed
     * </p> 
	 */
	public Subscription setTag(java.util.List<CodingDt> theValue) {
		myTag = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>tag</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A tag to add to any resource that matches the criteria, after the subscription is processed
     * </p> 
	 */
	public CodingDt addTag() {
		CodingDt newType = new CodingDt();
		getTag().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>tag</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A tag to add to any resource that matches the criteria, after the subscription is processed
	 * </p>
	 * @param theValue The tag to add (must not be <code>null</code>)
	 */
	public Subscription addTag(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getTag().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>tag</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A tag to add to any resource that matches the criteria, after the subscription is processed
     * </p> 
	 */
	public CodingDt getTagFirstRep() {
		if (getTag().isEmpty()) {
			return addTag();
		}
		return getTag().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Subscription.channel</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details where to send notifications when resources are received that meet the criteria
     * </p> 
	 */
	@Block()	
	public static class Channel 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of channel to send notifications on"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/subscription-channel-type")
	private BoundCodeDt<SubscriptionChannelTypeEnum> myType;
	
	@Child(name="endpoint", type=UriDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The uri that describes the actual end-point to send messages to"
	)
	private UriDt myEndpoint;
	
	@Child(name="payload", type=StringDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification"
	)
	private StringDt myPayload;
	
	@Child(name="header", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional headers / information to send as part of the notification"
	)
	private StringDt myHeader;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myEndpoint,  myPayload,  myHeader);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myEndpoint, myPayload, myHeader);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of channel to send notifications on
     * </p> 
	 */
	public BoundCodeDt<SubscriptionChannelTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<SubscriptionChannelTypeEnum>(SubscriptionChannelTypeEnum.VALUESET_BINDER);
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
     * The type of channel to send notifications on
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
     * The type of channel to send notifications on
     * </p> 
	 */
	public Channel setType(BoundCodeDt<SubscriptionChannelTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of channel to send notifications on
     * </p> 
	 */
	public Channel setType(SubscriptionChannelTypeEnum theValue) {
		setType(new BoundCodeDt<SubscriptionChannelTypeEnum>(SubscriptionChannelTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>endpoint</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The uri that describes the actual end-point to send messages to
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
     * The uri that describes the actual end-point to send messages to
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
     * The uri that describes the actual end-point to send messages to
     * </p> 
	 */
	public Channel setEndpoint(UriDt theValue) {
		myEndpoint = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>endpoint</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The uri that describes the actual end-point to send messages to
     * </p> 
	 */
	public Channel setEndpoint( String theUri) {
		myEndpoint = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>payload</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification
     * </p> 
	 */
	public StringDt getPayloadElement() {  
		if (myPayload == null) {
			myPayload = new StringDt();
		}
		return myPayload;
	}

	
	/**
	 * Gets the value(s) for <b>payload</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification
     * </p> 
	 */
	public String getPayload() {  
		return getPayloadElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>payload</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification
     * </p> 
	 */
	public Channel setPayload(StringDt theValue) {
		myPayload = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>payload</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The mime type to send the payload in - either application/xml+fhir, or application/json+fhir. If the mime type is blank, then there is no payload in the notification, just a notification
     * </p> 
	 */
	public Channel setPayload( String theString) {
		myPayload = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>header</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional headers / information to send as part of the notification
     * </p> 
	 */
	public StringDt getHeaderElement() {  
		if (myHeader == null) {
			myHeader = new StringDt();
		}
		return myHeader;
	}

	
	/**
	 * Gets the value(s) for <b>header</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional headers / information to send as part of the notification
     * </p> 
	 */
	public String getHeader() {  
		return getHeaderElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>header</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional headers / information to send as part of the notification
     * </p> 
	 */
	public Channel setHeader(StringDt theValue) {
		myHeader = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>header</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional headers / information to send as part of the notification
     * </p> 
	 */
	public Channel setHeader( String theString) {
		myHeader = new StringDt(theString); 
		return this; 
	}

 


	}




    @Override
    public String getResourceName() {
        return "Subscription";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
