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

    }
    @Given("Verify that the  phone information at the top of the home page is visible")
    public void verify_that_the_phone_information_at_the_top_of_the_home_page_is_visible() {

    }
    @Given("Verify that the address information at the top of the home page is visible")
    public void verify_that_the_address_information_at_the_top_of_the_home_page_is_visible() {

    }

//TC02


    @Given("Verify that the site logo is Visible and active on the top bar of the home page")
    public void verify_that_the_site_logo_is_visible_and_active_on_the_top_bar_of_the_home_page() {

    }
    @Given("Verify that the Home Button is Visible  and active on the top bar of the home page")
    public void verify_that_the_home_button_is_visible_and_active_on_the_top_bar_of_the_home_page() {

    }
    @Given("Verify that the About Button Link is Visible and active on the top bar of the home page")
    public void verify_that_the_about_button_link_is_visible_and_active_on_the_top_bar_of_the_home_page() {

    }
    @Given("Verify that the Plans Button Link is Visible and active on the top bar of the home page")
    public void verify_that_the_plans_button_link_is_visible_and_active_on_the_top_bar_of_the_home_page() {

    }
    @Given("Verify that the Blogs Button Link is Visible on the and active on the top bar of the home page")
    public void verify_that_the_blogs_button_link_is_visible_on_the_and_active_on_the_top_bar_of_the_home_page() {

    }
    @Given("Verify that the Contact Button Link is Visible on the and active on the top bar of the home page")
    public void verify_that_the_contact_button_link_is_visible_on_the_and_active_on_the_top_bar_of_the_home_page() {

    }
    @Given("Verify that the Login Icon Button Link is Visible on the and active on the top bar of the home page")
    public void verify_that_the_login_icon_button_link_is_visible_on_the_and_active_on_the_top_bar_of_the_home_page() {

    }
    @Given("Verify that the Get Started Button Link is Visible on the and active on the top bar of the home page")
    public void verify_that_the_get_started_button_link_is_visible_on_the_and_active_on_the_top_bar_of_the_home_page() {

    }

    //TC03
    @Given("Click the logo on the top bar of the home page")
    public void click_the_logo_on_the_top_bar_of_the_home_page() {

    }
    @Given("Verify that go to the home page when you click on the logo on the top bar of the home page")
    public void verify_that_go_to_the_home_page_when_you_click_on_the_logo_on_the_top_bar_of_the_home_page() {

    }


    //TC04

    @Given("click the Login on  top bar of the home page")
    public void click_the_Login_on_top_bar_of_the_home_page() {

    }
    @Given("Verify that the Home page is opened when click the {string} on  top bar of the home page")
    public void verify_that_the_home_page_is_opened_when_click_the_on_top_bar_of_the_home_page(String string) {

    }
    @Given("click the {string} on  top bar of the home page")
    public void click_the_on_top_bar_of_the_home_page(String string) {

    }
    @Given("Verify that the About page is opened when click the {string} on  top bar of the home page")
    public void verify_that_the_about_page_is_opened_when_click_the_on_top_bar_of_the_home_page(String string) {

    }
    @Given("Verify that the Plans page is opened when click the {string} on  top bar of the home page")
    public void verify_that_the_plans_page_is_opened_when_click_the_on_top_bar_of_the_home_page(String string) {

    }
    @Given("Verify that the Blogs page is opened when click the {string} on  top bar of the home page")
    public void verify_that_the_blogs_page_is_opened_when_click_the_on_top_bar_of_the_home_page(String string) {

    }
    @Given("Verify that the Contact page is opened when click the {string} on  top bar of the home page")
    public void verify_that_the_contact_page_is_opened_when_click_the_on_top_bar_of_the_home_page(String string) {

    }
    @Given("Verify that the Login page is opened when click the {string} on  top bar of the home page")
    public void verify_that_the_login_page_is_opened_when_click_the_on_top_bar_of_the_home_page(String string) {

    }
    @Given("Verify that the Register page is opened when click the {string} on  top bar of the home page")
    public void verify_that_the_register_page_is_opened_when_click_the_on_top_bar_of_the_home_page(String string) {

    }


    @Given("close page")
    public void close_page() {Driver.closeDriver(); }


}
