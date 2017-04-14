















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
 * HAPI/FHIR <b>EpisodeOfCare</b> Resource
 * (workflow.encounter)
 *
 * <p>
 * <b>Definition:</b>
 * An association between a patient and an organization / healthcare provider(s) during which time encounters may occur. The managing organization assumes a level of responsibility for the patient during this time.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/EpisodeOfCare">http://hl7.org/fhir/profiles/EpisodeOfCare</a> 
 * </p>
 *
 */
@ResourceDef(name="EpisodeOfCare", profile="http://hl7.org/fhir/profiles/EpisodeOfCare", id="episodeofcare")
public class EpisodeOfCare extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>EpisodeOfCare.patient</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="EpisodeOfCare.patient", description="", type="reference" , providesMembershipIn={
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
	 * Path: <b>EpisodeOfCare.patient</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>EpisodeOfCare.identifier</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="identifier", path="EpisodeOfCare.identifier", description="", type="token"  )
	public static final String SP_IDENTIFIER = "identifier";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>identifier</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>EpisodeOfCare.identifier</b><br>
	 * </p>
	 */
	public static final TokenClientParam IDENTIFIER = new TokenClientParam(SP_IDENTIFIER);

	/**
	 * Search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The current status of the Episode of Care as provided (does not check the status history collection)</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>EpisodeOfCare.status</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="status", path="EpisodeOfCare.status", description="The current status of the Episode of Care as provided (does not check the status history collection)", type="token"  )
	public static final String SP_STATUS = "status";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>status</b>
	 * <p>
	 * Description: <b>The current status of the Episode of Care as provided (does not check the status history collection)</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>EpisodeOfCare.status</b><br>
	 * </p>
	 */
	public static final TokenClientParam STATUS = new TokenClientParam(SP_STATUS);

	/**
	 * Search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>The organization that has assumed the specific responsibilities of this EpisodeOfCare</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>EpisodeOfCare.managingOrganization</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="organization", path="EpisodeOfCare.managingOrganization", description="The organization that has assumed the specific responsibilities of this EpisodeOfCare", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Organization.class 	}
 )
	public static final String SP_ORGANIZATION = "organization";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>organization</b>
	 * <p>
	 * Description: <b>The organization that has assumed the specific responsibilities of this EpisodeOfCare</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>EpisodeOfCare.managingOrganization</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam ORGANIZATION = new ReferenceClientParam(SP_ORGANIZATION);

	/**
	 * Search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The provided date search value falls within the episode of care's period</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>EpisodeOfCare.period</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="date", path="EpisodeOfCare.period", description="The provided date search value falls within the episode of care's period", type="date"  )
	public static final String SP_DATE = "date";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>date</b>
	 * <p>
	 * Description: <b>The provided date search value falls within the episode of care's period</b><br>
	 * Type: <b>date</b><br>
	 * Path: <b>EpisodeOfCare.period</b><br>
	 * </p>
	 */
	public static final DateClientParam DATE = new DateClientParam(SP_DATE);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>EpisodeOfCare.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="EpisodeOfCare.type", description="", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>EpisodeOfCare.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>condition</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>EpisodeOfCare.condition</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="condition", path="EpisodeOfCare.condition", description="", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.Condition.class 	}
 )
	public static final String SP_CONDITION = "condition";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>condition</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>EpisodeOfCare.condition</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam CONDITION = new ReferenceClientParam(SP_CONDITION);

	/**
	 * Search parameter constant for <b>incomingreferral</b>
	 * <p>
	 * Description: <b>Incoming Referral Request</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>EpisodeOfCare.referralRequest</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="incomingreferral", path="EpisodeOfCare.referralRequest", description="Incoming Referral Request", type="reference" , target={
 ca.uhn.fhir.model.dstu2.resource.ReferralRequest.class 	}
 )
	public static final String SP_INCOMINGREFERRAL = "incomingreferral";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>incomingreferral</b>
	 * <p>
	 * Description: <b>Incoming Referral Request</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>EpisodeOfCare.referralRequest</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam INCOMINGREFERRAL = new ReferenceClientParam(SP_INCOMINGREFERRAL);

	/**
	 * Search parameter constant for <b>care-manager</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>EpisodeOfCare.careManager</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="care-manager", path="EpisodeOfCare.careManager", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
, target={
 ca.uhn.fhir.model.dstu2.resource.Practitioner.class 	}
 )
	public static final String SP_CARE_MANAGER = "care-manager";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>care-manager</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>EpisodeOfCare.careManager</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam CARE_MANAGER = new ReferenceClientParam(SP_CARE_MANAGER);

	/**
	 * Search parameter constant for <b>team-member</b>
	 * <p>
	 * Description: <b>A Practitioner or Organization allocated to the care team for this EpisodeOfCare</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>EpisodeOfCare.careTeam.member</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="team-member", path="EpisodeOfCare.careTeam.member", description="A Practitioner or Organization allocated to the care team for this EpisodeOfCare", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_TEAM_MEMBER = "team-member";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>team-member</b>
	 * <p>
	 * Description: <b>A Practitioner or Organization allocated to the care team for this EpisodeOfCare</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>EpisodeOfCare.careTeam.member</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam TEAM_MEMBER = new ReferenceClientParam(SP_TEAM_MEMBER);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>EpisodeOfCare:care-manager</b>".
	 */
	public static final Include INCLUDE_CARE_MANAGER = new Include("EpisodeOfCare:care-manager");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>EpisodeOfCare:condition</b>".
	 */
	public static final Include INCLUDE_CONDITION = new Include("EpisodeOfCare:condition");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>EpisodeOfCare:incomingreferral</b>".
	 */
	public static final Include INCLUDE_INCOMINGREFERRAL = new Include("EpisodeOfCare:incomingreferral");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>EpisodeOfCare:organization</b>".
	 */
	public static final Include INCLUDE_ORGANIZATION = new Include("EpisodeOfCare:organization");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>EpisodeOfCare:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("EpisodeOfCare:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>EpisodeOfCare:team-member</b>".
	 */
	public static final Include INCLUDE_TEAM_MEMBER = new Include("EpisodeOfCare:team-member");


	@Child(name="identifier", type=IdentifierDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Identifier(s) by which this EpisodeOfCare is known"
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="status", type=CodeDt.class, order=1, min=1, max=1, summary=true, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="planned | waitlist | active | onhold | finished | cancelled"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/episode-of-care-status")
	private BoundCodeDt<EpisodeOfCareStatusEnum> myStatus;
	
	@Child(name="statusHistory", order=2, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource)"
	)
	private java.util.List<StatusHistory> myStatusHistory;
	
	@Child(name="type", type=CodeableConceptDt.class, order=3, min=0, max=Child.MAX_UNLIMITED, summary=true, modifier=false)	
	@Description(
		shortDefinition="class",
		formalDefinition="A classification of the type of encounter; e.g. specialist referral, disease management, type of funded care"
	)
	private java.util.List<CodeableConceptDt> myType;
	
	@Child(name="condition", order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Condition.class	})
	@Description(
		shortDefinition="what",
		formalDefinition="A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for"
	)
	private java.util.List<ResourceReferenceDt> myCondition;
	
	@Child(name="patient", order=5, min=1, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The patient that this EpisodeOfCare applies to"
	)
	private ResourceReferenceDt myPatient;
	
	@Child(name="managingOrganization", order=6, min=0, max=1, summary=true, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The organization that has assumed the specific responsibilities for the specified duration"
	)
	private ResourceReferenceDt myManagingOrganization;
	
	@Child(name="period", type=PeriodDt.class, order=7, min=0, max=1, summary=true, modifier=false)	
	@Description(
		shortDefinition="when.init",
		formalDefinition="The interval during which the managing organization assumes the defined responsibility"
	)
	private PeriodDt myPeriod;
	
	@Child(name="referralRequest", order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.ReferralRequest.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals"
	)
	private java.util.List<ResourceReferenceDt> myReferralRequest;
	
	@Child(name="careManager", order=9, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The practitioner that is the care manager/care co-ordinator for this patient"
	)
	private ResourceReferenceDt myCareManager;
	
	@Child(name="careTeam", order=10, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The list of practitioners that may be facilitating this episode of care for specific purposes"
	)
	private java.util.List<CareTeam> myCareTeam;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myIdentifier,  myStatus,  myStatusHistory,  myType,  myCondition,  myPatient,  myManagingOrganization,  myPeriod,  myReferralRequest,  myCareManager,  myCareTeam);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myIdentifier, myStatus, myStatusHistory, myType, myCondition, myPatient, myManagingOrganization, myPeriod, myReferralRequest, myCareManager, myCareTeam);
	}

	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier(s) by which this EpisodeOfCare is known
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
     * Identifier(s) by which this EpisodeOfCare is known
     * </p> 
	 */
	public EpisodeOfCare setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifier(s) by which this EpisodeOfCare is known
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
	 * Identifier(s) by which this EpisodeOfCare is known
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public EpisodeOfCare addIdentifier(IdentifierDt theValue) {
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
     * Identifier(s) by which this EpisodeOfCare is known
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
     * planned | waitlist | active | onhold | finished | cancelled
     * </p> 
	 */
	public BoundCodeDt<EpisodeOfCareStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<EpisodeOfCareStatusEnum>(EpisodeOfCareStatusEnum.VALUESET_BINDER);
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
     * planned | waitlist | active | onhold | finished | cancelled
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
     * planned | waitlist | active | onhold | finished | cancelled
     * </p> 
	 */
	public EpisodeOfCare setStatus(BoundCodeDt<EpisodeOfCareStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * planned | waitlist | active | onhold | finished | cancelled
     * </p> 
	 */
	public EpisodeOfCare setStatus(EpisodeOfCareStatusEnum theValue) {
		setStatus(new BoundCodeDt<EpisodeOfCareStatusEnum>(EpisodeOfCareStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>statusHistory</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource)
     * </p> 
	 */
	public java.util.List<StatusHistory> getStatusHistory() {  
		if (myStatusHistory == null) {
			myStatusHistory = new java.util.ArrayList<StatusHistory>();
		}
		return myStatusHistory;
	}

	/**
	 * Sets the value(s) for <b>statusHistory</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource)
     * </p> 
	 */
	public EpisodeOfCare setStatusHistory(java.util.List<StatusHistory> theValue) {
		myStatusHistory = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>statusHistory</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource)
     * </p> 
	 */
	public StatusHistory addStatusHistory() {
		StatusHistory newType = new StatusHistory();
		getStatusHistory().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>statusHistory</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource)
	 * </p>
	 * @param theValue The statusHistory to add (must not be <code>null</code>)
	 */
	public EpisodeOfCare addStatusHistory(StatusHistory theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getStatusHistory().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>statusHistory</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource)
     * </p> 
	 */
	public StatusHistory getStatusHistoryFirstRep() {
		if (getStatusHistory().isEmpty()) {
			return addStatusHistory();
		}
		return getStatusHistory().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>type</b> (class).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A classification of the type of encounter; e.g. specialist referral, disease management, type of funded care
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getType() {  
		if (myType == null) {
			myType = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myType;
	}

	/**
	 * Sets the value(s) for <b>type</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * A classification of the type of encounter; e.g. specialist referral, disease management, type of funded care
     * </p> 
	 */
	public EpisodeOfCare setType(java.util.List<CodeableConceptDt> theValue) {
		myType = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>type</b> (class)
	 *
     * <p>
     * <b>Definition:</b>
     * A classification of the type of encounter; e.g. specialist referral, disease management, type of funded care
     * </p> 
	 */
	public CodeableConceptDt addType() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getType().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>type</b> (class)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * A classification of the type of encounter; e.g. specialist referral, disease management, type of funded care
	 * </p>
	 * @param theValue The type to add (must not be <code>null</code>)
	 */
	public EpisodeOfCare addType(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getType().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>type</b> (class),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * A classification of the type of encounter; e.g. specialist referral, disease management, type of funded care
     * </p> 
	 */
	public CodeableConceptDt getTypeFirstRep() {
		if (getType().isEmpty()) {
			return addType();
		}
		return getType().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>condition</b> (what).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getCondition() {  
		if (myCondition == null) {
			myCondition = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myCondition;
	}

	/**
	 * Sets the value(s) for <b>condition</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for
     * </p> 
	 */
	public EpisodeOfCare setCondition(java.util.List<ResourceReferenceDt> theValue) {
		myCondition = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>condition</b> (what)
	 *
     * <p>
     * <b>Definition:</b>
     * A list of conditions/problems/diagnoses that this episode of care is intended to be providing care for
     * </p> 
	 */
	public ResourceReferenceDt addCondition() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getCondition().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>patient</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The patient that this EpisodeOfCare applies to
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
     * The patient that this EpisodeOfCare applies to
     * </p> 
	 */
	public EpisodeOfCare setPatient(ResourceReferenceDt theValue) {
		myPatient = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>managingOrganization</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The organization that has assumed the specific responsibilities for the specified duration
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
     * The organization that has assumed the specific responsibilities for the specified duration
     * </p> 
	 */
	public EpisodeOfCare setManagingOrganization(ResourceReferenceDt theValue) {
		myManagingOrganization = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>period</b> (when.init).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The interval during which the managing organization assumes the defined responsibility
     * </p> 
	 */
	public PeriodDt getPeriod() {  
		if (myPeriod == null) {
			myPeriod = new PeriodDt();
		}
		return myPeriod;
	}

	/**
	 * Sets the value(s) for <b>period</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * The interval during which the managing organization assumes the defined responsibility
     * </p> 
	 */
	public EpisodeOfCare setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>referralRequest</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals
     * </p> 
	 */
	public java.util.List<ResourceReferenceDt> getReferralRequest() {  
		if (myReferralRequest == null) {
			myReferralRequest = new java.util.ArrayList<ResourceReferenceDt>();
		}
		return myReferralRequest;
	}

	/**
	 * Sets the value(s) for <b>referralRequest</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals
     * </p> 
	 */
	public EpisodeOfCare setReferralRequest(java.util.List<ResourceReferenceDt> theValue) {
		myReferralRequest = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>referralRequest</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Referral Request(s) that are fulfilled by this EpisodeOfCare, incoming referrals
     * </p> 
	 */
	public ResourceReferenceDt addReferralRequest() {
		ResourceReferenceDt newType = new ResourceReferenceDt();
		getReferralRequest().add(newType);
		return newType; 
	}
  
	/**
	 * Gets the value(s) for <b>careManager</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner that is the care manager/care co-ordinator for this patient
     * </p> 
	 */
	public ResourceReferenceDt getCareManager() {  
		if (myCareManager == null) {
			myCareManager = new ResourceReferenceDt();
		}
		return myCareManager;
	}

	/**
	 * Sets the value(s) for <b>careManager</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner that is the care manager/care co-ordinator for this patient
     * </p> 
	 */
	public EpisodeOfCare setCareManager(ResourceReferenceDt theValue) {
		myCareManager = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>careTeam</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The list of practitioners that may be facilitating this episode of care for specific purposes
     * </p> 
	 */
	public java.util.List<CareTeam> getCareTeam() {  
		if (myCareTeam == null) {
			myCareTeam = new java.util.ArrayList<CareTeam>();
		}
		return myCareTeam;
	}

	/**
	 * Sets the value(s) for <b>careTeam</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The list of practitioners that may be facilitating this episode of care for specific purposes
     * </p> 
	 */
	public EpisodeOfCare setCareTeam(java.util.List<CareTeam> theValue) {
		myCareTeam = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>careTeam</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The list of practitioners that may be facilitating this episode of care for specific purposes
     * </p> 
	 */
	public CareTeam addCareTeam() {
		CareTeam newType = new CareTeam();
		getCareTeam().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>careTeam</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The list of practitioners that may be facilitating this episode of care for specific purposes
	 * </p>
	 * @param theValue The careTeam to add (must not be <code>null</code>)
	 */
	public EpisodeOfCare addCareTeam(CareTeam theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getCareTeam().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>careTeam</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The list of practitioners that may be facilitating this episode of care for specific purposes
     * </p> 
	 */
	public CareTeam getCareTeamFirstRep() {
		if (getCareTeam().isEmpty()) {
			return addCareTeam();
		}
		return getCareTeam().get(0); 
	}
  
	/**
	 * Block class for child element: <b>EpisodeOfCare.statusHistory</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The history of statuses that the EpisodeOfCare has been through (without requiring processing the history of the resource)
     * </p> 
	 */
	@Block()	
	public static class StatusHistory 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="status", type=CodeDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="planned | waitlist | active | onhold | finished | cancelled"
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/episode-of-care-status")
	private BoundCodeDt<EpisodeOfCareStatusEnum> myStatus;
	
	@Child(name="period", type=PeriodDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The period during this EpisodeOfCare that the specific status applied"
	)
	private PeriodDt myPeriod;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myStatus,  myPeriod);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myStatus, myPeriod);
	}

	/**
	 * Gets the value(s) for <b>status</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * planned | waitlist | active | onhold | finished | cancelled
     * </p> 
	 */
	public BoundCodeDt<EpisodeOfCareStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<EpisodeOfCareStatusEnum>(EpisodeOfCareStatusEnum.VALUESET_BINDER);
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
     * planned | waitlist | active | onhold | finished | cancelled
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
     * planned | waitlist | active | onhold | finished | cancelled
     * </p> 
	 */
	public StatusHistory setStatus(BoundCodeDt<EpisodeOfCareStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * planned | waitlist | active | onhold | finished | cancelled
     * </p> 
	 */
	public StatusHistory setStatus(EpisodeOfCareStatusEnum theValue) {
		setStatus(new BoundCodeDt<EpisodeOfCareStatusEnum>(EpisodeOfCareStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The period during this EpisodeOfCare that the specific status applied
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
     * The period during this EpisodeOfCare that the specific status applied
     * </p> 
	 */
	public StatusHistory setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  


	}


	/**
	 * Block class for child element: <b>EpisodeOfCare.careTeam</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The list of practitioners that may be facilitating this episode of care for specific purposes
     * </p> 
	 */
	@Block()	
	public static class CareTeam 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="role", type=CodeableConceptDt.class, order=0, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The role this team member is taking within this episode of care"
	)
	private java.util.List<CodeableConceptDt> myRole;
	
	@Child(name="period", type=PeriodDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The period of time this practitioner is performing some role within the episode of care"
	)
	private PeriodDt myPeriod;
	
	@Child(name="member", order=2, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Practitioner.class, 		ca.uhn.fhir.model.dstu2.resource.Organization.class	})
	@Description(
		shortDefinition="who",
		formalDefinition="The practitioner (or Organization) within the team"
	)
	private ResourceReferenceDt myMember;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myRole,  myPeriod,  myMember);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myRole, myPeriod, myMember);
	}

	/**
	 * Gets the value(s) for <b>role</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The role this team member is taking within this episode of care
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getRole() {  
		if (myRole == null) {
			myRole = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myRole;
	}

	/**
	 * Sets the value(s) for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The role this team member is taking within this episode of care
     * </p> 
	 */
	public CareTeam setRole(java.util.List<CodeableConceptDt> theValue) {
		myRole = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>role</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The role this team member is taking within this episode of care
     * </p> 
	 */
	public CodeableConceptDt addRole() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getRole().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>role</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The role this team member is taking within this episode of care
	 * </p>
	 * @param theValue The role to add (must not be <code>null</code>)
	 */
	public CareTeam addRole(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getRole().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>role</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The role this team member is taking within this episode of care
     * </p> 
	 */
	public CodeableConceptDt getRoleFirstRep() {
		if (getRole().isEmpty()) {
			return addRole();
		}
		return getRole().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>period</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The period of time this practitioner is performing some role within the episode of care
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
     * The period of time this practitioner is performing some role within the episode of care
     * </p> 
	 */
	public CareTeam setPeriod(PeriodDt theValue) {
		myPeriod = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>member</b> (who).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner (or Organization) within the team
     * </p> 
	 */
	public ResourceReferenceDt getMember() {  
		if (myMember == null) {
			myMember = new ResourceReferenceDt();
		}
		return myMember;
	}

	/**
	 * Sets the value(s) for <b>member</b> (who)
	 *
     * <p>
     * <b>Definition:</b>
     * The practitioner (or Organization) within the team
     * </p> 
	 */
	public CareTeam setMember(ResourceReferenceDt theValue) {
		myMember = theValue;
		return this;
	}
	
	

  


	}




    @Override
    public String getResourceName() {
        return "EpisodeOfCare";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
