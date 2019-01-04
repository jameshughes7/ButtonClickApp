Feature: Click the button counter

  @wip
  Scenario: Successful Button Click
    Given I start the application
    When I input text
    And I click the Button
    Then I expect to see my text
