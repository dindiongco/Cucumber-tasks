@selenium @service
Feature: Navigate to Bing

As a user, I want to navigate to Bing so that I can seeearch for junk on the web
	
	@messenger
	Scenario: Goes to Bing
		When I request www.bing.com
		And I search for doge
		Then I am on the bing page for doge
