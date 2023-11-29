@login
Feature: To check end to end in parabank site
  Scenario: To login using valid credentials
    Given To launch parabank url to login
    When user enter customer login username
    And  user enter customer login password
    Then user click customer login button

  Scenario: To open a new account in parabank
    When user click open new account
    And user select account type
    And user select account to transfer
    Then user click create new account button

  Scenario: To transfer fund to the created new account
    When user click transfer fund link
    And user enter the amount to transfer
    Then user click transfer button

  Scenario: To pay bill by giving valid credentials
    When user click Bill pay link
    And user enter details of payee
    And user enter account number and enter amount
    And user select from account
    Then user click send payment button

  Scenario: To apply loan in parabank
    When user click request loan link
    And user enter required loan amount and give down payment
    And user select account for loan
    Then user click apply now button

  Scenario: To logout of parabank
    When user click logout link

