package constants;

import org.openqa.selenium.By;

public class MainPageLocators {
    public static final By ERRORINVALIDEMAIL         = By.cssSelector("div#auth-email-invalid-claim-alert  .a-alert-content");
    public static final By ERRORNULLEMAILORPHONE     = By.cssSelector("div#auth-email-missing-alert  .a-alert-content");
    public static final By ERRORINVALIDPHONENUMBER   = By.cssSelector("div#auth-error-message-box  .a-alert-heading");
    public static final By ERRORINCORRECTPASSWORD    = By.cssSelector("[class='a-list-item']");
    public static final By ERRORNOPASSWORD           = By.cssSelector("div#auth-password-missing-alert  .a-alert-content");
    public static final By ERRORRESETPASSWORD        = By.cssSelector("[class='a-text-normal']");
}