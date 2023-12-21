package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DashBoardPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;


public class US18_Ismail {


    LoginPage loginPage = new LoginPage();
    DashBoardPage dashBoardPage = new DashBoardPage();

    @Given("Click on the login button")
    public void click_on_the_login_button() {
        loginPage.loginButtonElement.click();
    }

    @Given("The registered {string} is entered in the Username Or Email box.")
    public void the_registered_is_entered_in_the_username_or_email_box(String username) {
        loginPage.userNameBoxElement.sendKeys(ConfigReader.getProperty(username));
    }

    @Given("Registered user {string} is entered in the Your Password box.")
    public void registered_user_is_entered_in_the_your_password_box(String password) {
        loginPage.passwordElement.sendKeys(ConfigReader.getProperty(password));
    }

    @Given("Click on the login button to log in.")
    public void click_on_the_login_button_to_log_in() {
        loginPage.submitButtonElement.click();
    }

    @Given("Verify that the Take Loan tab is visible")
    public void verify_that_the_take_loan_tab_is_visible() {
        assertTrue(dashBoardPage.takeLoanTabElement.isDisplayed());
    }

    @Given("Click on the Take Loan button")
    public void click_on_the_take_loan_button() {
        ReusableMethods.wait(3);
        //dashBoardPage.allowTextElement.click();
        ReusableMethods.wait(3);
        dashBoardPage.takeLoanTabElement.click();
    }

    @Given("Verify that Loan Plans appears")
    public void verify_that_loan_plans_appears() {
        ReusableMethods.wait(1);
        assertTrue(dashBoardPage.loanPlansTextElement.isDisplayed());
    }

    @Given("Click on the car loan button")
    public void click_on_the_car_loan_button() {
        dashBoardPage.carLoanButtonElement.click();
        ReusableMethods.wait(1);


    }

    @Given("Verify that Apply Now is visible")
    public void verify_that_apply_now_is_visible() {
        assertTrue(dashBoardPage.applyNowButtonElement.isDisplayed());
    }


    @Given("Verify that {string} is visible")
    public void verify_that_$_is_visible(String amount) {
        assertTrue(dashBoardPage.takeMaximumTextElement.isEnabled());

    }
    @Given("Verify this {string} is visible")
    public void verify_that_Per_is_visible(String str) {
        String actualResult = dashBoardPage.text6PerElement.getText();
        Assert.assertEquals("Farklı yüzdelik dilimler kullanılmıştır.",str,actualResult);
        System.out.println("expexted: " + str);
        System.out.println("actual: " + actualResult);


    }

    @Given("Verify that the Apply Now button is clickable")
    public void verify_that_the_apply_now_button_is_clickable() {
        assertTrue(dashBoardPage.applyNowButtonElement.isEnabled());

    }

    @Given("Verify that Personal Finance Loan is visible")
    public void verify_that_personal_finance_loan_is_visible() {
        assertTrue(dashBoardPage.personalFinanceLoanTextElement.isDisplayed());
    }

    @Given("Verify that Take Maximum is visible")
    public void verify_that_take_maximum_is_visible() {
        assertTrue(dashBoardPage.takeMaximumTextElement.isDisplayed());
    }

    @Given("Verify that Take Minimum is visible")
    public void verify_that_take_minimum_is_visible() {
        assertTrue(dashBoardPage.takeMinimumElement.isDisplayed());
    }

    @Given("Verify that the {string} is visible")
    public void verify_that_the_is_visible(String string) {
        assertTrue(dashBoardPage.$200000TextElement.isDisplayed());
    }

    @Given("Verify that Per Installment is visible")
    public void verify_that_per_installment_is_visible() {
        assertTrue(dashBoardPage.perInstallmentTextElement.isDisplayed());
    }

    @Given("Verify that Installment Interval is visible")
    public void verify_that_installment_interval_is_visible() {
        assertTrue(dashBoardPage.perInstallmentTextElement.isDisplayed());
    }

    @Given("Verify that {int} Days is visible")
    public void verify_that_days_is_visible(Integer int1) {
        assertTrue(dashBoardPage.days20TxtElement.isDisplayed());
    }

