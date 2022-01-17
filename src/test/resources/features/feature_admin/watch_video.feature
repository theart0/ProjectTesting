Feature: Course page
  Scenario Outline: watch video of course
    Given user login at "<url>" with username "<username>" and password "<password>"
    When user click on course
    And click on play video button
    Then video player window appear
    Examples:
      | url                    | username    | password |
      | http://127.0.0.1:8000/ | 2@gmail.com | 2        |