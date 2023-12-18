package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.LoginPage;

public class US18_Ismail {

    LoginPage loginPage = new LoginPage();

    @Given("Click on the login button")
    public void click_on_the_login_button() {
        loginPage.loginButtonElement.click();
    }
    @Given("The registered {string} is entered in the Username Or Email box.")
    public void the_registered_is_entered_in_the_username_or_email_box(String username) {

    }
    @Given("Registered user {string} is entered in the Your Password box.")
    public void registered_user_is_entered_in_the_your_password_box(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Given("Click on the login button to log in.")
    public void click_on_the_login_button_to_log_in() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
