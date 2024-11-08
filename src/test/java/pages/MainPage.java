package pages;

import base.BaseTest;
import io.qameta.allure.Step;
import constants.MainPageLocators;


public class MainPage extends BaseTest {


    @Step("'Lütfen geçerli bir e-posta adresi veya telefon numarası girin' hata mesaji kontrol edilir.")
    public MainPage errorInvalidEmail (String expectedMessage) {
        assertText((MainPageLocators.ERRORINVALIDEMAIL), expectedMessage);
        screenshot();
        return this;
    }

    @Step("'E-postanızı veya cep telefonu numaranızı girin' hata mesaji kontrol edilir.")
    public MainPage errorNullEmailOrPhoneNumber (String expectedMessage) {
        assertText((MainPageLocators.ERRORNULLEMAILORPHONE), expectedMessage);
        screenshot();
        return this;
    }

    @Step("'Yanlış telefon numarası' hata mesaji kontrol edilir.")
    public MainPage errorInvalidPhoneNumber (String expectedMessage) {
        assertText((MainPageLocators.ERRORINVALIDPHONENUMBER), expectedMessage);
        screenshot();
        return this;
    }

    @Step("'Şifreniz yanlış' hata mesaji kontrol edilir.")
    public MainPage errorIncorrectPassword (String expectedMessage) {
        assertText((MainPageLocators.ERRORINCORRECTPASSWORD), expectedMessage);
        screenshot();
        return this;
    }

    @Step("'Şifrenizi girin' hata mesaji kontrol edilir.")
    public MainPage errorNoPassword (String expectedMessage) {
        assertText((MainPageLocators.ERRORNOPASSWORD), expectedMessage);
        screenshot();
        return this;
    }

    @Step("'Parolanın sıfırlanması gerekmektedir' hata mesaji kontrol edilir.")
    public MainPage errorResetPassword (String expectedMessage) {
        assertText((MainPageLocators.ERRORRESETPASSWORD), expectedMessage);
        screenshot();
        return this;
    }
}