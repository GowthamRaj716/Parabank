@Register
Feature: Register new account in parabank
  Scenario: To register in parabank
    Given user enter parabank url
    When user click register link
    And user enter all the required details
    And user giver username and set password
    Then user click register button