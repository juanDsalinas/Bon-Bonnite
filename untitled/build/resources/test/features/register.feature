Feature: Register

  Scenario Outline: Register Successful
    Given the user is in the login page
    When the user enter ethe credentials
      | document   | email   | password   |
      | <document> | <email> | <password> |
    Then the user should see the dashboard

    Examples:
<<<<<<< HEAD
      | document   | email                       | password       |
      | 9087261354 | winnerstosenasoft@gmail.com | paralelepipedo |
=======
      | document  | email                     | password      |
      | 123456789 | pepitoalcachofa@gmail.com | panecillo1234 |
>>>>>>> ba417a5727d2c03956cd80e243487e0a195ee7ed
