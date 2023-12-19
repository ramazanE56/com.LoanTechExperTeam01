package utilities;
import com.github.javafaker.Faker;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;

import java.awt.*;




import java.awt.Point;

import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.function.Function;

public class ReusableMethods {
    private static int timeout = 5;

    public static String getScreenshot(String name) throws IOException {
        // naming the screenshot with the current date to avoid duplication
        String date = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

        // TakesScreenshot is an interface of selenium that takes the screenshot
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File source = ts.getScreenshotAs(OutputType.FILE);
        // full path to the screenshot location
        String target = System.getProperty("user.dir") + "/raporlar/Screenshots/" + name + date + ".png";

        File finalDestination = new File(target);
        // save the screenshot to the path given
        FileUtils.copyFile(source, finalDestination);

        return target;
    }


    //========Switching Window=====//
    public static void switchToWindow(String targetTitle) {
        String origin = Driver.getDriver().getWindowHandle();
        for (String handle : Driver.getDriver().getWindowHandles()) {
            Driver.getDriver().switchTo().window(handle);
            if (Driver.getDriver().getTitle().equals(targetTitle)) {
                return;
            }
        }
        Driver.getDriver().switchTo().window(origin);
    }


    //========Hover Over=====//
    public static void hover(WebElement element) {
        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(element).perform();
    }



