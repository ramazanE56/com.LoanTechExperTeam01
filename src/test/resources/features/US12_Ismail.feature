
Feature: I would like to have a page to register as a visitor
  Background:Users use these steps to log in to the site.
    * The visitor enters the site with the given "Url"

  Scenario: TC01 : It must be verified that the Get Started Button Link is visible and active on the Home Page.
    * Verify that the Get Started Button Link is Visible on the Home Page
    * Click on the Get Started Button Link on the Home Page.
    * Verify that the register text is visible on the register page.
    * Close the page
  @wip
    Scenario: TC02 : Verify that the registration form is visible on the registration page
      * Click on the Get Started Button Link on the Home Page.
      * Verify that the Welcome To Loantech Expert form title is visible on the Register page
      * Close the page