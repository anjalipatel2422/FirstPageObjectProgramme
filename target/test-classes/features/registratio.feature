
Feature: Registration feature
  @trail
  Scenario: User should able to register successfully,so that user can use all
    functionality on my website

    Given user is on homepage
    When user clicks on register button
    And user enters all required registration deatils
    Then user should able to register successfully