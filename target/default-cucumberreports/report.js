$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/placeValidations.feature");
formatter.feature({
  "name": "Validating Place API\u0027s",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Verify if Place is being successfully added using AddPlaceAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@AddPlace"
    }
  ]
});
formatter.step({
  "name": "Add Place Payload with \"\u003cname\u003e\" \"\u003clanguage\u003e\" \"\u003caddress\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "name": "user calls \"AddPlaceAPI\" with \"Post\" http request",
  "keyword": "When "
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.step({
  "name": "\"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify place_Id created maps to \"\u003cname\u003e\" using \"getPlaceAPI\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "name",
        "language",
        "address"
      ]
    },
    {
      "cells": [
        "AAhouse",
        "English",
        "World cross center"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify if Place is being successfully added using AddPlaceAPI",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@AddPlace"
    }
  ]
});
formatter.step({
  "name": "Add Place Payload with \"AAhouse\" \"English\" \"World cross center\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.add_Place_Payload_with(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"AddPlaceAPI\" with \"Post\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"scope\" in response body is \"APP\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify place_Id created maps to \"AAhouse\" using \"getPlaceAPI\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.verify_place_Id_created_maps_to_using(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify if Delete Place functionality is working",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@DeletePlace"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "DeletePlace Payload",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.deleteplace_Payload()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user calls \"deletePlaceAPI\" with \"POST\" http request",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.user_calls_with_http_request(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the API call got success with status code 200",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.the_API_call_got_success_with_status_code(Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "\"status\" in response body is \"OK\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.in_response_body_is(String,String)"
});
formatter.result({
  "status": "passed"
});
});