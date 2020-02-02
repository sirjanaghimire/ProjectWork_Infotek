$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/ghimi/eclipse-workspace/Selenium_cucumber/src/test/java/Features/DataTableWithMap.feature");
formatter.feature({
  "line": 1,
  "name": "login feature of newtours.com",
  "description": "",
  "id": "login-feature-of-newtours.com",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Book a flight from newtours websides",
  "description": "",
  "id": "login-feature-of-newtours.com;book-a-flight-from-newtours-websides",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user on the login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Title of the login page is welcome mercury tour",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user hit the register link",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user get the register page",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user enter the information firstname,lastname,state and postelcode",
  "rows": [
    {
      "cells": [
        "firstname",
        "lastname",
        "state",
        "postelcode"
      ],
      "line": 9
    },
    {
      "cells": [
        "sirjana",
        "ghimire",
        "va",
        "22033"
      ],
      "line": 10
    },
    {
      "cells": [
        "Narayam",
        "Acharya",
        "GA",
        "30085"
      ],
      "line": 11
    },
    {
      "cells": [
        "Lalita",
        "ghimire",
        "Tx",
        "300025"
      ],
      "line": 12
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "user click the submit button",
  "keyword": "Then "
});
formatter.step({
  "line": 14,
  "name": "conformation page should display as Register mercury tours",
  "keyword": "Then "
});
formatter.step({
  "line": 15,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTableWithMapsSteps.user_on_the_login_page()"
});
formatter.result({
  "duration": 7828277500,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWithMapsSteps.title_of_the_login_page_is_welcome_mercury_tour()"
});
formatter.result({
  "duration": 8746100,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWithMapsSteps.user_hit_the_register_link()"
});
formatter.result({
  "duration": 386137200,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWithMapsSteps.user_allow_to_open_register_page()"
});
formatter.result({
  "duration": 35787900,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWithMapsSteps.user_enter_the_information_firstname_lastname_state_and_postelcode(DataTable)"
});
formatter.result({
  "duration": 30341596900,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWithMapsSteps.user_click_the_submit_button()"
});
formatter.result({
  "duration": 1977693900,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWithMapsSteps.conformation_page_should_display_as_Register_mercury_tours()"
});
formatter.result({
  "duration": 3720800,
  "status": "passed"
});
formatter.match({
  "location": "DataTableWithMapsSteps.close_browser()"
});
formatter.result({
  "duration": 1417497500,
  "status": "passed"
});
});