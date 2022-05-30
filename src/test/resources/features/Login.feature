@LOGIN
Feature: Login
  As a customer
  I want to be able to login

  Background: Login page
    Given I go to the Login page

  @SMOKE
  Scenario: Login page shows login form
    Then all elements of the Login page are displayed
    And the welcome message of the Login page is 'Automation doesn't stop at testing, it's just a beginning!'

  Scenario Outline: Login with valid credentials
    When I enter username <username> in the login form
    And I enter password <password> in the login form
    And I click the Login button of the login form
    Then the Home page is displayed
    And the Header elements are displayed

    Examples:
      | username               | password   |
      | admin@admin.com        | 2020       |
      | biancunha@gmail.com    | 123456     |
      | growdev@growdev.com.br | growdev123 |


  Scenario Outline: Login with invalid credentials - <reference>
    When I enter username <username> in the login form
    And I enter password <password> in the login form
    And I click the Login button of the login form
    Then the Home page is not displayed

    Examples:
      | reference                   | username        | password      |
      | Invalid Password            | admin@admin.com | wrongPassword |
      | Empty Password              | admin@admin.com |               |
      | Empty Username              |                 | 123456        |
      | Non existing Username       | admin@admin.co  | 2020          |
      | Empty Username and Password |                 |               |

  Scenario: Authenticated user credentials are available in browser session
   
   