Feature: verify Facebook login functionality

Scenario Outline: verify login functionality for valid username and passwordy

Given user is on facebook login page

When user enters "<username>" and "<password>"

And user clicks the login button

When users select location and hotels and roomtype and childrenroomtype

And user clicks the search button

When users select radiobutton

And user clicks the continue

When users enters "<firstname>" and "<lastname>" and "<address>" and "<creditcard>" as well as select month and year as well as "<cvv>"

And user clicks the booknow

And user clicks the myitinerary


Then Error is displayed

Examples:

				| username | password | firstname | lastname | address | creditcard | cvv |
				| Deepankumar | Deepan@96 | Deepan | Raj | Omr | 9876543210456789 | 789 |	#valid username,valid password,firstname,lastname,address,creditcard,cvv
					