package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class ClickOnMenuNavigation implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo();
    }

    public static ClickOnMenuNavigation clickLink(){
        return Tasks.instrumented(ClickOnMenuNavigation.class);
    }
}
