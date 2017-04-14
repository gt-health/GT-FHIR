















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
 * HAPI/FHIR <b>ImagingObjectSelection</b> Resource
 * (clinical.diagnostics)
 *
 * <p>
 * <b>Definition:</b>
 * A manifest of a set of DICOM Service-Object Pair Instances (SOP Instances).  The referenced SOP Instances (images or other content) are for a single patient, and may be from one or more studies. The referenced SOP Instances have been selected for a purpose, such as quality assurance, conference, or consult. Reflecting that range of purposes, typical ImagingObjectSelection resources may include all SOP Instances in a study (perhaps for sharing through a Health Information Exchange); key images from multiple studies (for reference by a referring or treating physician); a multi-frame ultrasound instance (\"cine\" video clip) and a set of measurements taken from that instance (for inclusion in a teaching file); and so on.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * A FHIR representation of DICOM Key Object Selection (KOS) SOP Instances enables access to a set of selected DICOM SOP Instances.
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/ImagingObjectSelection">http://hl7.org/fhir/profiles/ImagingObjectSelection</a> 
 * </p>
 *
 */
@ResourceDef(name="ImagingObjectSelection", profile="http://hl7.org/fhir/profiles/ImagingObjectSelection", id="imagingobjectselection")
public class ImagingObjectSelection extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>UID of key DICOM object selection</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingObjectSelection.uid</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="ImagingObjectSelection.uid", description="UID of key DICOM object selection", type="uri"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>UID of key DICOM object selection</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingObjectSelection.uid</b><br>
	 * </p>
	 */
	public static final UriClientParam IDENTIFIER = new UriClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>title</b>
	 * <p>
	 * Description: <b>Title of key DICOM object selection</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImagingObjectSelection.title</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="title", path="ImagingObjectSelection.title", description="Title of key DICOM object selection", type="token"  )
	public static final String SP_TITLE = "title";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>title</b>
	 * <p>
	 * Description: <b>Title of key DICOM object selection</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>ImagingObjectSelection.title</b><br>
	 * </p>
	 */
	public static final TokenClientParam TITLE = new TokenClientParam(SP_TITLE);

	/**
	 * Search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b>Author of key DICOM object selection</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImagingObjectSelection.author</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="author", path="ImagingObjectSelection.author", description="Author of key DICOM object selection", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_AUTHOR = "author";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b>Author of key DICOM object selection</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImagingObjectSelection.author</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam AUTHOR = new ReferenceClientParam(SP_AUTHOR);

	/**
	 * Search parameter constant for <b>authoring-time</b>
	 * <p>
	 * Description: <b>Time of key DICOM object selection authoring</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ImagingObjectSelection.authoringTime</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="authoring-time", path="ImagingObjectSelection.authoringTime", description="Time of key DICOM object selection authoring", type="date"  )
	public static final String SP_AUTHORING_TIME = "authoring-time";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>authoring-time</b>
	 * <p>
	 * Description: <b>Time of key DICOM object selection authoring</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>ImagingObjectSelection.authoringTime</b><br>
	 * </p>
	 */
	public static final DateClientParam AUTHORING_TIME = new DateClientParam(SP_AUTHORING_TIME);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Subject of key DICOM object selection</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImagingObjectSelection.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="ImagingObjectSelection.patient", description="Subject of key DICOM object selection", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Subject of key DICOM object selection</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>ImagingObjectSelection.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>selected-study</b>
	 * <p>
	 * Description: <b>Study selected in key DICOM object selection</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingObjectSelection.study.uid</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="selected-study", path="ImagingObjectSelection.study.uid", description="Study selected in key DICOM object selection", type="uri"  )
	public static final String SP_SELECTED_STUDY = "selected-study";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>selected-study</b>
	 * <p>
	 * Description: <b>Study selected in key DICOM object selection</b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>ImagingObjectSelection.study.uid</b><br>
	 * </p>
	 */
	public static final UriClientParam SELECTED_STUDY = new UriClientParam(SP_SELECTED_STUDY);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ImagingObjectSelection:author</b>".
	 */
	public static final Include INCLUDE_AUTHOR = new Include("ImagingObjectSelection:author");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>ImagingObjectSelection:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("ImagingObjectSelection:patient");


	@Child(name="uid", type=OidDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Instance UID of the DICOM KOS SOP Instances represented in this resource."
	)
	private OidDt myUid;
	
	@Child(name="patient", order=1, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingObjectSelection."
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="title", type=CodeableConceptDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The reason for, or significance of, the selection of objects referenced in the resource"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/kos-title")
	private BoundCodeableConceptDt<KOStitleEnum> myTitle;
	
	@Child(name="description", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Text description of the DICOM SOP instances selected in the ImagingObjectSelection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection."
	)
	private StringDt myDescription;
	
	@Child(name="author", order=4, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="who.author",
		formalDefinition="Author of ImagingObjectSelection. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion."
	)
	private ResourceReferenceDt myAuthor;
	
	@Child(name="authoringTime", type=DateTimeDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image)."
	)
	private DateTimeDt myAuthoringTime;
	
	@Child(name="study", order=6, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Study identity and locating information of the DICOM SOP instances in the selection."
	)
	private java.util.List<Study> myStudy;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myUid,  myPatient,  myTitle,  myDescription,  myAuthor,  myAuthoringTime,  myStudy);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myUid, myPatient, myTitle, myDescription, myAuthor, myAuthoringTime, myStudy);
	}

	/**
	 * Gets the value(s) for <b>uid</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Instance UID of the DICOM KOS SOP Instances represented in this resource.
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
     * Instance UID of the DICOM KOS SOP Instances represented in this resource.
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
     * Instance UID of the DICOM KOS SOP Instances represented in this resource.
     * </p> 
	 */
	public ImagingObjectSelection setUid(OidDt theValue) {
		myUid = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>patient</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingObjectSelection.
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
     * A patient resource reference which is the patient subject of all DICOM SOP Instances in this ImagingObjectSelection.
     * </p> 
	 */
	public ImagingObjectSelection setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>title</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The reason for, or significance of, the selection of objects referenced in the resource
     * </p> 
	 */
	public BoundCodeableConceptDt<KOStitleEnum> getTitle() {  
		if (myTitle == null) {
			myTitle = new BoundCodeableConceptDt<KOStitleEnum>(KOStitleEnum.VALUESET_BINDER);
		}
		return myTitle;
	}

	/**
	 * Sets the value(s) for <b>title</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The reason for, or significance of, the selection of objects referenced in the resource
     * </p> 
	 */
	public ImagingObjectSelection setTitle(BoundCodeableConceptDt<KOStitleEnum> theValue) {
		myTitle = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>title</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The reason for, or significance of, the selection of objects referenced in the resource
     * </p> 
	 */
	public ImagingObjectSelection setTitle(KOStitleEnum theValue) {
		setTitle(new BoundCodeableConceptDt<KOStitleEnum>(KOStitleEnum.VALUESET_BINDER, theValue));
		
/*
		getTitle().setValueAsEnum(theValue);
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
     * Text description of the DICOM SOP instances selected in the ImagingObjectSelection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection.
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
     * Text description of the DICOM SOP instances selected in the ImagingObjectSelection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection.
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
     * Text description of the DICOM SOP instances selected in the ImagingObjectSelection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection.
     * </p> 
	 */
	public ImagingObjectSelection setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Text description of the DICOM SOP instances selected in the ImagingObjectSelection. This should be aligned with the content of the title element, and can provide further explanation of the SOP instances in the selection.
     * </p> 
	 */
	public ImagingObjectSelection setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>author</b> (who.author).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Author of ImagingObjectSelection. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.
     * </p> 
	 */
	public ResourceReferenceDt getAuthor() {  
		if (myAuthor == null) {
			myAuthor = new ResourceReferenceDt();
		}
		return myAuthor;
	}

	/**
	 * Sets the value(s) for <b>author</b> (who.author)
	 *
     * <p>
     * <b>Definition:</b>
     * Author of ImagingObjectSelection. It can be a human author or a device which made the decision of the SOP instances selected. For example, a radiologist selected a set of imaging SOP instances to attach in a diagnostic report, and a CAD application may author a selection to describe SOP instances it used to generate a detection conclusion.
     * </p> 
	 */
	public ImagingObjectSelection setAuthor(ResourceReferenceDt theValue) {
		myAuthor = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>authoringTime</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).
     * </p> 
	 */
	public DateTimeDt getAuthoringTimeElement() {  
		if (myAuthoringTime == null) {
			myAuthoringTime = new DateTimeDt();
		}
		return myAuthoringTime;
	}

	
	/**
	 * Gets the value(s) for <b>authoringTime</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).
     * </p> 
	 */
	public Date getAuthoringTime() {  
		return getAuthoringTimeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>authoringTime</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).
     * </p> 
	 */
	public ImagingObjectSelection setAuthoringTime(DateTimeDt theValue) {
		myAuthoringTime = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>authoringTime</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).
     * </p> 
	 */
	public ImagingObjectSelection setAuthoringTime( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myAuthoringTime = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>authoringTime</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * Date and time when the selection of the referenced instances were made. It is (typically) different from the creation date of the selection resource, and from dates associated with the referenced instances (e.g. capture time of the referenced image).
     * </p> 
	 */
	public ImagingObjectSelection setAuthoringTimeWithSecondsPrecision( Date theDate) {
		myAuthoringTime = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>study</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Study identity and locating information of the DICOM SOP instances in the selection.
     * </p> 
	 */
	public java.util.List<Study> getStudy() {  
		if (myStudy == null) {
			myStudy = new java.util.ArrayList<Study>();
		}
		return myStudy;
	}

	/**
	 * Sets the value(s) for <b>study</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Study identity and locating information of the DICOM SOP instances in the selection.
     * </p> 
	 */
	public ImagingObjectSelection setStudy(java.util.List<Study> theValue) {
		myStudy = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>study</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Study identity and locating information of the DICOM SOP instances in the selection.
     * </p> 
	 */
	public Study addStudy() {
		Study newType = new Study();
		getStudy().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>study</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Study identity and locating information of the DICOM SOP instances in the selection.
	 * </p>
	 * @param theValue The study to add (must not be <code>null</code>)
	 */
	public ImagingObjectSelection addStudy(Study theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getStudy().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>study</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Study identity and locating information of the DICOM SOP instances in the selection.
     * </p> 
	 */
	public Study getStudyFirstRep() {
		if (getStudy().isEmpty()) {
			return addStudy();
		}
		return getStudy().get(0); 
	}
  
	/**
	 * Block class for child element: <b>ImagingObjectSelection.study</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Study identity and locating information of the DICOM SOP instances in the selection.
     * </p> 
	 */
	@Block()	
	public static class Study 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="uid", type=OidDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Study instance UID of the SOP instances in the selection"
	)
	private OidDt myUid;
	
	@Child(name="url", type=UriDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection."
	)
	private UriDt myUrl;
	
	@Child(name="imagingStudy", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.ImagingStudy.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Reference to the Imaging Study in FHIR form."
	)
	private ResourceReferenceDt myImagingStudy;
	
	@Child(name="series", order=3, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Series identity and locating information of the DICOM SOP instances in the selection"
	)
	private java.util.List<StudySeries> mySeries;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myUid,  myUrl,  myImagingStudy,  mySeries);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myUid, myUrl, myImagingStudy, mySeries);
	}

	/**
	 * Gets the value(s) for <b>uid</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Study instance UID of the SOP instances in the selection
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
     * Study instance UID of the SOP instances in the selection
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
     * Study instance UID of the SOP instances in the selection
     * </p> 
	 */
	public Study setUid(OidDt theValue) {
		myUid = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection.
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
     * WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection.
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
     * WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection.
     * </p> 
	 */
	public Study setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * WADO-RS URL to retrieve the study. Note that this URL retrieves all SOP instances of the study, not only those in the selection.
     * </p> 
	 */
	public Study setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>imagingStudy</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the Imaging Study in FHIR form.
     * </p> 
	 */
	public ResourceReferenceDt getImagingStudy() {  
		if (myImagingStudy == null) {
			myImagingStudy = new ResourceReferenceDt();
		}
		return myImagingStudy;
	}

	/**
	 * Sets the value(s) for <b>imagingStudy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Reference to the Imaging Study in FHIR form.
     * </p> 
	 */
	public Study setImagingStudy(ResourceReferenceDt theValue) {
		myImagingStudy = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>series</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Series identity and locating information of the DICOM SOP instances in the selection
     * </p> 
	 */
	public java.util.List<StudySeries> getSeries() {  
		if (mySeries == null) {
			mySeries = new java.util.ArrayList<StudySeries>();
		}
		return mySeries;
	}

	/**
	 * Sets the value(s) for <b>series</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Series identity and locating information of the DICOM SOP instances in the selection
     * </p> 
	 */
	public Study setSeries(java.util.List<StudySeries> theValue) {
		mySeries = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>series</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Series identity and locating information of the DICOM SOP instances in the selection
     * </p> 
	 */
	public StudySeries addSeries() {
		StudySeries newType = new StudySeries();
		getSeries().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>series</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Series identity and locating information of the DICOM SOP instances in the selection
	 * </p>
	 * @param theValue The series to add (must not be <code>null</code>)
	 */
	public Study addSeries(StudySeries theValue) {
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
     * Series identity and locating information of the DICOM SOP instances in the selection
     * </p> 
	 */
	public StudySeries getSeriesFirstRep() {
		if (getSeries().isEmpty()) {
			return addSeries();
		}
		return getSeries().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ImagingObjectSelection.study.series</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Series identity and locating information of the DICOM SOP instances in the selection
     * </p> 
	 */
	@Block()	
	public static class StudySeries 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="uid", type=OidDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Series instance UID of the SOP instances in the selection"
	)
	private OidDt myUid;
	
	@Child(name="url", type=UriDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="WADO-RS URL to retrieve the series. Note that this URL retrieves all SOP instances of the series not only those in the selection."
	)
	private UriDt myUrl;
	
	@Child(name="instance", order=2, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identity and locating information of the selected DICOM SOP instances"
	)
	private java.util.List<StudySeriesInstance> myInstance;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myUid,  myUrl,  myInstance);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myUid, myUrl, myInstance);
	}

	/**
	 * Gets the value(s) for <b>uid</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Series instance UID of the SOP instances in the selection
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
     * Series instance UID of the SOP instances in the selection
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
     * Series instance UID of the SOP instances in the selection
     * </p> 
	 */
	public StudySeries setUid(OidDt theValue) {
		myUid = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * WADO-RS URL to retrieve the series. Note that this URL retrieves all SOP instances of the series not only those in the selection.
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
     * WADO-RS URL to retrieve the series. Note that this URL retrieves all SOP instances of the series not only those in the selection.
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
     * WADO-RS URL to retrieve the series. Note that this URL retrieves all SOP instances of the series not only those in the selection.
     * </p> 
	 */
	public StudySeries setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * WADO-RS URL to retrieve the series. Note that this URL retrieves all SOP instances of the series not only those in the selection.
     * </p> 
	 */
	public StudySeries setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>instance</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identity and locating information of the selected DICOM SOP instances
     * </p> 
	 */
	public java.util.List<StudySeriesInstance> getInstance() {  
		if (myInstance == null) {
			myInstance = new java.util.ArrayList<StudySeriesInstance>();
		}
		return myInstance;
	}

	/**
	 * Sets the value(s) for <b>instance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identity and locating information of the selected DICOM SOP instances
     * </p> 
	 */
	public StudySeries setInstance(java.util.List<StudySeriesInstance> theValue) {
		myInstance = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>instance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identity and locating information of the selected DICOM SOP instances
     * </p> 
	 */
	public StudySeriesInstance addInstance() {
		StudySeriesInstance newType = new StudySeriesInstance();
		getInstance().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>instance</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identity and locating information of the selected DICOM SOP instances
	 * </p>
	 * @param theValue The instance to add (must not be <code>null</code>)
	 */
	public StudySeries addInstance(StudySeriesInstance theValue) {
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
     * Identity and locating information of the selected DICOM SOP instances
     * </p> 
	 */
	public StudySeriesInstance getInstanceFirstRep() {
		if (getInstance().isEmpty()) {
			return addInstance();
		}
		return getInstance().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ImagingObjectSelection.study.series.instance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identity and locating information of the selected DICOM SOP instances
     * </p> 
	 */
	@Block()	
	public static class StudySeriesInstance 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="sopClass", type=OidDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="SOP class UID of the selected instance"
	)
	private OidDt mySopClass;
	
	@Child(name="uid", type=OidDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="SOP Instance UID of the selected instance"
	)
	private OidDt myUid;
	
	@Child(name="url", type=UriDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="WADO-RS URL to retrieve the DICOM SOP Instance."
	)
	private UriDt myUrl;
	
	@Child(name="frames", order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identity and location information of the frames in the selected instance"
	)
	private java.util.List<StudySeriesInstanceFrames> myFrames;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySopClass,  myUid,  myUrl,  myFrames);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySopClass, myUid, myUrl, myFrames);
	}

	/**
	 * Gets the value(s) for <b>sopClass</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * SOP class UID of the selected instance
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
     * SOP class UID of the selected instance
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
     * SOP class UID of the selected instance
     * </p> 
	 */
	public StudySeriesInstance setSopClass(OidDt theValue) {
		mySopClass = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>uid</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * SOP Instance UID of the selected instance
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
     * SOP Instance UID of the selected instance
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
     * SOP Instance UID of the selected instance
     * </p> 
	 */
	public StudySeriesInstance setUid(OidDt theValue) {
		myUid = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * WADO-RS URL to retrieve the DICOM SOP Instance.
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
     * WADO-RS URL to retrieve the DICOM SOP Instance.
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
     * WADO-RS URL to retrieve the DICOM SOP Instance.
     * </p> 
	 */
	public StudySeriesInstance setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * WADO-RS URL to retrieve the DICOM SOP Instance.
     * </p> 
	 */
	public StudySeriesInstance setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>frames</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identity and location information of the frames in the selected instance
     * </p> 
	 */
	public java.util.List<StudySeriesInstanceFrames> getFrames() {  
		if (myFrames == null) {
			myFrames = new java.util.ArrayList<StudySeriesInstanceFrames>();
		}
		return myFrames;
	}

	/**
	 * Sets the value(s) for <b>frames</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identity and location information of the frames in the selected instance
     * </p> 
	 */
	public StudySeriesInstance setFrames(java.util.List<StudySeriesInstanceFrames> theValue) {
		myFrames = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>frames</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identity and location information of the frames in the selected instance
     * </p> 
	 */
	public StudySeriesInstanceFrames addFrames() {
		StudySeriesInstanceFrames newType = new StudySeriesInstanceFrames();
		getFrames().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>frames</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Identity and location information of the frames in the selected instance
	 * </p>
	 * @param theValue The frames to add (must not be <code>null</code>)
	 */
	public StudySeriesInstance addFrames(StudySeriesInstanceFrames theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFrames().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>frames</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Identity and location information of the frames in the selected instance
     * </p> 
	 */
	public StudySeriesInstanceFrames getFramesFirstRep() {
		if (getFrames().isEmpty()) {
			return addFrames();
		}
		return getFrames().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>ImagingObjectSelection.study.series.instance.frames</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identity and location information of the frames in the selected instance
     * </p> 
	 */
	@Block()	
	public static class StudySeriesInstanceFrames 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="frameNumbers", type=UnsignedIntDt.class, order=0, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The frame numbers in the frame set"
	)
	private java.util.List<UnsignedIntDt> myFrameNumbers;
	
	@Child(name="url", type=UriDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="WADO-RS URL to retrieve the DICOM frames."
	)
	private UriDt myUrl;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myFrameNumbers,  myUrl);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myFrameNumbers, myUrl);
	}

	/**
	 * Gets the value(s) for <b>frameNumbers</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The frame numbers in the frame set
     * </p> 
	 */
	public java.util.List<UnsignedIntDt> getFrameNumbers() {  
		if (myFrameNumbers == null) {
			myFrameNumbers = new java.util.ArrayList<UnsignedIntDt>();
		}
		return myFrameNumbers;
	}

	/**
	 * Sets the value(s) for <b>frameNumbers</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The frame numbers in the frame set
     * </p> 
	 */
	public StudySeriesInstanceFrames setFrameNumbers(java.util.List<UnsignedIntDt> theValue) {
		myFrameNumbers = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>frameNumbers</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The frame numbers in the frame set
     * </p> 
	 */
	public UnsignedIntDt addFrameNumbers() {
		UnsignedIntDt newType = new UnsignedIntDt();
		getFrameNumbers().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>frameNumbers</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The frame numbers in the frame set
	 * </p>
	 * @param theValue The frameNumbers to add (must not be <code>null</code>)
	 */
	public StudySeriesInstanceFrames addFrameNumbers(UnsignedIntDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFrameNumbers().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>frameNumbers</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The frame numbers in the frame set
     * </p> 
	 */
	public UnsignedIntDt getFrameNumbersFirstRep() {
		if (getFrameNumbers().isEmpty()) {
			return addFrameNumbers();
		}
		return getFrameNumbers().get(0); 
	}
 	/**
	 * Adds a new value for <b>frameNumbers</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The frame numbers in the frame set
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public StudySeriesInstanceFrames addFrameNumbers( int theInteger) {
		if (myFrameNumbers == null) {
			myFrameNumbers = new java.util.ArrayList<UnsignedIntDt>();
		}
		myFrameNumbers.add(new UnsignedIntDt(theInteger));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>url</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * WADO-RS URL to retrieve the DICOM frames.
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
     * WADO-RS URL to retrieve the DICOM frames.
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
     * WADO-RS URL to retrieve the DICOM frames.
     * </p> 
	 */
	public StudySeriesInstanceFrames setUrl(UriDt theValue) {
		myUrl = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>url</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * WADO-RS URL to retrieve the DICOM frames.
     * </p> 
	 */
	public StudySeriesInstanceFrames setUrl( String theUri) {
		myUrl = new UriDt(theUri); 
		return this; 
	}

 


	}







    @Override
    public String getResourceName() {
        return "ImagingObjectSelection";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
