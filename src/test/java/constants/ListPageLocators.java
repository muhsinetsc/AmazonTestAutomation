package constants;

import org.openqa.selenium.By;

public class ListPageLocators {
    public static final By CREATELIST                = By.cssSelector("[class='a-button-input']");
    public static final By CLICKCREATELIST           = By.cssSelector("[class='a-button a-button-primary']");
    public static final By LISTCONTROL               = By.id("profile-list-name");
    public static final By CLICKMORELIST             = By.id("overflow-menu-popover-trigger");
    public static final By CLICKMANAGELIST           = By.cssSelector("a#editYourList");
    public static final By CLICKDELETELIST           = By.cssSelector("div#list-settings-container > .a-declarative .a-button-input");
    public static final By DELETIONMESSAGE           = By.id("a-popover-header-3");
    public static final By CLICKYESDELETE            = By.id("list-delete-confirm-announce");
    public static final By CREATEALISTBUTTONCONTROL  = By.id("createList-announce");
}