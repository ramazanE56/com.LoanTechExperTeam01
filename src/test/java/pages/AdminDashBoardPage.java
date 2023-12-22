package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminDashBoardPage {
    public AdminDashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

// ---- Arif Emre US49 ----
    @FindBy(xpath = "//*[@name=\"username\"]")
    public WebElement userNameElementi;
    @FindBy(xpath = "//*[@name=\"password\"]")
    public WebElement adminpasswordElementi;
    @FindBy(xpath = "//*[@class=\"btn cmn-btn w-100\"]")
    public WebElement adminLoginElementi;
    @FindBy(xpath = "(//*[@class=\"menu-title\"])[2]")
    public WebElement manegeUsersElementi;
    @FindBy(xpath = "//*[@href=\"https://qa.loantechexper.com/admin/users/with-balance\"]")
    public WebElement withBalanceElementi;
    @FindBy(xpath = "//tbody")
    public WebElement listElement;
    @FindBy(xpath = "//*[@class=\"form-control bg--white\"]")
    public WebElement searchBoxElementi;
    @FindBy(xpath = "(//*[@class=\"btn btn-sm btn-outline--primary\"])[2]")
    public WebElement detailsElementi;
    @FindBy(xpath = "//*[@class=\"page-title\"]")
    public WebElement userDetailElementi;

    // ---- US36 LOCATE ----
    @FindBy(xpath = "(//*[@class=\"nav-link \"])[3]")
    public WebElement loanPlansElementi;
    @FindBy(xpath = "//*[@class=\"bodywrapper__inner\"]")
    public WebElement loansPlanElementi;
    @FindBy(xpath = "(//*[tr])[1]")
    public WebElement trElementi;
    @FindBy(xpath = "(//*[@class=\"btn btn-sm btn-outline--primary\"])[1]")
    public WebElement addNewElementi;
    @FindBy(xpath = "(//*[@class=\"form-control\"])[1]")
    public WebElement planNameElementi;
    @FindBy(xpath = "//button[normalize-space()='Submit']")
    public WebElement submitBElement;
    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement iziElement;
    @FindBy(xpath = "(//*[@class=\"btn btn-sm btn-outline--primary\"])[2]")
    public WebElement editElementi;
    @FindBy(xpath = "(//*[@class=\"card-body\"])[1]")
    public WebElement cardBody;
    @FindBy(xpath = "(//*[@class=\"btn btn-sm confirmationBtn btn-outline--danger\"])[1]")
    public WebElement disable;
    @FindBy(xpath = "(//*[@class=\"btn btn--primary\"])[2]")
    public WebElement yes;
    @FindBy(xpath = "//div[@class='iziToast-texts']")
    public WebElement disabledelete;
    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement hataMesaj;
    @FindBy(xpath = "(//*[@class=\"form-control\"])[4]")
    public WebElement maxAmount;
    @FindBy(xpath = "//*[@class=\"form-control bg--white\"]")
    public WebElement searchLoansPlan;
    @FindBy(xpath = "//*[@style=\"width: 999px; margin: 4px; min-height: 182px; overflow: hidden;\"]")
    public WebElement instructionboxElement;
    @FindBy(xpath = "(//*[@class=\"form-control\"])[3]")
    public WebElement minAmountElement;


}
