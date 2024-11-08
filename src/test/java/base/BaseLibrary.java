package base;

import io.qameta.allure.Attachment;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;


public class BaseLibrary extends Data {

    public static WebDriver driver;


    @Attachment(value = "Screenshot", type = "image/png")
    public byte[] screenshot () {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    public WebElement waitForElementToBeVisible (By locator) {
        return new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void hoverOverElement (By locator) {
        new Actions(driver).moveToElement(waitForElementToBeVisible(locator)).perform();
    }

    public void moveToElement (By locator) {
        new Actions(driver).moveToElement(waitForElementToBeVisible(locator)).click().perform();
    }

    public void scrollUpToElement(By locator) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
                waitForElementToBeVisible(locator));
        new Actions(driver).moveToElement(driver.findElement(locator)).click().perform();
    }

    public void assertText (By locator, String message) {
        Assert.assertEquals(waitForElementToBeVisible(locator).getText(), message);
    }

    public void clickBuyIndex (int index) {
        waitForElementToBeVisible(By.cssSelector("[data-index='" + index + "']")).click();
    }

    public void assertTitleConntrol (String expectedTitle) {
        Assert.assertEquals(expectedTitle, driver.getTitle());
    }

    public void assertTitle (String expectedTitle) {
        Assert.assertTrue(driver.getTitle() != null && driver.getTitle().contains(expectedTitle));
    }
}