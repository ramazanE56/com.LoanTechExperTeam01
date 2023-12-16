package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US21_Halit {

    HomePage homePage = new HomePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("The given {string} is entered into the browser and press enter.")
    public void the_given_url_is_entered_into_the_browser_and_press_enter(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
        ReusableMethods.wait(2);
        homePage.cocies.click();
        ReusableMethods.wait(2);
    }
    @Given("The user click on the login button.")
    public void the_user_click_on_the_login_button() {
        homePage.loginButton.click();
        ReusableMethods.wait(1);
        js.executeScript("window.scrollBy(0,500)");
        ReusableMethods.wait(1);

    }
    @Given("The user enters {string} username.")
    public void the_user_enters_a_valid_email_address(String username) {
        homePage.emailBox.sendKeys(ConfigReader.getProperty(username));
        ReusableMethods.wait(1);
    }
    @Given("The user enters {string} password.")
    public void the_user_enters_the_valid_password(String userPassword) {
        homePage.passwordBox.sendKeys(ConfigReader.getProperty(userPassword));
        ReusableMethods.wait(1);

    }
    @Given("The user clicks on the login button.")
    public void the_user_clicks_on_the_login_button() {
        homePage.loginbutton2.click();
        ReusableMethods.wait(1);
    }
    @Given("The user clicks on the home page logo.")
    public void the_user_clicks_on_the_home_page_logo() {
        homePage.homePageLogo.click();
        ReusableMethods.wait(2 );
    }
    @Given("The user's access to the home page is verified.")
    public void the_user_s_access_to_the_home_page_is_verified() {
        Assert.assertTrue(homePage.homePageDashboard.isDisplayed());
        ReusableMethods.wait(2);

    }
    @Given("Close browser.")
    public void close_browser() {
        Driver.getDriver().close();
    }


    // ****************TC_02******************

    @Given("Email information visible in the top bar of the home page.")
    public void email_information_visible_in_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.emailInformation.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Given("Address information visible in the top bar of the home page.")
    public void address_information_visible_in_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.addressInformation.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Given("Phone information visible in the top bar of the home page.")
    public void phone_information_visible_in_the_top_bar_of_the_home_page() {
        Assert.assertTrue(homePage.phoneInformation.isDisplayed());
        ReusableMethods.wait(1);
    }
    @Given("The Home button is active and visible in the home page header section.")
    public void the_home_button_is_active_and_visible_in_the_home_page_header_section() {
        Assert.assertTrue(homePage.userHomeButton.isDisplayed());
        Assert.assertTrue(homePage.userHomeButton.isEnabled());
        ReusableMethods.wait(1);
    }
    @Given("The About button is active and visible in the home page header section.")
    public void the_about_button_is_active_and_visible_in_the_home_page_header_section() {
        Assert.assertTrue(homePage.userAboutButton.isDisplayed());
        Assert.assertTrue(homePage.userAboutButton.isEnabled());
        ReusableMethods.wait(1);
    }
    @Given("The Plans button is active and visible in the home page header section.")
    public void the_plnas_button_is_active_and_visible_in_the_home_page_header_section() {
        Assert.assertTrue(homePage.userPlansButton.isDisplayed());
        Assert.assertTrue(homePage.userPlansButton.isEnabled());
        ReusableMethods.wait(1);
    }
    @Given("The Blogs button is active and visible in the home page header section.")
    public void the_blogs_button_is_active_and_visible_in_the_home_page_header_section() {
        Assert.assertTrue(homePage.userBlogsButton.isDisplayed());
        Assert.assertTrue(homePage.userBlogsButton.isEnabled());
        ReusableMethods.wait(1);
    }
    @Given("The Contact button is active and visible in the home page header section.")
    public void the_contact_button_is_active_and_visible_in_the_home_page_header_section() {
        Assert.assertTrue(homePage.userContactButton.isDisplayed());
        Assert.assertTrue(homePage.userContactButton.isEnabled());
        ReusableMethods.wait(1);
    }
    @Given("The Login icon is active and visible in the home page header section.")
    public void the_login_icon_is_active_and_visible_in_the_home_page_header_section() {

    }
    @Given("Get Started icon is active and visible in the home page header section.")
    public void get_started_icon_is_active_and_visible_in_the_home_page_header_section() {
        Assert.assertTrue(homePage.userGetStartedButton.isDisplayed());
        Assert.assertTrue(homePage.userGetStartedButton.isEnabled());
        ReusableMethods.wait(1);
    }




    // *****************TC_03************************

    @Given("Click on the Home button in the header section of the home page.")
    public void click_on_the_home_button_in_the_header_section_of_the_home_page() {
        homePage.userHomeButton.click();
        ReusableMethods.wait(1);

    }
    @Given("It is verified that the home page is opened.")
    public void it_is_verified_that_the_home_page_is_opened() {
        Assert.assertTrue(homePage.homePageLogo.isDisplayed());
        ReusableMethods.wait(1);

    }
    @Given("Click on the About button in the header section of the home page.")
    public void click_on_the_about_button_in_the_header_section_of_the_home_page() {
        homePage.userAboutButton.click();
        ReusableMethods.wait(2);
    }
    @Given("It is verified that the About page is opened.")
    public void it_is_verified_that_the_about_page_is_opened() {
        Assert.assertTrue( homePage.aboutText.isDisplayed());

    }
    @Given("Click the Plans button in the header section of the home page.")
    public void click_the_plans_button_in_the_header_section_of_the_home_page() {
        homePage.userPlansButton.click();
        ReusableMethods.wait(1);

    }
    @Given("It is verified that the Plans page is opened.")
    public void it_is_verified_that_the_plans_page_is_opened() {
        Assert.assertTrue(homePage.plansText.isDisplayed());
    }
    @Given("Click the Blogs button in the header section of the home page.")
    public void click_the_blogs_button_in_the_header_section_of_the_home_page() {
        homePage.userBlogsButton.click();
        ReusableMethods.wait(1);
    }
    @Given("It is verified that the Blogs page is opened.")
    public void it_is_verified_that_the_blogs_page_is_opened() {
        Assert.assertTrue(homePage.blogsText.isDisplayed());
    }
    @Given("Click the Contact button in the header section of the home page.")
    public void click_the_contact_button_in_the_header_section_of_the_home_page() {
        homePage.userContactButton.click();
        ReusableMethods.wait(1);
    }
    @Given("It is verified that the Contact page is opened.")
    public void it_is_verified_that_the_contact_page_is_opened() {
       Assert.assertTrue(homePage.contactText.isDisplayed());
    }
    @Given("Click on the Login icon in the header section of the home page.")
    public void click_on_the_login_icon_in_the_header_section_of_the_home_page() {

    }
    @Given("It is verified that the Login page is opened.")
    public void it_is_verified_that_the_login_page_is_opened() {
        Assert.assertFalse(homePage.loginText.isDisplayed());
        ReusableMethods.wait(1);
        Driver.getDriver().navigate().back();
    }
    @Given("Click on the Get Started icon in the header section of the home page.")
    public void click_on_the_get_started_icon_in_the_header_section_of_the_home_page() {
        homePage.userGetStartedButton.click();
        ReusableMethods.wait(1);
    }
    @Given("It is verified that the Get Started  page is opened.")
    public void it_is_verified_that_the_get_started_page_is_opened() {
        Assert.assertTrue(homePage.getStartedPage.isDisplayed());
    }


}
