# new feature
# Tags: optional

Feature: Add a new Pet to Store feature

  Scenario: Check user can create a new Pet
    Given Send a POST request with body to add a new pet
    Then Send GET request to check pet is added
