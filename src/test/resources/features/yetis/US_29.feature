
Feature:US_29 As an administrator, I want to have a Rejected Loans page in the panel to view rejected loans.

  Scenario: TC_01 User must be able to access the Rejected Loans page

    Given As admin, go to https://qa.loantechexper.com/admin page
    And   Enter a valid username and password and press the login button.
    Then  Verify that the admin is on the homepage
    And   Close the page

    Scenario: TC_02 Rejected loans (with SN, Loan No.|Plan,
              User, Amount, Installment Amount, Installment, Created | Next Installment, Status information)
              should be displayed in the Rejected Loans Table on the page.

      Given As