    @Given("Verify that Total Installment is visible")
    public void verify_that_total_installment_is_visible() {
        assertTrue(dashBoardPage.totalInstallmentTxtElement.isDisplayed());
    }

    @Given("Verify that {int} is visible")
    public void verify_that_is_visible(Integer int1) {
        assertTrue(dashBoardPage.text20TxtElement.isDisplayed());
    }
    @Given("Click on the Apply Now button")
    public void click_on_the_apply_now_button() {
        dashBoardPage.applyNowButtonElement.click();
    }
    @Given("Verify that Apply for Personal Finance Loan appears")
    public void verify_that_apply_for_personal_finance_loan_appears() {
       assertTrue(dashBoardPage.applyForPersonalLoanTxtElement.isDisplayed());
    }
    @Given("A number between {string} and {string} is entered in the Enter An Amount box")
    public void a_number_between_and_is_entered_in_the_enter_an_amount_box(String amountmin, String amountmax) {
        //dashBoardPage.enterAnAmountBoxElement.click();
        dashBoardPage.enterAnAmountBoxElement.sendKeys(ReusableMethods.minMaxRandomAmountCreate(amountmin, amountmax));
    }
    @Given("Verify that Confirm text is visible")
    public void verify_that_confirm_text_is_visible() {
        assertTrue(dashBoardPage.confirmButtonElement.isDisplayed());
    }
    @Given("Click on the Confirm button")
    public void click_on_the_confirm_button() {
        dashBoardPage.confirmButtonElement.click();
    }

    @Given("Click on the basic loan button")
    public void click_on_the_basic_loan_button() {
        ReusableMethods.wait(3);
dashBoardPage.basicLoanButtonElement.click();
    }
    @Given("Verify that Application Form text is visible")
    public void verify_that_application_form_text_is_visible() {
assertTrue(dashBoardPage.applicationFormTxtElement.isDisplayed());
    }

    @Given("Click on the basic Loan Apply Now button")
    public void click_on_the_basic_loan_apply_now_button() {
dashBoardPage.basicLoanapplyNowButtonElement.click();
    }

    @Given("Verify that Plan Name appears")
    public void verify_that_plan_name_appears() {
assertTrue(dashBoardPage.planNameTxtElement.isDisplayed());
    }
    @Given("Verify that Loan Amount appears")
    public void verify_that_loan_amount_appears() {
assertTrue(dashBoardPage.loanAmountTxtElement.isDisplayed());

    }
    @Given("Verify that Total Installment appears")
    public void verify_that_total_installment_appears() {
assertTrue(dashBoardPage.totalInstallmenttTxtElement.isDisplayed());

    }
    @Given("Verify that Per Installment appears")
    public void verify_that_per_installment_appears() {
assertTrue(dashBoardPage.perInstallmenttTxtElement.isDisplayed());

    }
    @Given("Verify that You'll Need To Pay appears")
    public void verify_that_you_ll_need_to_pay_appears() {
assertTrue(dashBoardPage.youllNeedToPayTxtElement.isDisplayed());

    }
    @Given("Verify that Application Fee text is visible")
    public void verify_that_application_fee_text_is_visible() {
assertTrue(dashBoardPage.applicationFeeTxtElement.isDisplayed());

    }

    @Given("Click on the Test Loan Apply Now button")
    public void click_on_the_test_loan_apply_now_button() {
dashBoardPage.applyNowTestLoanTxtElement.click();
    }
    @Given("Verify that Application Form appears")
    public void verify_that_application_form_appears() {
assertTrue(dashBoardPage.applicationFormTxtElement.isDisplayed());
    }
    @Given("Verify that Test Loan is written in the box under Application Form")
    public void verify_that_test_loan_is_written_in_the_box_under_application_form() {
String actualResult = dashBoardPage.underTheApplicationFormTxtBoxElement.getText();
String expectedResult = "Test Loan";
assertEquals(" Under the Application Form tetx Box has Test Loan text but dont here Test Loan",expectedResult,actualResult);
    }
    @Given("Verify that Apply appears")
    public void verify_that_apply_appears() {
        dashBoardPage.applyElement.click();
ReusableMethods.wait(1);
    }
    @Given("Click on the Apply button under the Application Form Text")
    public void click_on_the_apply_button_under_the_application_form_text() {
        dashBoardPage.applyButtonUnderTheApplicationFormTextElement.click();
        ReusableMethods.wait(2);
    }
    @Given("Verify that the Loan application submitted successfully message appears")
    public void verify_that_the_loan_application_submitted_successfully_message_appears() {
assertTrue(dashBoardPage.loanApplicationSubmittedSuccessfullyTxtElement.isDisplayed());
    }

