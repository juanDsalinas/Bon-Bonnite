Feature: purchase flow processes

  Background: Successful login
    Given the user is in the login page
    When the user enter the following credentials
      | document   | password       |
      | 1111111111 | contraseña1234 |
    Then the user should see the main page

  Scenario Outline: buy shoes
    Given that the user is on the "shoes" section
    When he select the product number
      | product   |
      | <product> |
    And user clicks on buy after selecting size
      | size   |
      | <size> |
    Then the user should see the buy car

    Examples:
      | product | size |
      | 1       | 37   |
