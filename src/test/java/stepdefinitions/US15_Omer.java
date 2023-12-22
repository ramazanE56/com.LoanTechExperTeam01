package stepdefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pages.DashBoardPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;
import java.util.Objects;

public class US15_Omer {

    HomePage homePage = new HomePage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    LoginPage loginPage = new LoginPage();


    @Given("Accept the cookies on page")
    public void accept_the_cookies_on_page() {



    }
    @Given("Login with registered user information")
    public void login_with_registered_user_information() {

        homePage.LoginIcon.click();
        ReusableMethods.wait(2);

        homePage.usernameTextBox.sendKeys(ConfigReader.getProperty("username1"));
        homePage.passwordTextBox.sendKeys(ConfigReader.getProperty("password1"));
        homePage.LoginButton.submit();

    }

    @Then("Verify that the Change Password is visible on dashboard and button is active.")
    public void verify_that_the_change_password_is_visible_on_dashboard_and_button_is_active() {

        ReusableMethods.wait(1);
        Assert.assertTrue(dashBoardPage.changePasswordButton.isDisplayed());
        Assert.assertTrue(dashBoardPage.changePasswordButton.isEnabled());
        ReusableMethods.wait(2);

        dashBoardPage.changePasswordButton.click();
        ReusableMethods.wait(1);

        System.out.println(dashBoardPage.changePasswordText.getText());
        Assert.assertTrue(dashBoardPage.changePasswordText.isDisplayed());
        ReusableMethods.wait(3);

    }
    // The password confirmation does not match

    @Given("Write a valid password on the Current Password text box")
    public void write_a_valid_password_on_the_current_password_text_box() {

        dashBoardPage.changePasswordButton.click();
        ReusableMethods.wait(3);

        dashBoardPage.currentPasswordTextBox.sendKeys(ConfigReader.getProperty("password1"));

    }

    @Given("Write a new password on the Password text box,")
    public void write_a_new_password_on_the_password_text_box() {

        String password = "Loan.7412";
        dashBoardPage.newPasswordTextBox.sendKeys(password);
        ReusableMethods.wait(1);

    }

    @Given("Write a different password on the Confirm Password text box,")
    public void write_a_different_password_on_the_confirm_password_text_box() {

        String confirmPassword = "Loan.74123";
        dashBoardPage.confirmPasswordTextBox.sendKeys(confirmPassword);
        ReusableMethods.wait(1);

    }

    @Given("Verify that the new password and the password are not the same")
    public void verify_that_the_new_password_and_the_password_are_not_the_same() {

        String pw = dashBoardPage.newPasswordTextBox.getText();
        String cp = dashBoardPage.confirmPasswordTextBox.getText();

        ReusableMethods.wait(2);

    }

    @Given("Click the Submit button")
    public void click_the_submit_button() {

        dashBoardPage.changePasswordSubmitButton.submit();

    }

    @Given("Verify that the warning message appears")
    public void verify_that_the_warning_message_appears() {

        System.out.println(dashBoardPage.changeMessageWarningMessage.getText());
        Assert.assertTrue(dashBoardPage.changeMessageWarningMessage.isDisplayed());
        ReusableMethods.wait(2);

    }
    @Given("Write a same password on the Confirm Password text box,")
    public void write_a_same_password_on_the_confirm_password_text_box() {

        dashBoardPage.confirmPasswordTextBox.sendKeys(ConfigReader.getProperty("password2"));

    }

    @Given("Verify that the new password and the password are the same")
    public void verify_that_the_new_password_and_the_password_are_the_same() {

        Assert.assertEquals(dashBoardPage.newPasswordTextBox.getText(), dashBoardPage.confirmPasswordTextBox.getText());

    }

    @Given("Verify that the completed successfully message appears")
    public void verify_that_the_completed_successfully_message_appears() {

        dashBoardPage.changePasswordSubmitButton.submit();
        System.out.println(dashBoardPage.changeMessageSuccefullyMessage.getText());
        Assert.assertTrue(dashBoardPage.changeMessageSuccefullyMessage.isDisplayed());

    }
}
