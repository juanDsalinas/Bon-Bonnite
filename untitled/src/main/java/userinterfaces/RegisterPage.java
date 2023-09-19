package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    public static final Target LBL_USERNAME = Target.the("the label of username")
            .locatedBy("//input[@id='reg_username']");

    public static final Target LBL_ADDRESS = Target.the("the label of address")
            .locatedBy("//input[@id='reg_email']");

    public static final Target LBL_PASSWORD = Target.the("THE CHECKBOX")
            .locatedBy("//input[@id='privacy_policy_reg']");

    public static final Target BTN_REGISTER = Target.the("the btn to register")
            .locatedBy("//button[@value='Registrarse']");



}
