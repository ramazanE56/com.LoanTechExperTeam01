package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import pages.AdminDashBoardPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US52_Umit {

    AdminDashBoardPage adminDashBoardPage=new AdminDashBoardPage();

    @Given("Display the Deposits item in the Dashboard menu and click on it")
    public void display_the_deposits_item_in_the_dashboard_menu_and_click_on_it() {
        adminDashBoardPage.depositsButton.click();
    }
    @Given("Click on Approved Deposits button")
    public void click_on_approved_deposits_button() {
        adminDashBoardPage.approvedDepositsButton.click();
    }
    @Given("Displays and verifies the title")
    public void Displays_and_verifies_the_title() {
        String expectedUrl="https://qa.loantechexper.com/admin/deposit/approved";
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);
    }
    @Given("Admin confirms that the Approved Deposit list displays page titles")
    public void admin_confirms_that_the_approved_deposit_list_displays_page_titles() {
        List<WebElement> approvedDepositHeader = adminDashBoardPage.approvedDepositsHeader;
        for (WebElement each : approvedDepositHeader
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);
    }

    @Given("Admin displays and clicks the Details button below the Action titles")
    public void admin_displays_and_clicks_the_details_button_below_the_action_titles() {
        adminDashBoardPage.approvedDepositsDetailsButton.click();
    }
    @Given("Verify that the Admin is on the Deposit Details page")
    public void verify_that_the_admin_is_on_the_deposit_details_page() {
        adminDashBoardPage.depositViaManualCardText.isDisplayed();
    }
    @Given("Admin Displays details on the detail page of the withdrawal selected from the list")
    public void admin_displays_details_on_the_detail_page_of_the_withdrawal_selected_from_the_list() {
        List<WebElement> viaManuelCardDetails = adminDashBoardPage.depositViaManualCard;
        for (WebElement each : viaManuelCardDetails
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);
    }


}
