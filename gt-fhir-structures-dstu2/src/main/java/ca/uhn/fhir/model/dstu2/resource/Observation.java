















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
 * HAPI/FHIR <b>Observation</b> Resource
 * (clinical.diagnostics)
 *
 * <p>
 * <b>Definition:</b>
 * Measurements and simple assertions made about a patient, device or other subject.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Observations are a key aspect of healthcare.  This resource is used to capture those that do not require more sophisticated mechanisms.
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/Observation">http://hl7.org/fhir/profiles/Observation</a> 
 * </p>
 *
 */
@ResourceDef(name="Observation", profile="http://hl7.org/fhir/profiles/Observation", id="observation")
public class Observation extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>The code of the observation type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code", path="Observation.code", description="The code of the observation type", type="token"  )
	public static final String SP_CODE = "code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code</b>
	 * <p>
	 * Description: <b>The code of the observation type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam CODE = new TokenClientParam(SP_CODE);

	/**
	 * Search parameter constant for <b>component-code</b>
	 * <p>
	 * Description: <b>The component code of the observation type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.component.code</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="component-code", path="Observation.component.code", description="The component code of the observation type", type="token"  )
	public static final String SP_COMPONENT_CODE = "component-code";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>component-code</b>
	 * <p>
	 * Description: <b>The component code of the observation type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.component.code</b><br>
	 * </p>
	 */
	public static final TokenClientParam COMPONENT_CODE = new TokenClientParam(SP_COMPONENT_CODE);

	/**
	 * Search parameter constant for <b>value-quantity</b>
	 * <p>
	 * Description: <b>The value of the observation, if the value is a Quantity, or a SampledData (just search on the bounds of the values in sampled data)</b><br>
	 * Type: <b>quantity</b><br>
	 * Path: <b>Observation.valueQuantity</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="value-quantity", path="Observation.valueQuantity", description="The value of the observation, if the value is a Quantity, or a SampledData (just search on the bounds of the values in sampled data)", type="quantity"  )
	public static final String SP_VALUE_QUANTITY = "value-quantity";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>value-quantity</b>
	 * <p>
	 * Description: <b>The value of the observation, if the value is a Quantity, or a SampledData (just search on the bounds of the values in sampled data)</b><br>
	 * Type: <b>quantity</b><br>
	 * Path: <b>Observation.valueQuantity</b><br>
	 * </p>
	 */
	public static final QuantityClientParam VALUE_QUANTITY = new QuantityClientParam(SP_VALUE_QUANTITY);

	/**
	 * Search parameter constant for <b>component-value-quantity</b>
	 * <p>
	 * Description: <b>The value of the component observation, if the value is a Quantity, or a SampledData (just search on the bounds of the values in sampled data)</b><br>
	 * Type: <b>quantity</b><br>
	 * Path: <b>Observation.component.valueQuantity</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="component-value-quantity", path="Observation.component.valueQuantity", description="The value of the component observation, if the value is a Quantity, or a SampledData (just search on the bounds of the values in sampled data)", type="quantity"  )
	public static final String SP_COMPONENT_VALUE_QUANTITY = "component-value-quantity";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>component-value-quantity</b>
	 * <p>
	 * Description: <b>The value of the component observation, if the value is a Quantity, or a SampledData (just search on the bounds of the values in sampled data)</b><br>
	 * Type: <b>quantity</b><br>
	 * Path: <b>Observation.component.valueQuantity</b><br>
	 * </p>
	 */
	public static final QuantityClientParam COMPONENT_VALUE_QUANTITY = new QuantityClientParam(SP_COMPONENT_VALUE_QUANTITY);

	/**
	 * Search parameter constant for <b>value-concept</b>
	 * <p>
	 * Description: <b>The value of the observation, if the value is a CodeableConcept</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.valueCodeableConcept</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="value-concept", path="Observation.valueCodeableConcept", description="The value of the observation, if the value is a CodeableConcept", type="token"  )
	public static final String SP_VALUE_CONCEPT = "value-concept";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>value-concept</b>
	 * <p>
	 * Description: <b>The value of the observation, if the value is a CodeableConcept</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.valueCodeableConcept</b><br>
	 * </p>
	 */
	public static final TokenClientParam VALUE_CONCEPT = new TokenClientParam(SP_VALUE_CONCEPT);

	/**
	 * Search parameter constant for <b>component-value-concept</b>
	 * <p>
	 * Description: <b>The value of the component observation, if the value is a CodeableConcept</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.component.valueCodeableConcept</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="component-value-concept", path="Observation.component.valueCodeableConcept", description="The value of the component observation, if the value is a CodeableConcept", type="token"  )
	public static final String SP_COMPONENT_VALUE_CONCEPT = "component-value-concept";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>component-value-concept</b>
	 * <p>
	 * Description: <b>The value of the component observation, if the value is a CodeableConcept</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.component.valueCodeableConcept</b><br>
	 * </p>
	 */
	public static final TokenClientParam COMPONENT_VALUE_CONCEPT = new TokenClientParam(SP_COMPONENT_VALUE_CONCEPT);

	/**
	 * Search parameter constant for <b>value-date</b>
	 * <p>
	 * Description: <b>The value of the observation, if the value is a date or period of time</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Observation.valueDateTime | Observation.valuePeriod</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="value-date", path="Observation.valueDateTime | Observation.valuePeriod", description="The value of the observation, if the value is a date or period of time", type="date"  )
	public static final String SP_VALUE_DATE = "value-date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>value-date</b>
	 * <p>
	 * Description: <b>The value of the observation, if the value is a date or period of time</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Observation.valueDateTime | Observation.valuePeriod</b><br>
	 * </p>
	 */
	public static final DateClientParam VALUE_DATE = new DateClientParam(SP_VALUE_DATE);

	/**
	 * Search parameter constant for <b>value-string</b>
	 * <p>
	 * Description: <b>The value of the observation, if the value is a string, and also searches in CodeableConcept.text</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Observation.valueString</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="value-string", path="Observation.valueString", description="The value of the observation, if the value is a string, and also searches in CodeableConcept.text", type="string"  )
	public static final String SP_VALUE_STRING = "value-string";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>value-string</b>
	 * <p>
	 * Description: <b>The value of the observation, if the value is a string, and also searches in CodeableConcept.text</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Observation.valueString</b><br>
	 * </p>
	 */
	public static final StringClientParam VALUE_STRING = new StringClientParam(SP_VALUE_STRING);

	/**
	 * Search parameter constant for <b>component-value-string</b>
	 * <p>
	 * Description: <b>The value of the component observation, if the value is a string, and also searches in CodeableConcept.text</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Observation.component.valueString</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="component-value-string", path="Observation.component.valueString", description="The value of the component observation, if the value is a string, and also searches in CodeableConcept.text", type="string"  )
	public static final String SP_COMPONENT_VALUE_STRING = "component-value-string";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>component-value-string</b>
	 * <p>
	 * Description: <b>The value of the component observation, if the value is a string, and also searches in CodeableConcept.text</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>Observation.component.valueString</b><br>
	 * </p>
	 */
	public static final StringClientParam COMPONENT_VALUE_STRING = new StringClientParam(SP_COMPONENT_VALUE_STRING);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>Obtained date/time. If the obtained element is a period, a date that falls in the period</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Observation.effective[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="Observation.effective[x]", description="Obtained date/time. If the obtained element is a period, a date that falls in the period", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>Obtained date/time. If the obtained element is a period, a date that falls in the period</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>Observation.effective[x]</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the observation</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="Observation.status", description="The status of the observation", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The status of the observation</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>The subject that the observation is about</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="Observation.subject", description="The subject that the observation is about", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="Device") 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>The subject that the observation is about</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b>Who performed the observation</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.performer</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="performer", path="Observation.performer", description="Who performed the observation", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") ,  @Compartment(name="RelatedPerson") ,  @Compartment(name="Practitioner") 	}
 )
	public static final String SP_PERFORMER = "performer";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>performer</b>
	 * <p>
	 * Description: <b>Who performed the observation</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.performer</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PERFORMER = new ReferenceClientParam(SP_PERFORMER);

	/**
	 * Search parameter constant for <b>specimen</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.specimen</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="specimen", path="Observation.specimen", description="", type="reference"  )
	public static final String SP_SPECIMEN = "specimen";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>specimen</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.specimen</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SPECIMEN = new ReferenceClientParam(SP_SPECIMEN);

	/**
	 * Search parameter constant for <b>related-type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.related.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="related-type", path="Observation.related.type", description="", type="token"  )
	public static final String SP_RELATED_TYPE = "related-type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>related-type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.related.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam RELATED_TYPE = new TokenClientParam(SP_RELATED_TYPE);

	/**
	 * Search parameter constant for <b>related-target</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.related.target</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="related-target", path="Observation.related.target", description="", type="reference"  )
	public static final String SP_RELATED_TARGET = "related-target";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>related-target</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.related.target</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam RELATED_TARGET = new ReferenceClientParam(SP_RELATED_TARGET);

	/**
	 * Search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>Healthcare event related to the observation</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.encounter</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="encounter", path="Observation.encounter", description="Healthcare event related to the observation", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_ENCOUNTER = "encounter";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>encounter</b>
	 * <p>
	 * Description: <b>Healthcare event related to the observation</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.encounter</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ENCOUNTER = new ReferenceClientParam(SP_ENCOUNTER);

	/**
	 * Search parameter constant for <b>data-absent-reason</b>
	 * <p>
	 * Description: <b>The reason why the expected value in the element Observation.value[x] is missing.</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.dataAbsentReason</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="data-absent-reason", path="Observation.dataAbsentReason", description="The reason why the expected value in the element Observation.value[x] is missing.", type="token"  )
	public static final String SP_DATA_ABSENT_REASON = "data-absent-reason";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>data-absent-reason</b>
	 * <p>
	 * Description: <b>The reason why the expected value in the element Observation.value[x] is missing.</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.dataAbsentReason</b><br>
	 * </p>
	 */
	public static final TokenClientParam DATA_ABSENT_REASON = new TokenClientParam(SP_DATA_ABSENT_REASON);

	/**
	 * Search parameter constant for <b>component-data-absent-reason</b>
	 * <p>
	 * Description: <b>The reason why the expected value in the element Observation.component.value[x] is missing.</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.component.dataAbsentReason</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="component-data-absent-reason", path="Observation.component.dataAbsentReason", description="The reason why the expected value in the element Observation.component.value[x] is missing.", type="token"  )
	public static final String SP_COMPONENT_DATA_ABSENT_REASON = "component-data-absent-reason";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>component-data-absent-reason</b>
	 * <p>
	 * Description: <b>The reason why the expected value in the element Observation.component.value[x] is missing.</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.component.dataAbsentReason</b><br>
	 * </p>
	 */
	public static final TokenClientParam COMPONENT_DATA_ABSENT_REASON = new TokenClientParam(SP_COMPONENT_DATA_ABSENT_REASON);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The subject that the observation is about (if patient)</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="Observation.subject", description="The subject that the observation is about (if patient)", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Patient.class 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The subject that the observation is about (if patient)</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The unique id for a particular observation</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="Observation.identifier", description="The unique id for a particular observation", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>The unique id for a particular observation</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>device</b>
	 * <p>
	 * Description: <b>The Device that generated the observation data.</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.device</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="device", path="Observation.device", description="The Device that generated the observation data.", type="reference" , providesMembershipIn={
 @Compartment(name="Device") 	}
 )
	public static final String SP_DEVICE = "device";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>device</b>
	 * <p>
	 * Description: <b>The Device that generated the observation data.</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>Observation.device</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam DEVICE = new ReferenceClientParam(SP_DEVICE);

	/**
	 * Search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b>The classification of the type of observation</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.category</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="category", path="Observation.category", description="The classification of the type of observation", type="token"  )
	public static final String SP_CATEGORY = "category";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>category</b>
	 * <p>
	 * Description: <b>The classification of the type of observation</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>Observation.category</b><br>
	 * </p>
	 */
	public static final TokenClientParam CATEGORY = new TokenClientParam(SP_CATEGORY);

	/**
	 * Search parameter constant for <b>code-value-quantity</b>
	 * <p>
	 * Description: <b>Both code and one of the value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>code &amp; value[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code-value-quantity", path="code & value[x]", description="Both code and one of the value parameters", type="composite"  , compositeOf={  "code",  "value-quantity" }  )
	public static final String SP_CODE_VALUE_QUANTITY = "code-value-quantity";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code-value-quantity</b>
	 * <p>
	 * Description: <b>Both code and one of the value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>code &amp; value[x]</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<TokenClientParam, QuantityClientParam> CODE_VALUE_QUANTITY = new CompositeClientParam<TokenClientParam, QuantityClientParam>(SP_CODE_VALUE_QUANTITY);

	/**
	 * Search parameter constant for <b>code-value-concept</b>
	 * <p>
	 * Description: <b>Both code and one of the value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>code &amp; value[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code-value-concept", path="code & value[x]", description="Both code and one of the value parameters", type="composite"  , compositeOf={  "code",  "value-concept" }  )
	public static final String SP_CODE_VALUE_CONCEPT = "code-value-concept";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code-value-concept</b>
	 * <p>
	 * Description: <b>Both code and one of the value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>code &amp; value[x]</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<TokenClientParam, TokenClientParam> CODE_VALUE_CONCEPT = new CompositeClientParam<TokenClientParam, TokenClientParam>(SP_CODE_VALUE_CONCEPT);

	/**
	 * Search parameter constant for <b>code-value-date</b>
	 * <p>
	 * Description: <b>Both code and one of the value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>code &amp; value[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code-value-date", path="code & value[x]", description="Both code and one of the value parameters", type="composite"  , compositeOf={  "code",  "value-date" }  )
	public static final String SP_CODE_VALUE_DATE = "code-value-date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code-value-date</b>
	 * <p>
	 * Description: <b>Both code and one of the value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>code &amp; value[x]</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<TokenClientParam, DateClientParam> CODE_VALUE_DATE = new CompositeClientParam<TokenClientParam, DateClientParam>(SP_CODE_VALUE_DATE);

	/**
	 * Search parameter constant for <b>code-value-string</b>
	 * <p>
	 * Description: <b>Both code and one of the value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>code &amp; value[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="code-value-string", path="code & value[x]", description="Both code and one of the value parameters", type="composite"  , compositeOf={  "code",  "value-string" }  )
	public static final String SP_CODE_VALUE_STRING = "code-value-string";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>code-value-string</b>
	 * <p>
	 * Description: <b>Both code and one of the value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>code &amp; value[x]</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<TokenClientParam, StringClientParam> CODE_VALUE_STRING = new CompositeClientParam<TokenClientParam, StringClientParam>(SP_CODE_VALUE_STRING);

	/**
	 * Search parameter constant for <b>component-code-component-value-quantity</b>
	 * <p>
	 * Description: <b>Both component code and one of the component value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>component-code &amp; component-value[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="component-code-component-value-quantity", path="component-code & component-value[x]", description="Both component code and one of the component value parameters", type="composite"  , compositeOf={  "component-code",  "component-value-quantity" }  )
	public static final String SP_COMPONENT_CODE_COMPONENT_VALUE_QUANTITY = "component-code-component-value-quantity";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>component-code-component-value-quantity</b>
	 * <p>
	 * Description: <b>Both component code and one of the component value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>component-code &amp; component-value[x]</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<TokenClientParam, QuantityClientParam> COMPONENT_CODE_COMPONENT_VALUE_QUANTITY = new CompositeClientParam<TokenClientParam, QuantityClientParam>(SP_COMPONENT_CODE_COMPONENT_VALUE_QUANTITY);

	/**
	 * Search parameter constant for <b>component-code-component-value-concept</b>
	 * <p>
	 * Description: <b>Both component code and one of the component value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>component-code &amp; component-value[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="component-code-component-value-concept", path="component-code & component-value[x]", description="Both component code and one of the component value parameters", type="composite"  , compositeOf={  "component-code",  "component-value-concept" }  )
	public static final String SP_COMPONENT_CODE_COMPONENT_VALUE_CONCEPT = "component-code-component-value-concept";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>component-code-component-value-concept</b>
	 * <p>
	 * Description: <b>Both component code and one of the component value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>component-code &amp; component-value[x]</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<TokenClientParam, TokenClientParam> COMPONENT_CODE_COMPONENT_VALUE_CONCEPT = new CompositeClientParam<TokenClientParam, TokenClientParam>(SP_COMPONENT_CODE_COMPONENT_VALUE_CONCEPT);

	/**
	 * Search parameter constant for <b>component-code-component-value-string</b>
	 * <p>
	 * Description: <b>Both component code and one of the component value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>component-code &amp; component-value[x]</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="component-code-component-value-string", path="component-code & component-value[x]", description="Both component code and one of the component value parameters", type="composite"  , compositeOf={  "component-code",  "component-value-string" }  )
	public static final String SP_COMPONENT_CODE_COMPONENT_VALUE_STRING = "component-code-component-value-string";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>component-code-component-value-string</b>
	 * <p>
	 * Description: <b>Both component code and one of the component value parameters</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>component-code &amp; component-value[x]</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<TokenClientParam, StringClientParam> COMPONENT_CODE_COMPONENT_VALUE_STRING = new CompositeClientParam<TokenClientParam, StringClientParam>(SP_COMPONENT_CODE_COMPONENT_VALUE_STRING);

	/**
	 * Search parameter constant for <b>related-target-related-type</b>
	 * <p>
	 * Description: <b>Related Observations - search on related-type and related-target together</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>related-target &amp; related-type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="related-target-related-type", path="related-target & related-type", description="Related Observations - search on related-type and related-target together", type="composite"  , compositeOf={  "related-target",  "related-type" }  )
	public static final String SP_RELATED_TARGET_RELATED_TYPE = "related-target-related-type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>related-target-related-type</b>
	 * <p>
	 * Description: <b>Related Observations - search on related-type and related-target together</b><br>
	 * Type: <b>composite</b><br>
	 * Path: <b>related-target &amp; related-type</b><br>
	 * </p>
	 */
	public static final CompositeClientParam<ReferenceClientParam, TokenClientParam> RELATED_TARGET_RELATED_TYPE = new CompositeClientParam<ReferenceClientParam, TokenClientParam>(SP_RELATED_TARGET_RELATED_TYPE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Observation:device</b>".
	 */
	public static final Include INCLUDE_DEVICE = new Include("Observation:device");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Observation:encounter</b>".
	 */
	public static final Include INCLUDE_ENCOUNTER = new Include("Observation:encounter");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Observation:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("Observation:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Observation:performer</b>".
	 */
	public static final Include INCLUDE_PERFORMER = new Include("Observation:performer");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Observation:related-target</b>".
	 */
	public static final Include INCLUDE_RELATED_TARGET = new Include("Observation:related-target");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Observation:specimen</b>".
	 */
	public static final Include INCLUDE_SPECIMEN = new Include("Observation:specimen");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>Observation:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("Observation:subject");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="A unique identifier for the simple observation instance."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="status", type=CodeDt.class, order=1, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The status of the result value"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-status")
	private BoundCodeDt<ObservationStatusEnum> myStatus;
	
	@Child(name="category", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="A code that classifies the general type of observation being made.  This is used  for searching, sorting and display purposes."
	)
	private CodeableConceptDt myCategory;
	
	@Child(name="code", type=CodeableConceptDt.class, order=3, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="what",
		formalDefinition="Describes what was observed. Sometimes this is called the observation \"name\""
	)
	private CodeableConceptDt myCode;
	
	@Child(name="subject", order=4, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.Group.class, 		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.Location.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject."
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="encounter", order=5, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made"
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="effective", order=6, min=0, max=1, summary=true, modifier=false, type={
		DateTimeDt.class, 		PeriodDt.class	})
	@Description(
		shortDefinition="when.done",
		formalDefinition="The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \"physiologically relevant time\". This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself"
	)
	private IDatatype myEffective;
	
	@Child(name="issued", type=InstantDt.class, order=7, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The date and time this observation was made available to providers, typically after the results have been reviewed and verified."
	)
	private InstantDt myIssued;
	
	@Child(name="performer", order=8, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class, 		ca.uhn.fhir.model.dstu2.resource.Patient.class, 		ca.uhn.fhir.model.dstu2.resource.RelatedPerson.class	})
	@Description(
		shortDefinition="who.actor",
		formalDefinition="Who was responsible for asserting the observed value as \"true\""
	)
	private java.util.List<ResourceReferenceDt> myPerformer;
	
	@Child(name="value", order=9, min=0, max=1, summary=true, modifier=false, type={
		QuantityDt.class, 		CodeableConceptDt.class, 		StringDt.class, 		RangeDt.class, 		RatioDt.class, 		SampledDataDt.class, 		AttachmentDt.class, 		TimeDt.class, 		DateTimeDt.class, 		PeriodDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The information determined as a result of making the observation, if the information has a simple value"
	)
	private IDatatype myValue;
	
	@Child(name="dataAbsentReason", type=CodeableConceptDt.class, order=10, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Provides a reason why the expected value in the element Observation.value[x] is missing."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-observation-valueabsentreason")
	private CodeableConceptDt myDataAbsentReason;
	
	@Child(name="interpretation", type=CodeableConceptDt.class, order=11, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-observation-interpretation")
	private CodeableConceptDt myInterpretation;
	
	@Child(name="comments", type=StringDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result."
	)
	private StringDt myComments;
	
	@Child(name="bodySite", type=CodeableConceptDt.class, order=13, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the site on the subject's body where the observation was made (i.e. the target site)."
	)
	private CodeableConceptDt myBodySite;
	
	@Child(name="method", type=CodeableConceptDt.class, order=14, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the mechanism used to perform the observation"
	)
	private CodeableConceptDt myMethod;
	
	@Child(name="specimen", order=15, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Specimen.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The specimen that was used when this observation was made"
	)
	private ResourceReferenceDt mySpecimen;
	
	@Child(name="device", order=16, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Device.class, 		ca.uhn.fhir.model.dstu2.resource.DeviceMetric.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The device used to generate the observation data."
	)
	private ResourceReferenceDt myDevice;
	
	@Child(name="referenceRange", order=17, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Guidance on how to interpret the value by comparison to a normal or recommended range"
	)
	private java.util.List<ReferenceRange> myReferenceRange;
	
	@Child(name="related", order=18, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A  reference to another resource (usually another Observation but could  also be a QuestionnaireAnswer) whose relationship is defined by the relationship type code."
	)
	private java.util.List<Related> myRelated;
	
	@Child(name="component", order=19, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations."
	)
	private java.util.List<Component> myComponent;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myStatus,  myCategory,  myCode,  mySubject,  myEncounter,  myEffective,  myIssued,  myPerformer,  myValue,  myDataAbsentReason,  myInterpretation,  myComments,  myBodySite,  myMethod,  mySpecimen,  myDevice,  myReferenceRange,  myRelated,  myComponent);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myStatus, myCategory, myCode, mySubject, myEncounter, myEffective, myIssued, myPerformer, myValue, myDataAbsentReason, myInterpretation, myComments, myBodySite, myMethod, mySpecimen, myDevice, myReferenceRange, myRelated, myComponent);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A unique identifier for the simple observation instance.
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
     * A unique identifier for the simple observation instance.
     * </p> 
	 */
	public Observation setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * A unique identifier for the simple observation instance.
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
	 * A unique identifier for the simple observation instance.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public Observation addIdentifier(IdentifierDt theValue) {
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
     * A unique identifier for the simple observation instance.
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
     * The status of the result value
     * </p> 
	 */
	public BoundCodeDt<ObservationStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<ObservationStatusEnum>(ObservationStatusEnum.VALUESET_BINDER);
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
     * The status of the result value
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
     * The status of the result value
     * </p> 
	 */
	public Observation setStatus(BoundCodeDt<ObservationStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the result value
     * </p> 
	 */
	public Observation setStatus(ObservationStatusEnum theValue) {
		setStatus(new BoundCodeDt<ObservationStatusEnum>(ObservationStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>category</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A code that classifies the general type of observation being made.  This is used  for searching, sorting and display purposes.
     * </p> 
	 */
	public CodeableConceptDt getCategory() {  
		if (myCategory == null) {
			myCategory = new CodeableConceptDt();
		}
		return myCategory;
	}

	/**
	 * Sets the value(s) for <b>category</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * A code that classifies the general type of observation being made.  This is used  for searching, sorting and display purposes.
     * </p> 
	 */
	public Observation setCategory(CodeableConceptDt theValue) {
		myCategory = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>code</b> (what).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes what was observed. Sometimes this is called the observation \&quot;name\&quot;
     * </p> 
	 */
	public CodeableConceptDt getCode() {  
		if (myCode == null) {
			myCode = new CodeableConceptDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes what was observed. Sometimes this is called the observation \&quot;name\&quot;
     * </p> 
	 */
	public Observation setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>subject</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject.
     * </p> 
	 */
	public ResourceReferenceDt getSubject() {  
		if (mySubject == null) {
			mySubject = new ResourceReferenceDt();
		}
		return mySubject;
	}

	/**
	 * Sets the value(s) for <b>subject</b> (who.focus)
	 *
     * <p>
     * <b>Definition:</b>
     * The patient, or group of patients, location, or device whose characteristics (direct or indirect) are described by the observation and into whose record the observation is placed.  Comments: Indirect characteristics may be those of a specimen, fetus, donor,  other observer (for example a relative or EMT), or any observation made about the subject.
     * </p> 
	 */
	public Observation setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made
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
     * The healthcare event  (e.g. a patient and healthcare provider interaction) during which this observation is made
     * </p> 
	 */
	public Observation setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>effective[x]</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \&quot;physiologically relevant time\&quot;. This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself
     * </p> 
	 */
	public IDatatype getEffective() {  
		return myEffective;
	}

	/**
	 * Sets the value(s) for <b>effective[x]</b> (when.done)
	 *
     * <p>
     * <b>Definition:</b>
     * The time or time-period the observed value is asserted as being true. For biological subjects - e.g. human patients - this is usually called the \&quot;physiologically relevant time\&quot;. This is usually either the time of the procedure or of specimen collection, but very often the source of the date/time is not known, only the date/time itself
     * </p> 
	 */
	public Observation setEffective(IDatatype theValue) {
		myEffective = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>issued</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time this observation was made available to providers, typically after the results have been reviewed and verified.
     * </p> 
	 */
	public InstantDt getIssuedElement() {  
		if (myIssued == null) {
			myIssued = new InstantDt();
		}
		return myIssued;
	}

	
	/**
	 * Gets the value(s) for <b>issued</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time this observation was made available to providers, typically after the results have been reviewed and verified.
     * </p> 
	 */
	public Date getIssued() {  
		return getIssuedElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>issued</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time this observation was made available to providers, typically after the results have been reviewed and verified.
     * </p> 
	 */
	public Observation setIssued(InstantDt theValue) {
		myIssued = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>issued</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time this observation was made available to providers, typically after the results have been reviewed and verified.
     * </p> 
	 */
	public Observation setIssuedWithMillisPrecision( Date theDate) {
		myIssued = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>issued</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The date and time this observation was made available to providers, typically after the results have been reviewed and verified.
     * </p> 
	 */
	public Observation setIssued( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myIssued = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>performer</b> (who.actor).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Who was responsible for asserting the observed value as \&quot;true\&quot;
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getPerformer() {  
		if (myPerformer == null) {
			myPerformer = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myPerformer;
	}

	/**
	 * Sets the value(s) for <b>performer</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * Who was responsible for asserting the observed value as \&quot;true\&quot;
     * </p> 
	 */
	public Observation setPerformer(java.util.List<ResourceReferenceDt> theValue) {
		myPerformer = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>performer</b> (who.actor)
	 *
     * <p>
     * <b>Definition:</b>
     * Who was responsible for asserting the observed value as \&quot;true\&quot;
     * </p> 
	 */
	public ResourceReferenceDt addPerformer() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getPerformer().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>value[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The information determined as a result of making the observation, if the information has a simple value
     * </p> 
	 */
	public IDatatype getValue() {  
		return myValue;
	}

	/**
	 * Sets the value(s) for <b>value[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The information determined as a result of making the observation, if the information has a simple value
     * </p> 
	 */
	public Observation setValue(IDatatype theValue) {
		myValue = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dataAbsentReason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Provides a reason why the expected value in the element Observation.value[x] is missing.
     * </p> 
	 */
	public CodeableConceptDt getDataAbsentReason() {  
		if (myDataAbsentReason == null) {
			myDataAbsentReason = new CodeableConceptDt();
		}
		return myDataAbsentReason;
	}

	/**
	 * Sets the value(s) for <b>dataAbsentReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Provides a reason why the expected value in the element Observation.value[x] is missing.
     * </p> 
	 */
	public Observation setDataAbsentReason(CodeableConceptDt theValue) {
		myDataAbsentReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>interpretation</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag.
     * </p> 
	 */
	public CodeableConceptDt getInterpretation() {  
		if (myInterpretation == null) {
			myInterpretation = new CodeableConceptDt();
		}
		return myInterpretation;
	}

	/**
	 * Sets the value(s) for <b>interpretation</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The assessment made based on the result of the observation.  Intended as a simple compact code often placed adjacent to the result value in reports and flow sheets to signal the meaning/normalcy status of the result. Otherwise known as abnormal flag.
     * </p> 
	 */
	public Observation setInterpretation(CodeableConceptDt theValue) {
		myInterpretation = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>comments</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.
     * </p> 
	 */
	public StringDt getCommentsElement() {  
		if (myComments == null) {
			myComments = new StringDt();
		}
		return myComments;
	}

	
	/**
	 * Gets the value(s) for <b>comments</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.
     * </p> 
	 */
	public String getComments() {  
		return getCommentsElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>comments</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.
     * </p> 
	 */
	public Observation setComments(StringDt theValue) {
		myComments = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>comments</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * May include statements about significant, unexpected or unreliable values, or information about the source of the value where this may be relevant to the interpretation of the result.
     * </p> 
	 */
	public Observation setComments( String theString) {
		myComments = new StringDt(theString); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>bodySite</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the site on the subject's body where the observation was made (i.e. the target site).
     * </p> 
	 */
	public CodeableConceptDt getBodySite() {  
		if (myBodySite == null) {
			myBodySite = new CodeableConceptDt();
		}
		return myBodySite;
	}

	/**
	 * Sets the value(s) for <b>bodySite</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the site on the subject's body where the observation was made (i.e. the target site).
     * </p> 
	 */
	public Observation setBodySite(CodeableConceptDt theValue) {
		myBodySite = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>method</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the mechanism used to perform the observation
     * </p> 
	 */
	public CodeableConceptDt getMethod() {  
		if (myMethod == null) {
			myMethod = new CodeableConceptDt();
		}
		return myMethod;
	}

	/**
	 * Sets the value(s) for <b>method</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the mechanism used to perform the observation
     * </p> 
	 */
	public Observation setMethod(CodeableConceptDt theValue) {
		myMethod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>specimen</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The specimen that was used when this observation was made
     * </p> 
	 */
	public ResourceReferenceDt getSpecimen() {  
		if (mySpecimen == null) {
			mySpecimen = new ResourceReferenceDt();
		}
		return mySpecimen;
	}

	/**
	 * Sets the value(s) for <b>specimen</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The specimen that was used when this observation was made
     * </p> 
	 */
	public Observation setSpecimen(ResourceReferenceDt theValue) {
		mySpecimen = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>device</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The device used to generate the observation data.
     * </p> 
	 */
	public ResourceReferenceDt getDevice() {  
		if (myDevice == null) {
			myDevice = new ResourceReferenceDt();
		}
		return myDevice;
	}

	/**
	 * Sets the value(s) for <b>device</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The device used to generate the observation data.
     * </p> 
	 */
	public Observation setDevice(ResourceReferenceDt theValue) {
		myDevice = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>referenceRange</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance on how to interpret the value by comparison to a normal or recommended range
     * </p> 
	 */
	public java.util.List<ReferenceRange> getReferenceRange() {  
		if (myReferenceRange == null) {
			myReferenceRange = new java.util.ArrayList<ReferenceRange>();
		}
		return myReferenceRange;
	}

	/**
	 * Sets the value(s) for <b>referenceRange</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance on how to interpret the value by comparison to a normal or recommended range
     * </p> 
	 */
	public Observation setReferenceRange(java.util.List<ReferenceRange> theValue) {
		myReferenceRange = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>referenceRange</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance on how to interpret the value by comparison to a normal or recommended range
     * </p> 
	 */
	public ReferenceRange addReferenceRange() {
		ReferenceRange newType = new ReferenceRange();
		getReferenceRange().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>referenceRange</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Guidance on how to interpret the value by comparison to a normal or recommended range
	 * </p>
	 * @param theValue The referenceRange to add (must not be <code>null</code>)
	 */
	public Observation addReferenceRange(ReferenceRange theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getReferenceRange().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>referenceRange</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance on how to interpret the value by comparison to a normal or recommended range
     * </p> 
	 */
	public ReferenceRange getReferenceRangeFirstRep() {
		if (getReferenceRange().isEmpty()) {
			return addReferenceRange();
		}
		return getReferenceRange().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>related</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A  reference to another resource (usually another Observation but could  also be a QuestionnaireAnswer) whose relationship is defined by the relationship type code.
     * </p> 
	 */
	public java.util.List<Related> getRelated() {  
		if (myRelated == null) {
			myRelated = new java.util.ArrayList<Related>();
		}
		return myRelated;
	}

	/**
	 * Sets the value(s) for <b>related</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A  reference to another resource (usually another Observation but could  also be a QuestionnaireAnswer) whose relationship is defined by the relationship type code.
     * </p> 
	 */
	public Observation setRelated(java.util.List<Related> theValue) {
		myRelated = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>related</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A  reference to another resource (usually another Observation but could  also be a QuestionnaireAnswer) whose relationship is defined by the relationship type code.
     * </p> 
	 */
	public Related addRelated() {
		Related newType = new Related();
		getRelated().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>related</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A  reference to another resource (usually another Observation but could  also be a QuestionnaireAnswer) whose relationship is defined by the relationship type code.
	 * </p>
	 * @param theValue The related to add (must not be <code>null</code>)
	 */
	public Observation addRelated(Related theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRelated().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>related</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A  reference to another resource (usually another Observation but could  also be a QuestionnaireAnswer) whose relationship is defined by the relationship type code.
     * </p> 
	 */
	public Related getRelatedFirstRep() {
		if (getRelated().isEmpty()) {
			return addRelated();
		}
		return getRelated().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>component</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
     * </p> 
	 */
	public java.util.List<Component> getComponent() {  
		if (myComponent == null) {
			myComponent = new java.util.ArrayList<Component>();
		}
		return myComponent;
	}

	/**
	 * Sets the value(s) for <b>component</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
     * </p> 
	 */
	public Observation setComponent(java.util.List<Component> theValue) {
		myComponent = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>component</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
     * </p> 
	 */
	public Component addComponent() {
		Component newType = new Component();
		getComponent().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>component</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
	 * </p>
	 * @param theValue The component to add (must not be <code>null</code>)
	 */
	public Observation addComponent(Component theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getComponent().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>component</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
     * </p> 
	 */
	public Component getComponentFirstRep() {
		if (getComponent().isEmpty()) {
			return addComponent();
		}
		return getComponent().get(0); 
	}
  
	/**
	 * Block class for child element: <b>Observation.referenceRange</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance on how to interpret the value by comparison to a normal or recommended range
     * </p> 
	 */
	@Block()	
	public static class ReferenceRange 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="low", type=SimpleQuantityDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is <=2.3)."
	)
	private SimpleQuantityDt myLow;
	
	@Child(name="high", type=SimpleQuantityDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is >=5 - <=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is >= 2.3)."
	)
	private SimpleQuantityDt myHigh;
	
	@Child(name="meaning", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Code for the meaning of the reference range"
	)
	private CodeableConceptDt myMeaning;
	
	@Child(name="age", type=RangeDt.class, order=3, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so"
	)
	private RangeDt myAge;
	
	@Child(name="text", type=StringDt.class, order=4, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of \"Negative\" or a list or table of 'normals'."
	)
	private StringDt myText;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myLow,  myHigh,  myMeaning,  myAge,  myText);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myLow, myHigh, myMeaning, myAge, myText);
	}

	/**
	 * Gets the value(s) for <b>low</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is &gt;=5 - &lt;=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is &lt;=2.3).
     * </p> 
	 */
	public SimpleQuantityDt getLow() {  
		if (myLow == null) {
			myLow = new SimpleQuantityDt();
		}
		return myLow;
	}

	/**
	 * Sets the value(s) for <b>low</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the low bound of the reference range.  The low bound of the reference range endpoint is inclusive of the value (e.g.  reference range is &gt;=5 - &lt;=9).   If the low bound is omitted,  it is assumed to be meaningless (e.g. reference range is &lt;=2.3).
     * </p> 
	 */
	public ReferenceRange setLow(SimpleQuantityDt theValue) {
		myLow = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>high</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is &gt;=5 - &lt;=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is &gt;= 2.3).
     * </p> 
	 */
	public SimpleQuantityDt getHigh() {  
		if (myHigh == null) {
			myHigh = new SimpleQuantityDt();
		}
		return myHigh;
	}

	/**
	 * Sets the value(s) for <b>high</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The value of the high bound of the reference range.  The high bound of the reference range endpoint is inclusive of the value (e.g.  reference range is &gt;=5 - &lt;=9).   If the high bound is omitted,  it is assumed to be meaningless (e.g. reference range is &gt;= 2.3).
     * </p> 
	 */
	public ReferenceRange setHigh(SimpleQuantityDt theValue) {
		myHigh = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>meaning</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Code for the meaning of the reference range
     * </p> 
	 */
	public CodeableConceptDt getMeaning() {  
		if (myMeaning == null) {
			myMeaning = new CodeableConceptDt();
		}
		return myMeaning;
	}

	/**
	 * Sets the value(s) for <b>meaning</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Code for the meaning of the reference range
     * </p> 
	 */
	public ReferenceRange setMeaning(CodeableConceptDt theValue) {
		myMeaning = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>age</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so
     * </p> 
	 */
	public RangeDt getAge() {  
		if (myAge == null) {
			myAge = new RangeDt();
		}
		return myAge;
	}

	/**
	 * Sets the value(s) for <b>age</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The age at which this reference range is applicable. This is a neonatal age (e.g. number of weeks at term) if the meaning says so
     * </p> 
	 */
	public ReferenceRange setAge(RangeDt theValue) {
		myAge = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of \&quot;Negative\&quot; or a list or table of 'normals'.
     * </p> 
	 */
	public StringDt getTextElement() {  
		if (myText == null) {
			myText = new StringDt();
		}
		return myText;
	}

	
	/**
	 * Gets the value(s) for <b>text</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of \&quot;Negative\&quot; or a list or table of 'normals'.
     * </p> 
	 */
	public String getText() {  
		return getTextElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of \&quot;Negative\&quot; or a list or table of 'normals'.
     * </p> 
	 */
	public ReferenceRange setText(StringDt theValue) {
		myText = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>text</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Text based reference range in an observation which may be used when a quantitative range is not appropriate for an observation.  An example would be a reference value of \&quot;Negative\&quot; or a list or table of 'normals'.
     * </p> 
	 */
	public ReferenceRange setText( String theString) {
		myText = new StringDt(theString); 
		return this; 
	}

 


	}


	/**
	 * Block class for child element: <b>Observation.related</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A  reference to another resource (usually another Observation but could  also be a QuestionnaireAnswer) whose relationship is defined by the relationship type code.
     * </p> 
	 */
	@Block()	
	public static class Related 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="type", type=CodeDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A code specifying the kind of relationship that exists with the target resource"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/observation-relationshiptypes")
	private BoundCodeDt<ObservationRelationshipTypeEnum> myType;
	
	@Child(name="target", order=1, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Observation.class, 		ca.uhn.fhir.model.dstu2.resource.QuestionnaireResponse.class	})
	@Description(
		shortDefinition="",
		formalDefinition="A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation"
	)
	private ResourceReferenceDt myTarget;
	

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
     * A code specifying the kind of relationship that exists with the target resource
     * </p> 
	 */
	public BoundCodeDt<ObservationRelationshipTypeEnum> getTypeElement() {  
		if (myType == null) {
			myType = new BoundCodeDt<ObservationRelationshipTypeEnum>(ObservationRelationshipTypeEnum.VALUESET_BINDER);
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
     * A code specifying the kind of relationship that exists with the target resource
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
     * A code specifying the kind of relationship that exists with the target resource
     * </p> 
	 */
	public Related setType(BoundCodeDt<ObservationRelationshipTypeEnum> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>type</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A code specifying the kind of relationship that exists with the target resource
     * </p> 
	 */
	public Related setType(ObservationRelationshipTypeEnum theValue) {
		setType(new BoundCodeDt<ObservationRelationshipTypeEnum>(ObservationRelationshipTypeEnum.VALUESET_BINDER, theValue));
		
/*
		getTypeElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>target</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation
     * </p> 
	 */
	public ResourceReferenceDt getTarget() {  
		if (myTarget == null) {
			myTarget = new ResourceReferenceDt();
		}
		return myTarget;
	}

	/**
	 * Sets the value(s) for <b>target</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * A reference to the observation or [[[QuestionnaireResponse]]] resource that is related to this observation
     * </p> 
	 */
	public Related setTarget(ResourceReferenceDt theValue) {
		myTarget = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>Observation.component</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Some observations have multiple component observations.  These component observations are expressed as separate code value pairs that share the same attributes.  Examples include systolic and diastolic component observations for blood pressure measurement and multiple component observations for genetics observations.
     * </p> 
	 */
	@Block()	
	public static class Component 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="code", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="what",
		formalDefinition="Describes what was observed. Sometimes this is called the observation \"code\""
	)
	private CodeableConceptDt myCode;
	
	@Child(name="value", order=1, min=0, max=1, summary=true, modifier=false, type={
		QuantityDt.class, 		CodeableConceptDt.class, 		StringDt.class, 		RangeDt.class, 		RatioDt.class, 		SampledDataDt.class, 		AttachmentDt.class, 		TimeDt.class, 		DateTimeDt.class, 		PeriodDt.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The information determined as a result of making the observation, if the information has a simple value"
	)
	private IDatatype myValue;
	
	@Child(name="dataAbsentReason", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Provides a reason why the expected value in the element Observation.value[x] is missing."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-observation-valueabsentreason")
	private CodeableConceptDt myDataAbsentReason;
	
	@Child(name="referenceRange", type=ReferenceRange.class, order=3, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Guidance on how to interpret the value by comparison to a normal or recommended range"
	)
	private java.util.List<ReferenceRange> myReferenceRange;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myCode,  myValue,  myDataAbsentReason,  myReferenceRange);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myCode, myValue, myDataAbsentReason, myReferenceRange);
	}

	/**
	 * Gets the value(s) for <b>code</b> (what).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes what was observed. Sometimes this is called the observation \&quot;code\&quot;
     * </p> 
	 */
	public CodeableConceptDt getCode() {  
		if (myCode == null) {
			myCode = new CodeableConceptDt();
		}
		return myCode;
	}

	/**
	 * Sets the value(s) for <b>code</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * Describes what was observed. Sometimes this is called the observation \&quot;code\&quot;
     * </p> 
	 */
	public Component setCode(CodeableConceptDt theValue) {
		myCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>value[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The information determined as a result of making the observation, if the information has a simple value
     * </p> 
	 */
	public IDatatype getValue() {  
		return myValue;
	}

	/**
	 * Sets the value(s) for <b>value[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The information determined as a result of making the observation, if the information has a simple value
     * </p> 
	 */
	public Component setValue(IDatatype theValue) {
		myValue = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>dataAbsentReason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Provides a reason why the expected value in the element Observation.value[x] is missing.
     * </p> 
	 */
	public CodeableConceptDt getDataAbsentReason() {  
		if (myDataAbsentReason == null) {
			myDataAbsentReason = new CodeableConceptDt();
		}
		return myDataAbsentReason;
	}

	/**
	 * Sets the value(s) for <b>dataAbsentReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Provides a reason why the expected value in the element Observation.value[x] is missing.
     * </p> 
	 */
	public Component setDataAbsentReason(CodeableConceptDt theValue) {
		myDataAbsentReason = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>referenceRange</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance on how to interpret the value by comparison to a normal or recommended range
     * </p> 
	 */
	public java.util.List<ReferenceRange> getReferenceRange() {  
		if (myReferenceRange == null) {
			myReferenceRange = new java.util.ArrayList<ReferenceRange>();
		}
		return myReferenceRange;
	}

	/**
	 * Sets the value(s) for <b>referenceRange</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance on how to interpret the value by comparison to a normal or recommended range
     * </p> 
	 */
	public Component setReferenceRange(java.util.List<ReferenceRange> theValue) {
		myReferenceRange = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>referenceRange</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance on how to interpret the value by comparison to a normal or recommended range
     * </p> 
	 */
	public ReferenceRange addReferenceRange() {
		ReferenceRange newType = new ReferenceRange();
		getReferenceRange().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>referenceRange</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Guidance on how to interpret the value by comparison to a normal or recommended range
	 * </p>
	 * @param theValue The referenceRange to add (must not be <code>null</code>)
	 */
	public Component addReferenceRange(ReferenceRange theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getReferenceRange().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>referenceRange</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Guidance on how to interpret the value by comparison to a normal or recommended range
     * </p> 
	 */
	public ReferenceRange getReferenceRangeFirstRep() {
		if (getReferenceRange().isEmpty()) {
			return addReferenceRange();
		}
		return getReferenceRange().get(0); 
	}
  


	}




    @Override
    public String getResourceName() {
        return "Observation";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
