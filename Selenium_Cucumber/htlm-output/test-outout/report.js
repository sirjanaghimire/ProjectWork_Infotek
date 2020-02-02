$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ghimi/eclipse-workspace/Selenium_cucumber/src/test/java/Features/Login.feature");
formatter.feature({
  "line": 1,
  "name": "feature login feature of newtours",
  "description": "",
  "id": "feature-login-feature-of-newtours",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "login test for newtours",
  "description": "",
  "id": "feature-login-feature-of-newtours;login-test-for-newtours",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "comments": [
    {
      "line": 4,
      "value": "#Given I am on the travel portal \"http://newtours.demoaut.com/\""
    }
  ],
  "line": 5,
  "name": "I am on the travel portal \"http://demo.guru99.com/test/newtours/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I type login  \u003d \"a\" and password \u003d \"a\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click sing-in button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should get signoff link",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "http://demo.guru99.com/test/newtours/",
      "offset": 27
    }
  ],
  "location": "LoginSteps.i_am_on_the_travel_portal(String)"
});
formatter.result({
  "duration": 16961847900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "a",
      "offset": 17
    },
    {
      "val": "a",
      "offset": 36
    }
  ],
  "location": "LoginSteps.i_type_login_and_password(String,String)"
});
formatter.result({
  "duration": 256063700,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_click_sing_in_button()"
});
formatter.result({
  "duration": 8751412300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSteps.i_shoud_get_link()"
});
formatter.result({
  "duration": 5399081000,
  "status": "passed"
});
});