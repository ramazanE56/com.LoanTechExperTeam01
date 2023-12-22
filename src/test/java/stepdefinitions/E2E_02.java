package stepdefinitions;

import io.cucumber.java.en.Given;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import pages.AdminDashBoardPage;
import pages.AdminLoginPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.awt.*;
import java.awt.event.InputEvent;


import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;



public class E2E_02 {
    AdminDashBoardPage adminDashBoardPage = new AdminDashBoardPage();
    AdminLoginPage adminLoginPage=new AdminLoginPage();
    Actions actions = new Actions(Driver.getDriver());
    JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
    LoginPage loginPage=new LoginPage();
    HomePage homePage=new HomePage();
    Select select;
    String TrxNumber="";
    @Given("The user enters site with the given {string}")
    public void the_visitor_enters_site_with_the_given(String Url) {
        Driver.getDriver().get(ConfigReader.getProperty(Url));
        ReusableMethods.wait(2);

    }

    @Given("Click on login button")
    public void Click_on_login_button() {
        loginPage.loginButtonElement.click();

    }
    @Given("send registered {string} to username text box")
    public void send_registered_to_username_text_box(String userName) throws InterruptedException {
        loginPage.userNameBoxElement.sendKeys("ismailtemiz");
        Thread.sleep(1000);

    }
    @Given("send registered {string} to password text box")
    public void send_registered_to_password_text_box(String password) {
        loginPage.passwordElement.sendKeys("Loan.741");

    }

    @Given("Click on submit button")
    public void click_on_submit_button() {
        jse.executeScript("arguments[0].click();", loginPage.submitButtonElement);
        ReusableMethods.wait(2);

    }

    @Given("registered user clicks on the withdraw tab")
    public void registered_user_clicks_on_the_withdraw_tab() {
        jse.executeScript("arguments[0].click();", homePage.withDrow);
        ReusableMethods.wait(5);

    }
    @Given("Click the select GetAway")
    public void click_the_select_get_away() {

        select = new Select(homePage.selecGetAway);
        ReusableMethods.wait(1 );
        select.selectByVisibleText("İT");

    }
    @Given("Click on the amounth")
    public void click_on_the_amounth() {

        homePage.amountBoxElement.click();
        ReusableMethods.wait(1);
        homePage.amountBoxElement.sendKeys("100");

    }
    @Given("Send {int} to the box")
    public void send_to_the_box(Integer int1) {
        jse.executeScript("arguments[0].click();", homePage.SubmitElement);

    }
    @Given("Click on Sumit under the Withdraw Via IT text that appears.")
    public void click_on_sumit_under_the_withdraw_via_it_text_that_appears() {

        jse.executeScript("arguments[0].click();", homePage.SubmitElement);

    }



    @Given("send adminUserName to username textbox")
    public void send_adminUserName_to_username_textbox() {
        adminLoginPage.adminUserNameBox.sendKeys("ismailtemiz");

    }
    @Given("send adminPasword to password textbox")
    public void send_adminPasword_registered_to_password_textbox() {
        adminLoginPage.adminPasswordBox.sendKeys("123123123");

    }

