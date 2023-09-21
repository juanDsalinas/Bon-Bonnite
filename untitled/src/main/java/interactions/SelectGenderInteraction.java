package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.FinishBuyPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class SelectGenderInteraction implements Interaction {

    private final String gender;

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (gender){
            case "Hombre":
                actor.attemptsTo(Click.on(FinishBuyPage.TXT_GENDER.of("1")));
                break;
            case "Mujer":
                actor.attemptsTo(Click.on(FinishBuyPage.TXT_GENDER.of("2")));
                break;
            case "N/A":
                actor.attemptsTo(Click.on(FinishBuyPage.TXT_GENDER.of("3")));
                break;
        }
    }
    public static SelectGenderInteraction selectGender(String gender){
        return instrumented(SelectGenderInteraction.class,gender);
    }
}
