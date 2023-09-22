package interactions;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.FinishBuyPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class SelectDepartmentInteraction implements Interaction {

    private final String department;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byVisibleText(department).from(FinishBuyPage.TXT_DEPARTMENT));
    }
    public static SelectDepartmentInteraction selectDepartment(String department){
        return  instrumented(SelectDepartmentInteraction.class,department);
    }
}
