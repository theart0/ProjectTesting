Feature: Edit data QlVD

  Scenario Outline: admin edit data QLVD
    Given admin navigator to url "<url>"
    When admin click icon login and click button login
    And admin enter username "<username>" and password and click button login
    And admin click button Quản lý and click button QLKH an click button video
    And admin click edit on the QLVD page
    And enter new name"<name>" and newdicription "<dicrip>" and newimgae "<image>" and video"<video>" and click button edit
    Then data of video edit secessfull
    Examples:
      | url                    | username        | name | dicrip            | image                        | video                           |
      | http://127.0.0.1:8000/ | admin@gmail.com | php  | học PHP không  dễ | C:\Users\ADMIN\Desktop\1.jpg | C:\Users\ADMIN\Desktop\test.MP4 |