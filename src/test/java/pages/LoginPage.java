package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import constants.LoginPageLocators;


public class LoginPage extends BaseTest {


    @Step("Email alani doldurulur.")
    public LoginPage fillEmail (String text) {
        waitForElementToBeVisible(LoginPageLocators.FILLEMAIL).sendKeys(text);
        return this;
    }

    @Step("Devam Et butonu tiklanir.")
    public LoginPage clickContinue () {
        waitForElementToBeVisible(LoginPageLocators.CLICKCONTINUE).click();
        return this;
    }

    @Step("Sifre alani doldurulur.")
    public LoginPage fillPassword (String text) {
        waitForElementToBeVisible(LoginPageLocators.FILLPASSWORD).sendKeys(text);
        return this;
    }

    @Step("Giris Yap butonu tiklanir.")
    public LoginPage clickLogin () {
        waitForElementToBeVisible(LoginPageLocators.CLICKLOGIN).click();
        screenshot();
        return this;
    }
}