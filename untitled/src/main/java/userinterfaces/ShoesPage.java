package userinterfaces;


import net.serenitybdd.screenplay.targets.Target;

public class ShoesPage {
    public static final Target CRD_SHOE_PRODUCT = Target.the("card of the product")
            .locatedBy("//*[@id='wrapper']/div[5]/ul/li[{0}]");
    public static final Target  TXT_PRODUCT_SIZE = Target.the("")
            .locatedBy("//*[@id='pa_talla']");

    public static final Target COLOR_PRODUCT = Target.the("option in the color of products")
            .locatedBy("//*[contains(@class,'product')]/div[2]/div[1]/div/div[2]/ul/li[{0}]");

    public static final Target SIZE = Target.the("size of products")
            .locatedBy("//*[@id='pa_talla']");

    public static final Target LINK = Target.the("size of products")
            .locatedBy("//*[@id='product-270521']/div[2]/div[2]/ul/li[1]/a");



    public static final Target ADD_CART = Target.the("size of products")
            .locatedBy("//*[contains(@class,'single_add_to_cart_button')]");


}