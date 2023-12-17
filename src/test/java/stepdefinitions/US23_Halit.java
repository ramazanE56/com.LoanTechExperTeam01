package stepdefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.JavascriptExecutor;
import pages.HomePage;
import utilities.ConfigReader;
import utilities.Driver;

public class US23_Halit {

    HomePage homePage = new HomePage();
    JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


    @Given("The user goes to the given {string}.")
    public void theUserGoesToTheGiven(String url) {

        Driver.getDriver().get(ConfigReader.getProperty(url));
    }



}

