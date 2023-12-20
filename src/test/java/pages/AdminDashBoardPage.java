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


@FindBy(xpath = "//input[@name='username']")
    public WebElement adminUserName;
    //eyyup

   @FindBy(xpath = "//input[@id='password']")
   public  WebElement adminPassword;
   //eyyup

   @FindBy(xpath = "//button[@class='btn cmn-btn w-100']")
    public WebElement loginButton;
   //eyyup

   @FindBy(xpath = "(//span[normalize-space()='Loans'])[1]")
   public WebElement loansbutton;
   //eyyup


   @FindBy(xpath = "(//span[normalize-space()='Pending Loans'])[1]")
    public WebElement pendingLoansButton;
   //eyyup

   @FindBy(xpath = "(//h6[normalize-space()='Pending Loans'])[1]")
    public WebElement pendingloanspost;
   //eyyup

   @FindBy(xpath = "//div[@class='bodywrapper__inner']")

    public List<WebElement> pendingLoansTable;
   //eyyup


   @FindBy(xpath = "//div[@class='table-responsive--lg table-responsive']")
   public List<WebElement> pendingLoansInformation;
   //eyyup


   @FindBy(xpath = "(//input[@type='search'])[2]")
    public WebElement loanNo;
   //eyyup

    @FindBy(xpath = "//input[@name='date']")
    public WebElement dateNo;
    //eyyup

    @FindBy(xpath = "(//i[@class='la la-search'])[2]")
    public WebElement searchbutton;
    //eyyup

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary'])[1]")
    public WebElement plDetails;
    //eyyup


    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--success'])[1]")
    public WebElement plInstallments;
    //eyyup

    @FindBy(xpath = "//div[@class='card-body']")
    public WebElement loanDetails;
    //eyyup

    @FindBy(xpath = "//button[@class='btn btn-outline--success confirmationBtn']")
    public WebElement approveButton;
    //eyyup

    @FindBy(xpath = "//button[@class='btn btn--primary']")
    public WebElement approveYes;
    //eyyup

    @FindBy(xpath = "//button[@class='btn btn-outline--danger ms-1 rejectBtn']")
    public WebElement rejectButton;
    //eyyup

    @FindBy(xpath = "//textarea[@class='form-control']")
    public WebElement rejecttext;
    //eyyup

    @FindBy(xpath = "//button[@class='btn btn--primary w-100 h-45']")
    public WebElement rejectSubmit;
    //eyyup

    @FindBy(xpath = "//div[@class='card-body']")
    public WebElement loanSummaray;
    //eyyup

    @FindBy(xpath = "//a[@class='btn btn-sm btn-outline--primary']")
    public WebElement backButton;
    //eyyup


    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement alLoansPost;
    //eyyup


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



    @FindBy(xpath = "(//*[@class='nav-link'])[15]")
    public WebElement allLoans;

    @FindBy(xpath = "//*[@class='table-responsive--lg table-responsive']")
    public WebElement allLoansTable;

    @FindBy(xpath = "//*[@class='fw-bold']")
    public WebElement firstLoan;

    @FindBy(xpath = "//*[@class='datepicker-here form-control bg--white pe-2']")
    public WebElement dateSearch;

    @FindBy(xpath = "//*[@class='btn btn--primary input-group-text']")
    public WebElement dateSearchButton;

    @FindBy(xpath = "//li[1]/span[2]")
    public WebElement planName;
    @FindBy(xpath = "//li[2]/span[2]")
    public WebElement dateOfApplication;
    @FindBy(xpath = "//li[3]/span[2]")
    public WebElement loanNumber;
    @FindBy(xpath = "//li[4]/span[2]")
    public WebElement Amount;
    @FindBy(xpath = "//li[5]/span[2]")
    public WebElement perInstallmen;
    @FindBy(xpath = "//li[6]/span[2]")
    public WebElement totalInstallment;
    @FindBy(xpath = "//li[7]/span[2]")
    public WebElement givenInstallment;
    @FindBy(xpath = "//li[8]/span[2]")
    public WebElement totalPayable;

    @FindBy(xpath = "//li[9]/span[2]")
    public WebElement profit;

    @FindBy(xpath = "//li[10]/span[2]")
    public WebElement status;
    @FindBy(xpath = "//h5[@class='card-title border-bottom pb-2']")
    public WebElement loanForm;

    @FindBy(xpath = "//*[@class='btn btn-sm btn-outline--success']")
    public WebElement installmentButton;
    @FindBy(xpath = "//li[1]/span[1]")
    public WebElement loanNumberInstallments;
    @FindBy(xpath = "//li[2]/span[1]")
    public WebElement planInstallments;
    @FindBy(xpath = "//li[3]/span[1]")
    public WebElement amountInstallments;
    @FindBy(xpath = "//li[4]/span[1]")
    public WebElement perInstallments;
    @FindBy(xpath = "//li[5]/span[1]")
    public WebElement totalInstallments;

    @FindBy(xpath = "//li[6]/span[1]")
    public WebElement givenInstallments;
    @FindBy(xpath = "//li[7]/span[1]")
    public WebElement receivableInstallments;
    @FindBy(xpath = "//li[8]/span[1]")
    public WebElement delayChargeInstallments;
    @FindBy(xpath = "//th[1]")
    public WebElement serialNumber;
    @FindBy(xpath = "//th[2]")
    public WebElement installmentDate;
    @FindBy(xpath = "//th[3]")
    public WebElement givenOn;
    @FindBy(xpath = "//th[4]")
    public WebElement delay;
    @FindBy(xpath = "//th[5]")
    public WebElement charge;

    //@FindBy(xpath = "//*[@class='btn btn-sm btn-outline--primary']")
   // public WebElement backButton;


    @FindBy(xpath = "//nav/ul/li[11]")
    public WebElement nextButton;

    @FindBy(xpath = "(//*[@class='menu-title'])[12]")
    public WebElement categories;


    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement allCategories;

    @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline--primary cuModalBtn'])[1]")
    public WebElement addNew;
    @FindBy(xpath = "(//*[@class='form-control'])[1]")
    public WebElement nameCategories;
    @FindBy(xpath = "(//*[@class='form-control'])[2]")
    public WebElement descriptionCategories;
    @FindBy(xpath = "//*[@class='btn btn--primary h-45 w-100']")
    public WebElement submitNewCategories;
    @FindBy(xpath = " //*[@data-label='Name']")
    public WebElement addedCategoryName;
    @FindBy(xpath = " //*[@class='form-control bg--white']")
    public WebElement searchBoxCategories;
    @FindBy(xpath = "//*[@class='la la-search']")
    public WebElement searchBoxCategoriesIcon;
    @FindBy(xpath = "//*[@class='btn btn-sm btn-outline--danger ms-1 confirmationBtn']")
    public WebElement enebleDisableChange;
    @FindBy(xpath = "(//*[@class='btn btn--primary'])[2]")
    public WebElement allertYes;

    @FindBy(xpath = "//*[@class='badge badge--warning']")
    public WebElement statusCategory;

    @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline--primary cuModalBtn'])[2]")
    public WebElement editCategory;

















   // ****************** Ümit ****************** //

    //AdminDashboard->Loans->Running Loans

    @FindBy(xpath = "(//*[@class='sidebar-menu-item sidebar-dropdown'])[2]")
    public WebElement loansDropMenu;

    @FindBy(xpath = "(//span[@class='menu-title'])[16]")
    public WebElement runningLoansButton;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement runningLoansText;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/thead")
    public List<WebElement>runnigPageTitleList;

    @FindBy(xpath = "//*[@placeholder='Loan No.']")
    public WebElement loanNoSearchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loanNoSearchButton;

    @FindBy(xpath = "//*[@placeholder='Start Date - End Date']")
    public WebElement dateSearchBox;

   // @FindBy(xpath = "//*[@class='btn btn--primary input-group-text']")
    // public WebElement dateSearchButton;

    @FindBy(xpath = "//tbody")
    public List<WebElement> searchResultTableElements;

    @FindBy(xpath = " (//*[@class='btn btn-sm btn-outline--primary'])[1]")
    public WebElement detailsButton;

    @FindBy(xpath = "//*[@class='page-title']")
    public WebElement loanDetailsText;

    @FindBy(xpath = " (//*[@class='btn btn-sm btn-outline--success'])[1]")
    public WebElement installmentsButton;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement installmentsText;

    @FindBy(xpath = "//div[@class='col-xl-4 mb-30']")
    public List<WebElement> loanDetailsCard;

    @FindBy(xpath = "//span[@class='badge badge--primary']")
    public WebElement statusCodeText;

    @FindBy(xpath = "//div[@class='card custom--card']")
    public List<WebElement> loanSummaryCardText;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div[2]/div/div/div/table/thead")
    public List<WebElement>installmentsHeader;




    @FindBy(xpath ="//h6[@class='page-title']")
    public WebElement allLoansText;

    @FindBy(xpath = "(//td[@data-label='S.N.'])[20]")
    public WebElement installmentNumber;

    @FindBy(xpath ="((//*[@class='page-item'])[2]")
    public WebElement installmentsNextButton;

    @FindBy(xpath = "//td[normalize-space()='21']")
    public WebElement nextPageInstallmentNumber;

    //AdminDashboard->Withdrawal->Withdrawal Methods

    @FindBy(xpath = "(//span[@class='menu-title'])[31]")
    public WebElement withdrawalDropMenu;

    @FindBy(xpath = "(//span[@class='menu-title'])[32]")
    public WebElement withdrawalMethods;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement withdrawalMethodsText;

    @FindBy(xpath = "/html/body/div/div[2]/div/div[2]/div/div/div/div/table/thead")
    public List<WebElement> withdrawalMethodsList;

    @FindBy(xpath = "//a[@class='btn btn-outline--primary']")
    public WebElement addButton;

    @FindBy(xpath = "//*[@name='name']")
    public WebElement withdrawalMethodsName;

    @FindBy(xpath = "//*[@name='currency']")
    public WebElement withdrawalMethodsCurrency;

    @FindBy(xpath = "//*[@name='rate']")
    public WebElement withdrawalMethodsRate;

    @FindBy(xpath = "//*[@name='min_limit']")
    public WebElement withdrawalMethodsMinLimit;

    @FindBy(xpath = "//*[@name='max_limit']")
    public WebElement withdrawalMethodsMaxLimit;

    @FindBy(xpath = "//*[@name='fixed_charge']")
    public WebElement withdrawalMethodsFixedCharge;

    @FindBy(xpath = "//*[@name='percent_charge']")
    public WebElement withdrawalMethodsPercentCharge;

    @FindBy(xpath = "(/html/body/div/div[2]/div/div[2]/div/div/form/div[2]/button")
    public WebElement submitButton;

    @FindBy(xpath = "//*[@id='search_table']")
    public WebElement withdrawalMethodsSearchBox;

    @FindBy(xpath = "(//*[@data-label='Method'])[1]")
    public WebElement withdrawalMethodsFirstColumn;

    @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public WebElement withdrawalMethodsEditButton;

    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement successfullyMessage;

    @FindBy(xpath = "//*[@class='btn btn-sm btn-outline--danger ms-1 confirmationBtn']")
    public WebElement withdrawalMethodsDisableButton;

    @FindBy(xpath = "//button[@class='btn btn--primary']")
    public WebElement withdrawalMethodsDisableYesButton;

    @FindBy(xpath = "//*[@class='iziToast-message slideIn']")
    public WebElement statusChangedMessage;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement updateWithdrawalMethodText;

    @FindBy(xpath = "//div[@class='row']")
    public List<WebElement> withDrawTable;



    //AdminDashboard->Deposits -> Approved Deposits

    @FindBy(xpath = "(//*[@class='menu-title'])[24]")
    public WebElement depositsButton;

    @FindBy(xpath = "(//*[@class='menu-title'])[26]")
    public WebElement approvedDepositsButton;

    @FindBy(xpath = "//div[@class='row justify-content-center']")
    public List<WebElement> approvedDepositsHeader;

    @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public WebElement approvedDepositsDetailsButton;

    @FindBy(xpath = "//h5[@class='mb-20 text-muted']")
    public WebElement depositViaManualCardText;


    @FindBy(xpath = "//*[@class='col-xl-4 col-md-6 mb-30']")
    public List<WebElement> depositViaManualCard;

    @FindBy(xpath = "(//*[@class='menu-title'])[27]")
    public WebElement successfulDepositsButton;

    @FindBy(xpath = "/html/body/div[1]/div[2]/div/div[2]/div/div/div[1]/div/table/thead")
    public List<WebElement> successfulDepositsHeader;

    @FindBy(xpath = "(//*[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public WebElement successfulDepositsDetailsButton;


}
