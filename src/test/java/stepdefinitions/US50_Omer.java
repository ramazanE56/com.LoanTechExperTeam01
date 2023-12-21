package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;
import pages.DashBoardPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US50_Omer {

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();
    AdminLoginPage adminLoginPage = new AdminLoginPage();

    @Given("Enter a valid {string} and {string} and press the login button on page")
    public void enter_a_valid_and_and_press_the_login_button_on_page(String adminUsernameO, String password) {

        adminDashBoardPage.adminUsernameTextBox.click();
        adminDashBoardPage.adminUsernameTextBox.sendKeys(ConfigReader.getProperty(adminUsernameO));
        ReusableMethods.wait(2);
        adminDashBoardPage.adminPasswordTextBox.click();
        adminDashBoardPage.adminPasswordTextBox.sendKeys(ConfigReader.getProperty(password));
        adminDashBoardPage.adminLoginButton.submit();

    }


    @Given("Verify that Notification to All button is visible and active")
    public void verify_that_notification_to_all_button_is_visible_and_active() {

        adminDashBoardPage.manageUsersButton.click();
        ReusableMethods.wait(3);
        Assert.assertTrue(adminDashBoardPage.notificationButton.isDisplayed());
        Assert.assertTrue(adminDashBoardPage.notificationButton.isEnabled());

    }

    @Given("Click the Notification to All button")
    public void click_the_notification_to_all_button() {

        adminDashBoardPage.notificationButton.click();
        ReusableMethods.wait(2);

    }

    @Given("Verify that Being Sent text is visible")
    public void verify_that_being_sent_text_is_visible() {

        Assert.assertTrue(adminDashBoardPage.beingSentText.isDisplayed());
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@class='form-control']")));
        select.selectByValue("selectedUsers");
        ReusableMethods.wait(2);
        Select select1 = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='user[]']")));
        List<WebElement> mail = select1.getOptions();
        System.out.println("The dropdown options are:");
        for(WebElement options: mail)
            System.out.println(options.getText());
        ReusableMethods.wait(2);
        adminDashBoardPage.selectUsers.sendKeys("omerozyigit@gmail.com");
        ReusableMethods.wait(2);
        adminDashBoardPage.notificationButton.click();

    }

    @Given("Verify that the subject text is visible and write a test1 on textbox")
    public void verify_that_the_subject_text_is_visible_and_write_a_test1_on_textbox() {

        Assert.assertTrue(adminDashBoardPage.subjectText.isDisplayed());
        ReusableMethods.wait(1);
        adminDashBoardPage.subjectTextBox.sendKeys("test1");
        ReusableMethods.wait(1);

    }

    @Given("Write a message on message textbox")
    public void write_a_message_on_message_textbox() {

        ReusableMethods.wait(1);
        adminDashBoardPage.messageTextBox.sendKeys("test text test text test");

    }

    @Given("Write a number on start from text box")
    public void write_a_number_on_start_from_text_box() {

        ReusableMethods.wait(1);
        adminDashBoardPage.startFromTextBox.sendKeys("1");
        Assert.assertTrue(adminDashBoardPage.startFromText.isDisplayed());

    }

    @Given("Write a number on per batch text box")
    public void write_a_number_on_per_batch_text_box() {

        adminDashBoardPage.perBatchTextBox.sendKeys("1");
        Assert.assertTrue(adminDashBoardPage.perBatchText.isDisplayed());
    }

    @Given("Write a wait time number on Cooling Period text box")
    public void write_a_wait_time_number_on_cooling_period_text_box() {

        adminDashBoardPage.coolingPeriodTextBox.sendKeys("1");
        Assert.assertTrue(adminDashBoardPage.coolingPeriodText.isDisplayed());

    }

    @Given("Click the submit button on notification section")
    public void click_the_submit_button_on_notification_section() {

        adminDashBoardPage.notificationSubmitButton.submit();
        ReusableMethods.waitForVisibility(Driver.getDriver().findElement(By.xpath("//h5[normalize-space()='Notification Sending']")), 200);

    }

    @Given("Verify that successfully warning message is appear")
    public void verify_that_succefully_warning_message_is_appear() {


        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//h5[normalize-space()='Notification Sending']")).isDisplayed());


    }

    @Given("Write an any number on per batch text box")
    public void write_an_any_number_on_per_batch_text_box() {

        adminDashBoardPage.perBatchTextBox.sendKeys("");
    }

    @Given("Verify that warning message is appear")
    public void verify_that_warning_message_is_appear() {



    }

}
