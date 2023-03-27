Feature: Warenkorb
@warenkorb
  Scenario: Artikel dem Warenkorb hinzufügen
    Given The user is on the login page
    When The user enters login credentials
    Then logged User Name "umit" should be showed under Warenkorb Badge
    When The user clicks on Shop Button
    Then Text "Willkommen in unserem Shop" should be seen on the screen
    When The user clicks on one Artikel
    And The user selects that how many he wants from this Artikel
    And The user clicks on the button in den Warenkorb legen
    Then The user should see "Es wurden 3 Artikel dem Warenkorb hinzugefügt."