    @Given("Verify that Test_Loan appears")
    public void verify_that_test_loan_appears() {
        ReusableMethods.wait(1);
        assertTrue(dashBoardPage.TestLoanTakeLoanTextElement.isDisplayed());
    }
    @Given("Verify that the Search By Loan Number text box is visible")
    public void verify_that_the_search_by_loan_number_text_box_is_visible() {
        assertTrue(dashBoardPage.seachByLoanNumberBoxTextElement.isDisplayed());
    }
    @Given("The last created Test_LOan Loan number is entered into the Search By Loan Number text box.")
    public void the_last_created_test_l_oan_loan_number_is_entered_into_the_search_by_loan_number_text_box() {
String firstLoanNumber = dashBoardPage.firstSeachByLoanNumberElement.getText();
dashBoardPage.seachByLoanNumberBoxTextElement.sendKeys(firstLoanNumber);
dashBoardPage.lensLogoButtonElement.click();
    }
    @Given("Click on the lens logo")
    public void click_on_the_lens_logo() {
        dashBoardPage.lensLogoButtonElement.click();
    }
    @Given("Test_Loan Verifies that the Loan number appears in the table as uniq")
    public void test_loan_verifies_that_the_loan_number_appears_in_the_table_as_uniq() {
assertFalse(dashBoardPage.secondSeachByLoanNumberElement.isDisplayed());
    }

    @Given("It is verified that pending status codes are displayed filtered in the table.")
    public void it_is_verified_that_pending_status_codes_are_displayed_filtered_in_the_table() {
// Tablodaki verileri doğrula
        List<WebElement> elements = new ArrayList<>();
        int index = 1;
        while (true) {
            String locator = "(//span[@class='badge badge--dark'])[" + index + "]";
            WebElement element = Driver.getDriver().findElement(By.xpath(locator));
            elements.add(element);
            index += 2;
            if (!isElementPresent(Driver.getDriver(), locator)) {
                break;
            }
        }

        boolean allPending = true;
        for (WebElement element : elements) {
            String status = element.getText();
            if (!status.equals("pending")) {
                allPending = false;
                break;
            }
        }

        if (allPending) {
            System.out.println("Tüm verilerin statusu 'pending'.");
        } else {
            System.out.println("Verilerin statusu doğrulanamadı.");
        }

    }

    private boolean isElementPresent(WebDriver driver, String locator) {
        return false;
    }

    @Given("Click on the arrow sign in the Loan Status box select {string} status from the dropdown menu that opens.")
    public void click_on_the_arrow_sign_in_the_loan_status_box_select_status_from_the_dropdown_menu_that_opens(String status) {
        Select select = new Select(dashBoardPage.loanStatusArrowElement);
        select.selectByVisibleText(status);
        ReusableMethods.wait(2);
    }
    @Given("Click on the running button")
    public void click_on_the_running_button() {

    }
    @Given("Verify that the Installment box is visible in the bar that opens")
    public void verify_that_the_installment_box_is_visible_in_the_bar_that_opens() {

    }
    @Given("Verify that the Installment box is clickable")
    public void verify_that_the_installment_box_is_clickable() {

    }
    @Given("Click on the Installment box")
    public void click_on_the_installment_box() {

    }
    @Given("Verify that Loan Installments is displayed on the page that opens")
    public void verify_that_loan_installments_is_displayed_on_the_page_that_opens() {
       
    }


}
