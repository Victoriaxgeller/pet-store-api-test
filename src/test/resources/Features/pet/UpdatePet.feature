# new feature
# Tags: optional

Feature: Update a Pet feature

  Scenario: Check user can update an existing Pet
    Given Send a POST request with body to add a new pet
    Then Send GET request to check pet is added

    Scenario: Add new status to Pet and check it is added
      Given Send a POST request with updated status
      Then Send GET request to check pet's status is updated