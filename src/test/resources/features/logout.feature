Feature: log out
  Scenario Outline: log out
    Given user login at "<url>" with username "<username>" and password "<password>"
    When user click on logout button
    Then navigate to login page
    Examples:
      | url                    | username    | password |
      | http://127.0.0.1:8000/ | 2@gmail.com | 2        |