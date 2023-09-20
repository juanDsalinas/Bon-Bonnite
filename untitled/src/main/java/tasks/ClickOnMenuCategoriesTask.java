package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import userinterfaces.MenuComponent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class ClickOnMenuCategoriesTask implements Task {
    private final String menuOption;

    @Override
    public <T extends Actor> void performAs(T actor) {
        switch (menuOption) {
            case "shoes":
                actor.attemptsTo(Click.on(MenuComponent.LBL_MENU_PRODUCT.of("10")));
                break;
            case "handbags":
                actor.attemptsTo(Click.on(MenuComponent.LBL_MENU_PRODUCT.of("8")));
                break;
            case "belts":
                actor.attemptsTo(Click.on(MenuComponent.LBL_MENU_PRODUCT.of("9")));
                break;
            case "accessories":
                actor.attemptsTo(Click.on(MenuComponent.LBL_MENU_PRODUCT.of("7")));
                break;
        }
    }

    public static ClickOnMenuCategoriesTask selectMenuOption(String menuOption) {
        return instrumented(ClickOnMenuCategoriesTask.class, menuOption);
    }
}
