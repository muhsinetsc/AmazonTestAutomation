package pages;

import base.BaseTest;
import constants.BasketPageLocators;
import io.qameta.allure.Step;


public class BasketPage extends BaseTest {


    @Step("'Ara toplam (1 ürün):' yazdigi kontrol edilir.")
    public BasketPage basketControl (String expectedMessage) {
        assertText((BasketPageLocators.BASKETCONTROL),expectedMessage);
        screenshot();
        return this;
    }

    @Step("Sil butonuna tiklanir.")
    public BasketPage clickDelete () {
        waitForElementToBeVisible(BasketPageLocators.CLICKDELETE).click();
        return this;
    }

    @Step("'Tum urunlerin secimini kaldir' yazdigi kontrol edilir.")
    public BasketPage emptyBasketControl (String expectedMessage) {
        assertText((BasketPageLocators.EMPTYBASKETONTROL),expectedMessage);
        screenshot();
        return this;
    }
}