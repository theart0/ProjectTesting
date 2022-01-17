Feature: Logout admin page

  Scenario Outline: admin logout admins page
    Given admin navigator to url "<url>"
    When admin click icon login and click button login
    And  admin enter usename "<username>" and password "<password>" and click button login
    And admin click button logout
    Then admin log out acccount secessful and navigator to login page
    Examples:
      | url                    | username        | password |
      | http://127.0.0.1:8000/ | admin@gmail.com | 1        |