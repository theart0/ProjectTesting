Feature: check navigator to about

  Scenario Outline: check when user click button about
    Given user navigator url "<url>"
    When  user click button about
    Then about homepage is display
    Examples:
      | url                    |
      | http://127.0.0.1:8000/ |