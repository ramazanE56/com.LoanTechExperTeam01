package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

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
}
