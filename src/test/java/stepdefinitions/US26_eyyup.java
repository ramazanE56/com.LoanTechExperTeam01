package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.AdminDashBoardPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US26_eyyup {
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();

    @Given("Enter the  {string}  in the browser's address bar and press the Enter key.")
    public void enter_the_in_the_browser_s_address_bar_and_press_the_enter_key(String UrlAdmin) {
        Driver.getDriver().get(ConfigReader.getProperty(UrlAdmin));

    }

    @Then("Fill in the admin credentials.")
    public void fill_in_the_admin_credentials() {
        adminDashBoardPage.adminUserName.sendKeys(ConfigReader.getProperty("AdminUserName"));
        adminDashBoardPage.adminPassword.sendKeys(ConfigReader.getProperty("AdminPassword"));


    }

    @Then("Click the Login button.")
    public void click_the_login_button() {
        adminDashBoardPage.loginButton.click();

    }

    @Then("Click to the Loans menu.")
    public void click_to_the_loans_menu() {
        adminDashBoardPage.loansbutton.click();

    }

    @Then("Click on the Pending Loans link.")
    public void click_on_the_pending_loans_link() {
        adminDashBoardPage.pendingLoansButton.click();

    }

    @Then("Verify that access to the Pending Loans page is successful.")
    public void verify_that_access_to_the_pending_loans_page_is_successful() {
        Assert.assertTrue(adminDashBoardPage.pendingloanspost.isDisplayed());

    }

    @Then("View the Pending Loans table.")
    public void view_the_pending_loans_table() {
        List<WebElement> loansTable = adminDashBoardPage.pendingLoansTable;

        ReusableMethods.wait(2);
        for (WebElement each : loansTable
        ) {
            ReusableMethods.wait(1);
            System.out.println(each);


        }


    }

    @Then("Viewed the information of pending loans on the Pending Loans page")
    public void viewedTheInformationOfPendingLoansOnThePendingLoansPage() {
        ReusableMethods.wait(1);
        List<WebElement> loansInfirmationlist = adminDashBoardPage.pendingLoansInformation;
        ReusableMethods.wait(1);
        for (WebElement each : loansInfirmationlist
        ) {
ReusableMethods.wait(1);
            System.out.println(each);
            Assert.assertTrue(each.isDisplayed());
            Assert.assertTrue(loansInfirmationlist.size()>0);
        }

    }

    @Then("Searched in the Pending Loans table using loan number and start date information.")
    public void searchedInThePendingLoansTableUsingLoanNumberAndStartDateInformation() {
       ReusableMethods.wait(1);
       adminDashBoardPage.loanNo.click();
       adminDashBoardPage.loanNo.sendKeys(ConfigReader.getProperty("LoanNo"));
       ReusableMethods.wait(1);
       adminDashBoardPage.dateNo.click();
       ReusableMethods.wait(1);
        adminDashBoardPage.dateNo.sendKeys(ConfigReader.getProperty("LoanDate"));
        ReusableMethods.wait(1);
        adminDashBoardPage.searchbutton.click();

    }

    @And("Reviewed the details and installment information in Pending Loans.")
    public void reviewedTheDetailsAndInstallmentInformationInPendingLoans() {

        Assert.assertTrue(adminDashBoardPage.plDetails.isDisplayed());
        Assert.assertTrue(adminDashBoardPage.plInstallments.isDisplayed());


    }

    @Then("Clicked on the Details button on the page.")
    public void clickedOnTheDetailsButtonOnThePage() {

        adminDashBoardPage.loanNo.sendKeys("eyyupyilmaz");
        adminDashBoardPage.searchbutton.click();

        adminDashBoardPage.plDetails.click();
      ReusableMethods.wait(2);

    }

    @And("Viewed the credit details on the opened page \\(plan, date, etc.).")
    public void viewedTheCreditDetailsOnTheOpenedPagePlanDateEtc() {

        Assert.assertTrue(adminDashBoardPage.loanDetails.isDisplayed());
    }

    @And("Click on the Approve button on the page.")
    public void clickOnTheApproveButtonOnThePage() {
        adminDashBoardPage.approveButton.click();
        ReusableMethods.wait(2);

    }

    @And("Accept the displayed alert, and the credit is approved.")
    public void acceptTheDisplayedAlertAndTheCreditIsApproved() {
        adminDashBoardPage.approveYes.click();
        ReusableMethods.wait(2);
    }

    @And("Click on the Reject button on the page.")
    public void clickOnTheRejectButtonOnThePage() {

        adminDashBoardPage.rejectButton.click();

        adminDashBoardPage.rejecttext.sendKeys("not approved.");
        ReusableMethods.wait(2);

        
    }

    @And("The submit button is clicked, the loan is not approved.")
    public void theSubmitButtonIsClickedTheLoanIsNotApproved() {
        adminDashBoardPage.rejectSubmit.click();



    }

    @And("Click on the Installments link.")
    public void clickOnTheInstallmentsLink() {
        adminDashBoardPage.plInstallments.click();
        ReusableMethods.wait(2);

    }

    @And("View the information under the Installments menu.")
    public void viewTheInformationUnderTheInstallmentsMenu() {

        Assert.assertTrue(adminDashBoardPage.loanSummaray.isDisplayed());
    }

    @And("Verify that you have returned to the Loans page.")
    public void verifyThatYouHaveReturnedToTheLoansPage() {

        adminDashBoardPage.backButton.click();
        Assert.assertTrue(adminDashBoardPage.alLoansPost.isDisplayed());


    }
}
