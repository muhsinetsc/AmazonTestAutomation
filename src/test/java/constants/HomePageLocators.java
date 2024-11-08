package constants;

import org.openqa.selenium.By;

public class HomePageLocators {
    public static final By ACCOUNTNAME               = By.id("nav-link-accountList-nav-line-1");
    public static final By SEARCHBAR                 = By.id("twotabsearchtextbox");
    public static final By SEARCHBUTTON              = By.id("nav-search-submit-button");
    public static final By HOVERACCOUNTLIST          = By.id("nav-link-accountList-nav-line-1");
    public static final By CLICKCREATELIST           = By.cssSelector("div#nav-al-wishlist  .nav-text");
    public static final By CLICKCREATEDLIST          = By.cssSelector("div[id='nav-flyout-wl-items'] span:nth-child(1)");
    public static final By CLICKLOGO                 = By.id("nav-logo-sprites");
    public static final By CLICKBESTSELLERS          = By.cssSelector("div#nav-xshop > a:nth-of-type(4)");
    public static final By CLICKSHOPPINGBASKET       = By.id("nav-cart");
}