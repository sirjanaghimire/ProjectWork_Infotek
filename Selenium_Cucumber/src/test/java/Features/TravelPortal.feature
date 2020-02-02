Feature: login feature of newtours
# hard corded
 Scenario: Book a flight from newtours
 Given I am on the login page
 When title of login page is welcome mercury tours
 And user enters username and password
And user hit on the login button
Then user should get find a Flight page

