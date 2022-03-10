package org.step3;

import java.util.List;
import java.util.Map;


import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition{
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
	    
	}

	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password(io.cucumber.datatable.DataTable dataTable) {
	   
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
	    
	}

	@Then("Error is displayed")
	public void error_is_displayed() {
	    System.out.println("Error page is displayed");
	}



}