    @Given("Admin clicks on the withdrawals tab")
    public void admin_clicks_on_the_withdrawals_tab() throws InterruptedException {
        adminDashBoardPage.withdrawalDropMenu.click();
        Thread.sleep(1000);

    }
    @Given("Admin selects the pending withdrawals tab.")
    public void admin_selects_the_pending_withdrawals_tab() throws InterruptedException {
        adminDashBoardPage.pendingWithdrawals.click();
        Thread.sleep(1000);


    }
    @Given("Admin clicks on the details button of user ismail")
    public void admin_clicks_on_the_details_button_of_user_ismail() throws InterruptedException {
        adminDashBoardPage.pendingWithdrawalsDetails.click();
        Thread.sleep(1000);

    }
    @Given("admin copies ismails Trx Number")
    public void admin_copies_ismails_trx_number() {
        TrxNumber= adminDashBoardPage.pendngWithdrawalTrx.getText();

    }
    @Given("Admin clicks on the approve button")
    public void admin_clicks_on_the_approve_button() throws InterruptedException {
        adminDashBoardPage.pendingWithdrawalAprove.click();
        Thread.sleep(1000);

    }
    @Given("admin writes ismails Trx Number in the Approve Withdrawal Confirmation box")
    public void admin_writes_ismails_trx_number_in_the_approve_withdrawal_confirmation_box() throws InterruptedException {
        adminDashBoardPage.approveWithdrawalConfirmation.click();
        adminDashBoardPage.approveWithdrawalConfirmation.sendKeys(TrxNumber);
        adminDashBoardPage.approveWithdrawalConfirmation.click();
        Thread.sleep(1000);

    }
    @Given("Click on the Approved Withdrawals tab")
    public void click_on_the_approved_withdrawals_tab() throws InterruptedException {
        adminDashBoardPage.approvedWithdraval.click();
        Thread.sleep(1000);

    }
    @Given("admin verifies that ismails withraw is approved")
    public void admin_verifies_that_ismails_withraw_is_approved() {
        System.out.println(adminDashBoardPage.appreved.getText());
        String expectedStatus="Approved";
        String actualStatus =adminDashBoardPage.appreved.getText();
        Assert.assertEquals(expectedStatus,actualStatus);

    }
    @Given("admin clicks on the manages users tab")
    public void admin_clicks_on_the_manages_users_tab() throws InterruptedException {
        actions.sendKeys(Keys.F5).perform();
        //actions.sendKeys(Keys.PAGE_UP).perform();
        Thread.sleep(2000);
        adminDashBoardPage.withdrawalDropMenu.click();
        Thread.sleep(1000);
        adminDashBoardPage.manageUsers.click();
    }
    @Given("admin clicks on the active users tab")
    public void admin_clicks_on_the_active_users_tab() throws InterruptedException {
        adminDashBoardPage.activeUserLinkElement.click();
        Thread.sleep(1000);

    }
    @Given("admin writes ismailtemiz in the usernameEmail box and clicks the search button.")
    public void admin_writes_ismailtemiz_in_the_username_email_box_and_clicks_the_search_button() throws InterruptedException {
        adminDashBoardPage.activeUserSearch.click();
        adminDashBoardPage.activeUserSearch.sendKeys("ismailtemiz");
        adminDashBoardPage.activeUSersSerachIcon.click();
        Thread.sleep(1000);

    }
    @Given("admin clicks on the details button")
    public void admin_clicks_on_the_details_button() throws InterruptedException {
        adminDashBoardPage.activeUsersDetails.click();
        Thread.sleep(1000);

    }
    @Given("admin clicks the Notifications button")
    public void admin_clicks_the_notifications_button() throws InterruptedException {
        adminDashBoardPage.notifications.click();
        Thread.sleep(1000);

    }
    @Given("admin clicks the Send  Notifications button")
    public void admin_clicks_the_send_notifications_button() throws InterruptedException {
        adminDashBoardPage.sendMessage.click();
        Thread.sleep(1000);

    }
    @Given("admin writes subject in the Subject box")
    public void admin_writes_subject_in_the_subject_box() throws InterruptedException {
        adminDashBoardPage.subjectMessage.click();
        adminDashBoardPage.subjectMessage.sendKeys("ismailtemiz@gmail.com");
        Thread.sleep(1000);

    }
    @Given("admin writes Merhaba İsmail ben LoanTechExperden Yetiş LoanTechExper yönetim ekibi olarak bu ayın en çok aktif kullanıcısı olarak sizi seçtik Bundan dolayı size bir sürprizimiz var Sizin tüm loan planlarınıza %{int} indirim uyguladık. Hayırlı olsun LoanTechExper olarak bizi tercih ettiğiniz için çok teşekkür ederiz in the Messagebox")
    public void admin_writes_merhaba_i̇smail_ben_loan_tech_experden_yetiş_loan_tech_exper_yönetim_ekibi_olarak_bu_ayın_en_çok_aktif_kullanıcısı_olarak_sizi_seçtik_bundan_dolayı_size_bir_sürprizimiz_var_sizin_tüm_loan_planlarınıza_indirim_uyguladık_hayırlı_olsun_loan_tech_exper_olarak_bizi_tercih_ettiğiniz_için_çok_teşekkür_ederiz_in_the_messagebox(Integer int1) {
        //actions.sendKeys((Keys.TAB)).perform();
        adminDashBoardPage.bodyMessage.click();

        adminDashBoardPage.bodyMessage.sendKeys("Merhaba İsmail, ben LoanTechExperden Yetiş LoanTechExper yönetim ekibi olarak bu ayın en çok aktif kullanıcısı olarak sizi seçtik Bundan dolayı size bir sürprizimiz var Sizin tüm loan planlarınıza %1 indirim uyguladık. Hayırlı olsun LoanTechExper olarak bizi tercih ettiğiniz için çok teşekkür ederiz");
        ReusableMethods.wait(10);

    }
    @Given("Click on the submit button on message page")
    public void click_on_the_submit_button_on_message_page() throws InterruptedException {
        adminDashBoardPage.submitMessage.click();
        Thread.sleep(5000);

    }
    @Given("admin clicks on his name at the top right and clicks on profile")
    public void admin_clicks_on_his_name_at_the_top_right_and_clicks_on_profile() throws InterruptedException {
        adminDashBoardPage.profileicon.click();
        adminDashBoardPage.profiles.click();
        Thread.sleep(1000);


    }
    @Given("By updating the admin profile name it writes its own name instead of Super Admins")
    public void by_updating_the_admin_profile_name_it_writes_its_own_name_instead_of_super_admins() {
        adminDashBoardPage.superAdmin.click();
        adminDashBoardPage.superAdmin.clear();
        adminDashBoardPage.superAdmin.sendKeys("İsmail Temiz");




    }
    @Given("Click the Upload File button and upload a profile photo.")
    public void click_the_upload_file_button_and_upload_a_profile_photo() throws InterruptedException, AWTException {
       adminDashBoardPage.photoUpload.click();
        Point point1 = new Point(466,59);// C: araba çubuğu koordinatı
        Robot robot = new Robot();
        robot.mouseMove(point1.x, point1.y); // Farenin konumunu ayarla
        ReusableMethods.wait(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama yap
        ReusableMethods.wait(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama bırak
        ReusableMethods.wait(1);


        // Ctrl+V tuş kombinasyonunu kullanarak dosya yolunu yapıştır
        StringSelection stringSelection = new StringSelection("C:\\Users\\asus\\IdeaProjects\\com.LoanTechExperTeam01\\src\\test\\java\\utilities");
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);

        // adres satırının yanındaki enter işlemi gören yandaki oka tıkla
        Point point2 = new Point(709,51);// aç butonu koordinatı
        robot.mouseMove(point2.x, point2.y); // Farenin konumunu ayarla
        ReusableMethods.wait(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama yap
        ReusableMethods.wait(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama bırak
        ReusableMethods.wait(1);

        //gelen logoya tıklama işlemi
        Point point3 = new Point(430,165);// aç butonu koordinatı
        robot.mouseMove(point3.x, point3.y); // Farenin konumunu ayarla
        ReusableMethods.wait(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama yap
        ReusableMethods.wait(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama bırak
        ReusableMethods.wait(1);

        //aç butanuna tıklama işlemi

        Point point4 = new Point(788,506);// aç butonu koordinatı
        robot.mouseMove(point4.x, point4.y); // Farenin konumunu ayarla
        ReusableMethods.wait(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama yap
        ReusableMethods.wait(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama bırak
        ReusableMethods.wait(1);






        adminDashBoardPage.uploadSubmit.click();
        Thread.sleep(2000);

    }

}
