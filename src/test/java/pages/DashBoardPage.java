package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class DashBoardPage {
    public DashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[@class='menu-title'])[2]")
    public WebElement menageUsersLink;
    //eyyup

    @FindBy(xpath = "(//span[@class='menu-title'])[3]")
    public WebElement activeUserLink;
    //eyyup


    @FindBy(xpath = "//div[@class='bodywrapper__inner']")
    public WebElement activeUserList;
    //eyyup

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary'][normalize-space()='Details'])[1]")
    public WebElement detailsButton;
    //eyyup


    @FindBy(xpath = "//h6[@class='page-title']")
    public WebElement userDetailButton;
    //eyyup

    @FindBy(xpath = "//div[@class='row justify-content-center']")
    public WebElement listenHeaders;
    //eyyup


    @FindBy(xpath = "(//a[@class='widget-two__btn btn btn-outline--danger'])[1]")
    public WebElement viewAllButton;
    //eyyup


    @FindBy(xpath = "(//a[@class='item-link'])[1]")
    public WebElement approvedwithdrawals;
    //eyyup


    @FindBy(xpath = "(//a[@class='item-link'])[2]")
    public WebElement pendingwithdrawals;
    //eyyup



    @FindBy(xpath = "(//a[@class='item-link'])[3]")
    public WebElement rejectedwithdrawals;
    //eyyup

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public WebElement approvvedDetailsbutton;
    //eyyup


    @FindBy(xpath = "//ul[@class='list-group']")
    public List <WebElement> approvedUserInformation;
    //eyyup


    @FindBy(xpath = "(//span[@class='badge badge--warning'])[1]")
    public WebElement statusPending;
    //eyyup

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public WebElement pendingDetailsButton;
    //eyyup

    @FindBy(xpath = "//button[@class='btn btn-outline--success ms-1 approveBtn']")
    public WebElement pendingApproveButton;
    //eyyup


    @FindBy(xpath = "//button[@class='btn btn-outline--danger ms-1 rejectBtn']")
    public WebElement pendingRejectButton;
    //eyyup


    @FindBy(xpath = "(//textarea[@class='form-control pt-3'])[2]")
    public WebElement pendingRejecttext;
    //eyyup

    @FindBy(xpath = "(//button[@class='btn btn--primary w-100 h-45'])[2]")
    public WebElement pendingRejectSubmit;
    //eyyup

    @FindBy(xpath = "//*[text()='Withdrawal rejected successfully']")
    public WebElement pendingRejecdetsuccessfully;
    //eyyup


    @FindBy(xpath = "(//textarea[@class='form-control pt-3'])[1]")
    public WebElement pendingApproveText;
    //eyyup

    @FindBy(xpath = "(//button[@class='btn btn--primary w-100 h-45'])[1]")
    public WebElement pendingApproveSubmit;
    //eyyup

    @FindBy(xpath = "//*[text()='Withdrawal approved successfully']")
    public WebElement pendingapprovedsuccesfully;
    //eyyup


    @FindBy(xpath = "(//span[@class='badge badge--danger'])[1]")
    public WebElement statusRejected;
    //eyyup

    @FindBy(xpath = "(//a[@class='btn btn-sm btn-outline--primary ms-1'])[1]")
    public WebElement rejectWithdravalsDetails;
    //eyyup

    @FindBy(xpath = "(//div[@class='card-body'])[1]")
    public  List< WebElement> rejectCardinformation;
    //eyyup



}
