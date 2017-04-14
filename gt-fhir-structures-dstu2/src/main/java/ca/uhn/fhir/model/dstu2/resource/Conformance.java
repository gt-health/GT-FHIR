















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
 * HAPI/FHIR <b>Conformance</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * A conformance statement is a set of capabilities of a FHIR Server that may be used as a statement of actual server functionality or a statement of required or desired server implementation.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Conformance">http://hl7.org/fhir/profiles/Conformance</a> 
 * </p>
 *
 */
@ResourceDef(name="Conformance", profile="http://hl7.org/fhir/profiles/Conformance", id="conformance")
public class Conformance extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  ca.uhn.fhir.model.base.resource.BaseConformance     {

	/**
	 * Search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b>The uri that identifies the conformance statement</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>Conformance.url</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="url", path="Conformance.url", description="The uri that identifies the conformance statement", type="uri"  )
	public static final String SP_URL = "url";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b>The uri that identifies the conformance statement</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>Conformance.url</b><br>
	 * </p>
	 */
	public static final UriClientParam URL = new UriClientParam(SP_URL);

	/**
	 * Search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b>The version identifier of the conformance statement</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.version</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="version", path="Conformance.version", description="The version identifier of the conformance statement", type="token"  )
	public static final String SP_VERSION = "version";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b>The version identifier of the conformance statement</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.version</b><br>
	 * </p>
	 */
	public static final TokenClientParam VERSION = new TokenClientParam(SP_VERSION);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>Name of the conformance statement</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Conformance.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="Conformance.name", description="Name of the conformance statement", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>Name of the conformance statement</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Conformance.name</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b>Name of the publisher of the conformance statement</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Conformance.publisher</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="publisher", path="Conformance.publisher", description="Name of the publisher of the conformance statement", type="string"  )
	public static final String SP_PUBLISHER = "publisher";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b>Name of the publisher of the conformance statement</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Conformance.publisher</b><br>
	 * </p>
	 */
	public static final StringClientParam PUBLISHER = new StringClientParam(SP_PUBLISHER);

	/**
	 * Search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b>Text search in the description of the conformance statement</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Conformance.description</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="description", path="Conformance.description", description="Text search in the description of the conformance statement", type="string"  )
	public static final String SP_DESCRIPTION = "description";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b>Text search in the description of the conformance statement</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Conformance.description</b><br>
	 * </p>
	 */
	public static final StringClientParam DESCRIPTION = new StringClientParam(SP_DESCRIPTION);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The current status of the conformance statement</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="Conformance.status", description="The current status of the conformance statement", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The current status of the conformance statement</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The conformance statement publication date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Conformance.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="Conformance.date", description="The conformance statement publication date", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The conformance statement publication date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Conformance.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>software</b>
	 * <p>
	 * Description: <b>Part of a the name of a software application</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Conformance.software.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="software", path="Conformance.software.name", description="Part of a the name of a software application", type="string"  )
	public static final String SP_SOFTWARE = "software";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>software</b>
	 * <p>
	 * Description: <b>Part of a the name of a software application</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Conformance.software.name</b><br>
	 * </p>
	 */
	public static final StringClientParam SOFTWARE = new StringClientParam(SP_SOFTWARE);

	/**
	 * Search parameter constant for <b>fhirversion</b>
	 * <p>
	 * Description: <b>The version of FHIR</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.version</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="fhirversion", path="Conformance.version", description="The version of FHIR", type="token"  )
	public static final String SP_FHIRVERSION = "fhirversion";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>fhirversion</b>
	 * <p>
	 * Description: <b>The version of FHIR</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.version</b><br>
	 * </p>
	 */
	public static final TokenClientParam FHIRVERSION = new TokenClientParam(SP_FHIRVERSION);

	/**
	 * Search parameter constant for <b>resource</b>
	 * <p>
	 * Description: <b>Name of a resource mentioned in a conformance statement</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.rest.resource.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="resource", path="Conformance.rest.resource.type", description="Name of a resource mentioned in a conformance statement", type="token"  )
	public static final String SP_RESOURCE = "resource";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>resource</b>
	 * <p>
	 * Description: <b>Name of a resource mentioned in a conformance statement</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.rest.resource.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam RESOURCE = new TokenClientParam(SP_RESOURCE);

	/**
	 * Search parameter constant for <b>event</b>
	 * <p>
	 * Description: <b>Event code in a conformance statement</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.messaging.event.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="event", path="Conformance.messaging.event.code", description="Event code in a conformance statement", type="token"  )
	public static final String SP_EVENT = "event";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>event</b>
	 * <p>
	 * Description: <b>Event code in a conformance statement</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.messaging.event.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam EVENT = new TokenClientParam(SP_EVENT);

	/**
	 * Search parameter constant for <b>mode</b>
	 * <p>
	 * Description: <b>Mode - restful (server/client) or messaging (sender/receiver)</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.rest.mode</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="mode", path="Conformance.rest.mode", description="Mode - restful (server/client) or messaging (sender/receiver)", type="token"  )
	public static final String SP_MODE = "mode";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>mode</b>
	 * <p>
	 * Description: <b>Mode - restful (server/client) or messaging (sender/receiver)</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.rest.mode</b><br>
	 * </p>
	 */
	public static final TokenClientParam MODE = new TokenClientParam(SP_MODE);

	/**
	 * Search parameter constant for <b>profile</b>
	 * <p>
	 * Description: <b>A profile id invoked in a conformance statement</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Conformance.rest.resource.profile</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="profile", path="Conformance.rest.resource.profile", description="A profile id invoked in a conformance statement", type="reference"  )
	public static final String SP_PROFILE = "profile";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>profile</b>
	 * <p>
	 * Description: <b>A profile id invoked in a conformance statement</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Conformance.rest.resource.profile</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PROFILE = new ReferenceClientParam(SP_PROFILE);

	/**
	 * Search parameter constant for <b>format</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.format</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="format", path="Conformance.format", description="", type="token"  )
	public static final String SP_FORMAT = "format";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>format</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.format</b><br>
	 * </p>
	 */
	public static final TokenClientParam FORMAT = new TokenClientParam(SP_FORMAT);

	/**
	 * Search parameter constant for <b>security</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.rest.security.service</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="security", path="Conformance.rest.security.service", description="", type="token"  )
	public static final String SP_SECURITY = "security";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>security</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Conformance.rest.security.service</b><br>
	 * </p>
	 */
	public static final TokenClientParam SECURITY = new TokenClientParam(SP_SECURITY);

	/**
	 * Search parameter constant for <b>supported-profile</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Conformance.profile</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="supported-profile", path="Conformance.profile", description="", type="reference"  )
	public static final String SP_SUPPORTED_PROFILE = "supported-profile";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>supported-profile</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Conformance.profile</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUPPORTED_PROFILE = new ReferenceClientParam(SP_SUPPORTED_PROFILE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Conformance:profile</b>".
	 */
	public static final Include INCLUDE_PROFILE = new Include("Conformance:profile");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Conformance:supported-profile</b>".
	 */
	public static final Include INCLUDE_SUPPORTED_PROFILE = new Include("Conformance:supported-profile");


	@Child(name="url", type=UriDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published"
	)
	private UriDt myUrl;
	
	@Child(name="version", type=StringDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp"
	)
	private StringDt myVersion;
	
	@Child(name="name", type=StringDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A free text natural language name identifying the conformance statement"
	)
	private StringDt myName;
	
	@Child(name="status", type=CodeDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The status of this conformance statement"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/conformance-resource-status")
	private BoundCodeDt<ConformanceResourceStatusEnum> myStatus;
	
	@Child(name="experimental", type=BooleanDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage"
	)
	private BooleanDt myExperimental;
	
	@Child(name="publisher", type=StringDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of the individual or organization that published the conformance"
	)
	private StringDt myPublisher;
	
	@Child(name="contact", order=6, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contacts to assist a user in finding and communicating with the publisher"
	)
	private java.util.List<Contact> myContact;
	
	@Child(name="date", type=DateTimeDt.class, order=7, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes"
	)
	private DateTimeDt myDate;
	
	@Child(name="description", type=StringDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP"
	)
	private StringDt myDescription;
	
	@Child(name="requirements", type=StringDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Explains why this conformance statement is needed and why it's been constrained as it has"
	)
	private StringDt myRequirements;
	
	@Child(name="copyright", type=StringDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement"
	)
	private StringDt myCopyright;
	
	@Child(name="kind", type=CodeDt.class, order=11, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase)"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/conformance-statement-kind")
	private BoundCodeDt<ConformanceStatementKindEnum> myKind;
	
	@Child(name="software", order=12, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation."
	)
	private Software mySoftware;
	
	@Child(name="implementation", order=13, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program"
	)
	private Implementation myImplementation;
	
	@Child(name="fhirVersion", type=IdDt.class, order=14, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The version of the FHIR specification on which this conformance statement is based"
	)
	private IdDt myFhirVersion;
	
	@Child(name="acceptUnknown", type=CodeDt.class, order=15, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code that indicates whether the application accepts unknown elements or extensions when reading resources"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/unknown-content-code")
	private BoundCodeDt<UnknownContentCodeEnum> myAcceptUnknown;
	
	@Child(name="format", type=CodeDt.class, order=16, min=1, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of the formats supported by this implementation using their content types"
	)
	private java.util.List<CodeDt> myFormat;
	
	@Child(name="profile", order=17, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.StructureDefinition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A list of profiles that represent different use cases supported by the system. For a server, \"supported by the system\" means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}"
	)
	private java.util.List<ResourceReferenceDt> myProfile;
	
	@Child(name="rest", order=18, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A definition of the restful capabilities of the solution, if any"
	)
	private java.util.List<Rest> myRest;
	
	@Child(name="messaging", order=19, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A description of the messaging capabilities of the solution"
	)
	private java.util.List<Messaging> myMessaging;
	
	@Child(name="document", order=20, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A document definition"
	)
	private java.util.List<Document> myDocument;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myUrl,  myVersion,  myName,  myStatus,  myExperimental,  myPublisher,  myContact,  myDate,  myDescription,  myRequirements,  myCopyright,  myKind,  mySoftware,  myImplementation,  myFhirVersion,  myAcceptUnknown,  myFormat,  myProfile,  myRest,  myMessaging,  myDocument);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myUrl, myVersion, myName, myStatus, myExperimental, myPublisher, myContact, myDate, myDescription, myRequirements, myCopyright, myKind, mySoftware, myImplementation, myFhirVersion, myAcceptUnknown, myFormat, myProfile, myRest, myMessaging, myDocument);
	}

	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published
     * </p> 
	 */
	public UriDt getUrlElement() {  
		if (myUrl == null) {
			myUrl = new UriDt();
		}
		return myUrl;
	}

	
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published
     * </p> 
	 */
	public String getUrl() {  
		return getUrlElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published
     * </p> 
	 */
	public Conformance setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this conformance statement when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this conformance statement is (or will be) published
     * </p> 
	 */
	public Conformance setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>version</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
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
     * The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
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
     * The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public Conformance setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>version</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the conformance statement when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public Conformance setVersion( String theString) {
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
     * A free text natural language name identifying the conformance statement
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
     * A free text natural language name identifying the conformance statement
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
     * A free text natural language name identifying the conformance statement
     * </p> 
	 */
	public Conformance setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language name identifying the conformance statement
     * </p> 
	 */
	public Conformance setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of this conformance statement
     * </p> 
	 */
	public BoundCodeDt<ConformanceResourceStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<ConformanceResourceStatusEnum>(ConformanceResourceStatusEnum.VALUESET_BINDER);
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
     * The status of this conformance statement
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
     * The status of this conformance statement
     * </p> 
	 */
	public Conformance setStatus(BoundCodeDt<ConformanceResourceStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The status of this conformance statement
     * </p> 
	 */
	public Conformance setStatus(ConformanceResourceStatusEnum theValue) {
		setStatus(new BoundCodeDt<ConformanceResourceStatusEnum>(ConformanceResourceStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
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
     * A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
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
     * A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
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
     * A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public Conformance setExperimental(BooleanDt theValue) {
		myExperimental = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>experimental</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A flag to indicate that this conformance statement is authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public Conformance setExperimental( boolean theBoolean) {
		myExperimental = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>publisher</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the conformance
     * </p> 
	 */
	public StringDt getPublisherElement() {  
		if (myPublisher == null) {
			myPublisher = new StringDt();
		}
		return myPublisher;
	}

	
	/**
	 * Gets the value(s) for <b>publisher</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the conformance
     * </p> 
	 */
	public String getPublisher() {  
		return getPublisherElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>publisher</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the conformance
     * </p> 
	 */
	public Conformance setPublisher(StringDt theValue) {
		myPublisher = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>publisher</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the conformance
     * </p> 
	 */
	public Conformance setPublisher( String theString) {
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
	public Conformance setContact(java.util.List<Contact> theValue) {
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
	public Conformance addContact(Contact theValue) {
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
	 * Gets the value(s) for <b>date</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes
     * </p> 
	 */
	public DateTimeDt getDateElement() {  
		if (myDate == null) {
			myDate = new DateTimeDt();
		}
		return myDate;
	}

	
	/**
	 * Gets the value(s) for <b>date</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes
     * </p> 
	 */
	public Date getDate() {  
		return getDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes
     * </p> 
	 */
	public Conformance setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes
     * </p> 
	 */
	public Conformance setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date  (and optionally time) when the conformance statement was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the conformance statement changes
     * </p> 
	 */
	public Conformance setDateWithSecondsPrecision( Date theDate) {
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
     * A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP
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
     * A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP
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
     * A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP
     * </p> 
	 */
	public Conformance setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the conformance statement and its use. Typically, this is used when the conformance statement describes a desired rather than an actual solution, for example as a formal expression of requirements as part of an RFP
     * </p> 
	 */
	public Conformance setDescription( String theString) {
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
     * Explains why this conformance statement is needed and why it's been constrained as it has
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
     * Explains why this conformance statement is needed and why it's been constrained as it has
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
     * Explains why this conformance statement is needed and why it's been constrained as it has
     * </p> 
	 */
	public Conformance setRequirements(StringDt theValue) {
		myRequirements = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>requirements</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Explains why this conformance statement is needed and why it's been constrained as it has
     * </p> 
	 */
	public Conformance setRequirements( String theString) {
		myRequirements = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>copyright</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement
     * </p> 
	 */
	public StringDt getCopyrightElement() {  
		if (myCopyright == null) {
			myCopyright = new StringDt();
		}
		return myCopyright;
	}

	
	/**
	 * Gets the value(s) for <b>copyright</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement
     * </p> 
	 */
	public String getCopyright() {  
		return getCopyrightElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>copyright</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement
     * </p> 
	 */
	public Conformance setCopyright(StringDt theValue) {
		myCopyright = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>copyright</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the conformance statement and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the system described by the conformance statement
     * </p> 
	 */
	public Conformance setCopyright( String theString) {
		myCopyright = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>kind</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase)
     * </p> 
	 */
	public BoundCodeDt<ConformanceStatementKindEnum> getKindElement() {  
		if (myKind == null) {
			myKind = new BoundCodeDt<ConformanceStatementKindEnum>(ConformanceStatementKindEnum.VALUESET_BINDER);
		}
		return myKind;
	}

	
	/**
	 * Gets the value(s) for <b>kind</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase)
     * </p> 
	 */
	public String getKind() {  
		return getKindElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>kind</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase)
     * </p> 
	 */
	public Conformance setKind(BoundCodeDt<ConformanceStatementKindEnum> theValue) {
		myKind = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>kind</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The way that this statement is intended to be used, to describe an actual running instance of software, a particular product (kind not instance of software) or a class of implementation (e.g. a desired purchase)
     * </p> 
	 */
	public Conformance setKind(ConformanceStatementKindEnum theValue) {
		setKind(new BoundCodeDt<ConformanceStatementKindEnum>(ConformanceStatementKindEnum.VALUESET_BINDER, theValue));
		
/*
		getKindElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>software</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.
     * </p> 
	 */
	public Software getSoftware() {  
		if (mySoftware == null) {
			mySoftware = new Software();
		}
		return mySoftware;
	}

	/**
	 * Sets the value(s) for <b>software</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.
     * </p> 
	 */
	public Conformance setSoftware(Software theValue) {
		mySoftware = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>implementation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program
     * </p> 
	 */
	public Implementation getImplementation() {  
		if (myImplementation == null) {
			myImplementation = new Implementation();
		}
		return myImplementation;
	}

	/**
	 * Sets the value(s) for <b>implementation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program
     * </p> 
	 */
	public Conformance setImplementation(Implementation theValue) {
		myImplementation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>fhirVersion</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the FHIR specification on which this conformance statement is based
     * </p> 
	 */
	public IdDt getFhirVersionElement() {  
		if (myFhirVersion == null) {
			myFhirVersion = new IdDt();
		}
		return myFhirVersion;
	}

	
	/**
	 * Gets the value(s) for <b>fhirVersion</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the FHIR specification on which this conformance statement is based
     * </p> 
	 */
	public String getFhirVersion() {  
		return getFhirVersionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>fhirVersion</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the FHIR specification on which this conformance statement is based
     * </p> 
	 */
	public Conformance setFhirVersion(IdDt theValue) {
		myFhirVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>fhirVersion</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the FHIR specification on which this conformance statement is based
     * </p> 
	 */
	public Conformance setFhirVersion( String theId) {
		myFhirVersion = new IdDt(theId); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>acceptUnknown</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates whether the application accepts unknown elements or extensions when reading resources
     * </p> 
	 */
	public BoundCodeDt<UnknownContentCodeEnum> getAcceptUnknownElement() {  
		if (myAcceptUnknown == null) {
			myAcceptUnknown = new BoundCodeDt<UnknownContentCodeEnum>(UnknownContentCodeEnum.VALUESET_BINDER);
		}
		return myAcceptUnknown;
	}

	
	/**
	 * Gets the value(s) for <b>acceptUnknown</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates whether the application accepts unknown elements or extensions when reading resources
     * </p> 
	 */
	public String getAcceptUnknown() {  
		return getAcceptUnknownElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>acceptUnknown</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates whether the application accepts unknown elements or extensions when reading resources
     * </p> 
	 */
	public Conformance setAcceptUnknown(BoundCodeDt<UnknownContentCodeEnum> theValue) {
		myAcceptUnknown = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>acceptUnknown</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates whether the application accepts unknown elements or extensions when reading resources
     * </p> 
	 */
	public Conformance setAcceptUnknown(UnknownContentCodeEnum theValue) {
		setAcceptUnknown(new BoundCodeDt<UnknownContentCodeEnum>(UnknownContentCodeEnum.VALUESET_BINDER, theValue));
		
/*
		getAcceptUnknownElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>format</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of the formats supported by this implementation using their content types
     * </p> 
	 */
	public java.util.List<CodeDt> getFormat() {  
		if (myFormat == null) {
			myFormat = new java.util.ArrayList<CodeDt>();
		}
		return myFormat;
	}

	/**
	 * Sets the value(s) for <b>format</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of the formats supported by this implementation using their content types
     * </p> 
	 */
	public Conformance setFormat(java.util.List<CodeDt> theValue) {
		myFormat = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>format</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of the formats supported by this implementation using their content types
     * </p> 
	 */
	public CodeDt addFormat() {
		CodeDt newType = new CodeDt();
		getFormat().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>format</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of the formats supported by this implementation using their content types
	 * </p>
	 * @param theValue The format to add (must not be <code>null</code>)
	 */
	public Conformance addFormat(CodeDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFormat().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>format</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of the formats supported by this implementation using their content types
     * </p> 
	 */
	public CodeDt getFormatFirstRep() {
		if (getFormat().isEmpty()) {
			return addFormat();
		}
		return getFormat().get(0); 
	}
 	/**
	 * Adds a new value for <b>format</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of the formats supported by this implementation using their content types
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Conformance addFormat( String theCode) {
		if (myFormat == null) {
			myFormat = new java.util.ArrayList<CodeDt>();
		}
		myFormat.add(new CodeDt(theCode));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>profile</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of profiles that represent different use cases supported by the system. For a server, \&quot;supported by the system\&quot; means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getProfile() {  
		if (myProfile == null) {
			myProfile = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myProfile;
	}

	/**
	 * Sets the value(s) for <b>profile</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of profiles that represent different use cases supported by the system. For a server, \&quot;supported by the system\&quot; means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}
     * </p> 
	 */
	public Conformance setProfile(java.util.List<ResourceReferenceDt> theValue) {
		myProfile = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>profile</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of profiles that represent different use cases supported by the system. For a server, \&quot;supported by the system\&quot; means the system hosts/produces a set of resources that are conformant to a particular profile, and allows clients that use its services to search using this profile and to find appropriate data. For a client, it means the system will search by this profile and process data according to the guidance implicit in the profile. See further discussion in [Using Profiles]{profiling.html#profile-uses}
     * </p> 
	 */
	public ResourceReferenceDt addProfile() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getProfile().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>rest</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A definition of the restful capabilities of the solution, if any
     * </p> 
	 */
	public java.util.List<Rest> getRest() {  
		if (myRest == null) {
			myRest = new java.util.ArrayList<Rest>();
		}
		return myRest;
	}

	/**
	 * Sets the value(s) for <b>rest</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A definition of the restful capabilities of the solution, if any
     * </p> 
	 */
	public Conformance setRest(java.util.List<Rest> theValue) {
		myRest = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>rest</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A definition of the restful capabilities of the solution, if any
     * </p> 
	 */
	public Rest addRest() {
		Rest newType = new Rest();
		getRest().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>rest</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A definition of the restful capabilities of the solution, if any
	 * </p>
	 * @param theValue The rest to add (must not be <code>null</code>)
	 */
	public Conformance addRest(Rest theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRest().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>rest</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A definition of the restful capabilities of the solution, if any
     * </p> 
	 */
	public Rest getRestFirstRep() {
		if (getRest().isEmpty()) {
			return addRest();
		}
		return getRest().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>messaging</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the messaging capabilities of the solution
     * </p> 
	 */
	public java.util.List<Messaging> getMessaging() {  
		if (myMessaging == null) {
			myMessaging = new java.util.ArrayList<Messaging>();
		}
		return myMessaging;
	}

	/**
	 * Sets the value(s) for <b>messaging</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the messaging capabilities of the solution
     * </p> 
	 */
	public Conformance setMessaging(java.util.List<Messaging> theValue) {
		myMessaging = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>messaging</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the messaging capabilities of the solution
     * </p> 
	 */
	public Messaging addMessaging() {
		Messaging newType = new Messaging();
		getMessaging().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>messaging</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A description of the messaging capabilities of the solution
	 * </p>
	 * @param theValue The messaging to add (must not be <code>null</code>)
	 */
	public Conformance addMessaging(Messaging theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getMessaging().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>messaging</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the messaging capabilities of the solution
     * </p> 
	 */
	public Messaging getMessagingFirstRep() {
		if (getMessaging().isEmpty()) {
			return addMessaging();
		}
		return getMessaging().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>document</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A document definition
     * </p> 
	 */
	public java.util.List<Document> getDocument() {  
		if (myDocument == null) {
			myDocument = new java.util.ArrayList<Document>();
		}
		return myDocument;
	}

	/**
	 * Sets the value(s) for <b>document</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A document definition
     * </p> 
	 */
	public Conformance setDocument(java.util.List<Document> theValue) {
		myDocument = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>document</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A document definition
     * </p> 
	 */
	public Document addDocument() {
		Document newType = new Document();
		getDocument().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>document</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A document definition
	 * </p>
	 * @param theValue The document to add (must not be <code>null</code>)
	 */
	public Conformance addDocument(Document theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDocument().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>document</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A document definition
     * </p> 
	 */
	public Document getDocumentFirstRep() {
		if (getDocument().isEmpty()) {
			return addDocument();
		}
		return getDocument().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Conformance.contact</b> ()
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
		formalDefinition="The name of an individual to contact regarding the conformance"
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
     * The name of an individual to contact regarding the conformance
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
     * The name of an individual to contact regarding the conformance
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
     * The name of an individual to contact regarding the conformance
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
     * The name of an individual to contact regarding the conformance
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
	 * Block class for child element: <b>Conformance.software</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Software that is covered by this conformance statement.  It is used when the conformance statement describes the capabilities of a particular software version, independent of an installation.
     * </p> 
	 */
	@Block()	
	public static class Software 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=StringDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Name software is known by"
	)
	private StringDt myName;
	
	@Child(name="version", type=StringDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The version identifier for the software covered by this statement"
	)
	private StringDt myVersion;
	
	@Child(name="releaseDate", type=DateTimeDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Date this version of the software released"
	)
	private DateTimeDt myReleaseDate;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  myVersion,  myReleaseDate);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, myVersion, myReleaseDate);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Name software is known by
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
     * Name software is known by
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
     * Name software is known by
     * </p> 
	 */
	public Software setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Name software is known by
     * </p> 
	 */
	public Software setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>version</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version identifier for the software covered by this statement
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
     * The version identifier for the software covered by this statement
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
     * The version identifier for the software covered by this statement
     * </p> 
	 */
	public Software setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>version</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version identifier for the software covered by this statement
     * </p> 
	 */
	public Software setVersion( String theString) {
		myVersion = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>releaseDate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date this version of the software released
     * </p> 
	 */
	public DateTimeDt getReleaseDateElement() {  
		if (myReleaseDate == null) {
			myReleaseDate = new DateTimeDt();
		}
		return myReleaseDate;
	}

	
	/**
	 * Gets the value(s) for <b>releaseDate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date this version of the software released
     * </p> 
	 */
	public Date getReleaseDate() {  
		return getReleaseDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>releaseDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date this version of the software released
     * </p> 
	 */
	public Software setReleaseDate(DateTimeDt theValue) {
		myReleaseDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>releaseDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date this version of the software released
     * </p> 
	 */
	public Software setReleaseDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myReleaseDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>releaseDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date this version of the software released
     * </p> 
	 */
	public Software setReleaseDateWithSecondsPrecision( Date theDate) {
		myReleaseDate = new DateTimeDt(theDate); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Conformance.implementation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a specific implementation instance that is described by the conformance statement - i.e. a particular installation, rather than the capabilities of a software program
     * </p> 
	 */
	@Block()	
	public static class Implementation 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="description", type=StringDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Information about the specific installation that this conformance statement relates to"
	)
	private StringDt myDescription;
	
	@Child(name="url", type=UriDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces."
	)
	private UriDt myUrl;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myDescription,  myUrl);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myDescription, myUrl);
	}

	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the specific installation that this conformance statement relates to
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
     * Information about the specific installation that this conformance statement relates to
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
     * Information about the specific installation that this conformance statement relates to
     * </p> 
	 */
	public Implementation setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the specific installation that this conformance statement relates to
     * </p> 
	 */
	public Implementation setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
     * </p> 
	 */
	public UriDt getUrlElement() {  
		if (myUrl == null) {
			myUrl = new UriDt();
		}
		return myUrl;
	}

	
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
     * </p> 
	 */
	public String getUrl() {  
		return getUrlElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
     * </p> 
	 */
	public Implementation setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute base URL for the implementation.  This forms the base for REST interfaces as well as the mailbox and document interfaces.
     * </p> 
	 */
	public Implementation setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Conformance.rest</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A definition of the restful capabilities of the solution, if any
     * </p> 
	 */
	@Block()	
	public static class Rest 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="mode", type=CodeDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies whether this portion of the statement is describing ability to initiate or receive restful operations"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/restful-conformance-mode")
	private BoundCodeDt<RestfulConformanceModeEnum> myMode;
	
	@Child(name="documentation", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Information about the system's restful capabilities that apply across all applications, such as security"
	)
	private StringDt myDocumentation;
	
	@Child(name="security", order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Information about security implementation from an interface perspective - what a client needs to know"
	)
	private RestSecurity mySecurity;
	
	@Child(name="resource", order=3, min=1, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A specification of the restful capabilities of the solution for a specific resource type"
	)
	private java.util.List<RestResource> myResource;
	
	@Child(name="interaction", order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A specification of restful operations supported by the system"
	)
	private java.util.List<RestInteraction> myInteraction;
	
	@Child(name="transactionMode", type=CodeDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code that indicates how transactions are supported"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/transaction-mode")
	private BoundCodeDt<TransactionModeEnum> myTransactionMode;
	
	@Child(name="searchParam", type=RestResourceSearchParam.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation"
	)
	private java.util.List<RestResourceSearchParam> mySearchParam;
	
	@Child(name="operation", order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Definition of an operation or a named query and with its parameters and their meaning and type"
	)
	private java.util.List<RestOperation> myOperation;
	
	@Child(name="compartment", type=UriDt.class, order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An absolute URI which is a reference to the definition of a compartment hosted by the system"
	)
	private java.util.List<UriDt> myCompartment;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myMode,  myDocumentation,  mySecurity,  myResource,  myInteraction,  myTransactionMode,  mySearchParam,  myOperation,  myCompartment);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myMode, myDocumentation, mySecurity, myResource, myInteraction, myTransactionMode, mySearchParam, myOperation, myCompartment);
	}

	/**
	 * Gets the value(s) for <b>mode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies whether this portion of the statement is describing ability to initiate or receive restful operations
     * </p> 
	 */
	public BoundCodeDt<RestfulConformanceModeEnum> getModeElement() {  
		if (myMode == null) {
			myMode = new BoundCodeDt<RestfulConformanceModeEnum>(RestfulConformanceModeEnum.VALUESET_BINDER);
		}
		return myMode;
	}

	
	/**
	 * Gets the value(s) for <b>mode</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies whether this portion of the statement is describing ability to initiate or receive restful operations
     * </p> 
	 */
	public String getMode() {  
		return getModeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies whether this portion of the statement is describing ability to initiate or receive restful operations
     * </p> 
	 */
	public Rest setMode(BoundCodeDt<RestfulConformanceModeEnum> theValue) {
		myMode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies whether this portion of the statement is describing ability to initiate or receive restful operations
     * </p> 
	 */
	public Rest setMode(RestfulConformanceModeEnum theValue) {
		setMode(new BoundCodeDt<RestfulConformanceModeEnum>(RestfulConformanceModeEnum.VALUESET_BINDER, theValue));
		
/*
		getModeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>documentation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the system's restful capabilities that apply across all applications, such as security
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
     * Information about the system's restful capabilities that apply across all applications, such as security
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
     * Information about the system's restful capabilities that apply across all applications, such as security
     * </p> 
	 */
	public Rest setDocumentation(StringDt theValue) {
		myDocumentation = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>documentation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the system's restful capabilities that apply across all applications, such as security
     * </p> 
	 */
	public Rest setDocumentation( String theString) {
		myDocumentation = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>security</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Information about security implementation from an interface perspective - what a client needs to know
     * </p> 
	 */
	public RestSecurity getSecurity() {  
		if (mySecurity == null) {
			mySecurity = new RestSecurity();
		}
		return mySecurity;
	}

	/**
	 * Sets the value(s) for <b>security</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about security implementation from an interface perspective - what a client needs to know
     * </p> 
	 */
	public Rest setSecurity(RestSecurity theValue) {
		mySecurity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>resource</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A specification of the restful capabilities of the solution for a specific resource type
     * </p> 
	 */
	public java.util.List<RestResource> getResource() {  
		if (myResource == null) {
			myResource = new java.util.ArrayList<RestResource>();
		}
		return myResource;
	}

	/**
	 * Sets the value(s) for <b>resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A specification of the restful capabilities of the solution for a specific resource type
     * </p> 
	 */
	public Rest setResource(java.util.List<RestResource> theValue) {
		myResource = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A specification of the restful capabilities of the solution for a specific resource type
     * </p> 
	 */
	public RestResource addResource() {
		RestResource newType = new RestResource();
		getResource().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>resource</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A specification of the restful capabilities of the solution for a specific resource type
	 * </p>
	 * @param theValue The resource to add (must not be <code>null</code>)
	 */
	public Rest addResource(RestResource theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getResource().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>resource</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A specification of the restful capabilities of the solution for a specific resource type
     * </p> 
	 */
	public RestResource getResourceFirstRep() {
		if (getResource().isEmpty()) {
			return addResource();
		}
		return getResource().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>interaction</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A specification of restful operations supported by the system
     * </p> 
	 */
	public java.util.List<RestInteraction> getInteraction() {  
		if (myInteraction == null) {
			myInteraction = new java.util.ArrayList<RestInteraction>();
		}
		return myInteraction;
	}

	/**
	 * Sets the value(s) for <b>interaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A specification of restful operations supported by the system
     * </p> 
	 */
	public Rest setInteraction(java.util.List<RestInteraction> theValue) {
		myInteraction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>interaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A specification of restful operations supported by the system
     * </p> 
	 */
	public RestInteraction addInteraction() {
		RestInteraction newType = new RestInteraction();
		getInteraction().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>interaction</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A specification of restful operations supported by the system
	 * </p>
	 * @param theValue The interaction to add (must not be <code>null</code>)
	 */
	public Rest addInteraction(RestInteraction theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getInteraction().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>interaction</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A specification of restful operations supported by the system
     * </p> 
	 */
	public RestInteraction getInteractionFirstRep() {
		if (getInteraction().isEmpty()) {
			return addInteraction();
		}
		return getInteraction().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>transactionMode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates how transactions are supported
     * </p> 
	 */
	public BoundCodeDt<TransactionModeEnum> getTransactionModeElement() {  
		if (myTransactionMode == null) {
			myTransactionMode = new BoundCodeDt<TransactionModeEnum>(TransactionModeEnum.VALUESET_BINDER);
		}
		return myTransactionMode;
	}

	
	/**
	 * Gets the value(s) for <b>transactionMode</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates how transactions are supported
     * </p> 
	 */
	public String getTransactionMode() {  
		return getTransactionModeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>transactionMode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates how transactions are supported
     * </p> 
	 */
	public Rest setTransactionMode(BoundCodeDt<TransactionModeEnum> theValue) {
		myTransactionMode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>transactionMode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates how transactions are supported
     * </p> 
	 */
	public Rest setTransactionMode(TransactionModeEnum theValue) {
		setTransactionMode(new BoundCodeDt<TransactionModeEnum>(TransactionModeEnum.VALUESET_BINDER, theValue));
		
/*
		getTransactionModeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>searchParam</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation
     * </p> 
	 */
	public java.util.List<RestResourceSearchParam> getSearchParam() {  
		if (mySearchParam == null) {
			mySearchParam = new java.util.ArrayList<RestResourceSearchParam>();
		}
		return mySearchParam;
	}

	/**
	 * Sets the value(s) for <b>searchParam</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation
     * </p> 
	 */
	public Rest setSearchParam(java.util.List<RestResourceSearchParam> theValue) {
		mySearchParam = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>searchParam</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation
     * </p> 
	 */
	public RestResourceSearchParam addSearchParam() {
		RestResourceSearchParam newType = new RestResourceSearchParam();
		getSearchParam().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>searchParam</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation
	 * </p>
	 * @param theValue The searchParam to add (must not be <code>null</code>)
	 */
	public Rest addSearchParam(RestResourceSearchParam theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSearchParam().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>searchParam</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Search parameters that are supported for searching all resources for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation
     * </p> 
	 */
	public RestResourceSearchParam getSearchParamFirstRep() {
		if (getSearchParam().isEmpty()) {
			return addSearchParam();
		}
		return getSearchParam().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>operation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Definition of an operation or a named query and with its parameters and their meaning and type
     * </p> 
	 */
	public java.util.List<RestOperation> getOperation() {  
		if (myOperation == null) {
			myOperation = new java.util.ArrayList<RestOperation>();
		}
		return myOperation;
	}

	/**
	 * Sets the value(s) for <b>operation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Definition of an operation or a named query and with its parameters and their meaning and type
     * </p> 
	 */
	public Rest setOperation(java.util.List<RestOperation> theValue) {
		myOperation = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>operation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Definition of an operation or a named query and with its parameters and their meaning and type
     * </p> 
	 */
	public RestOperation addOperation() {
		RestOperation newType = new RestOperation();
		getOperation().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>operation</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Definition of an operation or a named query and with its parameters and their meaning and type
	 * </p>
	 * @param theValue The operation to add (must not be <code>null</code>)
	 */
	public Rest addOperation(RestOperation theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getOperation().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>operation</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Definition of an operation or a named query and with its parameters and their meaning and type
     * </p> 
	 */
	public RestOperation getOperationFirstRep() {
		if (getOperation().isEmpty()) {
			return addOperation();
		}
		return getOperation().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>compartment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI which is a reference to the definition of a compartment hosted by the system
     * </p> 
	 */
	public java.util.List<UriDt> getCompartment() {  
		if (myCompartment == null) {
			myCompartment = new java.util.ArrayList<UriDt>();
		}
		return myCompartment;
	}

	/**
	 * Sets the value(s) for <b>compartment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI which is a reference to the definition of a compartment hosted by the system
     * </p> 
	 */
	public Rest setCompartment(java.util.List<UriDt> theValue) {
		myCompartment = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>compartment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI which is a reference to the definition of a compartment hosted by the system
     * </p> 
	 */
	public UriDt addCompartment() {
		UriDt newType = new UriDt();
		getCompartment().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>compartment</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * An absolute URI which is a reference to the definition of a compartment hosted by the system
	 * </p>
	 * @param theValue The compartment to add (must not be <code>null</code>)
	 */
	public Rest addCompartment(UriDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCompartment().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>compartment</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI which is a reference to the definition of a compartment hosted by the system
     * </p> 
	 */
	public UriDt getCompartmentFirstRep() {
		if (getCompartment().isEmpty()) {
			return addCompartment();
		}
		return getCompartment().get(0); 
	}
 	/**
	 * Adds a new value for <b>compartment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI which is a reference to the definition of a compartment hosted by the system
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Rest addCompartment( String theUri) {
		if (myCompartment == null) {
			myCompartment = new java.util.ArrayList<UriDt>();
		}
		myCompartment.add(new UriDt(theUri));
		return this; 
	}

 


	}

	/**
	 * Block class for child element: <b>Conformance.rest.security</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about security implementation from an interface perspective - what a client needs to know
     * </p> 
	 */
	@Block()	
	public static class RestSecurity 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="cors", type=BooleanDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Server adds CORS headers when responding to requests - this enables javascript applications to use the server"
	)
	private BooleanDt myCors;
	
	@Child(name="service", type=CodeableConceptDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Types of security services are supported/required by the system"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/restful-security-service")
	private java.util.List<BoundCodeableConceptDt<RestfulSecurityServiceEnum>> myService;
	
	@Child(name="description", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="General description of how security works"
	)
	private StringDt myDescription;
	
	@Child(name="certificate", order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Certificates associated with security profiles"
	)
	private java.util.List<RestSecurityCertificate> myCertificate;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCors,  myService,  myDescription,  myCertificate);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCors, myService, myDescription, myCertificate);
	}

	/**
	 * Gets the value(s) for <b>cors</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Server adds CORS headers when responding to requests - this enables javascript applications to use the server
     * </p> 
	 */
	public BooleanDt getCorsElement() {  
		if (myCors == null) {
			myCors = new BooleanDt();
		}
		return myCors;
	}

	
	/**
	 * Gets the value(s) for <b>cors</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Server adds CORS headers when responding to requests - this enables javascript applications to use the server
     * </p> 
	 */
	public Boolean getCors() {  
		return getCorsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>cors</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Server adds CORS headers when responding to requests - this enables javascript applications to use the server
     * </p> 
	 */
	public RestSecurity setCors(BooleanDt theValue) {
		myCors = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>cors</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Server adds CORS headers when responding to requests - this enables javascript applications to use the server
     * </p> 
	 */
	public RestSecurity setCors( boolean theBoolean) {
		myCors = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>service</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Types of security services are supported/required by the system
     * </p> 
	 */
	public java.util.List<BoundCodeableConceptDt<RestfulSecurityServiceEnum>> getService() {  
		if (myService == null) {
			myService = new java.util.ArrayList<BoundCodeableConceptDt<RestfulSecurityServiceEnum>>();
		}
		return myService;
	}

	/**
	 * Sets the value(s) for <b>service</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Types of security services are supported/required by the system
     * </p> 
	 */
	public RestSecurity setService(java.util.List<BoundCodeableConceptDt<RestfulSecurityServiceEnum>> theValue) {
		myService = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>service</b> () using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addService()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * Types of security services are supported/required by the system
     * </p> 
	 */
	public BoundCodeableConceptDt<RestfulSecurityServiceEnum> addService(RestfulSecurityServiceEnum theValue) {
		BoundCodeableConceptDt<RestfulSecurityServiceEnum> retVal = new BoundCodeableConceptDt<RestfulSecurityServiceEnum>(RestfulSecurityServiceEnum.VALUESET_BINDER, theValue);
		getService().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>service</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Types of security services are supported/required by the system
     * </p> 
	 */
	public BoundCodeableConceptDt<RestfulSecurityServiceEnum> getServiceFirstRep() {
		if (getService().size() == 0) {
			addService();
		}
		return getService().get(0);
	}

	/**
	 * Add a value for <b>service</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Types of security services are supported/required by the system
     * </p> 
	 */
	public BoundCodeableConceptDt<RestfulSecurityServiceEnum> addService() {
		BoundCodeableConceptDt<RestfulSecurityServiceEnum> retVal = new BoundCodeableConceptDt<RestfulSecurityServiceEnum>(RestfulSecurityServiceEnum.VALUESET_BINDER);
		getService().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>service</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Types of security services are supported/required by the system
     * </p> 
	 */
	public RestSecurity setService(RestfulSecurityServiceEnum theValue) {
		getService().clear();
		addService(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * General description of how security works
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
     * General description of how security works
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
     * General description of how security works
     * </p> 
	 */
	public RestSecurity setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * General description of how security works
     * </p> 
	 */
	public RestSecurity setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>certificate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Certificates associated with security profiles
     * </p> 
	 */
	public java.util.List<RestSecurityCertificate> getCertificate() {  
		if (myCertificate == null) {
			myCertificate = new java.util.ArrayList<RestSecurityCertificate>();
		}
		return myCertificate;
	}

	/**
	 * Sets the value(s) for <b>certificate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Certificates associated with security profiles
     * </p> 
	 */
	public RestSecurity setCertificate(java.util.List<RestSecurityCertificate> theValue) {
		myCertificate = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>certificate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Certificates associated with security profiles
     * </p> 
	 */
	public RestSecurityCertificate addCertificate() {
		RestSecurityCertificate newType = new RestSecurityCertificate();
		getCertificate().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>certificate</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Certificates associated with security profiles
	 * </p>
	 * @param theValue The certificate to add (must not be <code>null</code>)
	 */
	public RestSecurity addCertificate(RestSecurityCertificate theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCertificate().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>certificate</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Certificates associated with security profiles
     * </p> 
	 */
	public RestSecurityCertificate getCertificateFirstRep() {
		if (getCertificate().isEmpty()) {
			return addCertificate();
		}
		return getCertificate().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>Conformance.rest.security.certificate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Certificates associated with security profiles
     * </p> 
	 */
	@Block()	
	public static class RestSecurityCertificate 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Mime type for certificate"
	)
	private CodeDt myType;
	
	@Child(name="blob", type=Base64BinaryDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Actual certificate"
	)
	private Base64BinaryDt myBlob;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myBlob);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myBlob);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Mime type for certificate
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
     * Mime type for certificate
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
     * Mime type for certificate
     * </p> 
	 */
	public RestSecurityCertificate setType(CodeDt theValue) {
		myType = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Mime type for certificate
     * </p> 
	 */
	public RestSecurityCertificate setType( String theCode) {
		myType = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>blob</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Actual certificate
     * </p> 
	 */
	public Base64BinaryDt getBlobElement() {  
		if (myBlob == null) {
			myBlob = new Base64BinaryDt();
		}
		return myBlob;
	}

	
	/**
	 * Gets the value(s) for <b>blob</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Actual certificate
     * </p> 
	 */
	public byte[] getBlob() {  
		return getBlobElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>blob</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Actual certificate
     * </p> 
	 */
	public RestSecurityCertificate setBlob(Base64BinaryDt theValue) {
		myBlob = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>blob</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Actual certificate
     * </p> 
	 */
	public RestSecurityCertificate setBlob( byte[] theBytes) {
		myBlob = new Base64BinaryDt(theBytes); 
		return this; 
	}

 


	}



	/**
	 * Block class for child element: <b>Conformance.rest.resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A specification of the restful capabilities of the solution for a specific resource type
     * </p> 
	 */
	@Block()	
	public static class RestResource 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A type of resource exposed via the restful interface"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
	private BoundCodeDt<ResourceTypeEnum> myType;
	
	@Child(name="profile", order=1, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.StructureDefinition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}"
	)
	private ResourceReferenceDt myProfile;
	
	@Child(name="interaction", order=2, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a restful operation supported by the solution"
	)
	private java.util.List<RestResourceInteraction> myInteraction;
	
	@Child(name="versioning", type=CodeDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/versioning-policy")
	private BoundCodeDt<ResourceVersionPolicyEnum> myVersioning;
	
	@Child(name="readHistory", type=BooleanDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A flag for whether the server is able to return past versions as part of the vRead operation"
	)
	private BooleanDt myReadHistory;
	
	@Child(name="updateCreate", type=BooleanDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server"
	)
	private BooleanDt myUpdateCreate;
	
	@Child(name="conditionalCreate", type=BooleanDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A flag that indicates that the server supports conditional create"
	)
	private BooleanDt myConditionalCreate;
	
	@Child(name="conditionalUpdate", type=BooleanDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A flag that indicates that the server supports conditional update"
	)
	private BooleanDt myConditionalUpdate;
	
	@Child(name="conditionalDelete", type=CodeDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code that indicates how the server supports conditional delete"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/conditional-delete-status")
	private BoundCodeDt<ConditionalDeleteStatusEnum> myConditionalDelete;
	
	@Child(name="searchInclude", type=StringDt.class, order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of _include values supported by the server"
	)
	private java.util.List<StringDt> mySearchInclude;
	
	@Child(name="searchRevInclude", type=StringDt.class, order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of _revinclude (reverse include) values supported by the server"
	)
	private java.util.List<StringDt> mySearchRevInclude;
	
	@Child(name="searchParam", order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation"
	)
	private java.util.List<RestResourceSearchParam> mySearchParam;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myProfile,  myInteraction,  myVersioning,  myReadHistory,  myUpdateCreate,  myConditionalCreate,  myConditionalUpdate,  myConditionalDelete,  mySearchInclude,  mySearchRevInclude,  mySearchParam);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myProfile, myInteraction, myVersioning, myReadHistory, myUpdateCreate, myConditionalCreate, myConditionalUpdate, myConditionalDelete, mySearchInclude, mySearchRevInclude, mySearchParam);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A type of resource exposed via the restful interface
     * </p> 
	 */
	public BoundCodeDt<ResourceTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<ResourceTypeEnum>(ResourceTypeEnum.VALUESET_BINDER);
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
     * A type of resource exposed via the restful interface
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
     * A type of resource exposed via the restful interface
     * </p> 
	 */
	public RestResource setType(BoundCodeDt<ResourceTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A type of resource exposed via the restful interface
     * </p> 
	 */
	public RestResource setType(ResourceTypeEnum theValue) {
		setType(new BoundCodeDt<ResourceTypeEnum>(ResourceTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>profile</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}
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
     * A specification of the profile that describes the solution's overall support for the resource, including any constraints on cardinality, bindings, lengths or other limitations. See further discussion in [Using Profiles]{profiling.html#profile-uses}
     * </p> 
	 */
	public RestResource setProfile(ResourceReferenceDt theValue) {
		myProfile = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>interaction</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a restful operation supported by the solution
     * </p> 
	 */
	public java.util.List<RestResourceInteraction> getInteraction() {  
		if (myInteraction == null) {
			myInteraction = new java.util.ArrayList<RestResourceInteraction>();
		}
		return myInteraction;
	}

	/**
	 * Sets the value(s) for <b>interaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a restful operation supported by the solution
     * </p> 
	 */
	public RestResource setInteraction(java.util.List<RestResourceInteraction> theValue) {
		myInteraction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>interaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a restful operation supported by the solution
     * </p> 
	 */
	public RestResourceInteraction addInteraction() {
		RestResourceInteraction newType = new RestResourceInteraction();
		getInteraction().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>interaction</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identifies a restful operation supported by the solution
	 * </p>
	 * @param theValue The interaction to add (must not be <code>null</code>)
	 */
	public RestResource addInteraction(RestResourceInteraction theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getInteraction().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>interaction</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a restful operation supported by the solution
     * </p> 
	 */
	public RestResourceInteraction getInteractionFirstRep() {
		if (getInteraction().isEmpty()) {
			return addInteraction();
		}
		return getInteraction().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>versioning</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API
     * </p> 
	 */
	public BoundCodeDt<ResourceVersionPolicyEnum> getVersioningElement() {  
		if (myVersioning == null) {
			myVersioning = new BoundCodeDt<ResourceVersionPolicyEnum>(ResourceVersionPolicyEnum.VALUESET_BINDER);
		}
		return myVersioning;
	}

	
	/**
	 * Gets the value(s) for <b>versioning</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API
     * </p> 
	 */
	public String getVersioning() {  
		return getVersioningElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>versioning</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API
     * </p> 
	 */
	public RestResource setVersioning(BoundCodeDt<ResourceVersionPolicyEnum> theValue) {
		myVersioning = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>versioning</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This field is set to no-version to specify that the system does not support (server) or use (client) versioning for this resource type. If this has some other value, the server must at least correctly track and populate the versionId meta-property on resources. If the value is 'versioned-update', then the server supports all the versioning features, including using e-tags for version integrity in the API
     * </p> 
	 */
	public RestResource setVersioning(ResourceVersionPolicyEnum theValue) {
		setVersioning(new BoundCodeDt<ResourceVersionPolicyEnum>(ResourceVersionPolicyEnum.VALUESET_BINDER, theValue));
		
/*
		getVersioningElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>readHistory</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A flag for whether the server is able to return past versions as part of the vRead operation
     * </p> 
	 */
	public BooleanDt getReadHistoryElement() {  
		if (myReadHistory == null) {
			myReadHistory = new BooleanDt();
		}
		return myReadHistory;
	}

	
	/**
	 * Gets the value(s) for <b>readHistory</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A flag for whether the server is able to return past versions as part of the vRead operation
     * </p> 
	 */
	public Boolean getReadHistory() {  
		return getReadHistoryElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>readHistory</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A flag for whether the server is able to return past versions as part of the vRead operation
     * </p> 
	 */
	public RestResource setReadHistory(BooleanDt theValue) {
		myReadHistory = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>readHistory</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A flag for whether the server is able to return past versions as part of the vRead operation
     * </p> 
	 */
	public RestResource setReadHistory( boolean theBoolean) {
		myReadHistory = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>updateCreate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server
     * </p> 
	 */
	public BooleanDt getUpdateCreateElement() {  
		if (myUpdateCreate == null) {
			myUpdateCreate = new BooleanDt();
		}
		return myUpdateCreate;
	}

	
	/**
	 * Gets the value(s) for <b>updateCreate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server
     * </p> 
	 */
	public Boolean getUpdateCreate() {  
		return getUpdateCreateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>updateCreate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server
     * </p> 
	 */
	public RestResource setUpdateCreate(BooleanDt theValue) {
		myUpdateCreate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>updateCreate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A flag to indicate that the server allows or needs to allow the client to create new identities on the server (e.g. that is, the client PUTs to a location where there is no existing resource). Allowing this operation means that the server allows the client to create new identities on the server
     * </p> 
	 */
	public RestResource setUpdateCreate( boolean theBoolean) {
		myUpdateCreate = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>conditionalCreate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A flag that indicates that the server supports conditional create
     * </p> 
	 */
	public BooleanDt getConditionalCreateElement() {  
		if (myConditionalCreate == null) {
			myConditionalCreate = new BooleanDt();
		}
		return myConditionalCreate;
	}

	
	/**
	 * Gets the value(s) for <b>conditionalCreate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A flag that indicates that the server supports conditional create
     * </p> 
	 */
	public Boolean getConditionalCreate() {  
		return getConditionalCreateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>conditionalCreate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A flag that indicates that the server supports conditional create
     * </p> 
	 */
	public RestResource setConditionalCreate(BooleanDt theValue) {
		myConditionalCreate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>conditionalCreate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A flag that indicates that the server supports conditional create
     * </p> 
	 */
	public RestResource setConditionalCreate( boolean theBoolean) {
		myConditionalCreate = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>conditionalUpdate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A flag that indicates that the server supports conditional update
     * </p> 
	 */
	public BooleanDt getConditionalUpdateElement() {  
		if (myConditionalUpdate == null) {
			myConditionalUpdate = new BooleanDt();
		}
		return myConditionalUpdate;
	}

	
	/**
	 * Gets the value(s) for <b>conditionalUpdate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A flag that indicates that the server supports conditional update
     * </p> 
	 */
	public Boolean getConditionalUpdate() {  
		return getConditionalUpdateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>conditionalUpdate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A flag that indicates that the server supports conditional update
     * </p> 
	 */
	public RestResource setConditionalUpdate(BooleanDt theValue) {
		myConditionalUpdate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>conditionalUpdate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A flag that indicates that the server supports conditional update
     * </p> 
	 */
	public RestResource setConditionalUpdate( boolean theBoolean) {
		myConditionalUpdate = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>conditionalDelete</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates how the server supports conditional delete
     * </p> 
	 */
	public BoundCodeDt<ConditionalDeleteStatusEnum> getConditionalDeleteElement() {  
		if (myConditionalDelete == null) {
			myConditionalDelete = new BoundCodeDt<ConditionalDeleteStatusEnum>(ConditionalDeleteStatusEnum.VALUESET_BINDER);
		}
		return myConditionalDelete;
	}

	
	/**
	 * Gets the value(s) for <b>conditionalDelete</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates how the server supports conditional delete
     * </p> 
	 */
	public String getConditionalDelete() {  
		return getConditionalDeleteElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>conditionalDelete</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates how the server supports conditional delete
     * </p> 
	 */
	public RestResource setConditionalDelete(BoundCodeDt<ConditionalDeleteStatusEnum> theValue) {
		myConditionalDelete = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>conditionalDelete</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code that indicates how the server supports conditional delete
     * </p> 
	 */
	public RestResource setConditionalDelete(ConditionalDeleteStatusEnum theValue) {
		setConditionalDelete(new BoundCodeDt<ConditionalDeleteStatusEnum>(ConditionalDeleteStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getConditionalDeleteElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>searchInclude</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of _include values supported by the server
     * </p> 
	 */
	public java.util.List<StringDt> getSearchInclude() {  
		if (mySearchInclude == null) {
			mySearchInclude = new java.util.ArrayList<StringDt>();
		}
		return mySearchInclude;
	}

	/**
	 * Sets the value(s) for <b>searchInclude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of _include values supported by the server
     * </p> 
	 */
	public RestResource setSearchInclude(java.util.List<StringDt> theValue) {
		mySearchInclude = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>searchInclude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of _include values supported by the server
     * </p> 
	 */
	public StringDt addSearchInclude() {
		StringDt newType = new StringDt();
		getSearchInclude().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>searchInclude</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of _include values supported by the server
	 * </p>
	 * @param theValue The searchInclude to add (must not be <code>null</code>)
	 */
	public RestResource addSearchInclude(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSearchInclude().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>searchInclude</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of _include values supported by the server
     * </p> 
	 */
	public StringDt getSearchIncludeFirstRep() {
		if (getSearchInclude().isEmpty()) {
			return addSearchInclude();
		}
		return getSearchInclude().get(0); 
	}
 	/**
	 * Adds a new value for <b>searchInclude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of _include values supported by the server
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public RestResource addSearchInclude( String theString) {
		if (mySearchInclude == null) {
			mySearchInclude = new java.util.ArrayList<StringDt>();
		}
		mySearchInclude.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>searchRevInclude</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of _revinclude (reverse include) values supported by the server
     * </p> 
	 */
	public java.util.List<StringDt> getSearchRevInclude() {  
		if (mySearchRevInclude == null) {
			mySearchRevInclude = new java.util.ArrayList<StringDt>();
		}
		return mySearchRevInclude;
	}

	/**
	 * Sets the value(s) for <b>searchRevInclude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of _revinclude (reverse include) values supported by the server
     * </p> 
	 */
	public RestResource setSearchRevInclude(java.util.List<StringDt> theValue) {
		mySearchRevInclude = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>searchRevInclude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of _revinclude (reverse include) values supported by the server
     * </p> 
	 */
	public StringDt addSearchRevInclude() {
		StringDt newType = new StringDt();
		getSearchRevInclude().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>searchRevInclude</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of _revinclude (reverse include) values supported by the server
	 * </p>
	 * @param theValue The searchRevInclude to add (must not be <code>null</code>)
	 */
	public RestResource addSearchRevInclude(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSearchRevInclude().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>searchRevInclude</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of _revinclude (reverse include) values supported by the server
     * </p> 
	 */
	public StringDt getSearchRevIncludeFirstRep() {
		if (getSearchRevInclude().isEmpty()) {
			return addSearchRevInclude();
		}
		return getSearchRevInclude().get(0); 
	}
 	/**
	 * Adds a new value for <b>searchRevInclude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of _revinclude (reverse include) values supported by the server
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public RestResource addSearchRevInclude( String theString) {
		if (mySearchRevInclude == null) {
			mySearchRevInclude = new java.util.ArrayList<StringDt>();
		}
		mySearchRevInclude.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>searchParam</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation
     * </p> 
	 */
	public java.util.List<RestResourceSearchParam> getSearchParam() {  
		if (mySearchParam == null) {
			mySearchParam = new java.util.ArrayList<RestResourceSearchParam>();
		}
		return mySearchParam;
	}

	/**
	 * Sets the value(s) for <b>searchParam</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation
     * </p> 
	 */
	public RestResource setSearchParam(java.util.List<RestResourceSearchParam> theValue) {
		mySearchParam = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>searchParam</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation
     * </p> 
	 */
	public RestResourceSearchParam addSearchParam() {
		RestResourceSearchParam newType = new RestResourceSearchParam();
		getSearchParam().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>searchParam</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation
	 * </p>
	 * @param theValue The searchParam to add (must not be <code>null</code>)
	 */
	public RestResource addSearchParam(RestResourceSearchParam theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSearchParam().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>searchParam</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation
     * </p> 
	 */
	public RestResourceSearchParam getSearchParamFirstRep() {
		if (getSearchParam().isEmpty()) {
			return addSearchParam();
		}
		return getSearchParam().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>Conformance.rest.resource.interaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a restful operation supported by the solution
     * </p> 
	 */
	@Block()	
	public static class RestResourceInteraction 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Coded identifier of the operation, supported by the system resource"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/type-restful-interaction")
	private BoundCodeDt<TypeRestfulInteractionEnum> myCode;
	
	@Child(name="documentation", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'"
	)
	private StringDt myDocumentation;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myDocumentation);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myDocumentation);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Coded identifier of the operation, supported by the system resource
     * </p> 
	 */
	public BoundCodeDt<TypeRestfulInteractionEnum> getCodeElement() {  
		if (myCode == null) {
			myCode = new BoundCodeDt<TypeRestfulInteractionEnum>(TypeRestfulInteractionEnum.VALUESET_BINDER);
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
     * Coded identifier of the operation, supported by the system resource
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
     * Coded identifier of the operation, supported by the system resource
     * </p> 
	 */
	public RestResourceInteraction setCode(BoundCodeDt<TypeRestfulInteractionEnum> theValue) {
		myCode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Coded identifier of the operation, supported by the system resource
     * </p> 
	 */
	public RestResourceInteraction setCode(TypeRestfulInteractionEnum theValue) {
		setCode(new BoundCodeDt<TypeRestfulInteractionEnum>(TypeRestfulInteractionEnum.VALUESET_BINDER, theValue));
		
/*
		getCodeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>documentation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'
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
     * Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'
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
     * Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'
     * </p> 
	 */
	public RestResourceInteraction setDocumentation(StringDt theValue) {
		myDocumentation = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>documentation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance specific to the implementation of this operation, such as 'delete is a logical delete' or 'updates are only allowed with version id' or 'creates permitted from pre-authorized certificates only'
     * </p> 
	 */
	public RestResourceInteraction setDocumentation( String theString) {
		myDocumentation = new StringDt(theString); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Conformance.rest.resource.searchParam</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Search parameters for implementations to support and/or make use of - either references to ones defined in the specification, or additional ones defined for/by the implementation
     * </p> 
	 */
	@Block()	
	public static class RestResourceSearchParam 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=StringDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of the search parameter used in the interface"
	)
	private StringDt myName;
	
	@Child(name="definition", type=UriDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]])"
	)
	private UriDt myDefinition;
	
	@Child(name="type", type=CodeDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of value a search parameter refers to, and how the content is interpreted"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/search-param-type")
	private BoundCodeDt<SearchParamTypeEnum> myType;
	
	@Child(name="documentation", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms."
	)
	private StringDt myDocumentation;
	
	@Child(name="target", type=CodeDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Types of resource (if a resource is referenced)"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
	private java.util.List<BoundCodeDt<ResourceTypeEnum>> myTarget;
	
	@Child(name="modifier", type=CodeDt.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A modifier supported for the search parameter"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/search-modifier-code")
	private java.util.List<BoundCodeDt<SearchModifierCodeEnum>> myModifier;
	
	@Child(name="chain", type=StringDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type"
	)
	private java.util.List<StringDt> myChain;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  myDefinition,  myType,  myDocumentation,  myTarget,  myModifier,  myChain);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, myDefinition, myType, myDocumentation, myTarget, myModifier, myChain);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the search parameter used in the interface
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
     * The name of the search parameter used in the interface
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
     * The name of the search parameter used in the interface
     * </p> 
	 */
	public RestResourceSearchParam setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the search parameter used in the interface
     * </p> 
	 */
	public RestResourceSearchParam setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>definition</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]])
     * </p> 
	 */
	public UriDt getDefinitionElement() {  
		if (myDefinition == null) {
			myDefinition = new UriDt();
		}
		return myDefinition;
	}

	
	/**
	 * Gets the value(s) for <b>definition</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]])
     * </p> 
	 */
	public String getDefinition() {  
		return getDefinitionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>definition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]])
     * </p> 
	 */
	public RestResourceSearchParam setDefinition(UriDt theValue) {
		myDefinition = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>definition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI that is a formal reference to where this parameter was first defined, so that a client can be confident of the meaning of the search parameter (a reference to [[[SearchParameter.url]]])
     * </p> 
	 */
	public RestResourceSearchParam setDefinition( String theUri) {
		myDefinition = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of value a search parameter refers to, and how the content is interpreted
     * </p> 
	 */
	public BoundCodeDt<SearchParamTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<SearchParamTypeEnum>(SearchParamTypeEnum.VALUESET_BINDER);
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
     * The type of value a search parameter refers to, and how the content is interpreted
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
     * The type of value a search parameter refers to, and how the content is interpreted
     * </p> 
	 */
	public RestResourceSearchParam setType(BoundCodeDt<SearchParamTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of value a search parameter refers to, and how the content is interpreted
     * </p> 
	 */
	public RestResourceSearchParam setType(SearchParamTypeEnum theValue) {
		setType(new BoundCodeDt<SearchParamTypeEnum>(SearchParamTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>documentation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
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
     * This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
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
     * This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
     * </p> 
	 */
	public RestResourceSearchParam setDocumentation(StringDt theValue) {
		myDocumentation = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>documentation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This allows documentation of any distinct behaviors about how the search parameter is used.  For example, text matching algorithms.
     * </p> 
	 */
	public RestResourceSearchParam setDocumentation( String theString) {
		myDocumentation = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>target</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Types of resource (if a resource is referenced)
     * </p> 
	 */
	public java.util.List<BoundCodeDt<ResourceTypeEnum>> getTarget() {  
		if (myTarget == null) {
			myTarget = new java.util.ArrayList<BoundCodeDt<ResourceTypeEnum>>();
		}
		return myTarget;
	}

	/**
	 * Sets the value(s) for <b>target</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Types of resource (if a resource is referenced)
     * </p> 
	 */
	public RestResourceSearchParam setTarget(java.util.List<BoundCodeDt<ResourceTypeEnum>> theValue) {
		myTarget = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>target</b> () using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addTarget()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * Types of resource (if a resource is referenced)
     * </p> 
	 */
	public BoundCodeDt<ResourceTypeEnum> addTarget(ResourceTypeEnum theValue) {
		BoundCodeDt<ResourceTypeEnum> retVal = new BoundCodeDt<ResourceTypeEnum>(ResourceTypeEnum.VALUESET_BINDER, theValue);
		getTarget().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>target</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Types of resource (if a resource is referenced)
     * </p> 
	 */
	public BoundCodeDt<ResourceTypeEnum> getTargetFirstRep() {
		if (getTarget().size() == 0) {
			addTarget();
		}
		return getTarget().get(0);
	}

	/**
	 * Add a value for <b>target</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Types of resource (if a resource is referenced)
     * </p> 
	 */
	public BoundCodeDt<ResourceTypeEnum> addTarget() {
		BoundCodeDt<ResourceTypeEnum> retVal = new BoundCodeDt<ResourceTypeEnum>(ResourceTypeEnum.VALUESET_BINDER);
		getTarget().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>target</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Types of resource (if a resource is referenced)
     * </p> 
	 */
	public RestResourceSearchParam setTarget(ResourceTypeEnum theValue) {
		getTarget().clear();
		addTarget(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>modifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A modifier supported for the search parameter
     * </p> 
	 */
	public java.util.List<BoundCodeDt<SearchModifierCodeEnum>> getModifier() {  
		if (myModifier == null) {
			myModifier = new java.util.ArrayList<BoundCodeDt<SearchModifierCodeEnum>>();
		}
		return myModifier;
	}

	/**
	 * Sets the value(s) for <b>modifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A modifier supported for the search parameter
     * </p> 
	 */
	public RestResourceSearchParam setModifier(java.util.List<BoundCodeDt<SearchModifierCodeEnum>> theValue) {
		myModifier = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>modifier</b> () using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addModifier()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * A modifier supported for the search parameter
     * </p> 
	 */
	public BoundCodeDt<SearchModifierCodeEnum> addModifier(SearchModifierCodeEnum theValue) {
		BoundCodeDt<SearchModifierCodeEnum> retVal = new BoundCodeDt<SearchModifierCodeEnum>(SearchModifierCodeEnum.VALUESET_BINDER, theValue);
		getModifier().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>modifier</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A modifier supported for the search parameter
     * </p> 
	 */
	public BoundCodeDt<SearchModifierCodeEnum> getModifierFirstRep() {
		if (getModifier().size() == 0) {
			addModifier();
		}
		return getModifier().get(0);
	}

	/**
	 * Add a value for <b>modifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A modifier supported for the search parameter
     * </p> 
	 */
	public BoundCodeDt<SearchModifierCodeEnum> addModifier() {
		BoundCodeDt<SearchModifierCodeEnum> retVal = new BoundCodeDt<SearchModifierCodeEnum>(SearchModifierCodeEnum.VALUESET_BINDER);
		getModifier().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>modifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A modifier supported for the search parameter
     * </p> 
	 */
	public RestResourceSearchParam setModifier(SearchModifierCodeEnum theValue) {
		getModifier().clear();
		addModifier(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>chain</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type
     * </p> 
	 */
	public java.util.List<StringDt> getChain() {  
		if (myChain == null) {
			myChain = new java.util.ArrayList<StringDt>();
		}
		return myChain;
	}

	/**
	 * Sets the value(s) for <b>chain</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type
     * </p> 
	 */
	public RestResourceSearchParam setChain(java.util.List<StringDt> theValue) {
		myChain = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>chain</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type
     * </p> 
	 */
	public StringDt addChain() {
		StringDt newType = new StringDt();
		getChain().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>chain</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type
	 * </p>
	 * @param theValue The chain to add (must not be <code>null</code>)
	 */
	public RestResourceSearchParam addChain(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getChain().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>chain</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type
     * </p> 
	 */
	public StringDt getChainFirstRep() {
		if (getChain().isEmpty()) {
			return addChain();
		}
		return getChain().get(0); 
	}
 	/**
	 * Adds a new value for <b>chain</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contains the names of any search parameters which may be chained to the containing search parameter. Chained parameters may be added to search parameters of type reference, and specify that resources will only be returned if they contain a reference to a resource which matches the chained parameter value. Values for this field should be drawn from Conformance.rest.resource.searchParam.name on the target resource type
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public RestResourceSearchParam addChain( String theString) {
		if (myChain == null) {
			myChain = new java.util.ArrayList<StringDt>();
		}
		myChain.add(new StringDt(theString));
		return this; 
	}

 


	}



	/**
	 * Block class for child element: <b>Conformance.rest.interaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A specification of restful operations supported by the system
     * </p> 
	 */
	@Block()	
	public static class RestInteraction 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A coded identifier of the operation, supported by the system"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/system-restful-interaction")
	private BoundCodeDt<SystemRestfulInteractionEnum> myCode;
	
	@Child(name="documentation", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented"
	)
	private StringDt myDocumentation;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myDocumentation);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myDocumentation);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A coded identifier of the operation, supported by the system
     * </p> 
	 */
	public BoundCodeDt<SystemRestfulInteractionEnum> getCodeElement() {  
		if (myCode == null) {
			myCode = new BoundCodeDt<SystemRestfulInteractionEnum>(SystemRestfulInteractionEnum.VALUESET_BINDER);
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
     * A coded identifier of the operation, supported by the system
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
     * A coded identifier of the operation, supported by the system
     * </p> 
	 */
	public RestInteraction setCode(BoundCodeDt<SystemRestfulInteractionEnum> theValue) {
		myCode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A coded identifier of the operation, supported by the system
     * </p> 
	 */
	public RestInteraction setCode(SystemRestfulInteractionEnum theValue) {
		setCode(new BoundCodeDt<SystemRestfulInteractionEnum>(SystemRestfulInteractionEnum.VALUESET_BINDER, theValue));
		
/*
		getCodeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>documentation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented
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
     * Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented
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
     * Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented
     * </p> 
	 */
	public RestInteraction setDocumentation(StringDt theValue) {
		myDocumentation = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>documentation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance specific to the implementation of this operation, such as limitations on the kind of transactions allowed, or information about system wide search is implemented
     * </p> 
	 */
	public RestInteraction setDocumentation( String theString) {
		myDocumentation = new StringDt(theString); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Conformance.rest.operation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Definition of an operation or a named query and with its parameters and their meaning and type
     * </p> 
	 */
	@Block()	
	public static class RestOperation 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=StringDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of a query, which is used in the _query parameter when the query is called"
	)
	private StringDt myName;
	
	@Child(name="definition", order=1, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.OperationDefinition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Where the formal definition can be found"
	)
	private ResourceReferenceDt myDefinition;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  myDefinition);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, myDefinition);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of a query, which is used in the _query parameter when the query is called
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
     * The name of a query, which is used in the _query parameter when the query is called
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
     * The name of a query, which is used in the _query parameter when the query is called
     * </p> 
	 */
	public RestOperation setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of a query, which is used in the _query parameter when the query is called
     * </p> 
	 */
	public RestOperation setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>definition</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Where the formal definition can be found
     * </p> 
	 */
	public ResourceReferenceDt getDefinition() {  
		if (myDefinition == null) {
			myDefinition = new ResourceReferenceDt();
		}
		return myDefinition;
	}

	/**
	 * Sets the value(s) for <b>definition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Where the formal definition can be found
     * </p> 
	 */
	public RestOperation setDefinition(ResourceReferenceDt theValue) {
		myDefinition = theValue;
		return this;
	}
	
	

  


	}



	/**
	 * Block class for child element: <b>Conformance.messaging</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the messaging capabilities of the solution
     * </p> 
	 */
	@Block()	
	public static class Messaging 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="endpoint", order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An endpoint (network accessible address) to which messages and/or replies are to be sent."
	)
	private java.util.List<MessagingEndpoint> myEndpoint;
	
	@Child(name="reliableCache", type=UnsignedIntDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender)"
	)
	private UnsignedIntDt myReliableCache;
	
	@Child(name="documentation", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner."
	)
	private StringDt myDocumentation;
	
	@Child(name="event", order=3, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A description of the solution's support for an event at this end-point."
	)
	private java.util.List<MessagingEvent> myEvent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myEndpoint,  myReliableCache,  myDocumentation,  myEvent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myEndpoint, myReliableCache, myDocumentation, myEvent);
	}

	/**
	 * Gets the value(s) for <b>endpoint</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An endpoint (network accessible address) to which messages and/or replies are to be sent.
     * </p> 
	 */
	public java.util.List<MessagingEndpoint> getEndpoint() {  
		if (myEndpoint == null) {
			myEndpoint = new java.util.ArrayList<MessagingEndpoint>();
		}
		return myEndpoint;
	}

	/**
	 * Sets the value(s) for <b>endpoint</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An endpoint (network accessible address) to which messages and/or replies are to be sent.
     * </p> 
	 */
	public Messaging setEndpoint(java.util.List<MessagingEndpoint> theValue) {
		myEndpoint = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>endpoint</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An endpoint (network accessible address) to which messages and/or replies are to be sent.
     * </p> 
	 */
	public MessagingEndpoint addEndpoint() {
		MessagingEndpoint newType = new MessagingEndpoint();
		getEndpoint().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>endpoint</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * An endpoint (network accessible address) to which messages and/or replies are to be sent.
	 * </p>
	 * @param theValue The endpoint to add (must not be <code>null</code>)
	 */
	public Messaging addEndpoint(MessagingEndpoint theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getEndpoint().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>endpoint</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * An endpoint (network accessible address) to which messages and/or replies are to be sent.
     * </p> 
	 */
	public MessagingEndpoint getEndpointFirstRep() {
		if (getEndpoint().isEmpty()) {
			return addEndpoint();
		}
		return getEndpoint().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>reliableCache</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender)
     * </p> 
	 */
	public UnsignedIntDt getReliableCacheElement() {  
		if (myReliableCache == null) {
			myReliableCache = new UnsignedIntDt();
		}
		return myReliableCache;
	}

	
	/**
	 * Gets the value(s) for <b>reliableCache</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender)
     * </p> 
	 */
	public Integer getReliableCache() {  
		return getReliableCacheElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>reliableCache</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender)
     * </p> 
	 */
	public Messaging setReliableCache(UnsignedIntDt theValue) {
		myReliableCache = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>reliableCache</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Length if the receiver's reliable messaging cache in minutes (if a receiver) or how long the cache length on the receiver should be (if a sender)
     * </p> 
	 */
	public Messaging setReliableCache( int theInteger) {
		myReliableCache = new UnsignedIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>documentation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.
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
     * Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.
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
     * Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.
     * </p> 
	 */
	public Messaging setDocumentation(StringDt theValue) {
		myDocumentation = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>documentation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Documentation about the system's messaging capabilities for this endpoint not otherwise documented by the conformance statement.  For example, process for becoming an authorized messaging exchange partner.
     * </p> 
	 */
	public Messaging setDocumentation( String theString) {
		myDocumentation = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>event</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the solution's support for an event at this end-point.
     * </p> 
	 */
	public java.util.List<MessagingEvent> getEvent() {  
		if (myEvent == null) {
			myEvent = new java.util.ArrayList<MessagingEvent>();
		}
		return myEvent;
	}

	/**
	 * Sets the value(s) for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the solution's support for an event at this end-point.
     * </p> 
	 */
	public Messaging setEvent(java.util.List<MessagingEvent> theValue) {
		myEvent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the solution's support for an event at this end-point.
     * </p> 
	 */
	public MessagingEvent addEvent() {
		MessagingEvent newType = new MessagingEvent();
		getEvent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>event</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A description of the solution's support for an event at this end-point.
	 * </p>
	 * @param theValue The event to add (must not be <code>null</code>)
	 */
	public Messaging addEvent(MessagingEvent theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getEvent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>event</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the solution's support for an event at this end-point.
     * </p> 
	 */
	public MessagingEvent getEventFirstRep() {
		if (getEvent().isEmpty()) {
			return addEvent();
		}
		return getEvent().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>Conformance.messaging.endpoint</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An endpoint (network accessible address) to which messages and/or replies are to be sent.
     * </p> 
	 */
	@Block()	
	public static class MessagingEndpoint 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="protocol", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of the messaging transport protocol(s) identifiers, supported by this endpoint"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/message-transport")
	private CodingDt myProtocol;
	
	@Child(name="address", type=UriDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier"
	)
	private UriDt myAddress;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myProtocol,  myAddress);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myProtocol, myAddress);
	}

	/**
	 * Gets the value(s) for <b>protocol</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of the messaging transport protocol(s) identifiers, supported by this endpoint
     * </p> 
	 */
	public CodingDt getProtocol() {  
		if (myProtocol == null) {
			myProtocol = new CodingDt();
		}
		return myProtocol;
	}

	/**
	 * Sets the value(s) for <b>protocol</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of the messaging transport protocol(s) identifiers, supported by this endpoint
     * </p> 
	 */
	public MessagingEndpoint setProtocol(CodingDt theValue) {
		myProtocol = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>address</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier
     * </p> 
	 */
	public UriDt getAddressElement() {  
		if (myAddress == null) {
			myAddress = new UriDt();
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
     * The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier
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
     * The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier
     * </p> 
	 */
	public MessagingEndpoint setAddress(UriDt theValue) {
		myAddress = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>address</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The network address of the end-point. For solutions that do not use network addresses for routing, it can be just an identifier
     * </p> 
	 */
	public MessagingEndpoint setAddress( String theUri) {
		myAddress = new UriDt(theUri); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Conformance.messaging.event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the solution's support for an event at this end-point.
     * </p> 
	 */
	@Block()	
	public static class MessagingEvent 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A coded identifier of a supported messaging event"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/message-events")
	private CodingDt myCode;
	
	@Child(name="category", type=CodeDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The impact of the content of the message"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/message-significance-category")
	private BoundCodeDt<MessageSignificanceCategoryEnum> myCategory;
	
	@Child(name="mode", type=CodeDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The mode of this event declaration - whether application is sender or receiver"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/message-conformance-event-mode")
	private BoundCodeDt<ConformanceEventModeEnum> myMode;
	
	@Child(name="focus", type=CodeDt.class, order=3, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A resource associated with the event.  This is the resource that defines the event."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
	private BoundCodeDt<ResourceTypeEnum> myFocus;
	
	@Child(name="request", order=4, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.StructureDefinition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Information about the request for this event"
	)
	private ResourceReferenceDt myRequest;
	
	@Child(name="response", order=5, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.StructureDefinition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Information about the response for this event"
	)
	private ResourceReferenceDt myResponse;
	
	@Child(name="documentation", type=StringDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Guidance on how this event is handled, such as internal system trigger points, business rules, etc."
	)
	private StringDt myDocumentation;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myCategory,  myMode,  myFocus,  myRequest,  myResponse,  myDocumentation);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myCategory, myMode, myFocus, myRequest, myResponse, myDocumentation);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A coded identifier of a supported messaging event
     * </p> 
	 */
	public CodingDt getCode() {  
		if (myCode == null) {
			myCode = new CodingDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A coded identifier of a supported messaging event
     * </p> 
	 */
	public MessagingEvent setCode(CodingDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>category</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The impact of the content of the message
     * </p> 
	 */
	public BoundCodeDt<MessageSignificanceCategoryEnum> getCategoryElement() {  
		if (myCategory == null) {
			myCategory = new BoundCodeDt<MessageSignificanceCategoryEnum>(MessageSignificanceCategoryEnum.VALUESET_BINDER);
		}
		return myCategory;
	}

	
	/**
	 * Gets the value(s) for <b>category</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The impact of the content of the message
     * </p> 
	 */
	public String getCategory() {  
		return getCategoryElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>category</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The impact of the content of the message
     * </p> 
	 */
	public MessagingEvent setCategory(BoundCodeDt<MessageSignificanceCategoryEnum> theValue) {
		myCategory = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>category</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The impact of the content of the message
     * </p> 
	 */
	public MessagingEvent setCategory(MessageSignificanceCategoryEnum theValue) {
		setCategory(new BoundCodeDt<MessageSignificanceCategoryEnum>(MessageSignificanceCategoryEnum.VALUESET_BINDER, theValue));
		
/*
		getCategoryElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>mode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The mode of this event declaration - whether application is sender or receiver
     * </p> 
	 */
	public BoundCodeDt<ConformanceEventModeEnum> getModeElement() {  
		if (myMode == null) {
			myMode = new BoundCodeDt<ConformanceEventModeEnum>(ConformanceEventModeEnum.VALUESET_BINDER);
		}
		return myMode;
	}

	
	/**
	 * Gets the value(s) for <b>mode</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The mode of this event declaration - whether application is sender or receiver
     * </p> 
	 */
	public String getMode() {  
		return getModeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The mode of this event declaration - whether application is sender or receiver
     * </p> 
	 */
	public MessagingEvent setMode(BoundCodeDt<ConformanceEventModeEnum> theValue) {
		myMode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The mode of this event declaration - whether application is sender or receiver
     * </p> 
	 */
	public MessagingEvent setMode(ConformanceEventModeEnum theValue) {
		setMode(new BoundCodeDt<ConformanceEventModeEnum>(ConformanceEventModeEnum.VALUESET_BINDER, theValue));
		
/*
		getModeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>focus</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A resource associated with the event.  This is the resource that defines the event.
     * </p> 
	 */
	public BoundCodeDt<ResourceTypeEnum> getFocusElement() {  
		if (myFocus == null) {
			myFocus = new BoundCodeDt<ResourceTypeEnum>(ResourceTypeEnum.VALUESET_BINDER);
		}
		return myFocus;
	}

	
	/**
	 * Gets the value(s) for <b>focus</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A resource associated with the event.  This is the resource that defines the event.
     * </p> 
	 */
	public String getFocus() {  
		return getFocusElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>focus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A resource associated with the event.  This is the resource that defines the event.
     * </p> 
	 */
	public MessagingEvent setFocus(BoundCodeDt<ResourceTypeEnum> theValue) {
		myFocus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>focus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A resource associated with the event.  This is the resource that defines the event.
     * </p> 
	 */
	public MessagingEvent setFocus(ResourceTypeEnum theValue) {
		setFocus(new BoundCodeDt<ResourceTypeEnum>(ResourceTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getFocusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>request</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the request for this event
     * </p> 
	 */
	public ResourceReferenceDt getRequest() {  
		if (myRequest == null) {
			myRequest = new ResourceReferenceDt();
		}
		return myRequest;
	}

	/**
	 * Sets the value(s) for <b>request</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the request for this event
     * </p> 
	 */
	public MessagingEvent setRequest(ResourceReferenceDt theValue) {
		myRequest = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>response</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the response for this event
     * </p> 
	 */
	public ResourceReferenceDt getResponse() {  
		if (myResponse == null) {
			myResponse = new ResourceReferenceDt();
		}
		return myResponse;
	}

	/**
	 * Sets the value(s) for <b>response</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about the response for this event
     * </p> 
	 */
	public MessagingEvent setResponse(ResourceReferenceDt theValue) {
		myResponse = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>documentation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
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
     * Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
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
     * Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
     * </p> 
	 */
	public MessagingEvent setDocumentation(StringDt theValue) {
		myDocumentation = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>documentation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance on how this event is handled, such as internal system trigger points, business rules, etc.
     * </p> 
	 */
	public MessagingEvent setDocumentation( String theString) {
		myDocumentation = new StringDt(theString); 
		return this; 
	}

 


	}



	/**
	 * Block class for child element: <b>Conformance.document</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A document definition
     * </p> 
	 */
	@Block()	
	public static class Document 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="mode", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Mode of this document declaration - whether application is producer or consumer"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/document-mode")
	private BoundCodeDt<DocumentModeEnum> myMode;
	
	@Child(name="documentation", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc."
	)
	private StringDt myDocumentation;
	
	@Child(name="profile", order=2, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.StructureDefinition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A constraint on a resource used in the document"
	)
	private ResourceReferenceDt myProfile;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myMode,  myDocumentation,  myProfile);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myMode, myDocumentation, myProfile);
	}

	/**
	 * Gets the value(s) for <b>mode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Mode of this document declaration - whether application is producer or consumer
     * </p> 
	 */
	public BoundCodeDt<DocumentModeEnum> getModeElement() {  
		if (myMode == null) {
			myMode = new BoundCodeDt<DocumentModeEnum>(DocumentModeEnum.VALUESET_BINDER);
		}
		return myMode;
	}

	
	/**
	 * Gets the value(s) for <b>mode</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Mode of this document declaration - whether application is producer or consumer
     * </p> 
	 */
	public String getMode() {  
		return getModeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Mode of this document declaration - whether application is producer or consumer
     * </p> 
	 */
	public Document setMode(BoundCodeDt<DocumentModeEnum> theValue) {
		myMode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Mode of this document declaration - whether application is producer or consumer
     * </p> 
	 */
	public Document setMode(DocumentModeEnum theValue) {
		setMode(new BoundCodeDt<DocumentModeEnum>(DocumentModeEnum.VALUESET_BINDER, theValue));
		
/*
		getModeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>documentation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.
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
     * A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.
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
     * A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.
     * </p> 
	 */
	public Document setDocumentation(StringDt theValue) {
		myDocumentation = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>documentation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of how the application supports or uses the specified document profile.  For example, when are documents created, what action is taken with consumed documents, etc.
     * </p> 
	 */
	public Document setDocumentation( String theString) {
		myDocumentation = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>profile</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A constraint on a resource used in the document
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
     * A constraint on a resource used in the document
     * </p> 
	 */
	public Document setProfile(ResourceReferenceDt theValue) {
		myProfile = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "Conformance";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
