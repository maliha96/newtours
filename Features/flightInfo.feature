@flightInfo
Feature: Flight Information

As a site visitor
I want to enter my flight information
So that I can purchase tickets

Scenario: Purchasing tickets

Given I am on the fight information page
When I enter my flight information
And I type first name and last name for passengers
And I enter the credit card information
Then I click secure purchase


 