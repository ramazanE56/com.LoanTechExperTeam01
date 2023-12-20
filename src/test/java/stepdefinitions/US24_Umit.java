package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.DashBoardPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US24_Umit {
    HomePage homePage=new HomePage();
    DashBoardPage dashBoardPage=new DashBoardPage();
    LoginPage loginPage=new LoginPage();

    @Given("As user enters the site with the given {string}")
    public void as_user_enters_the_site_with_the_given(String Url) {

        Driver.getDriver().get(ConfigReader.getProperty(Url));
        ReusableMethods.wait(2);
    }
    @Given("Click the Login button and goto the user login page")
    public void click_the_login_button_and_go_to_the_user_login_page() {
        ReusableMethods.clickWithJS(homePage.loginButtonElement);
    }
    @Given("The user logs into the user dashboard page with {string} and {string}")
    public void the_user_logs_in_to_the_user_dashboard_page_with_user_name_and_user_password(String userNameUmit, String password) {

        ReusableMethods.wait(2);
        homePage.cocies.click();
        ReusableMethods.wait(1);
        ReusableMethods.clickWithJS(loginPage.userNameElement);
        loginPage.userNameElement.clear();
        loginPage.userNameElement.sendKeys(ConfigReader.getProperty(userNameUmit));
        ReusableMethods.clickWithJS(loginPage.passwordElement);
        loginPage.passwordElement.clear();
        loginPage.passwordElement.sendKeys(ConfigReader.getProperty(password));

        ReusableMethods.clickWithJS(loginPage.userLoginButtonElement);
    }

    @Given("It is verified that  details appear on the home page")
    public void It_is_verified_that_details_appear_on_the_home_page() {
        dashBoardPage.successfulDepositsYText.isDisplayed();
        dashBoardPage.successfulDepositsAmount.isDisplayed();
        dashBoardPage.successfulWithdrawalsText.isDisplayed();
        dashBoardPage.successfulWithdrawalsAmount.isDisplayed();
        dashBoardPage.totalLoanText.isDisplayed();
        dashBoardPage.totalLoanAmount.isDisplayed();
        dashBoardPage.totalLoanNumber.isDisplayed();

    }

    @Then("Close page")
    public void Close_the_page() {
        ReusableMethods.wait(1);
        Driver.closeDriver();
    }

}
