package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US01_Ismail {

    HomePage homePage = new HomePage();

    @Then("Verifies that the visitor has accessed the site")
    public void verifies_that_the_visitor_has_accessed_the_site() {
        String expectedUrl ="https://qa.loantechexper.com/";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }
    @Given("Verifies that the homepage is visible")
    public void verifies_that_the_homepage_is_visible() {
        Assert.assertTrue(homePage.loanTechLogoElement.isDisplayed());
    }
    @Then("Close the page")
    public void Close_the_page() {
        Driver.closeDriver();
    }
}
