package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.HomePage;

public class US12_Ismail {
    HomePage homePage = new HomePage();
    @Given("Verify that the Get Started Button Link is Visible on the Home Page")
    public void verify_that_the_get_started_button_link_is_visible_on_the_home_page() {
        Assert.assertTrue(homePage.getStartedButonElement.isDisplayed());
    }
    @Given("Click on the Get Started Button Link on the Home Page.")
    public void click_on_the_get_started_button_link_on_the_home_page() {
        homePage.getStartedButonElement.click();

    }
    @Given("Verify that the register text is visible on the register page.")
    public void verify_that_the_register_text_is_visible_on_the_register_page() {
        Assert.assertTrue(homePage.registerTextElement.isDisplayed());

    }

    @Given("Verify that the Welcome To Loantech Expert form title is visible on the Register page")
    public void verify_that_the_form_title_is_visible_on_the_register_page() {
        Assert.assertTrue(homePage.WelcomeToLoantechExpertTextElement.isDisplayed());
    }
}
