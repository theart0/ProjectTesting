Feature: Click on main icon

  Scenario Outline: navigate homepage when click on main icon
    Given navigator to web "<url>"
    When click on main icon
    Then navigate to homepage
    Examples:
      | url                           |
      | http://127.0.0.1:8000/contact |