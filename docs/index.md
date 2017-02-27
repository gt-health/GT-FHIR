# The FHIR Project at Georgia Tech

GT-FHIR is a Georgia Tech Fast Healthcare Interoperability Resources (FHIR) project to build a FHIR resource on Observational Medical Outcomes Partnership (OMOP) common data model (CDM). It is built on top of <a href="http://hapifhir.io">Hapi Fhir</a> reference implementation. Currently the objects model is built in conformance to Fhir spec DSTU2 - some features in DSTU1 are not supported.

The key component of GT-FHIR is a data access layer that has been modified to support any database schema. The component allows OMOP CDM to be deployed as a backend database. FHIR resources from/to OMOP CDM mapping is done at the gt-fhir-entities. However, as FHIR and OMOP CDM cannot be mapped one-to-one, some of data elements are set statically. Some mappings require multiple FHIR entity-jpa classes to support bidirectional mappings. 

For more detail information about the mapping, visit [**Mapping Document**](fhir_omop_mapping.md).

This project is still in progress. More mappings and features will be implemented as a need-basis. GT-FHIR consists of several sub-projects. Please see the following notes for what the base projects are. For more details on source codes, visit [GT-FHIR Project Github](https://github.com/gt-health/GT-FHIR). 

## People
 * Myung Choi - FHIR
 * Richard Starr - OMOP CDM
 * Michael Riley - Deployment Scripts
 
## Related Publications
 1. M. Choi, R. Starr, M. Braunstein, and J. Duke, "OHDSI on FHIR Platform Development with OMOP CDM mapping to FHIR Resources," [ODHSI 2016](http://www.ohdsi.org/web/wiki/lib/exe/fetch.php?media=resources:ohdsionfhir_gatech.pdf)
 2. H. Su, A. Henderson, M. Choi, R. Starr, and J. Sun, "Clinical Predictive Modeling Development and Deployment with OMOP CDM and FHIR," [ODHSI 2015](http://www.ohdsi.org/web/wiki/lib/exe/fetch.php?media=resources:gt_ohdsi-abs-final.pdf)
 3. K. Mohammed, M. Choi, A. Henderson, S. Iyengar, M. Braunstein, and J. Sun, "Clinical Predictive Modeling Development and Deployment through FHIR Web Services," [AMIA 2015](https://knowledge.amia.org/59310-amia-1.2741865/t004-1.2745466/f004-1.2745467/2248709-1.2745684/2248709-1.2745685?qr=1)
