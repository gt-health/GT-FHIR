















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
 * HAPI/FHIR <b>Questionnaire</b> Resource
 * (infrastructure.information)
 *
 * <p>
 * <b>Definition:</b>
 * A structured set of questions intended to guide the collection of answers. The questions are ordered and grouped into coherent subsets, corresponding to the structure of the grouping of the underlying questions
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * To support structured, hierarchical registration of data gathered using digital forms and other questionnaires.
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Questionnaire">http://hl7.org/fhir/profiles/Questionnaire</a> 
 * </p>
 *
 */
@ResourceDef(name="Questionnaire", profile="http://hl7.org/fhir/profiles/Questionnaire", id="questionnaire")
public class Questionnaire extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the questionnaire</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Questionnaire.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="Questionnaire.status", description="The status of the questionnaire", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the questionnaire</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Questionnaire.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>When the questionnaire was last changed</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Questionnaire.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="Questionnaire.date", description="When the questionnaire was last changed", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>When the questionnaire was last changed</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Questionnaire.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b>The author of the questionnaire</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Questionnaire.publisher</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="publisher", path="Questionnaire.publisher", description="The author of the questionnaire", type="string"  )
	public static final String SP_PUBLISHER = "publisher";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b>The author of the questionnaire</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Questionnaire.publisher</b><br>
	 * </p>
	 */
	public static final StringClientParam PUBLISHER = new StringClientParam(SP_PUBLISHER);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>An identifier for the questionnaire</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Questionnaire.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Questionnaire.identifier", description="An identifier for the questionnaire", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>An identifier for the questionnaire</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Questionnaire.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b>The business version of the questionnaire</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Questionnaire.version</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="version", path="Questionnaire.version", description="The business version of the questionnaire", type="string"  )
	public static final String SP_VERSION = "version";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b>The business version of the questionnaire</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Questionnaire.version</b><br>
	 * </p>
	 */
	public static final StringClientParam VERSION = new StringClientParam(SP_VERSION);

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>A code that corresponds to the questionnaire or one of its groups</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Questionnaire.group.concept</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="Questionnaire.group.concept", description="A code that corresponds to the questionnaire or one of its groups", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>A code that corresponds to the questionnaire or one of its groups</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Questionnaire.group.concept</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>title</b>
	 * <p>
	 * Description: <b>All or part of the name of the questionnaire (title for the root group of the questionnaire)</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Questionnaire.group.title</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="title", path="Questionnaire.group.title", description="All or part of the name of the questionnaire (title for the root group of the questionnaire)", type="string"  )
	public static final String SP_TITLE = "title";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>title</b>
	 * <p>
	 * Description: <b>All or part of the name of the questionnaire (title for the root group of the questionnaire)</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Questionnaire.group.title</b><br>
	 * </p>
	 */
	public static final StringClientParam TITLE = new StringClientParam(SP_TITLE);



	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="version", type=StringDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="id.version",
		formalDefinition="The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated"
	)
	private StringDt myVersion;
	
	@Child(name="status", type=CodeDt.class, order=2, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The lifecycle status of the questionnaire as a whole."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/questionnaire-status")
	private BoundCodeDt<QuestionnaireStatusEnum> myStatus;
	
	@Child(name="date", type=DateTimeDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date that this questionnaire was last changed"
	)
	private DateTimeDt myDate;
	
	@Child(name="publisher", type=StringDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="who.witness",
		formalDefinition="Organization or person responsible for developing and maintaining the questionnaire"
	)
	private StringDt myPublisher;
	
	@Child(name="telecom", type=ContactPointDt.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contact details to assist a user in finding and communicating with the publisher"
	)
	private java.util.List<ContactPointDt> myTelecom;
	
	@Child(name="subjectType", type=CodeDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the types of subjects that can be the subject of the questionnaire."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
	private java.util.List<BoundCodeDt<ResourceTypeEnum>> mySubjectType;
	
	@Child(name="group", order=7, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A collection of related questions (or further groupings of questions)"
	)
	private Group myGroup;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myVersion,  myStatus,  myDate,  myPublisher,  myTelecom,  mySubjectType,  myGroup);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myVersion, myStatus, myDate, myPublisher, myTelecom, mySubjectType, myGroup);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
     * This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public Questionnaire setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
	 * This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Questionnaire addIdentifier(IdentifierDt theValue) {
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
     * This records identifiers associated with this question set that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>version</b> (id.version).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated
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
     * The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated
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
     * The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated
     * </p> 
	 */
	public Questionnaire setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>version</b> (id.version)
	 *
     * <p>
     * <b>Definition:</b>
     * The version number assigned by the publisher for business reasons.  It may remain the same when the resource is updated
     * </p> 
	 */
	public Questionnaire setVersion( String theString) {
		myVersion = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The lifecycle status of the questionnaire as a whole.
     * </p> 
	 */
	public BoundCodeDt<QuestionnaireStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<QuestionnaireStatusEnum>(QuestionnaireStatusEnum.VALUESET_BINDER);
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
     * The lifecycle status of the questionnaire as a whole.
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
     * The lifecycle status of the questionnaire as a whole.
     * </p> 
	 */
	public Questionnaire setStatus(BoundCodeDt<QuestionnaireStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The lifecycle status of the questionnaire as a whole.
     * </p> 
	 */
	public Questionnaire setStatus(QuestionnaireStatusEnum theValue) {
		setStatus(new BoundCodeDt<QuestionnaireStatusEnum>(QuestionnaireStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>date</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date that this questionnaire was last changed
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
     * The date that this questionnaire was last changed
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
     * The date that this questionnaire was last changed
     * </p> 
	 */
	public Questionnaire setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date that this questionnaire was last changed
     * </p> 
	 */
	public Questionnaire setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date that this questionnaire was last changed
     * </p> 
	 */
	public Questionnaire setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>publisher</b> (who.witness).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Organization or person responsible for developing and maintaining the questionnaire
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
     * Organization or person responsible for developing and maintaining the questionnaire
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
     * Organization or person responsible for developing and maintaining the questionnaire
     * </p> 
	 */
	public Questionnaire setPublisher(StringDt theValue) {
		myPublisher = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>publisher</b> (who.witness)
	 *
     * <p>
     * <b>Definition:</b>
     * Organization or person responsible for developing and maintaining the questionnaire
     * </p> 
	 */
	public Questionnaire setPublisher( String theString) {
		myPublisher = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>telecom</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contact details to assist a user in finding and communicating with the publisher
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
     * Contact details to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public Questionnaire setTelecom(java.util.List<ContactPointDt> theValue) {
		myTelecom = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>telecom</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contact details to assist a user in finding and communicating with the publisher
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
	 * Contact details to assist a user in finding and communicating with the publisher
	 * </p>
	 * @param theValue The telecom to add (must not be <code>null</code>)
	 */
	public Questionnaire addTelecom(ContactPointDt theValue) {
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
     * Contact details to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public ContactPointDt getTelecomFirstRep() {
		if (getTelecom().isEmpty()) {
			return addTelecom();
		}
		return getTelecom().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>subjectType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the types of subjects that can be the subject of the questionnaire.
     * </p> 
	 */
	public java.util.List<BoundCodeDt<ResourceTypeEnum>> getSubjectType() {  
		if (mySubjectType == null) {
			mySubjectType = new java.util.ArrayList<BoundCodeDt<ResourceTypeEnum>>();
		}
		return mySubjectType;
	}

	/**
	 * Sets the value(s) for <b>subjectType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the types of subjects that can be the subject of the questionnaire.
     * </p> 
	 */
	public Questionnaire setSubjectType(java.util.List<BoundCodeDt<ResourceTypeEnum>> theValue) {
		mySubjectType = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>subjectType</b> () using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addSubjectType()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the types of subjects that can be the subject of the questionnaire.
     * </p> 
	 */
	public BoundCodeDt<ResourceTypeEnum> addSubjectType(ResourceTypeEnum theValue) {
		BoundCodeDt<ResourceTypeEnum> retVal = new BoundCodeDt<ResourceTypeEnum>(ResourceTypeEnum.VALUESET_BINDER, theValue);
		getSubjectType().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>subjectType</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the types of subjects that can be the subject of the questionnaire.
     * </p> 
	 */
	public BoundCodeDt<ResourceTypeEnum> getSubjectTypeFirstRep() {
		if (getSubjectType().size() == 0) {
			addSubjectType();
		}
		return getSubjectType().get(0);
	}

	/**
	 * Add a value for <b>subjectType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the types of subjects that can be the subject of the questionnaire.
     * </p> 
	 */
	public BoundCodeDt<ResourceTypeEnum> addSubjectType() {
		BoundCodeDt<ResourceTypeEnum> retVal = new BoundCodeDt<ResourceTypeEnum>(ResourceTypeEnum.VALUESET_BINDER);
		getSubjectType().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>subjectType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the types of subjects that can be the subject of the questionnaire.
     * </p> 
	 */
	public Questionnaire setSubjectType(ResourceTypeEnum theValue) {
		getSubjectType().clear();
		addSubjectType(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>group</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A collection of related questions (or further groupings of questions)
     * </p> 
	 */
	public Group getGroup() {  
		if (myGroup == null) {
			myGroup = new Group();
		}
		return myGroup;
	}

	/**
	 * Sets the value(s) for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A collection of related questions (or further groupings of questions)
     * </p> 
	 */
	public Questionnaire setGroup(Group theValue) {
		myGroup = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>Questionnaire.group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A collection of related questions (or further groupings of questions)
     * </p> 
	 */
	@Block()	
	public static class Group 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="linkId", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource."
	)
	private StringDt myLinkId;
	
	@Child(name="title", type=StringDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The human-readable name for this section of the questionnaire"
	)
	private StringDt myTitle;
	
	@Child(name="concept", type=CodingDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a how this group of questions is known in a particular terminology such as LOINC."
	)
	private java.util.List<CodingDt> myConcept;
	
	@Child(name="text", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional text for the group, used for display purposes"
	)
	private StringDt myText;
	
	@Child(name="required", type=BooleanDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire."
	)
	private BooleanDt myRequired;
	
	@Child(name="repeats", type=BooleanDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Whether the group may occur multiple times in the instance, containing multiple sets of answers"
	)
	private BooleanDt myRepeats;
	
	@Child(name="group", type=Group.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A sub-group within a group. The ordering of groups within this group is relevant"
	)
	private java.util.List<Group> myGroup;
	
	@Child(name="question", order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Set of questions within this group. The order of questions within the group is relevant"
	)
	private java.util.List<GroupQuestion> myQuestion;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLinkId,  myTitle,  myConcept,  myText,  myRequired,  myRepeats,  myGroup,  myQuestion);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLinkId, myTitle, myConcept, myText, myRequired, myRepeats, myGroup, myQuestion);
	}

	/**
	 * Gets the value(s) for <b>linkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.
     * </p> 
	 */
	public StringDt getLinkIdElement() {  
		if (myLinkId == null) {
			myLinkId = new StringDt();
		}
		return myLinkId;
	}

	
	/**
	 * Gets the value(s) for <b>linkId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.
     * </p> 
	 */
	public String getLinkId() {  
		return getLinkIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>linkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.
     * </p> 
	 */
	public Group setLinkId(StringDt theValue) {
		myLinkId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>linkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that is unique within the Questionnaire allowing linkage to the equivalent group in a QuestionnaireResponse resource.
     * </p> 
	 */
	public Group setLinkId( String theString) {
		myLinkId = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>title</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The human-readable name for this section of the questionnaire
     * </p> 
	 */
	public StringDt getTitleElement() {  
		if (myTitle == null) {
			myTitle = new StringDt();
		}
		return myTitle;
	}

	
	/**
	 * Gets the value(s) for <b>title</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The human-readable name for this section of the questionnaire
     * </p> 
	 */
	public String getTitle() {  
		return getTitleElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>title</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The human-readable name for this section of the questionnaire
     * </p> 
	 */
	public Group setTitle(StringDt theValue) {
		myTitle = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>title</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The human-readable name for this section of the questionnaire
     * </p> 
	 */
	public Group setTitle( String theString) {
		myTitle = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>concept</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a how this group of questions is known in a particular terminology such as LOINC.
     * </p> 
	 */
	public java.util.List<CodingDt> getConcept() {  
		if (myConcept == null) {
			myConcept = new java.util.ArrayList<CodingDt>();
		}
		return myConcept;
	}

	/**
	 * Sets the value(s) for <b>concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a how this group of questions is known in a particular terminology such as LOINC.
     * </p> 
	 */
	public Group setConcept(java.util.List<CodingDt> theValue) {
		myConcept = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a how this group of questions is known in a particular terminology such as LOINC.
     * </p> 
	 */
	public CodingDt addConcept() {
		CodingDt newType = new CodingDt();
		getConcept().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>concept</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identifies a how this group of questions is known in a particular terminology such as LOINC.
	 * </p>
	 * @param theValue The concept to add (must not be <code>null</code>)
	 */
	public Group addConcept(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getConcept().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>concept</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a how this group of questions is known in a particular terminology such as LOINC.
     * </p> 
	 */
	public CodingDt getConceptFirstRep() {
		if (getConcept().isEmpty()) {
			return addConcept();
		}
		return getConcept().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional text for the group, used for display purposes
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
     * Additional text for the group, used for display purposes
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
     * Additional text for the group, used for display purposes
     * </p> 
	 */
	public Group setText(StringDt theValue) {
		myText = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional text for the group, used for display purposes
     * </p> 
	 */
	public Group setText( String theString) {
		myText = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>required</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.
     * </p> 
	 */
	public BooleanDt getRequiredElement() {  
		if (myRequired == null) {
			myRequired = new BooleanDt();
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
     * If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.
     * </p> 
	 */
	public Boolean getRequired() {  
		return getRequiredElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>required</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.
     * </p> 
	 */
	public Group setRequired(BooleanDt theValue) {
		myRequired = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>required</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true, indicates that the group must be present and have required questions within it answered.  If false, the group may be skipped when answering the questionnaire.
     * </p> 
	 */
	public Group setRequired( boolean theBoolean) {
		myRequired = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>repeats</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether the group may occur multiple times in the instance, containing multiple sets of answers
     * </p> 
	 */
	public BooleanDt getRepeatsElement() {  
		if (myRepeats == null) {
			myRepeats = new BooleanDt();
		}
		return myRepeats;
	}

	
	/**
	 * Gets the value(s) for <b>repeats</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether the group may occur multiple times in the instance, containing multiple sets of answers
     * </p> 
	 */
	public Boolean getRepeats() {  
		return getRepeatsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>repeats</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether the group may occur multiple times in the instance, containing multiple sets of answers
     * </p> 
	 */
	public Group setRepeats(BooleanDt theValue) {
		myRepeats = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>repeats</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether the group may occur multiple times in the instance, containing multiple sets of answers
     * </p> 
	 */
	public Group setRepeats( boolean theBoolean) {
		myRepeats = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>group</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A sub-group within a group. The ordering of groups within this group is relevant
     * </p> 
	 */
	public java.util.List<Group> getGroup() {  
		if (myGroup == null) {
			myGroup = new java.util.ArrayList<Group>();
		}
		return myGroup;
	}

	/**
	 * Sets the value(s) for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A sub-group within a group. The ordering of groups within this group is relevant
     * </p> 
	 */
	public Group setGroup(java.util.List<Group> theValue) {
		myGroup = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A sub-group within a group. The ordering of groups within this group is relevant
     * </p> 
	 */
	public Group addGroup() {
		Group newType = new Group();
		getGroup().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>group</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A sub-group within a group. The ordering of groups within this group is relevant
	 * </p>
	 * @param theValue The group to add (must not be <code>null</code>)
	 */
	public Group addGroup(Group theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getGroup().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>group</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A sub-group within a group. The ordering of groups within this group is relevant
     * </p> 
	 */
	public Group getGroupFirstRep() {
		if (getGroup().isEmpty()) {
			return addGroup();
		}
		return getGroup().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>question</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Set of questions within this group. The order of questions within the group is relevant
     * </p> 
	 */
	public java.util.List<GroupQuestion> getQuestion() {  
		if (myQuestion == null) {
			myQuestion = new java.util.ArrayList<GroupQuestion>();
		}
		return myQuestion;
	}

	/**
	 * Sets the value(s) for <b>question</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Set of questions within this group. The order of questions within the group is relevant
     * </p> 
	 */
	public Group setQuestion(java.util.List<GroupQuestion> theValue) {
		myQuestion = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>question</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Set of questions within this group. The order of questions within the group is relevant
     * </p> 
	 */
	public GroupQuestion addQuestion() {
		GroupQuestion newType = new GroupQuestion();
		getQuestion().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>question</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Set of questions within this group. The order of questions within the group is relevant
	 * </p>
	 * @param theValue The question to add (must not be <code>null</code>)
	 */
	public Group addQuestion(GroupQuestion theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getQuestion().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>question</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Set of questions within this group. The order of questions within the group is relevant
     * </p> 
	 */
	public GroupQuestion getQuestionFirstRep() {
		if (getQuestion().isEmpty()) {
			return addQuestion();
		}
		return getQuestion().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>Questionnaire.group.question</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Set of questions within this group. The order of questions within the group is relevant
     * </p> 
	 */
	@Block()	
	public static class GroupQuestion 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="linkId", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource."
	)
	private StringDt myLinkId;
	
	@Child(name="concept", type=CodingDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a how this question is known in a particular terminology such as LOINC."
	)
	private java.util.List<CodingDt> myConcept;
	
	@Child(name="text", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The actual question as shown to the user to prompt them for an answer."
	)
	private StringDt myText;
	
	@Child(name="type", type=CodeDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/answer-format")
	private BoundCodeDt<AnswerFormatEnum> myType;
	
	@Child(name="required", type=BooleanDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire."
	)
	private BooleanDt myRequired;
	
	@Child(name="repeats", type=BooleanDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If true, the question may have more than one answer."
	)
	private BooleanDt myRepeats;
	
	@Child(name="options", order=6, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.ValueSet.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Reference to a value set containing a list of codes representing permitted answers for the question"
	)
	private ResourceReferenceDt myOptions;
	
	@Child(name="option", type=CodingDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="For a \"choice\" question, identifies one of the permitted answers for the question."
	)
	private java.util.List<CodingDt> myOption;
	
	@Child(name="group", type=Group.class, order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Nested group, containing nested question for this question. The order of groups within the question is relevant"
	)
	private java.util.List<Group> myGroup;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLinkId,  myConcept,  myText,  myType,  myRequired,  myRepeats,  myOptions,  myOption,  myGroup);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLinkId, myConcept, myText, myType, myRequired, myRepeats, myOptions, myOption, myGroup);
	}

	/**
	 * Gets the value(s) for <b>linkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.
     * </p> 
	 */
	public StringDt getLinkIdElement() {  
		if (myLinkId == null) {
			myLinkId = new StringDt();
		}
		return myLinkId;
	}

	
	/**
	 * Gets the value(s) for <b>linkId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.
     * </p> 
	 */
	public String getLinkId() {  
		return getLinkIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>linkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.
     * </p> 
	 */
	public GroupQuestion setLinkId(StringDt theValue) {
		myLinkId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>linkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that is unique within the questionnaire allowing linkage to the equivalent group in a [[[QuestionnaireResponse]]] resource.
     * </p> 
	 */
	public GroupQuestion setLinkId( String theString) {
		myLinkId = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>concept</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a how this question is known in a particular terminology such as LOINC.
     * </p> 
	 */
	public java.util.List<CodingDt> getConcept() {  
		if (myConcept == null) {
			myConcept = new java.util.ArrayList<CodingDt>();
		}
		return myConcept;
	}

	/**
	 * Sets the value(s) for <b>concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a how this question is known in a particular terminology such as LOINC.
     * </p> 
	 */
	public GroupQuestion setConcept(java.util.List<CodingDt> theValue) {
		myConcept = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a how this question is known in a particular terminology such as LOINC.
     * </p> 
	 */
	public CodingDt addConcept() {
		CodingDt newType = new CodingDt();
		getConcept().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>concept</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identifies a how this question is known in a particular terminology such as LOINC.
	 * </p>
	 * @param theValue The concept to add (must not be <code>null</code>)
	 */
	public GroupQuestion addConcept(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getConcept().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>concept</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a how this question is known in a particular terminology such as LOINC.
     * </p> 
	 */
	public CodingDt getConceptFirstRep() {
		if (getConcept().isEmpty()) {
			return addConcept();
		}
		return getConcept().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual question as shown to the user to prompt them for an answer.
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
     * The actual question as shown to the user to prompt them for an answer.
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
     * The actual question as shown to the user to prompt them for an answer.
     * </p> 
	 */
	public GroupQuestion setText(StringDt theValue) {
		myText = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual question as shown to the user to prompt them for an answer.
     * </p> 
	 */
	public GroupQuestion setText( String theString) {
		myText = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected
     * </p> 
	 */
	public BoundCodeDt<AnswerFormatEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<AnswerFormatEnum>(AnswerFormatEnum.VALUESET_BINDER);
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
     * The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected
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
     * The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected
     * </p> 
	 */
	public GroupQuestion setType(BoundCodeDt<AnswerFormatEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The expected format of the answer, e.g. the type of input (string, integer) or whether a (multiple) choice is expected
     * </p> 
	 */
	public GroupQuestion setType(AnswerFormatEnum theValue) {
		setType(new BoundCodeDt<AnswerFormatEnum>(AnswerFormatEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>required</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.
     * </p> 
	 */
	public BooleanDt getRequiredElement() {  
		if (myRequired == null) {
			myRequired = new BooleanDt();
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
     * If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.
     * </p> 
	 */
	public Boolean getRequired() {  
		return getRequiredElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>required</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.
     * </p> 
	 */
	public GroupQuestion setRequired(BooleanDt theValue) {
		myRequired = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>required</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true, indicates that the question must be answered and have required groups within it also present.  If false, the question and any contained groups may be skipped when answering the questionnaire.
     * </p> 
	 */
	public GroupQuestion setRequired( boolean theBoolean) {
		myRequired = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>repeats</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If true, the question may have more than one answer.
     * </p> 
	 */
	public BooleanDt getRepeatsElement() {  
		if (myRepeats == null) {
			myRepeats = new BooleanDt();
		}
		return myRepeats;
	}

	
	/**
	 * Gets the value(s) for <b>repeats</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If true, the question may have more than one answer.
     * </p> 
	 */
	public Boolean getRepeats() {  
		return getRepeatsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>repeats</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true, the question may have more than one answer.
     * </p> 
	 */
	public GroupQuestion setRepeats(BooleanDt theValue) {
		myRepeats = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>repeats</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true, the question may have more than one answer.
     * </p> 
	 */
	public GroupQuestion setRepeats( boolean theBoolean) {
		myRepeats = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>options</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to a value set containing a list of codes representing permitted answers for the question
     * </p> 
	 */
	public ResourceReferenceDt getOptions() {  
		if (myOptions == null) {
			myOptions = new ResourceReferenceDt();
		}
		return myOptions;
	}

	/**
	 * Sets the value(s) for <b>options</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to a value set containing a list of codes representing permitted answers for the question
     * </p> 
	 */
	public GroupQuestion setOptions(ResourceReferenceDt theValue) {
		myOptions = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>option</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * For a \&quot;choice\&quot; question, identifies one of the permitted answers for the question.
     * </p> 
	 */
	public java.util.List<CodingDt> getOption() {  
		if (myOption == null) {
			myOption = new java.util.ArrayList<CodingDt>();
		}
		return myOption;
	}

	/**
	 * Sets the value(s) for <b>option</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * For a \&quot;choice\&quot; question, identifies one of the permitted answers for the question.
     * </p> 
	 */
	public GroupQuestion setOption(java.util.List<CodingDt> theValue) {
		myOption = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>option</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * For a \&quot;choice\&quot; question, identifies one of the permitted answers for the question.
     * </p> 
	 */
	public CodingDt addOption() {
		CodingDt newType = new CodingDt();
		getOption().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>option</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * For a \&quot;choice\&quot; question, identifies one of the permitted answers for the question.
	 * </p>
	 * @param theValue The option to add (must not be <code>null</code>)
	 */
	public GroupQuestion addOption(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getOption().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>option</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * For a \&quot;choice\&quot; question, identifies one of the permitted answers for the question.
     * </p> 
	 */
	public CodingDt getOptionFirstRep() {
		if (getOption().isEmpty()) {
			return addOption();
		}
		return getOption().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>group</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Nested group, containing nested question for this question. The order of groups within the question is relevant
     * </p> 
	 */
	public java.util.List<Group> getGroup() {  
		if (myGroup == null) {
			myGroup = new java.util.ArrayList<Group>();
		}
		return myGroup;
	}

	/**
	 * Sets the value(s) for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Nested group, containing nested question for this question. The order of groups within the question is relevant
     * </p> 
	 */
	public GroupQuestion setGroup(java.util.List<Group> theValue) {
		myGroup = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Nested group, containing nested question for this question. The order of groups within the question is relevant
     * </p> 
	 */
	public Group addGroup() {
		Group newType = new Group();
		getGroup().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>group</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Nested group, containing nested question for this question. The order of groups within the question is relevant
	 * </p>
	 * @param theValue The group to add (must not be <code>null</code>)
	 */
	public GroupQuestion addGroup(Group theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getGroup().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>group</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Nested group, containing nested question for this question. The order of groups within the question is relevant
     * </p> 
	 */
	public Group getGroupFirstRep() {
		if (getGroup().isEmpty()) {
			return addGroup();
		}
		return getGroup().get(0); 
	}
  


	}





    @Override
    public String getResourceName() {
        return "Questionnaire";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
