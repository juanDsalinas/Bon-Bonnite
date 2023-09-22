package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class FinishBuyPage {
    public static final Target BTN_NEXT = Target.the("")
            .locatedBy("//*[@id='step1']/div/div[3]/div/div[6]/div[2]/button");
    public static final Target LBL_TOTAL = Target.the("")
            .locatedBy("//div[@id='step1']/div/div[3]/div/div[5]");

    public static final Target TXT_GENDER = Target.the("")
            .locatedBy("//*[@id='billing_gender']/option[{0}]");
    public static final Target TXT_DOC_TYPE = Target.the("")
            .locatedBy("//*[@id='billing_tipo_documento']/option[{0}]");
    public static final Target TXT_COUNTRY = Target.the("")
            .locatedBy("//*[@id='billing_country']");
    public static final Target TXT_DEPARTMENT = Target.the("")
            .locatedBy("//*[@id='billing_state']");
    public static final Target TXT_CITY = Target.the("")
            .locatedBy("//*[@id='billing_city']");
    public static final Target BNT_BUY = Target.the("")
            .locatedBy("//button[@id='place_order']");

    public static final Target LBL_PAY_METHOD = Target.the("")
            .locatedBy("//*[@id='app']/div[2]/div/div/span");




}
