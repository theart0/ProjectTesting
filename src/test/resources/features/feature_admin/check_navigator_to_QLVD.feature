Feature: check page QLKH in admin page

  Scenario Outline: admin click and check QLKH page
    Given admin navigator to url "<url>"
    When admin click icon login and click button login
    And admin enter usename "<username>" and password "<password>" and click button login
    And admin click button Quản lý and click button QLKH an click button video
    Then QLVD page is display
    Examples:
      | url                    | username        | password |
      | http://127.0.0.1:8000/ | admin@gmail.com | 1        |