















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
 * HAPI/FHIR <b>TestScript</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * TestScript is a resource that specifies a suite of tests against a FHIR server implementation to determine compliance against the FHIR specification.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/TestScript">http://hl7.org/fhir/profiles/TestScript</a> 
 * </p>
 *
 */
@ResourceDef(name="TestScript", profile="http://hl7.org/fhir/profiles/TestScript", id="testscript")
public class TestScript extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>TestScript.url</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="url", path="TestScript.url", description="", type="uri"  )
	public static final String SP_URL = "url";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>url</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>TestScript.url</b><br>
	 * </p>
	 */
	public static final UriClientParam URL = new UriClientParam(SP_URL);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>TestScript.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="TestScript.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>TestScript.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>TestScript.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="TestScript.name", description="", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>TestScript.name</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>TestScript.description</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="description", path="TestScript.description", description="", type="string"  )
	public static final String SP_DESCRIPTION = "description";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>description</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>TestScript.description</b><br>
	 * </p>
	 */
	public static final StringClientParam DESCRIPTION = new StringClientParam(SP_DESCRIPTION);

	/**
	 * Search parameter constant for <b>testscript-capability</b>
	 * <p>
	 * Description: <b>TestScript required and validated capability</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>TestScript.metadata.capability.description</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="testscript-capability", path="TestScript.metadata.capability.description", description="TestScript required and validated capability", type="string"  )
	public static final String SP_TESTSCRIPT_CAPABILITY = "testscript-capability";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>testscript-capability</b>
	 * <p>
	 * Description: <b>TestScript required and validated capability</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>TestScript.metadata.capability.description</b><br>
	 * </p>
	 */
	public static final StringClientParam TESTSCRIPT_CAPABILITY = new StringClientParam(SP_TESTSCRIPT_CAPABILITY);

	/**
	 * Search parameter constant for <b>testscript-setup-capability</b>
	 * <p>
	 * Description: <b>TestScript setup required and validated capability</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>TestScript.setup.metadata.capability.description</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="testscript-setup-capability", path="TestScript.setup.metadata.capability.description", description="TestScript setup required and validated capability", type="string"  )
	public static final String SP_TESTSCRIPT_SETUP_CAPABILITY = "testscript-setup-capability";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>testscript-setup-capability</b>
	 * <p>
	 * Description: <b>TestScript setup required and validated capability</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>TestScript.setup.metadata.capability.description</b><br>
	 * </p>
	 */
	public static final StringClientParam TESTSCRIPT_SETUP_CAPABILITY = new StringClientParam(SP_TESTSCRIPT_SETUP_CAPABILITY);

	/**
	 * Search parameter constant for <b>testscript-test-capability</b>
	 * <p>
	 * Description: <b>TestScript test required and validated capability</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>TestScript.test.metadata.capability.description</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="testscript-test-capability", path="TestScript.test.metadata.capability.description", description="TestScript test required and validated capability", type="string"  )
	public static final String SP_TESTSCRIPT_TEST_CAPABILITY = "testscript-test-capability";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>testscript-test-capability</b>
	 * <p>
	 * Description: <b>TestScript test required and validated capability</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>TestScript.test.metadata.capability.description</b><br>
	 * </p>
	 */
	public static final StringClientParam TESTSCRIPT_TEST_CAPABILITY = new StringClientParam(SP_TESTSCRIPT_TEST_CAPABILITY);



	@Child(name="url", type=UriDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published"
	)
	private UriDt myUrl;
	
	@Child(name="version", type=StringDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually"
	)
	private StringDt myVersion;
	
	@Child(name="name", type=StringDt.class, order=2, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A free text natural language name identifying the TestScript"
	)
	private StringDt myName;
	
	@Child(name="status", type=CodeDt.class, order=3, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The status of the TestScript"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/conformance-resource-status")
	private BoundCodeDt<ConformanceResourceStatusEnum> myStatus;
	
	@Child(name="identifier", type=IdentifierDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identifier for the TestScript assigned for external purposes outside the context of FHIR."
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="experimental", type=BooleanDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage"
	)
	private BooleanDt myExperimental;
	
	@Child(name="publisher", type=StringDt.class, order=6, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of the individual or organization that published the Test Script"
	)
	private StringDt myPublisher;
	
	@Child(name="contact", order=7, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contacts to assist a user in finding and communicating with the publisher"
	)
	private java.util.List<Contact> myContact;
	
	@Child(name="date", type=DateTimeDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change"
	)
	private DateTimeDt myDate;
	
	@Child(name="description", type=StringDt.class, order=9, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A free text natural language description of the TestScript and its use"
	)
	private StringDt myDescription;
	
	@Child(name="useContext", type=CodeableConceptDt.class, order=10, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of Test Scripts."
	)
	private java.util.List<CodeableConceptDt> myUseContext;
	
	@Child(name="requirements", type=StringDt.class, order=11, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Explains why this Test Script is needed and why it's been constrained as it has"
	)
	private StringDt myRequirements;
	
	@Child(name="copyright", type=StringDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings"
	)
	private StringDt myCopyright;
	
	@Child(name="metadata", order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The required capability must exist and are assumed to function correctly on the FHIR server being tested."
	)
	private Metadata myMetadata;
	
	@Child(name="multiserver", type=BooleanDt.class, order=14, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified."
	)
	private BooleanDt myMultiserver;
	
	@Child(name="fixture", order=15, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute."
	)
	private java.util.List<Fixture> myFixture;
	
	@Child(name="profile", order=16, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Reference to the profile to be used for validation."
	)
	private java.util.List<ResourceReferenceDt> myProfile;
	
	@Child(name="variable", order=17, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Variable is set based either on element value in response body or on header field value in the response headers."
	)
	private java.util.List<Variable> myVariable;
	
	@Child(name="setup", order=18, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A series of required setup operations before tests are executed."
	)
	private Setup mySetup;
	
	@Child(name="test", order=19, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A test in this script."
	)
	private java.util.List<Test> myTest;
	
	@Child(name="teardown", order=20, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A series of operations required to clean up after the all the tests are executed (successfully or otherwise)."
	)
	private Teardown myTeardown;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myUrl,  myVersion,  myName,  myStatus,  myIdentifier,  myExperimental,  myPublisher,  myContact,  myDate,  myDescription,  myUseContext,  myRequirements,  myCopyright,  myMetadata,  myMultiserver,  myFixture,  myProfile,  myVariable,  mySetup,  myTest,  myTeardown);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myUrl, myVersion, myName, myStatus, myIdentifier, myExperimental, myPublisher, myContact, myDate, myDescription, myUseContext, myRequirements, myCopyright, myMetadata, myMultiserver, myFixture, myProfile, myVariable, mySetup, myTest, myTeardown);
	}

	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published
     * </p> 
	 */
	public UriDt getUrlElement() {  
		if (myUrl == null) {
			myUrl = new UriDt();
		}
		return myUrl;
	}

	
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published
     * </p> 
	 */
	public String getUrl() {  
		return getUrlElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published
     * </p> 
	 */
	public TestScript setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An absolute URL that is used to identify this Test Script. This SHALL be a URL, SHOULD be globally unique, and SHOULD be an address at which this Test Script is (or will be) published
     * </p> 
	 */
	public TestScript setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>version</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually
     * </p> 
	 */
	public StringDt getVersionElement() {  
		if (myVersion == null) {
			myVersion = new StringDt();
		}
		return myVersion;
	}

	
	/**
	 * Gets the value(s) for <b>version</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually
     * </p> 
	 */
	public String getVersion() {  
		return getVersionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>version</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually
     * </p> 
	 */
	public TestScript setVersion(StringDt theValue) {
		myVersion = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>version</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The identifier that is used to identify this version of the TestScript. This is an arbitrary value managed by the TestScript author manually
     * </p> 
	 */
	public TestScript setVersion( String theString) {
		myVersion = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language name identifying the TestScript
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
     * A free text natural language name identifying the TestScript
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
     * A free text natural language name identifying the TestScript
     * </p> 
	 */
	public TestScript setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language name identifying the TestScript
     * </p> 
	 */
	public TestScript setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the TestScript
     * </p> 
	 */
	public BoundCodeDt<ConformanceResourceStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<ConformanceResourceStatusEnum>(ConformanceResourceStatusEnum.VALUESET_BINDER);
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
     * The status of the TestScript
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
     * The status of the TestScript
     * </p> 
	 */
	public TestScript setStatus(BoundCodeDt<ConformanceResourceStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the TestScript
     * </p> 
	 */
	public TestScript setStatus(ConformanceResourceStatusEnum theValue) {
		setStatus(new BoundCodeDt<ConformanceResourceStatusEnum>(ConformanceResourceStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
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
     * Identifier for the TestScript assigned for external purposes outside the context of FHIR.
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
     * Identifier for the TestScript assigned for external purposes outside the context of FHIR.
     * </p> 
	 */
	public TestScript setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>experimental</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public BooleanDt getExperimentalElement() {  
		if (myExperimental == null) {
			myExperimental = new BooleanDt();
		}
		return myExperimental;
	}

	
	/**
	 * Gets the value(s) for <b>experimental</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public Boolean getExperimental() {  
		return getExperimentalElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>experimental</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public TestScript setExperimental(BooleanDt theValue) {
		myExperimental = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>experimental</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This TestScript was authored for testing purposes (or education/evaluation/marketing), and is not intended to be used for genuine usage
     * </p> 
	 */
	public TestScript setExperimental( boolean theBoolean) {
		myExperimental = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>publisher</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the Test Script
     * </p> 
	 */
	public StringDt getPublisherElement() {  
		if (myPublisher == null) {
			myPublisher = new StringDt();
		}
		return myPublisher;
	}

	
	/**
	 * Gets the value(s) for <b>publisher</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the Test Script
     * </p> 
	 */
	public String getPublisher() {  
		return getPublisherElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>publisher</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the Test Script
     * </p> 
	 */
	public TestScript setPublisher(StringDt theValue) {
		myPublisher = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>publisher</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of the individual or organization that published the Test Script
     * </p> 
	 */
	public TestScript setPublisher( String theString) {
		myPublisher = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>contact</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts to assist a user in finding and communicating with the publisher
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
     * Contacts to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public TestScript setContact(java.util.List<Contact> theValue) {
		myContact = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>contact</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts to assist a user in finding and communicating with the publisher
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
	 * Contacts to assist a user in finding and communicating with the publisher
	 * </p>
	 * @param theValue The contact to add (must not be <code>null</code>)
	 */
	public TestScript addContact(Contact theValue) {
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
     * Contacts to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	public Contact getContactFirstRep() {
		if (getContact().isEmpty()) {
			return addContact();
		}
		return getContact().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>date</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change
     * </p> 
	 */
	public DateTimeDt getDateElement() {  
		if (myDate == null) {
			myDate = new DateTimeDt();
		}
		return myDate;
	}

	
	/**
	 * Gets the value(s) for <b>date</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change
     * </p> 
	 */
	public Date getDate() {  
		return getDateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change
     * </p> 
	 */
	public TestScript setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change
     * </p> 
	 */
	public TestScript setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date this version of the test tcript was published. The date must change when the business version changes, if it does, and it must change if the status code changes. In addition, it should change when the substantive content of the test cases change
     * </p> 
	 */
	public TestScript setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the TestScript and its use
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
     * A free text natural language description of the TestScript and its use
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
     * A free text natural language description of the TestScript and its use
     * </p> 
	 */
	public TestScript setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A free text natural language description of the TestScript and its use
     * </p> 
	 */
	public TestScript setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>useContext</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of Test Scripts.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getUseContext() {  
		if (myUseContext == null) {
			myUseContext = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myUseContext;
	}

	/**
	 * Sets the value(s) for <b>useContext</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of Test Scripts.
     * </p> 
	 */
	public TestScript setUseContext(java.util.List<CodeableConceptDt> theValue) {
		myUseContext = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>useContext</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of Test Scripts.
     * </p> 
	 */
	public CodeableConceptDt addUseContext() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getUseContext().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>useContext</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of Test Scripts.
	 * </p>
	 * @param theValue The useContext to add (must not be <code>null</code>)
	 */
	public TestScript addUseContext(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getUseContext().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>useContext</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The content was developed with a focus and intent of supporting the contexts that are listed. These terms may be used to assist with indexing and searching of Test Scripts.
     * </p> 
	 */
	public CodeableConceptDt getUseContextFirstRep() {
		if (getUseContext().isEmpty()) {
			return addUseContext();
		}
		return getUseContext().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>requirements</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Explains why this Test Script is needed and why it's been constrained as it has
     * </p> 
	 */
	public StringDt getRequirementsElement() {  
		if (myRequirements == null) {
			myRequirements = new StringDt();
		}
		return myRequirements;
	}

	
	/**
	 * Gets the value(s) for <b>requirements</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Explains why this Test Script is needed and why it's been constrained as it has
     * </p> 
	 */
	public String getRequirements() {  
		return getRequirementsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>requirements</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Explains why this Test Script is needed and why it's been constrained as it has
     * </p> 
	 */
	public TestScript setRequirements(StringDt theValue) {
		myRequirements = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>requirements</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Explains why this Test Script is needed and why it's been constrained as it has
     * </p> 
	 */
	public TestScript setRequirements( String theString) {
		myRequirements = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>copyright</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings
     * </p> 
	 */
	public StringDt getCopyrightElement() {  
		if (myCopyright == null) {
			myCopyright = new StringDt();
		}
		return myCopyright;
	}

	
	/**
	 * Gets the value(s) for <b>copyright</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings
     * </p> 
	 */
	public String getCopyright() {  
		return getCopyrightElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>copyright</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings
     * </p> 
	 */
	public TestScript setCopyright(StringDt theValue) {
		myCopyright = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>copyright</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A copyright statement relating to the Test Script and/or its contents. Copyright statements are generally legal restrictions on the use and publishing of the details of the constraints and mappings
     * </p> 
	 */
	public TestScript setCopyright( String theString) {
		myCopyright = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>metadata</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The required capability must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	public Metadata getMetadata() {  
		if (myMetadata == null) {
			myMetadata = new Metadata();
		}
		return myMetadata;
	}

	/**
	 * Sets the value(s) for <b>metadata</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The required capability must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	public TestScript setMetadata(Metadata theValue) {
		myMetadata = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>multiserver</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.
     * </p> 
	 */
	public BooleanDt getMultiserverElement() {  
		if (myMultiserver == null) {
			myMultiserver = new BooleanDt();
		}
		return myMultiserver;
	}

	
	/**
	 * Gets the value(s) for <b>multiserver</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.
     * </p> 
	 */
	public Boolean getMultiserver() {  
		return getMultiserverElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>multiserver</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.
     * </p> 
	 */
	public TestScript setMultiserver(BooleanDt theValue) {
		myMultiserver = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>multiserver</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If the tests apply to more than one FHIR server (e.g. cross-server interoperability tests) then multiserver=true. Defaults to false if value is unspecified.
     * </p> 
	 */
	public TestScript setMultiserver( boolean theBoolean) {
		myMultiserver = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>fixture</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
     * </p> 
	 */
	public java.util.List<Fixture> getFixture() {  
		if (myFixture == null) {
			myFixture = new java.util.ArrayList<Fixture>();
		}
		return myFixture;
	}

	/**
	 * Sets the value(s) for <b>fixture</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
     * </p> 
	 */
	public TestScript setFixture(java.util.List<Fixture> theValue) {
		myFixture = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>fixture</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
     * </p> 
	 */
	public Fixture addFixture() {
		Fixture newType = new Fixture();
		getFixture().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>fixture</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
	 * </p>
	 * @param theValue The fixture to add (must not be <code>null</code>)
	 */
	public TestScript addFixture(Fixture theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFixture().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>fixture</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
     * </p> 
	 */
	public Fixture getFixtureFirstRep() {
		if (getFixture().isEmpty()) {
			return addFixture();
		}
		return getFixture().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>profile</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the profile to be used for validation.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getProfile() {  
		if (myProfile == null) {
			myProfile = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myProfile;
	}

	/**
	 * Sets the value(s) for <b>profile</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the profile to be used for validation.
     * </p> 
	 */
	public TestScript setProfile(java.util.List<ResourceReferenceDt> theValue) {
		myProfile = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>profile</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the profile to be used for validation.
     * </p> 
	 */
	public ResourceReferenceDt addProfile() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getProfile().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>variable</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Variable is set based either on element value in response body or on header field value in the response headers.
     * </p> 
	 */
	public java.util.List<Variable> getVariable() {  
		if (myVariable == null) {
			myVariable = new java.util.ArrayList<Variable>();
		}
		return myVariable;
	}

	/**
	 * Sets the value(s) for <b>variable</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Variable is set based either on element value in response body or on header field value in the response headers.
     * </p> 
	 */
	public TestScript setVariable(java.util.List<Variable> theValue) {
		myVariable = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>variable</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Variable is set based either on element value in response body or on header field value in the response headers.
     * </p> 
	 */
	public Variable addVariable() {
		Variable newType = new Variable();
		getVariable().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>variable</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Variable is set based either on element value in response body or on header field value in the response headers.
	 * </p>
	 * @param theValue The variable to add (must not be <code>null</code>)
	 */
	public TestScript addVariable(Variable theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getVariable().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>variable</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Variable is set based either on element value in response body or on header field value in the response headers.
     * </p> 
	 */
	public Variable getVariableFirstRep() {
		if (getVariable().isEmpty()) {
			return addVariable();
		}
		return getVariable().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>setup</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A series of required setup operations before tests are executed.
     * </p> 
	 */
	public Setup getSetup() {  
		if (mySetup == null) {
			mySetup = new Setup();
		}
		return mySetup;
	}

	/**
	 * Sets the value(s) for <b>setup</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A series of required setup operations before tests are executed.
     * </p> 
	 */
	public TestScript setSetup(Setup theValue) {
		mySetup = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>test</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A test in this script.
     * </p> 
	 */
	public java.util.List<Test> getTest() {  
		if (myTest == null) {
			myTest = new java.util.ArrayList<Test>();
		}
		return myTest;
	}

	/**
	 * Sets the value(s) for <b>test</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A test in this script.
     * </p> 
	 */
	public TestScript setTest(java.util.List<Test> theValue) {
		myTest = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>test</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A test in this script.
     * </p> 
	 */
	public Test addTest() {
		Test newType = new Test();
		getTest().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>test</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A test in this script.
	 * </p>
	 * @param theValue The test to add (must not be <code>null</code>)
	 */
	public TestScript addTest(Test theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getTest().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>test</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A test in this script.
     * </p> 
	 */
	public Test getTestFirstRep() {
		if (getTest().isEmpty()) {
			return addTest();
		}
		return getTest().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>teardown</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A series of operations required to clean up after the all the tests are executed (successfully or otherwise).
     * </p> 
	 */
	public Teardown getTeardown() {  
		if (myTeardown == null) {
			myTeardown = new Teardown();
		}
		return myTeardown;
	}

	/**
	 * Sets the value(s) for <b>teardown</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A series of operations required to clean up after the all the tests are executed (successfully or otherwise).
     * </p> 
	 */
	public TestScript setTeardown(Teardown theValue) {
		myTeardown = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>TestScript.contact</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Contacts to assist a user in finding and communicating with the publisher
     * </p> 
	 */
	@Block()	
	public static class Contact 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=StringDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of an individual to contact regarding the Test Script"
	)
	private StringDt myName;
	
	@Child(name="telecom", type=ContactPointDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Contact details for individual (if a name was provided) or the publisher"
	)
	private java.util.List<ContactPointDt> myTelecom;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  myTelecom);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, myTelecom);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of an individual to contact regarding the Test Script
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
     * The name of an individual to contact regarding the Test Script
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
     * The name of an individual to contact regarding the Test Script
     * </p> 
	 */
	public Contact setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of an individual to contact regarding the Test Script
     * </p> 
	 */
	public Contact setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>telecom</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Contact details for individual (if a name was provided) or the publisher
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
     * Contact details for individual (if a name was provided) or the publisher
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
     * Contact details for individual (if a name was provided) or the publisher
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
	 * Contact details for individual (if a name was provided) or the publisher
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
     * Contact details for individual (if a name was provided) or the publisher
     * </p> 
	 */
	public ContactPointDt getTelecomFirstRep() {
		if (getTelecom().isEmpty()) {
			return addTelecom();
		}
		return getTelecom().get(0); 
	}
  


	}


	/**
	 * Block class for child element: <b>TestScript.metadata</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The required capability must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	@Block()	
	public static class Metadata 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="link", order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A link to the FHIR specification that this test is covering."
	)
	private java.util.List<MetadataLink> myLink;
	
	@Child(name="capability", order=1, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Capabilities that must exist and are assumed to function correctly on the FHIR server being tested."
	)
	private java.util.List<MetadataCapability> myCapability;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLink,  myCapability);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLink, myCapability);
	}

	/**
	 * Gets the value(s) for <b>link</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A link to the FHIR specification that this test is covering.
     * </p> 
	 */
	public java.util.List<MetadataLink> getLink() {  
		if (myLink == null) {
			myLink = new java.util.ArrayList<MetadataLink>();
		}
		return myLink;
	}

	/**
	 * Sets the value(s) for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A link to the FHIR specification that this test is covering.
     * </p> 
	 */
	public Metadata setLink(java.util.List<MetadataLink> theValue) {
		myLink = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A link to the FHIR specification that this test is covering.
     * </p> 
	 */
	public MetadataLink addLink() {
		MetadataLink newType = new MetadataLink();
		getLink().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>link</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A link to the FHIR specification that this test is covering.
	 * </p>
	 * @param theValue The link to add (must not be <code>null</code>)
	 */
	public Metadata addLink(MetadataLink theValue) {
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
     * A link to the FHIR specification that this test is covering.
     * </p> 
	 */
	public MetadataLink getLinkFirstRep() {
		if (getLink().isEmpty()) {
			return addLink();
		}
		return getLink().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>capability</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	public java.util.List<MetadataCapability> getCapability() {  
		if (myCapability == null) {
			myCapability = new java.util.ArrayList<MetadataCapability>();
		}
		return myCapability;
	}

	/**
	 * Sets the value(s) for <b>capability</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	public Metadata setCapability(java.util.List<MetadataCapability> theValue) {
		myCapability = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>capability</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	public MetadataCapability addCapability() {
		MetadataCapability newType = new MetadataCapability();
		getCapability().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>capability</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
	 * </p>
	 * @param theValue The capability to add (must not be <code>null</code>)
	 */
	public Metadata addCapability(MetadataCapability theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCapability().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>capability</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	public MetadataCapability getCapabilityFirstRep() {
		if (getCapability().isEmpty()) {
			return addCapability();
		}
		return getCapability().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>TestScript.metadata.link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A link to the FHIR specification that this test is covering.
     * </p> 
	 */
	@Block()	
	public static class MetadataLink 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="url", type=UriDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="URL to a particular requirement or feature within the FHIR specification."
	)
	private UriDt myUrl;
	
	@Child(name="description", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Short description of the link."
	)
	private StringDt myDescription;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myUrl,  myDescription);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myUrl, myDescription);
	}

	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * URL to a particular requirement or feature within the FHIR specification.
     * </p> 
	 */
	public UriDt getUrlElement() {  
		if (myUrl == null) {
			myUrl = new UriDt();
		}
		return myUrl;
	}

	
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * URL to a particular requirement or feature within the FHIR specification.
     * </p> 
	 */
	public String getUrl() {  
		return getUrlElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * URL to a particular requirement or feature within the FHIR specification.
     * </p> 
	 */
	public MetadataLink setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * URL to a particular requirement or feature within the FHIR specification.
     * </p> 
	 */
	public MetadataLink setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Short description of the link.
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
     * Short description of the link.
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
     * Short description of the link.
     * </p> 
	 */
	public MetadataLink setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Short description of the link.
     * </p> 
	 */
	public MetadataLink setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>TestScript.metadata.capability</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	@Block()	
	public static class MetadataCapability 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="required", type=BooleanDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Whether or not the test execution will require the given capabilities of the server in order for this test script to execute."
	)
	private BooleanDt myRequired;
	
	@Child(name="validated", type=BooleanDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute."
	)
	private BooleanDt myValidated;
	
	@Child(name="description", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Description of the capabilities that this test script is requiring the server to support."
	)
	private StringDt myDescription;
	
	@Child(name="destination", type=IntegerDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Which server these requirements apply to."
	)
	private IntegerDt myDestination;
	
	@Child(name="link", type=UriDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Links to the FHIR specification that describes this interaction and the resources involved in more detail."
	)
	private java.util.List<UriDt> myLink;
	
	@Child(name="conformance", order=5, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Conformance.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped."
	)
	private ResourceReferenceDt myConformance;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myRequired,  myValidated,  myDescription,  myDestination,  myLink,  myConformance);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myRequired, myValidated, myDescription, myDestination, myLink, myConformance);
	}

	/**
	 * Gets the value(s) for <b>required</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
     * </p> 
	 */
	public BooleanDt getRequiredElement() {  
		if (myRequired == null) {
			myRequired = new BooleanDt();
		}
		return myRequired;
	}

	
	/**
	 * Gets the value(s) for <b>required</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
     * </p> 
	 */
	public Boolean getRequired() {  
		return getRequiredElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>required</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
     * </p> 
	 */
	public MetadataCapability setRequired(BooleanDt theValue) {
		myRequired = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>required</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will require the given capabilities of the server in order for this test script to execute.
     * </p> 
	 */
	public MetadataCapability setRequired( boolean theBoolean) {
		myRequired = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>validated</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
     * </p> 
	 */
	public BooleanDt getValidatedElement() {  
		if (myValidated == null) {
			myValidated = new BooleanDt();
		}
		return myValidated;
	}

	
	/**
	 * Gets the value(s) for <b>validated</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
     * </p> 
	 */
	public Boolean getValidated() {  
		return getValidatedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>validated</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
     * </p> 
	 */
	public MetadataCapability setValidated(BooleanDt theValue) {
		myValidated = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>validated</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will validate the given capabilities of the server in order for this test script to execute.
     * </p> 
	 */
	public MetadataCapability setValidated( boolean theBoolean) {
		myValidated = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Description of the capabilities that this test script is requiring the server to support.
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
     * Description of the capabilities that this test script is requiring the server to support.
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
     * Description of the capabilities that this test script is requiring the server to support.
     * </p> 
	 */
	public MetadataCapability setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Description of the capabilities that this test script is requiring the server to support.
     * </p> 
	 */
	public MetadataCapability setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>destination</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Which server these requirements apply to.
     * </p> 
	 */
	public IntegerDt getDestinationElement() {  
		if (myDestination == null) {
			myDestination = new IntegerDt();
		}
		return myDestination;
	}

	
	/**
	 * Gets the value(s) for <b>destination</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Which server these requirements apply to.
     * </p> 
	 */
	public Integer getDestination() {  
		return getDestinationElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>destination</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Which server these requirements apply to.
     * </p> 
	 */
	public MetadataCapability setDestination(IntegerDt theValue) {
		myDestination = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>destination</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Which server these requirements apply to.
     * </p> 
	 */
	public MetadataCapability setDestination( int theInteger) {
		myDestination = new IntegerDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>link</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
     * </p> 
	 */
	public java.util.List<UriDt> getLink() {  
		if (myLink == null) {
			myLink = new java.util.ArrayList<UriDt>();
		}
		return myLink;
	}

	/**
	 * Sets the value(s) for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
     * </p> 
	 */
	public MetadataCapability setLink(java.util.List<UriDt> theValue) {
		myLink = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
     * </p> 
	 */
	public UriDt addLink() {
		UriDt newType = new UriDt();
		getLink().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>link</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
	 * </p>
	 * @param theValue The link to add (must not be <code>null</code>)
	 */
	public MetadataCapability addLink(UriDt theValue) {
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
     * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
     * </p> 
	 */
	public UriDt getLinkFirstRep() {
		if (getLink().isEmpty()) {
			return addLink();
		}
		return getLink().get(0); 
	}
 	/**
	 * Adds a new value for <b>link</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Links to the FHIR specification that describes this interaction and the resources involved in more detail.
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public MetadataCapability addLink( String theUri) {
		if (myLink == null) {
			myLink = new java.util.ArrayList<UriDt>();
		}
		myLink.add(new UriDt(theUri));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>conformance</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.
     * </p> 
	 */
	public ResourceReferenceDt getConformance() {  
		if (myConformance == null) {
			myConformance = new ResourceReferenceDt();
		}
		return myConformance;
	}

	/**
	 * Sets the value(s) for <b>conformance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Minimum conformance required of server for test script to execute successfully.   If server does not meet at a minimum the reference conformance definition, then all tests in this script are skipped.
     * </p> 
	 */
	public MetadataCapability setConformance(ResourceReferenceDt theValue) {
		myConformance = theValue;
		return this;
	}
	
	

  


	}



	/**
	 * Block class for child element: <b>TestScript.fixture</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture in the test script - by reference (uri). All fixtures are required for the test script to execute.
     * </p> 
	 */
	@Block()	
	public static class Fixture 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="autocreate", type=BooleanDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section."
	)
	private BooleanDt myAutocreate;
	
	@Child(name="autodelete", type=BooleanDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section."
	)
	private BooleanDt myAutodelete;
	
	@Child(name="resource", order=2, min=0, max=1, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Reference to the resource (containing the contents of the resource needed for operations)"
	)
	private ResourceReferenceDt myResource;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myAutocreate,  myAutodelete,  myResource);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myAutocreate, myAutodelete, myResource);
	}

	/**
	 * Gets the value(s) for <b>autocreate</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.
     * </p> 
	 */
	public BooleanDt getAutocreateElement() {  
		if (myAutocreate == null) {
			myAutocreate = new BooleanDt();
		}
		return myAutocreate;
	}

	
	/**
	 * Gets the value(s) for <b>autocreate</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.
     * </p> 
	 */
	public Boolean getAutocreate() {  
		return getAutocreateElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>autocreate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.
     * </p> 
	 */
	public Fixture setAutocreate(BooleanDt theValue) {
		myAutocreate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>autocreate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly create the fixture during setup. If true, the fixture is automatically created on each server being tested during setup, therefore no create operation is required for this fixture in the TestScript.setup section.
     * </p> 
	 */
	public Fixture setAutocreate( boolean theBoolean) {
		myAutocreate = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>autodelete</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.
     * </p> 
	 */
	public BooleanDt getAutodeleteElement() {  
		if (myAutodelete == null) {
			myAutodelete = new BooleanDt();
		}
		return myAutodelete;
	}

	
	/**
	 * Gets the value(s) for <b>autodelete</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.
     * </p> 
	 */
	public Boolean getAutodelete() {  
		return getAutodeleteElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>autodelete</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.
     * </p> 
	 */
	public Fixture setAutodelete(BooleanDt theValue) {
		myAutodelete = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>autodelete</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly delete the fixture during teardown If true, the fixture is automatically deleted on each server being tested during teardown, therefore no delete operation is required for this fixture in the TestScript.teardown section.
     * </p> 
	 */
	public Fixture setAutodelete( boolean theBoolean) {
		myAutodelete = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>resource</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the resource (containing the contents of the resource needed for operations)
     * </p> 
	 */
	public ResourceReferenceDt getResource() {  
		if (myResource == null) {
			myResource = new ResourceReferenceDt();
		}
		return myResource;
	}

	/**
	 * Sets the value(s) for <b>resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the resource (containing the contents of the resource needed for operations)
     * </p> 
	 */
	public Fixture setResource(ResourceReferenceDt theValue) {
		myResource = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>TestScript.variable</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Variable is set based either on element value in response body or on header field value in the response headers.
     * </p> 
	 */
	@Block()	
	public static class Variable 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=StringDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Descriptive name for this variable"
	)
	private StringDt myName;
	
	@Child(name="headerField", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Will be used to grab the HTTP header field value from the headers that sourceId is pointing to."
	)
	private StringDt myHeaderField;
	
	@Child(name="path", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both."
	)
	private StringDt myPath;
	
	@Child(name="sourceId", type=IdDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable."
	)
	private IdDt mySourceId;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  myHeaderField,  myPath,  mySourceId);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, myHeaderField, myPath, mySourceId);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Descriptive name for this variable
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
     * Descriptive name for this variable
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
     * Descriptive name for this variable
     * </p> 
	 */
	public Variable setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Descriptive name for this variable
     * </p> 
	 */
	public Variable setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>headerField</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.
     * </p> 
	 */
	public StringDt getHeaderFieldElement() {  
		if (myHeaderField == null) {
			myHeaderField = new StringDt();
		}
		return myHeaderField;
	}

	
	/**
	 * Gets the value(s) for <b>headerField</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.
     * </p> 
	 */
	public String getHeaderField() {  
		return getHeaderFieldElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>headerField</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.
     * </p> 
	 */
	public Variable setHeaderField(StringDt theValue) {
		myHeaderField = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>headerField</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Will be used to grab the HTTP header field value from the headers that sourceId is pointing to.
     * </p> 
	 */
	public Variable setHeaderField( String theString) {
		myHeaderField = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>path</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.
     * </p> 
	 */
	public StringDt getPathElement() {  
		if (myPath == null) {
			myPath = new StringDt();
		}
		return myPath;
	}

	
	/**
	 * Gets the value(s) for <b>path</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.
     * </p> 
	 */
	public String getPath() {  
		return getPathElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>path</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.
     * </p> 
	 */
	public Variable setPath(StringDt theValue) {
		myPath = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>path</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * XPath or JSONPath against the fixture body.  When variables are defined, either headerField must be specified or path, but not both.
     * </p> 
	 */
	public Variable setPath( String theString) {
		myPath = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>sourceId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.
     * </p> 
	 */
	public IdDt getSourceIdElement() {  
		if (mySourceId == null) {
			mySourceId = new IdDt();
		}
		return mySourceId;
	}

	
	/**
	 * Gets the value(s) for <b>sourceId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.
     * </p> 
	 */
	public String getSourceId() {  
		return getSourceIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sourceId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.
     * </p> 
	 */
	public Variable setSourceId(IdDt theValue) {
		mySourceId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sourceId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture to evaluate the XPath/JSONPath expression or the headerField  against within this variable.
     * </p> 
	 */
	public Variable setSourceId( String theId) {
		mySourceId = new IdDt(theId); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>TestScript.setup</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A series of required setup operations before tests are executed.
     * </p> 
	 */
	@Block()	
	public static class Setup 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="metadata", type=Metadata.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Capabilities that must exist and are assumed to function correctly on the FHIR server being tested."
	)
	private Metadata myMetadata;
	
	@Child(name="action", order=1, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Action would contain either an operation or an assertion."
	)
	private java.util.List<SetupAction> myAction;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myMetadata,  myAction);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myMetadata, myAction);
	}

	/**
	 * Gets the value(s) for <b>metadata</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	public Metadata getMetadata() {  
		if (myMetadata == null) {
			myMetadata = new Metadata();
		}
		return myMetadata;
	}

	/**
	 * Sets the value(s) for <b>metadata</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	public Setup setMetadata(Metadata theValue) {
		myMetadata = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>action</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Action would contain either an operation or an assertion.
     * </p> 
	 */
	public java.util.List<SetupAction> getAction() {  
		if (myAction == null) {
			myAction = new java.util.ArrayList<SetupAction>();
		}
		return myAction;
	}

	/**
	 * Sets the value(s) for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Action would contain either an operation or an assertion.
     * </p> 
	 */
	public Setup setAction(java.util.List<SetupAction> theValue) {
		myAction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Action would contain either an operation or an assertion.
     * </p> 
	 */
	public SetupAction addAction() {
		SetupAction newType = new SetupAction();
		getAction().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>action</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Action would contain either an operation or an assertion.
	 * </p>
	 * @param theValue The action to add (must not be <code>null</code>)
	 */
	public Setup addAction(SetupAction theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAction().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>action</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Action would contain either an operation or an assertion.
     * </p> 
	 */
	public SetupAction getActionFirstRep() {
		if (getAction().isEmpty()) {
			return addAction();
		}
		return getAction().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>TestScript.setup.action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Action would contain either an operation or an assertion.
     * </p> 
	 */
	@Block()	
	public static class SetupAction 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="operation", order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The operation to perform"
	)
	private SetupActionOperation myOperation;
	
	@Child(name="assert", order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Evaluates the results of previous operations to determine if the server under test behaves appropriately."
	)
	private SetupActionAssert myAssert;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myOperation,  myAssert);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myOperation, myAssert);
	}

	/**
	 * Gets the value(s) for <b>operation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The operation to perform
     * </p> 
	 */
	public SetupActionOperation getOperation() {  
		if (myOperation == null) {
			myOperation = new SetupActionOperation();
		}
		return myOperation;
	}

	/**
	 * Sets the value(s) for <b>operation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The operation to perform
     * </p> 
	 */
	public SetupAction setOperation(SetupActionOperation theValue) {
		myOperation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>assert</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Evaluates the results of previous operations to determine if the server under test behaves appropriately.
     * </p> 
	 */
	public SetupActionAssert getAssert() {  
		if (myAssert == null) {
			myAssert = new SetupActionAssert();
		}
		return myAssert;
	}

	/**
	 * Sets the value(s) for <b>assert</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Evaluates the results of previous operations to determine if the server under test behaves appropriately.
     * </p> 
	 */
	public SetupAction setAssert(SetupActionAssert theValue) {
		myAssert = theValue;
		return this;
	}
	
	

  


	}

	/**
	 * Block class for child element: <b>TestScript.setup.action.operation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The operation to perform
     * </p> 
	 */
	@Block()	
	public static class SetupActionOperation 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodingDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Server interaction or operation type"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-testscript-operation-codes")
	private CodingDt myType;
	
	@Child(name="resource", type=CodeDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/defined-types")
	private CodeDt myResource;
	
	@Child(name="label", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The label would be used for tracking/logging purposes by test engines."
	)
	private StringDt myLabel;
	
	@Child(name="description", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The description would be used by test engines for tracking and reporting purposes."
	)
	private StringDt myDescription;
	
	@Child(name="accept", type=CodeDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The content-type or mime-type to use for RESTful operation in the 'Accept' header."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/content-type")
	private BoundCodeDt<ContentTypeEnum> myAccept;
	
	@Child(name="contentType", type=CodeDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The content-type or mime-type to use for RESTful operation in the 'Content-Type' header."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/content-type")
	private BoundCodeDt<ContentTypeEnum> myContentType;
	
	@Child(name="destination", type=IntegerDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Which server to perform the operation on."
	)
	private IntegerDt myDestination;
	
	@Child(name="encodeRequestUrl", type=BooleanDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths."
	)
	private BooleanDt myEncodeRequestUrl;
	
	@Child(name="params", type=StringDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Path plus parameters after [type].  Used to set parts of the request URL explicitly."
	)
	private StringDt myParams;
	
	@Child(name="requestHeader", order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Header elements would be used to set HTTP headers."
	)
	private java.util.List<SetupActionOperationRequestHeader> myRequestHeader;
	
	@Child(name="responseId", type=IdDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The fixture id (maybe new) to map to the response."
	)
	private IdDt myResponseId;
	
	@Child(name="sourceId", type=IdDt.class, order=11, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The id of the fixture used as the body of a PUT or POST request."
	)
	private IdDt mySourceId;
	
	@Child(name="targetId", type=IdDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Id of fixture used for extracting the [id],  [type], and [vid] for GET requests"
	)
	private IdDt myTargetId;
	
	@Child(name="url", type=StringDt.class, order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Complete request URL."
	)
	private StringDt myUrl;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myResource,  myLabel,  myDescription,  myAccept,  myContentType,  myDestination,  myEncodeRequestUrl,  myParams,  myRequestHeader,  myResponseId,  mySourceId,  myTargetId,  myUrl);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myResource, myLabel, myDescription, myAccept, myContentType, myDestination, myEncodeRequestUrl, myParams, myRequestHeader, myResponseId, mySourceId, myTargetId, myUrl);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Server interaction or operation type
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
     * Server interaction or operation type
     * </p> 
	 */
	public SetupActionOperation setType(CodingDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>resource</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     * </p> 
	 */
	public CodeDt getResourceElement() {  
		if (myResource == null) {
			myResource = new CodeDt();
		}
		return myResource;
	}

	
	/**
	 * Gets the value(s) for <b>resource</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     * </p> 
	 */
	public String getResource() {  
		return getResourceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     * </p> 
	 */
	public SetupActionOperation setResource(CodeDt theValue) {
		myResource = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     * </p> 
	 */
	public SetupActionOperation setResource( String theCode) {
		myResource = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>label</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The label would be used for tracking/logging purposes by test engines.
     * </p> 
	 */
	public StringDt getLabelElement() {  
		if (myLabel == null) {
			myLabel = new StringDt();
		}
		return myLabel;
	}

	
	/**
	 * Gets the value(s) for <b>label</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The label would be used for tracking/logging purposes by test engines.
     * </p> 
	 */
	public String getLabel() {  
		return getLabelElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>label</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The label would be used for tracking/logging purposes by test engines.
     * </p> 
	 */
	public SetupActionOperation setLabel(StringDt theValue) {
		myLabel = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>label</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The label would be used for tracking/logging purposes by test engines.
     * </p> 
	 */
	public SetupActionOperation setLabel( String theString) {
		myLabel = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The description would be used by test engines for tracking and reporting purposes.
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
     * The description would be used by test engines for tracking and reporting purposes.
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
     * The description would be used by test engines for tracking and reporting purposes.
     * </p> 
	 */
	public SetupActionOperation setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The description would be used by test engines for tracking and reporting purposes.
     * </p> 
	 */
	public SetupActionOperation setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>accept</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Accept' header.
     * </p> 
	 */
	public BoundCodeDt<ContentTypeEnum> getAcceptElement() {  
		if (myAccept == null) {
			myAccept = new BoundCodeDt<ContentTypeEnum>(ContentTypeEnum.VALUESET_BINDER);
		}
		return myAccept;
	}

	
	/**
	 * Gets the value(s) for <b>accept</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Accept' header.
     * </p> 
	 */
	public String getAccept() {  
		return getAcceptElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>accept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Accept' header.
     * </p> 
	 */
	public SetupActionOperation setAccept(BoundCodeDt<ContentTypeEnum> theValue) {
		myAccept = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>accept</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Accept' header.
     * </p> 
	 */
	public SetupActionOperation setAccept(ContentTypeEnum theValue) {
		setAccept(new BoundCodeDt<ContentTypeEnum>(ContentTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getAcceptElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>contentType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     * </p> 
	 */
	public BoundCodeDt<ContentTypeEnum> getContentTypeElement() {  
		if (myContentType == null) {
			myContentType = new BoundCodeDt<ContentTypeEnum>(ContentTypeEnum.VALUESET_BINDER);
		}
		return myContentType;
	}

	
	/**
	 * Gets the value(s) for <b>contentType</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     * </p> 
	 */
	public String getContentType() {  
		return getContentTypeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>contentType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     * </p> 
	 */
	public SetupActionOperation setContentType(BoundCodeDt<ContentTypeEnum> theValue) {
		myContentType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>contentType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     * </p> 
	 */
	public SetupActionOperation setContentType(ContentTypeEnum theValue) {
		setContentType(new BoundCodeDt<ContentTypeEnum>(ContentTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getContentTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>destination</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Which server to perform the operation on.
     * </p> 
	 */
	public IntegerDt getDestinationElement() {  
		if (myDestination == null) {
			myDestination = new IntegerDt();
		}
		return myDestination;
	}

	
	/**
	 * Gets the value(s) for <b>destination</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Which server to perform the operation on.
     * </p> 
	 */
	public Integer getDestination() {  
		return getDestinationElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>destination</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Which server to perform the operation on.
     * </p> 
	 */
	public SetupActionOperation setDestination(IntegerDt theValue) {
		myDestination = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>destination</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Which server to perform the operation on.
     * </p> 
	 */
	public SetupActionOperation setDestination( int theInteger) {
		myDestination = new IntegerDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>encodeRequestUrl</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
     * </p> 
	 */
	public BooleanDt getEncodeRequestUrlElement() {  
		if (myEncodeRequestUrl == null) {
			myEncodeRequestUrl = new BooleanDt();
		}
		return myEncodeRequestUrl;
	}

	
	/**
	 * Gets the value(s) for <b>encodeRequestUrl</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
     * </p> 
	 */
	public Boolean getEncodeRequestUrl() {  
		return getEncodeRequestUrlElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>encodeRequestUrl</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
     * </p> 
	 */
	public SetupActionOperation setEncodeRequestUrl(BooleanDt theValue) {
		myEncodeRequestUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>encodeRequestUrl</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not to implicitly send the request url in encoded format. The default is true to match the standard RESTful client behavior. Set to false when communicating with a server that does not support encoded url paths.
     * </p> 
	 */
	public SetupActionOperation setEncodeRequestUrl( boolean theBoolean) {
		myEncodeRequestUrl = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>params</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Path plus parameters after [type].  Used to set parts of the request URL explicitly.
     * </p> 
	 */
	public StringDt getParamsElement() {  
		if (myParams == null) {
			myParams = new StringDt();
		}
		return myParams;
	}

	
	/**
	 * Gets the value(s) for <b>params</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Path plus parameters after [type].  Used to set parts of the request URL explicitly.
     * </p> 
	 */
	public String getParams() {  
		return getParamsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>params</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Path plus parameters after [type].  Used to set parts of the request URL explicitly.
     * </p> 
	 */
	public SetupActionOperation setParams(StringDt theValue) {
		myParams = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>params</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Path plus parameters after [type].  Used to set parts of the request URL explicitly.
     * </p> 
	 */
	public SetupActionOperation setParams( String theString) {
		myParams = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>requestHeader</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Header elements would be used to set HTTP headers.
     * </p> 
	 */
	public java.util.List<SetupActionOperationRequestHeader> getRequestHeader() {  
		if (myRequestHeader == null) {
			myRequestHeader = new java.util.ArrayList<SetupActionOperationRequestHeader>();
		}
		return myRequestHeader;
	}

	/**
	 * Sets the value(s) for <b>requestHeader</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Header elements would be used to set HTTP headers.
     * </p> 
	 */
	public SetupActionOperation setRequestHeader(java.util.List<SetupActionOperationRequestHeader> theValue) {
		myRequestHeader = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>requestHeader</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Header elements would be used to set HTTP headers.
     * </p> 
	 */
	public SetupActionOperationRequestHeader addRequestHeader() {
		SetupActionOperationRequestHeader newType = new SetupActionOperationRequestHeader();
		getRequestHeader().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>requestHeader</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Header elements would be used to set HTTP headers.
	 * </p>
	 * @param theValue The requestHeader to add (must not be <code>null</code>)
	 */
	public SetupActionOperation addRequestHeader(SetupActionOperationRequestHeader theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRequestHeader().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>requestHeader</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Header elements would be used to set HTTP headers.
     * </p> 
	 */
	public SetupActionOperationRequestHeader getRequestHeaderFirstRep() {
		if (getRequestHeader().isEmpty()) {
			return addRequestHeader();
		}
		return getRequestHeader().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>responseId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The fixture id (maybe new) to map to the response.
     * </p> 
	 */
	public IdDt getResponseIdElement() {  
		if (myResponseId == null) {
			myResponseId = new IdDt();
		}
		return myResponseId;
	}

	
	/**
	 * Gets the value(s) for <b>responseId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The fixture id (maybe new) to map to the response.
     * </p> 
	 */
	public String getResponseId() {  
		return getResponseIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>responseId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The fixture id (maybe new) to map to the response.
     * </p> 
	 */
	public SetupActionOperation setResponseId(IdDt theValue) {
		myResponseId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>responseId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The fixture id (maybe new) to map to the response.
     * </p> 
	 */
	public SetupActionOperation setResponseId( String theId) {
		myResponseId = new IdDt(theId); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>sourceId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The id of the fixture used as the body of a PUT or POST request.
     * </p> 
	 */
	public IdDt getSourceIdElement() {  
		if (mySourceId == null) {
			mySourceId = new IdDt();
		}
		return mySourceId;
	}

	
	/**
	 * Gets the value(s) for <b>sourceId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The id of the fixture used as the body of a PUT or POST request.
     * </p> 
	 */
	public String getSourceId() {  
		return getSourceIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sourceId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The id of the fixture used as the body of a PUT or POST request.
     * </p> 
	 */
	public SetupActionOperation setSourceId(IdDt theValue) {
		mySourceId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sourceId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The id of the fixture used as the body of a PUT or POST request.
     * </p> 
	 */
	public SetupActionOperation setSourceId( String theId) {
		mySourceId = new IdDt(theId); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>targetId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests
     * </p> 
	 */
	public IdDt getTargetIdElement() {  
		if (myTargetId == null) {
			myTargetId = new IdDt();
		}
		return myTargetId;
	}

	
	/**
	 * Gets the value(s) for <b>targetId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests
     * </p> 
	 */
	public String getTargetId() {  
		return getTargetIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>targetId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests
     * </p> 
	 */
	public SetupActionOperation setTargetId(IdDt theValue) {
		myTargetId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>targetId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Id of fixture used for extracting the [id],  [type], and [vid] for GET requests
     * </p> 
	 */
	public SetupActionOperation setTargetId( String theId) {
		myTargetId = new IdDt(theId); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Complete request URL.
     * </p> 
	 */
	public StringDt getUrlElement() {  
		if (myUrl == null) {
			myUrl = new StringDt();
		}
		return myUrl;
	}

	
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Complete request URL.
     * </p> 
	 */
	public String getUrl() {  
		return getUrlElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Complete request URL.
     * </p> 
	 */
	public SetupActionOperation setUrl(StringDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Complete request URL.
     * </p> 
	 */
	public SetupActionOperation setUrl( String theString) {
		myUrl = new StringDt(theString); 
		return this; 
	}

 


	}

	/**
	 * Block class for child element: <b>TestScript.setup.action.operation.requestHeader</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Header elements would be used to set HTTP headers.
     * </p> 
	 */
	@Block()	
	public static class SetupActionOperationRequestHeader 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="field", type=StringDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The HTTP header field e.g. \"Accept\""
	)
	private StringDt myField;
	
	@Child(name="value", type=StringDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The value of the header e.g. \"application/xml\""
	)
	private StringDt myValue;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myField,  myValue);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myField, myValue);
	}

	/**
	 * Gets the value(s) for <b>field</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP header field e.g. \&quot;Accept\&quot;
     * </p> 
	 */
	public StringDt getFieldElement() {  
		if (myField == null) {
			myField = new StringDt();
		}
		return myField;
	}

	
	/**
	 * Gets the value(s) for <b>field</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP header field e.g. \&quot;Accept\&quot;
     * </p> 
	 */
	public String getField() {  
		return getFieldElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>field</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP header field e.g. \&quot;Accept\&quot;
     * </p> 
	 */
	public SetupActionOperationRequestHeader setField(StringDt theValue) {
		myField = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>field</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP header field e.g. \&quot;Accept\&quot;
     * </p> 
	 */
	public SetupActionOperationRequestHeader setField( String theString) {
		myField = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the header e.g. \&quot;application/xml\&quot;
     * </p> 
	 */
	public StringDt getValueElement() {  
		if (myValue == null) {
			myValue = new StringDt();
		}
		return myValue;
	}

	
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the header e.g. \&quot;application/xml\&quot;
     * </p> 
	 */
	public String getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the header e.g. \&quot;application/xml\&quot;
     * </p> 
	 */
	public SetupActionOperationRequestHeader setValue(StringDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the header e.g. \&quot;application/xml\&quot;
     * </p> 
	 */
	public SetupActionOperationRequestHeader setValue( String theString) {
		myValue = new StringDt(theString); 
		return this; 
	}

 


	}



	/**
	 * Block class for child element: <b>TestScript.setup.action.assert</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Evaluates the results of previous operations to determine if the server under test behaves appropriately.
     * </p> 
	 */
	@Block()	
	public static class SetupActionAssert 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="label", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The label would be used for tracking/logging purposes by test engines."
	)
	private StringDt myLabel;
	
	@Child(name="description", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The description would be used by test engines for tracking and reporting purposes."
	)
	private StringDt myDescription;
	
	@Child(name="direction", type=CodeDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The direction to use for the assertion."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/assert-direction-codes")
	private BoundCodeDt<AssertionDirectionTypeEnum> myDirection;
	
	@Child(name="compareToSourceId", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Id of fixture used to compare the \"sourceId/path\" evaluations to."
	)
	private StringDt myCompareToSourceId;
	
	@Child(name="compareToSourcePath", type=StringDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="XPath or JSONPath expression against fixture used to compare the \"sourceId/path\" evaluations to."
	)
	private StringDt myCompareToSourcePath;
	
	@Child(name="contentType", type=CodeDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The content-type or mime-type to use for RESTful operation in the 'Content-Type' header."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/content-type")
	private BoundCodeDt<ContentTypeEnum> myContentType;
	
	@Child(name="headerField", type=StringDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The HTTP header field name e.g. 'Location'"
	)
	private StringDt myHeaderField;
	
	@Child(name="minimumId", type=StringDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId."
	)
	private StringDt myMinimumId;
	
	@Child(name="navigationLinks", type=BooleanDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Whether or not the test execution performs validation on the bundle navigation links"
	)
	private BooleanDt myNavigationLinks;
	
	@Child(name="operator", type=CodeDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The operator type"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/assert-operator-codes")
	private BoundCodeDt<AssertionOperatorTypeEnum> myOperator;
	
	@Child(name="path", type=StringDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server."
	)
	private StringDt myPath;
	
	@Child(name="resource", type=CodeDt.class, order=11, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/defined-types")
	private CodeDt myResource;
	
	@Child(name="response", type=CodeDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/assert-response-code-types")
	private BoundCodeDt<AssertionResponseTypesEnum> myResponse;
	
	@Child(name="responseCode", type=StringDt.class, order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The value of the HTTP response code to be tested"
	)
	private StringDt myResponseCode;
	
	@Child(name="sourceId", type=IdDt.class, order=14, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Fixture to evaluate the XPath/JSONPath expression or the headerField  against."
	)
	private IdDt mySourceId;
	
	@Child(name="validateProfileId", type=IdDt.class, order=15, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The ID of the Profile to validate against."
	)
	private IdDt myValidateProfileId;
	
	@Child(name="value", type=StringDt.class, order=16, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The value to compare to"
	)
	private StringDt myValue;
	
	@Child(name="warningOnly", type=BooleanDt.class, order=17, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Whether or not the test execution will produce a warning only on error for this assert"
	)
	private BooleanDt myWarningOnly;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLabel,  myDescription,  myDirection,  myCompareToSourceId,  myCompareToSourcePath,  myContentType,  myHeaderField,  myMinimumId,  myNavigationLinks,  myOperator,  myPath,  myResource,  myResponse,  myResponseCode,  mySourceId,  myValidateProfileId,  myValue,  myWarningOnly);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLabel, myDescription, myDirection, myCompareToSourceId, myCompareToSourcePath, myContentType, myHeaderField, myMinimumId, myNavigationLinks, myOperator, myPath, myResource, myResponse, myResponseCode, mySourceId, myValidateProfileId, myValue, myWarningOnly);
	}

	/**
	 * Gets the value(s) for <b>label</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The label would be used for tracking/logging purposes by test engines.
     * </p> 
	 */
	public StringDt getLabelElement() {  
		if (myLabel == null) {
			myLabel = new StringDt();
		}
		return myLabel;
	}

	
	/**
	 * Gets the value(s) for <b>label</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The label would be used for tracking/logging purposes by test engines.
     * </p> 
	 */
	public String getLabel() {  
		return getLabelElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>label</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The label would be used for tracking/logging purposes by test engines.
     * </p> 
	 */
	public SetupActionAssert setLabel(StringDt theValue) {
		myLabel = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>label</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The label would be used for tracking/logging purposes by test engines.
     * </p> 
	 */
	public SetupActionAssert setLabel( String theString) {
		myLabel = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The description would be used by test engines for tracking and reporting purposes.
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
     * The description would be used by test engines for tracking and reporting purposes.
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
     * The description would be used by test engines for tracking and reporting purposes.
     * </p> 
	 */
	public SetupActionAssert setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The description would be used by test engines for tracking and reporting purposes.
     * </p> 
	 */
	public SetupActionAssert setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>direction</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The direction to use for the assertion.
     * </p> 
	 */
	public BoundCodeDt<AssertionDirectionTypeEnum> getDirectionElement() {  
		if (myDirection == null) {
			myDirection = new BoundCodeDt<AssertionDirectionTypeEnum>(AssertionDirectionTypeEnum.VALUESET_BINDER);
		}
		return myDirection;
	}

	
	/**
	 * Gets the value(s) for <b>direction</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The direction to use for the assertion.
     * </p> 
	 */
	public String getDirection() {  
		return getDirectionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>direction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The direction to use for the assertion.
     * </p> 
	 */
	public SetupActionAssert setDirection(BoundCodeDt<AssertionDirectionTypeEnum> theValue) {
		myDirection = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>direction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The direction to use for the assertion.
     * </p> 
	 */
	public SetupActionAssert setDirection(AssertionDirectionTypeEnum theValue) {
		setDirection(new BoundCodeDt<AssertionDirectionTypeEnum>(AssertionDirectionTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getDirectionElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>compareToSourceId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Id of fixture used to compare the \&quot;sourceId/path\&quot; evaluations to.
     * </p> 
	 */
	public StringDt getCompareToSourceIdElement() {  
		if (myCompareToSourceId == null) {
			myCompareToSourceId = new StringDt();
		}
		return myCompareToSourceId;
	}

	
	/**
	 * Gets the value(s) for <b>compareToSourceId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Id of fixture used to compare the \&quot;sourceId/path\&quot; evaluations to.
     * </p> 
	 */
	public String getCompareToSourceId() {  
		return getCompareToSourceIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>compareToSourceId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Id of fixture used to compare the \&quot;sourceId/path\&quot; evaluations to.
     * </p> 
	 */
	public SetupActionAssert setCompareToSourceId(StringDt theValue) {
		myCompareToSourceId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>compareToSourceId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Id of fixture used to compare the \&quot;sourceId/path\&quot; evaluations to.
     * </p> 
	 */
	public SetupActionAssert setCompareToSourceId( String theString) {
		myCompareToSourceId = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>compareToSourcePath</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * XPath or JSONPath expression against fixture used to compare the \&quot;sourceId/path\&quot; evaluations to.
     * </p> 
	 */
	public StringDt getCompareToSourcePathElement() {  
		if (myCompareToSourcePath == null) {
			myCompareToSourcePath = new StringDt();
		}
		return myCompareToSourcePath;
	}

	
	/**
	 * Gets the value(s) for <b>compareToSourcePath</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * XPath or JSONPath expression against fixture used to compare the \&quot;sourceId/path\&quot; evaluations to.
     * </p> 
	 */
	public String getCompareToSourcePath() {  
		return getCompareToSourcePathElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>compareToSourcePath</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * XPath or JSONPath expression against fixture used to compare the \&quot;sourceId/path\&quot; evaluations to.
     * </p> 
	 */
	public SetupActionAssert setCompareToSourcePath(StringDt theValue) {
		myCompareToSourcePath = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>compareToSourcePath</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * XPath or JSONPath expression against fixture used to compare the \&quot;sourceId/path\&quot; evaluations to.
     * </p> 
	 */
	public SetupActionAssert setCompareToSourcePath( String theString) {
		myCompareToSourcePath = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>contentType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     * </p> 
	 */
	public BoundCodeDt<ContentTypeEnum> getContentTypeElement() {  
		if (myContentType == null) {
			myContentType = new BoundCodeDt<ContentTypeEnum>(ContentTypeEnum.VALUESET_BINDER);
		}
		return myContentType;
	}

	
	/**
	 * Gets the value(s) for <b>contentType</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     * </p> 
	 */
	public String getContentType() {  
		return getContentTypeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>contentType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     * </p> 
	 */
	public SetupActionAssert setContentType(BoundCodeDt<ContentTypeEnum> theValue) {
		myContentType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>contentType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The content-type or mime-type to use for RESTful operation in the 'Content-Type' header.
     * </p> 
	 */
	public SetupActionAssert setContentType(ContentTypeEnum theValue) {
		setContentType(new BoundCodeDt<ContentTypeEnum>(ContentTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getContentTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>headerField</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP header field name e.g. 'Location'
     * </p> 
	 */
	public StringDt getHeaderFieldElement() {  
		if (myHeaderField == null) {
			myHeaderField = new StringDt();
		}
		return myHeaderField;
	}

	
	/**
	 * Gets the value(s) for <b>headerField</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP header field name e.g. 'Location'
     * </p> 
	 */
	public String getHeaderField() {  
		return getHeaderFieldElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>headerField</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP header field name e.g. 'Location'
     * </p> 
	 */
	public SetupActionAssert setHeaderField(StringDt theValue) {
		myHeaderField = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>headerField</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The HTTP header field name e.g. 'Location'
     * </p> 
	 */
	public SetupActionAssert setHeaderField( String theString) {
		myHeaderField = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>minimumId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.
     * </p> 
	 */
	public StringDt getMinimumIdElement() {  
		if (myMinimumId == null) {
			myMinimumId = new StringDt();
		}
		return myMinimumId;
	}

	
	/**
	 * Gets the value(s) for <b>minimumId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.
     * </p> 
	 */
	public String getMinimumId() {  
		return getMinimumIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>minimumId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.
     * </p> 
	 */
	public SetupActionAssert setMinimumId(StringDt theValue) {
		myMinimumId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>minimumId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The ID of a fixture.  Asserts that the response contains at a minimumId the fixture specified by minimumId.
     * </p> 
	 */
	public SetupActionAssert setMinimumId( String theString) {
		myMinimumId = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>navigationLinks</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution performs validation on the bundle navigation links
     * </p> 
	 */
	public BooleanDt getNavigationLinksElement() {  
		if (myNavigationLinks == null) {
			myNavigationLinks = new BooleanDt();
		}
		return myNavigationLinks;
	}

	
	/**
	 * Gets the value(s) for <b>navigationLinks</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution performs validation on the bundle navigation links
     * </p> 
	 */
	public Boolean getNavigationLinks() {  
		return getNavigationLinksElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>navigationLinks</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution performs validation on the bundle navigation links
     * </p> 
	 */
	public SetupActionAssert setNavigationLinks(BooleanDt theValue) {
		myNavigationLinks = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>navigationLinks</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution performs validation on the bundle navigation links
     * </p> 
	 */
	public SetupActionAssert setNavigationLinks( boolean theBoolean) {
		myNavigationLinks = new BooleanDt(theBoolean); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>operator</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The operator type
     * </p> 
	 */
	public BoundCodeDt<AssertionOperatorTypeEnum> getOperatorElement() {  
		if (myOperator == null) {
			myOperator = new BoundCodeDt<AssertionOperatorTypeEnum>(AssertionOperatorTypeEnum.VALUESET_BINDER);
		}
		return myOperator;
	}

	
	/**
	 * Gets the value(s) for <b>operator</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The operator type
     * </p> 
	 */
	public String getOperator() {  
		return getOperatorElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>operator</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The operator type
     * </p> 
	 */
	public SetupActionAssert setOperator(BoundCodeDt<AssertionOperatorTypeEnum> theValue) {
		myOperator = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>operator</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The operator type
     * </p> 
	 */
	public SetupActionAssert setOperator(AssertionOperatorTypeEnum theValue) {
		setOperator(new BoundCodeDt<AssertionOperatorTypeEnum>(AssertionOperatorTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getOperatorElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>path</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.
     * </p> 
	 */
	public StringDt getPathElement() {  
		if (myPath == null) {
			myPath = new StringDt();
		}
		return myPath;
	}

	
	/**
	 * Gets the value(s) for <b>path</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.
     * </p> 
	 */
	public String getPath() {  
		return getPathElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>path</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.
     * </p> 
	 */
	public SetupActionAssert setPath(StringDt theValue) {
		myPath = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>path</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The XPath or JSONPath expression to be evaluated against the fixture representing the response received from server.
     * </p> 
	 */
	public SetupActionAssert setPath( String theString) {
		myPath = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>resource</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     * </p> 
	 */
	public CodeDt getResourceElement() {  
		if (myResource == null) {
			myResource = new CodeDt();
		}
		return myResource;
	}

	
	/**
	 * Gets the value(s) for <b>resource</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     * </p> 
	 */
	public String getResource() {  
		return getResourceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     * </p> 
	 */
	public SetupActionAssert setResource(CodeDt theValue) {
		myResource = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>resource</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of the resource.  See http://hl7-fhir.github.io/resourcelist.html.
     * </p> 
	 */
	public SetupActionAssert setResource( String theCode) {
		myResource = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>response</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
     * </p> 
	 */
	public BoundCodeDt<AssertionResponseTypesEnum> getResponseElement() {  
		if (myResponse == null) {
			myResponse = new BoundCodeDt<AssertionResponseTypesEnum>(AssertionResponseTypesEnum.VALUESET_BINDER);
		}
		return myResponse;
	}

	
	/**
	 * Gets the value(s) for <b>response</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
     * </p> 
	 */
	public String getResponse() {  
		return getResponseElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>response</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
     * </p> 
	 */
	public SetupActionAssert setResponse(BoundCodeDt<AssertionResponseTypesEnum> theValue) {
		myResponse = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>response</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * okay | created | noContent | notModified | bad | forbidden | notFound | methodNotAllowed | conflict | gone | preconditionFailed | unprocessable
     * </p> 
	 */
	public SetupActionAssert setResponse(AssertionResponseTypesEnum theValue) {
		setResponse(new BoundCodeDt<AssertionResponseTypesEnum>(AssertionResponseTypesEnum.VALUESET_BINDER, theValue));
		
/*
		getResponseElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>responseCode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the HTTP response code to be tested
     * </p> 
	 */
	public StringDt getResponseCodeElement() {  
		if (myResponseCode == null) {
			myResponseCode = new StringDt();
		}
		return myResponseCode;
	}

	
	/**
	 * Gets the value(s) for <b>responseCode</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the HTTP response code to be tested
     * </p> 
	 */
	public String getResponseCode() {  
		return getResponseCodeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>responseCode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the HTTP response code to be tested
     * </p> 
	 */
	public SetupActionAssert setResponseCode(StringDt theValue) {
		myResponseCode = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>responseCode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the HTTP response code to be tested
     * </p> 
	 */
	public SetupActionAssert setResponseCode( String theString) {
		myResponseCode = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>sourceId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
     * </p> 
	 */
	public IdDt getSourceIdElement() {  
		if (mySourceId == null) {
			mySourceId = new IdDt();
		}
		return mySourceId;
	}

	
	/**
	 * Gets the value(s) for <b>sourceId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
     * </p> 
	 */
	public String getSourceId() {  
		return getSourceIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sourceId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
     * </p> 
	 */
	public SetupActionAssert setSourceId(IdDt theValue) {
		mySourceId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>sourceId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Fixture to evaluate the XPath/JSONPath expression or the headerField  against.
     * </p> 
	 */
	public SetupActionAssert setSourceId( String theId) {
		mySourceId = new IdDt(theId); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>validateProfileId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The ID of the Profile to validate against.
     * </p> 
	 */
	public IdDt getValidateProfileIdElement() {  
		if (myValidateProfileId == null) {
			myValidateProfileId = new IdDt();
		}
		return myValidateProfileId;
	}

	
	/**
	 * Gets the value(s) for <b>validateProfileId</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The ID of the Profile to validate against.
     * </p> 
	 */
	public String getValidateProfileId() {  
		return getValidateProfileIdElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>validateProfileId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The ID of the Profile to validate against.
     * </p> 
	 */
	public SetupActionAssert setValidateProfileId(IdDt theValue) {
		myValidateProfileId = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>validateProfileId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The ID of the Profile to validate against.
     * </p> 
	 */
	public SetupActionAssert setValidateProfileId( String theId) {
		myValidateProfileId = new IdDt(theId); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The value to compare to
     * </p> 
	 */
	public StringDt getValueElement() {  
		if (myValue == null) {
			myValue = new StringDt();
		}
		return myValue;
	}

	
	/**
	 * Gets the value(s) for <b>value</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The value to compare to
     * </p> 
	 */
	public String getValue() {  
		return getValueElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The value to compare to
     * </p> 
	 */
	public SetupActionAssert setValue(StringDt theValue) {
		myValue = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>value</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The value to compare to
     * </p> 
	 */
	public SetupActionAssert setValue( String theString) {
		myValue = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>warningOnly</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will produce a warning only on error for this assert
     * </p> 
	 */
	public BooleanDt getWarningOnlyElement() {  
		if (myWarningOnly == null) {
			myWarningOnly = new BooleanDt();
		}
		return myWarningOnly;
	}

	
	/**
	 * Gets the value(s) for <b>warningOnly</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will produce a warning only on error for this assert
     * </p> 
	 */
	public Boolean getWarningOnly() {  
		return getWarningOnlyElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>warningOnly</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will produce a warning only on error for this assert
     * </p> 
	 */
	public SetupActionAssert setWarningOnly(BooleanDt theValue) {
		myWarningOnly = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>warningOnly</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Whether or not the test execution will produce a warning only on error for this assert
     * </p> 
	 */
	public SetupActionAssert setWarningOnly( boolean theBoolean) {
		myWarningOnly = new BooleanDt(theBoolean); 
		return this; 
	}

 


	}




	/**
	 * Block class for child element: <b>TestScript.test</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A test in this script.
     * </p> 
	 */
	@Block()	
	public static class Test 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="name", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The name of this test used for tracking/logging purposes by test engines."
	)
	private StringDt myName;
	
	@Child(name="description", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A short description of the test used by test engines for tracking and reporting purposes."
	)
	private StringDt myDescription;
	
	@Child(name="metadata", type=Metadata.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Capabilities that must exist and are assumed to function correctly on the FHIR server being tested."
	)
	private Metadata myMetadata;
	
	@Child(name="action", order=3, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Action would contain either an operation or an assertion."
	)
	private java.util.List<TestAction> myAction;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myName,  myDescription,  myMetadata,  myAction);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myName, myDescription, myMetadata, myAction);
	}

	/**
	 * Gets the value(s) for <b>name</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The name of this test used for tracking/logging purposes by test engines.
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
     * The name of this test used for tracking/logging purposes by test engines.
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
     * The name of this test used for tracking/logging purposes by test engines.
     * </p> 
	 */
	public Test setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The name of this test used for tracking/logging purposes by test engines.
     * </p> 
	 */
	public Test setName( String theString) {
		myName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A short description of the test used by test engines for tracking and reporting purposes.
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
     * A short description of the test used by test engines for tracking and reporting purposes.
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
     * A short description of the test used by test engines for tracking and reporting purposes.
     * </p> 
	 */
	public Test setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A short description of the test used by test engines for tracking and reporting purposes.
     * </p> 
	 */
	public Test setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>metadata</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	public Metadata getMetadata() {  
		if (myMetadata == null) {
			myMetadata = new Metadata();
		}
		return myMetadata;
	}

	/**
	 * Sets the value(s) for <b>metadata</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Capabilities that must exist and are assumed to function correctly on the FHIR server being tested.
     * </p> 
	 */
	public Test setMetadata(Metadata theValue) {
		myMetadata = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>action</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Action would contain either an operation or an assertion.
     * </p> 
	 */
	public java.util.List<TestAction> getAction() {  
		if (myAction == null) {
			myAction = new java.util.ArrayList<TestAction>();
		}
		return myAction;
	}

	/**
	 * Sets the value(s) for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Action would contain either an operation or an assertion.
     * </p> 
	 */
	public Test setAction(java.util.List<TestAction> theValue) {
		myAction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Action would contain either an operation or an assertion.
     * </p> 
	 */
	public TestAction addAction() {
		TestAction newType = new TestAction();
		getAction().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>action</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Action would contain either an operation or an assertion.
	 * </p>
	 * @param theValue The action to add (must not be <code>null</code>)
	 */
	public Test addAction(TestAction theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAction().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>action</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Action would contain either an operation or an assertion.
     * </p> 
	 */
	public TestAction getActionFirstRep() {
		if (getAction().isEmpty()) {
			return addAction();
		}
		return getAction().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>TestScript.test.action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Action would contain either an operation or an assertion.
     * </p> 
	 */
	@Block()	
	public static class TestAction 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="operation", type=SetupActionOperation.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An operation would involve a REST request to a server."
	)
	private SetupActionOperation myOperation;
	
	@Child(name="assert", type=SetupActionAssert.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Evaluates the results of previous operations to determine if the server under test behaves appropriately."
	)
	private SetupActionAssert myAssert;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myOperation,  myAssert);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myOperation, myAssert);
	}

	/**
	 * Gets the value(s) for <b>operation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An operation would involve a REST request to a server.
     * </p> 
	 */
	public SetupActionOperation getOperation() {  
		if (myOperation == null) {
			myOperation = new SetupActionOperation();
		}
		return myOperation;
	}

	/**
	 * Sets the value(s) for <b>operation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An operation would involve a REST request to a server.
     * </p> 
	 */
	public TestAction setOperation(SetupActionOperation theValue) {
		myOperation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>assert</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Evaluates the results of previous operations to determine if the server under test behaves appropriately.
     * </p> 
	 */
	public SetupActionAssert getAssert() {  
		if (myAssert == null) {
			myAssert = new SetupActionAssert();
		}
		return myAssert;
	}

	/**
	 * Sets the value(s) for <b>assert</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Evaluates the results of previous operations to determine if the server under test behaves appropriately.
     * </p> 
	 */
	public TestAction setAssert(SetupActionAssert theValue) {
		myAssert = theValue;
		return this;
	}
	
	

  


	}



	/**
	 * Block class for child element: <b>TestScript.teardown</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A series of operations required to clean up after the all the tests are executed (successfully or otherwise).
     * </p> 
	 */
	@Block()	
	public static class Teardown 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="action", order=0, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The teardown action will only contain an operation."
	)
	private java.util.List<TeardownAction> myAction;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myAction);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myAction);
	}

	/**
	 * Gets the value(s) for <b>action</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The teardown action will only contain an operation.
     * </p> 
	 */
	public java.util.List<TeardownAction> getAction() {  
		if (myAction == null) {
			myAction = new java.util.ArrayList<TeardownAction>();
		}
		return myAction;
	}

	/**
	 * Sets the value(s) for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The teardown action will only contain an operation.
     * </p> 
	 */
	public Teardown setAction(java.util.List<TeardownAction> theValue) {
		myAction = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The teardown action will only contain an operation.
     * </p> 
	 */
	public TeardownAction addAction() {
		TeardownAction newType = new TeardownAction();
		getAction().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>action</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The teardown action will only contain an operation.
	 * </p>
	 * @param theValue The action to add (must not be <code>null</code>)
	 */
	public Teardown addAction(TeardownAction theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAction().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>action</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The teardown action will only contain an operation.
     * </p> 
	 */
	public TeardownAction getActionFirstRep() {
		if (getAction().isEmpty()) {
			return addAction();
		}
		return getAction().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>TestScript.teardown.action</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The teardown action will only contain an operation.
     * </p> 
	 */
	@Block()	
	public static class TeardownAction 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="operation", type=SetupActionOperation.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An operation would involve a REST request to a server."
	)
	private SetupActionOperation myOperation;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myOperation);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myOperation);
	}

	/**
	 * Gets the value(s) for <b>operation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An operation would involve a REST request to a server.
     * </p> 
	 */
	public SetupActionOperation getOperation() {  
		if (myOperation == null) {
			myOperation = new SetupActionOperation();
		}
		return myOperation;
	}

	/**
	 * Sets the value(s) for <b>operation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An operation would involve a REST request to a server.
     * </p> 
	 */
	public TeardownAction setOperation(SetupActionOperation theValue) {
		myOperation = theValue;
		return this;
	}
	
	

  


	}





    @Override
    public String getResourceName() {
        return "TestScript";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
