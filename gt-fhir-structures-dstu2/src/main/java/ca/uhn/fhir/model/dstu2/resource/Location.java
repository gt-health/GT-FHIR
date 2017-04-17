















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
 * HAPI/FHIR <b>Location</b> Resource
 * (administrative.entity)
 *
 * <p>
 * <b>Definition:</b>
 * Details and position information for a physical place where services are provided  and resources and participants may be stored, found, contained or accommodated.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Location">http://hl7.org/fhir/profiles/Location</a> 
 * </p>
 *
 */
@ResourceDef(name="Location", profile="http://hl7.org/fhir/profiles/Location", id="location")
public class Location extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Location.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A (portion of the) name of the location</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="Location.name", description="A (portion of the) name of the location", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A (portion of the) name of the location</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.name</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>A code for the type of location</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="Location.type", description="A code for the type of location", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>A code for the type of location</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>address</b>
	 * <p>
	 * Description: <b>A (part of the) address of the location</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.address</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address", path="Location.address", description="A (part of the) address of the location", type="string"  )
	public static final String SP_ADDRESS = "address";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address</b>
	 * <p>
	 * Description: <b>A (part of the) address of the location</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.address</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS = new StringClientParam(SP_ADDRESS);

	/**
	 * Search parameter constant for <b>address-city</b>
	 * <p>
	 * Description: <b>A city specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.address.city</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-city", path="Location.address.city", description="A city specified in an address", type="string"  )
	public static final String SP_ADDRESS_CITY = "address-city";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-city</b>
	 * <p>
	 * Description: <b>A city specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.address.city</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_CITY = new StringClientParam(SP_ADDRESS_CITY);

	/**
	 * Search parameter constant for <b>address-state</b>
	 * <p>
	 * Description: <b>A state specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.address.state</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-state", path="Location.address.state", description="A state specified in an address", type="string"  )
	public static final String SP_ADDRESS_STATE = "address-state";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-state</b>
	 * <p>
	 * Description: <b>A state specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.address.state</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_STATE = new StringClientParam(SP_ADDRESS_STATE);

	/**
	 * Search parameter constant for <b>address-postalcode</b>
	 * <p>
	 * Description: <b>A postal code specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.address.postalCode</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-postalcode", path="Location.address.postalCode", description="A postal code specified in an address", type="string"  )
	public static final String SP_ADDRESS_POSTALCODE = "address-postalcode";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-postalcode</b>
	 * <p>
	 * Description: <b>A postal code specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.address.postalCode</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_POSTALCODE = new StringClientParam(SP_ADDRESS_POSTALCODE);

	/**
	 * Search parameter constant for <b>address-country</b>
	 * <p>
	 * Description: <b>A country specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.address.country</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-country", path="Location.address.country", description="A country specified in an address", type="string"  )
	public static final String SP_ADDRESS_COUNTRY = "address-country";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-country</b>
	 * <p>
	 * Description: <b>A country specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Location.address.country</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_COUNTRY = new StringClientParam(SP_ADDRESS_COUNTRY);

	/**
	 * Search parameter constant for <b>address-use</b>
	 * <p>
	 * Description: <b>A use code specified in an address</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.address.use</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-use", path="Location.address.use", description="A use code specified in an address", type="token"  )
	public static final String SP_ADDRESS_USE = "address-use";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-use</b>
	 * <p>
	 * Description: <b>A use code specified in an address</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.address.use</b><br>
	 * </p>
	 */
	public static final TokenClientParam ADDRESS_USE = new TokenClientParam(SP_ADDRESS_USE);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Searches for locations with a specific kind of status</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="Location.status", description="Searches for locations with a specific kind of status", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Searches for locations with a specific kind of status</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>partof</b>
	 * <p>
	 * Description: <b>The location of which this location is a part</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Location.partOf</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="partof", path="Location.partOf", description="The location of which this location is a part", type="reference"  )
	public static final String SP_PARTOF = "partof";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>partof</b>
	 * <p>
	 * Description: <b>The location of which this location is a part</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Location.partOf</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PARTOF = new ReferenceClientParam(SP_PARTOF);

	/**
	 * Search parameter constant for <b>near</b>
	 * <p>
	 * Description: <b>The coordinates expressed as [lat],[long] (using the WGS84 datum, see notes) to find locations near to (servers may search using a square rather than a circle for efficiency)</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.position</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="near", path="Location.position", description="The coordinates expressed as [lat],[long] (using the WGS84 datum, see notes) to find locations near to (servers may search using a square rather than a circle for efficiency)", type="token"  )
	public static final String SP_NEAR = "near";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>near</b>
	 * <p>
	 * Description: <b>The coordinates expressed as [lat],[long] (using the WGS84 datum, see notes) to find locations near to (servers may search using a square rather than a circle for efficiency)</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.position</b><br>
	 * </p>
	 */
	public static final TokenClientParam NEAR = new TokenClientParam(SP_NEAR);

	/**
	 * Search parameter constant for <b>near-distance</b>
	 * <p>
	 * Description: <b>A distance quantity to limit the near search to locations within a specific distance</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.position</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="near-distance", path="Location.position", description="A distance quantity to limit the near search to locations within a specific distance", type="token"  )
	public static final String SP_NEAR_DISTANCE = "near-distance";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>near-distance</b>
	 * <p>
	 * Description: <b>A distance quantity to limit the near search to locations within a specific distance</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Location.position</b><br>
	 * </p>
	 */
	public static final TokenClientParam NEAR_DISTANCE = new TokenClientParam(SP_NEAR_DISTANCE);

	/**
	 * Search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>Searches for locations that are managed by the provided organization</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Location.managingOrganization</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="organization", path="Location.managingOrganization", description="Searches for locations that are managed by the provided organization", type="reference"  )
	public static final String SP_ORGANIZATION = "organization";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>Searches for locations that are managed by the provided organization</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Location.managingOrganization</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ORGANIZATION = new ReferenceClientParam(SP_ORGANIZATION);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Location:organization</b>".
	 */
	public static final Include INCLUDE_ORGANIZATION = new Include("Location:organization");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Location:partof</b>".
	 */
	public static final Include INCLUDE_PARTOF = new Include("Location:partof");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Unique code or number identifying the location to its users"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="status", type=CodeDt.class, order=1, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition=""
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/location-status")
	private BoundCodeDt<LocationStatusEnum> myStatus;
	
	@Child(name="name", type=StringDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Name of the location as used by humans. Does not need to be unique."
	)
	private StringDt myName;
	
	@Child(name="description", type=StringDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Description of the Location, which helps in finding or referencing the place"
	)
	private StringDt myDescription;
	
	@Child(name="mode", type=CodeDt.class, order=4, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="class",
		formalDefinition="Indicates whether a resource instance represents a specific location or a class of locations"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/location-mode")
	private BoundCodeDt<LocationModeEnum> myMode;
	
	@Child(name="type", type=CodeableConceptDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="Indicates the type of function performed at the location"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/v3-ServiceDeliveryLocationRoleType")
	private BoundCodeableConceptDt<LocationTypeEnum> myType;
	
	@Child(name="telecom", type=ContactPointDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites"
	)
	private java.util.List<ContactPointDt> myTelecom;
	
	@Child(name="address", type=AddressDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition=""
	)
	private AddressDt myAddress;
	
	@Child(name="physicalType", type=CodeableConceptDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="Physical form of the location, e.g. building, room, vehicle, road"
	)
	private CodeableConceptDt myPhysicalType;
	
	@Child(name="position", order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML)"
	)
	private Position myPosition;
	
	@Child(name="managingOrganization", order=10, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The organization responsible for the provisioning and upkeep of the location"
	)
	private ResourceReferenceDt myManagingOrganization;
	
	@Child(name="partOf", order=11, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Another Location which this Location is physically part of"
	)
	private ResourceReferenceDt myPartOf;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myStatus,  myName,  myDescription,  myMode,  myType,  myTelecom,  myAddress,  myPhysicalType,  myPosition,  myManagingOrganization,  myPartOf);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myStatus, myName, myDescription, myMode, myType, myTelecom, myAddress, myPhysicalType, myPosition, myManagingOrganization, myPartOf);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Unique code or number identifying the location to its users
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
     * Unique code or number identifying the location to its users
     * </p> 
	 */
	public Location setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Unique code or number identifying the location to its users
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
	 * Unique code or number identifying the location to its users
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Location addIdentifier(IdentifierDt theValue) {
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
     * Unique code or number identifying the location to its users
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
	public BoundCodeDt<LocationStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<LocationStatusEnum>(LocationStatusEnum.VALUESET_BINDER);
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
	public Location setStatus(BoundCodeDt<LocationStatusEnum> theValue) {
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
	public Location setStatus(LocationStatusEnum theValue) {
		setStatus(new BoundCodeDt<LocationStatusEnum>(LocationStatusEnum.VALUESET_BINDER, theValue));
		
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
     * Name of the location as used by humans. Does not need to be unique.
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
     * Name of the location as used by humans. Does not need to be unique.
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
     * Name of the location as used by humans. Does not need to be unique.
     * </p> 
	 */
	public Location setName(StringDt theValue) {
		myName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>name</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Name of the location as used by humans. Does not need to be unique.
     * </p> 
	 */
	public Location setName( String theString) {
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
     * Description of the Location, which helps in finding or referencing the place
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
     * Description of the Location, which helps in finding or referencing the place
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
     * Description of the Location, which helps in finding or referencing the place
     * </p> 
	 */
	public Location setDescription(StringDt theValue) {
		myDescription = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>description</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Description of the Location, which helps in finding or referencing the place
     * </p> 
	 */
	public Location setDescription( String theString) {
		myDescription = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>mode</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether a resource instance represents a specific location or a class of locations
     * </p> 
	 */
	public BoundCodeDt<LocationModeEnum> getModeElement() {  
		if (myMode == null) {
			myMode = new BoundCodeDt<LocationModeEnum>(LocationModeEnum.VALUESET_BINDER);
		}
		return myMode;
	}

	
	/**
	 * Gets the value(s) for <b>mode</b> (class).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether a resource instance represents a specific location or a class of locations
     * </p> 
	 */
	public String getMode() {  
		return getModeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>mode</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether a resource instance represents a specific location or a class of locations
     * </p> 
	 */
	public Location setMode(BoundCodeDt<LocationModeEnum> theValue) {
		myMode = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>mode</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates whether a resource instance represents a specific location or a class of locations
     * </p> 
	 */
	public Location setMode(LocationModeEnum theValue) {
		setMode(new BoundCodeDt<LocationModeEnum>(LocationModeEnum.VALUESET_BINDER, theValue));
		
/*
		getModeElement().setValueAsEnum(theValue);
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
     * Indicates the type of function performed at the location
     * </p> 
	 */
	public BoundCodeableConceptDt<LocationTypeEnum> getType() {  
		if (myType == null) {
			myType = new BoundCodeableConceptDt<LocationTypeEnum>(LocationTypeEnum.VALUESET_BINDER);
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the type of function performed at the location
     * </p> 
	 */
	public Location setType(BoundCodeableConceptDt<LocationTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the type of function performed at the location
     * </p> 
	 */
	public Location setType(LocationTypeEnum theValue) {
		setType(new BoundCodeableConceptDt<LocationTypeEnum>(LocationTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getType().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>telecom</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites
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
     * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites
     * </p> 
	 */
	public Location setTelecom(java.util.List<ContactPointDt> theValue) {
		myTelecom = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>telecom</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites
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
	 * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites
	 * </p>
	 * @param theValue The telecom to add (must not be <code>null</code>)
	 */
	public Location addTelecom(ContactPointDt theValue) {
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
     * The contact details of communication devices available at the location. This can include phone numbers, fax numbers, mobile numbers, email addresses and web sites
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
     * 
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
     * 
     * </p> 
	 */
	public Location setAddress(AddressDt theValue) {
		myAddress = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>physicalType</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Physical form of the location, e.g. building, room, vehicle, road
     * </p> 
	 */
	public CodeableConceptDt getPhysicalType() {  
		if (myPhysicalType == null) {
			myPhysicalType = new CodeableConceptDt();
		}
		return myPhysicalType;
	}

	/**
	 * Sets the value(s) for <b>physicalType</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * Physical form of the location, e.g. building, room, vehicle, road
     * </p> 
	 */
	public Location setPhysicalType(CodeableConceptDt theValue) {
		myPhysicalType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>position</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML)
     * </p> 
	 */
	public Position getPosition() {  
		if (myPosition == null) {
			myPosition = new Position();
		}
		return myPosition;
	}

	/**
	 * Sets the value(s) for <b>position</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML)
     * </p> 
	 */
	public Location setPosition(Position theValue) {
		myPosition = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>managingOrganization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The organization responsible for the provisioning and upkeep of the location
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
     * The organization responsible for the provisioning and upkeep of the location
     * </p> 
	 */
	public Location setManagingOrganization(ResourceReferenceDt theValue) {
		myManagingOrganization = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>partOf</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Another Location which this Location is physically part of
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
     * Another Location which this Location is physically part of
     * </p> 
	 */
	public Location setPartOf(ResourceReferenceDt theValue) {
		myPartOf = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>Location.position</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The absolute geographic location of the Location, expressed using the WGS84 datum (This is the same co-ordinate system used in KML)
     * </p> 
	 */
	@Block()	
	public static class Position 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="longitude", type=DecimalDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below)"
	)
	private DecimalDt myLongitude;
	
	@Child(name="latitude", type=DecimalDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below)"
	)
	private DecimalDt myLatitude;
	
	@Child(name="altitude", type=DecimalDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below)"
	)
	private DecimalDt myAltitude;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLongitude,  myLatitude,  myAltitude);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLongitude, myLatitude, myAltitude);
	}

	/**
	 * Gets the value(s) for <b>longitude</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below)
     * </p> 
	 */
	public DecimalDt getLongitudeElement() {  
		if (myLongitude == null) {
			myLongitude = new DecimalDt();
		}
		return myLongitude;
	}

	
	/**
	 * Gets the value(s) for <b>longitude</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below)
     * </p> 
	 */
	public BigDecimal getLongitude() {  
		return getLongitudeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>longitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below)
     * </p> 
	 */
	public Position setLongitude(DecimalDt theValue) {
		myLongitude = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>longitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below)
     * </p> 
	 */
	public Position setLongitude( long theValue) {
		myLongitude = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>longitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below)
     * </p> 
	 */
	public Position setLongitude( double theValue) {
		myLongitude = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>longitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Longitude. The value domain and the interpretation are the same as for the text of the longitude element in KML (see notes below)
     * </p> 
	 */
	public Position setLongitude( java.math.BigDecimal theValue) {
		myLongitude = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>latitude</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below)
     * </p> 
	 */
	public DecimalDt getLatitudeElement() {  
		if (myLatitude == null) {
			myLatitude = new DecimalDt();
		}
		return myLatitude;
	}

	
	/**
	 * Gets the value(s) for <b>latitude</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below)
     * </p> 
	 */
	public BigDecimal getLatitude() {  
		return getLatitudeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>latitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below)
     * </p> 
	 */
	public Position setLatitude(DecimalDt theValue) {
		myLatitude = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>latitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below)
     * </p> 
	 */
	public Position setLatitude( long theValue) {
		myLatitude = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>latitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below)
     * </p> 
	 */
	public Position setLatitude( double theValue) {
		myLatitude = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>latitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Latitude. The value domain and the interpretation are the same as for the text of the latitude element in KML (see notes below)
     * </p> 
	 */
	public Position setLatitude( java.math.BigDecimal theValue) {
		myLatitude = new DecimalDt(theValue); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>altitude</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below)
     * </p> 
	 */
	public DecimalDt getAltitudeElement() {  
		if (myAltitude == null) {
			myAltitude = new DecimalDt();
		}
		return myAltitude;
	}

	
	/**
	 * Gets the value(s) for <b>altitude</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below)
     * </p> 
	 */
	public BigDecimal getAltitude() {  
		return getAltitudeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>altitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below)
     * </p> 
	 */
	public Position setAltitude(DecimalDt theValue) {
		myAltitude = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>altitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below)
     * </p> 
	 */
	public Position setAltitude( long theValue) {
		myAltitude = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>altitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below)
     * </p> 
	 */
	public Position setAltitude( double theValue) {
		myAltitude = new DecimalDt(theValue); 
		return this; 
	}

	/**
	 * Sets the value for <b>altitude</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Altitude. The value domain and the interpretation are the same as for the text of the altitude element in KML (see notes below)
     * </p> 
	 */
	public Position setAltitude( java.math.BigDecimal theValue) {
		myAltitude = new DecimalDt(theValue); 
		return this; 
	}

 


	}




    @Override
    public String getResourceName() {
        return "Location";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
