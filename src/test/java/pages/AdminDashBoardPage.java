package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class AdminDashBoardPage {
    public AdminDashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // ----- SUPHİ ----- //
    @FindBy(xpath = "//span[text()='Manage Users']")
    public WebElement manageUserLinkElement;

    @FindBy(xpath = "(//span[text()='Active Users'])[1]")
    public WebElement activeUserLinkElement;

    @FindBy(xpath = "//input[@class='form-control bg--white']")
    public WebElement searchBoxElement;

    @FindBy(xpath = "//button[@class='btn btn--primary']")
    public WebElement searchButtonElement;

    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline--primary']")
    public WebElement detailsButtonElement;

    @FindBy(xpath = "//span[@class='navbar-user__name']")
    public WebElement adminIconElement;

    @FindBy(xpath = "(//span[@class='dropdown-menu__caption'])[1]")
    public WebElement adminIconProfileElement;

    @FindBy(xpath = "(//span[@class='dropdown-menu__caption'])[2]")
    public WebElement adminIconPasswordElement;

    @FindBy(xpath = "(//span[@class='dropdown-menu__caption'])[3]")
    public WebElement adminIconLogoutElement;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement adminProfileNameBoxElement;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement adminProfileEmailBoxElement;

    @FindBy(xpath = "//label[@class='bg--success']")
    public WebElement adminProfileUploadImageElement;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminProfileSubmitButtonElement;

    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement adminProfileUpdatedConfirmElement;

    @FindBy(xpath = "//input[@name='old_password']")
    public WebElement adminOldPasswordBoxElement;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement adminPasswordBoxElement;

    @FindBy(xpath = "//input[@name='password_confirmation']")
    public WebElement adminConfirmPasswordBoxElement;

    @FindBy(xpath = "//button[@class='btn btn--primary w-100 btn-lg h-45']")
    public WebElement adminPasswordSubmitButtonElement;

    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement adminPasswordUpdatedElement;

    @FindBy(xpath = "//*[@class='text-white']")
    public WebElement adminLogoutConfirmElement;   //Admin Login to Loantech Exper Dashboard yazısı

    @FindBy(xpath = "//input[@name='firstname']")
    public WebElement informationFirstnameBoxElement;

    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement informationLastnameBoxElement;

    @FindBy(xpath = "//input[@name='email']")
    public WebElement informationEmailBoxElement;

    @FindBy(xpath = "//input[@name='city']")
    public WebElement informationCityBoxElement;

    @FindBy(xpath = "//input[@name='state']")
    public WebElement informationStateBoxElement;

    @FindBy(xpath = "//input[@name='zip']")
    public WebElement informationZipcodeBoxElement;

    @FindBy(xpath = "//button[@class='btn btn--primary w-100 h-45 mt-3']")
    public WebElement informationSubmitButtonElement;

    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement informationUpdatedConfirmElement;

    // ----- SUPHİ ----- //

    @FindBy(xpath = "(//li[@class='sidebar-menu-item sidebar-dropdown'])[2]")
    public WebElement loansLink;

    @FindBy(xpath = "//span[text()='Rejected Loans']")
    public WebElement rejectedLoansLink;

    @FindBy(xpath = "//h6[@class='page-title']")
    public  WebElement rejectedLoanPageTitle;

    @FindBy(xpath = "(//input[@type='search'])[2]")
     public WebElement loanNoBox;

    @FindBy(xpath = "//i[@class='la la-search'][1]")
    public WebElement loanNoSearchBoxKutusu;

    @FindBy(xpath = "(//input[@type='search'])[3]")
    public WebElement startDateSearchBox;

    @FindBy(xpath = "//button[@class='btn btn--primary input-group-text']")
    public WebElement startDateSearchBoxKutusu;

    @FindBy(xpath = "(//tr[1])[1]")  //satirlar sirayla 2,3,4 vb devam ediyor
    public List<WebElement> pagesTitle;

    @FindBy(xpath = "//tbody")
    public List<WebElement> resultTableElements;

    @FindBy(xpath = "//div[@class='card-body'][1]")
    public List<WebElement>planInformationTable;

    @FindBy(xpath = "//div[@class='d-flex mb-30 flex-wrap gap-3 justify-content-between align-items-center']")
    public WebElement loansDetailsElementi;




    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline--primary']")
    public WebElement detailsButonu;

    @FindBy(xpath = "//i[@class=\"las la-history\"][1]")
    public WebElement isttallmentsButton;

    @FindBy(xpath = "(//h6)[11]")
    public WebElement installmentElementi;

    @FindBy(xpath = "//span[@class='fw-bold'][1]")
    public WebElement ilkLoanNoElementi;

    @FindBy(xpath = "//li[@class='list-group-item'][10]")
    public WebElement statusElementi;
    @FindBy(xpath = "//tbody")
    public List<WebElement>installmentsPageTitle;

    @FindBy(xpath = "//div[@class='card-body']")
    public List<WebElement>instalmentTableElementi;

    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline--primary']")
    public WebElement backButonElement;

    @FindBy(xpath = "(//h6)[11]")
    public WebElement backtoAllLoans;

    @FindBy (xpath = "//span[normalize-space()='Manage Users']")
    public WebElement manageUsersButton;

    @FindBy (xpath = "//input[@id='username']")
    public WebElement adminUsernameTextBox;

    @FindBy (xpath = "//input[@id='password']")
    public WebElement adminPasswordTextBox;

    @FindBy (xpath = "//button[normalize-space()='LOGIN']")
    public WebElement adminLoginButton;

    @FindBy (xpath = "//span[normalize-space()='Notification to All']")
    public WebElement notificationButton;

    @FindBy (xpath = "//label[normalize-space()='Being Sent']")
    public WebElement beingSentText;

    @FindBy (xpath = "//label[normalize-space()='Subject']")
    public WebElement subjectText;

    @FindBy (xpath = "//input[@id='subject']")
    public WebElement subjectTextBox;

    @FindBy (xpath = "//div[@contenteditable='true']")
    public WebElement messageTextBox;

    @FindBy (xpath = "//input[@id='batch']")
    public WebElement perBatchTextBox;

    @FindBy (xpath = "//label[normalize-space()='Per Batch']")
    public WebElement perBatchText;

    @FindBy (xpath = "//input[@id='cooling_time']")
    public WebElement coolingPeriodTextBox;

    @FindBy (xpath = "//label[normalize-space()='Cooling Period']")
    public WebElement coolingPeriodText;

    @FindBy (xpath = "//input[@id='start_form']")
    public WebElement startFromTextBox;

    @FindBy (xpath = "//label[normalize-space()='Start Form']")
    public WebElement startFromText;

    @FindBy (xpath = "//button[normalize-space()='Submit']")
    public WebElement notificationSubmitButton;

    @FindBy (xpath = "//span[@role='combobox']")
    public WebElement selectUsers;

















}
