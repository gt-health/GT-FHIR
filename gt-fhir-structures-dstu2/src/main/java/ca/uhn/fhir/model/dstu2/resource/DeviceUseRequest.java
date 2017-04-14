















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
 * HAPI/FHIR <b>DeviceUseRequest</b> Resource
 * (workflow.order)
 *
 * <p>
 * <b>Definition:</b>
 * Represents a request for a patient to employ a medical device. The device may be an implantable device, or an external assistive device, such as a walker.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/DeviceUseRequest">http://hl7.org/fhir/profiles/DeviceUseRequest</a> 
 * </p>
 *
 */
@ResourceDef(name="DeviceUseRequest", profile="http://hl7.org/fhir/profiles/DeviceUseRequest", id="deviceuserequest")
public class DeviceUseRequest extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>Search by subject</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceUseRequest.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="subject", path="DeviceUseRequest.subject", description="Search by subject", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_SUBJECT = "subject";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>subject</b>
	 * <p>
	 * Description: <b>Search by subject</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceUseRequest.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SUBJECT = new ReferenceClientParam(SP_SUBJECT);

	/**
	 * Search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Search by subject - a patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceUseRequest.subject</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="patient", path="DeviceUseRequest.subject", description="Search by subject - a patient", type="reference"  )
	public static final String SP_PATIENT = "patient";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>patient</b>
	 * <p>
	 * Description: <b>Search by subject - a patient</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceUseRequest.subject</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PATIENT = new ReferenceClientParam(SP_PATIENT);

	/**
	 * Search parameter constant for <b>device</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceUseRequest.device</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="device", path="DeviceUseRequest.device", description="", type="reference" , providesMembershipIn={
 @Compartment(name="Encounter") 	}
 )
	public static final String SP_DEVICE = "device";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>device</b>
	 * <p>
	 * Description: <b></b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceUseRequest.device</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam DEVICE = new ReferenceClientParam(SP_DEVICE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DeviceUseRequest:device</b>".
	 */
	public static final Include INCLUDE_DEVICE = new Include("DeviceUseRequest:device");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DeviceUseRequest:patient</b>".
	 */
	public static final Include INCLUDE_PATIENT = new Include("DeviceUseRequest:patient");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DeviceUseRequest:subject</b>".
	 */
	public static final Include INCLUDE_SUBJECT = new Include("DeviceUseRequest:subject");


	@Child(name="bodySite", order=0, min=0, max=1, summary=false, modifier=false, type={
		CodeableConceptDt.class, 		BodySite.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Indicates the site on the subject's body where the device should be used ( i.e. the target site)."
	)
	private IDatatype myBodySite;
	
	@Child(name="status", type=CodeDt.class, order=1, min=0, max=1, summary=false, modifier=true)	
	@Description(
		shortDefinition="status",
		formalDefinition="The status of the request."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/device-use-request-status")
	private BoundCodeDt<DeviceUseRequestStatusEnum> myStatus;
	
	@Child(name="device", order=2, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Device.class	})
	@Description(
		shortDefinition="",
		formalDefinition="The details of the device  to be used."
	)
	private ResourceReferenceDt myDevice;
	
	@Child(name="encounter", order=3, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Encounter.class	})
	@Description(
		shortDefinition="context",
		formalDefinition="An encounter that provides additional context in which this request is made."
	)
	private ResourceReferenceDt myEncounter;
	
	@Child(name="identifier", type=IdentifierDt.class, order=4, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="id",
		formalDefinition="Identifiers assigned to this order by the orderer or by the receiver."
	)
	private java.util.List<IdentifierDt> myIdentifier;
	
	@Child(name="indication", type=CodeableConceptDt.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="why",
		formalDefinition="Reason or justification for the use of this device."
	)
	private java.util.List<CodeableConceptDt> myIndication;
	
	@Child(name="notes", type=StringDt.class, order=6, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement."
	)
	private java.util.List<StringDt> myNotes;
	
	@Child(name="prnReason", type=CodeableConceptDt.class, order=7, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="The proposed act must be performed if the indicated conditions occur, e.g.., shortness of breath, SpO2 less than x%."
	)
	private java.util.List<CodeableConceptDt> myPrnReason;
	
	@Child(name="orderedOn", type=DateTimeDt.class, order=8, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.init",
		formalDefinition="The time when the request was made."
	)
	private DateTimeDt myOrderedOn;
	
	@Child(name="recordedOn", type=DateTimeDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="when.recorded",
		formalDefinition="The time at which the request was made/recorded."
	)
	private DateTimeDt myRecordedOn;
	
	@Child(name="subject", order=10, min=1, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Patient.class	})
	@Description(
		shortDefinition="who.focus",
		formalDefinition="The patient who will use the device."
	)
	private ResourceReferenceDt mySubject;
	
	@Child(name="timing", order=11, min=0, max=1, summary=false, modifier=false, type={
		TimingDt.class, 		PeriodDt.class, 		DateTimeDt.class	})
	@Description(
		shortDefinition="when.planned",
		formalDefinition="The timing schedule for the use of the device The Schedule data type allows many different expressions, for example. \"Every 8 hours\"; \"Three times a day\"; \"1/2 an hour before breakfast for 10 days from 23-Dec 2011:\"; \"15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\"."
	)
	private IDatatype myTiming;
	
	@Child(name="priority", type=CodeDt.class, order=12, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="grade",
		formalDefinition="Characterizes how quickly the  use of device must be initiated. Includes concepts such as stat, urgent, routine."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/device-use-request-priority")
	private BoundCodeDt<DeviceUseRequestPriorityEnum> myPriority;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myBodySite,  myStatus,  myDevice,  myEncounter,  myIdentifier,  myIndication,  myNotes,  myPrnReason,  myOrderedOn,  myRecordedOn,  mySubject,  myTiming,  myPriority);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myBodySite, myStatus, myDevice, myEncounter, myIdentifier, myIndication, myNotes, myPrnReason, myOrderedOn, myRecordedOn, mySubject, myTiming, myPriority);
	}

	/**
	 * Gets the value(s) for <b>bodySite[x]</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the site on the subject's body where the device should be used ( i.e. the target site).
     * </p> 
	 */
	public IDatatype getBodySite() {  
		return myBodySite;
	}

	/**
	 * Sets the value(s) for <b>bodySite[x]</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates the site on the subject's body where the device should be used ( i.e. the target site).
     * </p> 
	 */
	public DeviceUseRequest setBodySite(IDatatype theValue) {
		myBodySite = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>status</b> (status).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the request.
     * </p> 
	 */
	public BoundCodeDt<DeviceUseRequestStatusEnum> getStatusElement() {  
		if (myStatus == null) {
			myStatus = new BoundCodeDt<DeviceUseRequestStatusEnum>(DeviceUseRequestStatusEnum.VALUESET_BINDER);
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
     * The status of the request.
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
     * The status of the request.
     * </p> 
	 */
	public DeviceUseRequest setStatus(BoundCodeDt<DeviceUseRequestStatusEnum> theValue) {
		myStatus = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>status</b> (status)
	 *
     * <p>
     * <b>Definition:</b>
     * The status of the request.
     * </p> 
	 */
	public DeviceUseRequest setStatus(DeviceUseRequestStatusEnum theValue) {
		setStatus(new BoundCodeDt<DeviceUseRequestStatusEnum>(DeviceUseRequestStatusEnum.VALUESET_BINDER, theValue));
		
/*
		getStatusElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>device</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The details of the device  to be used.
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
     * The details of the device  to be used.
     * </p> 
	 */
	public DeviceUseRequest setDevice(ResourceReferenceDt theValue) {
		myDevice = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>encounter</b> (context).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * An encounter that provides additional context in which this request is made.
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
     * An encounter that provides additional context in which this request is made.
     * </p> 
	 */
	public DeviceUseRequest setEncounter(ResourceReferenceDt theValue) {
		myEncounter = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> (id).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Identifiers assigned to this order by the orderer or by the receiver.
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
     * Identifiers assigned to this order by the orderer or by the receiver.
     * </p> 
	 */
	public DeviceUseRequest setIdentifier(java.util.List<IdentifierDt> theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>identifier</b> (id)
	 *
     * <p>
     * <b>Definition:</b>
     * Identifiers assigned to this order by the orderer or by the receiver.
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
	 * Identifiers assigned to this order by the orderer or by the receiver.
	 * </p>
	 * @param theValue The identifier to add (must not be <code>null</code>)
	 */
	public DeviceUseRequest addIdentifier(IdentifierDt theValue) {
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
     * Identifiers assigned to this order by the orderer or by the receiver.
     * </p> 
	 */
	public IdentifierDt getIdentifierFirstRep() {
		if (getIdentifier().isEmpty()) {
			return addIdentifier();
		}
		return getIdentifier().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>indication</b> (why).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason or justification for the use of this device.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getIndication() {  
		if (myIndication == null) {
			myIndication = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myIndication;
	}

	/**
	 * Sets the value(s) for <b>indication</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * Reason or justification for the use of this device.
     * </p> 
	 */
	public DeviceUseRequest setIndication(java.util.List<CodeableConceptDt> theValue) {
		myIndication = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>indication</b> (why)
	 *
     * <p>
     * <b>Definition:</b>
     * Reason or justification for the use of this device.
     * </p> 
	 */
	public CodeableConceptDt addIndication() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getIndication().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>indication</b> (why)
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Reason or justification for the use of this device.
	 * </p>
	 * @param theValue The indication to add (must not be <code>null</code>)
	 */
	public DeviceUseRequest addIndication(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getIndication().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>indication</b> (why),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Reason or justification for the use of this device.
     * </p> 
	 */
	public CodeableConceptDt getIndicationFirstRep() {
		if (getIndication().isEmpty()) {
			return addIndication();
		}
		return getIndication().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>notes</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
     * </p> 
	 */
	public java.util.List<StringDt> getNotes() {  
		if (myNotes == null) {
			myNotes = new java.util.ArrayList<StringDt>();
		}
		return myNotes;
	}

	/**
	 * Sets the value(s) for <b>notes</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
     * </p> 
	 */
	public DeviceUseRequest setNotes(java.util.List<StringDt> theValue) {
		myNotes = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>notes</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
     * </p> 
	 */
	public StringDt addNotes() {
		StringDt newType = new StringDt();
		getNotes().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>notes</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
	 * </p>
	 * @param theValue The notes to add (must not be <code>null</code>)
	 */
	public DeviceUseRequest addNotes(StringDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getNotes().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>notes</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
     * </p> 
	 */
	public StringDt getNotesFirstRep() {
		if (getNotes().isEmpty()) {
			return addNotes();
		}
		return getNotes().get(0); 
	}
 	/**
	 * Adds a new value for <b>notes</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Details about this request that were not represented at all or sufficiently in one of the attributes provided in a class. These may include for example a comment, an instruction, or a note associated with the statement.
     * </p> 
     *
     * @return Returns a reference to this object, to allow for simple chaining.
	 */
	public DeviceUseRequest addNotes( String theString) {
		if (myNotes == null) {
			myNotes = new java.util.ArrayList<StringDt>();
		}
		myNotes.add(new StringDt(theString));
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>prnReason</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The proposed act must be performed if the indicated conditions occur, e.g.., shortness of breath, SpO2 less than x%.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getPrnReason() {  
		if (myPrnReason == null) {
			myPrnReason = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myPrnReason;
	}

	/**
	 * Sets the value(s) for <b>prnReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The proposed act must be performed if the indicated conditions occur, e.g.., shortness of breath, SpO2 less than x%.
     * </p> 
	 */
	public DeviceUseRequest setPrnReason(java.util.List<CodeableConceptDt> theValue) {
		myPrnReason = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>prnReason</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * The proposed act must be performed if the indicated conditions occur, e.g.., shortness of breath, SpO2 less than x%.
     * </p> 
	 */
	public CodeableConceptDt addPrnReason() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getPrnReason().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>prnReason</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * The proposed act must be performed if the indicated conditions occur, e.g.., shortness of breath, SpO2 less than x%.
	 * </p>
	 * @param theValue The prnReason to add (must not be <code>null</code>)
	 */
	public DeviceUseRequest addPrnReason(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getPrnReason().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>prnReason</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * The proposed act must be performed if the indicated conditions occur, e.g.., shortness of breath, SpO2 less than x%.
     * </p> 
	 */
	public CodeableConceptDt getPrnReasonFirstRep() {
		if (getPrnReason().isEmpty()) {
			return addPrnReason();
		}
		return getPrnReason().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>orderedOn</b> (when.init).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the request was made.
     * </p> 
	 */
	public DateTimeDt getOrderedOnElement() {  
		if (myOrderedOn == null) {
			myOrderedOn = new DateTimeDt();
		}
		return myOrderedOn;
	}

	
	/**
	 * Gets the value(s) for <b>orderedOn</b> (when.init).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the request was made.
     * </p> 
	 */
	public Date getOrderedOn() {  
		return getOrderedOnElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>orderedOn</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the request was made.
     * </p> 
	 */
	public DeviceUseRequest setOrderedOn(DateTimeDt theValue) {
		myOrderedOn = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>orderedOn</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the request was made.
     * </p> 
	 */
	public DeviceUseRequest setOrderedOn( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myOrderedOn = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>orderedOn</b> (when.init)
	 *
     * <p>
     * <b>Definition:</b>
     * The time when the request was made.
     * </p> 
	 */
	public DeviceUseRequest setOrderedOnWithSecondsPrecision( Date theDate) {
		myOrderedOn = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>recordedOn</b> (when.recorded).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time at which the request was made/recorded.
     * </p> 
	 */
	public DateTimeDt getRecordedOnElement() {  
		if (myRecordedOn == null) {
			myRecordedOn = new DateTimeDt();
		}
		return myRecordedOn;
	}

	
	/**
	 * Gets the value(s) for <b>recordedOn</b> (when.recorded).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The time at which the request was made/recorded.
     * </p> 
	 */
	public Date getRecordedOn() {  
		return getRecordedOnElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>recordedOn</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The time at which the request was made/recorded.
     * </p> 
	 */
	public DeviceUseRequest setRecordedOn(DateTimeDt theValue) {
		myRecordedOn = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>recordedOn</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The time at which the request was made/recorded.
     * </p> 
	 */
	public DeviceUseRequest setRecordedOn( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myRecordedOn = new DateTimeDt(theDate, thePrecision); 
		return this; 
	}

	/**
	 * Sets the value for <b>recordedOn</b> (when.recorded)
	 *
     * <p>
     * <b>Definition:</b>
     * The time at which the request was made/recorded.
     * </p> 
	 */
	public DeviceUseRequest setRecordedOnWithSecondsPrecision( Date theDate) {
		myRecordedOn = new DateTimeDt(theDate); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>subject</b> (who.focus).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The patient who will use the device.
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
     * The patient who will use the device.
     * </p> 
	 */
	public DeviceUseRequest setSubject(ResourceReferenceDt theValue) {
		mySubject = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>timing[x]</b> (when.planned).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * The timing schedule for the use of the device The Schedule data type allows many different expressions, for example. \&quot;Every 8 hours\&quot;; \&quot;Three times a day\&quot;; \&quot;1/2 an hour before breakfast for 10 days from 23-Dec 2011:\&quot;; \&quot;15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\&quot;.
     * </p> 
	 */
	public IDatatype getTiming() {  
		return myTiming;
	}

	/**
	 * Sets the value(s) for <b>timing[x]</b> (when.planned)
	 *
     * <p>
     * <b>Definition:</b>
     * The timing schedule for the use of the device The Schedule data type allows many different expressions, for example. \&quot;Every 8 hours\&quot;; \&quot;Three times a day\&quot;; \&quot;1/2 an hour before breakfast for 10 days from 23-Dec 2011:\&quot;; \&quot;15 Oct 2013, 17 Oct 2013 and 1 Nov 2013\&quot;.
     * </p> 
	 */
	public DeviceUseRequest setTiming(IDatatype theValue) {
		myTiming = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>priority</b> (grade).
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Characterizes how quickly the  use of device must be initiated. Includes concepts such as stat, urgent, routine.
     * </p> 
	 */
	public BoundCodeDt<DeviceUseRequestPriorityEnum> getPriorityElement() {  
		if (myPriority == null) {
			myPriority = new BoundCodeDt<DeviceUseRequestPriorityEnum>(DeviceUseRequestPriorityEnum.VALUESET_BINDER);
		}
		return myPriority;
	}

	
	/**
	 * Gets the value(s) for <b>priority</b> (grade).
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Characterizes how quickly the  use of device must be initiated. Includes concepts such as stat, urgent, routine.
     * </p> 
	 */
	public String getPriority() {  
		return getPriorityElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>priority</b> (grade)
	 *
     * <p>
     * <b>Definition:</b>
     * Characterizes how quickly the  use of device must be initiated. Includes concepts such as stat, urgent, routine.
     * </p> 
	 */
	public DeviceUseRequest setPriority(BoundCodeDt<DeviceUseRequestPriorityEnum> theValue) {
		myPriority = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>priority</b> (grade)
	 *
     * <p>
     * <b>Definition:</b>
     * Characterizes how quickly the  use of device must be initiated. Includes concepts such as stat, urgent, routine.
     * </p> 
	 */
	public DeviceUseRequest setPriority(DeviceUseRequestPriorityEnum theValue) {
		setPriority(new BoundCodeDt<DeviceUseRequestPriorityEnum>(DeviceUseRequestPriorityEnum.VALUESET_BINDER, theValue));
		
/*
		getPriorityElement().setValueAsEnum(theValue);
*/
		return this;
	}

  


    @Override
    public String getResourceName() {
        return "DeviceUseRequest";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
