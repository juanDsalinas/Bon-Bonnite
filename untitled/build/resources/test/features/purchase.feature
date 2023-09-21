Feature: purchase flow processes

  Background: Successful login
    Given the user is in the login page
    When the user enter the following credentials
      | document   | password       |
      | 1111111111 | contraseña1234 |
    Then the user should see the main page

  Scenario Outline: buy shoes
    Given that the user is on the "shoes" section
    When he select the product number "6" with the size "35"
    And user clicks on buy button
    And the user clicks on the confirmation buttons to access the billing form
    And the user enters the following data to the billing form
      | gender   | documentype   | country   | department   | city   |
      | <gender> | <documentype> | <country> | <department> | <city> |
    And the user clicks on the payment button
    Then the user should see the payment gateway

    Examples:
      | gender | documentype | country  | department | city     |
      | Hombre | CC          | Colombia | Antioquía  | Medellín |

