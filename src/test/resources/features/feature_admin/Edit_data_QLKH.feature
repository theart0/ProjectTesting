Feature: Edit data QlKH

  Scenario Outline: admin edit data QLKH
    Given admin navigator to url "<url>"
    When admin click icon login and click button login
    And admin enter username "<username>" and password and click button login
    And admin click button Quản lý and click button QLKH
    And admin click edit on the QLKH page
    And enter new name"<name>" and newdicription "<dicrip>" and newimgae "<image>" and slect new option and click button edit
    Then data of category edit secessfull
    And check in QLKH page category edit secessfull
    Examples:
      | url                    | username        | name | dicrip            | image                        |
      | http://127.0.0.1:8000/ | admin@gmail.com | php  | học PHP không  dễ | C:\Users\ADMIN\Desktop\1.jpg |