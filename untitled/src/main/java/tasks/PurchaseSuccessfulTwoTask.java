package tasks;

import models.PurchaseSuccessfulModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterfaces.ShoesPage;

import java.awt.*;
import java.awt.event.KeyEvent;

public class PurchaseSuccessfulTwoTask implements Task {

    PurchaseSuccessfulModel credentials;

    public PurchaseSuccessfulTwoTask(PurchaseSuccessfulModel credentials) {
        this.credentials = credentials;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(MoveMouse.to(ShoesPage.CRD_SHOE_PRODUCT.of(credentials.getNumProduct())));
        actor.attemptsTo(Click.on(ShoesPage.CRD_SHOE_PRODUCT.of(credentials.getNumProduct())));
        actor.attemptsTo(Scroll.to(ShoesPage.LINK));
        actor.attemptsTo(Click.on(ShoesPage.COLOR_PRODUCT.of(credentials.getColor())));
        actor.attemptsTo(Scroll.to(ShoesPage.SIZE));
        actor.attemptsTo(Click.on(ShoesPage.SIZE));
        actor.attemptsTo(SelectFromOptions.byVisibleText(credentials.getSize()).from(ShoesPage.SIZE));
        actor.attemptsTo(Click.on(ShoesPage.ADD_CART));
    }

    public static PurchaseSuccessfulTwoTask selection(PurchaseSuccessfulModel credentials){
        return Tasks.instrumented(PurchaseSuccessfulTwoTask.class,credentials);
    }
}
