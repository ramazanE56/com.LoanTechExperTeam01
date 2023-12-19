package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;

public class US34_Suphi {
        AdminLoginPage adminLoginPage=new AdminLoginPage();
        AdminDashBoardPage adminDashBoardPage=new AdminDashBoardPage();
    @Given("The visitor enters the admin site with the given {string}")
    public void the_visitor_enters_the_site_with_the_given(String adminUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(adminUrl));
    }


    @Given("The admin logs in to the admin dashboard page with {string} and {string}")
    public void the_admin_logs_in_to_the_admin_dashboard_page_with_admin_name_and_admin_password(String adminNameSuphi, String passwordAdmin) {


        ReusableMethods.wait(1);
        ReusableMethods.clickWithJS(adminLoginPage.adminUserNameBoxElement);
        adminLoginPage.adminUserNameBoxElement.clear();
        adminLoginPage.adminUserNameBoxElement.sendKeys(ConfigReader.getProperty(adminNameSuphi));
        ReusableMethods.clickWithJS(adminLoginPage.adminPasswordBoxElement);
        adminLoginPage.adminPasswordBoxElement.clear();
        adminLoginPage.adminPasswordBoxElement.sendKeys(ConfigReader.getProperty(passwordAdmin));

        ReusableMethods.clickWithJS(adminLoginPage.adminLoginButtonElement);

    }
    @Given("Click on the admin icon in the upper right corner of the admin dashboard page")
    public void click_on_the_admin_icon_in_the_upper_right_corner_of_the_admin_dashboard_page() {
        adminDashBoardPage.adminIconElement.click();
    }

    @When("The visibility of Admin, Profile, Password, Logout links is verified")
    public void theVisibilityOfAdminProfilePasswordLogoutLinksIsVerified() {
        adminDashBoardPage.adminIconProfileElement.isDisplayed();
        adminDashBoardPage.adminIconPasswordElement.isDisplayed();
        adminDashBoardPage.adminIconLogoutElement.isDisplayed();
    }

    @When("Click on the profile link")
    public void clickOnTheProfileLink() {
        adminDashBoardPage.adminIconProfileElement.click();
        
    }

    @When("Name, email, image information is updated and saved")
    public void nameEmailImageInformationIsUpdatedAndSaved() throws InterruptedException, AWTException {
        adminDashBoardPage.adminProfileNameBoxElement.click();
        adminDashBoardPage.adminProfileNameBoxElement.clear();
        adminDashBoardPage.adminProfileNameBoxElement.sendKeys("suphi atilim");

        adminDashBoardPage.adminProfileEmailBoxElement.click();
        adminDashBoardPage.adminProfileEmailBoxElement.clear();
        adminDashBoardPage.adminProfileEmailBoxElement.sendKeys("suphi.celikoz@gmail.com");

        ReusableMethods.wait(1);
        ReusableMethods.photoUpdateInPc(817,721,446,59,"C:\\Users\\atili\\IdeaProjects\\com.LoanTechExperTeam01\\src\\test\\java\\utilities",346,172,597,447);
        ReusableMethods.coordinateClick(346,172);
        ReusableMethods.coordinateClick(597,447);

        ReusableMethods.clickWithJS(adminDashBoardPage.adminProfileSubmitButtonElement);



    }

    @When("It is confirmed that the changes made have been saved successfully by the text Profile updated successfully in the upper right corner")
    public void ıtIsConfirmedThatTheChangesMadeHaveBeenSavedSuccessfullyByTheTextProfileUpdatedSuccessfullyInTheUpperRightCorner() {
        String expectedResult="Password changed successfully.";
        String actualResult= adminDashBoardPage.adminProfileUpdatedConfirmElement.getText();
        Assert.assertEquals(expectedResult,actualResult);

    }

    @When("Click on the password link and go to the password setting page")
    public void clickOnThePasswordLinkAndGoToThePasswordSettingPage() {
        adminDashBoardPage.adminIconPasswordElement.click();
    }

    @When("In the Change password section, used Password, New Password and Confirm Password information must be entered")
    public void inTheChangePasswordSectionUsedPasswordNewPasswordAndConfirmPasswordInformationMustBeEntered() {
        ReusableMethods.clickWithJS(adminDashBoardPage.adminOldPasswordBoxElement);
        adminDashBoardPage.adminOldPasswordBoxElement.sendKeys("123123123");
        ReusableMethods.wait(1);
        ReusableMethods.clickWithJS(adminDashBoardPage.adminPasswordBoxElement);
        adminDashBoardPage.adminPasswordBoxElement.sendKeys("123123123");
        ReusableMethods.wait(1);
        ReusableMethods.clickWithJS(adminDashBoardPage.adminConfirmPasswordBoxElement);
        adminDashBoardPage.adminConfirmPasswordBoxElement.sendKeys("123123123");
        ReusableMethods.wait(1);
        adminDashBoardPage.adminPasswordSubmitButtonElement.click();

        String expectedResult="Password changed successfully.";
        String actualResult=adminDashBoardPage.adminPasswordUpdatedElement.getText();
        Assert.assertEquals(expectedResult,actualResult);

    }

    @When("Click on the logout link")
    public void clickOnTheLogoutLink() {
        adminDashBoardPage.adminIconLogoutElement.click();
    }

    @When("It is verified that the admin page is exited")
    public void itIsVerifiedThatTheAdminPageIsExited() {
        adminDashBoardPage.adminLogoutConfirmElement.isDisplayed();

    }
}
