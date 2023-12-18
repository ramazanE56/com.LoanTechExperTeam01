package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utilities.ConfigReader;
import utilities.Driver;

public class US14_Suphi {

    @Given("The visitor enters the site with the given {string}")
    public void the_visitor_enters_the_site_with_the_given(String UrlAdmin) {
        Driver.getDriver().get(ConfigReader.getProperty(UrlAdmin));
    }
    @Given("Verifies that the visitor has accessed the Loan Plans page")
    public void verifies_that_the_visitor_has_accessed_the_loan_plans_page() {
        String expectedUrl ="https://qa.loantechexper.com/loan";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }
    @Given("Click the Login button and go to the user login page")
    public void click_the_login_button_and_go_to_the_user_login_page() {

    }
    @Given("The user logs in to the user dashboard page with {string} and {string}")
    public void the_user_logs_in_to_the_user_dashboard_page_with_user_name_and_user_password(String userNameSuphi, String userPasswordSuphi) {
        Driver.getDriver().get(ConfigReader.getProperty(userNameSuphi));
        Driver.getDriver().get(ConfigReader.getProperty(userPasswordSuphi));
    }
    @Given("Click on the Profile link to go to the page where profile information can be edited")
    public void click_on_the_profile_link_to_go_to_the_page_where_profile_information_can_be_edited() {

    }
    @Given("Close the page")
    public void close_the_page() {
        Driver.closeDriver();
    }


    @When("User name, e-mail address, phone number, country information should be visible")
    public void userNameEMailAddressPhoneNumberCountryInformationShouldBeVisible() {
        
    }

    @When("Firstname and lastname are edited")
    public void firstnameAndLastnameAreEdited() {
        
    }

    @When("Click on Choose File button in Image section")
    public void clickOnChooseFileButtonInImageSection() {
        
    }

    @When("The new file is selected and uploaded")
    public void theNewFileIsSelectedAndUploaded() {
        
    }

    @When("Non-digit characters are entered in the zip code section")
    public void inTheZipCodeSectionCharactersOtherThanDigitCharactersAreEntered() {
        
    }

    @When("Enter digit characters in the Zip code section and save the changes by clicking the submit button")
    public void enterDigitCharactersInTheZipCodeSectionAndSaveTheChangesByClickingTheSubmitButton() {
        
    }

    @When("The user makes the necessary changes in the profile settings section and saves the changes by clicking submit")
    public void theUserMakesTheNecessaryChangesInTheProfileSettingsSectionAndSavesTheChangesByClickingSubmit() {
        
    }

    @When("{string} appears when the changes are saved")
    public void profileUpdatedSuccessfullyAppearsWhenTheChangesAreSaved() {
    }
}
