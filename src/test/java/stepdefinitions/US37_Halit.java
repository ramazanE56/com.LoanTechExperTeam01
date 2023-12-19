package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.AdminLoginPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.sql.ResultSet;

public class US37_Halit {

    AdminLoginPage adminLoginPage = new AdminLoginPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("The administrator goes to the web page with the given {string}.")
    public void the_administrator_goes_to_the_web_page_with_the_given(String adminUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(adminUrl));
    }
    @Given("The administrator enters a valid {string} in the username box.")
    public void the_administrator_enters_a_valid_in_the_username_box(String usernameHalit) {
        adminLoginPage.usernameBox.sendKeys(ConfigReader.getProperty(usernameHalit));
        ReusableMethods.wait(1);
    }
    @Given("The administrator enters a valid {string} in the password box.")
    public void the_administrator_enters_a_valid_in_the_password_box(String passwordAdmin) {
        adminLoginPage.passwordBox.sendKeys(ConfigReader.getProperty(passwordAdmin));
        js.executeScript("window.scrollBy(0,200)");
        ReusableMethods.wait(1);
    }
    @Given("The administrator clicks on the login button.")
    public void the_administrator_clicks_on_the_login_button() {
        adminLoginPage.loginButton.click();
        ReusableMethods.wait(1);
    }
    @Given("The administrator clicks the manage users button under the Dashboard.")
    public void the_administrator_clicks_the_manage_users_button_under_the_dashboard() {
        adminLoginPage.manageUsersButton.click();
        ReusableMethods.wait(1);
    }
    @Given("Verify that the Active Users button is visible and active.")
    public void verify_that_the_active_users_button_is_visible_and_active() {
        Assert.assertTrue(adminLoginPage.activeUsersButton.isDisplayed());
        Assert.assertTrue(adminLoginPage.activeUsersButton.isEnabled());
    }
    @When("Verify that the  Active Users List and list titles appears.")
    public void verifyThatTheActiveUsersListAndListTitlesAppears() {
        Assert.assertTrue(adminLoginPage.headerUser.isDisplayed());
        Assert.assertTrue(adminLoginPage.headerEmailPhone.isDisplayed());
        Assert.assertTrue(adminLoginPage.headerCountry.isDisplayed());

        js.executeScript("window.scrollBy(1000,0)");
        ReusableMethods.wait(10);

        Assert.assertTrue(adminLoginPage.headerDate.isDisplayed());
        Assert.assertTrue(adminLoginPage.headerBalance.isDisplayed());
        Assert.assertTrue(adminLoginPage.headerAction.isDisplayed());
        ReusableMethods.wait(1);
        js.executeScript("window.scrollBy(0,1000)");
        adminLoginPage.secondPage.click();

        ReusableMethods.wait(1);
        Assert.assertTrue(adminLoginPage.activeUserList.isDisplayed());

    }
    @Given("The administrator clicks Active Users button")
    public void the_administrator_clicks_active_users_button() {
        adminLoginPage.activeUsersButton.click();
        ReusableMethods.wait(1);
    }
    @Given("Verify that the Details button is visible and active.")
    public void verify_that_the_button_is_visible_and_active() {
        js.executeScript("window.scrollBy(500,0)");
        Assert.assertTrue(adminLoginPage.detailsButton.isDisplayed());
        Assert.assertTrue(adminLoginPage.detailsButton.isEnabled());
        ReusableMethods.wait(1);

    }
    @Given("The administrator clicks  the Details button.")
    public void the_administrator_clicks_the_button() {
        adminLoginPage.searchBox.sendKeys(ConfigReader.getProperty("name"));
        adminLoginPage.enterbutton.click();
        ReusableMethods.wait(1);
        adminLoginPage.detailsButton.click();
        ReusableMethods.wait(1);
    }
    @Given("It is verified that the User Details-Username page is opened.")
    public void it_is_verified_that_the_user_details_username_page_is_opened() {
        Assert.assertTrue(adminLoginPage.userDetailPage.isDisplayed());
    }

    @When("The administrator clicks View All icon.")
    public void theAdministratorClicksViewAllIcon() {
        Assert.assertTrue(adminLoginPage.viewAllIcon.isDisplayed());
        Assert.assertTrue(adminLoginPage.viewAllIcon.isEnabled());
        adminLoginPage.viewAllIcon.click();
        ReusableMethods.wait(1);
    }
    @When("It is verified that the Transaction Logs page is opened.")
    public void itIsVerifiedThatTheTransactionLogsPageIsOpened() {
        Assert.assertTrue(adminLoginPage.transactionLogsPage.isDisplayed());
    }
    @When("It is verified that the list and list titles are displayed on the Transaction Logs page.")
    public void itIsVerifiedThatTheListAndListTitlesAreDisplayedOnTheTransactionLogsPage() {
        Assert.assertTrue(adminLoginPage.titleTransactionUser.isDisplayed());
        Assert.assertTrue(adminLoginPage.titleTransactionTRX.isDisplayed());
        Assert.assertTrue(adminLoginPage.titleTransactionTransacted.isDisplayed());
        Assert.assertTrue(adminLoginPage.titleTransactionAmount.isDisplayed());
        Assert.assertTrue(adminLoginPage.titleTransactionBalance.isDisplayed());
        js.executeScript("window.scrollBy(100,0)");
        Assert.assertTrue(adminLoginPage.titleTransactionDetails.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Given("The TRX Username box appears and confirms that it is active.")
    public void the_trx_username_box_appears_and_confirms_that_it_is_active() {
        Assert.assertTrue(adminLoginPage.searcTransaction.isDisplayed());
        Assert.assertTrue(adminLoginPage.searcTransaction.isEnabled());
        adminLoginPage.typeTransaction.clear();
        adminLoginPage.searchBox.sendKeys(ConfigReader.getProperty("halit"));
        ReusableMethods.wait(1);

    }
    @Given("The Type box appears and confirms that it is active.")
    public void the_type_box_appears_and_confirms_that_it_is_active() {
        Assert.assertTrue(adminLoginPage.typeTransaction.isDisplayed());
        Assert.assertTrue(adminLoginPage.typeTransaction.isEnabled());
        ReusableMethods.selectByVisibleText(adminLoginPage.typeTransaction,"Tüm");
        ReusableMethods.wait(1);
    }
    @Given("The Remark box appears and confirms that it is active.")
    public void the_remark_box_appears_and_confirms_that_it_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("The Date box appears and confirms that it is active.")
    public void the_date_box_appears_and_confirms_that_it_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("The filter icon appears and confirms that it is active.")
    public void the_filter_icon_appears_and_confirms_that_it_is_active() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
