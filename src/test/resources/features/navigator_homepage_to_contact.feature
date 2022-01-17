Feature: From homepage navigate to contact

  Scenario Outline: user can go to contact page when login complete
    Given user login at "<url>" with username "<username>" and password "<password>"
    When  user click on Contact
    Then Contact window appear
    Examples:
      | url                    | username    | password |
      | http://127.0.0.1:8000/ | 2@gmail.com | 2        |