package pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
public class AdminLoginPage {
    public AdminLoginPage(){

        PageFactory.initElements(Driver.getDriver(),this);

    }
    @FindBy(xpath = "//*[@name='username']")
    public WebElement usernameBox;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement loginButton;
    @FindBy(xpath = "//span[text()='Manage Users']")
    public WebElement manageUsersButton;
    @FindBy(xpath = "(//*[text()='Active Users'])[1]")
    public WebElement activeUsersButton;

    @FindBy(xpath = "//*[@class='btn btn-sm btn-outline--primary']")
    public WebElement detailsButton;
    @FindBy(xpath = "//*[@type='submit']")
    public WebElement enterbutton;
    @FindBy(xpath = "(//*[@type='search'])[2]")
    public WebElement searchBox;

    @FindBy(xpath = "//*[text()='User Detail - mehmethalit']")
    public WebElement userDetailPage;

    @FindBy(xpath = "//*[text()='User']")
    public WebElement headerUser;
    @FindBy(xpath = "//*[text()='Email-Phone']")
    public WebElement headerEmailPhone;

    @FindBy(xpath = "//*[text()='Country']")
    public WebElement headerCountry;

    @FindBy(xpath = "//*[text()='Joined At']")
    public WebElement headerDate;
    @FindBy(xpath = "//*[text()='Balance']")
    public WebElement headerBalance;
    @FindBy(xpath = "//*[text()='Action']")
    public WebElement headerAction;

    @FindBy(xpath = "(//*[@class='page-link'])[11]")
    public WebElement secondPage;
    @FindBy(xpath = "//*[@class='bodywrapper__inner']")
    public WebElement activeUserList;
    @FindBy(xpath = "(//*[text()='View All'])[1]")
    public WebElement viewAllIcon;
    @FindBy(xpath = "//*[text()='Transaction Logs']")
    public WebElement transactionLogsPage;
    @FindBy(xpath = "//*[text()='User']")
    public WebElement titleTransactionUser;
    @FindBy(xpath = "//*[text()='TRX']")
    public WebElement titleTransactionTRX;
    @FindBy(xpath = "//*[text()='Transacted']")
    public WebElement titleTransactionTransacted;
    @FindBy(xpath = "//*[text()='Amount']")
    public WebElement titleTransactionAmount;
    @FindBy(xpath = "//*[text()='Post Balance']")
    public WebElement titleTransactionBalance;
    @FindBy(xpath = "//*[text()='Details']")
    public WebElement titleTransactionDetails;
    @FindBy(xpath = "//*[@name='date']")
    public WebElement dateTransaction;
    @FindBy(xpath = "//*[@name='search']")
    public WebElement searcTransaction;
    @FindBy(xpath = "//*[@name='trx_type']")
    public WebElement typeTransaction;
    @FindBy(xpath = "//*[@name='remark']")
    public WebElement remarkTransaction;

    @FindBy(xpath = "//input[@type='text']")
    public WebElement adminUserNameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement adminPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminLoginButton;

}









