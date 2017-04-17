















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
 * HAPI/FHIR <b>NutritionOrder</b> Resource
 * (clinical.careprovision)
 *
 * <p>
 * <b>Definition:</b>
 * A request to supply a diet, formula feeding (enteral) or oral nutritional supplement to a patient/resident.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/NutritionOrder">http://hl7.org/fhir/profiles/NutritionOrder</a> 
 * </p>
 *
 */
@ResourceDef(name="NutritionOrder", profile="http://hl7.org/fhir/profiles/NutritionOrder", id="nutritionorder")
public class NutritionOrder extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of the person who requires the diet, formula or nutritional supplement</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>NutritionOrder.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="NutritionOrder.patient", description="The identity of the person who requires the diet, formula or nutritional supplement", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The identity of the person who requires the diet, formula or nutritional supplement</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>NutritionOrder.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>provider</b>
	 * <p>
	 * Description: <b>The identify of the provider who placed the nutrition order</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>NutritionOrder.orderer</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="provider", path="NutritionOrder.orderer", description="The identify of the provider who placed the nutrition order", type="reference" , providesMembershipIn={
 @Compartment(name="RelatedPerson") 	}
 )
	public static final String SP_PROVIDER = "provider";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>provider</b>
	 * <p>
	 * Description: <b>The identify of the provider who placed the nutrition order</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>NutritionOrder.orderer</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PROVIDER = new ReferenceClientParam(SP_PROVIDER);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Return nutrition orders with this external identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="NutritionOrder.identifier", description="Return nutrition orders with this external identifier", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>Return nutrition orders with this external identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>Return nutrition orders with this encounter identifier</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>NutritionOrder.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="NutritionOrder.encounter", description="Return nutrition orders with this encounter identifier", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>Return nutrition orders with this encounter identifier</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>NutritionOrder.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);

	/**
	 * Search parameter constant for <b>datetime</b>
	 * <p>
	 * Description: <b>Return nutrition orders requested on this date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>NutritionOrder.dateTime</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="datetime", path="NutritionOrder.dateTime", description="Return nutrition orders requested on this date", type="date"  )
	public static final String SP_DATETIME = "datetime";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>datetime</b>
	 * <p>
	 * Description: <b>Return nutrition orders requested on this date</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>NutritionOrder.dateTime</b><br>
	 * </p>
	 */
	public static final DateClientParam DATETIME = new DateClientParam(SP_DATETIME);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Status of the nutrition order.</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="NutritionOrder.status", description="Status of the nutrition order.", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>Status of the nutrition order.</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>oraldiet</b>
	 * <p>
	 * Description: <b>Type of diet that can be consumed orally (i.e., take via the mouth).</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.oralDiet.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="oraldiet", path="NutritionOrder.oralDiet.type", description="Type of diet that can be consumed orally (i.e., take via the mouth).", type="token"  )
	public static final String SP_ORALDIET = "oraldiet";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>oraldiet</b>
	 * <p>
	 * Description: <b>Type of diet that can be consumed orally (i.e., take via the mouth).</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.oralDiet.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam ORALDIET = new TokenClientParam(SP_ORALDIET);

	/**
	 * Search parameter constant for <b>supplement</b>
	 * <p>
	 * Description: <b>Type of supplement product requested</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.supplement.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="supplement", path="NutritionOrder.supplement.type", description="Type of supplement product requested", type="token"  )
	public static final String SP_SUPPLEMENT = "supplement";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>supplement</b>
	 * <p>
	 * Description: <b>Type of supplement product requested</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.supplement.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam SUPPLEMENT = new TokenClientParam(SP_SUPPLEMENT);

	/**
	 * Search parameter constant for <b>formula</b>
	 * <p>
	 * Description: <b>Type of enteral or infant formula</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.enteralFormula.baseFormulaType</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="formula", path="NutritionOrder.enteralFormula.baseFormulaType", description="Type of enteral or infant formula", type="token"  )
	public static final String SP_FORMULA = "formula";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>formula</b>
	 * <p>
	 * Description: <b>Type of enteral or infant formula</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.enteralFormula.baseFormulaType</b><br>
	 * </p>
	 */
	public static final TokenClientParam FORMULA = new TokenClientParam(SP_FORMULA);

	/**
	 * Search parameter constant for <b>additive</b>
	 * <p>
	 * Description: <b>Type of module component to add to the feeding</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.enteralFormula.additiveType</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="additive", path="NutritionOrder.enteralFormula.additiveType", description="Type of module component to add to the feeding", type="token"  )
	public static final String SP_ADDITIVE = "additive";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>additive</b>
	 * <p>
	 * Description: <b>Type of module component to add to the feeding</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>NutritionOrder.enteralFormula.additiveType</b><br>
	 * </p>
	 */
	public static final TokenClientParam ADDITIVE = new TokenClientParam(SP_ADDITIVE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>NutritionOrder:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("NutritionOrder:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>NutritionOrder:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("NutritionOrder:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>NutritionOrder:provider</b>".
	 */
	public static final Include INCLUDE_PROVIDER = new Include("NutritionOrder:provider");


	@Child(name="patient", order=0, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding."
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="orderer", order=1, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="who.author",
		formalDefinition="The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings."
	)
	private ResourceReferenceDt myOrderer;
	
	@Child(name="identifier", type=IdentifierDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Identifiers assigned to this order by the order sender or by the order receiver"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="encounter", order=3, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="An encounter that provides additional information about the healthcare context in which this request is made"
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="dateTime", type=DateTimeDt.class, order=4, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date and time that this nutrition order was requested."
	)
	private DateTimeDt myDateTime;
	
	@Child(name="status", type=CodeDt.class, order=5, min=0, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The workflow status of the nutrition order/request."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/nutrition-order-status")
	private BoundCodeDt<NutritionOrderStatusEnum> myStatus;
	
	@Child(name="allergyIntolerance", order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.AllergyIntolerance.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A link to a record of allergies or intolerances  which should be included in the nutrition order."
	)
	private java.util.List<ResourceReferenceDt> myAllergyIntolerance;
	
	@Child(name="foodPreferenceModifier", type=CodeableConceptDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings."
	)
	private java.util.List<CodeableConceptDt> myFoodPreferenceModifier;
	
	@Child(name="excludeFoodModifier", type=CodeableConceptDt.class, order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced allergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient’s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings."
	)
	private java.util.List<CodeableConceptDt> myExcludeFoodModifier;
	
	@Child(name="oralDiet", order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Diet given orally in contrast to enteral (tube) feeding."
	)
	private OralDiet myOralDiet;
	
	@Child(name="supplement", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Oral nutritional products given in order to add further nutritional value to the patient's diet."
	)
	private java.util.List<Supplement> mySupplement;
	
	@Child(name="enteralFormula", order=11, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity."
	)
	private EnteralFormula myEnteralFormula;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myPatient,  myOrderer,  myIdentifier,  myEncounter,  myDateTime,  myStatus,  myAllergyIntolerance,  myFoodPreferenceModifier,  myExcludeFoodModifier,  myOralDiet,  mySupplement,  myEnteralFormula);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myPatient, myOrderer, myIdentifier, myEncounter, myDateTime, myStatus, myAllergyIntolerance, myFoodPreferenceModifier, myExcludeFoodModifier, myOralDiet, mySupplement, myEnteralFormula);
	}

	/**
	 * Gets the value(s) for <b>patient</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.
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
     * The person (patient) who needs the nutrition order for an oral diet, nutritional supplement and/or enteral or formula feeding.
     * </p> 
	 */
	public NutritionOrder setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>orderer</b> (who.author).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.
     * </p> 
	 */
	public ResourceReferenceDt getOrderer() {  
		if (myOrderer == null) {
			myOrderer = new ResourceReferenceDt();
		}
		return myOrderer;
	}

	/**
	 * Sets the value(s) for <b>orderer</b> (who.author)
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner that holds legal responsibility for ordering the diet, nutritional supplement, or formula feedings.
     * </p> 
	 */
	public NutritionOrder setOrderer(ResourceReferenceDt theValue) {
		myOrderer = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifiers assigned to this order by the order sender or by the order receiver
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
     * Identifiers assigned to this order by the order sender or by the order receiver
     * </p> 
	 */
	public NutritionOrder setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifiers assigned to this order by the order sender or by the order receiver
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
	 * Identifiers assigned to this order by the order sender or by the order receiver
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public NutritionOrder addIdentifier(IdentifierDt theValue) {
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
     * Identifiers assigned to this order by the order sender or by the order receiver
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An encounter that provides additional information about the healthcare context in which this request is made
     * </p> 
	 */
	public ResourceReferenceDt getEncounter() {  
		if (myEncounter == null) {
			myEncounter = new ResourceReferenceDt();
		}
		return myEncounter;
	}

	/**
	 * Sets the value(s) for <b>encounter</b> (context)
	 *
     * <p>
     * <b>Definition:</b>
     * An encounter that provides additional information about the healthcare context in which this request is made
     * </p> 
	 */
	public NutritionOrder setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dateTime</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time that this nutrition order was requested.
     * </p> 
	 */
	public DateTimeDt getDateTimeElement() {  
		if (myDateTime == null) {
			myDateTime = new DateTimeDt();
		}
		return myDateTime;
	}

	
	/**
	 * Gets the value(s) for <b>dateTime</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time that this nutrition order was requested.
     * </p> 
	 */
	public Date getDateTime() {  
		return getDateTimeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>dateTime</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time that this nutrition order was requested.
     * </p> 
	 */
	public NutritionOrder setDateTime(DateTimeDt theValue) {
		myDateTime = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>dateTime</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time that this nutrition order was requested.
     * </p> 
	 */
	public NutritionOrder setDateTime( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myDateTime = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>dateTime</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time that this nutrition order was requested.
     * </p> 
	 */
	public NutritionOrder setDateTimeWithSecondsPrecision( Date theDate) {
		myDateTime = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The workflow status of the nutrition order/request.
     * </p> 
	 */
	public BoundCodeDt<NutritionOrderStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<NutritionOrderStatusEnum>(NutritionOrderStatusEnum.VALUESET_BINDER);
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
     * The workflow status of the nutrition order/request.
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
     * The workflow status of the nutrition order/request.
     * </p> 
	 */
	public NutritionOrder setStatus(BoundCodeDt<NutritionOrderStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The workflow status of the nutrition order/request.
     * </p> 
	 */
	public NutritionOrder setStatus(NutritionOrderStatusEnum theValue) {
		setStatus(new BoundCodeDt<NutritionOrderStatusEnum>(NutritionOrderStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>allergyIntolerance</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A link to a record of allergies or intolerances  which should be included in the nutrition order.
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getAllergyIntolerance() {  
		if (myAllergyIntolerance == null) {
			myAllergyIntolerance = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myAllergyIntolerance;
	}

	/**
	 * Sets the value(s) for <b>allergyIntolerance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A link to a record of allergies or intolerances  which should be included in the nutrition order.
     * </p> 
	 */
	public NutritionOrder setAllergyIntolerance(java.util.List<ResourceReferenceDt> theValue) {
		myAllergyIntolerance = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>allergyIntolerance</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A link to a record of allergies or intolerances  which should be included in the nutrition order.
     * </p> 
	 */
	public ResourceReferenceDt addAllergyIntolerance() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getAllergyIntolerance().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>foodPreferenceModifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getFoodPreferenceModifier() {  
		if (myFoodPreferenceModifier == null) {
			myFoodPreferenceModifier = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myFoodPreferenceModifier;
	}

	/**
	 * Sets the value(s) for <b>foodPreferenceModifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * </p> 
	 */
	public NutritionOrder setFoodPreferenceModifier(java.util.List<CodeableConceptDt> theValue) {
		myFoodPreferenceModifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>foodPreferenceModifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * </p> 
	 */
	public CodeableConceptDt addFoodPreferenceModifier() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getFoodPreferenceModifier().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>foodPreferenceModifier</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
	 * </p>
	 * @param theValue The foodPreferenceModifier to add (must not be <code>null</code>)
	 */
	public NutritionOrder addFoodPreferenceModifier(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFoodPreferenceModifier().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>foodPreferenceModifier</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * This modifier is used to convey order-specific modifiers about the type of food that should be given. These can be derived from patient allergies, intolerances, or preferences such as Halal, Vegan or Kosher. This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * </p> 
	 */
	public CodeableConceptDt getFoodPreferenceModifierFirstRep() {
		if (getFoodPreferenceModifier().isEmpty()) {
			return addFoodPreferenceModifier();
		}
		return getFoodPreferenceModifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>excludeFoodModifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced allergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient&rsquo;s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getExcludeFoodModifier() {  
		if (myExcludeFoodModifier == null) {
			myExcludeFoodModifier = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myExcludeFoodModifier;
	}

	/**
	 * Sets the value(s) for <b>excludeFoodModifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced allergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient&rsquo;s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * </p> 
	 */
	public NutritionOrder setExcludeFoodModifier(java.util.List<CodeableConceptDt> theValue) {
		myExcludeFoodModifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>excludeFoodModifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced allergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient&rsquo;s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * </p> 
	 */
	public CodeableConceptDt addExcludeFoodModifier() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getExcludeFoodModifier().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>excludeFoodModifier</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced allergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient&rsquo;s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
	 * </p>
	 * @param theValue The excludeFoodModifier to add (must not be <code>null</code>)
	 */
	public NutritionOrder addExcludeFoodModifier(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getExcludeFoodModifier().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>excludeFoodModifier</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * This modifier is used to convey order-specific modifiers about the type of food that should NOT be given. These can be derived from patient allergies, intolerances, or preferences such as No Red Meat, No Soy or No Wheat or  Gluten-Free.  While it should not be necessary to repeat allergy or intolerance information captured in the referenced allergyIntolerance resource in the excludeFoodModifier, this element may be used to convey additional specificity related to foods that should be eliminated from the patient&rsquo;s diet for any reason.  This modifier applies to the entire nutrition order inclusive of the oral diet, nutritional supplements and enteral formula feedings.
     * </p> 
	 */
	public CodeableConceptDt getExcludeFoodModifierFirstRep() {
		if (getExcludeFoodModifier().isEmpty()) {
			return addExcludeFoodModifier();
		}
		return getExcludeFoodModifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>oralDiet</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Diet given orally in contrast to enteral (tube) feeding.
     * </p> 
	 */
	public OralDiet getOralDiet() {  
		if (myOralDiet == null) {
			myOralDiet = new OralDiet();
		}
		return myOralDiet;
	}

	/**
	 * Sets the value(s) for <b>oralDiet</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Diet given orally in contrast to enteral (tube) feeding.
     * </p> 
	 */
	public NutritionOrder setOralDiet(OralDiet theValue) {
		myOralDiet = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>supplement</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Oral nutritional products given in order to add further nutritional value to the patient's diet.
     * </p> 
	 */
	public java.util.List<Supplement> getSupplement() {  
		if (mySupplement == null) {
			mySupplement = new java.util.ArrayList<Supplement>();
		}
		return mySupplement;
	}

	/**
	 * Sets the value(s) for <b>supplement</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Oral nutritional products given in order to add further nutritional value to the patient's diet.
     * </p> 
	 */
	public NutritionOrder setSupplement(java.util.List<Supplement> theValue) {
		mySupplement = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>supplement</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Oral nutritional products given in order to add further nutritional value to the patient's diet.
     * </p> 
	 */
	public Supplement addSupplement() {
		Supplement newType = new Supplement();
		getSupplement().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>supplement</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Oral nutritional products given in order to add further nutritional value to the patient's diet.
	 * </p>
	 * @param theValue The supplement to add (must not be <code>null</code>)
	 */
	public NutritionOrder addSupplement(Supplement theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSupplement().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>supplement</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Oral nutritional products given in order to add further nutritional value to the patient's diet.
     * </p> 
	 */
	public Supplement getSupplementFirstRep() {
		if (getSupplement().isEmpty()) {
			return addSupplement();
		}
		return getSupplement().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>enteralFormula</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
     * </p> 
	 */
	public EnteralFormula getEnteralFormula() {  
		if (myEnteralFormula == null) {
			myEnteralFormula = new EnteralFormula();
		}
		return myEnteralFormula;
	}

	/**
	 * Sets the value(s) for <b>enteralFormula</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
     * </p> 
	 */
	public NutritionOrder setEnteralFormula(EnteralFormula theValue) {
		myEnteralFormula = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>NutritionOrder.oralDiet</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Diet given orally in contrast to enteral (tube) feeding.
     * </p> 
	 */
	@Block()	
	public static class OralDiet 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeableConceptDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet."
	)
	private java.util.List<CodeableConceptDt> myType;
	
	@Child(name="schedule", type=TimingDt.class, order=1, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The time period and frequency at which the diet should be given"
	)
	private java.util.List<TimingDt> mySchedule;
	
	@Child(name="nutrient", order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Class that defines the quantity and type of nutrient modifications required for the oral diet."
	)
	private java.util.List<OralDietNutrient> myNutrient;
	
	@Child(name="texture", order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Class that describes any texture modifications required for the patient to safely consume various types of solid foods."
	)
	private java.util.List<OralDietTexture> myTexture;
	
	@Child(name="fluidConsistencyType", type=CodeableConceptDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient."
	)
	private java.util.List<CodeableConceptDt> myFluidConsistencyType;
	
	@Child(name="instruction", type=StringDt.class, order=5, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Free text or additional instructions or information pertaining to the oral diet."
	)
	private StringDt myInstruction;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  mySchedule,  myNutrient,  myTexture,  myFluidConsistencyType,  myInstruction);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, mySchedule, myNutrient, myTexture, myFluidConsistencyType, myInstruction);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getType() {  
		if (myType == null) {
			myType = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
     * </p> 
	 */
	public OralDiet setType(java.util.List<CodeableConceptDt> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
     * </p> 
	 */
	public CodeableConceptDt addType() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getType().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>type</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
	 * </p>
	 * @param theValue The type to add (must not be <code>null</code>)
	 */
	public OralDiet addType(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getType().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>type</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of diet or dietary restriction such as fiber restricted diet or diabetic diet.
     * </p> 
	 */
	public CodeableConceptDt getTypeFirstRep() {
		if (getType().isEmpty()) {
			return addType();
		}
		return getType().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>schedule</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time period and frequency at which the diet should be given
     * </p> 
	 */
	public java.util.List<TimingDt> getSchedule() {  
		if (mySchedule == null) {
			mySchedule = new java.util.ArrayList<TimingDt>();
		}
		return mySchedule;
	}

	/**
	 * Sets the value(s) for <b>schedule</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time period and frequency at which the diet should be given
     * </p> 
	 */
	public OralDiet setSchedule(java.util.List<TimingDt> theValue) {
		mySchedule = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>schedule</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time period and frequency at which the diet should be given
     * </p> 
	 */
	public TimingDt addSchedule() {
		TimingDt newType = new TimingDt();
		getSchedule().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>schedule</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The time period and frequency at which the diet should be given
	 * </p>
	 * @param theValue The schedule to add (must not be <code>null</code>)
	 */
	public OralDiet addSchedule(TimingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSchedule().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>schedule</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The time period and frequency at which the diet should be given
     * </p> 
	 */
	public TimingDt getScheduleFirstRep() {
		if (getSchedule().isEmpty()) {
			return addSchedule();
		}
		return getSchedule().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>nutrient</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Class that defines the quantity and type of nutrient modifications required for the oral diet.
     * </p> 
	 */
	public java.util.List<OralDietNutrient> getNutrient() {  
		if (myNutrient == null) {
			myNutrient = new java.util.ArrayList<OralDietNutrient>();
		}
		return myNutrient;
	}

	/**
	 * Sets the value(s) for <b>nutrient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Class that defines the quantity and type of nutrient modifications required for the oral diet.
     * </p> 
	 */
	public OralDiet setNutrient(java.util.List<OralDietNutrient> theValue) {
		myNutrient = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>nutrient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Class that defines the quantity and type of nutrient modifications required for the oral diet.
     * </p> 
	 */
	public OralDietNutrient addNutrient() {
		OralDietNutrient newType = new OralDietNutrient();
		getNutrient().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>nutrient</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Class that defines the quantity and type of nutrient modifications required for the oral diet.
	 * </p>
	 * @param theValue The nutrient to add (must not be <code>null</code>)
	 */
	public OralDiet addNutrient(OralDietNutrient theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getNutrient().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>nutrient</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Class that defines the quantity and type of nutrient modifications required for the oral diet.
     * </p> 
	 */
	public OralDietNutrient getNutrientFirstRep() {
		if (getNutrient().isEmpty()) {
			return addNutrient();
		}
		return getNutrient().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>texture</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
     * </p> 
	 */
	public java.util.List<OralDietTexture> getTexture() {  
		if (myTexture == null) {
			myTexture = new java.util.ArrayList<OralDietTexture>();
		}
		return myTexture;
	}

	/**
	 * Sets the value(s) for <b>texture</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
     * </p> 
	 */
	public OralDiet setTexture(java.util.List<OralDietTexture> theValue) {
		myTexture = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>texture</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
     * </p> 
	 */
	public OralDietTexture addTexture() {
		OralDietTexture newType = new OralDietTexture();
		getTexture().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>texture</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
	 * </p>
	 * @param theValue The texture to add (must not be <code>null</code>)
	 */
	public OralDiet addTexture(OralDietTexture theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getTexture().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>texture</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
     * </p> 
	 */
	public OralDietTexture getTextureFirstRep() {
		if (getTexture().isEmpty()) {
			return addTexture();
		}
		return getTexture().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>fluidConsistencyType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getFluidConsistencyType() {  
		if (myFluidConsistencyType == null) {
			myFluidConsistencyType = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myFluidConsistencyType;
	}

	/**
	 * Sets the value(s) for <b>fluidConsistencyType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
     * </p> 
	 */
	public OralDiet setFluidConsistencyType(java.util.List<CodeableConceptDt> theValue) {
		myFluidConsistencyType = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>fluidConsistencyType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
     * </p> 
	 */
	public CodeableConceptDt addFluidConsistencyType() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getFluidConsistencyType().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>fluidConsistencyType</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
	 * </p>
	 * @param theValue The fluidConsistencyType to add (must not be <code>null</code>)
	 */
	public OralDiet addFluidConsistencyType(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getFluidConsistencyType().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>fluidConsistencyType</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The required consistency (e.g. honey-thick, nectar-thick, thin, thickened.) of liquids or fluids served to the patient.
     * </p> 
	 */
	public CodeableConceptDt getFluidConsistencyTypeFirstRep() {
		if (getFluidConsistencyType().isEmpty()) {
			return addFluidConsistencyType();
		}
		return getFluidConsistencyType().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>instruction</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Free text or additional instructions or information pertaining to the oral diet.
     * </p> 
	 */
	public StringDt getInstructionElement() {  
		if (myInstruction == null) {
			myInstruction = new StringDt();
		}
		return myInstruction;
	}

	
	/**
	 * Gets the value(s) for <b>instruction</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Free text or additional instructions or information pertaining to the oral diet.
     * </p> 
	 */
	public String getInstruction() {  
		return getInstructionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>instruction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Free text or additional instructions or information pertaining to the oral diet.
     * </p> 
	 */
	public OralDiet setInstruction(StringDt theValue) {
		myInstruction = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>instruction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Free text or additional instructions or information pertaining to the oral diet.
     * </p> 
	 */
	public OralDiet setInstruction( String theString) {
		myInstruction = new StringDt(theString); 
		return this; 
	}

 


	}

	/**
	 * Block class for child element: <b>NutritionOrder.oralDiet.nutrient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Class that defines the quantity and type of nutrient modifications required for the oral diet.
     * </p> 
	 */
	@Block()	
	public static class OralDietNutrient 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="modifier", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The nutrient that is being modified such as carbohydrate or sodium."
	)
	private CodeableConceptDt myModifier;
	
	@Child(name="amount", type=SimpleQuantityDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The quantity of the specified nutrient to include in diet."
	)
	private SimpleQuantityDt myAmount;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myModifier,  myAmount);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myModifier, myAmount);
	}

	/**
	 * Gets the value(s) for <b>modifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The nutrient that is being modified such as carbohydrate or sodium.
     * </p> 
	 */
	public CodeableConceptDt getModifier() {  
		if (myModifier == null) {
			myModifier = new CodeableConceptDt();
		}
		return myModifier;
	}

	/**
	 * Sets the value(s) for <b>modifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The nutrient that is being modified such as carbohydrate or sodium.
     * </p> 
	 */
	public OralDietNutrient setModifier(CodeableConceptDt theValue) {
		myModifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>amount</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity of the specified nutrient to include in diet.
     * </p> 
	 */
	public SimpleQuantityDt getAmount() {  
		if (myAmount == null) {
			myAmount = new SimpleQuantityDt();
		}
		return myAmount;
	}

	/**
	 * Sets the value(s) for <b>amount</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The quantity of the specified nutrient to include in diet.
     * </p> 
	 */
	public OralDietNutrient setAmount(SimpleQuantityDt theValue) {
		myAmount = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>NutritionOrder.oralDiet.texture</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Class that describes any texture modifications required for the patient to safely consume various types of solid foods.
     * </p> 
	 */
	@Block()	
	public static class OralDietTexture 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="modifier", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed."
	)
	private CodeableConceptDt myModifier;
	
	@Child(name="foodType", type=CodeableConceptDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types."
	)
	private CodeableConceptDt myFoodType;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myModifier,  myFoodType);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myModifier, myFoodType);
	}

	/**
	 * Gets the value(s) for <b>modifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed.
     * </p> 
	 */
	public CodeableConceptDt getModifier() {  
		if (myModifier == null) {
			myModifier = new CodeableConceptDt();
		}
		return myModifier;
	}

	/**
	 * Sets the value(s) for <b>modifier</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Any texture modifications (for solid foods) that should be made, e.g. easy to chew, chopped, ground, and pureed.
     * </p> 
	 */
	public OralDietTexture setModifier(CodeableConceptDt theValue) {
		myModifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>foodType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types.
     * </p> 
	 */
	public CodeableConceptDt getFoodType() {  
		if (myFoodType == null) {
			myFoodType = new CodeableConceptDt();
		}
		return myFoodType;
	}

	/**
	 * Sets the value(s) for <b>foodType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The food type(s) (e.g. meats, all foods)  that the texture modification applies to.  This could be all foods types.
     * </p> 
	 */
	public OralDietTexture setFoodType(CodeableConceptDt theValue) {
		myFoodType = theValue;
		return this;
	}
	
	

  


	}



	/**
	 * Block class for child element: <b>NutritionOrder.supplement</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Oral nutritional products given in order to add further nutritional value to the patient's diet.
     * </p> 
	 */
	@Block()	
	public static class Supplement 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement"
	)
	private CodeableConceptDt myType;
	
	@Child(name="productName", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The product or brand name of the nutritional supplement such as \"Acme Protein Shake\"."
	)
	private StringDt myProductName;
	
	@Child(name="schedule", type=TimingDt.class, order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The time period and frequency at which the supplement(s) should be given"
	)
	private java.util.List<TimingDt> mySchedule;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The amount of the nutritional supplement to be given"
	)
	private SimpleQuantityDt myQuantity;
	
	@Child(name="instruction", type=StringDt.class, order=4, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Free text or additional instructions or information pertaining to the oral supplement."
	)
	private StringDt myInstruction;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myProductName,  mySchedule,  myQuantity,  myInstruction);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myProductName, mySchedule, myQuantity, myInstruction);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement
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
     * The kind of nutritional supplement product required such as a high protein or pediatric clear liquid supplement
     * </p> 
	 */
	public Supplement setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>productName</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the nutritional supplement such as \&quot;Acme Protein Shake\&quot;.
     * </p> 
	 */
	public StringDt getProductNameElement() {  
		if (myProductName == null) {
			myProductName = new StringDt();
		}
		return myProductName;
	}

	
	/**
	 * Gets the value(s) for <b>productName</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the nutritional supplement such as \&quot;Acme Protein Shake\&quot;.
     * </p> 
	 */
	public String getProductName() {  
		return getProductNameElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>productName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the nutritional supplement such as \&quot;Acme Protein Shake\&quot;.
     * </p> 
	 */
	public Supplement setProductName(StringDt theValue) {
		myProductName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>productName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the nutritional supplement such as \&quot;Acme Protein Shake\&quot;.
     * </p> 
	 */
	public Supplement setProductName( String theString) {
		myProductName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>schedule</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time period and frequency at which the supplement(s) should be given
     * </p> 
	 */
	public java.util.List<TimingDt> getSchedule() {  
		if (mySchedule == null) {
			mySchedule = new java.util.ArrayList<TimingDt>();
		}
		return mySchedule;
	}

	/**
	 * Sets the value(s) for <b>schedule</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time period and frequency at which the supplement(s) should be given
     * </p> 
	 */
	public Supplement setSchedule(java.util.List<TimingDt> theValue) {
		mySchedule = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>schedule</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time period and frequency at which the supplement(s) should be given
     * </p> 
	 */
	public TimingDt addSchedule() {
		TimingDt newType = new TimingDt();
		getSchedule().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>schedule</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The time period and frequency at which the supplement(s) should be given
	 * </p>
	 * @param theValue The schedule to add (must not be <code>null</code>)
	 */
	public Supplement addSchedule(TimingDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getSchedule().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>schedule</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The time period and frequency at which the supplement(s) should be given
     * </p> 
	 */
	public TimingDt getScheduleFirstRep() {
		if (getSchedule().isEmpty()) {
			return addSchedule();
		}
		return getSchedule().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of the nutritional supplement to be given
     * </p> 
	 */
	public SimpleQuantityDt getQuantity() {  
		if (myQuantity == null) {
			myQuantity = new SimpleQuantityDt();
		}
		return myQuantity;
	}

	/**
	 * Sets the value(s) for <b>quantity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of the nutritional supplement to be given
     * </p> 
	 */
	public Supplement setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>instruction</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Free text or additional instructions or information pertaining to the oral supplement.
     * </p> 
	 */
	public StringDt getInstructionElement() {  
		if (myInstruction == null) {
			myInstruction = new StringDt();
		}
		return myInstruction;
	}

	
	/**
	 * Gets the value(s) for <b>instruction</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Free text or additional instructions or information pertaining to the oral supplement.
     * </p> 
	 */
	public String getInstruction() {  
		return getInstructionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>instruction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Free text or additional instructions or information pertaining to the oral supplement.
     * </p> 
	 */
	public Supplement setInstruction(StringDt theValue) {
		myInstruction = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>instruction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Free text or additional instructions or information pertaining to the oral supplement.
     * </p> 
	 */
	public Supplement setInstruction( String theString) {
		myInstruction = new StringDt(theString); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>NutritionOrder.enteralFormula</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Feeding provided through the gastrointestinal tract via a tube, catheter, or stoma that delivers nutrition distal to the oral cavity.
     * </p> 
	 */
	@Block()	
	public static class EnteralFormula 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="baseFormulaType", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula."
	)
	private CodeableConceptDt myBaseFormulaType;
	
	@Child(name="baseFormulaProductName", type=StringDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The product or brand name of the enteral or infant formula product such as \"ACME Adult Standard Formula\"."
	)
	private StringDt myBaseFormulaProductName;
	
	@Child(name="additiveType", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula."
	)
	private CodeableConceptDt myAdditiveType;
	
	@Child(name="additiveProductName", type=StringDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The product or brand name of the type of modular component to be added to the formula."
	)
	private StringDt myAdditiveProductName;
	
	@Child(name="caloricDensity", type=SimpleQuantityDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The amount of energy (Calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 Calories per fluid ounce or an adult may require an enteral formula that provides 1.5 Calorie/mL."
	)
	private SimpleQuantityDt myCaloricDensity;
	
	@Child(name="routeofAdministration", type=CodeableConceptDt.class, order=5, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-enteral-route")
	private CodeableConceptDt myRouteofAdministration;
	
	@Child(name="administration", order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours."
	)
	private java.util.List<EnteralFormulaAdministration> myAdministration;
	
	@Child(name="maxVolumeToDeliver", type=SimpleQuantityDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours."
	)
	private SimpleQuantityDt myMaxVolumeToDeliver;
	
	@Child(name="administrationInstruction", type=StringDt.class, order=8, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Free text formula administration, feeding instructions or additional instructions or information."
	)
	private StringDt myAdministrationInstruction;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myBaseFormulaType,  myBaseFormulaProductName,  myAdditiveType,  myAdditiveProductName,  myCaloricDensity,  myRouteofAdministration,  myAdministration,  myMaxVolumeToDeliver,  myAdministrationInstruction);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myBaseFormulaType, myBaseFormulaProductName, myAdditiveType, myAdditiveProductName, myCaloricDensity, myRouteofAdministration, myAdministration, myMaxVolumeToDeliver, myAdministrationInstruction);
	}

	/**
	 * Gets the value(s) for <b>baseFormulaType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.
     * </p> 
	 */
	public CodeableConceptDt getBaseFormulaType() {  
		if (myBaseFormulaType == null) {
			myBaseFormulaType = new CodeableConceptDt();
		}
		return myBaseFormulaType;
	}

	/**
	 * Sets the value(s) for <b>baseFormulaType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The type of enteral or infant formula such as an adult standard formula with fiber or a soy-based infant formula.
     * </p> 
	 */
	public EnteralFormula setBaseFormulaType(CodeableConceptDt theValue) {
		myBaseFormulaType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>baseFormulaProductName</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the enteral or infant formula product such as \&quot;ACME Adult Standard Formula\&quot;.
     * </p> 
	 */
	public StringDt getBaseFormulaProductNameElement() {  
		if (myBaseFormulaProductName == null) {
			myBaseFormulaProductName = new StringDt();
		}
		return myBaseFormulaProductName;
	}

	
	/**
	 * Gets the value(s) for <b>baseFormulaProductName</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the enteral or infant formula product such as \&quot;ACME Adult Standard Formula\&quot;.
     * </p> 
	 */
	public String getBaseFormulaProductName() {  
		return getBaseFormulaProductNameElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>baseFormulaProductName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the enteral or infant formula product such as \&quot;ACME Adult Standard Formula\&quot;.
     * </p> 
	 */
	public EnteralFormula setBaseFormulaProductName(StringDt theValue) {
		myBaseFormulaProductName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>baseFormulaProductName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the enteral or infant formula product such as \&quot;ACME Adult Standard Formula\&quot;.
     * </p> 
	 */
	public EnteralFormula setBaseFormulaProductName( String theString) {
		myBaseFormulaProductName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>additiveType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.
     * </p> 
	 */
	public CodeableConceptDt getAdditiveType() {  
		if (myAdditiveType == null) {
			myAdditiveType = new CodeableConceptDt();
		}
		return myAdditiveType;
	}

	/**
	 * Sets the value(s) for <b>additiveType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the type of modular component such as protein, carbohydrate, fat or fiber to be provided in addition to or mixed with the base formula.
     * </p> 
	 */
	public EnteralFormula setAdditiveType(CodeableConceptDt theValue) {
		myAdditiveType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>additiveProductName</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the type of modular component to be added to the formula.
     * </p> 
	 */
	public StringDt getAdditiveProductNameElement() {  
		if (myAdditiveProductName == null) {
			myAdditiveProductName = new StringDt();
		}
		return myAdditiveProductName;
	}

	
	/**
	 * Gets the value(s) for <b>additiveProductName</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the type of modular component to be added to the formula.
     * </p> 
	 */
	public String getAdditiveProductName() {  
		return getAdditiveProductNameElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>additiveProductName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the type of modular component to be added to the formula.
     * </p> 
	 */
	public EnteralFormula setAdditiveProductName(StringDt theValue) {
		myAdditiveProductName = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>additiveProductName</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The product or brand name of the type of modular component to be added to the formula.
     * </p> 
	 */
	public EnteralFormula setAdditiveProductName( String theString) {
		myAdditiveProductName = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>caloricDensity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of energy (Calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 Calories per fluid ounce or an adult may require an enteral formula that provides 1.5 Calorie/mL.
     * </p> 
	 */
	public SimpleQuantityDt getCaloricDensity() {  
		if (myCaloricDensity == null) {
			myCaloricDensity = new SimpleQuantityDt();
		}
		return myCaloricDensity;
	}

	/**
	 * Sets the value(s) for <b>caloricDensity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The amount of energy (Calories) that the formula should provide per specified volume, typically per mL or fluid oz.  For example, an infant may require a formula that provides 24 Calories per fluid ounce or an adult may require an enteral formula that provides 1.5 Calorie/mL.
     * </p> 
	 */
	public EnteralFormula setCaloricDensity(SimpleQuantityDt theValue) {
		myCaloricDensity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>routeofAdministration</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.
     * </p> 
	 */
	public CodeableConceptDt getRouteofAdministration() {  
		if (myRouteofAdministration == null) {
			myRouteofAdministration = new CodeableConceptDt();
		}
		return myRouteofAdministration;
	}

	/**
	 * Sets the value(s) for <b>routeofAdministration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The route or physiological path of administration into the patient's gastrointestinal  tract for purposes of providing the formula feeding, e.g. nasogastric tube.
     * </p> 
	 */
	public EnteralFormula setRouteofAdministration(CodeableConceptDt theValue) {
		myRouteofAdministration = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>administration</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
     * </p> 
	 */
	public java.util.List<EnteralFormulaAdministration> getAdministration() {  
		if (myAdministration == null) {
			myAdministration = new java.util.ArrayList<EnteralFormulaAdministration>();
		}
		return myAdministration;
	}

	/**
	 * Sets the value(s) for <b>administration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
     * </p> 
	 */
	public EnteralFormula setAdministration(java.util.List<EnteralFormulaAdministration> theValue) {
		myAdministration = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>administration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
     * </p> 
	 */
	public EnteralFormulaAdministration addAdministration() {
		EnteralFormulaAdministration newType = new EnteralFormulaAdministration();
		getAdministration().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>administration</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
	 * </p>
	 * @param theValue The administration to add (must not be <code>null</code>)
	 */
	public EnteralFormula addAdministration(EnteralFormulaAdministration theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getAdministration().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>administration</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
     * </p> 
	 */
	public EnteralFormulaAdministration getAdministrationFirstRep() {
		if (getAdministration().isEmpty()) {
			return addAdministration();
		}
		return getAdministration().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>maxVolumeToDeliver</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.
     * </p> 
	 */
	public SimpleQuantityDt getMaxVolumeToDeliver() {  
		if (myMaxVolumeToDeliver == null) {
			myMaxVolumeToDeliver = new SimpleQuantityDt();
		}
		return myMaxVolumeToDeliver;
	}

	/**
	 * Sets the value(s) for <b>maxVolumeToDeliver</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The maximum total quantity of formula that may be administered to a subject over the period of time, e.g. 1440 mL over 24 hours.
     * </p> 
	 */
	public EnteralFormula setMaxVolumeToDeliver(SimpleQuantityDt theValue) {
		myMaxVolumeToDeliver = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>administrationInstruction</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Free text formula administration, feeding instructions or additional instructions or information.
     * </p> 
	 */
	public StringDt getAdministrationInstructionElement() {  
		if (myAdministrationInstruction == null) {
			myAdministrationInstruction = new StringDt();
		}
		return myAdministrationInstruction;
	}

	
	/**
	 * Gets the value(s) for <b>administrationInstruction</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Free text formula administration, feeding instructions or additional instructions or information.
     * </p> 
	 */
	public String getAdministrationInstruction() {  
		return getAdministrationInstructionElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>administrationInstruction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Free text formula administration, feeding instructions or additional instructions or information.
     * </p> 
	 */
	public EnteralFormula setAdministrationInstruction(StringDt theValue) {
		myAdministrationInstruction = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>administrationInstruction</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Free text formula administration, feeding instructions or additional instructions or information.
     * </p> 
	 */
	public EnteralFormula setAdministrationInstruction( String theString) {
		myAdministrationInstruction = new StringDt(theString); 
		return this; 
	}

 


	}

	/**
	 * Block class for child element: <b>NutritionOrder.enteralFormula.administration</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Formula administration instructions as structured data.  This repeating structure allows for changing the administration rate or volume over time for both bolus and continuous feeding.  An example of this would be an instruction to increase the rate of continuous feeding every 2 hours.
     * </p> 
	 */
	@Block()	
	public static class EnteralFormulaAdministration 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="schedule", type=TimingDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The time period and frequency at which the enteral formula should be delivered to the patient"
	)
	private TimingDt mySchedule;
	
	@Child(name="quantity", type=SimpleQuantityDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The volume of formula to provide to the patient per the specified administration schedule."
	)
	private SimpleQuantityDt myQuantity;
	
	@Child(name="rate", order=2, min=0, max=1, summary=false, modifier=false, type={
		SimpleQuantityDt.class, 		RatioDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule."
	)
	private IDatatype myRate;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySchedule,  myQuantity,  myRate);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySchedule, myQuantity, myRate);
	}

	/**
	 * Gets the value(s) for <b>schedule</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time period and frequency at which the enteral formula should be delivered to the patient
     * </p> 
	 */
	public TimingDt getSchedule() {  
		if (mySchedule == null) {
			mySchedule = new TimingDt();
		}
		return mySchedule;
	}

	/**
	 * Sets the value(s) for <b>schedule</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The time period and frequency at which the enteral formula should be delivered to the patient
     * </p> 
	 */
	public EnteralFormulaAdministration setSchedule(TimingDt theValue) {
		mySchedule = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>quantity</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The volume of formula to provide to the patient per the specified administration schedule.
     * </p> 
	 */
	public SimpleQuantityDt getQuantity() {  
		if (myQuantity == null) {
			myQuantity = new SimpleQuantityDt();
		}
		return myQuantity;
	}

	/**
	 * Sets the value(s) for <b>quantity</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The volume of formula to provide to the patient per the specified administration schedule.
     * </p> 
	 */
	public EnteralFormulaAdministration setQuantity(SimpleQuantityDt theValue) {
		myQuantity = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>rate[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.
     * </p> 
	 */
	public IDatatype getRate() {  
		return myRate;
	}

	/**
	 * Sets the value(s) for <b>rate[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The rate of administration of formula via a feeding pump, e.g. 60 mL per hour, according to the specified schedule.
     * </p> 
	 */
	public EnteralFormulaAdministration setRate(IDatatype theValue) {
		myRate = theValue;
		return this;
	}
	
	

  


	}





    @Override
    public String getResourceName() {
        return "NutritionOrder";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
