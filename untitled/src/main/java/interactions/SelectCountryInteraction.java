package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import userinterfaces.FinishBuyPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class SelectCountryInteraction implements Interaction {

    private final String country;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byVisibleText(country).from(FinishBuyPage.TXT_COUNTRY));
    }
    public static SelectCountryInteraction selectCountry(String country){
        return instrumented(SelectCountryInteraction.class,country);
    }
}
