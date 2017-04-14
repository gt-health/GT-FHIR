















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
 * HAPI/FHIR <b>ImagingStudy</b> Resource
 * (clinical.diagnostics)
 *
 * <p>
 * <b>Definition:</b>
 * Representation of the content produced in a DICOM imaging study. A study comprises a set of series, each of which includes a set of Service-Object Pair Instances (SOP Instances - images or other data) acquired or produced in a common context.  A series is of only one modality (e.g. X-ray, CT, MR, ultrasound), but a study may have multiple series of different modalities.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/ImagingStudy">http://hl7.org/fhir/profiles/ImagingStudy</a> 
 * </p>
 *
 */
@ResourceDef(name="ImagingStudy", profile="http://hl7.org/fhir/profiles/ImagingStudy", id="imagingstudy")
public class ImagingStudy extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Who the study is about</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImagingStudy.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="ImagingStudy.patient", description="Who the study is about", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Who the study is about</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImagingStudy.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>started</b>
	 * <p>
	 * Description: <b>When the study was started</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ImagingStudy.started</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="started", path="ImagingStudy.started", description="When the study was started", type="date"  )
	public static final String SP_STARTED = "started";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>started</b>
	 * <p>
	 * Description: <b>When the study was started</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ImagingStudy.started</b><br>
	 * </p>
	 */
	public static final DateClientParam STARTED = new DateClientParam(SP_STARTED);

	/**
	 * Search parameter constant for <b>accession</b>
	 * <p>
	 * Description: <b>The accession identifier for the study</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImagingStudy.accession</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="accession", path="ImagingStudy.accession", description="The accession identifier for the study", type="token"  )
	public static final String SP_ACCESSION = "accession";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>accession</b>
	 * <p>
	 * Description: <b>The accession identifier for the study</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImagingStudy.accession</b><br>
	 * </p>
	 */
	public static final TokenClientParam ACCESSION = new TokenClientParam(SP_ACCESSION);

	/**
	 * Search parameter constant for <b>study</b>
	 * <p>
	 * Description: <b>The study identifier for the image</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingStudy.uid</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="study", path="ImagingStudy.uid", description="The study identifier for the image", type="uri"  )
	public static final String SP_STUDY = "study";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>study</b>
	 * <p>
	 * Description: <b>The study identifier for the image</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingStudy.uid</b><br>
	 * </p>
	 */
	public static final UriClientParam STUDY = new UriClientParam(SP_STUDY);

	/**
	 * Search parameter constant for <b>series</b>
	 * <p>
	 * Description: <b>The identifier of the series of images</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingStudy.series.uid</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="series", path="ImagingStudy.series.uid", description="The identifier of the series of images", type="uri"  )
	public static final String SP_SERIES = "series";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>series</b>
	 * <p>
	 * Description: <b>The identifier of the series of images</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingStudy.series.uid</b><br>
	 * </p>
	 */
	public static final UriClientParam SERIES = new UriClientParam(SP_SERIES);

	/**
	 * Search parameter constant for <b>modality</b>
	 * <p>
	 * Description: <b>The modality of the series</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImagingStudy.series.modality</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="modality", path="ImagingStudy.series.modality", description="The modality of the series", type="token"  )
	public static final String SP_MODALITY = "modality";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>modality</b>
	 * <p>
	 * Description: <b>The modality of the series</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImagingStudy.series.modality</b><br>
	 * </p>
	 */
	public static final TokenClientParam MODALITY = new TokenClientParam(SP_MODALITY);

	/**
	 * Search parameter constant for <b>bodysite</b>
	 * <p>
	 * Description: <b>The body site studied</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImagingStudy.series.bodySite</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="bodysite", path="ImagingStudy.series.bodySite", description="The body site studied", type="token"  )
	public static final String SP_BODYSITE = "bodysite";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>bodysite</b>
	 * <p>
	 * Description: <b>The body site studied</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImagingStudy.series.bodySite</b><br>
	 * </p>
	 */
	public static final TokenClientParam BODYSITE = new TokenClientParam(SP_BODYSITE);

	/**
	 * Search parameter constant for <b>uid</b>
	 * <p>
	 * Description: <b>The instance unique identifier</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingStudy.series.instance.uid</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="uid", path="ImagingStudy.series.instance.uid", description="The instance unique identifier", type="uri"  )
	public static final String SP_UID = "uid";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>uid</b>
	 * <p>
	 * Description: <b>The instance unique identifier</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingStudy.series.instance.uid</b><br>
	 * </p>
	 */
	public static final UriClientParam UID = new UriClientParam(SP_UID);

	/**
	 * Search parameter constant for <b>dicom-class</b>
	 * <p>
	 * Description: <b>The type of the instance</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingStudy.series.instance.sopClass</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="dicom-class", path="ImagingStudy.series.instance.sopClass", description="The type of the instance", type="uri"  )
	public static final String SP_DICOM_CLASS = "dicom-class";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>dicom-class</b>
	 * <p>
	 * Description: <b>The type of the instance</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingStudy.series.instance.sopClass</b><br>
	 * </p>
	 */
	public static final UriClientParam DICOM_CLASS = new UriClientParam(SP_DICOM_CLASS);

	/**
	 * Search parameter constant for <b>order</b>
	 * <p>
	 * Description: <b>The order for the image</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImagingStudy.order</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="order", path="ImagingStudy.order", description="The order for the image", type="reference"  )
	public static final String SP_ORDER = "order";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>order</b>
	 * <p>
	 * Description: <b>The order for the image</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImagingStudy.order</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ORDER = new ReferenceClientParam(SP_ORDER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ImagingStudy:order</b>".
	 */
	public static final Include INCLUDE_ORDER = new Include("ImagingStudy:order");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ImagingStudy:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("ImagingStudy:patient");


	@Child(name="started", type=DateTimeDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.init",
		formalDefinition="Date and Time the study started"
	)
	private DateTimeDt myStarted;
	
	@Child(name="patient", order=1, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The patient imaged in the study."
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="uid", type=OidDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Formal identifier for the study"
	)
	private OidDt myUid;
	
	@Child(name="accession", type=IdentifierDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf)"
	)
	private IdentifierDt myAccession;
	
	@Child(name="identifier", type=IdentifierDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Other identifiers for the study"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="order", order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.DiagnosticOrder.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A list of the diagnostic orders that resulted in this imaging study being performed"
	)
	private java.util.List<ResourceReferenceDt> myOrder;
	
	@Child(name="modalityList", type=CodingDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19)"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-dicom-cid29")
	private java.util.List<CodingDt> myModalityList;
	
	@Child(name="referrer", order=7, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="who.cause",
		formalDefinition="The requesting/referring physician"
	)
	private ResourceReferenceDt myReferrer;
	
	@Child(name="availability", type=CodeDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="status",
		formalDefinition="Availability of study (online, offline or nearline)"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/instance-availability")
	private BoundCodeDt<InstanceAvailabilityEnum> myAvailability;
	
	@Child(name="url", type=UriDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="WADO-RS resource where Study is available."
	)
	private UriDt myUrl;
	
	@Child(name="numberOfSeries", type=UnsignedIntDt.class, order=10, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Number of Series in Study"
	)
	private UnsignedIntDt myNumberOfSeries;
	
	@Child(name="numberOfInstances", type=UnsignedIntDt.class, order=11, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Number of SOP Instances in Study"
	)
	private UnsignedIntDt myNumberOfInstances;
	
	@Child(name="procedure", order=12, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Procedure.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Type of procedure performed"
	)
	private java.util.List<ResourceReferenceDt> myProcedure;
	
	@Child(name="interpreter", order=13, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="who.witness",
		formalDefinition="Who read the study and interpreted the images or other content"
	)
	private ResourceReferenceDt myInterpreter;
	
	@Child(name="description", type=StringDt.class, order=14, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Institution-generated description or classification of the Study performed"
	)
	private StringDt myDescription;
	
	@Child(name="series", order=15, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Each study has one or more series of images or other content"
	)
	private java.util.List<Series> mySeries;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myStarted,  myPatient,  myUid,  myAccession,  myIdentifier,  myOrder,  myModalityList,  myReferrer,  myAvailability,  myUrl,  myNumberOfSeries,  myNumberOfInstances,  myProcedure,  myInterpreter,  myDescription,  mySeries);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myStarted, myPatient, myUid, myAccession, myIdentifier, myOrder, myModalityList, myReferrer, myAvailability, myUrl, myNumberOfSeries, myNumberOfInstances, myProcedure, myInterpreter, myDescription, mySeries);
	}

	/**
	 * Gets the value(s) for <b>started</b> (when.init).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date and Time the study started
     * </p> 
	 */
	public DateTimeDt getStartedElement() {  
		if (myStarted == null) {
			myStarted = new DateTimeDt();
		}
		return myStarted;
	}

	
	/**
	 * Gets the value(s) for <b>started</b> (when.init).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date and Time the study started
     * </p> 
	 */
	public Date getStarted() {  
		return getStartedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>started</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date and Time the study started
     * </p> 
	 */
	public ImagingStudy setStarted(DateTimeDt theValue) {
		myStarted = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>started</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date and Time the study started
     * </p> 
	 */
	public ImagingStudy setStarted( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myStarted = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>started</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * Date and Time the study started
     * </p> 
	 */
	public ImagingStudy setStartedWithSecondsPrecision( Date theDate) {
		myStarted = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>patient</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The patient imaged in the study.
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
     * The patient imaged in the study.
     * </p> 
	 */
	public ImagingStudy setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>uid</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Formal identifier for the study
     * </p> 
	 */
	public OidDt getUidElement() {  
		if (myUid == null) {
			myUid = new OidDt();
		}
		return myUid;
	}

	
	/**
	 * Gets the value(s) for <b>uid</b> (id).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Formal identifier for the study
     * </p> 
	 */
	public String getUid() {  
		return getUidElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>uid</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Formal identifier for the study
     * </p> 
	 */
	public ImagingStudy setUid(OidDt theValue) {
		myUid = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>accession</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf)
     * </p> 
	 */
	public IdentifierDt getAccession() {  
		if (myAccession == null) {
			myAccession = new IdentifierDt();
		}
		return myAccession;
	}

	/**
	 * Sets the value(s) for <b>accession</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Accession Number is an identifier related to some aspect of imaging workflow and data management. Usage may vary across different institutions.  See for instance [IHE Radiology Technical Framework Volume 1 Appendix A](http://www.ihe.net/uploadedFiles/Documents/Radiology/IHE_RAD_TF_Rev13.0_Vol1_FT_2014-07-30.pdf)
     * </p> 
	 */
	public ImagingStudy setAccession(IdentifierDt theValue) {
		myAccession = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Other identifiers for the study
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
     * Other identifiers for the study
     * </p> 
	 */
	public ImagingStudy setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Other identifiers for the study
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
	 * Other identifiers for the study
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public ImagingStudy addIdentifier(IdentifierDt theValue) {
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
     * Other identifiers for the study
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>order</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of the diagnostic orders that resulted in this imaging study being performed
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getOrder() {  
		if (myOrder == null) {
			myOrder = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myOrder;
	}

	/**
	 * Sets the value(s) for <b>order</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of the diagnostic orders that resulted in this imaging study being performed
     * </p> 
	 */
	public ImagingStudy setOrder(java.util.List<ResourceReferenceDt> theValue) {
		myOrder = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>order</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A list of the diagnostic orders that resulted in this imaging study being performed
     * </p> 
	 */
	public ResourceReferenceDt addOrder() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getOrder().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>modalityList</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19)
     * </p> 
	 */
	public java.util.List<CodingDt> getModalityList() {  
		if (myModalityList == null) {
			myModalityList = new java.util.ArrayList<CodingDt>();
		}
		return myModalityList;
	}

	/**
	 * Sets the value(s) for <b>modalityList</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19)
     * </p> 
	 */
	public ImagingStudy setModalityList(java.util.List<CodingDt> theValue) {
		myModalityList = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>modalityList</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19)
     * </p> 
	 */
	public CodingDt addModalityList() {
		CodingDt newType = new CodingDt();
		getModalityList().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>modalityList</b> (class)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19)
	 * </p>
	 * @param theValue The modalityList to add (must not be <code>null</code>)
	 */
	public ImagingStudy addModalityList(CodingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getModalityList().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>modalityList</b> (class),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of all the Series.ImageModality values that are actual acquisition modalities, i.e. those in the DICOM Context Group 29 (value set OID 1.2.840.10008.6.1.19)
     * </p> 
	 */
	public CodingDt getModalityListFirstRep() {
		if (getModalityList().isEmpty()) {
			return addModalityList();
		}
		return getModalityList().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>referrer</b> (who.cause).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The requesting/referring physician
     * </p> 
	 */
	public ResourceReferenceDt getReferrer() {  
		if (myReferrer == null) {
			myReferrer = new ResourceReferenceDt();
		}
		return myReferrer;
	}

	/**
	 * Sets the value(s) for <b>referrer</b> (who.cause)
	 *
     * <p>
     * <b>Definition:</b>
     * The requesting/referring physician
     * </p> 
	 */
	public ImagingStudy setReferrer(ResourceReferenceDt theValue) {
		myReferrer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>availability</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Availability of study (online, offline or nearline)
     * </p> 
	 */
	public BoundCodeDt<InstanceAvailabilityEnum> getAvailabilityElement() {  
		if (myAvailability == null) {
			myAvailability = new BoundCodeDt<InstanceAvailabilityEnum>(InstanceAvailabilityEnum.VALUESET_BINDER);
		}
		return myAvailability;
	}

	
	/**
	 * Gets the value(s) for <b>availability</b> (status).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Availability of study (online, offline or nearline)
     * </p> 
	 */
	public String getAvailability() {  
		return getAvailabilityElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>availability</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Availability of study (online, offline or nearline)
     * </p> 
	 */
	public ImagingStudy setAvailability(BoundCodeDt<InstanceAvailabilityEnum> theValue) {
		myAvailability = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>availability</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * Availability of study (online, offline or nearline)
     * </p> 
	 */
	public ImagingStudy setAvailability(InstanceAvailabilityEnum theValue) {
		setAvailability(new BoundCodeDt<InstanceAvailabilityEnum>(InstanceAvailabilityEnum.VALUESET_BINDER, theValue));
		
/*
		getAvailabilityElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * WADO-RS resource where Study is available.
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
     * WADO-RS resource where Study is available.
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
     * WADO-RS resource where Study is available.
     * </p> 
	 */
	public ImagingStudy setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * WADO-RS resource where Study is available.
     * </p> 
	 */
	public ImagingStudy setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>numberOfSeries</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Number of Series in Study
     * </p> 
	 */
	public UnsignedIntDt getNumberOfSeriesElement() {  
		if (myNumberOfSeries == null) {
			myNumberOfSeries = new UnsignedIntDt();
		}
		return myNumberOfSeries;
	}

	
	/**
	 * Gets the value(s) for <b>numberOfSeries</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Number of Series in Study
     * </p> 
	 */
	public Integer getNumberOfSeries() {  
		return getNumberOfSeriesElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>numberOfSeries</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Number of Series in Study
     * </p> 
	 */
	public ImagingStudy setNumberOfSeries(UnsignedIntDt theValue) {
		myNumberOfSeries = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>numberOfSeries</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Number of Series in Study
     * </p> 
	 */
	public ImagingStudy setNumberOfSeries( int theInteger) {
		myNumberOfSeries = new UnsignedIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>numberOfInstances</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Number of SOP Instances in Study
     * </p> 
	 */
	public UnsignedIntDt getNumberOfInstancesElement() {  
		if (myNumberOfInstances == null) {
			myNumberOfInstances = new UnsignedIntDt();
		}
		return myNumberOfInstances;
	}

	
	/**
	 * Gets the value(s) for <b>numberOfInstances</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Number of SOP Instances in Study
     * </p> 
	 */
	public Integer getNumberOfInstances() {  
		return getNumberOfInstancesElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>numberOfInstances</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Number of SOP Instances in Study
     * </p> 
	 */
	public ImagingStudy setNumberOfInstances(UnsignedIntDt theValue) {
		myNumberOfInstances = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>numberOfInstances</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Number of SOP Instances in Study
     * </p> 
	 */
	public ImagingStudy setNumberOfInstances( int theInteger) {
		myNumberOfInstances = new UnsignedIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>procedure</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Type of procedure performed
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getProcedure() {  
		if (myProcedure == null) {
			myProcedure = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myProcedure;
	}

	/**
	 * Sets the value(s) for <b>procedure</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Type of procedure performed
     * </p> 
	 */
	public ImagingStudy setProcedure(java.util.List<ResourceReferenceDt> theValue) {
		myProcedure = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>procedure</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Type of procedure performed
     * </p> 
	 */
	public ResourceReferenceDt addProcedure() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getProcedure().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>interpreter</b> (who.witness).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Who read the study and interpreted the images or other content
     * </p> 
	 */
	public ResourceReferenceDt getInterpreter() {  
		if (myInterpreter == null) {
			myInterpreter = new ResourceReferenceDt();
		}
		return myInterpreter;
	}

	/**
	 * Sets the value(s) for <b>interpreter</b> (who.witness)
	 *
     * <p>
     * <b>Definition:</b>
     * Who read the study and interpreted the images or other content
     * </p> 
	 */
	public ImagingStudy setInterpreter(ResourceReferenceDt theValue) {
		myInterpreter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Institution-generated description or classification of the Study performed
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
     * Institution-generated description or classification of the Study performed
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
     * Institution-generated description or classification of the Study performed
     * </p> 
	 */
	public ImagingStudy setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Institution-generated description or classification of the Study performed
     * </p> 
	 */
	public ImagingStudy setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>series</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Each study has one or more series of images or other content
     * </p> 
	 */
	public java.util.List<Series> getSeries() {  
		if (mySeries == null) {
			mySeries = new java.util.ArrayList<Series>();
		}
		return mySeries;
	}

	/**
	 * Sets the value(s) for <b>series</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Each study has one or more series of images or other content
     * </p> 
	 */
	public ImagingStudy setSeries(java.util.List<Series> theValue) {
		mySeries = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>series</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Each study has one or more series of images or other content
     * </p> 
	 */
	public Series addSeries() {
		Series newType = new Series();
		getSeries().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>series</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Each study has one or more series of images or other content
	 * </p>
	 * @param theValue The series to add (must not be <code>null</code>)
	 */
	public ImagingStudy addSeries(Series theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSeries().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>series</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Each study has one or more series of images or other content
     * </p> 
	 */
	public Series getSeriesFirstRep() {
		if (getSeries().isEmpty()) {
			return addSeries();
		}
		return getSeries().get(0); 
	}
  
	/**
	 * Block class for child element: <b>ImagingStudy.series</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Each study has one or more series of images or other content
     * </p> 
	 */
	@Block()	
	public static class Series 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="number", type=UnsignedIntDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The Numeric identifier of this series in the study."
	)
	private UnsignedIntDt myNumber;
	
	@Child(name="modality", type=CodingDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The modality of this series sequence"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-dicom-cid29")
	private CodingDt myModality;
	
	@Child(name="uid", type=OidDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Formal identifier for this series"
	)
	private OidDt myUid;
	
	@Child(name="description", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A description of the series"
	)
	private StringDt myDescription;
	
	@Child(name="numberOfInstances", type=UnsignedIntDt.class, order=4, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Number of SOP Instances in Series."
	)
	private UnsignedIntDt myNumberOfInstances;
	
	@Child(name="availability", type=CodeDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Availability of series (online, offline or nearline)"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/instance-availability")
	private BoundCodeDt<InstanceAvailabilityEnum> myAvailability;
	
	@Child(name="url", type=UriDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="URI/URL specifying the location of the referenced series using WADO-RS"
	)
	private UriDt myUrl;
	
	@Child(name="bodySite", type=CodingDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Body part examined. See  DICOM Part 16 Annex L for the mapping from DICOM to Snomed CT"
	)
	private CodingDt myBodySite;
	
	@Child(name="laterality", type=CodingDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Laterality if body site is paired anatomic structure and laterality is not pre-coordinated in body site code."
	)
	private CodingDt myLaterality;
	
	@Child(name="started", type=DateTimeDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The date and time the series was started."
	)
	private DateTimeDt myStarted;
	
	@Child(name="instance", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A single SOP Instance within the series, e.g. an image, or presentation state."
	)
	private java.util.List<SeriesInstance> myInstance;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myNumber,  myModality,  myUid,  myDescription,  myNumberOfInstances,  myAvailability,  myUrl,  myBodySite,  myLaterality,  myStarted,  myInstance);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myNumber, myModality, myUid, myDescription, myNumberOfInstances, myAvailability, myUrl, myBodySite, myLaterality, myStarted, myInstance);
	}

	/**
	 * Gets the value(s) for <b>number</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The Numeric identifier of this series in the study.
     * </p> 
	 */
	public UnsignedIntDt getNumberElement() {  
		if (myNumber == null) {
			myNumber = new UnsignedIntDt();
		}
		return myNumber;
	}

	
	/**
	 * Gets the value(s) for <b>number</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The Numeric identifier of this series in the study.
     * </p> 
	 */
	public Integer getNumber() {  
		return getNumberElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>number</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The Numeric identifier of this series in the study.
     * </p> 
	 */
	public Series setNumber(UnsignedIntDt theValue) {
		myNumber = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>number</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The Numeric identifier of this series in the study.
     * </p> 
	 */
	public Series setNumber( int theInteger) {
		myNumber = new UnsignedIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>modality</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The modality of this series sequence
     * </p> 
	 */
	public CodingDt getModality() {  
		if (myModality == null) {
			myModality = new CodingDt();
		}
		return myModality;
	}

	/**
	 * Sets the value(s) for <b>modality</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The modality of this series sequence
     * </p> 
	 */
	public Series setModality(CodingDt theValue) {
		myModality = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>uid</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Formal identifier for this series
     * </p> 
	 */
	public OidDt getUidElement() {  
		if (myUid == null) {
			myUid = new OidDt();
		}
		return myUid;
	}

	
	/**
	 * Gets the value(s) for <b>uid</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Formal identifier for this series
     * </p> 
	 */
	public String getUid() {  
		return getUidElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>uid</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Formal identifier for this series
     * </p> 
	 */
	public Series setUid(OidDt theValue) {
		myUid = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>description</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the series
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
     * A description of the series
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
     * A description of the series
     * </p> 
	 */
	public Series setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A description of the series
     * </p> 
	 */
	public Series setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>numberOfInstances</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Number of SOP Instances in Series.
     * </p> 
	 */
	public UnsignedIntDt getNumberOfInstancesElement() {  
		if (myNumberOfInstances == null) {
			myNumberOfInstances = new UnsignedIntDt();
		}
		return myNumberOfInstances;
	}

	
	/**
	 * Gets the value(s) for <b>numberOfInstances</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Number of SOP Instances in Series.
     * </p> 
	 */
	public Integer getNumberOfInstances() {  
		return getNumberOfInstancesElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>numberOfInstances</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Number of SOP Instances in Series.
     * </p> 
	 */
	public Series setNumberOfInstances(UnsignedIntDt theValue) {
		myNumberOfInstances = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>numberOfInstances</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Number of SOP Instances in Series.
     * </p> 
	 */
	public Series setNumberOfInstances( int theInteger) {
		myNumberOfInstances = new UnsignedIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>availability</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Availability of series (online, offline or nearline)
     * </p> 
	 */
	public BoundCodeDt<InstanceAvailabilityEnum> getAvailabilityElement() {  
		if (myAvailability == null) {
			myAvailability = new BoundCodeDt<InstanceAvailabilityEnum>(InstanceAvailabilityEnum.VALUESET_BINDER);
		}
		return myAvailability;
	}

	
	/**
	 * Gets the value(s) for <b>availability</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Availability of series (online, offline or nearline)
     * </p> 
	 */
	public String getAvailability() {  
		return getAvailabilityElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>availability</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Availability of series (online, offline or nearline)
     * </p> 
	 */
	public Series setAvailability(BoundCodeDt<InstanceAvailabilityEnum> theValue) {
		myAvailability = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>availability</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Availability of series (online, offline or nearline)
     * </p> 
	 */
	public Series setAvailability(InstanceAvailabilityEnum theValue) {
		setAvailability(new BoundCodeDt<InstanceAvailabilityEnum>(InstanceAvailabilityEnum.VALUESET_BINDER, theValue));
		
/*
		getAvailabilityElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * URI/URL specifying the location of the referenced series using WADO-RS
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
     * URI/URL specifying the location of the referenced series using WADO-RS
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
     * URI/URL specifying the location of the referenced series using WADO-RS
     * </p> 
	 */
	public Series setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * URI/URL specifying the location of the referenced series using WADO-RS
     * </p> 
	 */
	public Series setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>bodySite</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Body part examined. See  DICOM Part 16 Annex L for the mapping from DICOM to Snomed CT
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
     * Body part examined. See  DICOM Part 16 Annex L for the mapping from DICOM to Snomed CT
     * </p> 
	 */
	public Series setBodySite(CodingDt theValue) {
		myBodySite = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>laterality</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Laterality if body site is paired anatomic structure and laterality is not pre-coordinated in body site code.
     * </p> 
	 */
	public CodingDt getLaterality() {  
		if (myLaterality == null) {
			myLaterality = new CodingDt();
		}
		return myLaterality;
	}

	/**
	 * Sets the value(s) for <b>laterality</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Laterality if body site is paired anatomic structure and laterality is not pre-coordinated in body site code.
     * </p> 
	 */
	public Series setLaterality(CodingDt theValue) {
		myLaterality = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>started</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time the series was started.
     * </p> 
	 */
	public DateTimeDt getStartedElement() {  
		if (myStarted == null) {
			myStarted = new DateTimeDt();
		}
		return myStarted;
	}

	
	/**
	 * Gets the value(s) for <b>started</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time the series was started.
     * </p> 
	 */
	public Date getStarted() {  
		return getStartedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>started</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time the series was started.
     * </p> 
	 */
	public Series setStarted(DateTimeDt theValue) {
		myStarted = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>started</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time the series was started.
     * </p> 
	 */
	public Series setStarted( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myStarted = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>started</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time the series was started.
     * </p> 
	 */
	public Series setStartedWithSecondsPrecision( Date theDate) {
		myStarted = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>instance</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A single SOP Instance within the series, e.g. an image, or presentation state.
     * </p> 
	 */
	public java.util.List<SeriesInstance> getInstance() {  
		if (myInstance == null) {
			myInstance = new java.util.ArrayList<SeriesInstance>();
		}
		return myInstance;
	}

	/**
	 * Sets the value(s) for <b>instance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A single SOP Instance within the series, e.g. an image, or presentation state.
     * </p> 
	 */
	public Series setInstance(java.util.List<SeriesInstance> theValue) {
		myInstance = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>instance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A single SOP Instance within the series, e.g. an image, or presentation state.
     * </p> 
	 */
	public SeriesInstance addInstance() {
		SeriesInstance newType = new SeriesInstance();
		getInstance().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>instance</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A single SOP Instance within the series, e.g. an image, or presentation state.
	 * </p>
	 * @param theValue The instance to add (must not be <code>null</code>)
	 */
	public Series addInstance(SeriesInstance theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getInstance().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>instance</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A single SOP Instance within the series, e.g. an image, or presentation state.
     * </p> 
	 */
	public SeriesInstance getInstanceFirstRep() {
		if (getInstance().isEmpty()) {
			return addInstance();
		}
		return getInstance().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ImagingStudy.series.instance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A single SOP Instance within the series, e.g. an image, or presentation state.
     * </p> 
	 */
	@Block()	
	public static class SeriesInstance 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="number", type=UnsignedIntDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The number of instance in the series"
	)
	private UnsignedIntDt myNumber;
	
	@Child(name="uid", type=OidDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Formal identifier for this image or other content"
	)
	private OidDt myUid;
	
	@Child(name="sopClass", type=OidDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="DICOM instance  type"
	)
	private OidDt mySopClass;
	
	@Child(name="type", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A human-friendly SOP Class name"
	)
	private StringDt myType;
	
	@Child(name="title", type=StringDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The description of the instance"
	)
	private StringDt myTitle;
	
	@Child(name="content", type=AttachmentDt.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Content of the instance or a rendering thereof (e.g. a JPEG of an image, or an XML of a structured report). May be represented for example by inline encoding; by a URL reference to a WADO-RS service that makes the instance available; or to a FHIR Resource (e.g. Media, Document, etc.). Multiple content attachments may be used for alternate representations of the instance."
	)
	private java.util.List<AttachmentDt> myContent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myNumber,  myUid,  mySopClass,  myType,  myTitle,  myContent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myNumber, myUid, mySopClass, myType, myTitle, myContent);
	}

	/**
	 * Gets the value(s) for <b>number</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The number of instance in the series
     * </p> 
	 */
	public UnsignedIntDt getNumberElement() {  
		if (myNumber == null) {
			myNumber = new UnsignedIntDt();
		}
		return myNumber;
	}

	
	/**
	 * Gets the value(s) for <b>number</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The number of instance in the series
     * </p> 
	 */
	public Integer getNumber() {  
		return getNumberElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>number</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The number of instance in the series
     * </p> 
	 */
	public SeriesInstance setNumber(UnsignedIntDt theValue) {
		myNumber = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>number</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The number of instance in the series
     * </p> 
	 */
	public SeriesInstance setNumber( int theInteger) {
		myNumber = new UnsignedIntDt(theInteger); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>uid</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Formal identifier for this image or other content
     * </p> 
	 */
	public OidDt getUidElement() {  
		if (myUid == null) {
			myUid = new OidDt();
		}
		return myUid;
	}

	
	/**
	 * Gets the value(s) for <b>uid</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Formal identifier for this image or other content
     * </p> 
	 */
	public String getUid() {  
		return getUidElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>uid</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Formal identifier for this image or other content
     * </p> 
	 */
	public SeriesInstance setUid(OidDt theValue) {
		myUid = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>sopClass</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * DICOM instance  type
     * </p> 
	 */
	public OidDt getSopClassElement() {  
		if (mySopClass == null) {
			mySopClass = new OidDt();
		}
		return mySopClass;
	}

	
	/**
	 * Gets the value(s) for <b>sopClass</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * DICOM instance  type
     * </p> 
	 */
	public String getSopClass() {  
		return getSopClassElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>sopClass</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * DICOM instance  type
     * </p> 
	 */
	public SeriesInstance setSopClass(OidDt theValue) {
		mySopClass = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A human-friendly SOP Class name
     * </p> 
	 */
	public StringDt getTypeElement() {  
		if (myType == null) {
			myType = new StringDt();
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
     * A human-friendly SOP Class name
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
     * A human-friendly SOP Class name
     * </p> 
	 */
	public SeriesInstance setType(StringDt theValue) {
		myType = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A human-friendly SOP Class name
     * </p> 
	 */
	public SeriesInstance setType( String theString) {
		myType = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>title</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The description of the instance
     * </p> 
	 */
	public StringDt getTitleElement() {  
		if (myTitle == null) {
			myTitle = new StringDt();
		}
		return myTitle;
	}

	
	/**
	 * Gets the value(s) for <b>title</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The description of the instance
     * </p> 
	 */
	public String getTitle() {  
		return getTitleElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>title</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The description of the instance
     * </p> 
	 */
	public SeriesInstance setTitle(StringDt theValue) {
		myTitle = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>title</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The description of the instance
     * </p> 
	 */
	public SeriesInstance setTitle( String theString) {
		myTitle = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>content</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Content of the instance or a rendering thereof (e.g. a JPEG of an image, or an XML of a structured report). May be represented for example by inline encoding; by a URL reference to a WADO-RS service that makes the instance available; or to a FHIR Resource (e.g. Media, Document, etc.). Multiple content attachments may be used for alternate representations of the instance.
     * </p> 
	 */
	public java.util.List<AttachmentDt> getContent() {  
		if (myContent == null) {
			myContent = new java.util.ArrayList<AttachmentDt>();
		}
		return myContent;
	}

	/**
	 * Sets the value(s) for <b>content</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Content of the instance or a rendering thereof (e.g. a JPEG of an image, or an XML of a structured report). May be represented for example by inline encoding; by a URL reference to a WADO-RS service that makes the instance available; or to a FHIR Resource (e.g. Media, Document, etc.). Multiple content attachments may be used for alternate representations of the instance.
     * </p> 
	 */
	public SeriesInstance setContent(java.util.List<AttachmentDt> theValue) {
		myContent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>content</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Content of the instance or a rendering thereof (e.g. a JPEG of an image, or an XML of a structured report). May be represented for example by inline encoding; by a URL reference to a WADO-RS service that makes the instance available; or to a FHIR Resource (e.g. Media, Document, etc.). Multiple content attachments may be used for alternate representations of the instance.
     * </p> 
	 */
	public AttachmentDt addContent() {
		AttachmentDt newType = new AttachmentDt();
		getContent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>content</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Content of the instance or a rendering thereof (e.g. a JPEG of an image, or an XML of a structured report). May be represented for example by inline encoding; by a URL reference to a WADO-RS service that makes the instance available; or to a FHIR Resource (e.g. Media, Document, etc.). Multiple content attachments may be used for alternate representations of the instance.
	 * </p>
	 * @param theValue The content to add (must not be <code>null</code>)
	 */
	public SeriesInstance addContent(AttachmentDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getContent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>content</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Content of the instance or a rendering thereof (e.g. a JPEG of an image, or an XML of a structured report). May be represented for example by inline encoding; by a URL reference to a WADO-RS service that makes the instance available; or to a FHIR Resource (e.g. Media, Document, etc.). Multiple content attachments may be used for alternate representations of the instance.
     * </p> 
	 */
	public AttachmentDt getContentFirstRep() {
		if (getContent().isEmpty()) {
			return addContent();
		}
		return getContent().get(0); 
	}
  


	}





    @Override
    public String getResourceName() {
        return "ImagingStudy";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
