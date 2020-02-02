Feature: login feature of newtours.com

 Scenario: Book a flight from newtours webside
 Given user already on the login page
 When Title of the login page is welcome mercury tours
 And user click the register link
Then user should get register page
And user enter the firstname,lastname,state and postelcode
	| sirjana | ghimire | va | 22033 |
And user hit the submit button	
Then conformation page should display as Register mercury tour 
Then close the browser

