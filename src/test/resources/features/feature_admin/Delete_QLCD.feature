Feature: delete data on the QLCD page
  Scenario Outline: admin delete data
    Given admin navigator to url "<url>"
    When admin click icon login and click button login
    And  admin enter usename "<username>" and password "<password>" and click button login
    And admin click button Quản lý and click button QLCD
    And admin click button delete
    Then data delete seccessfull
    Examples:
      | url                    | username        | password |
      | http://127.0.0.1:8000/ | admin@gmail.com | 1        |