Feature: purchase flow processes


  Background: Successful login
    Given the user is in the login page
    When the user enter the following credentials
      | document   | password       |
      | 1111111111 | contraseña1234 |
    Then the user should see the main page


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
