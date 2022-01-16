Feature: sign up with already exist account

  Scenario Outline: user can not sign up with already exist account
    Given user navigato to "<url>" and go to login page
    When enter exist name "<name>" email "<email>" phone "<phone>" address "<address>" password "<password>" and confim password "<cfpassword>"
    Then  sign up fail
    Examples:
      | url                   | name | email       | phone | address | password | cfpassword |
      | http://127.0.0.1:8000 | 1   | 1@gmail.com | 1    | 1      | 1     | 1         |