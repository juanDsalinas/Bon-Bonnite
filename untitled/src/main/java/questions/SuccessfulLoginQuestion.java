package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.AccountComponent;


public class SuccessfulLoginQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(AccountComponent.LBL_WISH_LIST).viewedBy(actor).asString();
    }

    public static SuccessfulLoginQuestion validateSuccessLogin(){
        return new SuccessfulLoginQuestion();
    }
}
