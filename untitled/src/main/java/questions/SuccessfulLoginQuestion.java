package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.AccountComponent;

@Subject("The user should have been redirected to the homepage of the website")
public class SuccessfulLoginQuestion implements Question {
    //return the expected result for a successful login
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(AccountComponent.LBL_WISH_LIST).viewedBy(actor).asString();
    }

    public static SuccessfulLoginQuestion validateSuccessLogin(){
        return new SuccessfulLoginQuestion();
    }
}
