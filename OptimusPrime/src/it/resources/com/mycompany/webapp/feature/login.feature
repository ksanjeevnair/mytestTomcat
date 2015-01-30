Feature: Login to the website
Allow login if login exists or show register prompt
If login doesn't exist prompt for registration
once registration is complete show login prompt again
	
  Scenario: Registered user logs in
  	Given the user sanjeev has a login on the site
  	And the user remebers the password which is sanjeev
  	When the user enters the username and password and clicks login
  	Then the user sanjeev is shown his home page