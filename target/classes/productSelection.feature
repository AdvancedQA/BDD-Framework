Feature: Feature to test product selection page

  Scenario: Check product selection
    Given browser is open
    And user is on home page
    When user clicks on more button
    Then user is navigated to the product cart page
