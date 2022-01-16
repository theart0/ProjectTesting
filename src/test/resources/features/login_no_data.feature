Feature: login with no data

  Scenario Outline:  user login with no data user and password
    Given user navigate to "<url>"
    When user click button login
    Then a notice login fail appear
    Examples:
      | url                    |
      | http://127.0.0.1:8000/ |