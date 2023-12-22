package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class US56_Yetis {


    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    AdminLoginPage adminLoginPage = new AdminLoginPage();
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();


    @Given("It must be verified that the admin deposit page has been accessed.")
    public void it_must_be_verified_that_the_admin_deposit_page_has_been_accessed() {

        String expectedUrl = "deposit";
        String actualUrl=Driver.getDriver().getCurrentUrl();
       Assert.assertTrue(actualUrl.contains(expectedUrl));


    }

        @Given("Click o the all Loans")
        public void click_o_the_all_loans() {
        Actions actions=new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        jse.executeScript("arguments[0].click();", adminDashBoardPage.allLoanslink);

    }


    @Given("Start Date and End Date boxes are must be visible and active")
    public void start_date_and_end_date_boxes_are_must_be_visible_and_active() {

        Assert.assertTrue(adminDashBoardPage.allLoansSearchBox.isDisplayed());
        Assert.assertTrue(adminDashBoardPage.allLoansStartEndDateBox.isEnabled());


    }

    @Given("Successful Deposit, Pending Deposit, Rejected Deposit, Initiated Deposit  summary boxes must be visible and active")
    public void successful_deposit_pending_deposit_rejected_deposit_initiated_deposit_summary_boxes_must_be_visible_and_active() {
      adminDashBoardPage.succesfulDepozitElement.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
      adminDashBoardPage.pendingDepozitElement.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
      adminDashBoardPage.rejectedDepozitElement.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
      adminDashBoardPage.initiatedDepozitElement.click();
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(1);
    }
    @Given("When clicked, it should direct you to the relevant page and list.")
    public void when_clicked_it_should_direct_you_to_the_relevant_page_and_list() {

        adminDashBoardPage.succesfulDepozitElement.click();
        String expectedUrl="successful";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));
        Driver.getDriver().navigate().back();

        adminDashBoardPage.pendingDepozitElement.click();
        String expectedUrl1="pending";
        String actualUrl1=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl1.contains(expectedUrl1));
        Driver.getDriver().navigate().back();

        adminDashBoardPage.rejectedDepozitElement.click();
        String expectedUrl2="https://qa.loantechexper.com/admin/deposit/rejected";
        String actualUrl2=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl2.contains(expectedUrl2));
        Driver.getDriver().navigate().back();

        adminDashBoardPage.initiatedDepozitElement.click();
        String expectedUrl3="initiated";
        String actualUrl3=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl3.contains(expectedUrl3));
        Driver.getDriver().navigate().back();
        ReusableMethods.wait(2);


    }

    @Given("Verify that the deposit history list and titles are visible")
    public void verify_that_the_deposit_history_list_and_titles_are_visible() {

        List<WebElement> depozitHistoryTbody= adminDashBoardPage.depozitHistoryTbody;

        for (WebElement each :depozitHistoryTbody
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);
    }

    @Given("The Details button should be visible and active.")
    public void the_details_button_should_be_visible_and_active() {
        Assert.assertTrue(adminDashBoardPage.statusPendikDetails.isDisplayed());
    }
    @Given("Click on the allloans pending details")
    public void click_on_the_allloans_pending_details() {

        jse.executeScript("arguments[0].click();", adminDashBoardPage.statusPendikDetails);

        ReusableMethods.wait(2);
    }

    @Given("Click on the approve")
    public void click_on_the_approve() {


        adminDashBoardPage.approveElement.click();
    }
    @Given("Click on the Yes")
    public void click_on_the_yes() {
     //   Driver.getDriver().switchTo().alert();
       adminDashBoardPage.yeselement.click();
    }
    @Given("Verify that the print alert message is displayed")
    public void verify_that_the_print_alert_message_is_displayed() {
        Assert.assertTrue(adminDashBoardPage.succesfullWarmElement.isDisplayed());
    }
    @Given("Click on the approve details")
    public void click_on_the_approve_details() {
        adminDashBoardPage.statusapproveDetails.click();
    }

    @Given("It must be verified that deposit detail titles and content can be viewed.")
    public void it_must_be_verified_that_deposit_detail_titles_and_content_can_be_viewed() {



        List<WebElement> detayTitleElement= adminDashBoardPage.detayTitleElement;

        for (WebElement each :detayTitleElement
        ) {
            System.out.println(each.getText());
        }
        ReusableMethods.wait(2);
    }



}







