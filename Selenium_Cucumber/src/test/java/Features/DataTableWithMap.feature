Feature: login feature of newtours.com
@SmokeTest @integration
 Scenario: Book a flight from newtours websides
 Given user on the login page
 When Title of the login page is welcome mercury tour
 And user hit the register link
Then user get the register page
And user enter the information firstname,lastname,state and postelcode
	|firstname|	lastname|state|postelcode|
	| sirjana | ghimire | va | 22033 |
	| Narayan | Acharya | GA | 30085 |
	| Lalita  | ghimire | Tx | 300025 |
Then user click the submit button	
Then conformation page should display as Register mercury tours
Then close browser

@End2EndTest
 Scenario: Book a flight from newtours websides
 Given user on the login page
 
 @SmokeTest
  Scenario: Book a flight from newtours websides
 Given user on the login page
 
 @integrationTest
  Scenario: Book a flight from newtours websides
 Given user on the login page
 
# Hooks in cucumber
#@Before
#@After

# taged Hook
# @Before("Tagname")

