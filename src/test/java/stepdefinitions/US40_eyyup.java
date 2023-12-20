package stepdefinitions;

import io.cucumber.core.backend.TestCaseState;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.qameta.allure.Allure;
import org.junit.Assert;
import org.openqa.selenium.*;
import pages.DashBoardPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.io.ByteArrayInputStream;
import java.util.List;

public class US40_eyyup {

    DashBoardPage dashBoardPage = new DashBoardPage();


    @Then("Click on the Manage Users link.")
    public void click_on_the_manage_users_link() {
        dashBoardPage.menageUsersLink.click();


    }

    @Then("Click the Active Users link and verify its visibility.")
    public void click_the_active_users_link_and_verify_its_visibility() {

        Assert.assertTrue(dashBoardPage.activeUserLink.isDisplayed());
        dashBoardPage.activeUserLink.click();

    }


    @Then("Verify that the list under Active Users are displayed.")
    public void verifyThatTheListUnderActiveUsersAreDisplayed() {
        Assert.assertTrue(dashBoardPage.activeUserList.isDisplayed());
        ReusableMethods.wait(2);
    }

    @And("Click on the Details button for any user.")
    public void clickOnTheDetailsButtonForAnyUser() {
        dashBoardPage.detailsButton.click();

    }

    @And("Verify that the User Detail-Username page has been reached.")
    public void verifyThatTheUserDetailUsernamePageHasBeenReached() {

        Assert.assertTrue(dashBoardPage.userDetailButton.isDisplayed());
    }


    @Then("Under the Withdrawn heading, click on the View All link, and go to the Withdrawals Log page.")
    public void underTheWithdrawnHeadingClickOnTheViewAllLinkAndGoToTheWithdrawalsLogPage() {
        dashBoardPage.viewAllButton.click();

    }

    @And("Confirm that the list and list headers are displayed on the page.")
    public void confirmThatTheListAndListHeadersAreDisplayedOnThePage() {

        Assert.assertTrue(dashBoardPage.listenHeaders.isDisplayed());
    }


    @And("Confirm that the Approved Withdrawals, Pending Withdrawals, Rejected Withdrawals links are displayed.")
    public void confirmThatTheApprovedWithdrawalsPendingWithdrawalsRejectedWithdrawalsLinksAreDisplayed() {

        ReusableMethods.wait(2);


        Assert.assertTrue(dashBoardPage.approvedwithdrawals.isDisplayed());
        Assert.assertTrue(dashBoardPage.pendingwithdrawals.isDisplayed());
        Assert.assertTrue(dashBoardPage.rejectedwithdrawals.isDisplayed());
    }

    @Then("Click on the Approved Withdrawals link.")
    public void clickOnTheApprovedWithdrawalsLink() {
        dashBoardPage.approvedwithdrawals.click();


    }

    @And("Verify that the Details button is displayed on the Approved Withdrawals page.")
    public void verifyThatTheDetailsButtonIsDisplayedOnTheApprovedWithdrawalsPage() {
        ReusableMethods.wait(1);

        Assert.assertTrue(dashBoardPage.approvvedDetailsbutton.isDisplayed());
        ReusableMethods.wait(1);

        dashBoardPage.approvvedDetailsbutton.click();
    }

    @And("Click on the Details button.")
    public void clickOnTheDetailsButton() {
        dashBoardPage.approvvedDetailsbutton.click();

    }

    @And("View the information within the card.")
    public void viewTheInformationWithinTheCard() {

        ReusableMethods.wait(1);
        List<WebElement> userInformation = dashBoardPage.approvedUserInformation;
        for (WebElement each : userInformation
        ) {

            ReusableMethods.wait(2);
            System.out.println(userInformation);

        }

        Assert.assertFalse(dashBoardPage.approvedUserInformation.isEmpty());


    }

    @And("Click on the Pending Withdrawn heading.")
    public void clickOnThePendingWithdrawnHeading() {
        dashBoardPage.pendingwithdrawals.click();

    }

    @Then("Confirm the visibility of the Pending and Details buttons on this page.")
    public void confirmTheVisibilityOfThePendingAndDetailsButtonsOnThisPage() {

        Assert.assertTrue(dashBoardPage.statusPending.isDisplayed());
        Assert.assertTrue(dashBoardPage.pendingDetailsButton.isDisplayed());
    }


    @And("On the opened page, click on the Details button.")
    public void onTheOpenedPageClickOnTheDetailsButton() {
        dashBoardPage.pendingDetailsButton.click();

    }

    @And("Confirm the visibility of the Approve and Reject buttons on the page that opens.")
    public void confirmTheVisibilityOfTheApproveAndRejectButtonsOnThePageThatOpens() {

        Assert.assertTrue(dashBoardPage.pendingApproveButton.isDisplayed());
        Assert.assertTrue(dashBoardPage.pendingRejectButton.isDisplayed());
    }

    @Then("On the page, click on the Reject button, fill in the required fields, and click on the submit button.")
    public void onThePageClickOnTheRejectButtonFillInTheRequiredFieldsAndClickOnTheSubmitButton() {
        dashBoardPage.pendingRejectButton.click();
        ReusableMethods.wait(1);
        dashBoardPage.pendingRejecttext.sendKeys("don't approved");
        ReusableMethods.wait(1);
        dashBoardPage.pendingRejectSubmit.click();
        
    }

    @And("Confirm the display of the Withdrawal rejected successfully message.")
    public void confirmTheDisplayOfTheWithdrawalRejectedSuccessfullyMessage() {

        Assert.assertTrue(dashBoardPage.pendingRejecdetsuccessfully.isDisplayed());
    }

    @Then("On the page, click on the Approved button, fill in the required fields, and click on the submit button.")
    public void onThePageClickOnTheApprovedButtonFillInTheRequiredFieldsAndClickOnTheSubmitButton() {
        dashBoardPage.pendingApproveButton.click();
        ReusableMethods.wait(1);
        dashBoardPage.pendingApproveText.sendKeys("yes");
        ReusableMethods.wait(1);
        dashBoardPage.pendingApproveSubmit.click();
        
    }

    @And("Confirm the display of the Withdrawal approved successfully message.")
    public void confirmTheDisplayOfTheWithdrawalApprovedSuccessfullyMessage() {
        dashBoardPage.pendingapprovedsuccesfully.isDisplayed();
        ReusableMethods.wait(1);
        System.out.println("eyyup  "+dashBoardPage.pendingapprovedsuccesfully.getText());

    }

    @And("Click on the Rejected Withdrawals link.")
    public void clickOnTheRejectedWithdrawalsLink() {

        dashBoardPage.rejectedwithdrawals.click();

    }


    @Then("Verify that the status is displayed as Rejected.")
    public void verifyThatTheStatusIsDisplayedAsRejected() {

        Assert.assertTrue(dashBoardPage.statusRejected.isDisplayed());
    }

    @Then("View the card information on the page.")
    public void viewTheCardInformationOnThePage() {

        dashBoardPage.rejectWithdravalsDetails.click();
        ReusableMethods.wait(1);

        List<WebElement> information=dashBoardPage.rejectCardinformation;

        for (WebElement each: information
             ) {
            ReusableMethods.wait(1);
            System.out.println(each.getText());

        }
        Assert.assertTrue(dashBoardPage.rejectCardinformation.size()>0);
    }
}
