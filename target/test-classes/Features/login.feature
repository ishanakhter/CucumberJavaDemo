#Author:Syed Akhter
Feature: feature to test login functionality
@GuestUser
  Scenario: Check login is successfull with valid credentials
    Given user is on login Page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage
 @LoggedinUser   
 Scenario: Check login is successfull with valid credentials
    Given user is on login Page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage
  @CheckoutUser  
    Scenario: Check login is successfull with valid credentials
    Given user is on login Page
    When user enters username and password
    And clicks on login button
    Then user is navigated to the homepage
    