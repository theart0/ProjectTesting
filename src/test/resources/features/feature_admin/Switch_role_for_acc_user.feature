Feature: The administrator creates an account as a passenger account and a conversion role as an administrator

  Scenario Outline: check account can login and navigator to admin page
    Given admin navigator to url "<url>"
    When admin click icon login and click button login
    And  admin enter usename "<username>" and password "<password>" and click button login
    And admin click button Quản lý and click button QLTK
    And admin click button edit account and switch role as an admin
    Then a new user can navigator urls"<url1>" admin page
    Examples:
      | url                    | username        | password | url1                         |
      | http://127.0.0.1:8000/ | admin@gmail.com | 1        | http://127.0.0.1:8000/admins |