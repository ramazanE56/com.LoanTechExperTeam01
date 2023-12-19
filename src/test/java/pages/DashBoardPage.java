package pages;

import org.openqa.selenium.By;
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
    public WebElement allowTextElement;




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

    @FindBy (xpath = "//a[@href='https://qa.loantechexper.com/user/loan/plans']")
    public  WebElement takeLoanTabElement;

    @FindBy (tagName = "Loan Plans")
    public  WebElement loanPlansTextElement;

    @FindBy (id = "pills-car-loan-tab")
    public  WebElement carLoanButtonElement;

    @FindBy (xpath = "(//*[text()='Personel Finance Loan'])[1]")
    public  WebElement personalFinanceLoanTextElement;

    @FindBy (xpath = "(//*[text()='Take Maximum'])[3]")
    public  WebElement takeMaximumTextElement;


    @FindBy (xpath = "(//*[text()='Apply Now                                        '])[3]")
    public  WebElement applyNowButtonElement;

    @FindBy (xpath = "(//*[text()='Take Minimum'])[3]")
    public  WebElement takeMinimumElement;

    @FindBy (xpath = "//*[text()='$2,000.00']")
    public  WebElement $200000TextElement;

    @FindBy (xpath = "(//*[text()='Per Installment'])[3]")
    public  WebElement perInstallmentTextElement;

    @FindBy (xpath = "(//*[text()='6%'])[2]")
    public  WebElement text6PerElement;

    @FindBy (xpath = "(//*[text()='Installment Interval'])[3]")
    public  WebElement InstallmentIntervalTxtElement;

    @FindBy (xpath = "(//span[@class='plan-feature-list-amount'])[8]")
    public  WebElement days20TxtElement;

    @FindBy (xpath = "(//*[text()=' Total Installment'])[3]")
    public  WebElement totalInstallmentTxtElement;

    @FindBy (xpath = "(//*[text()='20'])[1]")
    public  WebElement text20TxtElement;

    @FindBy (xpath = "//h5[@id='exampleModalLabel']")
    public  WebElement applyForPersonalLoanTxtElement;

    @FindBy (xpath = "//h5[text()='Application Form']")
    public  WebElement applicationFormTxtElement;

    @FindBy (xpath = "//input[@placeholder='Enter An Amount']")
    public  WebElement enterAnAmountBoxElement;



    public static WebElement webElementVariable(String amount) {
        WebElement element =  Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + amount + "')]"));
        return element;
    }

}
