package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

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

    @FindBy (xpath = "//*[text()='Loan Plans']")
    public  WebElement loanPlansTextElement;

    @FindBy (id = "pills-car-loan-tab")
    public  WebElement carLoanButtonElement;

    @FindBy (xpath = "(//*[text()='Personel Finance Loan'])[1]")
    public  WebElement personalFinanceLoanTextElement;

    @FindBy (xpath = "(//*[text()='Take Maximum'])[3]")
    public  WebElement takeMaximumTextElement;


    @FindBy (xpath = "(//*[text()='Apply Now                                        '])[3]")
    public  WebElement applyNowButtonElement;

    @FindBy (xpath = "(//*[text()='Apply Now                                        '])[6]")
    public  WebElement basicLoanapplyNowButtonElement;

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

    @FindBy (xpath = "//button[@type='submit']")
    public  WebElement confirmButtonElement;

    @FindBy (xpath = "(//button[@class='nav-link '])[2]")
    public  WebElement basicLoanButtonElement;

    @FindBy (xpath = "(//*[@class='caption'])[1]")
    public  WebElement planNameTxtElement;

    @FindBy (xpath = "(//*[@class='caption'])[2]")
    public  WebElement loanAmountTxtElement;

    @FindBy (xpath = "(//*[@class='caption'])[3]")
    public  WebElement totalInstallmenttTxtElement;

    @FindBy (xpath = "(//*[@class='caption'])[4]")
    public  WebElement perInstallmenttTxtElement;

    @FindBy (xpath = "(//*[@class='caption'])[5]")
    public  WebElement youllNeedToPayTxtElement;

    @FindBy (css = "div[class='card-body'] h4")
    public  WebElement applicationFeeTxtElement;

    @FindBy (xpath = "(//*[text()='Apply Now                                        '])[7]")
    public  WebElement applyNowTestLoanTxtElement;

    @FindBy (xpath = "//p[@class='caption-list-two p-3 bg--light']")
    public  WebElement underTheApplicationFormTxtBoxElement;

    @FindBy (xpath = "//button[@type='submit']")
    public  WebElement applyElement;





    public static WebElement webElementVariable(String amount) {
        WebElement element =  Driver.getDriver().findElement(By.xpath("//*[contains(text(),'" + amount + "')]"));
        return element;
    }




















    // ***************ÜMİT***********************//

    // DashBoardPage->

    @FindBy(xpath = "(//h5[@class='text-secondary'])[1]")
    public WebElement successfulDepositsYText;

    @FindBy(xpath = "(//*[@class='text--secondary my-4'])[1]")
    public WebElement successfulDepositsAmount;

    @FindBy(xpath = "(//h5[@class='text-secondary'])[2]")
    public WebElement successfulWithdrawalsText;

    @FindBy(xpath = "(//*[@class='text--secondary my-4'])[2]")
    public WebElement successfulWithdrawalsAmount;
    @FindBy(xpath = "(//h5[@class='text-secondary'])[3]")
    public WebElement totalLoanText;

    @FindBy(xpath = "(//*[@class='text--secondary my-4'])[3]")
    public WebElement totalLoanAmount;

    @FindBy(xpath = " /html/body/div[3]/div/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/p/small")
    public WebElement totalLoanNumber;


}
