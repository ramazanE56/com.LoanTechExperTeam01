package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US12_Ismail {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Verify that the Get Started Button Link is Visible on the Home Page")
    public void verify_that_the_get_started_button_link_is_visible_on_the_home_page() {
        assertTrue(homePage.getStartedButonElement.isDisplayed());
    }

    @Given("Click on the Get Started Button Link on the Home Page.")
    public void click_on_the_get_started_button_link_on_the_home_page() {
        homePage.getStartedButonElement.click();

    }

    @Given("Verify that the register text is visible on the register page.")
    public void verify_that_the_register_text_is_visible_on_the_register_page() {
        assertTrue(homePage.registerTextElement.isDisplayed());

    }

    @Given("Verify that the Welcome To Loantech Expert form title is visible on the Register page")
    public void verify_that_the_form_title_is_visible_on_the_register_page() {
        assertTrue(homePage.WelcomeToLoantechExpertTextElement.isDisplayed());
    }

    @Given("Verify that the username text box is visible")
    public void verify_that_the_username_text_box_is_visible() {
        assertTrue(loginPage.userNameBoxElement.isDisplayed());

    }

    @Given("Verify that the Email Address text box is visible")
    public void verify_that_the_email_address_text_box_is_visible() {
        assertTrue(loginPage.emailBoxElement.isDisplayed());

    }

    @Given("Verify that the Country DropDown is visible")
    public void verify_that_the_country_drop_down_is_visible() {
        assertTrue(loginPage.countryDropDownElement.isDisplayed());

    }

    @Given("Verify that the Mobile Number text box is visible")
    public void verify_that_the_mobile_number_text_box_is_visible() {
        assertTrue(loginPage.mobileNumberElement.isDisplayed());

    }

    @Given("Verify that the Password text box is visible")
    public void verify_that_the_password_text_box_is_visible() {
        assertTrue(loginPage.passwordElement.isDisplayed());
    }

    @Given("Verify that the Confirm Password text box is visible")
    public void verify_that_the_confirm_password_text_box_is_visible() {
        assertTrue(loginPage.confirmPasswordElement.isDisplayed());
    }

    @Given("A unique username with at least {int} characters is entered in the Username box.")
    public void a_unique_username_with_at_least_characters_is_entered_in_the_username_box(int x) {
        String username = ReusableMethods.fakerUsernameMinValue(x);
        loginPage.userNameBoxElement.sendKeys(username);
        String enteredUsername = loginPage.userNameBoxElement.getAttribute("value");
        assertEquals(username, enteredUsername);
    }

    @Given("It is verified that valid e-mail information containing the @ sign can be entered in the e-mail text box")
    public void it_is_verified_that_valid_e_mail_information_containing_the_sign_can_be_entered_in_the_e_mail_text_box() {
        String email = faker.internet().emailAddress();
        loginPage.emailBoxElement.sendKeys(email);
        String enteredEmail = loginPage.emailBoxElement.getAttribute("value");
        assertEquals(email, enteredEmail);
    }
    @Given("Valid e-mail information containing the @ sign is entered into the e-mail text box")
    public void valid_e_mail_information_containing_the_sign_is_entered_into_the_e_mail_text_box() {
        loginPage.emailBoxElement.sendKeys(faker.internet().emailAddress());
    }
    @Given("It is verified that country selection is possible from the Country menu.")
    public void it_is_verified_that_country_selection_is_possible_from_the_country_menu() {
        loginPage.countryDropDownElement.click();
        ReusableMethods.wait(2);
        loginPage.countryDropDownSelectedElement.click();
        ReusableMethods.wait(2);
        Driver.getDriver().manage().deleteAllCookies();
        String selectedCountry = loginPage.countryDropDownElement.getText();
        assertEquals("France",selectedCountry);

    }

}
