















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
 * HAPI/FHIR <b>Condition</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * Use to record detailed information about conditions, problems or diagnoses recognized by a clinician. There are many uses including: recording a diagnosis during an encounter; populating a problem list or a summary statement, such as a discharge summary.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Condition">http://hl7.org/fhir/profiles/Condition</a> 
 * </p>
 *
 */
@ResourceDef(name="Condition", profile="http://hl7.org/fhir/profiles/Condition", id="condition")
public class Condition extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>Code for the condition</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="Condition.code", description="Code for the condition", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>Code for the condition</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A unique identifier of the condition record</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Condition.identifier", description="A unique identifier of the condition record", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A unique identifier of the condition record</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>clinicalstatus</b>
	 * <p>
	 * Description: <b>The clinical status of the condition</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.clinicalStatus</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="clinicalstatus", path="Condition.clinicalStatus", description="The clinical status of the condition", type="token"  )
	public static final String SP_CLINICALSTATUS = "clinicalstatus";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>clinicalstatus</b>
	 * <p>
	 * Description: <b>The clinical status of the condition</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.clinicalStatus</b><br>
	 * </p>
	 */
	public static final TokenClientParam CLINICALSTATUS = new TokenClientParam(SP_CLINICALSTATUS);

	/**
	 * Search parameter constant for <b>severity</b>
	 * <p>
	 * Description: <b>The severity of the condition</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.severity</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="severity", path="Condition.severity", description="The severity of the condition", type="token"  )
	public static final String SP_SEVERITY = "severity";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>severity</b>
	 * <p>
	 * Description: <b>The severity of the condition</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.severity</b><br>
	 * </p>
	 */
	public static final TokenClientParam SEVERITY = new TokenClientParam(SP_SEVERITY);

	/**
	 * Search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b>The category of the condition</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.category</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="category", path="Condition.category", description="The category of the condition", type="token"  )
	public static final String SP_CATEGORY = "category";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b>The category of the condition</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.category</b><br>
	 * </p>
	 */
	public static final TokenClientParam CATEGORY = new TokenClientParam(SP_CATEGORY);

	/**
	 * Search parameter constant for <b>onset</b>
	 * <p>
	 * Description: <b>Date related onsets (dateTime and Period)</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Condition.onset[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="onset", path="Condition.onset[x]", description="Date related onsets (dateTime and Period)", type="date"  )
	public static final String SP_ONSET = "onset";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>onset</b>
	 * <p>
	 * Description: <b>Date related onsets (dateTime and Period)</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Condition.onset[x]</b><br>
	 * </p>
	 */
	public static final DateClientParam ONSET = new DateClientParam(SP_ONSET);

	/**
	 * Search parameter constant for <b>onset-info</b>
	 * <p>
	 * Description: <b>Other onsets (boolean, age, range, string)</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Condition.onset[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="onset-info", path="Condition.onset[x]", description="Other onsets (boolean, age, range, string)", type="string"  )
	public static final String SP_ONSET_INFO = "onset-info";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>onset-info</b>
	 * <p>
	 * Description: <b>Other onsets (boolean, age, range, string)</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Condition.onset[x]</b><br>
	 * </p>
	 */
	public static final StringClientParam ONSET_INFO = new StringClientParam(SP_ONSET_INFO);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Condition.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="Condition.encounter", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Condition.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);

	/**
	 * Search parameter constant for <b>asserter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Condition.asserter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="asserter", path="Condition.asserter", description="", type="reference" , providesMembershipIn={
 @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_ASSERTER = "asserter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>asserter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Condition.asserter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ASSERTER = new ReferenceClientParam(SP_ASSERTER);

	/**
	 * Search parameter constant for <b>date-recorded</b>
	 * <p>
	 * Description: <b>A date, when the Condition statement was documented</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Condition.dateRecorded</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date-recorded", path="Condition.dateRecorded", description="A date, when the Condition statement was documented", type="date"  )
	public static final String SP_DATE_RECORDED = "date-recorded";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date-recorded</b>
	 * <p>
	 * Description: <b>A date, when the Condition statement was documented</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Condition.dateRecorded</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE_RECORDED = new DateClientParam(SP_DATE_RECORDED);

	/**
	 * Search parameter constant for <b>evidence</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.evidence.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="evidence", path="Condition.evidence.code", description="", type="token"  )
	public static final String SP_EVIDENCE = "evidence";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>evidence</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.evidence.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam EVIDENCE = new TokenClientParam(SP_EVIDENCE);

	/**
	 * Search parameter constant for <b>body-site</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.bodySite</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="body-site", path="Condition.bodySite", description="", type="token"  )
	public static final String SP_BODY_SITE = "body-site";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>body-site</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.bodySite</b><br>
	 * </p>
	 */
	public static final TokenClientParam BODY_SITE = new TokenClientParam(SP_BODY_SITE);

	/**
	 * Search parameter constant for <b>stage</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.stage.summary</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="stage", path="Condition.stage.summary", description="", type="token"  )
	public static final String SP_STAGE = "stage";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>stage</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Condition.stage.summary</b><br>
	 * </p>
	 */
	public static final TokenClientParam STAGE = new TokenClientParam(SP_STAGE);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Condition.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Condition.patient", description="", type="reference" , providesMembershipIn={
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
	 * Path: <b>Condition.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Condition:asserter</b>".
	 */
	public static final Include INCLUDE_ASSERTER = new Include("Condition:asserter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Condition:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("Condition:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Condition:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Condition:patient");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="patient", order=1, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the patient who the condition record is associated with"
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="encounter", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Encounter during which the condition was first asserted"
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="asserter", order=3, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Individual who is making the condition statement"
	)
	private ResourceReferenceDt myAsserter;
	
	@Child(name="dateRecorded", type=DateDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A date, when  the Condition statement was documented"
	)
	private DateDt myDateRecorded;
	
	@Child(name="code", type=CodeableConceptDt.class, order=5, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identification of the condition, problem or diagnosis."
	)
	private CodeableConceptDt myCode;
	
	@Child(name="category", type=CodeableConceptDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A category assigned to the condition."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-condition-category")
	private BoundCodeableConceptDt<ConditionCategoryCodesEnum> myCategory;
	
	@Child(name="clinicalStatus", type=CodeDt.class, order=7, min=0, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="The clinical status of the condition."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-condition-clinical")
	private BoundCodeDt<ConditionClinicalStatusCodesEnum> myClinicalStatus;
	
	@Child(name="verificationStatus", type=CodeDt.class, order=8, min=1, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="The verification status to support the clinical status of the condition."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/condition-ver-status")
	private BoundCodeDt<ConditionVerificationStatusEnum> myVerificationStatus;
	
	@Child(name="severity", type=CodeableConceptDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A subjective assessment of the severity of the condition as evaluated by the clinician."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-condition-severity")
	private CodeableConceptDt mySeverity;
	
	@Child(name="onset", order=10, min=0, max=1, summary=false, modifier=false, type={
		DateTimeDt.class, 		AgeDt.class, 		PeriodDt.class, 		RangeDt.class, 		StringDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Estimated or actual date or date-time  the condition began, in the opinion of the clinician"
	)
	private IDatatype myOnset;
	
	@Child(name="abatement", order=11, min=0, max=1, summary=false, modifier=false, type={
		DateTimeDt.class, 		AgeDt.class, 		BooleanDt.class, 		PeriodDt.class, 		RangeDt.class, 		StringDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The date or estimated date that the condition resolved or went into remission. This is called \"abatement\" because of the many overloaded connotations associated with \"remission\" or \"resolution\" - Conditions are never really resolved, but they can abate."
	)
	private IDatatype myAbatement;
	
	@Child(name="stage", order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Clinical stage or grade of a condition. May include formal severity assessments"
	)
	private Stage myStage;
	
	@Child(name="evidence", order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed"
	)
	private java.util.List<Evidence> myEvidence;
	
	@Child(name="bodySite", type=CodeableConceptDt.class, order=14, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The anatomical location where this condition manifests itself"
	)
	private java.util.List<CodeableConceptDt> myBodySite;
	
	@Child(name="notes", type=StringDt.class, order=15, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis"
	)
	private StringDt myNotes;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myPatient,  myEncounter,  myAsserter,  myDateRecorded,  myCode,  myCategory,  myClinicalStatus,  myVerificationStatus,  mySeverity,  myOnset,  myAbatement,  myStage,  myEvidence,  myBodySite,  myNotes);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myPatient, myEncounter, myAsserter, myDateRecorded, myCode, myCategory, myClinicalStatus, myVerificationStatus, mySeverity, myOnset, myAbatement, myStage, myEvidence, myBodySite, myNotes);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public java.util.List<IdentifierDt> getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new java.util.ArrayList<IdentifierDt>();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public Condition setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public IdentifierDt addIdentifier() {
		IdentifierDt newType = new IdentifierDt();
		getIdentifier().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>identifier</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Condition addIdentifier(IdentifierDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getIdentifier().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>identifier</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this condition that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>patient</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the patient who the condition record is associated with
     * </p> 
	 */
	public ResourceReferenceDt getPatient() {  
		if (myPatient == null) {
			myPatient = new ResourceReferenceDt();
		}
		return myPatient;
	}

	/**
	 * Sets the value(s) for <b>patient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the patient who the condition record is associated with
     * </p> 
	 */
	public Condition setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>encounter</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Encounter during which the condition was first asserted
     * </p> 
	 */
	public ResourceReferenceDt getEncounter() {  
		if (myEncounter == null) {
			myEncounter = new ResourceReferenceDt();
		}
		return myEncounter;
	}

	/**
	 * Sets the value(s) for <b>encounter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Encounter during which the condition was first asserted
     * </p> 
	 */
	public Condition setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>asserter</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Individual who is making the condition statement
     * </p> 
	 */
	public ResourceReferenceDt getAsserter() {  
		if (myAsserter == null) {
			myAsserter = new ResourceReferenceDt();
		}
		return myAsserter;
	}

	/**
	 * Sets the value(s) for <b>asserter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Individual who is making the condition statement
     * </p> 
	 */
	public Condition setAsserter(ResourceReferenceDt theValue) {
		myAsserter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dateRecorded</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A date, when  the Condition statement was documented
     * </p> 
	 */
	public DateDt getDateRecordedElement() {  
		if (myDateRecorded == null) {
			myDateRecorded = new DateDt();
		}
		return myDateRecorded;
	}

	
	/**
	 * Gets the value(s) for <b>dateRecorded</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A date, when  the Condition statement was documented
     * </p> 
	 */
	public Date getDateRecorded() {  
		return getDateRecordedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>dateRecorded</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A date, when  the Condition statement was documented
     * </p> 
	 */
	public Condition setDateRecorded(DateDt theValue) {
		myDateRecorded = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>dateRecorded</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A date, when  the Condition statement was documented
     * </p> 
	 */
	public Condition setDateRecorded( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDateRecorded = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>dateRecorded</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A date, when  the Condition statement was documented
     * </p> 
	 */
	public Condition setDateRecordedWithDayPrecision( Date theDate) {
		myDateRecorded = new DateDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identification of the condition, problem or diagnosis.
     * </p> 
	 */
	public CodeableConceptDt getCode() {  
		if (myCode == null) {
			myCode = new CodeableConceptDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identification of the condition, problem or diagnosis.
     * </p> 
	 */
	public Condition setCode(CodeableConceptDt theValue) {
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
     * A category assigned to the condition.
     * </p> 
	 */
	public BoundCodeableConceptDt<ConditionCategoryCodesEnum> getCategory() {  
		if (myCategory == null) {
			myCategory = new BoundCodeableConceptDt<ConditionCategoryCodesEnum>(ConditionCategoryCodesEnum.VALUESET_BINDER);
		}
		return myCategory;
	}

	/**
	 * Sets the value(s) for <b>category</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A category assigned to the condition.
     * </p> 
	 */
	public Condition setCategory(BoundCodeableConceptDt<ConditionCategoryCodesEnum> theValue) {
		myCategory = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>category</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A category assigned to the condition.
     * </p> 
	 */
	public Condition setCategory(ConditionCategoryCodesEnum theValue) {
		setCategory(new BoundCodeableConceptDt<ConditionCategoryCodesEnum>(ConditionCategoryCodesEnum.VALUESET_BINDER, theValue));
		
/*
		getCategory().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>clinicalStatus</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical status of the condition.
     * </p> 
	 */
	public BoundCodeDt<ConditionClinicalStatusCodesEnum> getClinicalStatusElement() {  
		if (myClinicalStatus == null) {
			myClinicalStatus = new BoundCodeDt<ConditionClinicalStatusCodesEnum>(ConditionClinicalStatusCodesEnum.VALUESET_BINDER);
		}
		return myClinicalStatus;
	}

	
	/**
	 * Gets the value(s) for <b>clinicalStatus</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical status of the condition.
     * </p> 
	 */
	public String getClinicalStatus() {  
		return getClinicalStatusElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>clinicalStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical status of the condition.
     * </p> 
	 */
	public Condition setClinicalStatus(BoundCodeDt<ConditionClinicalStatusCodesEnum> theValue) {
		myClinicalStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>clinicalStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical status of the condition.
     * </p> 
	 */
	public Condition setClinicalStatus(ConditionClinicalStatusCodesEnum theValue) {
		setClinicalStatus(new BoundCodeDt<ConditionClinicalStatusCodesEnum>(ConditionClinicalStatusCodesEnum.VALUESET_BINDER, theValue));
		
/*
		getClinicalStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>verificationStatus</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The verification status to support the clinical status of the condition.
     * </p> 
	 */
	public BoundCodeDt<ConditionVerificationStatusEnum> getVerificationStatusElement() {  
		if (myVerificationStatus == null) {
			myVerificationStatus = new BoundCodeDt<ConditionVerificationStatusEnum>(ConditionVerificationStatusEnum.VALUESET_BINDER);
		}
		return myVerificationStatus;
	}

	
	/**
	 * Gets the value(s) for <b>verificationStatus</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The verification status to support the clinical status of the condition.
     * </p> 
	 */
	public String getVerificationStatus() {  
		return getVerificationStatusElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>verificationStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The verification status to support the clinical status of the condition.
     * </p> 
	 */
	public Condition setVerificationStatus(BoundCodeDt<ConditionVerificationStatusEnum> theValue) {
		myVerificationStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>verificationStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The verification status to support the clinical status of the condition.
     * </p> 
	 */
	public Condition setVerificationStatus(ConditionVerificationStatusEnum theValue) {
		setVerificationStatus(new BoundCodeDt<ConditionVerificationStatusEnum>(ConditionVerificationStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getVerificationStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>severity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A subjective assessment of the severity of the condition as evaluated by the clinician.
     * </p> 
	 */
	public CodeableConceptDt getSeverity() {  
		if (mySeverity == null) {
			mySeverity = new CodeableConceptDt();
		}
		return mySeverity;
	}

	/**
	 * Sets the value(s) for <b>severity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A subjective assessment of the severity of the condition as evaluated by the clinician.
     * </p> 
	 */
	public Condition setSeverity(CodeableConceptDt theValue) {
		mySeverity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>onset[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Estimated or actual date or date-time  the condition began, in the opinion of the clinician
     * </p> 
	 */
	public IDatatype getOnset() {  
		return myOnset;
	}

	/**
	 * Sets the value(s) for <b>onset[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Estimated or actual date or date-time  the condition began, in the opinion of the clinician
     * </p> 
	 */
	public Condition setOnset(IDatatype theValue) {
		myOnset = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>abatement[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date or estimated date that the condition resolved or went into remission. This is called \&quot;abatement\&quot; because of the many overloaded connotations associated with \&quot;remission\&quot; or \&quot;resolution\&quot; - Conditions are never really resolved, but they can abate.
     * </p> 
	 */
	public IDatatype getAbatement() {  
		return myAbatement;
	}

	/**
	 * Sets the value(s) for <b>abatement[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date or estimated date that the condition resolved or went into remission. This is called \&quot;abatement\&quot; because of the many overloaded connotations associated with \&quot;remission\&quot; or \&quot;resolution\&quot; - Conditions are never really resolved, but they can abate.
     * </p> 
	 */
	public Condition setAbatement(IDatatype theValue) {
		myAbatement = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>stage</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Clinical stage or grade of a condition. May include formal severity assessments
     * </p> 
	 */
	public Stage getStage() {  
		if (myStage == null) {
			myStage = new Stage();
		}
		return myStage;
	}

	/**
	 * Sets the value(s) for <b>stage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Clinical stage or grade of a condition. May include formal severity assessments
     * </p> 
	 */
	public Condition setStage(Stage theValue) {
		myStage = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>evidence</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed
     * </p> 
	 */
	public java.util.List<Evidence> getEvidence() {  
		if (myEvidence == null) {
			myEvidence = new java.util.ArrayList<Evidence>();
		}
		return myEvidence;
	}

	/**
	 * Sets the value(s) for <b>evidence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed
     * </p> 
	 */
	public Condition setEvidence(java.util.List<Evidence> theValue) {
		myEvidence = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>evidence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed
     * </p> 
	 */
	public Evidence addEvidence() {
		Evidence newType = new Evidence();
		getEvidence().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>evidence</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed
	 * </p>
	 * @param theValue The evidence to add (must not be <code>null</code>)
	 */
	public Condition addEvidence(Evidence theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getEvidence().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>evidence</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed
     * </p> 
	 */
	public Evidence getEvidenceFirstRep() {
		if (getEvidence().isEmpty()) {
			return addEvidence();
		}
		return getEvidence().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>bodySite</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The anatomical location where this condition manifests itself
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getBodySite() {  
		if (myBodySite == null) {
			myBodySite = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myBodySite;
	}

	/**
	 * Sets the value(s) for <b>bodySite</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The anatomical location where this condition manifests itself
     * </p> 
	 */
	public Condition setBodySite(java.util.List<CodeableConceptDt> theValue) {
		myBodySite = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>bodySite</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The anatomical location where this condition manifests itself
     * </p> 
	 */
	public CodeableConceptDt addBodySite() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getBodySite().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>bodySite</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The anatomical location where this condition manifests itself
	 * </p>
	 * @param theValue The bodySite to add (must not be <code>null</code>)
	 */
	public Condition addBodySite(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getBodySite().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>bodySite</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The anatomical location where this condition manifests itself
     * </p> 
	 */
	public CodeableConceptDt getBodySiteFirstRep() {
		if (getBodySite().isEmpty()) {
			return addBodySite();
		}
		return getBodySite().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>notes</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis
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
     * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis
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
     * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis
     * </p> 
	 */
	public Condition setNotes(StringDt theValue) {
		myNotes = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>notes</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about the Condition. This is a general notes/comments entry  for description of the Condition, its diagnosis and prognosis
     * </p> 
	 */
	public Condition setNotes( String theString) {
		myNotes = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Block class for child element: <b>Condition.stage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Clinical stage or grade of a condition. May include formal severity assessments
     * </p> 
	 */
	@Block()	
	public static class Stage 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="summary", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A simple summary of the stage such as \"Stage 3\". The determination of the stage is disease-specific"
	)
	private CodeableConceptDt mySummary;
	
	@Child(name="assessment", order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.ClinicalImpression.class, 		ca.uhn.fhir.model.dstu2.resource.DiagnosticReport.class, 		ca.uhn.fhir.model.dstu2.resource.Observation.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Reference to a formal record of the evidence on which the staging assessment is based"
	)
	private java.util.List<ResourceReferenceDt> myAssessment;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySummary,  myAssessment);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySummary, myAssessment);
	}

	/**
	 * Gets the value(s) for <b>summary</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A simple summary of the stage such as \&quot;Stage 3\&quot;. The determination of the stage is disease-specific
     * </p> 
	 */
	public CodeableConceptDt getSummary() {  
		if (mySummary == null) {
			mySummary = new CodeableConceptDt();
		}
		return mySummary;
	}

	/**
	 * Sets the value(s) for <b>summary</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A simple summary of the stage such as \&quot;Stage 3\&quot;. The determination of the stage is disease-specific
     * </p> 
	 */
	public Stage setSummary(CodeableConceptDt theValue) {
		mySummary = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>assessment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to a formal record of the evidence on which the staging assessment is based
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAssessment() {  
		if (myAssessment == null) {
			myAssessment = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAssessment;
	}

	/**
	 * Sets the value(s) for <b>assessment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to a formal record of the evidence on which the staging assessment is based
     * </p> 
	 */
	public Stage setAssessment(java.util.List<ResourceReferenceDt> theValue) {
		myAssessment = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>assessment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to a formal record of the evidence on which the staging assessment is based
     * </p> 
	 */
	public ResourceReferenceDt addAssessment() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAssessment().add(newType);
		return newType; 
	}
  


	}


	/**
	 * Block class for child element: <b>Condition.evidence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Supporting Evidence / manifestations that are the basis on which this condition is suspected or confirmed
     * </p> 
	 */
	@Block()	
	public static class Evidence 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A manifestation or symptom that led to the recording of this condition"
	)
	private CodeableConceptDt myCode;
	
	@Child(name="detail", order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Links to other relevant information, including pathology reports"
	)
	private java.util.List<ResourceReferenceDt> myDetail;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myDetail);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myDetail);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A manifestation or symptom that led to the recording of this condition
     * </p> 
	 */
	public CodeableConceptDt getCode() {  
		if (myCode == null) {
			myCode = new CodeableConceptDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A manifestation or symptom that led to the recording of this condition
     * </p> 
	 */
	public Evidence setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>detail</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Links to other relevant information, including pathology reports
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getDetail() {  
		if (myDetail == null) {
			myDetail = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myDetail;
	}

	/**
	 * Sets the value(s) for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Links to other relevant information, including pathology reports
     * </p> 
	 */
	public Evidence setDetail(java.util.List<ResourceReferenceDt> theValue) {
		myDetail = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Links to other relevant information, including pathology reports
     * </p> 
	 */
	public ResourceReferenceDt addDetail() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getDetail().add(newType);
		return newType; 
	}
  


	}




    @Override
    public String getResourceName() {
        return "Condition";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
