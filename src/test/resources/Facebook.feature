Feature: verify Facebook login functionality

Scenario: verify login functionality for valid username and valid password

Given user is on facebook login page

When user enters valid username and invalid password

And user clicks the login button

Then Error is displayed


