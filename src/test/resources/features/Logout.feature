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

  @LogoutBrowserSession
  Scenario: Logout is valid across all browser tabs
    When I open a second browser tab
    And I go to the base url
    Then the Header elements are displayed
    When I click the user menu button
    And I click on the Sign Out button
    Then the Home page main text is not displayed
    And all elements of the Login page are displayed
    When I close the current browser tab
    Then the Header elements are displayed
    When I refresh the browser window
    Then the Home page main text is not displayed
    And all elements of the Login page are displayed