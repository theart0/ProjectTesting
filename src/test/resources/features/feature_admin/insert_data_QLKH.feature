Feature: insert data for QLKH page

  Scenario Outline: admin insert data for QLKH page
    Given admin navigator to url "<url>"
    When admin click icon login and click button login
    And  admin enter usename "<username>" and password "<password>" and click button login
    And  admin click button Quản lý and click button QLKH
    And admin click button add course and enter name"<name>" and dicription"<dicrip>" imgae "<image>"
    Then admin insert data seccesfull KH
    Examples:
      | url                    | username        | password | name | dicrip        | image                        |
      | http://127.0.0.1:8000/ | admin@gmail.com | 1        | PHP  | học PHP là dễ | C:\Users\ADMIN\Desktop\1.jpg |