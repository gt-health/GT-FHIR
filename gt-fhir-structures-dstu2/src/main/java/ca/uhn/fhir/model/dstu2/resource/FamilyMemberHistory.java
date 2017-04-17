















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
 * HAPI/FHIR <b>FamilyMemberHistory</b> Resource
 * (clinical.general)
 *
 * <p>
 * <b>Definition:</b>
 * Significant health events and conditions for a person related to the patient relevant in the context of care for the patient.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/FamilyMemberHistory">http://hl7.org/fhir/profiles/FamilyMemberHistory</a> 
 * </p>
 *
 */
@ResourceDef(name="FamilyMemberHistory", profile="http://hl7.org/fhir/profiles/FamilyMemberHistory", id="familymemberhistory")
public class FamilyMemberHistory extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>FamilyMemberHistory.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="FamilyMemberHistory.date", description="", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>FamilyMemberHistory.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of a subject to list family member history items for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>FamilyMemberHistory.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="FamilyMemberHistory.patient", description="The identity of a subject to list family member history items for", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
, target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of a subject to list family member history items for</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>FamilyMemberHistory.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>A search by a condition code</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>FamilyMemberHistory.condition.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="FamilyMemberHistory.condition.code", description="A search by a condition code", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>A search by a condition code</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>FamilyMemberHistory.condition.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A search by a record identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>FamilyMemberHistory.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="FamilyMemberHistory.identifier", description="A search by a record identifier", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A search by a record identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>FamilyMemberHistory.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>relationship</b>
	 * <p>
	 * Description: <b>A search by a relationship type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>FamilyMemberHistory.relationship</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="relationship", path="FamilyMemberHistory.relationship", description="A search by a relationship type", type="token"  )
	public static final String SP_RELATIONSHIP = "relationship";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>relationship</b>
	 * <p>
	 * Description: <b>A search by a relationship type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>FamilyMemberHistory.relationship</b><br>
	 * </p>
	 */
	public static final TokenClientParam RELATIONSHIP = new TokenClientParam(SP_RELATIONSHIP);

	/**
	 * Search parameter constant for <b>gender</b>
	 * <p>
	 * Description: <b>A search by a gender code of a family member</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>FamilyMemberHistory.gender</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="gender", path="FamilyMemberHistory.gender", description="A search by a gender code of a family member", type="token"  )
	public static final String SP_GENDER = "gender";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>gender</b>
	 * <p>
	 * Description: <b>A search by a gender code of a family member</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>FamilyMemberHistory.gender</b><br>
	 * </p>
	 */
	public static final TokenClientParam GENDER = new TokenClientParam(SP_GENDER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>FamilyMemberHistory:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("FamilyMemberHistory:patient");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="patient", order=1, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The person who this history concerns"
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="date", type=DateTimeDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date (and possibly time) when the family member history was taken"
	)
	private DateTimeDt myDate;
	
	@Child(name="status", type=CodeDt.class, order=3, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="A code specifying a state of a Family Member History record."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/history-status")
	private BoundCodeDt<FamilyHistoryStatusEnum> myStatus;
	
	@Child(name="name", type=StringDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This will either be a name or a description; e.g. \"Aunt Susan\", \"my cousin with the red hair\""
	)
	private StringDt myName;
	
	@Child(name="relationship", type=CodeableConceptDt.class, order=5, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of relationship this person has to the patient (father, mother, brother etc.)"
	)
	private CodeableConceptDt myRelationship;
	
	@Child(name="gender", type=CodeDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/administrative-gender")
	private BoundCodeDt<AdministrativeGenderEnum> myGender;
	
	@Child(name="born", order=7, min=0, max=1, summary=false, modifier=false, type={
		PeriodDt.class, 		DateDt.class, 		StringDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The actual or approximate date of birth of the relative"
	)
	private IDatatype myBorn;
	
	@Child(name="age", order=8, min=0, max=1, summary=false, modifier=false, type={
		AgeDt.class, 		RangeDt.class, 		StringDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The actual or approximate age of the relative at the time the family member history is recorded"
	)
	private IDatatype myAge;
	
	@Child(name="deceased", order=9, min=0, max=1, summary=false, modifier=false, type={
		BooleanDt.class, 		AgeDt.class, 		RangeDt.class, 		DateDt.class, 		StringDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record"
	)
	private IDatatype myDeceased;
	
	@Child(name="note", type=AnnotationDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible."
	)
	private AnnotationDt myNote;
	
	@Child(name="condition", order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition."
	)
	private java.util.List<Condition> myCondition;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myPatient,  myDate,  myStatus,  myName,  myRelationship,  myGender,  myBorn,  myAge,  myDeceased,  myNote,  myCondition);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myPatient, myDate, myStatus, myName, myRelationship, myGender, myBorn, myAge, myDeceased, myNote, myCondition);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
     * This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
     * </p> 
	 */
	public FamilyMemberHistory setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
	 * This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public FamilyMemberHistory addIdentifier(IdentifierDt theValue) {
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
     * This records identifiers associated with this family member history record that are defined by business processes and/ or used to refer to it when a direct URL reference to the resource itself is not appropriate (e.g. in CDA documents, or in written / printed documentation)
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
     * The person who this history concerns
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
     * The person who this history concerns
     * </p> 
	 */
	public FamilyMemberHistory setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>date</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and possibly time) when the family member history was taken
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
     * The date (and possibly time) when the family member history was taken
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
     * The date (and possibly time) when the family member history was taken
     * </p> 
	 */
	public FamilyMemberHistory setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and possibly time) when the family member history was taken
     * </p> 
	 */
	public FamilyMemberHistory setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date (and possibly time) when the family member history was taken
     * </p> 
	 */
	public FamilyMemberHistory setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying a state of a Family Member History record.
     * </p> 
	 */
	public BoundCodeDt<FamilyHistoryStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<FamilyHistoryStatusEnum>(FamilyHistoryStatusEnum.VALUESET_BINDER);
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
     * A code specifying a state of a Family Member History record.
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
     * A code specifying a state of a Family Member History record.
     * </p> 
	 */
	public FamilyMemberHistory setStatus(BoundCodeDt<FamilyHistoryStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying a state of a Family Member History record.
     * </p> 
	 */
	public FamilyMemberHistory setStatus(FamilyHistoryStatusEnum theValue) {
		setStatus(new BoundCodeDt<FamilyHistoryStatusEnum>(FamilyHistoryStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This will either be a name or a description; e.g. \&quot;Aunt Susan\&quot;, \&quot;my cousin with the red hair\&quot;
     * </p> 
	 */
	public StringDt getNameElement() {  
		if (myName == null) {
			myName = new StringDt();
		}
		return myName;
	}

	
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This will either be a name or a description; e.g. \&quot;Aunt Susan\&quot;, \&quot;my cousin with the red hair\&quot;
     * </p> 
	 */
	public String getName() {  
		return getNameElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This will either be a name or a description; e.g. \&quot;Aunt Susan\&quot;, \&quot;my cousin with the red hair\&quot;
     * </p> 
	 */
	public FamilyMemberHistory setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This will either be a name or a description; e.g. \&quot;Aunt Susan\&quot;, \&quot;my cousin with the red hair\&quot;
     * </p> 
	 */
	public FamilyMemberHistory setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>relationship</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of relationship this person has to the patient (father, mother, brother etc.)
     * </p> 
	 */
	public CodeableConceptDt getRelationship() {  
		if (myRelationship == null) {
			myRelationship = new CodeableConceptDt();
		}
		return myRelationship;
	}

	/**
	 * Sets the value(s) for <b>relationship</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of relationship this person has to the patient (father, mother, brother etc.)
     * </p> 
	 */
	public FamilyMemberHistory setRelationship(CodeableConceptDt theValue) {
		myRelationship = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>gender</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
     * </p> 
	 */
	public BoundCodeDt<AdministrativeGenderEnum> getGenderElement() {  
		if (myGender == null) {
			myGender = new BoundCodeDt<AdministrativeGenderEnum>(AdministrativeGenderEnum.VALUESET_BINDER);
		}
		return myGender;
	}

	
	/**
	 * Gets the value(s) for <b>gender</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
     * </p> 
	 */
	public String getGender() {  
		return getGenderElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>gender</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
     * </p> 
	 */
	public FamilyMemberHistory setGender(BoundCodeDt<AdministrativeGenderEnum> theValue) {
		myGender = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>gender</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the relative is considered to have for administration and record keeping purposes.
     * </p> 
	 */
	public FamilyMemberHistory setGender(AdministrativeGenderEnum theValue) {
		setGender(new BoundCodeDt<AdministrativeGenderEnum>(AdministrativeGenderEnum.VALUESET_BINDER, theValue));
		
/*
		getGenderElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>born[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual or approximate date of birth of the relative
     * </p> 
	 */
	public IDatatype getBorn() {  
		return myBorn;
	}

	/**
	 * Sets the value(s) for <b>born[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual or approximate date of birth of the relative
     * </p> 
	 */
	public FamilyMemberHistory setBorn(IDatatype theValue) {
		myBorn = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>age[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual or approximate age of the relative at the time the family member history is recorded
     * </p> 
	 */
	public IDatatype getAge() {  
		return myAge;
	}

	/**
	 * Sets the value(s) for <b>age[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The actual or approximate age of the relative at the time the family member history is recorded
     * </p> 
	 */
	public FamilyMemberHistory setAge(IDatatype theValue) {
		myAge = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>deceased[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record
     * </p> 
	 */
	public IDatatype getDeceased() {  
		return myDeceased;
	}

	/**
	 * Sets the value(s) for <b>deceased[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Deceased flag or the actual or approximate age of the relative at the time of death for the family member history record
     * </p> 
	 */
	public FamilyMemberHistory setDeceased(IDatatype theValue) {
		myDeceased = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
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
     * This property allows a non condition-specific note to the made about the related person. Ideally, the note would be in the condition property, but this is not always possible.
     * </p> 
	 */
	public FamilyMemberHistory setNote(AnnotationDt theValue) {
		myNote = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>condition</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
     * </p> 
	 */
	public java.util.List<Condition> getCondition() {  
		if (myCondition == null) {
			myCondition = new java.util.ArrayList<Condition>();
		}
		return myCondition;
	}

	/**
	 * Sets the value(s) for <b>condition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
     * </p> 
	 */
	public FamilyMemberHistory setCondition(java.util.List<Condition> theValue) {
		myCondition = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>condition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
     * </p> 
	 */
	public Condition addCondition() {
		Condition newType = new Condition();
		getCondition().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>condition</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
	 * </p>
	 * @param theValue The condition to add (must not be <code>null</code>)
	 */
	public FamilyMemberHistory addCondition(Condition theValue) {
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
     * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
     * </p> 
	 */
	public Condition getConditionFirstRep() {
		if (getCondition().isEmpty()) {
			return addCondition();
		}
		return getCondition().get(0); 
	}
  
	/**
	 * Block class for child element: <b>FamilyMemberHistory.condition</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The significant Conditions (or condition) that the family member had. This is a repeating section to allow a system to represent more than one condition per resource, though there is nothing stopping multiple resources - one per condition.
     * </p> 
	 */
	@Block()	
	public static class Condition 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system"
	)
	private CodeableConceptDt myCode;
	
	@Child(name="outcome", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation."
	)
	private CodeableConceptDt myOutcome;
	
	@Child(name="onset", order=2, min=0, max=1, summary=false, modifier=false, type={
		AgeDt.class, 		RangeDt.class, 		PeriodDt.class, 		StringDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence."
	)
	private IDatatype myOnset;
	
	@Child(name="note", type=AnnotationDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An area where general notes can be placed about this specific condition."
	)
	private AnnotationDt myNote;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myOutcome,  myOnset,  myNote);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myOutcome, myOnset, myNote);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system
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
     * The actual condition specified. Could be a coded condition (like MI or Diabetes) or a less specific string like 'cancer' depending on how much is known about the condition and the capabilities of the creating system
     * </p> 
	 */
	public Condition setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>outcome</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.
     * </p> 
	 */
	public CodeableConceptDt getOutcome() {  
		if (myOutcome == null) {
			myOutcome = new CodeableConceptDt();
		}
		return myOutcome;
	}

	/**
	 * Sets the value(s) for <b>outcome</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates what happened as a result of this condition.  If the condition resulted in death, deceased date is captured on the relation.
     * </p> 
	 */
	public Condition setOutcome(CodeableConceptDt theValue) {
		myOutcome = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>onset[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
     * </p> 
	 */
	public IDatatype getOnset() {  
		return myOnset;
	}

	/**
	 * Sets the value(s) for <b>onset[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Either the age of onset, range of approximate age or descriptive string can be recorded.  For conditions with multiple occurrences, this describes the first known occurrence.
     * </p> 
	 */
	public Condition setOnset(IDatatype theValue) {
		myOnset = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>note</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An area where general notes can be placed about this specific condition.
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
     * An area where general notes can be placed about this specific condition.
     * </p> 
	 */
	public Condition setNote(AnnotationDt theValue) {
		myNote = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "FamilyMemberHistory";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
