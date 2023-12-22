package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US53_Yetis {

    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    AdminLoginPage adminLoginPage = new AdminLoginPage();
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();

    @Given("Click on the deposits")
    public void click_on_the_deposits() {

        adminDashBoardPage.depozitsElement.click();
    }
    @Given("Click  on the Successful Deposits")
    public void click_on_the_successful_deposits() {
        ;adminDashBoardPage.SuccessfulDepozitsElement.click();
    }
    @Given("verifies that you are on the page where the deposit was successful")
    public void verifies_that_you_are_on_the_page_where_the_deposit_was_successful() {
        Assert.assertTrue(adminDashBoardPage.succesfullDepozitTitle.isDisplayed());
    }

    @Given("Verifies that lists and titles are visible")
    public void verifies_that_lists_and_titles_are_visible() {
        List<WebElement> succesfullDepozitTitles= adminDashBoardPage.succesfullDepozitTitles;

        for (WebElement each :succesfullDepozitTitles
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);

    }
    @Given("Verify that the Details button is visible and active")
    public void verify_that_the_details_button_is_visible_and_active() {

         Assert.assertTrue(adminDashBoardPage.sucDetailsElement.isDisplayed());
         Assert.assertTrue(adminDashBoardPage.sucDetailsElement.isEnabled());
    }


    @Given("Information should be displayed on the detail page of the withdrawal transaction selected from the list.")
    public void information_should_be_displayed_on_the_detail_page_of_the_withdrawal_transaction_selected_from_the_list() {


        List<WebElement> depozitInformationElement= adminDashBoardPage.depozitInformationElement;

        for (WebElement each :depozitInformationElement
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);

    }

    @Given("Click on the succesfulldetails")
    public void click_on_the_succesfulldetails() {
        adminDashBoardPage.sucDetailsElement.click();
    }

}
