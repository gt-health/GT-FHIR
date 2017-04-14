















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
 * HAPI/FHIR <b>Practitioner</b> Resource
 * (administrative.individual)
 *
 * <p>
 * <b>Definition:</b>
 * A person who is directly or indirectly involved in the provisioning of healthcare.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Need to track doctors, staff, locums etc. for both healthcare practitioners, funders, etc.
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Practitioner">http://hl7.org/fhir/profiles/Practitioner</a> 
 * </p>
 *
 */
@ResourceDef(name="Practitioner", profile="http://hl7.org/fhir/profiles/Practitioner", id="practitioner")
public class Practitioner extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A practitioner's Identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Practitioner.identifier", description="A practitioner's Identifier", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A practitioner's Identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A portion of either family or given name</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="Practitioner.name", description="A portion of either family or given name", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A portion of either family or given name</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.name</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>family</b>
	 * <p>
	 * Description: <b>A portion of the family name</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.name.family</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="family", path="Practitioner.name.family", description="A portion of the family name", type="string"  )
	public static final String SP_FAMILY = "family";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>family</b>
	 * <p>
	 * Description: <b>A portion of the family name</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.name.family</b><br>
	 * </p>
	 */
	public static final StringClientParam FAMILY = new StringClientParam(SP_FAMILY);

	/**
	 * Search parameter constant for <b>given</b>
	 * <p>
	 * Description: <b>A portion of the given name</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.name.given</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="given", path="Practitioner.name.given", description="A portion of the given name", type="string"  )
	public static final String SP_GIVEN = "given";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>given</b>
	 * <p>
	 * Description: <b>A portion of the given name</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.name.given</b><br>
	 * </p>
	 */
	public static final StringClientParam GIVEN = new StringClientParam(SP_GIVEN);

	/**
	 * Search parameter constant for <b>phonetic</b>
	 * <p>
	 * Description: <b>A portion of either family or given name using some kind of phonetic matching algorithm</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="phonetic", path="Practitioner.name", description="A portion of either family or given name using some kind of phonetic matching algorithm", type="string"  )
	public static final String SP_PHONETIC = "phonetic";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>phonetic</b>
	 * <p>
	 * Description: <b>A portion of either family or given name using some kind of phonetic matching algorithm</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.name</b><br>
	 * </p>
	 */
	public static final StringClientParam PHONETIC = new StringClientParam(SP_PHONETIC);

	/**
	 * Search parameter constant for <b>telecom</b>
	 * <p>
	 * Description: <b>The value in any kind of contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.telecom</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="telecom", path="Practitioner.telecom", description="The value in any kind of contact", type="token"  )
	public static final String SP_TELECOM = "telecom";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>telecom</b>
	 * <p>
	 * Description: <b>The value in any kind of contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.telecom</b><br>
	 * </p>
	 */
	public static final TokenClientParam TELECOM = new TokenClientParam(SP_TELECOM);

	/**
	 * Search parameter constant for <b>phone</b>
	 * <p>
	 * Description: <b>A value in a phone contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.telecom(system=phone)</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="phone", path="Practitioner.telecom(system=phone)", description="A value in a phone contact", type="token"  )
	public static final String SP_PHONE = "phone";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>phone</b>
	 * <p>
	 * Description: <b>A value in a phone contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.telecom(system=phone)</b><br>
	 * </p>
	 */
	public static final TokenClientParam PHONE = new TokenClientParam(SP_PHONE);

	/**
	 * Search parameter constant for <b>email</b>
	 * <p>
	 * Description: <b>A value in an email contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.telecom(system=email)</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="email", path="Practitioner.telecom(system=email)", description="A value in an email contact", type="token"  )
	public static final String SP_EMAIL = "email";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>email</b>
	 * <p>
	 * Description: <b>A value in an email contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.telecom(system=email)</b><br>
	 * </p>
	 */
	public static final TokenClientParam EMAIL = new TokenClientParam(SP_EMAIL);

	/**
	 * Search parameter constant for <b>address</b>
	 * <p>
	 * Description: <b>An address in any kind of address/part</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.address</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address", path="Practitioner.address", description="An address in any kind of address/part", type="string"  )
	public static final String SP_ADDRESS = "address";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address</b>
	 * <p>
	 * Description: <b>An address in any kind of address/part</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.address</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS = new StringClientParam(SP_ADDRESS);

	/**
	 * Search parameter constant for <b>address-city</b>
	 * <p>
	 * Description: <b>A city specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.address.city</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-city", path="Practitioner.address.city", description="A city specified in an address", type="string"  )
	public static final String SP_ADDRESS_CITY = "address-city";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-city</b>
	 * <p>
	 * Description: <b>A city specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.address.city</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_CITY = new StringClientParam(SP_ADDRESS_CITY);

	/**
	 * Search parameter constant for <b>address-state</b>
	 * <p>
	 * Description: <b>A state specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.address.state</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-state", path="Practitioner.address.state", description="A state specified in an address", type="string"  )
	public static final String SP_ADDRESS_STATE = "address-state";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-state</b>
	 * <p>
	 * Description: <b>A state specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.address.state</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_STATE = new StringClientParam(SP_ADDRESS_STATE);

	/**
	 * Search parameter constant for <b>address-postalcode</b>
	 * <p>
	 * Description: <b>A postalCode specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.address.postalCode</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-postalcode", path="Practitioner.address.postalCode", description="A postalCode specified in an address", type="string"  )
	public static final String SP_ADDRESS_POSTALCODE = "address-postalcode";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-postalcode</b>
	 * <p>
	 * Description: <b>A postalCode specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.address.postalCode</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_POSTALCODE = new StringClientParam(SP_ADDRESS_POSTALCODE);

	/**
	 * Search parameter constant for <b>address-country</b>
	 * <p>
	 * Description: <b>A country specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.address.country</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-country", path="Practitioner.address.country", description="A country specified in an address", type="string"  )
	public static final String SP_ADDRESS_COUNTRY = "address-country";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-country</b>
	 * <p>
	 * Description: <b>A country specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Practitioner.address.country</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_COUNTRY = new StringClientParam(SP_ADDRESS_COUNTRY);

	/**
	 * Search parameter constant for <b>address-use</b>
	 * <p>
	 * Description: <b>A use code specified in an address</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.address.use</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-use", path="Practitioner.address.use", description="A use code specified in an address", type="token"  )
	public static final String SP_ADDRESS_USE = "address-use";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-use</b>
	 * <p>
	 * Description: <b>A use code specified in an address</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.address.use</b><br>
	 * </p>
	 */
	public static final TokenClientParam ADDRESS_USE = new TokenClientParam(SP_ADDRESS_USE);

	/**
	 * Search parameter constant for <b>gender</b>
	 * <p>
	 * Description: <b>Gender of the practitioner</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.gender</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="gender", path="Practitioner.gender", description="Gender of the practitioner", type="token"  )
	public static final String SP_GENDER = "gender";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>gender</b>
	 * <p>
	 * Description: <b>Gender of the practitioner</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.gender</b><br>
	 * </p>
	 */
	public static final TokenClientParam GENDER = new TokenClientParam(SP_GENDER);

	/**
	 * Search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>The identity of the organization the practitioner represents / acts on behalf of</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Practitioner.practitionerRole.managingOrganization</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="organization", path="Practitioner.practitionerRole.managingOrganization", description="The identity of the organization the practitioner represents / acts on behalf of", type="reference"  )
	public static final String SP_ORGANIZATION = "organization";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>The identity of the organization the practitioner represents / acts on behalf of</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Practitioner.practitionerRole.managingOrganization</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ORGANIZATION = new ReferenceClientParam(SP_ORGANIZATION);

	/**
	 * Search parameter constant for <b>communication</b>
	 * <p>
	 * Description: <b>One of the languages that the practitioner can communicate with</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.communication</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="communication", path="Practitioner.communication", description="One of the languages that the practitioner can communicate with", type="token"  )
	public static final String SP_COMMUNICATION = "communication";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>communication</b>
	 * <p>
	 * Description: <b>One of the languages that the practitioner can communicate with</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.communication</b><br>
	 * </p>
	 */
	public static final TokenClientParam COMMUNICATION = new TokenClientParam(SP_COMMUNICATION);

	/**
	 * Search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b>One of the locations at which this practitioner provides care</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Practitioner.practitionerRole.location</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="location", path="Practitioner.practitionerRole.location", description="One of the locations at which this practitioner provides care", type="reference"  )
	public static final String SP_LOCATION = "location";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b>One of the locations at which this practitioner provides care</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Practitioner.practitionerRole.location</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam LOCATION = new ReferenceClientParam(SP_LOCATION);

	/**
	 * Search parameter constant for <b>specialty</b>
	 * <p>
	 * Description: <b>The practitioner has this specialty at an organization</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.practitionerRole.specialty</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="specialty", path="Practitioner.practitionerRole.specialty", description="The practitioner has this specialty at an organization", type="token"  )
	public static final String SP_SPECIALTY = "specialty";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>specialty</b>
	 * <p>
	 * Description: <b>The practitioner has this specialty at an organization</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.practitionerRole.specialty</b><br>
	 * </p>
	 */
	public static final TokenClientParam SPECIALTY = new TokenClientParam(SP_SPECIALTY);

	/**
	 * Search parameter constant for <b>role</b>
	 * <p>
	 * Description: <b>The practitioner can perform this role at for the organization</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.practitionerRole.role</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="role", path="Practitioner.practitionerRole.role", description="The practitioner can perform this role at for the organization", type="token"  )
	public static final String SP_ROLE = "role";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>role</b>
	 * <p>
	 * Description: <b>The practitioner can perform this role at for the organization</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Practitioner.practitionerRole.role</b><br>
	 * </p>
	 */
	public static final TokenClientParam ROLE = new TokenClientParam(SP_ROLE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Practitioner:location</b>".
	 */
	public static final Include INCLUDE_LOCATION = new Include("Practitioner:location");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Practitioner:organization</b>".
	 */
	public static final Include INCLUDE_ORGANIZATION = new Include("Practitioner:organization");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="An identifier that applies to this person in this role"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="active", type=BooleanDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="status",
		formalDefinition="Whether this practitioner's record is in active use"
	)
	private BooleanDt myActive;
	
	@Child(name="name", type=HumanNameDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A name associated with the person"
	)
	private HumanNameDt myName;
	
	@Child(name="telecom", type=ContactPointDt.class, order=3, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A contact detail for the practitioner, e.g. a telephone number or an email address."
	)
	private java.util.List<ContactPointDt> myTelecom;
	
	@Child(name="address", type=AddressDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The postal address where the practitioner can be found or visited or to which mail can be delivered"
	)
	private java.util.List<AddressDt> myAddress;
	
	@Child(name="gender", type=CodeDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/administrative-gender")
	private BoundCodeDt<AdministrativeGenderEnum> myGender;
	
	@Child(name="birthDate", type=DateDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date of birth for the practitioner"
	)
	private DateDt myBirthDate;
	
	@Child(name="photo", type=AttachmentDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Image of the person"
	)
	private java.util.List<AttachmentDt> myPhoto;
	
	@Child(name="practitionerRole", order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The list of roles/organizations that the practitioner is associated with"
	)
	private java.util.List<PractitionerRole> myPractitionerRole;
	
	@Child(name="qualification", order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<Qualification> myQualification;
	
	@Child(name="communication", type=CodeableConceptDt.class, order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A language the practitioner is able to use in patient communication"
	)
	private java.util.List<CodeableConceptDt> myCommunication;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myActive,  myName,  myTelecom,  myAddress,  myGender,  myBirthDate,  myPhoto,  myPractitionerRole,  myQualification,  myCommunication);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myActive, myName, myTelecom, myAddress, myGender, myBirthDate, myPhoto, myPractitionerRole, myQualification, myCommunication);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that applies to this person in this role
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
     * An identifier that applies to this person in this role
     * </p> 
	 */
	public Practitioner setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that applies to this person in this role
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
	 * An identifier that applies to this person in this role
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Practitioner addIdentifier(IdentifierDt theValue) {
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
     * An identifier that applies to this person in this role
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
     * Whether this practitioner's record is in active use
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
     * Whether this practitioner's record is in active use
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
     * Whether this practitioner's record is in active use
     * </p> 
	 */
	public Practitioner setActive(BooleanDt theValue) {
		myActive = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>active</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Whether this practitioner's record is in active use
     * </p> 
	 */
	public Practitioner setActive( boolean theBoolean) {
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
     * A name associated with the person
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
     * A name associated with the person
     * </p> 
	 */
	public Practitioner setName(HumanNameDt theValue) {
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
     * A contact detail for the practitioner, e.g. a telephone number or an email address.
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
     * A contact detail for the practitioner, e.g. a telephone number or an email address.
     * </p> 
	 */
	public Practitioner setTelecom(java.util.List<ContactPointDt> theValue) {
		myTelecom = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>telecom</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A contact detail for the practitioner, e.g. a telephone number or an email address.
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
	 * A contact detail for the practitioner, e.g. a telephone number or an email address.
	 * </p>
	 * @param theValue The telecom to add (must not be <code>null</code>)
	 */
	public Practitioner addTelecom(ContactPointDt theValue) {
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
     * A contact detail for the practitioner, e.g. a telephone number or an email address.
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
     * The postal address where the practitioner can be found or visited or to which mail can be delivered
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
     * The postal address where the practitioner can be found or visited or to which mail can be delivered
     * </p> 
	 */
	public Practitioner setAddress(java.util.List<AddressDt> theValue) {
		myAddress = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>address</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The postal address where the practitioner can be found or visited or to which mail can be delivered
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
	 * The postal address where the practitioner can be found or visited or to which mail can be delivered
	 * </p>
	 * @param theValue The address to add (must not be <code>null</code>)
	 */
	public Practitioner addAddress(AddressDt theValue) {
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
     * The postal address where the practitioner can be found or visited or to which mail can be delivered
     * </p> 
	 */
	public AddressDt getAddressFirstRep() {
		if (getAddress().isEmpty()) {
			return addAddress();
		}
		return getAddress().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>gender</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
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
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
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
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     * </p> 
	 */
	public Practitioner setGender(BoundCodeDt<AdministrativeGenderEnum> theValue) {
		myGender = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>gender</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Administrative Gender - the gender that the person is considered to have for administration and record keeping purposes.
     * </p> 
	 */
	public Practitioner setGender(AdministrativeGenderEnum theValue) {
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
     * The date of birth for the practitioner
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
     * The date of birth for the practitioner
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
     * The date of birth for the practitioner
     * </p> 
	 */
	public Practitioner setBirthDate(DateDt theValue) {
		myBirthDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>birthDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date of birth for the practitioner
     * </p> 
	 */
	public Practitioner setBirthDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myBirthDate = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>birthDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date of birth for the practitioner
     * </p> 
	 */
	public Practitioner setBirthDateWithDayPrecision( Date theDate) {
		myBirthDate = new DateDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>photo</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Image of the person
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
     * Image of the person
     * </p> 
	 */
	public Practitioner setPhoto(java.util.List<AttachmentDt> theValue) {
		myPhoto = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>photo</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Image of the person
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
	 * Image of the person
	 * </p>
	 * @param theValue The photo to add (must not be <code>null</code>)
	 */
	public Practitioner addPhoto(AttachmentDt theValue) {
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
     * Image of the person
     * </p> 
	 */
	public AttachmentDt getPhotoFirstRep() {
		if (getPhoto().isEmpty()) {
			return addPhoto();
		}
		return getPhoto().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>practitionerRole</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The list of roles/organizations that the practitioner is associated with
     * </p> 
	 */
	public java.util.List<PractitionerRole> getPractitionerRole() {  
		if (myPractitionerRole == null) {
			myPractitionerRole = new java.util.ArrayList<PractitionerRole>();
		}
		return myPractitionerRole;
	}

	/**
	 * Sets the value(s) for <b>practitionerRole</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The list of roles/organizations that the practitioner is associated with
     * </p> 
	 */
	public Practitioner setPractitionerRole(java.util.List<PractitionerRole> theValue) {
		myPractitionerRole = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>practitionerRole</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The list of roles/organizations that the practitioner is associated with
     * </p> 
	 */
	public PractitionerRole addPractitionerRole() {
		PractitionerRole newType = new PractitionerRole();
		getPractitionerRole().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>practitionerRole</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The list of roles/organizations that the practitioner is associated with
	 * </p>
	 * @param theValue The practitionerRole to add (must not be <code>null</code>)
	 */
	public Practitioner addPractitionerRole(PractitionerRole theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPractitionerRole().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>practitionerRole</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The list of roles/organizations that the practitioner is associated with
     * </p> 
	 */
	public PractitionerRole getPractitionerRoleFirstRep() {
		if (getPractitionerRole().isEmpty()) {
			return addPractitionerRole();
		}
		return getPractitionerRole().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>qualification</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<Qualification> getQualification() {  
		if (myQualification == null) {
			myQualification = new java.util.ArrayList<Qualification>();
		}
		return myQualification;
	}

	/**
	 * Sets the value(s) for <b>qualification</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Practitioner setQualification(java.util.List<Qualification> theValue) {
		myQualification = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>qualification</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Qualification addQualification() {
		Qualification newType = new Qualification();
		getQualification().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>qualification</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * 
	 * </p>
	 * @param theValue The qualification to add (must not be <code>null</code>)
	 */
	public Practitioner addQualification(Qualification theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getQualification().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>qualification</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public Qualification getQualificationFirstRep() {
		if (getQualification().isEmpty()) {
			return addQualification();
		}
		return getQualification().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>communication</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A language the practitioner is able to use in patient communication
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getCommunication() {  
		if (myCommunication == null) {
			myCommunication = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myCommunication;
	}

	/**
	 * Sets the value(s) for <b>communication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A language the practitioner is able to use in patient communication
     * </p> 
	 */
	public Practitioner setCommunication(java.util.List<CodeableConceptDt> theValue) {
		myCommunication = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>communication</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A language the practitioner is able to use in patient communication
     * </p> 
	 */
	public CodeableConceptDt addCommunication() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getCommunication().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>communication</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A language the practitioner is able to use in patient communication
	 * </p>
	 * @param theValue The communication to add (must not be <code>null</code>)
	 */
	public Practitioner addCommunication(CodeableConceptDt theValue) {
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
     * A language the practitioner is able to use in patient communication
     * </p> 
	 */
	public CodeableConceptDt getCommunicationFirstRep() {
		if (getCommunication().isEmpty()) {
			return addCommunication();
		}
		return getCommunication().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Practitioner.practitionerRole</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The list of roles/organizations that the practitioner is associated with
     * </p> 
	 */
	@Block()	
	public static class PractitionerRole 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="managingOrganization", order=0, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The organization where the Practitioner performs the roles associated"
	)
	private ResourceReferenceDt myManagingOrganization;
	
	@Child(name="role", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Roles which this practitioner is authorized to perform for the organization"
	)
	private CodeableConceptDt myRole;
	
	@Child(name="specialty", type=CodeableConceptDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specific specialty of the practitioner"
	)
	private java.util.List<CodeableConceptDt> mySpecialty;
	
	@Child(name="period", type=PeriodDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.done",
		formalDefinition="The period during which the person is authorized to act as a practitioner in these role(s) for the organization"
	)
	private PeriodDt myPeriod;
	
	@Child(name="location", order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="where",
		formalDefinition="The location(s) at which this practitioner provides care"
	)
	private java.util.List<ResourceReferenceDt> myLocation;
	
	@Child(name="healthcareService", order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.HealthcareService.class	})
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private java.util.List<ResourceReferenceDt> myHealthcareService;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myManagingOrganization,  myRole,  mySpecialty,  myPeriod,  myLocation,  myHealthcareService);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myManagingOrganization, myRole, mySpecialty, myPeriod, myLocation, myHealthcareService);
	}

	/**
	 * Gets the value(s) for <b>managingOrganization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The organization where the Practitioner performs the roles associated
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
     * The organization where the Practitioner performs the roles associated
     * </p> 
	 */
	public PractitionerRole setManagingOrganization(ResourceReferenceDt theValue) {
		myManagingOrganization = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>role</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Roles which this practitioner is authorized to perform for the organization
     * </p> 
	 */
	public CodeableConceptDt getRole() {  
		if (myRole == null) {
			myRole = new CodeableConceptDt();
		}
		return myRole;
	}

	/**
	 * Sets the value(s) for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Roles which this practitioner is authorized to perform for the organization
     * </p> 
	 */
	public PractitionerRole setRole(CodeableConceptDt theValue) {
		myRole = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>specialty</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific specialty of the practitioner
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getSpecialty() {  
		if (mySpecialty == null) {
			mySpecialty = new java.util.ArrayList<CodeableConceptDt>();
		}
		return mySpecialty;
	}

	/**
	 * Sets the value(s) for <b>specialty</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific specialty of the practitioner
     * </p> 
	 */
	public PractitionerRole setSpecialty(java.util.List<CodeableConceptDt> theValue) {
		mySpecialty = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>specialty</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specific specialty of the practitioner
     * </p> 
	 */
	public CodeableConceptDt addSpecialty() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getSpecialty().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>specialty</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Specific specialty of the practitioner
	 * </p>
	 * @param theValue The specialty to add (must not be <code>null</code>)
	 */
	public PractitionerRole addSpecialty(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSpecialty().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>specialty</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Specific specialty of the practitioner
     * </p> 
	 */
	public CodeableConceptDt getSpecialtyFirstRep() {
		if (getSpecialty().isEmpty()) {
			return addSpecialty();
		}
		return getSpecialty().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>period</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The period during which the person is authorized to act as a practitioner in these role(s) for the organization
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
     * The period during which the person is authorized to act as a practitioner in these role(s) for the organization
     * </p> 
	 */
	public PractitionerRole setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>location</b> (where).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The location(s) at which this practitioner provides care
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getLocation() {  
		if (myLocation == null) {
			myLocation = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myLocation;
	}

	/**
	 * Sets the value(s) for <b>location</b> (where)
	 *
     * <p>
     * <b>Definition:</b>
     * The location(s) at which this practitioner provides care
     * </p> 
	 */
	public PractitionerRole setLocation(java.util.List<ResourceReferenceDt> theValue) {
		myLocation = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>location</b> (where)
	 *
     * <p>
     * <b>Definition:</b>
     * The location(s) at which this practitioner provides care
     * </p> 
	 */
	public ResourceReferenceDt addLocation() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getLocation().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>healthcareService</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getHealthcareService() {  
		if (myHealthcareService == null) {
			myHealthcareService = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myHealthcareService;
	}

	/**
	 * Sets the value(s) for <b>healthcareService</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public PractitionerRole setHealthcareService(java.util.List<ResourceReferenceDt> theValue) {
		myHealthcareService = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>healthcareService</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public ResourceReferenceDt addHealthcareService() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getHealthcareService().add(newType);
		return newType; 
	}
  


	}


	/**
	 * Block class for child element: <b>Practitioner.qualification</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	@Block()	
	public static class Qualification 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An identifier that applies to this person's qualification in this role"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="code", type=CodeableConceptDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private CodeableConceptDt myCode;
	
	@Child(name="period", type=PeriodDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Period during which the qualification is valid"
	)
	private PeriodDt myPeriod;
	
	@Child(name="issuer", order=3, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Organization that regulates and issues the qualification"
	)
	private ResourceReferenceDt myIssuer;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myCode,  myPeriod,  myIssuer);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myCode, myPeriod, myIssuer);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that applies to this person's qualification in this role
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
     * An identifier that applies to this person's qualification in this role
     * </p> 
	 */
	public Qualification setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An identifier that applies to this person's qualification in this role
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
	 * An identifier that applies to this person's qualification in this role
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Qualification addIdentifier(IdentifierDt theValue) {
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
     * An identifier that applies to this person's qualification in this role
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * 
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
     * 
     * </p> 
	 */
	public Qualification setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Period during which the qualification is valid
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
     * Period during which the qualification is valid
     * </p> 
	 */
	public Qualification setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>issuer</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Organization that regulates and issues the qualification
     * </p> 
	 */
	public ResourceReferenceDt getIssuer() {  
		if (myIssuer == null) {
			myIssuer = new ResourceReferenceDt();
		}
		return myIssuer;
	}

	/**
	 * Sets the value(s) for <b>issuer</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Organization that regulates and issues the qualification
     * </p> 
	 */
	public Qualification setIssuer(ResourceReferenceDt theValue) {
		myIssuer = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "Practitioner";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
