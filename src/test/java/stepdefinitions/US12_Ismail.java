package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import pages.DashBoardPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class US12_Ismail {
    HomePage homePage = new HomePage();
    LoginPage loginPage = new LoginPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());
    String password = ReusableMethods.passwordUnique(6);
    DashBoardPage dashBoardPage = new DashBoardPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("Verify that the Get Started Button link is Visible on the Home Page")
    public void verify_that_the_get_started_button_link_is_visible_on_the_home_page() {
        ReusableMethods.wait(2);
        assertTrue(homePage.getStartedButonElement.isDisplayed());
    }

    @Given("Click on the Get Started Button on the Home Page.")
    public void click_on_the_get_started_button_link_on_the_home_page() {
        ReusableMethods.wait(2);
        homePage.getStartedButonElement.click();
        ReusableMethods.wait(4);

    }

    @Given("Verify that the register text is visible on register page.")
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
        ReusableMethods.wait(1);
        js.executeScript("window.scrollBy(0,500)");
        ReusableMethods.wait(1);
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
        assertEquals("France", selectedCountry);

    }

    @Given("Country selection is made from the Country menu.")
    public void country_selection_is_made_from_the_country_menu() {
        loginPage.countryDropDownElement.click();
        ReusableMethods.wait(2);
        loginPage.countryDropDownSelectedElement.click();

    }

    @Given("It is verified that a unique phone number of up to {int} digits can be entered in the phone textbox.")
    public void it_is_verified_that_a_unique_phone_number_of_up_to_digits_can_be_entered_in_the_phone_textbox(int x) {
        String phoneNumber = ReusableMethods.fakerPhoneNumberMaxValue(x);
        loginPage.mobileNumberElement.sendKeys(phoneNumber);
        ReusableMethods.wait(2);
        String enteredPhoneNumber = loginPage.mobileNumberElement.getAttribute("value");
        ReusableMethods.wait(2);
        assertEquals(phoneNumber, enteredPhoneNumber);
    }

    @Given("A unique phone number of maximum {int} digits is entered into the phone textbox.")
    public void a_unique_phone_number_of_maximum_digits_is_entered_into_the_phone_textbox(int x) {
        String phoneNumber = ReusableMethods.fakerPhoneNumberMaxValue(x);
        loginPage.mobileNumberElement.sendKeys(phoneNumber);
        ReusableMethods.wait(2);
        String enteredPhoneNumber = loginPage.mobileNumberElement.getAttribute("value");
    }

    @Given("It is verified that a {int}-digit password containing at least one uppercase letter, one number, lowercase letter and character can be entered in the Password textbox.")
    public void it_is_verified_that_a_digit_password_containing_at_least_one_uppercase_letter_one_number_lowercase_letter_and_character_can_be_entered_in_the_password_textbox(int x) {

        loginPage.passwordElement.sendKeys(password);
        String enteredePassword = loginPage.passwordElement.getAttribute("value");
        assertEquals(password, enteredePassword);
    }

    @Given("It is verified that the password entered in the password textbox can be hidden or revealed.")
    public void it_is_verified_that_the_password_entered_in_the_password_textbox_can_be_hidden_or_revealed() {
        loginPage.passwordBoxEyeIconElement.click();
        String passwordFieldType = loginPage.passwordElement.getAttribute("type");
        assertEquals("text", passwordFieldType);
    }

    @Given("A {int}-digit password containing at least one uppercase letter, one number, lowercase letter and character is entered into the Password textbox.")
    public void a_digit_password_containing_at_least_one_uppercase_letter_one_number_lowercase_letter_and_character_is_entered_into_the_password_textbox(Integer int1) {
        loginPage.passwordElement.sendKeys(password);
    }

    @Given("It is verified that the password specified in the Confirm textbox can be entered again.")
    public void it_is_verified_that_the_password_specified_in_the_confirm_textbox_can_be_entered_again() {
        loginPage.confirmPasswordElement.sendKeys(password);
        String enteredPasswordConfirm = loginPage.confirmPasswordElement.getAttribute("value");
        assertEquals(password, enteredPasswordConfirm);
    }

    @Given("Verify that the I agree with Privacy Policy, Terms of Service, Rapid Policy check box is clickable")
    public void verify_that_the_i_agree_with_privacy_policy_terms_of_service_rapid_policy_check_box_is_clickable() {
        loginPage.iAgreeTikElement.click();
        assertTrue("I Agree checkbox is not clickable", loginPage.iAgreeTikElement.isEnabled());
    }

    @Given("The specified password is entered in the Confirm textbox.")
    public void the_specified_password_is_entered_in_the_confirm_textbox() {
        loginPage.confirmPasswordElement.sendKeys(password);
    }

    @Given("click on the register button")
    public void click_on_the_register_button() {
        loginPage.registerButtonElement.click();
        ReusableMethods.waitForVisibility(loginPage.pleaseComplateYourProfileTextElement,10);
    }

    @Given("Verify that Please Complete Your Profile is visible")
    public void verify_that_please_complete_your_profile_is_visible() {
        assertTrue(loginPage.pleaseComplateYourProfileTextElement.isDisplayed());
    }
    @Given("click on the i agree button")
    public void click_on_the_i_agree_button() {
        loginPage.iAgreeTikElement.click();

    }
    @Given("The Firstname box should be visible")
    public void the_firstname_box_should_be_visible() {
        assertTrue(loginPage.firstnameBoxElement.isDisplayed());
    }
    @Given("The lastname box should be visible")
    public void the_lastname_box_should_be_visible() {
        assertTrue(loginPage.lastnameBoxElement.isDisplayed());
    }
    @Given("The address box should be visible")
    public void the_address_box_should_be_visible() {
        assertTrue(loginPage.addressBoxElement.isDisplayed());
    }
    @Given("The State box should be visible")
    public void the_state_box_should_be_visible() {
       assertTrue(loginPage.stateBoxElement.isDisplayed());
    }
    @Given("The Zip box should be visible")
    public void the_zip_box_should_be_visible() {
        assertTrue(loginPage.zipBoxElement.isDisplayed());
    }
    @Given("The city box should be visible")
    public void the_city_box_should_be_visible() {
        assertTrue(loginPage.cityBoxElement.isDisplayed());
       //JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
       //jse.executeScript("arguments[0].scrollIntoView(true)", loginPage.registerButtonElement);
       //ReusableMethods.wait(2);
       //jse.executeScript("arguments[0].click();",loginPage.registerButtonElement);
    }
    @Given("The Submit Button should be visible")
    public void the_submit_button_should_be_visible() {
        assertTrue(loginPage.submitButtonElement.isDisplayed());
    }
    @Given("Submit Button must be clickable")
    public void submit_button_must_be_clickable() {
       boolean is_clickable = loginPage.submitButtonElement.isEnabled() && loginPage.submitButtonElement.isDisplayed();
       assert is_clickable :  "Webelement tıklanabilir değil";

    }
    @Given("Name is entered in the firstname box")
    public void name_is_entered_in_the_firstname_box() {
        ReusableMethods.wait(1);
        js.executeScript("window.scrollBy(0,500)");
        ReusableMethods.wait(1);

        loginPage.firstnameBoxElement.click();
        loginPage.firstnameBoxElement.sendKeys(faker.name().name().toUpperCase());
        ReusableMethods.wait(1);

    }
    @Given("Surname is entered in the lastname box")
    public void surname_is_entered_in_the_lastname_box() {
        loginPage.lastnameBoxElement.sendKeys(faker.name().lastName().toUpperCase());
        ReusableMethods.wait(1);
    }
    @Given("Address is entered in the address box")
    public void address_is_entered_in_the_address_box() {
        loginPage.addressBoxElement.sendKeys(faker.address().fullAddress().toUpperCase());
        ReusableMethods.wait(1);
    }
    @Given("State is entered in the state box")
    public void state_is_entered_in_the_state_box() {
        loginPage.stateBoxElement.sendKeys(faker.address().state().toUpperCase());
        ReusableMethods.wait(1);
    }
    @Given("zip code entered in zip code box")
    public void zip_code_entered_in_zip_code_box() {
       loginPage.zipBoxElement.sendKeys(faker.address().zipCode().toUpperCase());
        ReusableMethods.wait(1);
    }
    @Given("Country is entered in the city box")
    public void country_is_entered_in_the_city_box() {
        loginPage.cityBoxElement.sendKeys(faker.address().city().toUpperCase());
        ReusableMethods.wait(1);
    }
    @Given("Click on the submit button")
    public void click_on_the_submit_button() {
        loginPage.submitButtonElement.click();
        ReusableMethods.wait(4);
    }
    @Given("Verify that registration process completed successfully appears")
    public void verify_that_registration_process_completed_successfully_appears() {
        assertTrue(loginPage.registrationSuccessfullyElement.isDisplayed());
    }
    @Given("Click on the Profile tab")
    public void click_on_the_profile_tab() throws AWTException {
       // dashBoardPage.AllowYaziElementi.click();
       // ReusableMethods.wait(5);
       ReusableMethods.coordinateClick(309,965);
        ReusableMethods.wait(2);
        dashBoardPage.profileTabElement.click();
        ReusableMethods.wait(2);
    }
    @Given("dashboard Name is entered in the firstname box")
    public void dashboard_name_is_entered_in_the_firstname_box() throws AWTException {
        ReusableMethods.coordinateClick(1727,393);
       dashBoardPage.firsnameBoxElement.sendKeys(faker.name().name().toUpperCase());
       ReusableMethods.wait(1);
    }
    @Given("dashboard Surname is entered in the lastname box")
    public void dashboard_surname_is_entered_in_the_lastname_box() {
        dashBoardPage.lastnameBoxElement.sendKeys(faker.name().lastName().toUpperCase());
        ReusableMethods.wait(1);
    }
    @Given("dashboard Address is entered in the address box")
    public void dashboard_address_is_entered_in_the_address_box() {
        dashBoardPage.addressBoxElement.sendKeys(faker.address().fullAddress().toUpperCase());
        ReusableMethods.wait(1);
    }
    @Given("dashboard State is entered in the state box")
    public void dashboard_state_is_entered_in_the_state_box() {
       dashBoardPage.stateBoxElement.sendKeys(faker.address().state().toUpperCase());
        ReusableMethods.wait(1);
    }
    @Given("dashboard zip code entered in zip code box")
    public void dashboard_zip_code_entered_in_zip_code_box() {
        dashBoardPage.zipBoxElement.sendKeys(faker.address().zipCode());
        ReusableMethods.wait(1);
    }
    @Given("dashboard Country is entered in the city box")
    public void dashboard_country_is_entered_in_the_city_box() {
       dashBoardPage.cityBoxElement.sendKeys(faker.address().city().toUpperCase());
        ReusableMethods.wait(1);
    }
    @Given("dashboard Click on the submit button")
    public void dashboard_click_on_the_submit_button() {
        ReusableMethods.wait(3);
        dashBoardPage.submitButtonElement.click();
    }
    @Given("Click the Choose File button and upload a profile photo.")
    public void click_the_choose_file_button_and_upload_a_profile_photo() throws InterruptedException, AWTException {
        ReusableMethods.wait(2);
        ReusableMethods.photoUpdateInPc(1389,541,638,52,"C:\\Users\\asus\\IdeaProjects\\com.LoanTechExperTeam01\\src\\test\\java\\utilities",317,163,790,509);
        ReusableMethods.coordinateClick(317,163);
        ReusableMethods.coordinateClick(790,509);
    }


}
