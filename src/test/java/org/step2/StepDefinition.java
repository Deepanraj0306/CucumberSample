package org.step2;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	WebDriver driver;
	@Given("user is on facebook login page")
	public void user_is_on_facebook_login_page() {
	   WebDriverManager.chromedriver().setup();
	   driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   driver.manage().window().maximize();
	}

	@When("user enters valid username and invalid password")
	public void user_enters_valid_username_and_invalid_password() {
	    WebElement txtUser = driver.findElement(By.id("email"));
	    txtUser.sendKeys("Welcome");
	    WebElement txtPass = driver.findElement(By.id("pass"));
	    txtPass.sendKeys("testing");
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
	    WebElement btnLogin = driver.findElement(By.name("login"));
	    btnLogin.click();
	}

	@Then("Error is displayed")
	public void error_is_displayed() {
	   System.out.println("Error page is displayed");
	}




}
