Feature: Register

  Scenario Outline: Register Successful
    Given the user is in the login page
    When the user enter ethe credentials
      | document   | email   | password   |
      | <document> | <email> | <password> |
    Then the user should see the dashboard

    Examples:
      | document   | email                                               | password       |
      | 1029380404 | winnerstosenasoft2023definitivofinalfinal@gmail.com | panaderia_@29@ |

  Scenario Outline: Register Failed
    Given the user is in the login page
    When the user enter the failed credentials
      | document   | email   | password   |
      | <document> | <email> | <password> |
    Then the user should see a error message
    Examples:
      | document | email                           | password        |
      | eeeee    | winnerstosenasoft2023@gmail.com | atunconmayonesa |


  Scenario Outline: Register Empty
    Given the user is in the login page
    When the user enter the empty credentials
      | document   | email   | password   |
      | <document> | <email> | <password> |
    Then the user should see a error message

    Examples:
      | document | email | password |
      |          |       |          |