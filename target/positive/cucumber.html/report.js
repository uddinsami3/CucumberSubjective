$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Register.feature");
formatter.feature({
  "line": 2,
  "name": "Test User Registeration Feature.",
  "description": "Description: The purpose of this feature is to test the User Registeration",
  "id": "test-user-registeration-feature.",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Syed"
    }
  ]
});
formatter.scenarioOutline({
  "line": 8,
  "name": "Test if the User Registeration is successful",
  "description": "",
  "id": "test-user-registeration-feature.;test-if-the-user-registeration-is-successful",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 9,
  "name": "user entered the registeration details",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "take screenshot of the entered details",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "submit the user registerarion details",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify if the \"\u003cuser\u003e\" is registered succesfully",
  "keyword": "And "
});
formatter.examples({
  "line": 14,
  "name": "",
  "description": "",
  "id": "test-user-registeration-feature.;test-if-the-user-registeration-is-successful;",
  "rows": [
    {
      "cells": [
        "user"
      ],
      "line": 15,
      "id": "test-user-registeration-feature.;test-if-the-user-registeration-is-successful;;1"
    },
    {
      "cells": [
        "naqeeb123"
      ],
      "line": 16,
      "id": "test-user-registeration-feature.;test-if-the-user-registeration-is-successful;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 13209249100,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "User navigates to registeration website",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "User navigates to \"http://demo.guru99.com/test/newtours/register.php\"",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "http://demo.guru99.com/test/newtours/register.php",
      "offset": 19
    }
  ],
  "location": "RegisterPageSteps.user_navigates_to_something(String)"
});
formatter.result({
  "duration": 4420164300,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Test if the User Registeration is successful",
  "description": "",
  "id": "test-user-registeration-feature.;test-if-the-user-registeration-is-successful;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@Syed"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "user entered the registeration details",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "take screenshot of the entered details",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "submit the user registerarion details",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "verify if the \"naqeeb123\" is registered succesfully",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.match({
  "location": "RegisterPageSteps.user_entered_the_registeration_details()"
});
formatter.result({
  "duration": 3538118300,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.take_screenshot_of_the_entered_details()"
});
formatter.result({
  "duration": 3065788700,
  "status": "passed"
});
formatter.match({
  "location": "RegisterPageSteps.submit_the_user_registerarion_details()"
});
formatter.result({
  "duration": 1062634100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "naqeeb123",
      "offset": 15
    }
  ],
  "location": "RegisterPageSteps.verify_if_the_something_is_registered_succesfully(String)"
});
formatter.result({
  "duration": 237028000,
  "status": "passed"
});
formatter.after({
  "duration": 1534770400,
  "status": "passed"
});
});