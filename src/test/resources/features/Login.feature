Feature: Login Page

  Scenario Outline: Login page to Product Store
    Given user navigate to "<url>"
    When user click on login button enter username "<username>" and password "<password>"
    And click login button
    Then The user redirect to homepage
    Examples:
      | url                    | username    | password |
      | http://127.0.0.1:8000/ | 2@gmail.com | 2        |