Feature: login with account admin

  Scenario Outline: check login seccessful when enter account admin
    Given User navigator to url "<url>"
    When user click icon login and click  button log in
    And user enter username "<usename>" and password "<password>"
    And click login button login
    Then login seccessful with acccount admin and navigator to admin page
    Examples:
      | url                    | usename         | password |
      | http://127.0.0.1:8000/ | admin@gmail.com | 1        |