Feature: Webseiteninhalte

  Scenario Outline: Links auf Webseite überprüfen
    Given The user is on the login page
    When The user enters login credentials
    Then The user should see "<all Links>" auf dem Page

    Examples:
      | all Links |
      | Home      |
      | About     |
      | Shop      |
      | Contact   |
