Feature: Login Zalo App

Scenario: Login successfully with valid account
Given user launches Zalo app
When user clicks login button
And user enters valid phone number "0399490731"
And user clicks Agree and Continue button
And user enters password "6space"
And user clicks continue button
Then user should see home screen