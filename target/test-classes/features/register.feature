
Feature: Register

  #reg
  Scenario: Ein Benutzer Konto anlegen
    Given The user is on the login page
    Then Login Button should be displayed
    When The user enters register credentials
    Then The user should be able to register und see text "Deine Registrierung war erfolgreich!"

  #@reg
  Scenario: Meine Eingaben werden auf Korrektheit überprüft 1
    Given The user is on the login page
    And The user on the register page
    When less than four letters are entered for the name
    Then this text "Bitte mindestens 4 Zeichen eingeben." should be on the screen

  #@reg
  Scenario: Meine Eingaben werden auf Korrektheit überprüft 2
    Given The user is on the login page
    And The user on the register page
    When more than twelve letters are entered for the name
    Then text "Bitte einen gültigen Namen eingeben:" should be on the screen

  #@reg
  Scenario:Mann kann sich nicht mit einem bereits vergebenen Nutzernamen registrieren
    Given The user is on the login page
    And The user on the register page
    When when a previously given name is entered
    Then this text "Dieser Name ist schon vergeben." should be on the screen

  @reg
  Scenario Outline: Ungültiges Passwort Test
    Given The user is on the login page
    And The user on the register page
    When The user enter one passwort "<less than 8>" und "<more than 20>"
    Then this "<text>" should be on the screen
    Examples:
      | less than 8 | more than 20            | text                                |
      | 1234567     | 123456789abcdefgh2r456h | 8-20 Zeichen: a-z, A-Z, 0-9, @$!%*? |





