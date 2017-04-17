















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
 * HAPI/FHIR <b>VisionPrescription</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * An authorization for the supply of glasses and/or contact lenses to a patient.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/VisionPrescription">http://hl7.org/fhir/profiles/VisionPrescription</a> 
 * </p>
 *
 */
@ResourceDef(name="VisionPrescription", profile="http://hl7.org/fhir/profiles/VisionPrescription", id="visionprescription")
public class VisionPrescription extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>datewritten</b>
	 * <p>
	 * Description: <b>Return prescriptions written on this date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>VisionPrescription.dateWritten</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="datewritten", path="VisionPrescription.dateWritten", description="Return prescriptions written on this date", type="date"  )
	public static final String SP_DATEWRITTEN = "datewritten";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>datewritten</b>
	 * <p>
	 * Description: <b>Return prescriptions written on this date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>VisionPrescription.dateWritten</b><br>
	 * </p>
	 */
	public static final DateClientParam DATEWRITTEN = new DateClientParam(SP_DATEWRITTEN);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>Return prescriptions with this encounter identifier</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>VisionPrescription.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="VisionPrescription.encounter", description="Return prescriptions with this encounter identifier", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>Return prescriptions with this encounter identifier</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>VisionPrescription.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Return prescriptions with this external identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>VisionPrescription.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="VisionPrescription.identifier", description="Return prescriptions with this external identifier", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Return prescriptions with this external identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>VisionPrescription.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of a patient to list dispenses for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>VisionPrescription.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="VisionPrescription.patient", description="The identity of a patient to list dispenses for", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of a patient to list dispenses for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>VisionPrescription.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>prescriber</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>VisionPrescription.prescriber</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="prescriber", path="VisionPrescription.prescriber", description="", type="reference" , providesMembershipIn={
 @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_PRESCRIBER = "prescriber";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>prescriber</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>VisionPrescription.prescriber</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PRESCRIBER = new ReferenceClientParam(SP_PRESCRIBER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>VisionPrescription:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("VisionPrescription:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>VisionPrescription:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("VisionPrescription:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>VisionPrescription:prescriber</b>".
	 */
	public static final Include INCLUDE_PRESCRIBER = new Include("VisionPrescription:prescriber");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Business identifier which may be used by other parties to reference or identify the prescription."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="dateWritten", type=DateTimeDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date (and perhaps time) when the prescription was written"
	)
	private DateTimeDt myDateWritten;
	
	@Child(name="patient", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A link to a resource representing the person to whom the vision products will be supplied."
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="prescriber", order=3, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The healthcare professional responsible for authorizing the prescription"
	)
	private ResourceReferenceDt myPrescriber;
	
	@Child(name="encounter", order=4, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A link to a resource that identifies the particular occurrence of contact between patient and health care provider."
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="reason", order=5, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		Condition.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Can be the reason or the indication for writing the prescription."
	)
	private IDatatype myReason;
	
	@Child(name="dispense", order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Deals with details of the dispense part of the supply specification."
	)
	private java.util.List<Dispense> myDispense;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myDateWritten,  myPatient,  myPrescriber,  myEncounter,  myReason,  myDispense);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myDateWritten, myPatient, myPrescriber, myEncounter, myReason, myDispense);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Business identifier which may be used by other parties to reference or identify the prescription.
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
     * Business identifier which may be used by other parties to reference or identify the prescription.
     * </p> 
	 */
	public VisionPrescription setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Business identifier which may be used by other parties to reference or identify the prescription.
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
	 * Business identifier which may be used by other parties to reference or identify the prescription.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public VisionPrescription addIdentifier(IdentifierDt theValue) {
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
     * Business identifier which may be used by other parties to reference or identify the prescription.
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>dateWritten</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was written
     * </p> 
	 */
	public DateTimeDt getDateWrittenElement() {  
		if (myDateWritten == null) {
			myDateWritten = new DateTimeDt();
		}
		return myDateWritten;
	}

	
	/**
	 * Gets the value(s) for <b>dateWritten</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was written
     * </p> 
	 */
	public Date getDateWritten() {  
		return getDateWrittenElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>dateWritten</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was written
     * </p> 
	 */
	public VisionPrescription setDateWritten(DateTimeDt theValue) {
		myDateWritten = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>dateWritten</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was written
     * </p> 
	 */
	public VisionPrescription setDateWritten( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDateWritten = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>dateWritten</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and perhaps time) when the prescription was written
     * </p> 
	 */
	public VisionPrescription setDateWrittenWithSecondsPrecision( Date theDate) {
		myDateWritten = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>patient</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A link to a resource representing the person to whom the vision products will be supplied.
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
     * A link to a resource representing the person to whom the vision products will be supplied.
     * </p> 
	 */
	public VisionPrescription setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>prescriber</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The healthcare professional responsible for authorizing the prescription
     * </p> 
	 */
	public ResourceReferenceDt getPrescriber() {  
		if (myPrescriber == null) {
			myPrescriber = new ResourceReferenceDt();
		}
		return myPrescriber;
	}

	/**
	 * Sets the value(s) for <b>prescriber</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The healthcare professional responsible for authorizing the prescription
     * </p> 
	 */
	public VisionPrescription setPrescriber(ResourceReferenceDt theValue) {
		myPrescriber = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>encounter</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A link to a resource that identifies the particular occurrence of contact between patient and health care provider.
     * </p> 
	 */
	public ResourceReferenceDt getEncounter() {  
		if (myEncounter == null) {
			myEncounter = new ResourceReferenceDt();
		}
		return myEncounter;
	}

	/**
	 * Sets the value(s) for <b>encounter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A link to a resource that identifies the particular occurrence of contact between patient and health care provider.
     * </p> 
	 */
	public VisionPrescription setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reason[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Can be the reason or the indication for writing the prescription.
     * </p> 
	 */
	public IDatatype getReason() {  
		return myReason;
	}

	/**
	 * Sets the value(s) for <b>reason[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Can be the reason or the indication for writing the prescription.
     * </p> 
	 */
	public VisionPrescription setReason(IDatatype theValue) {
		myReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dispense</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Deals with details of the dispense part of the supply specification.
     * </p> 
	 */
	public java.util.List<Dispense> getDispense() {  
		if (myDispense == null) {
			myDispense = new java.util.ArrayList<Dispense>();
		}
		return myDispense;
	}

	/**
	 * Sets the value(s) for <b>dispense</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Deals with details of the dispense part of the supply specification.
     * </p> 
	 */
	public VisionPrescription setDispense(java.util.List<Dispense> theValue) {
		myDispense = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>dispense</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Deals with details of the dispense part of the supply specification.
     * </p> 
	 */
	public Dispense addDispense() {
		Dispense newType = new Dispense();
		getDispense().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>dispense</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Deals with details of the dispense part of the supply specification.
	 * </p>
	 * @param theValue The dispense to add (must not be <code>null</code>)
	 */
	public VisionPrescription addDispense(Dispense theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getDispense().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>dispense</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Deals with details of the dispense part of the supply specification.
     * </p> 
	 */
	public Dispense getDispenseFirstRep() {
		if (getDispense().isEmpty()) {
			return addDispense();
		}
		return getDispense().get(0); 
	}
  
	/**
	 * Block class for child element: <b>VisionPrescription.dispense</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Deals with details of the dispense part of the supply specification.
     * </p> 
	 */
	@Block()	
	public static class Dispense 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="product", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the type of vision correction product which is required for the patient."
	)
	private CodingDt myProduct;
	
	@Child(name="eye", type=CodeDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The eye for which the lens applies."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/vision-eye-codes")
	private BoundCodeDt<VisionEyesEnum> myEye;
	
	@Child(name="sphere", type=DecimalDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Lens power measured in diopters (0.25 units)."
	)
	private DecimalDt mySphere;
	
	@Child(name="cylinder", type=DecimalDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Power adjustment for astigmatism measured in diopters (0.25 units)."
	)
	private DecimalDt myCylinder;
	
	@Child(name="axis", type=IntegerDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Adjustment for astigmatism measured in integer degrees."
	)
	private IntegerDt myAxis;
	
	@Child(name="prism", type=DecimalDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Amount of prism to compensate for eye alignment in fractional units."
	)
	private DecimalDt myPrism;
	
	@Child(name="base", type=CodeDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The relative base, or reference lens edge, for the prism."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/vision-base-codes")
	private BoundCodeDt<VisionBaseEnum> myBase;
	
	@Child(name="add", type=DecimalDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Power adjustment for multifocal lenses measured in diopters (0.25 units)."
	)
	private DecimalDt myAdd;
	
	@Child(name="power", type=DecimalDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contact lens power measured in diopters (0.25 units)."
	)
	private DecimalDt myPower;
	
	@Child(name="backCurve", type=DecimalDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Back curvature measured in millimeters."
	)
	private DecimalDt myBackCurve;
	
	@Child(name="diameter", type=DecimalDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contact lens diameter measured in millimeters."
	)
	private DecimalDt myDiameter;
	
	@Child(name="duration", type=SimpleQuantityDt.class, order=11, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The recommended maximum wear period for the lens."
	)
	private SimpleQuantityDt myDuration;
	
	@Child(name="color", type=StringDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Special color or pattern."
	)
	private StringDt myColor;
	
	@Child(name="brand", type=StringDt.class, order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Brand recommendations or restrictions."
	)
	private StringDt myBrand;
	
	@Child(name="notes", type=StringDt.class, order=14, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Notes for special requirements such as coatings and lens materials."
	)
	private StringDt myNotes;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myProduct,  myEye,  mySphere,  myCylinder,  myAxis,  myPrism,  myBase,  myAdd,  myPower,  myBackCurve,  myDiameter,  myDuration,  myColor,  myBrand,  myNotes);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myProduct, myEye, mySphere, myCylinder, myAxis, myPrism, myBase, myAdd, myPower, myBackCurve, myDiameter, myDuration, myColor, myBrand, myNotes);
	}

	/**
	 * Gets the value(s) for <b>product</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the type of vision correction product which is required for the patient.
     * </p> 
	 */
	public CodingDt getProduct() {  
		if (myProduct == null) {
			myProduct = new CodingDt();
		}
		return myProduct;
	}

	/**
	 * Sets the value(s) for <b>product</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the type of vision correction product which is required for the patient.
     * </p> 
	 */
	public Dispense setProduct(CodingDt theValue) {
		myProduct = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>eye</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The eye for which the lens applies.
     * </p> 
	 */
	public BoundCodeDt<VisionEyesEnum> getEyeElement() {  
		if (myEye == null) {
			myEye = new BoundCodeDt<VisionEyesEnum>(VisionEyesEnum.VALUESET_BINDER);
		}
		return myEye;
	}

	
	/**
	 * Gets the value(s) for <b>eye</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The eye for which the lens applies.
     * </p> 
	 */
	public String getEye() {  
		return getEyeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>eye</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The eye for which the lens applies.
     * </p> 
	 */
	public Dispense setEye(BoundCodeDt<VisionEyesEnum> theValue) {
		myEye = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>eye</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The eye for which the lens applies.
     * </p> 
	 */
	public Dispense setEye(VisionEyesEnum theValue) {
		setEye(new BoundCodeDt<VisionEyesEnum>(VisionEyesEnum.VALUESET_BINDER, theValue));
		
/*
		getEyeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>sphere</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public DecimalDt getSphereElement() {  
		if (mySphere == null) {
			mySphere = new DecimalDt();
		}
		return mySphere;
	}

	
	/**
	 * Gets the value(s) for <b>sphere</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public BigDecimal getSphere() {  
		return getSphereElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sphere</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setSphere(DecimalDt theValue) {
		mySphere = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sphere</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setSphere( long theValue) {
		mySphere = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>sphere</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setSphere( double theValue) {
		mySphere = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>sphere</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setSphere( java.math.BigDecimal theValue) {
		mySphere = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>cylinder</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for astigmatism measured in diopters (0.25 units).
     * </p> 
	 */
	public DecimalDt getCylinderElement() {  
		if (myCylinder == null) {
			myCylinder = new DecimalDt();
		}
		return myCylinder;
	}

	
	/**
	 * Gets the value(s) for <b>cylinder</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for astigmatism measured in diopters (0.25 units).
     * </p> 
	 */
	public BigDecimal getCylinder() {  
		return getCylinderElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>cylinder</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for astigmatism measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setCylinder(DecimalDt theValue) {
		myCylinder = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>cylinder</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for astigmatism measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setCylinder( long theValue) {
		myCylinder = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>cylinder</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for astigmatism measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setCylinder( double theValue) {
		myCylinder = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>cylinder</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for astigmatism measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setCylinder( java.math.BigDecimal theValue) {
		myCylinder = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>axis</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Adjustment for astigmatism measured in integer degrees.
     * </p> 
	 */
	public IntegerDt getAxisElement() {  
		if (myAxis == null) {
			myAxis = new IntegerDt();
		}
		return myAxis;
	}

	
	/**
	 * Gets the value(s) for <b>axis</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Adjustment for astigmatism measured in integer degrees.
     * </p> 
	 */
	public Integer getAxis() {  
		return getAxisElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>axis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Adjustment for astigmatism measured in integer degrees.
     * </p> 
	 */
	public Dispense setAxis(IntegerDt theValue) {
		myAxis = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>axis</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Adjustment for astigmatism measured in integer degrees.
     * </p> 
	 */
	public Dispense setAxis( int theInteger) {
		myAxis = new IntegerDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>prism</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Amount of prism to compensate for eye alignment in fractional units.
     * </p> 
	 */
	public DecimalDt getPrismElement() {  
		if (myPrism == null) {
			myPrism = new DecimalDt();
		}
		return myPrism;
	}

	
	/**
	 * Gets the value(s) for <b>prism</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Amount of prism to compensate for eye alignment in fractional units.
     * </p> 
	 */
	public BigDecimal getPrism() {  
		return getPrismElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>prism</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Amount of prism to compensate for eye alignment in fractional units.
     * </p> 
	 */
	public Dispense setPrism(DecimalDt theValue) {
		myPrism = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>prism</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Amount of prism to compensate for eye alignment in fractional units.
     * </p> 
	 */
	public Dispense setPrism( long theValue) {
		myPrism = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>prism</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Amount of prism to compensate for eye alignment in fractional units.
     * </p> 
	 */
	public Dispense setPrism( double theValue) {
		myPrism = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>prism</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Amount of prism to compensate for eye alignment in fractional units.
     * </p> 
	 */
	public Dispense setPrism( java.math.BigDecimal theValue) {
		myPrism = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>base</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The relative base, or reference lens edge, for the prism.
     * </p> 
	 */
	public BoundCodeDt<VisionBaseEnum> getBaseElement() {  
		if (myBase == null) {
			myBase = new BoundCodeDt<VisionBaseEnum>(VisionBaseEnum.VALUESET_BINDER);
		}
		return myBase;
	}

	
	/**
	 * Gets the value(s) for <b>base</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The relative base, or reference lens edge, for the prism.
     * </p> 
	 */
	public String getBase() {  
		return getBaseElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>base</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The relative base, or reference lens edge, for the prism.
     * </p> 
	 */
	public Dispense setBase(BoundCodeDt<VisionBaseEnum> theValue) {
		myBase = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>base</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The relative base, or reference lens edge, for the prism.
     * </p> 
	 */
	public Dispense setBase(VisionBaseEnum theValue) {
		setBase(new BoundCodeDt<VisionBaseEnum>(VisionBaseEnum.VALUESET_BINDER, theValue));
		
/*
		getBaseElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>add</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for multifocal lenses measured in diopters (0.25 units).
     * </p> 
	 */
	public DecimalDt getAddElement() {  
		if (myAdd == null) {
			myAdd = new DecimalDt();
		}
		return myAdd;
	}

	
	/**
	 * Gets the value(s) for <b>add</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for multifocal lenses measured in diopters (0.25 units).
     * </p> 
	 */
	public BigDecimal getAdd() {  
		return getAddElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>add</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for multifocal lenses measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setAdd(DecimalDt theValue) {
		myAdd = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>add</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for multifocal lenses measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setAdd( long theValue) {
		myAdd = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>add</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for multifocal lenses measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setAdd( double theValue) {
		myAdd = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>add</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Power adjustment for multifocal lenses measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setAdd( java.math.BigDecimal theValue) {
		myAdd = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>power</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public DecimalDt getPowerElement() {  
		if (myPower == null) {
			myPower = new DecimalDt();
		}
		return myPower;
	}

	
	/**
	 * Gets the value(s) for <b>power</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public BigDecimal getPower() {  
		return getPowerElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>power</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setPower(DecimalDt theValue) {
		myPower = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>power</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setPower( long theValue) {
		myPower = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>power</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setPower( double theValue) {
		myPower = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>power</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens power measured in diopters (0.25 units).
     * </p> 
	 */
	public Dispense setPower( java.math.BigDecimal theValue) {
		myPower = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>backCurve</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Back curvature measured in millimeters.
     * </p> 
	 */
	public DecimalDt getBackCurveElement() {  
		if (myBackCurve == null) {
			myBackCurve = new DecimalDt();
		}
		return myBackCurve;
	}

	
	/**
	 * Gets the value(s) for <b>backCurve</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Back curvature measured in millimeters.
     * </p> 
	 */
	public BigDecimal getBackCurve() {  
		return getBackCurveElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>backCurve</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Back curvature measured in millimeters.
     * </p> 
	 */
	public Dispense setBackCurve(DecimalDt theValue) {
		myBackCurve = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>backCurve</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Back curvature measured in millimeters.
     * </p> 
	 */
	public Dispense setBackCurve( long theValue) {
		myBackCurve = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>backCurve</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Back curvature measured in millimeters.
     * </p> 
	 */
	public Dispense setBackCurve( double theValue) {
		myBackCurve = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>backCurve</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Back curvature measured in millimeters.
     * </p> 
	 */
	public Dispense setBackCurve( java.math.BigDecimal theValue) {
		myBackCurve = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>diameter</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens diameter measured in millimeters.
     * </p> 
	 */
	public DecimalDt getDiameterElement() {  
		if (myDiameter == null) {
			myDiameter = new DecimalDt();
		}
		return myDiameter;
	}

	
	/**
	 * Gets the value(s) for <b>diameter</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens diameter measured in millimeters.
     * </p> 
	 */
	public BigDecimal getDiameter() {  
		return getDiameterElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>diameter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens diameter measured in millimeters.
     * </p> 
	 */
	public Dispense setDiameter(DecimalDt theValue) {
		myDiameter = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>diameter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens diameter measured in millimeters.
     * </p> 
	 */
	public Dispense setDiameter( long theValue) {
		myDiameter = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>diameter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens diameter measured in millimeters.
     * </p> 
	 */
	public Dispense setDiameter( double theValue) {
		myDiameter = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>diameter</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contact lens diameter measured in millimeters.
     * </p> 
	 */
	public Dispense setDiameter( java.math.BigDecimal theValue) {
		myDiameter = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>duration</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The recommended maximum wear period for the lens.
     * </p> 
	 */
	public SimpleQuantityDt getDuration() {  
		if (myDuration == null) {
			myDuration = new SimpleQuantityDt();
		}
		return myDuration;
	}

	/**
	 * Sets the value(s) for <b>duration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The recommended maximum wear period for the lens.
     * </p> 
	 */
	public Dispense setDuration(SimpleQuantityDt theValue) {
		myDuration = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>color</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Special color or pattern.
     * </p> 
	 */
	public StringDt getColorElement() {  
		if (myColor == null) {
			myColor = new StringDt();
		}
		return myColor;
	}

	
	/**
	 * Gets the value(s) for <b>color</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Special color or pattern.
     * </p> 
	 */
	public String getColor() {  
		return getColorElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>color</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Special color or pattern.
     * </p> 
	 */
	public Dispense setColor(StringDt theValue) {
		myColor = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>color</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Special color or pattern.
     * </p> 
	 */
	public Dispense setColor( String theString) {
		myColor = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>brand</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Brand recommendations or restrictions.
     * </p> 
	 */
	public StringDt getBrandElement() {  
		if (myBrand == null) {
			myBrand = new StringDt();
		}
		return myBrand;
	}

	
	/**
	 * Gets the value(s) for <b>brand</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Brand recommendations or restrictions.
     * </p> 
	 */
	public String getBrand() {  
		return getBrandElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>brand</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Brand recommendations or restrictions.
     * </p> 
	 */
	public Dispense setBrand(StringDt theValue) {
		myBrand = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>brand</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Brand recommendations or restrictions.
     * </p> 
	 */
	public Dispense setBrand( String theString) {
		myBrand = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>notes</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Notes for special requirements such as coatings and lens materials.
     * </p> 
	 */
	public StringDt getNotesElement() {  
		if (myNotes == null) {
			myNotes = new StringDt();
		}
		return myNotes;
	}

	
	/**
	 * Gets the value(s) for <b>notes</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Notes for special requirements such as coatings and lens materials.
     * </p> 
	 */
	public String getNotes() {  
		return getNotesElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>notes</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Notes for special requirements such as coatings and lens materials.
     * </p> 
	 */
	public Dispense setNotes(StringDt theValue) {
		myNotes = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>notes</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Notes for special requirements such as coatings and lens materials.
     * </p> 
	 */
	public Dispense setNotes( String theString) {
		myNotes = new StringDt(theString); 
		return this; 
	}

 


	}




    @Override
    public String getResourceName() {
        return "VisionPrescription";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
