Feature: Search for Apple in Google.es

    @Search
    Scenario: Search Apple and check results higher than 100000
        Given I open CHROME
        And I visit 'Google.es'
        Then I search for 'Apple'
        #Then I check if I got More than 100000 results