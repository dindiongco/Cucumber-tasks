package com.qa.cucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoAddUserPage {
	
	public final String URL = "http://thedemosite.co.uk/addauser.php";
	
	private WebDriver driver;
	
	@FindBy(xpath = "/html/body/table/tbody/tr/td[1]/p[1]/big/strong")
	private WebElement title;
	
	@FindBy(name = "username")
	private WebElement userName;
	
	@FindBy(name = "password")
	private WebElement passWord;
	
	@FindBy(name = "FormsButton2")
	private WebElement submitBtn;
	
	@FindBy(xpath = "/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[2]/p/small/a[4]")
	private WebElement loginPageBtn;
	
	public DemoAddUserPage(WebDriver driver) {
		driver.get(URL);
	
	}
	
	public String checkTitle() {
		return title.getText();
	}
	
	public String checkFields() {
		return userName.getText();
	}
	
	public DemoAddUserPage enterUsername(String username) {
		userName.sendKeys(username);
		
		return this;
	}
	
	public DemoAddUserPage enterPassword(String password) {
		passWord.sendKeys(password);
		
		return this;
	}
	
	public DemoAddUserPage submit() {
		submitBtn.click();
		
		return this;
	}
	
	public DemoAddUserPage loginPage() {
		loginPageBtn.click();
		
		return this;
	}
}