















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
 * HAPI/FHIR <b>AllergyIntolerance</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * Risk of harmful or undesirable, physiological response which is unique to an individual and associated with exposure to a substance.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * To record a clinical assessment of a propensity, or potential risk to an individual, of an adverse reaction upon future exposure to the specified substance, or class of substance.
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/AllergyIntolerance">http://hl7.org/fhir/profiles/AllergyIntolerance</a> 
 * </p>
 *
 */
@ResourceDef(name="AllergyIntolerance", profile="http://hl7.org/fhir/profiles/AllergyIntolerance", id="allergyintolerance")
public class AllergyIntolerance extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>substance</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.substance | AllergyIntolerance.reaction.substance</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="substance", path="AllergyIntolerance.substance | AllergyIntolerance.reaction.substance", description="", type="token"  )
	public static final String SP_SUBSTANCE = "substance";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>substance</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.substance | AllergyIntolerance.reaction.substance</b><br>
	 * </p>
	 */
	public static final TokenClientParam SUBSTANCE = new TokenClientParam(SP_SUBSTANCE);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="AllergyIntolerance.status", description="", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>criticality</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.criticality</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="criticality", path="AllergyIntolerance.criticality", description="", type="token"  )
	public static final String SP_CRITICALITY = "criticality";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>criticality</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.criticality</b><br>
	 * </p>
	 */
	public static final TokenClientParam CRITICALITY = new TokenClientParam(SP_CRITICALITY);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="AllergyIntolerance.type", description="", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.category</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="category", path="AllergyIntolerance.category", description="", type="token"  )
	public static final String SP_CATEGORY = "category";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.category</b><br>
	 * </p>
	 */
	public static final TokenClientParam CATEGORY = new TokenClientParam(SP_CATEGORY);

	/**
	 * Search parameter constant for <b>last-date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>AllergyIntolerance.lastOccurence</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="last-date", path="AllergyIntolerance.lastOccurence", description="", type="date"  )
	public static final String SP_LAST_DATE = "last-date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>last-date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>AllergyIntolerance.lastOccurence</b><br>
	 * </p>
	 */
	public static final DateClientParam LAST_DATE = new DateClientParam(SP_LAST_DATE);

	/**
	 * Search parameter constant for <b>manifestation</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.reaction.manifestation</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="manifestation", path="AllergyIntolerance.reaction.manifestation", description="", type="token"  )
	public static final String SP_MANIFESTATION = "manifestation";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>manifestation</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.reaction.manifestation</b><br>
	 * </p>
	 */
	public static final TokenClientParam MANIFESTATION = new TokenClientParam(SP_MANIFESTATION);

	/**
	 * Search parameter constant for <b>onset</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>AllergyIntolerance.reaction.onset</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="onset", path="AllergyIntolerance.reaction.onset", description="", type="date"  )
	public static final String SP_ONSET = "onset";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>onset</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>AllergyIntolerance.reaction.onset</b><br>
	 * </p>
	 */
	public static final DateClientParam ONSET = new DateClientParam(SP_ONSET);

	/**
	 * Search parameter constant for <b>severity</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.reaction.severity</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="severity", path="AllergyIntolerance.reaction.severity", description="", type="token"  )
	public static final String SP_SEVERITY = "severity";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>severity</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.reaction.severity</b><br>
	 * </p>
	 */
	public static final TokenClientParam SEVERITY = new TokenClientParam(SP_SEVERITY);

	/**
	 * Search parameter constant for <b>route</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.reaction.exposureRoute</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="route", path="AllergyIntolerance.reaction.exposureRoute", description="", type="token"  )
	public static final String SP_ROUTE = "route";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>route</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.reaction.exposureRoute</b><br>
	 * </p>
	 */
	public static final TokenClientParam ROUTE = new TokenClientParam(SP_ROUTE);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="AllergyIntolerance.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>AllergyIntolerance.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>AllergyIntolerance.recordedDate</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="AllergyIntolerance.recordedDate", description="", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>AllergyIntolerance.recordedDate</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>recorder</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AllergyIntolerance.recorder</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="recorder", path="AllergyIntolerance.recorder", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_RECORDER = "recorder";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>recorder</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AllergyIntolerance.recorder</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RECORDER = new ReferenceClientParam(SP_RECORDER);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AllergyIntolerance.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="AllergyIntolerance.patient", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AllergyIntolerance.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>reporter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AllergyIntolerance.reporter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="reporter", path="AllergyIntolerance.reporter", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_REPORTER = "reporter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>reporter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>AllergyIntolerance.reporter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam REPORTER = new ReferenceClientParam(SP_REPORTER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>AllergyIntolerance:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("AllergyIntolerance:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>AllergyIntolerance:recorder</b>".
	 */
	public static final Include INCLUDE_RECORDER = new Include("AllergyIntolerance:recorder");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>AllergyIntolerance:reporter</b>".
	 */
	public static final Include INCLUDE_REPORTER = new Include("AllergyIntolerance:reporter");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="onset", type=DateTimeDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Record of the date and/or time of the onset of the Allergy or Intolerance"
	)
	private DateTimeDt myOnset;
	
	@Child(name="recordedDate", type=DateTimeDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Date when the sensitivity was recorded"
	)
	private DateTimeDt myRecordedDate;
	
	@Child(name="recorder", order=3, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Individual who recorded the record and takes responsibility for its conten"
	)
	private ResourceReferenceDt myRecorder;
	
	@Child(name="patient", order=4, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The patient who has the allergy or intolerance"
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="reporter", order=5, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The source of the information about the allergy that is recorded"
	)
	private ResourceReferenceDt myReporter;
	
	@Child(name="substance", type=CodeableConceptDt.class, order=6, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk"
	)
	private CodeableConceptDt mySubstance;
	
	@Child(name="status", type=CodeDt.class, order=7, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/allergy-intolerance-status")
	private BoundCodeDt<AllergyIntoleranceStatusEnum> myStatus;
	
	@Child(name="criticality", type=CodeDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/allergy-intolerance-criticality")
	private BoundCodeDt<AllergyIntoleranceCriticalityEnum> myCriticality;
	
	@Child(name="type", type=CodeDt.class, order=9, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identification of the underlying physiological mechanism for the reaction risk."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/allergy-intolerance-type")
	private BoundCodeDt<AllergyIntoleranceTypeEnum> myType;
	
	@Child(name="category", type=CodeDt.class, order=10, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Category of the identified Substance"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/allergy-intolerance-category")
	private BoundCodeDt<AllergyIntoleranceCategoryEnum> myCategory;
	
	@Child(name="lastOccurence", type=DateTimeDt.class, order=11, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Represents the date and/or time of the last known occurrence of a reaction event"
	)
	private DateTimeDt myLastOccurence;
	
	@Child(name="note", type=AnnotationDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional narrative about the propensity for the Adverse Reaction, not captured in other fields."
	)
	private AnnotationDt myNote;
	
	@Child(name="reaction", order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Details about each adverse reaction event linked to exposure to the identified Substance"
	)
	private java.util.List<Reaction> myReaction;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myOnset,  myRecordedDate,  myRecorder,  myPatient,  myReporter,  mySubstance,  myStatus,  myCriticality,  myType,  myCategory,  myLastOccurence,  myNote,  myReaction);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myOnset, myRecordedDate, myRecorder, myPatient, myReporter, mySubstance, myStatus, myCriticality, myType, myCategory, myLastOccurence, myNote, myReaction);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
     * This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public AllergyIntolerance setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
	 * This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public AllergyIntolerance addIdentifier(IdentifierDt theValue) {
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
     * This records identifiers associated with this allergy/intolerance concern that are defined by business processes and/or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>onset</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Record of the date and/or time of the onset of the Allergy or Intolerance
     * </p> 
	 */
	public DateTimeDt getOnsetElement() {  
		if (myOnset == null) {
			myOnset = new DateTimeDt();
		}
		return myOnset;
	}

	
	/**
	 * Gets the value(s) for <b>onset</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Record of the date and/or time of the onset of the Allergy or Intolerance
     * </p> 
	 */
	public Date getOnset() {  
		return getOnsetElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>onset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Record of the date and/or time of the onset of the Allergy or Intolerance
     * </p> 
	 */
	public AllergyIntolerance setOnset(DateTimeDt theValue) {
		myOnset = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>onset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Record of the date and/or time of the onset of the Allergy or Intolerance
     * </p> 
	 */
	public AllergyIntolerance setOnset( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myOnset = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>onset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Record of the date and/or time of the onset of the Allergy or Intolerance
     * </p> 
	 */
	public AllergyIntolerance setOnsetWithSecondsPrecision( Date theDate) {
		myOnset = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>recordedDate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date when the sensitivity was recorded
     * </p> 
	 */
	public DateTimeDt getRecordedDateElement() {  
		if (myRecordedDate == null) {
			myRecordedDate = new DateTimeDt();
		}
		return myRecordedDate;
	}

	
	/**
	 * Gets the value(s) for <b>recordedDate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date when the sensitivity was recorded
     * </p> 
	 */
	public Date getRecordedDate() {  
		return getRecordedDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>recordedDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date when the sensitivity was recorded
     * </p> 
	 */
	public AllergyIntolerance setRecordedDate(DateTimeDt theValue) {
		myRecordedDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>recordedDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date when the sensitivity was recorded
     * </p> 
	 */
	public AllergyIntolerance setRecordedDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myRecordedDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>recordedDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date when the sensitivity was recorded
     * </p> 
	 */
	public AllergyIntolerance setRecordedDateWithSecondsPrecision( Date theDate) {
		myRecordedDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>recorder</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Individual who recorded the record and takes responsibility for its conten
     * </p> 
	 */
	public ResourceReferenceDt getRecorder() {  
		if (myRecorder == null) {
			myRecorder = new ResourceReferenceDt();
		}
		return myRecorder;
	}

	/**
	 * Sets the value(s) for <b>recorder</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Individual who recorded the record and takes responsibility for its conten
     * </p> 
	 */
	public AllergyIntolerance setRecorder(ResourceReferenceDt theValue) {
		myRecorder = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>patient</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The patient who has the allergy or intolerance
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
     * The patient who has the allergy or intolerance
     * </p> 
	 */
	public AllergyIntolerance setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reporter</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The source of the information about the allergy that is recorded
     * </p> 
	 */
	public ResourceReferenceDt getReporter() {  
		if (myReporter == null) {
			myReporter = new ResourceReferenceDt();
		}
		return myReporter;
	}

	/**
	 * Sets the value(s) for <b>reporter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The source of the information about the allergy that is recorded
     * </p> 
	 */
	public AllergyIntolerance setReporter(ResourceReferenceDt theValue) {
		myReporter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>substance</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk
     * </p> 
	 */
	public CodeableConceptDt getSubstance() {  
		if (mySubstance == null) {
			mySubstance = new CodeableConceptDt();
		}
		return mySubstance;
	}

	/**
	 * Sets the value(s) for <b>substance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identification of a substance, or a class of substances, that is considered to be responsible for the adverse reaction risk
     * </p> 
	 */
	public AllergyIntolerance setSubstance(CodeableConceptDt theValue) {
		mySubstance = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance
     * </p> 
	 */
	public BoundCodeDt<AllergyIntoleranceStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<AllergyIntoleranceStatusEnum>(AllergyIntoleranceStatusEnum.VALUESET_BINDER);
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
     * Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance
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
     * Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance
     * </p> 
	 */
	public AllergyIntolerance setStatus(BoundCodeDt<AllergyIntoleranceStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Assertion about certainty associated with the propensity, or potential risk, of a reaction to the identified Substance
     * </p> 
	 */
	public AllergyIntolerance setStatus(AllergyIntoleranceStatusEnum theValue) {
		setStatus(new BoundCodeDt<AllergyIntoleranceStatusEnum>(AllergyIntoleranceStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>criticality</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance
     * </p> 
	 */
	public BoundCodeDt<AllergyIntoleranceCriticalityEnum> getCriticalityElement() {  
		if (myCriticality == null) {
			myCriticality = new BoundCodeDt<AllergyIntoleranceCriticalityEnum>(AllergyIntoleranceCriticalityEnum.VALUESET_BINDER);
		}
		return myCriticality;
	}

	
	/**
	 * Gets the value(s) for <b>criticality</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance
     * </p> 
	 */
	public String getCriticality() {  
		return getCriticalityElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>criticality</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance
     * </p> 
	 */
	public AllergyIntolerance setCriticality(BoundCodeDt<AllergyIntoleranceCriticalityEnum> theValue) {
		myCriticality = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>criticality</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Estimate of the potential clinical harm, or seriousness, of the reaction to the identified Substance
     * </p> 
	 */
	public AllergyIntolerance setCriticality(AllergyIntoleranceCriticalityEnum theValue) {
		setCriticality(new BoundCodeDt<AllergyIntoleranceCriticalityEnum>(AllergyIntoleranceCriticalityEnum.VALUESET_BINDER, theValue));
		
/*
		getCriticalityElement().setValueAsEnum(theValue);
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
     * Identification of the underlying physiological mechanism for the reaction risk.
     * </p> 
	 */
	public BoundCodeDt<AllergyIntoleranceTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<AllergyIntoleranceTypeEnum>(AllergyIntoleranceTypeEnum.VALUESET_BINDER);
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
     * Identification of the underlying physiological mechanism for the reaction risk.
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
     * Identification of the underlying physiological mechanism for the reaction risk.
     * </p> 
	 */
	public AllergyIntolerance setType(BoundCodeDt<AllergyIntoleranceTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identification of the underlying physiological mechanism for the reaction risk.
     * </p> 
	 */
	public AllergyIntolerance setType(AllergyIntoleranceTypeEnum theValue) {
		setType(new BoundCodeDt<AllergyIntoleranceTypeEnum>(AllergyIntoleranceTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>category</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Category of the identified Substance
     * </p> 
	 */
	public BoundCodeDt<AllergyIntoleranceCategoryEnum> getCategoryElement() {  
		if (myCategory == null) {
			myCategory = new BoundCodeDt<AllergyIntoleranceCategoryEnum>(AllergyIntoleranceCategoryEnum.VALUESET_BINDER);
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
     * Category of the identified Substance
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
     * Category of the identified Substance
     * </p> 
	 */
	public AllergyIntolerance setCategory(BoundCodeDt<AllergyIntoleranceCategoryEnum> theValue) {
		myCategory = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>category</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Category of the identified Substance
     * </p> 
	 */
	public AllergyIntolerance setCategory(AllergyIntoleranceCategoryEnum theValue) {
		setCategory(new BoundCodeDt<AllergyIntoleranceCategoryEnum>(AllergyIntoleranceCategoryEnum.VALUESET_BINDER, theValue));
		
/*
		getCategoryElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>lastOccurence</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Represents the date and/or time of the last known occurrence of a reaction event
     * </p> 
	 */
	public DateTimeDt getLastOccurenceElement() {  
		if (myLastOccurence == null) {
			myLastOccurence = new DateTimeDt();
		}
		return myLastOccurence;
	}

	
	/**
	 * Gets the value(s) for <b>lastOccurence</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Represents the date and/or time of the last known occurrence of a reaction event
     * </p> 
	 */
	public Date getLastOccurence() {  
		return getLastOccurenceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>lastOccurence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Represents the date and/or time of the last known occurrence of a reaction event
     * </p> 
	 */
	public AllergyIntolerance setLastOccurence(DateTimeDt theValue) {
		myLastOccurence = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>lastOccurence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Represents the date and/or time of the last known occurrence of a reaction event
     * </p> 
	 */
	public AllergyIntolerance setLastOccurence( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myLastOccurence = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>lastOccurence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Represents the date and/or time of the last known occurrence of a reaction event
     * </p> 
	 */
	public AllergyIntolerance setLastOccurenceWithSecondsPrecision( Date theDate) {
		myLastOccurence = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
     * </p> 
	 */
	public AnnotationDt getNote() {  
		if (myNote == null) {
			myNote = new AnnotationDt();
		}
		return myNote;
	}

	/**
	 * Sets the value(s) for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional narrative about the propensity for the Adverse Reaction, not captured in other fields.
     * </p> 
	 */
	public AllergyIntolerance setNote(AnnotationDt theValue) {
		myNote = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reaction</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details about each adverse reaction event linked to exposure to the identified Substance
     * </p> 
	 */
	public java.util.List<Reaction> getReaction() {  
		if (myReaction == null) {
			myReaction = new java.util.ArrayList<Reaction>();
		}
		return myReaction;
	}

	/**
	 * Sets the value(s) for <b>reaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details about each adverse reaction event linked to exposure to the identified Substance
     * </p> 
	 */
	public AllergyIntolerance setReaction(java.util.List<Reaction> theValue) {
		myReaction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details about each adverse reaction event linked to exposure to the identified Substance
     * </p> 
	 */
	public Reaction addReaction() {
		Reaction newType = new Reaction();
		getReaction().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>reaction</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Details about each adverse reaction event linked to exposure to the identified Substance
	 * </p>
	 * @param theValue The reaction to add (must not be <code>null</code>)
	 */
	public AllergyIntolerance addReaction(Reaction theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getReaction().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>reaction</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Details about each adverse reaction event linked to exposure to the identified Substance
     * </p> 
	 */
	public Reaction getReactionFirstRep() {
		if (getReaction().isEmpty()) {
			return addReaction();
		}
		return getReaction().get(0); 
	}
  
	/**
	 * Block class for child element: <b>AllergyIntolerance.reaction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details about each adverse reaction event linked to exposure to the identified Substance
     * </p> 
	 */
	@Block()	
	public static class Reaction 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="substance", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance"
	)
	private CodeableConceptDt mySubstance;
	
	@Child(name="certainty", type=CodeDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/reaction-event-certainty")
	private BoundCodeDt<AllergyIntoleranceCertaintyEnum> myCertainty;
	
	@Child(name="manifestation", type=CodeableConceptDt.class, order=2, min=1, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Clinical symptoms and/or signs that are observed or associated with the adverse reaction event"
	)
	private java.util.List<CodeableConceptDt> myManifestation;
	
	@Child(name="description", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Text description about the reaction as a whole, including details of the manifestation if required"
	)
	private StringDt myDescription;
	
	@Child(name="onset", type=DateTimeDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Record of the date and/or time of the onset of the Reaction"
	)
	private DateTimeDt myOnset;
	
	@Child(name="severity", type=CodeDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/reaction-event-severity")
	private BoundCodeDt<AllergyIntoleranceSeverityEnum> mySeverity;
	
	@Child(name="exposureRoute", type=CodeableConceptDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identification of the route by which the subject was exposed to the substance."
	)
	private CodeableConceptDt myExposureRoute;
	
	@Child(name="note", type=AnnotationDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional text about the adverse reaction event not captured in other fields"
	)
	private AnnotationDt myNote;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySubstance,  myCertainty,  myManifestation,  myDescription,  myOnset,  mySeverity,  myExposureRoute,  myNote);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySubstance, myCertainty, myManifestation, myDescription, myOnset, mySeverity, myExposureRoute, myNote);
	}

	/**
	 * Gets the value(s) for <b>substance</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance
     * </p> 
	 */
	public CodeableConceptDt getSubstance() {  
		if (mySubstance == null) {
			mySubstance = new CodeableConceptDt();
		}
		return mySubstance;
	}

	/**
	 * Sets the value(s) for <b>substance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identification of the specific substance considered to be responsible for the Adverse Reaction event. Note: the substance for a specific reaction may be different to the substance identified as the cause of the risk, but must be consistent with it. For instance, it may be a more specific substance (e.g. a brand medication) or a composite substance that includes the identified substance. It must be clinically safe to only process the AllergyIntolerance.substance and ignore the AllergyIntolerance.event.substance
     * </p> 
	 */
	public Reaction setSubstance(CodeableConceptDt theValue) {
		mySubstance = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>certainty</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event
     * </p> 
	 */
	public BoundCodeDt<AllergyIntoleranceCertaintyEnum> getCertaintyElement() {  
		if (myCertainty == null) {
			myCertainty = new BoundCodeDt<AllergyIntoleranceCertaintyEnum>(AllergyIntoleranceCertaintyEnum.VALUESET_BINDER);
		}
		return myCertainty;
	}

	
	/**
	 * Gets the value(s) for <b>certainty</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event
     * </p> 
	 */
	public String getCertainty() {  
		return getCertaintyElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>certainty</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event
     * </p> 
	 */
	public Reaction setCertainty(BoundCodeDt<AllergyIntoleranceCertaintyEnum> theValue) {
		myCertainty = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>certainty</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Statement about the degree of clinical certainty that the specific substance was the cause of the manifestation in this reaction event
     * </p> 
	 */
	public Reaction setCertainty(AllergyIntoleranceCertaintyEnum theValue) {
		setCertainty(new BoundCodeDt<AllergyIntoleranceCertaintyEnum>(AllergyIntoleranceCertaintyEnum.VALUESET_BINDER, theValue));
		
/*
		getCertaintyElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>manifestation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getManifestation() {  
		if (myManifestation == null) {
			myManifestation = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myManifestation;
	}

	/**
	 * Sets the value(s) for <b>manifestation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event
     * </p> 
	 */
	public Reaction setManifestation(java.util.List<CodeableConceptDt> theValue) {
		myManifestation = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>manifestation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event
     * </p> 
	 */
	public CodeableConceptDt addManifestation() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getManifestation().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>manifestation</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event
	 * </p>
	 * @param theValue The manifestation to add (must not be <code>null</code>)
	 */
	public Reaction addManifestation(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getManifestation().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>manifestation</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Clinical symptoms and/or signs that are observed or associated with the adverse reaction event
     * </p> 
	 */
	public CodeableConceptDt getManifestationFirstRep() {
		if (getManifestation().isEmpty()) {
			return addManifestation();
		}
		return getManifestation().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Text description about the reaction as a whole, including details of the manifestation if required
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
     * Text description about the reaction as a whole, including details of the manifestation if required
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
     * Text description about the reaction as a whole, including details of the manifestation if required
     * </p> 
	 */
	public Reaction setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Text description about the reaction as a whole, including details of the manifestation if required
     * </p> 
	 */
	public Reaction setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>onset</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Record of the date and/or time of the onset of the Reaction
     * </p> 
	 */
	public DateTimeDt getOnsetElement() {  
		if (myOnset == null) {
			myOnset = new DateTimeDt();
		}
		return myOnset;
	}

	
	/**
	 * Gets the value(s) for <b>onset</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Record of the date and/or time of the onset of the Reaction
     * </p> 
	 */
	public Date getOnset() {  
		return getOnsetElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>onset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Record of the date and/or time of the onset of the Reaction
     * </p> 
	 */
	public Reaction setOnset(DateTimeDt theValue) {
		myOnset = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>onset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Record of the date and/or time of the onset of the Reaction
     * </p> 
	 */
	public Reaction setOnset( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myOnset = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>onset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Record of the date and/or time of the onset of the Reaction
     * </p> 
	 */
	public Reaction setOnsetWithSecondsPrecision( Date theDate) {
		myOnset = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>severity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations
     * </p> 
	 */
	public BoundCodeDt<AllergyIntoleranceSeverityEnum> getSeverityElement() {  
		if (mySeverity == null) {
			mySeverity = new BoundCodeDt<AllergyIntoleranceSeverityEnum>(AllergyIntoleranceSeverityEnum.VALUESET_BINDER);
		}
		return mySeverity;
	}

	
	/**
	 * Gets the value(s) for <b>severity</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations
     * </p> 
	 */
	public String getSeverity() {  
		return getSeverityElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>severity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations
     * </p> 
	 */
	public Reaction setSeverity(BoundCodeDt<AllergyIntoleranceSeverityEnum> theValue) {
		mySeverity = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>severity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Clinical assessment of the severity of the reaction event as a whole, potentially considering multiple different manifestations
     * </p> 
	 */
	public Reaction setSeverity(AllergyIntoleranceSeverityEnum theValue) {
		setSeverity(new BoundCodeDt<AllergyIntoleranceSeverityEnum>(AllergyIntoleranceSeverityEnum.VALUESET_BINDER, theValue));
		
/*
		getSeverityElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>exposureRoute</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identification of the route by which the subject was exposed to the substance.
     * </p> 
	 */
	public CodeableConceptDt getExposureRoute() {  
		if (myExposureRoute == null) {
			myExposureRoute = new CodeableConceptDt();
		}
		return myExposureRoute;
	}

	/**
	 * Sets the value(s) for <b>exposureRoute</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identification of the route by which the subject was exposed to the substance.
     * </p> 
	 */
	public Reaction setExposureRoute(CodeableConceptDt theValue) {
		myExposureRoute = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional text about the adverse reaction event not captured in other fields
     * </p> 
	 */
	public AnnotationDt getNote() {  
		if (myNote == null) {
			myNote = new AnnotationDt();
		}
		return myNote;
	}

	/**
	 * Sets the value(s) for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional text about the adverse reaction event not captured in other fields
     * </p> 
	 */
	public Reaction setNote(AnnotationDt theValue) {
		myNote = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "AllergyIntolerance";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
