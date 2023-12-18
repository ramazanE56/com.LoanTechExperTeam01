package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.AdminDashBoardPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US30_MehmetK {
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();
    @Given("Navigate to Admin page {string}")
    public void Navigate_to_Admin_page(String UrlAdmin) throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty(UrlAdmin));
        Thread.sleep(1000);

    }
    @Given("send username registered to username textbox")
    public void send_username_registered_to_username_textbox() {
        
    }
    @Given("send password registered to username textbox")
    public void send_password_registered_to_username_textbox() {
        
    }
    @Given("click on the login button")
    public void click_on_the_login_button() {

    }
    @Given("click Loans link element")
    public void click_loans_link_element() {

    }
    @Given("click All Loans link element")
    public void click_all_loans_link_element() {

    }
    @Given("verify that All Loans Table visible")
    public void verify_that_all_loans_table_visible() {

    }
    @Given("send the first Loan's number to Loan no's searchbox")
    public void send_the_first_loan_s_number_to_loan_no_s_searchbox() {

    }
    @Given("click searchbox icon")
    public void click_searchbox_icon() {

    }
    @Given("verify the first loans visible")
    public void verify_the_first_loans_visible() {

    }
    @Given("click Date textbox")
    public void click_date_textbox() {

    }
    @Given("send {string} to Date textbox")
    public void send_to_date_textbox(String date) {

    }
    @Given("click Date searchbox icon")
    public void click_date_searchbox_icon() {

    }
    @Given("Verify that you can search the AllLoans table on the AllLoans page with the Date information.")
    public void verify_that_you_can_search_the_all_loans_table_on_the_all_loans_page_with_the_date_information() {

    }
    @Given("On the All loans page click the details button on the first line")
    public void on_the_all_loans_page_click_the_details_button_on_the_first_line() {

    }
    @Given("verify that plan name visible on the Loan Details page")
    public void verify_that_plan_name_visible_on_the_loan_details_page() {

    }
    @Given("verify that date of Application visible on the Loan Details page")
    public void verify_that_date_of_application_visible_on_the_loan_details_page() {

    }
    @Given("verify that Loan Number visible on the Loan Details page")
    public void verify_that_loan_number_visible_on_the_loan_details_page() {

    }
    @Given("verify that Amount visible on the Loan Details page")
    public void verify_that_amount_visible_on_the_loan_details_page() {

    }
    @Given("verify that Per İnstallment visible on the Loan Details page")
    public void verify_that_per_i̇nstallment_visible_on_the_loan_details_page() {

    }
    @Given("verify that Total installment visible on the Loan Details page")
    public void verify_that_total_installment_visible_on_the_loan_details_page() {

    }
    @Given("verify that Given installment visible on the Loan Details page")
    public void verify_that_given_installment_visible_on_the_loan_details_page() {

    }
    @Given("verify that Total Payable visible on the Loan Details page")
    public void verify_that_total_payable_visible_on_the_loan_details_page() {

    }
    @Given("verify that Profit visible on the Loan Details page")
    public void verify_that_profit_visible_on_the_loan_details_page() {

    }
    @Given("verify that status visible on the Loan Details page")
    public void verify_that_status_visible_on_the_loan_details_page() {

    }
    @Given("verify that status of LoanForm visible on the Loan Details page")
    public void verify_that_status_of_loan_form_visible_on_the_loan_details_page() {

    }
    @Given("return to previous page")
    public void return_to_previous_page() {

    }
    @Given("On the AllLoans page, click the installments button on the first line")
    public void on_the_all_loans_page_click_the_installments_button_on_the_first_line() {

    }
    @Given("verify that Loan Number visible on the Installment page")
    public void verify_that_loan_number_visible_on_the_installment_page() {

    }
    @Given("verify that Plan visible on the Installment page")
    public void verify_that_plan_visible_on_the_installment_page() {

    }
    @Given("verify that Loan Amount visible on the Installment page")
    public void verify_that_loan_amount_visible_on_the_installment_page() {

    }
    @Given("verify that Per Installment visible on the Installment page")
    public void verify_that_per_installment_visible_on_the_installment_page() {

    }
    @Given("verify that Total Installment visible on the Installment page")
    public void verify_that_total_installment_visible_on_the_installment_page() {

    }
    @Given("verify that Given Installment visible on the Installment page")
    public void verify_that_given_installment_visible_on_the_installment_page() {

    }
    @Given("verify that Receivable visible on the Installment page")
    public void verify_that_receivable_visible_on_the_installment_page() {

    }
    @Given("verify that SN visible on the Installment page")
    public void verify_that_sn_visible_on_the_installment_page() {

    }
    @Given("verify that Installment Date visible on the Installment page")
    public void verify_that_installment_date_visible_on_the_installment_page() {

    }
    @Given("verify that Given On visible on the Installment page")
    public void verify_that_given_on_visible_on_the_installment_page() {

    }
    @Given("verify that Delay visible on the Installment page")
    public void verify_that_delay_visible_on_the_installment_page() {

    }
    @Given("verify that Charge visible on the Installment page")
    public void verify_that_charge_visible_on_the_installment_page() {

    }
    @Given("Click the back button to check if you can return to the AllLoans page")
    public void click_the_back_button_to_check_if_you_can_return_to_the_all_loans_page() {

    }
    @Given("Verify that you are back to the All credits page")
    public void verify_that_you_are_back_to_the_all_credits_page() {

    }
    @Given("click the {int} button in the lower right corner of the page on the AllLoans page")
    public void click_the_button_in_the_lower_right_corner_of_the_page_on_the_all_loans_page(Integer pageNumber) {

    }
    @Given("Verify next page visible")
    public void verify_next_page_visible() {

    }


}
