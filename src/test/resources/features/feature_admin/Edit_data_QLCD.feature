Feature: Edit a category

  Scenario Outline: admin Edit a categiry
    Given admin navigator to url "<url>"
    When admin click icon login and click button login
    And admin enter username "<username>" and password and click button login
    And admin click button Quản lý and click button QLTl
    And admin click edit on the QLCD page
    And enter new name"<name>" and newdicription "<dicrip>" and click button edit
    Then name and dicription of category edit secessfull
    And check in QLKH page category edit secessfull
    Examples:
      | url                    | username        | name | dicrip            |
      | http://127.0.0.1:8000/ | admin@gmail.com | php  | học PHP không  dễ |