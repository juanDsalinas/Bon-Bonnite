package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Enabled;
import userinterfaces.LoginPage;

@Subject("The user should have seen an error alert due to an empty field when trying to log in")
public class EmptyLoginQuestion implements Question {
    //return the expected result for a login with empty fields
    @Override
    public Object answeredBy(Actor actor) {
        return Enabled.of(LoginPage.ALT_EMPTY_LOGIN).viewedBy(actor).asBoolean();
    }
    public static EmptyLoginQuestion validatedEmptyLogin(){
        return new EmptyLoginQuestion();
    }
}
