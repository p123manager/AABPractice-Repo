Feature: Scorecard

@smoketest @uitest
Scenario: scorecard page title test
	Given open "chrome" browser
	When launch site
	Then title should be contain "Live Cricket Score"
	When close site
	
