package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.net.URL;
import java.util.List;

public class US43_Yetis {
    HomePage homePage=new HomePage();
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    AdminLoginPage adminLoginPage = new AdminLoginPage();
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();

    @Given("As admin, go to \\{string} page")
    public void as_admin_go_to_page(String adminUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(adminUrl));

    }
    @Given("Enter a valid \\{string} and \\{string} and press the login button.")
    public void enter_a_valid_and_and_press_the_login_button(String adminUsername,String passwordAdmin) {
        adminLoginPage.adminUserNameBox.click();
        adminLoginPage.adminUserNameBox.sendKeys(ConfigReader.getProperty(adminUsername));
        adminLoginPage.adminPasswordBox.click();
        adminLoginPage.adminPasswordBox.sendKeys(ConfigReader.getProperty(passwordAdmin));
        jse.executeScript("arguments[0].click();", adminLoginPage.adminLoginButton);

    }
    @Given("Click on the manage users")
    public void click_on_the_manage_users() {
      adminDashBoardPage.manageUserElement.click();

    }
    @Given("Click on the active users")
    public void click_on_the_active_users() {
        adminDashBoardPage.activeUserElement.click();
    }
    @Given("The Active Users Link appears under the Manage Users link and it is verified that it is active.")
    public void the_link_appears_under_the_link_and_it_is_verified_that_it_is_active() {
        Assert.assertTrue(adminDashBoardPage.manageUserElement.isEnabled());
        Assert.assertTrue(adminDashBoardPage.activeUserElement.isEnabled());
    }

    @Given("Verify that the Active Users List and list titles can be displayed")
    public void verify_that_the_and_list_titles_can_be_displayed() {

        List<WebElement> activeUserTitles = adminDashBoardPage.activeUserTitles;

        for (WebElement each :activeUserTitles
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);

    }

    @Given("Click on the Details")
    public void click_on_the_details() {
       adminDashBoardPage.activeUserDetailElement.click();
    }
    @Given("User Detail - Verifies that Username is on the page")
    public void user_detail_verifies_that_username_is_on_the_page() {
        adminDashBoardPage.userDetailsUsernameElemets.isDisplayed();

        adminDashBoardPage.userDetailsUsernameElemets.click();
        ReusableMethods.wait(2);
    }
    @Given("It must be verified that the Login as User button is active.")
    public void it_must_be_verified_that_the_login_as_user_button_is_active() {

       Assert.assertTrue( adminDashBoardPage.loginAsAUserButton.isEnabled());

    }

    @Given("Click on Login as button")
    public void click_on_login_as_button() {
        adminDashBoardPage.loginAsAUserButton.click();
        ReusableMethods.switchToWindow(Driver.getDriver().getTitle());
    }
    @Given("It should be verified that when active as user is clicked, it goes to the User Dashboard User Data page")
    public void it_should_be_verified_that_when_active_as_user_is_clicked_it_goes_to_the_user_dashboard_user_data_page() {

        Assert.assertTrue(homePage.loanTechLogoElement.isDisplayed());
    }

}
