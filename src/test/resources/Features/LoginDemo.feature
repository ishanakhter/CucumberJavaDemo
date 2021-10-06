#Author:Syed Akhter
Feature: feature to test login functionality

  Scenario Outline: Check login is successful with valid credentials
    Given browser has opened
    And user is on Login Page
    When user enters <username> and <password>
    Then user is navigated to the homepage

    Examples: 
      | username | password |
      | ishan    |    12345 |
      | raghu    |    12345 |
      | rajeev   |    12345 |
