@Login
Feature: Festticket WebApplication
  As a user I want to explore festicket to buy the festival ticket


  Scenario: Sign into Festicket
    Given User is on HomePage of Festicket
    When User clicks on signin button
    And user enters valid Username and Password
    Then User gets logged in

  Scenario: Signout from the Festicket
      Given User is on Account Page
      When User Clicks on Signout Button
      Then User gets logged out

  Scenario: Search the Festival
    Given User navigates to Search page
    When User Search for the festival
    Then Veify user navigates to corresponding page
