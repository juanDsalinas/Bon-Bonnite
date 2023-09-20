package tasks;

import lombok.AllArgsConstructor;
import models.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.LoginPage;
import userinterfaces.RegisterPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class LoginTask implements Task {

    //Login's logic
    private final LoginModel credentials;

    // metodo para devolver el objto LoginTask
    public static LoginTask validateCredentials(LoginModel credentials) {
        return instrumented(LoginTask.class, credentials);
    }

    // creacion del objeto LoginTask
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credentials.getDocument()).into(LoginPage.TXT_USER_NAME),
                Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASSWORD),
                Scroll.to(RegisterPage.TXT_ADDRESS),
                Click.on(LoginPage.BTN_LOGIN_SUBMIT));
    }
}
