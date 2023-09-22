package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterfaces.FinishBuyPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FlowPurchaseQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(FinishBuyPage.LBL_PAY_METHOD).viewedBy(actor).asBoolean();
    }
    public static FlowPurchaseQuestion isPaymentGateway(){
        return new FlowPurchaseQuestion();
    }
}
