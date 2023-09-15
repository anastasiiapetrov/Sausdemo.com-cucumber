@login
Feature: Login

  # Background:
   # Given I open Login page




@login-1
  Scenario: Success login
    When I input "standard_user" to username field
    And I input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory


  @login-2
  Scenario Outline: Login with invalid user
    When I input "<username>" to username field
    And I input "secret_sauce" to password field
    When I push the Login button
    Then I see errorMessage "<errorMessageText>"
  Examples:
    |username                 |errorMessageText                                           |
    |locked_out_user          |Epic sadface: Sorry, this user has been locked out.        |
    |egregerte                |Username and password do not match any user in this service|

    @empty_usernameOrPassword
  Scenario Outline: Empty username
    When I input "<fieldInputPassword>" to password field
    When I input "<fieldInputUsername>" to username field
    And I push the Login button
    Then I see errorMessage "<errorMessageText>"
      Examples:
        |fieldInputPassword |fieldInputUsername   |errorMessageText                   |
        |secret_sauce       |                     |Epic sadface: Username is required |
        |                   | standard_user       |Epic sadface: Password is required |
@success_logout
  Scenario: Success Logout
    When I input "standard_user" to username field
    And I input "secret_sauce" to password field
    When I push the Login button
    Then I am on the page Inventory
    Then I am on the Login page





