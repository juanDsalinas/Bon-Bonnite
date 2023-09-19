package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterfaces.LoginPage;

public class EmptyLoginQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(LoginPage.ALT_EMPTY_LOGIN).viewedBy(actor).asBoolean();
    }
    public static EmptyLoginQuestion validatedEmptyLogin(){
        return new EmptyLoginQuestion();
    }
}
