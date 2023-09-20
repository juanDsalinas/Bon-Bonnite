Feature: purchase flow processes

  Background: Login Successful
    Given that the user is on the login page
    When the user enter the following credentials
      | document   | password       |
      | 1111111111 | contraseña1234 |
    Then the user should see the main page

  Scenario: purchase of many products
    Given the user is in the main page and clicks on some option of menu navigation
    When the user add a product into the cart
    And the user repeat this process other twice
    And the user clicks on the cart and see cart
    And the user clicks on finalizar compra and clicks on continuar
    And the user filled out the form with their data and clicks on pagar
    Then the user should see the payment gateway
