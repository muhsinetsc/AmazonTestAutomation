package base;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseTest extends BaseLibrary {

    @BeforeMethod
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        options.addArguments("--incognito");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-infobars");

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}