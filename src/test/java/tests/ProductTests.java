package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;


public class ProductTests extends BaseTest {

    tests.LoginTests loginTests = new tests.LoginTests();
    HomePage homePage = new HomePage();
    ProductPage productPage = new ProductPage();
    ListPage listPage = new ListPage();
    StorePage storePage = new StorePage();
    BasketPage basketPage = new BasketPage();


    @Test(description = "Urun arama kontrolu.")
    public void productSearchControl () {
        loginTests.loginSuccessfulControl();
        homePage.searchBar("iPhone 16 Pro Max")
                .searchButton();
        productPage.pageTitleControl("Amazon.com.tr : iPhone 16 Pro Max");
    }

    @Test(description = "Urun detayinda 'iPhone' kelimesi icermesi kontrolu.")
    public void productDetailControl () {
        productSearchControl();
        productPage.clickProductByDataIndex(4)
                .productTitleControl("iPhone");
    }

    @Test(description = "Liste olusturma isleminin kontrolu.")
    public void createListControl () {
        loginTests.loginSuccessfulControl();
        homePage.hoverAccountList()
                .clickCreateList();
        listPage.createaList()
                .clickCreateList()
                .listControl("Alışveriş Listesi");
    }

    @Test(description = "Liste silme isleminin kontrolu.")
    public void deleteListControl () {
        loginTests.loginSuccessfulControl();
        homePage.hoverAccountList()
                .clickCreatedList();
        listPage.clickMoreList()
                .clickManageList()
                .clickDeleteList()
                .deletionMessage("Silme işlemini onayla")
                .clickYesDelete()
                .createaListButtonControl("Bir liste oluştur");
    }

    @Test(description = "Alt kategori urunlerinin kontrolu.")
    public void categoryControl () {
        loginTests.loginSuccessfulControl();
        homePage.clickLogo()
                .clickBestSellers();
        productPage.clickElectronic()
                .pageTitleControl("Amazon.com.tr Çok Satanlar: Elektronik adlı listedeki en popüler ürünler")
                .clickPhonesAndAccessories()
                .pageTitleControl("Amazon.com.tr Çok Satanlar: Cep Telefonları ve Aksesuarlar adlı listedeki en popüler ürünler")
                .clickAccessories()
                .pageTitleControl("Amazon.com.tr Çok Satanlar: Cep Telefonu ve Akıllı Saat Aksesuarları adlı listedeki en popüler ürünler")
                .clickChargers()
                .pageTitleControl("Amazon.com.tr Çok Satanlar: Cep Telefonu Şarj Aletleri adlı listedeki en popüler ürünler")
                .clickChargingCase()
                .pageTitleControl("Amazon.com.tr Çok Satanlar: Şarjlı Telefon Kılıfları adlı listedeki en popüler ürünler");
    }

    @Test(description = "Sepete urun ekleme isleminin kontrolu.")
    public void addToCartProcess () {
        loginTests.loginSuccessfulControl();
        homePage.searchBar("Samsung Store")
                .searchButton();
        productPage.clickSort()
                .clickbestSellers()
                .clickProductByDataIndexSamsung(2)
                .clickSamsung();
        storePage.clickMore()
                .clickSmartphone()
                .clickGalaxyzSeries();
        productPage.pageTitleControl("Amazon.com.tr: Samsung: Galaxy Z Serisi");
        storePage.clickGalaxyzSeriesProduct()
                .clickAddToCart();
        homePage.clickShoppingBasket();
        basketPage.basketControl("Ara toplam (1 ürün):");
    }

    @Test(description = "Sepete eklenen urunu silme isleminin kontrolu.")
    public void deleteProductInCart () {
        loginTests.loginSuccessfulControl();
        homePage.clickShoppingBasket();
        basketPage.clickDelete()
                .emptyBasketControl("Ara toplam (0 ürün):");
    }
}