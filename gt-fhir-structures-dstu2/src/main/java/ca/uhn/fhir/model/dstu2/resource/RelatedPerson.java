















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
 * HAPI/FHIR <b>RelatedPerson</b> Resource
 * (administrative.individual)
 *
 * <p>
 * <b>Definition:</b>
 * Information about a person that is involved in the care for a patient, but who is not the target of healthcare, nor has a formal responsibility in the care process.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * Need to track persons related to the patient or the healthcare process.
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/RelatedPerson">http://hl7.org/fhir/profiles/RelatedPerson</a> 
 * </p>
 *
 */
@ResourceDef(name="RelatedPerson", profile="http://hl7.org/fhir/profiles/RelatedPerson", id="relatedperson")
public class RelatedPerson extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A patient Identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="RelatedPerson.identifier", description="A patient Identifier", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b>A patient Identifier</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A portion of name in any name part</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="name", path="RelatedPerson.name", description="A portion of name in any name part", type="string"  )
	public static final String SP_NAME = "name";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>name</b>
	 * <p>
	 * Description: <b>A portion of name in any name part</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.name</b><br>
	 * </p>
	 */
	public static final StringClientParam NAME = new StringClientParam(SP_NAME);

	/**
	 * Search parameter constant for <b>phonetic</b>
	 * <p>
	 * Description: <b>A portion of name using some kind of phonetic matching algorithm</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.name</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="phonetic", path="RelatedPerson.name", description="A portion of name using some kind of phonetic matching algorithm", type="string"  )
	public static final String SP_PHONETIC = "phonetic";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>phonetic</b>
	 * <p>
	 * Description: <b>A portion of name using some kind of phonetic matching algorithm</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.name</b><br>
	 * </p>
	 */
	public static final StringClientParam PHONETIC = new StringClientParam(SP_PHONETIC);

	/**
	 * Search parameter constant for <b>telecom</b>
	 * <p>
	 * Description: <b>The value in any kind of contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.telecom</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="telecom", path="RelatedPerson.telecom", description="The value in any kind of contact", type="token"  )
	public static final String SP_TELECOM = "telecom";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>telecom</b>
	 * <p>
	 * Description: <b>The value in any kind of contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.telecom</b><br>
	 * </p>
	 */
	public static final TokenClientParam TELECOM = new TokenClientParam(SP_TELECOM);

	/**
	 * Search parameter constant for <b>phone</b>
	 * <p>
	 * Description: <b>A value in a phone contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.telecom(system=phone)</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="phone", path="RelatedPerson.telecom(system=phone)", description="A value in a phone contact", type="token"  )
	public static final String SP_PHONE = "phone";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>phone</b>
	 * <p>
	 * Description: <b>A value in a phone contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.telecom(system=phone)</b><br>
	 * </p>
	 */
	public static final TokenClientParam PHONE = new TokenClientParam(SP_PHONE);

	/**
	 * Search parameter constant for <b>email</b>
	 * <p>
	 * Description: <b>A value in an email contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.telecom(system=email)</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="email", path="RelatedPerson.telecom(system=email)", description="A value in an email contact", type="token"  )
	public static final String SP_EMAIL = "email";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>email</b>
	 * <p>
	 * Description: <b>A value in an email contact</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.telecom(system=email)</b><br>
	 * </p>
	 */
	public static final TokenClientParam EMAIL = new TokenClientParam(SP_EMAIL);

	/**
	 * Search parameter constant for <b>address</b>
	 * <p>
	 * Description: <b>An address in any kind of address/part</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.address</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address", path="RelatedPerson.address", description="An address in any kind of address/part", type="string"  )
	public static final String SP_ADDRESS = "address";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address</b>
	 * <p>
	 * Description: <b>An address in any kind of address/part</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.address</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS = new StringClientParam(SP_ADDRESS);

	/**
	 * Search parameter constant for <b>address-city</b>
	 * <p>
	 * Description: <b>A city specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.address.city</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-city", path="RelatedPerson.address.city", description="A city specified in an address", type="string"  )
	public static final String SP_ADDRESS_CITY = "address-city";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-city</b>
	 * <p>
	 * Description: <b>A city specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.address.city</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_CITY = new StringClientParam(SP_ADDRESS_CITY);

	/**
	 * Search parameter constant for <b>address-state</b>
	 * <p>
	 * Description: <b>A state specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.address.state</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-state", path="RelatedPerson.address.state", description="A state specified in an address", type="string"  )
	public static final String SP_ADDRESS_STATE = "address-state";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-state</b>
	 * <p>
	 * Description: <b>A state specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.address.state</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_STATE = new StringClientParam(SP_ADDRESS_STATE);

	/**
	 * Search parameter constant for <b>address-postalcode</b>
	 * <p>
	 * Description: <b>A postal code specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.address.postalCode</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-postalcode", path="RelatedPerson.address.postalCode", description="A postal code specified in an address", type="string"  )
	public static final String SP_ADDRESS_POSTALCODE = "address-postalcode";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-postalcode</b>
	 * <p>
	 * Description: <b>A postal code specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.address.postalCode</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_POSTALCODE = new StringClientParam(SP_ADDRESS_POSTALCODE);

	/**
	 * Search parameter constant for <b>address-country</b>
	 * <p>
	 * Description: <b>A country specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.address.country</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-country", path="RelatedPerson.address.country", description="A country specified in an address", type="string"  )
	public static final String SP_ADDRESS_COUNTRY = "address-country";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-country</b>
	 * <p>
	 * Description: <b>A country specified in an address</b><br>
	 * Type: <b>string</b><br>
	 * Path: <b>RelatedPerson.address.country</b><br>
	 * </p>
	 */
	public static final StringClientParam ADDRESS_COUNTRY = new StringClientParam(SP_ADDRESS_COUNTRY);

	/**
	 * Search parameter constant for <b>address-use</b>
	 * <p>
	 * Description: <b>A use code specified in an address</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.address.use</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="address-use", path="RelatedPerson.address.use", description="A use code specified in an address", type="token"  )
	public static final String SP_ADDRESS_USE = "address-use";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>address-use</b>
	 * <p>
	 * Description: <b>A use code specified in an address</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.address.use</b><br>
	 * </p>
	 */
	public static final TokenClientParam ADDRESS_USE = new TokenClientParam(SP_ADDRESS_USE);

	/**
	 * Search parameter constant for <b>birthdate</b>
	 * <p>
	 * Description: <b>The Related Person's date of birth</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>RelatedPerson.birthDate</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="birthdate", path="RelatedPerson.birthDate", description="The Related Person's date of birth", type="date"  )
	public static final String SP_BIRTHDATE = "birthdate";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>birthdate</b>
	 * <p>
	 * Description: <b>The Related Person's date of birth</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>RelatedPerson.birthDate</b><br>
	 * </p>
	 */
	public static final DateClientParam BIRTHDATE = new DateClientParam(SP_BIRTHDATE);

	/**
	 * Search parameter constant for <b>gender</b>
	 * <p>
	 * Description: <b>Gender of the person</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.gender</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="gender", path="RelatedPerson.gender", description="Gender of the person", type="token"  )
	public static final String SP_GENDER = "gender";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>gender</b>
	 * <p>
	 * Description: <b>Gender of the person</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>RelatedPerson.gender</b><br>
	 * </p>
	 */
	public static final TokenClientParam GENDER = new TokenClientParam(SP_GENDER);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The patient this person is related to</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RelatedPerson.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="RelatedPerson.patient", description="The patient this person is related to", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>The patient this person is related to</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>RelatedPerson.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>RelatedPerson:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("RelatedPerson:patient");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Identifier for a person within a particular scope."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="patient", order=1, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The patient this person is related to"
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="relationship", type=CodeableConceptDt.class, order=2, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="The nature of the relationship between a patient and the related person"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/valueset-relatedperson-relationshiptype")
	private CodeableConceptDt myRelationship;
	
	@Child(name="name", type=HumanNameDt.class, order=3, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A name associated with the person"
	)
	private HumanNameDt myName;
	
	@Child(name="telecom", type=ContactPointDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="A contact detail for the person, e.g. a telephone number or an email address."
	)
	private java.util.List<ContactPointDt> myTelecom;
	
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
		formalDefinition=""
	)
	private DateDt myBirthDate;
	
	@Child(name="address", type=AddressDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Address where the related person can be contacted or visited"
	)
	private java.util.List<AddressDt> myAddress;
	
	@Child(name="photo", type=AttachmentDt.class, order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Image of the person"
	)
	private java.util.List<AttachmentDt> myPhoto;
	
	@Child(name="period", type=PeriodDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.done",
		formalDefinition="The period of time that this relationship is considered to be valid. If there are no dates defined, then the interval is unknown."
	)
	private PeriodDt myPeriod;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myPatient,  myRelationship,  myName,  myTelecom,  myGender,  myBirthDate,  myAddress,  myPhoto,  myPeriod);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myPatient, myRelationship, myName, myTelecom, myGender, myBirthDate, myAddress, myPhoto, myPeriod);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier for a person within a particular scope.
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
     * Identifier for a person within a particular scope.
     * </p> 
	 */
	public RelatedPerson setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier for a person within a particular scope.
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
	 * Identifier for a person within a particular scope.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public RelatedPerson addIdentifier(IdentifierDt theValue) {
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
     * Identifier for a person within a particular scope.
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>patient</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The patient this person is related to
     * </p> 
	 */
	public ResourceReferenceDt getPatient() {  
		if (myPatient == null) {
			myPatient = new ResourceReferenceDt();
		}
		return myPatient;
	}

	/**
	 * Sets the value(s) for <b>patient</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The patient this person is related to
     * </p> 
	 */
	public RelatedPerson setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>relationship</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The nature of the relationship between a patient and the related person
     * </p> 
	 */
	public CodeableConceptDt getRelationship() {  
		if (myRelationship == null) {
			myRelationship = new CodeableConceptDt();
		}
		return myRelationship;
	}

	/**
	 * Sets the value(s) for <b>relationship</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * The nature of the relationship between a patient and the related person
     * </p> 
	 */
	public RelatedPerson setRelationship(CodeableConceptDt theValue) {
		myRelationship = theValue;
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
	public RelatedPerson setName(HumanNameDt theValue) {
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
	public RelatedPerson setTelecom(java.util.List<ContactPointDt> theValue) {
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
	public RelatedPerson addTelecom(ContactPointDt theValue) {
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
	public RelatedPerson setGender(BoundCodeDt<AdministrativeGenderEnum> theValue) {
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
	public RelatedPerson setGender(AdministrativeGenderEnum theValue) {
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
     * 
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
     * 
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
     * 
     * </p> 
	 */
	public RelatedPerson setBirthDate(DateDt theValue) {
		myBirthDate = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>birthDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public RelatedPerson setBirthDate( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myBirthDate = new DateDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>birthDate</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * 
     * </p> 
	 */
	public RelatedPerson setBirthDateWithDayPrecision( Date theDate) {
		myBirthDate = new DateDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>address</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Address where the related person can be contacted or visited
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
     * Address where the related person can be contacted or visited
     * </p> 
	 */
	public RelatedPerson setAddress(java.util.List<AddressDt> theValue) {
		myAddress = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>address</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Address where the related person can be contacted or visited
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
	 * Address where the related person can be contacted or visited
	 * </p>
	 * @param theValue The address to add (must not be <code>null</code>)
	 */
	public RelatedPerson addAddress(AddressDt theValue) {
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
     * Address where the related person can be contacted or visited
     * </p> 
	 */
	public AddressDt getAddressFirstRep() {
		if (getAddress().isEmpty()) {
			return addAddress();
		}
		return getAddress().get(0); 
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
	public RelatedPerson setPhoto(java.util.List<AttachmentDt> theValue) {
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
	public RelatedPerson addPhoto(AttachmentDt theValue) {
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
	 * Gets the value(s) for <b>period</b> (when.done).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The period of time that this relationship is considered to be valid. If there are no dates defined, then the interval is unknown.
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
     * The period of time that this relationship is considered to be valid. If there are no dates defined, then the interval is unknown.
     * </p> 
	 */
	public RelatedPerson setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  


    @Override
    public String getResourceName() {
        return "RelatedPerson";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
