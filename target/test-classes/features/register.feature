
Feature: US 04 Register

   #reg
  Scenario: US4TK1_Ich kann ein Benutzerkonto anlegen-
            USTK3 Ich muss einen Benutzernamen und ein Passwort angeben.
    Given The user is on the login page
    Then Login Button should be displayed
    When The user enters register credentials
    Then The user should be able to register und see text "Deine Registrierung war erfolgreich!"

  #@reg
  Scenario: US4TK2_Meine Eingaben werden auf Korrektheit überprüft 1
    Given The user is on the login page
    And The user on the register page
    When less than four letters are entered for the name
    Then this text "Bitte mindestens 4 Zeichen eingeben." should be on the screen

  @reg
  Scenario: US4TK2_Meine Eingaben werden auf Korrektheit überprüft 2
    Given The user is on the login page
    And The user on the register page
    When more than twelve letters are entered for the name
    Then text "Bitte einen gültigen Namen eingeben:" should be on the screen

  Scenario Outline: US4TK2_Meine Eingaben werden auf Korrektheit überprüft 3
  Ungültiges Passwort Test-größer als 20
    Given The user is on the login page
    And The user on the register page
    When The user enter one passwort "<more than 20>"
    Then this "<text>" should be on the screen
    Examples:
      | more than 20            | text                                |
      | 123456789abcdefgh2r456h | 8-20 Zeichen: a-z, A-Z, 0-9, @$!%*? |

  #@reg
  Scenario Outline: US4_TK2_ Meine Eingaben werden auf Korrektheit überprüft 4
  Ungültiges Passwort Test-kleiner als 8
    Given The user is on the login page
    And The user on the register page
    When The user enter one passwort "<less than 8>"
    Then this "<text>" should be on the screen
    Examples:
      | less than 8 | text                                |
      | 1234567     |  8-20 Zeichen: a-z, A-Z, 0-9, @$!%*? |


  #@reg
  Scenario:US4TK4_Mann kann sich nicht mit einem bereits vergebenen Nutzernamen registrieren
    Given The user is on the login page
    And The user on the register page
    When when a previously given name is entered
    Then this text "Dieser Name ist schon vergeben." should be on the screen






