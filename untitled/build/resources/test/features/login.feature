Feature: Login
  An user wants to log in into the bon-bonite website
  To interact with the products

  Scenario Outline: Successful login
    Given that the user is on the login page
    When the user enter the following credentials
      | document   | password   |
      | <document> | <password> |
    Then the user should see the main page
    Examples:
      | document   | password       |
      | 1111111111 | contraseña1234 |