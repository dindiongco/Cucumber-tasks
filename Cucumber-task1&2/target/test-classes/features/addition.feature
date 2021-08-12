@calculator @service
Feature: Calculator addition behaviour
  Testing whether the calculator can successfully add numbers.
	
	As a user, I want to add two or more numbers so I can then use the sum in further calculations or data based decision making.

  Background: Setup calculator
  	Given a calculator

	  Scenario: Integer addition
	    Given the number 2
	    And the second number 8
	    When the numbers are added 
	    Then the result should be 10
	    
		Scenario Outline: Varying values integer addition
			Given the number <num1>
			And the second number <num2>
			When the numbers are added
			Then the result should be <expected>
			
			Examples: Integer values
			| num1 | num2 | expected |
			| 4    | 3    |	7        |
			| 7    | 52   | 59       |
			