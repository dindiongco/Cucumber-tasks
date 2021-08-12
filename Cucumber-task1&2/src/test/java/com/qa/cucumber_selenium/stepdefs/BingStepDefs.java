package com.qa.cucumber_selenium.stepdefs;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.qa.cucumber_selenium.SeleniumHooks;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BingStepDefs {
	
	private WebDriver driver;
	
	public BingStepDefs(SeleniumHooks hooks) {
		this.driver = hooks.getDriver();
	}

	@When("I request www.bing.com")
	public void i_request_www_bing_com() {
	    driver.get("https://www.bing.com");
	}
	
	@When("I search for doge")
	public void i_search_for_doge() {
	    WebElement search =	driver.findElement(By.id("sb_form_q"));
	    search.sendKeys("doge");
	    search.sendKeys(Keys.ENTER);
	}

	@Then("I am on the bing page for doge")
	public void i_am_on_the_bing_page_for_doge() {
	    assertEquals(driver.getTitle(), "doge - Bing");
	}

}
