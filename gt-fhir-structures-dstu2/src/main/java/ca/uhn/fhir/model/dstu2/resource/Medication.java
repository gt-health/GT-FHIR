















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
 * HAPI/FHIR <b>Medication</b> Resource
 * (clinical.medication)
 *
 * <p>
 * <b>Definition:</b>
 * This resource is primarily used for the identification and definition of a medication. It covers the ingredients and the packaging for a medication.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Medication">http://hl7.org/fhir/profiles/Medication</a> 
 * </p>
 *
 */
@ResourceDef(name="Medication", profile="http://hl7.org/fhir/profiles/Medication", id="medication")
public class Medication extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Medication.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="Medication.code", description="", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Medication.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>manufacturer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Medication.manufacturer</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="manufacturer", path="Medication.manufacturer", description="", type="reference"  )
	public static final String SP_MANUFACTURER = "manufacturer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>manufacturer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Medication.manufacturer</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam MANUFACTURER = new ReferenceClientParam(SP_MANUFACTURER);

	/**
	 * Search parameter constant for <b>form</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Medication.product.form</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="form", path="Medication.product.form", description="", type="token"  )
	public static final String SP_FORM = "form";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>form</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Medication.product.form</b><br>
	 * </p>
	 */
	public static final TokenClientParam FORM = new TokenClientParam(SP_FORM);

	/**
	 * Search parameter constant for <b>ingredient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Medication.product.ingredient.item</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="ingredient", path="Medication.product.ingredient.item", description="", type="reference"  )
	public static final String SP_INGREDIENT = "ingredient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>ingredient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Medication.product.ingredient.item</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam INGREDIENT = new ReferenceClientParam(SP_INGREDIENT);

	/**
	 * Search parameter constant for <b>container</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Medication.package.container</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="container", path="Medication.package.container", description="", type="token"  )
	public static final String SP_CONTAINER = "container";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>container</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Medication.package.container</b><br>
	 * </p>
	 */
	public static final TokenClientParam CONTAINER = new TokenClientParam(SP_CONTAINER);

	/**
	 * Search parameter constant for <b>content</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Medication.package.content.item</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="content", path="Medication.package.content.item", description="", type="reference"  )
	public static final String SP_CONTENT = "content";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>content</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Medication.package.content.item</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam CONTENT = new ReferenceClientParam(SP_CONTENT);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Medication:content</b>".
	 */
	public static final Include INCLUDE_CONTENT = new Include("Medication:content");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Medication:ingredient</b>".
	 */
	public static final Include INCLUDE_INGREDIENT = new Include("Medication:ingredient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Medication:manufacturer</b>".
	 */
	public static final Include INCLUDE_MANUFACTURER = new Include("Medication:manufacturer");


	@Child(name="code", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems."
	)
	private CodeableConceptDt myCode;
	
	@Child(name="isBrand", type=BooleanDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="Set to true if the item is attributable to a specific manufacturer."
	)
	private BooleanDt myIsBrand;
	
	@Child(name="manufacturer", order=2, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="Describes the details of the manufacturer"
	)
	private ResourceReferenceDt myManufacturer;
	
	@Child(name="product", order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Information that only applies to products (not packages)"
	)
	private Product myProduct;
	
	@Child(name="package", order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Information that only applies to packages (not products)"
	)
	private Package myPackage;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myIsBrand,  myManufacturer,  myProduct,  myPackage);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myIsBrand, myManufacturer, myProduct, myPackage);
	}

	/**
	 * Gets the value(s) for <b>code</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.
     * </p> 
	 */
	public CodeableConceptDt getCode() {  
		if (myCode == null) {
			myCode = new CodeableConceptDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * A code (or set of codes) that specify this medication, or a textual description if no code is available. Usage note: This could be a standard medication code such as a code from RxNorm, SNOMED CT, IDMP etc. It could also be a national or local formulary code, optionally with translations to other code systems.
     * </p> 
	 */
	public Medication setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>isBrand</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Set to true if the item is attributable to a specific manufacturer.
     * </p> 
	 */
	public BooleanDt getIsBrandElement() {  
		if (myIsBrand == null) {
			myIsBrand = new BooleanDt();
		}
		return myIsBrand;
	}

	
	/**
	 * Gets the value(s) for <b>isBrand</b> (class).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Set to true if the item is attributable to a specific manufacturer.
     * </p> 
	 */
	public Boolean getIsBrand() {  
		return getIsBrandElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>isBrand</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Set to true if the item is attributable to a specific manufacturer.
     * </p> 
	 */
	public Medication setIsBrand(BooleanDt theValue) {
		myIsBrand = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>isBrand</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Set to true if the item is attributable to a specific manufacturer.
     * </p> 
	 */
	public Medication setIsBrand( boolean theBoolean) {
		myIsBrand = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>manufacturer</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the details of the manufacturer
     * </p> 
	 */
	public ResourceReferenceDt getManufacturer() {  
		if (myManufacturer == null) {
			myManufacturer = new ResourceReferenceDt();
		}
		return myManufacturer;
	}

	/**
	 * Sets the value(s) for <b>manufacturer</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the details of the manufacturer
     * </p> 
	 */
	public Medication setManufacturer(ResourceReferenceDt theValue) {
		myManufacturer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>product</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Information that only applies to products (not packages)
     * </p> 
	 */
	public Product getProduct() {  
		if (myProduct == null) {
			myProduct = new Product();
		}
		return myProduct;
	}

	/**
	 * Sets the value(s) for <b>product</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information that only applies to products (not packages)
     * </p> 
	 */
	public Medication setProduct(Product theValue) {
		myProduct = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>package</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Information that only applies to packages (not products)
     * </p> 
	 */
	public Package getPackage() {  
		if (myPackage == null) {
			myPackage = new Package();
		}
		return myPackage;
	}

	/**
	 * Sets the value(s) for <b>package</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information that only applies to packages (not products)
     * </p> 
	 */
	public Medication setPackage(Package theValue) {
		myPackage = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>Medication.product</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information that only applies to products (not packages)
     * </p> 
	 */
	@Block()	
	public static class Product 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="form", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the form of the item.  Powder; tablets; carton"
	)
	private CodeableConceptDt myForm;
	
	@Child(name="ingredient", order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies a particular constituent of interest in the product"
	)
	private java.util.List<ProductIngredient> myIngredient;
	
	@Child(name="batch", order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Information about a group of medication produced or packaged from one production run."
	)
	private java.util.List<ProductBatch> myBatch;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myForm,  myIngredient,  myBatch);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myForm, myIngredient, myBatch);
	}

	/**
	 * Gets the value(s) for <b>form</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the form of the item.  Powder; tablets; carton
     * </p> 
	 */
	public CodeableConceptDt getForm() {  
		if (myForm == null) {
			myForm = new CodeableConceptDt();
		}
		return myForm;
	}

	/**
	 * Sets the value(s) for <b>form</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the form of the item.  Powder; tablets; carton
     * </p> 
	 */
	public Product setForm(CodeableConceptDt theValue) {
		myForm = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>ingredient</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a particular constituent of interest in the product
     * </p> 
	 */
	public java.util.List<ProductIngredient> getIngredient() {  
		if (myIngredient == null) {
			myIngredient = new java.util.ArrayList<ProductIngredient>();
		}
		return myIngredient;
	}

	/**
	 * Sets the value(s) for <b>ingredient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a particular constituent of interest in the product
     * </p> 
	 */
	public Product setIngredient(java.util.List<ProductIngredient> theValue) {
		myIngredient = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>ingredient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a particular constituent of interest in the product
     * </p> 
	 */
	public ProductIngredient addIngredient() {
		ProductIngredient newType = new ProductIngredient();
		getIngredient().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>ingredient</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identifies a particular constituent of interest in the product
	 * </p>
	 * @param theValue The ingredient to add (must not be <code>null</code>)
	 */
	public Product addIngredient(ProductIngredient theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getIngredient().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>ingredient</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a particular constituent of interest in the product
     * </p> 
	 */
	public ProductIngredient getIngredientFirstRep() {
		if (getIngredient().isEmpty()) {
			return addIngredient();
		}
		return getIngredient().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>batch</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Information about a group of medication produced or packaged from one production run.
     * </p> 
	 */
	public java.util.List<ProductBatch> getBatch() {  
		if (myBatch == null) {
			myBatch = new java.util.ArrayList<ProductBatch>();
		}
		return myBatch;
	}

	/**
	 * Sets the value(s) for <b>batch</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about a group of medication produced or packaged from one production run.
     * </p> 
	 */
	public Product setBatch(java.util.List<ProductBatch> theValue) {
		myBatch = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>batch</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about a group of medication produced or packaged from one production run.
     * </p> 
	 */
	public ProductBatch addBatch() {
		ProductBatch newType = new ProductBatch();
		getBatch().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>batch</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Information about a group of medication produced or packaged from one production run.
	 * </p>
	 * @param theValue The batch to add (must not be <code>null</code>)
	 */
	public Product addBatch(ProductBatch theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getBatch().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>batch</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Information about a group of medication produced or packaged from one production run.
     * </p> 
	 */
	public ProductBatch getBatchFirstRep() {
		if (getBatch().isEmpty()) {
			return addBatch();
		}
		return getBatch().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>Medication.product.ingredient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies a particular constituent of interest in the product
     * </p> 
	 */
	@Block()	
	public static class ProductIngredient 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="item", order=0, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Substance.class, 		ca.uhn.fhir.model.dstu2.resource.Medication.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The actual ingredient - either a substance (simple ingredient) or another medication"
	)
	private ResourceReferenceDt myItem;
	
	@Child(name="amount", type=RatioDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet"
	)
	private RatioDt myAmount;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myItem,  myAmount);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myItem, myAmount);
	}

	/**
	 * Gets the value(s) for <b>item</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual ingredient - either a substance (simple ingredient) or another medication
     * </p> 
	 */
	public ResourceReferenceDt getItem() {  
		if (myItem == null) {
			myItem = new ResourceReferenceDt();
		}
		return myItem;
	}

	/**
	 * Sets the value(s) for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual ingredient - either a substance (simple ingredient) or another medication
     * </p> 
	 */
	public ProductIngredient setItem(ResourceReferenceDt theValue) {
		myItem = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>amount</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet
     * </p> 
	 */
	public RatioDt getAmount() {  
		if (myAmount == null) {
			myAmount = new RatioDt();
		}
		return myAmount;
	}

	/**
	 * Sets the value(s) for <b>amount</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies how many (or how much) of the items there are in this Medication.  For example, 250 mg per tablet
     * </p> 
	 */
	public ProductIngredient setAmount(RatioDt theValue) {
		myAmount = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Medication.product.batch</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information about a group of medication produced or packaged from one production run.
     * </p> 
	 */
	@Block()	
	public static class ProductBatch 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="lotNumber", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The assigned lot number of a batch of the specified product."
	)
	private StringDt myLotNumber;
	
	@Child(name="expirationDate", type=DateTimeDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="When this specific batch of product will expire."
	)
	private DateTimeDt myExpirationDate;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLotNumber,  myExpirationDate);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLotNumber, myExpirationDate);
	}

	/**
	 * Gets the value(s) for <b>lotNumber</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The assigned lot number of a batch of the specified product.
     * </p> 
	 */
	public StringDt getLotNumberElement() {  
		if (myLotNumber == null) {
			myLotNumber = new StringDt();
		}
		return myLotNumber;
	}

	
	/**
	 * Gets the value(s) for <b>lotNumber</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The assigned lot number of a batch of the specified product.
     * </p> 
	 */
	public String getLotNumber() {  
		return getLotNumberElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>lotNumber</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The assigned lot number of a batch of the specified product.
     * </p> 
	 */
	public ProductBatch setLotNumber(StringDt theValue) {
		myLotNumber = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>lotNumber</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The assigned lot number of a batch of the specified product.
     * </p> 
	 */
	public ProductBatch setLotNumber( String theString) {
		myLotNumber = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>expirationDate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When this specific batch of product will expire.
     * </p> 
	 */
	public DateTimeDt getExpirationDateElement() {  
		if (myExpirationDate == null) {
			myExpirationDate = new DateTimeDt();
		}
		return myExpirationDate;
	}

	
	/**
	 * Gets the value(s) for <b>expirationDate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When this specific batch of product will expire.
     * </p> 
	 */
	public Date getExpirationDate() {  
		return getExpirationDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>expirationDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When this specific batch of product will expire.
     * </p> 
	 */
	public ProductBatch setExpirationDate(DateTimeDt theValue) {
		myExpirationDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>expirationDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When this specific batch of product will expire.
     * </p> 
	 */
	public ProductBatch setExpirationDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myExpirationDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>expirationDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When this specific batch of product will expire.
     * </p> 
	 */
	public ProductBatch setExpirationDateWithSecondsPrecision( Date theDate) {
		myExpirationDate = new DateTimeDt(theDate); 
		return this; 
	}

 


	}



	/**
	 * Block class for child element: <b>Medication.package</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Information that only applies to packages (not products)
     * </p> 
	 */
	@Block()	
	public static class Package 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="container", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The kind of container that this package comes as"
	)
	private CodeableConceptDt myContainer;
	
	@Child(name="content", order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A set of components that go to make up the described item."
	)
	private java.util.List<PackageContent> myContent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myContainer,  myContent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myContainer, myContent);
	}

	/**
	 * Gets the value(s) for <b>container</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of container that this package comes as
     * </p> 
	 */
	public CodeableConceptDt getContainer() {  
		if (myContainer == null) {
			myContainer = new CodeableConceptDt();
		}
		return myContainer;
	}

	/**
	 * Sets the value(s) for <b>container</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of container that this package comes as
     * </p> 
	 */
	public Package setContainer(CodeableConceptDt theValue) {
		myContainer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>content</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of components that go to make up the described item.
     * </p> 
	 */
	public java.util.List<PackageContent> getContent() {  
		if (myContent == null) {
			myContent = new java.util.ArrayList<PackageContent>();
		}
		return myContent;
	}

	/**
	 * Sets the value(s) for <b>content</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of components that go to make up the described item.
     * </p> 
	 */
	public Package setContent(java.util.List<PackageContent> theValue) {
		myContent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>content</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of components that go to make up the described item.
     * </p> 
	 */
	public PackageContent addContent() {
		PackageContent newType = new PackageContent();
		getContent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>content</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A set of components that go to make up the described item.
	 * </p>
	 * @param theValue The content to add (must not be <code>null</code>)
	 */
	public Package addContent(PackageContent theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getContent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>content</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A set of components that go to make up the described item.
     * </p> 
	 */
	public PackageContent getContentFirstRep() {
		if (getContent().isEmpty()) {
			return addContent();
		}
		return getContent().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>Medication.package.content</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A set of components that go to make up the described item.
     * </p> 
	 */
	@Block()	
	public static class PackageContent 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="item", order=0, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Medication.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies one of the items in the package"
	)
	private ResourceReferenceDt myItem;
	
	@Child(name="amount", type=SimpleQuantityDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The amount of the product that is in the package"
	)
	private SimpleQuantityDt myAmount;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myItem,  myAmount);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myItem, myAmount);
	}

	/**
	 * Gets the value(s) for <b>item</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies one of the items in the package
     * </p> 
	 */
	public ResourceReferenceDt getItem() {  
		if (myItem == null) {
			myItem = new ResourceReferenceDt();
		}
		return myItem;
	}

	/**
	 * Sets the value(s) for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies one of the items in the package
     * </p> 
	 */
	public PackageContent setItem(ResourceReferenceDt theValue) {
		myItem = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>amount</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of the product that is in the package
     * </p> 
	 */
	public SimpleQuantityDt getAmount() {  
		if (myAmount == null) {
			myAmount = new SimpleQuantityDt();
		}
		return myAmount;
	}

	/**
	 * Sets the value(s) for <b>amount</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of the product that is in the package
     * </p> 
	 */
	public PackageContent setAmount(SimpleQuantityDt theValue) {
		myAmount = theValue;
		return this;
	}
	
	

  


	}





    @Override
    public String getResourceName() {
        return "Medication";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
