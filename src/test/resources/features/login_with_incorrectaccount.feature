Feature: login with incorectaccount

  Scenario Outline: login with incorectaccount
    Given user navigator to url "<url>"
    When  User click icon login and click button đăng nhập
    And  user input username "<username>" and password"<password>" and click button đăng nhập
    Then user fail login and show appear
    Examples:
      | url                    | username    | password |
      | http://127.0.0.1:8000/ | 1@gmail.com | 1        |