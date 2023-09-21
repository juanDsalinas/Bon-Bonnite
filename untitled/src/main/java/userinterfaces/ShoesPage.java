package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {
    public static final Target CRD_SHOE_PRODUCT = Target.the("")
            .locatedBy("//*[@id='wrapper']/div[5]/ul/li[{0}]");
    public static final Target  TXT_PRODUCT_SIZE = Target.the("")
            .locatedBy("//*[@id='pa_talla']");
    public static final Target  LBL_RELATED_PRODUCTS = Target.the("")
            .locatedBy("//section[@class='related products']/h2");
    public static final Target BTN_WISHLIST_HEART = Target.the("")
            .locatedBy("//a[@name='aadir-a-la-lista-de-deseos']");


}
