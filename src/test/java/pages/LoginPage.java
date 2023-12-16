package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.List;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id = "username")
    public WebElement userNameBoxElement;

    @FindBy(id = "email")
    public WebElement emailBoxElement;

    @FindBy(xpath = "//div[@class='nice-select']")
    public WebElement countryDropDownElement;

    @FindBy(xpath = "//input[@name='mobile']")
    public WebElement mobileNumberElement;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordElement;

    @FindBy(xpath = "//input[@name='password_confirmation']")
    public WebElement confirmPasswordElement;

    @FindBy(xpath = "//li[@data-value='France']")
    public WebElement countryDropDownSelectedElement;

}
