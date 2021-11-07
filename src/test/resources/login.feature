Feature: Feature to test login

  Scenario: Check login is successful with valid credintals
    Given browser is open
    And user is on login page
    When user enters username and password
    And user clicks on login
    Then user is navigated to the home page
