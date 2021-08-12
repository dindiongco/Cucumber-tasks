@demosite @selenium @service
Feature: Register on Demo site

	As a user, I want to register my details on the demo site so that I can login.
	
	Scenario: Goes to demo site
		When I request www.thedemosite.co.uk
		And I click Add a user
		Then I am on the register page
		
	Scenario: Register details
		Given I enter the username bobthebuilder
		And I enter my password yesican
		When I click submit
		Then I register my details

	Scenario: Login successfully
		Given I am on the login page
		And enter the username bobthebuilder
		And enter my password yesican
		When I click login
		Then I login successfully
	
