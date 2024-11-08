package constants;

import org.openqa.selenium.By;

public class StorePageLocators {
    public static final By CLICKMORE                 = By.cssSelector(".Navigation__more__jp3zs [type]");
    public static final By CLICKSMARTPHONE           = By.cssSelector("div[role='dialog'] > ul > li:nth-of-type(7) > a[role='button']");
    public static final By CLICKGALAXYZSERIES        = By.cssSelector("div[role='dialog'] > ul > li:nth-of-type(7) > div[role='dialog'] > ul > li:nth-of-type(3) > a");
    public static final By CLICKGALAXYZSERIESPRODUCT = By.cssSelector("div[class='EditorialTile__innerContent__n92i8'] a[title='Samsung Galaxy Z Fold6, Yapay Zeka (AI) Telefon, 12GB RAM, 1TB Hafıza, Lacivert, Android Akıllı Telefon, 50MP Kamera, Büyük Ekran, Çoklu Görev, S Pen, Uzun Pil Ömrü (Samsung Türkiye Garantili)']");
    public static final By CLICKADDTOCART            = By.id("addToCart_feature_div");
}