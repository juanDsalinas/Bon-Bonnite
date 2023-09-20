Feature: purchase flow processes

  Background: Successful login
    Given the user is in the login page
    When the user enter the following credentials
      | document   | password       |
      | 1111111111 | contraseña1234 |
    Then the user should see the main page

  Scenario: buy shoes
    Given that the user is on the "shoes" section
    When he select the product number "1" with the size "37"
    And user clicks on buy button
    Then the user should see the buy car

