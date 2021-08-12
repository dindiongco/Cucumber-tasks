package com.qa.cucumber_selenium;

import com.qa.cucumber_selenium.models.Calculator;

import io.cucumber.java.Before;

public class CalculatorHooks {
	
	private Calculator calculator;
	
	@Before("@service and @calculator")
	public void setup() {
		this.calculator = new Calculator();
	}
	
	public Calculator getCalculator() {
		return this.calculator;
	}

}
