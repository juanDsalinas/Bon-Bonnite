package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class MenuComponent {
    //right icons
    public static final Target ACCOUNT_ICON = Target.the("icon to access to the login-register page or account page")
            .locatedBy("//div[@class='myaccount']");


    //menu categories
    public static final Target LBL_MENU_PRODUCT = Target.the("")
            .locatedBy("//*[@id='menu-item-{0}']");
    public static final Target BTN_ADD_CAR = Target.the("")
            .locatedBy("//button[@type='submit']");
    public static final Target BTN_BUY_NOW = Target.the("")
            .locatedBy("//a[@class='buy_now_link']");

}
