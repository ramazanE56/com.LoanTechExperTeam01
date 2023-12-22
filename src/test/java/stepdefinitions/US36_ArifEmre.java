package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminDashBoardPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.getDriver;

public class US36_ArifEmre {
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Loan Plans tab is clicked")
    public void loan_plans_tab_is_clicked() {
    adminDashBoardPage.loanPlansElementi.click();
    }
    @Given("The current credit plans registered in the system are displayed.")
    public void the_current_credit_plans_registered_in_the_system_are_displayed() {
        Assert.assertTrue(adminDashBoardPage.loansPlanElementi.isDisplayed());
    }
    @Given("Each loan plan, title, interest rate, maturity period, loan limit, etc. displayed with basic information.\"")
    public void each_loan_plan_title_interest_rate_maturity_period_loan_limit_etc_displayed_with_basic_information() {
    Assert.assertTrue(adminDashBoardPage.trElementi.isDisplayed());
    }
    @Given("Click on the Add New button.")
    public void click_on_the_add_new_button() {
    adminDashBoardPage.addNewElementi.click();
    }
    @Given("The Plan Name box is filled in.")
    public void the_plan_name_box_is_filled_in() {
   adminDashBoardPage.planNameElementi.click();
   ReusableMethods.wait(1);
   adminDashBoardPage.planNameElementi.clear();
   ReusableMethods.wait(1);
        actions.sendKeys(ConfigReader.getProperty("planName")).perform();
    }
    @Given("The Title box is filled.")
    public void the_title_box_is_filled() {
    actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("title")).perform();
    }
    @Given("The Minimum Amount box is filled.")
    public void the_minimum_amount_box_is_filled() {
    actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("minimumAmount")).perform();
    }
    @Given("The Maximum Amount box is filled.")
    public void the_maximum_amount_box_is_filled() {
        adminDashBoardPage.maxAmount.click();
        adminDashBoardPage.maxAmount.clear();
        ReusableMethods.wait(1);
    actions.sendKeys(ConfigReader.getProperty("maximumAmount")).perform();
    }
    @Given("Category standard loan is selected.")
    public void category_standard_loan_is_selected() {
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//*[@id=\"category_id\"]")));
        select.selectByValue("12");
    }
    @Given("The Per Installment box is populated.")
    public void the_per_installment_box_is_populated() {
    actions.sendKeys(Keys.TAB).
            sendKeys(ConfigReader.getProperty("perInstallment")).perform();
    }
    @Given("The Installment Interval box is populated.")
    public void the_installment_interval_box_is_populated() {
    actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("installmentInterval")).perform();
    }
    @Given("The Total Installments box is populated.")
    public void the_total_installments_box_is_populated() {
    actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("TotalInstallments")).perform();
    }
    @Given("The Application Fixed Charge box is filled.")
    public void the_application_fixed_charge_box_is_filled() {
    actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("applicationFixedCharge")).perform();
    }
    @Given("The Application Percent Charge box is filled in.")
    public void the_application_percent_charge_box_is_filled_in() {
    actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("applicationPercentCharge")).perform();
    }
    @Given("Non Featured is selected.")
    public void non_featured_is_selected() {
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//*[@name=\"is_featured\"]")));
        select.selectByValue("1");
    }
    @Given("Instruction box is filled")
    public void instruction_box_is_filled() {
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("instruction")).perform();
    }

    @Given("The Charge Will Apply If Delay box is filled in")
    public void the_charge_will_apply_if_delay_box_is_filled_in() {
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("chargeWillApplyIfDelay")).perform();
    }
    @Given("Fixed Charge box is filled")
    public void fixed_charge_box_is_filled() {
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("fixedCharge")).perform();
    }
    @Given("Percent Charge box is filled")
    public void percent_charge_box_is_filled() {
        actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("percentCharge")).perform();
    }
    @Given("Submit button is clicked")
    public void submit_button_is_clicked() {

        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(1);
    actions.click(adminDashBoardPage.submitBElement).perform();
    }
    @Given("It is confirmed that the new plan has been added.")
    public void it_is_confirmed_that_the_new_plan_has_been_added() {
    Assert.assertTrue(adminDashBoardPage.iziElement.isDisplayed());
    }

    // TC02

    @Given("The current page is brought down and scrolled to the right.")
    public void the_current_page_is_brought_down_and_scrolled_to_the_right() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", adminDashBoardPage.editElementi);
    }
    @Given("Edit option is clicked")
    public void edit_option_is_clicked() {
    adminDashBoardPage.editElementi.click();
    }
    @Given("The accuracy of the added or updated information is tested.")
    public void the_accuracy_of_the_added_or_updated_information_is_tested() {
    Assert.assertTrue(adminDashBoardPage.cardBody.isDisplayed());
    }

    //TC03
    @Given("Disable option is clicked.")
    public void disable_option_is_clicked() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", adminDashBoardPage.disable);
        adminDashBoardPage.disable.click();
    }
    @Given("Yes option is clicked.")
    public void yes_option_is_clicked() {
    adminDashBoardPage.yes.click();
    }
    @Given("It is verified that the existing credit plan has been removed from the system.")
    public void ıt_is_verified_that_the_existing_credit_plan_has_been_removed_from_the_system() {
    Assert.assertTrue(adminDashBoardPage.disabledelete.isDisplayed());
    }

    //TC04
    @Given("searchloanplans click")
    public void searchloanplans_click() {
        actions.click(adminDashBoardPage.searchLoansPlan).sendKeys(ConfigReader.getProperty("searchLoanPlans")).sendKeys(Keys.ENTER).perform();
    }

    @Given("In an unexpected situation, an error message is sent.")
    public void in_an_unexpected_situation_an_error_message_is_sent() {

    Assert.assertTrue(adminDashBoardPage.hataMesaj.isDisplayed());
    }

    @Given("The Min Amount two box is filled.")
    public void the_min_amount_two_box_is_filled() {
        actions.click(adminDashBoardPage.minAmountElement).sendKeys(ConfigReader.getProperty("minAmountTwo")).perform();

    }
    @Given("The Max Amount two box is filled.")
    public void the_max_amount_two_box_is_filled() {
        actions.click(adminDashBoardPage.maxAmount).sendKeys(ConfigReader.getProperty("maxAmountTwo")).perform();
    }
    @Given("Instructiontwo box is filled")
    public void instructiontwo_box_is_filled() {
        ReusableMethods.wait(1);
        actions.click(adminDashBoardPage.instructionboxElement).sendKeys(ConfigReader.getProperty("instructiontwo")).perform();
    }


}
