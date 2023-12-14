package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AdminLoginPage {
    private AdminLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
