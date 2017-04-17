















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
 * HAPI/FHIR <b>ImmunizationRecommendation</b> Resource
 * (clinical.medication)
 *
 * <p>
 * <b>Definition:</b>
 * A patient's point-in-time immunization and recommendation (i.e. forecasting a patient's immunization eligibility according to a published schedule) with optional supporting justification.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/ImmunizationRecommendation">http://hl7.org/fhir/profiles/ImmunizationRecommendation</a> 
 * </p>
 *
 */
@ResourceDef(name="ImmunizationRecommendation", profile="http://hl7.org/fhir/profiles/ImmunizationRecommendation", id="immunizationrecommendation")
public class ImmunizationRecommendation extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>vaccine-type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.vaccineCode</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="vaccine-type", path="ImmunizationRecommendation.recommendation.vaccineCode", description="", type="token"  )
	public static final String SP_VACCINE_TYPE = "vaccine-type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>vaccine-type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.vaccineCode</b><br>
	 * </p>
	 */
	public static final TokenClientParam VACCINE_TYPE = new TokenClientParam(SP_VACCINE_TYPE);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImmunizationRecommendation.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="ImmunizationRecommendation.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImmunizationRecommendation.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="ImmunizationRecommendation.recommendation.date", description="", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>dose-number</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>number</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.doseNumber</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="dose-number", path="ImmunizationRecommendation.recommendation.doseNumber", description="", type="number"  )
	public static final String SP_DOSE_NUMBER = "dose-number";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>dose-number</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>number</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.doseNumber</b><br>
	 * </p>
	 */
	public static final NumberClientParam DOSE_NUMBER = new NumberClientParam(SP_DOSE_NUMBER);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.forecastStatus</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="ImmunizationRecommendation.recommendation.forecastStatus", description="", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.forecastStatus</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>dose-sequence</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>number</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.protocol.doseSequence</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="dose-sequence", path="ImmunizationRecommendation.recommendation.protocol.doseSequence", description="", type="number"  )
	public static final String SP_DOSE_SEQUENCE = "dose-sequence";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>dose-sequence</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>number</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.protocol.doseSequence</b><br>
	 * </p>
	 */
	public static final NumberClientParam DOSE_SEQUENCE = new NumberClientParam(SP_DOSE_SEQUENCE);

	/**
	 * Search parameter constant for <b>support</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.supportingImmunization</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="support", path="ImmunizationRecommendation.recommendation.supportingImmunization", description="", type="reference"  )
	public static final String SP_SUPPORT = "support";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>support</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.supportingImmunization</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUPPORT = new ReferenceClientParam(SP_SUPPORT);

	/**
	 * Search parameter constant for <b>information</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.supportingPatientInformation</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="information", path="ImmunizationRecommendation.recommendation.supportingPatientInformation", description="", type="reference"  )
	public static final String SP_INFORMATION = "information";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>information</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImmunizationRecommendation.recommendation.supportingPatientInformation</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam INFORMATION = new ReferenceClientParam(SP_INFORMATION);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImmunizationRecommendation.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="ImmunizationRecommendation.patient", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImmunizationRecommendation.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ImmunizationRecommendation:information</b>".
	 */
	public static final Include INCLUDE_INFORMATION = new Include("ImmunizationRecommendation:information");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ImmunizationRecommendation:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("ImmunizationRecommendation:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ImmunizationRecommendation:support</b>".
	 */
	public static final Include INCLUDE_SUPPORT = new Include("ImmunizationRecommendation:support");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="A unique identifier assigned to this particular recommendation record."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="patient", order=1, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The patient for whom the recommendations are for."
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="recommendation", order=2, min=1, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Vaccine administration recommendations"
	)
	private java.util.List<Recommendation> myRecommendation;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myPatient,  myRecommendation);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myPatient, myRecommendation);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A unique identifier assigned to this particular recommendation record.
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
     * A unique identifier assigned to this particular recommendation record.
     * </p> 
	 */
	public ImmunizationRecommendation setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * A unique identifier assigned to this particular recommendation record.
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
	 * A unique identifier assigned to this particular recommendation record.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public ImmunizationRecommendation addIdentifier(IdentifierDt theValue) {
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
     * A unique identifier assigned to this particular recommendation record.
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>patient</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The patient for whom the recommendations are for.
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
     * The patient for whom the recommendations are for.
     * </p> 
	 */
	public ImmunizationRecommendation setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>recommendation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine administration recommendations
     * </p> 
	 */
	public java.util.List<Recommendation> getRecommendation() {  
		if (myRecommendation == null) {
			myRecommendation = new java.util.ArrayList<Recommendation>();
		}
		return myRecommendation;
	}

	/**
	 * Sets the value(s) for <b>recommendation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine administration recommendations
     * </p> 
	 */
	public ImmunizationRecommendation setRecommendation(java.util.List<Recommendation> theValue) {
		myRecommendation = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>recommendation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine administration recommendations
     * </p> 
	 */
	public Recommendation addRecommendation() {
		Recommendation newType = new Recommendation();
		getRecommendation().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>recommendation</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Vaccine administration recommendations
	 * </p>
	 * @param theValue The recommendation to add (must not be <code>null</code>)
	 */
	public ImmunizationRecommendation addRecommendation(Recommendation theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRecommendation().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>recommendation</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine administration recommendations
     * </p> 
	 */
	public Recommendation getRecommendationFirstRep() {
		if (getRecommendation().isEmpty()) {
			return addRecommendation();
		}
		return getRecommendation().get(0); 
	}
  
	/**
	 * Block class for child element: <b>ImmunizationRecommendation.recommendation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine administration recommendations
     * </p> 
	 */
	@Block()	
	public static class Recommendation 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="date", type=DateTimeDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date the immunization recommendation was created."
	)
	private DateTimeDt myDate;
	
	@Child(name="vaccineCode", type=CodeableConceptDt.class, order=1, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Vaccine that pertains to the recommendation"
	)
	private CodeableConceptDt myVaccineCode;
	
	@Child(name="doseNumber", type=PositiveIntDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose)."
	)
	private PositiveIntDt myDoseNumber;
	
	@Child(name="forecastStatus", type=CodeableConceptDt.class, order=3, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Vaccine administration status"
	)
	private CodeableConceptDt myForecastStatus;
	
	@Child(name="dateCriterion", order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc."
	)
	private java.util.List<RecommendationDateCriterion> myDateCriterion;
	
	@Child(name="protocol", order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contains information about the protocol under which the vaccine was administered"
	)
	private RecommendationProtocol myProtocol;
	
	@Child(name="supportingImmunization", order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Immunization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Immunization event history that supports the status and recommendation"
	)
	private java.util.List<ResourceReferenceDt> mySupportingImmunization;
	
	@Child(name="supportingPatientInformation", order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Observation.class, 		ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information."
	)
	private java.util.List<ResourceReferenceDt> mySupportingPatientInformation;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myDate,  myVaccineCode,  myDoseNumber,  myForecastStatus,  myDateCriterion,  myProtocol,  mySupportingImmunization,  mySupportingPatientInformation);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myDate, myVaccineCode, myDoseNumber, myForecastStatus, myDateCriterion, myProtocol, mySupportingImmunization, mySupportingPatientInformation);
	}

	/**
	 * Gets the value(s) for <b>date</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date the immunization recommendation was created.
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
     * The date the immunization recommendation was created.
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
     * The date the immunization recommendation was created.
     * </p> 
	 */
	public Recommendation setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date the immunization recommendation was created.
     * </p> 
	 */
	public Recommendation setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date the immunization recommendation was created.
     * </p> 
	 */
	public Recommendation setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>vaccineCode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine that pertains to the recommendation
     * </p> 
	 */
	public CodeableConceptDt getVaccineCode() {  
		if (myVaccineCode == null) {
			myVaccineCode = new CodeableConceptDt();
		}
		return myVaccineCode;
	}

	/**
	 * Sets the value(s) for <b>vaccineCode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine that pertains to the recommendation
     * </p> 
	 */
	public Recommendation setVaccineCode(CodeableConceptDt theValue) {
		myVaccineCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>doseNumber</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose).
     * </p> 
	 */
	public PositiveIntDt getDoseNumberElement() {  
		if (myDoseNumber == null) {
			myDoseNumber = new PositiveIntDt();
		}
		return myDoseNumber;
	}

	
	/**
	 * Gets the value(s) for <b>doseNumber</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose).
     * </p> 
	 */
	public Integer getDoseNumber() {  
		return getDoseNumberElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>doseNumber</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose).
     * </p> 
	 */
	public Recommendation setDoseNumber(PositiveIntDt theValue) {
		myDoseNumber = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>doseNumber</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This indicates the next recommended dose number (e.g. dose 2 is the next recommended dose).
     * </p> 
	 */
	public Recommendation setDoseNumber( int theInteger) {
		myDoseNumber = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>forecastStatus</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine administration status
     * </p> 
	 */
	public CodeableConceptDt getForecastStatus() {  
		if (myForecastStatus == null) {
			myForecastStatus = new CodeableConceptDt();
		}
		return myForecastStatus;
	}

	/**
	 * Sets the value(s) for <b>forecastStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine administration status
     * </p> 
	 */
	public Recommendation setForecastStatus(CodeableConceptDt theValue) {
		myForecastStatus = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dateCriterion</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
     * </p> 
	 */
	public java.util.List<RecommendationDateCriterion> getDateCriterion() {  
		if (myDateCriterion == null) {
			myDateCriterion = new java.util.ArrayList<RecommendationDateCriterion>();
		}
		return myDateCriterion;
	}

	/**
	 * Sets the value(s) for <b>dateCriterion</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
     * </p> 
	 */
	public Recommendation setDateCriterion(java.util.List<RecommendationDateCriterion> theValue) {
		myDateCriterion = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>dateCriterion</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
     * </p> 
	 */
	public RecommendationDateCriterion addDateCriterion() {
		RecommendationDateCriterion newType = new RecommendationDateCriterion();
		getDateCriterion().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>dateCriterion</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
	 * </p>
	 * @param theValue The dateCriterion to add (must not be <code>null</code>)
	 */
	public Recommendation addDateCriterion(RecommendationDateCriterion theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDateCriterion().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>dateCriterion</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
     * </p> 
	 */
	public RecommendationDateCriterion getDateCriterionFirstRep() {
		if (getDateCriterion().isEmpty()) {
			return addDateCriterion();
		}
		return getDateCriterion().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>protocol</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contains information about the protocol under which the vaccine was administered
     * </p> 
	 */
	public RecommendationProtocol getProtocol() {  
		if (myProtocol == null) {
			myProtocol = new RecommendationProtocol();
		}
		return myProtocol;
	}

	/**
	 * Sets the value(s) for <b>protocol</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contains information about the protocol under which the vaccine was administered
     * </p> 
	 */
	public Recommendation setProtocol(RecommendationProtocol theValue) {
		myProtocol = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>supportingImmunization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Immunization event history that supports the status and recommendation
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getSupportingImmunization() {  
		if (mySupportingImmunization == null) {
			mySupportingImmunization = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return mySupportingImmunization;
	}

	/**
	 * Sets the value(s) for <b>supportingImmunization</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Immunization event history that supports the status and recommendation
     * </p> 
	 */
	public Recommendation setSupportingImmunization(java.util.List<ResourceReferenceDt> theValue) {
		mySupportingImmunization = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>supportingImmunization</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Immunization event history that supports the status and recommendation
     * </p> 
	 */
	public ResourceReferenceDt addSupportingImmunization() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getSupportingImmunization().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>supportingPatientInformation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getSupportingPatientInformation() {  
		if (mySupportingPatientInformation == null) {
			mySupportingPatientInformation = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return mySupportingPatientInformation;
	}

	/**
	 * Sets the value(s) for <b>supportingPatientInformation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
     * </p> 
	 */
	public Recommendation setSupportingPatientInformation(java.util.List<ResourceReferenceDt> theValue) {
		mySupportingPatientInformation = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>supportingPatientInformation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Patient Information that supports the status and recommendation.  This includes patient observations, adverse reactions and allergy/intolerance information.
     * </p> 
	 */
	public ResourceReferenceDt addSupportingPatientInformation() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getSupportingPatientInformation().add(newType);
		return newType; 
	}
  


	}

	/**
	 * Block class for child element: <b>ImmunizationRecommendation.recommendation.dateCriterion</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Vaccine date recommendations.  For example, earliest date to administer, latest date to administer, etc.
     * </p> 
	 */
	@Block()	
	public static class RecommendationDateCriterion 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Date classification of recommendation.  For example, earliest date to give, latest date to give, etc."
	)
	private CodeableConceptDt myCode;
	
	@Child(name="value", type=DateTimeDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date whose meaning is specified by dateCriterion.code"
	)
	private DateTimeDt myValue;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myValue);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myValue);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.
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
     * Date classification of recommendation.  For example, earliest date to give, latest date to give, etc.
     * </p> 
	 */
	public RecommendationDateCriterion setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date whose meaning is specified by dateCriterion.code
     * </p> 
	 */
	public DateTimeDt getValueElement() {  
		if (myValue == null) {
			myValue = new DateTimeDt();
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
     * The date whose meaning is specified by dateCriterion.code
     * </p> 
	 */
	public Date getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date whose meaning is specified by dateCriterion.code
     * </p> 
	 */
	public RecommendationDateCriterion setValue(DateTimeDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date whose meaning is specified by dateCriterion.code
     * </p> 
	 */
	public RecommendationDateCriterion setValue( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myValue = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date whose meaning is specified by dateCriterion.code
     * </p> 
	 */
	public RecommendationDateCriterion setValueWithSecondsPrecision( Date theDate) {
		myValue = new DateTimeDt(theDate); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>ImmunizationRecommendation.recommendation.protocol</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contains information about the protocol under which the vaccine was administered
     * </p> 
	 */
	@Block()	
	public static class RecommendationProtocol 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="doseSequence", type=IntegerDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol."
	)
	private IntegerDt myDoseSequence;
	
	@Child(name="description", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contains the description about the protocol under which the vaccine was administered"
	)
	private StringDt myDescription;
	
	@Child(name="authority", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the authority who published the protocol.  For example, ACIP"
	)
	private ResourceReferenceDt myAuthority;
	
	@Child(name="series", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="One possible path to achieve presumed immunity against a disease - within the context of an authority"
	)
	private StringDt mySeries;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myDoseSequence,  myDescription,  myAuthority,  mySeries);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myDoseSequence, myDescription, myAuthority, mySeries);
	}

	/**
	 * Gets the value(s) for <b>doseSequence</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.
     * </p> 
	 */
	public IntegerDt getDoseSequenceElement() {  
		if (myDoseSequence == null) {
			myDoseSequence = new IntegerDt();
		}
		return myDoseSequence;
	}

	
	/**
	 * Gets the value(s) for <b>doseSequence</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.
     * </p> 
	 */
	public Integer getDoseSequence() {  
		return getDoseSequenceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>doseSequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.
     * </p> 
	 */
	public RecommendationProtocol setDoseSequence(IntegerDt theValue) {
		myDoseSequence = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>doseSequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the nominal position in a series of the next dose.  This is the recommended dose number as per a specified protocol.
     * </p> 
	 */
	public RecommendationProtocol setDoseSequence( int theInteger) {
		myDoseSequence = new IntegerDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contains the description about the protocol under which the vaccine was administered
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
     * Contains the description about the protocol under which the vaccine was administered
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
     * Contains the description about the protocol under which the vaccine was administered
     * </p> 
	 */
	public RecommendationProtocol setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contains the description about the protocol under which the vaccine was administered
     * </p> 
	 */
	public RecommendationProtocol setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>authority</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the authority who published the protocol.  For example, ACIP
     * </p> 
	 */
	public ResourceReferenceDt getAuthority() {  
		if (myAuthority == null) {
			myAuthority = new ResourceReferenceDt();
		}
		return myAuthority;
	}

	/**
	 * Sets the value(s) for <b>authority</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the authority who published the protocol.  For example, ACIP
     * </p> 
	 */
	public RecommendationProtocol setAuthority(ResourceReferenceDt theValue) {
		myAuthority = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>series</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * One possible path to achieve presumed immunity against a disease - within the context of an authority
     * </p> 
	 */
	public StringDt getSeriesElement() {  
		if (mySeries == null) {
			mySeries = new StringDt();
		}
		return mySeries;
	}

	
	/**
	 * Gets the value(s) for <b>series</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * One possible path to achieve presumed immunity against a disease - within the context of an authority
     * </p> 
	 */
	public String getSeries() {  
		return getSeriesElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>series</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One possible path to achieve presumed immunity against a disease - within the context of an authority
     * </p> 
	 */
	public RecommendationProtocol setSeries(StringDt theValue) {
		mySeries = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>series</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One possible path to achieve presumed immunity against a disease - within the context of an authority
     * </p> 
	 */
	public RecommendationProtocol setSeries( String theString) {
		mySeries = new StringDt(theString); 
		return this; 
	}

 


	}





    @Override
    public String getResourceName() {
        return "ImmunizationRecommendation";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
