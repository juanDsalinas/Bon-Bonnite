package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {
    public static final Target CRD_SHOE_PRODUCT = Target.the("")
            .locatedBy("//*[@id='wrapper']/div[5]/ul/li[{0}]");
    public static final Target  TXT_PRODUCT_SIZE = Target.the("")
            .locatedBy("//*[@id='pa_talla']");

    public static final Target LINK_PRODUCT_SIZE = Target.the("")
            .locatedBy("/*[@id='wrapper']/div[5]/ul/li[1]/div/div[1]/div/div[3]/div[{0}]");


    public static final Target BTN_ADD_PRODUCT_CART = Target.the("btn to add products into the cart")
            .locatedBy("//div/a[contains(@class,'add_to_cart_button ajax_add_to_cart added')]");


}