package pages;

import base.BaseTest;
import constants.ProductPageLocators;
import io.qameta.allure.Step;


public class ProductPage extends BaseTest {


    @Step("Sayfa basliginin aranan ogeyle ortusmesi kontrol edilir.")
    public ProductPage pageTitleControl (String expectedTitle) {
        assertTitleConntrol(expectedTitle);
        return this;
    }

    @Step("Urun listesinden belirli Data-Index'e gore urune tiklanir.")
    public ProductPage clickProductByDataIndex (int index) {
        clickBuyIndex(index);
        return this;
    }

    @Step("Sayfa basliginda 'iPhone' ifadesinin bulunduğu kontrol edilir.")
    public ProductPage productTitleControl (String expectedTitle) {
        assertTitle(expectedTitle);
        screenshot();
        return this;
    }

    @Step("Elektronik secenegine tiklanir.")
    public ProductPage clickElectronic () {
        waitForElementToBeVisible(ProductPageLocators.CLICKELECTRONIC).click();
        return this;
    }

    @Step("Cep Telefonlari ve Aksesuarlar secenegine tiklanir.")
    public ProductPage clickPhonesAndAccessories () {
        waitForElementToBeVisible(ProductPageLocators.CLICKPHONESANDACCESSORIES).click();
        return this;
    }

    @Step("Aksesuarlar secenegine tiklanir.")
    public ProductPage clickAccessories () {
        waitForElementToBeVisible(ProductPageLocators.CLICKACCESSORIES).click();
        return this;
    }

    @Step("Sarj Aletleri secenegine tiklanir.")
    public ProductPage clickChargers () {
        scrollUpToElement(ProductPageLocators.CLICKCHARGERS);
        return this;
    }

    @Step("Sarjli Telefon Kiliflari secenegine tiklanir.")
    public ProductPage clickChargingCase () {
        waitForElementToBeVisible(ProductPageLocators.CLICKCHARGINGCASE).click();
        screenshot();
        return this;
    }

    @Step("Siralama Olcutu butonuna tiklanir.")
    public ProductPage clickSort () {
        waitForElementToBeVisible(ProductPageLocators.CLICKSORT).click();
        return this;
    }

    @Step("Cok Satanlar butonuna tiklanir.")
    public ProductPage clickbestSellers () {
        waitForElementToBeVisible(ProductPageLocators.CLICKBESTSELLERS).click();
        return this;
    }

    @Step("Urun listesinden belirli Data-Index'e gore urune tiklanir.")
    public ProductPage clickProductByDataIndexSamsung (int index) {
        clickBuyIndex(index);
        return this;
    }

    @Step("SAMSUNG Store’u ziyaret edin secenegine tiklanir.")
    public ProductPage clickSamsung () {
        waitForElementToBeVisible(ProductPageLocators.CLICKCSAMSUNG).click();
        return this;
    }
}