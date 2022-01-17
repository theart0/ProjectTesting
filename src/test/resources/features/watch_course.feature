Feature: Watch course

  Scenario Outline: user can watch course if logged in
    Given user login at "<url>" with username "<username>" and password "<password>"
    When user click on course
    Then user navigator to Course page
    Examples:
      | url                    | username    | password |
      | http://127.0.0.1:8000/ | 2@gmail.com | 2        |
