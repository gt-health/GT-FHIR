#! /bin/bash

#This is a simple endpoint test script for GT-FHIR
#It uses wget to call out to GT-FHIR
# The first param can change the base domain. default=localhost
# The second param can change the port number. default=8080

logError ()
{
  echo "WGET URL: $1"
  echo "RESULT: $2"
  exit 1
}

echo "Starting GT-FHIRPostInstallTest script"

BASE_DOMAIN=$1
BASE_PORT=$2
WGET_PARAMS="-q -O -"

ENDPOINTS=(/Patient /Condition /Encounter /Medication /MedicationOrder /Observation /Organization /Practitioner /Procedure)
IDS=(1 16 4 1 1 1 1 128 7)

if [ -z $1 ]
  then
    BASE_DOMAIN=localhost
fi
if [ -z $2 ]
  then
    BASE_PORT=8080
fi
BASE_URL=http://$BASE_DOMAIN:$BASE_PORT/gt-fhir-webapp/base

NUM_OF_ENDPOINTS=${#ENDPOINTS[@]}
INDEX=0
while [ $INDEX -lt $NUM_OF_ENDPOINTS ]
do
  ENDPOINT=${ENDPOINTS[INDEX]}
  ID=${IDS[INDEX]}
  SEARCH_URL=$BASE_URL$ENDPOINT?_id=$ID
  DIRECT_GET_URL=$BASE_URL$ENDPOINT/$ID
  SEARCH_COMMAND="wget $SEARCH_URL $WGET_PARAMS"
  echo "$SEARCH_COMMAND ......"
  SEARCH_RESULT=eval $SEARCH_COMMAND
  if [ $? -ne 0 ]
    then
      echo "Error code $? on search"
      logError $SEARCH_URL $SEARCH_RESULT
  fi
  DIRECT_GET_COMMAND="wget $DIRECT_GET_URL $WGET_PARAMS"
  echo "$DIRECT_GET_COMMAND ......"
  DIRECT_GET_RESULT=eval $DIRECT_GET_COMMAND
  if [ $? -ne 0 ]
    then
      echo "Error code $? on direct GET"
      logError $DIRECT_GET_URL $DIRECT_GET_RESULT
  fi
  INDEX=$((INDEX+1))
done

echo "Stopping GT-FHIRPostInstallTest script"

exit 0
