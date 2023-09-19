Feature: Register

  Scenario Outline: Register Successful
    Given the user is in the login page
    When the user enter ethe credentials
      | document   | email   | password   |
      | <document> | <email> | <password> |
    Then the user should see the dashboard

    Examples:
      | document   | email                       | password       |
      | 9087261354 | winnerstosenasoft@gmail.com | paralelepipedo |
