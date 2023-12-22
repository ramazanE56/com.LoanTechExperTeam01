package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.hu.De;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.URL;

import static org.bouncycastle.oer.its.template.etsi102941.EtsiTs102941TrustLists.Url;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class US38_Samet {

    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();
    AdminLoginPage adminLoginPage = new AdminLoginPage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());


    @When("Click Manage Users link on the DashboardPage")
    public void clickManageUsersLinkOnTheDashboardPage() {

        adminDashBoardPage.ManageUserslink.click();
        adminDashBoardPage.ActiveUserslink.click();

    }

    @And("Verify Active Users link is appear on the DashboardPage")
    public void verifyActiveUsersLinkIsAppearOnTheDashboardPage() {
        assertTrue(adminDashBoardPage.ActiveUsersYaziElementi.isDisplayed());
    }

    @When("Click on the Active Users link on the DashboardPage")
    public void clickOnTheActiveUsersLinkOnTheDashboardPage() {
        adminDashBoardPage.ManageUserslink.click();
        adminDashBoardPage.ActiveUserslink.click();

    }

    @And("Verify Active Users List and list titles is displayed")
    public void verifyActiveUsersListAndListTitlesIsDisplayed() {
        assertTrue(adminDashBoardPage.ActiveUsersListTitles.isDisplayed());
    }

    @When("Verify the Details Button is visible and then click Details Button")
    public void verifyTheDetailsButtonIsVisibleAndThenClickDetailsButton() {
        assertTrue(adminDashBoardPage.DetailsButton.isDisplayed());
        ReusableMethods.wait(2);
        adminDashBoardPage.DetailsButton.click();
        ReusableMethods.wait(2);
    }

    @And("Verify that the user is redirected User Detail-Username page")
    public void verifyThatTheUserIsRedirectedUserDetailUsernamePage() {
        assertTrue(adminDashBoardPage.UserDetail.isDisplayed());
        ReusableMethods.wait(2);
    }

    @When("Verify the view all icon on the User Detail page")
    public void verifyTheViewAllIconOnTheUserDetailPage() {
        adminDashBoardPage.viewAllbutton.isDisplayed();
        ReusableMethods.wait(2);
    }

    @When("Click on the view all icon")
    public void clickOnTheViewAllIcon() {
        adminDashBoardPage.viewAllbutton.click();

    }

    @And("Verify that the user is redirected Deposit History page")
    public void verifyThatTheUserIsRedirectedDepositHistoryPage() {
        assertTrue(adminDashBoardPage.UserDetail.isDisplayed());
    }

    @And("Verify that List and list titles should be displayed on the page")
    public void verifyThatListAndListTitlesShouldBeDisplayedOnThePage() {
        assertTrue(adminDashBoardPage.DepositHistoryListTitles.isDisplayed());
    }

    @When("Click Active Users button on the Admin Dashboard page")
    public void clickActiveUsersButtonOnTheAdminDashboardPage() {
        adminDashBoardPage.ManageUserslink.click();
        adminDashBoardPage.ActiveUserslink.click();
    }

    @When("Verify Details button is visible and click the Details button")
    public void verifyDetailsButtonIsVisibleAndClickTheDetailsButton() {
        assertTrue(adminDashBoardPage.DetailsButton.isDisplayed());
        adminDashBoardPage.DetailsButton.click();

        ReusableMethods.wait(1);
        adminDashBoardPage.PendingDeposits.click();
        adminDashBoardPage.PendingDepositsDetailsButton.click();
    }


    @And("Verify that the text x requested x USD should be displayed")
    public void verifyThatTheTextXRequestedXUSDShouldBeDisplayed() {

        String pageTitleText = adminDashBoardPage.RequestXUSDTitle.getText();
        assertTrue("Page title should contain 'requested'", pageTitleText.contains("requested"));
        assertTrue("Page title should contain 'USD'", pageTitleText.contains("USD"));
    }

    @And("Verify that Deposit Card and Date, Transaction Number, Username, Method, Amount, Charge, After Charge, Rate, Payable, Status titles is visible")
    public void verifyThatDepositCardAndDateTransactionNumberUsernameMethodAmountChargeAfterChargeRatePayableStatusTitlesIsVisible() {
        String DepositCardInformations = adminDashBoardPage.DepositCardViaManuel.getText();

        assertTrue("Page title should contain 'Date'", DepositCardInformations.contains("Date"));
        assertTrue("Page title should contain 'Transaction Number'", DepositCardInformations.contains("Transaction Number"));
        assertTrue("Page title should contain 'Username'", DepositCardInformations.contains("Username"));
        assertTrue("Page title should contain 'Method'", DepositCardInformations.contains("Method"));
        assertTrue("Page title should contain 'Amount'", DepositCardInformations.contains("Amount"));
        assertTrue("Page title should contain 'Charge'", DepositCardInformations.contains("Charge"));
        assertTrue("Page title should contain 'After Charge'", DepositCardInformations.contains("After Charge"));
        assertTrue("Page title should contain 'Rate'", DepositCardInformations.contains("Rate"));
        assertTrue("Page title should contain 'Payable'", DepositCardInformations.contains("Payable"));
        assertTrue("Page title should contain 'Status'", DepositCardInformations.contains("Status"));

    }

    @When("Click on the All Deposits button")
    public void clickOnTheAllDepositsButton() {

        adminDashBoardPage.AllDepositsButton.click();
        ReusableMethods.wait(1);
    }

    @And("Verify that Successful Deposit, Pending Deposit, Rejected Deposit, Initiated Deposit titles and values are visible")
    public void verifyThatSuccessfulDepositPendingDepositRejectedDepositInitiatedDepositTitlesAndValuesAreVisible() {
        assertTrue(adminDashBoardPage.SuccessfulDeposits.isDisplayed());
        ReusableMethods.wait(2);
        assertTrue(adminDashBoardPage.PendingDeposits.isDisplayed());
        ReusableMethods.wait(2);
        assertTrue(adminDashBoardPage.RejectedDeposits.isDisplayed());
        ReusableMethods.wait(2);
        assertTrue(adminDashBoardPage.InitiatedDeposits.isDisplayed());
    }

    @When("Click on the Successful Deposits heading")
    public void clickOnTheSuccessfulDepositsHeading() {
        adminDashBoardPage.SuccessfulDeposits.click();

    }

    @When("Verify that Succesful Deposits page is visible")
    public void verifyThatSuccesfulDepositsPageIsVisible() {
        assertTrue(adminDashBoardPage.SuccessfulDeposits.isDisplayed());
    }

    @When("Enter the credentilas in the Filtering and Search boxes")
    public void enterTheCredentilasInTheFilteringAndSearchBoxes() {
        adminDashBoardPage.SuccessfulDepositsSearchBox.click();

        adminDashBoardPage.SuccessfulDepositsDateSearchBoxSubmit.submit();
    }

    @When("Verify that Filtering and Search buttons are fonctional")
    public void verifyThatFilteringAndSearchButtonsAreFonctional() {
        assertTrue(adminDashBoardPage.SuccessfulDepositsSearchBox.isEnabled());

    }

    @And("Verify that a list of successful deposits are displayed")
    public void verifyThatAListOfSuccessfulDepositsAreDisplayed() {
        assertTrue(adminDashBoardPage.SuccessfulDepositsTableElement.isDisplayed());

    }

    @When("Click the Pending Deposits Heading")
    public void clickThePendingDepositsHeading() {
        adminDashBoardPage.PendingDeposits.click();
        ReusableMethods.wait(5);
    }

    @When("Verify that Pending Deposits page is visible")
    public void verifyThatPendingDepositsPageIsVisible() {
        assertTrue(adminDashBoardPage.PendingDepositsYaziElementi.isDisplayed());
        ReusableMethods.wait(2);

    }

    @When("Click on the Details button")
    public void clickOnTheDetailsButton() {
        adminDashBoardPage.PendingDepositsDetailsButton.click();

    }

    @And("Verify that Details button is active")
    public void verifyThatDetailsButtonIsActive() {
        assertTrue(adminDashBoardPage.PendingDepositsSuccessfulDetailsPage.isDisplayed());
        ReusableMethods.wait(2);
    }

    @And("Verify that Approve and Reject buttons on the Transaction Detail page")
    public void verifyThatApproveAndRejectButtonsOnTheTransactionDetailPage() {
        assertTrue(adminDashBoardPage.ApprouveButton.isDisplayed());
        assertTrue(adminDashBoardPage.RejectButton.isDisplayed());

    }

    @When("Click on the Reject button")
    public void clickOnTheRejectButton() {
        adminDashBoardPage.RejectButton.click();

    }

    @When("Fill in the Reason for Rejection section and Click SUBMIT button")
    public void fillInTheReasonForRejectionSectionAndClickSUBMITButton() {

        ReusableMethods.wait(2);
        adminDashBoardPage.ReasonforRejectionBox.click();
        adminDashBoardPage.ReasonforRejectionBox.sendKeys("Your income is not sufficient");
        adminDashBoardPage.RejectSubmitbutton.click();
    }

    @And("Verify that Deposit request rejected successfully is visible")
    public void verifyThatDepositRequestRejectedSuccessfullyIsVisible() {
        assertTrue(adminDashBoardPage.RequestRejectedSuccessfully.isDisplayed());

    }

    @When("Click on the Approve button")
    public void clickOnTheApproveButton() {
        adminDashBoardPage.ApprouveButton.click();
    }

    @When("On the page that appears click on the Yes button")
    public void onThePageThatAppearsClickOnTheYesButton() {
        adminDashBoardPage.PendingDepositsYesButton.click();

    }

    @And("Verify that Deposit request approved successfully is appeared")
    public void verifyThatDepositRequestApprovedSuccessfullyIsAppeared() {
        assertTrue(adminDashBoardPage.RequestApprouvedSuccessfully.isDisplayed());
    }

    @When("Type to samet in the searchtextbox and submit")
    public void typeToSametInTheSearchtextboxAndSubmit() {

        adminDashBoardPage.PendingDepositsSearchTextBox.click();
        adminDashBoardPage.PendingDepositsSearchTextBox.sendKeys("samet");
        adminDashBoardPage.PendingDepositsSearchTextSubmitbutton.click();

    }

    @When("Click on the first Details button")
    public void clickOnTheFirstDetailsButton() {
        adminDashBoardPage.PendingDepositsDetailsButtonSamet.click();
    }

    @When("Automatic deposit creation before main test")
    public void automaticDepositCreationBeforeMainTest() {

        adminDashBoardPage.UserpageDepositButtonElement.click();
        ReusableMethods.wait(1);
        adminDashBoardPage.UserpageDepositButtonElement.click();
        ReusableMethods.wait(1);
        adminDashBoardPage.UserDepositSelectGatewayElement.click();
        Select dropdown = new Select(adminDashBoardPage.UserDepositSelectGatewayElement);

        // Dropdown'ı açma ve bir seçenek seçme
        dropdown.selectByVisibleText("Manuel");

        adminDashBoardPage.UserPageAmountElement.click();

        adminDashBoardPage.UserPageAmountElement.sendKeys("1000");
        adminDashBoardPage.UserDepositSubmitButtonElement.click();
        ReusableMethods.wait(2);
        adminDashBoardPage.UserDepositPayNowButtonElement.click();

    }

    @Then("Click on the Login button.")
    public void click_on_the_login_button() {
        ReusableMethods.wait(2);
        adminDashBoardPage.AllowYaziElementi.click();
        ReusableMethods.wait(2);
        adminDashBoardPage.firstLogin.click();

    }

    @Then("Fill in user information.")
    public void fillInUserInformation() {
        ReusableMethods.wait(1);
        loginPage.userNameBoxElement.clear();
        ReusableMethods.wait(1);
        loginPage.userNameBoxElement.sendKeys(ConfigReader.getProperty("UsernameSamet"));
        loginPage.passwordElement.clear();
        ReusableMethods.wait(1);
        loginPage.passwordElement.sendKeys(ConfigReader.getProperty("password"));
        ReusableMethods.wait(1);
        loginPage.userLoginButtonElement2.click();
        ReusableMethods.wait(1);

    }

    @When("Click the Deposits button")
    public void clickTheDepositsButton() {
        ReusableMethods.wait(3);
        adminDashBoardPage.DepositsButton.click();


    }


    @When("Click the DepositsS button")
    public void clickTheDepositsSButton() {
        ReusableMethods.wait(3);
        adminDashBoardPage.DepositsButton.click();
        ReusableMethods.wait(3);
    }

    @When("Click the Pending Deposits")
    public void clickThePendingDeposits() {
        adminDashBoardPage.PendingDeposits.click();
    }

    @When("Click the Pending Deposits Detail button")
    public void clickThePendingDepositsDetailButton() {
        adminDashBoardPage.PendingDepositsDetailsButtonElement.click();
    }
}



