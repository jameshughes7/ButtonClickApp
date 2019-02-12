Feature: Click the button counter

  @wip
  Scenario: Successful Button Click
    Given I start the application
    When I click the counter button
    Then I expect to see the click counts
