package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent {
    //right icons
    public static final Target ACCOUNT_ICON = Target.the("icon to access to the login-register page or account page")
            .locatedBy("//div[@class='myaccount']");

    public static final Target CART_ICON = Target.the("icon to enter into the shopping cart")
            .locatedBy("//div[@class='cart']");


    //menu categories
    public static final Target LBL_MENU_PRODUCT = Target.the("product categories navigation bar")
            .locatedBy("//*[@id='menu-item-{0}']");
    public static final Target BTN_ADD_CAR = Target.the("")
            .locatedBy("//button[@type='submit']");
    public static final Target BTN_BUY_NOW = Target.the("")
            .locatedBy("//a[@class='buy_now_link']");

}
