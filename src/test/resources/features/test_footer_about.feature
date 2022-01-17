Feature:  Test footer

  Scenario Outline: Navigate to About page when click on About at footer
    Given navigator to web "<url>"
    When click on About button
    Then aboutpage appear
    Examples:
      | url                    |
      | http://127.0.0.1:8000/ |
