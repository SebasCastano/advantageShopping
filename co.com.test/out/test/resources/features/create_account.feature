@CreateAccounts
Feature: Create Accounts

  @CreateAccountsWithRequiredFields
  Scenario Outline: Create user successfull
    Given the user enters the create account module
    When create a account with required fields <username>, <email> and <password>
    Then view information of him <username>

    Examples:
      | username  | email          | password  |
      | sebastianx | nuevox@mail.com | Algo12345 |

  @CreateAccountsExisting
  Scenario Outline: Create user existing
    Given the user enters the create account module
    When create a account existing with <username>, <email> and <password>
    Then view the account existing message error

    Examples:
      | username  | email          | password  |
      | sebastianx | nuevo@mail.com | Algo12345 |
