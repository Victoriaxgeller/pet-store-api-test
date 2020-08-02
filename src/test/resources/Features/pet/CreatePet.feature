# new feature
# Tags: optional


Feature: Create a new Pet feature

  Scenario: Check user can create a new Pet

    Given I send a POST request with body to add a new pet
    Then I send GET request to check pet is added
