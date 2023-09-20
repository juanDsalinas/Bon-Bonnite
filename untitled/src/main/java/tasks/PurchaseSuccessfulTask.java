package tasks;

import models.PurchaseSuccessful;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToBy;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterfaces.MenuComponent;
import userinterfaces.ShoesPage;

public class PurchaseSuccessfulTask implements Task {
    models.PurchaseSuccessful credentials;

    public PurchaseSuccessfulTask(models.PurchaseSuccessful credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(MenuComponent.LBL_MENU_PRODUCT.of(credentials.getCategories())));
        actor.attemptsTo(Scroll.to(ShoesPage.CRD_SHOE_PRODUCT.of(credentials.getNumProduct())));
        actor.attemptsTo(MoveMouse.to(ShoesPage.CRD_SHOE_PRODUCT.of(credentials.getNumProduct())));
        actor.attemptsTo(MoveMouse.to(ShoesPage.LINK_PRODUCT_SIZE.of(credentials.getSize())));
        actor.attemptsTo(Click.on(ShoesPage.LINK_PRODUCT_SIZE.of(credentials.getSize())));
        actor.attemptsTo(Click.on(ShoesPage.BTN_ADD_PRODUCT_CART));
    }

    public static PurchaseSuccessfulTask select(PurchaseSuccessful credentials){
        return Tasks.instrumented(PurchaseSuccessfulTask.class,credentials);
    }
}
