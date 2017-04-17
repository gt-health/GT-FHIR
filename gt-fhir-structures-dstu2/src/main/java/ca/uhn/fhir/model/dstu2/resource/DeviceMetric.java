















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
 * HAPI/FHIR <b>DeviceMetric</b> Resource
 * (Measurement, calculation or setting capability of a medical device)
 *
 * <p>
 * <b>Definition:</b>
 * Describes a measurement, calculation or setting capability of a medical device.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/DeviceMetric">http://hl7.org/fhir/profiles/DeviceMetric</a> 
 * </p>
 *
 */
@ResourceDef(name="DeviceMetric", profile="http://hl7.org/fhir/profiles/DeviceMetric", id="devicemetric")
public class DeviceMetric extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>parent</b>
	 * <p>
	 * Description: <b>The parent DeviceMetric resource</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceMetric.parent</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="parent", path="DeviceMetric.parent", description="The parent DeviceMetric resource", type="reference"  )
	public static final String SP_PARENT = "parent";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>parent</b>
	 * <p>
	 * Description: <b>The parent DeviceMetric resource</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceMetric.parent</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PARENT = new ReferenceClientParam(SP_PARENT);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>The component type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DeviceMetric.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="DeviceMetric.type", description="The component type", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>The component type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DeviceMetric.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b>The device resource</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceMetric.source</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="source", path="DeviceMetric.source", description="The device resource", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_SOURCE = "source";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b>The device resource</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceMetric.source</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SOURCE = new ReferenceClientParam(SP_SOURCE);

	/**
	 * Search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b>The category of the metric</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DeviceMetric.category</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="category", path="DeviceMetric.category", description="The category of the metric", type="token"  )
	public static final String SP_CATEGORY = "category";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b>The category of the metric</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DeviceMetric.category</b><br>
	 * </p>
	 */
	public static final TokenClientParam CATEGORY = new TokenClientParam(SP_CATEGORY);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The identifier of the metric</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DeviceMetric.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="DeviceMetric.identifier", description="The identifier of the metric", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The identifier of the metric</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DeviceMetric.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DeviceMetric:parent</b>".
	 */
	public static final Include INCLUDE_PARENT = new Include("DeviceMetric:parent");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DeviceMetric:source</b>".
	 */
	public static final Include INCLUDE_SOURCE = new Include("DeviceMetric:source");


	@Child(name="type", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="Type of metric",
		formalDefinition="Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "https://rtmms.nist.gov/rtmms/index.htm#!hrosetta")
	private CodeableConceptDt myType;
	
	@Child(name="identifier", type=IdentifierDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="Unique identifier of this DeviceMetric",
		formalDefinition="Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device."
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="unit", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="Unit of metric",
		formalDefinition="Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "https://rtmms.nist.gov/rtmms/index.htm#!units")
	private CodeableConceptDt myUnit;
	
	@Child(name="source", order=3, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Device.class	})
	@Description(
		shortDefinition="Describes the link to the source Device",
		formalDefinition="Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc."
	)
	private ResourceReferenceDt mySource;
	
	@Child(name="parent", order=4, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.DeviceComponent.class	})
	@Description(
		shortDefinition="Describes the link to the parent DeviceComponent",
		formalDefinition="Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location."
	)
	private ResourceReferenceDt myParent;
	
	@Child(name="operationalStatus", type=CodeDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="on | off | standby",
		formalDefinition="Indicates current operational state of the device. For example: On, Off, Standby, etc."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/metric-operational-status")
	private BoundCodeDt<DeviceMetricOperationalStatusEnum> myOperationalStatus;
	
	@Child(name="color", type=CodeDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="black | red | green | yellow | blue | magenta | cyan | white",
		formalDefinition="Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/metric-color")
	private BoundCodeDt<DeviceMetricColorEnum> myColor;
	
	@Child(name="category", type=CodeDt.class, order=7, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="measurement | setting | calculation | unspecified",
		formalDefinition="Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/metric-category")
	private BoundCodeDt<DeviceMetricCategoryEnum> myCategory;
	
	@Child(name="measurementPeriod", type=TimingDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="Describes the measurement repetition time",
		formalDefinition="Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured."
	)
	private TimingDt myMeasurementPeriod;
	
	@Child(name="calibration", order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="Describes the calibrations that have been performed or that are required to be performed",
		formalDefinition="Describes the calibrations that have been performed or that are required to be performed"
	)
	private java.util.List<Calibration> myCalibration;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myIdentifier,  myUnit,  mySource,  myParent,  myOperationalStatus,  myColor,  myCategory,  myMeasurementPeriod,  myCalibration);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myIdentifier, myUnit, mySource, myParent, myOperationalStatus, myColor, myCategory, myMeasurementPeriod, myCalibration);
	}

	/**
	 * Gets the value(s) for <b>type</b> (Type of metric).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.
     * </p> 
	 */
	public CodeableConceptDt getType() {  
		if (myType == null) {
			myType = new CodeableConceptDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> (Type of metric)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the type of the metric. For example: Heart Rate, PEEP Setting, etc.
     * </p> 
	 */
	public DeviceMetric setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> (Unique identifier of this DeviceMetric).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.
     * </p> 
	 */
	public IdentifierDt getIdentifier() {  
		if (myIdentifier == null) {
			myIdentifier = new IdentifierDt();
		}
		return myIdentifier;
	}

	/**
	 * Sets the value(s) for <b>identifier</b> (Unique identifier of this DeviceMetric)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the unique identification of this metric that has been assigned by the device or gateway software. For example: handle ID.  It should be noted that in order to make the identifier unique, the system element of the identifier should be set to the unique identifier of the device.
     * </p> 
	 */
	public DeviceMetric setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>unit</b> (Unit of metric).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.
     * </p> 
	 */
	public CodeableConceptDt getUnit() {  
		if (myUnit == null) {
			myUnit = new CodeableConceptDt();
		}
		return myUnit;
	}

	/**
	 * Sets the value(s) for <b>unit</b> (Unit of metric)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the unit that an observed value determined for this metric will have. For example: Percent, Seconds, etc.
     * </p> 
	 */
	public DeviceMetric setUnit(CodeableConceptDt theValue) {
		myUnit = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>source</b> (Describes the link to the source Device).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.
     * </p> 
	 */
	public ResourceReferenceDt getSource() {  
		if (mySource == null) {
			mySource = new ResourceReferenceDt();
		}
		return mySource;
	}

	/**
	 * Sets the value(s) for <b>source</b> (Describes the link to the source Device)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the link to the  Device that this DeviceMetric belongs to and that contains administrative device information such as manufacture, serial number, etc.
     * </p> 
	 */
	public DeviceMetric setSource(ResourceReferenceDt theValue) {
		mySource = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>parent</b> (Describes the link to the parent DeviceComponent).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.
     * </p> 
	 */
	public ResourceReferenceDt getParent() {  
		if (myParent == null) {
			myParent = new ResourceReferenceDt();
		}
		return myParent;
	}

	/**
	 * Sets the value(s) for <b>parent</b> (Describes the link to the parent DeviceComponent)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the link to the  DeviceComponent that this DeviceMetric belongs to and that provide information about the location of this DeviceMetric in the containment structure of the parent Device. An example would be a DeviceComponent that represents a Channel. This reference can be used by a client application to distinguish DeviceMetrics that have the same type, but should be interpreted based on their containment location.
     * </p> 
	 */
	public DeviceMetric setParent(ResourceReferenceDt theValue) {
		myParent = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>operationalStatus</b> (on | off | standby).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates current operational state of the device. For example: On, Off, Standby, etc.
     * </p> 
	 */
	public BoundCodeDt<DeviceMetricOperationalStatusEnum> getOperationalStatusElement() {  
		if (myOperationalStatus == null) {
			myOperationalStatus = new BoundCodeDt<DeviceMetricOperationalStatusEnum>(DeviceMetricOperationalStatusEnum.VALUESET_BINDER);
		}
		return myOperationalStatus;
	}

	
	/**
	 * Gets the value(s) for <b>operationalStatus</b> (on | off | standby).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates current operational state of the device. For example: On, Off, Standby, etc.
     * </p> 
	 */
	public String getOperationalStatus() {  
		return getOperationalStatusElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>operationalStatus</b> (on | off | standby)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates current operational state of the device. For example: On, Off, Standby, etc.
     * </p> 
	 */
	public DeviceMetric setOperationalStatus(BoundCodeDt<DeviceMetricOperationalStatusEnum> theValue) {
		myOperationalStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>operationalStatus</b> (on | off | standby)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates current operational state of the device. For example: On, Off, Standby, etc.
     * </p> 
	 */
	public DeviceMetric setOperationalStatus(DeviceMetricOperationalStatusEnum theValue) {
		setOperationalStatus(new BoundCodeDt<DeviceMetricOperationalStatusEnum>(DeviceMetricOperationalStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getOperationalStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>color</b> (black | red | green | yellow | blue | magenta | cyan | white).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     * </p> 
	 */
	public BoundCodeDt<DeviceMetricColorEnum> getColorElement() {  
		if (myColor == null) {
			myColor = new BoundCodeDt<DeviceMetricColorEnum>(DeviceMetricColorEnum.VALUESET_BINDER);
		}
		return myColor;
	}

	
	/**
	 * Gets the value(s) for <b>color</b> (black | red | green | yellow | blue | magenta | cyan | white).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     * </p> 
	 */
	public String getColor() {  
		return getColorElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>color</b> (black | red | green | yellow | blue | magenta | cyan | white)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     * </p> 
	 */
	public DeviceMetric setColor(BoundCodeDt<DeviceMetricColorEnum> theValue) {
		myColor = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>color</b> (black | red | green | yellow | blue | magenta | cyan | white)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the color representation for the metric. This is often used to aid clinicians to track and identify parameter types by color. In practice, consider a Patient Monitor that has ECG/HR and Pleth for example; the parameters are displayed in different characteristic colors, such as HR-blue, BP-green, and PR and SpO2- magenta.
     * </p> 
	 */
	public DeviceMetric setColor(DeviceMetricColorEnum theValue) {
		setColor(new BoundCodeDt<DeviceMetricColorEnum>(DeviceMetricColorEnum.VALUESET_BINDER, theValue));
		
/*
		getColorElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>category</b> (measurement | setting | calculation | unspecified).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     * </p> 
	 */
	public BoundCodeDt<DeviceMetricCategoryEnum> getCategoryElement() {  
		if (myCategory == null) {
			myCategory = new BoundCodeDt<DeviceMetricCategoryEnum>(DeviceMetricCategoryEnum.VALUESET_BINDER);
		}
		return myCategory;
	}

	
	/**
	 * Gets the value(s) for <b>category</b> (measurement | setting | calculation | unspecified).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     * </p> 
	 */
	public String getCategory() {  
		return getCategoryElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>category</b> (measurement | setting | calculation | unspecified)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     * </p> 
	 */
	public DeviceMetric setCategory(BoundCodeDt<DeviceMetricCategoryEnum> theValue) {
		myCategory = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>category</b> (measurement | setting | calculation | unspecified)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the category of the observation generation process. A DeviceMetric can be for example a setting, measurement, or calculation.
     * </p> 
	 */
	public DeviceMetric setCategory(DeviceMetricCategoryEnum theValue) {
		setCategory(new BoundCodeDt<DeviceMetricCategoryEnum>(DeviceMetricCategoryEnum.VALUESET_BINDER, theValue));
		
/*
		getCategoryElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>measurementPeriod</b> (Describes the measurement repetition time).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.
     * </p> 
	 */
	public TimingDt getMeasurementPeriod() {  
		if (myMeasurementPeriod == null) {
			myMeasurementPeriod = new TimingDt();
		}
		return myMeasurementPeriod;
	}

	/**
	 * Sets the value(s) for <b>measurementPeriod</b> (Describes the measurement repetition time)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the measurement repetition time. This is not necessarily the same as the update period. The measurement repetition time can range from milliseconds up to hours. An example for a measurement repetition time in the range of milliseconds is the sampling rate of an ECG. An example for a measurement repetition time in the range of hours is a NIBP that is triggered automatically every hour. The update period may be different than the measurement repetition time, if the device does not update the published observed value with the same frequency as it was measured.
     * </p> 
	 */
	public DeviceMetric setMeasurementPeriod(TimingDt theValue) {
		myMeasurementPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>calibration</b> (Describes the calibrations that have been performed or that are required to be performed).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the calibrations that have been performed or that are required to be performed
     * </p> 
	 */
	public java.util.List<Calibration> getCalibration() {  
		if (myCalibration == null) {
			myCalibration = new java.util.ArrayList<Calibration>();
		}
		return myCalibration;
	}

	/**
	 * Sets the value(s) for <b>calibration</b> (Describes the calibrations that have been performed or that are required to be performed)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the calibrations that have been performed or that are required to be performed
     * </p> 
	 */
	public DeviceMetric setCalibration(java.util.List<Calibration> theValue) {
		myCalibration = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>calibration</b> (Describes the calibrations that have been performed or that are required to be performed)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the calibrations that have been performed or that are required to be performed
     * </p> 
	 */
	public Calibration addCalibration() {
		Calibration newType = new Calibration();
		getCalibration().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>calibration</b> (Describes the calibrations that have been performed or that are required to be performed)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Describes the calibrations that have been performed or that are required to be performed
	 * </p>
	 * @param theValue The calibration to add (must not be <code>null</code>)
	 */
	public DeviceMetric addCalibration(Calibration theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCalibration().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>calibration</b> (Describes the calibrations that have been performed or that are required to be performed),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the calibrations that have been performed or that are required to be performed
     * </p> 
	 */
	public Calibration getCalibrationFirstRep() {
		if (getCalibration().isEmpty()) {
			return addCalibration();
		}
		return getCalibration().get(0); 
	}
  
	/**
	 * Block class for child element: <b>DeviceMetric.calibration</b> (Describes the calibrations that have been performed or that are required to be performed)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the calibrations that have been performed or that are required to be performed
     * </p> 
	 */
	@Block()	
	public static class Calibration 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="unspecified | offset | gain | two-point",
		formalDefinition="Describes the type of the calibration method."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/metric-calibration-type")
	private BoundCodeDt<DeviceMetricCalibrationTypeEnum> myType;
	
	@Child(name="state", type=CodeDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="not-calibrated | calibration-required | calibrated | unspecified",
		formalDefinition="Describes the state of the calibration."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/metric-calibration-state")
	private BoundCodeDt<DeviceMetricCalibrationStateEnum> myState;
	
	@Child(name="time", type=InstantDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="Describes the time last calibration has been performed",
		formalDefinition="Describes the time last calibration has been performed."
	)
	private InstantDt myTime;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myState,  myTime);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myState, myTime);
	}

	/**
	 * Gets the value(s) for <b>type</b> (unspecified | offset | gain | two-point).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the type of the calibration method.
     * </p> 
	 */
	public BoundCodeDt<DeviceMetricCalibrationTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<DeviceMetricCalibrationTypeEnum>(DeviceMetricCalibrationTypeEnum.VALUESET_BINDER);
		}
		return myType;
	}

	
	/**
	 * Gets the value(s) for <b>type</b> (unspecified | offset | gain | two-point).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the type of the calibration method.
     * </p> 
	 */
	public String getType() {  
		return getTypeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>type</b> (unspecified | offset | gain | two-point)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the type of the calibration method.
     * </p> 
	 */
	public Calibration setType(BoundCodeDt<DeviceMetricCalibrationTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> (unspecified | offset | gain | two-point)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the type of the calibration method.
     * </p> 
	 */
	public Calibration setType(DeviceMetricCalibrationTypeEnum theValue) {
		setType(new BoundCodeDt<DeviceMetricCalibrationTypeEnum>(DeviceMetricCalibrationTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>state</b> (not-calibrated | calibration-required | calibrated | unspecified).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the state of the calibration.
     * </p> 
	 */
	public BoundCodeDt<DeviceMetricCalibrationStateEnum> getStateElement() {  
		if (myState == null) {
			myState = new BoundCodeDt<DeviceMetricCalibrationStateEnum>(DeviceMetricCalibrationStateEnum.VALUESET_BINDER);
		}
		return myState;
	}

	
	/**
	 * Gets the value(s) for <b>state</b> (not-calibrated | calibration-required | calibrated | unspecified).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the state of the calibration.
     * </p> 
	 */
	public String getState() {  
		return getStateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>state</b> (not-calibrated | calibration-required | calibrated | unspecified)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the state of the calibration.
     * </p> 
	 */
	public Calibration setState(BoundCodeDt<DeviceMetricCalibrationStateEnum> theValue) {
		myState = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>state</b> (not-calibrated | calibration-required | calibrated | unspecified)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the state of the calibration.
     * </p> 
	 */
	public Calibration setState(DeviceMetricCalibrationStateEnum theValue) {
		setState(new BoundCodeDt<DeviceMetricCalibrationStateEnum>(DeviceMetricCalibrationStateEnum.VALUESET_BINDER, theValue));
		
/*
		getStateElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>time</b> (Describes the time last calibration has been performed).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the time last calibration has been performed.
     * </p> 
	 */
	public InstantDt getTimeElement() {  
		if (myTime == null) {
			myTime = new InstantDt();
		}
		return myTime;
	}

	
	/**
	 * Gets the value(s) for <b>time</b> (Describes the time last calibration has been performed).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the time last calibration has been performed.
     * </p> 
	 */
	public Date getTime() {  
		return getTimeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>time</b> (Describes the time last calibration has been performed)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the time last calibration has been performed.
     * </p> 
	 */
	public Calibration setTime(InstantDt theValue) {
		myTime = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>time</b> (Describes the time last calibration has been performed)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the time last calibration has been performed.
     * </p> 
	 */
	public Calibration setTimeWithMillisPrecision( Date theDate) {
		myTime = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>time</b> (Describes the time last calibration has been performed)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the time last calibration has been performed.
     * </p> 
	 */
	public Calibration setTime( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myTime = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 


	}




    @Override
    public String getResourceName() {
        return "DeviceMetric";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
