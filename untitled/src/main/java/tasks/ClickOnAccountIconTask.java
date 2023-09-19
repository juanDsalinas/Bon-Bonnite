package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.MenuComponent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnAccountIconTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.ACCOUNT_ICON));
    }
    public static ClickOnAccountIconTask clickOnAccountIcon(){
        return instrumented(ClickOnAccountIconTask.class);
    }
}
