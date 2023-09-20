package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.MenuComponent;
import userinterfaces.ShoesPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickOnBuyButtonTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(MenuComponent.BTN_BUY_NOW));
    }

    public static ClickOnBuyButtonTask clickOnBuyButton() {
        return instrumented(ClickOnBuyButtonTask.class);
    }
}
