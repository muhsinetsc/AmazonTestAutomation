package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import constants.HomePageLocators;


public class HomePage extends BaseTest {


    @Step("'Test' yazdigi kontrol edilir.")
    public HomePage accountName (String expectedMessage) {
        assertText((HomePageLocators.ACCOUNTNAME),expectedMessage);
        screenshot();
        return this;
    }

    @Step("Arama cubugu alani doldurulur.")
    public HomePage searchBar (String text) {
        driver.findElement(HomePageLocators.SEARCHBAR).sendKeys(text);
        return this;
    }

    @Step("Arama butonuna tiklanir.")
    public HomePage searchButton () {
        waitForElementToBeVisible(HomePageLocators.SEARCHBUTTON).click();
        screenshot();
        return this;
    }

    @Step("Fare imleci Hesap ve Listeler alanina getirilir.")
    public HomePage hoverAccountList () {
        hoverOverElement(HomePageLocators.HOVERACCOUNTLIST);
        return this;
    }

    @Step("Liste Olusturun alanına tiklanir.")
    public HomePage clickCreateList () {
        waitForElementToBeVisible(HomePageLocators.CLICKCREATELIST).click();
        return this;
    }

    @Step("Alisveris Listesi secenegine tiklanir.")
    public HomePage clickCreatedList () {
        waitForElementToBeVisible(HomePageLocators.CLICKCREATEDLIST).click();
        return this;
    }

    @Step("Amazon logosuna tiklanir.")
    public HomePage clickLogo () {
        waitForElementToBeVisible(HomePageLocators.CLICKLOGO).click();
        return this;
    }

    @Step("Cok Satanlar butonuna tiklanir.")
    public HomePage clickBestSellers () {
        scrollUpToElement(HomePageLocators.CLICKBESTSELLERS);
        return this;
    }

    @Step("Alisveris Sepeti butonuna tiklanir.")
    public HomePage clickShoppingBasket () {
        scrollUpToElement(HomePageLocators.CLICKSHOPPINGBASKET);
        return this;
    }
}