package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.FinishBuyPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class SelectCityInteraction implements Interaction {

    private final String city;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byVisibleText(city).from(FinishBuyPage.TXT_CITY));
    }
    public static SelectCityInteraction selectCity(String city){
        return instrumented(SelectCityInteraction.class,city);
    }
}
