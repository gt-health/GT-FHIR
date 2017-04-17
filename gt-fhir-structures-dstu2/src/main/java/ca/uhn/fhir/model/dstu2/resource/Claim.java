















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
 * HAPI/FHIR <b>Claim</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * A provider issued list of services and products provided, or to be provided, to a patient which is provided to an insurer for payment recovery.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Claim">http://hl7.org/fhir/profiles/Claim</a> 
 * </p>
 *
 */
@ResourceDef(name="Claim", profile="http://hl7.org/fhir/profiles/Claim", id="claim")
public class Claim extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The primary identifier of the financial resource</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Claim.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Claim.identifier", description="The primary identifier of the financial resource", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The primary identifier of the financial resource</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Claim.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>use</b>
	 * <p>
	 * Description: <b>The kind of financial resource</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Claim.use</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="use", path="Claim.use", description="The kind of financial resource", type="token"  )
	public static final String SP_USE = "use";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>use</b>
	 * <p>
	 * Description: <b>The kind of financial resource</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Claim.use</b><br>
	 * </p>
	 */
	public static final TokenClientParam USE = new TokenClientParam(SP_USE);

	/**
	 * Search parameter constant for <b>priority</b>
	 * <p>
	 * Description: <b>Processing priority requested</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Claim.priority</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="priority", path="Claim.priority", description="Processing priority requested", type="token"  )
	public static final String SP_PRIORITY = "priority";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>priority</b>
	 * <p>
	 * Description: <b>Processing priority requested</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Claim.priority</b><br>
	 * </p>
	 */
	public static final TokenClientParam PRIORITY = new TokenClientParam(SP_PRIORITY);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Claim.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Claim.patient", description="Patient", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Claim.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>provider</b>
	 * <p>
	 * Description: <b>Provider responsible for the claim</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Claim.provider</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="provider", path="Claim.provider", description="Provider responsible for the claim", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_PROVIDER = "provider";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>provider</b>
	 * <p>
	 * Description: <b>Provider responsible for the claim</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Claim.provider</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PROVIDER = new ReferenceClientParam(SP_PROVIDER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Claim:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Claim:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Claim:provider</b>".
	 */
	public static final Include INCLUDE_PROVIDER = new Include("Claim:provider");


	@Child(name="type", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The category of claim this is"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/claim-type-link")
	private BoundCodeDt<ClaimTypeEnum> myType;
	
	@Child(name="identifier", type=IdentifierDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="ruleset", type=CodingDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The version of the specification on which this instance relies."
	)
	private CodingDt myRuleset;
	
	@Child(name="originalRuleset", type=CodingDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The version of the specification from which the original instance was created."
	)
	private CodingDt myOriginalRuleset;
	
	@Child(name="created", type=DateTimeDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date when the enclosed suite of services were performed or completed"
	)
	private DateTimeDt myCreated;
	
	@Child(name="target", order=5, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Insurer Identifier, typical BIN number (6 digit)."
	)
	private ResourceReferenceDt myTarget;
	
	@Child(name="provider", order=6, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The provider which is responsible for the bill, claim pre-determination, pre-authorization."
	)
	private ResourceReferenceDt myProvider;
	
	@Child(name="organization", order=7, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The organization which is responsible for the bill, claim pre-determination, pre-authorization."
	)
	private ResourceReferenceDt myOrganization;
	
	@Child(name="use", type=CodeDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination)."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/claim-use-link")
	private BoundCodeDt<UseEnum> myUse;
	
	@Child(name="priority", type=CodingDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Immediate (stat), best effort (normal), deferred (deferred)"
	)
	private CodingDt myPriority;
	
	@Child(name="fundsReserve", type=CodingDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested."
	)
	private CodingDt myFundsReserve;
	
	@Child(name="enterer", order=11, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Person who created the invoice/claim/pre-determination or pre-authorization."
	)
	private ResourceReferenceDt myEnterer;
	
	@Child(name="facility", order=12, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Facility where the services were provided."
	)
	private ResourceReferenceDt myFacility;
	
	@Child(name="prescription", order=13, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.MedicationOrder.class, 		ca.uhn.fhir.model.dstu2.resource.VisionPrescription.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Prescription to support the dispensing of Pharmacy or Vision products."
	)
	private ResourceReferenceDt myPrescription;
	
	@Child(name="originalPrescription", order=14, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.MedicationOrder.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Original prescription to support the dispensing of pharmacy services, medications or products."
	)
	private ResourceReferenceDt myOriginalPrescription;
	
	@Child(name="payee", order=15, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The party to be reimbursed for the services."
	)
	private Payee myPayee;
	
	@Child(name="referral", order=16, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.ReferralRequest.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The referral resource which lists the date, practitioner, reason and other supporting information."
	)
	private ResourceReferenceDt myReferral;
	
	@Child(name="diagnosis", order=17, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Ordered list of patient diagnosis for which care is sought."
	)
	private java.util.List<Diagnosis> myDiagnosis;
	
	@Child(name="condition", type=CodingDt.class, order=18, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of patient conditions for which care is sought."
	)
	private java.util.List<CodingDt> myCondition;
	
	@Child(name="patient", order=19, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Patient Resource"
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="coverage", order=20, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Financial instrument by which payment information for health care"
	)
	private java.util.List<Coverage> myCoverage;
	
	@Child(name="exception", type=CodingDt.class, order=21, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Factors which may influence the applicability of coverage."
	)
	private java.util.List<CodingDt> myException;
	
	@Child(name="school", type=StringDt.class, order=22, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Name of school for over-aged dependents."
	)
	private StringDt mySchool;
	
	@Child(name="accident", type=DateDt.class, order=23, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Date of an accident which these services are addressing."
	)
	private DateDt myAccident;
	
	@Child(name="accidentType", type=CodingDt.class, order=24, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Type of accident: work, auto, etc."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/v3-ActIncidentCode")
	private CodingDt myAccidentType;
	
	@Child(name="interventionException", type=CodingDt.class, order=25, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of intervention and exception codes which may influence the adjudication of the claim."
	)
	private java.util.List<CodingDt> myInterventionException;
	
	@Child(name="item", order=26, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="First tier of goods and services"
	)
	private java.util.List<Item> myItem;
	
	@Child(name="additionalMaterials", type=CodingDt.class, order=27, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Code to indicate that Xrays, images, emails, documents, models or attachments are being sent in support of this submission."
	)
	private java.util.List<CodingDt> myAdditionalMaterials;
	
	@Child(name="missingTeeth", order=28, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons."
	)
	private java.util.List<MissingTeeth> myMissingTeeth;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myIdentifier,  myRuleset,  myOriginalRuleset,  myCreated,  myTarget,  myProvider,  myOrganization,  myUse,  myPriority,  myFundsReserve,  myEnterer,  myFacility,  myPrescription,  myOriginalPrescription,  myPayee,  myReferral,  myDiagnosis,  myCondition,  myPatient,  myCoverage,  myException,  mySchool,  myAccident,  myAccidentType,  myInterventionException,  myItem,  myAdditionalMaterials,  myMissingTeeth);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myIdentifier, myRuleset, myOriginalRuleset, myCreated, myTarget, myProvider, myOrganization, myUse, myPriority, myFundsReserve, myEnterer, myFacility, myPrescription, myOriginalPrescription, myPayee, myReferral, myDiagnosis, myCondition, myPatient, myCoverage, myException, mySchool, myAccident, myAccidentType, myInterventionException, myItem, myAdditionalMaterials, myMissingTeeth);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The category of claim this is
     * </p> 
	 */
	public BoundCodeDt<ClaimTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<ClaimTypeEnum>(ClaimTypeEnum.VALUESET_BINDER);
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
     * The category of claim this is
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
     * The category of claim this is
     * </p> 
	 */
	public Claim setType(BoundCodeDt<ClaimTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The category of claim this is
     * </p> 
	 */
	public Claim setType(ClaimTypeEnum theValue) {
		setType(new BoundCodeDt<ClaimTypeEnum>(ClaimTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
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
     * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
     * </p> 
	 */
	public Claim setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
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
	 * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Claim addIdentifier(IdentifierDt theValue) {
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
     * The business identifier for the instance: invoice number, claim number, pre-determination or pre-authorization number.
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>ruleset</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the specification on which this instance relies.
     * </p> 
	 */
	public CodingDt getRuleset() {  
		if (myRuleset == null) {
			myRuleset = new CodingDt();
		}
		return myRuleset;
	}

	/**
	 * Sets the value(s) for <b>ruleset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the specification on which this instance relies.
     * </p> 
	 */
	public Claim setRuleset(CodingDt theValue) {
		myRuleset = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>originalRuleset</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the specification from which the original instance was created.
     * </p> 
	 */
	public CodingDt getOriginalRuleset() {  
		if (myOriginalRuleset == null) {
			myOriginalRuleset = new CodingDt();
		}
		return myOriginalRuleset;
	}

	/**
	 * Sets the value(s) for <b>originalRuleset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The version of the specification from which the original instance was created.
     * </p> 
	 */
	public Claim setOriginalRuleset(CodingDt theValue) {
		myOriginalRuleset = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>created</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public DateTimeDt getCreatedElement() {  
		if (myCreated == null) {
			myCreated = new DateTimeDt();
		}
		return myCreated;
	}

	
	/**
	 * Gets the value(s) for <b>created</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public Date getCreated() {  
		return getCreatedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>created</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public Claim setCreated(DateTimeDt theValue) {
		myCreated = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>created</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public Claim setCreated( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myCreated = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>created</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public Claim setCreatedWithSecondsPrecision( Date theDate) {
		myCreated = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>target</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Insurer Identifier, typical BIN number (6 digit).
     * </p> 
	 */
	public ResourceReferenceDt getTarget() {  
		if (myTarget == null) {
			myTarget = new ResourceReferenceDt();
		}
		return myTarget;
	}

	/**
	 * Sets the value(s) for <b>target</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Insurer Identifier, typical BIN number (6 digit).
     * </p> 
	 */
	public Claim setTarget(ResourceReferenceDt theValue) {
		myTarget = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>provider</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The provider which is responsible for the bill, claim pre-determination, pre-authorization.
     * </p> 
	 */
	public ResourceReferenceDt getProvider() {  
		if (myProvider == null) {
			myProvider = new ResourceReferenceDt();
		}
		return myProvider;
	}

	/**
	 * Sets the value(s) for <b>provider</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The provider which is responsible for the bill, claim pre-determination, pre-authorization.
     * </p> 
	 */
	public Claim setProvider(ResourceReferenceDt theValue) {
		myProvider = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>organization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The organization which is responsible for the bill, claim pre-determination, pre-authorization.
     * </p> 
	 */
	public ResourceReferenceDt getOrganization() {  
		if (myOrganization == null) {
			myOrganization = new ResourceReferenceDt();
		}
		return myOrganization;
	}

	/**
	 * Sets the value(s) for <b>organization</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The organization which is responsible for the bill, claim pre-determination, pre-authorization.
     * </p> 
	 */
	public Claim setOrganization(ResourceReferenceDt theValue) {
		myOrganization = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>use</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
     * </p> 
	 */
	public BoundCodeDt<UseEnum> getUseElement() {  
		if (myUse == null) {
			myUse = new BoundCodeDt<UseEnum>(UseEnum.VALUESET_BINDER);
		}
		return myUse;
	}

	
	/**
	 * Gets the value(s) for <b>use</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
     * </p> 
	 */
	public String getUse() {  
		return getUseElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>use</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
     * </p> 
	 */
	public Claim setUse(BoundCodeDt<UseEnum> theValue) {
		myUse = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>use</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Complete (Bill or Claim), Proposed (Pre-Authorization), Exploratory (Pre-determination).
     * </p> 
	 */
	public Claim setUse(UseEnum theValue) {
		setUse(new BoundCodeDt<UseEnum>(UseEnum.VALUESET_BINDER, theValue));
		
/*
		getUseElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>priority</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Immediate (stat), best effort (normal), deferred (deferred)
     * </p> 
	 */
	public CodingDt getPriority() {  
		if (myPriority == null) {
			myPriority = new CodingDt();
		}
		return myPriority;
	}

	/**
	 * Sets the value(s) for <b>priority</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Immediate (stat), best effort (normal), deferred (deferred)
     * </p> 
	 */
	public Claim setPriority(CodingDt theValue) {
		myPriority = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>fundsReserve</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.
     * </p> 
	 */
	public CodingDt getFundsReserve() {  
		if (myFundsReserve == null) {
			myFundsReserve = new CodingDt();
		}
		return myFundsReserve;
	}

	/**
	 * Sets the value(s) for <b>fundsReserve</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * In the case of a Pre-Determination/Pre-Authorization the provider may request that funds in the amount of the expected Benefit be reserved ('Patient' or 'Provider') to pay for the Benefits determined on the subsequent claim(s). 'None' explicitly indicates no funds reserving is requested.
     * </p> 
	 */
	public Claim setFundsReserve(CodingDt theValue) {
		myFundsReserve = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>enterer</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Person who created the invoice/claim/pre-determination or pre-authorization.
     * </p> 
	 */
	public ResourceReferenceDt getEnterer() {  
		if (myEnterer == null) {
			myEnterer = new ResourceReferenceDt();
		}
		return myEnterer;
	}

	/**
	 * Sets the value(s) for <b>enterer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Person who created the invoice/claim/pre-determination or pre-authorization.
     * </p> 
	 */
	public Claim setEnterer(ResourceReferenceDt theValue) {
		myEnterer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>facility</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Facility where the services were provided.
     * </p> 
	 */
	public ResourceReferenceDt getFacility() {  
		if (myFacility == null) {
			myFacility = new ResourceReferenceDt();
		}
		return myFacility;
	}

	/**
	 * Sets the value(s) for <b>facility</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Facility where the services were provided.
     * </p> 
	 */
	public Claim setFacility(ResourceReferenceDt theValue) {
		myFacility = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>prescription</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Prescription to support the dispensing of Pharmacy or Vision products.
     * </p> 
	 */
	public ResourceReferenceDt getPrescription() {  
		if (myPrescription == null) {
			myPrescription = new ResourceReferenceDt();
		}
		return myPrescription;
	}

	/**
	 * Sets the value(s) for <b>prescription</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Prescription to support the dispensing of Pharmacy or Vision products.
     * </p> 
	 */
	public Claim setPrescription(ResourceReferenceDt theValue) {
		myPrescription = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>originalPrescription</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Original prescription to support the dispensing of pharmacy services, medications or products.
     * </p> 
	 */
	public ResourceReferenceDt getOriginalPrescription() {  
		if (myOriginalPrescription == null) {
			myOriginalPrescription = new ResourceReferenceDt();
		}
		return myOriginalPrescription;
	}

	/**
	 * Sets the value(s) for <b>originalPrescription</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Original prescription to support the dispensing of pharmacy services, medications or products.
     * </p> 
	 */
	public Claim setOriginalPrescription(ResourceReferenceDt theValue) {
		myOriginalPrescription = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>payee</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The party to be reimbursed for the services.
     * </p> 
	 */
	public Payee getPayee() {  
		if (myPayee == null) {
			myPayee = new Payee();
		}
		return myPayee;
	}

	/**
	 * Sets the value(s) for <b>payee</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The party to be reimbursed for the services.
     * </p> 
	 */
	public Claim setPayee(Payee theValue) {
		myPayee = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>referral</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The referral resource which lists the date, practitioner, reason and other supporting information.
     * </p> 
	 */
	public ResourceReferenceDt getReferral() {  
		if (myReferral == null) {
			myReferral = new ResourceReferenceDt();
		}
		return myReferral;
	}

	/**
	 * Sets the value(s) for <b>referral</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The referral resource which lists the date, practitioner, reason and other supporting information.
     * </p> 
	 */
	public Claim setReferral(ResourceReferenceDt theValue) {
		myReferral = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>diagnosis</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Ordered list of patient diagnosis for which care is sought.
     * </p> 
	 */
	public java.util.List<Diagnosis> getDiagnosis() {  
		if (myDiagnosis == null) {
			myDiagnosis = new java.util.ArrayList<Diagnosis>();
		}
		return myDiagnosis;
	}

	/**
	 * Sets the value(s) for <b>diagnosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Ordered list of patient diagnosis for which care is sought.
     * </p> 
	 */
	public Claim setDiagnosis(java.util.List<Diagnosis> theValue) {
		myDiagnosis = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>diagnosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Ordered list of patient diagnosis for which care is sought.
     * </p> 
	 */
	public Diagnosis addDiagnosis() {
		Diagnosis newType = new Diagnosis();
		getDiagnosis().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>diagnosis</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Ordered list of patient diagnosis for which care is sought.
	 * </p>
	 * @param theValue The diagnosis to add (must not be <code>null</code>)
	 */
	public Claim addDiagnosis(Diagnosis theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDiagnosis().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>diagnosis</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Ordered list of patient diagnosis for which care is sought.
     * </p> 
	 */
	public Diagnosis getDiagnosisFirstRep() {
		if (getDiagnosis().isEmpty()) {
			return addDiagnosis();
		}
		return getDiagnosis().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>condition</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of patient conditions for which care is sought.
     * </p> 
	 */
	public java.util.List<CodingDt> getCondition() {  
		if (myCondition == null) {
			myCondition = new java.util.ArrayList<CodingDt>();
		}
		return myCondition;
	}

	/**
	 * Sets the value(s) for <b>condition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of patient conditions for which care is sought.
     * </p> 
	 */
	public Claim setCondition(java.util.List<CodingDt> theValue) {
		myCondition = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>condition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of patient conditions for which care is sought.
     * </p> 
	 */
	public CodingDt addCondition() {
		CodingDt newType = new CodingDt();
		getCondition().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>condition</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * List of patient conditions for which care is sought.
	 * </p>
	 * @param theValue The condition to add (must not be <code>null</code>)
	 */
	public Claim addCondition(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCondition().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>condition</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * List of patient conditions for which care is sought.
     * </p> 
	 */
	public CodingDt getConditionFirstRep() {
		if (getCondition().isEmpty()) {
			return addCondition();
		}
		return getCondition().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>patient</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Patient Resource
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
     * Patient Resource
     * </p> 
	 */
	public Claim setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>coverage</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Financial instrument by which payment information for health care
     * </p> 
	 */
	public java.util.List<Coverage> getCoverage() {  
		if (myCoverage == null) {
			myCoverage = new java.util.ArrayList<Coverage>();
		}
		return myCoverage;
	}

	/**
	 * Sets the value(s) for <b>coverage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Financial instrument by which payment information for health care
     * </p> 
	 */
	public Claim setCoverage(java.util.List<Coverage> theValue) {
		myCoverage = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>coverage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Financial instrument by which payment information for health care
     * </p> 
	 */
	public Coverage addCoverage() {
		Coverage newType = new Coverage();
		getCoverage().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>coverage</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Financial instrument by which payment information for health care
	 * </p>
	 * @param theValue The coverage to add (must not be <code>null</code>)
	 */
	public Claim addCoverage(Coverage theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCoverage().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>coverage</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Financial instrument by which payment information for health care
     * </p> 
	 */
	public Coverage getCoverageFirstRep() {
		if (getCoverage().isEmpty()) {
			return addCoverage();
		}
		return getCoverage().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>exception</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Factors which may influence the applicability of coverage.
     * </p> 
	 */
	public java.util.List<CodingDt> getException() {  
		if (myException == null) {
			myException = new java.util.ArrayList<CodingDt>();
		}
		return myException;
	}

	/**
	 * Sets the value(s) for <b>exception</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Factors which may influence the applicability of coverage.
     * </p> 
	 */
	public Claim setException(java.util.List<CodingDt> theValue) {
		myException = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>exception</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Factors which may influence the applicability of coverage.
     * </p> 
	 */
	public CodingDt addException() {
		CodingDt newType = new CodingDt();
		getException().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>exception</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Factors which may influence the applicability of coverage.
	 * </p>
	 * @param theValue The exception to add (must not be <code>null</code>)
	 */
	public Claim addException(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getException().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>exception</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Factors which may influence the applicability of coverage.
     * </p> 
	 */
	public CodingDt getExceptionFirstRep() {
		if (getException().isEmpty()) {
			return addException();
		}
		return getException().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>school</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Name of school for over-aged dependents.
     * </p> 
	 */
	public StringDt getSchoolElement() {  
		if (mySchool == null) {
			mySchool = new StringDt();
		}
		return mySchool;
	}

	
	/**
	 * Gets the value(s) for <b>school</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Name of school for over-aged dependents.
     * </p> 
	 */
	public String getSchool() {  
		return getSchoolElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>school</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Name of school for over-aged dependents.
     * </p> 
	 */
	public Claim setSchool(StringDt theValue) {
		mySchool = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>school</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Name of school for over-aged dependents.
     * </p> 
	 */
	public Claim setSchool( String theString) {
		mySchool = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>accident</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date of an accident which these services are addressing.
     * </p> 
	 */
	public DateDt getAccidentElement() {  
		if (myAccident == null) {
			myAccident = new DateDt();
		}
		return myAccident;
	}

	
	/**
	 * Gets the value(s) for <b>accident</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date of an accident which these services are addressing.
     * </p> 
	 */
	public Date getAccident() {  
		return getAccidentElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>accident</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date of an accident which these services are addressing.
     * </p> 
	 */
	public Claim setAccident(DateDt theValue) {
		myAccident = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>accident</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date of an accident which these services are addressing.
     * </p> 
	 */
	public Claim setAccident( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myAccident = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>accident</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date of an accident which these services are addressing.
     * </p> 
	 */
	public Claim setAccidentWithDayPrecision( Date theDate) {
		myAccident = new DateDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>accidentType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Type of accident: work, auto, etc.
     * </p> 
	 */
	public CodingDt getAccidentType() {  
		if (myAccidentType == null) {
			myAccidentType = new CodingDt();
		}
		return myAccidentType;
	}

	/**
	 * Sets the value(s) for <b>accidentType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Type of accident: work, auto, etc.
     * </p> 
	 */
	public Claim setAccidentType(CodingDt theValue) {
		myAccidentType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>interventionException</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of intervention and exception codes which may influence the adjudication of the claim.
     * </p> 
	 */
	public java.util.List<CodingDt> getInterventionException() {  
		if (myInterventionException == null) {
			myInterventionException = new java.util.ArrayList<CodingDt>();
		}
		return myInterventionException;
	}

	/**
	 * Sets the value(s) for <b>interventionException</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of intervention and exception codes which may influence the adjudication of the claim.
     * </p> 
	 */
	public Claim setInterventionException(java.util.List<CodingDt> theValue) {
		myInterventionException = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>interventionException</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of intervention and exception codes which may influence the adjudication of the claim.
     * </p> 
	 */
	public CodingDt addInterventionException() {
		CodingDt newType = new CodingDt();
		getInterventionException().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>interventionException</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of intervention and exception codes which may influence the adjudication of the claim.
	 * </p>
	 * @param theValue The interventionException to add (must not be <code>null</code>)
	 */
	public Claim addInterventionException(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getInterventionException().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>interventionException</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of intervention and exception codes which may influence the adjudication of the claim.
     * </p> 
	 */
	public CodingDt getInterventionExceptionFirstRep() {
		if (getInterventionException().isEmpty()) {
			return addInterventionException();
		}
		return getInterventionException().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>item</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * First tier of goods and services
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
     * First tier of goods and services
     * </p> 
	 */
	public Claim setItem(java.util.List<Item> theValue) {
		myItem = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * First tier of goods and services
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
	 * First tier of goods and services
	 * </p>
	 * @param theValue The item to add (must not be <code>null</code>)
	 */
	public Claim addItem(Item theValue) {
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
     * First tier of goods and services
     * </p> 
	 */
	public Item getItemFirstRep() {
		if (getItem().isEmpty()) {
			return addItem();
		}
		return getItem().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>additionalMaterials</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code to indicate that Xrays, images, emails, documents, models or attachments are being sent in support of this submission.
     * </p> 
	 */
	public java.util.List<CodingDt> getAdditionalMaterials() {  
		if (myAdditionalMaterials == null) {
			myAdditionalMaterials = new java.util.ArrayList<CodingDt>();
		}
		return myAdditionalMaterials;
	}

	/**
	 * Sets the value(s) for <b>additionalMaterials</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code to indicate that Xrays, images, emails, documents, models or attachments are being sent in support of this submission.
     * </p> 
	 */
	public Claim setAdditionalMaterials(java.util.List<CodingDt> theValue) {
		myAdditionalMaterials = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>additionalMaterials</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code to indicate that Xrays, images, emails, documents, models or attachments are being sent in support of this submission.
     * </p> 
	 */
	public CodingDt addAdditionalMaterials() {
		CodingDt newType = new CodingDt();
		getAdditionalMaterials().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>additionalMaterials</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Code to indicate that Xrays, images, emails, documents, models or attachments are being sent in support of this submission.
	 * </p>
	 * @param theValue The additionalMaterials to add (must not be <code>null</code>)
	 */
	public Claim addAdditionalMaterials(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAdditionalMaterials().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>additionalMaterials</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Code to indicate that Xrays, images, emails, documents, models or attachments are being sent in support of this submission.
     * </p> 
	 */
	public CodingDt getAdditionalMaterialsFirstRep() {
		if (getAdditionalMaterials().isEmpty()) {
			return addAdditionalMaterials();
		}
		return getAdditionalMaterials().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>missingTeeth</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.
     * </p> 
	 */
	public java.util.List<MissingTeeth> getMissingTeeth() {  
		if (myMissingTeeth == null) {
			myMissingTeeth = new java.util.ArrayList<MissingTeeth>();
		}
		return myMissingTeeth;
	}

	/**
	 * Sets the value(s) for <b>missingTeeth</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.
     * </p> 
	 */
	public Claim setMissingTeeth(java.util.List<MissingTeeth> theValue) {
		myMissingTeeth = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>missingTeeth</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.
     * </p> 
	 */
	public MissingTeeth addMissingTeeth() {
		MissingTeeth newType = new MissingTeeth();
		getMissingTeeth().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>missingTeeth</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.
	 * </p>
	 * @param theValue The missingTeeth to add (must not be <code>null</code>)
	 */
	public Claim addMissingTeeth(MissingTeeth theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getMissingTeeth().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>missingTeeth</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.
     * </p> 
	 */
	public MissingTeeth getMissingTeethFirstRep() {
		if (getMissingTeeth().isEmpty()) {
			return addMissingTeeth();
		}
		return getMissingTeeth().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Claim.payee</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The party to be reimbursed for the services.
     * </p> 
	 */
	@Block()	
	public static class Payee 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodingDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Party to be reimbursed: Subscriber, provider, other."
	)
	private CodingDt myType;
	
	@Child(name="provider", order=1, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The provider who is to be reimbursed for the claim (the party to whom any benefit is assigned)"
	)
	private ResourceReferenceDt myProvider;
	
	@Child(name="organization", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The organization who is to be reimbursed for the claim (the party to whom any benefit is assigned)"
	)
	private ResourceReferenceDt myOrganization;
	
	@Child(name="person", order=3, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The person other than the subscriber who is to be reimbursed for the claim (the party to whom any benefit is assigned)"
	)
	private ResourceReferenceDt myPerson;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myProvider,  myOrganization,  myPerson);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myProvider, myOrganization, myPerson);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Party to be reimbursed: Subscriber, provider, other.
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
     * Party to be reimbursed: Subscriber, provider, other.
     * </p> 
	 */
	public Payee setType(CodingDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>provider</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The provider who is to be reimbursed for the claim (the party to whom any benefit is assigned)
     * </p> 
	 */
	public ResourceReferenceDt getProvider() {  
		if (myProvider == null) {
			myProvider = new ResourceReferenceDt();
		}
		return myProvider;
	}

	/**
	 * Sets the value(s) for <b>provider</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The provider who is to be reimbursed for the claim (the party to whom any benefit is assigned)
     * </p> 
	 */
	public Payee setProvider(ResourceReferenceDt theValue) {
		myProvider = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>organization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The organization who is to be reimbursed for the claim (the party to whom any benefit is assigned)
     * </p> 
	 */
	public ResourceReferenceDt getOrganization() {  
		if (myOrganization == null) {
			myOrganization = new ResourceReferenceDt();
		}
		return myOrganization;
	}

	/**
	 * Sets the value(s) for <b>organization</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The organization who is to be reimbursed for the claim (the party to whom any benefit is assigned)
     * </p> 
	 */
	public Payee setOrganization(ResourceReferenceDt theValue) {
		myOrganization = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>person</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The person other than the subscriber who is to be reimbursed for the claim (the party to whom any benefit is assigned)
     * </p> 
	 */
	public ResourceReferenceDt getPerson() {  
		if (myPerson == null) {
			myPerson = new ResourceReferenceDt();
		}
		return myPerson;
	}

	/**
	 * Sets the value(s) for <b>person</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The person other than the subscriber who is to be reimbursed for the claim (the party to whom any benefit is assigned)
     * </p> 
	 */
	public Payee setPerson(ResourceReferenceDt theValue) {
		myPerson = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Claim.diagnosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Ordered list of patient diagnosis for which care is sought.
     * </p> 
	 */
	@Block()	
	public static class Diagnosis 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequence", type=PositiveIntDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Sequence of diagnosis which serves to order and provide a link."
	)
	private PositiveIntDt mySequence;
	
	@Child(name="diagnosis", type=CodingDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The diagnosis."
	)
	private CodingDt myDiagnosis;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequence,  myDiagnosis);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequence, myDiagnosis);
	}

	/**
	 * Gets the value(s) for <b>sequence</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Sequence of diagnosis which serves to order and provide a link.
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
     * Sequence of diagnosis which serves to order and provide a link.
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
     * Sequence of diagnosis which serves to order and provide a link.
     * </p> 
	 */
	public Diagnosis setSequence(PositiveIntDt theValue) {
		mySequence = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Sequence of diagnosis which serves to order and provide a link.
     * </p> 
	 */
	public Diagnosis setSequence( int theInteger) {
		mySequence = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>diagnosis</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The diagnosis.
     * </p> 
	 */
	public CodingDt getDiagnosis() {  
		if (myDiagnosis == null) {
			myDiagnosis = new CodingDt();
		}
		return myDiagnosis;
	}

	/**
	 * Sets the value(s) for <b>diagnosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The diagnosis.
     * </p> 
	 */
	public Diagnosis setDiagnosis(CodingDt theValue) {
		myDiagnosis = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Claim.coverage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Financial instrument by which payment information for health care
     * </p> 
	 */
	@Block()	
	public static class Coverage 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequence", type=PositiveIntDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A service line item."
	)
	private PositiveIntDt mySequence;
	
	@Child(name="focal", type=BooleanDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated."
	)
	private BooleanDt myFocal;
	
	@Child(name="coverage", order=2, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Coverage.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Reference to the program or plan identification, underwriter or payor."
	)
	private ResourceReferenceDt myCoverage;
	
	@Child(name="businessArrangement", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The contract number of a business agreement which describes the terms and conditions."
	)
	private StringDt myBusinessArrangement;
	
	@Child(name="relationship", type=CodingDt.class, order=4, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The relationship of the patient to the subscriber"
	)
	private CodingDt myRelationship;
	
	@Child(name="preAuthRef", type=StringDt.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A list of references from the Insurer to which these services pertain."
	)
	private java.util.List<StringDt> myPreAuthRef;
	
	@Child(name="claimResponse", order=6, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.ClaimResponse.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The Coverages adjudication details."
	)
	private ResourceReferenceDt myClaimResponse;
	
	@Child(name="originalRuleset", type=CodingDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The style (standard) and version of the original material which was converted into this resource."
	)
	private CodingDt myOriginalRuleset;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequence,  myFocal,  myCoverage,  myBusinessArrangement,  myRelationship,  myPreAuthRef,  myClaimResponse,  myOriginalRuleset);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequence, myFocal, myCoverage, myBusinessArrangement, myRelationship, myPreAuthRef, myClaimResponse, myOriginalRuleset);
	}

	/**
	 * Gets the value(s) for <b>sequence</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line item.
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
     * A service line item.
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
     * A service line item.
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
     * A service line item.
     * </p> 
	 */
	public Coverage setSequence( int theInteger) {
		mySequence = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>focal</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
     * </p> 
	 */
	public BooleanDt getFocalElement() {  
		if (myFocal == null) {
			myFocal = new BooleanDt();
		}
		return myFocal;
	}

	
	/**
	 * Gets the value(s) for <b>focal</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
     * </p> 
	 */
	public Boolean getFocal() {  
		return getFocalElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>focal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
     * </p> 
	 */
	public Coverage setFocal(BooleanDt theValue) {
		myFocal = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>focal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The instance number of the Coverage which is the focus for adjudication. The Coverage against which the claim is to be adjudicated.
     * </p> 
	 */
	public Coverage setFocal( boolean theBoolean) {
		myFocal = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>coverage</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the program or plan identification, underwriter or payor.
     * </p> 
	 */
	public ResourceReferenceDt getCoverage() {  
		if (myCoverage == null) {
			myCoverage = new ResourceReferenceDt();
		}
		return myCoverage;
	}

	/**
	 * Sets the value(s) for <b>coverage</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the program or plan identification, underwriter or payor.
     * </p> 
	 */
	public Coverage setCoverage(ResourceReferenceDt theValue) {
		myCoverage = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>businessArrangement</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The contract number of a business agreement which describes the terms and conditions.
     * </p> 
	 */
	public StringDt getBusinessArrangementElement() {  
		if (myBusinessArrangement == null) {
			myBusinessArrangement = new StringDt();
		}
		return myBusinessArrangement;
	}

	
	/**
	 * Gets the value(s) for <b>businessArrangement</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The contract number of a business agreement which describes the terms and conditions.
     * </p> 
	 */
	public String getBusinessArrangement() {  
		return getBusinessArrangementElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>businessArrangement</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The contract number of a business agreement which describes the terms and conditions.
     * </p> 
	 */
	public Coverage setBusinessArrangement(StringDt theValue) {
		myBusinessArrangement = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>businessArrangement</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The contract number of a business agreement which describes the terms and conditions.
     * </p> 
	 */
	public Coverage setBusinessArrangement( String theString) {
		myBusinessArrangement = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>relationship</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The relationship of the patient to the subscriber
     * </p> 
	 */
	public CodingDt getRelationship() {  
		if (myRelationship == null) {
			myRelationship = new CodingDt();
		}
		return myRelationship;
	}

	/**
	 * Sets the value(s) for <b>relationship</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The relationship of the patient to the subscriber
     * </p> 
	 */
	public Coverage setRelationship(CodingDt theValue) {
		myRelationship = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>preAuthRef</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of references from the Insurer to which these services pertain.
     * </p> 
	 */
	public java.util.List<StringDt> getPreAuthRef() {  
		if (myPreAuthRef == null) {
			myPreAuthRef = new java.util.ArrayList<StringDt>();
		}
		return myPreAuthRef;
	}

	/**
	 * Sets the value(s) for <b>preAuthRef</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of references from the Insurer to which these services pertain.
     * </p> 
	 */
	public Coverage setPreAuthRef(java.util.List<StringDt> theValue) {
		myPreAuthRef = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>preAuthRef</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of references from the Insurer to which these services pertain.
     * </p> 
	 */
	public StringDt addPreAuthRef() {
		StringDt newType = new StringDt();
		getPreAuthRef().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>preAuthRef</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of references from the Insurer to which these services pertain.
	 * </p>
	 * @param theValue The preAuthRef to add (must not be <code>null</code>)
	 */
	public Coverage addPreAuthRef(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPreAuthRef().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>preAuthRef</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of references from the Insurer to which these services pertain.
     * </p> 
	 */
	public StringDt getPreAuthRefFirstRep() {
		if (getPreAuthRef().isEmpty()) {
			return addPreAuthRef();
		}
		return getPreAuthRef().get(0); 
	}
 	/**
	 * Adds a new value for <b>preAuthRef</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of references from the Insurer to which these services pertain.
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Coverage addPreAuthRef( String theString) {
		if (myPreAuthRef == null) {
			myPreAuthRef = new java.util.ArrayList<StringDt>();
		}
		myPreAuthRef.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>claimResponse</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The Coverages adjudication details.
     * </p> 
	 */
	public ResourceReferenceDt getClaimResponse() {  
		if (myClaimResponse == null) {
			myClaimResponse = new ResourceReferenceDt();
		}
		return myClaimResponse;
	}

	/**
	 * Sets the value(s) for <b>claimResponse</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The Coverages adjudication details.
     * </p> 
	 */
	public Coverage setClaimResponse(ResourceReferenceDt theValue) {
		myClaimResponse = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>originalRuleset</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The style (standard) and version of the original material which was converted into this resource.
     * </p> 
	 */
	public CodingDt getOriginalRuleset() {  
		if (myOriginalRuleset == null) {
			myOriginalRuleset = new CodingDt();
		}
		return myOriginalRuleset;
	}

	/**
	 * Sets the value(s) for <b>originalRuleset</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The style (standard) and version of the original material which was converted into this resource.
     * </p> 
	 */
	public Coverage setOriginalRuleset(CodingDt theValue) {
		myOriginalRuleset = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Claim.item</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * First tier of goods and services
     * </p> 
	 */
	@Block()	
	public static class Item 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequence", type=PositiveIntDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A service line number."
	)
	private PositiveIntDt mySequence;
	
	@Child(name="type", type=CodingDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of product or service."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/v3-ActInvoiceGroupCode")
	private CodingDt myType;
	
	@Child(name="provider", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The practitioner who is responsible for the services rendered to the patient"
	)
	private ResourceReferenceDt myProvider;
	
	@Child(name="diagnosisLinkId", type=PositiveIntDt.class, order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Diagnosis applicable for this service or product line."
	)
	private java.util.List<PositiveIntDt> myDiagnosisLinkId;
	
	@Child(name="service", type=CodingDt.class, order=4, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied."
	)
	private CodingDt myService;
	
	@Child(name="serviceDate", type=DateDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date when the enclosed suite of services were performed or completed"
	)
	private DateDt myServiceDate;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The number of repetitions of a service or product."
	)
	private SimpleQuantityDt myQuantity;
	
	@Child(name="unitPrice", type=MoneyDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group."
	)
	private MoneyDt myUnitPrice;
	
	@Child(name="factor", type=DecimalDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
	)
	private DecimalDt myFactor;
	
	@Child(name="points", type=DecimalDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point."
	)
	private DecimalDt myPoints;
	
	@Child(name="net", type=MoneyDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
	)
	private MoneyDt myNet;
	
	@Child(name="udi", type=CodingDt.class, order=11, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of Unique Device Identifiers associated with this line item."
	)
	private CodingDt myUdi;
	
	@Child(name="bodySite", type=CodingDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Physical service site on the patient (limb, tooth, etc.)."
	)
	private CodingDt myBodySite;
	
	@Child(name="subSite", type=CodingDt.class, order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A region or surface of the site, e.g. limb region or tooth surface(s)."
	)
	private java.util.List<CodingDt> mySubSite;
	
	@Child(name="modifier", type=CodingDt.class, order=14, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Item typification or modifiers codes, e.g. for Oral whether the treatment is cosmetic or associated with TMJ, or an appliance was lost or stolen."
	)
	private java.util.List<CodingDt> myModifier;
	
	@Child(name="detail", order=15, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Second tier of goods and services"
	)
	private java.util.List<ItemDetail> myDetail;
	
	@Child(name="prosthesis", order=16, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The materials and placement date of prior fixed prosthesis."
	)
	private ItemProsthesis myProsthesis;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequence,  myType,  myProvider,  myDiagnosisLinkId,  myService,  myServiceDate,  myQuantity,  myUnitPrice,  myFactor,  myPoints,  myNet,  myUdi,  myBodySite,  mySubSite,  myModifier,  myDetail,  myProsthesis);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequence, myType, myProvider, myDiagnosisLinkId, myService, myServiceDate, myQuantity, myUnitPrice, myFactor, myPoints, myNet, myUdi, myBodySite, mySubSite, myModifier, myDetail, myProsthesis);
	}

	/**
	 * Gets the value(s) for <b>sequence</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
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
     * A service line number.
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
     * A service line number.
     * </p> 
	 */
	public Item setSequence(PositiveIntDt theValue) {
		mySequence = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public Item setSequence( int theInteger) {
		mySequence = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of product or service.
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
     * The type of product or service.
     * </p> 
	 */
	public Item setType(CodingDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>provider</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner who is responsible for the services rendered to the patient
     * </p> 
	 */
	public ResourceReferenceDt getProvider() {  
		if (myProvider == null) {
			myProvider = new ResourceReferenceDt();
		}
		return myProvider;
	}

	/**
	 * Sets the value(s) for <b>provider</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner who is responsible for the services rendered to the patient
     * </p> 
	 */
	public Item setProvider(ResourceReferenceDt theValue) {
		myProvider = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>diagnosisLinkId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnosis applicable for this service or product line.
     * </p> 
	 */
	public java.util.List<PositiveIntDt> getDiagnosisLinkId() {  
		if (myDiagnosisLinkId == null) {
			myDiagnosisLinkId = new java.util.ArrayList<PositiveIntDt>();
		}
		return myDiagnosisLinkId;
	}

	/**
	 * Sets the value(s) for <b>diagnosisLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnosis applicable for this service or product line.
     * </p> 
	 */
	public Item setDiagnosisLinkId(java.util.List<PositiveIntDt> theValue) {
		myDiagnosisLinkId = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>diagnosisLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnosis applicable for this service or product line.
     * </p> 
	 */
	public PositiveIntDt addDiagnosisLinkId() {
		PositiveIntDt newType = new PositiveIntDt();
		getDiagnosisLinkId().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>diagnosisLinkId</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Diagnosis applicable for this service or product line.
	 * </p>
	 * @param theValue The diagnosisLinkId to add (must not be <code>null</code>)
	 */
	public Item addDiagnosisLinkId(PositiveIntDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDiagnosisLinkId().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>diagnosisLinkId</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnosis applicable for this service or product line.
     * </p> 
	 */
	public PositiveIntDt getDiagnosisLinkIdFirstRep() {
		if (getDiagnosisLinkId().isEmpty()) {
			return addDiagnosisLinkId();
		}
		return getDiagnosisLinkId().get(0); 
	}
 	/**
	 * Adds a new value for <b>diagnosisLinkId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Diagnosis applicable for this service or product line.
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Item addDiagnosisLinkId( int theInteger) {
		if (myDiagnosisLinkId == null) {
			myDiagnosisLinkId = new java.util.ArrayList<PositiveIntDt>();
		}
		myDiagnosisLinkId.add(new PositiveIntDt(theInteger));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>service</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied.
     * </p> 
	 */
	public CodingDt getService() {  
		if (myService == null) {
			myService = new CodingDt();
		}
		return myService;
	}

	/**
	 * Sets the value(s) for <b>service</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied.
     * </p> 
	 */
	public Item setService(CodingDt theValue) {
		myService = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>serviceDate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public DateDt getServiceDateElement() {  
		if (myServiceDate == null) {
			myServiceDate = new DateDt();
		}
		return myServiceDate;
	}

	
	/**
	 * Gets the value(s) for <b>serviceDate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public Date getServiceDate() {  
		return getServiceDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>serviceDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public Item setServiceDate(DateDt theValue) {
		myServiceDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>serviceDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public Item setServiceDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myServiceDate = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>serviceDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date when the enclosed suite of services were performed or completed
     * </p> 
	 */
	public Item setServiceDateWithDayPrecision( Date theDate) {
		myServiceDate = new DateDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The number of repetitions of a service or product.
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
     * The number of repetitions of a service or product.
     * </p> 
	 */
	public Item setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>unitPrice</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
     * </p> 
	 */
	public MoneyDt getUnitPrice() {  
		if (myUnitPrice == null) {
			myUnitPrice = new MoneyDt();
		}
		return myUnitPrice;
	}

	/**
	 * Sets the value(s) for <b>unitPrice</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
     * </p> 
	 */
	public Item setUnitPrice(MoneyDt theValue) {
		myUnitPrice = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>factor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public DecimalDt getFactorElement() {  
		if (myFactor == null) {
			myFactor = new DecimalDt();
		}
		return myFactor;
	}

	
	/**
	 * Gets the value(s) for <b>factor</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public BigDecimal getFactor() {  
		return getFactorElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public Item setFactor(DecimalDt theValue) {
		myFactor = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public Item setFactor( long theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public Item setFactor( double theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public Item setFactor( java.math.BigDecimal theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>points</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public DecimalDt getPointsElement() {  
		if (myPoints == null) {
			myPoints = new DecimalDt();
		}
		return myPoints;
	}

	
	/**
	 * Gets the value(s) for <b>points</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public BigDecimal getPoints() {  
		return getPointsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public Item setPoints(DecimalDt theValue) {
		myPoints = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public Item setPoints( long theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public Item setPoints( double theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public Item setPoints( java.math.BigDecimal theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>net</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     * </p> 
	 */
	public MoneyDt getNet() {  
		if (myNet == null) {
			myNet = new MoneyDt();
		}
		return myNet;
	}

	/**
	 * Sets the value(s) for <b>net</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     * </p> 
	 */
	public Item setNet(MoneyDt theValue) {
		myNet = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>udi</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of Unique Device Identifiers associated with this line item.
     * </p> 
	 */
	public CodingDt getUdi() {  
		if (myUdi == null) {
			myUdi = new CodingDt();
		}
		return myUdi;
	}

	/**
	 * Sets the value(s) for <b>udi</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Unique Device Identifiers associated with this line item.
     * </p> 
	 */
	public Item setUdi(CodingDt theValue) {
		myUdi = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>bodySite</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Physical service site on the patient (limb, tooth, etc.).
     * </p> 
	 */
	public CodingDt getBodySite() {  
		if (myBodySite == null) {
			myBodySite = new CodingDt();
		}
		return myBodySite;
	}

	/**
	 * Sets the value(s) for <b>bodySite</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Physical service site on the patient (limb, tooth, etc.).
     * </p> 
	 */
	public Item setBodySite(CodingDt theValue) {
		myBodySite = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>subSite</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A region or surface of the site, e.g. limb region or tooth surface(s).
     * </p> 
	 */
	public java.util.List<CodingDt> getSubSite() {  
		if (mySubSite == null) {
			mySubSite = new java.util.ArrayList<CodingDt>();
		}
		return mySubSite;
	}

	/**
	 * Sets the value(s) for <b>subSite</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A region or surface of the site, e.g. limb region or tooth surface(s).
     * </p> 
	 */
	public Item setSubSite(java.util.List<CodingDt> theValue) {
		mySubSite = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>subSite</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A region or surface of the site, e.g. limb region or tooth surface(s).
     * </p> 
	 */
	public CodingDt addSubSite() {
		CodingDt newType = new CodingDt();
		getSubSite().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>subSite</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A region or surface of the site, e.g. limb region or tooth surface(s).
	 * </p>
	 * @param theValue The subSite to add (must not be <code>null</code>)
	 */
	public Item addSubSite(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSubSite().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>subSite</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A region or surface of the site, e.g. limb region or tooth surface(s).
     * </p> 
	 */
	public CodingDt getSubSiteFirstRep() {
		if (getSubSite().isEmpty()) {
			return addSubSite();
		}
		return getSubSite().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>modifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Item typification or modifiers codes, e.g. for Oral whether the treatment is cosmetic or associated with TMJ, or an appliance was lost or stolen.
     * </p> 
	 */
	public java.util.List<CodingDt> getModifier() {  
		if (myModifier == null) {
			myModifier = new java.util.ArrayList<CodingDt>();
		}
		return myModifier;
	}

	/**
	 * Sets the value(s) for <b>modifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Item typification or modifiers codes, e.g. for Oral whether the treatment is cosmetic or associated with TMJ, or an appliance was lost or stolen.
     * </p> 
	 */
	public Item setModifier(java.util.List<CodingDt> theValue) {
		myModifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>modifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Item typification or modifiers codes, e.g. for Oral whether the treatment is cosmetic or associated with TMJ, or an appliance was lost or stolen.
     * </p> 
	 */
	public CodingDt addModifier() {
		CodingDt newType = new CodingDt();
		getModifier().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>modifier</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Item typification or modifiers codes, e.g. for Oral whether the treatment is cosmetic or associated with TMJ, or an appliance was lost or stolen.
	 * </p>
	 * @param theValue The modifier to add (must not be <code>null</code>)
	 */
	public Item addModifier(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getModifier().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>modifier</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Item typification or modifiers codes, e.g. for Oral whether the treatment is cosmetic or associated with TMJ, or an appliance was lost or stolen.
     * </p> 
	 */
	public CodingDt getModifierFirstRep() {
		if (getModifier().isEmpty()) {
			return addModifier();
		}
		return getModifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>detail</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Second tier of goods and services
     * </p> 
	 */
	public java.util.List<ItemDetail> getDetail() {  
		if (myDetail == null) {
			myDetail = new java.util.ArrayList<ItemDetail>();
		}
		return myDetail;
	}

	/**
	 * Sets the value(s) for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Second tier of goods and services
     * </p> 
	 */
	public Item setDetail(java.util.List<ItemDetail> theValue) {
		myDetail = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Second tier of goods and services
     * </p> 
	 */
	public ItemDetail addDetail() {
		ItemDetail newType = new ItemDetail();
		getDetail().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>detail</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Second tier of goods and services
	 * </p>
	 * @param theValue The detail to add (must not be <code>null</code>)
	 */
	public Item addDetail(ItemDetail theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDetail().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>detail</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Second tier of goods and services
     * </p> 
	 */
	public ItemDetail getDetailFirstRep() {
		if (getDetail().isEmpty()) {
			return addDetail();
		}
		return getDetail().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>prosthesis</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The materials and placement date of prior fixed prosthesis.
     * </p> 
	 */
	public ItemProsthesis getProsthesis() {  
		if (myProsthesis == null) {
			myProsthesis = new ItemProsthesis();
		}
		return myProsthesis;
	}

	/**
	 * Sets the value(s) for <b>prosthesis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The materials and placement date of prior fixed prosthesis.
     * </p> 
	 */
	public Item setProsthesis(ItemProsthesis theValue) {
		myProsthesis = theValue;
		return this;
	}
	
	

  


	}

	/**
	 * Block class for child element: <b>Claim.item.detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Second tier of goods and services
     * </p> 
	 */
	@Block()	
	public static class ItemDetail 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequence", type=PositiveIntDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A service line number."
	)
	private PositiveIntDt mySequence;
	
	@Child(name="type", type=CodingDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of product or service."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/v3-ActInvoiceGroupCode")
	private CodingDt myType;
	
	@Child(name="service", type=CodingDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied."
	)
	private CodingDt myService;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The number of repetitions of a service or product."
	)
	private SimpleQuantityDt myQuantity;
	
	@Child(name="unitPrice", type=MoneyDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group."
	)
	private MoneyDt myUnitPrice;
	
	@Child(name="factor", type=DecimalDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
	)
	private DecimalDt myFactor;
	
	@Child(name="points", type=DecimalDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point."
	)
	private DecimalDt myPoints;
	
	@Child(name="net", type=MoneyDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
	)
	private MoneyDt myNet;
	
	@Child(name="udi", type=CodingDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of Unique Device Identifiers associated with this line item."
	)
	private CodingDt myUdi;
	
	@Child(name="subDetail", order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Third tier of goods and services"
	)
	private java.util.List<ItemDetailSubDetail> mySubDetail;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequence,  myType,  myService,  myQuantity,  myUnitPrice,  myFactor,  myPoints,  myNet,  myUdi,  mySubDetail);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequence, myType, myService, myQuantity, myUnitPrice, myFactor, myPoints, myNet, myUdi, mySubDetail);
	}

	/**
	 * Gets the value(s) for <b>sequence</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
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
     * A service line number.
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
     * A service line number.
     * </p> 
	 */
	public ItemDetail setSequence(PositiveIntDt theValue) {
		mySequence = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public ItemDetail setSequence( int theInteger) {
		mySequence = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of product or service.
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
     * The type of product or service.
     * </p> 
	 */
	public ItemDetail setType(CodingDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>service</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied.
     * </p> 
	 */
	public CodingDt getService() {  
		if (myService == null) {
			myService = new CodingDt();
		}
		return myService;
	}

	/**
	 * Sets the value(s) for <b>service</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If a grouping item then 'GROUP' otherwise it is a node therefore a code to indicate the Professional Service or Product supplied.
     * </p> 
	 */
	public ItemDetail setService(CodingDt theValue) {
		myService = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The number of repetitions of a service or product.
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
     * The number of repetitions of a service or product.
     * </p> 
	 */
	public ItemDetail setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>unitPrice</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
     * </p> 
	 */
	public MoneyDt getUnitPrice() {  
		if (myUnitPrice == null) {
			myUnitPrice = new MoneyDt();
		}
		return myUnitPrice;
	}

	/**
	 * Sets the value(s) for <b>unitPrice</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If the item is a node then this is the fee for the product or service, otherwise this is the total of the fees for the children of the group.
     * </p> 
	 */
	public ItemDetail setUnitPrice(MoneyDt theValue) {
		myUnitPrice = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>factor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public DecimalDt getFactorElement() {  
		if (myFactor == null) {
			myFactor = new DecimalDt();
		}
		return myFactor;
	}

	
	/**
	 * Gets the value(s) for <b>factor</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public BigDecimal getFactor() {  
		return getFactorElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ItemDetail setFactor(DecimalDt theValue) {
		myFactor = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ItemDetail setFactor( long theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ItemDetail setFactor( double theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ItemDetail setFactor( java.math.BigDecimal theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>points</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public DecimalDt getPointsElement() {  
		if (myPoints == null) {
			myPoints = new DecimalDt();
		}
		return myPoints;
	}

	
	/**
	 * Gets the value(s) for <b>points</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public BigDecimal getPoints() {  
		return getPointsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ItemDetail setPoints(DecimalDt theValue) {
		myPoints = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ItemDetail setPoints( long theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ItemDetail setPoints( double theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ItemDetail setPoints( java.math.BigDecimal theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>net</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     * </p> 
	 */
	public MoneyDt getNet() {  
		if (myNet == null) {
			myNet = new MoneyDt();
		}
		return myNet;
	}

	/**
	 * Sets the value(s) for <b>net</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     * </p> 
	 */
	public ItemDetail setNet(MoneyDt theValue) {
		myNet = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>udi</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of Unique Device Identifiers associated with this line item.
     * </p> 
	 */
	public CodingDt getUdi() {  
		if (myUdi == null) {
			myUdi = new CodingDt();
		}
		return myUdi;
	}

	/**
	 * Sets the value(s) for <b>udi</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Unique Device Identifiers associated with this line item.
     * </p> 
	 */
	public ItemDetail setUdi(CodingDt theValue) {
		myUdi = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>subDetail</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Third tier of goods and services
     * </p> 
	 */
	public java.util.List<ItemDetailSubDetail> getSubDetail() {  
		if (mySubDetail == null) {
			mySubDetail = new java.util.ArrayList<ItemDetailSubDetail>();
		}
		return mySubDetail;
	}

	/**
	 * Sets the value(s) for <b>subDetail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Third tier of goods and services
     * </p> 
	 */
	public ItemDetail setSubDetail(java.util.List<ItemDetailSubDetail> theValue) {
		mySubDetail = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>subDetail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Third tier of goods and services
     * </p> 
	 */
	public ItemDetailSubDetail addSubDetail() {
		ItemDetailSubDetail newType = new ItemDetailSubDetail();
		getSubDetail().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>subDetail</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Third tier of goods and services
	 * </p>
	 * @param theValue The subDetail to add (must not be <code>null</code>)
	 */
	public ItemDetail addSubDetail(ItemDetailSubDetail theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSubDetail().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>subDetail</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Third tier of goods and services
     * </p> 
	 */
	public ItemDetailSubDetail getSubDetailFirstRep() {
		if (getSubDetail().isEmpty()) {
			return addSubDetail();
		}
		return getSubDetail().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>Claim.item.detail.subDetail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Third tier of goods and services
     * </p> 
	 */
	@Block()	
	public static class ItemDetailSubDetail 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sequence", type=PositiveIntDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A service line number."
	)
	private PositiveIntDt mySequence;
	
	@Child(name="type", type=CodingDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of product or service."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/v3-ActInvoiceGroupCode")
	private CodingDt myType;
	
	@Child(name="service", type=CodingDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The fee for an additional  service or product or charge."
	)
	private CodingDt myService;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The number of repetitions of a service or product."
	)
	private SimpleQuantityDt myQuantity;
	
	@Child(name="unitPrice", type=MoneyDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The fee for an additional  service or product or charge."
	)
	private MoneyDt myUnitPrice;
	
	@Child(name="factor", type=DecimalDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount."
	)
	private DecimalDt myFactor;
	
	@Child(name="points", type=DecimalDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point."
	)
	private DecimalDt myPoints;
	
	@Child(name="net", type=MoneyDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied."
	)
	private MoneyDt myNet;
	
	@Child(name="udi", type=CodingDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of Unique Device Identifiers associated with this line item."
	)
	private CodingDt myUdi;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySequence,  myType,  myService,  myQuantity,  myUnitPrice,  myFactor,  myPoints,  myNet,  myUdi);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySequence, myType, myService, myQuantity, myUnitPrice, myFactor, myPoints, myNet, myUdi);
	}

	/**
	 * Gets the value(s) for <b>sequence</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
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
     * A service line number.
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
     * A service line number.
     * </p> 
	 */
	public ItemDetailSubDetail setSequence(PositiveIntDt theValue) {
		mySequence = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sequence</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A service line number.
     * </p> 
	 */
	public ItemDetailSubDetail setSequence( int theInteger) {
		mySequence = new PositiveIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of product or service.
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
     * The type of product or service.
     * </p> 
	 */
	public ItemDetailSubDetail setType(CodingDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>service</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The fee for an additional  service or product or charge.
     * </p> 
	 */
	public CodingDt getService() {  
		if (myService == null) {
			myService = new CodingDt();
		}
		return myService;
	}

	/**
	 * Sets the value(s) for <b>service</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The fee for an additional  service or product or charge.
     * </p> 
	 */
	public ItemDetailSubDetail setService(CodingDt theValue) {
		myService = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The number of repetitions of a service or product.
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
     * The number of repetitions of a service or product.
     * </p> 
	 */
	public ItemDetailSubDetail setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>unitPrice</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The fee for an additional  service or product or charge.
     * </p> 
	 */
	public MoneyDt getUnitPrice() {  
		if (myUnitPrice == null) {
			myUnitPrice = new MoneyDt();
		}
		return myUnitPrice;
	}

	/**
	 * Sets the value(s) for <b>unitPrice</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The fee for an additional  service or product or charge.
     * </p> 
	 */
	public ItemDetailSubDetail setUnitPrice(MoneyDt theValue) {
		myUnitPrice = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>factor</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public DecimalDt getFactorElement() {  
		if (myFactor == null) {
			myFactor = new DecimalDt();
		}
		return myFactor;
	}

	
	/**
	 * Gets the value(s) for <b>factor</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public BigDecimal getFactor() {  
		return getFactorElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ItemDetailSubDetail setFactor(DecimalDt theValue) {
		myFactor = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ItemDetailSubDetail setFactor( long theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ItemDetailSubDetail setFactor( double theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>factor</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A real number that represents a multiplier used in determining the overall value of services delivered and/or goods received. The concept of a Factor allows for a discount or surcharge multiplier to be applied to a monetary amount.
     * </p> 
	 */
	public ItemDetailSubDetail setFactor( java.math.BigDecimal theValue) {
		myFactor = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>points</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public DecimalDt getPointsElement() {  
		if (myPoints == null) {
			myPoints = new DecimalDt();
		}
		return myPoints;
	}

	
	/**
	 * Gets the value(s) for <b>points</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public BigDecimal getPoints() {  
		return getPointsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ItemDetailSubDetail setPoints(DecimalDt theValue) {
		myPoints = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ItemDetailSubDetail setPoints( long theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ItemDetailSubDetail setPoints( double theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>points</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An amount that expresses the weighting (based on difficulty, cost and/or resource intensiveness) associated with the good or service delivered. The concept of Points allows for assignment of point values for services and/or goods, such that a monetary amount can be assigned to each point.
     * </p> 
	 */
	public ItemDetailSubDetail setPoints( java.math.BigDecimal theValue) {
		myPoints = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>net</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     * </p> 
	 */
	public MoneyDt getNet() {  
		if (myNet == null) {
			myNet = new MoneyDt();
		}
		return myNet;
	}

	/**
	 * Sets the value(s) for <b>net</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity times the unit price for an additional  service or product or charge. For example, the formula: unit Quantity * unit Price (Cost per Point) * factor Number  * points = net Amount. Quantity, factor and points are assumed to be 1 if not supplied.
     * </p> 
	 */
	public ItemDetailSubDetail setNet(MoneyDt theValue) {
		myNet = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>udi</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of Unique Device Identifiers associated with this line item.
     * </p> 
	 */
	public CodingDt getUdi() {  
		if (myUdi == null) {
			myUdi = new CodingDt();
		}
		return myUdi;
	}

	/**
	 * Sets the value(s) for <b>udi</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of Unique Device Identifiers associated with this line item.
     * </p> 
	 */
	public ItemDetailSubDetail setUdi(CodingDt theValue) {
		myUdi = theValue;
		return this;
	}
	
	

  


	}



	/**
	 * Block class for child element: <b>Claim.item.prosthesis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The materials and placement date of prior fixed prosthesis.
     * </p> 
	 */
	@Block()	
	public static class ItemProsthesis 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="initial", type=BooleanDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether this is the initial placement of a fixed prosthesis."
	)
	private BooleanDt myInitial;
	
	@Child(name="priorDate", type=DateDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Date of the initial placement."
	)
	private DateDt myPriorDate;
	
	@Child(name="priorMaterial", type=CodingDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Material of the prior denture or bridge prosthesis. (Oral)"
	)
	private CodingDt myPriorMaterial;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myInitial,  myPriorDate,  myPriorMaterial);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myInitial, myPriorDate, myPriorMaterial);
	}

	/**
	 * Gets the value(s) for <b>initial</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this is the initial placement of a fixed prosthesis.
     * </p> 
	 */
	public BooleanDt getInitialElement() {  
		if (myInitial == null) {
			myInitial = new BooleanDt();
		}
		return myInitial;
	}

	
	/**
	 * Gets the value(s) for <b>initial</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this is the initial placement of a fixed prosthesis.
     * </p> 
	 */
	public Boolean getInitial() {  
		return getInitialElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>initial</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this is the initial placement of a fixed prosthesis.
     * </p> 
	 */
	public ItemProsthesis setInitial(BooleanDt theValue) {
		myInitial = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>initial</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether this is the initial placement of a fixed prosthesis.
     * </p> 
	 */
	public ItemProsthesis setInitial( boolean theBoolean) {
		myInitial = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>priorDate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date of the initial placement.
     * </p> 
	 */
	public DateDt getPriorDateElement() {  
		if (myPriorDate == null) {
			myPriorDate = new DateDt();
		}
		return myPriorDate;
	}

	
	/**
	 * Gets the value(s) for <b>priorDate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date of the initial placement.
     * </p> 
	 */
	public Date getPriorDate() {  
		return getPriorDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>priorDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date of the initial placement.
     * </p> 
	 */
	public ItemProsthesis setPriorDate(DateDt theValue) {
		myPriorDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>priorDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date of the initial placement.
     * </p> 
	 */
	public ItemProsthesis setPriorDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myPriorDate = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>priorDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Date of the initial placement.
     * </p> 
	 */
	public ItemProsthesis setPriorDateWithDayPrecision( Date theDate) {
		myPriorDate = new DateDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>priorMaterial</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Material of the prior denture or bridge prosthesis. (Oral)
     * </p> 
	 */
	public CodingDt getPriorMaterial() {  
		if (myPriorMaterial == null) {
			myPriorMaterial = new CodingDt();
		}
		return myPriorMaterial;
	}

	/**
	 * Sets the value(s) for <b>priorMaterial</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Material of the prior denture or bridge prosthesis. (Oral)
     * </p> 
	 */
	public ItemProsthesis setPriorMaterial(CodingDt theValue) {
		myPriorMaterial = theValue;
		return this;
	}
	
	

  


	}



	/**
	 * Block class for child element: <b>Claim.missingTeeth</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of teeth which would be expected but are not found due to having been previously  extracted or for other reasons.
     * </p> 
	 */
	@Block()	
	public static class MissingTeeth 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="tooth", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The code identifying which tooth is missing."
	)
	private CodingDt myTooth;
	
	@Child(name="reason", type=CodingDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Missing reason may be: E-extraction, O-other"
	)
	private CodingDt myReason;
	
	@Child(name="extractionDate", type=DateDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date of the extraction either known from records or patient reported estimate."
	)
	private DateDt myExtractionDate;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myTooth,  myReason,  myExtractionDate);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myTooth, myReason, myExtractionDate);
	}

	/**
	 * Gets the value(s) for <b>tooth</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The code identifying which tooth is missing.
     * </p> 
	 */
	public CodingDt getTooth() {  
		if (myTooth == null) {
			myTooth = new CodingDt();
		}
		return myTooth;
	}

	/**
	 * Sets the value(s) for <b>tooth</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The code identifying which tooth is missing.
     * </p> 
	 */
	public MissingTeeth setTooth(CodingDt theValue) {
		myTooth = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Missing reason may be: E-extraction, O-other
     * </p> 
	 */
	public CodingDt getReason() {  
		if (myReason == null) {
			myReason = new CodingDt();
		}
		return myReason;
	}

	/**
	 * Sets the value(s) for <b>reason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Missing reason may be: E-extraction, O-other
     * </p> 
	 */
	public MissingTeeth setReason(CodingDt theValue) {
		myReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>extractionDate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date of the extraction either known from records or patient reported estimate.
     * </p> 
	 */
	public DateDt getExtractionDateElement() {  
		if (myExtractionDate == null) {
			myExtractionDate = new DateDt();
		}
		return myExtractionDate;
	}

	
	/**
	 * Gets the value(s) for <b>extractionDate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date of the extraction either known from records or patient reported estimate.
     * </p> 
	 */
	public Date getExtractionDate() {  
		return getExtractionDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>extractionDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date of the extraction either known from records or patient reported estimate.
     * </p> 
	 */
	public MissingTeeth setExtractionDate(DateDt theValue) {
		myExtractionDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>extractionDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date of the extraction either known from records or patient reported estimate.
     * </p> 
	 */
	public MissingTeeth setExtractionDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myExtractionDate = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>extractionDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date of the extraction either known from records or patient reported estimate.
     * </p> 
	 */
	public MissingTeeth setExtractionDateWithDayPrecision( Date theDate) {
		myExtractionDate = new DateDt(theDate); 
		return this; 
	}

 


	}




    @Override
    public String getResourceName() {
        return "Claim";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
