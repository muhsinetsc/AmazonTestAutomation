package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import constants.ListPageLocators;


public class ListPage extends BaseTest {


    @Step("Bir Liste Olustur butonuna tiklanir.")
    public ListPage createaList () {
        waitForElementToBeVisible(ListPageLocators.CREATELIST).click();
        return this;
    }

    @Step("Liste Olustur butonuna tiklanir.")
    public ListPage clickCreateList () {
        waitForElementToBeVisible(ListPageLocators.CLICKCREATELIST).click();
        return this;
    }

    @Step("Liste isminde 'Alisveris Listesi' yazdigi kontrol edilir.")
    public ListPage listControl (String expectedMessage) {
        assertText(ListPageLocators.LISTCONTROL,expectedMessage);
        screenshot();
        return this;
    }

    @Step("Fare imleci Daha fazlasi alanina getirilir.")
    public ListPage clickMoreList () {
        waitForElementToBeVisible(ListPageLocators.CLICKMORELIST).click();
        return this;
    }

    @Step("Listeyi Yonet alanina tiklanir.")
    public ListPage clickManageList () {
        waitForElementToBeVisible(ListPageLocators.CLICKMANAGELIST).click();
        return this;
    }

    @Step("Listeyi Sil butonuna tiklanir.")
    public ListPage clickDeleteList () {
        scrollUpToElement(ListPageLocators.CLICKDELETELIST);
        return this;
    }

    @Step("'Silme işlemini onayla' mesajinin yazdigi kontrol edilir.")
    public ListPage deletionMessage (String expectedMessage) {
        assertText((ListPageLocators.DELETIONMESSAGE), expectedMessage);
        return this;
    }

    @Step("Evet butonuna tiklanir.")
    public ListPage clickYesDelete () {
        moveToElement(ListPageLocators.CLICKYESDELETE);
        return this;
    }

    @Step("'Bir liste olustur' butonuyla listenin silindigi kontrol edilir.")
    public ListPage createaListButtonControl (String expectedMessage) {
        assertText((ListPageLocators.CREATEALISTBUTTONCONTROL),expectedMessage);
        screenshot();
        return this;
    }
}