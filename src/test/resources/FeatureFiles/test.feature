@tag
Feature: Login to Application
  I want to check Login functionality

  @Delete_Book
  Scenario: Login and delete book
    Given I launch application
    When I input credentials
    Then I should be logged in
    And I can delete if a book is available

	@Logout
  Scenario: Login with correct credentials
    Given I launch application
    When I input credentials
    Then I should be logged in
    And I can logout