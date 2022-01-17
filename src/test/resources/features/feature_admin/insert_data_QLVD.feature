Feature: insert data for QLVD page

  Scenario Outline: admin insert data for QLVD page
    Given admin navigator to url "<url>"
    When admin click icon login and click button login
    And  admin enter usename "<username>" and password "<password>" and click button login
    And  admin click button Quản lý and click button QLKH
    And admin click button add video and enter name"<name>" and dicription"<dicrip>" imgae "<image>" and video "<video>"
    Then admin insert data seccesfull VD
    Examples:
      | url                    | username        | password | name | dicrip        | image                        | video                           |
      | http://127.0.0.1:8000/ | admin@gmail.com | 1        | PHP  | học PHP là dễ | C:\Users\ADMIN\Desktop\1.jpg | C:\Users\ADMIN\Desktop\test.MP4 |
