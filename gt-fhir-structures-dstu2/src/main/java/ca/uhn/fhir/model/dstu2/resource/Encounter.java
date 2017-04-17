















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
 * HAPI/FHIR <b>Encounter</b> Resource
 * (workflow.encounter)
 *
 * <p>
 * <b>Definition:</b>
 * An interaction between a patient and healthcare provider(s) for the purpose of providing healthcare service(s) or assessing the health status of a patient.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Encounter">http://hl7.org/fhir/profiles/Encounter</a> 
 * </p>
 *
 */
@ResourceDef(name="Encounter", profile="http://hl7.org/fhir/profiles/Encounter", id="encounter")
public class Encounter extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Encounter.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="Encounter.status", description="", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>A date within the period the Encounter lasted</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Encounter.period</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="Encounter.period", description="A date within the period the Encounter lasted", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>A date within the period the Encounter lasted</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Encounter.period</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Encounter.patient", description="", type="reference" , providesMembershipIn={
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
	 * Path: <b>Encounter.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>appointment</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.appointment</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="appointment", path="Encounter.appointment", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Appointment.class 	}
 )
	public static final String SP_APPOINTMENT = "appointment";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>appointment</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.appointment</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam APPOINTMENT = new ReferenceClientParam(SP_APPOINTMENT);

	/**
	 * Search parameter constant for <b>length</b>
	 * <p>
	 * Description: <b>Length of encounter in days</b><br>
	 * Type: <b>number</b><br>
	 * Path: <b>Encounter.length</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="length", path="Encounter.length", description="Length of encounter in days", type="number"  )
	public static final String SP_LENGTH = "length";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>length</b>
	 * <p>
	 * Description: <b>Length of encounter in days</b><br>
	 * Type: <b>number</b><br>
	 * Path: <b>Encounter.length</b><br>
	 * </p>
	 */
	public static final NumberClientParam LENGTH = new NumberClientParam(SP_LENGTH);

	/**
	 * Search parameter constant for <b>reason</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.reason</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="reason", path="Encounter.reason", description="", type="token"  )
	public static final String SP_REASON = "reason";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>reason</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.reason</b><br>
	 * </p>
	 */
	public static final TokenClientParam REASON = new TokenClientParam(SP_REASON);

	/**
	 * Search parameter constant for <b>indication</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.indication</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="indication", path="Encounter.indication", description="", type="reference"  )
	public static final String SP_INDICATION = "indication";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>indication</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.indication</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam INDICATION = new ReferenceClientParam(SP_INDICATION);

	/**
	 * Search parameter constant for <b>condition</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.indication</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="condition", path="Encounter.indication", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Condition.class 	}
 )
	public static final String SP_CONDITION = "condition";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>condition</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.indication</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam CONDITION = new ReferenceClientParam(SP_CONDITION);

	/**
	 * Search parameter constant for <b>procedure</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.indication</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="procedure", path="Encounter.indication", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Procedure.class 	}
 )
	public static final String SP_PROCEDURE = "procedure";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>procedure</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.indication</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PROCEDURE = new ReferenceClientParam(SP_PROCEDURE);

	/**
	 * Search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.location.location</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="location", path="Encounter.location.location", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Location.class 	}
 )
	public static final String SP_LOCATION = "location";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.location.location</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam LOCATION = new ReferenceClientParam(SP_LOCATION);

	/**
	 * Search parameter constant for <b>location-period</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Encounter.location.period</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="location-period", path="Encounter.location.period", description="", type="date"  )
	public static final String SP_LOCATION_PERIOD = "location-period";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>location-period</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Encounter.location.period</b><br>
	 * </p>
	 */
	public static final DateClientParam LOCATION_PERIOD = new DateClientParam(SP_LOCATION_PERIOD);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="Encounter.type", description="", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>special-arrangement</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.hospitalization.specialArrangement</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="special-arrangement", path="Encounter.hospitalization.specialArrangement", description="", type="token"  )
	public static final String SP_SPECIAL_ARRANGEMENT = "special-arrangement";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>special-arrangement</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.hospitalization.specialArrangement</b><br>
	 * </p>
	 */
	public static final TokenClientParam SPECIAL_ARRANGEMENT = new TokenClientParam(SP_SPECIAL_ARRANGEMENT);

	/**
	 * Search parameter constant for <b>part-of</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.partOf</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="part-of", path="Encounter.partOf", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Encounter.class 	}
 )
	public static final String SP_PART_OF = "part-of";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>part-of</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.partOf</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PART_OF = new ReferenceClientParam(SP_PART_OF);

	/**
	 * Search parameter constant for <b>participant</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.participant.individual</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="participant", path="Encounter.participant.individual", description="", type="reference" , providesMembershipIn={
 @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_PARTICIPANT = "participant";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>participant</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.participant.individual</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PARTICIPANT = new ReferenceClientParam(SP_PARTICIPANT);

	/**
	 * Search parameter constant for <b>participant-type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.participant.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="participant-type", path="Encounter.participant.type", description="", type="token"  )
	public static final String SP_PARTICIPANT_TYPE = "participant-type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>participant-type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Encounter.participant.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam PARTICIPANT_TYPE = new TokenClientParam(SP_PARTICIPANT_TYPE);

	/**
	 * Search parameter constant for <b>episodeofcare</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.episodeOfCare</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="episodeofcare", path="Encounter.episodeOfCare", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare.class 	}
 )
	public static final String SP_EPISODEOFCARE = "episodeofcare";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>episodeofcare</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.episodeOfCare</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam EPISODEOFCARE = new ReferenceClientParam(SP_EPISODEOFCARE);

	/**
	 * Search parameter constant for <b>incomingreferral</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.incomingReferral</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="incomingreferral", path="Encounter.incomingReferral", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.ReferralRequest.class 	}
 )
	public static final String SP_INCOMINGREFERRAL = "incomingreferral";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>incomingreferral</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.incomingReferral</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam INCOMINGREFERRAL = new ReferenceClientParam(SP_INCOMINGREFERRAL);

	/**
	 * Search parameter constant for <b>practitioner</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.participant.individual</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="practitioner", path="Encounter.participant.individual", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Practitioner") 	}
, target={
 ca.uhn.fhir.model.dstu2.resource.Practitioner.class 	}
 )
	public static final String SP_PRACTITIONER = "practitioner";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>practitioner</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Encounter.participant.individual</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PRACTITIONER = new ReferenceClientParam(SP_PRACTITIONER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Encounter:appointment</b>".
	 */
	public static final Include INCLUDE_APPOINTMENT = new Include("Encounter:appointment");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Encounter:condition</b>".
	 */
	public static final Include INCLUDE_CONDITION = new Include("Encounter:condition");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Encounter:episodeofcare</b>".
	 */
	public static final Include INCLUDE_EPISODEOFCARE = new Include("Encounter:episodeofcare");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Encounter:incomingreferral</b>".
	 */
	public static final Include INCLUDE_INCOMINGREFERRAL = new Include("Encounter:incomingreferral");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Encounter:indication</b>".
	 */
	public static final Include INCLUDE_INDICATION = new Include("Encounter:indication");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Encounter:location</b>".
	 */
	public static final Include INCLUDE_LOCATION = new Include("Encounter:location");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Encounter:part-of</b>".
	 */
	public static final Include INCLUDE_PART_OF = new Include("Encounter:part-of");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Encounter:participant</b>".
	 */
	public static final Include INCLUDE_PARTICIPANT = new Include("Encounter:participant");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Encounter:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Encounter:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Encounter:practitioner</b>".
	 */
	public static final Include INCLUDE_PRACTITIONER = new Include("Encounter:practitioner");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Encounter:procedure</b>".
	 */
	public static final Include INCLUDE_PROCEDURE = new Include("Encounter:procedure");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition=""
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="status", type=CodeDt.class, order=1, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition=""
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-state")
	private BoundCodeDt<EncounterStateEnum> myStatus;
	
	@Child(name="statusHistory", order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them"
	)
	private java.util.List<StatusHistory> myStatusHistory;
	
	@Child(name="class", type=CodeDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition=""
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-class")
	private BoundCodeDt<EncounterClassEnum> myClassElement;
	
	@Child(name="type", type=CodeableConceptDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation)"
	)
	private java.util.List<CodeableConceptDt> myType;
	
	@Child(name="priority", type=CodeableConceptDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="grade",
		formalDefinition=""
	)
	private CodeableConceptDt myPriority;
	
	@Child(name="patient", order=6, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition=""
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="episodeOfCare", order=7, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.EpisodeOfCare.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years)"
	)
	private java.util.List<ResourceReferenceDt> myEpisodeOfCare;
	
	@Child(name="incomingReferral", order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.ReferralRequest.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The referral request this encounter satisfies (incoming referral)"
	)
	private java.util.List<ResourceReferenceDt> myIncomingReferral;
	
	@Child(name="participant", order=9, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The list of people responsible for providing the service"
	)
	private java.util.List<Participant> myParticipant;
	
	@Child(name="appointment", order=10, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Appointment.class	})
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private ResourceReferenceDt myAppointment;
	
	@Child(name="period", type=PeriodDt.class, order=11, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.done",
		formalDefinition="The start and end time of the encounter"
	)
	private PeriodDt myPeriod;
	
	@Child(name="length", type=DurationDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Quantity of time the encounter lasted. This excludes the time during leaves of absence."
	)
	private DurationDt myLength;
	
	@Child(name="reason", type=CodeableConceptDt.class, order=13, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="why",
		formalDefinition="Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis"
	)
	private java.util.List<CodeableConceptDt> myReason;
	
	@Child(name="indication", order=14, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Condition.class, 		ca.uhn.fhir.model.dstu2.resource.Procedure.class	})
	@Description(
		shortDefinition="why",
		formalDefinition="Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure"
	)
	private java.util.List<ResourceReferenceDt> myIndication;
	
	@Child(name="hospitalization", order=15, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private Hospitalization myHospitalization;
	
	@Child(name="location", order=16, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="List of locations where  the patient has been during this encounter"
	)
	private java.util.List<Location> myLocation;
	
	@Child(name="serviceProvider", order=17, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization."
	)
	private ResourceReferenceDt myServiceProvider;
	
	@Child(name="partOf", order=18, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Another Encounter of which this encounter is a part of (administratively or in time)."
	)
	private ResourceReferenceDt myPartOf;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myStatus,  myStatusHistory,  myClassElement,  myType,  myPriority,  myPatient,  myEpisodeOfCare,  myIncomingReferral,  myParticipant,  myAppointment,  myPeriod,  myLength,  myReason,  myIndication,  myHospitalization,  myLocation,  myServiceProvider,  myPartOf);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myStatus, myStatusHistory, myClassElement, myType, myPriority, myPatient, myEpisodeOfCare, myIncomingReferral, myParticipant, myAppointment, myPeriod, myLength, myReason, myIndication, myHospitalization, myLocation, myServiceProvider, myPartOf);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
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
     * 
     * </p> 
	 */
	public Encounter setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * 
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
	 * 
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Encounter addIdentifier(IdentifierDt theValue) {
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
     * 
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public BoundCodeDt<EncounterStateEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<EncounterStateEnum>(EncounterStateEnum.VALUESET_BINDER);
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
     * 
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
     * 
     * </p> 
	 */
	public Encounter setStatus(BoundCodeDt<EncounterStateEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Encounter setStatus(EncounterStateEnum theValue) {
		setStatus(new BoundCodeDt<EncounterStateEnum>(EncounterStateEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>statusHistory</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them
     * </p> 
	 */
	public java.util.List<StatusHistory> getStatusHistory() {  
		if (myStatusHistory == null) {
			myStatusHistory = new java.util.ArrayList<StatusHistory>();
		}
		return myStatusHistory;
	}

	/**
	 * Sets the value(s) for <b>statusHistory</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them
     * </p> 
	 */
	public Encounter setStatusHistory(java.util.List<StatusHistory> theValue) {
		myStatusHistory = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>statusHistory</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them
     * </p> 
	 */
	public StatusHistory addStatusHistory() {
		StatusHistory newType = new StatusHistory();
		getStatusHistory().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>statusHistory</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them
	 * </p>
	 * @param theValue The statusHistory to add (must not be <code>null</code>)
	 */
	public Encounter addStatusHistory(StatusHistory theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getStatusHistory().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>statusHistory</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them
     * </p> 
	 */
	public StatusHistory getStatusHistoryFirstRep() {
		if (getStatusHistory().isEmpty()) {
			return addStatusHistory();
		}
		return getStatusHistory().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>class</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public BoundCodeDt<EncounterClassEnum> getClassElementElement() {  
		if (myClassElement == null) {
			myClassElement = new BoundCodeDt<EncounterClassEnum>(EncounterClassEnum.VALUESET_BINDER);
		}
		return myClassElement;
	}

	
	/**
	 * Gets the value(s) for <b>class</b> (class).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public String getClassElement() {  
		return getClassElementElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>class</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Encounter setClassElement(BoundCodeDt<EncounterClassEnum> theValue) {
		myClassElement = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>class</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Encounter setClassElement(EncounterClassEnum theValue) {
		setClassElement(new BoundCodeDt<EncounterClassEnum>(EncounterClassEnum.VALUESET_BINDER, theValue));
		
/*
		getClassElementElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>type</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation)
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getType() {  
		if (myType == null) {
			myType = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation)
     * </p> 
	 */
	public Encounter setType(java.util.List<CodeableConceptDt> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>type</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation)
     * </p> 
	 */
	public CodeableConceptDt addType() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getType().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>type</b> (class)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation)
	 * </p>
	 * @param theValue The type to add (must not be <code>null</code>)
	 */
	public Encounter addType(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getType().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>type</b> (class),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific type of encounter (e.g. e-mail consultation, surgical day-care, skilled nursing, rehabilitation)
     * </p> 
	 */
	public CodeableConceptDt getTypeFirstRep() {
		if (getType().isEmpty()) {
			return addType();
		}
		return getType().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>priority</b> (grade).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeableConceptDt getPriority() {  
		if (myPriority == null) {
			myPriority = new CodeableConceptDt();
		}
		return myPriority;
	}

	/**
	 * Sets the value(s) for <b>priority</b> (grade)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Encounter setPriority(CodeableConceptDt theValue) {
		myPriority = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>patient</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
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
     * 
     * </p> 
	 */
	public Encounter setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>episodeOfCare</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years)
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getEpisodeOfCare() {  
		if (myEpisodeOfCare == null) {
			myEpisodeOfCare = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myEpisodeOfCare;
	}

	/**
	 * Sets the value(s) for <b>episodeOfCare</b> (context)
	 *
     * <p>
     * <b>Definition:</b>
     * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years)
     * </p> 
	 */
	public Encounter setEpisodeOfCare(java.util.List<ResourceReferenceDt> theValue) {
		myEpisodeOfCare = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>episodeOfCare</b> (context)
	 *
     * <p>
     * <b>Definition:</b>
     * Where a specific encounter should be classified as a part of a specific episode(s) of care this field should be used. This association can facilitate grouping of related encounters together for a specific purpose, such as government reporting, issue tracking, association via a common problem.  The association is recorded on the encounter as these are typically created after the episode of care, and grouped on entry rather than editing the episode of care to append another encounter to it (the episode of care could span years)
     * </p> 
	 */
	public ResourceReferenceDt addEpisodeOfCare() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getEpisodeOfCare().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>incomingReferral</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The referral request this encounter satisfies (incoming referral)
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getIncomingReferral() {  
		if (myIncomingReferral == null) {
			myIncomingReferral = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myIncomingReferral;
	}

	/**
	 * Sets the value(s) for <b>incomingReferral</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The referral request this encounter satisfies (incoming referral)
     * </p> 
	 */
	public Encounter setIncomingReferral(java.util.List<ResourceReferenceDt> theValue) {
		myIncomingReferral = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>incomingReferral</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The referral request this encounter satisfies (incoming referral)
     * </p> 
	 */
	public ResourceReferenceDt addIncomingReferral() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getIncomingReferral().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>participant</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The&nbsp;list of&nbsp;people&nbsp;responsible for providing the service
     * </p> 
	 */
	public java.util.List<Participant> getParticipant() {  
		if (myParticipant == null) {
			myParticipant = new java.util.ArrayList<Participant>();
		}
		return myParticipant;
	}

	/**
	 * Sets the value(s) for <b>participant</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The&nbsp;list of&nbsp;people&nbsp;responsible for providing the service
     * </p> 
	 */
	public Encounter setParticipant(java.util.List<Participant> theValue) {
		myParticipant = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>participant</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The&nbsp;list of&nbsp;people&nbsp;responsible for providing the service
     * </p> 
	 */
	public Participant addParticipant() {
		Participant newType = new Participant();
		getParticipant().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>participant</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The&nbsp;list of&nbsp;people&nbsp;responsible for providing the service
	 * </p>
	 * @param theValue The participant to add (must not be <code>null</code>)
	 */
	public Encounter addParticipant(Participant theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getParticipant().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>participant</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The&nbsp;list of&nbsp;people&nbsp;responsible for providing the service
     * </p> 
	 */
	public Participant getParticipantFirstRep() {
		if (getParticipant().isEmpty()) {
			return addParticipant();
		}
		return getParticipant().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>appointment</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ResourceReferenceDt getAppointment() {  
		if (myAppointment == null) {
			myAppointment = new ResourceReferenceDt();
		}
		return myAppointment;
	}

	/**
	 * Sets the value(s) for <b>appointment</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Encounter setAppointment(ResourceReferenceDt theValue) {
		myAppointment = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>period</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The start and end time of the encounter
     * </p> 
	 */
	public PeriodDt getPeriod() {  
		if (myPeriod == null) {
			myPeriod = new PeriodDt();
		}
		return myPeriod;
	}

	/**
	 * Sets the value(s) for <b>period</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * The start and end time of the encounter
     * </p> 
	 */
	public Encounter setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>length</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Quantity of time the encounter lasted. This excludes the time during leaves of absence.
     * </p> 
	 */
	public DurationDt getLength() {  
		if (myLength == null) {
			myLength = new DurationDt();
		}
		return myLength;
	}

	/**
	 * Sets the value(s) for <b>length</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Quantity of time the encounter lasted. This excludes the time during leaves of absence.
     * </p> 
	 */
	public Encounter setLength(DurationDt theValue) {
		myLength = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reason</b> (why).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getReason() {  
		if (myReason == null) {
			myReason = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myReason;
	}

	/**
	 * Sets the value(s) for <b>reason</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis
     * </p> 
	 */
	public Encounter setReason(java.util.List<CodeableConceptDt> theValue) {
		myReason = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reason</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis
     * </p> 
	 */
	public CodeableConceptDt addReason() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getReason().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>reason</b> (why)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis
	 * </p>
	 * @param theValue The reason to add (must not be <code>null</code>)
	 */
	public Encounter addReason(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getReason().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>reason</b> (why),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason the encounter takes place, expressed as a code. For admissions, this can be used for a coded admission diagnosis
     * </p> 
	 */
	public CodeableConceptDt getReasonFirstRep() {
		if (getReason().isEmpty()) {
			return addReason();
		}
		return getReason().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>indication</b> (why).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getIndication() {  
		if (myIndication == null) {
			myIndication = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myIndication;
	}

	/**
	 * Sets the value(s) for <b>indication</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure
     * </p> 
	 */
	public Encounter setIndication(java.util.List<ResourceReferenceDt> theValue) {
		myIndication = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>indication</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * Reason the encounter takes place, as specified using information from another resource. For admissions, this is the admission diagnosis. The indication will typically be a Condition (with other resources referenced in the evidence.detail), or a Procedure
     * </p> 
	 */
	public ResourceReferenceDt addIndication() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getIndication().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>hospitalization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Hospitalization getHospitalization() {  
		if (myHospitalization == null) {
			myHospitalization = new Hospitalization();
		}
		return myHospitalization;
	}

	/**
	 * Sets the value(s) for <b>hospitalization</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Encounter setHospitalization(Hospitalization theValue) {
		myHospitalization = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>location</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * List of locations where  the patient has been during this encounter
     * </p> 
	 */
	public java.util.List<Location> getLocation() {  
		if (myLocation == null) {
			myLocation = new java.util.ArrayList<Location>();
		}
		return myLocation;
	}

	/**
	 * Sets the value(s) for <b>location</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of locations where  the patient has been during this encounter
     * </p> 
	 */
	public Encounter setLocation(java.util.List<Location> theValue) {
		myLocation = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>location</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of locations where  the patient has been during this encounter
     * </p> 
	 */
	public Location addLocation() {
		Location newType = new Location();
		getLocation().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>location</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * List of locations where  the patient has been during this encounter
	 * </p>
	 * @param theValue The location to add (must not be <code>null</code>)
	 */
	public Encounter addLocation(Location theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getLocation().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>location</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * List of locations where  the patient has been during this encounter
     * </p> 
	 */
	public Location getLocationFirstRep() {
		if (getLocation().isEmpty()) {
			return addLocation();
		}
		return getLocation().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>serviceProvider</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.
     * </p> 
	 */
	public ResourceReferenceDt getServiceProvider() {  
		if (myServiceProvider == null) {
			myServiceProvider = new ResourceReferenceDt();
		}
		return myServiceProvider;
	}

	/**
	 * Sets the value(s) for <b>serviceProvider</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An organization that is in charge of maintaining the information of this Encounter (e.g. who maintains the report or the master service catalog item, etc.). This MAY be the same as the organization on the Patient record, however it could be different. This MAY not be not the Service Delivery Location's Organization.
     * </p> 
	 */
	public Encounter setServiceProvider(ResourceReferenceDt theValue) {
		myServiceProvider = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>partOf</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Another Encounter of which this encounter is a part of (administratively or in time).
     * </p> 
	 */
	public ResourceReferenceDt getPartOf() {  
		if (myPartOf == null) {
			myPartOf = new ResourceReferenceDt();
		}
		return myPartOf;
	}

	/**
	 * Sets the value(s) for <b>partOf</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Another Encounter of which this encounter is a part of (administratively or in time).
     * </p> 
	 */
	public Encounter setPartOf(ResourceReferenceDt theValue) {
		myPartOf = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>Encounter.statusHistory</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The status history permits the encounter resource to contain the status history without needing to read through the historical versions of the resource, or even have the server store them
     * </p> 
	 */
	@Block()	
	public static class StatusHistory 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="status", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-state")
	private BoundCodeDt<EncounterStateEnum> myStatus;
	
	@Child(name="period", type=PeriodDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private PeriodDt myPeriod;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myStatus,  myPeriod);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myStatus, myPeriod);
	}

	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public BoundCodeDt<EncounterStateEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<EncounterStateEnum>(EncounterStateEnum.VALUESET_BINDER);
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
     * 
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
     * 
     * </p> 
	 */
	public StatusHistory setStatus(BoundCodeDt<EncounterStateEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public StatusHistory setStatus(EncounterStateEnum theValue) {
		setStatus(new BoundCodeDt<EncounterStateEnum>(EncounterStateEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
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
     * 
     * </p> 
	 */
	public StatusHistory setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Encounter.participant</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The list of people responsible for providing the service
     * </p> 
	 */
	@Block()	
	public static class Participant 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeableConceptDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Role of participant in encounter"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-encounter-participant-type")
	private java.util.List<BoundCodeableConceptDt<ParticipantTypeEnum>> myType;
	
	@Child(name="period", type=PeriodDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The period of time that the specified participant was present during the encounter. These can overlap or be sub-sets of the overall encounters period"
	)
	private PeriodDt myPeriod;
	
	@Child(name="individual", order=2, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="who",
		formalDefinition=""
	)
	private ResourceReferenceDt myIndividual;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myPeriod,  myIndividual);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myPeriod, myIndividual);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in encounter
     * </p> 
	 */
	public java.util.List<BoundCodeableConceptDt<ParticipantTypeEnum>> getType() {  
		if (myType == null) {
			myType = new java.util.ArrayList<BoundCodeableConceptDt<ParticipantTypeEnum>>();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in encounter
     * </p> 
	 */
	public Participant setType(java.util.List<BoundCodeableConceptDt<ParticipantTypeEnum>> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>type</b> () using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addType()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in encounter
     * </p> 
	 */
	public BoundCodeableConceptDt<ParticipantTypeEnum> addType(ParticipantTypeEnum theValue) {
		BoundCodeableConceptDt<ParticipantTypeEnum> retVal = new BoundCodeableConceptDt<ParticipantTypeEnum>(ParticipantTypeEnum.VALUESET_BINDER, theValue);
		getType().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>type</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in encounter
     * </p> 
	 */
	public BoundCodeableConceptDt<ParticipantTypeEnum> getTypeFirstRep() {
		if (getType().size() == 0) {
			addType();
		}
		return getType().get(0);
	}

	/**
	 * Add a value for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in encounter
     * </p> 
	 */
	public BoundCodeableConceptDt<ParticipantTypeEnum> addType() {
		BoundCodeableConceptDt<ParticipantTypeEnum> retVal = new BoundCodeableConceptDt<ParticipantTypeEnum>(ParticipantTypeEnum.VALUESET_BINDER);
		getType().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Role of participant in encounter
     * </p> 
	 */
	public Participant setType(ParticipantTypeEnum theValue) {
		getType().clear();
		addType(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The period of time that the specified participant was present during the encounter. These can overlap or be sub-sets of the overall encounters period
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
     * The period of time that the specified participant was present during the encounter. These can overlap or be sub-sets of the overall encounters period
     * </p> 
	 */
	public Participant setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>individual</b> (who).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ResourceReferenceDt getIndividual() {  
		if (myIndividual == null) {
			myIndividual = new ResourceReferenceDt();
		}
		return myIndividual;
	}

	/**
	 * Sets the value(s) for <b>individual</b> (who)
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Participant setIndividual(ResourceReferenceDt theValue) {
		myIndividual = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Encounter.hospitalization</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	@Block()	
	public static class Hospitalization 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="preAdmissionIdentifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private IdentifierDt myPreAdmissionIdentifier;
	
	@Child(name="origin", order=1, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private ResourceReferenceDt myOrigin;
	
	@Child(name="admitSource", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-encounter-admit-source")
	private BoundCodeableConceptDt<AdmitSourceEnum> myAdmitSource;
	
	@Child(name="admittingDiagnosis", order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Condition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The admitting diagnosis field is used to record the diagnosis codes as reported by admitting practitioner. This could be different or in addition to the conditions reported as reason-condition(s) for the encounter"
	)
	private java.util.List<ResourceReferenceDt> myAdmittingDiagnosis;
	
	@Child(name="reAdmission", type=CodeableConceptDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Whether this hospitalization is a readmission and why if known"
	)
	private CodeableConceptDt myReAdmission;
	
	@Child(name="dietPreference", type=CodeableConceptDt.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<CodeableConceptDt> myDietPreference;
	
	@Child(name="specialCourtesy", type=CodeableConceptDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-encounter-special-courtesy")
	private java.util.List<CodeableConceptDt> mySpecialCourtesy;
	
	@Child(name="specialArrangement", type=CodeableConceptDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-encounter-special-arrangements")
	private java.util.List<CodeableConceptDt> mySpecialArrangement;
	
	@Child(name="destination", order=8, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private ResourceReferenceDt myDestination;
	
	@Child(name="dischargeDisposition", type=CodeableConceptDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-encounter-discharge-disposition")
	private CodeableConceptDt myDischargeDisposition;
	
	@Child(name="dischargeDiagnosis", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Condition.class	})
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<ResourceReferenceDt> myDischargeDiagnosis;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myPreAdmissionIdentifier,  myOrigin,  myAdmitSource,  myAdmittingDiagnosis,  myReAdmission,  myDietPreference,  mySpecialCourtesy,  mySpecialArrangement,  myDestination,  myDischargeDisposition,  myDischargeDiagnosis);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myPreAdmissionIdentifier, myOrigin, myAdmitSource, myAdmittingDiagnosis, myReAdmission, myDietPreference, mySpecialCourtesy, mySpecialArrangement, myDestination, myDischargeDisposition, myDischargeDiagnosis);
	}

	/**
	 * Gets the value(s) for <b>preAdmissionIdentifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public IdentifierDt getPreAdmissionIdentifier() {  
		if (myPreAdmissionIdentifier == null) {
			myPreAdmissionIdentifier = new IdentifierDt();
		}
		return myPreAdmissionIdentifier;
	}

	/**
	 * Sets the value(s) for <b>preAdmissionIdentifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Hospitalization setPreAdmissionIdentifier(IdentifierDt theValue) {
		myPreAdmissionIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>origin</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ResourceReferenceDt getOrigin() {  
		if (myOrigin == null) {
			myOrigin = new ResourceReferenceDt();
		}
		return myOrigin;
	}

	/**
	 * Sets the value(s) for <b>origin</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Hospitalization setOrigin(ResourceReferenceDt theValue) {
		myOrigin = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>admitSource</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public BoundCodeableConceptDt<AdmitSourceEnum> getAdmitSource() {  
		if (myAdmitSource == null) {
			myAdmitSource = new BoundCodeableConceptDt<AdmitSourceEnum>(AdmitSourceEnum.VALUESET_BINDER);
		}
		return myAdmitSource;
	}

	/**
	 * Sets the value(s) for <b>admitSource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Hospitalization setAdmitSource(BoundCodeableConceptDt<AdmitSourceEnum> theValue) {
		myAdmitSource = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>admitSource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Hospitalization setAdmitSource(AdmitSourceEnum theValue) {
		setAdmitSource(new BoundCodeableConceptDt<AdmitSourceEnum>(AdmitSourceEnum.VALUESET_BINDER, theValue));
		
/*
		getAdmitSource().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>admittingDiagnosis</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The admitting diagnosis field is used to record the diagnosis codes as reported by admitting practitioner. This could be different or in addition to the conditions reported as reason-condition(s) for the encounter
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAdmittingDiagnosis() {  
		if (myAdmittingDiagnosis == null) {
			myAdmittingDiagnosis = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAdmittingDiagnosis;
	}

	/**
	 * Sets the value(s) for <b>admittingDiagnosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The admitting diagnosis field is used to record the diagnosis codes as reported by admitting practitioner. This could be different or in addition to the conditions reported as reason-condition(s) for the encounter
     * </p> 
	 */
	public Hospitalization setAdmittingDiagnosis(java.util.List<ResourceReferenceDt> theValue) {
		myAdmittingDiagnosis = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>admittingDiagnosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The admitting diagnosis field is used to record the diagnosis codes as reported by admitting practitioner. This could be different or in addition to the conditions reported as reason-condition(s) for the encounter
     * </p> 
	 */
	public ResourceReferenceDt addAdmittingDiagnosis() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAdmittingDiagnosis().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>reAdmission</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this hospitalization is a readmission and why if known
     * </p> 
	 */
	public CodeableConceptDt getReAdmission() {  
		if (myReAdmission == null) {
			myReAdmission = new CodeableConceptDt();
		}
		return myReAdmission;
	}

	/**
	 * Sets the value(s) for <b>reAdmission</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this hospitalization is a readmission and why if known
     * </p> 
	 */
	public Hospitalization setReAdmission(CodeableConceptDt theValue) {
		myReAdmission = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dietPreference</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getDietPreference() {  
		if (myDietPreference == null) {
			myDietPreference = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myDietPreference;
	}

	/**
	 * Sets the value(s) for <b>dietPreference</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Hospitalization setDietPreference(java.util.List<CodeableConceptDt> theValue) {
		myDietPreference = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>dietPreference</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeableConceptDt addDietPreference() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getDietPreference().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>dietPreference</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The dietPreference to add (must not be <code>null</code>)
	 */
	public Hospitalization addDietPreference(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDietPreference().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>dietPreference</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeableConceptDt getDietPreferenceFirstRep() {
		if (getDietPreference().isEmpty()) {
			return addDietPreference();
		}
		return getDietPreference().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>specialCourtesy</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getSpecialCourtesy() {  
		if (mySpecialCourtesy == null) {
			mySpecialCourtesy = new java.util.ArrayList<CodeableConceptDt>();
		}
		return mySpecialCourtesy;
	}

	/**
	 * Sets the value(s) for <b>specialCourtesy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Hospitalization setSpecialCourtesy(java.util.List<CodeableConceptDt> theValue) {
		mySpecialCourtesy = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>specialCourtesy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeableConceptDt addSpecialCourtesy() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getSpecialCourtesy().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>specialCourtesy</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The specialCourtesy to add (must not be <code>null</code>)
	 */
	public Hospitalization addSpecialCourtesy(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSpecialCourtesy().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>specialCourtesy</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeableConceptDt getSpecialCourtesyFirstRep() {
		if (getSpecialCourtesy().isEmpty()) {
			return addSpecialCourtesy();
		}
		return getSpecialCourtesy().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>specialArrangement</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getSpecialArrangement() {  
		if (mySpecialArrangement == null) {
			mySpecialArrangement = new java.util.ArrayList<CodeableConceptDt>();
		}
		return mySpecialArrangement;
	}

	/**
	 * Sets the value(s) for <b>specialArrangement</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Hospitalization setSpecialArrangement(java.util.List<CodeableConceptDt> theValue) {
		mySpecialArrangement = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>specialArrangement</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeableConceptDt addSpecialArrangement() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getSpecialArrangement().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>specialArrangement</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The specialArrangement to add (must not be <code>null</code>)
	 */
	public Hospitalization addSpecialArrangement(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSpecialArrangement().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>specialArrangement</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeableConceptDt getSpecialArrangementFirstRep() {
		if (getSpecialArrangement().isEmpty()) {
			return addSpecialArrangement();
		}
		return getSpecialArrangement().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>destination</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ResourceReferenceDt getDestination() {  
		if (myDestination == null) {
			myDestination = new ResourceReferenceDt();
		}
		return myDestination;
	}

	/**
	 * Sets the value(s) for <b>destination</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Hospitalization setDestination(ResourceReferenceDt theValue) {
		myDestination = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dischargeDisposition</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public CodeableConceptDt getDischargeDisposition() {  
		if (myDischargeDisposition == null) {
			myDischargeDisposition = new CodeableConceptDt();
		}
		return myDischargeDisposition;
	}

	/**
	 * Sets the value(s) for <b>dischargeDisposition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Hospitalization setDischargeDisposition(CodeableConceptDt theValue) {
		myDischargeDisposition = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dischargeDiagnosis</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getDischargeDiagnosis() {  
		if (myDischargeDiagnosis == null) {
			myDischargeDiagnosis = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myDischargeDiagnosis;
	}

	/**
	 * Sets the value(s) for <b>dischargeDiagnosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Hospitalization setDischargeDiagnosis(java.util.List<ResourceReferenceDt> theValue) {
		myDischargeDiagnosis = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>dischargeDiagnosis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ResourceReferenceDt addDischargeDiagnosis() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getDischargeDiagnosis().add(newType);
		return newType; 
	}
  


	}


	/**
	 * Block class for child element: <b>Encounter.location</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * List of locations where  the patient has been during this encounter
     * </p> 
	 */
	@Block()	
	public static class Location 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="location", order=0, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="where",
		formalDefinition="The location where the encounter takes place"
	)
	private ResourceReferenceDt myLocation;
	
	@Child(name="status", type=CodeDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/encounter-location-status")
	private BoundCodeDt<EncounterLocationStatusEnum> myStatus;
	
	@Child(name="period", type=PeriodDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private PeriodDt myPeriod;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLocation,  myStatus,  myPeriod);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLocation, myStatus, myPeriod);
	}

	/**
	 * Gets the value(s) for <b>location</b> (where).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The location where the encounter takes place
     * </p> 
	 */
	public ResourceReferenceDt getLocation() {  
		if (myLocation == null) {
			myLocation = new ResourceReferenceDt();
		}
		return myLocation;
	}

	/**
	 * Sets the value(s) for <b>location</b> (where)
	 *
     * <p>
     * <b>Definition:</b>
     * The location where the encounter takes place
     * </p> 
	 */
	public Location setLocation(ResourceReferenceDt theValue) {
		myLocation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time
     * </p> 
	 */
	public BoundCodeDt<EncounterLocationStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<EncounterLocationStatusEnum>(EncounterLocationStatusEnum.VALUESET_BINDER);
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
     * The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time
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
     * The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time
     * </p> 
	 */
	public Location setStatus(BoundCodeDt<EncounterLocationStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the participants' presence at the specified location during the period specified. If the participant is is no longer at the location, then the period will have an end date/time
     * </p> 
	 */
	public Location setStatus(EncounterLocationStatusEnum theValue) {
		setStatus(new BoundCodeDt<EncounterLocationStatusEnum>(EncounterLocationStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
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
     * 
     * </p> 
	 */
	public Location setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "Encounter";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
