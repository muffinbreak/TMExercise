#Author: Stephanie Gazel

#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Cars for sale related scenarios

Background: User is on Motors Page

Given user has navigated to the "TMSandbox website"
When user clicks on the "Motors" link
Then user is navigated to the motors page


Scenario: Confirming there at least 1 listing in the used car section of the website

Given user has navigated to the Cars for sale page
When user clicks on the more link 
Then user sees at least "1" listing in the used cars category

#Scenario: Check that the make Kia exists
#
#Given user has navigated to the Cars for sale page
#When user scans through the brands
#Then user confirms "Kia" brand exists 

#Scenario: Confirm details of an existing Used Car listing
#
#Given user has navigated to the Cars for sale page
#Given user has clicked the more... button
#When user clicks on the listing
#Then user confirms the details such as "Number plate", "Kilometres", "Body", "Seats", "Fuel type", "Engine"




