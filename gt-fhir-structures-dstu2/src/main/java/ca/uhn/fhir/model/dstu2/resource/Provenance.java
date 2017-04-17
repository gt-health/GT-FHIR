















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
 * HAPI/FHIR <b>Provenance</b> Resource
 * (infrastructure.information)
 *
 * <p>
 * <b>Definition:</b>
 * Provenance of a resource is a record that describes entities and processes involved in producing and delivering or otherwise influencing that resource. Provenance provides a critical foundation for assessing authenticity, enabling trust, and allowing reproducibility. Provenance assertions are a form of contextual metadata and can themselves become important records with their own provenance. Provenance statement indicates clinical significance in terms of confidence in authenticity, reliability, and trustworthiness, integrity, and stage in lifecycle (e.g. Document Completion - has the artifact been legally authenticated), all of which may impact security, privacy, and trust policies.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Provenance">http://hl7.org/fhir/profiles/Provenance</a> 
 * </p>
 *
 */
@ResourceDef(name="Provenance", profile="http://hl7.org/fhir/profiles/Provenance", id="provenance")
public class Provenance extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>target</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Provenance.target</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="target", path="Provenance.target", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Patient") 	}
 )
	public static final String SP_TARGET = "target";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>target</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Provenance.target</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam TARGET = new ReferenceClientParam(SP_TARGET);

	/**
	 * Search parameter constant for <b>start</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Provenance.period.start</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="start", path="Provenance.period.start", description="", type="date"  )
	public static final String SP_START = "start";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>start</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Provenance.period.start</b><br>
	 * </p>
	 */
	public static final DateClientParam START = new DateClientParam(SP_START);

	/**
	 * Search parameter constant for <b>end</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Provenance.period.end</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="end", path="Provenance.period.end", description="", type="date"  )
	public static final String SP_END = "end";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>end</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Provenance.period.end</b><br>
	 * </p>
	 */
	public static final DateClientParam END = new DateClientParam(SP_END);

	/**
	 * Search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Provenance.location</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="location", path="Provenance.location", description="", type="reference"  )
	public static final String SP_LOCATION = "location";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>location</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Provenance.location</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam LOCATION = new ReferenceClientParam(SP_LOCATION);

	/**
	 * Search parameter constant for <b>agent</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Provenance.agent.actor</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="agent", path="Provenance.agent.actor", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_AGENT = "agent";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>agent</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Provenance.agent.actor</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam AGENT = new ReferenceClientParam(SP_AGENT);

	/**
	 * Search parameter constant for <b>userid</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Provenance.agent.userId</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="userid", path="Provenance.agent.userId", description="", type="token"  )
	public static final String SP_USERID = "userid";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>userid</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Provenance.agent.userId</b><br>
	 * </p>
	 */
	public static final TokenClientParam USERID = new TokenClientParam(SP_USERID);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Provenance.target</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Provenance.target", description="", type="reference" , providesMembershipIn={
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
	 * Path: <b>Provenance.target</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>sigtype</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Provenance.signature.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="sigtype", path="Provenance.signature.type", description="", type="token"  )
	public static final String SP_SIGTYPE = "sigtype";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>sigtype</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Provenance.signature.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam SIGTYPE = new TokenClientParam(SP_SIGTYPE);

	/**
	 * Search parameter constant for <b>entitytype</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Provenance.entity.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="entitytype", path="Provenance.entity.type", description="", type="token"  )
	public static final String SP_ENTITYTYPE = "entitytype";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>entitytype</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Provenance.entity.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam ENTITYTYPE = new TokenClientParam(SP_ENTITYTYPE);

	/**
	 * Search parameter constant for <b>entity</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>Provenance.entity.reference</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="entity", path="Provenance.entity.reference", description="", type="uri"  )
	public static final String SP_ENTITY = "entity";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>entity</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>uri</b><br>
	 * Path: <b>Provenance.entity.reference</b><br>
	 * </p>
	 */
	public static final UriClientParam ENTITY = new UriClientParam(SP_ENTITY);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Provenance:agent</b>".
	 */
	public static final Include INCLUDE_AGENT = new Include("Provenance:agent");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Provenance:location</b>".
	 */
	public static final Include INCLUDE_LOCATION = new Include("Provenance:location");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Provenance:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Provenance:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Provenance:target</b>".
	 */
	public static final Include INCLUDE_TARGET = new Include("Provenance:target");


	@Child(name="target", order=0, min=1, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		IResource.class	})
	@Description(
		shortDefinition="what",
		formalDefinition="The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity"
	)
	private java.util.List<ResourceReferenceDt> myTarget;
	
	@Child(name="period", type=PeriodDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.done",
		formalDefinition="The period during which the activity occurred"
	)
	private PeriodDt myPeriod;
	
	@Child(name="recorded", type=InstantDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The instant of time at which the activity was recorded"
	)
	private InstantDt myRecorded;
	
	@Child(name="reason", type=CodeableConceptDt.class, order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="why",
		formalDefinition="The reason that the activity was taking place"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/v3-PurposeOfUse")
	private java.util.List<CodeableConceptDt> myReason;
	
	@Child(name="activity", type=CodeableConceptDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="why",
		formalDefinition="An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/v3-ProvenanceEventCurrentState")
	private CodeableConceptDt myActivity;
	
	@Child(name="location", order=5, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="where",
		formalDefinition="Where the activity occurred, if relevant"
	)
	private ResourceReferenceDt myLocation;
	
	@Child(name="policy", type=UriDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc."
	)
	private java.util.List<UriDt> myPolicy;
	
	@Child(name="agent", order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="who",
		formalDefinition="An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility"
	)
	private java.util.List<Agent> myAgent;
	
	@Child(name="entity", order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An entity used in this activity"
	)
	private java.util.List<Entity> myEntity;
	
	@Child(name="signature", type=SignatureDt.class, order=9, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated."
	)
	private java.util.List<SignatureDt> mySignature;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myTarget,  myPeriod,  myRecorded,  myReason,  myActivity,  myLocation,  myPolicy,  myAgent,  myEntity,  mySignature);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myTarget, myPeriod, myRecorded, myReason, myActivity, myLocation, myPolicy, myAgent, myEntity, mySignature);
	}

	/**
	 * Gets the value(s) for <b>target</b> (what).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getTarget() {  
		if (myTarget == null) {
			myTarget = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myTarget;
	}

	/**
	 * Sets the value(s) for <b>target</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity
     * </p> 
	 */
	public Provenance setTarget(java.util.List<ResourceReferenceDt> theValue) {
		myTarget = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>target</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * The Reference(s) that were generated or updated by  the activity described in this resource. A provenance can point to more than one target if multiple resources were created/updated by the same activity
     * </p> 
	 */
	public ResourceReferenceDt addTarget() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getTarget().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>period</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The period during which the activity occurred
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
     * The period during which the activity occurred
     * </p> 
	 */
	public Provenance setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>recorded</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The instant of time at which the activity was recorded
     * </p> 
	 */
	public InstantDt getRecordedElement() {  
		if (myRecorded == null) {
			myRecorded = new InstantDt();
		}
		return myRecorded;
	}

	
	/**
	 * Gets the value(s) for <b>recorded</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The instant of time at which the activity was recorded
     * </p> 
	 */
	public Date getRecorded() {  
		return getRecordedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>recorded</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The instant of time at which the activity was recorded
     * </p> 
	 */
	public Provenance setRecorded(InstantDt theValue) {
		myRecorded = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>recorded</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The instant of time at which the activity was recorded
     * </p> 
	 */
	public Provenance setRecordedWithMillisPrecision( Date theDate) {
		myRecorded = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>recorded</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The instant of time at which the activity was recorded
     * </p> 
	 */
	public Provenance setRecorded( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myRecorded = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>reason</b> (why).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The reason that the activity was taking place
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
     * The reason that the activity was taking place
     * </p> 
	 */
	public Provenance setReason(java.util.List<CodeableConceptDt> theValue) {
		myReason = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>reason</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * The reason that the activity was taking place
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
	 * The reason that the activity was taking place
	 * </p>
	 * @param theValue The reason to add (must not be <code>null</code>)
	 */
	public Provenance addReason(CodeableConceptDt theValue) {
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
     * The reason that the activity was taking place
     * </p> 
	 */
	public CodeableConceptDt getReasonFirstRep() {
		if (getReason().isEmpty()) {
			return addReason();
		}
		return getReason().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>activity</b> (why).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities
     * </p> 
	 */
	public CodeableConceptDt getActivity() {  
		if (myActivity == null) {
			myActivity = new CodeableConceptDt();
		}
		return myActivity;
	}

	/**
	 * Sets the value(s) for <b>activity</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * An activity is something that occurs over a period of time and acts upon or with entities; it may include consuming, processing, transforming, modifying, relocating, using, or generating entities
     * </p> 
	 */
	public Provenance setActivity(CodeableConceptDt theValue) {
		myActivity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>location</b> (where).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Where the activity occurred, if relevant
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
     * Where the activity occurred, if relevant
     * </p> 
	 */
	public Provenance setLocation(ResourceReferenceDt theValue) {
		myLocation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>policy</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
     * </p> 
	 */
	public java.util.List<UriDt> getPolicy() {  
		if (myPolicy == null) {
			myPolicy = new java.util.ArrayList<UriDt>();
		}
		return myPolicy;
	}

	/**
	 * Sets the value(s) for <b>policy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
     * </p> 
	 */
	public Provenance setPolicy(java.util.List<UriDt> theValue) {
		myPolicy = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>policy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
     * </p> 
	 */
	public UriDt addPolicy() {
		UriDt newType = new UriDt();
		getPolicy().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>policy</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
	 * </p>
	 * @param theValue The policy to add (must not be <code>null</code>)
	 */
	public Provenance addPolicy(UriDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPolicy().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>policy</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
     * </p> 
	 */
	public UriDt getPolicyFirstRep() {
		if (getPolicy().isEmpty()) {
			return addPolicy();
		}
		return getPolicy().get(0); 
	}
 	/**
	 * Adds a new value for <b>policy</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Policy or plan the activity was defined by. Typically, a single activity may have multiple applicable policy documents, such as patient consent, guarantor funding, etc.
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public Provenance addPolicy( String theUri) {
		if (myPolicy == null) {
			myPolicy = new java.util.ArrayList<UriDt>();
		}
		myPolicy.add(new UriDt(theUri));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>agent</b> (who).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility
     * </p> 
	 */
	public java.util.List<Agent> getAgent() {  
		if (myAgent == null) {
			myAgent = new java.util.ArrayList<Agent>();
		}
		return myAgent;
	}

	/**
	 * Sets the value(s) for <b>agent</b> (who)
	 *
     * <p>
     * <b>Definition:</b>
     * An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility
     * </p> 
	 */
	public Provenance setAgent(java.util.List<Agent> theValue) {
		myAgent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>agent</b> (who)
	 *
     * <p>
     * <b>Definition:</b>
     * An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility
     * </p> 
	 */
	public Agent addAgent() {
		Agent newType = new Agent();
		getAgent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>agent</b> (who)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility
	 * </p>
	 * @param theValue The agent to add (must not be <code>null</code>)
	 */
	public Provenance addAgent(Agent theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAgent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>agent</b> (who),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility
     * </p> 
	 */
	public Agent getAgentFirstRep() {
		if (getAgent().isEmpty()) {
			return addAgent();
		}
		return getAgent().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>entity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An entity used in this activity
     * </p> 
	 */
	public java.util.List<Entity> getEntity() {  
		if (myEntity == null) {
			myEntity = new java.util.ArrayList<Entity>();
		}
		return myEntity;
	}

	/**
	 * Sets the value(s) for <b>entity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An entity used in this activity
     * </p> 
	 */
	public Provenance setEntity(java.util.List<Entity> theValue) {
		myEntity = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>entity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An entity used in this activity
     * </p> 
	 */
	public Entity addEntity() {
		Entity newType = new Entity();
		getEntity().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>entity</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * An entity used in this activity
	 * </p>
	 * @param theValue The entity to add (must not be <code>null</code>)
	 */
	public Provenance addEntity(Entity theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getEntity().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>entity</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * An entity used in this activity
     * </p> 
	 */
	public Entity getEntityFirstRep() {
		if (getEntity().isEmpty()) {
			return addEntity();
		}
		return getEntity().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>signature</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
     * </p> 
	 */
	public java.util.List<SignatureDt> getSignature() {  
		if (mySignature == null) {
			mySignature = new java.util.ArrayList<SignatureDt>();
		}
		return mySignature;
	}

	/**
	 * Sets the value(s) for <b>signature</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
     * </p> 
	 */
	public Provenance setSignature(java.util.List<SignatureDt> theValue) {
		mySignature = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>signature</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
     * </p> 
	 */
	public SignatureDt addSignature() {
		SignatureDt newType = new SignatureDt();
		getSignature().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>signature</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
	 * </p>
	 * @param theValue The signature to add (must not be <code>null</code>)
	 */
	public Provenance addSignature(SignatureDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSignature().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>signature</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A digital signature on the target Reference(s). The signer should match a Provenance.agent. The purpose of the signature is indicated.
     * </p> 
	 */
	public SignatureDt getSignatureFirstRep() {
		if (getSignature().isEmpty()) {
			return addSignature();
		}
		return getSignature().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Provenance.agent</b> (who)
	 *
     * <p>
     * <b>Definition:</b>
     * An agent takes a role in an activity such that the agent can be assigned some degree of responsibility for the activity taking place. An agent can be a person, an organization, software, or other entities that may be ascribed responsibility
     * </p> 
	 */
	@Block()	
	public static class Agent 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="role", type=CodingDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The function of the agent with respect to the activity."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-provenance-agent-role")
	private CodingDt myRole;
	
	@Child(name="actor", order=1, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="The individual, device or organization that participated in the event"
	)
	private ResourceReferenceDt myActor;
	
	@Child(name="userId", type=IdentifierDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="who.actor",
		formalDefinition="The identity of the agent as known by the authorization system"
	)
	private IdentifierDt myUserId;
	
	@Child(name="relatedAgent", order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A relationship between two the agents referenced in this resource. This is defined to allow for explicit description of the delegation between agents.  For example, this human author used this device, or one person acted on another's behest"
	)
	private java.util.List<AgentRelatedAgent> myRelatedAgent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myRole,  myActor,  myUserId,  myRelatedAgent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myRole, myActor, myUserId, myRelatedAgent);
	}

	/**
	 * Gets the value(s) for <b>role</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The function of the agent with respect to the activity.
     * </p> 
	 */
	public CodingDt getRole() {  
		if (myRole == null) {
			myRole = new CodingDt();
		}
		return myRole;
	}

	/**
	 * Sets the value(s) for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The function of the agent with respect to the activity.
     * </p> 
	 */
	public Agent setRole(CodingDt theValue) {
		myRole = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>actor</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The individual, device or organization that participated in the event
     * </p> 
	 */
	public ResourceReferenceDt getActor() {  
		if (myActor == null) {
			myActor = new ResourceReferenceDt();
		}
		return myActor;
	}

	/**
	 * Sets the value(s) for <b>actor</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The individual, device or organization that participated in the event
     * </p> 
	 */
	public Agent setActor(ResourceReferenceDt theValue) {
		myActor = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>userId</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The identity of the agent as known by the authorization system
     * </p> 
	 */
	public IdentifierDt getUserId() {  
		if (myUserId == null) {
			myUserId = new IdentifierDt();
		}
		return myUserId;
	}

	/**
	 * Sets the value(s) for <b>userId</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * The identity of the agent as known by the authorization system
     * </p> 
	 */
	public Agent setUserId(IdentifierDt theValue) {
		myUserId = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>relatedAgent</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A relationship between two the agents referenced in this resource. This is defined to allow for explicit description of the delegation between agents.  For example, this human author used this device, or one person acted on another's behest
     * </p> 
	 */
	public java.util.List<AgentRelatedAgent> getRelatedAgent() {  
		if (myRelatedAgent == null) {
			myRelatedAgent = new java.util.ArrayList<AgentRelatedAgent>();
		}
		return myRelatedAgent;
	}

	/**
	 * Sets the value(s) for <b>relatedAgent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A relationship between two the agents referenced in this resource. This is defined to allow for explicit description of the delegation between agents.  For example, this human author used this device, or one person acted on another's behest
     * </p> 
	 */
	public Agent setRelatedAgent(java.util.List<AgentRelatedAgent> theValue) {
		myRelatedAgent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>relatedAgent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A relationship between two the agents referenced in this resource. This is defined to allow for explicit description of the delegation between agents.  For example, this human author used this device, or one person acted on another's behest
     * </p> 
	 */
	public AgentRelatedAgent addRelatedAgent() {
		AgentRelatedAgent newType = new AgentRelatedAgent();
		getRelatedAgent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>relatedAgent</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A relationship between two the agents referenced in this resource. This is defined to allow for explicit description of the delegation between agents.  For example, this human author used this device, or one person acted on another's behest
	 * </p>
	 * @param theValue The relatedAgent to add (must not be <code>null</code>)
	 */
	public Agent addRelatedAgent(AgentRelatedAgent theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRelatedAgent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>relatedAgent</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A relationship between two the agents referenced in this resource. This is defined to allow for explicit description of the delegation between agents.  For example, this human author used this device, or one person acted on another's behest
     * </p> 
	 */
	public AgentRelatedAgent getRelatedAgentFirstRep() {
		if (getRelatedAgent().isEmpty()) {
			return addRelatedAgent();
		}
		return getRelatedAgent().get(0); 
	}
  


	}

	/**
	 * Block class for child element: <b>Provenance.agent.relatedAgent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A relationship between two the agents referenced in this resource. This is defined to allow for explicit description of the delegation between agents.  For example, this human author used this device, or one person acted on another's behest
     * </p> 
	 */
	@Block()	
	public static class AgentRelatedAgent 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of relationship between agents"
	)
	private CodeableConceptDt myType;
	
	@Child(name="target", type=UriDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="An internal reference to another agent listed in this provenance by its identifier"
	)
	private UriDt myTarget;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myTarget);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myTarget);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of relationship between agents
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
     * The type of relationship between agents
     * </p> 
	 */
	public AgentRelatedAgent setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>target</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An internal reference to another agent listed in this provenance by its identifier
     * </p> 
	 */
	public UriDt getTargetElement() {  
		if (myTarget == null) {
			myTarget = new UriDt();
		}
		return myTarget;
	}

	
	/**
	 * Gets the value(s) for <b>target</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An internal reference to another agent listed in this provenance by its identifier
     * </p> 
	 */
	public String getTarget() {  
		return getTargetElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>target</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An internal reference to another agent listed in this provenance by its identifier
     * </p> 
	 */
	public AgentRelatedAgent setTarget(UriDt theValue) {
		myTarget = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>target</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An internal reference to another agent listed in this provenance by its identifier
     * </p> 
	 */
	public AgentRelatedAgent setTarget( String theUri) {
		myTarget = new UriDt(theUri); 
		return this; 
	}

 


	}



	/**
	 * Block class for child element: <b>Provenance.entity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * An entity used in this activity
     * </p> 
	 */
	@Block()	
	public static class Entity 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="role", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="How the entity was used during the activity"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/provenance-entity-role")
	private BoundCodeDt<ProvenanceEntityRoleEnum> myRole;
	
	@Child(name="type", type=CodingDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of the entity. If the entity is a resource, then this is a resource type"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/resource-types")
	private CodingDt myType;
	
	@Child(name="reference", type=UriDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative"
	)
	private UriDt myReference;
	
	@Child(name="display", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Human-readable description of the entity"
	)
	private StringDt myDisplay;
	
	@Child(name="agent", type=Agent.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity"
	)
	private Agent myAgent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myRole,  myType,  myReference,  myDisplay,  myAgent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myRole, myType, myReference, myDisplay, myAgent);
	}

	/**
	 * Gets the value(s) for <b>role</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * How the entity was used during the activity
     * </p> 
	 */
	public BoundCodeDt<ProvenanceEntityRoleEnum> getRoleElement() {  
		if (myRole == null) {
			myRole = new BoundCodeDt<ProvenanceEntityRoleEnum>(ProvenanceEntityRoleEnum.VALUESET_BINDER);
		}
		return myRole;
	}

	
	/**
	 * Gets the value(s) for <b>role</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * How the entity was used during the activity
     * </p> 
	 */
	public String getRole() {  
		return getRoleElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * How the entity was used during the activity
     * </p> 
	 */
	public Entity setRole(BoundCodeDt<ProvenanceEntityRoleEnum> theValue) {
		myRole = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * How the entity was used during the activity
     * </p> 
	 */
	public Entity setRole(ProvenanceEntityRoleEnum theValue) {
		setRole(new BoundCodeDt<ProvenanceEntityRoleEnum>(ProvenanceEntityRoleEnum.VALUESET_BINDER, theValue));
		
/*
		getRoleElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of the entity. If the entity is a resource, then this is a resource type
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
     * The type of the entity. If the entity is a resource, then this is a resource type
     * </p> 
	 */
	public Entity setType(CodingDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>reference</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative
     * </p> 
	 */
	public UriDt getReferenceElement() {  
		if (myReference == null) {
			myReference = new UriDt();
		}
		return myReference;
	}

	
	/**
	 * Gets the value(s) for <b>reference</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative
     * </p> 
	 */
	public String getReference() {  
		return getReferenceElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>reference</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative
     * </p> 
	 */
	public Entity setReference(UriDt theValue) {
		myReference = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>reference</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Identity of the  Entity used. May be a logical or physical uri and maybe absolute or relative
     * </p> 
	 */
	public Entity setReference( String theUri) {
		myReference = new UriDt(theUri); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>display</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable description of the entity
     * </p> 
	 */
	public StringDt getDisplayElement() {  
		if (myDisplay == null) {
			myDisplay = new StringDt();
		}
		return myDisplay;
	}

	
	/**
	 * Gets the value(s) for <b>display</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable description of the entity
     * </p> 
	 */
	public String getDisplay() {  
		return getDisplayElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>display</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable description of the entity
     * </p> 
	 */
	public Entity setDisplay(StringDt theValue) {
		myDisplay = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>display</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Human-readable description of the entity
     * </p> 
	 */
	public Entity setDisplay( String theString) {
		myDisplay = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>agent</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity
     * </p> 
	 */
	public Agent getAgent() {  
		if (myAgent == null) {
			myAgent = new Agent();
		}
		return myAgent;
	}

	/**
	 * Sets the value(s) for <b>agent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The entity is attributed to an agent to express the agent's responsibility for that entity, possibly along with other agents. This description can be understood as shorthand for saying that the agent was responsible for the activity which generated the entity
     * </p> 
	 */
	public Entity setAgent(Agent theValue) {
		myAgent = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "Provenance";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
