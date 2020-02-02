$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ghimi/eclipse-workspace/Selenium_cucumber/src/test/java/Features/TravelPortal.feature");
formatter.feature({
  "line": 1,
  "name": "login feature of newtours",
  "description": "",
  "id": "login-feature-of-newtours",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Book a flight from newtours",
  "description": "",
  "id": "login-feature-of-newtours;book-a-flight-from-newtours",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "title of login page is welcome mercury tours",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user hit on the login button",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user should get find a Flight page",
  "keyword": "Then "
});
formatter.match({
  "location": "TravelPortalSteps.I_am_on_the_login_page()"
});
formatter.result({
  "duration": 5410353100,
  "status": "passed"
});
formatter.match({
  "location": "TravelPortalSteps.title_of_login_page_welcome_mercury_tours()"
});
formatter.result({
  "duration": 9197401,
  "status": "passed"
});
formatter.match({
  "location": "TravelPortalSteps.user_enter_username_and_password()"
});
formatter.result({
  "duration": 60893500,
  "status": "passed"
});
formatter.match({
  "location": "TravelPortalSteps.user_hit_on_the_login_button()"
});
formatter.result({
  "duration": 5232243400,
  "status": "passed"
});
formatter.match({
  "location": "TravelPortalSteps.user_should_get_find_a_flight_page()"
});
formatter.result({
  "duration": 5148700,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Find a Flight: Mercury Tours:]\u003e but was:\u003c[Welcome: Mercury Tours]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat stepsDefination.TravelPortalSteps.user_should_get_find_a_flight_page(TravelPortalSteps.java:51)\r\n\tat ✽.Then user should get find a Flight page(C:/Users/ghimi/eclipse-workspace/Selenium_cucumber/src/test/java/Features/TravelPortal.feature:7)\r\n",
  "status": "failed"
});
});