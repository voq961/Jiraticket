Feature: Orange HRM application

  Scenario: login functionality
    Given user is on loginpage
    When user enter valid username and password
    And user click on loginButton
    Then user moves on homepage
    Then close browser
