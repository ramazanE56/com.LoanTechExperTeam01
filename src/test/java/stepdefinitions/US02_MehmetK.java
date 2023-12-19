package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US02_MehmetK {
    HomePage homePage = new HomePage();
    @Given("Navigate to given {string}")
    public void navigate_to_given(String Url) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(Url));
        Thread.sleep(2000);

    }

    //TC01
    @Given("Verify that the  email information at the top of the home page is visible")
    public void verify_that_the_email_information_at_the_top_of_the_home_page_is_visible() {
        String home=homePage.emailInformation.getText();
        System.out.println(home);
        Assert.assertTrue(homePage.emailInformation.isDisplayed());

    }
    @Given("Verify that the  phone information at the top of the home page is visible")
    public void verify_that_the_phone_information_at_the_top_of_the_home_page_is_visible() {
        String phone=homePage.phoneInformation.getText();
        System.out.println(phone);
        Assert.assertTrue(homePage.phoneInformation.isDisplayed());

    }
    @Given("Verify that the address information at the top of the home page is visible")
    public void verify_that_the_address_information_at_the_top_of_the_home_page_is_visible() {
        String address=homePage.addressInformation.getText();
        System.out.println(address);
        Assert.assertTrue(homePage.addressInformation.isDisplayed());


    }

//TC02


    @Given("Verify that the site logo is Visible and active on the top bar of the home page")
    public void verify_that_the_site_logo_is_visible_and_active_on_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.loanTechLogoElement.isDisplayed());


    }
    @Given("Verify that the Home Button is Visible  and active on the top bar of the home page")
    public void verify_that_the_home_button_is_visible_and_active_on_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.userHomeButton.isDisplayed());


    }
    @Given("Verify that the About Button Link is Visible and active on the top bar of the home page")
    public void verify_that_the_about_button_link_is_visible_and_active_on_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.userAboutButton.isDisplayed());


    }
    @Given("Verify that the Plans Button Link is Visible and active on the top bar of the home page")
    public void verify_that_the_plans_button_link_is_visible_and_active_on_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.userPlansButton.isDisplayed());


    }
    @Given("Verify that the Blogs Button Link is Visible on the and active on the top bar of the home page")
    public void verify_that_the_blogs_button_link_is_visible_on_the_and_active_on_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.userBlogsButton.isDisplayed());


    }
    @Given("Verify that the Contact Button Link is Visible on the and active on the top bar of the home page")
    public void verify_that_the_contact_button_link_is_visible_on_the_and_active_on_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.userContactButton.isDisplayed());


    }
    @Given("Verify that the Login Icon Button Link is Visible on the and active on the top bar of the home page")
    public void verify_that_the_login_icon_button_link_is_visible_on_the_and_active_on_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.LoginIcon.isDisplayed());


    }
    @Given("Verify that the Get Started Button Link is Visible on the and active on the top bar of the home page")
    public void verify_that_the_get_started_button_link_is_visible_on_the_and_active_on_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.userGetStartedButton.isDisplayed());


    }

    //TC03
    @Given("Click the logo on the top bar of the home page")
    public void click_the_logo_on_the_top_bar_of_the_home_page() {
        homePage.loanTechLogoElement.click();


    }
    @Given("Verify that go to the home page when you click on the logo on the top bar of the home page")
    public void verify_that_go_to_the_home_page_when_you_click_on_the_logo_on_the_top_bar_of_the_home_page() {
        String expectedUrl ="https://qa.loantechexper.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);


    }


    //TC04

    @Given("Click Home on  top bar of the home page")
    public void click_home_on_top_bar_of_the_home_page() {

        homePage.userHomeButton.click();
    }
    @Given("Verify that the Home page is opened when click the Home on  top bar of the home page")
    public void verify_that_the_home_page_is_opened_when_click_the_home_on_top_bar_of_the_home_page() throws InterruptedException {
        String expectedUrl ="https://qa.loantechexper.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
        Thread.sleep(3000);

    }
    @Given("click the About on  top bar of the home page")
    public void click_the_about_on_top_bar_of_the_home_page() {
        homePage.userAboutButton.click();


    }
    @Given("Verify that the About page is opened when click the About on  top bar of the home page")
    public void verify_that_the_about_page_is_opened_when_click_the_about_on_top_bar_of_the_home_page() {
        String expectedUrl ="https://qa.loantechexper.com/about";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);


    }
    @Given("click the Plans on  top bar of the home page")
    public void click_the_plans_on_top_bar_of_the_home_page() {
        homePage.userPlansButton.click();


    }
    @Given("Verify that the Plans page is opened when click the Plans on  top bar of the home page")
    public void verify_that_the_plans_page_is_opened_when_click_the_plans_on_top_bar_of_the_home_page() {
        String expectedUrl ="https://qa.loantechexper.com/loan";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);


    }
    @Given("click the blogs on  top bar of the home page")
    public void click_the_blogs_on_top_bar_of_the_home_page() {
        homePage.userBlogsButton.click();


    }
    @Given("Verify that the Blogs page is opened when click the blogs on  top bar of the home page")
    public void verify_that_the_blogs_page_is_opened_when_click_the_blogs_on_top_bar_of_the_home_page() {
        String expectedUrl ="https://qa.loantechexper.com/blog";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);


    }
    @Given("click the Contact on  top bar of the home page")
    public void click_the_contact_on_top_bar_of_the_home_page() {
        homePage.userContactButton.click();


    }
    @Given("Verify that the Contact page is opened when click the Contact on  top bar of the home page")
    public void verify_that_the_contact_page_is_opened_when_click_the_contact_on_top_bar_of_the_home_page() {
        String expectedUrl ="https://qa.loantechexper.com/contact";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);


    }
    @Given("click the Login Icon on  top bar of the home page")
    public void click_the_login_icon_on_top_bar_of_the_home_page() {
        homePage.LoginIcon.click();
    }
    @Given("Verify that the Login page is opened when click the Login Icon on  top bar of the home page")
    public void verify_that_the_login_page_is_opened_when_click_the_login_icon_on_top_bar_of_the_home_page() {
        String expectedUrl ="https://qa.loantechexper.com/user/login";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);


    }
    @Given("click the Get Started on  top bar of the home page")
    public void click_the_get_started_on_top_bar_of_the_home_page() throws InterruptedException {
        homePage.userHomeButton.click();
        Thread.sleep(2000);
        homePage.getStartedButonElement.click();

    }
    @Given("Verify that the Register page is opened when click the Get Started on  top bar of the home page")
    public void verify_that_the_register_page_is_opened_when_click_the_get_started_on_top_bar_of_the_home_page() {
        String expectedUrl ="https://qa.loantechexper.com/user/register";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        System.out.println(actualUrl);
        Assert.assertEquals(expectedUrl,actualUrl);


    }


    @Given("close page")
    public void close_page() {
        Driver.closeDriver();
    }


}
