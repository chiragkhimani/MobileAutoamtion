Feature: Flight Search

  Scenario: Verify user can search a flight
    Given user opens application
    Then verify user is on home screen
    When user tap on flights tab
    Then verify flights search landing page is displayed
    When user enters the flight source to "flight.source"
    And flight destination to "flight.destination"
    And select date from "flight.from.date" to "flight.to.date"
    And click on Continue button
    Then verify flight search result is displayed

  Scenario: Verify error message when user search flight with same source and destination
    Given user opens application
    Then verify user is on home screen
    When user tap on flights tab
    Then verify flights search landing page is displayed
    When user enters the flight source to "flight.source"
    And flight destination to "flight.source"
    And select date from "flight.from.date" to "flight.to.date"
    And click on Continue button
    Then verify search error with error message is displayed
      | Please make sure your departure and arrival cities are in different places. |

  Scenario: Verify date error when user select only from date during the return flight booking
    Given user opens application
    Then verify user is on home screen
    When user tap on flights tab
    Then verify flights search landing page is displayed
    When user enters the flight source to "flight.source"
    And flight destination to "flight.destination"
    And select date from "flight.from.date"
    And click on Continue button
    Then verify date card error message is displayed

  Scenario: Verify default values of number of travellers
    Given user opens application
    Then verify user is on home screen
    When user tap on flights tab
    Then verify flights search landing page is displayed
    When user click on travellers tab
    Then verify user is on travellers selection landing
    And verify default value of Adults is "default.no.of.adults"
    And verify default value of Youths is "default.no.of.youths"
    And verify default value of Children is "default.no.of.children"
    And verify default value of Infants is "default.no.of.infants"

