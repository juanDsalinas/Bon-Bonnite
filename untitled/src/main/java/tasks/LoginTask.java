package tasks;

import lombok.AllArgsConstructor;
import models.LoginModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class LoginTask implements Task {

    private final LoginModel credentials;

    public static LoginTask validateCredentials(LoginModel credentials) {
        return instrumented(LoginTask.class, credentials);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(credentials.getDocument()).into(LoginPage.TXT_USER_NAME),
                Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASSWORD),
                Click.on(LoginPage.BTN_LOGIN_SUBMIT));
    }
}
