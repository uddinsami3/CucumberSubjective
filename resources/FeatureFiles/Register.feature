@Syed
Feature: Test User Registeration Feature.
Description: The purpose of this feature is to test the User Registeration

Background: User navigates to registeration website
Given User navigates to "http://demo.guru99.com/test/newtours/register.php"

Scenario Outline: Test if the User Registeration is successful
When user entered the registeration details
Then take screenshot of the entered details
And submit the user registerarion details
And verify if the "<user>" is registered succesfully

Examples:
|user    |
|naqeeb123|