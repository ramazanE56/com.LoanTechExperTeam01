package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

import org.junit.Assert;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import static org.junit.Assert.assertTrue;

public class US28_Samet {
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();
    AdminLoginPage adminLoginPage = new AdminLoginPage();

    @Given("On the page that appears click the Loans Menu tab")
    public void on_the_page_that_appears_click_the_loans_menu_tab() {
        adminDashBoardPage.Loanstab.click();
    }


    @Given("Verify that Due Loans page should be displayed")
    public void verify_that_due_loans_page_should_be_displayed() {
      adminDashBoardPage.DueLoansPageYaziElementi.isDisplayed();
    }

    @When("Click on the Due Loans page link")
    public void click_on_the_page_link() {
        adminDashBoardPage.DueLoanstab.click();

    }

    @When("Verify that {string} page is accessible")
    public void verify_that_page_is_accessible(String string) {
        assertTrue(adminDashBoardPage.DueLoansPageYaziElementi.isDisplayed());
        ReusableMethods.wait(2);
    }


    @And("Verify that Due Loans Table is displayed successfully")
    public void verifyThatDueLoansTableIsDisplayedSuccessfully() {
        assertTrue(adminDashBoardPage.DueLoansTabloElementi.isDisplayed());
    }


}