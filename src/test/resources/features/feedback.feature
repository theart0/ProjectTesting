Feature:  feedback

  Scenario Outline: user can give feedback when use feedback form in contact page
    Given navigator to web "<url>"
    When enter name "<name>" phone "<phone>" email "<email>" content "<content>"
    Then a notice give feedback succesful appear
    Examples:
      | url                            | name            | phone      | email                 | content         |
      | http://127.0.0.1:8000/contact# | Nguyen Quoc Dat | 0387828165 | dat43564@donga.edu.vn | Thank you! |