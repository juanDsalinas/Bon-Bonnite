package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.CarPage;
import userinterfaces.FinishBuyPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClsFinishBuyNextBtnTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(FinishBuyPage.LBL_TOTAL),
                Click.on(FinishBuyPage.BTN_NEXT)
        );
    }
    public static ClsFinishBuyNextBtnTask confirmationButtons(){
        return instrumented(ClsFinishBuyNextBtnTask.class);
    }
}