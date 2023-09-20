package tasks;

import models.RegisterModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Clear;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.RegisterPage;

public class RegisterTask implements Task {

    // instancia del datatable
    RegisterModel credentials;

    // constructor de para las credenciales
    public RegisterTask(RegisterModel credentials) {
        this.credentials = credentials;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Clear.field(RegisterPage.TXT_USERNAME));
        actor.attemptsTo(Enter.theValue(credentials.getDocument()).into(RegisterPage.TXT_USERNAME),
                Clear.field(RegisterPage.TXT_ADDRESS),
                Enter.theValue(credentials.getEmail()).into(RegisterPage.TXT_ADDRESS),
                Scroll.to(RegisterPage.TXT_USERNAME),
                Clear.field(RegisterPage.TXT_PASSWORD),
                Enter.theValue(credentials.getPassword()).into(RegisterPage.TXT_PASSWORD),
                Click.on(RegisterPage.CHECKBOX),
                Click.on(RegisterPage.BTN_REGISTER));
    }

    // creacion del objeto LoginTask
    public static RegisterTask enter (RegisterModel credentials){
        return Tasks.instrumented(RegisterTask.class,credentials);
    }
}
