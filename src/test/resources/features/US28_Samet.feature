Feature: US28 : As an administrator, I want to have a Due Loans page to view and process term loans.

  Scenario: TC01: By clicking on the "Due Loans" page link under the Loans menu heading, the "Due Loans" page should be accessed

    Given Open the web "browser"
    When Navigate to "UrlAdmin"
    When On the page that appears, fill in the "Username" and "password" textboxes
    When Click the LOGIN button
    When On the page that appears, click the "Loans Menu" tab
    When Click on the 'Due Loans' page link
    And Verify that "Due Loans" page is accessible
    Then Close the page

    Scenario: TC02: Due Installment Loans Table (with SN, Loan No.|Plan, User, Amount, Installment Amount, Installment, Created | Next Installment, Status information) should be displayed on the Due Loans page.

      Given Open the web "browser"
      When Navigate to "UrlAdmin"
      When On the page that appears, fill in the "Username" and "password" textboxes
      When Click the LOGIN button
      When On the page that appears, click the "Loans Menu" tab
      When Click on the 'Due Loans' page link
      And Verify that SN, Loan No.|Plan, User, Amount, Installment Amount, Installment, Created | Next Installment, Status information) should be displayed
      Then Close the page