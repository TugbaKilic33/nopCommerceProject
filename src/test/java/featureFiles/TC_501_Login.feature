Feature: Login Functionality

  Scenario: Unsuccessful login with invalid username
    When The user enters an invalid username "invalid@yourstore.com"
    And The user enters a valid password "admin"
    And The user clicks the Login button
    Then An error message "Login was unsuccessful" should be displayed

  Scenario: Unsuccessful login with invalid password
    When The user enters a valid username "admin@yourstore.com"
    And The user enters an invalid password "wrongpassword"
    And The user clicks the Login button
    Then An error message "Login was unsuccessful" should be displayed

  Scenario: Unsuccessful login with empty username and password
    When The user leaves the username field empty
    And The user leaves the password field empty
    And The user clicks the Login button
    Then An error message "Please enter your email" should be displayed

  Scenario: Successful login with valid credentials
    When The user enters a valid username "admin@yourstore.com"
    And The user enters a valid password "admin"
    And The user clicks the Login button
    Then The user should be redirected to the Dashboard page