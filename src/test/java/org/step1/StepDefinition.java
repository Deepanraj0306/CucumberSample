package org.step1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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
	   driver.get("http://adactinhotelapp.com/");
	   driver.manage().window().maximize();
	}

	@When("user enters {string} and {string}")
	public void user_enters_and(String username, String password) {
	    WebElement txtUser = driver.findElement(By.id("username"));
	    txtUser.sendKeys(username);
	    WebElement txtPass = driver.findElement(By.id("password"));
	    txtPass.sendKeys(password);
	}

	@When("user clicks the login button")
	public void user_clicks_the_login_button() {
	    WebElement btnLogin = driver.findElement(By.name("login"));
	    btnLogin.click();
	}
	
	@When("users select location and hotels and roomtype and childrenroomtype")
	public void users_select_location_and_hotels_and_roomtype_and_childrenroomtype() {
		WebElement ddnLocation = driver.findElement(By.xpath("//select[@name='location']"));
		Select s=new Select(ddnLocation);
		s.selectByVisibleText("Sydney");
		WebElement ddnHotels = driver.findElement(By.xpath("//select[@name='hotels']"));
		Select s1=new Select(ddnHotels);
		s1.selectByVisibleText("Hotel Creek");
		WebElement ddnRoom = driver.findElement(By.xpath("//select[@name='room_type']"));
		Select s2=new Select(ddnRoom);
		s2.selectByVisibleText("Standard");
		WebElement ddnChildren= driver.findElement(By.xpath("//select[@name='child_room']"));
		Select s3=new Select(ddnChildren);
		s3.selectByVisibleText("4 - Four");
	}


	@When("user clicks the search button")
	public void user_clicks_the_search_button() {
		WebElement btnSearch = driver.findElement(By.xpath("//input[@id='Submit']"));
		btnSearch.click();
	    
	}
	
	@When("users select radiobutton")
	public void users_select_radiobutton() {
	    WebElement btnRadio = driver.findElement(By.id("radiobutton_0"));
	    btnRadio.click();
	}

	@When("user clicks the continue")
	public void user_clicks_the_continue() {
	    WebElement btnContinue = driver.findElement(By.id("continue"));
	    btnContinue.click();
	}

	@When("users enters {string} and {string} and {string} and {string} as well as select month and year as well as {string}")
	public void users_enters_and_and_and_as_well_as_select_month_and_year_as_well_as(String firstname, String lastname, String address, String creditcard, String cvv) {
	    WebElement txtFirstname = driver.findElement(By.xpath("//input[@id='first_name']"));
	    txtFirstname.sendKeys(firstname);
	    
	    WebElement txtLastname = driver.findElement(By.xpath("//input[@id='last_name']"));
	    txtLastname.sendKeys(lastname);
	    
	    WebElement txtAddress = driver.findElement(By.xpath("//textarea[@id='address']"));
	    txtAddress.sendKeys(address);
	    
	    WebElement txtCreditcard = driver.findElement(By.xpath("//input[@id='cc_num']"));
	    txtCreditcard.sendKeys(creditcard);
	    
	    WebElement ddnCredittype = driver.findElement(By.xpath("//select[@id='cc_type']"));
	    Select s=new Select(ddnCredittype);
	    s.selectByVisibleText("American Express");
	    
	    WebElement ddnMonth = driver.findElement(By.xpath("//select[@id='cc_exp_month']"));
	    Select s1=new Select(ddnMonth);
	    s1.selectByVisibleText("January");
	    
	    WebElement ddnYear = driver.findElement(By.xpath("//select[@id='cc_exp_year']"));
	    Select s2=new Select(ddnYear);
	    s2.selectByVisibleText("2022");
	    
	    WebElement txtCvv = driver.findElement(By.xpath("//input[@id='cc_cvv']"));
	    txtCvv.sendKeys(cvv);
	    
	    
	}

	@When("user clicks the booknow")
	public void user_clicks_the_booknow() {
	    WebElement btnBooknow = driver.findElement(By.xpath("//input[@id='book_now']"));
	    btnBooknow.click();
	}
	
	@When("user clicks the myitinerary")
	public void user_clicks_the_myitinerary() {
	    WebElement btnMyitinerary = driver.findElement(By.xpath("//input[@id='book_now']"));
	    btnMyitinerary.click();
	    //driver.findElement(By.xpath("//a[text()='Booked Itinerary']")).click();
	}
	
	@Then("Error is displayed")
	public void error_is_displayed() {
	   System.out.println("Error page is displayed");
	}


}
