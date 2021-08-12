package com.qa.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoHomePage {
	
	static final String URL = "https://thedemosite.co.uk/";
	
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[3]")
	private WebElement addUserLink;
	
	public DemoHomePage(WebDriver driver) {
		driver.get(URL);
	}
	
	public DemoHomePage addUserPage() {
		addUserLink.click();
		
		return this;
	}

}
