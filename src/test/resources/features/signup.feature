Feature: Sign up

  Scenario Outline: Sign up new account
    Given user navigate to homepage "<url>"
    And   click icon sign in and click button sign up
    When user new enter name "<name>" and email "<email>" and phone "<phone>" and address "<address>" and password "<password>" and confirmpassword"<cfpassword>"
    Then a noitice sign up succesfull appear
    Examples:
      | url                    | name  | email           | phone      | address | password | cfpassword |
      | http://127.0.0.1:8000/ | 3 | 3@gmail.com | 0776763650 | abc     | 1        | 1          |
