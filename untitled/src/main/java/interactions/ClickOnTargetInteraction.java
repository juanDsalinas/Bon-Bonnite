package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ClickOnTargetInteraction implements Interaction {

    Target target;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(target));
    }

    public static ClickOnTargetInteraction clickOnTarget(Target target){
        return instrumented(ClickOnTargetInteraction.class,target);
    }
}
