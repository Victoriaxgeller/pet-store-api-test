# new feature
# Tags: optional

Feature: Upload image feature

  Scenario: Check user can upload an image
    Given Send a POST request with image url
    Then Send GET request to check pet is with image now
