package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterfaces.LoginPage;

public class InvalidLoginQuestion implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(LoginPage.ALT_LOGIN_ERROR).viewedBy(actor).asBoolean();
    }
    public static InvalidLoginQuestion rejectLogin(){
        return new InvalidLoginQuestion();
    }
}
