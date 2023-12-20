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

}
