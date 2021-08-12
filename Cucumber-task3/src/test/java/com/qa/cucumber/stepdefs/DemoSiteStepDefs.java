package com.qa.cucumber.stepdefs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.cucumber.DemoSiteHooks;
import com.qa.cucumber.pages.DemoAddUserPage;
import com.qa.cucumber.pages.DemoHomePage;
import com.qa.cucumber.pages.DemoLoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DemoSiteStepDefs {
	
	private WebDriver driver;
	private DemoHomePage homePage;
	private DemoAddUserPage addUserPage;
	private DemoLoginPage loginPage;
	
	public DemoSiteStepDefs(DemoSiteHooks demoHooks) {
		this.driver = demoHooks.getDriver();
		this.homePage = PageFactory.initElements(driver, DemoHomePage.class);
		this.addUserPage = PageFactory.initElements(driver, DemoAddUserPage.class);
		this.loginPage = PageFactory.initElements(driver, DemoLoginPage.class);
	}
	
	@When("I request www.thedemosite.co.uk")
	public void i_request_www_thedemosite_co_uk() {
		driver.get("https://thedemosite.co.uk/");
	}

	@When("I click Add a user")
	public void i_click_add_a_user() {
	    homePage.addUserPage();
	}

	@Then("I am on the register page")
	public void i_am_on_the_register_page() {
	    assertEquals(addUserPage.checkTitle(), "3. Add a User");
	}

	@Given("I enter the username bobthebuilder")
	public void i_enter_the_username_bobthebuilder() {
	    addUserPage.enterUsername("bobthebuilder");
	}

	@Given("I enter my password yesican")
	public void i_enter_my_password_yesican() {
	    addUserPage.enterPassword("yesican");
	}

	@When("I click submit")
	public void i_click_submit() {
	    addUserPage.submit();
	}

	@Then("I register my details")
	public void i_register_my_details() {
		assertEquals(addUserPage.checkFields(), "");
	}

	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
	    addUserPage.loginPage();
	}

	@Given("enter the username bobthebuilder")
	public void enter_the_username_bobthebuilder() {
	    loginPage.enterUsername("bobthebuilder");
	}

	@Given("enter my password yesican")
	public void enter_my_password_yesican() {
	    loginPage.enterPassword("yesican");
	}

	@When("I click login")
	public void i_click_login() {
	    loginPage.login();
	}

	@Then("I login successfully")
	public void i_login_successfully() {
		String success = "**Successful Login**";
		
		assertEquals(loginPage.getSuccess(), success);
	}

}
