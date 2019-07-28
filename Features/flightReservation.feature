@flightReservation
Feature: Flight Reservation

As site visitor
I want to book a flight
So that I can go on vacation

Scenario: Enter your flight information

Given I am on the homepage
When I enter my username and password
And I click on the Sign-in button
And I select tripType, passengers, departing from, on, arriving in, returning, class, airline
And I click continue
And I enter the flight information
Then I click continue 



