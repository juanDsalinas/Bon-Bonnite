package tasks;

import models.RegisterModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.RegisterPage;

public class RegisterTask implements Task {
    RegisterModel registerModel;

    public RegisterTask(RegisterModel registerModel) {
        this.registerModel = registerModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registerModel.getDocument()).into(RegisterPage.LBL_USERNAME));
    }

    public static RegisterTask enter (RegisterModel registerModel){
        return Tasks.instrumented(RegisterTask.class,registerModel);
    }
}
