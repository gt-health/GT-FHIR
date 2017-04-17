















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
 * HAPI/FHIR <b>ImplementationGuide</b> Resource
 * (conformance.misc)
 *
 * <p>
 * <b>Definition:</b>
 * A set of rules or how FHIR is used to solve a particular problem. This resource is used to gather all the parts of an implementation guide into a logical whole, and to publish a computable definition of all the parts
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * An implementation guide is able to define default profiles that must apply to any use of a resource, so validation services may need to take one or more implementation guide resources when validating.
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/ImplementationGuide">http://hl7.org/fhir/profiles/ImplementationGuide</a> 
 * </p>
 *
 */
@ResourceDef(name="ImplementationGuide", profile="http://hl7.org/fhir/profiles/ImplementationGuide", id="implementationguide")
public class ImplementationGuide extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImplementationGuide.url</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="url", path="ImplementationGuide.url", description="", type="uri"  )
	public static final String SP_URL = "url";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImplementationGuide.url</b><br>
	 * </p>
	 */
	public static final UriClientParam URL = new UriClientParam(SP_URL);

	/**
	 * Search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b>The version identifier of the implementation guide</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImplementationGuide.version</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="version", path="ImplementationGuide.version", description="The version identifier of the implementation guide", type="token"  )
	public static final String SP_VERSION = "version";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b>The version identifier of the implementation guide</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImplementationGuide.version</b><br>
	 * </p>
	 */
	public static final TokenClientParam VERSION = new TokenClientParam(SP_VERSION);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>Name of the implementation guide</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ImplementationGuide.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="ImplementationGuide.name", description="Name of the implementation guide", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>Name of the implementation guide</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ImplementationGuide.name</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b>Name of the publisher of the implementation guide</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ImplementationGuide.publisher</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="publisher", path="ImplementationGuide.publisher", description="Name of the publisher of the implementation guide", type="string"  )
	public static final String SP_PUBLISHER = "publisher";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b>Name of the publisher of the implementation guide</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ImplementationGuide.publisher</b><br>
	 * </p>
	 */
	public static final StringClientParam PUBLISHER = new StringClientParam(SP_PUBLISHER);

	/**
	 * Search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b>Text search in the description of the implementation guide</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ImplementationGuide.description</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="description", path="ImplementationGuide.description", description="Text search in the description of the implementation guide", type="string"  )
	public static final String SP_DESCRIPTION = "description";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b>Text search in the description of the implementation guide</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ImplementationGuide.description</b><br>
	 * </p>
	 */
	public static final StringClientParam DESCRIPTION = new StringClientParam(SP_DESCRIPTION);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The current status of the implementation guide</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImplementationGuide.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="ImplementationGuide.status", description="The current status of the implementation guide", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The current status of the implementation guide</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImplementationGuide.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The implementation guide publication date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ImplementationGuide.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="ImplementationGuide.date", description="The implementation guide publication date", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The implementation guide publication date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ImplementationGuide.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>context</b>
	 * <p>
	 * Description: <b>A use context assigned to the structure</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImplementationGuide.useContext</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="context", path="ImplementationGuide.useContext", description="A use context assigned to the structure", type="token"  )
	public static final String SP_CONTEXT = "context";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>context</b>
	 * <p>
	 * Description: <b>A use context assigned to the structure</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImplementationGuide.useContext</b><br>
	 * </p>
	 */
	public static final TokenClientParam CONTEXT = new TokenClientParam(SP_CONTEXT);

	/**
	 * Search parameter constant for <b>experimental</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImplementationGuide.experimental</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="experimental", path="ImplementationGuide.experimental", description="", type="token"  )
	public static final String SP_EXPERIMENTAL = "experimental";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>experimental</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImplementationGuide.experimental</b><br>
	 * </p>
	 */
	public static final TokenClientParam EXPERIMENTAL = new TokenClientParam(SP_EXPERIMENTAL);

	/**
	 * Search parameter constant for <b>dependency</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImplementationGuide.dependency.uri</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="dependency", path="ImplementationGuide.dependency.uri", description="", type="uri"  )
	public static final String SP_DEPENDENCY = "dependency";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>dependency</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImplementationGuide.dependency.uri</b><br>
	 * </p>
	 */
	public static final UriClientParam DEPENDENCY = new UriClientParam(SP_DEPENDENCY);



	@Child(name="url", type=UriDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="An absolute URL that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published"
	)
	private UriDt myUrl;
	
	@Child(name="version", type=StringDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="id.version",
		formalDefinition="The identifier that is used to identify this version of the Implementation Guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Implementation Guide author manually"
	)
	private StringDt myVersion;
	
	@Child(name="name", type=StringDt.class, order=2, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A free text natural language name identifying the Implementation Guide"
	)
	private StringDt myName;
	
	@Child(name="status", type=CodeDt.class, order=3, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="status",
		formalDefinition="The status of the Implementation Guide"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/conformance-resource-status")
	private BoundCodeDt<ConformanceResourceStatusEnum> myStatus;
	
	@Child(name="experimental", type=BooleanDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="This Implementation Guide was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage"
	)
	private BooleanDt myExperimental;
	
	@Child(name="publisher", type=StringDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="who.witness",
		formalDefinition="The name of the individual or organization that published the implementation guide"
	)
	private StringDt myPublisher;
	
	@Child(name="contact", order=6, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contacts to assist a user in finding and communicating with the publisher"
	)
	private java.util.List<Contact> myContact;
	
	@Child(name="date", type=DateTimeDt.class, order=7, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes"
	)
	private DateTimeDt myDate;
	
	@Child(name="description", type=StringDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A free text natural language description of the Implementation Guide and its use"
	)
	private StringDt myDescription;
	
	@Child(name="useContext", type=CodeableConceptDt.class, order=9, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of implementation guides. The most common use of this element is to represent the country / jurisdiction for which this implementation guide was defined"
	)
	private java.util.List<CodeableConceptDt> myUseContext;
	
	@Child(name="copyright", type=StringDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings"
	)
	private StringDt myCopyright;
	
	@Child(name="fhirVersion", type=IdDt.class, order=11, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is $version$ for this version"
	)
	private IdDt myFhirVersion;
	
	@Child(name="dependency", order=12, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides"
	)
	private java.util.List<Dependency> myDependency;
	
	@Child(name="package", order=13, min=1, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A logical group of resources. Logical groups can be used when building pages"
	)
	private java.util.List<Package> myPackage;
	
	@Child(name="global", order=14, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A set of profiles that all resources covered by this implementation guide must conform to"
	)
	private java.util.List<Global> myGlobal;
	
	@Child(name="binary", type=UriDt.class, order=15, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A binary file that is included in the  implementation guide when it is published"
	)
	private java.util.List<UriDt> myBinary;
	
	@Child(name="page", order=16, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A page / section in the implementation guide. The root page is the implementation guide home page"
	)
	private Page myPage;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myUrl,  myVersion,  myName,  myStatus,  myExperimental,  myPublisher,  myContact,  myDate,  myDescription,  myUseContext,  myCopyright,  myFhirVersion,  myDependency,  myPackage,  myGlobal,  myBinary,  myPage);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myUrl, myVersion, myName, myStatus, myExperimental, myPublisher, myContact, myDate, myDescription, myUseContext, myCopyright, myFhirVersion, myDependency, myPackage, myGlobal, myBinary, myPage);
	}

	/**
	 * Gets the value(s) for <b>url</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published
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
     * An absolute URL that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published
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
     * An absolute URL that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published
     * </p> 
	 */
	public ImplementationGuide setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this implementation guide when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this implementation guide is (or will be) published
     * </p> 
	 */
	public ImplementationGuide setUrl( String theUri) {
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
     * The identifier that is used to identify this version of the Implementation Guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Implementation Guide author manually
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
     * The identifier that is used to identify this version of the Implementation Guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Implementation Guide author manually
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
     * The identifier that is used to identify this version of the Implementation Guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Implementation Guide author manually
     * </p> 
	 */
	public ImplementationGuide setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>version</b> (id.version)
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the Implementation Guide when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the Implementation Guide author manually
     * </p> 
	 */
	public ImplementationGuide setVersion( String theString) {
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
     * A free text natural language name identifying the Implementation Guide
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
     * A free text natural language name identifying the Implementation Guide
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
     * A free text natural language name identifying the Implementation Guide
     * </p> 
	 */
	public ImplementationGuide setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language name identifying the Implementation Guide
     * </p> 
	 */
	public ImplementationGuide setName( String theString) {
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
     * The status of the Implementation Guide
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
     * The status of the Implementation Guide
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
     * The status of the Implementation Guide
     * </p> 
	 */
	public ImplementationGuide setStatus(BoundCodeDt<ConformanceResourceStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the Implementation Guide
     * </p> 
	 */
	public ImplementationGuide setStatus(ConformanceResourceStatusEnum theValue) {
		setStatus(new BoundCodeDt<ConformanceResourceStatusEnum>(ConformanceResourceStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>experimental</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This Implementation Guide was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public BooleanDt getExperimentalElement() {  
		if (myExperimental == null) {
			myExperimental = new BooleanDt();
		}
		return myExperimental;
	}

	
	/**
	 * Gets the value(s) for <b>experimental</b> (class).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This Implementation Guide was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public Boolean getExperimental() {  
		return getExperimentalElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>experimental</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * This Implementation Guide was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public ImplementationGuide setExperimental(BooleanDt theValue) {
		myExperimental = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>experimental</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * This Implementation Guide was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public ImplementationGuide setExperimental( boolean theBoolean) {
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
     * The name of the individual or organization that published the implementation guide
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
     * The name of the individual or organization that published the implementation guide
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
     * The name of the individual or organization that published the implementation guide
     * </p> 
	 */
	public ImplementationGuide setPublisher(StringDt theValue) {
		myPublisher = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>publisher</b> (who.witness)
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the implementation guide
     * </p> 
	 */
	public ImplementationGuide setPublisher( String theString) {
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
	public ImplementationGuide setContact(java.util.List<Contact> theValue) {
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
	public ImplementationGuide addContact(Contact theValue) {
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
     * The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes
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
     * The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes
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
     * The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes
     * </p> 
	 */
	public ImplementationGuide setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes
     * </p> 
	 */
	public ImplementationGuide setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the implementation guide was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes
     * </p> 
	 */
	public ImplementationGuide setDateWithSecondsPrecision( Date theDate) {
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
     * A free text natural language description of the Implementation Guide and its use
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
     * A free text natural language description of the Implementation Guide and its use
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
     * A free text natural language description of the Implementation Guide and its use
     * </p> 
	 */
	public ImplementationGuide setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the Implementation Guide and its use
     * </p> 
	 */
	public ImplementationGuide setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>useContext</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of implementation guides. The most common use of this element is to represent the country / jurisdiction for which this implementation guide was defined
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getUseContext() {  
		if (myUseContext == null) {
			myUseContext = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myUseContext;
	}

	/**
	 * Sets the value(s) for <b>useContext</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of implementation guides. The most common use of this element is to represent the country / jurisdiction for which this implementation guide was defined
     * </p> 
	 */
	public ImplementationGuide setUseContext(java.util.List<CodeableConceptDt> theValue) {
		myUseContext = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>useContext</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of implementation guides. The most common use of this element is to represent the country / jurisdiction for which this implementation guide was defined
     * </p> 
	 */
	public CodeableConceptDt addUseContext() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getUseContext().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>useContext</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of implementation guides. The most common use of this element is to represent the country / jurisdiction for which this implementation guide was defined
	 * </p>
	 * @param theValue The useContext to add (must not be <code>null</code>)
	 */
	public ImplementationGuide addUseContext(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getUseContext().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>useContext</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of implementation guides. The most common use of this element is to represent the country / jurisdiction for which this implementation guide was defined
     * </p> 
	 */
	public CodeableConceptDt getUseContextFirstRep() {
		if (getUseContext().isEmpty()) {
			return addUseContext();
		}
		return getUseContext().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>copyright</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings
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
     * A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings
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
     * A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings
     * </p> 
	 */
	public ImplementationGuide setCopyright(StringDt theValue) {
		myCopyright = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>copyright</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the implementation guide and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings
     * </p> 
	 */
	public ImplementationGuide setCopyright( String theString) {
		myCopyright = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>fhirVersion</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is $version$ for this version
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
     * The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is $version$ for this version
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
     * The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is $version$ for this version
     * </p> 
	 */
	public ImplementationGuide setFhirVersion(IdDt theValue) {
		myFhirVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>fhirVersion</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the FHIR specification on which this ImplementationGuide is based - this is the formal version of the specification, without the revision number, e.g. [publication].[major].[minor], which is $version$ for this version
     * </p> 
	 */
	public ImplementationGuide setFhirVersion( String theId) {
		myFhirVersion = new IdDt(theId); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>dependency</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides
     * </p> 
	 */
	public java.util.List<Dependency> getDependency() {  
		if (myDependency == null) {
			myDependency = new java.util.ArrayList<Dependency>();
		}
		return myDependency;
	}

	/**
	 * Sets the value(s) for <b>dependency</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides
     * </p> 
	 */
	public ImplementationGuide setDependency(java.util.List<Dependency> theValue) {
		myDependency = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>dependency</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides
     * </p> 
	 */
	public Dependency addDependency() {
		Dependency newType = new Dependency();
		getDependency().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>dependency</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides
	 * </p>
	 * @param theValue The dependency to add (must not be <code>null</code>)
	 */
	public ImplementationGuide addDependency(Dependency theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDependency().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>dependency</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides
     * </p> 
	 */
	public Dependency getDependencyFirstRep() {
		if (getDependency().isEmpty()) {
			return addDependency();
		}
		return getDependency().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>package</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A logical group of resources. Logical groups can be used when building pages
     * </p> 
	 */
	public java.util.List<Package> getPackage() {  
		if (myPackage == null) {
			myPackage = new java.util.ArrayList<Package>();
		}
		return myPackage;
	}

	/**
	 * Sets the value(s) for <b>package</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A logical group of resources. Logical groups can be used when building pages
     * </p> 
	 */
	public ImplementationGuide setPackage(java.util.List<Package> theValue) {
		myPackage = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>package</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A logical group of resources. Logical groups can be used when building pages
     * </p> 
	 */
	public Package addPackage() {
		Package newType = new Package();
		getPackage().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>package</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A logical group of resources. Logical groups can be used when building pages
	 * </p>
	 * @param theValue The package to add (must not be <code>null</code>)
	 */
	public ImplementationGuide addPackage(Package theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPackage().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>package</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A logical group of resources. Logical groups can be used when building pages
     * </p> 
	 */
	public Package getPackageFirstRep() {
		if (getPackage().isEmpty()) {
			return addPackage();
		}
		return getPackage().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>global</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of profiles that all resources covered by this implementation guide must conform to
     * </p> 
	 */
	public java.util.List<Global> getGlobal() {  
		if (myGlobal == null) {
			myGlobal = new java.util.ArrayList<Global>();
		}
		return myGlobal;
	}

	/**
	 * Sets the value(s) for <b>global</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of profiles that all resources covered by this implementation guide must conform to
     * </p> 
	 */
	public ImplementationGuide setGlobal(java.util.List<Global> theValue) {
		myGlobal = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>global</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of profiles that all resources covered by this implementation guide must conform to
     * </p> 
	 */
	public Global addGlobal() {
		Global newType = new Global();
		getGlobal().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>global</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A set of profiles that all resources covered by this implementation guide must conform to
	 * </p>
	 * @param theValue The global to add (must not be <code>null</code>)
	 */
	public ImplementationGuide addGlobal(Global theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getGlobal().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>global</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of profiles that all resources covered by this implementation guide must conform to
     * </p> 
	 */
	public Global getGlobalFirstRep() {
		if (getGlobal().isEmpty()) {
			return addGlobal();
		}
		return getGlobal().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>binary</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A binary file that is included in the  implementation guide when it is published
     * </p> 
	 */
	public java.util.List<UriDt> getBinary() {  
		if (myBinary == null) {
			myBinary = new java.util.ArrayList<UriDt>();
		}
		return myBinary;
	}

	/**
	 * Sets the value(s) for <b>binary</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A binary file that is included in the  implementation guide when it is published
     * </p> 
	 */
	public ImplementationGuide setBinary(java.util.List<UriDt> theValue) {
		myBinary = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>binary</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A binary file that is included in the  implementation guide when it is published
     * </p> 
	 */
	public UriDt addBinary() {
		UriDt newType = new UriDt();
		getBinary().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>binary</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A binary file that is included in the  implementation guide when it is published
	 * </p>
	 * @param theValue The binary to add (must not be <code>null</code>)
	 */
	public ImplementationGuide addBinary(UriDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getBinary().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>binary</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A binary file that is included in the  implementation guide when it is published
     * </p> 
	 */
	public UriDt getBinaryFirstRep() {
		if (getBinary().isEmpty()) {
			return addBinary();
		}
		return getBinary().get(0); 
	}
 	/**
	 * Adds a new value for <b>binary</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A binary file that is included in the  implementation guide when it is published
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public ImplementationGuide addBinary( String theUri) {
		if (myBinary == null) {
			myBinary = new java.util.ArrayList<UriDt>();
		}
		myBinary.add(new UriDt(theUri));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>page</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A page / section in the implementation guide. The root page is the implementation guide home page
     * </p> 
	 */
	public Page getPage() {  
		if (myPage == null) {
			myPage = new Page();
		}
		return myPage;
	}

	/**
	 * Sets the value(s) for <b>page</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A page / section in the implementation guide. The root page is the implementation guide home page
     * </p> 
	 */
	public ImplementationGuide setPage(Page theValue) {
		myPage = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>ImplementationGuide.contact</b> ()
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
		formalDefinition="The name of an individual to contact regarding the implementation guide"
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
     * The name of an individual to contact regarding the implementation guide
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
     * The name of an individual to contact regarding the implementation guide
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
     * The name of an individual to contact regarding the implementation guide
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
     * The name of an individual to contact regarding the implementation guide
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
	 * Block class for child element: <b>ImplementationGuide.dependency</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Another implementation guide that this implementation depends on. Typically, an implementation guide uses value sets, profiles etc.defined in other implementation guides
     * </p> 
	 */
	@Block()	
	public static class Dependency 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="How the dependency is represented when the guide is published"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/guide-dependency-type")
	private BoundCodeDt<GuideDependencyTypeEnum> myType;
	
	@Child(name="uri", type=UriDt.class, order=1, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Where the dependency is located"
	)
	private UriDt myUri;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myUri);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myUri);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * How the dependency is represented when the guide is published
     * </p> 
	 */
	public BoundCodeDt<GuideDependencyTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<GuideDependencyTypeEnum>(GuideDependencyTypeEnum.VALUESET_BINDER);
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
     * How the dependency is represented when the guide is published
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
     * How the dependency is represented when the guide is published
     * </p> 
	 */
	public Dependency setType(BoundCodeDt<GuideDependencyTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * How the dependency is represented when the guide is published
     * </p> 
	 */
	public Dependency setType(GuideDependencyTypeEnum theValue) {
		setType(new BoundCodeDt<GuideDependencyTypeEnum>(GuideDependencyTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>uri</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Where the dependency is located
     * </p> 
	 */
	public UriDt getUriElement() {  
		if (myUri == null) {
			myUri = new UriDt();
		}
		return myUri;
	}

	
	/**
	 * Gets the value(s) for <b>uri</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Where the dependency is located
     * </p> 
	 */
	public String getUri() {  
		return getUriElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>uri</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Where the dependency is located
     * </p> 
	 */
	public Dependency setUri(UriDt theValue) {
		myUri = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>uri</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Where the dependency is located
     * </p> 
	 */
	public Dependency setUri( String theUri) {
		myUri = new UriDt(theUri); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>ImplementationGuide.package</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A logical group of resources. Logical groups can be used when building pages
     * </p> 
	 */
	@Block()	
	public static class Package 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=StringDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name for the group, as used in page.package"
	)
	private StringDt myName;
	
	@Child(name="description", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private StringDt myDescription;
	
	@Child(name="resource", order=2, min=1, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A resource that is part of the implementation guide. Conformance resources (value set, structure definition, conformance statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource"
	)
	private java.util.List<PackageResource> myResource;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  myDescription,  myResource);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, myDescription, myResource);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name for the group, as used in page.package
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
     * The name for the group, as used in page.package
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
     * The name for the group, as used in page.package
     * </p> 
	 */
	public Package setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name for the group, as used in page.package
     * </p> 
	 */
	public Package setName( String theString) {
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
     * 
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
     * 
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
     * 
     * </p> 
	 */
	public Package setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Package setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>resource</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, conformance statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource
     * </p> 
	 */
	public java.util.List<PackageResource> getResource() {  
		if (myResource == null) {
			myResource = new java.util.ArrayList<PackageResource>();
		}
		return myResource;
	}

	/**
	 * Sets the value(s) for <b>resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, conformance statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource
     * </p> 
	 */
	public Package setResource(java.util.List<PackageResource> theValue) {
		myResource = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, conformance statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource
     * </p> 
	 */
	public PackageResource addResource() {
		PackageResource newType = new PackageResource();
		getResource().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>resource</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, conformance statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource
	 * </p>
	 * @param theValue The resource to add (must not be <code>null</code>)
	 */
	public Package addResource(PackageResource theValue) {
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
     * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, conformance statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource
     * </p> 
	 */
	public PackageResource getResourceFirstRep() {
		if (getResource().isEmpty()) {
			return addResource();
		}
		return getResource().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ImplementationGuide.package.resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A resource that is part of the implementation guide. Conformance resources (value set, structure definition, conformance statements etc.) are obvious candidates for inclusion, but any kind of resource can be included as an example resource
     * </p> 
	 */
	@Block()	
	public static class PackageResource 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="purpose", type=CodeDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Why the resource is included in the guide"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/guide-resource-purpose")
	private BoundCodeDt<GuideResourcePurposeEnum> myPurpose;
	
	@Child(name="name", type=StringDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name)"
	)
	private StringDt myName;
	
	@Child(name="description", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A description of the reason that a resource has been included in the implementation guide"
	)
	private StringDt myDescription;
	
	@Child(name="acronym", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A short code that may be used to identify the resource throughout the implementation guide"
	)
	private StringDt myAcronym;
	
	@Child(name="source", order=4, min=1, max=1, summary=true, modifier=false, type={
		UriDt.class, 		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Where this resource is found"
	)
	private IDatatype mySource;
	
	@Child(name="exampleFor", order=5, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.StructureDefinition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions"
	)
	private ResourceReferenceDt myExampleFor;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myPurpose,  myName,  myDescription,  myAcronym,  mySource,  myExampleFor);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myPurpose, myName, myDescription, myAcronym, mySource, myExampleFor);
	}

	/**
	 * Gets the value(s) for <b>purpose</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Why the resource is included in the guide
     * </p> 
	 */
	public BoundCodeDt<GuideResourcePurposeEnum> getPurposeElement() {  
		if (myPurpose == null) {
			myPurpose = new BoundCodeDt<GuideResourcePurposeEnum>(GuideResourcePurposeEnum.VALUESET_BINDER);
		}
		return myPurpose;
	}

	
	/**
	 * Gets the value(s) for <b>purpose</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Why the resource is included in the guide
     * </p> 
	 */
	public String getPurpose() {  
		return getPurposeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>purpose</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Why the resource is included in the guide
     * </p> 
	 */
	public PackageResource setPurpose(BoundCodeDt<GuideResourcePurposeEnum> theValue) {
		myPurpose = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>purpose</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Why the resource is included in the guide
     * </p> 
	 */
	public PackageResource setPurpose(GuideResourcePurposeEnum theValue) {
		setPurpose(new BoundCodeDt<GuideResourcePurposeEnum>(GuideResourcePurposeEnum.VALUESET_BINDER, theValue));
		
/*
		getPurposeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name)
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
     * A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name)
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
     * A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name)
     * </p> 
	 */
	public PackageResource setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A human assigned name for the resource. All resources SHOULD have a name, but the name may be extracted from the resource (e.g. ValueSet.name)
     * </p> 
	 */
	public PackageResource setName( String theString) {
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
     * A description of the reason that a resource has been included in the implementation guide
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
     * A description of the reason that a resource has been included in the implementation guide
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
     * A description of the reason that a resource has been included in the implementation guide
     * </p> 
	 */
	public PackageResource setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the reason that a resource has been included in the implementation guide
     * </p> 
	 */
	public PackageResource setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>acronym</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A short code that may be used to identify the resource throughout the implementation guide
     * </p> 
	 */
	public StringDt getAcronymElement() {  
		if (myAcronym == null) {
			myAcronym = new StringDt();
		}
		return myAcronym;
	}

	
	/**
	 * Gets the value(s) for <b>acronym</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A short code that may be used to identify the resource throughout the implementation guide
     * </p> 
	 */
	public String getAcronym() {  
		return getAcronymElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>acronym</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A short code that may be used to identify the resource throughout the implementation guide
     * </p> 
	 */
	public PackageResource setAcronym(StringDt theValue) {
		myAcronym = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>acronym</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A short code that may be used to identify the resource throughout the implementation guide
     * </p> 
	 */
	public PackageResource setAcronym( String theString) {
		myAcronym = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>source[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Where this resource is found
     * </p> 
	 */
	public IDatatype getSource() {  
		return mySource;
	}

	/**
	 * Sets the value(s) for <b>source[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Where this resource is found
     * </p> 
	 */
	public PackageResource setSource(IDatatype theValue) {
		mySource = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>exampleFor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions
     * </p> 
	 */
	public ResourceReferenceDt getExampleFor() {  
		if (myExampleFor == null) {
			myExampleFor = new ResourceReferenceDt();
		}
		return myExampleFor;
	}

	/**
	 * Sets the value(s) for <b>exampleFor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Another resource that this resource is an example for. This is mostly used for resources that are included as examples of StructureDefinitions
     * </p> 
	 */
	public PackageResource setExampleFor(ResourceReferenceDt theValue) {
		myExampleFor = theValue;
		return this;
	}
	
	

  


	}



	/**
	 * Block class for child element: <b>ImplementationGuide.global</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of profiles that all resources covered by this implementation guide must conform to
     * </p> 
	 */
	@Block()	
	public static class Global 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of resource that all instances must conform to"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
	private BoundCodeDt<ResourceTypeEnum> myType;
	
	@Child(name="profile", order=1, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.StructureDefinition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A reference to the profile that all instances must conform to"
	)
	private ResourceReferenceDt myProfile;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myProfile);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myProfile);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of resource that all instances must conform to
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
     * The type of resource that all instances must conform to
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
     * The type of resource that all instances must conform to
     * </p> 
	 */
	public Global setType(BoundCodeDt<ResourceTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of resource that all instances must conform to
     * </p> 
	 */
	public Global setType(ResourceTypeEnum theValue) {
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
     * A reference to the profile that all instances must conform to
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
     * A reference to the profile that all instances must conform to
     * </p> 
	 */
	public Global setProfile(ResourceReferenceDt theValue) {
		myProfile = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>ImplementationGuide.page</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A page / section in the implementation guide. The root page is the implementation guide home page
     * </p> 
	 */
	@Block()	
	public static class Page 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="source", type=UriDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The source address for the page"
	)
	private UriDt mySource;
	
	@Child(name="name", type=StringDt.class, order=1, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A short name used to represent this page in navigational structures such as table of contents, bread crumbs, etc."
	)
	private StringDt myName;
	
	@Child(name="kind", type=CodeDt.class, order=2, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The kind of page that this is. Some pages are autogenerated (list, example), and other kinds are of interest so that tools can navigate the user to the page of interest"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/guide-page-kind")
	private BoundCodeDt<GuidePageKindEnum> myKind;
	
	@Child(name="type", type=CodeDt.class, order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="For constructed pages, what kind of resources to include in the list"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
	private java.util.List<BoundCodeDt<ResourceTypeEnum>> myType;
	
	@Child(name="package", type=StringDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="For constructed pages, a list of packages to include in the page (or else empty for everything)"
	)
	private java.util.List<StringDt> myPackage;
	
	@Child(name="format", type=CodeDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The format of the page"
	)
	private CodeDt myFormat;
	
	@Child(name="page", type=Page.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Nested Pages/Sections under this page"
	)
	private java.util.List<Page> myPage;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySource,  myName,  myKind,  myType,  myPackage,  myFormat,  myPage);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySource, myName, myKind, myType, myPackage, myFormat, myPage);
	}

	/**
	 * Gets the value(s) for <b>source</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The source address for the page
     * </p> 
	 */
	public UriDt getSourceElement() {  
		if (mySource == null) {
			mySource = new UriDt();
		}
		return mySource;
	}

	
	/**
	 * Gets the value(s) for <b>source</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The source address for the page
     * </p> 
	 */
	public String getSource() {  
		return getSourceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>source</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The source address for the page
     * </p> 
	 */
	public Page setSource(UriDt theValue) {
		mySource = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>source</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The source address for the page
     * </p> 
	 */
	public Page setSource( String theUri) {
		mySource = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A short name used to represent this page in navigational structures such as table of contents, bread crumbs, etc.
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
     * A short name used to represent this page in navigational structures such as table of contents, bread crumbs, etc.
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
     * A short name used to represent this page in navigational structures such as table of contents, bread crumbs, etc.
     * </p> 
	 */
	public Page setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A short name used to represent this page in navigational structures such as table of contents, bread crumbs, etc.
     * </p> 
	 */
	public Page setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>kind</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of page that this is. Some pages are autogenerated (list, example), and other kinds are of interest so that tools can navigate the user to the page of interest
     * </p> 
	 */
	public BoundCodeDt<GuidePageKindEnum> getKindElement() {  
		if (myKind == null) {
			myKind = new BoundCodeDt<GuidePageKindEnum>(GuidePageKindEnum.VALUESET_BINDER);
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
     * The kind of page that this is. Some pages are autogenerated (list, example), and other kinds are of interest so that tools can navigate the user to the page of interest
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
     * The kind of page that this is. Some pages are autogenerated (list, example), and other kinds are of interest so that tools can navigate the user to the page of interest
     * </p> 
	 */
	public Page setKind(BoundCodeDt<GuidePageKindEnum> theValue) {
		myKind = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>kind</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of page that this is. Some pages are autogenerated (list, example), and other kinds are of interest so that tools can navigate the user to the page of interest
     * </p> 
	 */
	public Page setKind(GuidePageKindEnum theValue) {
		setKind(new BoundCodeDt<GuidePageKindEnum>(GuidePageKindEnum.VALUESET_BINDER, theValue));
		
/*
		getKindElement().setValueAsEnum(theValue);
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
     * For constructed pages, what kind of resources to include in the list
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
     * For constructed pages, what kind of resources to include in the list
     * </p> 
	 */
	public Page setType(java.util.List<BoundCodeDt<ResourceTypeEnum>> theValue) {
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
     * For constructed pages, what kind of resources to include in the list
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
     * For constructed pages, what kind of resources to include in the list
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
     * For constructed pages, what kind of resources to include in the list
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
     * For constructed pages, what kind of resources to include in the list
     * </p> 
	 */
	public Page setType(ResourceTypeEnum theValue) {
		getType().clear();
		addType(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>package</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * For constructed pages, a list of packages to include in the page (or else empty for everything)
     * </p> 
	 */
	public java.util.List<StringDt> getPackage() {  
		if (myPackage == null) {
			myPackage = new java.util.ArrayList<StringDt>();
		}
		return myPackage;
	}

	/**
	 * Sets the value(s) for <b>package</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * For constructed pages, a list of packages to include in the page (or else empty for everything)
     * </p> 
	 */
	public Page setPackage(java.util.List<StringDt> theValue) {
		myPackage = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>package</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * For constructed pages, a list of packages to include in the page (or else empty for everything)
     * </p> 
	 */
	public StringDt addPackage() {
		StringDt newType = new StringDt();
		getPackage().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>package</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * For constructed pages, a list of packages to include in the page (or else empty for everything)
	 * </p>
	 * @param theValue The package to add (must not be <code>null</code>)
	 */
	public Page addPackage(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPackage().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>package</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * For constructed pages, a list of packages to include in the page (or else empty for everything)
     * </p> 
	 */
	public StringDt getPackageFirstRep() {
		if (getPackage().isEmpty()) {
			return addPackage();
		}
		return getPackage().get(0); 
	}
 	/**
	 * Adds a new value for <b>package</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * For constructed pages, a list of packages to include in the page (or else empty for everything)
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Page addPackage( String theString) {
		if (myPackage == null) {
			myPackage = new java.util.ArrayList<StringDt>();
		}
		myPackage.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>format</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The format of the page
     * </p> 
	 */
	public CodeDt getFormatElement() {  
		if (myFormat == null) {
			myFormat = new CodeDt();
		}
		return myFormat;
	}

	
	/**
	 * Gets the value(s) for <b>format</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The format of the page
     * </p> 
	 */
	public String getFormat() {  
		return getFormatElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>format</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The format of the page
     * </p> 
	 */
	public Page setFormat(CodeDt theValue) {
		myFormat = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>format</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The format of the page
     * </p> 
	 */
	public Page setFormat( String theCode) {
		myFormat = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>page</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Nested Pages/Sections under this page
     * </p> 
	 */
	public java.util.List<Page> getPage() {  
		if (myPage == null) {
			myPage = new java.util.ArrayList<Page>();
		}
		return myPage;
	}

	/**
	 * Sets the value(s) for <b>page</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Nested Pages/Sections under this page
     * </p> 
	 */
	public Page setPage(java.util.List<Page> theValue) {
		myPage = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>page</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Nested Pages/Sections under this page
     * </p> 
	 */
	public Page addPage() {
		Page newType = new Page();
		getPage().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>page</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Nested Pages/Sections under this page
	 * </p>
	 * @param theValue The page to add (must not be <code>null</code>)
	 */
	public Page addPage(Page theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPage().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>page</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Nested Pages/Sections under this page
     * </p> 
	 */
	public Page getPageFirstRep() {
		if (getPage().isEmpty()) {
			return addPage();
		}
		return getPage().get(0); 
	}
  


	}




    @Override
    public String getResourceName() {
        return "ImplementationGuide";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
