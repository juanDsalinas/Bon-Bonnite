package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FinishBuyPage {
    public static final Target BTN_NEXT = Target.the("")
            .locatedBy("//*[@id='step1']/div/div[3]/div/div[6]/div[2]/button");
    public static final Target LBL_TOTAL = Target.the("")
            .locatedBy("//div[@id='step1']/div/div[3]/div/div[5]");

}
