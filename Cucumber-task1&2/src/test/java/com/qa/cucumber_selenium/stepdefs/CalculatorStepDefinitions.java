package com.qa.cucumber_selenium.stepdefs;

import static org.junit.Assert.assertEquals;

import com.qa.cucumber_selenium.models.Calculator;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorStepDefinitions {
	
	private int num1;
	private int num2;
	private int actualResult;
	private Calculator calculator;
	
	@Given("a calculator") 
	public void aCalculator() {
		this.calculator = new Calculator();
	}

	@Given("the number {int}")
	public void theNumber(int int1) {
		this.num1 = int1;

	}

	@Given("the second number {int}")
	public void theSecondNumber(int int1) {
		this.num2 = int1;
	}

	@When("the numbers are added")
	public void theNumbersAreAdded() {
		this.actualResult = this.calculator.add(num1, num2);
	}
	
	@When("the numbers are subtracted")
	public void the_numbers_are_subtracted() {
	    this.actualResult = this.calculator.subtract(num1, num2);
	}
	
	@When("the first number is divided by the second")
	public void the_first_number_is_divided_by_the_second() {
		if (num1 != 0 & num2 != 0) {
			this.actualResult = this.calculator.divide(num1, num2);
		}
	}
	
	@When("the numbers are multiplied")
	public void the_numbers_are_multiplied() {
	    this.actualResult = this.calculator.multiply(num1, num2);
	}

	@Then("the result should be {int}")
	public void theResultShouldBe(int expectedResult) {
		assertEquals(expectedResult, actualResult);
	}	

}
