Feature: US_50 As an administrator (admin), I want to be able to send notifications to all users

  Background: You can go to the admin homepage by following these steps.
    *  As admin, go to "adminUrl" page
    *  Enter a valid "adminUsername0" and "passwordAdmin" and press the login button.

    Scenario: TC_01 The Notification to All Link must be visible and active in the admin dashboard.

    Scenario: TC_02 There should be a filtering icon under the 'Being Sent' heading on the admin/users/send-notification page,
                and the administrator should be able to send a message by setting a specific starting date and period with a subject title and message to all users or to the users he/she can choose.

    Scenario: TC_03 You should receive a warning message indicating a successful send.


    Scenario: TC_04 When any error is encountered (such as leaving a required field blank), an error message warning should be displayed.
