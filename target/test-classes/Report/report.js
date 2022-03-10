$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Facebook.feature");
formatter.feature({
  "name": "verify Facebook login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify login functionality for valid username and valid password",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on facebook login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_is_on_facebook_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and invalid password",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_enters_valid_username_and_invalid_password()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks the login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_clicks_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Error is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.error_is_displayed()"
});
formatter.result({
  "status": "passed"
});
});