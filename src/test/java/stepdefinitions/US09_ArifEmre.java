package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;

import static utilities.Driver.getDriver;

public class US09_ArifEmre {

    HomePage homePage = new HomePage();

    @Given("The user enters the site with the given {string}")
    public void the_user_enters_the_site_with_the_given(String Url) {
       Driver.getDriver().get(ConfigReader.getProperty("Url"));
       ReusableMethods.wait(2);
    }

    @Given("click cookies")
    public void clickCookies() {
        homePage.cookiesElementi.click();
    }
    @Given("Click on the Contact tab.")
    public void click_on_the_contact_tab()
    {
        homePage.contactElementi.click();
    }
    @Given("It is verified that the Contact Us page is opened.")
    public void ıt_is_verified_that_the_contact_us_page_is_opened() {

        Assert.assertTrue(homePage.contactUsGorunumElementi.isDisplayed());
    }
    @Given("Home button is clicked")
    public void home_button_is_clicked()

    {
        homePage.homeElementi.click();
    }

    @Given("Go down to the footer section")
    public void go_down_to_the_footer_section() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.footerElementi);
    }
    @Given("Verify that the Contact Us option is visible and active")
    public void verify_that_the_contact_us_option_is_visible_and_active()
    {
    ReusableMethods.wait(2);
    Assert.assertTrue(homePage.contactUsElementi.isDisplayed());
    }
    @Given("Click on the Contact Us option in the Footer section.")
    public void click_on_the_contact_us_option_in_the_footer_section() {
    homePage.contactUsElementi.click();
    }
    @Given("The company's email, telephone and address contact information must be visible.")
    public void the_company_s_email_telephone_and_address_contact_information_must_be_visible() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.emailAddressElementi);
        Assert.assertTrue(homePage.officeAddressElementi.isDisplayed());
        Assert.assertTrue(homePage.emailAddressElementi.isDisplayed());
        Assert.assertTrue(homePage.mobileNumberElementi.isDisplayed());
    }
    @Given("switch to iframe")
    public void switch_to_iframe() {
        Driver.getDriver().switchTo().frame(homePage.iframeElementi);
        // Driver.getDriver().switchTo().defaultContent(); iframeden çıkmak için kullanılır.
    }
    @Given("Verify that address information is visible on the map")
    public void verify_that_address_information_is_visible_on_the_map() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.adresBilgisiElementi);
    Assert.assertTrue(homePage.adresBilgisiElementi.isDisplayed());
    }

    @Given("Form to send messages to the Company on the Contact Us page must be visible.")
    public void Form_to_send_messages_to_the_Company_on_the_Contact_Us_page_must_be_visible() {

    Assert.assertTrue(homePage.sendYourMessagesElementi.isDisplayed());
    }
    @Given("It goes down to the Send Your Messages section.")
    public void It_goes_down_to_the_Send_Your_Messages_section() {
        JavascriptExecutor jse = (JavascriptExecutor) getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);", homePage.subjectBoxElementi);
    }
    @Given("wait2")
    public void wait2() {
        ReusableMethods.wait(2);
    }

    @Given("The Send Your Messages form is filled out.")
    public void the_send_your_messages_form_is_filled_out() {
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_UP).perform();
        ReusableMethods.wait(2);
        actions.click(homePage.yourNameBoxElementi).sendKeys(ConfigReader.getProperty("yourName")).
                sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("emailemre")).
                sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("subject")).
                sendKeys(Keys.TAB).sendKeys(ConfigReader.getProperty("message")).
                sendKeys(Keys.PAGE_DOWN).perform();
    }


    @Given("The send message button is clicked")
    public void The_send_message_button_is_clicked ()
    {

        homePage.sendMessageButonElementi.click();
    }
    @Given("Verifies that a message has been sent to the company.")
    public void Verifies_that_a_message_has_been_sent_to_the_company (){
        Assert.assertTrue(homePage.ticketCreatedSuccessfullyElementi.isDisplayed());
    }
    @Given("The page is closed.")
    public void the_page_is_closed() {
    Driver.closeDriver();
    }


}

