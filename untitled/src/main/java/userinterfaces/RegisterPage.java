package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPage {
    // mapeo del titulo "Acceder"
    public static final Target LBL_USERNAME = Target.the("the label of username")
            .locatedBy("//div[@class='u-column1 col-1']/h2");

    // mapeo de los elementos del registro
    public static final Target TXT_USERNAME = Target.the("the field text to enter the username")
            .locatedBy("//input[@id='reg_username']");

    public static final Target TXT_ADDRESS = Target.the("the field text to enter the address")
            .locatedBy("//input[@id='reg_email']");

    public static final Target TXT_PASSWORD = Target.the("the field text to enter the password")
            .locatedBy("//input[@id='reg_password']");

    public static final Target CHECKBOX = Target.the("the checkbox to registere")
            .locatedBy("//input[@id='privacy_policy_reg']");

    public static final Target BTN_REGISTER = Target.the("the btn to register")
            .locatedBy("//button[@value='Registrarse']");

    public static final Target ALT_ERROR_MESSAGE = Target.the("registration error alert")
            .locatedBy("//ul[@class='woocommerce-error']//li[contains(text(),'{0}')]");

}
