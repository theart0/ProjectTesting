Feature: Thoi Khoa Bieu

  Scenario Outline: Xem Thoi khoa bieu
    Given Login to the system "<url>" with email "<username>" and password "<password>"
    When user open Thong Bao menu
    And click Thoi Khoa Bieu item
    Then the Thoi Khoa Bieu page is display
    And lam cai gi do
    Examples:
      | url                                  | username | password   |
      | https://www.demoblaze.com/index.html | 43564    | limapdayne |