Feature: US 05 Warenkorb
@warenkorb
  Scenario: US5_TK1_ Artikel auf dem Warenkorb hinzufügen-US5_TK6_Man kann die Anzahl der Artikel ändern
    Given The user is on the login page
    When The user enters login credentials
    Then logged User Name "umit" should be showed under Warenkorb Badge
    When The user clicks on Shop Button
    Then Text "Willkommen in unserem Shop" should be seen on the screen
    When The user clicks on one Artikel
    And The user selects that how many he wants from this Artikel
    And The user clicks on the button in den Warenkorb legen
    Then The user should see "Es wurden 3 Artikel dem Warenkorb hinzugefügt."


  @warenkorb
  Scenario: US05_TK02 Man kann Artikel aus dem Warenkorb löschen
    Given The user is on the login page
    When The user clicks on Shop Button
    Then Text "Willkommen in unserem Shop" should be seen on the screen
    And The user clicks on the button in den Einkaufen
    And The user clicks on Shop Chart Button
    And User can delete Warenkorb
    Then Text x"Der Warenkorb ist leer." should be seen on the screen





