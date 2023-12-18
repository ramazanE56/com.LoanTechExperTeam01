package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import pages.DashBoardPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.Driver;

import java.util.Arrays;
import java.util.List;
import java.util.Set;

public class US17_Omer {

    HomePage homePage = new HomePage();
    DashBoardPage dashBoardPage = new DashBoardPage();
    LoginPage loginPage = new LoginPage();

    @Given("Verify that the withdraw button is visible and active")
    public void verify_that_the_withdraw_button_is_visible_and_active() {

        System.out.println(dashBoardPage.withdrawButton.getText());
        Assert.assertTrue(dashBoardPage.withdrawButton.isDisplayed());
        Assert.assertTrue(dashBoardPage.withdrawButton.isEnabled());

    }
    @Given("Click the withdraw button")
    public void click_the_withdraw_button() {

        dashBoardPage.withdrawButton.click();

    }
    @Given("Verify the Withdraw Money text is visible on page")
    public void verify_the_withdraw_money_text_is_visible_on_page() {

        System.out.println(dashBoardPage.withdrawMoneyText.getText());
        Assert.assertTrue(dashBoardPage.withdrawMoneyText.isDisplayed());

    }
    @Given("Verify that the Method Text is visible on page")
    public void verify_that_the_method_text_is_visible_on_page() {

        Assert.assertTrue(dashBoardPage.methodText.isDisplayed());
    }
    @Given("Verify that the all option is visible")
    public void verify_that_the_all_option_is_visible() {

        WebElement testDropDown = Driver.getDriver().findElement(By.xpath("//*[@name='method_code']"));
        Select dropdown = new Select(testDropDown);
        List<WebElement> f = dropdown.getOptions();
        System.out.println(f.toArray().length);
        System.out.println("The dropdown options are:");
        for(WebElement options: f)
            System.out.println(options.getText());
        dashBoardPage.dropDownSelector.click();

        Assert.assertTrue(f.contains("Method 5 Updated"));

    }
}
