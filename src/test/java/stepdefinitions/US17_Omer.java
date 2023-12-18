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
import utilities.ReusableMethods;

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
    @Given("Select the Method5 Updated on Method Dropdown menu")
    public void select_the_method5_updated_on_method_dropdown_menu() {

        WebElement testDropDown = Driver.getDriver().findElement(By.xpath("//*[@name='method_code']"));
        Select dropdown = new Select(testDropDown);
        ReusableMethods.wait(2);
        dropdown.selectByValue("9");
        ReusableMethods.wait(2);


    }
    @Given("Write the {int} USD On Amount textbox,")
    public void write_the_usd_on_amount_textbox(int num) {

        ReusableMethods.wait(2);
        dashBoardPage.amountTextBox.sendKeys("350");
        ReusableMethods.wait(2);

    }
    @Given("Verify that after the amount value limit text will be visible")
    public void verify_that_after_the_amount_value_limit_text_will_be_visible() {

        ReusableMethods.wait(2);
        Assert.assertTrue(dashBoardPage.limitTable.isDisplayed());
        List<WebElement> t = Driver.getDriver().findElements(By.xpath("//ul[@class='list-group text-center']"));
        for(WebElement optionss: t)
            System.out.println(optionss.getText());

    }
    @Given("Click the Submit button on withdraw section")
    public void click_the_submit_button_on_withdraw_section() {

        dashBoardPage.withdrawSubmitButton.submit();

    }
    @Given("Verify that Withdraw Via Method5 Updated section is displayed")
    public void verify_that_withdraw_via_method5_updated_section_is_displayed() {

        Assert.assertTrue(dashBoardPage.method5UpdatedText.isDisplayed());
        System.out.println(dashBoardPage.method5UpdatedText.getText());
    }
}
