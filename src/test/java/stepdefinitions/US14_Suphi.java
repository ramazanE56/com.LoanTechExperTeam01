package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.DashBoardPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;

public class US14_Suphi {

    LoginPage loginPage = new LoginPage();
    HomePage homePage= new HomePage();
    DashBoardPage dashBoardPage= new DashBoardPage();
    @Given("Verifies that the visitor has accessed the Loan Plans page")
    public void verifies_that_the_visitor_has_accessed_the_loan_plans_page() {
        String expectedUrl ="https://qa.loantechexper.com/loan";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }
    @Given("Click the Login button and go to the user login page")
    public void click_the_login_button_and_go_to_the_user_login_page() {
        ReusableMethods.clickWithJS(homePage.loginButtonElement);
    }
    @Given("The user logs in to the user dashboard page with {string} and {string}")
    public void the_user_logs_in_to_the_user_dashboard_page_with_user_name_and_user_password(String userNameSuphi, String userPassword) {

        ReusableMethods.wait(4);
        homePage.cocies.click();
        ReusableMethods.wait(1);
        ReusableMethods.clickWithJS(loginPage.userNameElement);
        loginPage.userNameElement.clear();
        loginPage.userNameElement.sendKeys(ConfigReader.getProperty(userNameSuphi));
        ReusableMethods.clickWithJS(loginPage.passwordElement);
        loginPage.passwordElement.clear();
        loginPage.passwordElement.sendKeys(ConfigReader.getProperty(userPassword));

        ReusableMethods.clickWithJS(loginPage.userLoginButtonElement);
    }
    @Given("Click on the Profile link to go to the page where profile information can be edited")
    public void click_on_the_profile_link_to_go_to_the_page_where_profile_information_can_be_edited() {
        ReusableMethods.clickWithJS(dashBoardPage.userProfileLinkElement);

    }

    @When("User name, e-mail address, phone number, country information should be visible")
    public void userNameEMailAddressPhoneNumberCountryInformationShouldBeVisible() {
        ReusableMethods.wait(2);
        dashBoardPage.profileNameElement.isDisplayed();
        dashBoardPage.profileCountryElement.isDisplayed();
        dashBoardPage.profilePhoneElement.isDisplayed();
        dashBoardPage.profileCountryElement.isDisplayed();
    }

    @When("Firstname and lastname are edited")
    public void firstnameAndLastnameAreEdited() {
        ReusableMethods.clickWithJS(dashBoardPage.profileFirstNameBoxElement);
        dashBoardPage.profileFirstNameBoxElement.clear();
        dashBoardPage.profileFirstNameBoxElement.sendKeys("suphi");
        ReusableMethods.clickWithJS(dashBoardPage.profileLastNameBoxElement);
        dashBoardPage.profileLastNameBoxElement.clear();
        dashBoardPage.profileLastNameBoxElement.sendKeys("atilim");
        ReusableMethods.clickWithJS(dashBoardPage.profileSettingSubmitButtonElement);
        ReusableMethods.wait(1);
        dashBoardPage.profileUpdatedSuccessfullyElement.isDisplayed();

    }

    @When("Click on Choose File button in Image section")
    public void clickOnChooseFileButtonInImageSection() {
        ReusableMethods.clickWithJS(dashBoardPage.imageDosyaSecElement);



    }

    @When("The new file is selected and uploaded")
    public void theNewFileIsSelectedAndUploaded() throws InterruptedException, AWTException {
        ReusableMethods.wait(1);
        ReusableMethods.photoUpdateInPc(1164,566,446,59,"C:\\Users\\atili\\IdeaProjects\\com.LoanTechExperTeam01\\src\\test\\java\\utilities",346,172,597,447);
        ReusableMethods.coordinateClick(346,172);
        ReusableMethods.coordinateClick(597,447);

        dashBoardPage.submitButtonElement.click();

        dashBoardPage.profileUpdatedSuccessfullyElement.isDisplayed();
        
    }

    @When("Non-digit characters are entered in the zip code section")
    public void inTheZipCodeSectionCharactersOtherThanDigitCharactersAreEntered() {
        ReusableMethods.clickWithJS(dashBoardPage.profileZipCodeBoxElement);
        dashBoardPage.profileZipCodeBoxElement.clear();
        dashBoardPage.profileZipCodeBoxElement.sendKeys("abcde");
        ReusableMethods.clickWithJS(dashBoardPage.profileSettingSubmitButtonElement);
        
    }

    @When("Enter digit characters in the Zip code section and save the changes by clicking the submit button")
    public void enterDigitCharactersInTheZipCodeSectionAndSaveTheChangesByClickingTheSubmitButton() {
        ReusableMethods.wait(1);
        dashBoardPage.profileUpdatedSuccessfullyElement.isDisplayed();
    }

    @When("The user makes the necessary changes in the profile settings section and saves the changes by clicking submit")
    public void theUserMakesTheNecessaryChangesInTheProfileSettingsSectionAndSavesTheChangesByClickingSubmit() {
       ReusableMethods.clickWithJS(dashBoardPage.profileSettingSubmitButtonElement);
        dashBoardPage.profileUpdatedSuccessfullyElement.isDisplayed();
    }

    @When("Profile updated successfully appears when the changes are saved")
    public void profileUpdatedSuccessfullyAppearsWhenTheChangesAreSaved() {
        ReusableMethods.clickWithJS(dashBoardPage.profileSettingSubmitButtonElement);
        dashBoardPage.profileUpdatedSuccessfullyElement.isDisplayed();
    }
}
