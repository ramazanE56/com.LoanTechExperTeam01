  @US_23
  Feature: US_23 As a User, I want to have a page on the Home Page where I can access Loan Plans.

    @TC_04
    Scenario: TC_01 Loan cards should be displayed under the Plans link in the top bar of the homepage.

      Given The user goes to the given "url".
      And The user clicks on the login button.
      And The user enters "usernameHalit" username.
      And The user enters "userPassword" password.
      And The user clicks on the login button.
      And The user clicks on the home page logo.
      And The Plans button is active and visible in the home page header section.
      And Click the Plans button in the header section of the home page.
      And It is verified that the Plans page is opened.

    Scenario: TC_02 When the Basic Loan button is clicked, the titles Basic Loan 1, Test_Loan, Car Loan should be
                displayed on the cards opened.

      Given The user goes to the given "url".
      And The user clicks on the login button.
      And The user enters "usernameHalit" username.
      And The user enters "userPassword" password.
      And The user clicks on the login button.
      And The user clicks on the home page logo.
      And Click on the Plans button.
      And The Basic Loan button appears and it is confirmed that it is active.
      And Click on the Basic Loan button.
      And It is confirmed that the Basic Loan page has been opened.
      And Basic Loan 1 is visible and active.
      And Test_Loan is visible and active.
      And Car Loan visible and active.