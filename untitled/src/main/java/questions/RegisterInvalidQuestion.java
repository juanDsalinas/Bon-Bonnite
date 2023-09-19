package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterfaces.RegisterPage;

public class RegisterInvalidQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(RegisterPage.ALT_ERROR_MESSAGE).viewedBy(actor).asBoolean();
    }

    public static RegisterInvalidQuestion invalid(){
        return new RegisterInvalidQuestion();
    }
}
