Feature: purchase flow processes

  Background: Successful login
    Given the user is in the login page
    When the user enter the following credentials
      | document   | password       |
      | 1111111111 | contraseña1234 |
    Then the user should see the main page


  Scenario Outline: Add many products on the cart
    Given the user is in the main page and clicks on "shoes" categorie
    When the user add a tree product into the cart
      | categories   | numProduct   | size   | color   |
      | <categories> | <numProduct> | <size> | <color> |
    And the user clicks on the icon cart
    Then the user should see the content of the cart

    Examples:
      | categories | numProduct | size | color |
      | 10         | 1          | 37   | 1     |


  Scenario: buy shoes
    Given that the user is on the "shoes" section
    When he select the product number "1" with the size "37"
    And user clicks on buy button
    Then the user should see the buy car
