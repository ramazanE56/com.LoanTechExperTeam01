package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AdminDashBoardPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US58_Omer {

    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();

    @Given("Verify that the Withdrawals menu is accessible under the admin panel")
    public void verify_that_the_withdrawals_menu_is_accessible_under_the_admin_panel() {

        Assert.assertTrue(adminDashBoardPage.withdrawalsButton.isDisplayed());
        Assert.assertTrue(adminDashBoardPage.withdrawalsButton.isEnabled());
        ReusableMethods.wait(3);

    }

    @Given("Click the Withdrawals menu")
    public void click_the_withdrawals_menu() {

        adminDashBoardPage.withdrawalsButton.click();
        System.out.println(adminDashBoardPage.withdrawalsButton.getText());
        ReusableMethods.wait(3);
        adminDashBoardPage.withdrawalMethods.click();
       // adminDashBoardPage.withdrawalMethodsButton.click();

    }

    @Given("Verify that the Withdrawal Methods menu is visible and active")
    public void verify_that_the_withdrawal_methods_menu_is_visible_and_active() {

        Assert.assertTrue(adminDashBoardPage.withdrawalMethodsButton.isDisplayed());
        Assert.assertTrue(adminDashBoardPage.withdrawalMethodsButton.isEnabled());
        System.out.println(adminDashBoardPage.withdrawalMethodsButton.getText());
        ReusableMethods.wait(2);

    }

    @Given("Verify that the method-currency-charge-withdrawlimit-status-action information is visible")
    public void verify_that_the_method_currency_charge_withdrawlimit_status_action_information_is_visible() {

        Assert.assertTrue(adminDashBoardPage.withdrawalMethodsMethod.isDisplayed());
        Assert.assertTrue(adminDashBoardPage.withdrawalMethodsCurrencyText.isDisplayed());
        Assert.assertTrue(adminDashBoardPage.withdrawalMethodsCharge.isDisplayed());
        Assert.assertTrue(adminDashBoardPage.withdrawalMethodsWithdrawLimit.isDisplayed());
        Assert.assertTrue(adminDashBoardPage.withdrawalMethodsStatus.isDisplayed());
        Assert.assertTrue(adminDashBoardPage.withdrawalMethodsActions.isDisplayed());
        List<WebElement> raw = Driver.getDriver().findElements(By.xpath("//table[@class='table table--light style--two custom-data-table']"));
        System.out.println("raw number:"+raw.size());


    }

    @Given("Verify that the edit page is accessed under the Action heading.")
    public void verify_that_the_edit_page_is_accessed_under_the_action_heading() {

        Assert.assertTrue(adminDashBoardPage.editButton.isDisplayed());
        Assert.assertTrue(adminDashBoardPage.editButton.isEnabled());

    }

    @Given("Verify that edit the method selected in the Withdrawal Methods Table")
    public void verify_that_edit_the_method_selected_in_the_withdrawal_methods_table() {



    }

    @Given("Take the information in first raw on page")
    public void take_the_information_in_first_raw_on_page() {


    }

    @Given("Click the edit button on withdrawal method section")
    public void click_the_edit_button_on_withdrawal_method_section() {

    }

    @Given("Change the all information on edit page")
    public void change_the_all_information_on_edit_page() {

    }

    @Given("Click the submit button on withdrawal methods menu")
    public void click_the_submit_button_on_withdrawal_methods_menu() {

    }

    @Given("Verify that all information is change with updated data")
    public void verify_that_all_information_is_change_with_updated_data() {

    }

    @Given("Click the enable-disable button on first raw")
    public void click_the_enable_disable_button_on_first_raw() {

    }

    @Given("Click the confirmation alert on page")
    public void click_the_confirmation_alert_on_page() {

    }

    @Given("Verify that status is changed")
    public void verify_that_status_is_changed() {

    }

    @Given("Verify that add new button is visible and accessible")
    public void verify_that_add_new_button_is_visible_and_accessible() {

    }

    @Given("Click on the Add New button")
    public void click_on_the_add_new_button() {

    }

    @Given("Fill the all information on page")
    public void fill_the_all_information_on_page() {

    }

    @Given("Click the submit button on new page")
    public void click_the_submit_button_on_new_page() {

    }

    @Given("Verify that new user is added in table")
    public void verify_that_new_user_is_added_in_table() {

    }

}
