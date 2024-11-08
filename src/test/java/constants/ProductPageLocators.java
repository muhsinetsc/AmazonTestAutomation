package constants;

import org.openqa.selenium.By;

public class ProductPageLocators {
    public static final By CLICKELECTRONIC           = By.cssSelector("div[role='group'] > div:nth-of-type(4) > a");
    public static final By CLICKPHONESANDACCESSORIES = By.cssSelector("div[role='group'] > div:nth-of-type(2) > a");
    public static final By CLICKACCESSORIES          = By.cssSelector("div[role='group'] > div:nth-of-type(1) > a");
    public static final By CLICKCHARGERS             = By.cssSelector("div:nth-of-type(28) > a");
    public static final By CLICKCHARGINGCASE         = By.cssSelector("div:nth-of-type(9) > a");
    public static final By CLICKSORT                 = By.cssSelector(".a-dropdown-label");
    public static final By CLICKBESTSELLERS          = By.cssSelector("li:nth-of-type(6) > .a-dropdown-link");
    public static final By CLICKCSAMSUNG             = By.id("bylineInfo");
}