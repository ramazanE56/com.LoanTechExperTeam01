package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;


import static org.junit.Assert.assertTrue;

public class US13_MehmetK {
    HomePage homePage = new HomePage();
    LoginPage loginPage=new LoginPage();
    Actions actions = new Actions(Driver.getDriver());

    //TC01
    @Given("click the Login on  top bar of the home page")
    public void click_the_Login_on__top_bar_of_the_home_page() throws InterruptedException {
        homePage.loginButtonElement.click();
        Thread.sleep(3000);

    }
    @Given("Verify that the Login page is a form")
    public void verify_that_the_login_page_is_a_form() {
        Assert.assertTrue(loginPage.loginformu.isDisplayed());
        String formAdi=loginPage.loginformu.getText();
        System.out.println(formAdi);


    }
    @Given("Verify that the Username texbox is Visible and active")
    public void verify_that_the_username_texbox_is_visible_and_active() {
        assertTrue(loginPage.userNameBoxElement.isDisplayed());



    }
    @Given("Verify that the Password texbox is Visible and active")
    public void verify_that_the_password_texbox_is_visible_and_active() {
        assertTrue(loginPage.passwordElement.isDisplayed());

    }
    @Given("Verify that the Remember Me link is Visible and active")
    public void verify_that_the_remember_me_link_is_visible_and_active() {
        assertTrue(loginPage.rememberCheckbox.isDisplayed());

    }
    @Given("Verify that the Forgot Password link is Visible and active")
    public void verify_that_the_forgot_password_link_is_visible_and_active() {
        assertTrue(loginPage.forgetPassword.isDisplayed());

    }
    @Given("Verify that the Login button is Visible and active")
    public void verify_that_the_login_button_is_visible_and_active() {
        assertTrue(loginPage.userLoginButtonElement.isDisplayed());

    }
    @Given("send the registered {string} to username text box")
    public void send_the_registered_to_username_text_box(String userName) throws InterruptedException {
        loginPage.userNameBoxElement.sendKeys("mehmetkahraman");
        Thread.sleep(1000);

    }
    @Given("send the registered {string} to password text box")
    public void send_the_registered_to_password_text_box(String password) {
        loginPage.passwordElement.sendKeys("Loan.742");

    }

    @Given("Verify that the username textbox is filled with the registered username")
    public void verify_that_the_username_textbox_is_filled_with_the_registered_username() {
        Assert.assertTrue(loginPage.userNameText.isDisplayed());
        System.out.println(loginPage.userNameText.getText());

    }
    @Given("Verify that the password textbox fields is filled with the registered password")
    public void verify_that_the_password_textbox_fields_is_filled_with_the_registered_password() {
        Assert.assertTrue(loginPage.userPasswordText.isDisplayed());
        System.out.println(loginPage.userPasswordText.getText());

    }
    @Given("Verify that the message warning appears when incorrect entry is made")
    public void Verify_that_the_message_warning_appears_when_incorrect_entry_is_made() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        loginPage.userLoginSubmit.click();
        Thread.sleep(1000);
        String message=loginPage.messageWrong.getText();
        System.out.println(message);
        Assert.assertTrue(loginPage.messageWrong.isDisplayed());
        Thread.sleep(3000);

    }

    @Given("Click the login button")
    public void click_the_login_button() throws InterruptedException {

        loginPage.passwordElement.sendKeys("Loan.741");
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        loginPage.userLoginSubmit.click();
        Thread.sleep(1000);


    }


    @Given("Verify that the Dashboard page is opened")
    public void verify_that_the_dashboard_page_is_opened() {

        String expectedUrl ="https://qa.loantechexper.com/user/dashboard";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }



    //TC02



    @Given("Click the Forgot password link element")
    public void click_the_Forgot_password_link_element() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(1000);
        loginPage.forgetPassword.click();

    }
    @Given("verify that Recovery page open when when you click on Forgot button")
    public void verify_that_Recovery_page_open_when_when_you_click_on_Forgot_button() {
        String expectedUrl ="https://qa.loantechexper.com/user/password/reset";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Given("send the {string} registered in the textBox")
    public void send_the_registered_in_the_text_box(String username) throws InterruptedException {
        Thread.sleep(1000);
        loginPage.resetAccount.sendKeys("mehmetkahraman");


    }
    @Given("click on the summit button")
    public void click_on_the_summit_button() {
        loginPage.submitButton.click();

    }
    @Given("Verify that Password reset email sent successfully message appears when the Submit button is clicked")
    public void verify_that_password_reset_email_sent_successfully_message_appears_when_the_submit_button_is_clicked() {
        System.out.println(loginPage.succesfullMessage.getText());
        Assert.assertTrue(loginPage.succesfullMessage.isDisplayed());

    }

    @Given("Click the Try to send again link element")
    public void click_the_try_to_send_again_link_element() {
        loginPage.tryResetAgain.click();


    }

    @Given("Verify that the user password reset page opens again when the Try to send again link element is clicked")
    public void verify_that_the_user_password_reset_page_opens_again_when_the_try_to_send_again_link_element_is_clicked() {
        String expectedUrl ="https://qa.loantechexper.com/user/password/reset";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);

    }




    @Given("Enter the digit digit verification {string} sent to the e-mail address in the textBox")
    public void enter_the_digit_digit_verification_sent_to_the_e_mail_address_in_the_text_box(String codeSent) {
        loginPage.code.sendKeys("123456");

    }
    @Given("click the submit button")
    public void click_the_submit_button() {

        loginPage.submitButton.click();
    }

    //TC03


    @Given("verify that The Register Now Link element on the login page visible")
    public void verify_that_the_register_now_link_element_on_the_login_page_visible() throws InterruptedException {
        Assert.assertTrue(loginPage.registerLink.isDisplayed());
        System.out.println(loginPage.registerLink.getText());

        Thread.sleep(1000);


    }
    @Given("Click the Register Now link element.")
    public void click_the_register_now_link_element() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        loginPage.registerLink.click();
        Thread.sleep(3000);

    }

    @Given("verify that The Register page open.")
    public void verify_that_the_register_page_open() {
        String expectedUrl ="https://qa.loantechexper.com/user/register";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);


    }


}
