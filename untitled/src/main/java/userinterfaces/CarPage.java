package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class CarPage {
    public static final Target BTN_FINISH_BUY = Target.the("")
            .locatedBy("//div[@class='wc-proceed-to-checkout']/a");
    public static final Target LBL_SUBTOTAL = Target.the("")
            .locatedBy("//div[@id='content']/div/div/div[2]/div/table/tbody/tr[1]");

}
