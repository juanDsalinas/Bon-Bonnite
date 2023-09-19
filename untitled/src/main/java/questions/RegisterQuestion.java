package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.AccountComponent;

public class RegisterQuestion implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(AccountComponent.LBL_WISH_LIST).viewedBy(actor).asString();
    }

    public static RegisterQuestion successuful (){
        return new RegisterQuestion();
    }
}
