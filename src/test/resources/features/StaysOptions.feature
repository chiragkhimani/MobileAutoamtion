Feature: Stays Options

  Scenario: Verify user can search stays
    Given user opens application
    Then verify user is on home screen
    When user tap on stays tab
    And user enters the stay location "stay.location"
    And click on date selection card
    And select date from "stay.from.date" to "stay.to.date"
    And click on search button
    Then verify stays search result is displayed

