package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.nio.file.WatchEvent;

public class DashBoardPage {
    public DashBoardPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//*[@class=\"auth-form__input\"])[1]")
    public WebElement userNameElementi;
    @FindBy (xpath = "//*[@placeholder=\"Your password\"]")
    public WebElement userPasswordElementi;
    @FindBy(xpath = "//*[@class=\"btn btn--base btn--xxl w-100 text-capitalize xl-text\"]")
    public WebElement loginButtonElementi;
    @FindBy (xpath = "(//*[@href=\"https://qa.loantechexper.com/user/deposit\"])[2]")
    public WebElement depositElementi;
    @FindBy(xpath = "//*[@class=\"mb-2\"]")
    public WebElement depositMethodsGorunum;
    @FindBy(xpath = "//*[@class=\"btn btn--base btn--smd\"]")
    public WebElement depositHistoryElementi;
    @FindBy(xpath = "//*[@class=\"accordion table--acordion\"]")
    public WebElement akordiyonElement;
    @FindBy(xpath = "//*[@class=\"btn btn--base btn--smd\"]")
    public WebElement depositNowElementi;
    @FindBy(xpath = "//*[@class=\"form--control form-select\"]")
    public WebElement selectGatewayElementi;
    @FindBy(xpath = "//*[@class=\"form-control form--control\"]")
    public WebElement amountElementi;
    @FindBy(xpath = "//*[@class=\"list-group\"]")
    public WebElement limitElement;
    @FindBy(xpath = "//*[@class=\"btn btn--base w-100 mt-3\"]")
    public WebElement submitButton;
    @FindBy(xpath = "//*[@class=\"text-center mt-2\"]")
    public WebElement youhaveElementi;
    @FindBy(xpath = "//*[@class=\"btn btn--base w-100\"]")
    public WebElement payNow;
    @FindBy(xpath = "//p[@class='iziToast-message slideIn']")
    public WebElement youHaveDepositElementi;
}
