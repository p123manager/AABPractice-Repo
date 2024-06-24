Feature: google page title

Scenario: check with the give word is matched with google page title or not
	Given open "chrome" browser
	When launch google site
	And  locate search box and enter a "virat kohli"
	Then page title should contain "virat kohli"
	Then close site
	
