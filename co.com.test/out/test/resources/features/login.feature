@Login
Feature: Login

  @LoginSuccessfull
  Scenario Outline: Login successfull
    Given the user enters the login module
    When sign in with correct credencials <username> and <password>
    Then view information of him <username>

    Examples:
      | username  | password  |
      | sebastian | Algo12345 |

  @LoginWrong
  Scenario Outline: Login with wrong credencials
    Given the user enters the login module
    When sign in with wrong credencials <username> and <password>
    Then view the login message error

    Examples:
      | username | password |
      | test     | test123  |
