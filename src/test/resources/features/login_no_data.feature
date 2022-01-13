Feature: login with no data

  Scenario Outline:  user login with no data user and password
    Given user navigate to "<url>"
    When user click button login but no input data user and password
    Then user can't login in the next display
    Examples:
      | url                              |
      | https://my.uda.edu.vn/sv/svlogin |