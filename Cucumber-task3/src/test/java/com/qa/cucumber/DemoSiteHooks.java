package com.qa.cucumber;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com.qa.cucumber.pages.DemoAddUserPage;
import com.qa.cucumber.pages.DemoHomePage;
import com.qa.cucumber.pages.DemoLoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class DemoSiteHooks {
	
	private WebDriver driver;

	@Before
	public void setup(Scenario scenario) {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		
		scenario.attach(takeScreenshot(), "image/png", scenario.getName());
	}
	
	@After
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
