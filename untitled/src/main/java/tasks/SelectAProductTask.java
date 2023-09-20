package tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;
import userinterfaces.ShoesPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

@AllArgsConstructor
public class SelectAProductTask implements Task {

    private final String product;
    private final String size;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ShoesPage.CRD_SHOE_PRODUCT.of(product))
//                Enter.theValue(size).into(ShoesPage.TXT_PRODUCT_SIZE).thenHit(Keys.ENTER)
                );
    }
    public static SelectAProductTask selectProduct(String product, String size){
        return instrumented(SelectAProductTask.class,product,size);
    }
}
