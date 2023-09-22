package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.FinishBuyPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ClickFinishBuyTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(FinishBuyPage.TXT_DEPARTMENT),
                Click.on(FinishBuyPage.BNT_BUY))
        ;
    }
    public static ClickFinishBuyTask clickOnFinishBuyButton(){
        return instrumented(ClickFinishBuyTask.class);
    }
}
