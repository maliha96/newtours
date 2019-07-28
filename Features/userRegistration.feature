@userRegistration
Feature: User Registration

As site visitor
I want to register for an account
So that I can purchase a flight ticket

@registerValidUser
Scenario: register a valid user

Given I am on the homepage
When I click on Register link
And I enter first name, last name, user name, password, and confirm password
And i click on submit button
Then I receive sucessful user creation message
