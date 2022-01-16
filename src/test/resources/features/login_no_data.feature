Feature: login with no data

  Scenario Outline:  user login with no data username and password
    Given user navigate to "<url>"
    When user click icon login and click  button login
    And user click button login with no data
    Then a notice login fail appear
    Examples:
      | url                    |
      | http://127.0.0.1:8000/ |