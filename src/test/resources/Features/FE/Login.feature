Feature: login
  @login
  Scenario: User's Login
    Given I open CHROME
    When I visit "login-test-lac.vercel.app/"
    And I add username "admin" and password "1234"
    And I click on the checkbox
    And I click on Submit button
    Then I see the alert message with "Login OK"

  @login
  Scenario: User doesn’t check privacy policy checkbox
    Given I open CHROME
    When I visit "login-test-lac.vercel.app/"
    And I add username "admin" and password "1234"
    And I click on Submit button
    Then I see the alert message with "You must accept the privacy policy"

  @login
  Scenario: User leaves username and password inputs empty
    Given I open CHROME
    When I visit "login-test-lac.vercel.app/"
    And I add username "" and password ""
    And I click on the checkbox
    And I click on Submit button
    Then I see the alert message with "Wrong Username and Password"

  @login
  Scenario: User inputs a wrong username and password
    Given I open CHROME
    When I visit "login-test-lac.vercel.app/"
    And I add username "WrongUsername" and password "Wrong Password"
    And I click on the checkbox
    And I click on Submit button
    Then I see the alert message with "Wrong Username and Password"

  @login
  Scenario: User inputs a wrong username or password
    Given I open CHROME
    When I visit "login-test-lac.vercel.app/"
    And I add username "admin" and password "Wrong Password"
    And I click on the checkbox
    And I click on Submit button
    Then I see the alert message with "Wrong Username and Password"