@LogIn @P1 @Regression
Feature: Facebook page login funtionality

  Background: 
    Given User launch the browser
    And User enters the url

  @TC01 @TC01_Login
  Scenario: To validate FB page login function with invalid credentials
    When User enters the username and password
      | UserName | Password |
      | Raja     |  4567890 |
      | Karthik  |  4356789 |
      | Siva     |    45678 |
    And User clicks the login button
    Then User navigates to login failure page

  @TC02 @TC02_Login
  Scenario Outline: To validate FB page login function with invalid credentials
    When User enters the "<userName>" and "<password>"
    And User clicks the login button
    Then User navigates to login failure page

    Examples: 
      | userName | password |
      | Selenium |  5467890 |
      | Hello    |   435678 |
