
Feature: As an administrator, I want to have an admin panel to do my administrative work and to be able to log in to the admin panel with my registered email and password.
  @wip
  Scenario: TC01: The website must be accessible from the browser with the user (Given URL)

    Given Launch "browser"
    When Navigate to "UrlAdmin"
    And Verify that Admin homepage is visible successfully
    And Close the page

    Scenario: TC02: In the login window on the site login page, it must be verified that the Username and Password textBoxes and the LOGIN button are visible and functional.

      Given Open the web "browser"
      When Navigate to "UrlAdmin"
      When On the page that appears, fill in the "Username" and "password" textboxes
      When Click the LOGIN button
      And Confirm that you can successfully access the Admin Page
      Then Close the page

      Scenario: TC03: The home page must be visible when accessing the website.

        Given Open the web "browser"
        When Navigate to "UrlAdmin"
        When On the page that appears, fill in the "Username" and "password" textboxes
        When Click the LOGIN button
        And Confirm that Admin Homepage is visible
        Then Close the page

