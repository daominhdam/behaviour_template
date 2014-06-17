Feature: Send contact message
  
  In order to contact with administrator
  As a customer,
  I want to send contact message to administrator

  Scenario: Send contact message
    Given I am on home page
    When I navigate to Contact page
    And I fill form with data
    And I submit my information
    Then I get confirmation message
    
