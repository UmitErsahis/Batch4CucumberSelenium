Feature: US 02 Webseiteninhalte

  Scenario: US2_TK1_Ich kann die Webseite abrufen
   And The user should be able to reach Website


  @webseiteninhalte
  Scenario Outline: US2_TK2_Das Layout entspricht unserer Corporate Identity (Links überprüfen)
    Given The user is on the login page
    #When The user enters login credentials
    Then The user should see "<linksReihe>" und "<linksName>" auf dem Page

    Examples:
      | linksReihe | linksName |
      | 1    | Home      |
      | 2    | About     |
      | 3    | Shop      |
      | 4    | Contact   |


      Scenario:US2_TK3-Der Kunde hat eine Möglichkeit zur Kontaktaufnahme
      Given The user is on the login page
      When The user clicks on Contact Button
      Then The user  should be able to click "finetest@coffee.inc"


      #@webseiteninhalte
      Scenario:US2-TK4_Wir können unser Unternehmen auf einer separaten "About"-Seite darstellen
       Given The user is on the login page
       And The user clicks on About Button
       Then The user  sees "Über uns"



      
      
      

