package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccountComponent {
    public static final Target LBL_WISH_LIST = Target.the("Tag for wish list link item")
            .locatedBy("//a[contains(text(),'Lista de deseos')]");
}

