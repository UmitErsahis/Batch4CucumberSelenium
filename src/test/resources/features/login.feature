
Feature: Coffeeshop Login-out Test

  @coffee
  Scenario:  Login Test
    Given The user is on the login page
    When The user logs in using "umit" und "Az12345%"

  Scenario: Logout Test
    Given The user is on the login page
    Given The user logs in using "umit" und "Az12345%"
    When The user clicks logout button user should logout


