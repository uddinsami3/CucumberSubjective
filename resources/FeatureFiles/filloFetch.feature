@EnterData_MercuryTours_Fillo
Feature: To Enter data in Mercury Tours using Fillo

  @Positive_Scenario_Fillo
  Scenario Outline: Giving valid values and proceed to register in Mercury Tours-positive
    Given Navigate to mercury tours registration page
    And verify if the page has been navigated as expected
    When store values from excel using fillo for "<RowNum>"
    And give the inputs on screen for registration and click on submit
    Then take screenshots of the success or failure screen
    And verify if the screen navigates to the next screen for "<RowNum>"
    And close the browser

    Examples: 
      | RowNum |
      |      1 |
      |      2 |
