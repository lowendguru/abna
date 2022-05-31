@Logout
Feature: Logout
  As a logged in customer
  I want to be able to log out from the system

  Background:
    Given I go to the Login page
    And I login with valid credentials
    And the Header elements are displayed

  @Smoke @LogoutBasic
  Scenario: Authenticated user can logout
    Then the Sign Out button is not displayed
    When I click the user menu button
    Then the Sign Out button is displayed
    When I click on the Sign Out button
    Then the Home page main text is not displayed
    And all elements of the Login page are displayed


  @LogoutBrowserSession @WIP
  Scenario: Logout is valid for all browser tabs
   
   
   