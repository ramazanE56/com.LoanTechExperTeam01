package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class US34_Suphi {

    @Given("The visitor enters the site with the given {string}")
    public void the_visitor_enters_the_site_with_the_given(String UrlAdmin) {
        Driver.getDriver().get(ConfigReader.getProperty(UrlAdmin));
    }
    @Given("Launch browser")
    public void launch_browser() {

    }

    @Given("The admin logs in to the admin dashboard page with {string} and {string}")
    public void the_admin_logs_in_to_the_admin_dashboard_page_with_admin_name_and_admin_password(String adminNameSuphi, String passwordAdmin) {

        Driver.getDriver().get(ConfigReader.getProperty(adminNameSuphi));
        Driver.getDriver().get(ConfigReader.getProperty(passwordAdmin));

    }
    @Given("Click on the admin icon in the upper right corner of the admin dashboard page")
    public void click_on_the_admin_icon_in_the_upper_right_corner_of_the_admin_dashboard_page() {

    }
    @Given("Close the page")
    public void close_the_page() {
        Driver.closeDriver();
    }


    @When("The visibility of Admin, Profile, Password, Logout links is verified")
    public void theVisibilityOfAdminProfilePasswordLogoutLinksIsVerified() {
        
    }

    @When("Click on the profile link")
    public void clickOnTheProfileLink() {
        
    }

    @When("Name, email, image information is updated and saved")
    public void nameEmailImageInformationIsUpdatedAndSaved() {
        
    }

    @When("It is confirmed that the changes made have been saved successfully by the text {string} in the upper right corner")
    public void ıtIsConfirmedThatTheChangesMadeHaveBeenSavedSuccessfullyByTheTextProfileUpdatedSuccessfullyInTheUpperRightCorner() {
        
    }

    @When("Click on the password link and go to the password setting page")
    public void clickOnThePasswordLinkAndGoToThePasswordSettingPage() {
        
    }

    @When("In the Change password section, used Password, New Password and Confirm Password information must be entered")
    public void inTheChangePasswordSectionUsedPasswordNewPasswordAndConfirmPasswordInformationMustBeEntered() {
        
    }

    @When("Click on the logout link")
    public void clickOnTheLogoutLink() {
        
    }

    @When("It is verified that the admin page is exited")
    public void itIsVerifiedThatTheAdminPageIsExited() {

    }
}
