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


}
