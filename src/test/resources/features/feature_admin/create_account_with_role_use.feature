Feature: admin create account with role user

  Scenario Outline: check account can login and navigator to admin page
    Given admin navigator to url "<url>"
    When admin click icon login and click button login
    And  admin enter usename "<username>" and password "<password>" and click button login
    And admin click button Quản lý and click button QLTK
    And admin click button add account and create a new account with name"<name>" and Email"<email>" and address and password  and confirmpass  and phone  and role user
    Then a new user can't navigator urls"<url1>" admin page
    Examples:
      | url                    | username        | password | name  | email           | url1                         |
      | http://127.0.0.1:8000/ | admin@gmail.com | 1        | user1 | user1@gmail.com | http://127.0.0.1:8000/admins |