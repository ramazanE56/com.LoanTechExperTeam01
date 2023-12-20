package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import netscape.javascript.JSException;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.util.List;

public class US27_Umit {
    AdminLoginPage adminLoginPage = new AdminLoginPage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("As admin, go to {string} Adminpage")
    public void as_admin_go_to_Adminpage(String adminUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(adminUrl));

    }

    @Given("Enter {string} and {string} and press the login button.")
    public void enter_and_and_press_the_login_button(String adminNameUmit, String passwordAdmin) {
        adminLoginPage.adminUserNameBox.click();
        adminLoginPage.adminUserNameBox.sendKeys(ConfigReader.getProperty(adminNameUmit));
        adminLoginPage.adminPasswordBox.click();
        adminLoginPage.adminPasswordBox.sendKeys(ConfigReader.getProperty(passwordAdmin));
        jse.executeScript("arguments[0].click();", adminLoginPage.adminLoginButton);
    }

    @Given("Click on Running loans under the loans heading.")
    public void click_on_Running_loans_under_the_loans_heading() {
        adminDashBoardPage.loansDropMenu.click();
        ReusableMethods.wait(2);
        adminDashBoardPage.runningLoansButton.click();

    }

    @Given("Verify that the admin is on the Adminhomepage")
    public void verify_that_the_admin_is_on_the_Adminhomepage() {
        Assert.assertTrue(adminDashBoardPage.rejectedLoanPageTitle.isDisplayed());

    }

    @Given("Verify that the Running Loans appears")
    public void verify_that_the_running_loans_appears() {
        List<WebElement> titleElements = adminDashBoardPage.runnigPageTitleList;

        for (WebElement each : titleElements
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);

    }

    @Given("The information to be searchis entered for Loan number or Start date-End Date.")
    public void the_information_to_be_searchis_entered_for_loan_number_or_start_date_end_date() {
        adminDashBoardPage.dateSearchBox.click();
        adminDashBoardPage.dateSearchBox.sendKeys("12/18/2023");
        ReusableMethods.wait(2);
        adminDashBoardPage.dateSearchButton.click();
        adminDashBoardPage.dateSearchBox.clear();
        adminDashBoardPage.loanNoSearchBox.click();
        adminDashBoardPage.loanNoSearchBox.sendKeys("OOUSW4DPGQMF");
        ReusableMethods.wait(2);
        adminDashBoardPage.loanNoSearchButton.click();


    }

    @Given("Verifies that searches can be made")
    public void verifies_that_searches_can_be_made() {

        List<WebElement> resultElements = adminDashBoardPage.searchResultTableElements;
        for (WebElement each : resultElements
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);


    }

    @Given("Click on the Details links and verify that the Details page is displayed")
    public void click_on_the_details_links_and_verify_that_the_details_page_is_displayed() {
        adminDashBoardPage.detailsButton.click();
        Assert.assertTrue(adminDashBoardPage.loanDetailsText.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);


    }

    @Given("Click on the Installment links and verify that the Installment page is displayed")
    public void click_on_the_installment_links_and_verify_that_the_installment_page_is_displayed() {
        adminDashBoardPage.installmentsButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminDashBoardPage.installmentsText.isDisplayed());

    }

    @Given("Click on the Details links")
    public void click_on_the_details_links() {
        adminDashBoardPage.detailsButton.click();

    }

    @Given("It should be verified that the loan details can be accessed on the Details page.")
    public void it_should_be_verified_that_the_loan_details_can_be_accessed_on_the_details_page() {
        List<WebElement> planInformationTable = adminDashBoardPage.loanDetailsCard;
        for (WebElement each : planInformationTable
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);

    }

    @Given("Verify that you see credit status information in loans details")
    public void verify_that_you_see_credit_status_information_in_loans_details() {
        adminDashBoardPage.statusCodeText.isDisplayed();
    }

    @Given("Click on the Installment links")
    public void click_on_the_installment_links() {
        adminDashBoardPage.installmentsButton.click();

    }

    @Given("Verifies that their titles are visible on the Installments page")
    public void verifies_that_their_titles_are_visible_on_the_installments_page() {
        List<WebElement> installmentsPageTitle = adminDashBoardPage.loanSummaryCardText;
        for (WebElement each : installmentsPageTitle
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);

    }

    @Given("Installments verifies that page titles are displayed")
    public void installments_verifies_that_page_titles_are_displayed() {
        List<WebElement> installmentsHeader = adminDashBoardPage.installmentsHeader;
        for (WebElement each : installmentsHeader
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);
    }

    @Given("Press the back button")
    public void press_the_back_button() {
        adminDashBoardPage.backButton.click();
        ReusableMethods.wait(1);

    }

    @Given("It is confirmed that Running loans came again")
    public void it_is_confirmed_that_running_loans_came_again() {

        String expectedUrl = ConfigReader.getProperty("runningPageUrl");
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

    }

    @Given("Verify that installments  than {int} continue to be listed")
    public void verify_that_installments_than_continue_to_be_listed(Integer Int) throws AWTException {
        jse.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ReusableMethods.wait(2);
        String instNumber = adminDashBoardPage.installmentNumber.getText();
        if (instNumber.equals("20")) {
            ReusableMethods.coordinateClick(1231, 651);
            System.out.println("the number of installments is greater than 20");
        } else {
            System.out.println("number of installments is less than 20");
        }
    }

}

