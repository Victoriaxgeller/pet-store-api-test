# new feature
# Tags: optional

Feature: Create users feature

  Scenario: Check user can create a new Pet
    Given Send a POST request with body to add a new pet
    Then Send GET request to check pet is added
