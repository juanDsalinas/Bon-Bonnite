package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {
    //Login locator
    public static final Target TXT_USER_NAME = Target.the("Field to enter the username login")
            .locatedBy("//input[@id='username']");
    public static final Target TXT_PASSWORD = Target.the("Field to enter the password login")
            .locatedBy("//input[@id='password']");
    public static final Target BTN_LOGIN_SUBMIT = Target.the("Button to submit the login credentials")
            .locatedBy("//button[@name='login']");

}
