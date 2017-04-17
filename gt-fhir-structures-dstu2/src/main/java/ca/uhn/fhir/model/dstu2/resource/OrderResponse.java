















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
 * HAPI/FHIR <b>OrderResponse</b> Resource
 * (workflow.order)
 *
 * <p>
 * <b>Definition:</b>
 * A response to an order.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/OrderResponse">http://hl7.org/fhir/profiles/OrderResponse</a> 
 * </p>
 *
 */
@ResourceDef(name="OrderResponse", profile="http://hl7.org/fhir/profiles/OrderResponse", id="orderresponse")
public class OrderResponse extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>request</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>OrderResponse.request</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="request", path="OrderResponse.request", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_REQUEST = "request";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>request</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>OrderResponse.request</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam REQUEST = new ReferenceClientParam(SP_REQUEST);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>OrderResponse.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="OrderResponse.date", description="", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>OrderResponse.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>who</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>OrderResponse.who</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="who", path="OrderResponse.who", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_WHO = "who";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>who</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>OrderResponse.who</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam WHO = new ReferenceClientParam(SP_WHO);

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OrderResponse.orderStatus</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="OrderResponse.orderStatus", description="", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OrderResponse.orderStatus</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>fulfillment</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>OrderResponse.fulfillment</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="fulfillment", path="OrderResponse.fulfillment", description="", type="reference"  )
	public static final String SP_FULFILLMENT = "fulfillment";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>fulfillment</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>OrderResponse.fulfillment</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam FULFILLMENT = new ReferenceClientParam(SP_FULFILLMENT);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Identifiers assigned to this order by the orderer or by the receiver</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OrderResponse.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="OrderResponse.identifier", description="Identifiers assigned to this order by the orderer or by the receiver", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Identifiers assigned to this order by the orderer or by the receiver</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>OrderResponse.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>OrderResponse:fulfillment</b>".
	 */
	public static final Include INCLUDE_FULFILLMENT = new Include("OrderResponse:fulfillment");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>OrderResponse:request</b>".
	 */
	public static final Include INCLUDE_REQUEST = new Include("OrderResponse:request");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>OrderResponse:who</b>".
	 */
	public static final Include INCLUDE_WHO = new Include("OrderResponse:who");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="request", order=1, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Order.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A reference to the order that this is in response to"
	)
	private ResourceReferenceDt myRequest;
	
	@Child(name="date", type=DateTimeDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date and time at which this order response was made (created/posted)"
	)
	private DateTimeDt myDate;
	
	@Child(name="who", order=3, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="The person, organization, or device credited with making the response"
	)
	private ResourceReferenceDt myWho;
	
	@Child(name="orderStatus", type=CodeDt.class, order=4, min=1, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="What this response says about the status of the original order"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/order-status")
	private BoundCodeDt<OrderStatusEnum> myOrderStatus;
	
	@Child(name="description", type=StringDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional description about the response - e.g. a text description provided by a human user when making decisions about the order"
	)
	private StringDt myDescription;
	
	@Child(name="fulfillment", order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Links to resources that provide details of the outcome of performing the order; e.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order"
	)
	private java.util.List<ResourceReferenceDt> myFulfillment;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myRequest,  myDate,  myWho,  myOrderStatus,  myDescription,  myFulfillment);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myRequest, myDate, myWho, myOrderStatus, myDescription, myFulfillment);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems
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
     * Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems
     * </p> 
	 */
	public OrderResponse setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems
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
	 * Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public OrderResponse addIdentifier(IdentifierDt theValue) {
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
     * Identifiers assigned to this order. The identifiers are usually assigned by the system responding to the order, but they may be provided or added to by other systems
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>request</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to the order that this is in response to
     * </p> 
	 */
	public ResourceReferenceDt getRequest() {  
		if (myRequest == null) {
			myRequest = new ResourceReferenceDt();
		}
		return myRequest;
	}

	/**
	 * Sets the value(s) for <b>request</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to the order that this is in response to
     * </p> 
	 */
	public OrderResponse setRequest(ResourceReferenceDt theValue) {
		myRequest = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>date</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time at which this order response was made (created/posted)
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
     * The date and time at which this order response was made (created/posted)
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
     * The date and time at which this order response was made (created/posted)
     * </p> 
	 */
	public OrderResponse setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time at which this order response was made (created/posted)
     * </p> 
	 */
	public OrderResponse setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time at which this order response was made (created/posted)
     * </p> 
	 */
	public OrderResponse setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>who</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The person, organization, or device credited with making the response
     * </p> 
	 */
	public ResourceReferenceDt getWho() {  
		if (myWho == null) {
			myWho = new ResourceReferenceDt();
		}
		return myWho;
	}

	/**
	 * Sets the value(s) for <b>who</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The person, organization, or device credited with making the response
     * </p> 
	 */
	public OrderResponse setWho(ResourceReferenceDt theValue) {
		myWho = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>orderStatus</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * What this response says about the status of the original order
     * </p> 
	 */
	public BoundCodeDt<OrderStatusEnum> getOrderStatusElement() {  
		if (myOrderStatus == null) {
			myOrderStatus = new BoundCodeDt<OrderStatusEnum>(OrderStatusEnum.VALUESET_BINDER);
		}
		return myOrderStatus;
	}

	
	/**
	 * Gets the value(s) for <b>orderStatus</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * What this response says about the status of the original order
     * </p> 
	 */
	public String getOrderStatus() {  
		return getOrderStatusElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>orderStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * What this response says about the status of the original order
     * </p> 
	 */
	public OrderResponse setOrderStatus(BoundCodeDt<OrderStatusEnum> theValue) {
		myOrderStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>orderStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * What this response says about the status of the original order
     * </p> 
	 */
	public OrderResponse setOrderStatus(OrderStatusEnum theValue) {
		setOrderStatus(new BoundCodeDt<OrderStatusEnum>(OrderStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getOrderStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional description about the response - e.g. a text description provided by a human user when making decisions about the order
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
     * Additional description about the response - e.g. a text description provided by a human user when making decisions about the order
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
     * Additional description about the response - e.g. a text description provided by a human user when making decisions about the order
     * </p> 
	 */
	public OrderResponse setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional description about the response - e.g. a text description provided by a human user when making decisions about the order
     * </p> 
	 */
	public OrderResponse setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>fulfillment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Links to resources that provide details of the outcome of performing the order; e.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getFulfillment() {  
		if (myFulfillment == null) {
			myFulfillment = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myFulfillment;
	}

	/**
	 * Sets the value(s) for <b>fulfillment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Links to resources that provide details of the outcome of performing the order; e.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order
     * </p> 
	 */
	public OrderResponse setFulfillment(java.util.List<ResourceReferenceDt> theValue) {
		myFulfillment = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>fulfillment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Links to resources that provide details of the outcome of performing the order; e.g. Diagnostic Reports in a response that is made to an order that referenced a diagnostic order
     * </p> 
	 */
	public ResourceReferenceDt addFulfillment() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getFulfillment().add(newType);
		return newType; 
	}
  


    @Override
    public String getResourceName() {
        return "OrderResponse";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
