Feature:  User must login to learn
  Scenario Outline: User cannot learn if not logged in
    Given user navigate to "<url>"
    When user click on course
    Then user navigate to login page
    Examples:
      | url                    |
      | http://127.0.0.1:8000/ |