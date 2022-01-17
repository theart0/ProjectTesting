Feature: Footer

  Scenario Outline: Navigate to contact page when click on contact at footer
    Given navigator to web "<url>"
    When click on contact at footer
    Then navigate to contact page
    Examples:
      | url                    |
      | http://127.0.0.1:8000/ |