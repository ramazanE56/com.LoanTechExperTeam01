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

    @FindBy (xpath = "//div[@id='dashboard-sidebar']//li[5]")
    public WebElement withdrawButton;

    @FindBy (xpath = "//h3[@class='mb-2']")
    public WebElement withdrawMoneyText;

    @FindBy (xpath = "//label[@for='method_code']")
    public WebElement methodText;

    @FindBy (xpath = "//*[@name='method_code']")
    public WebElement dropDownSelector;

    @FindBy (xpath = "//input[@name='amount']")
    public WebElement amountTextBox;

    @FindBy (xpath = "//ul[@class='list-group text-center']")
    public WebElement limitTable;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement withdrawSubmitButton;

    @FindBy (xpath = "//h5[normalize-space()='Withdraw Via Method 5 Updated']")
    public WebElement method5UpdatedText;

    @FindBy (xpath = "//button[normalize-space()='Submit']")
    public WebElement methodUpdatedSubmitButton;

    @FindBy (xpath = "//div[@class='iziToast-wrapper iziToast-wrapper-topRight']")
    public WebElement withdrawSuccesAlertMessage;

    @FindBy (xpath = "//a[@class='btn btn--base btn--smd']")
    public WebElement withdrawMoneyButton;

    @FindBy (xpath = "//div[@id='transactionAccordion']")
    public WebElement historyTable;

    @FindBy (xpath = "//h3[normalize-space()='Withdraw History']")
    public WebElement withdrawHistoryText;

    @FindBy (xpath = "//a[normalize-space()='Withdraw Log']")
    public WebElement withdrawLogButton;

    @FindBy (xpath = "//div[@class='accordion-collapse collapse show']")
    public WebElement transactionTable;



}
