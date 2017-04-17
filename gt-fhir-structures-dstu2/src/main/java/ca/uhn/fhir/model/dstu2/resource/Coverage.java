















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
 * HAPI/FHIR <b>Coverage</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * Financial instrument which may be used to pay for or reimburse health care products and services.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Health care programs and insurers are significant payors of health service costs
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Coverage">http://hl7.org/fhir/profiles/Coverage</a> 
 * </p>
 *
 */
@ResourceDef(name="Coverage", profile="http://hl7.org/fhir/profiles/Coverage", id="coverage")
public class Coverage extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>issuer</b>
	 * <p>
	 * Description: <b>The identity of the insurer</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Coverage.issuer</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="issuer", path="Coverage.issuer", description="The identity of the insurer", type="reference"  )
	public static final String SP_ISSUER = "issuer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>issuer</b>
	 * <p>
	 * Description: <b>The identity of the insurer</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Coverage.issuer</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ISSUER = new ReferenceClientParam(SP_ISSUER);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The primary identifier of the insured</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Coverage.identifier", description="The primary identifier of the insured", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The primary identifier of the insured</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>The kind of coverage</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="Coverage.type", description="The kind of coverage", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>The kind of coverage</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>plan</b>
	 * <p>
	 * Description: <b>A plan or policy identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.plan</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="plan", path="Coverage.plan", description="A plan or policy identifier", type="token"  )
	public static final String SP_PLAN = "plan";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>plan</b>
	 * <p>
	 * Description: <b>A plan or policy identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.plan</b><br>
	 * </p>
	 */
	public static final TokenClientParam PLAN = new TokenClientParam(SP_PLAN);

	/**
	 * Search parameter constant for <b>subplan</b>
	 * <p>
	 * Description: <b>Sub-plan identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.subPlan</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subplan", path="Coverage.subPlan", description="Sub-plan identifier", type="token"  )
	public static final String SP_SUBPLAN = "subplan";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subplan</b>
	 * <p>
	 * Description: <b>Sub-plan identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.subPlan</b><br>
	 * </p>
	 */
	public static final TokenClientParam SUBPLAN = new TokenClientParam(SP_SUBPLAN);

	/**
	 * Search parameter constant for <b>group</b>
	 * <p>
	 * Description: <b>Group identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.group</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="group", path="Coverage.group", description="Group identifier", type="token"  )
	public static final String SP_GROUP = "group";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>group</b>
	 * <p>
	 * Description: <b>Group identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.group</b><br>
	 * </p>
	 */
	public static final TokenClientParam GROUP = new TokenClientParam(SP_GROUP);

	/**
	 * Search parameter constant for <b>dependent</b>
	 * <p>
	 * Description: <b>Dependent number</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.dependent</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="dependent", path="Coverage.dependent", description="Dependent number", type="token"  )
	public static final String SP_DEPENDENT = "dependent";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>dependent</b>
	 * <p>
	 * Description: <b>Dependent number</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.dependent</b><br>
	 * </p>
	 */
	public static final TokenClientParam DEPENDENT = new TokenClientParam(SP_DEPENDENT);

	/**
	 * Search parameter constant for <b>sequence</b>
	 * <p>
	 * Description: <b>Sequence number</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.sequence</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="sequence", path="Coverage.sequence", description="Sequence number", type="token"  )
	public static final String SP_SEQUENCE = "sequence";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>sequence</b>
	 * <p>
	 * Description: <b>Sequence number</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Coverage.sequence</b><br>
	 * </p>
	 */
	public static final TokenClientParam SEQUENCE = new TokenClientParam(SP_SEQUENCE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Coverage:issuer</b>".
	 */
	public static final Include INCLUDE_ISSUER = new Include("Coverage:issuer");


	@Child(name="issuer", order=0, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The program or plan underwriter or payor."
	)
	private ResourceReferenceDt myIssuer;
	
	@Child(name="bin", type=IdentifierDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Business Identification Number (BIN number) used to identify the routing  of eclaims if the insurer themselves don't have a BIN number for all of their business."
	)
	private IdentifierDt myBin;
	
	@Child(name="period", type=PeriodDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force."
	)
	private PeriodDt myPeriod;
	
	@Child(name="type", type=CodingDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health."
	)
	private CodingDt myType;
	
	@Child(name="subscriberId", type=IdentifierDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The id issued to the subscriber."
	)
	private IdentifierDt mySubscriberId;
	
	@Child(name="identifier", type=IdentifierDt.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Subscriber Id, Certificate number or Personal Health Number or Case ID."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="group", type=StringDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID."
	)
	private StringDt myGroup;
	
	@Child(name="plan", type=StringDt.class, order=7, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID."
	)
	private StringDt myPlan;
	
	@Child(name="subPlan", type=StringDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a specific employer group within a class of employers. May be referred to as a Section or Division ID."
	)
	private StringDt mySubPlan;
	
	@Child(name="dependent", type=PositiveIntDt.class, order=9, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A unique identifier for a dependent under the coverage."
	)
	private PositiveIntDt myDependent;
	
	@Child(name="sequence", type=PositiveIntDt.class, order=10, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An optional counter for a particular instance of the identified coverage which increments upon each renewal."
	)
	private PositiveIntDt mySequence;
	
	@Child(name="subscriber", order=11, min=0, max=1, summary=false, modifier=true, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The party who 'owns' the insurance contractual relationship to the policy or to whom the benefit of the policy is due."
	)
	private ResourceReferenceDt mySubscriber;
	
	@Child(name="network", type=IdentifierDt.class, order=12, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The identifier for a community of providers."
	)
	private IdentifierDt myNetwork;
	
	@Child(name="contract", order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Contract.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The policy(s) which constitute this insurance coverage."
	)
	private java.util.List<ResourceReferenceDt> myContract;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIssuer,  myBin,  myPeriod,  myType,  mySubscriberId,  myIdentifier,  myGroup,  myPlan,  mySubPlan,  myDependent,  mySequence,  mySubscriber,  myNetwork,  myContract);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIssuer, myBin, myPeriod, myType, mySubscriberId, myIdentifier, myGroup, myPlan, mySubPlan, myDependent, mySequence, mySubscriber, myNetwork, myContract);
	}

	/**
	 * Gets the value(s) for <b>issuer</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The program or plan underwriter or payor.
     * </p> 
	 */
	public ResourceReferenceDt getIssuer() {  
		if (myIssuer == null) {
			myIssuer = new ResourceReferenceDt();
		}
		return myIssuer;
	}

	/**
	 * Sets the value(s) for <b>issuer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The program or plan underwriter or payor.
     * </p> 
	 */
	public Coverage setIssuer(ResourceReferenceDt theValue) {
		myIssuer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>bin</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Business Identification Number (BIN number) used to identify the routing  of eclaims if the insurer themselves don't have a BIN number for all of their business.
     * </p> 
	 */
	public IdentifierDt getBin() {  
		if (myBin == null) {
			myBin = new IdentifierDt();
		}
		return myBin;
	}

	/**
	 * Sets the value(s) for <b>bin</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Business Identification Number (BIN number) used to identify the routing  of eclaims if the insurer themselves don't have a BIN number for all of their business.
     * </p> 
	 */
	public Coverage setBin(IdentifierDt theValue) {
		myBin = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
     * </p> 
	 */
	public PeriodDt getPeriod() {  
		if (myPeriod == null) {
			myPeriod = new PeriodDt();
		}
		return myPeriod;
	}

	/**
	 * Sets the value(s) for <b>period</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Time period during which the coverage is in force. A missing start date indicates the start date isn't known, a missing end date means the coverage is continuing to be in force.
     * </p> 
	 */
	public Coverage setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health.
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
     * The type of coverage: social program, medical plan, accident coverage (workers compensation, auto), group health.
     * </p> 
	 */
	public Coverage setType(CodingDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>subscriberId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The id issued to the subscriber.
     * </p> 
	 */
	public IdentifierDt getSubscriberId() {  
		if (mySubscriberId == null) {
			mySubscriberId = new IdentifierDt();
		}
		return mySubscriberId;
	}

	/**
	 * Sets the value(s) for <b>subscriberId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The id issued to the subscriber.
     * </p> 
	 */
	public Coverage setSubscriberId(IdentifierDt theValue) {
		mySubscriberId = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Subscriber Id, Certificate number or Personal Health Number or Case ID.
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
     * The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Subscriber Id, Certificate number or Personal Health Number or Case ID.
     * </p> 
	 */
	public Coverage setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Subscriber Id, Certificate number or Personal Health Number or Case ID.
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
	 * The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Subscriber Id, Certificate number or Personal Health Number or Case ID.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Coverage addIdentifier(IdentifierDt theValue) {
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
     * The main (and possibly only) identifier for the coverage - often referred to as a Member Id, Subscriber Id, Certificate number or Personal Health Number or Case ID.
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>group</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
     * </p> 
	 */
	public StringDt getGroupElement() {  
		if (myGroup == null) {
			myGroup = new StringDt();
		}
		return myGroup;
	}

	
	/**
	 * Gets the value(s) for <b>group</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
     * </p> 
	 */
	public String getGroup() {  
		return getGroupElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
     * </p> 
	 */
	public Coverage setGroup(StringDt theValue) {
		myGroup = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>group</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
     * </p> 
	 */
	public Coverage setGroup( String theString) {
		myGroup = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>plan</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
     * </p> 
	 */
	public StringDt getPlanElement() {  
		if (myPlan == null) {
			myPlan = new StringDt();
		}
		return myPlan;
	}

	
	/**
	 * Gets the value(s) for <b>plan</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
     * </p> 
	 */
	public String getPlan() {  
		return getPlanElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>plan</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
     * </p> 
	 */
	public Coverage setPlan(StringDt theValue) {
		myPlan = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>plan</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a style or collective of coverage issues by the underwriter, for example may be used to identify a class of coverage or employer group. May also be referred to as a Policy or Group ID.
     * </p> 
	 */
	public Coverage setPlan( String theString) {
		myPlan = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>subPlan</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a specific employer group within a class of employers. May be referred to as a Section or Division ID.
     * </p> 
	 */
	public StringDt getSubPlanElement() {  
		if (mySubPlan == null) {
			mySubPlan = new StringDt();
		}
		return mySubPlan;
	}

	
	/**
	 * Gets the value(s) for <b>subPlan</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a specific employer group within a class of employers. May be referred to as a Section or Division ID.
     * </p> 
	 */
	public String getSubPlan() {  
		return getSubPlanElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>subPlan</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a specific employer group within a class of employers. May be referred to as a Section or Division ID.
     * </p> 
	 */
	public Coverage setSubPlan(StringDt theValue) {
		mySubPlan = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>subPlan</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a sub-style or sub-collective of coverage issues by the underwriter, for example may be used to identify a specific employer group within a class of employers. May be referred to as a Section or Division ID.
     * </p> 
	 */
	public Coverage setSubPlan( String theString) {
		mySubPlan = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>dependent</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A unique identifier for a dependent under the coverage.
     * </p> 
	 */
	public PositiveIntDt getDependentElement() {  
		if (myDependent == null) {
			myDependent = new PositiveIntDt();
		}
		return myDependent;
	}

	
	/**
	 * Gets the value(s) for <b>dependent</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A unique identifier for a dependent under the coverage.
     * </p> 
	 */
	public Integer getDependent() {  
		return getDependentElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>dependent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A unique identifier for a dependent under the coverage.
     * </p> 
	 */
	public Coverage setDependent(PositiveIntDt theValue) {
		myDependent = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>dependent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A unique identifier for a dependent under the coverage.
     * </p> 
	 */
	public Coverage setDependent( int theInteger) {
		myDependent = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>sequence</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An optional counter for a particular instance of the identified coverage which increments upon each renewal.
     * </p> 
	 */
	public PositiveIntDt getSequenceElement() {  
		if (mySequence == null) {
			mySequence = new PositiveIntDt();
		}
		return mySequence;
	}

	
	/**
	 * Gets the value(s) for <b>sequence</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An optional counter for a particular instance of the identified coverage which increments upon each renewal.
     * </p> 
	 */
	public Integer getSequence() {  
		return getSequenceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An optional counter for a particular instance of the identified coverage which increments upon each renewal.
     * </p> 
	 */
	public Coverage setSequence(PositiveIntDt theValue) {
		mySequence = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An optional counter for a particular instance of the identified coverage which increments upon each renewal.
     * </p> 
	 */
	public Coverage setSequence( int theInteger) {
		mySequence = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>subscriber</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The party who 'owns' the insurance contractual relationship to the policy or to whom the benefit of the policy is due.
     * </p> 
	 */
	public ResourceReferenceDt getSubscriber() {  
		if (mySubscriber == null) {
			mySubscriber = new ResourceReferenceDt();
		}
		return mySubscriber;
	}

	/**
	 * Sets the value(s) for <b>subscriber</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The party who 'owns' the insurance contractual relationship to the policy or to whom the benefit of the policy is due.
     * </p> 
	 */
	public Coverage setSubscriber(ResourceReferenceDt theValue) {
		mySubscriber = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>network</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier for a community of providers.
     * </p> 
	 */
	public IdentifierDt getNetwork() {  
		if (myNetwork == null) {
			myNetwork = new IdentifierDt();
		}
		return myNetwork;
	}

	/**
	 * Sets the value(s) for <b>network</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier for a community of providers.
     * </p> 
	 */
	public Coverage setNetwork(IdentifierDt theValue) {
		myNetwork = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>contract</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The policy(s) which constitute this insurance coverage.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getContract() {  
		if (myContract == null) {
			myContract = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myContract;
	}

	/**
	 * Sets the value(s) for <b>contract</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The policy(s) which constitute this insurance coverage.
     * </p> 
	 */
	public Coverage setContract(java.util.List<ResourceReferenceDt> theValue) {
		myContract = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>contract</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The policy(s) which constitute this insurance coverage.
     * </p> 
	 */
	public ResourceReferenceDt addContract() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getContract().add(newType);
		return newType; 
	}
  


    @Override
    public String getResourceName() {
        return "Coverage";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
