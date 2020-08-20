# new feature
# Tags: optional


Feature: Create a new Pet feature

  Scenario Outline: User can create a new Pet with valid id and name
    Given I send a POST request with <id> and <name> to add a new pet
    Then I send GET request to check pet is added with <id>
    Examples:
      | id  | name     |
      | 123 | testName |

  Scenario Outline: User can create a new Pet with valid id, name and category
    Given I send a POST request with <id> and <name> and <category> to add a new pet
    Then I send GET request to check pet is added with <id>
    Examples:
      | id  | name     | category |
      | 123 | testName | cats     |

#  Scenario: Check user can not create a new Pet with not valid id
#    Given I send a POST request with <id> and <name> to add a new pet
#    Then I send GET request to check pet is added with statusCode

#  Scenario: Check user can not create a new Pet with not valid name
#    Given I send a POST request with id, name to add a new pet
#    Then I send GET request to check pet is added with statusCode