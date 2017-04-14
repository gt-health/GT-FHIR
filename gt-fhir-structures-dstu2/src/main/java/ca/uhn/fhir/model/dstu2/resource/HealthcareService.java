















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
 * HAPI/FHIR <b>HealthcareService</b> Resource
 * (administrative.group)
 *
 * <p>
 * <b>Definition:</b>
 * The details of a healthcare service available at a location.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/HealthcareService">http://hl7.org/fhir/profiles/HealthcareService</a> 
 * </p>
 *
 */
@ResourceDef(name="HealthcareService", profile="http://hl7.org/fhir/profiles/HealthcareService", id="healthcareservice")
public class HealthcareService extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>HealthcareService.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="HealthcareService.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>HealthcareService.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>servicecategory</b>
	 * <p>
	 * Description: <b>Service Category of the Healthcare Service</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>HealthcareService.serviceCategory</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="servicecategory", path="HealthcareService.serviceCategory", description="Service Category of the Healthcare Service", type="token"  )
	public static final String SP_SERVICECATEGORY = "servicecategory";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>servicecategory</b>
	 * <p>
	 * Description: <b>Service Category of the Healthcare Service</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>HealthcareService.serviceCategory</b><br>
	 * </p>
	 */
	public static final TokenClientParam SERVICECATEGORY = new TokenClientParam(SP_SERVICECATEGORY);

	/**
	 * Search parameter constant for <b>servicetype</b>
	 * <p>
	 * Description: <b>The type of service provided by this healthcare service</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>HealthcareService.serviceType.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="servicetype", path="HealthcareService.serviceType.type", description="The type of service provided by this healthcare service", type="token"  )
	public static final String SP_SERVICETYPE = "servicetype";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>servicetype</b>
	 * <p>
	 * Description: <b>The type of service provided by this healthcare service</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>HealthcareService.serviceType.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam SERVICETYPE = new TokenClientParam(SP_SERVICETYPE);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A portion of the Healthcare service name</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>HealthcareService.serviceName</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="HealthcareService.serviceName", description="A portion of the Healthcare service name", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A portion of the Healthcare service name</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>HealthcareService.serviceName</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b>The location of the Healthcare Service</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>HealthcareService.location</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="location", path="HealthcareService.location", description="The location of the Healthcare Service", type="reference"  )
	public static final String SP_LOCATION = "location";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b>The location of the Healthcare Service</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>HealthcareService.location</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam LOCATION = new ReferenceClientParam(SP_LOCATION);

	/**
	 * Search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>The organization that provides this Healthcare Service</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>HealthcareService.providedBy</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="organization", path="HealthcareService.providedBy", description="The organization that provides this Healthcare Service", type="reference"  )
	public static final String SP_ORGANIZATION = "organization";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>The organization that provides this Healthcare Service</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>HealthcareService.providedBy</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ORGANIZATION = new ReferenceClientParam(SP_ORGANIZATION);

	/**
	 * Search parameter constant for <b>programname</b>
	 * <p>
	 * Description: <b>One of the Program Names serviced by this HealthcareService</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>HealthcareService.programName</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="programname", path="HealthcareService.programName", description="One of the Program Names serviced by this HealthcareService", type="string"  )
	public static final String SP_PROGRAMNAME = "programname";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>programname</b>
	 * <p>
	 * Description: <b>One of the Program Names serviced by this HealthcareService</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>HealthcareService.programName</b><br>
	 * </p>
	 */
	public static final StringClientParam PROGRAMNAME = new StringClientParam(SP_PROGRAMNAME);

	/**
	 * Search parameter constant for <b>characteristic</b>
	 * <p>
	 * Description: <b>One of the HealthcareService's characteristics</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>HealthcareService.characteristic</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="characteristic", path="HealthcareService.characteristic", description="One of the HealthcareService's characteristics", type="token"  )
	public static final String SP_CHARACTERISTIC = "characteristic";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>characteristic</b>
	 * <p>
	 * Description: <b>One of the HealthcareService's characteristics</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>HealthcareService.characteristic</b><br>
	 * </p>
	 */
	public static final TokenClientParam CHARACTERISTIC = new TokenClientParam(SP_CHARACTERISTIC);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>HealthcareService:location</b>".
	 */
	public static final Include INCLUDE_LOCATION = new Include("HealthcareService:location");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>HealthcareService:organization</b>".
	 */
	public static final Include INCLUDE_ORGANIZATION = new Include("HealthcareService:organization");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="External identifiers for this item"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="providedBy", order=1, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The organization that provides this healthcare service"
	)
	private ResourceReferenceDt myProvidedBy;
	
	@Child(name="serviceCategory", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="Identifies the broad category of service being performed or delivered"
	)
	private CodeableConceptDt myServiceCategory;
	
	@Child(name="serviceType", order=3, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A specific type of service that may be delivered or performed"
	)
	private java.util.List<ServiceType> myServiceType;
	
	@Child(name="location", order=4, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="where",
		formalDefinition="The location where this healthcare service may be provided"
	)
	private ResourceReferenceDt myLocation;
	
	@Child(name="serviceName", type=StringDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Further description of the service as it would be presented to a consumer while searching"
	)
	private StringDt myServiceName;
	
	@Child(name="comment", type=StringDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName"
	)
	private StringDt myComment;
	
	@Child(name="extraDetails", type=StringDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Extra details about the service that can't be placed in the other fields"
	)
	private StringDt myExtraDetails;
	
	@Child(name="photo", type=AttachmentDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list"
	)
	private AttachmentDt myPhoto;
	
	@Child(name="telecom", type=ContactPointDt.class, order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of contacts related to this specific healthcare service"
	)
	private java.util.List<ContactPointDt> myTelecom;
	
	@Child(name="coverageArea", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The location(s) that this service is available to (not where the service is provided)"
	)
	private java.util.List<ResourceReferenceDt> myCoverageArea;
	
	@Child(name="serviceProvisionCode", type=CodeableConceptDt.class, order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The code(s) that detail the conditions under which the healthcare service is available/offered"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/service-provision-conditions")
	private java.util.List<BoundCodeableConceptDt<ServiceProvisionConditionsEnum>> myServiceProvisionCode;
	
	@Child(name="eligibility", type=CodeableConceptDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Does this service have specific eligibility requirements that need to be met in order to use the service?"
	)
	private CodeableConceptDt myEligibility;
	
	@Child(name="eligibilityNote", type=StringDt.class, order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the eligibility conditions for the service"
	)
	private StringDt myEligibilityNote;
	
	@Child(name="programName", type=StringDt.class, order=14, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Program Names that can be used to categorize the service"
	)
	private java.util.List<StringDt> myProgramName;
	
	@Child(name="characteristic", type=CodeableConceptDt.class, order=15, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Collection of characteristics (attributes)"
	)
	private java.util.List<CodeableConceptDt> myCharacteristic;
	
	@Child(name="referralMethod", type=CodeableConceptDt.class, order=16, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/service-referral-method")
	private java.util.List<BoundCodeableConceptDt<ReferralMethodEnum>> myReferralMethod;
	
	@Child(name="publicKey", type=StringDt.class, order=17, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available"
	)
	private StringDt myPublicKey;
	
	@Child(name="appointmentRequired", type=BooleanDt.class, order=18, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service."
	)
	private BooleanDt myAppointmentRequired;
	
	@Child(name="availableTime", order=19, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A collection of times that the Service Site is available"
	)
	private java.util.List<AvailableTime> myAvailableTime;
	
	@Child(name="notAvailable", order=20, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The HealthcareService is not available during this period of time due to the provided reason"
	)
	private java.util.List<NotAvailable> myNotAvailable;
	
	@Child(name="availabilityExceptions", type=StringDt.class, order=21, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times"
	)
	private StringDt myAvailabilityExceptions;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myProvidedBy,  myServiceCategory,  myServiceType,  myLocation,  myServiceName,  myComment,  myExtraDetails,  myPhoto,  myTelecom,  myCoverageArea,  myServiceProvisionCode,  myEligibility,  myEligibilityNote,  myProgramName,  myCharacteristic,  myReferralMethod,  myPublicKey,  myAppointmentRequired,  myAvailableTime,  myNotAvailable,  myAvailabilityExceptions);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myProvidedBy, myServiceCategory, myServiceType, myLocation, myServiceName, myComment, myExtraDetails, myPhoto, myTelecom, myCoverageArea, myServiceProvisionCode, myEligibility, myEligibilityNote, myProgramName, myCharacteristic, myReferralMethod, myPublicKey, myAppointmentRequired, myAvailableTime, myNotAvailable, myAvailabilityExceptions);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * External identifiers for this item
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
     * External identifiers for this item
     * </p> 
	 */
	public HealthcareService setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * External identifiers for this item
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
	 * External identifiers for this item
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public HealthcareService addIdentifier(IdentifierDt theValue) {
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
     * External identifiers for this item
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>providedBy</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The organization that provides this healthcare service
     * </p> 
	 */
	public ResourceReferenceDt getProvidedBy() {  
		if (myProvidedBy == null) {
			myProvidedBy = new ResourceReferenceDt();
		}
		return myProvidedBy;
	}

	/**
	 * Sets the value(s) for <b>providedBy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The organization that provides this healthcare service
     * </p> 
	 */
	public HealthcareService setProvidedBy(ResourceReferenceDt theValue) {
		myProvidedBy = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>serviceCategory</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the broad category of service being performed or delivered
     * </p> 
	 */
	public CodeableConceptDt getServiceCategory() {  
		if (myServiceCategory == null) {
			myServiceCategory = new CodeableConceptDt();
		}
		return myServiceCategory;
	}

	/**
	 * Sets the value(s) for <b>serviceCategory</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the broad category of service being performed or delivered
     * </p> 
	 */
	public HealthcareService setServiceCategory(CodeableConceptDt theValue) {
		myServiceCategory = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>serviceType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A specific type of service that may be delivered or performed
     * </p> 
	 */
	public java.util.List<ServiceType> getServiceType() {  
		if (myServiceType == null) {
			myServiceType = new java.util.ArrayList<ServiceType>();
		}
		return myServiceType;
	}

	/**
	 * Sets the value(s) for <b>serviceType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A specific type of service that may be delivered or performed
     * </p> 
	 */
	public HealthcareService setServiceType(java.util.List<ServiceType> theValue) {
		myServiceType = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>serviceType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A specific type of service that may be delivered or performed
     * </p> 
	 */
	public ServiceType addServiceType() {
		ServiceType newType = new ServiceType();
		getServiceType().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>serviceType</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A specific type of service that may be delivered or performed
	 * </p>
	 * @param theValue The serviceType to add (must not be <code>null</code>)
	 */
	public HealthcareService addServiceType(ServiceType theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getServiceType().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>serviceType</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A specific type of service that may be delivered or performed
     * </p> 
	 */
	public ServiceType getServiceTypeFirstRep() {
		if (getServiceType().isEmpty()) {
			return addServiceType();
		}
		return getServiceType().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>location</b> (where).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The location where this healthcare service may be provided
     * </p> 
	 */
	public ResourceReferenceDt getLocation() {  
		if (myLocation == null) {
			myLocation = new ResourceReferenceDt();
		}
		return myLocation;
	}

	/**
	 * Sets the value(s) for <b>location</b> (where)
	 *
     * <p>
     * <b>Definition:</b>
     * The location where this healthcare service may be provided
     * </p> 
	 */
	public HealthcareService setLocation(ResourceReferenceDt theValue) {
		myLocation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>serviceName</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Further description of the service as it would be presented to a consumer while searching
     * </p> 
	 */
	public StringDt getServiceNameElement() {  
		if (myServiceName == null) {
			myServiceName = new StringDt();
		}
		return myServiceName;
	}

	
	/**
	 * Gets the value(s) for <b>serviceName</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Further description of the service as it would be presented to a consumer while searching
     * </p> 
	 */
	public String getServiceName() {  
		return getServiceNameElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>serviceName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Further description of the service as it would be presented to a consumer while searching
     * </p> 
	 */
	public HealthcareService setServiceName(StringDt theValue) {
		myServiceName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>serviceName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Further description of the service as it would be presented to a consumer while searching
     * </p> 
	 */
	public HealthcareService setServiceName( String theString) {
		myServiceName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>comment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName
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
     * Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName
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
     * Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName
     * </p> 
	 */
	public HealthcareService setComment(StringDt theValue) {
		myComment = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>comment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any additional description of the service and/or any specific issues not covered by the other attributes, which can be displayed as further detail under the serviceName
     * </p> 
	 */
	public HealthcareService setComment( String theString) {
		myComment = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>extraDetails</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Extra details about the service that can't be placed in the other fields
     * </p> 
	 */
	public StringDt getExtraDetailsElement() {  
		if (myExtraDetails == null) {
			myExtraDetails = new StringDt();
		}
		return myExtraDetails;
	}

	
	/**
	 * Gets the value(s) for <b>extraDetails</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Extra details about the service that can't be placed in the other fields
     * </p> 
	 */
	public String getExtraDetails() {  
		return getExtraDetailsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>extraDetails</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Extra details about the service that can't be placed in the other fields
     * </p> 
	 */
	public HealthcareService setExtraDetails(StringDt theValue) {
		myExtraDetails = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>extraDetails</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Extra details about the service that can't be placed in the other fields
     * </p> 
	 */
	public HealthcareService setExtraDetails( String theString) {
		myExtraDetails = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>photo</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list
     * </p> 
	 */
	public AttachmentDt getPhoto() {  
		if (myPhoto == null) {
			myPhoto = new AttachmentDt();
		}
		return myPhoto;
	}

	/**
	 * Sets the value(s) for <b>photo</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If there is a photo/symbol associated with this HealthcareService, it may be included here to facilitate quick identification of the service in a list
     * </p> 
	 */
	public HealthcareService setPhoto(AttachmentDt theValue) {
		myPhoto = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>telecom</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of contacts related to this specific healthcare service
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
     * List of contacts related to this specific healthcare service
     * </p> 
	 */
	public HealthcareService setTelecom(java.util.List<ContactPointDt> theValue) {
		myTelecom = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>telecom</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of contacts related to this specific healthcare service
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
	 * List of contacts related to this specific healthcare service
	 * </p>
	 * @param theValue The telecom to add (must not be <code>null</code>)
	 */
	public HealthcareService addTelecom(ContactPointDt theValue) {
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
     * List of contacts related to this specific healthcare service
     * </p> 
	 */
	public ContactPointDt getTelecomFirstRep() {
		if (getTelecom().isEmpty()) {
			return addTelecom();
		}
		return getTelecom().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>coverageArea</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The location(s) that this service is available to (not where the service is provided)
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getCoverageArea() {  
		if (myCoverageArea == null) {
			myCoverageArea = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myCoverageArea;
	}

	/**
	 * Sets the value(s) for <b>coverageArea</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The location(s) that this service is available to (not where the service is provided)
     * </p> 
	 */
	public HealthcareService setCoverageArea(java.util.List<ResourceReferenceDt> theValue) {
		myCoverageArea = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>coverageArea</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The location(s) that this service is available to (not where the service is provided)
     * </p> 
	 */
	public ResourceReferenceDt addCoverageArea() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getCoverageArea().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>serviceProvisionCode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The code(s) that detail the conditions under which the healthcare service is available/offered
     * </p> 
	 */
	public java.util.List<BoundCodeableConceptDt<ServiceProvisionConditionsEnum>> getServiceProvisionCode() {  
		if (myServiceProvisionCode == null) {
			myServiceProvisionCode = new java.util.ArrayList<BoundCodeableConceptDt<ServiceProvisionConditionsEnum>>();
		}
		return myServiceProvisionCode;
	}

	/**
	 * Sets the value(s) for <b>serviceProvisionCode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The code(s) that detail the conditions under which the healthcare service is available/offered
     * </p> 
	 */
	public HealthcareService setServiceProvisionCode(java.util.List<BoundCodeableConceptDt<ServiceProvisionConditionsEnum>> theValue) {
		myServiceProvisionCode = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>serviceProvisionCode</b> () using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addServiceProvisionCode()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * The code(s) that detail the conditions under which the healthcare service is available/offered
     * </p> 
	 */
	public BoundCodeableConceptDt<ServiceProvisionConditionsEnum> addServiceProvisionCode(ServiceProvisionConditionsEnum theValue) {
		BoundCodeableConceptDt<ServiceProvisionConditionsEnum> retVal = new BoundCodeableConceptDt<ServiceProvisionConditionsEnum>(ServiceProvisionConditionsEnum.VALUESET_BINDER, theValue);
		getServiceProvisionCode().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>serviceProvisionCode</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The code(s) that detail the conditions under which the healthcare service is available/offered
     * </p> 
	 */
	public BoundCodeableConceptDt<ServiceProvisionConditionsEnum> getServiceProvisionCodeFirstRep() {
		if (getServiceProvisionCode().size() == 0) {
			addServiceProvisionCode();
		}
		return getServiceProvisionCode().get(0);
	}

	/**
	 * Add a value for <b>serviceProvisionCode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The code(s) that detail the conditions under which the healthcare service is available/offered
     * </p> 
	 */
	public BoundCodeableConceptDt<ServiceProvisionConditionsEnum> addServiceProvisionCode() {
		BoundCodeableConceptDt<ServiceProvisionConditionsEnum> retVal = new BoundCodeableConceptDt<ServiceProvisionConditionsEnum>(ServiceProvisionConditionsEnum.VALUESET_BINDER);
		getServiceProvisionCode().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>serviceProvisionCode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The code(s) that detail the conditions under which the healthcare service is available/offered
     * </p> 
	 */
	public HealthcareService setServiceProvisionCode(ServiceProvisionConditionsEnum theValue) {
		getServiceProvisionCode().clear();
		addServiceProvisionCode(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>eligibility</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Does this service have specific eligibility requirements that need to be met in order to use the service?
     * </p> 
	 */
	public CodeableConceptDt getEligibility() {  
		if (myEligibility == null) {
			myEligibility = new CodeableConceptDt();
		}
		return myEligibility;
	}

	/**
	 * Sets the value(s) for <b>eligibility</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Does this service have specific eligibility requirements that need to be met in order to use the service?
     * </p> 
	 */
	public HealthcareService setEligibility(CodeableConceptDt theValue) {
		myEligibility = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>eligibilityNote</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the eligibility conditions for the service
     * </p> 
	 */
	public StringDt getEligibilityNoteElement() {  
		if (myEligibilityNote == null) {
			myEligibilityNote = new StringDt();
		}
		return myEligibilityNote;
	}

	
	/**
	 * Gets the value(s) for <b>eligibilityNote</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the eligibility conditions for the service
     * </p> 
	 */
	public String getEligibilityNote() {  
		return getEligibilityNoteElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>eligibilityNote</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the eligibility conditions for the service
     * </p> 
	 */
	public HealthcareService setEligibilityNote(StringDt theValue) {
		myEligibilityNote = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>eligibilityNote</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the eligibility conditions for the service
     * </p> 
	 */
	public HealthcareService setEligibilityNote( String theString) {
		myEligibilityNote = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>programName</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Program Names that can be used to categorize the service
     * </p> 
	 */
	public java.util.List<StringDt> getProgramName() {  
		if (myProgramName == null) {
			myProgramName = new java.util.ArrayList<StringDt>();
		}
		return myProgramName;
	}

	/**
	 * Sets the value(s) for <b>programName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Program Names that can be used to categorize the service
     * </p> 
	 */
	public HealthcareService setProgramName(java.util.List<StringDt> theValue) {
		myProgramName = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>programName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Program Names that can be used to categorize the service
     * </p> 
	 */
	public StringDt addProgramName() {
		StringDt newType = new StringDt();
		getProgramName().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>programName</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Program Names that can be used to categorize the service
	 * </p>
	 * @param theValue The programName to add (must not be <code>null</code>)
	 */
	public HealthcareService addProgramName(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getProgramName().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>programName</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Program Names that can be used to categorize the service
     * </p> 
	 */
	public StringDt getProgramNameFirstRep() {
		if (getProgramName().isEmpty()) {
			return addProgramName();
		}
		return getProgramName().get(0); 
	}
 	/**
	 * Adds a new value for <b>programName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Program Names that can be used to categorize the service
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public HealthcareService addProgramName( String theString) {
		if (myProgramName == null) {
			myProgramName = new java.util.ArrayList<StringDt>();
		}
		myProgramName.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>characteristic</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Collection of characteristics (attributes)
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getCharacteristic() {  
		if (myCharacteristic == null) {
			myCharacteristic = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myCharacteristic;
	}

	/**
	 * Sets the value(s) for <b>characteristic</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Collection of characteristics (attributes)
     * </p> 
	 */
	public HealthcareService setCharacteristic(java.util.List<CodeableConceptDt> theValue) {
		myCharacteristic = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>characteristic</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Collection of characteristics (attributes)
     * </p> 
	 */
	public CodeableConceptDt addCharacteristic() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getCharacteristic().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>characteristic</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Collection of characteristics (attributes)
	 * </p>
	 * @param theValue The characteristic to add (must not be <code>null</code>)
	 */
	public HealthcareService addCharacteristic(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCharacteristic().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>characteristic</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Collection of characteristics (attributes)
     * </p> 
	 */
	public CodeableConceptDt getCharacteristicFirstRep() {
		if (getCharacteristic().isEmpty()) {
			return addCharacteristic();
		}
		return getCharacteristic().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>referralMethod</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required
     * </p> 
	 */
	public java.util.List<BoundCodeableConceptDt<ReferralMethodEnum>> getReferralMethod() {  
		if (myReferralMethod == null) {
			myReferralMethod = new java.util.ArrayList<BoundCodeableConceptDt<ReferralMethodEnum>>();
		}
		return myReferralMethod;
	}

	/**
	 * Sets the value(s) for <b>referralMethod</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required
     * </p> 
	 */
	public HealthcareService setReferralMethod(java.util.List<BoundCodeableConceptDt<ReferralMethodEnum>> theValue) {
		myReferralMethod = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>referralMethod</b> () using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addReferralMethod()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required
     * </p> 
	 */
	public BoundCodeableConceptDt<ReferralMethodEnum> addReferralMethod(ReferralMethodEnum theValue) {
		BoundCodeableConceptDt<ReferralMethodEnum> retVal = new BoundCodeableConceptDt<ReferralMethodEnum>(ReferralMethodEnum.VALUESET_BINDER, theValue);
		getReferralMethod().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>referralMethod</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required
     * </p> 
	 */
	public BoundCodeableConceptDt<ReferralMethodEnum> getReferralMethodFirstRep() {
		if (getReferralMethod().size() == 0) {
			addReferralMethod();
		}
		return getReferralMethod().get(0);
	}

	/**
	 * Add a value for <b>referralMethod</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required
     * </p> 
	 */
	public BoundCodeableConceptDt<ReferralMethodEnum> addReferralMethod() {
		BoundCodeableConceptDt<ReferralMethodEnum> retVal = new BoundCodeableConceptDt<ReferralMethodEnum>(ReferralMethodEnum.VALUESET_BINDER);
		getReferralMethod().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>referralMethod</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Ways that the service accepts referrals, if this is not provided then it is implied that no referral is required
     * </p> 
	 */
	public HealthcareService setReferralMethod(ReferralMethodEnum theValue) {
		getReferralMethod().clear();
		addReferralMethod(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>publicKey</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available
     * </p> 
	 */
	public StringDt getPublicKeyElement() {  
		if (myPublicKey == null) {
			myPublicKey = new StringDt();
		}
		return myPublicKey;
	}

	
	/**
	 * Gets the value(s) for <b>publicKey</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available
     * </p> 
	 */
	public String getPublicKey() {  
		return getPublicKeyElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>publicKey</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available
     * </p> 
	 */
	public HealthcareService setPublicKey(StringDt theValue) {
		myPublicKey = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>publicKey</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The public part of the 'keys' allocated to an Organization by an accredited body to support secure exchange of data over the internet. To be provided by the Organization, where available
     * </p> 
	 */
	public HealthcareService setPublicKey( String theString) {
		myPublicKey = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>appointmentRequired</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
     * </p> 
	 */
	public BooleanDt getAppointmentRequiredElement() {  
		if (myAppointmentRequired == null) {
			myAppointmentRequired = new BooleanDt();
		}
		return myAppointmentRequired;
	}

	
	/**
	 * Gets the value(s) for <b>appointmentRequired</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
     * </p> 
	 */
	public Boolean getAppointmentRequired() {  
		return getAppointmentRequiredElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>appointmentRequired</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
     * </p> 
	 */
	public HealthcareService setAppointmentRequired(BooleanDt theValue) {
		myAppointmentRequired = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>appointmentRequired</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not a prospective consumer will require an appointment for a particular service at a site to be provided by the Organization. Indicates if an appointment is required for access to this service.
     * </p> 
	 */
	public HealthcareService setAppointmentRequired( boolean theBoolean) {
		myAppointmentRequired = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>availableTime</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A collection of times that the Service Site is available
     * </p> 
	 */
	public java.util.List<AvailableTime> getAvailableTime() {  
		if (myAvailableTime == null) {
			myAvailableTime = new java.util.ArrayList<AvailableTime>();
		}
		return myAvailableTime;
	}

	/**
	 * Sets the value(s) for <b>availableTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A collection of times that the Service Site is available
     * </p> 
	 */
	public HealthcareService setAvailableTime(java.util.List<AvailableTime> theValue) {
		myAvailableTime = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>availableTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A collection of times that the Service Site is available
     * </p> 
	 */
	public AvailableTime addAvailableTime() {
		AvailableTime newType = new AvailableTime();
		getAvailableTime().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>availableTime</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A collection of times that the Service Site is available
	 * </p>
	 * @param theValue The availableTime to add (must not be <code>null</code>)
	 */
	public HealthcareService addAvailableTime(AvailableTime theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAvailableTime().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>availableTime</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A collection of times that the Service Site is available
     * </p> 
	 */
	public AvailableTime getAvailableTimeFirstRep() {
		if (getAvailableTime().isEmpty()) {
			return addAvailableTime();
		}
		return getAvailableTime().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>notAvailable</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The HealthcareService is not available during this period of time due to the provided reason
     * </p> 
	 */
	public java.util.List<NotAvailable> getNotAvailable() {  
		if (myNotAvailable == null) {
			myNotAvailable = new java.util.ArrayList<NotAvailable>();
		}
		return myNotAvailable;
	}

	/**
	 * Sets the value(s) for <b>notAvailable</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The HealthcareService is not available during this period of time due to the provided reason
     * </p> 
	 */
	public HealthcareService setNotAvailable(java.util.List<NotAvailable> theValue) {
		myNotAvailable = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>notAvailable</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The HealthcareService is not available during this period of time due to the provided reason
     * </p> 
	 */
	public NotAvailable addNotAvailable() {
		NotAvailable newType = new NotAvailable();
		getNotAvailable().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>notAvailable</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The HealthcareService is not available during this period of time due to the provided reason
	 * </p>
	 * @param theValue The notAvailable to add (must not be <code>null</code>)
	 */
	public HealthcareService addNotAvailable(NotAvailable theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getNotAvailable().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>notAvailable</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The HealthcareService is not available during this period of time due to the provided reason
     * </p> 
	 */
	public NotAvailable getNotAvailableFirstRep() {
		if (getNotAvailable().isEmpty()) {
			return addNotAvailable();
		}
		return getNotAvailable().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>availabilityExceptions</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times
     * </p> 
	 */
	public StringDt getAvailabilityExceptionsElement() {  
		if (myAvailabilityExceptions == null) {
			myAvailabilityExceptions = new StringDt();
		}
		return myAvailabilityExceptions;
	}

	
	/**
	 * Gets the value(s) for <b>availabilityExceptions</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times
     * </p> 
	 */
	public String getAvailabilityExceptions() {  
		return getAvailabilityExceptionsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>availabilityExceptions</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times
     * </p> 
	 */
	public HealthcareService setAvailabilityExceptions(StringDt theValue) {
		myAvailabilityExceptions = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>availabilityExceptions</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of site availability exceptions, e.g. public holiday availability. Succinctly describing all possible exceptions to normal site availability as details in the available Times and not available Times
     * </p> 
	 */
	public HealthcareService setAvailabilityExceptions( String theString) {
		myAvailabilityExceptions = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Block class for child element: <b>HealthcareService.serviceType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A specific type of service that may be delivered or performed
     * </p> 
	 */
	@Block()	
	public static class ServiceType 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The specific type of service being delivered or performed"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/c80-practice-codes")
	private CodeableConceptDt myType;
	
	@Child(name="specialty", type=CodeableConceptDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Collection of specialties handled by the service site. This is more of a medical term"
	)
	private java.util.List<CodeableConceptDt> mySpecialty;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  mySpecialty);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, mySpecialty);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The specific type of service being delivered or performed
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
     * The specific type of service being delivered or performed
     * </p> 
	 */
	public ServiceType setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>specialty</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Collection of specialties handled by the service site. This is more of a medical term
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getSpecialty() {  
		if (mySpecialty == null) {
			mySpecialty = new java.util.ArrayList<CodeableConceptDt>();
		}
		return mySpecialty;
	}

	/**
	 * Sets the value(s) for <b>specialty</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Collection of specialties handled by the service site. This is more of a medical term
     * </p> 
	 */
	public ServiceType setSpecialty(java.util.List<CodeableConceptDt> theValue) {
		mySpecialty = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>specialty</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Collection of specialties handled by the service site. This is more of a medical term
     * </p> 
	 */
	public CodeableConceptDt addSpecialty() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getSpecialty().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>specialty</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Collection of specialties handled by the service site. This is more of a medical term
	 * </p>
	 * @param theValue The specialty to add (must not be <code>null</code>)
	 */
	public ServiceType addSpecialty(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSpecialty().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>specialty</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Collection of specialties handled by the service site. This is more of a medical term
     * </p> 
	 */
	public CodeableConceptDt getSpecialtyFirstRep() {
		if (getSpecialty().isEmpty()) {
			return addSpecialty();
		}
		return getSpecialty().get(0); 
	}
  


	}


	/**
	 * Block class for child element: <b>HealthcareService.availableTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A collection of times that the Service Site is available
     * </p> 
	 */
	@Block()	
	public static class AvailableTime 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="daysOfWeek", type=CodeDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates which days of the week are available between the start and end Times"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/days-of-week")
	private java.util.List<BoundCodeDt<DaysOfWeekEnum>> myDaysOfWeek;
	
	@Child(name="allDay", type=BooleanDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Is this always available? (hence times are irrelevant) e.g. 24 hour service"
	)
	private BooleanDt myAllDay;
	
	@Child(name="availableStartTime", type=TimeDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The opening time of day. Note: If the AllDay flag is set, then this time is ignored"
	)
	private TimeDt myAvailableStartTime;
	
	@Child(name="availableEndTime", type=TimeDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The closing time of day. Note: If the AllDay flag is set, then this time is ignored"
	)
	private TimeDt myAvailableEndTime;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myDaysOfWeek,  myAllDay,  myAvailableStartTime,  myAvailableEndTime);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myDaysOfWeek, myAllDay, myAvailableStartTime, myAvailableEndTime);
	}

	/**
	 * Gets the value(s) for <b>daysOfWeek</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates which days of the week are available between the start and end Times
     * </p> 
	 */
	public java.util.List<BoundCodeDt<DaysOfWeekEnum>> getDaysOfWeek() {  
		if (myDaysOfWeek == null) {
			myDaysOfWeek = new java.util.ArrayList<BoundCodeDt<DaysOfWeekEnum>>();
		}
		return myDaysOfWeek;
	}

	/**
	 * Sets the value(s) for <b>daysOfWeek</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates which days of the week are available between the start and end Times
     * </p> 
	 */
	public AvailableTime setDaysOfWeek(java.util.List<BoundCodeDt<DaysOfWeekEnum>> theValue) {
		myDaysOfWeek = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>daysOfWeek</b> () using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addDaysOfWeek()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates which days of the week are available between the start and end Times
     * </p> 
	 */
	public BoundCodeDt<DaysOfWeekEnum> addDaysOfWeek(DaysOfWeekEnum theValue) {
		BoundCodeDt<DaysOfWeekEnum> retVal = new BoundCodeDt<DaysOfWeekEnum>(DaysOfWeekEnum.VALUESET_BINDER, theValue);
		getDaysOfWeek().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>daysOfWeek</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates which days of the week are available between the start and end Times
     * </p> 
	 */
	public BoundCodeDt<DaysOfWeekEnum> getDaysOfWeekFirstRep() {
		if (getDaysOfWeek().size() == 0) {
			addDaysOfWeek();
		}
		return getDaysOfWeek().get(0);
	}

	/**
	 * Add a value for <b>daysOfWeek</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates which days of the week are available between the start and end Times
     * </p> 
	 */
	public BoundCodeDt<DaysOfWeekEnum> addDaysOfWeek() {
		BoundCodeDt<DaysOfWeekEnum> retVal = new BoundCodeDt<DaysOfWeekEnum>(DaysOfWeekEnum.VALUESET_BINDER);
		getDaysOfWeek().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>daysOfWeek</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates which days of the week are available between the start and end Times
     * </p> 
	 */
	public AvailableTime setDaysOfWeek(DaysOfWeekEnum theValue) {
		getDaysOfWeek().clear();
		addDaysOfWeek(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>allDay</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Is this always available? (hence times are irrelevant) e.g. 24 hour service
     * </p> 
	 */
	public BooleanDt getAllDayElement() {  
		if (myAllDay == null) {
			myAllDay = new BooleanDt();
		}
		return myAllDay;
	}

	
	/**
	 * Gets the value(s) for <b>allDay</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Is this always available? (hence times are irrelevant) e.g. 24 hour service
     * </p> 
	 */
	public Boolean getAllDay() {  
		return getAllDayElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>allDay</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Is this always available? (hence times are irrelevant) e.g. 24 hour service
     * </p> 
	 */
	public AvailableTime setAllDay(BooleanDt theValue) {
		myAllDay = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>allDay</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Is this always available? (hence times are irrelevant) e.g. 24 hour service
     * </p> 
	 */
	public AvailableTime setAllDay( boolean theBoolean) {
		myAllDay = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>availableStartTime</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The opening time of day. Note: If the AllDay flag is set, then this time is ignored
     * </p> 
	 */
	public TimeDt getAvailableStartTimeElement() {  
		if (myAvailableStartTime == null) {
			myAvailableStartTime = new TimeDt();
		}
		return myAvailableStartTime;
	}

	
	/**
	 * Gets the value(s) for <b>availableStartTime</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The opening time of day. Note: If the AllDay flag is set, then this time is ignored
     * </p> 
	 */
	public String getAvailableStartTime() {  
		return getAvailableStartTimeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>availableStartTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The opening time of day. Note: If the AllDay flag is set, then this time is ignored
     * </p> 
	 */
	public AvailableTime setAvailableStartTime(TimeDt theValue) {
		myAvailableStartTime = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>availableStartTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The opening time of day. Note: If the AllDay flag is set, then this time is ignored
     * </p> 
	 */
	public AvailableTime setAvailableStartTime( String theString) {
		myAvailableStartTime = new TimeDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>availableEndTime</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The closing time of day. Note: If the AllDay flag is set, then this time is ignored
     * </p> 
	 */
	public TimeDt getAvailableEndTimeElement() {  
		if (myAvailableEndTime == null) {
			myAvailableEndTime = new TimeDt();
		}
		return myAvailableEndTime;
	}

	
	/**
	 * Gets the value(s) for <b>availableEndTime</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The closing time of day. Note: If the AllDay flag is set, then this time is ignored
     * </p> 
	 */
	public String getAvailableEndTime() {  
		return getAvailableEndTimeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>availableEndTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The closing time of day. Note: If the AllDay flag is set, then this time is ignored
     * </p> 
	 */
	public AvailableTime setAvailableEndTime(TimeDt theValue) {
		myAvailableEndTime = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>availableEndTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The closing time of day. Note: If the AllDay flag is set, then this time is ignored
     * </p> 
	 */
	public AvailableTime setAvailableEndTime( String theString) {
		myAvailableEndTime = new TimeDt(theString); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>HealthcareService.notAvailable</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The HealthcareService is not available during this period of time due to the provided reason
     * </p> 
	 */
	@Block()	
	public static class NotAvailable 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="description", type=StringDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The reason that can be presented to the user as to why this time is not available"
	)
	private StringDt myDescription;
	
	@Child(name="during", type=PeriodDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Service is not available (seasonally or for a public holiday) from this date"
	)
	private PeriodDt myDuring;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myDescription,  myDuring);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myDescription, myDuring);
	}

	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The reason that can be presented to the user as to why this time is not available
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
     * The reason that can be presented to the user as to why this time is not available
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
     * The reason that can be presented to the user as to why this time is not available
     * </p> 
	 */
	public NotAvailable setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The reason that can be presented to the user as to why this time is not available
     * </p> 
	 */
	public NotAvailable setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>during</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Service is not available (seasonally or for a public holiday) from this date
     * </p> 
	 */
	public PeriodDt getDuring() {  
		if (myDuring == null) {
			myDuring = new PeriodDt();
		}
		return myDuring;
	}

	/**
	 * Sets the value(s) for <b>during</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Service is not available (seasonally or for a public holiday) from this date
     * </p> 
	 */
	public NotAvailable setDuring(PeriodDt theValue) {
		myDuring = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "HealthcareService";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
