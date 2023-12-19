package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import pages.DashBoardPage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

import java.util.Random;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US18_Ismail {
    SoftAssert softAssert = new SoftAssert();

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
        dashBoardPage.takeLoanTabElement.click();
    }

    @Given("Verify that Loan Plans appears")
    public void verify_that_loan_plans_appears() {
        assertTrue(dashBoardPage.loanPlansTextElement.isDisplayed());
    }

    @Given("Click on the car loan button")
    public void click_on_the_car_loan_button() {
        dashBoardPage.carLoanButtonElement.click();
        ReusableMethods.wait(1);


    }

    @Given("Verify that Apply Now is visible")
    public void verify_that_apply_now_is_visible() {
        softAssert.assertTrue(dashBoardPage.applyNowButtonElement.isDisplayed());
    }


    @Given("Verify that {string} is visible")
    public void verify_that_$_is_visible(String amount) {
        softAssert.assertTrue(dashBoardPage.takeMaximumTextElement.isEnabled());

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
        softAssert.assertTrue(dashBoardPage.applyNowButtonElement.isEnabled());

    }

    @Given("Verify that Personal Finance Loan is visible")
    public void verify_that_personal_finance_loan_is_visible() {
        softAssert.assertTrue(dashBoardPage.personalFinanceLoanTextElement.isDisplayed());
    }

    @Given("Verify that Take Maximum is visible")
    public void verify_that_take_maximum_is_visible() {
        softAssert.assertTrue(dashBoardPage.takeMaximumTextElement.isDisplayed());
    }

    @Given("Verify that Take Minimum is visible")
    public void verify_that_take_minimum_is_visible() {
        softAssert.assertTrue(dashBoardPage.takeMinimumElement.isDisplayed());
    }

    @Given("Verify that the {string} is visible")
    public void verify_that_the_is_visible(String string) {
        softAssert.assertTrue(dashBoardPage.$200000TextElement.isDisplayed());
    }

    @Given("Verify that Per Installment is visible")
    public void verify_that_per_installment_is_visible() {
        softAssert.assertTrue(dashBoardPage.perInstallmentTextElement.isDisplayed());
    }

    @Given("Verify that Installment Interval is visible")
    public void verify_that_installment_interval_is_visible() {
        softAssert.assertTrue(dashBoardPage.perInstallmentTextElement.isDisplayed());
    }

    @Given("Verify that {int} Days is visible")
    public void verify_that_days_is_visible(Integer int1) {
        softAssert.assertTrue(dashBoardPage.days20TxtElement.isDisplayed());
    }

    @Given("Verify that Total Installment is visible")
    public void verify_that_total_installment_is_visible() {
        softAssert.assertTrue(dashBoardPage.totalInstallmentTxtElement.isDisplayed());
    }

    @Given("Verify that {int} is visible")
    public void verify_that_is_visible(Integer int1) {
        softAssert.assertTrue(dashBoardPage.text20TxtElement.isDisplayed());
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

    }
    @Given("Click on the Confirm button")
    public void click_on_the_confirm_button() {

    }
    @After
    public void tearDown() {
        softAssert.assertAll();
    }
}
