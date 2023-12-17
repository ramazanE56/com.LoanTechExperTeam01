package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DashBoardPage {
    public DashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

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


}
