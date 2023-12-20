package stepdefinitions;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;

public class US23_Halit {
    HomePage homePage = new HomePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("The Basic Loan button appears and it is confirmed that it is active.")
    public void the_basic_loan_button_appears_and_it_is_confirmed_that_it_is_active() {
        Assert.assertTrue(homePage.basicLoanCard.isDisplayed());
        Assert.assertTrue(homePage.basicLoanCard.isEnabled());
    }
    @Given("Click on the Basic Loan button.")
    public void click_on_the_basic_loan_button() {
        homePage.basicLoanCard.click();
        js.executeScript("window.scrollBy(0,400)");
        ReusableMethods.wait(1);
    }
    @Given("Verify that the Basic Loan 1' header is visible.")
    public void verify_that_the_header_is_visible() {
        Assert.assertTrue(homePage.titleBasicLoan1.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Given("Verify that the Test Loan header is visible.")
    public void verify_that_the_test_loan_header_is_visible() {
        Assert.assertTrue(homePage.titleTestLoan.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Given("Verify that the Car Loan title is visible.")
    public void verify_that_the_car_loan_title_is_visible() {
        Assert.assertTrue(homePage.titleCarLoan.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Given("Verifies that the Apply now button is visible and active.")
    public void verifies_that_the_apply_now_button_is_visible_and_active() {
        Assert.assertTrue(homePage.applyNowButton.isDisplayed());
        Assert.assertTrue(homePage.applyNowButton.isEnabled());
        ReusableMethods.wait(1);
    }

    // TC_03
    @Given("Click the Apply Now button.")
    public void click_the_apply_now_button() {
        homePage.applyNowButton.click();
        ReusableMethods.wait(1);
    }
    @Given("Verify that Apply for 'Basic Loan 1' page open")
    public void verify_that_apply_for_basic_loan_page_open() {
        Assert.assertTrue(homePage.basicLoan1Page.isDisplayed());
    }

    // TC_04
    @Given("Amount are entered within the range of minimum and maximum values.")
    public void amount_are_entered_within_the_range_of_minimum_and_maximum_values() {
        homePage.amountBox.sendKeys("2000");
        ReusableMethods.wait(2);
    }
    @Given("Verify that the arrow keys are visible and active.")
    public void verify_that_the_arrow_keys_are_visible_and_active() throws AWTException {
        // Mouse coordinates: 811, 489 arrow up
        ReusableMethods.coordinateClick(812,489);
        ReusableMethods.wait(1);
        ReusableMethods.coordinateClick(812,489);
        ReusableMethods.wait(1);
        // Mouse coordinates: 812, 508 arrrow down
        ReusableMethods.coordinateClick(812,508);

    }

    // TC_005

    @Given("The Confirm button is appears and active.")
    public void the_confirm_button_is_appears_and_active() {
        Assert.assertTrue(homePage.comfirmButton.isDisplayed());
        Assert.assertTrue(homePage.comfirmButton.isEnabled());

    }
    @Given("The  user clicks Confirm button.")
    public void the_user_clicks_confirm_button() {
        homePage.comfirmButton.click();
        ReusableMethods.wait(1);

    }
    @Given("It is verified that the Application Form page is opened.")
    public void it_is_verified_that_the_application_form_page_is_opened() {
        Assert.assertTrue(homePage.applicationFormButton.isDisplayed());
        ReusableMethods.wait(1);


    }
    @Given("The user clicks Apply button .")
    public void the_user_clicks_apply_button() {
        homePage.applyButton.click();
        ReusableMethods.wait(1);
    }
    @Given("It is verified that the text Loan application submitted successfully' appears.")
    public void it_is_verified_that_the_text_appears() {
        // String expectedText = "Loan application submitted successfully";
        Assert.assertTrue(homePage.mesaggeText.isDisplayed());
        System.out.println(homePage.mesaggeText.getText());
        ReusableMethods.wait(1);

    }




}

