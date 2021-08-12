package com.qa.cucumber_selenium;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class SeleniumHooks {
	
	private WebDriver driver;
	
	@Before("@messenger")
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
	}
	
	@After("@messenger")
	public void teardown(Scenario scenario) {
		scenario.attach(takeScreenshot(), "image/png", scenario.getName());
		
		this.driver.quit(); 
	}
	
	public WebDriver getDriver() {
		return this.driver;
	}
	
	private byte[] takeScreenshot() {
		return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
	}

}
