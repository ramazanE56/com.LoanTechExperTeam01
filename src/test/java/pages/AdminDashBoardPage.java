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

    // AdminDashboard Page (Samet)

    @FindBy (xpath = "//span[text()='Loans']")
    public WebElement Loanstab;

    @FindBy(xpath = "(//span[@class='menu-title'])[17]")
    public WebElement DueLoanstab;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement DueLoansPageYaziElementi;

    @FindBy (xpath = "//div[@class='table-responsive--lg table-responsive']")
    public WebElement DueLoansTabloElementi;

    @FindBy(xpath = "//span[@class='navbar-user__name']")
    public WebElement logoutmenu;

    @FindBy (xpath = "(//span[@class='dropdown-menu__caption'])[3]")
    public WebElement logoutbutton;

    @FindBy(xpath = "//span[text()='Manage Users']")
    public WebElement ManageUserslink;

    @FindBy(xpath = "//span[text()='Active Users']")
    public WebElement ActiveUserslink;

    @FindBy(xpath = "//h6[text()='Active Users']")
    public WebElement ActiveUsersYaziElementi;

    @FindBy(xpath = "(//tr[position()=1])[1]")
    public WebElement ActiveUsersListTitles;

    @FindBy(xpath="(//tbody/tr[1]/td[6]/div[1]/a[1])[1]" )
    public WebElement DetailsButton;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement UserDetail;

    @FindBy(xpath = "(//a[@class='widget-two__btn btn btn-outline--success'])[1]")
    public WebElement viewAllbutton;

    @FindBy(xpath = "//span[normalize-space()='Deposits']")
    public WebElement DepositsButton;

    @FindBy(xpath = "//div[@class='col-md-12']")
    public WebElement DepositHistoryListTitles;

    @FindBy(xpath ="(//a[@class='item-link'])[1]")
    public WebElement SuccessfulDepositElement;

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public WebElement SuccessfulDetailElement;

    @FindBy(xpath = "//div[@class='col-md-12']")
    public WebElement SuccessfulDepositsTableElement;

    @FindBy(xpath = "//span[text()='All Deposits']")
    public  WebElement AllDepositsButton;

    @FindBy(xpath = "//span[normalize-space()='Pending Deposits']")
    public WebElement PendingDeposits;

    @FindBy(xpath = "(//a[@class='item-link'])[3]")
    public WebElement RejectedDeposits;

    @FindBy(xpath = "(//a[@class='item-link'])[4]")
    public WebElement InitiatedDeposits;

    @FindBy(xpath = "//span[text()='Successful Deposits']")
    public  WebElement SuccessfulDeposits;

    @FindBy(xpath = "//input[@name='search']")
    public WebElement SuccessfulDepositsSearchBox;

    @FindBy(xpath = "//input[@id='date']")
    public WebElement SuccessfulDepositsDateSearchBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement SuccessfulDepositsSearchBoxSubmit;

    @FindBy(xpath = "//button[@class='btn btn--primary input-group-text']")
    public WebElement SuccessfulDepositsDateSearchBoxSubmit;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement PendingDepositsYaziElementi;

    @FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]")
    public WebElement PendingDepositsDetailsButton;
    //tbody/tr[1]/td[7]/a[1]

    @FindBy (xpath = "//tbody/tr[1]/td[7]/a[1]")
    public WebElement PendingDepositsDetailsButtonSamet;

    @FindBy(xpath = "//h5[@class='card-title mb-50 border-bottom pb-2']")
    public  WebElement PendingDepositsSuccessfulDetailsPage;

    @FindBy(xpath = "//button[@class='btn btn-outline--success btn-sm ms-1 confirmationBtn']")
    public WebElement ApprouveButton;

    @FindBy(xpath = "//button[@class='btn btn-outline--danger btn-sm ms-1 rejectBtn']")
    public WebElement RejectButton;

    @FindBy (xpath = "(//button[@type='submit'])[1]")
    public  WebElement RejectSubmitbutton;

    @FindBy (xpath = "//input[@id='search']")
    public WebElement PendingDepositsSearchTextBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement PendingDepositsSearchTextSubmitbutton;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement PendingDepositsYesButton;

    @FindBy(xpath = "//div[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public WebElement RequestApprouvedSuccessfully;

    @FindBy(xpath = "//div[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public WebElement RequestRejectedSuccessfully;

    @FindBy(xpath = "//textarea[@id='message']")
    public WebElement ReasonforRejectionBox;

    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement RequestXUSDTitle;

    @FindBy(xpath = "//div[@class='card-body']")
    public WebElement DepositCardViaManuel;

/////////

    @FindBy(xpath = "(//a[(text()='Deposit')])[1]")
    public WebElement UserpageDepositButtonElement;

    @FindBy(xpath = "//input[@name='amount']")
    public WebElement UserPageAmountElement;

    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement UserDepositSubmitButtonElement;

    @FindBy (xpath = "//select[@name=\"gateway\"]")
    public  WebElement UserDepositSelectGatewayElement;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement UserDepositPayNowButtonElement;

    @FindBy(xpath = "//a[@class='btn btn--md btn--base fw-bold w-100'][normalize-space()='Login']")
    public WebElement firstLogin;

    @FindBy(xpath = "//a[@href='javascript:void(0)']")
    public WebElement AllowYaziElementi;

    @FindBy(xpath = "//tbody/tr[1]/td[7]/a[1]")
    public  WebElement PendingDepositsDetailsButtonElement;

}
