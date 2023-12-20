package stepdefinitions;

import io.cucumber.java.en.Given;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;

import utilities.ConfigReader;
import utilities.Driver;

public class US30_MehmetK {
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();
    AdminLoginPage adminLoginPage=new AdminLoginPage();
    Actions actions = new Actions(Driver.getDriver());

    @Given("Navigate to Admin page {string}")
    public void Navigate_to_Admin_page(String adminUrl) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(adminUrl));
        Thread.sleep(1000);

    }
    @Given("send {string} to username textbox")
    public void send_to_username_textbox(String usernameAdmin) {
        adminLoginPage.adminUserNameBox.sendKeys("mehmetkahraman");
        
    }
    @Given("send {string} to password textbox")
    public void send_password_registered_to_password_textbox(String password) {
        adminLoginPage.adminPasswordBox.sendKeys("123123123");
        
    }
    @Given("click on the login button")
    public void click_on_the_login_button() throws InterruptedException {
        adminLoginPage.adminLoginButton.click();
        Thread.sleep(1000);


    }
    @Given("click Loans link element")
    public void click_loans_link_element() throws InterruptedException {
        adminDashBoardPage.loansLink.click();
        Thread.sleep(2000);

    }
    @Given("click All Loans link element")
    public void click_all_loans_link_element() throws InterruptedException {
        adminDashBoardPage.allLoans.click();
        Thread.sleep(1000);

    }
    @Given("verify that All Loans Table visible")
    public void verify_that_all_loans_table_visible() throws InterruptedException {
        //System.out.println(adminDashBoardPage.allLoansTable.getText());
        Assert.assertTrue(adminDashBoardPage.allLoansTable.isDisplayed());

    }
    @Given("send the first Loans {string} to LoanNo searchbox")
    public void send_the_first_loans_to_loanNo_searchbox(String loansNumber) throws InterruptedException {


        adminDashBoardPage.searchBoxElement.click();
        adminDashBoardPage.searchBoxElement.sendKeys("CNVXHSRN2OXP");
        Thread.sleep(1000);

    }
    @Given("click searchbox icon")
    public void click_searchbox_icon() throws InterruptedException {
        adminDashBoardPage.searchButtonElement.click();
        Thread.sleep(2000);

    }
    @Given("verify the first loans visible")
    public void verify_the_first_loans_visible() {
        String actualLoanNumber=adminDashBoardPage.firstLoan.getText();
        String expectedLoanNumber ="CNVXHSRN2OXP";
        Assert.assertEquals(expectedLoanNumber,actualLoanNumber);


    }
    @Given("click Date textbox")
    public void click_date_textbox() throws InterruptedException {
        adminDashBoardPage.allLoans.click();
        Thread.sleep(2000);
        adminDashBoardPage.dateSearch.click();

    }
    @Given("send {string} to Date textbox")
    public void send_to_date_textbox(String date) {
        adminDashBoardPage.dateSearch.sendKeys("20.12.2023");


    }
    @Given("click Date searchbox icon")
    public void click_date_searchbox_icon() {
        adminDashBoardPage.dateSearchButton.click();

    }
    @Given("Verify that you can search the AllLoans table on the AllLoans page with the Date information.")
    public void verify_that_you_can_search_the_all_loans_table_on_the_all_loans_page_with_the_date_information() {
        String expectedUrl ="https://qa.loantechexper.com/admin/loan/all?search=&date=20.12.2023";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);




    }
    @Given("On the All loans page click the details button on the first line")
    public void on_the_all_loans_page_click_the_details_button_on_the_first_line() {
        adminDashBoardPage.detailsButtonElement.click();

    }
    @Given("verify that plan name visible on the Loan Details page")
    public void verify_that_plan_name_visible_on_the_loan_details_page() {
        Assert.assertTrue(adminDashBoardPage.planName.isDisplayed());
        System.out.println("Plan Name: " + adminDashBoardPage.planName.getText());


    }
    @Given("verify that date of Application visible on the Loan Details page")
    public void verify_that_date_of_application_visible_on_the_loan_details_page() {
        System.out.println("date of Application: " + adminDashBoardPage.dateOfApplication.getText());
        Assert.assertTrue(adminDashBoardPage.dateOfApplication.isDisplayed());


    }
    @Given("verify that Loan Number visible on the Loan Details page")
    public void verify_that_loan_number_visible_on_the_loan_details_page() {
        System.out.println("Loan Number: " + adminDashBoardPage.loanNumber.getText());
        Assert.assertTrue(adminDashBoardPage.loanNumber.isDisplayed());

    }
    @Given("verify that Amount visible on the Loan Details page")
    public void verify_that_amount_visible_on_the_loan_details_page() {
        System.out.println("Amount: " + adminDashBoardPage.Amount.getText());
        Assert.assertTrue(adminDashBoardPage.Amount.isDisplayed());

    }
    @Given("verify that Per İnstallment visible on the Loan Details page")
    public void verify_that_per_i̇nstallment_visible_on_the_loan_details_page() {
        System.out.println("Per Installment: " + adminDashBoardPage.perInstallmen.getText());
        Assert.assertTrue(adminDashBoardPage.perInstallmen.isDisplayed());

    }
    @Given("verify that Total installment visible on the Loan Details page")
    public void verify_that_total_installment_visible_on_the_loan_details_page() {
        System.out.println("Total installment: " + adminDashBoardPage.totalInstallment.getText());
        Assert.assertTrue(adminDashBoardPage.totalInstallment.isDisplayed());

    }
    @Given("verify that Given installment visible on the Loan Details page")
    public void verify_that_given_installment_visible_on_the_loan_details_page() {
        System.out.println("Given Installmen: " + adminDashBoardPage.givenInstallment.getText());
        Assert.assertTrue(adminDashBoardPage.givenInstallment.isDisplayed());

    }
    @Given("verify that Total Payable visible on the Loan Details page")
    public void verify_that_total_payable_visible_on_the_loan_details_page() {
        System.out.println("Total Payable: " + adminDashBoardPage.totalPayable.getText());
        Assert.assertTrue(adminDashBoardPage.totalPayable.isDisplayed());

    }
    @Given("verify that Profit visible on the Loan Details page")
    public void verify_that_profit_visible_on_the_loan_details_page() {
        System.out.println("Profit: " + adminDashBoardPage.profit.getText());
        Assert.assertTrue(adminDashBoardPage.profit.isDisplayed());

    }
    @Given("verify that status visible on the Loan Details page")
    public void verify_that_status_visible_on_the_loan_details_page() {
        System.out.println("Status: " + adminDashBoardPage.status.getText());
        Assert.assertTrue(adminDashBoardPage.status.isDisplayed());

    }
    @Given("verify that status of LoanForm visible on the Loan Details page")
    public void verify_that_status_of_loan_form_visible_on_the_loan_details_page() {
        Assert.assertTrue(adminDashBoardPage.loanForm.isDisplayed());



    }
    @Given("return to previous page")
    public void return_to_previous_page() throws InterruptedException {
        Driver.getDriver().navigate().back();
        Thread.sleep(2000);


    }
    @Given("On the AllLoans page, click the installments button on the first line")
    public void on_the_all_loans_page_click_the_installments_button_on_the_first_line() {
        adminDashBoardPage.installmentButton.click();

    }
    @Given("verify that Loan Number visible on the Installment page")
    public void verify_that_loan_number_visible_on_the_installment_page() {
        System.out.println("Loan Number: " + adminDashBoardPage.loanNumberInstallments.getText());
        Assert.assertTrue(adminDashBoardPage.loanNumberInstallments.isDisplayed());



    }
    @Given("verify that Plan visible on the Installment page")
    public void verify_that_plan_visible_on_the_installment_page() {
        System.out.println("Plan: " + adminDashBoardPage.planInstallments.getText());
        Assert.assertTrue(adminDashBoardPage.planInstallments.isDisplayed());

    }
    @Given("verify that Loan Amount visible on the Installment page")
    public void verify_that_loan_amount_visible_on_the_installment_page() {
        System.out.println("Amount: " + adminDashBoardPage.amountInstallments.getText());
        Assert.assertTrue(adminDashBoardPage.amountInstallments.isDisplayed());

    }
    @Given("verify that Per Installment visible on the Installment page")
    public void verify_that_per_installment_visible_on_the_installment_page() {
        System.out.println("Per Installment: " + adminDashBoardPage.perInstallments.getText());
        Assert.assertTrue(adminDashBoardPage.perInstallments.isDisplayed());

    }
    @Given("verify that Total Installment visible on the Installment page")
    public void verify_that_total_installment_visible_on_the_installment_page() {
        System.out.println("Total Installment: " + adminDashBoardPage.totalInstallments.getText());
        Assert.assertTrue(adminDashBoardPage.totalInstallments.isDisplayed());

    }
    @Given("verify that Given Installment visible on the Installment page")
    public void verify_that_given_installment_visible_on_the_installment_page() {

        System.out.println("Given Installment: " + adminDashBoardPage.givenInstallments.getText());
        Assert.assertTrue(adminDashBoardPage.givenInstallments.isDisplayed());

    }
    @Given("verify that Receivable visible on the Installment page")
    public void verify_that_receivable_visible_on_the_installment_page() {
        System.out.println("Receiveble: " + adminDashBoardPage.receivableInstallments.getText());
        Assert.assertTrue(adminDashBoardPage.receivableInstallments.isDisplayed());

    }
    @Given("verify that DelayCharge visible on the Installment page")
    public void verify_that_DelayCharge_visible_on_the_Installment_page() {
        System.out.println("Delay Charge: " + adminDashBoardPage.delayChargeInstallments.getText());
        Assert.assertTrue(adminDashBoardPage.delayChargeInstallments.isDisplayed());

    }
    @Given("verify that SN visible on the Installment page")
    public void verify_that_sn_visible_on_the_installment_page() {
        System.out.println("S.N : "+adminDashBoardPage.serialNumber.getText());
        Assert.assertTrue(adminDashBoardPage.serialNumber.isDisplayed());

    }
    @Given("verify that Installment Date visible on the Installment page")
    public void verify_that_installment_date_visible_on_the_installment_page() {
        System.out.println("Date: " + adminDashBoardPage.installmentDate.getText());
        Assert.assertTrue(adminDashBoardPage.installmentDate.isDisplayed());

    }
    @Given("verify that Given On visible on the Installment page")
    public void verify_that_given_on_visible_on_the_installment_page() {
        System.out.println("Given On: " + adminDashBoardPage.givenOn.getText());
        Assert.assertTrue(adminDashBoardPage.givenOn.isDisplayed());

    }
    @Given("verify that Delay visible on the Installment page")
    public void verify_that_delay_visible_on_the_installment_page() {
        System.out.println("Delay: " + adminDashBoardPage.delay.getText());
        Assert.assertTrue(adminDashBoardPage.delay.isDisplayed());

    }
    @Given("verify that Charge visible on the Installment page")
    public void verify_that_charge_visible_on_the_installment_page() {
        System.out.println("Charge: " + adminDashBoardPage.charge.getText());
        Assert.assertTrue(adminDashBoardPage.charge.isDisplayed());

    }
    @Given("Click the back button to check if you can return to the AllLoans page")
    public void click_the_back_button_to_check_if_you_can_return_to_the_all_loans_page() {
        adminDashBoardPage.backButton.click();

    }
    @Given("Verify that you are back to the All credits page")
    public void verify_that_you_are_back_to_the_all_credits_page() {
        String expectedUrl ="https://qa.loantechexper.com/admin/loan/all";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

    }
    @Given("click the next button in the lower right corner of the page on the AllLoans page")
    public void click_the_next_button_in_the_lower_right_corner_of_the_page_on_the_all_loans_page() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(2000);
        adminDashBoardPage.nextButton.click();


    }
    @Given("Verify next page visible")
    public void verify_next_page_visible() {


        String expectedUrl ="https://qa.loantechexper.com/admin/loan/all?page=2";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);



    }


}
