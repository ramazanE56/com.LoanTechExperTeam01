package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.AdminDashBoardPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.util.List;

public class US46_Umit {

    AdminDashBoardPage adminDashBoardPage=new AdminDashBoardPage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();

    @Given("Click on the Withdrawals link")
    public void click_on_the_withdrawals_link() {
        adminDashBoardPage.withdrawalDropMenu.click();
        ReusableMethods.wait(1);

    }
    @Given("Click on Withdrawal Methods link under Withdrawals link and go to Withdrawal Methods page")
    public void click_on_withdrawal_methods_link_under_withdrawals_link_and_go_to_withdrawal_methods_page() {
        adminDashBoardPage.withdrawalMethods.click();
        adminDashBoardPage.withdrawalMethodsText.isDisplayed();

        List<WebElement> withDrawHeader = adminDashBoardPage.withdrawalMethodsList;
        for (WebElement each : withDrawHeader
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);
    }


    @Given("Click on the Add New button on the page that opens")
    public void click_on_the_add_new_button_on_the_page_that_opens()  {
        adminDashBoardPage.addButton.click();

    }

    @Given("Click submit button after information entry")
    public void click_submit_button_after_information_entry() throws AWTException {
        adminDashBoardPage.withdrawalMethodsName.sendKeys("AABC101");
        adminDashBoardPage.withdrawalMethodsCurrency.sendKeys("1000");
        adminDashBoardPage.withdrawalMethodsRate.sendKeys("1");
        adminDashBoardPage.withdrawalMethodsMinLimit.sendKeys("10000");
        adminDashBoardPage.withdrawalMethodsMaxLimit.sendKeys("50000");
        adminDashBoardPage.withdrawalMethodsFixedCharge.sendKeys("500");
        adminDashBoardPage.withdrawalMethodsPercentCharge.sendKeys("10");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ReusableMethods.wait(2);
        ReusableMethods.coordinateClick(822, 664);

    }
    @Given("Type the method name added in the search box")
    public void type_the_method_name_added_in_the_search_box() {
        adminDashBoardPage.withdrawalMethodsSearchBox.sendKeys("AABC101"+ Keys.ENTER);
    }
    @Given("Verify that the new method added on the opened page is displayed in the list")
    public void verify_that_the_new_method_added_on_the_opened_page_is_displayed_in_the_list() {
        String exceptedMethodName="AABC101";
        String actualMethodName=adminDashBoardPage.withdrawalMethodsFirstColumn.getText();
        Assert.assertEquals(exceptedMethodName,actualMethodName);

    }
    @Given("Admin click the edit button to update the new method added")
    public void admin_click_the_edit_button_to_update_the_new_method_added() {
        adminDashBoardPage.withdrawalMethodsSearchBox.sendKeys("AABC101"+ Keys.ENTER);
        adminDashBoardPage.withdrawalMethodsEditButton.click();


    }
    @Given("Admin enters the value for the update and clicks submit")
    public void admin_enters_the_value_for_the_update_and_clicks_submit() throws AWTException {
        adminDashBoardPage.withdrawalMethodsMaxLimit.clear();
        adminDashBoardPage.withdrawalMethodsMaxLimit.sendKeys("100000");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ReusableMethods.wait(2);
        ReusableMethods.coordinateClick(822, 664);

    }
    @Given("Verifies that the Withdraw method uptaded succesfully warning text is displayed")
    public void verifies_that_the_withdraw_method_uptaded_succesfully_warning_text_is_displayed() {
        ReusableMethods.wait(3);
        adminDashBoardPage.successfullyMessage.isDisplayed();

    }
    @Given("Admin clicks the disable button to disable the new added method")
    public void admin_clicks_the_disable_button_to_disable_the_new_added_method() {
        adminDashBoardPage.withdrawalMethodsSearchBox.sendKeys("AABC101"+ Keys.ENTER);
        adminDashBoardPage.withdrawalMethodsDisableButton.click();
    }
    @Given("Admin confirms method disable")
    public void admin_confirms_method_disable() {
      adminDashBoardPage.withdrawalMethodsDisableYesButton.click();
    }
    @Given("Admin method verifies that it is disabled")
    public void admin_method_verifies_that_it_is_disabled() {
        ReusableMethods.wait(2);
        adminDashBoardPage.statusChangedMessage.isDisplayed();

    }


    @Given("Admin After entering the information except the method name, clicks the submit button")
    public void admin_after_entering_the_information_except_the_method_name_clicks_the_submit_button() throws AWTException {
        adminDashBoardPage.withdrawalMethodsCurrency.sendKeys("1000");
        adminDashBoardPage.withdrawalMethodsRate.sendKeys("1");
        adminDashBoardPage.withdrawalMethodsMinLimit.sendKeys("10000");
        adminDashBoardPage.withdrawalMethodsMaxLimit.sendKeys("50000");
        adminDashBoardPage.withdrawalMethodsFixedCharge.sendKeys("500");
        adminDashBoardPage.withdrawalMethodsPercentCharge.sendKeys("10");
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        ReusableMethods.wait(2);
        ReusableMethods.coordinateClick(822, 664);

    }
    @Given("Confirms that it is still on the New Withdrawal Method page due to missing information")
    public void confirms_that_it_is_still_on_the_new_withdrawal_method_page_due_to_missing_information() {
       adminDashBoardPage.updateWithdrawalMethodText.isDisplayed();
    }

    @Given("Admin confirms that the added, edited, disabled method is displayed")
    public void admin_confirms_that_the_added_edited_disabled_method_is_displayed() {
        List<WebElement> withDrawTable = adminDashBoardPage.withDrawTable;
        for (WebElement each : withDrawTable
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);
    }


}
