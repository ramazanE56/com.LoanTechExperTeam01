package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US45_Suphi {


    AdminLoginPage adminLoginPage = new AdminLoginPage();
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();


    @Given("Click on the Manage Users link")
    public void click_on_the_manage_users_link() {
        adminDashBoardPage.manageUserLinkElement.click();

    }

    @Given("Click on Active Users link under Manage Users link and go to Active Users page")
    public void click_on_active_users_link_under_manage_users_link_and_go_to_active_users_page() {
        adminDashBoardPage.activeUserLinkElement.click();
    }

    @When("User, Email-Phone, Country, Joined At, Balance, Action information of Active Users are displayed")
    public void userEmailPhoneCountryJoinedAtBalanceActionInformationOfActiveUsersAreDisplayed() {

    }

    @When("Click on the Details link under the Action information of an Active User")
    public void clickOnTheDetailsLinkUnderTheActionInformationOfAnActiveUser() {
        adminDashBoardPage.searchBoxElement.click();
        adminDashBoardPage.searchBoxElement.sendKeys("suphi");
        ReusableMethods.wait(1);
        adminDashBoardPage.searchButtonElement.click();
        ReusableMethods.wait(1);
        adminDashBoardPage.detailsButtonElement.click();

    }

    @When("Go to User Details page")
    public void goToUserDetailsPage() {
        adminDashBoardPage.detailsButtonElement.click();

    }

    @When("The name and surname information under the heading Information of is reorganized and saved")
    public void theNameAndSurnameInformationUnderTheHeadingInformationOfIsReorganizedAndSaved() {
        adminDashBoardPage.informationFirstnameBoxElement.clear();
        adminDashBoardPage.informationFirstnameBoxElement.sendKeys("suphi atilim");

        adminDashBoardPage.informationLastnameBoxElement.clear();
        adminDashBoardPage.informationLastnameBoxElement.sendKeys("celikoz");

        adminDashBoardPage.informationSubmitButtonElement.click();

        adminDashBoardPage.informationUpdatedConfirmElement.isDisplayed();

    }

    @When("The email address under the Information of heading is rearranged and saved in the correct format \\(there must be an {string} sign in the email address)")
    public void theEmailAddressUnderTheInformationOfHeadingIsRearrangedAndSavedInTheCorrectFormatThereMustBeAnSignInTheEmailAddress(String arg0) {

    }

    @When("City information under the Information of heading is reorganized and saved")
    public void cityInformationUnderTheInformationOfHeadingIsReorganizedAndSaved() {

    }

    @When("The State information under the Information of heading is reorganized and saved")
    public void theStateInformationUnderTheInformationOfHeadingIsReorganizedAndSaved() {

    }

    @When("Zip code information under the Information of heading is rearranged and saved")
    public void zipCodeInformationUnderTheInformationOfHeadingIsRearrangedAndSaved() {

    }

    @When("The information under the Information of heading is rearranged and saved by clicking Submit button")
    public void theInformationUnderTheInformationOfHeadingIsRearrangedAndSavedByClickingSubmitButton() {

    }

    @When("Changes are confirmed by the {string} notification in the upper right corner of the page")
    public void changesAreConfirmedByTheNotificationInTheUpperRightCornerOfThePage(String arg0) {

    }

    @When("An attempt is made to enter missing - incorrect address information to the e-mail address")
    public void anAttemptIsMadeToEnterMissingIncorrectAddressInformationToTheEMailAddress() {

    }

    @When("{string}The {string} is missing in the {string} address.' incorrect input notification is displayed")
    public void pleaseAddAnSignToTheEmailAddressTheIsMissingInTheAddressIncorrectInputNotificationIsDisplayed(String arg0, String arg1, String arg2) {

    }


}
