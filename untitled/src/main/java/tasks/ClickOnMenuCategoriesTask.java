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
            case "handbags":
                actor.attemptsTo(Click.on(MenuComponent.LBL_MENU_PRODUCT.of("8")));
            case "belts":
                actor.attemptsTo(Click.on(MenuComponent.LBL_MENU_PRODUCT.of("9")));
            case "accessories":
                actor.attemptsTo(Click.on(MenuComponent.LBL_MENU_PRODUCT.of("7")));
        }
    }

    public static ClickOnMenuCategoriesTask selectMenuOption(String menuOption) {
        return instrumented(ClickOnMenuCategoriesTask.class, menuOption);
    }
}
