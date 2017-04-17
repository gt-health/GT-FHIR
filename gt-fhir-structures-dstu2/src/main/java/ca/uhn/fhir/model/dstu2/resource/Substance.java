















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
 * HAPI/FHIR <b>Substance</b> Resource
 * (administrative.entity)
 *
 * <p>
 * <b>Definition:</b>
 * A homogeneous material with a definite composition.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Substance">http://hl7.org/fhir/profiles/Substance</a> 
 * </p>
 *
 */
@ResourceDef(name="Substance", profile="http://hl7.org/fhir/profiles/Substance", id="substance")
public class Substance extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>The code of the substance</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Substance.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="Substance.code", description="The code of the substance", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>The code of the substance</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Substance.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b>The category of the substance</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Substance.category</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="category", path="Substance.category", description="The category of the substance", type="token"  )
	public static final String SP_CATEGORY = "category";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b>The category of the substance</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Substance.category</b><br>
	 * </p>
	 */
	public static final TokenClientParam CATEGORY = new TokenClientParam(SP_CATEGORY);

	/**
	 * Search parameter constant for <b>container-identifier</b>
	 * <p>
	 * Description: <b>Identifier of the package/container</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Substance.instance.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="container-identifier", path="Substance.instance.identifier", description="Identifier of the package/container", type="token"  )
	public static final String SP_CONTAINER_IDENTIFIER = "container-identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>container-identifier</b>
	 * <p>
	 * Description: <b>Identifier of the package/container</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Substance.instance.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam CONTAINER_IDENTIFIER = new TokenClientParam(SP_CONTAINER_IDENTIFIER);

	/**
	 * Search parameter constant for <b>expiry</b>
	 * <p>
	 * Description: <b>Expiry date of package or container of substance</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Substance.instance.expiry</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="expiry", path="Substance.instance.expiry", description="Expiry date of package or container of substance", type="date"  )
	public static final String SP_EXPIRY = "expiry";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>expiry</b>
	 * <p>
	 * Description: <b>Expiry date of package or container of substance</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Substance.instance.expiry</b><br>
	 * </p>
	 */
	public static final DateClientParam EXPIRY = new DateClientParam(SP_EXPIRY);

	/**
	 * Search parameter constant for <b>quantity</b>
	 * <p>
	 * Description: <b>Amount of substance in the package</b><br>
	 * Type: <b>quantity</b><br>
	 * Path: <b>Substance.instance.quantity</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="quantity", path="Substance.instance.quantity", description="Amount of substance in the package", type="quantity"  )
	public static final String SP_QUANTITY = "quantity";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>quantity</b>
	 * <p>
	 * Description: <b>Amount of substance in the package</b><br>
	 * Type: <b>quantity</b><br>
	 * Path: <b>Substance.instance.quantity</b><br>
	 * </p>
	 */
	public static final QuantityClientParam QUANTITY = new QuantityClientParam(SP_QUANTITY);

	/**
	 * Search parameter constant for <b>substance</b>
	 * <p>
	 * Description: <b>A component of the substance</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Substance.ingredient.substance</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="substance", path="Substance.ingredient.substance", description="A component of the substance", type="reference"  )
	public static final String SP_SUBSTANCE = "substance";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>substance</b>
	 * <p>
	 * Description: <b>A component of the substance</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Substance.ingredient.substance</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBSTANCE = new ReferenceClientParam(SP_SUBSTANCE);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Unique identifier for the substance</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Substance.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Substance.identifier", description="Unique identifier for the substance", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Unique identifier for the substance</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Substance.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Substance:substance</b>".
	 */
	public static final Include INCLUDE_SUBSTANCE = new Include("Substance:substance");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Unique identifier for the substance"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="category", type=CodeableConceptDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-substance-category")
	private java.util.List<BoundCodeableConceptDt<SubstanceCategoryCodesEnum>> myCategory;
	
	@Child(name="code", type=CodeableConceptDt.class, order=2, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="what",
		formalDefinition="A code (or set of codes) that identify this substance"
	)
	private CodeableConceptDt myCode;
	
	@Child(name="description", type=StringDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A description of the substance - its appearance, handling requirements, and other usage notes"
	)
	private StringDt myDescription;
	
	@Child(name="instance", order=4, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance"
	)
	private java.util.List<Instance> myInstance;
	
	@Child(name="ingredient", order=5, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A substance can be composed of other substances"
	)
	private java.util.List<Ingredient> myIngredient;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myCategory,  myCode,  myDescription,  myInstance,  myIngredient);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myCategory, myCode, myDescription, myInstance, myIngredient);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Unique identifier for the substance
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
     * Unique identifier for the substance
     * </p> 
	 */
	public Substance setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Unique identifier for the substance
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
	 * Unique identifier for the substance
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Substance addIdentifier(IdentifierDt theValue) {
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
     * Unique identifier for the substance
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>category</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
     * </p> 
	 */
	public java.util.List<BoundCodeableConceptDt<SubstanceCategoryCodesEnum>> getCategory() {  
		if (myCategory == null) {
			myCategory = new java.util.ArrayList<BoundCodeableConceptDt<SubstanceCategoryCodesEnum>>();
		}
		return myCategory;
	}

	/**
	 * Sets the value(s) for <b>category</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
     * </p> 
	 */
	public Substance setCategory(java.util.List<BoundCodeableConceptDt<SubstanceCategoryCodesEnum>> theValue) {
		myCategory = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>category</b> (class) using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addCategory()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
     * </p> 
	 */
	public BoundCodeableConceptDt<SubstanceCategoryCodesEnum> addCategory(SubstanceCategoryCodesEnum theValue) {
		BoundCodeableConceptDt<SubstanceCategoryCodesEnum> retVal = new BoundCodeableConceptDt<SubstanceCategoryCodesEnum>(SubstanceCategoryCodesEnum.VALUESET_BINDER, theValue);
		getCategory().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>category</b> (class),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
     * </p> 
	 */
	public BoundCodeableConceptDt<SubstanceCategoryCodesEnum> getCategoryFirstRep() {
		if (getCategory().size() == 0) {
			addCategory();
		}
		return getCategory().get(0);
	}

	/**
	 * Add a value for <b>category</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
     * </p> 
	 */
	public BoundCodeableConceptDt<SubstanceCategoryCodesEnum> addCategory() {
		BoundCodeableConceptDt<SubstanceCategoryCodesEnum> retVal = new BoundCodeableConceptDt<SubstanceCategoryCodesEnum>(SubstanceCategoryCodesEnum.VALUESET_BINDER);
		getCategory().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>category</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * A code that classifies the general type of substance.  This is used  for searching, sorting and display purposes.
     * </p> 
	 */
	public Substance setCategory(SubstanceCategoryCodesEnum theValue) {
		getCategory().clear();
		addCategory(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>code</b> (what).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code (or set of codes) that identify this substance
     * </p> 
	 */
	public CodeableConceptDt getCode() {  
		if (myCode == null) {
			myCode = new CodeableConceptDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * A code (or set of codes) that identify this substance
     * </p> 
	 */
	public Substance setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the substance - its appearance, handling requirements, and other usage notes
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
     * A description of the substance - its appearance, handling requirements, and other usage notes
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
     * A description of the substance - its appearance, handling requirements, and other usage notes
     * </p> 
	 */
	public Substance setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the substance - its appearance, handling requirements, and other usage notes
     * </p> 
	 */
	public Substance setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>instance</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance
     * </p> 
	 */
	public java.util.List<Instance> getInstance() {  
		if (myInstance == null) {
			myInstance = new java.util.ArrayList<Instance>();
		}
		return myInstance;
	}

	/**
	 * Sets the value(s) for <b>instance</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance
     * </p> 
	 */
	public Substance setInstance(java.util.List<Instance> theValue) {
		myInstance = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>instance</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance
     * </p> 
	 */
	public Instance addInstance() {
		Instance newType = new Instance();
		getInstance().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>instance</b> (class)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance
	 * </p>
	 * @param theValue The instance to add (must not be <code>null</code>)
	 */
	public Substance addInstance(Instance theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getInstance().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>instance</b> (class),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance
     * </p> 
	 */
	public Instance getInstanceFirstRep() {
		if (getInstance().isEmpty()) {
			return addInstance();
		}
		return getInstance().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>ingredient</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A substance can be composed of other substances
     * </p> 
	 */
	public java.util.List<Ingredient> getIngredient() {  
		if (myIngredient == null) {
			myIngredient = new java.util.ArrayList<Ingredient>();
		}
		return myIngredient;
	}

	/**
	 * Sets the value(s) for <b>ingredient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A substance can be composed of other substances
     * </p> 
	 */
	public Substance setIngredient(java.util.List<Ingredient> theValue) {
		myIngredient = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>ingredient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A substance can be composed of other substances
     * </p> 
	 */
	public Ingredient addIngredient() {
		Ingredient newType = new Ingredient();
		getIngredient().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>ingredient</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A substance can be composed of other substances
	 * </p>
	 * @param theValue The ingredient to add (must not be <code>null</code>)
	 */
	public Substance addIngredient(Ingredient theValue) {
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
     * A substance can be composed of other substances
     * </p> 
	 */
	public Ingredient getIngredientFirstRep() {
		if (getIngredient().isEmpty()) {
			return addIngredient();
		}
		return getIngredient().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Substance.instance</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Substance may be used to describe a kind of substance, or a specific package/container of the substance: an instance
     * </p> 
	 */
	@Block()	
	public static class Instance 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifier associated with the package/container (usually a label affixed directly)"
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="expiry", type=DateTimeDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry."
	)
	private DateTimeDt myExpiry;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The amount of the substance"
	)
	private SimpleQuantityDt myQuantity;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myExpiry,  myQuantity);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myExpiry, myQuantity);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier associated with the package/container (usually a label affixed directly)
     * </p> 
	 */
	public IdentifierDt getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new IdentifierDt();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier associated with the package/container (usually a label affixed directly)
     * </p> 
	 */
	public Instance setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>expiry</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
     * </p> 
	 */
	public DateTimeDt getExpiryElement() {  
		if (myExpiry == null) {
			myExpiry = new DateTimeDt();
		}
		return myExpiry;
	}

	
	/**
	 * Gets the value(s) for <b>expiry</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
     * </p> 
	 */
	public Date getExpiry() {  
		return getExpiryElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>expiry</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
     * </p> 
	 */
	public Instance setExpiry(DateTimeDt theValue) {
		myExpiry = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>expiry</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
     * </p> 
	 */
	public Instance setExpiry( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myExpiry = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>expiry</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When the substance is no longer valid to use. For some substances, a single arbitrary date is used for expiry.
     * </p> 
	 */
	public Instance setExpiryWithSecondsPrecision( Date theDate) {
		myExpiry = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of the substance
     * </p> 
	 */
	public SimpleQuantityDt getQuantity() {  
		if (myQuantity == null) {
			myQuantity = new SimpleQuantityDt();
		}
		return myQuantity;
	}

	/**
	 * Sets the value(s) for <b>quantity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of the substance
     * </p> 
	 */
	public Instance setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Substance.ingredient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A substance can be composed of other substances
     * </p> 
	 */
	@Block()	
	public static class Ingredient 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="quantity", type=RatioDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The amount of the ingredient in the substance - a concentration ratio"
	)
	private RatioDt myQuantity;
	
	@Child(name="substance", order=1, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Substance.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Another substance that is a component of this substance"
	)
	private ResourceReferenceDt mySubstance;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myQuantity,  mySubstance);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myQuantity, mySubstance);
	}

	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of the ingredient in the substance - a concentration ratio
     * </p> 
	 */
	public RatioDt getQuantity() {  
		if (myQuantity == null) {
			myQuantity = new RatioDt();
		}
		return myQuantity;
	}

	/**
	 * Sets the value(s) for <b>quantity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of the ingredient in the substance - a concentration ratio
     * </p> 
	 */
	public Ingredient setQuantity(RatioDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>substance</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Another substance that is a component of this substance
     * </p> 
	 */
	public ResourceReferenceDt getSubstance() {  
		if (mySubstance == null) {
			mySubstance = new ResourceReferenceDt();
		}
		return mySubstance;
	}

	/**
	 * Sets the value(s) for <b>substance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Another substance that is a component of this substance
     * </p> 
	 */
	public Ingredient setSubstance(ResourceReferenceDt theValue) {
		mySubstance = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "Substance";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
