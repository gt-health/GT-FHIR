















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
 * HAPI/FHIR <b>Patient</b> Resource
 * (administrative.individual)
 *
 * <p>
 * <b>Definition:</b>
 * Demographics and other administrative information about an individual or animal receiving care or other health-related services.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Tracking patient is the center of the healthcare process
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Patient">http://hl7.org/fhir/profiles/Patient</a> 
 * </p>
 *
 */
@ResourceDef(name="Patient", profile="http://hl7.org/fhir/profiles/Patient", id="patient")
public class Patient extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A patient identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Patient.identifier", description="A patient identifier", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A patient identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A portion of either family or given name of the patient</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="Patient.name", description="A portion of either family or given name of the patient", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A portion of either family or given name of the patient</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>family</b>
	 * <p>
	 * Description: <b>A portion of the family name of the patient</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name.family</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="family", path="Patient.name.family", description="A portion of the family name of the patient", type="string"  )
	public static final String SP_FAMILY = "family";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>family</b>
	 * <p>
	 * Description: <b>A portion of the family name of the patient</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name.family</b><br>
	 * </p>
	 */
	public static final StringClientParam FAMILY = new StringClientParam(SP_FAMILY);

	/**
	 * Search parameter constant for <b>given</b>
	 * <p>
	 * Description: <b>A portion of the given name of the patient</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name.given</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="given", path="Patient.name.given", description="A portion of the given name of the patient", type="string"  )
	public static final String SP_GIVEN = "given";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>given</b>
	 * <p>
	 * Description: <b>A portion of the given name of the patient</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name.given</b><br>
	 * </p>
	 */
	public static final StringClientParam GIVEN = new StringClientParam(SP_GIVEN);

	/**
	 * Search parameter constant for <b>phonetic</b>
	 * <p>
	 * Description: <b>A portion of either family or given name using some kind of phonetic matching algorithm</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="phonetic", path="Patient.name", description="A portion of either family or given name using some kind of phonetic matching algorithm", type="string"  )
	public static final String SP_PHONETIC = "phonetic";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>phonetic</b>
	 * <p>
	 * Description: <b>A portion of either family or given name using some kind of phonetic matching algorithm</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.name</b><br>
	 * </p>
	 */
	public static final StringClientParam PHONETIC = new StringClientParam(SP_PHONETIC);

	/**
	 * Search parameter constant for <b>telecom</b>
	 * <p>
	 * Description: <b>The value in any kind of telecom details of the patient</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.telecom</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="telecom", path="Patient.telecom", description="The value in any kind of telecom details of the patient", type="token"  )
	public static final String SP_TELECOM = "telecom";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>telecom</b>
	 * <p>
	 * Description: <b>The value in any kind of telecom details of the patient</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.telecom</b><br>
	 * </p>
	 */
	public static final TokenClientParam TELECOM = new TokenClientParam(SP_TELECOM);

	/**
	 * Search parameter constant for <b>phone</b>
	 * <p>
	 * Description: <b>A value in a phone contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.telecom(system=phone)</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="phone", path="Patient.telecom(system=phone)", description="A value in a phone contact", type="token"  )
	public static final String SP_PHONE = "phone";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>phone</b>
	 * <p>
	 * Description: <b>A value in a phone contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.telecom(system=phone)</b><br>
	 * </p>
	 */
	public static final TokenClientParam PHONE = new TokenClientParam(SP_PHONE);

	/**
	 * Search parameter constant for <b>email</b>
	 * <p>
	 * Description: <b>A value in an email contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.telecom(system=email)</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="email", path="Patient.telecom(system=email)", description="A value in an email contact", type="token"  )
	public static final String SP_EMAIL = "email";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>email</b>
	 * <p>
	 * Description: <b>A value in an email contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.telecom(system=email)</b><br>
	 * </p>
	 */
	public static final TokenClientParam EMAIL = new TokenClientParam(SP_EMAIL);

	/**
	 * Search parameter constant for <b>address</b>
	 * <p>
	 * Description: <b>An address in any kind of address/part of the patient</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.address</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address", path="Patient.address", description="An address in any kind of address/part of the patient", type="string"  )
	public static final String SP_ADDRESS = "address";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address</b>
	 * <p>
	 * Description: <b>An address in any kind of address/part of the patient</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.address</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS = new StringClientParam(SP_ADDRESS);

	/**
	 * Search parameter constant for <b>address-city</b>
	 * <p>
	 * Description: <b>A city specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.address.city</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-city", path="Patient.address.city", description="A city specified in an address", type="string"  )
	public static final String SP_ADDRESS_CITY = "address-city";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-city</b>
	 * <p>
	 * Description: <b>A city specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.address.city</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_CITY = new StringClientParam(SP_ADDRESS_CITY);

	/**
	 * Search parameter constant for <b>address-state</b>
	 * <p>
	 * Description: <b>A state specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.address.state</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-state", path="Patient.address.state", description="A state specified in an address", type="string"  )
	public static final String SP_ADDRESS_STATE = "address-state";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-state</b>
	 * <p>
	 * Description: <b>A state specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.address.state</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_STATE = new StringClientParam(SP_ADDRESS_STATE);

	/**
	 * Search parameter constant for <b>address-postalcode</b>
	 * <p>
	 * Description: <b>A postalCode specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.address.postalCode</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-postalcode", path="Patient.address.postalCode", description="A postalCode specified in an address", type="string"  )
	public static final String SP_ADDRESS_POSTALCODE = "address-postalcode";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-postalcode</b>
	 * <p>
	 * Description: <b>A postalCode specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.address.postalCode</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_POSTALCODE = new StringClientParam(SP_ADDRESS_POSTALCODE);

	/**
	 * Search parameter constant for <b>address-country</b>
	 * <p>
	 * Description: <b>A country specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.address.country</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-country", path="Patient.address.country", description="A country specified in an address", type="string"  )
	public static final String SP_ADDRESS_COUNTRY = "address-country";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-country</b>
	 * <p>
	 * Description: <b>A country specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Patient.address.country</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_COUNTRY = new StringClientParam(SP_ADDRESS_COUNTRY);

	/**
	 * Search parameter constant for <b>address-use</b>
	 * <p>
	 * Description: <b>A use code specified in an address</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.address.use</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-use", path="Patient.address.use", description="A use code specified in an address", type="token"  )
	public static final String SP_ADDRESS_USE = "address-use";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-use</b>
	 * <p>
	 * Description: <b>A use code specified in an address</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.address.use</b><br>
	 * </p>
	 */
	public static final TokenClientParam ADDRESS_USE = new TokenClientParam(SP_ADDRESS_USE);

	/**
	 * Search parameter constant for <b>gender</b>
	 * <p>
	 * Description: <b>Gender of the patient</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.gender</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="gender", path="Patient.gender", description="Gender of the patient", type="token"  )
	public static final String SP_GENDER = "gender";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>gender</b>
	 * <p>
	 * Description: <b>Gender of the patient</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.gender</b><br>
	 * </p>
	 */
	public static final TokenClientParam GENDER = new TokenClientParam(SP_GENDER);

	/**
	 * Search parameter constant for <b>language</b>
	 * <p>
	 * Description: <b>Language code (irrespective of use value)</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.communication.language</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="language", path="Patient.communication.language", description="Language code (irrespective of use value)", type="token"  )
	public static final String SP_LANGUAGE = "language";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>language</b>
	 * <p>
	 * Description: <b>Language code (irrespective of use value)</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.communication.language</b><br>
	 * </p>
	 */
	public static final TokenClientParam LANGUAGE = new TokenClientParam(SP_LANGUAGE);

	/**
	 * Search parameter constant for <b>birthdate</b>
	 * <p>
	 * Description: <b>The patient's date of birth</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Patient.birthDate</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="birthdate", path="Patient.birthDate", description="The patient's date of birth", type="date"  )
	public static final String SP_BIRTHDATE = "birthdate";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>birthdate</b>
	 * <p>
	 * Description: <b>The patient's date of birth</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Patient.birthDate</b><br>
	 * </p>
	 */
	public static final DateClientParam BIRTHDATE = new DateClientParam(SP_BIRTHDATE);

	/**
	 * Search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>The organization at which this person is a patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Patient.managingOrganization</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="organization", path="Patient.managingOrganization", description="The organization at which this person is a patient", type="reference"  )
	public static final String SP_ORGANIZATION = "organization";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>The organization at which this person is a patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Patient.managingOrganization</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ORGANIZATION = new ReferenceClientParam(SP_ORGANIZATION);

	/**
	 * Search parameter constant for <b>careprovider</b>
	 * <p>
	 * Description: <b>Patient's nominated care provider, could be a care manager, not the organization that manages the record</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Patient.careProvider</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="careprovider", path="Patient.careProvider", description="Patient's nominated care provider, could be a care manager, not the organization that manages the record", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_CAREPROVIDER = "careprovider";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>careprovider</b>
	 * <p>
	 * Description: <b>Patient's nominated care provider, could be a care manager, not the organization that manages the record</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Patient.careProvider</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam CAREPROVIDER = new ReferenceClientParam(SP_CAREPROVIDER);

	/**
	 * Search parameter constant for <b>active</b>
	 * <p>
	 * Description: <b>Whether the patient record is active</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.active</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="active", path="Patient.active", description="Whether the patient record is active", type="token"  )
	public static final String SP_ACTIVE = "active";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>active</b>
	 * <p>
	 * Description: <b>Whether the patient record is active</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.active</b><br>
	 * </p>
	 */
	public static final TokenClientParam ACTIVE = new TokenClientParam(SP_ACTIVE);

	/**
	 * Search parameter constant for <b>animal-species</b>
	 * <p>
	 * Description: <b>The species for animal patients</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.animal.species</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="animal-species", path="Patient.animal.species", description="The species for animal patients", type="token"  )
	public static final String SP_ANIMAL_SPECIES = "animal-species";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>animal-species</b>
	 * <p>
	 * Description: <b>The species for animal patients</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.animal.species</b><br>
	 * </p>
	 */
	public static final TokenClientParam ANIMAL_SPECIES = new TokenClientParam(SP_ANIMAL_SPECIES);

	/**
	 * Search parameter constant for <b>animal-breed</b>
	 * <p>
	 * Description: <b>The breed for animal patients</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.animal.breed</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="animal-breed", path="Patient.animal.breed", description="The breed for animal patients", type="token"  )
	public static final String SP_ANIMAL_BREED = "animal-breed";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>animal-breed</b>
	 * <p>
	 * Description: <b>The breed for animal patients</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.animal.breed</b><br>
	 * </p>
	 */
	public static final TokenClientParam ANIMAL_BREED = new TokenClientParam(SP_ANIMAL_BREED);

	/**
	 * Search parameter constant for <b>link</b>
	 * <p>
	 * Description: <b>All patients linked to the given patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Patient.link.other</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="link", path="Patient.link.other", description="All patients linked to the given patient", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_LINK = "link";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>link</b>
	 * <p>
	 * Description: <b>All patients linked to the given patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Patient.link.other</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam LINK = new ReferenceClientParam(SP_LINK);

	/**
	 * Search parameter constant for <b>deceased</b>
	 * <p>
	 * Description: <b>This patient has been marked as deceased, or as a death date entered</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.deceased[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="deceased", path="Patient.deceased[x]", description="This patient has been marked as deceased, or as a death date entered", type="token"  )
	public static final String SP_DECEASED = "deceased";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>deceased</b>
	 * <p>
	 * Description: <b>This patient has been marked as deceased, or as a death date entered</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Patient.deceased[x]</b><br>
	 * </p>
	 */
	public static final TokenClientParam DECEASED = new TokenClientParam(SP_DECEASED);

	/**
	 * Search parameter constant for <b>deathdate</b>
	 * <p>
	 * Description: <b>The date of death has been provided and satisfies this search value</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Patient.deceasedDateTime</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="deathdate", path="Patient.deceasedDateTime", description="The date of death has been provided and satisfies this search value", type="date"  )
	public static final String SP_DEATHDATE = "deathdate";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>deathdate</b>
	 * <p>
	 * Description: <b>The date of death has been provided and satisfies this search value</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Patient.deceasedDateTime</b><br>
	 * </p>
	 */
	public static final DateClientParam DEATHDATE = new DateClientParam(SP_DEATHDATE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Patient:careprovider</b>".
	 */
	public static final Include INCLUDE_CAREPROVIDER = new Include("Patient:careprovider");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Patient:link</b>".
	 */
	public static final Include INCLUDE_LINK = new Include("Patient:link");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Patient:organization</b>".
	 */
	public static final Include INCLUDE_ORGANIZATION = new Include("Patient:organization");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="An identifier for this patient"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="active", type=BooleanDt.class, order=1, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="Whether this patient record is in active use"
	)
	private BooleanDt myActive;
	
	@Child(name="name", type=HumanNameDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A name associated with the individual."
	)
	private java.util.List<HumanNameDt> myName;
	
	@Child(name="telecom", type=ContactPointDt.class, order=3, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted."
	)
	private java.util.List<ContactPointDt> myTelecom;
	
	@Child(name="gender", type=CodeDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/administrative-gender")
	private BoundCodeDt<AdministrativeGenderEnum> myGender;
	
	@Child(name="birthDate", type=DateDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date of birth for the individual"
	)
	private DateDt myBirthDate;
	
	@Child(name="deceased", order=6, min=0, max=1, summary=true, modifier=true, type={
		BooleanDt.class, 		DateTimeDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates if the individual is deceased or not"
	)
	private IDatatype myDeceased;
	
	@Child(name="address", type=AddressDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Addresses for the individual"
	)
	private java.util.List<AddressDt> myAddress;
	
	@Child(name="maritalStatus", type=CodeableConceptDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This field contains a patient's most recent marital (civil) status."
	)
	private BoundCodeableConceptDt<MaritalStatusCodesEnum> myMaritalStatus;
	
	@Child(name="multipleBirth", order=9, min=0, max=1, summary=false, modifier=false, type={
		BooleanDt.class, 		IntegerDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether the patient is part of a multiple or indicates the actual birth order."
	)
	private IDatatype myMultipleBirth;
	
	@Child(name="photo", type=AttachmentDt.class, order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Image of the patient"
	)
	private java.util.List<AttachmentDt> myPhoto;
	
	@Child(name="contact", order=11, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A contact party (e.g. guardian, partner, friend) for the patient"
	)
	private java.util.List<Contact> myContact;
	
	@Child(name="animal", order=12, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="This patient is known to be an animal"
	)
	private Animal myAnimal;
	
	@Child(name="communication", order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Languages which may be used to communicate with the patient about his or her health"
	)
	private java.util.List<Communication> myCommunication;
	
	@Child(name="careProvider", order=14, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Patient's nominated care provider"
	)
	private java.util.List<ResourceReferenceDt> myCareProvider;
	
	@Child(name="managingOrganization", order=15, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Organization that is the custodian of the patient record"
	)
	private ResourceReferenceDt myManagingOrganization;
	
	@Child(name="link", order=16, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="Link to another patient resource that concerns the same actual patient"
	)
	private java.util.List<Link> myLink;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myActive,  myName,  myTelecom,  myGender,  myBirthDate,  myDeceased,  myAddress,  myMaritalStatus,  myMultipleBirth,  myPhoto,  myContact,  myAnimal,  myCommunication,  myCareProvider,  myManagingOrganization,  myLink);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myActive, myName, myTelecom, myGender, myBirthDate, myDeceased, myAddress, myMaritalStatus, myMultipleBirth, myPhoto, myContact, myAnimal, myCommunication, myCareProvider, myManagingOrganization, myLink);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier for this patient
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
     * An identifier for this patient
     * </p> 
	 */
	public Patient setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier for this patient
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
	 * An identifier for this patient
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Patient addIdentifier(IdentifierDt theValue) {
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
     * An identifier for this patient
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>active</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this patient record is in active use
     * </p> 
	 */
	public BooleanDt getActiveElement() {  
		if (myActive == null) {
			myActive = new BooleanDt();
		}
		return myActive;
	}

	
	/**
	 * Gets the value(s) for <b>active</b> (status).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this patient record is in active use
     * </p> 
	 */
	public Boolean getActive() {  
		return getActiveElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>active</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this patient record is in active use
     * </p> 
	 */
	public Patient setActive(BooleanDt theValue) {
		myActive = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>active</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this patient record is in active use
     * </p> 
	 */
	public Patient setActive( boolean theBoolean) {
		myActive = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A name associated with the individual.
     * </p> 
	 */
	public java.util.List<HumanNameDt> getName() {  
		if (myName == null) {
			myName = new java.util.ArrayList<HumanNameDt>();
		}
		return myName;
	}

	/**
	 * Sets the value(s) for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A name associated with the individual.
     * </p> 
	 */
	public Patient setName(java.util.List<HumanNameDt> theValue) {
		myName = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A name associated with the individual.
     * </p> 
	 */
	public HumanNameDt addName() {
		HumanNameDt newType = new HumanNameDt();
		getName().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>name</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A name associated with the individual.
	 * </p>
	 * @param theValue The name to add (must not be <code>null</code>)
	 */
	public Patient addName(HumanNameDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getName().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>name</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A name associated with the individual.
     * </p> 
	 */
	public HumanNameDt getNameFirstRep() {
		if (getName().isEmpty()) {
			return addName();
		}
		return getName().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>telecom</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
     * </p> 
	 */
	public java.util.List<ContactPointDt> getTelecom() {  
		if (myTelecom == null) {
			myTelecom = new java.util.ArrayList<ContactPointDt>();
		}
		return myTelecom;
	}

	/**
	 * Sets the value(s) for <b>telecom</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
     * </p> 
	 */
	public Patient setTelecom(java.util.List<ContactPointDt> theValue) {
		myTelecom = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>telecom</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
     * </p> 
	 */
	public ContactPointDt addTelecom() {
		ContactPointDt newType = new ContactPointDt();
		getTelecom().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>telecom</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
	 * </p>
	 * @param theValue The telecom to add (must not be <code>null</code>)
	 */
	public Patient addTelecom(ContactPointDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getTelecom().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>telecom</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail (e.g. a telephone number or an email address) by which the individual may be contacted.
     * </p> 
	 */
	public ContactPointDt getTelecomFirstRep() {
		if (getTelecom().isEmpty()) {
			return addTelecom();
		}
		return getTelecom().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>gender</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
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
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
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
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
     * </p> 
	 */
	public Patient setGender(BoundCodeDt<AdministrativeGenderEnum> theValue) {
		myGender = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>gender</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the patient is considered to have for administration and record keeping purposes.
     * </p> 
	 */
	public Patient setGender(AdministrativeGenderEnum theValue) {
		setGender(new BoundCodeDt<AdministrativeGenderEnum>(AdministrativeGenderEnum.VALUESET_BINDER, theValue));
		
/*
		getGenderElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>birthDate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date of birth for the individual
     * </p> 
	 */
	public DateDt getBirthDateElement() {  
		if (myBirthDate == null) {
			myBirthDate = new DateDt();
		}
		return myBirthDate;
	}

	
	/**
	 * Gets the value(s) for <b>birthDate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date of birth for the individual
     * </p> 
	 */
	public Date getBirthDate() {  
		return getBirthDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>birthDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date of birth for the individual
     * </p> 
	 */
	public Patient setBirthDate(DateDt theValue) {
		myBirthDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>birthDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date of birth for the individual
     * </p> 
	 */
	public Patient setBirthDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myBirthDate = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>birthDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date of birth for the individual
     * </p> 
	 */
	public Patient setBirthDateWithDayPrecision( Date theDate) {
		myBirthDate = new DateDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>deceased[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates if the individual is deceased or not
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
     * Indicates if the individual is deceased or not
     * </p> 
	 */
	public Patient setDeceased(IDatatype theValue) {
		myDeceased = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>address</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Addresses for the individual
     * </p> 
	 */
	public java.util.List<AddressDt> getAddress() {  
		if (myAddress == null) {
			myAddress = new java.util.ArrayList<AddressDt>();
		}
		return myAddress;
	}

	/**
	 * Sets the value(s) for <b>address</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Addresses for the individual
     * </p> 
	 */
	public Patient setAddress(java.util.List<AddressDt> theValue) {
		myAddress = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>address</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Addresses for the individual
     * </p> 
	 */
	public AddressDt addAddress() {
		AddressDt newType = new AddressDt();
		getAddress().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>address</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Addresses for the individual
	 * </p>
	 * @param theValue The address to add (must not be <code>null</code>)
	 */
	public Patient addAddress(AddressDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAddress().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>address</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Addresses for the individual
     * </p> 
	 */
	public AddressDt getAddressFirstRep() {
		if (getAddress().isEmpty()) {
			return addAddress();
		}
		return getAddress().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>maritalStatus</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This field contains a patient's most recent marital (civil) status.
     * </p> 
	 */
	public BoundCodeableConceptDt<MaritalStatusCodesEnum> getMaritalStatus() {  
		if (myMaritalStatus == null) {
			myMaritalStatus = new BoundCodeableConceptDt<MaritalStatusCodesEnum>(MaritalStatusCodesEnum.VALUESET_BINDER);
		}
		return myMaritalStatus;
	}

	/**
	 * Sets the value(s) for <b>maritalStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This field contains a patient's most recent marital (civil) status.
     * </p> 
	 */
	public Patient setMaritalStatus(BoundCodeableConceptDt<MaritalStatusCodesEnum> theValue) {
		myMaritalStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>maritalStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This field contains a patient's most recent marital (civil) status.
     * </p> 
	 */
	public Patient setMaritalStatus(MaritalStatusCodesEnum theValue) {
		setMaritalStatus(new BoundCodeableConceptDt<MaritalStatusCodesEnum>(MaritalStatusCodesEnum.VALUESET_BINDER, theValue));
		
/*
		getMaritalStatus().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>multipleBirth[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the patient is part of a multiple or indicates the actual birth order.
     * </p> 
	 */
	public IDatatype getMultipleBirth() {  
		return myMultipleBirth;
	}

	/**
	 * Sets the value(s) for <b>multipleBirth[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether the patient is part of a multiple or indicates the actual birth order.
     * </p> 
	 */
	public Patient setMultipleBirth(IDatatype theValue) {
		myMultipleBirth = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>photo</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Image of the patient
     * </p> 
	 */
	public java.util.List<AttachmentDt> getPhoto() {  
		if (myPhoto == null) {
			myPhoto = new java.util.ArrayList<AttachmentDt>();
		}
		return myPhoto;
	}

	/**
	 * Sets the value(s) for <b>photo</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Image of the patient
     * </p> 
	 */
	public Patient setPhoto(java.util.List<AttachmentDt> theValue) {
		myPhoto = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>photo</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Image of the patient
     * </p> 
	 */
	public AttachmentDt addPhoto() {
		AttachmentDt newType = new AttachmentDt();
		getPhoto().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>photo</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Image of the patient
	 * </p>
	 * @param theValue The photo to add (must not be <code>null</code>)
	 */
	public Patient addPhoto(AttachmentDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPhoto().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>photo</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Image of the patient
     * </p> 
	 */
	public AttachmentDt getPhotoFirstRep() {
		if (getPhoto().isEmpty()) {
			return addPhoto();
		}
		return getPhoto().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>contact</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A contact party (e.g. guardian, partner, friend) for the patient
     * </p> 
	 */
	public java.util.List<Contact> getContact() {  
		if (myContact == null) {
			myContact = new java.util.ArrayList<Contact>();
		}
		return myContact;
	}

	/**
	 * Sets the value(s) for <b>contact</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A contact party (e.g. guardian, partner, friend) for the patient
     * </p> 
	 */
	public Patient setContact(java.util.List<Contact> theValue) {
		myContact = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>contact</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A contact party (e.g. guardian, partner, friend) for the patient
     * </p> 
	 */
	public Contact addContact() {
		Contact newType = new Contact();
		getContact().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>contact</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A contact party (e.g. guardian, partner, friend) for the patient
	 * </p>
	 * @param theValue The contact to add (must not be <code>null</code>)
	 */
	public Patient addContact(Contact theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getContact().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>contact</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A contact party (e.g. guardian, partner, friend) for the patient
     * </p> 
	 */
	public Contact getContactFirstRep() {
		if (getContact().isEmpty()) {
			return addContact();
		}
		return getContact().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>animal</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This patient is known to be an animal
     * </p> 
	 */
	public Animal getAnimal() {  
		if (myAnimal == null) {
			myAnimal = new Animal();
		}
		return myAnimal;
	}

	/**
	 * Sets the value(s) for <b>animal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This patient is known to be an animal
     * </p> 
	 */
	public Patient setAnimal(Animal theValue) {
		myAnimal = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>communication</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Languages which may be used to communicate with the patient about his or her health
     * </p> 
	 */
	public java.util.List<Communication> getCommunication() {  
		if (myCommunication == null) {
			myCommunication = new java.util.ArrayList<Communication>();
		}
		return myCommunication;
	}

	/**
	 * Sets the value(s) for <b>communication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Languages which may be used to communicate with the patient about his or her health
     * </p> 
	 */
	public Patient setCommunication(java.util.List<Communication> theValue) {
		myCommunication = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>communication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Languages which may be used to communicate with the patient about his or her health
     * </p> 
	 */
	public Communication addCommunication() {
		Communication newType = new Communication();
		getCommunication().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>communication</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Languages which may be used to communicate with the patient about his or her health
	 * </p>
	 * @param theValue The communication to add (must not be <code>null</code>)
	 */
	public Patient addCommunication(Communication theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCommunication().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>communication</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Languages which may be used to communicate with the patient about his or her health
     * </p> 
	 */
	public Communication getCommunicationFirstRep() {
		if (getCommunication().isEmpty()) {
			return addCommunication();
		}
		return getCommunication().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>careProvider</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Patient's nominated care provider
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getCareProvider() {  
		if (myCareProvider == null) {
			myCareProvider = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myCareProvider;
	}

	/**
	 * Sets the value(s) for <b>careProvider</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Patient's nominated care provider
     * </p> 
	 */
	public Patient setCareProvider(java.util.List<ResourceReferenceDt> theValue) {
		myCareProvider = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>careProvider</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Patient's nominated care provider
     * </p> 
	 */
	public ResourceReferenceDt addCareProvider() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getCareProvider().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>managingOrganization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Organization that is the custodian of the patient record
     * </p> 
	 */
	public ResourceReferenceDt getManagingOrganization() {  
		if (myManagingOrganization == null) {
			myManagingOrganization = new ResourceReferenceDt();
		}
		return myManagingOrganization;
	}

	/**
	 * Sets the value(s) for <b>managingOrganization</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Organization that is the custodian of the patient record
     * </p> 
	 */
	public Patient setManagingOrganization(ResourceReferenceDt theValue) {
		myManagingOrganization = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>link</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Link to another patient resource that concerns the same actual patient
     * </p> 
	 */
	public java.util.List<Link> getLink() {  
		if (myLink == null) {
			myLink = new java.util.ArrayList<Link>();
		}
		return myLink;
	}

	/**
	 * Sets the value(s) for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Link to another patient resource that concerns the same actual patient
     * </p> 
	 */
	public Patient setLink(java.util.List<Link> theValue) {
		myLink = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Link to another patient resource that concerns the same actual patient
     * </p> 
	 */
	public Link addLink() {
		Link newType = new Link();
		getLink().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>link</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Link to another patient resource that concerns the same actual patient
	 * </p>
	 * @param theValue The link to add (must not be <code>null</code>)
	 */
	public Patient addLink(Link theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getLink().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>link</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Link to another patient resource that concerns the same actual patient
     * </p> 
	 */
	public Link getLinkFirstRep() {
		if (getLink().isEmpty()) {
			return addLink();
		}
		return getLink().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Patient.contact</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A contact party (e.g. guardian, partner, friend) for the patient
     * </p> 
	 */
	@Block()	
	public static class Contact 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="relationship", type=CodeableConceptDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The nature of the relationship between the patient and the contact person"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-patient-contact-relationship")
	private java.util.List<CodeableConceptDt> myRelationship;
	
	@Child(name="name", type=HumanNameDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A name associated with the contact person"
	)
	private HumanNameDt myName;
	
	@Child(name="telecom", type=ContactPointDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A contact detail for the person, e.g. a telephone number or an email address."
	)
	private java.util.List<ContactPointDt> myTelecom;
	
	@Child(name="address", type=AddressDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Address for the contact person"
	)
	private AddressDt myAddress;
	
	@Child(name="gender", type=CodeDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/administrative-gender")
	private BoundCodeDt<AdministrativeGenderEnum> myGender;
	
	@Child(name="organization", order=5, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Organization on behalf of which the contact is acting or for which the contact is working."
	)
	private ResourceReferenceDt myOrganization;
	
	@Child(name="period", type=PeriodDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The period during which this contact person or organization is valid to be contacted relating to this patient"
	)
	private PeriodDt myPeriod;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myRelationship,  myName,  myTelecom,  myAddress,  myGender,  myOrganization,  myPeriod);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myRelationship, myName, myTelecom, myAddress, myGender, myOrganization, myPeriod);
	}

	/**
	 * Gets the value(s) for <b>relationship</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The nature of the relationship between the patient and the contact person
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getRelationship() {  
		if (myRelationship == null) {
			myRelationship = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myRelationship;
	}

	/**
	 * Sets the value(s) for <b>relationship</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The nature of the relationship between the patient and the contact person
     * </p> 
	 */
	public Contact setRelationship(java.util.List<CodeableConceptDt> theValue) {
		myRelationship = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>relationship</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The nature of the relationship between the patient and the contact person
     * </p> 
	 */
	public CodeableConceptDt addRelationship() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getRelationship().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>relationship</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The nature of the relationship between the patient and the contact person
	 * </p>
	 * @param theValue The relationship to add (must not be <code>null</code>)
	 */
	public Contact addRelationship(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRelationship().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>relationship</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The nature of the relationship between the patient and the contact person
     * </p> 
	 */
	public CodeableConceptDt getRelationshipFirstRep() {
		if (getRelationship().isEmpty()) {
			return addRelationship();
		}
		return getRelationship().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A name associated with the contact person
     * </p> 
	 */
	public HumanNameDt getName() {  
		if (myName == null) {
			myName = new HumanNameDt();
		}
		return myName;
	}

	/**
	 * Sets the value(s) for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A name associated with the contact person
     * </p> 
	 */
	public Contact setName(HumanNameDt theValue) {
		myName = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>telecom</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail for the person, e.g. a telephone number or an email address.
     * </p> 
	 */
	public java.util.List<ContactPointDt> getTelecom() {  
		if (myTelecom == null) {
			myTelecom = new java.util.ArrayList<ContactPointDt>();
		}
		return myTelecom;
	}

	/**
	 * Sets the value(s) for <b>telecom</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail for the person, e.g. a telephone number or an email address.
     * </p> 
	 */
	public Contact setTelecom(java.util.List<ContactPointDt> theValue) {
		myTelecom = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>telecom</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail for the person, e.g. a telephone number or an email address.
     * </p> 
	 */
	public ContactPointDt addTelecom() {
		ContactPointDt newType = new ContactPointDt();
		getTelecom().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>telecom</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A contact detail for the person, e.g. a telephone number or an email address.
	 * </p>
	 * @param theValue The telecom to add (must not be <code>null</code>)
	 */
	public Contact addTelecom(ContactPointDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getTelecom().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>telecom</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail for the person, e.g. a telephone number or an email address.
     * </p> 
	 */
	public ContactPointDt getTelecomFirstRep() {
		if (getTelecom().isEmpty()) {
			return addTelecom();
		}
		return getTelecom().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>address</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Address for the contact person
     * </p> 
	 */
	public AddressDt getAddress() {  
		if (myAddress == null) {
			myAddress = new AddressDt();
		}
		return myAddress;
	}

	/**
	 * Sets the value(s) for <b>address</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Address for the contact person
     * </p> 
	 */
	public Contact setAddress(AddressDt theValue) {
		myAddress = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>gender</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
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
     * Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
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
     * Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
     * </p> 
	 */
	public Contact setGender(BoundCodeDt<AdministrativeGenderEnum> theValue) {
		myGender = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>gender</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the contact person is considered to have for administration and record keeping purposes.
     * </p> 
	 */
	public Contact setGender(AdministrativeGenderEnum theValue) {
		setGender(new BoundCodeDt<AdministrativeGenderEnum>(AdministrativeGenderEnum.VALUESET_BINDER, theValue));
		
/*
		getGenderElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>organization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Organization on behalf of which the contact is acting or for which the contact is working.
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
     * Organization on behalf of which the contact is acting or for which the contact is working.
     * </p> 
	 */
	public Contact setOrganization(ResourceReferenceDt theValue) {
		myOrganization = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The period during which this contact person or organization is valid to be contacted relating to this patient
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
     * The period during which this contact person or organization is valid to be contacted relating to this patient
     * </p> 
	 */
	public Contact setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Patient.animal</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This patient is known to be an animal
     * </p> 
	 */
	@Block()	
	public static class Animal 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="species", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the high level taxonomic categorization of the kind of animal"
	)
	private CodeableConceptDt mySpecies;
	
	@Child(name="breed", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the detailed categorization of the kind of animal."
	)
	private CodeableConceptDt myBreed;
	
	@Child(name="genderStatus", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the current state of the animal's reproductive organs"
	)
	private CodeableConceptDt myGenderStatus;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySpecies,  myBreed,  myGenderStatus);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySpecies, myBreed, myGenderStatus);
	}

	/**
	 * Gets the value(s) for <b>species</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the high level taxonomic categorization of the kind of animal
     * </p> 
	 */
	public CodeableConceptDt getSpecies() {  
		if (mySpecies == null) {
			mySpecies = new CodeableConceptDt();
		}
		return mySpecies;
	}

	/**
	 * Sets the value(s) for <b>species</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the high level taxonomic categorization of the kind of animal
     * </p> 
	 */
	public Animal setSpecies(CodeableConceptDt theValue) {
		mySpecies = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>breed</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the detailed categorization of the kind of animal.
     * </p> 
	 */
	public CodeableConceptDt getBreed() {  
		if (myBreed == null) {
			myBreed = new CodeableConceptDt();
		}
		return myBreed;
	}

	/**
	 * Sets the value(s) for <b>breed</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the detailed categorization of the kind of animal.
     * </p> 
	 */
	public Animal setBreed(CodeableConceptDt theValue) {
		myBreed = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>genderStatus</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the current state of the animal's reproductive organs
     * </p> 
	 */
	public CodeableConceptDt getGenderStatus() {  
		if (myGenderStatus == null) {
			myGenderStatus = new CodeableConceptDt();
		}
		return myGenderStatus;
	}

	/**
	 * Sets the value(s) for <b>genderStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the current state of the animal's reproductive organs
     * </p> 
	 */
	public Animal setGenderStatus(CodeableConceptDt theValue) {
		myGenderStatus = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Patient.communication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Languages which may be used to communicate with the patient about his or her health
     * </p> 
	 */
	@Block()	
	public static class Communication 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="language", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. \"en\" for English, or \"en-US\" for American English versus \"en-EN\" for England English"
	)
	private CodeableConceptDt myLanguage;
	
	@Child(name="preferred", type=BooleanDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates whether or not the patient prefers this language (over other languages he masters up a certain level)"
	)
	private BooleanDt myPreferred;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLanguage,  myPreferred);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLanguage, myPreferred);
	}

	/**
	 * Gets the value(s) for <b>language</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. \&quot;en\&quot; for English, or \&quot;en-US\&quot; for American English versus \&quot;en-EN\&quot; for England English
     * </p> 
	 */
	public CodeableConceptDt getLanguage() {  
		if (myLanguage == null) {
			myLanguage = new CodeableConceptDt();
		}
		return myLanguage;
	}

	/**
	 * Sets the value(s) for <b>language</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The ISO-639-1 alpha 2 code in lower case for the language, optionally followed by a hyphen and the ISO-3166-1 alpha 2 code for the region in upper case; e.g. \&quot;en\&quot; for English, or \&quot;en-US\&quot; for American English versus \&quot;en-EN\&quot; for England English
     * </p> 
	 */
	public Communication setLanguage(CodeableConceptDt theValue) {
		myLanguage = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>preferred</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not the patient prefers this language (over other languages he masters up a certain level)
     * </p> 
	 */
	public BooleanDt getPreferredElement() {  
		if (myPreferred == null) {
			myPreferred = new BooleanDt();
		}
		return myPreferred;
	}

	
	/**
	 * Gets the value(s) for <b>preferred</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not the patient prefers this language (over other languages he masters up a certain level)
     * </p> 
	 */
	public Boolean getPreferred() {  
		return getPreferredElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>preferred</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not the patient prefers this language (over other languages he masters up a certain level)
     * </p> 
	 */
	public Communication setPreferred(BooleanDt theValue) {
		myPreferred = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>preferred</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether or not the patient prefers this language (over other languages he masters up a certain level)
     * </p> 
	 */
	public Communication setPreferred( boolean theBoolean) {
		myPreferred = new BooleanDt(theBoolean); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Patient.link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Link to another patient resource that concerns the same actual patient
     * </p> 
	 */
	@Block()	
	public static class Link 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="other", order=0, min=1, max=1, summary=false, modifier=true, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The other patient resource that the link refers to"
	)
	private ResourceReferenceDt myOther;
	
	@Child(name="type", type=CodeDt.class, order=1, min=1, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of link between this patient resource and another patient resource."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/link-type")
	private BoundCodeDt<LinkTypeEnum> myType;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myOther,  myType);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myOther, myType);
	}

	/**
	 * Gets the value(s) for <b>other</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The other patient resource that the link refers to
     * </p> 
	 */
	public ResourceReferenceDt getOther() {  
		if (myOther == null) {
			myOther = new ResourceReferenceDt();
		}
		return myOther;
	}

	/**
	 * Sets the value(s) for <b>other</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The other patient resource that the link refers to
     * </p> 
	 */
	public Link setOther(ResourceReferenceDt theValue) {
		myOther = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of link between this patient resource and another patient resource.
     * </p> 
	 */
	public BoundCodeDt<LinkTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<LinkTypeEnum>(LinkTypeEnum.VALUESET_BINDER);
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
     * The type of link between this patient resource and another patient resource.
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
     * The type of link between this patient resource and another patient resource.
     * </p> 
	 */
	public Link setType(BoundCodeDt<LinkTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of link between this patient resource and another patient resource.
     * </p> 
	 */
	public Link setType(LinkTypeEnum theValue) {
		setType(new BoundCodeDt<LinkTypeEnum>(LinkTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  


	}




    @Override
    public String getResourceName() {
        return "Patient";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
