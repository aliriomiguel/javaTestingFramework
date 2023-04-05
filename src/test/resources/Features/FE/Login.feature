Feature: login
  @login
  Scenario: I perform the login
    Given I open CHROME
    When I visit "login-test-lac.vercel.app/"
    And I add username "admin" and password "1234"
    And I click on the checkbox
    And I click on Submit button
    Then I see the alert message with login ok