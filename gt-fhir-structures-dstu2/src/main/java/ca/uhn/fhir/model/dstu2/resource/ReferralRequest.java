















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
 * HAPI/FHIR <b>ReferralRequest</b> Resource
 * (clinical.careprovision)
 *
 * <p>
 * <b>Definition:</b>
 * Used to record and send details about a request for referral service or transfer of a patient to the care of another provider or provider organization.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/ReferralRequest">http://hl7.org/fhir/profiles/ReferralRequest</a> 
 * </p>
 *
 */
@ResourceDef(name="ReferralRequest", profile="http://hl7.org/fhir/profiles/ReferralRequest", id="referralrequest")
public class ReferralRequest extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the referral</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ReferralRequest.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="ReferralRequest.status", description="The status of the referral", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the referral</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ReferralRequest.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>Creation or activation date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ReferralRequest.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="ReferralRequest.date", description="Creation or activation date", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>Creation or activation date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ReferralRequest.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>The type of the referral</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ReferralRequest.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="ReferralRequest.type", description="The type of the referral", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>The type of the referral</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ReferralRequest.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>specialty</b>
	 * <p>
	 * Description: <b>The specialty that the referral is for</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ReferralRequest.specialty</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="specialty", path="ReferralRequest.specialty", description="The specialty that the referral is for", type="token"  )
	public static final String SP_SPECIALTY = "specialty";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>specialty</b>
	 * <p>
	 * Description: <b>The specialty that the referral is for</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ReferralRequest.specialty</b><br>
	 * </p>
	 */
	public static final TokenClientParam SPECIALTY = new TokenClientParam(SP_SPECIALTY);

	/**
	 * Search parameter constant for <b>priority</b>
	 * <p>
	 * Description: <b>The priority assigned to the referral</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ReferralRequest.priority</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="priority", path="ReferralRequest.priority", description="The priority assigned to the referral", type="token"  )
	public static final String SP_PRIORITY = "priority";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>priority</b>
	 * <p>
	 * Description: <b>The priority assigned to the referral</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ReferralRequest.priority</b><br>
	 * </p>
	 */
	public static final TokenClientParam PRIORITY = new TokenClientParam(SP_PRIORITY);

	/**
	 * Search parameter constant for <b>recipient</b>
	 * <p>
	 * Description: <b>The person that the referral was sent to</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ReferralRequest.recipient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="recipient", path="ReferralRequest.recipient", description="The person that the referral was sent to", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_RECIPIENT = "recipient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>recipient</b>
	 * <p>
	 * Description: <b>The person that the referral was sent to</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ReferralRequest.recipient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RECIPIENT = new ReferenceClientParam(SP_RECIPIENT);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Who the referral is about</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ReferralRequest.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="ReferralRequest.patient", description="Who the referral is about", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Who the referral is about</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ReferralRequest.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>requester</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ReferralRequest.requester</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="requester", path="ReferralRequest.requester", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") 	}
 )
	public static final String SP_REQUESTER = "requester";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>requester</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ReferralRequest.requester</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam REQUESTER = new ReferenceClientParam(SP_REQUESTER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ReferralRequest:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("ReferralRequest:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ReferralRequest:recipient</b>".
	 */
	public static final Include INCLUDE_RECIPIENT = new Include("ReferralRequest:recipient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ReferralRequest:requester</b>".
	 */
	public static final Include INCLUDE_REQUESTER = new Include("ReferralRequest:requester");


	@Child(name="status", type=CodeDt.class, order=0, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The workflow status of the referral or transfer of care request"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/referralstatus")
	private BoundCodeDt<ReferralStatusEnum> myStatus;
	
	@Child(name="identifier", type=IdentifierDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Business identifier that uniquely identifies the referral/care transfer request instance"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="date", type=DateTimeDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.init",
		formalDefinition="Date/DateTime of creation for draft requests and date of activation for active requests"
	)
	private DateTimeDt myDate;
	
	@Child(name="type", type=CodeableConceptDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="An indication of the type of referral (or where applicable the type of transfer of care) request"
	)
	private CodeableConceptDt myType;
	
	@Child(name="specialty", type=CodeableConceptDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology"
	)
	private CodeableConceptDt mySpecialty;
	
	@Child(name="priority", type=CodeableConceptDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="grade",
		formalDefinition="An indication of the urgency of referral (or where applicable the type of transfer of care) request"
	)
	private CodeableConceptDt myPriority;
	
	@Child(name="patient", order=6, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The patient who is the subject of a referral or transfer of care request"
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="requester", order=7, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.author",
		formalDefinition="The healthcare provider or provider organization who/which initiated the referral/transfer of care request. Can also be  Patient (a self referral)"
	)
	private ResourceReferenceDt myRequester;
	
	@Child(name="recipient", order=8, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request"
	)
	private java.util.List<ResourceReferenceDt> myRecipient;
	
	@Child(name="encounter", order=9, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="The encounter at which the request for referral or transfer of care is initiated"
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="dateSent", type=DateTimeDt.class, order=10, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.init",
		formalDefinition="Date/DateTime the request for referral or transfer of care is sent by the author"
	)
	private DateTimeDt myDateSent;
	
	@Child(name="reason", type=CodeableConceptDt.class, order=11, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="why",
		formalDefinition="Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management"
	)
	private CodeableConceptDt myReason;
	
	@Child(name="description", type=StringDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary"
	)
	private StringDt myDescription;
	
	@Child(name="serviceRequested", type=CodeableConceptDt.class, order=13, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="what",
		formalDefinition="The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion"
	)
	private java.util.List<CodeableConceptDt> myServiceRequested;
	
	@Child(name="supportingInformation", order=14, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan"
	)
	private java.util.List<ResourceReferenceDt> mySupportingInformation;
	
	@Child(name="fulfillmentTime", type=PeriodDt.class, order=15, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.planned",
		formalDefinition="The period of time within which the services identified in the referral/transfer of care is specified or required to occur"
	)
	private PeriodDt myFulfillmentTime;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myStatus,  myIdentifier,  myDate,  myType,  mySpecialty,  myPriority,  myPatient,  myRequester,  myRecipient,  myEncounter,  myDateSent,  myReason,  myDescription,  myServiceRequested,  mySupportingInformation,  myFulfillmentTime);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myStatus, myIdentifier, myDate, myType, mySpecialty, myPriority, myPatient, myRequester, myRecipient, myEncounter, myDateSent, myReason, myDescription, myServiceRequested, mySupportingInformation, myFulfillmentTime);
	}

	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The workflow status of the referral or transfer of care request
     * </p> 
	 */
	public BoundCodeDt<ReferralStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<ReferralStatusEnum>(ReferralStatusEnum.VALUESET_BINDER);
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
     * The workflow status of the referral or transfer of care request
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
     * The workflow status of the referral or transfer of care request
     * </p> 
	 */
	public ReferralRequest setStatus(BoundCodeDt<ReferralStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The workflow status of the referral or transfer of care request
     * </p> 
	 */
	public ReferralRequest setStatus(ReferralStatusEnum theValue) {
		setStatus(new BoundCodeDt<ReferralStatusEnum>(ReferralStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Business identifier that uniquely identifies the referral/care transfer request instance
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
     * Business identifier that uniquely identifies the referral/care transfer request instance
     * </p> 
	 */
	public ReferralRequest setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Business identifier that uniquely identifies the referral/care transfer request instance
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
	 * Business identifier that uniquely identifies the referral/care transfer request instance
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public ReferralRequest addIdentifier(IdentifierDt theValue) {
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
     * Business identifier that uniquely identifies the referral/care transfer request instance
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>date</b> (when.init).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date/DateTime of creation for draft requests and date of activation for active requests
     * </p> 
	 */
	public DateTimeDt getDateElement() {  
		if (myDate == null) {
			myDate = new DateTimeDt();
		}
		return myDate;
	}

	
	/**
	 * Gets the value(s) for <b>date</b> (when.init).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date/DateTime of creation for draft requests and date of activation for active requests
     * </p> 
	 */
	public Date getDate() {  
		return getDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>date</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date/DateTime of creation for draft requests and date of activation for active requests
     * </p> 
	 */
	public ReferralRequest setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date/DateTime of creation for draft requests and date of activation for active requests
     * </p> 
	 */
	public ReferralRequest setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date/DateTime of creation for draft requests and date of activation for active requests
     * </p> 
	 */
	public ReferralRequest setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An indication of the type of referral (or where applicable the type of transfer of care) request
     * </p> 
	 */
	public CodeableConceptDt getType() {  
		if (myType == null) {
			myType = new CodeableConceptDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * An indication of the type of referral (or where applicable the type of transfer of care) request
     * </p> 
	 */
	public ReferralRequest setType(CodeableConceptDt theValue) {
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
     * Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology
     * </p> 
	 */
	public CodeableConceptDt getSpecialty() {  
		if (mySpecialty == null) {
			mySpecialty = new CodeableConceptDt();
		}
		return mySpecialty;
	}

	/**
	 * Sets the value(s) for <b>specialty</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indication of the clinical domain or discipline to which the referral or transfer of care request is sent.  For example: Cardiology Gastroenterology Diabetology
     * </p> 
	 */
	public ReferralRequest setSpecialty(CodeableConceptDt theValue) {
		mySpecialty = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>priority</b> (grade).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An indication of the urgency of referral (or where applicable the type of transfer of care) request
     * </p> 
	 */
	public CodeableConceptDt getPriority() {  
		if (myPriority == null) {
			myPriority = new CodeableConceptDt();
		}
		return myPriority;
	}

	/**
	 * Sets the value(s) for <b>priority</b> (grade)
	 *
     * <p>
     * <b>Definition:</b>
     * An indication of the urgency of referral (or where applicable the type of transfer of care) request
     * </p> 
	 */
	public ReferralRequest setPriority(CodeableConceptDt theValue) {
		myPriority = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>patient</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The patient who is the subject of a referral or transfer of care request
     * </p> 
	 */
	public ResourceReferenceDt getPatient() {  
		if (myPatient == null) {
			myPatient = new ResourceReferenceDt();
		}
		return myPatient;
	}

	/**
	 * Sets the value(s) for <b>patient</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * The patient who is the subject of a referral or transfer of care request
     * </p> 
	 */
	public ReferralRequest setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>requester</b> (who.author).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The healthcare provider or provider organization who/which initiated the referral/transfer of care request. Can also be  Patient (a self referral)
     * </p> 
	 */
	public ResourceReferenceDt getRequester() {  
		if (myRequester == null) {
			myRequester = new ResourceReferenceDt();
		}
		return myRequester;
	}

	/**
	 * Sets the value(s) for <b>requester</b> (who.author)
	 *
     * <p>
     * <b>Definition:</b>
     * The healthcare provider or provider organization who/which initiated the referral/transfer of care request. Can also be  Patient (a self referral)
     * </p> 
	 */
	public ReferralRequest setRequester(ResourceReferenceDt theValue) {
		myRequester = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>recipient</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getRecipient() {  
		if (myRecipient == null) {
			myRecipient = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myRecipient;
	}

	/**
	 * Sets the value(s) for <b>recipient</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request
     * </p> 
	 */
	public ReferralRequest setRecipient(java.util.List<ResourceReferenceDt> theValue) {
		myRecipient = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>recipient</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The healthcare provider(s) or provider organization(s) who/which is to receive the referral/transfer of care request
     * </p> 
	 */
	public ResourceReferenceDt addRecipient() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getRecipient().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The encounter at which the request for referral or transfer of care is initiated
     * </p> 
	 */
	public ResourceReferenceDt getEncounter() {  
		if (myEncounter == null) {
			myEncounter = new ResourceReferenceDt();
		}
		return myEncounter;
	}

	/**
	 * Sets the value(s) for <b>encounter</b> (context)
	 *
     * <p>
     * <b>Definition:</b>
     * The encounter at which the request for referral or transfer of care is initiated
     * </p> 
	 */
	public ReferralRequest setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dateSent</b> (when.init).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date/DateTime the request for referral or transfer of care is sent by the author
     * </p> 
	 */
	public DateTimeDt getDateSentElement() {  
		if (myDateSent == null) {
			myDateSent = new DateTimeDt();
		}
		return myDateSent;
	}

	
	/**
	 * Gets the value(s) for <b>dateSent</b> (when.init).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date/DateTime the request for referral or transfer of care is sent by the author
     * </p> 
	 */
	public Date getDateSent() {  
		return getDateSentElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>dateSent</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date/DateTime the request for referral or transfer of care is sent by the author
     * </p> 
	 */
	public ReferralRequest setDateSent(DateTimeDt theValue) {
		myDateSent = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>dateSent</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date/DateTime the request for referral or transfer of care is sent by the author
     * </p> 
	 */
	public ReferralRequest setDateSent( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDateSent = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>dateSent</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date/DateTime the request for referral or transfer of care is sent by the author
     * </p> 
	 */
	public ReferralRequest setDateSentWithSecondsPrecision( Date theDate) {
		myDateSent = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>reason</b> (why).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management
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
     * Description of clinical condition indicating why referral/transfer of care is requested.  For example:  Pathological Anomalies, Disabled (physical or mental),  Behavioral Management
     * </p> 
	 */
	public ReferralRequest setReason(CodeableConceptDt theValue) {
		myReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary
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
     * The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary
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
     * The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary
     * </p> 
	 */
	public ReferralRequest setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The reason element gives a short description of why the referral is being made, the description expands on this to support a more complete clinical summary
     * </p> 
	 */
	public ReferralRequest setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>serviceRequested</b> (what).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getServiceRequested() {  
		if (myServiceRequested == null) {
			myServiceRequested = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myServiceRequested;
	}

	/**
	 * Sets the value(s) for <b>serviceRequested</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion
     * </p> 
	 */
	public ReferralRequest setServiceRequested(java.util.List<CodeableConceptDt> theValue) {
		myServiceRequested = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>serviceRequested</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion
     * </p> 
	 */
	public CodeableConceptDt addServiceRequested() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getServiceRequested().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>serviceRequested</b> (what)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion
	 * </p>
	 * @param theValue The serviceRequested to add (must not be <code>null</code>)
	 */
	public ReferralRequest addServiceRequested(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getServiceRequested().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>serviceRequested</b> (what),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The service(s) that is/are requested to be provided to the patient.  For example: cardiac pacemaker insertion
     * </p> 
	 */
	public CodeableConceptDt getServiceRequestedFirstRep() {
		if (getServiceRequested().isEmpty()) {
			return addServiceRequested();
		}
		return getServiceRequested().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>supportingInformation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getSupportingInformation() {  
		if (mySupportingInformation == null) {
			mySupportingInformation = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return mySupportingInformation;
	}

	/**
	 * Sets the value(s) for <b>supportingInformation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan
     * </p> 
	 */
	public ReferralRequest setSupportingInformation(java.util.List<ResourceReferenceDt> theValue) {
		mySupportingInformation = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>supportingInformation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any additional (administrative, financial or clinical) information required to support request for referral or transfer of care.  For example: Presenting problems/chief complaints Medical History Family History Alerts Allergy/Intolerance and Adverse Reactions Medications Observations/Assessments (may include cognitive and fundtional assessments) Diagnostic Reports Care Plan
     * </p> 
	 */
	public ResourceReferenceDt addSupportingInformation() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getSupportingInformation().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>fulfillmentTime</b> (when.planned).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The period of time within which the services identified in the referral/transfer of care is specified or required to occur
     * </p> 
	 */
	public PeriodDt getFulfillmentTime() {  
		if (myFulfillmentTime == null) {
			myFulfillmentTime = new PeriodDt();
		}
		return myFulfillmentTime;
	}

	/**
	 * Sets the value(s) for <b>fulfillmentTime</b> (when.planned)
	 *
     * <p>
     * <b>Definition:</b>
     * The period of time within which the services identified in the referral/transfer of care is specified or required to occur
     * </p> 
	 */
	public ReferralRequest setFulfillmentTime(PeriodDt theValue) {
		myFulfillmentTime = theValue;
		return this;
	}
	
	

  


    @Override
    public String getResourceName() {
        return "ReferralRequest";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
