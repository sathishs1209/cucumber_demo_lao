Feature: This is to verify CEO Name in Orange_HRM Application
Scenario Outline: This is to verify CEO Name
Given The user is logged in successfully and is on HomePage
When User clicks on the directory option from the menu bar
And user clicks the job titles as "Chief Executive Officer" from the dropdown
And Clicks on search button
Then User should see the CEO name "<CEO_Name>" 

Examples:
 |CEO_Name|
 |John Smith|