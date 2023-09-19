package tasks;

import interactions.ClickOnTargetInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import userinterfaces.MenuComponent;

public class ClickOnAccountIconTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(new ClickOnTargetInteraction(MenuComponent.ACCOUNT_ICON));
    }
    public static ClickOnAccountIconTask clickOnAccountIcon(){
        return new ClickOnAccountIconTask();
    }
}
