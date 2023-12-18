package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.ConfigReader;
import utilities.Driver;

public class US45_Suphi {

    @Given("The visitor enters the site with the given {string}")
    public void the_visitor_enters_the_site_with_the_given(String UrlAdmin) {
        Driver.getDriver().get(ConfigReader.getProperty(UrlAdmin));
    }
    @Given("Launch browser")
    public void launch_browser() {

    }

    @Given("The admin logs in to the admin dashboard page with admin name and admin password")
    public void the_admin_logs_in_to_the_admin_dashboard_page_with_admin_name_and_admin_password() {

    }
    @Given("Click on the Manage Users link")
    public void click_on_the_manage_users_link() {

    }
    @Given("Click on Active Users link under Manage Users link and go to Active Users page")
    public void click_on_active_users_link_under_manage_users_link_and_go_to_active_users_page() {

    }
    @Given("Close the page")
    public void close_the_page() {
        Driver.closeDriver();
    }

    @When("User, Email-Phone, Country, Joined At, Balance, Action information of Active Users are displayed")
    public void userEmailPhoneCountryJoinedAtBalanceActionInformationOfActiveUsersAreDisplayed() {
        
    }

    @When("Click on the Details link under the Action information of an Active User")
    public void clickOnTheDetailsLinkUnderTheActionInformationOfAnActiveUser() {
        
    }

    @When("Go to User Details page")
    public void goToUserDetailsPage() {
        
    }

    @When("The name and surname information under the heading Information of is reorganized and saved")
    public void theNameAndSurnameInformationUnderTheHeadingInformationOfIsReorganizedAndSaved() {
        
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
