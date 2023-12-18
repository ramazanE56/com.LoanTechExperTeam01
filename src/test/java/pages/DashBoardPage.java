package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashBoardPage {
    public DashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // -------------------------------------------------------
    /* SUPHİ */
    @FindBy(xpath = "//a[text()='Profile']")
    public WebElement userProfileLinkElement;

    @FindBy(xpath = "//h3[@class='mb-2']")
    public WebElement profileSettingElement;

    @FindBy(xpath = "(//li[@class='list-group-item d-flex flex-column gap-1 aling-items-center'])[1]")
    public WebElement profileNameElement;

    @FindBy(xpath = "(//li[@class='list-group-item d-flex flex-column gap-1 aling-items-center'])[2]")
    public WebElement profileEmailElement;

    @FindBy(xpath = "(//li[@class='list-group-item d-flex flex-column gap-1 aling-items-center'])[3]")
    public WebElement profilePhoneElement;

    @FindBy(xpath = "(//li[@class='list-group-item d-flex flex-column gap-1 aling-items-center'])[4]")
    public WebElement profileCountryElement;


    @FindBy(xpath = "//input[@class='form-control form--control']")
    public  WebElement profileFirstNameBoxElement;


    @FindBy(xpath = "//input[@name='lastname']")
    public WebElement profileLastNameBoxElement;


    @FindBy(xpath = "//input[@name='zip']")
    public WebElement profileStateBoxElement;


    @FindBy(xpath = "//input[@name='zip']")
    public WebElement profileZipCodeBoxElement;



    @FindBy(xpath = "//input[@id='imageUpload']")
    public WebElement imageDosyaSecElement;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement profileSettingSubmitButtonElement;

    @FindBy(xpath = "//div[@class='iziToast-texts']")
    public WebElement profileUpdatedSuccessfullyElement;

    @FindBy(xpath ="//input[@name='firstname']")
    public WebElement firsnameBoxElement;

    @FindBy(xpath ="//input[@name='lastname']")
    public WebElement lastnameBoxElement;

    @FindBy(xpath ="//input[@name='state']")
    public WebElement stateBoxElement;

    @FindBy(xpath ="//*[text()='Profile']")
    public WebElement profileTabElement;

    @FindBy(xpath ="//input[@name='zip']")
    public WebElement zipBoxElement;

    @FindBy(xpath ="//input[@name='city']")
    public WebElement cityBoxElement;
    @FindBy(xpath ="//input[@name='address']")
    public WebElement addressBoxElement;

    @FindBy(xpath ="(//input[@class='form-control form--control'])[6]")
    public WebElement chooseFileElement;

    @FindBy(xpath ="//button[@type='submit']")
    public WebElement submitButtonElement;
    @FindBy(xpath = "//a[@href='javascript:void(0)']")
    public WebElement AllowYaziElementi;




    @FindBy (xpath = "//div[@id='dashboard-sidebar']//li[10]")
    public WebElement changePasswordButton;

    @FindBy (xpath = "//div[@class='mb-4']")
    public WebElement changePasswordText;

    @FindBy (xpath = "//input[@id='current_password']")
    public WebElement currentPasswordTextBox;

    @FindBy (xpath = "//input[@id='password']")
    public  WebElement newPasswordTextBox;

    @FindBy (xpath = "//input[@id='password_confirmation']")
    public WebElement confirmPasswordTextBox;

    @FindBy (xpath = "//button[normalize-space()='Submit']")
    public WebElement changePasswordSubmitButton;

    @FindBy (xpath = "//p[@class='iziToast-message slideIn']")
    public  WebElement changeMessageWarningMessage;

    @FindBy (xpath = "//div[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public  WebElement changeMessageSuccefullyMessage;


    @FindBy (xpath = "//div[@id='dashboard-sidebar']//li[5]")
    public WebElement withdrawButton;

    @FindBy (xpath = "//h3[@class='mb-2']")
    public WebElement withdrawMoneyText;

    @FindBy (xpath = "//label[@for='method_code']")
    public WebElement methodText;

    @FindBy (xpath = "//*[@name='method_code']")
    public WebElement dropDownSelector;


}
