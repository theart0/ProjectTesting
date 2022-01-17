Feature: Footer

  Scenario Outline: navigate to Github when click on Github at footer
    Given navigator to web "<url>"
    When click on Github at footer
    Then Github windown appear
    Examples:
      | url                    |
      | http://127.0.0.1:8000/ |