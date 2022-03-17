$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Regression/FacebookPage.feature");
formatter.feature({
  "name": "Facebook page login funtionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@LogIn"
    },
    {
      "name": "@P1"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "FacebookPageSteps.user_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters the url",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookPageSteps.user_enters_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate FB page login function with invalid credentials",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@LogIn"
    },
    {
      "name": "@P1"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@TC01"
    },
    {
      "name": "@TC01_Login"
    }
  ]
});
formatter.step({
  "name": "User enters the username and password",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ]
    },
    {
      "cells": [
        "Raja",
        "4567890"
      ]
    },
    {
      "cells": [
        "Karthik",
        "4356789"
      ]
    },
    {
      "cells": [
        "Siva",
        "45678"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FacebookPageSteps.user_enters_the_username_and_password(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FacebookPageSteps.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to login failure page",
  "keyword": "Then "
});
formatter.match({
  "location": "FacebookPageSteps.user_navigates_to_login_failure_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});