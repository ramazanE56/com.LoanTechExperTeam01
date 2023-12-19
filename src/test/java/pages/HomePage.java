package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
public HomePage(){
    PageFactory.initElements(Driver.getDriver(),this);
}

@FindBy(xpath = "//img[@alt='viserhyip']")
    public WebElement loanTechLogoElement;

@FindBy(xpath= "//a[normalize-space()='Get Started']")
    public WebElement getStartedButonElement;

@FindBy(xpath= "//h2[normalize-space()='Register']")
    public WebElement registerTextElement;

@FindBy(xpath= "//h3[@class = 'text-capitalize text-center mt-0 mb-4']")
    public WebElement WelcomeToLoantechExpertTextElement;

@FindBy (xpath = "//a[normalize-space()='Login']")
    public WebElement LoginIcon;

@FindBy (xpath = "//input[@id='username']")
    public WebElement usernameTextBox;

@FindBy (xpath = "//input[@id='password']")
    public WebElement passwordTextBox;

@FindBy (xpath = "//button[normalize-space()='Login']")
    public WebElement LoginButton;


    // Home page Login (Halit)

    @FindBy(xpath = "//a[@class='btn btn--base btn--xl w-100 policy']")
    public WebElement cocies;
    @FindBy(xpath = "(//*[@class='btn btn--md btn--base fw-bold w-100'])[2]")
    public WebElement loginButton;
    @FindBy(xpath = "//*[@name='username']")
    public WebElement emailBox;
    @FindBy(xpath = "//*[@name='password']")
    public WebElement passwordBox;
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement loginbutton2;
    @FindBy(xpath = "(//a[@class='logo'])[1]")
    public WebElement homePageLogo;
    @FindBy(xpath = "(//*[@class='btn btn--md btn--base fw-bold w-100'])[2]")
    public WebElement homePageDashboard;
    @FindBy(xpath = "(//*[@class='mb-0 vf-info-list__text'])[1]")
    public WebElement emailInformation;
    @FindBy(xpath = "(//*[@class='mb-0 vf-info-list__text'])[2]")
    public WebElement addressInformation;
    @FindBy(xpath = "//*[@class='mb-0 fw-md vf-info-list__text']")
    public WebElement phoneInformation;
    @FindBy(xpath = "(//*[@class='nav-item'])[1]")
    public WebElement userHomeButton;
    @FindBy(xpath = "(//*[@class='nav-item'])[2]")
    public WebElement userAboutButton;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement aboutText;
    @FindBy(xpath = "(//*[@class='nav-item'])[3]")
    public WebElement userPlansButton;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement plansText;
    @FindBy(xpath = "(//*[@class='nav-item'])[4]")
    public WebElement userBlogsButton;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement blogsText;
    @FindBy(xpath = "(//*[@class='nav-item'])[5]")
    public WebElement userContactButton;
    @FindBy(xpath = "(//h2)[1]")
    public WebElement contactText;

    @FindBy(xpath = "//h2")
    public WebElement loginText;
    @FindBy(xpath = "//*[@class='btn btn--xl xl-text btn--base btn--outline mt-3']")
    public WebElement userGetStartedButton;
    @FindBy(xpath = "//*[text()='ACCOUNT BALANCE']")
    public WebElement getStartedPage;
    @FindBy(xpath = "//*[@id='pills-basic-loan-tab']")
    public WebElement basicLoanCard;
    @FindBy(xpath = "(//*[@class='plan-name'])[5]")
    public WebElement titleBasicLoan1;
    @FindBy(xpath = "(//*[@class='plan-name'])[6]")
    public WebElement titleCarLoan;
    @FindBy(xpath = "(//*[@class='plan-name'])[7]")
    public WebElement titleTestLoan;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/button[1]")
    public WebElement applyNowButton;
    @FindBy(xpath = "//*[@class='modal-header']")
    public WebElement basicLoan1Page;
    @FindBy(xpath = "//*[@name='amount']")
    public WebElement amountBox;
    @FindBy(xpath = "//input[@type='number']")
    public WebElement concainerType;
    @FindBy (xpath = "(//*[@type='submit'])[2]")
    public WebElement comfirmButton;
    @FindBy (xpath = "//*[text()='Application Form']")
    public WebElement applicationFormButton;
    @FindBy (xpath = "//*[@type='submit']")
    public WebElement applyButton;
    @FindBy (xpath = "//*[text()='Loan application submitted successfully']")
    public WebElement mesaggeText;









}
