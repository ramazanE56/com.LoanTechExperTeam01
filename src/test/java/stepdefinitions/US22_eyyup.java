package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

public class US22_eyyup {

    HomePage homePage = new HomePage();
    Actions actions =new Actions(Driver.getDriver());

    @Given("Navigate to the URL by entering in the browser's address {string} bar and pressing the Enter key.")
    public void navigate_to_the_url_by_entering_in_the_browser_s_address_bar_and_pressing_the_enter_key(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));

    }

    @Then("Click on the Login button.")
    public void click_on_the_login_button() {

       //JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
       //ReusableMethods.wait(2);
       //jse.executeScript("arguments[0].scrollIntoView(true);",homePage.AllowYaziElementi);
       //ReusableMethods.wait(2);
       //jse.executeScript("arguments[0].click();",homePage.AllowYaziElementi);
        ReusableMethods.wait(2);
        homePage.AllowYaziElementi.click();
        ReusableMethods.wait(2);
        homePage.firstLogin.click();

    }

    @Then("Fill in user information.")
    public void fill_in_user_information() {


        homePage.userName.sendKeys(ConfigReader.getProperty("Username"));
        ReusableMethods.wait(2);
        homePage.password.sendKeys(ConfigReader.getProperty("password"));

        //actions.sendKeys(Keys.PAGE_DOWN).perform();
        ReusableMethods.wait(3);

        homePage.login2.sendKeys(Keys.ENTER);
        ReusableMethods.wait(5);





    }

    @Then("Test the functionality and visibility of the logout button.")
    public void test_the_functionality_and_visibility_of_the_logout_button() {

actions.sendKeys(Keys.PAGE_DOWN).perform();

        Assert.assertTrue(homePage.logoutButton.isDisplayed());

    }

    @Then("Return to the home page.")
    public void return_to_the_home_page() {
        homePage.logoutButton.click();

    }

    @Then("Close the web page.")
    public void close_the_web_page() {
        Driver.closeDriver();

    }

}
