package tasks;

import lombok.AllArgsConstructor;
import models.PurchaseSuccessfulModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.MenuComponent;
import userinterfaces.ShoesPage;

@AllArgsConstructor
public class PurchaseSuccessfulTask implements Task {
    public final String categoria;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.LBL_MENU_PRODUCT.of(categoria)));
    }

    public static PurchaseSuccessfulTask select(String categoria){
        return Tasks.instrumented(PurchaseSuccessfulTask.class,categoria);
    }
}
