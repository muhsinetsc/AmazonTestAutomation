package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.MainPage;


public class LoginTests extends BaseTest {

    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();
    MainPage mainPage = new MainPage();


    @Test(description = "Basarili giris kontrolu.")
    public void loginSuccessfulControl () {
        loginPage.fillEmail(email)
                .clickContinue()
                .fillPassword(password)
                .clickLogin();
        homePage.accountName("Test");
    }

    @Test(description = "Gecersiz E-posta kontrolu.")
    public void invalidEmailLoginControl () {
        loginPage.fillEmail("tobeto1212gmail.com")
                .clickContinue();
        mainPage.errorInvalidEmail("Lütfen geçerli bir e-posta adresi veya telefon numarası girin");
    }

    @Test(description = "E-posta adresi veya telefon numarasi adresinin girilmemesi ")
    public void nullEmailOrPhoneNumberControl () {
        loginPage.clickContinue();
        mainPage.errorNullEmailOrPhoneNumber("E-postanızı veya cep telefonu numaranızı girin");
    }

    @Test(description = "Gecersiz telefon numarasi kontrolu")
    public void invalidPhoneNumberControl () {
        loginPage.fillEmail("1")
                .clickContinue();
        mainPage.errorInvalidPhoneNumber("Yanlış telefon numarası");
    }

    @Test(description = "Hatali sifre kontrolu.")
    public void incorrectPasswordControl () {
        loginPage.fillEmail("tobeto1212@gmail.com")
                .clickContinue()
                .fillPassword("tests")
                .clickLogin();
        mainPage.errorIncorrectPassword("Şifreniz yanlış");
    }

    @Test(description = "Sifrenin girilmemesinin kontrolu.")
    public void noPasswordControl () {
        loginPage.fillEmail("tobeto1212@gmail.com")
                .clickContinue()
                .clickLogin();
        mainPage.errorNoPassword("Şifrenizi girin");
    }

    @Test(description = "Parola sifirlama mesajinin kontrolu.")
    public void resetPasswordControl () {
        loginPage.fillEmail("aaaassss@gmail.com")
                .clickContinue();
        mainPage.errorResetPassword("Parolanın sıfırlanması gerekmektedir");
    }
}