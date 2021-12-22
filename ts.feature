Feature: Monthly TimeSheet
  I want to use this template for my Monthly timesheet

  Scenario: Monthly timesheet from Excel to Redmine
    Given I am on the Redmine login page
    And I enter Login user name "Anushri.Rastogi"
    And I enter Password "intel@2212"
    Then I click Login button
    And I verify if Home is visible
    And I navigate to "2U" Project
    Then I click on "Log time" on Project Overview page
    Then I select "QA" from the Activity Dropdown
    And I fill in data from excel row number "1" to "3" and column number "0" to "2"   
