Feature: Home page
  As a visitor
  I want to view the carpenter business's home page
  So that I can understand what the business offers

  Scenario: Visitor opens the website and sees the home page
    Given I open the carpenter website
    Then I should see the home page
    And I should see the business name and a short description of its offerings
    And I should see navigation to the other sections of the site

  Scenario: Visitor navigates between sections from the home page
    Given I open the carpenter website
    When I navigate to "About/Services"
    Then I should see the "About/Services" section
    When I navigate to "Contact"
    Then I should see the "Contact" section
    When I start a custom order request from the Contact section
    Then I should see the "Custom Order Request" section
