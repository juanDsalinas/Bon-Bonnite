package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.AccountComponent;


public class LoginQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(AccountComponent.LBL_WISH_LIST).viewedBy(actor).asString();
    }

    public static LoginQuestion validateSuccessLogin(){
        return new LoginQuestion();
    }
}
