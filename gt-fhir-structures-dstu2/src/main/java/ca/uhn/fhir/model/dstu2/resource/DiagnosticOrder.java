















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
 * HAPI/FHIR <b>DiagnosticOrder</b> Resource
 * (clinical.diagnostics)
 *
 * <p>
 * <b>Definition:</b>
 * A record of a request for a diagnostic investigation service to be performed.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/DiagnosticOrder">http://hl7.org/fhir/profiles/DiagnosticOrder</a> 
 * </p>
 *
 */
@ResourceDef(name="DiagnosticOrder", profile="http://hl7.org/fhir/profiles/DiagnosticOrder", id="diagnosticorder")
public class DiagnosticOrder extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>actor</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.event.actor | DiagnosticOrder.item.event.actor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="actor", path="DiagnosticOrder.event.actor | DiagnosticOrder.item.event.actor", description="", type="reference" , providesMembershipIn={
 @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_ACTOR = "actor";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>actor</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.event.actor | DiagnosticOrder.item.event.actor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ACTOR = new ReferenceClientParam(SP_ACTOR);

	/**
	 * Search parameter constant for <b>bodysite</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.item.bodySite</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="bodysite", path="DiagnosticOrder.item.bodySite", description="", type="token"  )
	public static final String SP_BODYSITE = "bodysite";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>bodysite</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.item.bodySite</b><br>
	 * </p>
	 */
	public static final TokenClientParam BODYSITE = new TokenClientParam(SP_BODYSITE);

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.item.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="DiagnosticOrder.item.code", description="", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.item.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>event-date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DiagnosticOrder.event.dateTime</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="event-date", path="DiagnosticOrder.event.dateTime", description="", type="date"  )
	public static final String SP_EVENT_DATE = "event-date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>event-date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DiagnosticOrder.event.dateTime</b><br>
	 * </p>
	 */
	public static final DateClientParam EVENT_DATE = new DateClientParam(SP_EVENT_DATE);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="DiagnosticOrder.encounter", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="DiagnosticOrder.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>item-date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DiagnosticOrder.item.event.dateTime</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="item-date", path="DiagnosticOrder.item.event.dateTime", description="", type="date"  )
	public static final String SP_ITEM_DATE = "item-date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>item-date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>DiagnosticOrder.item.event.dateTime</b><br>
	 * </p>
	 */
	public static final DateClientParam ITEM_DATE = new DateClientParam(SP_ITEM_DATE);

	/**
	 * Search parameter constant for <b>item-past-status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.item.event.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="item-past-status", path="DiagnosticOrder.item.event.status", description="", type="token"  )
	public static final String SP_ITEM_PAST_STATUS = "item-past-status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>item-past-status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.item.event.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam ITEM_PAST_STATUS = new TokenClientParam(SP_ITEM_PAST_STATUS);

	/**
	 * Search parameter constant for <b>item-status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.item.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="item-status", path="DiagnosticOrder.item.status", description="", type="token"  )
	public static final String SP_ITEM_STATUS = "item-status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>item-status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.item.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam ITEM_STATUS = new TokenClientParam(SP_ITEM_STATUS);

	/**
	 * Search parameter constant for <b>orderer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.orderer</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="orderer", path="DiagnosticOrder.orderer", description="", type="reference" , providesMembershipIn={
 @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_ORDERER = "orderer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>orderer</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.orderer</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ORDERER = new ReferenceClientParam(SP_ORDERER);

	/**
	 * Search parameter constant for <b>event-status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.event.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="event-status", path="DiagnosticOrder.event.status", description="", type="token"  )
	public static final String SP_EVENT_STATUS = "event-status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>event-status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.event.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam EVENT_STATUS = new TokenClientParam(SP_EVENT_STATUS);

	/**
	 * Search parameter constant for <b>specimen</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.specimen | DiagnosticOrder.item.specimen</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="specimen", path="DiagnosticOrder.specimen | DiagnosticOrder.item.specimen", description="", type="reference"  )
	public static final String SP_SPECIMEN = "specimen";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>specimen</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.specimen | DiagnosticOrder.item.specimen</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SPECIMEN = new ReferenceClientParam(SP_SPECIMEN);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="DiagnosticOrder.status", description="", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DiagnosticOrder.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="DiagnosticOrder.subject", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="DiagnosticOrder.subject", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DiagnosticOrder.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>item-past-status-item-date</b>
	 * <p>
	 * Description: <b>A combination of item-past-status and item-date</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>item-past-status &amp; item-date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="item-past-status-item-date", path="item-past-status & item-date", description="A combination of item-past-status and item-date", type="composite"  , compositeOf={  "item-past-status",  "item-date" }  )
	public static final String SP_ITEM_PAST_STATUS_ITEM_DATE = "item-past-status-item-date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>item-past-status-item-date</b>
	 * <p>
	 * Description: <b>A combination of item-past-status and item-date</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>item-past-status &amp; item-date</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<TokenClientParam, DateClientParam> ITEM_PAST_STATUS_ITEM_DATE = new CompositeClientParam<TokenClientParam, DateClientParam>(SP_ITEM_PAST_STATUS_ITEM_DATE);

	/**
	 * Search parameter constant for <b>event-status-event-date</b>
	 * <p>
	 * Description: <b>A combination of past-status and date</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>event-status &amp; event-date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="event-status-event-date", path="event-status & event-date", description="A combination of past-status and date", type="composite"  , compositeOf={  "event-status",  "event-date" }  )
	public static final String SP_EVENT_STATUS_EVENT_DATE = "event-status-event-date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>event-status-event-date</b>
	 * <p>
	 * Description: <b>A combination of past-status and date</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>event-status &amp; event-date</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<TokenClientParam, DateClientParam> EVENT_STATUS_EVENT_DATE = new CompositeClientParam<TokenClientParam, DateClientParam>(SP_EVENT_STATUS_EVENT_DATE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticOrder:actor</b>".
	 */
	public static final Include INCLUDE_ACTOR = new Include("DiagnosticOrder:actor");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticOrder:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("DiagnosticOrder:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticOrder:orderer</b>".
	 */
	public static final Include INCLUDE_ORDERER = new Include("DiagnosticOrder:orderer");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticOrder:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("DiagnosticOrder:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticOrder:specimen</b>".
	 */
	public static final Include INCLUDE_SPECIMEN = new Include("DiagnosticOrder:specimen");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DiagnosticOrder:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("DiagnosticOrder:subject");


	@Child(name="subject", order=0, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class, 		ca.uhn.fhir.model.dstu2.resource.Location.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="Who or what the investigation is to be performed on. This is usually a human patient, but diagnostic tests can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans)"
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="orderer", order=1, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="The practitioner that holds legal responsibility for ordering the investigation"
	)
	private ResourceReferenceDt myOrderer;
	
	@Child(name="identifier", type=IdentifierDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Identifiers assigned to this order instance by the orderer and/or  the receiver and/or order fulfiller."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="encounter", order=3, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="An encounter that provides additional information about the healthcare context in which this request is made"
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="reason", type=CodeableConceptDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An explanation or justification for why this diagnostic investigation is being requested.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation."
	)
	private java.util.List<CodeableConceptDt> myReason;
	
	@Child(name="supportingInformation", order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Observation.class, 		ca.uhn.fhir.model.dstu2.resource.Condition.class, 		ca.uhn.fhir.model.dstu2.resource.DocumentReference.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Additional clinical information about the patient or specimen that may influence test interpretations.  This includes observations explicitly requested by the producer(filler) to provide context or supporting information needed to complete the order."
	)
	private java.util.List<ResourceReferenceDt> mySupportingInformation;
	
	@Child(name="specimen", order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Specimen.class	})
	@Description(
		shortDefinition="",
		formalDefinition="One or more specimens that the diagnostic investigation is about"
	)
	private java.util.List<ResourceReferenceDt> mySpecimen;
	
	@Child(name="status", type=CodeDt.class, order=7, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The status of the order"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/diagnostic-order-status")
	private BoundCodeDt<DiagnosticOrderStatusEnum> myStatus;
	
	@Child(name="priority", type=CodeDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="grade",
		formalDefinition="The clinical priority associated with this order"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/diagnostic-order-priority")
	private BoundCodeDt<DiagnosticOrderPriorityEnum> myPriority;
	
	@Child(name="event", order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A summary of the events of interest that have occurred as the request is processed; e.g. when the order was made, various processing steps (specimens received), when it was completed"
	)
	private java.util.List<Event> myEvent;
	
	@Child(name="item", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested"
	)
	private java.util.List<Item> myItem;
	
	@Child(name="note", type=AnnotationDt.class, order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Any other notes associated with this patient, specimen or order (e.g. \"patient hates needles\")"
	)
	private java.util.List<AnnotationDt> myNote;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySubject,  myOrderer,  myIdentifier,  myEncounter,  myReason,  mySupportingInformation,  mySpecimen,  myStatus,  myPriority,  myEvent,  myItem,  myNote);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySubject, myOrderer, myIdentifier, myEncounter, myReason, mySupportingInformation, mySpecimen, myStatus, myPriority, myEvent, myItem, myNote);
	}

	/**
	 * Gets the value(s) for <b>subject</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Who or what the investigation is to be performed on. This is usually a human patient, but diagnostic tests can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans)
     * </p> 
	 */
	public ResourceReferenceDt getSubject() {  
		if (mySubject == null) {
			mySubject = new ResourceReferenceDt();
		}
		return mySubject;
	}

	/**
	 * Sets the value(s) for <b>subject</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * Who or what the investigation is to be performed on. This is usually a human patient, but diagnostic tests can also be requested on animals, groups of humans or animals, devices such as dialysis machines, or even locations (typically for environmental scans)
     * </p> 
	 */
	public DiagnosticOrder setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>orderer</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner that holds legal responsibility for ordering the investigation
     * </p> 
	 */
	public ResourceReferenceDt getOrderer() {  
		if (myOrderer == null) {
			myOrderer = new ResourceReferenceDt();
		}
		return myOrderer;
	}

	/**
	 * Sets the value(s) for <b>orderer</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner that holds legal responsibility for ordering the investigation
     * </p> 
	 */
	public DiagnosticOrder setOrderer(ResourceReferenceDt theValue) {
		myOrderer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifiers assigned to this order instance by the orderer and/or  the receiver and/or order fulfiller.
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
     * Identifiers assigned to this order instance by the orderer and/or  the receiver and/or order fulfiller.
     * </p> 
	 */
	public DiagnosticOrder setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifiers assigned to this order instance by the orderer and/or  the receiver and/or order fulfiller.
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
	 * Identifiers assigned to this order instance by the orderer and/or  the receiver and/or order fulfiller.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public DiagnosticOrder addIdentifier(IdentifierDt theValue) {
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
     * Identifiers assigned to this order instance by the orderer and/or  the receiver and/or order fulfiller.
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An encounter that provides additional information about the healthcare context in which this request is made
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
     * An encounter that provides additional information about the healthcare context in which this request is made
     * </p> 
	 */
	public DiagnosticOrder setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An explanation or justification for why this diagnostic investigation is being requested.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getReason() {  
		if (myReason == null) {
			myReason = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myReason;
	}

	/**
	 * Sets the value(s) for <b>reason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An explanation or justification for why this diagnostic investigation is being requested.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation.
     * </p> 
	 */
	public DiagnosticOrder setReason(java.util.List<CodeableConceptDt> theValue) {
		myReason = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An explanation or justification for why this diagnostic investigation is being requested.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation.
     * </p> 
	 */
	public CodeableConceptDt addReason() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getReason().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>reason</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * An explanation or justification for why this diagnostic investigation is being requested.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation.
	 * </p>
	 * @param theValue The reason to add (must not be <code>null</code>)
	 */
	public DiagnosticOrder addReason(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getReason().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>reason</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * An explanation or justification for why this diagnostic investigation is being requested.   This is often for billing purposes.  May relate to the resources referred to in supportingInformation.
     * </p> 
	 */
	public CodeableConceptDt getReasonFirstRep() {
		if (getReason().isEmpty()) {
			return addReason();
		}
		return getReason().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>supportingInformation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Additional clinical information about the patient or specimen that may influence test interpretations.  This includes observations explicitly requested by the producer(filler) to provide context or supporting information needed to complete the order.
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
     * Additional clinical information about the patient or specimen that may influence test interpretations.  This includes observations explicitly requested by the producer(filler) to provide context or supporting information needed to complete the order.
     * </p> 
	 */
	public DiagnosticOrder setSupportingInformation(java.util.List<ResourceReferenceDt> theValue) {
		mySupportingInformation = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>supportingInformation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional clinical information about the patient or specimen that may influence test interpretations.  This includes observations explicitly requested by the producer(filler) to provide context or supporting information needed to complete the order.
     * </p> 
	 */
	public ResourceReferenceDt addSupportingInformation() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getSupportingInformation().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>specimen</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * One or more specimens that the diagnostic investigation is about
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getSpecimen() {  
		if (mySpecimen == null) {
			mySpecimen = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return mySpecimen;
	}

	/**
	 * Sets the value(s) for <b>specimen</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One or more specimens that the diagnostic investigation is about
     * </p> 
	 */
	public DiagnosticOrder setSpecimen(java.util.List<ResourceReferenceDt> theValue) {
		mySpecimen = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>specimen</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * One or more specimens that the diagnostic investigation is about
     * </p> 
	 */
	public ResourceReferenceDt addSpecimen() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getSpecimen().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the order
     * </p> 
	 */
	public BoundCodeDt<DiagnosticOrderStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<DiagnosticOrderStatusEnum>(DiagnosticOrderStatusEnum.VALUESET_BINDER);
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
     * The status of the order
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
     * The status of the order
     * </p> 
	 */
	public DiagnosticOrder setStatus(BoundCodeDt<DiagnosticOrderStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the order
     * </p> 
	 */
	public DiagnosticOrder setStatus(DiagnosticOrderStatusEnum theValue) {
		setStatus(new BoundCodeDt<DiagnosticOrderStatusEnum>(DiagnosticOrderStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>priority</b> (grade).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical priority associated with this order
     * </p> 
	 */
	public BoundCodeDt<DiagnosticOrderPriorityEnum> getPriorityElement() {  
		if (myPriority == null) {
			myPriority = new BoundCodeDt<DiagnosticOrderPriorityEnum>(DiagnosticOrderPriorityEnum.VALUESET_BINDER);
		}
		return myPriority;
	}

	
	/**
	 * Gets the value(s) for <b>priority</b> (grade).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical priority associated with this order
     * </p> 
	 */
	public String getPriority() {  
		return getPriorityElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>priority</b> (grade)
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical priority associated with this order
     * </p> 
	 */
	public DiagnosticOrder setPriority(BoundCodeDt<DiagnosticOrderPriorityEnum> theValue) {
		myPriority = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>priority</b> (grade)
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical priority associated with this order
     * </p> 
	 */
	public DiagnosticOrder setPriority(DiagnosticOrderPriorityEnum theValue) {
		setPriority(new BoundCodeDt<DiagnosticOrderPriorityEnum>(DiagnosticOrderPriorityEnum.VALUESET_BINDER, theValue));
		
/*
		getPriorityElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>event</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A summary of the events of interest that have occurred as the request is processed; e.g. when the order was made, various processing steps (specimens received), when it was completed
     * </p> 
	 */
	public java.util.List<Event> getEvent() {  
		if (myEvent == null) {
			myEvent = new java.util.ArrayList<Event>();
		}
		return myEvent;
	}

	/**
	 * Sets the value(s) for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A summary of the events of interest that have occurred as the request is processed; e.g. when the order was made, various processing steps (specimens received), when it was completed
     * </p> 
	 */
	public DiagnosticOrder setEvent(java.util.List<Event> theValue) {
		myEvent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A summary of the events of interest that have occurred as the request is processed; e.g. when the order was made, various processing steps (specimens received), when it was completed
     * </p> 
	 */
	public Event addEvent() {
		Event newType = new Event();
		getEvent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>event</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A summary of the events of interest that have occurred as the request is processed; e.g. when the order was made, various processing steps (specimens received), when it was completed
	 * </p>
	 * @param theValue The event to add (must not be <code>null</code>)
	 */
	public DiagnosticOrder addEvent(Event theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getEvent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>event</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A summary of the events of interest that have occurred as the request is processed; e.g. when the order was made, various processing steps (specimens received), when it was completed
     * </p> 
	 */
	public Event getEventFirstRep() {
		if (getEvent().isEmpty()) {
			return addEvent();
		}
		return getEvent().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>item</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested
     * </p> 
	 */
	public java.util.List<Item> getItem() {  
		if (myItem == null) {
			myItem = new java.util.ArrayList<Item>();
		}
		return myItem;
	}

	/**
	 * Sets the value(s) for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested
     * </p> 
	 */
	public DiagnosticOrder setItem(java.util.List<Item> theValue) {
		myItem = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested
     * </p> 
	 */
	public Item addItem() {
		Item newType = new Item();
		getItem().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>item</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested
	 * </p>
	 * @param theValue The item to add (must not be <code>null</code>)
	 */
	public DiagnosticOrder addItem(Item theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getItem().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>item</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested
     * </p> 
	 */
	public Item getItemFirstRep() {
		if (getItem().isEmpty()) {
			return addItem();
		}
		return getItem().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Any other notes associated with this patient, specimen or order (e.g. \&quot;patient hates needles\&quot;)
     * </p> 
	 */
	public java.util.List<AnnotationDt> getNote() {  
		if (myNote == null) {
			myNote = new java.util.ArrayList<AnnotationDt>();
		}
		return myNote;
	}

	/**
	 * Sets the value(s) for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any other notes associated with this patient, specimen or order (e.g. \&quot;patient hates needles\&quot;)
     * </p> 
	 */
	public DiagnosticOrder setNote(java.util.List<AnnotationDt> theValue) {
		myNote = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>note</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any other notes associated with this patient, specimen or order (e.g. \&quot;patient hates needles\&quot;)
     * </p> 
	 */
	public AnnotationDt addNote() {
		AnnotationDt newType = new AnnotationDt();
		getNote().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>note</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Any other notes associated with this patient, specimen or order (e.g. \&quot;patient hates needles\&quot;)
	 * </p>
	 * @param theValue The note to add (must not be <code>null</code>)
	 */
	public DiagnosticOrder addNote(AnnotationDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getNote().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>note</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Any other notes associated with this patient, specimen or order (e.g. \&quot;patient hates needles\&quot;)
     * </p> 
	 */
	public AnnotationDt getNoteFirstRep() {
		if (getNote().isEmpty()) {
			return addNote();
		}
		return getNote().get(0); 
	}
  
	/**
	 * Block class for child element: <b>DiagnosticOrder.event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A summary of the events of interest that have occurred as the request is processed; e.g. when the order was made, various processing steps (specimens received), when it was completed
     * </p> 
	 */
	@Block()	
	public static class Event 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="status", type=CodeDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The status for the event"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/diagnostic-order-status")
	private BoundCodeDt<DiagnosticOrderStatusEnum> myStatus;
	
	@Child(name="description", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Additional information about the event that occurred - e.g. if the status remained unchanged"
	)
	private CodeableConceptDt myDescription;
	
	@Child(name="dateTime", type=DateTimeDt.class, order=2, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date/time at which the event occurred"
	)
	private DateTimeDt myDateTime;
	
	@Child(name="actor", order=3, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The person responsible for performing or recording the action"
	)
	private ResourceReferenceDt myActor;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myStatus,  myDescription,  myDateTime,  myActor);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myStatus, myDescription, myDateTime, myActor);
	}

	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status for the event
     * </p> 
	 */
	public BoundCodeDt<DiagnosticOrderStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<DiagnosticOrderStatusEnum>(DiagnosticOrderStatusEnum.VALUESET_BINDER);
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
     * The status for the event
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
     * The status for the event
     * </p> 
	 */
	public Event setStatus(BoundCodeDt<DiagnosticOrderStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The status for the event
     * </p> 
	 */
	public Event setStatus(DiagnosticOrderStatusEnum theValue) {
		setStatus(new BoundCodeDt<DiagnosticOrderStatusEnum>(DiagnosticOrderStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
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
     * Additional information about the event that occurred - e.g. if the status remained unchanged
     * </p> 
	 */
	public CodeableConceptDt getDescription() {  
		if (myDescription == null) {
			myDescription = new CodeableConceptDt();
		}
		return myDescription;
	}

	/**
	 * Sets the value(s) for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Additional information about the event that occurred - e.g. if the status remained unchanged
     * </p> 
	 */
	public Event setDescription(CodeableConceptDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dateTime</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date/time at which the event occurred
     * </p> 
	 */
	public DateTimeDt getDateTimeElement() {  
		if (myDateTime == null) {
			myDateTime = new DateTimeDt();
		}
		return myDateTime;
	}

	
	/**
	 * Gets the value(s) for <b>dateTime</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date/time at which the event occurred
     * </p> 
	 */
	public Date getDateTime() {  
		return getDateTimeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>dateTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date/time at which the event occurred
     * </p> 
	 */
	public Event setDateTime(DateTimeDt theValue) {
		myDateTime = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>dateTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date/time at which the event occurred
     * </p> 
	 */
	public Event setDateTime( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDateTime = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>dateTime</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date/time at which the event occurred
     * </p> 
	 */
	public Event setDateTimeWithSecondsPrecision( Date theDate) {
		myDateTime = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>actor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The person responsible for performing or recording the action
     * </p> 
	 */
	public ResourceReferenceDt getActor() {  
		if (myActor == null) {
			myActor = new ResourceReferenceDt();
		}
		return myActor;
	}

	/**
	 * Sets the value(s) for <b>actor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The person responsible for performing or recording the action
     * </p> 
	 */
	public Event setActor(ResourceReferenceDt theValue) {
		myActor = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>DiagnosticOrder.item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The specific diagnostic investigations that are requested as part of this request. Sometimes, there can only be one item per request, but in most contexts, more than one investigation can be requested
     * </p> 
	 */
	@Block()	
	public static class Item 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code that identifies a particular diagnostic investigation, or panel of investigations, that have been requested"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-diagnostic-requests")
	private CodeableConceptDt myCode;
	
	@Child(name="specimen", order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Specimen.class	})
	@Description(
		shortDefinition="",
		formalDefinition="If the item is related to a specific specimen"
	)
	private java.util.List<ResourceReferenceDt> mySpecimen;
	
	@Child(name="bodySite", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Anatomical location where the request test should be performed.  This is the target site."
	)
	private CodeableConceptDt myBodySite;
	
	@Child(name="status", type=CodeDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The status of this individual item within the order"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/diagnostic-order-status")
	private BoundCodeDt<DiagnosticOrderStatusEnum> myStatus;
	
	@Child(name="event", type=Event.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A summary of the events of interest that have occurred as this item of the request is processed"
	)
	private java.util.List<Event> myEvent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  mySpecimen,  myBodySite,  myStatus,  myEvent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, mySpecimen, myBodySite, myStatus, myEvent);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that identifies a particular diagnostic investigation, or panel of investigations, that have been requested
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
     * A code that identifies a particular diagnostic investigation, or panel of investigations, that have been requested
     * </p> 
	 */
	public Item setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>specimen</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If the item is related to a specific specimen
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getSpecimen() {  
		if (mySpecimen == null) {
			mySpecimen = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return mySpecimen;
	}

	/**
	 * Sets the value(s) for <b>specimen</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If the item is related to a specific specimen
     * </p> 
	 */
	public Item setSpecimen(java.util.List<ResourceReferenceDt> theValue) {
		mySpecimen = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>specimen</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If the item is related to a specific specimen
     * </p> 
	 */
	public ResourceReferenceDt addSpecimen() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getSpecimen().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>bodySite</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Anatomical location where the request test should be performed.  This is the target site.
     * </p> 
	 */
	public CodeableConceptDt getBodySite() {  
		if (myBodySite == null) {
			myBodySite = new CodeableConceptDt();
		}
		return myBodySite;
	}

	/**
	 * Sets the value(s) for <b>bodySite</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Anatomical location where the request test should be performed.  This is the target site.
     * </p> 
	 */
	public Item setBodySite(CodeableConceptDt theValue) {
		myBodySite = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of this individual item within the order
     * </p> 
	 */
	public BoundCodeDt<DiagnosticOrderStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<DiagnosticOrderStatusEnum>(DiagnosticOrderStatusEnum.VALUESET_BINDER);
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
     * The status of this individual item within the order
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
     * The status of this individual item within the order
     * </p> 
	 */
	public Item setStatus(BoundCodeDt<DiagnosticOrderStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The status of this individual item within the order
     * </p> 
	 */
	public Item setStatus(DiagnosticOrderStatusEnum theValue) {
		setStatus(new BoundCodeDt<DiagnosticOrderStatusEnum>(DiagnosticOrderStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>event</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A summary of the events of interest that have occurred as this item of the request is processed
     * </p> 
	 */
	public java.util.List<Event> getEvent() {  
		if (myEvent == null) {
			myEvent = new java.util.ArrayList<Event>();
		}
		return myEvent;
	}

	/**
	 * Sets the value(s) for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A summary of the events of interest that have occurred as this item of the request is processed
     * </p> 
	 */
	public Item setEvent(java.util.List<Event> theValue) {
		myEvent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A summary of the events of interest that have occurred as this item of the request is processed
     * </p> 
	 */
	public Event addEvent() {
		Event newType = new Event();
		getEvent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>event</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A summary of the events of interest that have occurred as this item of the request is processed
	 * </p>
	 * @param theValue The event to add (must not be <code>null</code>)
	 */
	public Item addEvent(Event theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getEvent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>event</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A summary of the events of interest that have occurred as this item of the request is processed
     * </p> 
	 */
	public Event getEventFirstRep() {
		if (getEvent().isEmpty()) {
			return addEvent();
		}
		return getEvent().get(0); 
	}
  


	}




    @Override
    public String getResourceName() {
        return "DiagnosticOrder";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
