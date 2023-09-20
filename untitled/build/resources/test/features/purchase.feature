Feature: purchase flow processes

<<<<<<< HEAD
  Background: Login Successful
    Given that the user is on the login page
=======
  Background: Successful login
    Given the user is in the login page
>>>>>>> add2fc9b75b4407ddaba9a05c490ee76bddd5eca
    When the user enter the following credentials
      | document   | password       |
      | 1111111111 | contraseña1234 |
    Then the user should see the main page

<<<<<<< HEAD
  Scenario: purchase of many products
    Given the user is in the main page and clicks on some option of menu navigation
    When the user add a product into the cart
    And the user repeat this process other twice
    And the user clicks on the cart and see cart
    And the user clicks on finalizar compra and clicks on continuar
    And the user filled out the form with their data and clicks on pagar
    Then the user should see the payment gateway
=======
  Scenario Outline: buy shoes
    Given that the user is on the shoes section
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
>>>>>>> add2fc9b75b4407ddaba9a05c490ee76bddd5eca
