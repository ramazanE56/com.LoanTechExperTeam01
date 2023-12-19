package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLoginPage {
    public AdminLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy(xpath = "//input[@*='username']")
    public WebElement adminUserNameBoxElement;

    @FindBy(xpath = "//input[@*='password']")
    public WebElement adminPasswordBoxElement;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminLoginButtonElement;


    @FindBy(xpath = "//input[@type='text']")
    public WebElement adminUserNameBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement adminPasswordBox;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement adminLoginButton;

    }

