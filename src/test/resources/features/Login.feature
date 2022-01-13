Feature: Login Page

  Scenario Outline: Login page to HRM
    Given user navigate to url "<url>"
    When user enter username "<username>" and password "<password>"
    And click login button
    Then The user redirect to Dashboard page
    Examples:
      | url                              | username | password   |
      | https://my.uda.edu.vn/sv/svlogin | 43803    | 1232123Duc |