package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.bouncycastle.oer.its.etsi102941.Url;
import org.junit.Assert;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US32_Samet {

    AdminLoginPage adminLoginPage = new AdminLoginPage();

    @Given("Open the web {string}")
    public void openTheWeb(String arg0) {
        Driver.getDriver();

    }

    @When("Navigate to {string}")
    public void navigate_to(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));

    }
    @When("Verify that Admin homepage is visible successfully")
    public void verify_that_admin_homepage_is_visible_successfully() {
        assertTrue(adminLoginPage.AdminDashboardyazielementi.isDisplayed());


    }

    @And("Verify that the Username and Password textBoxes and the LOGIN button are visible")
    public void verifyThatTheUsernameAndPasswordTextBoxesAndTheLOGINButtonAreVisible() {
        assertTrue(adminLoginPage.Usernametextbox.isEnabled());
        assertTrue(adminLoginPage.Passwordtextbox.isEnabled());
        assertTrue(adminLoginPage.Loginbutton.isEnabled());
    }
    @When("On the page that appears, fill in the {string} and {string} textboxes")
    public void onThePageThatAppearsFillInTheAndTextboxes(String Username, String password) {
        adminLoginPage.Usernametextbox.sendKeys(ConfigReader.getProperty("UsernameSamet"));
        adminLoginPage.Passwordtextbox.sendKeys(ConfigReader.getProperty("passwordAdmin"));

    }

    @When("Click the LOGIN button")
    public void clickTheLOGINButton() {
        adminLoginPage.Loginbutton.click();
        ReusableMethods.wait(4);

    }

    @And("Confirm that Admin Homepage is visible")
    public void confirmThatAdminHomepageIsVisible() {
        assertTrue(adminLoginPage.logo.isDisplayed());
        adminLoginPage.logoutmenu.click();
        ReusableMethods.wait(1);
        adminLoginPage.logoutbutton.click();


    }


}
