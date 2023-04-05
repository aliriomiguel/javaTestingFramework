Feature: Search for Apple in Google.es

    @Search
    Scenario: Search Apple and check results higher than 100000
        Given I open CHROME
        And I visit 'Google.es'
        And I accept the cookies for google
        And I search for 'Apple'
        Then I check if I got More than 100000 results

    @Search
    Scenario: Search Apple and check results less than 10000
        Given I open CHROME
        And I visit 'Google.es'
        And I accept the cookies for google
        And I search for 'Apple'
        Then I check if I got Less than 10000 results