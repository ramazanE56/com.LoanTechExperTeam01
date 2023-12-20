package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//img[@alt='viserhyip']")
    public WebElement loanTechLogoElement;

    @FindBy(xpath = "//a[normalize-space()='Get Started']")
    public WebElement getStartedButonElement;

    @FindBy(xpath = "//h2[normalize-space()='Register']")
    public WebElement registerTextElement;

    @FindBy(xpath = "//h3[@class = 'text-capitalize text-center mt-0 mb-4']")
    public WebElement WelcomeToLoantechExpertTextElement;


    @FindBy(xpath = "//*[@class='account d-none d-lg-block']")
    public WebElement firstLogin;
    //eyyup
    @FindBy(xpath = "//input[@name='username']")
    public WebElement userName;
    //eyyup
    @FindBy(xpath = "//input[@name='password']")
    public WebElement password;
    //eyyup
    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement login2;
    //eyyup

    @FindBy(xpath = "(//a[@href='https://qa.loantechexper.com/user/logout'])[1]")
    public WebElement logoutButton;
    //eyyup

    @FindBy(xpath = "//a[@href='javascript:void(0)']")
    public WebElement AllowYaziElementi;
    //eyyup
}
