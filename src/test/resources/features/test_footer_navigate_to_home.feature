Feature: navigate to homepage when click on Trang chu button at footer
  Scenario Outline: Navigate to homepage
    Given user navigator to url "<url>"
    When click on Trang chu button at footer
    Then homepage appear
    Examples:
      | url                    |
      | http://127.0.0.1:8000/ |
