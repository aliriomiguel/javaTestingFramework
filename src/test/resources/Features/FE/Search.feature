Feature: Search for Apple in Google.es

    Scenario: Search Apple and check results higher than 100000
        Given I visit Google.es
        When I search for Apple
        Then I check if I got More than 100000 results