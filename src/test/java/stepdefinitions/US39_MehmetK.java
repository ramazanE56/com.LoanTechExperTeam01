package stepdefinitions;

import io.cucumber.java.en.Given;
import org.apache.poi.ss.formula.functions.T;
import org.junit.Assert;
import pages.AdminDashBoardPage;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US39_MehmetK {
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();

    String statusFirstCategory="";
    String nameCategory="";


    @Given("verify that Categories link element visible")
    public void verify_that_categories_link_element_visible() {
        Assert.assertTrue(adminDashBoardPage.categories.isDisplayed());
    }
    @Given("click categories link element")
    public void click_categories_link_element() throws InterruptedException {
        adminDashBoardPage.categories.click();
        Thread.sleep(2000);

    }
    @Given("verify all categories visible")
    public void verify_all_categories_visible() {

        Assert.assertTrue(adminDashBoardPage.allCategories.isDisplayed());
    }
    @Given("click add new element button")
    public void click_add_new_element_button() throws InterruptedException {
        adminDashBoardPage.addNew.click();
        Thread.sleep(1000);

    }
    @Given("send the name of new loan to name textbox")
    public void send_the_name_of_new_loan_to_name_textbox() throws InterruptedException {
        adminDashBoardPage.nameCategories.click();
        adminDashBoardPage.nameCategories.sendKeys("computer2");
        Thread.sleep(2000);

    }
    @Given("send the description of new loan to description textbox")
    public void send_the_description_of_new_loan_to_description_textbox() throws InterruptedException {
        adminDashBoardPage.descriptionCategories.click();
        adminDashBoardPage.descriptionCategories.sendKeys("I needd computer loan");
        Thread.sleep(2000);


    }
    @Given("click submit button")
    public void click_submit_button() throws InterruptedException {
        adminDashBoardPage.submitNewCategories.click();
        Thread.sleep(2000);


    }
    @Given("verify that create new loan")
    public void verify_that_create_new_loan() {
        String actualCategoryName=adminDashBoardPage.addedCategoryName.getText();
        String expectedCategoryName="computer2";
        Assert.assertEquals(expectedCategoryName,actualCategoryName);


    }
    @Given("send a name of loan to search box")
    public void send_a_name_of_loan_to_search_box() throws InterruptedException {
        adminDashBoardPage.searchBoxCategories.click();
        adminDashBoardPage.searchBoxCategories.sendKeys("computer2");
        Thread.sleep(2000);


    }
    @Given("click the search icon")
    public void click_the_search_icon() throws InterruptedException {
        adminDashBoardPage.searchBoxCategoriesIcon.click();
        Thread.sleep(1000);

    }
    @Given("verify that the loan typed into the search box is listed")
    public void verify_that_the_loan_typed_into_the_search_box_is_listed() {
        String expectedUrl ="https://qa.loantechexper.com/admin/category/index?search=computer2";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);



    }
    @Given("Click the EnableDisable button in the action tab of the first loan")
    public void click_the_enable_disable_button_in_the_action_tab_of_the_first_loan() throws InterruptedException {

        adminDashBoardPage.categories.click();
        Thread.sleep(2000);
        statusFirstCategory=adminDashBoardPage.statusCategory.getText();
        adminDashBoardPage.enebleDisableChange.click();
        Thread.sleep(2000);

    }
    @Given("click the yesButton on the Confirmation Alert page")
    public void click_the_yes_button_on_the_confirmation_alert_page() throws InterruptedException {

        adminDashBoardPage.allertYes.click();
        Thread.sleep(2000);

    }
    @Given("Verify that the status of the 1st line loan has changed")
    public void verify_that_the_status_of_the_1st_line_loan_has_changed() {
        String actualStatusFirstCategory=adminDashBoardPage.statusCategory.getText();
        String expectedStatusFirstCategory=statusFirstCategory;
        Assert.assertEquals(expectedStatusFirstCategory,actualStatusFirstCategory);


    }
    @Given("Click the editButton in the action tab of the first loan")
    public void click_the_edit_button_in_the_action_tab_of_the_first_loan() throws InterruptedException {
        nameCategory= adminDashBoardPage.nameCategories.getText();
        adminDashBoardPage.editCategory.click();
        Thread.sleep(1000);


    }
    @Given("send a new name to name loan textbox")
    public void send_a_new_name_to_name_loan_textbox() throws InterruptedException {
        adminDashBoardPage.nameCategories.clear();
        Thread.sleep(1000);
        adminDashBoardPage.nameCategories.sendKeys("ipad");

    }
    @Given("send the description to description textbox")
    public void send_the_description_to_description_textbox() throws InterruptedException {
        adminDashBoardPage.descriptionCategories.clear();
        Thread.sleep(1000);
        adminDashBoardPage.descriptionCategories.sendKeys("just fun");
        Thread.sleep(2000);
        adminDashBoardPage.submitNewCategories.click();
        Thread.sleep(3000);

    }
    @Given("Verify that first line loan has changed")
    public void verify_that_first_line_loan_has_changed() {
        String expectednameCategory=nameCategory;
        String actualNameCategory=adminDashBoardPage.nameCategories.getText();
        Assert.assertEquals(expectednameCategory,actualNameCategory);
    }
}
