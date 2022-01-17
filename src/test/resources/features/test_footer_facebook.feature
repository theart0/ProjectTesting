Feature: Footer

  Scenario Outline: navigate facebook when click on facebook at footer
    Given navigator to web "<url>"
    When click on facebook button
    Then facebook window appear
    Examples:
      | url                    |
      | http://127.0.0.1:8000/ |