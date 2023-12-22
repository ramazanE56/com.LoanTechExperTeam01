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

// ---- Arif Emre Home Page ----
@FindBy(xpath = "(//*[@href=\"https://qa.loantechexper.com/contact\"])[1]")
    public WebElement contactElementi;

@FindBy(xpath = "//*[@class=\"hero__content-title text-capitalize t-text-white\"]")
    public WebElement contactUsGorunumElementi;

@FindBy(xpath = "//*[@aria-current=\"page\"]")
    public WebElement homeElementi;

@FindBy(xpath = "//*[@class=\"footer\"]")
    public WebElement footerElementi;
@FindBy(xpath = "(//*[@class=\"t-link t-link--primary t-text-white text-capitalize\"])[3]")
    public WebElement contactUsElementi;
@FindBy(xpath = "//*[@class=\"address\"]")
    public WebElement adresBilgisiElementi;
@FindBy(xpath = "(//*[@class=\"d-flex align-items-center bg--light-1 p-3 p-lg-4\"])[1]")
    public WebElement officeAddressElementi;
@FindBy(xpath = "(//*[@class=\"d-flex align-items-center bg--light-1 p-3 p-lg-4\"])[2]")
    public WebElement emailAddressElementi;
@FindBy(xpath = "(//*[@class=\"d-flex align-items-center bg--light-1 p-3 p-lg-4\"])[3]")
    public WebElement mobileNumberElementi;
@FindBy(xpath = "//*[@class=\"query bg--light-1\"]")
    public WebElement sendYourMessagesElementi;
@FindBy(xpath = "(//*[@type=\"text\"])[1]")
    public WebElement yourNameBoxElementi;
@FindBy(xpath = "(//*[@type=\"email\"])[1]")
    public WebElement emailAddressBoxElementi;
@FindBy(xpath = "//*[@id=\"subject\"]")
    public WebElement subjectBoxElementi;
@FindBy(xpath = "//*[@name=\"message\"]")
    public WebElement writeYourMessageBoxElementi;
@FindBy(xpath = "(//*[@type=\"submit\"])[1]")
    public WebElement sendMessageButonElementi;
@FindBy(xpath = ("//p[@class='iziToast-message slideIn']"))
    public WebElement ticketCreatedSuccessfullyElementi;

@FindBy(xpath = "//*[@href=\"javascript:void(0)\"]")
    public WebElement cookiesElementi;
@FindBy(xpath = "(//iframe)[1]")
    public WebElement iframeElementi;


}