    //==========Return a list of string given a list of Web Element====////
    public static List<String> getElementsText(List<WebElement> list) {
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : list) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }


    //========Returns the Text of the element given an element locator==//
    public static List<String> getElementsText(By locator) {
        List<WebElement> elems = Driver.getDriver().findElements(locator);
        List<String> elemTexts = new ArrayList<>();
        for (WebElement el : elems) {
            if (!el.getText().isEmpty()) {
                elemTexts.add(el.getText());
            }
        }
        return elemTexts;
    }


    //===============Thread.sleep Wait==============//
    public static void waitFor(int sec) {
        try {
            Thread.sleep(sec * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    //===============Explicit Wait==============//
    public static WebElement waitForVisibility(WebElement element, int timeToWaitInSec) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeToWaitInSec));
        return wait.until(ExpectedConditions.visibilityOf(element));
    }


    public static void waitForPageToLoad(long timeOutInSeconds) {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driver) {
                return ((JavascriptExecutor) driver).executeScript("return document.readyState").equals("complete");
            }
        };
        try {
            System.out.println("Waiting for page to load...");
            WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
            wait.until(expectation);
        } catch (Throwable error) {
            System.out.println(
                    "Timeout waiting for Page Load Request to complete after " + timeOutInSeconds + " seconds");
        }
    }


    //======Fluent Wait====//
    public static WebElement fluentWait(final WebElement webElement, int timeinsec) {
        FluentWait<WebDriver> wait = new FluentWait<WebDriver>(Driver.getDriver())
                .withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(15))
                .ignoring(NoSuchElementException.class);
        WebElement element = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return webElement;
            }
        });
        return element;
    }



    /**
     * Performs double click action on an element
     * @param element
     */
    public static void doubleClick(WebElement element) {
        new Actions(Driver.getDriver()).doubleClick(element).build().perform();
    }



    /**
     * @param element
     * @param check
     */
    public static void selectCheckBox(WebElement element, boolean check) {
        if (check) {
            if (!element.isSelected()) {
                element.click();
            }
        } else {
            if (element.isSelected()) {
                element.click();
            }
        }
    }


    /**
     * Selects a random value from a dropdown list and returns the selected Web Element
     * @param select
     * @return
     */
    public static WebElement selectRandomTextFromDropdown(Select select) {
        Random random = new Random();
        List<WebElement> weblist = select.getOptions();
        int optionIndex = 1 + random.nextInt(weblist.size() - 1);
        select.selectByIndex(optionIndex);
        return select.getFirstSelectedOption();
    }

    public static void waitAndClick(WebElement element, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }


    public static void waitAndClick(WebElement element) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.click();
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }


    public static void waitAndSendText(WebElement element, String text, int timeout) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }


    public static void waitAndSendText(WebElement element, String text) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }


    public static void waitAndSendTextWithDefaultTime(WebElement element, String text) {
        for (int i = 0; i < timeout; i++) {
            try {
                element.sendKeys(text);
                return;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
    }

    public static String waitAndGetText(WebElement element, int timeout) {
        String text = "";
        for (int i = 0; i < timeout; i++) {
            try {
                text = element.getText();
                return text;
            } catch (WebDriverException e) {
                wait(1);
            }
        }
        return null;
    }


    public static void wait2(int sec) {
        try {
            Thread.sleep(1000 * sec);
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        } catch (ElementClickInterceptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //5 seconds
    public static void waitAndClickElement(WebElement element, int seconds) {
        for (int i = 0; i < seconds; i++) {

            try {
                element.click();
                break;
            } catch (Exception e) {
                wait2(1);
            }
        }
    }

    public static void wait(int secs) {

        try {
            Thread.sleep(1000 * secs);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (TimeoutException e) {
            e.printStackTrace();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
        } catch (StaleElementReferenceException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static WebElement waitForVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static Boolean waitForInVisibility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickablility(WebElement element, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static WebElement waitForClickablility(By locator, int timeout) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(timeout));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public static void executeJScommand(WebElement element, String command) {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript(command, element);
    }


    public static void selectAnItemFromDropdown(WebElement item, String selectableItem) {
        wait(5);
        Select select = new Select(item);
        for (int i = 0; i < select.getOptions().size(); i++) {
            if (select.getOptions().get(i).getText().equalsIgnoreCase(selectableItem)) {
                select.getOptions().get(i).click();
                break;
            }
        }
    }


    /**
     * Clicks on an element using JavaScript
     *
     * @param element
     */
    public static void clickWithJS(WebElement element) {
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", element);
        ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", element);
    }


    /**
     * Clicks on an element using JavaScript
     *
     * @param elements
     */
    public static void clickWithJSAsList(List<WebElement> elements) {
        for (WebElement each : elements) {
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].scrollIntoView(true);", waitForVisibility(each, 5));
            ((JavascriptExecutor) Driver.getDriver()).executeScript("arguments[0].click();", each);
        }
    }


    public static void selectByVisibleText(WebElement element, String text) {
        Select objSelect = new Select(element);
        objSelect.selectByVisibleText(text);
    }


    public static void selectByIndex(WebElement element, int index) {
        Select objSelect = new Select(element);
        objSelect.selectByIndex(index);
    }


    public static void selectByValue(WebElement element, String value) {
        Select objSelect = new Select(element);
        List<WebElement> elementCount = objSelect.getOptions();
        objSelect.selectByValue(value);
        System.out.println("number of elements: " + elementCount.size());
    }


    public static void sleep(int timeOut) {
        try {
            Thread.sleep(timeOut);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void waitAndClickLocationText(WebElement element, String value) {
        Driver.getDriver().findElement(By.xpath("//*[text()='" + value + "']")).click();
    }
//faker classından minumum 6 karakterli username üreten method(6 değişken)
public static String fakerUsernameMinValue(int x) {
    Faker faker = new Faker();
    String username;
    do {
        username = faker.regexify("[a-z0-9]{" + x + "}");
    } while (!isValidUsername(username));
    System.out.println("Username: " + username);
    return username;
}

    public static boolean isValidUsername(String username) {
        // Özel karakter ve büyük harf içermemesi gerekiyor
        return !username.matches(".*[A-Z].*") && !username.matches(".*[^a-z0-9].*");
    }


    //faker classından max 14 karakterli username üreten method(14 değişken)
    public static String fakerPhoneNumberMaxValue(int x){
        Faker faker = new Faker();
        StringBuilder phoneNumber = new StringBuilder();
        while (phoneNumber.length() < x) {
            phoneNumber.append(faker.random().nextInt(10));
        }
        String phoneNumberString = phoneNumber.toString();
        System.out.println("PhoneNumber : " + phoneNumberString);
        return phoneNumberString;
    }
    public static String passwordUnique(int x) {
        if (x < 6 || x > 10) {
            throw new IllegalArgumentException("Şifre uzunluğu 6 ile 10 arasında olmalıdır.");
        }

        Faker faker = new Faker();
        String password;
        do {
            password = faker.internet().password(6, 10, true, true, true);
        } while (!isValidPassword(password));
        System.out.println("Password: " + password);
        return password;
    }

    public static boolean isValidPassword(String password) {
        // En az bir büyük harf, bir sayı, bir küçük harf ve bir özel karakter içermesi gerekiyor
        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowercase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true;
            }
        }
        return hasUppercase && hasLowercase && hasDigit && hasSpecialChar;
    }

    //mouse'un bulunduğu noktanın koordinatını alma methodu
    public static void coordidanateFind() {
            wait(2);
            Point point = MouseInfo.getPointerInfo().getLocation();
            int x = (int) point.getX();
            int y = (int) point.getY();
            System.out.println("Mouse coordinates: " + x + ", " + y);

    }
    //resim yükleme methodu

    public static void photoUpdateInPc(int chooseFilex,int chooseFiley,int searchBarx,int searchBary , String photoLocateInPc, int photox, int photoy,int openx,int openy ) throws AWTException, InterruptedException {
        Point point2 = new Point(chooseFilex,chooseFiley);
        Robot robot = new Robot();
        robot.mouseMove(point2.x, point2.y);
        wait(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama yap
        wait(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama bırak
        wait(1);
        // C: arama çubuğu koordinatı
        Point point = new Point(searchBarx,searchBary);
        robot.mouseMove(point.x, point.y); // Farenin konumunu ayarla
        wait(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama yap
        wait(1);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama bırak
        wait(1);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ENTER).perform();
        // Ctrl+V tuş kombinasyonunu kullanarak dosya yolunu yapıştır
        StringSelection stringSelection = new StringSelection(photoLocateInPc);
        Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        // Enter tuşunu kullanarak dosya yolunu onayla
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
        // gelen logoya tıklama işlemi
        Point point1 = new Point(photox,photoy);// logo konumu koordinatı
        robot.mouseMove(point1.x, point1.y); // Farenin konumunu ayarla
        wait(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama yap
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama bırak
        wait(2);
        Point point3 = new Point(openx,openy);// logo konumu koordinatı
        robot.mouseMove(point3.x, point3.y); // Farenin konumunu ayarla
        wait(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama yap
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama bırak
        wait(2);


    }

    public static void coordinateClick(int x,int y) throws AWTException {
        Point point = new Point(x,y);
        Robot robot = new Robot();
        robot.mouseMove(point.x, point.y); // Farenin konumunu ayarla
        wait(1);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama yap
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK); // Sol tıklama bırak
        wait(1);
    }
// girilen min max aralığında random sayı üreten methodlar.
    public static int minMaxRandomAmountCreate(int minAmount, int maxAmount) {
        int min = minAmount;
        int max = maxAmount;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        return randomNumber;
    }
    public static String minMaxRandomAmountCreate(String minAmount, String maxAmount) {
        int min = Integer.parseInt(minAmount);
        int max = Integer.parseInt(maxAmount);
        Random random = new Random();
        int randomNumberInt = random.nextInt(max - min + 1) + min;
        String randomNumber = String.valueOf(randomNumberInt);
        return randomNumber;
    }



}