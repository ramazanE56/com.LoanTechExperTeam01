package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US29_Yetis {
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    AdminLoginPage adminLoginPage = new AdminLoginPage();
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();

    @Given("As admin, go to {string} page")
    public void as_admin_go_to_page(String adminUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(adminUrl));

    }

    @Given("Enter a valid {string} and {string} and press the login button.")
    public void enter_a_valid_and_and_press_the_login_button(String adminUsername, String passwordAdmin) {
        adminLoginPage.adminUserNameBox.click();
        adminLoginPage.adminUserNameBox.sendKeys(ConfigReader.getProperty(adminUsername));
        adminLoginPage.adminPasswordBox.click();
        adminLoginPage.adminPasswordBox.sendKeys(ConfigReader.getProperty(passwordAdmin));
        jse.executeScript("arguments[0].click();", adminLoginPage.adminLoginButton);

    }

    @Given("Click on reject loans under the loans heading.")
    public void click_on_reject_loans_under_the_loans_heading() {
        adminDashBoardPage.loansLink.click();
        adminDashBoardPage.rejectedLoansLink.click();

    }

    @Given("Verify that the admin is on the adminhomepage")
    public void verify_that_the_admin_is_on_the_adminhomepage() {
        Assert.assertTrue(adminDashBoardPage.rejectedLoanPageTitle.isDisplayed());

    }

    @Given("Page titles on the Rejected loans page should be displayed")
    public void page_titles_on_the_rejected_loans_page_should_be_displayed() {

        List<WebElement> titleElements = adminDashBoardPage.pagesTitle;

        for (WebElement each : titleElements
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);

    }

    @Given("The information to be searched for information to searchis entered for Loan number or Start date-End Date.")
    public void the_information_to_be_searched_for_is_entered_for_loan_number_or_start_date_end_date(String aranacakBilgi) {
        adminDashBoardPage.loanNoBox.click();
        adminDashBoardPage.loanNoBox.sendKeys("EUKAGN6DJY5N");
        ReusableMethods.wait(2);
        adminDashBoardPage.loanNoSearchBoxKutusu.click();

    }

    @Given("Verifies that the call can be made")
    public void verifies_that_the_call_can_be_made() {

        List<WebElement> resultElements = adminDashBoardPage.resultTableElements;
        for (WebElement each : resultElements
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);

    }

    @Given("Click on the details and installment links under action")
    public void click_on_the_details_and_installment_links_under_action() {

        adminDashBoardPage.detailsButonu.click();

    }

    @Given("It is verified that the information on these pages can be accessed.")
    public void it_is_verified_that_the_information_on_these_pages_can_be_accessed() {
        adminDashBoardPage.loansDetailsElementi.click();
        Assert.assertTrue(adminDashBoardPage.loansDetailsElementi.isDisplayed());
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
        adminDashBoardPage.isttallmentsButton.click();
        ReusableMethods.wait(2);
        Assert.assertTrue(adminDashBoardPage.installmentElementi.isDisplayed());

    }

    @Given("Click on the details")
    public void click_on_the_details() {
        adminDashBoardPage.detailsButonu.click();
       // jse.executeScript("arguments[0].click();", adminDashBoardPage.detailsButonu);
    }
    @Given("It must be verified that the loan details can be accessed on the Details page.")
    public void it_must_be_verified_that_the_loan_details_can_be_accessed_on_the_details_page() {
        List<WebElement> planInformationTable= adminDashBoardPage.planInformationTable;
        for (WebElement each:planInformationTable
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);
    }

    @Given("Verify that you see status information in loans details")
    public void verify_that_you_see_status_information_in_loans_details() {

        adminDashBoardPage.statusElementi.isDisplayed();
    }

    @Given("Click on Installments")
    public void click_on_installments() {
       adminDashBoardPage.isttallmentsButton.click();
    }
    @Given("Installments verifies that page titles exist")
    public void installments_verifies_that_page_titles_exist() {

        List<WebElement> installmentsTable = adminDashBoardPage.instalmentTableElementi;
        for (WebElement each : installmentsTable
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);


    }
    @Given("Installments verifies that page titles are visible")
    public void installments_verifies_that_page_titles_are_visible() {

        List<WebElement> installmentsPageTitle = adminDashBoardPage.installmentsPageTitle;
        for (WebElement each :installmentsPageTitle
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);
    }
    @Given("press the back button")
    public void press_the_back_button() {
       adminDashBoardPage.backButonElement.click();
       ReusableMethods.wait(1);
    }
    @Given("It is confirmed that rejected loans came again")
    public void it_is_confirmed_that_rejected_loans_came_again() {
       Assert.assertTrue(!adminDashBoardPage.rejectedLoanPageTitle.isDisplayed());


    }

    @Given("Click on the Insttallment and Verify that installments greater than {int} continue to be listed")
    public void Click_on_the_Insttallment_and_Verify_that_installments_greater_than_continue_to_be_listed(Integer int1) {

        jse.executeScript("arguments[0].click();", adminDashBoardPage.InstallmentButton);
        Actions actions=new Actions(Driver.getDriver());
         actions.sendKeys(Keys.PAGE_DOWN).perform();
         ReusableMethods.wait(1);

        jse.executeScript("arguments[0].click();", adminDashBoardPage.ikiyetiklamaElement);


        List<WebElement> yirmibirdendevam = adminDashBoardPage.yirmibirdendevam;
        for (WebElement each :yirmibirdendevam
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);

    }

}


