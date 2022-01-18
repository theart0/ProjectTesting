Feature: login with incorectaccount

  Scenario Outline: login with incorectaccount
    Given user navigate to "<url>"
    When  user click icon login and click  button login
    And  user input username "<username>" and password"<password>" and click button đăng nhập
    Then user fail login and show appear
    Examples:
      | url                    | username    | password |
      | http://127.0.0.1:8000/ | abb@gmail.com | 1        |