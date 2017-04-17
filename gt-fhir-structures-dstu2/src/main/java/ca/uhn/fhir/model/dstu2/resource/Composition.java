















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
 * HAPI/FHIR <b>Composition</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * A set of healthcare-related information that is assembled together into a single logical document that provides a single coherent statement of meaning, establishes its own context and that has clinical attestation with regard to who is making the statement. While a Composition defines the structure, it does not actually contain the content: rather the full content of a document is contained in a Bundle, of which the Composition is the first resource contained
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * To support documents, and also to capture the EN13606 notion of an attested commit to the patient EHR, and to allow a set of disparate resources at the information/engineering level to be gathered into a clinical statement
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Composition">http://hl7.org/fhir/profiles/Composition</a> 
 * </p>
 *
 */
@ResourceDef(name="Composition", profile="http://hl7.org/fhir/profiles/Composition", id="composition")
public class Composition extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="Composition.type", description="", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>class</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.class</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="class", path="Composition.class", description="", type="token"  )
	public static final String SP_CLASS = "class";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>class</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.class</b><br>
	 * </p>
	 */
	public static final TokenClientParam CLASS = new TokenClientParam(SP_CLASS);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Composition.date</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="Composition.date", description="", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Composition.date</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="Composition.subject", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.author</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="author", path="Composition.author", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") ,  @Compartment(name="Device") 	}
 )
	public static final String SP_AUTHOR = "author";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>author</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.author</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam AUTHOR = new ReferenceClientParam(SP_AUTHOR);

	/**
	 * Search parameter constant for <b>attester</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.attester.party</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="attester", path="Composition.attester.party", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_ATTESTER = "attester";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>attester</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.attester.party</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ATTESTER = new ReferenceClientParam(SP_ATTESTER);

	/**
	 * Search parameter constant for <b>context</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.event.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="context", path="Composition.event.code", description="", type="token"  )
	public static final String SP_CONTEXT = "context";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>context</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.event.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CONTEXT = new TokenClientParam(SP_CONTEXT);

	/**
	 * Search parameter constant for <b>section</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.section.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="section", path="Composition.section.code", description="", type="token"  )
	public static final String SP_SECTION = "section";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>section</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.section.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam SECTION = new TokenClientParam(SP_SECTION);

	/**
	 * Search parameter constant for <b>entry</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.section.entry</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="entry", path="Composition.section.entry", description="", type="reference"  )
	public static final String SP_ENTRY = "entry";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>entry</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.section.entry</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENTRY = new ReferenceClientParam(SP_ENTRY);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Composition.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>title</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Composition.title</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="title", path="Composition.title", description="", type="string"  )
	public static final String SP_TITLE = "title";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>title</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Composition.title</b><br>
	 * </p>
	 */
	public static final StringClientParam TITLE = new StringClientParam(SP_TITLE);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="Composition.status", description="", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>confidentiality</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.confidentiality</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="confidentiality", path="Composition.confidentiality", description="", type="token"  )
	public static final String SP_CONFIDENTIALITY = "confidentiality";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>confidentiality</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Composition.confidentiality</b><br>
	 * </p>
	 */
	public static final TokenClientParam CONFIDENTIALITY = new TokenClientParam(SP_CONFIDENTIALITY);

	/**
	 * Search parameter constant for <b>period</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Composition.event.period</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="period", path="Composition.event.period", description="", type="date"  )
	public static final String SP_PERIOD = "period";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>period</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Composition.event.period</b><br>
	 * </p>
	 */
	public static final DateClientParam PERIOD = new DateClientParam(SP_PERIOD);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Composition.subject", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="Composition.encounter", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Composition.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Composition:attester</b>".
	 */
	public static final Include INCLUDE_ATTESTER = new Include("Composition:attester");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Composition:author</b>".
	 */
	public static final Include INCLUDE_AUTHOR = new Include("Composition:author");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Composition:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("Composition:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Composition:entry</b>".
	 */
	public static final Include INCLUDE_ENTRY = new Include("Composition:entry");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Composition:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Composition:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Composition:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("Composition:subject");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time"
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="date", type=DateTimeDt.class, order=1, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The composition editing time, when the composition was last logically changed by the author"
	)
	private DateTimeDt myDate;
	
	@Child(name="type", type=CodeableConceptDt.class, order=2, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-doc-typecodes")
	private CodeableConceptDt myType;
	
	@Child(name="class", type=CodeableConceptDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type"
	)
	private CodeableConceptDt myClassElement;
	
	@Child(name="title", type=StringDt.class, order=4, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Official human-readable label for the composition"
	)
	private StringDt myTitle;
	
	@Child(name="status", type=CodeDt.class, order=5, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/composition-status")
	private BoundCodeDt<CompositionStatusEnum> myStatus;
	
	@Child(name="confidentiality", type=CodeDt.class, order=6, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="The code specifying the level of confidentiality of the Composition"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/v3-Confidentiality")
	private CodeDt myConfidentiality;
	
	@Child(name="subject", order=7, min=1, max=1, summary=true, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure)"
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="author", order=8, min=1, max=Child.MAX_UNLIMITED, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies who is responsible for the information in the composition, not necessarily who typed it in."
	)
	private java.util.List<ResourceReferenceDt> myAuthor;
	
	@Child(name="attester", order=9, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A participant who has attested to the accuracy of the composition/document"
	)
	private java.util.List<Attester> myAttester;
	
	@Child(name="custodian", order=10, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information"
	)
	private ResourceReferenceDt myCustodian;
	
	@Child(name="event", order=11, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The clinical service, such as a colonoscopy or an appendectomy, being documented"
	)
	private java.util.List<Event> myEvent;
	
	@Child(name="encounter", order=12, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Describes the clinical encounter or type of care this documentation is associated with."
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="section", order=13, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The root of the sections that make up the composition"
	)
	private java.util.List<Section> mySection;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myDate,  myType,  myClassElement,  myTitle,  myStatus,  myConfidentiality,  mySubject,  myAuthor,  myAttester,  myCustodian,  myEvent,  myEncounter,  mySection);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myDate, myType, myClassElement, myTitle, myStatus, myConfidentiality, mySubject, myAuthor, myAttester, myCustodian, myEvent, myEncounter, mySection);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time
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
     * Logical identifier for the composition, assigned when created. This identifier stays constant as the composition is changed over time
     * </p> 
	 */
	public Composition setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>date</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The composition editing time, when the composition was last logically changed by the author
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
     * The composition editing time, when the composition was last logically changed by the author
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
     * The composition editing time, when the composition was last logically changed by the author
     * </p> 
	 */
	public Composition setDate(DateTimeDt theValue) {
		myDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The composition editing time, when the composition was last logically changed by the author
     * </p> 
	 */
	public Composition setDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDate = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>date</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The composition editing time, when the composition was last logically changed by the author
     * </p> 
	 */
	public Composition setDateWithSecondsPrecision( Date theDate) {
		myDate = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition
     * </p> 
	 */
	public CodeableConceptDt getType() {  
		if (myType == null) {
			myType = new CodeableConceptDt();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies the particular kind of composition (e.g. History and Physical, Discharge Summary, Progress Note). This usually equates to the purpose of making the composition
     * </p> 
	 */
	public Composition setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>class</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type
     * </p> 
	 */
	public CodeableConceptDt getClassElement() {  
		if (myClassElement == null) {
			myClassElement = new CodeableConceptDt();
		}
		return myClassElement;
	}

	/**
	 * Sets the value(s) for <b>class</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A categorization for the type of the composition - helps for indexing and searching. This may be implied by or derived from the code specified in the Composition Type
     * </p> 
	 */
	public Composition setClassElement(CodeableConceptDt theValue) {
		myClassElement = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>title</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Official human-readable label for the composition
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
     * Official human-readable label for the composition
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
     * Official human-readable label for the composition
     * </p> 
	 */
	public Composition setTitle(StringDt theValue) {
		myTitle = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>title</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Official human-readable label for the composition
     * </p> 
	 */
	public Composition setTitle( String theString) {
		myTitle = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document
     * </p> 
	 */
	public BoundCodeDt<CompositionStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<CompositionStatusEnum>(CompositionStatusEnum.VALUESET_BINDER);
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
     * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document
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
     * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document
     * </p> 
	 */
	public Composition setStatus(BoundCodeDt<CompositionStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The workflow/clinical status of this composition. The status is a marker for the clinical standing of the document
     * </p> 
	 */
	public Composition setStatus(CompositionStatusEnum theValue) {
		setStatus(new BoundCodeDt<CompositionStatusEnum>(CompositionStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>confidentiality</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The code specifying the level of confidentiality of the Composition
     * </p> 
	 */
	public CodeDt getConfidentialityElement() {  
		if (myConfidentiality == null) {
			myConfidentiality = new CodeDt();
		}
		return myConfidentiality;
	}

	
	/**
	 * Gets the value(s) for <b>confidentiality</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The code specifying the level of confidentiality of the Composition
     * </p> 
	 */
	public String getConfidentiality() {  
		return getConfidentialityElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>confidentiality</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The code specifying the level of confidentiality of the Composition
     * </p> 
	 */
	public Composition setConfidentiality(CodeDt theValue) {
		myConfidentiality = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>confidentiality</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The code specifying the level of confidentiality of the Composition
     * </p> 
	 */
	public Composition setConfidentiality( String theCode) {
		myConfidentiality = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>subject</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure)
     * </p> 
	 */
	public ResourceReferenceDt getSubject() {  
		if (mySubject == null) {
			mySubject = new ResourceReferenceDt();
		}
		return mySubject;
	}

	/**
	 * Sets the value(s) for <b>subject</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Who or what the composition is about. The composition can be about a person, (patient or healthcare practitioner), a device (e.g. a machine) or even a group of subjects (such as a document about a herd of livestock, or a set of patients that share a common exposure)
     * </p> 
	 */
	public Composition setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>author</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies who is responsible for the information in the composition, not necessarily who typed it in.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAuthor() {  
		if (myAuthor == null) {
			myAuthor = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAuthor;
	}

	/**
	 * Sets the value(s) for <b>author</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies who is responsible for the information in the composition, not necessarily who typed it in.
     * </p> 
	 */
	public Composition setAuthor(java.util.List<ResourceReferenceDt> theValue) {
		myAuthor = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>author</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies who is responsible for the information in the composition, not necessarily who typed it in.
     * </p> 
	 */
	public ResourceReferenceDt addAuthor() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAuthor().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>attester</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A participant who has attested to the accuracy of the composition/document
     * </p> 
	 */
	public java.util.List<Attester> getAttester() {  
		if (myAttester == null) {
			myAttester = new java.util.ArrayList<Attester>();
		}
		return myAttester;
	}

	/**
	 * Sets the value(s) for <b>attester</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A participant who has attested to the accuracy of the composition/document
     * </p> 
	 */
	public Composition setAttester(java.util.List<Attester> theValue) {
		myAttester = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>attester</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A participant who has attested to the accuracy of the composition/document
     * </p> 
	 */
	public Attester addAttester() {
		Attester newType = new Attester();
		getAttester().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>attester</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A participant who has attested to the accuracy of the composition/document
	 * </p>
	 * @param theValue The attester to add (must not be <code>null</code>)
	 */
	public Composition addAttester(Attester theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAttester().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>attester</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A participant who has attested to the accuracy of the composition/document
     * </p> 
	 */
	public Attester getAttesterFirstRep() {
		if (getAttester().isEmpty()) {
			return addAttester();
		}
		return getAttester().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>custodian</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information
     * </p> 
	 */
	public ResourceReferenceDt getCustodian() {  
		if (myCustodian == null) {
			myCustodian = new ResourceReferenceDt();
		}
		return myCustodian;
	}

	/**
	 * Sets the value(s) for <b>custodian</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identifies the organization or group who is responsible for ongoing maintenance of and access to the composition/document information
     * </p> 
	 */
	public Composition setCustodian(ResourceReferenceDt theValue) {
		myCustodian = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>event</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical service, such as a colonoscopy or an appendectomy, being documented
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
     * The clinical service, such as a colonoscopy or an appendectomy, being documented
     * </p> 
	 */
	public Composition setEvent(java.util.List<Event> theValue) {
		myEvent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical service, such as a colonoscopy or an appendectomy, being documented
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
	 * The clinical service, such as a colonoscopy or an appendectomy, being documented
	 * </p>
	 * @param theValue The event to add (must not be <code>null</code>)
	 */
	public Composition addEvent(Event theValue) {
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
     * The clinical service, such as a colonoscopy or an appendectomy, being documented
     * </p> 
	 */
	public Event getEventFirstRep() {
		if (getEvent().isEmpty()) {
			return addEvent();
		}
		return getEvent().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>encounter</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the clinical encounter or type of care this documentation is associated with.
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
     * Describes the clinical encounter or type of care this documentation is associated with.
     * </p> 
	 */
	public Composition setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>section</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The root of the sections that make up the composition
     * </p> 
	 */
	public java.util.List<Section> getSection() {  
		if (mySection == null) {
			mySection = new java.util.ArrayList<Section>();
		}
		return mySection;
	}

	/**
	 * Sets the value(s) for <b>section</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The root of the sections that make up the composition
     * </p> 
	 */
	public Composition setSection(java.util.List<Section> theValue) {
		mySection = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>section</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The root of the sections that make up the composition
     * </p> 
	 */
	public Section addSection() {
		Section newType = new Section();
		getSection().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>section</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The root of the sections that make up the composition
	 * </p>
	 * @param theValue The section to add (must not be <code>null</code>)
	 */
	public Composition addSection(Section theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSection().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>section</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The root of the sections that make up the composition
     * </p> 
	 */
	public Section getSectionFirstRep() {
		if (getSection().isEmpty()) {
			return addSection();
		}
		return getSection().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Composition.attester</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A participant who has attested to the accuracy of the composition/document
     * </p> 
	 */
	@Block()	
	public static class Attester 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="mode", type=CodeDt.class, order=0, min=1, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of attestation the authenticator offers"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/composition-attestation-mode")
	private java.util.List<BoundCodeDt<CompositionAttestationModeEnum>> myMode;
	
	@Child(name="time", type=DateTimeDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="When composition was attested by the party"
	)
	private DateTimeDt myTime;
	
	@Child(name="party", order=2, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Who attested the composition in the specified way"
	)
	private ResourceReferenceDt myParty;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myMode,  myTime,  myParty);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myMode, myTime, myParty);
	}

	/**
	 * Gets the value(s) for <b>mode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of attestation the authenticator offers
     * </p> 
	 */
	public java.util.List<BoundCodeDt<CompositionAttestationModeEnum>> getMode() {  
		if (myMode == null) {
			myMode = new java.util.ArrayList<BoundCodeDt<CompositionAttestationModeEnum>>();
		}
		return myMode;
	}

	/**
	 * Sets the value(s) for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of attestation the authenticator offers
     * </p> 
	 */
	public Attester setMode(java.util.List<BoundCodeDt<CompositionAttestationModeEnum>> theValue) {
		myMode = theValue;
		return this;
	}
	
	

	/**
	 * Add a value for <b>mode</b> () using an enumerated type. This
	 * is intended as a convenience method for situations where the FHIR defined ValueSets are mandatory
	 * or contain the desirable codes. If you wish to use codes other than those which are built-in, 
	 * you may also use the {@link #addMode()} method.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of attestation the authenticator offers
     * </p> 
	 */
	public BoundCodeDt<CompositionAttestationModeEnum> addMode(CompositionAttestationModeEnum theValue) {
		BoundCodeDt<CompositionAttestationModeEnum> retVal = new BoundCodeDt<CompositionAttestationModeEnum>(CompositionAttestationModeEnum.VALUESET_BINDER, theValue);
		getMode().add(retVal);
		return retVal;
	}

	/**
	 * Gets the first repetition for <b>mode</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of attestation the authenticator offers
     * </p> 
	 */
	public BoundCodeDt<CompositionAttestationModeEnum> getModeFirstRep() {
		if (getMode().size() == 0) {
			addMode();
		}
		return getMode().get(0);
	}

	/**
	 * Add a value for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of attestation the authenticator offers
     * </p> 
	 */
	public BoundCodeDt<CompositionAttestationModeEnum> addMode() {
		BoundCodeDt<CompositionAttestationModeEnum> retVal = new BoundCodeDt<CompositionAttestationModeEnum>(CompositionAttestationModeEnum.VALUESET_BINDER);
		getMode().add(retVal);
		return retVal;
	}

	/**
	 * Sets the value(s), and clears any existing value(s) for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of attestation the authenticator offers
     * </p> 
	 */
	public Attester setMode(CompositionAttestationModeEnum theValue) {
		getMode().clear();
		addMode(theValue);
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>time</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When composition was attested by the party
     * </p> 
	 */
	public DateTimeDt getTimeElement() {  
		if (myTime == null) {
			myTime = new DateTimeDt();
		}
		return myTime;
	}

	
	/**
	 * Gets the value(s) for <b>time</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * When composition was attested by the party
     * </p> 
	 */
	public Date getTime() {  
		return getTimeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>time</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When composition was attested by the party
     * </p> 
	 */
	public Attester setTime(DateTimeDt theValue) {
		myTime = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>time</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When composition was attested by the party
     * </p> 
	 */
	public Attester setTime( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myTime = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>time</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * When composition was attested by the party
     * </p> 
	 */
	public Attester setTimeWithSecondsPrecision( Date theDate) {
		myTime = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>party</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Who attested the composition in the specified way
     * </p> 
	 */
	public ResourceReferenceDt getParty() {  
		if (myParty == null) {
			myParty = new ResourceReferenceDt();
		}
		return myParty;
	}

	/**
	 * Sets the value(s) for <b>party</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Who attested the composition in the specified way
     * </p> 
	 */
	public Attester setParty(ResourceReferenceDt theValue) {
		myParty = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Composition.event</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The clinical service, such as a colonoscopy or an appendectomy, being documented
     * </p> 
	 */
	@Block()	
	public static class Event 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeableConceptDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \"History and Physical Report\" in which the procedure being documented is necessarily a \"History and Physical\" act."
	)
	private java.util.List<CodeableConceptDt> myCode;
	
	@Child(name="period", type=PeriodDt.class, order=1, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time"
	)
	private PeriodDt myPeriod;
	
	@Child(name="detail", order=2, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy"
	)
	private java.util.List<ResourceReferenceDt> myDetail;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myPeriod,  myDetail);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myPeriod, myDetail);
	}

	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \&quot;History and Physical Report\&quot; in which the procedure being documented is necessarily a \&quot;History and Physical\&quot; act.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getCode() {  
		if (myCode == null) {
			myCode = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \&quot;History and Physical Report\&quot; in which the procedure being documented is necessarily a \&quot;History and Physical\&quot; act.
     * </p> 
	 */
	public Event setCode(java.util.List<CodeableConceptDt> theValue) {
		myCode = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>code</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \&quot;History and Physical Report\&quot; in which the procedure being documented is necessarily a \&quot;History and Physical\&quot; act.
     * </p> 
	 */
	public CodeableConceptDt addCode() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getCode().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>code</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \&quot;History and Physical Report\&quot; in which the procedure being documented is necessarily a \&quot;History and Physical\&quot; act.
	 * </p>
	 * @param theValue The code to add (must not be <code>null</code>)
	 */
	public Event addCode(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCode().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>code</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * This list of codes represents the main clinical acts, such as a colonoscopy or an appendectomy, being documented. In some cases, the event is inherent in the typeCode, such as a \&quot;History and Physical Report\&quot; in which the procedure being documented is necessarily a \&quot;History and Physical\&quot; act.
     * </p> 
	 */
	public CodeableConceptDt getCodeFirstRep() {
		if (getCode().isEmpty()) {
			return addCode();
		}
		return getCode().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time
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
     * The period of time covered by the documentation. There is no assertion that the documentation is a complete representation for this period, only that it documents events during this time
     * </p> 
	 */
	public Event setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>detail</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getDetail() {  
		if (myDetail == null) {
			myDetail = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myDetail;
	}

	/**
	 * Sets the value(s) for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy
     * </p> 
	 */
	public Event setDetail(java.util.List<ResourceReferenceDt> theValue) {
		myDetail = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>detail</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The description and/or reference of the event(s) being documented. For example, this could be used to document such a colonoscopy or an appendectomy
     * </p> 
	 */
	public ResourceReferenceDt addDetail() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getDetail().add(newType);
		return newType; 
	}
  


	}


	/**
	 * Block class for child element: <b>Composition.section</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The root of the sections that make up the composition
     * </p> 
	 */
	@Block()	
	public static class Section 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="title", type=StringDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents"
	)
	private StringDt myTitle;
	
	@Child(name="code", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code identifying the kind of content contained within the section. This must be consistent with the section title"
	)
	private CodeableConceptDt myCode;
	
	@Child(name="text", type=NarrativeDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \"clinically safe\" for a human to just read the narrative."
	)
	private NarrativeDt myText;
	
	@Child(name="mode", type=CodeDt.class, order=3, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="",
		formalDefinition="How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/list-mode")
	private CodeDt myMode;
	
	@Child(name="orderedBy", type=CodeableConceptDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Specifies the order applied to the items in the section entries"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/list-order")
	private CodeableConceptDt myOrderedBy;
	
	@Child(name="entry", order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A reference to the actual resource from which the narrative in the section is derived"
	)
	private java.util.List<ResourceReferenceDt> myEntry;
	
	@Child(name="emptyReason", type=CodeableConceptDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/list-empty-reason")
	private CodeableConceptDt myEmptyReason;
	
	@Child(name="section", type=Section.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A nested sub-section within this section"
	)
	private java.util.List<Section> mySection;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myTitle,  myCode,  myText,  myMode,  myOrderedBy,  myEntry,  myEmptyReason,  mySection);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myTitle, myCode, myText, myMode, myOrderedBy, myEntry, myEmptyReason, mySection);
	}

	/**
	 * Gets the value(s) for <b>title</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents
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
     * The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents
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
     * The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents
     * </p> 
	 */
	public Section setTitle(StringDt theValue) {
		myTitle = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>title</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The label for this particular section.  This will be part of the rendered content for the document, and is often used to build a table of contents
     * </p> 
	 */
	public Section setTitle( String theString) {
		myTitle = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>code</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code identifying the kind of content contained within the section. This must be consistent with the section title
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
     * A code identifying the kind of content contained within the section. This must be consistent with the section title
     * </p> 
	 */
	public Section setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \&quot;clinically safe\&quot; for a human to just read the narrative.
     * </p> 
	 */
	public NarrativeDt getText() {  
		if (myText == null) {
			myText = new NarrativeDt();
		}
		return myText;
	}

	/**
	 * Sets the value(s) for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A human-readable narrative that contains the attested content of the section, used to represent the content of the resource to a human. The narrative need not encode all the structured data, but is required to contain sufficient detail to make it \&quot;clinically safe\&quot; for a human to just read the narrative.
     * </p> 
	 */
	public Section setText(NarrativeDt theValue) {
		myText = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>mode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted
     * </p> 
	 */
	public CodeDt getModeElement() {  
		if (myMode == null) {
			myMode = new CodeDt();
		}
		return myMode;
	}

	
	/**
	 * Gets the value(s) for <b>mode</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted
     * </p> 
	 */
	public String getMode() {  
		return getModeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted
     * </p> 
	 */
	public Section setMode(CodeDt theValue) {
		myMode = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>mode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * How the entry list was prepared - whether it is a working list that is suitable for being maintained on an ongoing basis, or if it represents a snapshot of a list of items from another source, or whether it is a prepared list where items may be marked as added, modified or deleted
     * </p> 
	 */
	public Section setMode( String theCode) {
		myMode = new CodeDt(theCode); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>orderedBy</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies the order applied to the items in the section entries
     * </p> 
	 */
	public CodeableConceptDt getOrderedBy() {  
		if (myOrderedBy == null) {
			myOrderedBy = new CodeableConceptDt();
		}
		return myOrderedBy;
	}

	/**
	 * Sets the value(s) for <b>orderedBy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Specifies the order applied to the items in the section entries
     * </p> 
	 */
	public Section setOrderedBy(CodeableConceptDt theValue) {
		myOrderedBy = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>entry</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to the actual resource from which the narrative in the section is derived
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getEntry() {  
		if (myEntry == null) {
			myEntry = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myEntry;
	}

	/**
	 * Sets the value(s) for <b>entry</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to the actual resource from which the narrative in the section is derived
     * </p> 
	 */
	public Section setEntry(java.util.List<ResourceReferenceDt> theValue) {
		myEntry = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>entry</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to the actual resource from which the narrative in the section is derived
     * </p> 
	 */
	public ResourceReferenceDt addEntry() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getEntry().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>emptyReason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason
     * </p> 
	 */
	public CodeableConceptDt getEmptyReason() {  
		if (myEmptyReason == null) {
			myEmptyReason = new CodeableConceptDt();
		}
		return myEmptyReason;
	}

	/**
	 * Sets the value(s) for <b>emptyReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * If the section is empty, why the list is empty. An empty section typically has some text explaining the empty reason
     * </p> 
	 */
	public Section setEmptyReason(CodeableConceptDt theValue) {
		myEmptyReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>section</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A nested sub-section within this section
     * </p> 
	 */
	public java.util.List<Section> getSection() {  
		if (mySection == null) {
			mySection = new java.util.ArrayList<Section>();
		}
		return mySection;
	}

	/**
	 * Sets the value(s) for <b>section</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A nested sub-section within this section
     * </p> 
	 */
	public Section setSection(java.util.List<Section> theValue) {
		mySection = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>section</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A nested sub-section within this section
     * </p> 
	 */
	public Section addSection() {
		Section newType = new Section();
		getSection().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>section</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A nested sub-section within this section
	 * </p>
	 * @param theValue The section to add (must not be <code>null</code>)
	 */
	public Section addSection(Section theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSection().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>section</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A nested sub-section within this section
     * </p> 
	 */
	public Section getSectionFirstRep() {
		if (getSection().isEmpty()) {
			return addSection();
		}
		return getSection().get(0); 
	}
  


	}




    @Override
    public String getResourceName() {
        return "Composition";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
