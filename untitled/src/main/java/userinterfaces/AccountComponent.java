package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AccountComponent {
    //Elements to the user account management
    public static final Target LBL_WISH_LIST = Target.the("Tag for wish list link item")
            .locatedBy("//a[contains(text(),'Lista de deseos')]");
}

