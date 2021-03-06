Feature: basic calculator functions
  Scenario: adding two numbers
    Given I have calculator
    When I add 2 and 3
    Then I should get 5
    Scenario: Divide two numbers
      Given I have calculator
      When I divide 6 and 3
      Then I should get 2