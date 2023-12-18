package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US07_Suphi {

    LoginPage loginPage = new LoginPage();
    @Given("The visitor enters the site with the given {string}")
    public void the_visitor_enters_the_site_with_the_given(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));
    }
    @Given("Launch browser")
    public void launch_browser() {

    }
    @Given("Click on the Plans link in the menu header")
    public void click_on_the_plans_link_in_the_menu_header() {

    }
    @Given("When going to the Plans link, it is verified that the Loan Plans page is accessed")
    public void when_going_to_the_plans_link_it_is_verified_that_the_loan_plans_page_is_accessed() {

    }
    @Given("Close the page")
    public void close_the_page() {
        Driver.closeDriver();

    }

    @When("Go to the end of the homepage")
    public void goToTheEndOfTheHomepage() {

    }

    @When("Click on the Loan Plans link under the Important Link heading and confirm that you are on the Loan Plans page")
    public void clickOnTheLoanPlansLinkUnderTheImportantLinkHeadingAndConfirmThatYouAreOnTheLoanPlansPage() {

    }

    @When("Select Basic Loan and see Loan Plan Cards under the Basic Loan heading")
    public void selectBasicLoanAndSeeLoanPlanCardsUnderTheBasicLoanHeading() {

    }

    @When("Click on the Apply Now button under one of the plans and verify that it works")
    public void clickOnTheApplyNowButtonUnderOneOfThePlansAndVerifyThatItWorks() {

    }

    @When("On the Loan Plans page, click on the Home link from the Home - Loan Plans options and go to the Home page")
    public void onTheLoanPlansPageClickOnTheHomeLinkFromTheHomeLoanPlansOptionsAndGoToTheHomePage() {

        String expectedUrl ="https://qa.loantechexper.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}
