package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Enabled;
import net.serenitybdd.screenplay.questions.Text;
import userinterfaces.RegisterPage;

public class RegisterInvalidQuestion implements Question {

    // creacion de la question para que valide con un texto
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(RegisterPage.LBL_USERNAME).viewedBy(actor).asString();
        /*return Enabled.of(RegisterPage.ALT_ERROR_MESSAGE.of(" Ya hay una cuenta registrada con tu dirección de correo electrónico. ")).viewedBy(actor).asBoolean();*/
    }

    public static RegisterInvalidQuestion invalid(){
        return new RegisterInvalidQuestion();
    }
}
