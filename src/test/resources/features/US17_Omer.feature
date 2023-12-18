Feature: US_17 As a registered user, I would like to have a page to manage my payment transactions.

  Background:   Background:Users use these steps to log in to the site.
    * The visitor enters the site with the given "Url"
    * Accept the cookies on page
    * Login with registered user information

    Scenario: TC_01 - TC_02 There should be a "Withdraw" button on the Dashboard page to manage withdrawals.
              WhenN the Withdraw button is clicked, it should redirect to the "Withdraw Money" page.

      * Verify that the withdraw button is visible and active
      * Click the withdraw button
      * Verify the Withdraw Money text is visible on page

    Scenario: TC_02 Method name must be selected from the "Method" dropdown menu.

      * Click the withdraw button
      * Verify that the Method Text is visible on page
      * Verify that the all option is visible

      Scenario: TC_03 A value between 300.00 USD - 8000.00 USD should be entered in the Amount textbox.

