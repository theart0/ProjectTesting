Feature: insert data for QLCD page

  Scenario Outline: admin insert data for QLCD page
    Given admin navigator to url "<url>"
    When admin click icon login and click button login
    And  admin enter usename "<username>" and password "<password>" and click button login
    And  admin click button Quản lý and click button QLTl
    And admin click button add category and enter name"<name>" and dicription"<dicrip>"
    Then admin insert data seccesfull Tl
    Examples:
      | url                    | username        | password | name | dicrip        |
      | http://127.0.0.1:8000/ | admin@gmail.com | 1        | PHP  | học PHP là dễ |