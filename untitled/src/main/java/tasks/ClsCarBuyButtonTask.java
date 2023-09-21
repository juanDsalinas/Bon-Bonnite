package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.CarPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClsCarBuyButtonTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(CarPage.LBL_SUBTOTAL),
                Click.on(CarPage.BTN_FINISH_BUY)
        );
    }
    public static ClsCarBuyButtonTask confirmationCarButtons(){
        return instrumented(ClsCarBuyButtonTask.class);
    }
}
