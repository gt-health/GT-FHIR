















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
 * HAPI/FHIR <b>DeviceComponent</b> Resource
 * ()
 *
 * <p>
 * <b>Definition:</b>
 * Describes the characteristics, operational status and capabilities of a medical-related component of a medical device.
 * </p> 
 *
 * <p>
 * <b>Requirements:</b>
 * 
 * </p> 
 *
 * <p>
 * <b>Profile Definition:</b>
 * <a href="http://hl7.org/fhir/profiles/DeviceComponent">http://hl7.org/fhir/profiles/DeviceComponent</a> 
 * </p>
 *
 */
@ResourceDef(name="DeviceComponent", profile="http://hl7.org/fhir/profiles/DeviceComponent", id="devicecomponent")
public class DeviceComponent extends ca.uhn.fhir.model.dstu2.resource.BaseResource
    implements  IResource     {

	/**
	 * Search parameter constant for <b>parent</b>
	 * <p>
	 * Description: <b>The parent DeviceComponent resource</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceComponent.parent</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="parent", path="DeviceComponent.parent", description="The parent DeviceComponent resource", type="reference"  )
	public static final String SP_PARENT = "parent";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>parent</b>
	 * <p>
	 * Description: <b>The parent DeviceComponent resource</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceComponent.parent</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam PARENT = new ReferenceClientParam(SP_PARENT);

	/**
	 * Search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>The device component type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DeviceComponent.type</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="type", path="DeviceComponent.type", description="The device component type", type="token"  )
	public static final String SP_TYPE = "type";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>type</b>
	 * <p>
	 * Description: <b>The device component type</b><br>
	 * Type: <b>token</b><br>
	 * Path: <b>DeviceComponent.type</b><br>
	 * </p>
	 */
	public static final TokenClientParam TYPE = new TokenClientParam(SP_TYPE);

	/**
	 * Search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b>The device source</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceComponent.source</b><br>
	 * </p>
	 */
	@SearchParamDefinition(name="source", path="DeviceComponent.source", description="The device source", type="reference" , providesMembershipIn={
 @Compartment(name="Patient") 	}
 )
	public static final String SP_SOURCE = "source";

	/**
	 * <b>Fluent Client</b> search parameter constant for <b>source</b>
	 * <p>
	 * Description: <b>The device source</b><br>
	 * Type: <b>reference</b><br>
	 * Path: <b>DeviceComponent.source</b><br>
	 * </p>
	 */
	public static final ReferenceClientParam SOURCE = new ReferenceClientParam(SP_SOURCE);


	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DeviceComponent:parent</b>".
	 */
	public static final Include INCLUDE_PARENT = new Include("DeviceComponent:parent");

	/**
	 * Constant for fluent queries to be used to add include statements. Specifies
	 * the path value of "<b>DeviceComponent:source</b>".
	 */
	public static final Include INCLUDE_SOURCE = new Include("DeviceComponent:source");


	@Child(name="type", type=CodeableConceptDt.class, order=0, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the specific component type as defined in the object-oriented or metric nomenclature partition."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "https://rtmms.nist.gov/rtmms/index.htm#!hrosetta")
	private CodeableConceptDt myType;
	
	@Child(name="identifier", type=IdentifierDt.class, order=1, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the local assigned unique identification by the software. For example: handle ID."
	)
	private IdentifierDt myIdentifier;
	
	@Child(name="lastSystemChange", type=InstantDt.class, order=2, min=1, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the timestamp for the most recent system change which includes device configuration or setting change."
	)
	private InstantDt myLastSystemChange;
	
	@Child(name="source", order=3, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.Device.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Describes the link to the source Device that contains administrative device information such as manufacture, serial number, etc."
	)
	private ResourceReferenceDt mySource;
	
	@Child(name="parent", order=4, min=0, max=1, summary=false, modifier=false, type={
		ca.uhn.fhir.model.dstu2.resource.DeviceComponent.class	})
	@Description(
		shortDefinition="",
		formalDefinition="Describes the link to the parent resource. For example: Channel is linked to its VMD parent."
	)
	private ResourceReferenceDt myParent;
	
	@Child(name="operationalStatus", type=CodeableConceptDt.class, order=5, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Indicates current operational status of the device. For example: On, Off, Standby, etc."
	)
	private java.util.List<CodeableConceptDt> myOperationalStatus;
	
	@Child(name="parameterGroup", type=CodeableConceptDt.class, order=6, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular."
	)
	private CodeableConceptDt myParameterGroup;
	
	@Child(name="measurementPrinciple", type=CodeDt.class, order=7, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc."
	)
	@ca.uhn.fhir.model.api.annotation.Binding(valueSet = "http://hl7.org/fhir/ValueSet/measurement-principle")
	private BoundCodeDt<MeasmntPrincipleEnum> myMeasurementPrinciple;
	
	@Child(name="productionSpecification", order=8, min=0, max=Child.MAX_UNLIMITED, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the production specification such as component revision, serial number, etc."
	)
	private java.util.List<ProductionSpecification> myProductionSpecification;
	
	@Child(name="languageCode", type=CodeableConceptDt.class, order=9, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US."
	)
	private CodeableConceptDt myLanguageCode;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  myType,  myIdentifier,  myLastSystemChange,  mySource,  myParent,  myOperationalStatus,  myParameterGroup,  myMeasurementPrinciple,  myProductionSpecification,  myLanguageCode);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, myType, myIdentifier, myLastSystemChange, mySource, myParent, myOperationalStatus, myParameterGroup, myMeasurementPrinciple, myProductionSpecification, myLanguageCode);
	}

	/**
	 * Gets the value(s) for <b>type</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the specific component type as defined in the object-oriented or metric nomenclature partition.
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
     * Describes the specific component type as defined in the object-oriented or metric nomenclature partition.
     * </p> 
	 */
	public DeviceComponent setType(CodeableConceptDt theValue) {
		myType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>identifier</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the local assigned unique identification by the software. For example: handle ID.
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
     * Describes the local assigned unique identification by the software. For example: handle ID.
     * </p> 
	 */
	public DeviceComponent setIdentifier(IdentifierDt theValue) {
		myIdentifier = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>lastSystemChange</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the timestamp for the most recent system change which includes device configuration or setting change.
     * </p> 
	 */
	public InstantDt getLastSystemChangeElement() {  
		if (myLastSystemChange == null) {
			myLastSystemChange = new InstantDt();
		}
		return myLastSystemChange;
	}

	
	/**
	 * Gets the value(s) for <b>lastSystemChange</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the timestamp for the most recent system change which includes device configuration or setting change.
     * </p> 
	 */
	public Date getLastSystemChange() {  
		return getLastSystemChangeElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>lastSystemChange</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the timestamp for the most recent system change which includes device configuration or setting change.
     * </p> 
	 */
	public DeviceComponent setLastSystemChange(InstantDt theValue) {
		myLastSystemChange = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>lastSystemChange</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the timestamp for the most recent system change which includes device configuration or setting change.
     * </p> 
	 */
	public DeviceComponent setLastSystemChangeWithMillisPrecision( Date theDate) {
		myLastSystemChange = new InstantDt(theDate); 
		return this; 
	}

	/**
	 * Sets the value for <b>lastSystemChange</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the timestamp for the most recent system change which includes device configuration or setting change.
     * </p> 
	 */
	public DeviceComponent setLastSystemChange( Date theDate,  TemporalPrecisionEnum thePrecision) {
		myLastSystemChange = new InstantDt(theDate, thePrecision); 
		return this; 
	}

 
	/**
	 * Gets the value(s) for <b>source</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the link to the source Device that contains administrative device information such as manufacture, serial number, etc.
     * </p> 
	 */
	public ResourceReferenceDt getSource() {  
		if (mySource == null) {
			mySource = new ResourceReferenceDt();
		}
		return mySource;
	}

	/**
	 * Sets the value(s) for <b>source</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the link to the source Device that contains administrative device information such as manufacture, serial number, etc.
     * </p> 
	 */
	public DeviceComponent setSource(ResourceReferenceDt theValue) {
		mySource = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>parent</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the link to the parent resource. For example: Channel is linked to its VMD parent.
     * </p> 
	 */
	public ResourceReferenceDt getParent() {  
		if (myParent == null) {
			myParent = new ResourceReferenceDt();
		}
		return myParent;
	}

	/**
	 * Sets the value(s) for <b>parent</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the link to the parent resource. For example: Channel is linked to its VMD parent.
     * </p> 
	 */
	public DeviceComponent setParent(ResourceReferenceDt theValue) {
		myParent = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>operationalStatus</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates current operational status of the device. For example: On, Off, Standby, etc.
     * </p> 
	 */
	public java.util.List<CodeableConceptDt> getOperationalStatus() {  
		if (myOperationalStatus == null) {
			myOperationalStatus = new java.util.ArrayList<CodeableConceptDt>();
		}
		return myOperationalStatus;
	}

	/**
	 * Sets the value(s) for <b>operationalStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates current operational status of the device. For example: On, Off, Standby, etc.
     * </p> 
	 */
	public DeviceComponent setOperationalStatus(java.util.List<CodeableConceptDt> theValue) {
		myOperationalStatus = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>operationalStatus</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates current operational status of the device. For example: On, Off, Standby, etc.
     * </p> 
	 */
	public CodeableConceptDt addOperationalStatus() {
		CodeableConceptDt newType = new CodeableConceptDt();
		getOperationalStatus().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>operationalStatus</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Indicates current operational status of the device. For example: On, Off, Standby, etc.
	 * </p>
	 * @param theValue The operationalStatus to add (must not be <code>null</code>)
	 */
	public DeviceComponent addOperationalStatus(CodeableConceptDt theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getOperationalStatus().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>operationalStatus</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Indicates current operational status of the device. For example: On, Off, Standby, etc.
     * </p> 
	 */
	public CodeableConceptDt getOperationalStatusFirstRep() {
		if (getOperationalStatus().isEmpty()) {
			return addOperationalStatus();
		}
		return getOperationalStatus().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>parameterGroup</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular.
     * </p> 
	 */
	public CodeableConceptDt getParameterGroup() {  
		if (myParameterGroup == null) {
			myParameterGroup = new CodeableConceptDt();
		}
		return myParameterGroup;
	}

	/**
	 * Sets the value(s) for <b>parameterGroup</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the parameter group supported by the current device component that is based on some nomenclature, e.g. cardiovascular.
     * </p> 
	 */
	public DeviceComponent setParameterGroup(CodeableConceptDt theValue) {
		myParameterGroup = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>measurementPrinciple</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc.
     * </p> 
	 */
	public BoundCodeDt<MeasmntPrincipleEnum> getMeasurementPrincipleElement() {  
		if (myMeasurementPrinciple == null) {
			myMeasurementPrinciple = new BoundCodeDt<MeasmntPrincipleEnum>(MeasmntPrincipleEnum.VALUESET_BINDER);
		}
		return myMeasurementPrinciple;
	}

	
	/**
	 * Gets the value(s) for <b>measurementPrinciple</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc.
     * </p> 
	 */
	public String getMeasurementPrinciple() {  
		return getMeasurementPrincipleElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>measurementPrinciple</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc.
     * </p> 
	 */
	public DeviceComponent setMeasurementPrinciple(BoundCodeDt<MeasmntPrincipleEnum> theValue) {
		myMeasurementPrinciple = theValue;
		return this;
	}
	
	

	/**
	 * Sets the value(s) for <b>measurementPrinciple</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the physical principle of the measurement. For example: thermal, chemical, acoustical, etc.
     * </p> 
	 */
	public DeviceComponent setMeasurementPrinciple(MeasmntPrincipleEnum theValue) {
		setMeasurementPrinciple(new BoundCodeDt<MeasmntPrincipleEnum>(MeasmntPrincipleEnum.VALUESET_BINDER, theValue));
		
/*
		getMeasurementPrincipleElement().setValueAsEnum(theValue);
*/
		return this;
	}

  
	/**
	 * Gets the value(s) for <b>productionSpecification</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the production specification such as component revision, serial number, etc.
     * </p> 
	 */
	public java.util.List<ProductionSpecification> getProductionSpecification() {  
		if (myProductionSpecification == null) {
			myProductionSpecification = new java.util.ArrayList<ProductionSpecification>();
		}
		return myProductionSpecification;
	}

	/**
	 * Sets the value(s) for <b>productionSpecification</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the production specification such as component revision, serial number, etc.
     * </p> 
	 */
	public DeviceComponent setProductionSpecification(java.util.List<ProductionSpecification> theValue) {
		myProductionSpecification = theValue;
		return this;
	}
	
	

	/**
	 * Adds and returns a new value for <b>productionSpecification</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the production specification such as component revision, serial number, etc.
     * </p> 
	 */
	public ProductionSpecification addProductionSpecification() {
		ProductionSpecification newType = new ProductionSpecification();
		getProductionSpecification().add(newType);
		return newType; 
	}

	/**
	 * Adds a given new value for <b>productionSpecification</b> ()
	 *
	 * <p>
	 * <b>Definition:</b>
	 * Describes the production specification such as component revision, serial number, etc.
	 * </p>
	 * @param theValue The productionSpecification to add (must not be <code>null</code>)
	 */
	public DeviceComponent addProductionSpecification(ProductionSpecification theValue) {
		if (theValue == null) {
			throw new NullPointerException("theValue must not be null");
		}
		getProductionSpecification().add(theValue);
		return this;
	}

	/**
	 * Gets the first repetition for <b>productionSpecification</b> (),
	 * creating it if it does not already exist.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the production specification such as component revision, serial number, etc.
     * </p> 
	 */
	public ProductionSpecification getProductionSpecificationFirstRep() {
		if (getProductionSpecification().isEmpty()) {
			return addProductionSpecification();
		}
		return getProductionSpecification().get(0); 
	}
  
	/**
	 * Gets the value(s) for <b>languageCode</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US.
     * </p> 
	 */
	public CodeableConceptDt getLanguageCode() {  
		if (myLanguageCode == null) {
			myLanguageCode = new CodeableConceptDt();
		}
		return myLanguageCode;
	}

	/**
	 * Sets the value(s) for <b>languageCode</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the language code for the human-readable text string produced by the device. This language code will follow the IETF language tag. Example: en-US.
     * </p> 
	 */
	public DeviceComponent setLanguageCode(CodeableConceptDt theValue) {
		myLanguageCode = theValue;
		return this;
	}
	
	

  
	/**
	 * Block class for child element: <b>DeviceComponent.productionSpecification</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the production specification such as component revision, serial number, etc.
     * </p> 
	 */
	@Block()	
	public static class ProductionSpecification 
	    extends  BaseIdentifiableElement 	    implements IResourceBlock {
	
	@Child(name="specType", type=CodeableConceptDt.class, order=0, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the specification type, such as, serial number, part number, hardware revision, software revision, etc."
	)
	private CodeableConceptDt mySpecType;
	
	@Child(name="componentId", type=IdentifierDt.class, order=1, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacture can make use of."
	)
	private IdentifierDt myComponentId;
	
	@Child(name="productionSpec", type=StringDt.class, order=2, min=0, max=1, summary=false, modifier=false)	
	@Description(
		shortDefinition="",
		formalDefinition="Describes the printable string defining the component."
	)
	private StringDt myProductionSpec;
	

	@Override
	public boolean isEmpty() {
		return super.isBaseEmpty() && ca.uhn.fhir.util.ElementUtil.isEmpty(  mySpecType,  myComponentId,  myProductionSpec);
	}
	
	@Override
	public <T extends IElement> List<T> getAllPopulatedChildElementsOfType(Class<T> theType) {
		return ca.uhn.fhir.util.ElementUtil.allPopulatedChildElements(theType, mySpecType, myComponentId, myProductionSpec);
	}

	/**
	 * Gets the value(s) for <b>specType</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the specification type, such as, serial number, part number, hardware revision, software revision, etc.
     * </p> 
	 */
	public CodeableConceptDt getSpecType() {  
		if (mySpecType == null) {
			mySpecType = new CodeableConceptDt();
		}
		return mySpecType;
	}

	/**
	 * Sets the value(s) for <b>specType</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the specification type, such as, serial number, part number, hardware revision, software revision, etc.
     * </p> 
	 */
	public ProductionSpecification setSpecType(CodeableConceptDt theValue) {
		mySpecType = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>componentId</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacture can make use of.
     * </p> 
	 */
	public IdentifierDt getComponentId() {  
		if (myComponentId == null) {
			myComponentId = new IdentifierDt();
		}
		return myComponentId;
	}

	/**
	 * Sets the value(s) for <b>componentId</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the internal component unique identification. This is a provision for manufacture specific standard components using a private OID. 11073-10101 has a partition for private OID semantic that the manufacture can make use of.
     * </p> 
	 */
	public ProductionSpecification setComponentId(IdentifierDt theValue) {
		myComponentId = theValue;
		return this;
	}
	
	

  
	/**
	 * Gets the value(s) for <b>productionSpec</b> ().
	 * creating it if it does
	 * not exist. Will not return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the printable string defining the component.
     * </p> 
	 */
	public StringDt getProductionSpecElement() {  
		if (myProductionSpec == null) {
			myProductionSpec = new StringDt();
		}
		return myProductionSpec;
	}

	
	/**
	 * Gets the value(s) for <b>productionSpec</b> ().
	 * creating it if it does
	 * not exist. This method may return <code>null</code>.
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the printable string defining the component.
     * </p> 
	 */
	public String getProductionSpec() {  
		return getProductionSpecElement().getValue();
	}

	/**
	 * Sets the value(s) for <b>productionSpec</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the printable string defining the component.
     * </p> 
	 */
	public ProductionSpecification setProductionSpec(StringDt theValue) {
		myProductionSpec = theValue;
		return this;
	}
	
	

 	/**
	 * Sets the value for <b>productionSpec</b> ()
	 *
     * <p>
     * <b>Definition:</b>
     * Describes the printable string defining the component.
     * </p> 
	 */
	public ProductionSpecification setProductionSpec( String theString) {
		myProductionSpec = new StringDt(theString); 
		return this; 
	}

 


	}




    @Override
    public String getResourceName() {
        return "DeviceComponent";
    }
    
    public ca.uhn.fhir.context.FhirVersionEnum getStructureFhirVersionEnum() {
    	return ca.uhn.fhir.context.FhirVersionEnum.DSTU2;
    }


}
