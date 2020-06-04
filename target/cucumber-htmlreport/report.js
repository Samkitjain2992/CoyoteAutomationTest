$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Login.feature");
formatter.feature({
  "line": 1,
  "name": "Login Page Functionality",
  "description": "",
  "id": "login-page-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 24,
  "name": "Verify error message for unregistered credential",
  "description": "",
  "id": "login-page-functionality;verify-error-message-for-unregistered-credential",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User navigates to \"\u003cCoyoteApplication\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User enter emailID as \"\u003cemailId\u003e\" and password as \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Error message for unregistered credential is \"\u003cmessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 29,
  "name": "",
  "description": "",
  "id": "login-page-functionality;verify-error-message-for-unregistered-credential;",
  "rows": [
    {
      "cells": [
        "CoyoteApplication",
        "emailId",
        "password",
        "message"
      ],
      "line": 30,
      "id": "login-page-functionality;verify-error-message-for-unregistered-credential;;1"
    },
    {
      "cells": [
        "Coyote Software",
        "samkitjain2992@gmail.com",
        "samkitjain",
        "Invalid email/password combination"
      ],
      "line": 31,
      "id": "login-page-functionality;verify-error-message-for-unregistered-credential;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 14806104600,
  "status": "passed"
});
formatter.before({
  "duration": 14292229400,
  "status": "passed"
});
formatter.before({
  "duration": 49934100,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Verify error message for unregistered credential",
  "description": "",
  "id": "login-page-functionality;verify-error-message-for-unregistered-credential;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 23,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "User navigates to \"Coyote Software\"",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 26,
  "name": "User enter emailID as \"samkitjain2992@gmail.com\" and password as \"\u003cPassword\u003e\"",
  "matchedColumns": [
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "User click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "Error message for unregistered credential is \"Invalid email/password combination\"",
  "matchedColumns": [
    3
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Coyote Software",
      "offset": 19
    }
  ],
  "location": "LoginSD.user_navigates_to(String)"
});
formatter.result({
  "duration": 826657200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "samkitjain2992@gmail.com",
      "offset": 23
    },
    {
      "val": "\u003cPassword\u003e",
      "offset": 66
    }
  ],
  "location": "LoginSD.user_enter_emailID_as_and_password_as(String,String)"
});
formatter.result({
  "duration": 5949806500,
  "status": "passed"
});
formatter.match({
  "location": "LoginSD.user_click_on_login_button()"
});
formatter.result({
  "duration": 3090472200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Invalid email/password combination",
      "offset": 46
    }
  ],
  "location": "LoginSD.errorMessageForUnregisteredCredentialIs(String)"
});
formatter.result({
  "duration": 126467700,
  "status": "passed"
});
formatter.after({
  "duration": 695308500,
  "status": "passed"
});
});