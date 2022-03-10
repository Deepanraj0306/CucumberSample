package org.step4;
import org.base.BaseClass; 
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends BaseClass{

	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
	    
	}

	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password(io.cucumber.datatable.DataTable dataTable) {
	    List<Map<String, String>> asMaps = dataTable.asMaps();
	    Map<String, String> map = asMaps.get(3);
	    String string = map.get("username");
	    String string2 = asMaps.get(0).get("password");
	    
	   
	    WebElement txtEmail = locateById("email");
	    inputText(txtEmail, string);
	    
	    WebElement txtPass = locateById("pass");
	    inputText(txtPass, string2);
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
	    WebElement btnLogin = locateByName("login");
	    click(btnLogin);
		
	
	}

	@Then("Error is displayed")
	public void error_is_displayed() {
	    
	}

	
}
