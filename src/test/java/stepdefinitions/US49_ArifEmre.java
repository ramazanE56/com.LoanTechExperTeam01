package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminDashBoardPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US49_ArifEmre {

    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();
    Actions actions = new Actions(Driver.getDriver());
    @Given("Go to {string}")
    public void go_to(String adminUrlOne) {
        Driver.getDriver().get(ConfigReader.getProperty(adminUrlOne));
    }

    @Given("The username box is clicked and the username is entered.")
    public void The_username_box_is_clicked_and_the_username_is_entered() {

        actions.click(adminDashBoardPage.userNameElementi).sendKeys(ConfigReader.getProperty("adminemrename")).perform();
    }
    @Given("The password box is clicked and the password is entered.")
    public void the_password_box_is_clicked_and_the_password_is_entered() {
    actions.sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("adminemrepassword")).
            sendKeys(Keys.PAGE_DOWN).perform();
    }
    @Given("The Login button is clicked.")
    public void the_login_button_is_clicked() {
        ReusableMethods.wait(2);
    adminDashBoardPage.adminLoginElementi.click();
    }
    @Given("Click on the Manage users tab.")
    public void click_on_the_manage_users_tab() {
    adminDashBoardPage.manegeUsersElementi.click();
    }
    @Given("The withbalance tab is clicked.")
    public void the_withbalance_tab_is_clicked() {
    adminDashBoardPage.withBalanceElementi.click();
    }
    @Given("The withbalance list is displayed.")
    public void the_withbalance_list_is_displayed() {
        Assert.assertTrue(adminDashBoardPage.listElement.isDisplayed());
    }
    @Given("searchbox is clicked")
    public void searchbox_is_clicked() {
    adminDashBoardPage.searchBoxElementi.click();
    }
    @Given("Enter the desired username and click enter.")
    public void enter_the_desired_username_and_click_enter() {
    adminDashBoardPage.searchBoxElementi.sendKeys(ConfigReader.getProperty("userBalance") + Keys.ENTER);
    }
    @Given("Details button is clicked")
    public void details_button_is_clicked() {
    adminDashBoardPage.detailsElementi.click();
    }
    @Given("It is verified that the detailed information of the desired user is accessed.")
    public void it_is_verified_that_the_detailed_information_of_the_desired_user_is_accessed() {
    Assert.assertTrue(adminDashBoardPage.userDetailElementi.isDisplayed());
    }



}
