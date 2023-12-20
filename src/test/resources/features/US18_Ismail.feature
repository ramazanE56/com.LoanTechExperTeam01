Feature: US18 : As a registered user, I want to have a page where I can see my Credit plans and get Credit.
  Background:Users use these steps to log in to the site.
    * The visitor enters the site with the given "Url"

  Scenario: TC01 : In order to manage loan transactions on the Dashboard page, there must be a "Take Loan" link element in the navbar on the left and it must be verified that when clicked, it is directed to the "Loan Plans" page.
    * Click on the login button
    * The registered "usernameIsmail" is entered in the Username Or Email box.
    * Registered user "password" is entered in the Your Password box.
    * Click on the login button to log in.
    * Verify that the Take Loan tab is visible
    * Click on the Take Loan button
    * Verify that Loan Plans appears
    * Close the page

    Scenario: TC02 : When the Car Loan 2 button is clicked on the Loan Plans page, the "Personal Finance Loan" card and Take Minimum $2,000.00 Take Maximum $5,000.00
    Per Installment 4% Installment Interval 20 Days Total Installment 20 information" and the "Apply Now" button will appear and verify that it is active
      * Click on the login button
      * The registered "usernameIsmail" is entered in the Username Or Email box.
      * Registered user "password" is entered in the Your Password box.
      * Click on the login button to log in.
      * Click on the Take Loan button
      * Click on the car loan button
      * Verify that Personal Finance Loan is visible
      * Verify that Take Maximum is visible
      * Verify that "$2,000.00" is visible
      * Verify that Take Minimum is visible
      * Verify that the "$5,000.00" is visible
      * Verify that Per Installment is visible
      * Verify this "4%" is visible
      * Verify that Installment Interval is visible
      * Verify that 20 Days is visible
      * Verify that Total Installment is visible
      * Verify that 20 is visible
      * Verify that Apply Now is visible
      * Verify that the Apply Now button is clickable
      * Close the page

    Scenario: TC03 : It must be verified that when the Apply Now button is clicked, you can go to the "Apply for Personal Finance Loan" page.
      * Click on the login button
      * The registered "usernameIsmail" is entered in the Username Or Email box.
      * Registered user "password" is entered in the Your Password box.
      * Click on the login button to log in.
      * Click on the Take Loan button
      * Click on the car loan button
      * Click on the Apply Now button
      * Verify that Apply for Personal Finance Loan appears
      * Close the page

    Scenario: TC04 : On the "Apply for Personal Finance Loan" page, the "Amount" value "Minimum Amount $2,000.00 -Maximum Amount $5,000.00" should be entered and the "Confirm" button should be visible and active and when clicked, a successful registration should be confirmed.
      * Click on the login button
      * The registered "usernameIsmail" is entered in the Username Or Email box.
      * Registered user "password" is entered in the Your Password box.
      * Click on the login button to log in.
      * Click on the Take Loan button
      * Click on the car loan button
      * Click on the Apply Now button
      * A number between "2000" and "5000" is entered in the Enter An Amount box
      * Verify that Confirm text is visible
      * Click on the Confirm button
      * Close the page