















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
 * HAPI/FHIR <b>ValueSet</b> Resource
 * (conformance.terminology)
 *
 * <p>
 * <b>Definition:</b>
 * A value set specifies a set of codes drawn from one or more code systems.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/ValueSet">http://hl7.org/fhir/profiles/ValueSet</a> 
 * </p>
 *
 */
@ResourceDef(name="ValueSet", profile="http://hl7.org/fhir/profiles/ValueSet", id="valueset")
public class ValueSet extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b>The logical URL for the value set</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ValueSet.url</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="url", path="ValueSet.url", description="The logical URL for the value set", type="uri"  )
	public static final String SP_URL = "url";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b>The logical URL for the value set</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ValueSet.url</b><br>
	 * </p>
	 */
	public static final UriClientParam URL = new UriClientParam(SP_URL);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The identifier for the value set</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ValueSet.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="ValueSet.identifier", description="The identifier for the value set", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The identifier for the value set</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ValueSet.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b>The version identifier of the value set</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ValueSet.version</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="version", path="ValueSet.version", description="The version identifier of the value set", type="token"  )
	public static final String SP_VERSION = "version";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>version</b>
	 * <p>
	 * Description: <b>The version identifier of the value set</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ValueSet.version</b><br>
	 * </p>
	 */
	public static final TokenClientParam VERSION = new TokenClientParam(SP_VERSION);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>The name of the value set</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ValueSet.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="ValueSet.name", description="The name of the value set", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>The name of the value set</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ValueSet.name</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b>Name of the publisher of the value set</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ValueSet.publisher</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="publisher", path="ValueSet.publisher", description="Name of the publisher of the value set", type="string"  )
	public static final String SP_PUBLISHER = "publisher";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>publisher</b>
	 * <p>
	 * Description: <b>Name of the publisher of the value set</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ValueSet.publisher</b><br>
	 * </p>
	 */
	public static final StringClientParam PUBLISHER = new StringClientParam(SP_PUBLISHER);

	/**
	 * Search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b>Text search in the description of the value set</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ValueSet.description</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="description", path="ValueSet.description", description="Text search in the description of the value set", type="string"  )
	public static final String SP_DESCRIPTION = "description";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b>Text search in the description of the value set</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>ValueSet.description</b><br>
	 * </p>
	 */
	public static final StringClientParam DESCRIPTION = new StringClientParam(SP_DESCRIPTION);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the value set</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ValueSet.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="ValueSet.status", description="The status of the value set", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the value set</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ValueSet.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The value set publication date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ValueSet.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="ValueSet.date", description="The value set publication date", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The value set publication date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ValueSet.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>system</b>
	 * <p>
	 * Description: <b>The system for any codes defined by this value set</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ValueSet.codeSystem.system</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="system", path="ValueSet.codeSystem.system", description="The system for any codes defined by this value set", type="uri"  )
	public static final String SP_SYSTEM = "system";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>system</b>
	 * <p>
	 * Description: <b>The system for any codes defined by this value set</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ValueSet.codeSystem.system</b><br>
	 * </p>
	 */
	public static final UriClientParam SYSTEM = new UriClientParam(SP_SYSTEM);

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>A code defined in the value set</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ValueSet.codeSystem.concept.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="ValueSet.codeSystem.concept.code", description="A code defined in the value set", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>A code defined in the value set</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ValueSet.codeSystem.concept.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>reference</b>
	 * <p>
	 * Description: <b>A code system included or excluded in the value set or an imported value set</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ValueSet.compose.include.system</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="reference", path="ValueSet.compose.include.system", description="A code system included or excluded in the value set or an imported value set", type="uri"  )
	public static final String SP_REFERENCE = "reference";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>reference</b>
	 * <p>
	 * Description: <b>A code system included or excluded in the value set or an imported value set</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ValueSet.compose.include.system</b><br>
	 * </p>
	 */
	public static final UriClientParam REFERENCE = new UriClientParam(SP_REFERENCE);

	/**
	 * Search parameter constant for <b>context</b>
	 * <p>
	 * Description: <b>A use context assigned to the value set</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ValueSet.useContext</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="context", path="ValueSet.useContext", description="A use context assigned to the value set", type="token"  )
	public static final String SP_CONTEXT = "context";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>context</b>
	 * <p>
	 * Description: <b>A use context assigned to the value set</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ValueSet.useContext</b><br>
	 * </p>
	 */
	public static final TokenClientParam CONTEXT = new TokenClientParam(SP_CONTEXT);

	/**
	 * Search parameter constant for <b>expansion</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ValueSet.expansion.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="expansion", path="ValueSet.expansion.identifier", description="", type="uri"  )
	public static final String SP_EXPANSION = "expansion";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>expansion</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ValueSet.expansion.identifier</b><br>
	 * </p>
	 */
	public static final UriClientParam EXPANSION = new UriClientParam(SP_EXPANSION);



	@Child(name="url", type=UriDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published"
	)
	private UriDt myUrl;
	
	@Child(name="identifier", type=IdentifierDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Formal identifier that is used to identify this value set when it is represented in other formats, or referenced in a specification, model, design or an instance."
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="version", type=StringDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="id.version",
		formalDefinition="Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp"
	)
	private StringDt myVersion;
	
	@Child(name="name", type=StringDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A free text natural language name describing the value set"
	)
	private StringDt myName;
	
	@Child(name="status", type=CodeDt.class, order=4, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="status",
		formalDefinition="The status of the value set"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/conformance-resource-status")
	private BoundCodeDt<ConformanceResourceStatusEnum> myStatus;
	
	@Child(name="experimental", type=BooleanDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage"
	)
	private BooleanDt myExperimental;
	
	@Child(name="publisher", type=StringDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="who.witness",
		formalDefinition="The name of the individual or organization that published the value set"
	)
	private StringDt myPublisher;
	
	@Child(name="contact", order=7, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contacts to assist a user in finding and communicating with the publisher"
	)
	private java.util.List<Contact> myContact;
	
	@Child(name="date", type=DateTimeDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition')"
	)
	private DateTimeDt myDate;
	
	@Child(name="lockedDate", type=DateDt.class, order=9, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.init",
		formalDefinition="If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date"
	)
	private DateDt myLockedDate;
	
	@Child(name="description", type=StringDt.class, order=10, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A free text natural language description of the use of the value set - reason for definition, \"the semantic space\" to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set."
	)
	private StringDt myDescription;
	
	@Child(name="useContext", type=CodeableConceptDt.class, order=11, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of value set definitions."
	)
	private java.util.List<CodeableConceptDt> myUseContext;
	
	@Child(name="immutable", type=BooleanDt.class, order=12, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change"
	)
	private BooleanDt myImmutable;
	
	@Child(name="requirements", type=StringDt.class, order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Explains why this value set is needed and why it has been constrained as it has"
	)
	private StringDt myRequirements;
	
	@Child(name="copyright", type=StringDt.class, order=14, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set"
	)
	private StringDt myCopyright;
	
	@Child(name="extensible", type=BooleanDt.class, order=15, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Whether this is intended to be used with an extensible binding or not"
	)
	private BooleanDt myExtensible;
	
	@Child(name="codeSystem", order=16, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A definition of a code system, inlined into the value set (as a packaging convenience). Note that the inline code system may be used from other value sets by referring to its (codeSystem.system) directly"
	)
	private CodeSystem myCodeSystem;
	
	@Child(name="compose", order=17, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A set of criteria that provide the content logical definition of the value set by including or excluding codes from outside this value set"
	)
	private Compose myCompose;
	
	@Child(name="expansion", order=18, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A value set can also be \"expanded\", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed"
	)
	private Expansion myExpansion;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myUrl,  myIdentifier,  myVersion,  myName,  myStatus,  myExperimental,  myPublisher,  myContact,  myDate,  myLockedDate,  myDescription,  myUseContext,  myImmutable,  myRequirements,  myCopyright,  myExtensible,  myCodeSystem,  myCompose,  myExpansion);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myUrl, myIdentifier, myVersion, myName, myStatus, myExperimental, myPublisher, myContact, myDate, myLockedDate, myDescription, myUseContext, myImmutable, myRequirements, myCopyright, myExtensible, myCodeSystem, myCompose, myExpansion);
	}

	/**
	 * Gets the value(s) for <b>url</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published
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
     * An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published
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
     * An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published
     * </p> 
	 */
	public ValueSet setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this value set when it is referenced in a specification, model, design or an instance. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this value set is (or will be) published
     * </p> 
	 */
	public ValueSet setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Formal identifier that is used to identify this value set when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * </p> 
	 */
	public IdentifierDt getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new IdentifierDt();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Formal identifier that is used to identify this value set when it is represented in other formats, or referenced in a specification, model, design or an instance.
     * </p> 
	 */
	public ValueSet setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>version</b> (id.version).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
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
     * Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
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
     * Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public ValueSet setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>version</b> (id.version)
	 *
     * <p>
     * <b>Definition:</b>
     * Used to identify this version of the value set when it is referenced in a specification, model, design or instance. This is an arbitrary value managed by the profile author manually and the value should be a timestamp
     * </p> 
	 */
	public ValueSet setVersion( String theString) {
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
     * A free text natural language name describing the value set
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
     * A free text natural language name describing the value set
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
     * A free text natural language name describing the value set
     * </p> 
	 */
	public ValueSet setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language name describing the value set
     * </p> 
	 */
	public ValueSet setName( String theString) {
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
     * The status of the value set
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
     * The status of the value set
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
     * The status of the value set
     * </p> 
	 */
	public ValueSet setStatus(BoundCodeDt<ConformanceResourceStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the value set
     * </p> 
	 */
	public ValueSet setStatus(ConformanceResourceStatusEnum theValue) {
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
     * This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
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
     * This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
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
     * This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public ValueSet setExperimental(BooleanDt theValue) {
		myExperimental = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>experimental</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * This valueset was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public ValueSet setExperimental( boolean theBoolean) {
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
     * The name of the individual or organization that published the value set
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
     * The name of the individual or organization that published the value set
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
     * The name of the individual or organization that published the value set
     * </p> 
	 */
	public ValueSet setPublisher(StringDt theValue) {
		myPublisher = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>publisher</b> (who.witness)
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the value set
     * </p> 
	 */
	public ValueSet setPublisher( String theString) {
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
	public ValueSet setContact(java.util.List<Contact> theValue) {
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
	public ValueSet addContact(Contact theValue) {
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
     * The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition')
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
     * The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition')
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
     * The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition')
     * </p> 
	 */
	public ValueSet setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition')
     * </p> 
	 */
	public ValueSet setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date that the value set status was last changed. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the implementation guide changes (e.g. the 'content logical definition')
     * </p> 
	 */
	public ValueSet setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>lockedDate</b> (when.init).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date
     * </p> 
	 */
	public DateDt getLockedDateElement() {  
		if (myLockedDate == null) {
			myLockedDate = new DateDt();
		}
		return myLockedDate;
	}

	
	/**
	 * Gets the value(s) for <b>lockedDate</b> (when.init).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date
     * </p> 
	 */
	public Date getLockedDate() {  
		return getLockedDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>lockedDate</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date
     * </p> 
	 */
	public ValueSet setLockedDate(DateDt theValue) {
		myLockedDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>lockedDate</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date
     * </p> 
	 */
	public ValueSet setLockedDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myLockedDate = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>lockedDate</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * If a locked date is defined, then the Content Logical Definition must be evaluated using the current version of all referenced code system(s) and value set instances as of the locked date
     * </p> 
	 */
	public ValueSet setLockedDateWithDayPrecision( Date theDate) {
		myLockedDate = new DateDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the use of the value set - reason for definition, \&quot;the semantic space\&quot; to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set.
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
     * A free text natural language description of the use of the value set - reason for definition, \&quot;the semantic space\&quot; to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set.
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
     * A free text natural language description of the use of the value set - reason for definition, \&quot;the semantic space\&quot; to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set.
     * </p> 
	 */
	public ValueSet setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the use of the value set - reason for definition, \&quot;the semantic space\&quot; to be included in the value set, conditions of use, etc. The description may include a list of expected usages for the value set and can also describe the approach taken to build the value set.
     * </p> 
	 */
	public ValueSet setDescription( String theString) {
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of value set definitions.
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of value set definitions.
     * </p> 
	 */
	public ValueSet setUseContext(java.util.List<CodeableConceptDt> theValue) {
		myUseContext = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>useContext</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of value set definitions.
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
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of value set definitions.
	 * </p>
	 * @param theValue The useContext to add (must not be <code>null</code>)
	 */
	public ValueSet addUseContext(CodeableConceptDt theValue) {
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
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of value set definitions.
     * </p> 
	 */
	public CodeableConceptDt getUseContextFirstRep() {
		if (getUseContext().isEmpty()) {
			return addUseContext();
		}
		return getUseContext().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>immutable</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change
     * </p> 
	 */
	public BooleanDt getImmutableElement() {  
		if (myImmutable == null) {
			myImmutable = new BooleanDt();
		}
		return myImmutable;
	}

	
	/**
	 * Gets the value(s) for <b>immutable</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change
     * </p> 
	 */
	public Boolean getImmutable() {  
		return getImmutableElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>immutable</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change
     * </p> 
	 */
	public ValueSet setImmutable(BooleanDt theValue) {
		myImmutable = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>immutable</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If this is set to 'true', then no new versions of the content logical definition can be created.  Note: Other metadata might still change
     * </p> 
	 */
	public ValueSet setImmutable( boolean theBoolean) {
		myImmutable = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>requirements</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Explains why this value set is needed and why it has been constrained as it has
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
     * Explains why this value set is needed and why it has been constrained as it has
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
     * Explains why this value set is needed and why it has been constrained as it has
     * </p> 
	 */
	public ValueSet setRequirements(StringDt theValue) {
		myRequirements = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>requirements</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Explains why this value set is needed and why it has been constrained as it has
     * </p> 
	 */
	public ValueSet setRequirements( String theString) {
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
     * A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set
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
     * A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set
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
     * A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set
     * </p> 
	 */
	public ValueSet setCopyright(StringDt theValue) {
		myCopyright = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>copyright</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the value set and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the value set
     * </p> 
	 */
	public ValueSet setCopyright( String theString) {
		myCopyright = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>extensible</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is intended to be used with an extensible binding or not
     * </p> 
	 */
	public BooleanDt getExtensibleElement() {  
		if (myExtensible == null) {
			myExtensible = new BooleanDt();
		}
		return myExtensible;
	}

	
	/**
	 * Gets the value(s) for <b>extensible</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is intended to be used with an extensible binding or not
     * </p> 
	 */
	public Boolean getExtensible() {  
		return getExtensibleElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>extensible</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is intended to be used with an extensible binding or not
     * </p> 
	 */
	public ValueSet setExtensible(BooleanDt theValue) {
		myExtensible = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>extensible</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this is intended to be used with an extensible binding or not
     * </p> 
	 */
	public ValueSet setExtensible( boolean theBoolean) {
		myExtensible = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>codeSystem</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A definition of a code system, inlined into the value set (as a packaging convenience). Note that the inline code system may be used from other value sets by referring to its (codeSystem.system) directly
     * </p> 
	 */
	public CodeSystem getCodeSystem() {  
		if (myCodeSystem == null) {
			myCodeSystem = new CodeSystem();
		}
		return myCodeSystem;
	}

	/**
	 * Sets the value(s) for <b>codeSystem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A definition of a code system, inlined into the value set (as a packaging convenience). Note that the inline code system may be used from other value sets by referring to its (codeSystem.system) directly
     * </p> 
	 */
	public ValueSet setCodeSystem(CodeSystem theValue) {
		myCodeSystem = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>compose</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of criteria that provide the content logical definition of the value set by including or excluding codes from outside this value set
     * </p> 
	 */
	public Compose getCompose() {  
		if (myCompose == null) {
			myCompose = new Compose();
		}
		return myCompose;
	}

	/**
	 * Sets the value(s) for <b>compose</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of criteria that provide the content logical definition of the value set by including or excluding codes from outside this value set
     * </p> 
	 */
	public ValueSet setCompose(Compose theValue) {
		myCompose = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>expansion</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A value set can also be \&quot;expanded\&quot;, where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed
     * </p> 
	 */
	public Expansion getExpansion() {  
		if (myExpansion == null) {
			myExpansion = new Expansion();
		}
		return myExpansion;
	}

	/**
	 * Sets the value(s) for <b>expansion</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A value set can also be \&quot;expanded\&quot;, where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed
     * </p> 
	 */
	public ValueSet setExpansion(Expansion theValue) {
		myExpansion = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>ValueSet.contact</b> ()
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
		formalDefinition="The name of an individual to contact regarding the value set"
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
     * The name of an individual to contact regarding the value set
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
     * The name of an individual to contact regarding the value set
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
     * The name of an individual to contact regarding the value set
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
     * The name of an individual to contact regarding the value set
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
	 * Block class for child element: <b>ValueSet.codeSystem</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A definition of a code system, inlined into the value set (as a packaging convenience). Note that the inline code system may be used from other value sets by referring to its (codeSystem.system) directly
     * </p> 
	 */
	@Block()	
	public static class CodeSystem 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="system", type=UriDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system"
	)
	private UriDt mySystem;
	
	@Child(name="version", type=StringDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked"
	)
	private StringDt myVersion;
	
	@Child(name="caseSensitive", type=BooleanDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If code comparison is case sensitive when codes within this system are compared to each other"
	)
	private BooleanDt myCaseSensitive;
	
	@Child(name="concept", order=3, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are"
	)
	private java.util.List<CodeSystemConcept> myConcept;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySystem,  myVersion,  myCaseSensitive,  myConcept);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySystem, myVersion, myCaseSensitive, myConcept);
	}

	/**
	 * Gets the value(s) for <b>system</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system
     * </p> 
	 */
	public UriDt getSystemElement() {  
		if (mySystem == null) {
			mySystem = new UriDt();
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
     * An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system
     * </p> 
	 */
	public String getSystem() {  
		return getSystemElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>system</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system
     * </p> 
	 */
	public CodeSystem setSystem(UriDt theValue) {
		mySystem = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>system</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI that is used to reference this code system, including in [Coding]{datatypes.html#Coding}.system
     * </p> 
	 */
	public CodeSystem setSystem( String theUri) {
		mySystem = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>version</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked
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
     * The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked
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
     * The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked
     * </p> 
	 */
	public CodeSystem setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>version</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version of this code system that defines the codes. Note that the version is optional because a well maintained code system does not suffer from versioning, and therefore the version does not need to be maintained. However many code systems are not well maintained, and the version needs to be defined and tracked
     * </p> 
	 */
	public CodeSystem setVersion( String theString) {
		myVersion = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>caseSensitive</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If code comparison is case sensitive when codes within this system are compared to each other
     * </p> 
	 */
	public BooleanDt getCaseSensitiveElement() {  
		if (myCaseSensitive == null) {
			myCaseSensitive = new BooleanDt();
		}
		return myCaseSensitive;
	}

	
	/**
	 * Gets the value(s) for <b>caseSensitive</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If code comparison is case sensitive when codes within this system are compared to each other
     * </p> 
	 */
	public Boolean getCaseSensitive() {  
		return getCaseSensitiveElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>caseSensitive</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If code comparison is case sensitive when codes within this system are compared to each other
     * </p> 
	 */
	public CodeSystem setCaseSensitive(BooleanDt theValue) {
		myCaseSensitive = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>caseSensitive</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If code comparison is case sensitive when codes within this system are compared to each other
     * </p> 
	 */
	public CodeSystem setCaseSensitive( boolean theBoolean) {
		myCaseSensitive = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>concept</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are
     * </p> 
	 */
	public java.util.List<CodeSystemConcept> getConcept() {  
		if (myConcept == null) {
			myConcept = new java.util.ArrayList<CodeSystemConcept>();
		}
		return myConcept;
	}

	/**
	 * Sets the value(s) for <b>concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are
     * </p> 
	 */
	public CodeSystem setConcept(java.util.List<CodeSystemConcept> theValue) {
		myConcept = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are
     * </p> 
	 */
	public CodeSystemConcept addConcept() {
		CodeSystemConcept newType = new CodeSystemConcept();
		getConcept().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>concept</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are
	 * </p>
	 * @param theValue The concept to add (must not be <code>null</code>)
	 */
	public CodeSystem addConcept(CodeSystemConcept theValue) {
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
     * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are
     * </p> 
	 */
	public CodeSystemConcept getConceptFirstRep() {
		if (getConcept().isEmpty()) {
			return addConcept();
		}
		return getConcept().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ValueSet.codeSystem.concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Concepts that are in the code system. The concept definitions are inherently hierarchical, but the definitions must be consulted to determine what the meaning of the hierarchical relationships are
     * </p> 
	 */
	@Block()	
	public static class CodeSystemConcept 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code - a text symbol - that uniquely identifies the concept within the code system"
	)
	private CodeDt myCode;
	
	@Child(name="abstract", type=BooleanDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If this code is not for use as a real concept"
	)
	private BooleanDt myAbstract;
	
	@Child(name="display", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A human readable string that is the recommended default way to present this concept to a user"
	)
	private StringDt myDisplay;
	
	@Child(name="definition", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept"
	)
	private StringDt myDefinition;
	
	@Child(name="designation", order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc."
	)
	private java.util.List<CodeSystemConceptDesignation> myDesignation;
	
	@Child(name="concept", type=CodeSystemConcept.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) and can only be determined by examining the definitions of the concepts"
	)
	private java.util.List<CodeSystemConcept> myConcept;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myAbstract,  myDisplay,  myDefinition,  myDesignation,  myConcept);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myAbstract, myDisplay, myDefinition, myDesignation, myConcept);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code - a text symbol - that uniquely identifies the concept within the code system
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
     * A code - a text symbol - that uniquely identifies the concept within the code system
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
     * A code - a text symbol - that uniquely identifies the concept within the code system
     * </p> 
	 */
	public CodeSystemConcept setCode(CodeDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code - a text symbol - that uniquely identifies the concept within the code system
     * </p> 
	 */
	public CodeSystemConcept setCode( String theCode) {
		myCode = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>abstract</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If this code is not for use as a real concept
     * </p> 
	 */
	public BooleanDt getAbstractElement() {  
		if (myAbstract == null) {
			myAbstract = new BooleanDt();
		}
		return myAbstract;
	}

	
	/**
	 * Gets the value(s) for <b>abstract</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If this code is not for use as a real concept
     * </p> 
	 */
	public Boolean getAbstract() {  
		return getAbstractElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>abstract</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If this code is not for use as a real concept
     * </p> 
	 */
	public CodeSystemConcept setAbstract(BooleanDt theValue) {
		myAbstract = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>abstract</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If this code is not for use as a real concept
     * </p> 
	 */
	public CodeSystemConcept setAbstract( boolean theBoolean) {
		myAbstract = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>display</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A human readable string that is the recommended default way to present this concept to a user
     * </p> 
	 */
	public StringDt getDisplayElement() {  
		if (myDisplay == null) {
			myDisplay = new StringDt();
		}
		return myDisplay;
	}

	
	/**
	 * Gets the value(s) for <b>display</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A human readable string that is the recommended default way to present this concept to a user
     * </p> 
	 */
	public String getDisplay() {  
		return getDisplayElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>display</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A human readable string that is the recommended default way to present this concept to a user
     * </p> 
	 */
	public CodeSystemConcept setDisplay(StringDt theValue) {
		myDisplay = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>display</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A human readable string that is the recommended default way to present this concept to a user
     * </p> 
	 */
	public CodeSystemConcept setDisplay( String theString) {
		myDisplay = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>definition</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept
     * </p> 
	 */
	public StringDt getDefinitionElement() {  
		if (myDefinition == null) {
			myDefinition = new StringDt();
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
     * The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept
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
     * The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept
     * </p> 
	 */
	public CodeSystemConcept setDefinition(StringDt theValue) {
		myDefinition = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>definition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The formal definition of the concept. The value set resource does not make formal definitions required, because of the prevalence of legacy systems. However, they are highly recommended, as without them there is no formal meaning associated with the concept
     * </p> 
	 */
	public CodeSystemConcept setDefinition( String theString) {
		myDefinition = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>designation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * </p> 
	 */
	public java.util.List<CodeSystemConceptDesignation> getDesignation() {  
		if (myDesignation == null) {
			myDesignation = new java.util.ArrayList<CodeSystemConceptDesignation>();
		}
		return myDesignation;
	}

	/**
	 * Sets the value(s) for <b>designation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * </p> 
	 */
	public CodeSystemConcept setDesignation(java.util.List<CodeSystemConceptDesignation> theValue) {
		myDesignation = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>designation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * </p> 
	 */
	public CodeSystemConceptDesignation addDesignation() {
		CodeSystemConceptDesignation newType = new CodeSystemConceptDesignation();
		getDesignation().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>designation</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
	 * </p>
	 * @param theValue The designation to add (must not be <code>null</code>)
	 */
	public CodeSystemConcept addDesignation(CodeSystemConceptDesignation theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDesignation().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>designation</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * </p> 
	 */
	public CodeSystemConceptDesignation getDesignationFirstRep() {
		if (getDesignation().isEmpty()) {
			return addDesignation();
		}
		return getDesignation().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>concept</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) and can only be determined by examining the definitions of the concepts
     * </p> 
	 */
	public java.util.List<CodeSystemConcept> getConcept() {  
		if (myConcept == null) {
			myConcept = new java.util.ArrayList<CodeSystemConcept>();
		}
		return myConcept;
	}

	/**
	 * Sets the value(s) for <b>concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) and can only be determined by examining the definitions of the concepts
     * </p> 
	 */
	public CodeSystemConcept setConcept(java.util.List<CodeSystemConcept> theValue) {
		myConcept = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) and can only be determined by examining the definitions of the concepts
     * </p> 
	 */
	public CodeSystemConcept addConcept() {
		CodeSystemConcept newType = new CodeSystemConcept();
		getConcept().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>concept</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) and can only be determined by examining the definitions of the concepts
	 * </p>
	 * @param theValue The concept to add (must not be <code>null</code>)
	 */
	public CodeSystemConcept addConcept(CodeSystemConcept theValue) {
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
     * Defines children of a concept to produce a hierarchy of concepts. The nature of the relationships is variable (is-a/contains/categorizes) and can only be determined by examining the definitions of the concepts
     * </p> 
	 */
	public CodeSystemConcept getConceptFirstRep() {
		if (getConcept().isEmpty()) {
			return addConcept();
		}
		return getConcept().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ValueSet.codeSystem.concept.designation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional representations for the concept - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * </p> 
	 */
	@Block()	
	public static class CodeSystemConceptDesignation 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="language", type=CodeDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The language this designation is defined for"
	)
	private CodeDt myLanguage;
	
	@Child(name="use", type=CodingDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code that details how this designation would be used"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-designation-use")
	private CodingDt myUse;
	
	@Child(name="value", type=StringDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The text value for this designation"
	)
	private StringDt myValue;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLanguage,  myUse,  myValue);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLanguage, myUse, myValue);
	}

	/**
	 * Gets the value(s) for <b>language</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The language this designation is defined for
     * </p> 
	 */
	public CodeDt getLanguageElement() {  
		if (myLanguage == null) {
			myLanguage = new CodeDt();
		}
		return myLanguage;
	}

	
	/**
	 * Gets the value(s) for <b>language</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The language this designation is defined for
     * </p> 
	 */
	public String getLanguage() {  
		return getLanguageElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>language</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The language this designation is defined for
     * </p> 
	 */
	public CodeSystemConceptDesignation setLanguage(CodeDt theValue) {
		myLanguage = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>language</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The language this designation is defined for
     * </p> 
	 */
	public CodeSystemConceptDesignation setLanguage( String theCode) {
		myLanguage = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>use</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that details how this designation would be used
     * </p> 
	 */
	public CodingDt getUse() {  
		if (myUse == null) {
			myUse = new CodingDt();
		}
		return myUse;
	}

	/**
	 * Sets the value(s) for <b>use</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code that details how this designation would be used
     * </p> 
	 */
	public CodeSystemConceptDesignation setUse(CodingDt theValue) {
		myUse = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The text value for this designation
     * </p> 
	 */
	public StringDt getValueElement() {  
		if (myValue == null) {
			myValue = new StringDt();
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
     * The text value for this designation
     * </p> 
	 */
	public String getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The text value for this designation
     * </p> 
	 */
	public CodeSystemConceptDesignation setValue(StringDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The text value for this designation
     * </p> 
	 */
	public CodeSystemConceptDesignation setValue( String theString) {
		myValue = new StringDt(theString); 
		return this; 
	}

 


	}




	/**
	 * Block class for child element: <b>ValueSet.compose</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of criteria that provide the content logical definition of the value set by including or excluding codes from outside this value set
     * </p> 
	 */
	@Block()	
	public static class Compose 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="import", type=UriDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri"
	)
	private java.util.List<UriDt> myImport;
	
	@Child(name="include", order=1, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Include one or more codes from a code system"
	)
	private java.util.List<ComposeInclude> myInclude;
	
	@Child(name="exclude", type=ComposeInclude.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Exclude one or more codes from the value set"
	)
	private java.util.List<ComposeInclude> myExclude;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myImport,  myInclude,  myExclude);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myImport, myInclude, myExclude);
	}

	/**
	 * Gets the value(s) for <b>import</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri
     * </p> 
	 */
	public java.util.List<UriDt> getImport() {  
		if (myImport == null) {
			myImport = new java.util.ArrayList<UriDt>();
		}
		return myImport;
	}

	/**
	 * Sets the value(s) for <b>import</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri
     * </p> 
	 */
	public Compose setImport(java.util.List<UriDt> theValue) {
		myImport = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>import</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri
     * </p> 
	 */
	public UriDt addImport() {
		UriDt newType = new UriDt();
		getImport().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>import</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri
	 * </p>
	 * @param theValue The import to add (must not be <code>null</code>)
	 */
	public Compose addImport(UriDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getImport().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>import</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri
     * </p> 
	 */
	public UriDt getImportFirstRep() {
		if (getImport().isEmpty()) {
			return addImport();
		}
		return getImport().get(0); 
	}
 	/**
	 * Adds a new value for <b>import</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Includes the contents of the referenced value set as a part of the contents of this value set. This is an absolute URI that is a reference to ValueSet.uri
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Compose addImport( String theUri) {
		if (myImport == null) {
			myImport = new java.util.ArrayList<UriDt>();
		}
		myImport.add(new UriDt(theUri));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>include</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Include one or more codes from a code system
     * </p> 
	 */
	public java.util.List<ComposeInclude> getInclude() {  
		if (myInclude == null) {
			myInclude = new java.util.ArrayList<ComposeInclude>();
		}
		return myInclude;
	}

	/**
	 * Sets the value(s) for <b>include</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Include one or more codes from a code system
     * </p> 
	 */
	public Compose setInclude(java.util.List<ComposeInclude> theValue) {
		myInclude = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>include</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Include one or more codes from a code system
     * </p> 
	 */
	public ComposeInclude addInclude() {
		ComposeInclude newType = new ComposeInclude();
		getInclude().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>include</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Include one or more codes from a code system
	 * </p>
	 * @param theValue The include to add (must not be <code>null</code>)
	 */
	public Compose addInclude(ComposeInclude theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getInclude().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>include</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Include one or more codes from a code system
     * </p> 
	 */
	public ComposeInclude getIncludeFirstRep() {
		if (getInclude().isEmpty()) {
			return addInclude();
		}
		return getInclude().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>exclude</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Exclude one or more codes from the value set
     * </p> 
	 */
	public java.util.List<ComposeInclude> getExclude() {  
		if (myExclude == null) {
			myExclude = new java.util.ArrayList<ComposeInclude>();
		}
		return myExclude;
	}

	/**
	 * Sets the value(s) for <b>exclude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Exclude one or more codes from the value set
     * </p> 
	 */
	public Compose setExclude(java.util.List<ComposeInclude> theValue) {
		myExclude = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>exclude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Exclude one or more codes from the value set
     * </p> 
	 */
	public ComposeInclude addExclude() {
		ComposeInclude newType = new ComposeInclude();
		getExclude().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>exclude</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Exclude one or more codes from the value set
	 * </p>
	 * @param theValue The exclude to add (must not be <code>null</code>)
	 */
	public Compose addExclude(ComposeInclude theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getExclude().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>exclude</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Exclude one or more codes from the value set
     * </p> 
	 */
	public ComposeInclude getExcludeFirstRep() {
		if (getExclude().isEmpty()) {
			return addExclude();
		}
		return getExclude().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ValueSet.compose.include</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Include one or more codes from a code system
     * </p> 
	 */
	@Block()	
	public static class ComposeInclude 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="system", type=UriDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An absolute URI which is the code system from which the selected codes come from"
	)
	private UriDt mySystem;
	
	@Child(name="version", type=StringDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The version of the code system that the codes are selected from"
	)
	private StringDt myVersion;
	
	@Child(name="concept", order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specifies a concept to be included or excluded."
	)
	private java.util.List<ComposeIncludeConcept> myConcept;
	
	@Child(name="filter", order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true."
	)
	private java.util.List<ComposeIncludeFilter> myFilter;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySystem,  myVersion,  myConcept,  myFilter);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySystem, myVersion, myConcept, myFilter);
	}

	/**
	 * Gets the value(s) for <b>system</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI which is the code system from which the selected codes come from
     * </p> 
	 */
	public UriDt getSystemElement() {  
		if (mySystem == null) {
			mySystem = new UriDt();
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
     * An absolute URI which is the code system from which the selected codes come from
     * </p> 
	 */
	public String getSystem() {  
		return getSystemElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>system</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI which is the code system from which the selected codes come from
     * </p> 
	 */
	public ComposeInclude setSystem(UriDt theValue) {
		mySystem = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>system</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI which is the code system from which the selected codes come from
     * </p> 
	 */
	public ComposeInclude setSystem( String theUri) {
		mySystem = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>version</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the code system that the codes are selected from
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
     * The version of the code system that the codes are selected from
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
     * The version of the code system that the codes are selected from
     * </p> 
	 */
	public ComposeInclude setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>version</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the code system that the codes are selected from
     * </p> 
	 */
	public ComposeInclude setVersion( String theString) {
		myVersion = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>concept</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies a concept to be included or excluded.
     * </p> 
	 */
	public java.util.List<ComposeIncludeConcept> getConcept() {  
		if (myConcept == null) {
			myConcept = new java.util.ArrayList<ComposeIncludeConcept>();
		}
		return myConcept;
	}

	/**
	 * Sets the value(s) for <b>concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies a concept to be included or excluded.
     * </p> 
	 */
	public ComposeInclude setConcept(java.util.List<ComposeIncludeConcept> theValue) {
		myConcept = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies a concept to be included or excluded.
     * </p> 
	 */
	public ComposeIncludeConcept addConcept() {
		ComposeIncludeConcept newType = new ComposeIncludeConcept();
		getConcept().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>concept</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Specifies a concept to be included or excluded.
	 * </p>
	 * @param theValue The concept to add (must not be <code>null</code>)
	 */
	public ComposeInclude addConcept(ComposeIncludeConcept theValue) {
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
     * Specifies a concept to be included or excluded.
     * </p> 
	 */
	public ComposeIncludeConcept getConceptFirstRep() {
		if (getConcept().isEmpty()) {
			return addConcept();
		}
		return getConcept().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>filter</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
     * </p> 
	 */
	public java.util.List<ComposeIncludeFilter> getFilter() {  
		if (myFilter == null) {
			myFilter = new java.util.ArrayList<ComposeIncludeFilter>();
		}
		return myFilter;
	}

	/**
	 * Sets the value(s) for <b>filter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
     * </p> 
	 */
	public ComposeInclude setFilter(java.util.List<ComposeIncludeFilter> theValue) {
		myFilter = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>filter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
     * </p> 
	 */
	public ComposeIncludeFilter addFilter() {
		ComposeIncludeFilter newType = new ComposeIncludeFilter();
		getFilter().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>filter</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
	 * </p>
	 * @param theValue The filter to add (must not be <code>null</code>)
	 */
	public ComposeInclude addFilter(ComposeIncludeFilter theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFilter().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>filter</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
     * </p> 
	 */
	public ComposeIncludeFilter getFilterFirstRep() {
		if (getFilter().isEmpty()) {
			return addFilter();
		}
		return getFilter().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ValueSet.compose.include.concept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies a concept to be included or excluded.
     * </p> 
	 */
	@Block()	
	public static class ComposeIncludeConcept 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specifies a code for the concept to be included or excluded"
	)
	private CodeDt myCode;
	
	@Child(name="display", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system"
	)
	private StringDt myDisplay;
	
	@Child(name="designation", type=CodeSystemConceptDesignation.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc."
	)
	private java.util.List<CodeSystemConceptDesignation> myDesignation;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myDisplay,  myDesignation);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myDisplay, myDesignation);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies a code for the concept to be included or excluded
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
     * Specifies a code for the concept to be included or excluded
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
     * Specifies a code for the concept to be included or excluded
     * </p> 
	 */
	public ComposeIncludeConcept setCode(CodeDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies a code for the concept to be included or excluded
     * </p> 
	 */
	public ComposeIncludeConcept setCode( String theCode) {
		myCode = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>display</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system
     * </p> 
	 */
	public StringDt getDisplayElement() {  
		if (myDisplay == null) {
			myDisplay = new StringDt();
		}
		return myDisplay;
	}

	
	/**
	 * Gets the value(s) for <b>display</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system
     * </p> 
	 */
	public String getDisplay() {  
		return getDisplayElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>display</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system
     * </p> 
	 */
	public ComposeIncludeConcept setDisplay(StringDt theValue) {
		myDisplay = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>display</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The text to display to the user for this concept in the context of this valueset. If no display is provided, then applications using the value set use the display specified for the code by the system
     * </p> 
	 */
	public ComposeIncludeConcept setDisplay( String theString) {
		myDisplay = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>designation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * </p> 
	 */
	public java.util.List<CodeSystemConceptDesignation> getDesignation() {  
		if (myDesignation == null) {
			myDesignation = new java.util.ArrayList<CodeSystemConceptDesignation>();
		}
		return myDesignation;
	}

	/**
	 * Sets the value(s) for <b>designation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * </p> 
	 */
	public ComposeIncludeConcept setDesignation(java.util.List<CodeSystemConceptDesignation> theValue) {
		myDesignation = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>designation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * </p> 
	 */
	public CodeSystemConceptDesignation addDesignation() {
		CodeSystemConceptDesignation newType = new CodeSystemConceptDesignation();
		getDesignation().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>designation</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
	 * </p>
	 * @param theValue The designation to add (must not be <code>null</code>)
	 */
	public ComposeIncludeConcept addDesignation(CodeSystemConceptDesignation theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDesignation().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>designation</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional representations for this concept when used in this value set - other languages, aliases, specialized purposes, used for particular purposes, etc.
     * </p> 
	 */
	public CodeSystemConceptDesignation getDesignationFirstRep() {
		if (getDesignation().isEmpty()) {
			return addDesignation();
		}
		return getDesignation().get(0); 
	}
  


	}


	/**
	 * Block class for child element: <b>ValueSet.compose.include.filter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Select concepts by specify a matching criteria based on the properties (including relationships) defined by the system. If multiple filters are specified, they SHALL all be true.
     * </p> 
	 */
	@Block()	
	public static class ComposeIncludeFilter 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="property", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code that identifies a property defined in the code system"
	)
	private CodeDt myProperty;
	
	@Child(name="op", type=CodeDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The kind of operation to perform as a part of the filter criteria"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/filter-operator")
	private BoundCodeDt<FilterOperatorEnum> myOp;
	
	@Child(name="value", type=CodeDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value"
	)
	private CodeDt myValue;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myProperty,  myOp,  myValue);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myProperty, myOp, myValue);
	}

	/**
	 * Gets the value(s) for <b>property</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that identifies a property defined in the code system
     * </p> 
	 */
	public CodeDt getPropertyElement() {  
		if (myProperty == null) {
			myProperty = new CodeDt();
		}
		return myProperty;
	}

	
	/**
	 * Gets the value(s) for <b>property</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that identifies a property defined in the code system
     * </p> 
	 */
	public String getProperty() {  
		return getPropertyElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>property</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code that identifies a property defined in the code system
     * </p> 
	 */
	public ComposeIncludeFilter setProperty(CodeDt theValue) {
		myProperty = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>property</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code that identifies a property defined in the code system
     * </p> 
	 */
	public ComposeIncludeFilter setProperty( String theCode) {
		myProperty = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>op</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of operation to perform as a part of the filter criteria
     * </p> 
	 */
	public BoundCodeDt<FilterOperatorEnum> getOpElement() {  
		if (myOp == null) {
			myOp = new BoundCodeDt<FilterOperatorEnum>(FilterOperatorEnum.VALUESET_BINDER);
		}
		return myOp;
	}

	
	/**
	 * Gets the value(s) for <b>op</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of operation to perform as a part of the filter criteria
     * </p> 
	 */
	public String getOp() {  
		return getOpElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>op</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of operation to perform as a part of the filter criteria
     * </p> 
	 */
	public ComposeIncludeFilter setOp(BoundCodeDt<FilterOperatorEnum> theValue) {
		myOp = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>op</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of operation to perform as a part of the filter criteria
     * </p> 
	 */
	public ComposeIncludeFilter setOp(FilterOperatorEnum theValue) {
		setOp(new BoundCodeDt<FilterOperatorEnum>(FilterOperatorEnum.VALUESET_BINDER, theValue));
		
/*
		getOpElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value
     * </p> 
	 */
	public CodeDt getValueElement() {  
		if (myValue == null) {
			myValue = new CodeDt();
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
     * The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value
     * </p> 
	 */
	public String getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value
     * </p> 
	 */
	public ComposeIncludeFilter setValue(CodeDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The match value may be either a code defined by the system, or a string value, which is a regex match on the literal string of the property value
     * </p> 
	 */
	public ComposeIncludeFilter setValue( String theCode) {
		myValue = new CodeDt(theCode); 
		return this; 
	}

 


	}




	/**
	 * Block class for child element: <b>ValueSet.expansion</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A value set can also be \"expanded\", where the value set is turned into a simple collection of enumerated codes. This element holds the expansion, if it has been performed
     * </p> 
	 */
	@Block()	
	public static class Expansion 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="identifier", type=UriDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so"
	)
	private UriDt myIdentifier;
	
	@Child(name="timestamp", type=DateTimeDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The time at which the expansion was produced by the expanding system."
	)
	private DateTimeDt myTimestamp;
	
	@Child(name="total", type=IntegerDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter"
	)
	private IntegerDt myTotal;
	
	@Child(name="offset", type=IntegerDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present"
	)
	private IntegerDt myOffset;
	
	@Child(name="parameter", order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion"
	)
	private java.util.List<ExpansionParameter> myParameter;
	
	@Child(name="contains", order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The codes that are contained in the value set expansion"
	)
	private java.util.List<ExpansionContains> myContains;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myTimestamp,  myTotal,  myOffset,  myParameter,  myContains);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myTimestamp, myTotal, myOffset, myParameter, myContains);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so
     * </p> 
	 */
	public UriDt getIdentifierElement() {  
		if (myIdentifier == null) {
			myIdentifier = new UriDt();
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
     * An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so
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
     * An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so
     * </p> 
	 */
	public Expansion setIdentifier(UriDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that uniquely identifies this expansion of the valueset. Systems may re-use the same identifier as long as the expansion and the definition remain the same, but are not required to do so
     * </p> 
	 */
	public Expansion setIdentifier( String theUri) {
		myIdentifier = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>timestamp</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time at which the expansion was produced by the expanding system.
     * </p> 
	 */
	public DateTimeDt getTimestampElement() {  
		if (myTimestamp == null) {
			myTimestamp = new DateTimeDt();
		}
		return myTimestamp;
	}

	
	/**
	 * Gets the value(s) for <b>timestamp</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time at which the expansion was produced by the expanding system.
     * </p> 
	 */
	public Date getTimestamp() {  
		return getTimestampElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>timestamp</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time at which the expansion was produced by the expanding system.
     * </p> 
	 */
	public Expansion setTimestamp(DateTimeDt theValue) {
		myTimestamp = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>timestamp</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time at which the expansion was produced by the expanding system.
     * </p> 
	 */
	public Expansion setTimestamp( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myTimestamp = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>timestamp</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time at which the expansion was produced by the expanding system.
     * </p> 
	 */
	public Expansion setTimestampWithSecondsPrecision( Date theDate) {
		myTimestamp = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>total</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter
     * </p> 
	 */
	public IntegerDt getTotalElement() {  
		if (myTotal == null) {
			myTotal = new IntegerDt();
		}
		return myTotal;
	}

	
	/**
	 * Gets the value(s) for <b>total</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter
     * </p> 
	 */
	public Integer getTotal() {  
		return getTotalElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>total</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter
     * </p> 
	 */
	public Expansion setTotal(IntegerDt theValue) {
		myTotal = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>total</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The total number of concepts in the expansion. If the number of concept nodes in this resource is less than the stated number, then the server can return more using the offset parameter
     * </p> 
	 */
	public Expansion setTotal( int theInteger) {
		myTotal = new IntegerDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>offset</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present
     * </p> 
	 */
	public IntegerDt getOffsetElement() {  
		if (myOffset == null) {
			myOffset = new IntegerDt();
		}
		return myOffset;
	}

	
	/**
	 * Gets the value(s) for <b>offset</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present
     * </p> 
	 */
	public Integer getOffset() {  
		return getOffsetElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>offset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present
     * </p> 
	 */
	public Expansion setOffset(IntegerDt theValue) {
		myOffset = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>offset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If paging is being used, the offset at which this resource starts.  I.e. this resource is a partial view into the expansion. If paging is not being used, this element SHALL not be present
     * </p> 
	 */
	public Expansion setOffset( int theInteger) {
		myOffset = new IntegerDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>parameter</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion
     * </p> 
	 */
	public java.util.List<ExpansionParameter> getParameter() {  
		if (myParameter == null) {
			myParameter = new java.util.ArrayList<ExpansionParameter>();
		}
		return myParameter;
	}

	/**
	 * Sets the value(s) for <b>parameter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion
     * </p> 
	 */
	public Expansion setParameter(java.util.List<ExpansionParameter> theValue) {
		myParameter = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>parameter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion
     * </p> 
	 */
	public ExpansionParameter addParameter() {
		ExpansionParameter newType = new ExpansionParameter();
		getParameter().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>parameter</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion
	 * </p>
	 * @param theValue The parameter to add (must not be <code>null</code>)
	 */
	public Expansion addParameter(ExpansionParameter theValue) {
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
     * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion
     * </p> 
	 */
	public ExpansionParameter getParameterFirstRep() {
		if (getParameter().isEmpty()) {
			return addParameter();
		}
		return getParameter().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>contains</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The codes that are contained in the value set expansion
     * </p> 
	 */
	public java.util.List<ExpansionContains> getContains() {  
		if (myContains == null) {
			myContains = new java.util.ArrayList<ExpansionContains>();
		}
		return myContains;
	}

	/**
	 * Sets the value(s) for <b>contains</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The codes that are contained in the value set expansion
     * </p> 
	 */
	public Expansion setContains(java.util.List<ExpansionContains> theValue) {
		myContains = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>contains</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The codes that are contained in the value set expansion
     * </p> 
	 */
	public ExpansionContains addContains() {
		ExpansionContains newType = new ExpansionContains();
		getContains().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>contains</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The codes that are contained in the value set expansion
	 * </p>
	 * @param theValue The contains to add (must not be <code>null</code>)
	 */
	public Expansion addContains(ExpansionContains theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getContains().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>contains</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The codes that are contained in the value set expansion
     * </p> 
	 */
	public ExpansionContains getContainsFirstRep() {
		if (getContains().isEmpty()) {
			return addContains();
		}
		return getContains().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ValueSet.expansion.parameter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A parameter that controlled the expansion process. These parameters may be used by users of expanded value sets to check whether the expansion is suitable for a particular purpose, or to pick the correct expansion
     * </p> 
	 */
	@Block()	
	public static class ExpansionParameter 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=StringDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of the parameter"
	)
	private StringDt myName;
	
	@Child(name="value", order=1, min=0, max=1, summary=false, modifier=false, type={
		StringDt.class, 		BooleanDt.class, 		IntegerDt.class, 		DecimalDt.class, 		UriDt.class, 		CodeDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The value of the parameter"
	)
	private IDatatype myValue;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  myValue);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, myValue);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the parameter
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
     * The name of the parameter
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
     * The name of the parameter
     * </p> 
	 */
	public ExpansionParameter setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the parameter
     * </p> 
	 */
	public ExpansionParameter setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>value[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the parameter
     * </p> 
	 */
	public IDatatype getValue() {  
		return myValue;
	}

	/**
	 * Sets the value(s) for <b>value[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the parameter
     * </p> 
	 */
	public ExpansionParameter setValue(IDatatype theValue) {
		myValue = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>ValueSet.expansion.contains</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The codes that are contained in the value set expansion
     * </p> 
	 */
	@Block()	
	public static class ExpansionContains 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="system", type=UriDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An absolute URI which is the code system in which the code for this item in the expansion is defined"
	)
	private UriDt mySystem;
	
	@Child(name="abstract", type=BooleanDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value"
	)
	private BooleanDt myAbstract;
	
	@Child(name="version", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence"
	)
	private StringDt myVersion;
	
	@Child(name="code", type=CodeDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set"
	)
	private CodeDt myCode;
	
	@Child(name="display", type=StringDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The recommended display for this item in the expansion"
	)
	private StringDt myDisplay;
	
	@Child(name="contains", type=ExpansionContains.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Other codes and entries contained under this entry in the hierarchy"
	)
	private java.util.List<ExpansionContains> myContains;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySystem,  myAbstract,  myVersion,  myCode,  myDisplay,  myContains);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySystem, myAbstract, myVersion, myCode, myDisplay, myContains);
	}

	/**
	 * Gets the value(s) for <b>system</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI which is the code system in which the code for this item in the expansion is defined
     * </p> 
	 */
	public UriDt getSystemElement() {  
		if (mySystem == null) {
			mySystem = new UriDt();
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
     * An absolute URI which is the code system in which the code for this item in the expansion is defined
     * </p> 
	 */
	public String getSystem() {  
		return getSystemElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>system</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI which is the code system in which the code for this item in the expansion is defined
     * </p> 
	 */
	public ExpansionContains setSystem(UriDt theValue) {
		mySystem = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>system</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URI which is the code system in which the code for this item in the expansion is defined
     * </p> 
	 */
	public ExpansionContains setSystem( String theUri) {
		mySystem = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>abstract</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value
     * </p> 
	 */
	public BooleanDt getAbstractElement() {  
		if (myAbstract == null) {
			myAbstract = new BooleanDt();
		}
		return myAbstract;
	}

	
	/**
	 * Gets the value(s) for <b>abstract</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value
     * </p> 
	 */
	public Boolean getAbstract() {  
		return getAbstractElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>abstract</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value
     * </p> 
	 */
	public ExpansionContains setAbstract(BooleanDt theValue) {
		myAbstract = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>abstract</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If true, this entry is included in the expansion for navigational purposes, and the user cannot select the code directly as a proper value
     * </p> 
	 */
	public ExpansionContains setAbstract( boolean theBoolean) {
		myAbstract = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>version</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence
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
     * The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence
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
     * The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence
     * </p> 
	 */
	public ExpansionContains setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>version</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version of this code system that defined this code and/or display. This should only be used with code systems that do not enforce concept permanence
     * </p> 
	 */
	public ExpansionContains setVersion( String theString) {
		myVersion = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set
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
     * The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set
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
     * The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set
     * </p> 
	 */
	public ExpansionContains setCode(CodeDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The code for this item in the expansion hierarchy. If this code is missing the entry in the hierarchy is a place holder (abstract) and does not represent a valid code in the value set
     * </p> 
	 */
	public ExpansionContains setCode( String theCode) {
		myCode = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>display</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The recommended display for this item in the expansion
     * </p> 
	 */
	public StringDt getDisplayElement() {  
		if (myDisplay == null) {
			myDisplay = new StringDt();
		}
		return myDisplay;
	}

	
	/**
	 * Gets the value(s) for <b>display</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The recommended display for this item in the expansion
     * </p> 
	 */
	public String getDisplay() {  
		return getDisplayElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>display</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The recommended display for this item in the expansion
     * </p> 
	 */
	public ExpansionContains setDisplay(StringDt theValue) {
		myDisplay = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>display</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The recommended display for this item in the expansion
     * </p> 
	 */
	public ExpansionContains setDisplay( String theString) {
		myDisplay = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>contains</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Other codes and entries contained under this entry in the hierarchy
     * </p> 
	 */
	public java.util.List<ExpansionContains> getContains() {  
		if (myContains == null) {
			myContains = new java.util.ArrayList<ExpansionContains>();
		}
		return myContains;
	}

	/**
	 * Sets the value(s) for <b>contains</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Other codes and entries contained under this entry in the hierarchy
     * </p> 
	 */
	public ExpansionContains setContains(java.util.List<ExpansionContains> theValue) {
		myContains = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>contains</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Other codes and entries contained under this entry in the hierarchy
     * </p> 
	 */
	public ExpansionContains addContains() {
		ExpansionContains newType = new ExpansionContains();
		getContains().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>contains</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Other codes and entries contained under this entry in the hierarchy
	 * </p>
	 * @param theValue The contains to add (must not be <code>null</code>)
	 */
	public ExpansionContains addContains(ExpansionContains theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getContains().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>contains</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Other codes and entries contained under this entry in the hierarchy
     * </p> 
	 */
	public ExpansionContains getContainsFirstRep() {
		if (getContains().isEmpty()) {
			return addContains();
		}
		return getContains().get(0); 
	}
  


	}





    @Override
    public String getResourceName() {
        return "ValueSet";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
