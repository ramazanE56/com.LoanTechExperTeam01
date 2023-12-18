package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLoginPage {
    public AdminLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    // AdminLoginPage (Samet)

    @FindBy (xpath = "//input[@type=\"text\"]")
    public WebElement Usernametextbox;

    @FindBy (xpath = "//input[@type=\"password\"]")
    public WebElement Passwordtextbox;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement Loginbutton;

    @FindBy(xpath = "(//img[@alt='image'])[1]")
    public WebElement logo;

    @FindBy(xpath = "//span[@class='navbar-user__name']")
    public WebElement logoutmenu;

    @FindBy (xpath = "(//span[@class='dropdown-menu__caption'])[3]")
    public WebElement logoutbutton;

}
