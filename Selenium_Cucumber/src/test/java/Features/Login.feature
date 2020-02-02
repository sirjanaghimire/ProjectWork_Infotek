Feature: feature login feature of newtours
# Data driven test with without examples keywords.

Scenario: login test for newtours
#	Given I am on the travel portal "http://newtours.demoaut.com/"
    Given I am on the travel portal "http://demo.guru99.com/test/newtours/"
    When I type login = "a" and password = "a"
    And I click sing-in button
    Then I should get signoff link


#Feature: feature login feature of newtours
## Data driven test with with examples keywords + scenario outline.

#Scenario outline: login test for newtours
##	Given I am on the travel portal "http://newtours.demoaut.com/"
#    Given I am on the travel portal "http://demo.guru99.com/test/newtours/"
#    When I type login = "<a>" and password = "<a>"
#    And I click sing-in button
#    Then I should get signoff link
# And user enters user detail "<firstName>","<lastName>" and"<position>"

#Examples:
	| login | password | firstName | lastName | position |
	|   a 	|	a	   |	sirjana|	ghimire	| manager|
# 