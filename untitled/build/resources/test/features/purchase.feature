Feature: purchase flow processes


  Background: Successful login
    Given the user is in the login page
    When the user enter the following credentials
      | document   | password       |
      | 1111111111 | contraseña1234 |
    Then the user should see the main page

<<<<<<< HEAD

  Scenario: buy many products
    Given the user is in the main page and clicks on some categorie
      | categories |
      | 10         |
    When the user add a product into the cart
      | numProduct | size |
      | 1          | 10   |
    And the user repeat this process other twice
      | categories | numProduct | size |
      | 10         | 1          | 10   |
      | 10         | 2          | 10   |

    And the user clicks on the cart and see cart
    And the user clicks on finalize purchase and clicks on continue
    And the user filled out the form with their data and clicks on buy
    Then the user should see the payment gateway

  Scenario Outline: buy shoes
=======
  Scenario: buy shoes
>>>>>>> c5f3bb283bd47722cfc98dc91ae1c5bcf2bd6be2
    Given that the user is on the "shoes" section
    When he select the product number "1" with the size "37"
    And user clicks on buy button
    Then the user should see the buy car

