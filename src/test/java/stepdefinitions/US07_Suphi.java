package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ResourceBundle;

public class US07_Suphi {

    LoginPage loginPage = new LoginPage();
    HomePage homePage= new HomePage();

    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
    @Given("Click on the Plans link in the menu header")
    public void click_on_the_plans_link_in_the_menu_header() {
        ReusableMethods.wait(2);
        homePage.cocies.click();


        ReusableMethods.wait(2);
        homePage.plansLinkElement.click();

    }
    @Given("When going to the Plans link, it is verified that the Loan Plans page is accessed")
    public void when_going_to_the_plans_link_it_is_verified_that_the_loan_plans_page_is_accessed() {
        ReusableMethods.wait(2);
        String expectedUrl ="https://qa.loantechexper.com/loan";
        String actualUrl="https://qa.loantechexper.com/loan";
        Assert.assertEquals(expectedUrl,actualUrl);
    }

    @When("Go to the end of the homepage")
    public void goToTheEndOfTheHomepage() {

        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
    }

    @When("Click on the Loan Plans link under the Important Link heading and confirm that you are on the Loan Plans page")
    public void clickOnTheLoanPlansLinkUnderTheImportantLinkHeadingAndConfirmThatYouAreOnTheLoanPlansPage() {

        ReusableMethods.wait(2);
        homePage.importantLinkLoanPlansElement.click();
    }

    @When("Select Basic Loan and see Loan Plan Cards under the Basic Loan heading")
    public void selectBasicLoanAndSeeLoanPlanCardsUnderTheBasicLoanHeading() {
        ReusableMethods.wait(2);
        homePage.basicLoanTitleElement.click();

    }

    @When("Click on the Apply Now button under one of the plans and verify that it works")
    public void clickOnTheApplyNowButtonUnderOneOfThePlansAndVerifyThatItWorks() {
        ReusableMethods.wait(1);
        ReusableMethods.clickWithJS(homePage.basicLoan1ApplyNowElement);
        ReusableMethods.wait(1);
        String expectedAlert="You are not logged in!";
        String actualAlert=homePage.applyNowWorks.getText();
        Assert.assertEquals(expectedAlert,actualAlert);
    }

    @When("On the Loan Plans page, click on the Home link from the Home - Loan Plans options and go to the Home page")
    public void onTheLoanPlansPageClickOnTheHomeLinkFromTheHomeLoanPlansOptionsAndGoToTheHomePage() {
        ReusableMethods.wait(1);
        homePage.loanPlansPageHomeLinkElement.click();
        ReusableMethods.wait(2);
        String expectedUrl ="https://qa.loantechexper.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
}

