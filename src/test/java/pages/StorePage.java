package pages;

import base.BaseTest;
import constants.StorePageLocators;
import io.qameta.allure.Step;


public class StorePage extends BaseTest {


    @Step("Daha Fazla secenegine tiklanir.")
    public StorePage clickMore () {
        waitForElementToBeVisible(StorePageLocators.CLICKMORE).click();
        return this;
    }

    @Step("Daha Fazla secenegine tiklanir.")
    public StorePage clickSmartphone () {
        waitForElementToBeVisible(StorePageLocators.CLICKSMARTPHONE).click();
        return this;
    }

    @Step("Galaxy Z Serisi secenegine tiklanir.")
    public StorePage clickGalaxyzSeries () {
        waitForElementToBeVisible(StorePageLocators.CLICKGALAXYZSERIES).click();
        return this;
    }

    @Step("Urune tiklanir.")
    public StorePage clickGalaxyzSeriesProduct () {
        scrollUpToElement(StorePageLocators.CLICKGALAXYZSERIESPRODUCT);
        return this;
    }

    @Step("Sepete Ekle butonuna tiklanir.")
    public StorePage clickAddToCart () {
        waitForElementToBeVisible(StorePageLocators.CLICKADDTOCART).click();
        return this;
    }
}