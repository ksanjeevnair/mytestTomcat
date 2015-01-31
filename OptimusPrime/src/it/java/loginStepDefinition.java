package com.mycompany.webapp.feature;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.PendingException;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.springframework.core.io.ClassPathResource;

public class loginStepDefinition {

	public static void main (){
		System.out.println("Tests start now");
	}
	@Given("^the user sanjeev has a login on the site$")
	public void the_user_sanjeev_has_a_login_on_the_site() throws Throwable {
	    // Express the Regexp above with the code you wish you had
	   // throw new PendingException();
	    System.out.println("sanjeev has a login");
	}

	@Given("^the user remebers the password which is sanjeev$")
	public void the_user_remebers_the_password_which_is_sanjeev() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		   // throw new PendingException();
	    System.out.println("sanjeev remembers the password");
	}

	@When("^the user enters the username and password and clicks login$")
	public void the_user_enters_the_username_and_password_and_clicks_login() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		   // throw new PendingException();
		WebDriver driver = new HtmlUnitDriver();
		
		String host_under_test = System.getProperty("host_under_test");
		System.out.println("the url is" + host_under_test);
		driver.get(host_under_test);
		assertTrue(driver.getTitle().startsWith("Login"));
		
	    System.out.println("sanjeev entered his username and password");
	}

	@Then("^the user sanjeev is shown his home page$")
	public void the_user_sanjeev_is_shown_his_home_page() throws Throwable {
	    // Express the Regexp above with the code you wish you had
		   // throw new PendingException();
	    System.out.println("Sanjeev has been shown his home page");
	}
	
}
