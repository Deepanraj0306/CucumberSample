Feature: verify Facebook login functionality

Scenario: verify login functionality for valid username and valid password

Given user is on facebook login page

When user enters valid username and invalid password
| username | password |
| user1 | test123 |
| user2 | test456 |
| user3 | test789 |
| user4 | test678 |

And user clicks the login button

Then Error is displayed