Feature: Test Login functionality

  @smoke
  Scenario Outline: Check login is successfully with valid credentials
    Given user is on login page
    When user enters <username> and <password>
    And clicks on login button
    Then user is navigated to the home page

    @valid
    Examples: 
      | username | password |
      | Admin    | admin123 |

    @invalid
    Examples: 
      | username | password |
      | Admin123 | abc456   |
