Feature: Register


  Scenario: Ein Benutzer Konto anlegen
    Given The user is on the login page
    When The user enters register credentials
    Then The user should be able to register
  @abc
  Scenario: Meine Eingaben werden auf Korrektheit überprüft
    Given The user is on the login page
    And The user on the register page
    When when a previously given name is entered
    Then this text "Dieser Name ist schon vergeben." should be on the screen