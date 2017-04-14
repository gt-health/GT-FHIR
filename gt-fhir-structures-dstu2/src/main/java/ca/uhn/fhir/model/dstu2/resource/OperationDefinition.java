















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
 * HAPI/FHIR <b>OperationDefinition</b> Resource
 * (conformance.behavior)
 *
 * <p>
 * <b>Definition:</b>
 * A formal computable definition of an operation (on the RESTful interface) or a named query (using the search interaction).
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/OperationDefinition">http://hl7.org/fhir/profiles/OperationDefinition</a> 
 * </p>
 *
 */
@ResourceDef(name="OperationDefinition", profile="http://hl7.org/fhir/profiles/OperationDefinition", id="operationdefinition")
public class OperationDefinition extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>OperationDefinition.url</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="url", path="OperationDefinition.url", description="", type="uri"  )
	public static final String SP_URL = "url";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>OperationDefinition.url</b><br>
	 * </p>
	 */
	public static final UriClientParam URL = new UriClientParam(SP_URL);

	/**
	 * Search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.version</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="version", path="OperationDefinition.version", description="", type="token"  )
	public static final String SP_VERSION = "version";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.version</b><br>
	 * </p>
	 */
	public static final TokenClientParam VERSION = new TokenClientParam(SP_VERSION);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>OperationDefinition.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="OperationDefinition.name", description="", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>OperationDefinition.name</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>OperationDefinition.publisher</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="publisher", path="OperationDefinition.publisher", description="", type="string"  )
	public static final String SP_PUBLISHER = "publisher";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>OperationDefinition.publisher</b><br>
	 * </p>
	 */
	public static final StringClientParam PUBLISHER = new StringClientParam(SP_PUBLISHER);

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="OperationDefinition.code", description="", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="OperationDefinition.status", description="", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>OperationDefinition.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="OperationDefinition.date", description="", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>OperationDefinition.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>kind</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.kind</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="kind", path="OperationDefinition.kind", description="", type="token"  )
	public static final String SP_KIND = "kind";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>kind</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.kind</b><br>
	 * </p>
	 */
	public static final TokenClientParam KIND = new TokenClientParam(SP_KIND);

	/**
	 * Search parameter constant for <b>base</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>OperationDefinition.base</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="base", path="OperationDefinition.base", description="", type="reference"  )
	public static final String SP_BASE = "base";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>base</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>OperationDefinition.base</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam BASE = new ReferenceClientParam(SP_BASE);

	/**
	 * Search parameter constant for <b>system</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.system</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="system", path="OperationDefinition.system", description="", type="token"  )
	public static final String SP_SYSTEM = "system";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>system</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.system</b><br>
	 * </p>
	 */
	public static final TokenClientParam SYSTEM = new TokenClientParam(SP_SYSTEM);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="OperationDefinition.type", description="", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>instance</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.instance</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="instance", path="OperationDefinition.instance", description="", type="token"  )
	public static final String SP_INSTANCE = "instance";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>instance</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OperationDefinition.instance</b><br>
	 * </p>
	 */
	public static final TokenClientParam INSTANCE = new TokenClientParam(SP_INSTANCE);

	/**
	 * Search parameter constant for <b>profile</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>OperationDefinition.parameter.profile</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="profile", path="OperationDefinition.parameter.profile", description="", type="reference"  )
	public static final String SP_PROFILE = "profile";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>profile</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>OperationDefinition.parameter.profile</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PROFILE = new ReferenceClientParam(SP_PROFILE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>OperationDefinition:base</b>".
	 */
	public static final Include INCLUDE_BASE = new Include("OperationDefinition:base");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>OperationDefinition:profile</b>".
	 */
	public static final Include INCLUDE_PROFILE = new Include("OperationDefinition:profile");


	@Child(name="url", type=UriDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="An absolute URL that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published"
	)
	private UriDt myUrl;
	
	@Child(name="version", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="id.version",
		formalDefinition="The identifier that is used to identify this version of the profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp"
	)
	private StringDt myVersion;
	
	@Child(name="name", type=StringDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A free text natural language name identifying the operation"
	)
	private StringDt myName;
	
	@Child(name="status", type=CodeDt.class, order=3, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="status",
		formalDefinition="The status of the profile"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/conformance-resource-status")
	private BoundCodeDt<ConformanceResourceStatusEnum> myStatus;
	
	@Child(name="kind", type=CodeDt.class, order=4, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="Whether this is an operation or a named query"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/operation-kind")
	private BoundCodeDt<OperationKindEnum> myKind;
	
	@Child(name="experimental", type=BooleanDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This profile was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage"
	)
	private BooleanDt myExperimental;
	
	@Child(name="publisher", type=StringDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="who.witness",
		formalDefinition="The name of the individual or organization that published the operation definition"
	)
	private StringDt myPublisher;
	
	@Child(name="contact", order=7, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contacts to assist a user in finding and communicating with the publisher"
	)
	private java.util.List<Contact> myContact;
	
	@Child(name="date", type=DateTimeDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes"
	)
	private DateTimeDt myDate;
	
	@Child(name="description", type=StringDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A free text natural language description of the profile and its use"
	)
	private StringDt myDescription;
	
	@Child(name="requirements", type=StringDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Explains why this operation definition is needed and why it's been constrained as it has"
	)
	private StringDt myRequirements;
	
	@Child(name="idempotent", type=BooleanDt.class, order=11, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST"
	)
	private BooleanDt myIdempotent;
	
	@Child(name="code", type=CodeDt.class, order=12, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name used to invoke the operation"
	)
	private CodeDt myCode;
	
	@Child(name="notes", type=StringDt.class, order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional information about how to use this operation or named query"
	)
	private StringDt myNotes;
	
	@Child(name="base", order=14, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.OperationDefinition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates that this operation definition is a constraining profile on the base"
	)
	private ResourceReferenceDt myBase;
	
	@Child(name="system", type=BooleanDt.class, order=15, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context)"
	)
	private BooleanDt mySystem;
	
	@Child(name="type", type=CodeDt.class, order=16, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context)"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
	private java.util.List<BoundCodeDt<ResourceTypeEnum>> myType;
	
	@Child(name="instance", type=BooleanDt.class, order=17, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether this operation can be invoked on a particular instance of one of the given types"
	)
	private BooleanDt myInstance;
	
	@Child(name="parameter", order=18, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The parameters for the operation/query"
	)
	private java.util.List<Parameter> myParameter;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myUrl,  myVersion,  myName,  myStatus,  myKind,  myExperimental,  myPublisher,  myContact,  myDate,  myDescription,  myRequirements,  myIdempotent,  myCode,  myNotes,  myBase,  mySystem,  myType,  myInstance,  myParameter);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myUrl, myVersion, myName, myStatus, myKind, myExperimental, myPublisher, myContact, myDate, myDescription, myRequirements, myIdempotent, myCode, myNotes, myBase, mySystem, myType, myInstance, myParameter);
	}

	/**
	 * Gets the value(s) for <b>url</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published
     * </p> 
	 */
	public UriDt getUrlElement() {  
		if (myUrl == null) {
			myUrl = new UriDt();
		}
		return myUrl;
	}

	
	/**
	 * Gets the value(s) for <b>url</b> (id).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published
     * </p> 
	 */
	public String getUrl() {  
		return getUrlElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>url</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published
     * </p> 
	 */
	public OperationDefinition setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this operation definition when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this operation definition is (or will be) published
     * </p> 
	 */
	public OperationDefinition setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>version</b> (id.version).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public StringDt getVersionElement() {  
		if (myVersion == null) {
			myVersion = new StringDt();
		}
		return myVersion;
	}

	
	/**
	 * Gets the value(s) for <b>version</b> (id.version).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public String getVersion() {  
		return getVersionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>version</b> (id.version)
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public OperationDefinition setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>version</b> (id.version)
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the profile when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public OperationDefinition setVersion( String theString) {
		myVersion = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language name identifying the operation
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
     * A free text natural language name identifying the operation
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
     * A free text natural language name identifying the operation
     * </p> 
	 */
	public OperationDefinition setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language name identifying the operation
     * </p> 
	 */
	public OperationDefinition setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the profile
     * </p> 
	 */
	public BoundCodeDt<ConformanceResourceStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<ConformanceResourceStatusEnum>(ConformanceResourceStatusEnum.VALUESET_BINDER);
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
     * The status of the profile
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
     * The status of the profile
     * </p> 
	 */
	public OperationDefinition setStatus(BoundCodeDt<ConformanceResourceStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the profile
     * </p> 
	 */
	public OperationDefinition setStatus(ConformanceResourceStatusEnum theValue) {
		setStatus(new BoundCodeDt<ConformanceResourceStatusEnum>(ConformanceResourceStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>kind</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is an operation or a named query
     * </p> 
	 */
	public BoundCodeDt<OperationKindEnum> getKindElement() {  
		if (myKind == null) {
			myKind = new BoundCodeDt<OperationKindEnum>(OperationKindEnum.VALUESET_BINDER);
		}
		return myKind;
	}

	
	/**
	 * Gets the value(s) for <b>kind</b> (class).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is an operation or a named query
     * </p> 
	 */
	public String getKind() {  
		return getKindElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>kind</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is an operation or a named query
     * </p> 
	 */
	public OperationDefinition setKind(BoundCodeDt<OperationKindEnum> theValue) {
		myKind = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>kind</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is an operation or a named query
     * </p> 
	 */
	public OperationDefinition setKind(OperationKindEnum theValue) {
		setKind(new BoundCodeDt<OperationKindEnum>(OperationKindEnum.VALUESET_BINDER, theValue));
		
/*
		getKindElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>experimental</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This profile was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public BooleanDt getExperimentalElement() {  
		if (myExperimental == null) {
			myExperimental = new BooleanDt();
		}
		return myExperimental;
	}

	
	/**
	 * Gets the value(s) for <b>experimental</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This profile was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public Boolean getExperimental() {  
		return getExperimentalElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>experimental</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This profile was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public OperationDefinition setExperimental(BooleanDt theValue) {
		myExperimental = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>experimental</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This profile was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public OperationDefinition setExperimental( boolean theBoolean) {
		myExperimental = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>publisher</b> (who.witness).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the operation definition
     * </p> 
	 */
	public StringDt getPublisherElement() {  
		if (myPublisher == null) {
			myPublisher = new StringDt();
		}
		return myPublisher;
	}

	
	/**
	 * Gets the value(s) for <b>publisher</b> (who.witness).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the operation definition
     * </p> 
	 */
	public String getPublisher() {  
		return getPublisherElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>publisher</b> (who.witness)
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the operation definition
     * </p> 
	 */
	public OperationDefinition setPublisher(StringDt theValue) {
		myPublisher = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>publisher</b> (who.witness)
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the operation definition
     * </p> 
	 */
	public OperationDefinition setPublisher( String theString) {
		myPublisher = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>contact</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public java.util.List<Contact> getContact() {  
		if (myContact == null) {
			myContact = new java.util.ArrayList<Contact>();
		}
		return myContact;
	}

	/**
	 * Sets the value(s) for <b>contact</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public OperationDefinition setContact(java.util.List<Contact> theValue) {
		myContact = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>contact</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public Contact addContact() {
		Contact newType = new Contact();
		getContact().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>contact</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Contacts to assist a user in finding and communicating with the publisher
	 * </p>
	 * @param theValue The contact to add (must not be <code>null</code>)
	 */
	public OperationDefinition addContact(Contact theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getContact().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>contact</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public Contact getContactFirstRep() {
		if (getContact().isEmpty()) {
			return addContact();
		}
		return getContact().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>date</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes
     * </p> 
	 */
	public DateTimeDt getDateElement() {  
		if (myDate == null) {
			myDate = new DateTimeDt();
		}
		return myDate;
	}

	
	/**
	 * Gets the value(s) for <b>date</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes
     * </p> 
	 */
	public Date getDate() {  
		return getDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes
     * </p> 
	 */
	public OperationDefinition setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes
     * </p> 
	 */
	public OperationDefinition setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the operation definition was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the Operation Definition changes
     * </p> 
	 */
	public OperationDefinition setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the profile and its use
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
     * A free text natural language description of the profile and its use
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
     * A free text natural language description of the profile and its use
     * </p> 
	 */
	public OperationDefinition setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the profile and its use
     * </p> 
	 */
	public OperationDefinition setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>requirements</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Explains why this operation definition is needed and why it's been constrained as it has
     * </p> 
	 */
	public StringDt getRequirementsElement() {  
		if (myRequirements == null) {
			myRequirements = new StringDt();
		}
		return myRequirements;
	}

	
	/**
	 * Gets the value(s) for <b>requirements</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Explains why this operation definition is needed and why it's been constrained as it has
     * </p> 
	 */
	public String getRequirements() {  
		return getRequirementsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>requirements</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Explains why this operation definition is needed and why it's been constrained as it has
     * </p> 
	 */
	public OperationDefinition setRequirements(StringDt theValue) {
		myRequirements = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>requirements</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Explains why this operation definition is needed and why it's been constrained as it has
     * </p> 
	 */
	public OperationDefinition setRequirements( String theString) {
		myRequirements = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>idempotent</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST
     * </p> 
	 */
	public BooleanDt getIdempotentElement() {  
		if (myIdempotent == null) {
			myIdempotent = new BooleanDt();
		}
		return myIdempotent;
	}

	
	/**
	 * Gets the value(s) for <b>idempotent</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST
     * </p> 
	 */
	public Boolean getIdempotent() {  
		return getIdempotentElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>idempotent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST
     * </p> 
	 */
	public OperationDefinition setIdempotent(BooleanDt theValue) {
		myIdempotent = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>idempotent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Operations that are idempotent (see [HTTP specification definition of idempotent](http://www.w3.org/Protocols/rfc2616/rfc2616-sec9.html)) may be invoked by performing an HTTP GET operation instead of a POST
     * </p> 
	 */
	public OperationDefinition setIdempotent( boolean theBoolean) {
		myIdempotent = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name used to invoke the operation
     * </p> 
	 */
	public CodeDt getCodeElement() {  
		if (myCode == null) {
			myCode = new CodeDt();
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
     * The name used to invoke the operation
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
     * The name used to invoke the operation
     * </p> 
	 */
	public OperationDefinition setCode(CodeDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name used to invoke the operation
     * </p> 
	 */
	public OperationDefinition setCode( String theCode) {
		myCode = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>notes</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about how to use this operation or named query
     * </p> 
	 */
	public StringDt getNotesElement() {  
		if (myNotes == null) {
			myNotes = new StringDt();
		}
		return myNotes;
	}

	
	/**
	 * Gets the value(s) for <b>notes</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about how to use this operation or named query
     * </p> 
	 */
	public String getNotes() {  
		return getNotesElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>notes</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about how to use this operation or named query
     * </p> 
	 */
	public OperationDefinition setNotes(StringDt theValue) {
		myNotes = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>notes</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about how to use this operation or named query
     * </p> 
	 */
	public OperationDefinition setNotes( String theString) {
		myNotes = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>base</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates that this operation definition is a constraining profile on the base
     * </p> 
	 */
	public ResourceReferenceDt getBase() {  
		if (myBase == null) {
			myBase = new ResourceReferenceDt();
		}
		return myBase;
	}

	/**
	 * Sets the value(s) for <b>base</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates that this operation definition is a constraining profile on the base
     * </p> 
	 */
	public OperationDefinition setBase(ResourceReferenceDt theValue) {
		myBase = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>system</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context)
     * </p> 
	 */
	public BooleanDt getSystemElement() {  
		if (mySystem == null) {
			mySystem = new BooleanDt();
		}
		return mySystem;
	}

	
	/**
	 * Gets the value(s) for <b>system</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context)
     * </p> 
	 */
	public Boolean getSystem() {  
		return getSystemElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>system</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context)
     * </p> 
	 */
	public OperationDefinition setSystem(BooleanDt theValue) {
		mySystem = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>system</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation or named query can be invoked at the system level (e.g. without needing to choose a resource type for the context)
     * </p> 
	 */
	public OperationDefinition setSystem( boolean theBoolean) {
		mySystem = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context)
     * </p> 
	 */
	public java.util.List<BoundCodeDt<ResourceTypeEnum>> getType() {  
		if (myType == null) {
			myType = new java.util.ArrayList<BoundCodeDt<ResourceTypeEnum>>();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context)
     * </p> 
	 */
	public OperationDefinition setType(java.util.List<BoundCodeDt<ResourceTypeEnum>> theValue) {
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
     * Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context)
     * </p> 
	 */
	public BoundCodeDt<ResourceTypeEnum> addType(ResourceTypeEnum theValue) {
		BoundCodeDt<ResourceTypeEnum> retVal = new BoundCodeDt<ResourceTypeEnum>(ResourceTypeEnum.VALUESET_BINDER, theValue);
		getType().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>type</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context)
     * </p> 
	 */
	public BoundCodeDt<ResourceTypeEnum> getTypeFirstRep() {
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
     * Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context)
     * </p> 
	 */
	public BoundCodeDt<ResourceTypeEnum> addType() {
		BoundCodeDt<ResourceTypeEnum> retVal = new BoundCodeDt<ResourceTypeEnum>(ResourceTypeEnum.VALUESET_BINDER);
		getType().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation or named query can be invoked at the resource type level for any given resource type level (e.g. without needing to choose a resource type for the context)
     * </p> 
	 */
	public OperationDefinition setType(ResourceTypeEnum theValue) {
		getType().clear();
		addType(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>instance</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation can be invoked on a particular instance of one of the given types
     * </p> 
	 */
	public BooleanDt getInstanceElement() {  
		if (myInstance == null) {
			myInstance = new BooleanDt();
		}
		return myInstance;
	}

	
	/**
	 * Gets the value(s) for <b>instance</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation can be invoked on a particular instance of one of the given types
     * </p> 
	 */
	public Boolean getInstance() {  
		return getInstanceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>instance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation can be invoked on a particular instance of one of the given types
     * </p> 
	 */
	public OperationDefinition setInstance(BooleanDt theValue) {
		myInstance = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>instance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this operation can be invoked on a particular instance of one of the given types
     * </p> 
	 */
	public OperationDefinition setInstance( boolean theBoolean) {
		myInstance = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>parameter</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The parameters for the operation/query
     * </p> 
	 */
	public java.util.List<Parameter> getParameter() {  
		if (myParameter == null) {
			myParameter = new java.util.ArrayList<Parameter>();
		}
		return myParameter;
	}

	/**
	 * Sets the value(s) for <b>parameter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The parameters for the operation/query
     * </p> 
	 */
	public OperationDefinition setParameter(java.util.List<Parameter> theValue) {
		myParameter = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>parameter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The parameters for the operation/query
     * </p> 
	 */
	public Parameter addParameter() {
		Parameter newType = new Parameter();
		getParameter().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>parameter</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The parameters for the operation/query
	 * </p>
	 * @param theValue The parameter to add (must not be <code>null</code>)
	 */
	public OperationDefinition addParameter(Parameter theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getParameter().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>parameter</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The parameters for the operation/query
     * </p> 
	 */
	public Parameter getParameterFirstRep() {
		if (getParameter().isEmpty()) {
			return addParameter();
		}
		return getParameter().get(0); 
	}
  
	/**
	 * Block class for child element: <b>OperationDefinition.contact</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	@Block()	
	public static class Contact 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=StringDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of an individual to contact regarding the operation definition"
	)
	private StringDt myName;
	
	@Child(name="telecom", type=ContactPointDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contact details for individual (if a name was provided) or the publisher"
	)
	private java.util.List<ContactPointDt> myTelecom;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  myTelecom);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, myTelecom);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of an individual to contact regarding the operation definition
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
     * The name of an individual to contact regarding the operation definition
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
     * The name of an individual to contact regarding the operation definition
     * </p> 
	 */
	public Contact setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of an individual to contact regarding the operation definition
     * </p> 
	 */
	public Contact setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>telecom</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contact details for individual (if a name was provided) or the publisher
     * </p> 
	 */
	public java.util.List<ContactPointDt> getTelecom() {  
		if (myTelecom == null) {
			myTelecom = new java.util.ArrayList<ContactPointDt>();
		}
		return myTelecom;
	}

	/**
	 * Sets the value(s) for <b>telecom</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contact details for individual (if a name was provided) or the publisher
     * </p> 
	 */
	public Contact setTelecom(java.util.List<ContactPointDt> theValue) {
		myTelecom = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>telecom</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contact details for individual (if a name was provided) or the publisher
     * </p> 
	 */
	public ContactPointDt addTelecom() {
		ContactPointDt newType = new ContactPointDt();
		getTelecom().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>telecom</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Contact details for individual (if a name was provided) or the publisher
	 * </p>
	 * @param theValue The telecom to add (must not be <code>null</code>)
	 */
	public Contact addTelecom(ContactPointDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getTelecom().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>telecom</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Contact details for individual (if a name was provided) or the publisher
     * </p> 
	 */
	public ContactPointDt getTelecomFirstRep() {
		if (getTelecom().isEmpty()) {
			return addTelecom();
		}
		return getTelecom().get(0); 
	}
  


	}


	/**
	 * Block class for child element: <b>OperationDefinition.parameter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The parameters for the operation/query
     * </p> 
	 */
	@Block()	
	public static class Parameter 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of used to identify the parameter"
	)
	private CodeDt myName;
	
	@Child(name="use", type=CodeDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Whether this is an input or an output parameter"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/operation-parameter-use")
	private BoundCodeDt<OperationParameterUseEnum> myUse;
	
	@Child(name="min", type=IntegerDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The minimum number of times this parameter SHALL appear in the request or response"
	)
	private IntegerDt myMin;
	
	@Child(name="max", type=StringDt.class, order=3, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The maximum number of times this element is permitted to appear in the request or response"
	)
	private StringDt myMax;
	
	@Child(name="documentation", type=StringDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the meaning or use of this parameter"
	)
	private StringDt myDocumentation;
	
	@Child(name="type", type=CodeDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type for this parameter"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-operation-parameter-type")
	private CodeDt myType;
	
	@Child(name="profile", order=6, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.StructureDefinition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A profile the specifies the rules that this parameter must conform to"
	)
	private ResourceReferenceDt myProfile;
	
	@Child(name="binding", order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Binds to a value set if this parameter is coded (code, Coding, CodeableConcept)"
	)
	private ParameterBinding myBinding;
	
	@Child(name="part", type=Parameter.class, order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The parts of a Tuple Parameter"
	)
	private java.util.List<Parameter> myPart;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  myUse,  myMin,  myMax,  myDocumentation,  myType,  myProfile,  myBinding,  myPart);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, myUse, myMin, myMax, myDocumentation, myType, myProfile, myBinding, myPart);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of used to identify the parameter
     * </p> 
	 */
	public CodeDt getNameElement() {  
		if (myName == null) {
			myName = new CodeDt();
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
     * The name of used to identify the parameter
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
     * The name of used to identify the parameter
     * </p> 
	 */
	public Parameter setName(CodeDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of used to identify the parameter
     * </p> 
	 */
	public Parameter setName( String theCode) {
		myName = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>use</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is an input or an output parameter
     * </p> 
	 */
	public BoundCodeDt<OperationParameterUseEnum> getUseElement() {  
		if (myUse == null) {
			myUse = new BoundCodeDt<OperationParameterUseEnum>(OperationParameterUseEnum.VALUESET_BINDER);
		}
		return myUse;
	}

	
	/**
	 * Gets the value(s) for <b>use</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is an input or an output parameter
     * </p> 
	 */
	public String getUse() {  
		return getUseElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>use</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is an input or an output parameter
     * </p> 
	 */
	public Parameter setUse(BoundCodeDt<OperationParameterUseEnum> theValue) {
		myUse = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>use</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is an input or an output parameter
     * </p> 
	 */
	public Parameter setUse(OperationParameterUseEnum theValue) {
		setUse(new BoundCodeDt<OperationParameterUseEnum>(OperationParameterUseEnum.VALUESET_BINDER, theValue));
		
/*
		getUseElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>min</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The minimum number of times this parameter SHALL appear in the request or response
     * </p> 
	 */
	public IntegerDt getMinElement() {  
		if (myMin == null) {
			myMin = new IntegerDt();
		}
		return myMin;
	}

	
	/**
	 * Gets the value(s) for <b>min</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The minimum number of times this parameter SHALL appear in the request or response
     * </p> 
	 */
	public Integer getMin() {  
		return getMinElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>min</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The minimum number of times this parameter SHALL appear in the request or response
     * </p> 
	 */
	public Parameter setMin(IntegerDt theValue) {
		myMin = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>min</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The minimum number of times this parameter SHALL appear in the request or response
     * </p> 
	 */
	public Parameter setMin( int theInteger) {
		myMin = new IntegerDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>max</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The maximum number of times this element is permitted to appear in the request or response
     * </p> 
	 */
	public StringDt getMaxElement() {  
		if (myMax == null) {
			myMax = new StringDt();
		}
		return myMax;
	}

	
	/**
	 * Gets the value(s) for <b>max</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The maximum number of times this element is permitted to appear in the request or response
     * </p> 
	 */
	public String getMax() {  
		return getMaxElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>max</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The maximum number of times this element is permitted to appear in the request or response
     * </p> 
	 */
	public Parameter setMax(StringDt theValue) {
		myMax = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>max</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The maximum number of times this element is permitted to appear in the request or response
     * </p> 
	 */
	public Parameter setMax( String theString) {
		myMax = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>documentation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the meaning or use of this parameter
     * </p> 
	 */
	public StringDt getDocumentationElement() {  
		if (myDocumentation == null) {
			myDocumentation = new StringDt();
		}
		return myDocumentation;
	}

	
	/**
	 * Gets the value(s) for <b>documentation</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the meaning or use of this parameter
     * </p> 
	 */
	public String getDocumentation() {  
		return getDocumentationElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>documentation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the meaning or use of this parameter
     * </p> 
	 */
	public Parameter setDocumentation(StringDt theValue) {
		myDocumentation = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>documentation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the meaning or use of this parameter
     * </p> 
	 */
	public Parameter setDocumentation( String theString) {
		myDocumentation = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type for this parameter
     * </p> 
	 */
	public CodeDt getTypeElement() {  
		if (myType == null) {
			myType = new CodeDt();
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
     * The type for this parameter
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
     * The type for this parameter
     * </p> 
	 */
	public Parameter setType(CodeDt theValue) {
		myType = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type for this parameter
     * </p> 
	 */
	public Parameter setType( String theCode) {
		myType = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>profile</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A profile the specifies the rules that this parameter must conform to
     * </p> 
	 */
	public ResourceReferenceDt getProfile() {  
		if (myProfile == null) {
			myProfile = new ResourceReferenceDt();
		}
		return myProfile;
	}

	/**
	 * Sets the value(s) for <b>profile</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A profile the specifies the rules that this parameter must conform to
     * </p> 
	 */
	public Parameter setProfile(ResourceReferenceDt theValue) {
		myProfile = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>binding</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Binds to a value set if this parameter is coded (code, Coding, CodeableConcept)
     * </p> 
	 */
	public ParameterBinding getBinding() {  
		if (myBinding == null) {
			myBinding = new ParameterBinding();
		}
		return myBinding;
	}

	/**
	 * Sets the value(s) for <b>binding</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Binds to a value set if this parameter is coded (code, Coding, CodeableConcept)
     * </p> 
	 */
	public Parameter setBinding(ParameterBinding theValue) {
		myBinding = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>part</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The parts of a Tuple Parameter
     * </p> 
	 */
	public java.util.List<Parameter> getPart() {  
		if (myPart == null) {
			myPart = new java.util.ArrayList<Parameter>();
		}
		return myPart;
	}

	/**
	 * Sets the value(s) for <b>part</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The parts of a Tuple Parameter
     * </p> 
	 */
	public Parameter setPart(java.util.List<Parameter> theValue) {
		myPart = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>part</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The parts of a Tuple Parameter
     * </p> 
	 */
	public Parameter addPart() {
		Parameter newType = new Parameter();
		getPart().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>part</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The parts of a Tuple Parameter
	 * </p>
	 * @param theValue The part to add (must not be <code>null</code>)
	 */
	public Parameter addPart(Parameter theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPart().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>part</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The parts of a Tuple Parameter
     * </p> 
	 */
	public Parameter getPartFirstRep() {
		if (getPart().isEmpty()) {
			return addPart();
		}
		return getPart().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>OperationDefinition.parameter.binding</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Binds to a value set if this parameter is coded (code, Coding, CodeableConcept)
     * </p> 
	 */
	@Block()	
	public static class ParameterBinding 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="strength", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/binding-strength")
	private BoundCodeDt<BindingStrengthEnum> myStrength;
	
	@Child(name="valueSet", order=1, min=1, max=1, summary=false, modifier=false, type={
		UriDt.class, 		ValueSet.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used"
	)
	private IDatatype myValueSet;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myStrength,  myValueSet);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myStrength, myValueSet);
	}

	/**
	 * Gets the value(s) for <b>strength</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances
     * </p> 
	 */
	public BoundCodeDt<BindingStrengthEnum> getStrengthElement() {  
		if (myStrength == null) {
			myStrength = new BoundCodeDt<BindingStrengthEnum>(BindingStrengthEnum.VALUESET_BINDER);
		}
		return myStrength;
	}

	
	/**
	 * Gets the value(s) for <b>strength</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances
     * </p> 
	 */
	public String getStrength() {  
		return getStrengthElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>strength</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances
     * </p> 
	 */
	public ParameterBinding setStrength(BoundCodeDt<BindingStrengthEnum> theValue) {
		myStrength = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>strength</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the degree of conformance expectations associated with this binding - that is, the degree to which the provided value set must be adhered to in the instances
     * </p> 
	 */
	public ParameterBinding setStrength(BindingStrengthEnum theValue) {
		setStrength(new BoundCodeDt<BindingStrengthEnum>(BindingStrengthEnum.VALUESET_BINDER, theValue));
		
/*
		getStrengthElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>valueSet[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used
     * </p> 
	 */
	public IDatatype getValueSet() {  
		return myValueSet;
	}

	/**
	 * Sets the value(s) for <b>valueSet[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Points to the value set or external definition (e.g. implicit value set) that identifies the set of codes to be used
     * </p> 
	 */
	public ParameterBinding setValueSet(IDatatype theValue) {
		myValueSet = theValue;
		return this;
	}
	
	

  


	}





    @Override
    public String getResourceName() {
        return "OperationDefinition";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
