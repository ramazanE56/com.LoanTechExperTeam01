package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.DashBoardPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static utilities.Driver.getDriver;

public class US16_ArifEmre {
    DashBoardPage dashBoardPage = new DashBoardPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("go to specified site {string}")
    public void go_to_specified_site(String userUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(userUrl));
    }
    @Given("Username information is entered")
    public void username_information_is_entered() {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        dashBoardPage.userNameElementi.click();
        actions.sendKeys(ConfigReader.getProperty("userNameEmre")).perform();
    }
    @Given("Password information is entered")
    public void password_information_is_entered() {
    dashBoardPage.userPasswordElementi.click();
    dashBoardPage.userPasswordElementi.sendKeys(ConfigReader.getProperty("userPassword"));
    }
    @Given("Click on the login buttonn")
    public void click_on_the_login_buttonn() {
    actions.sendKeys(Keys.PAGE_DOWN).perform();
    dashBoardPage.loginButtonEmre.click();
    }
    @Given("Click on the Deposit tab.")
    public void click_on_the_deposit_tab() {
    dashBoardPage.depositElementi.click();
    }
    @Given("It appears that the Deposit Methods page has opened.")
    public void it_appears_that_the_deposit_methods_page_has_opened() {
        Assert.assertTrue(dashBoardPage.depositMethodsGorunum.isDisplayed());
    }
    @Given("Click on the deposit history tab and the deposit history page opens.")
    public void click_on_the_deposit_history_tab_and_the_deposit_history_page_opens() {
    dashBoardPage.depositHistoryElementi.click();
    }
    @Given("The transaction accordion table is displayed on the Deposit History page")
    public void the_transaction_accordion_table_is_displayed_on_the_deposit_history_page() {
    Assert.assertTrue(dashBoardPage.akordiyonElement.isDisplayed());
    }
    @Given("Deposit now is clicked and the deposit methods page opens.")
    public void deposit_now_is_clicked_and_the_deposit_methods_page_opens() {
    dashBoardPage.depositNowElementi.click();
    }
    @Given("Click on the Select Gateway menu and select manual.")
    public void click_on_the_select_gateway_menu_and_select_manual() {
    dashBoardPage.selectGatewayElementi.click();
    Select select = new Select(getDriver().findElement(By.xpath("//*[@class=\"form--control form-select\"]")));
    select.selectByValue("1000");
    }
    @Given("Click on the Amount textbox and enter a value between min and max.")
    public void click_on_the_amount_textbox_and_enter_a_value_between_min_and_max() {
    dashBoardPage.amountElementi.click();
    dashBoardPage.amountElementi.sendKeys(ConfigReader.getProperty("amount"));
    }
    @Given("Limit-Charge-Payable values are displayed.")
    public void limit_charge_payable_values_are_displayed() {
    Assert.assertTrue(dashBoardPage.limitElement.isDisplayed());
    }
    @Given("Click on the Submit button.")
    public void click_on_the_submit_button() {
    dashBoardPage.submitButton.click();
    }
    @Given("You have requested {string} USD , Please pay {string} USD for successful payment appears.")
    public void you_have_requested_usd_please_pay_usd_for_successful_payment_appears(String string, String string2) {
    Assert.assertTrue(dashBoardPage.youhaveElementi.isDisplayed());
    }



    @Given("Click on the PAY NOW button and go to the Deposit History page.")
    public void click_on_the_pay_now_button_and_go_to_the_deposit_history_page() {
        dashBoardPage.payNow.click();
    }
    @Given("The text You have deposit request has been taken is displayed")
    public void the_text_you_have_deposit_request_has_been_taken_is_displayed() {
    Assert.assertTrue(dashBoardPage.youHaveDepositElementi.isDisplayed());
    }

}
