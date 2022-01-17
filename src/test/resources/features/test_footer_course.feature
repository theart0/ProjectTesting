Feature: Footer

  Scenario Outline: navigator to course when click on footer
    Given user login at "<url>" with username "<username>" and password "<password>"
    When click on course at footer
    Then navigate to Couse page
    Examples:
      | url                    | username    | password |
      | http://127.0.0.1:8000/ | 2@gmail.com | 2        |