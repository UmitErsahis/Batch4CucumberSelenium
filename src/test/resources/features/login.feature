Feature: US 1 Login

  @login*
  Scenario Outline:  US1_TK1_Mit Benutzername und Passwort anmelden (Login Positive Test)
    Given The user is on the login page
    When The user logs in using "<Valid Username>" und "<Valid Password>" and should login

    Examples:
      | Valid Username | Valid Password |
      | umit           | Az12345%       |


  #@login*
  Scenario Outline: US1_TK3_ Bei falschem Benutzernamen / Passwort wird eine Fehlermeldung angezeigt
  (Login Negative Test)
    Given The user is on the login page
    When The user logs in using "<invalid Username>" und "<invalid Password>" and should not login
    Then this text "Dieser User existiert nicht."  on the screen


    Examples:
      | invalid Username | invalid Password |
      | Hasan           | Mkl2345?       |


  Scenario: US1TK4_Nach erfolgreichem Logout auf die Startseite umgeleitet werden(Logout Test)
    Given The user is on the login page
    Given The user logs in using "umit" und "Az12345%"
    When The user clicks logout button user should logout


  Scenario: US1_Spezx_Platzhalter im Loginbereich überprüfen (Keine tatsächlic AC)
    Given The user is on the login page
    When The user clicks on Login Button
    Then The username und passwort Feld should be enabled
