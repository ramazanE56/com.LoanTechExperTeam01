Feature: I would like to have a page to register as a visitor

  Background:Users use these steps to log in to the site.
    * The visitor enters the site with the given "Url"

  Scenario: TC01 : It must be verified that the Get Started Button Link is visible and active on the Home Page.
    * Verify that the Get Started Button Link is Visible on the Home Page
    * Click on the Get Started Button Link on the Home Page.
    * Verify that the register text is visible on the register page.
    * Close the page

  Scenario: TC02 : Verify that the registration form is visible on the registration page
    * Click on the Get Started Button Link on the Home Page.
    * Verify that the Welcome To Loantech Expert form title is visible on the Register page
    * Close the page

  Scenario: TC03 : It must be verified that the Username, Email Address, Country DropDown, Mobile Number, Password, Confirm Password text boxes are visible in the form.
    * Click on the Get Started Button Link on the Home Page.
    * Verify that the username text box is visible
    * Verify that the Email Address text box is visible
    * Verify that the Country DropDown is visible
    * Verify that the Mobile Number text box is visible
    * Verify that the Password text box is visible
    * Verify that the Confirm Password text box is visible
    * Close the page


  Scenario: TC04 : It must be verified that a unique value of at least 6 characters can be entered in the Username box.
    * Click on the Get Started Button Link on the Home Page.
    * A unique username with at least 6 characters is entered in the Username box.
    * Close the page

    Scenario: TC05 : It must be verified that valid e-mail information containing the @ sign can be entered in the e-mail text box.
    * Click on the Get Started Button Link on the Home Page.
    * A unique username with at least 6 characters is entered in the Username box.
    * It is verified that valid e-mail information containing the @ sign can be entered in the e-mail text box
    * Close the page
  @wip
    Scenario: TC06 : It must be verified that country selection is possible from the Country menu.
    * Click on the Get Started Button Link on the Home Page.
    * A unique username with at least 6 characters is entered in the Username box.
    * Valid e-mail information containing the @ sign is entered into the e-mail text box
    * It is verified that country selection is possible from the Country menu.
    * Close the page

    Scenario: TC07 : It must be verified that country selection is possible from the Country menu.
    * Click on the Get Started Button Link on the Home Page.
    * A unique username with at least 6 characters is entered in the Username box.
    * Valid e-mail information containing the @ sign is entered into the e-mail text box



