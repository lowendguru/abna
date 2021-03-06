@HomePage
Feature: Home Page
  As a logged in customer
  I want to be able to navigate the different sections of the site

  Background:
    Given I go to the Login page
    And I login with valid credentials

  @Smoke @HeaderNavigation
  Scenario: Header elements are present
    Then the Header elements are displayed

    # Assumption: The 'Products' link should redirect to a Products page.
  @ProductsPage
  Scenario: Products page
    When the Header elements are displayed
    And I click on the Products button of the header navigation
    Then the title of the page contains the word 'Products'

    # Assumption: The 'Contact' link should redirect to a Contact page.
  @ContactPage
  Scenario: Contact page
    When the Header elements are displayed
    And I click on the Contact button of the header navigation
    Then the title of the page contains the word 'Contact'

    # Assumption: The header navigation links should redirect to different pages.
  @HeaderNavigation
  Scenario: Header navigation through sections
    When the Header elements are displayed
    And I click on the Products button of the header navigation
    Then the title of the page contains the word 'Products'
    When I click on the Contact button of the header navigation
    Then the title of the page contains the word 'Contact'
    When I click on the Home button of the header navigation
    Then the Home page main text is displayed
   
   
   