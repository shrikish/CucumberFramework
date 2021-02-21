@DataTableExample
Feature: Title of your feature
  I want to use this template for my feature file

  @table1
  Scenario: Title of your scenario outline
    Given I want to write a step
    | firstName   | lastName | birthDate  |
		| Annie M. G. | Schmidt  | 1911-03-20 |
		| Ronald      | Dale     | 1916-09-13 |
		| Astrid      | Lindgren | 1907-11-14 | 
    When I check for value
    Then I verify the step