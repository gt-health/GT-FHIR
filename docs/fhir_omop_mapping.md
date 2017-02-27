[Back to main page](index.md)
# FHIR to OMOP CDM Mappings
This document shows how FHIR resources and OMOP CDM can be mapped. Please note that the work is still in progress. Your comments and feedback are greatly appreciated. Please contact us at ** if you are willing to make contributions to this project.
## FHIR DSTU2 to OMOP CDM v5
The following table shows basic mappings between FHIR DSTU2 resources and OMOP CDM v5 mapping.
>Put table here !!!

## Mapping Implementation in GT-FHIR v2
While v1 makes a direct mapping as shown on the table above, the v2 will use intermediate (or staging) tables/databases for FHIR to OMOP CDM mappings. This new approach serves two critical operational needs.
  1. Data Validation and Coding Transformations: For more in-depth data validations, the FHIR resources will be intially mapped to the intermediate data schema, which is designed to adapt FHIR and OMOP CDM. When a ETL procedure is executed, the data will be validated and transformed to appropriate concept data in OMOP CDM. This allows the data stored in OMOP CDM to be better ready for such as analytic applications.
  2. Pre-processing Clinical Data: When the OMOP tables are populated from the intermediate table, the other supplmental tables such as *_era tables are also populated. 
