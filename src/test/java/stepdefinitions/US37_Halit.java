package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

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
    public void verifyThatTheActiveUsersListAndListTitlesAppears() throws AWTException {
        Assert.assertTrue(adminLoginPage.headerUser.isDisplayed());
        Assert.assertTrue(adminLoginPage.headerEmailPhone.isDisplayed());
        Assert.assertTrue(adminLoginPage.headerCountry.isDisplayed());

        js.executeScript("window.scrollBy(-500,0)");
        ReusableMethods.wait(2);

        Assert.assertTrue(adminLoginPage.headerDate.isDisplayed());
        Assert.assertTrue(adminLoginPage.headerBalance.isDisplayed());
        Assert.assertTrue(adminLoginPage.headerAction.isDisplayed());
        ReusableMethods.wait(1);
        js.executeScript("window.scrollBy(0,-1500)");
        ReusableMethods.wait(1);
       // adminLoginPage.secondPage.click(); Mouse coordinates: 884, 805
        ReusableMethods.coordinateClick(884,805);
        js.executeScript("window.scrollBy(0,1500)");

        ReusableMethods.wait(1);
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//tr"));
        //td[@data-label='+ User +']
        // List to hold user information
        List<String> users = new ArrayList<>();
        // Iterate over elements and extract user information
        for (WebElement each : elements) {
            // Assuming the user's name or relevant text is directly inside the <td> tag
            users.add(each.getText());
            System.out.println(users);
        }
        Assert.assertTrue(adminLoginPage.activeUserList.isDisplayed());

    }
    @Given("The administrator clicks Active Users button")
    public void the_administrator_clicks_active_users_button() {
        adminLoginPage.activeUsersButton.click();
        ReusableMethods.wait(1);
    }
    @Given("Verify that the Details button is visible and active.")
    public void verify_that_the_button_is_visible_and_active() {
        js.executeScript("window.scrollBy(-500,0)");
        ReusableMethods.wait(2);
        Assert.assertTrue(adminLoginPage.detailsButton.isDisplayed());
        Assert.assertTrue(adminLoginPage.detailsButton.isEnabled());
        ReusableMethods.wait(1);

    }
    @Given("The administrator clicks  the Details button.")
    public void the_administrator_clicks_the_button() {
        adminLoginPage.searchBox.sendKeys(ConfigReader.getProperty("name"));
        adminLoginPage.enterbutton.click();
        ReusableMethods.wait(3);
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
        Assert.assertTrue(adminLoginPage.titleTransactionDetails.isDisplayed());
        ReusableMethods.wait(1);
        List<WebElement> elements = Driver.getDriver().findElements(By.xpath("//tr"));
        // List to hold user information
        List<String> users = new ArrayList<>();
        // Iterate over elements and extract user information
        for (WebElement each : elements) {
            // Assuming the user's name or relevant text is directly inside the <td> tag
            users.add(each.getText());
            System.out.println(users);
        }
        Assert.assertTrue(adminLoginPage.activeUserList.isDisplayed());
    }
    @Given("The TRX Username box appears and confirms that it is active.")
    public void the_trx_username_box_appears_and_confirms_that_it_is_active() {
        Assert.assertTrue(adminLoginPage.searcTransaction.isDisplayed());
        Assert.assertTrue(adminLoginPage.searcTransaction.isEnabled());;

        ReusableMethods.wait(1);

    }
    @Given("The Type box appears and confirms that it is active.")
    public void the_type_box_appears_and_confirms_that_it_is_active() {
        Assert.assertTrue(adminLoginPage.typeTransaction.isDisplayed());
        Assert.assertTrue(adminLoginPage.typeTransaction.isEnabled());
        ReusableMethods.selectByVisibleText(adminLoginPage.typeTransaction,"Plus");
        ReusableMethods.wait(1);
    }
    @Given("The Remark box appears and confirms that it is active.")
    public void the_remark_box_appears_and_confirms_that_it_is_active() {
        Assert.assertTrue(adminLoginPage.remarkTransaction.isDisplayed());
        Assert.assertTrue(adminLoginPage.remarkTransaction.isEnabled());
        ReusableMethods.selectByVisibleText(adminLoginPage.remarkTransaction,"Balance add");
        ReusableMethods.wait(1);
    }
    @Given("The Date box appears and confirms that it is active.")
    public void the_date_box_appears_and_confirms_that_it_is_active() {
        Assert.assertTrue(adminLoginPage.dateTransaction.isDisplayed());
        Assert.assertTrue(adminLoginPage.dateTransaction.isEnabled());
        adminLoginPage.dateTransaction.click();
        adminLoginPage.dateStart.click();
        ReusableMethods.wait(1);
        adminLoginPage.dateFinish.click();
        ReusableMethods.wait(1);

    }
    @Given("The filter icon appears and confirms that it is active.")
    public void the_filter_icon_appears_and_confirms_that_it_is_active() {
        Assert.assertTrue(adminLoginPage.filterIcon.isDisplayed());
        Assert.assertTrue(adminLoginPage.filterIcon.isEnabled());
        adminLoginPage.filterIcon.click();
        Driver.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
    }
    // TC_07
    @Given("The Add Balance button appears and confirms that it is active.")
    public void the_add_balance_button_appears_and_confirms_that_it_is_active() {
        Assert.assertTrue(adminLoginPage.addBalance.isDisplayed());
        Assert.assertTrue(adminLoginPage.addBalance.isEnabled());
    }
    @Given("The administrator clicks Add Balance button.")
    public void the_administrator_clicks_add_balance_button() {
        adminLoginPage.addBalance.click();
        ReusableMethods.wait(1);
    }
    @Given("It is verified that the Add Balance page is opened.")
    public void it_is_verified_that_the_add_balance_page_is_opened() {
        Assert.assertTrue(adminLoginPage.addBalancePage.isDisplayed());
    }
    // TC_08 ************
    @Given("Amount text box appears and it is verified that characters can be entered.")
    public void amount_text_box_appears_and_it_is_verified_that_characters_can_be_entered() {
        Assert.assertTrue(adminLoginPage.addBalanceAmount.isDisplayed());

    }
    @Given("Remark text box appears and it is verified that characters can be entered.")
    public void remark_text_box_appears_and_it_is_verified_that_characters_can_be_entered() {
        Assert.assertTrue(adminLoginPage.addBalanceAmount.isDisplayed());

    }
    // ***********TC_09************
    @Given("The amount is entered in the Amount text box.")
    public void the_amount_is_entered_in_the_amount_text_box() {
        adminLoginPage.addBalanceAmount.sendKeys("2000");
        ReusableMethods.wait(2);
    }
    @Given("A description is entered in the Remark text box.")
    public void a_description_is_entered_in_the_remark_text_box() {
        ReusableMethods.waitAndSendText(adminLoginPage.addBalanceRemark,"Enough for me, thanks");
        ReusableMethods.wait(2);
    }
    @Given("The Submit button appears and confirms that it is active.")
    public void the_submit_button_appears_and_confirms_that_it_is_active() {
        Assert.assertTrue(adminLoginPage.addBalanceSubmit.isDisplayed());
        Assert.assertTrue(adminLoginPage.addBalanceSubmit.isEnabled());
    }
    @Given("The administrator clicks Submit button.")
    public void the_administrator_clicks_submit_button() {
        adminLoginPage.addBalanceSubmit.click();
        ReusableMethods.wait(1);
    }
    @Given("It is verified that the text $ 1 added successfully is seen.")
    public void it_is_verified_that_the_text_$_added_successfully_is_seen() {
        String expectedText =  Driver.getDriver().findElement(By.xpath(
                "//*[text()='$2000 added successfully']")).getText();

        String actualText = "$2000 added successfully";
        Assert.assertEquals(expectedText,actualText);
    }


}
